package com.frisinacho.gangame.deals

import android.support.v7.widget.RecyclerView
import com.frisinacho.commons.BR
import com.frisinacho.commons.BaseFragment
import com.frisinacho.commons.BaseListFragment
import com.frisinacho.commons.DataBindingRecyclerAdapter
import com.frisinacho.gangame.Deal
import com.frisinacho.gangame.R

class DealsFragment : BaseListFragment(){
    override fun getAdapter(): RecyclerView.Adapter<*> {
        return DataBindingRecyclerAdapter<Deal>(BR.deal,
                R.layout.item_deal)
    }
}
