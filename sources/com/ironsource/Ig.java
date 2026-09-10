package com.ironsource;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ig {
    public static final boolean a(View view, Rect rect) {
        kotlin.jvm.internal.n.f(view, "<this>");
        kotlin.jvm.internal.n.f(rect, "rect");
        return view.isShown() && view.hasWindowFocus() && view.getGlobalVisibleRect(rect);
    }
}
