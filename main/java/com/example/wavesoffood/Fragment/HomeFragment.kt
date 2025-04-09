package com.example.wavesoffood.Fragment

import android.os.Bundle
import android.renderscript.ScriptGroup
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.example.wavesoffood.R
import com.example.wavesoffood.adaptar.PopularAdaptar
import kotlin.apply
import kotlin.let
import com.example.wavesoffood.databinding.FragmentHomeBinding
import kotlin.jvm.Throws


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imagelist= ArrayList<SlideModel>()
        imagelist.add(SlideModel(R.drawable.banner1, ScaleTypes.FIT))
        imagelist.add(SlideModel(R.drawable.banner2, ScaleTypes.FIT))
        imagelist.add(SlideModel(R.drawable.banner3, ScaleTypes.FIT))

        val imageSlider=binding.imageSlider
        imageSlider.setImageList(imagelist)
        imageSlider.setImageList(imagelist, ScaleTypes.FIT)

        imageSlider.setItemClickListener(object: ItemClickListener{
            override fun doubleClick(position: Int) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(position:Int){
                val itemPosition=imagelist[position]
                val itemMessage="Selected Image $position"
                Toast.makeText(requireContext(),itemMessage,Toast.LENGTH_SHORT).show()
            }
        })
        //creating dummy data which we have to store in recyclerView
        val foodName=listOf("Pan Cakes","Salad","Ice Cream","Sweet Dish")
        val price=listOf("$5","$7","$8","$10")
        val popularFoodImages=listOf(R.drawable.menu1,R.drawable.menu2,R.drawable.menu3,R.drawable.menu4)

        val adaptar=PopularAdaptar(foodName,price,popularFoodImages)
        binding.popularRecyclerView.layoutManager= LinearLayoutManager(requireContext())
        binding.popularRecyclerView.adapter=adaptar
    }


            }
