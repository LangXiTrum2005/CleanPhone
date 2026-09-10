package com.jakewharton.rxbinding4.widget;

import android.view.View;
import android.widget.AdapterView;
import androidx.media3.extractor.text.ttml.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/AdapterViewItemClickEvent;", "", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class AdapterViewItemClickEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdapterView f27979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f27980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27981c;
    public final long d;

    public AdapterViewItemClickEvent(AdapterView adapterView, View view, int i2, long j) {
        this.f27979a = adapterView;
        this.f27980b = view;
        this.f27981c = i2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdapterViewItemClickEvent)) {
            return false;
        }
        AdapterViewItemClickEvent adapterViewItemClickEvent = (AdapterViewItemClickEvent) obj;
        return Intrinsics.a(this.f27979a, adapterViewItemClickEvent.f27979a) && Intrinsics.a(this.f27980b, adapterViewItemClickEvent.f27980b) && this.f27981c == adapterViewItemClickEvent.f27981c && this.d == adapterViewItemClickEvent.d;
    }

    public final int hashCode() {
        AdapterView adapterView = this.f27979a;
        int iHashCode = (adapterView != null ? adapterView.hashCode() : 0) * 31;
        View view = this.f27980b;
        return Long.hashCode(this.d) + a.a(this.f27981c, (iHashCode + (view != null ? view.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdapterViewItemClickEvent(view=");
        sb.append(this.f27979a);
        sb.append(", clickedView=");
        sb.append(this.f27980b);
        sb.append(", position=");
        sb.append(this.f27981c);
        sb.append(", id=");
        return android.support.v4.media.a.j(this.d, ")", sb);
    }
}
