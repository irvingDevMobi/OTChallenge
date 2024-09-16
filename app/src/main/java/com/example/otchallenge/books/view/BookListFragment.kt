package com.example.otchallenge.books.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.otchallenge.MyApplication
import com.example.otchallenge.R
import com.example.otchallenge.books.BookListContract
import com.example.otchallenge.books.domain.Book
import com.example.otchallenge.databinding.BookListContainerBinding
import com.example.otchallenge.di.books.BookListModule
import javax.inject.Inject

class BookListFragment : Fragment(), BookListContract.View {

    private var _binding: BookListContainerBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var presenter: BookListContract.Presenter

    private lateinit var bookListAdapter: BookListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (requireActivity().application as MyApplication).appComponent
            .mainActivitySubcomponent()
            .build()
            .bookListSubcomponent()
            .bookListModule(BookListModule(this))
            .build()
            .inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BookListContainerBinding.inflate(inflater, container, false)
        bookListAdapter = BookListAdapter(Glide.with(this), mutableListOf())
        binding.bookListRecycler.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = bookListAdapter
            setHasFixedSize(true)
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        presenter.fetchBooks()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun showLoader() {
        binding.bookListProgress.visibility = View.VISIBLE
    }

    override fun showBooks(list: List<Book>) {
        binding.bookListProgress.visibility = View.GONE
        bookListAdapter.setBooks(list)
    }

    override fun showError(message: String) {
        binding.bookListProgress.visibility = View.GONE
        Toast.makeText(requireContext(), getText(R.string.general_error), Toast.LENGTH_LONG).show()
    }
}
