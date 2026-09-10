package com.inmobi.media;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.inmobi.ads.viewsv2.NativeRecyclerViewAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Rc extends K8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f23128b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rc(Context context) {
        super(context, (byte) 1);
        Intrinsics.f(context, "context");
    }

    @Override // com.inmobi.media.K8
    public final void a(C3049h8 scrollableContainerAsset, L8 dataSource, int i2, int i3, D8 d8) {
        Intrinsics.f(scrollableContainerAsset, "scrollableContainerAsset");
        Intrinsics.f(dataSource, "dataSource");
        RecyclerView recyclerView = new RecyclerView(getContext());
        this.f23128b = recyclerView;
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(dataSource instanceof NativeRecyclerViewAdapter ? (NativeRecyclerViewAdapter) dataSource : null);
        addView(this.f23128b);
    }
}
