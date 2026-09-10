package com.scwang.smart.refresh.layout.simple;

import android.graphics.PointF;
import android.view.View;
import com.scwang.smart.refresh.layout.listener.ScrollBoundaryDecider;
import com.scwang.smart.refresh.layout.util.SmartUtil;

/* JADX INFO: loaded from: classes5.dex */
public class SimpleBoundaryDecider implements ScrollBoundaryDecider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PointF f33552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ScrollBoundaryDecider f33553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f33554c;

    @Override // com.scwang.smart.refresh.layout.listener.ScrollBoundaryDecider
    public final boolean a(View view) {
        ScrollBoundaryDecider scrollBoundaryDecider = this.f33553b;
        return scrollBoundaryDecider != null ? scrollBoundaryDecider.a(view) : SmartUtil.b(view, this.f33552a);
    }

    @Override // com.scwang.smart.refresh.layout.listener.ScrollBoundaryDecider
    public final boolean b(View view) {
        ScrollBoundaryDecider scrollBoundaryDecider = this.f33553b;
        return scrollBoundaryDecider != null ? scrollBoundaryDecider.b(view) : SmartUtil.a(view, this.f33552a, this.f33554c);
    }
}
