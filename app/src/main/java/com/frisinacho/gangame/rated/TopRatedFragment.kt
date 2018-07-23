package com.frisinacho.gangame.rated

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.View
import com.frisinacho.gangame.BR
import com.frisinacho.commons.BaseListFragment
import com.frisinacho.commons.DataBindingRecyclerAdapter
import com.frisinacho.gangame.R
import com.frisinacho.gangame.TopGame
import com.frisinacho.gangame.data.GangameDataSource

class TopRatedFragment : BaseListFragment(){
    override fun getAdapter(): RecyclerView.Adapter<*> {
        return DataBindingRecyclerAdapter<TopGame>(BR.topGame, R.layout.item_top_game)
    }

    override fun onResume() {
        super.onResume()
        showTopRated()
    }

    private fun showTopRated() {
        GangameDataSource
                .getTopRated()
                .subscribe({list ->
                    replaceItems(list)
                }, { error ->
                    showError(error)
                })
    }

    private fun replaceItems(list: List<TopGame>) {
        with(listAdapter as DataBindingRecyclerAdapter<TopGame>){
            items.clear()
            items.addAll(list)
            notifyDataSetChanged()
        }
    }

    private fun showError(error: Throwable) {
        error.printStackTrace()

        view?.let {
            Snackbar.make(view as View, R.string.error_request, Snackbar.LENGTH_LONG)
                    .setAction(R.string.label_retry, { _: View -> showTopRated()})
                    .show()
        }
    }
}
