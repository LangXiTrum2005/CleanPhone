package com.charging.screenshow.battery.animations.themes.databinding;

import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class FragImageCategoryBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f13183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProgressBar f13184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SmartRefreshLayout f13185c;
    public final RecyclerView d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f13186e;
    public final TextView f;

    public FragImageCategoryBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ProgressBar progressBar, SmartRefreshLayout smartRefreshLayout, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.f13183a = linearLayout2;
        this.f13184b = progressBar;
        this.f13185c = smartRefreshLayout;
        this.d = recyclerView;
        this.f13186e = textView;
        this.f = textView2;
    }
}
