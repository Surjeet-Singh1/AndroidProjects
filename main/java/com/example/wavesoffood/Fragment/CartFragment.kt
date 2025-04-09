package com.example.wavesoffood.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wavesoffood.R
import com.example.wavesoffood.adaptar.CartAdapter
import com.example.wavesoffood.databinding.FragmentCartBinding

class CartFragment : Fragment() {
    private lateinit var binding: FragmentCartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCartBinding.inflate(inflater, container, false)

        val cartFoodNames = listOf("Pizza", "Burger", "Pasta", "Salad", "Momos", "Pastry")
        val cartItemPrices = listOf("$5", "$4", "$6", "$3", "$2", "$1")
        val cartImages = listOf(
            R.drawable.menu1,
            R.drawable.menu2,
            R.drawable.menu3,
            R.drawable.menu4,
            R.drawable.menu5,
            R.drawable.menu6
        )

        val adapter = CartAdapter(
            ArrayList(cartFoodNames),
            ArrayList(cartItemPrices),
            ArrayList(cartImages)
        )
        binding.cartRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.cartRecyclerView.adapter = adapter

        return binding.root
    }
}
