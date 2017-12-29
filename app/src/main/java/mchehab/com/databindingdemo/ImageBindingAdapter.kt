package mchehab.com.databindingdemo

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.squareup.picasso.Picasso

/**
 * Created by muhammadchehab on 12/29/17.
 */
@BindingAdapter("bind:imageURL")
fun loadImage(imageView: ImageView, url: String) {
    Picasso.with(imageView.context).load(url).into(imageView)
}