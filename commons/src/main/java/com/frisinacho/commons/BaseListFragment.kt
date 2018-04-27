package com.frisinacho.commons

import android.support.v7.widget.RecyclerView

abstract class BaseListFragment : BaseFragment() {

    val listAdapter : RecyclerView.Adapter<*>
        get() = getAdapter()

    override fun getLayoutResId(): Int {
        return R.layout.fragment_list
    }

    abstract fun getAdapter(): RecyclerView.Adapter<*>
}