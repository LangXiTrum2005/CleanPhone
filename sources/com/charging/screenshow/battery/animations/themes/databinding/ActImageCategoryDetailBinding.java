package com.charging.screenshow.battery.animations.themes.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ActImageCategoryDetailBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f13125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f13126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RelativeLayout f13127c;
    public final SlidingTabLayout d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f13128e;
    public final ViewPager f;

    public ActImageCategoryDetailBinding(LinearLayout linearLayout, View view, ImageView imageView, RelativeLayout relativeLayout, SlidingTabLayout slidingTabLayout, TextView textView, ViewPager viewPager) {
        this.f13125a = view;
        this.f13126b = imageView;
        this.f13127c = relativeLayout;
        this.d = slidingTabLayout;
        this.f13128e = textView;
        this.f = viewPager;
    }
}
