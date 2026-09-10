package io.flutter.plugin.platform;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f43376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f43377b;

    public p(Context context, a aVar, View view) {
        super(context);
        this.f43376a = aVar;
        this.f43377b = view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        io.flutter.view.g gVar = this.f43376a.f43310a;
        if (gVar == null) {
            return false;
        }
        return gVar.a(this.f43377b, view, accessibilityEvent);
    }
}
