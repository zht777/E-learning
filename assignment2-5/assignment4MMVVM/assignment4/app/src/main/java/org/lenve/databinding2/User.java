package org.lenve.databinding2;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class User {
    private String username;
    private String userface;
    private String introducion;

    public User() {
    }

    public User(String userface, String username, String introducion) {
        this.userface = userface;
        this.username = username;
        this.introducion = introducion;
    }

    @BindingAdapter("bind:userface")
    public static void getInternetImage(ImageView iv, String userface) {
        Picasso.with(iv.getContext()).load(userface).into(iv);
    }

    public String getUserface() {
        return userface;
    }

    public void setUserface(String userface) {
        this.userface = userface;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIntroducion() {
        return introducion;
    }

    public void setIntroducion(String introducion) {
        this.introducion = introducion;
    }

}
