package com.frisinacho.gangame.deals

import android.support.v7.widget.RecyclerView
import com.frisinacho.gangame.BR
import com.frisinacho.commons.BaseListFragment
import com.frisinacho.commons.DataBindingRecyclerAdapter
import com.frisinacho.gangame.Deal
import com.frisinacho.gangame.R
import com.frisinacho.gangame.data.GangameDataSource

class DealsFragment : BaseListFragment(){
    override fun getAdapter(): RecyclerView.Adapter<*> {
        return DataBindingRecyclerAdapter<Deal>(BR.deal,
                R.layout.item_deal)
    }

    override fun onResume() {
        super.onResume()
        showDeals()
    }

    private fun showDeals() {
        GangameDataSource
                .getDeals()
                .subscribe({list ->
                    replaceItems(list)
                }, { error ->
                    showError(error)
                })
    }

    private fun replaceItems(list: List<Deal>) {
        with(listAdapter as DataBindingRecyclerAdapter<Deal>){
            items.clear()
            items.addAll(list)
            notifyDataSetChanged()
        }
    }

    private fun showError(error: Throwable) {
        error.printStackTrace()
    }
}
