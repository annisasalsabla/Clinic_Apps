package com.annisa.clinicapps.adapter



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.annisa.clinicapps.R
import com.annisa.clinicapps.model.ModelIcon


class AdapterMenuIcon (
    val itemMenuList: List<ModelIcon>
): RecyclerView.Adapter<AdapterMenuIcon.MyviewHolder>(){
    class MyviewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var imgMenuIcon : ImageView = itemView.findViewById(R.id.imgMenuIcon)
        var txtNamaMenu : TextView = itemView.findViewById(R.id.txtNamaMenu)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_menu,parent,false)
        return MyviewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemMenuList.size
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        val currentItem = itemMenuList[position]
        holder.imgMenuIcon.setImageResource(currentItem.iconImage)
        holder.txtNamaMenu.setText(currentItem.iconName)
    }

}