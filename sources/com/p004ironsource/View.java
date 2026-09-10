package com.p004ironsource;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.dx, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, d2 = {"Landroid/view/View;", "Landroid/graphics/Rect;", "rect", "", "a", "mediationsdk_release"}, k = 2, mv = {1, 8, 0})
public final class View {
    public static final boolean a(android.view.View view, Rect rect) {
        Intrinsics.f(view, "<this>");
        Intrinsics.f(rect, "rect");
        return view.isShown() && view.hasWindowFocus() && view.getGlobalVisibleRect(rect);
    }
}
