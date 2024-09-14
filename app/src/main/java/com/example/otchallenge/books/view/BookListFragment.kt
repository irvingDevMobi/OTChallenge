package com.example.otchallenge.books.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.otchallenge.books.presenter.Book
import com.example.otchallenge.databinding.BookListContainerBinding

class BookListFragment : Fragment() {

    private var _binding: BookListContainerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BookListContainerBinding.inflate(inflater, container, false)
        binding.bookListRecycler.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = BookListAdapter(Glide.with(this@BookListFragment), getMockData())
            setHasFixedSize(true)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    private fun getMockData(): List<Book> = listOf(
        Book(
            "1",
            "Lorem Ipsum",
            "eque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit",
            "https://storage.googleapis.com/du-prd/books/images/9781649376565.jpg"
        ),
        Book(
            "2",
            "Lorem Ipsum",
            "eque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit",
            "https://storage.googleapis.com/du-prd/books/images/9781668045831.jpg"
        ),
        Book(
            "3",
            "Lorem Ipsum",
            "eque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit",
            "https://storage.googleapis.com/du-prd/books/images/9781649376565.jpg"
        ),
        Book(
            "4",
            "Lorem Ipsum",
            "eque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit",
            "https://storage.googleapis.com/du-prd/books/images/9781649376565.jpg"
        ),
        Book(
            "5",
            "Lorem Ipsum",
            "eque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit",
            "https://storage.googleapis.com/du-prd/books/images/9781668045831.jpg"
        ),
        Book(
            "6",
            "Lorem Ipsum",
            "eque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit",
            "https://storage.googleapis.com/du-prd/books/images/9781649376565.jpg"
        ),
    )
}
