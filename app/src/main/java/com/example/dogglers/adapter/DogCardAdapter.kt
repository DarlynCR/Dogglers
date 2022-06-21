/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.dogglers.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.const.Layout
import com.example.dogglers.data.DataSource
import com.example.dogglers.model.Dog

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class

DogCardAdapter(
    private val context: Context,
    private val layout: Int,
) : RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {

    val dataset : List<Dog> = DataSource.dogs

    class DogCardViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val imageViewDog: ImageView = view.findViewById(R.id.iv_item)
        val textViewName: TextView = view.findViewById(R.id.tv_name_item)
        val textViewAge: TextView = view.findViewById(R.id.tv_age_item)
        val textViewHobbies: TextView = view.findViewById(R.id.tv_hobbies_item)

        fun render(dogModel: Dog) {
            imageViewDog.setImageResource(dogModel.imageResourceId)
            textViewName.text = dogModel.name
            textViewAge.text = "Age: "+ dogModel.age
            textViewHobbies.text = "Hobbies: " + dogModel.hobbies
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {

        if (layout == Layout.GRID) {
            return DogCardViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item, parent, false)
            )
        }
        return DogCardViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.vertical_horizontal_list_item, parent, false)
        )
    }

    override fun getItemCount() = dataset.size

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        val item = dataset[position]
        holder.render(item)

    }
}
