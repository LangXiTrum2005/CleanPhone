package com.jakewharton.rxbinding4.view;

import android.view.View;
import androidx.media3.extractor.text.ttml.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/view/ViewLayoutChangeEvent;", "", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class ViewLayoutChangeEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f27963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27965c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27966e;
    public final int f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f27967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f27968i;

    public ViewLayoutChangeEvent(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f27963a = view;
        this.f27964b = i2;
        this.f27965c = i3;
        this.d = i4;
        this.f27966e = i5;
        this.f = i6;
        this.g = i7;
        this.f27967h = i8;
        this.f27968i = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewLayoutChangeEvent)) {
            return false;
        }
        ViewLayoutChangeEvent viewLayoutChangeEvent = (ViewLayoutChangeEvent) obj;
        return Intrinsics.a(this.f27963a, viewLayoutChangeEvent.f27963a) && this.f27964b == viewLayoutChangeEvent.f27964b && this.f27965c == viewLayoutChangeEvent.f27965c && this.d == viewLayoutChangeEvent.d && this.f27966e == viewLayoutChangeEvent.f27966e && this.f == viewLayoutChangeEvent.f && this.g == viewLayoutChangeEvent.g && this.f27967h == viewLayoutChangeEvent.f27967h && this.f27968i == viewLayoutChangeEvent.f27968i;
    }

    public final int hashCode() {
        View view = this.f27963a;
        return Integer.hashCode(this.f27968i) + a.a(this.f27967h, a.a(this.g, a.a(this.f, a.a(this.f27966e, a.a(this.d, a.a(this.f27965c, a.a(this.f27964b, (view != null ? view.hashCode() : 0) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewLayoutChangeEvent(view=");
        sb.append(this.f27963a);
        sb.append(", left=");
        sb.append(this.f27964b);
        sb.append(", top=");
        sb.append(this.f27965c);
        sb.append(", right=");
        sb.append(this.d);
        sb.append(", bottom=");
        sb.append(this.f27966e);
        sb.append(", oldLeft=");
        sb.append(this.f);
        sb.append(", oldTop=");
        sb.append(this.g);
        sb.append(", oldRight=");
        sb.append(this.f27967h);
        sb.append(", oldBottom=");
        return android.support.v4.media.a.i(this.f27968i, ")", sb);
    }
}
