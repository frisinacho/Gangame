package com.frisinacho.gangame.owned

import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import com.frisinacho.commons.BR
import com.frisinacho.commons.BaseListFragment
import com.frisinacho.commons.DataBindingRecyclerAdapter
import com.frisinacho.gangame.R
import com.frisinacho.gangame.TopGame

class TopOwnedFragment : BaseListFragment(){
    override fun getAdapter(): RecyclerView.Adapter<*> {
        return DataBindingRecyclerAdapter<TopGame>(BR.topGame, R.layout.item_top_game)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (listAdapter as DataBindingRecyclerAdapter<TopGame>)
                .items.addAll(getDummyTopGames())
        listAdapter.notifyDataSetChanged()
    }

    fun getDummyTopGames(): ArrayList<TopGame> {
        return arrayListOf(TopGame("Counter Strike",
                13407338,
                80,
                "Valve",
                9.99F,
                1,
                "http://cdn.akamai.steamstatic.com/steam/apps/10/capsule_184x69.jpg"))
    }

}
