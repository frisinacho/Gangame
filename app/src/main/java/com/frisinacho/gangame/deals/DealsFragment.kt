package com.frisinacho.gangame.deals

import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import com.frisinacho.commons.BR
import com.frisinacho.commons.BaseListFragment
import com.frisinacho.commons.DataBindingRecyclerAdapter
import com.frisinacho.gangame.Deal
import com.frisinacho.gangame.R

class DealsFragment : BaseListFragment(){
    override fun getAdapter(): RecyclerView.Adapter<*> {
        return DataBindingRecyclerAdapter<Deal>(BR.deal,
                R.layout.item_deal)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}
