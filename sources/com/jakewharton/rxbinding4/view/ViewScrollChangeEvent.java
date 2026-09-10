package com.jakewharton.rxbinding4.view;

import android.view.View;
import androidx.media3.extractor.text.ttml.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/view/ViewScrollChangeEvent;", "", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class ViewScrollChangeEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f27969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27971c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27972e;

    public ViewScrollChangeEvent(View view, int i2, int i3, int i4, int i5) {
        this.f27969a = view;
        this.f27970b = i2;
        this.f27971c = i3;
        this.d = i4;
        this.f27972e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewScrollChangeEvent)) {
            return false;
        }
        ViewScrollChangeEvent viewScrollChangeEvent = (ViewScrollChangeEvent) obj;
        return Intrinsics.a(this.f27969a, viewScrollChangeEvent.f27969a) && this.f27970b == viewScrollChangeEvent.f27970b && this.f27971c == viewScrollChangeEvent.f27971c && this.d == viewScrollChangeEvent.d && this.f27972e == viewScrollChangeEvent.f27972e;
    }

    public final int hashCode() {
        View view = this.f27969a;
        return Integer.hashCode(this.f27972e) + a.a(this.d, a.a(this.f27971c, a.a(this.f27970b, (view != null ? view.hashCode() : 0) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewScrollChangeEvent(view=");
        sb.append(this.f27969a);
        sb.append(", scrollX=");
        sb.append(this.f27970b);
        sb.append(", scrollY=");
        sb.append(this.f27971c);
        sb.append(", oldScrollX=");
        sb.append(this.d);
        sb.append(", oldScrollY=");
        return android.support.v4.media.a.i(this.f27972e, ")", sb);
    }
}
