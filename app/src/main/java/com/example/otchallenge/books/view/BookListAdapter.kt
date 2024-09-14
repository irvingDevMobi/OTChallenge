package com.example.otchallenge.books.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.otchallenge.R
import com.example.otchallenge.books.presenter.Book
import com.example.otchallenge.databinding.BookListItemBinding

class BookListAdapter(
    private val glideManager: RequestManager,
    private val books: List<Book>
) : RecyclerView.Adapter<BookListAdapter.BookItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookItemHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = BookListItemBinding.inflate(inflater, parent, false)
        return BookItemHolder(binding)
    }

    override fun onBindViewHolder(holder: BookItemHolder, position: Int) {
        val book = books[position]
        holder.bind(book, glideManager)
    }

    override fun getItemCount(): Int = books.size

    class BookItemHolder(
        private val binding: BookListItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(book: Book, glideManager: RequestManager) {
            binding.bookTitleText.text = book.title
            binding.bookDescriptionText.text = book.description
            glideManager.load(book.coverUrl)
                .placeholder(R.drawable.placeholder)
                .into(binding.bookImage)
        }
    }
}
