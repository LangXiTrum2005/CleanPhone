package com.inmobi.media;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class I8 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f22885a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I8(FrameLayout view) {
        super(view);
        Intrinsics.f(view, "view");
        this.f22885a = view;
    }
}
