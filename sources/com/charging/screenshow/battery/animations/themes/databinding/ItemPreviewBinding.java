package com.charging.screenshow.battery.animations.themes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.charging.screenshow.battery.animations.themes.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemPreviewBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f13222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f13223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f13224c;

    public ItemPreviewBinding(FrameLayout frameLayout, ImageView imageView, ImageView imageView2) {
        this.f13222a = frameLayout;
        this.f13223b = imageView;
        this.f13224c = imageView2;
    }

    public static ItemPreviewBinding a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.item_preview, viewGroup, false);
        int i2 = R.id.ivPlaceholder;
        ImageView imageView = (ImageView) ViewBindings.a(R.id.ivPlaceholder, viewInflate);
        if (imageView != null) {
            i2 = R.id.ivWallpaper;
            ImageView imageView2 = (ImageView) ViewBindings.a(R.id.ivWallpaper, viewInflate);
            if (imageView2 != null) {
                return new ItemPreviewBinding((FrameLayout) viewInflate, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }
}
