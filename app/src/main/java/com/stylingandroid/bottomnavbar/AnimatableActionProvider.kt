package com.stylingandroid.bottomnavbar

import android.content.Context
import android.graphics.drawable.Animatable
import android.view.LayoutInflater
import android.view.View
import androidx.core.view.ActionProvider
import com.stylingandroid.bottomnavbar.databinding.AnimatableActionBinding

class AnimatableActionProvider(context: Context) : ActionProvider(context), Animatable {

    private lateinit var binding: AnimatableActionBinding
    private var animatable: Animatable? = null

    override fun onCreateActionView(): View {
        println("onCreateActionView()")
        binding = AnimatableActionBinding.inflate(LayoutInflater.from(context))
        animatable = binding.actionImage as? Animatable
        start()
        return binding.actionImage
    }

    override fun isRunning(): Boolean = animatable?.isRunning ?: false

    override fun start() {
        animatable?.start()
    }

    override fun stop() {
        animatable?.stop()
    }
}
