package com.example.customspinner

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView


class CustomAdapter(val activity: Context, resource: Int, val strings: MutableList<String>) :
    ArrayAdapter<String>(activity, resource, strings) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val view =
            LayoutInflater.from(activity).inflate(R.layout.custom_spiner_layout, parent, false)

        val textLabel = view?.findViewById<TextView>(R.id.tv_spinner)

        textLabel?.text = getItem(position)

        return view!!
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(activity).inflate(R.layout.custom_drop_view, parent, false)

        val textLabel = view.findViewById<TextView>(R.id.tv_item_name)

        textLabel.text = strings[position]

        return view
    }
}