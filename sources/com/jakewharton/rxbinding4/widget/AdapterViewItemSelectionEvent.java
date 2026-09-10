package com.jakewharton.rxbinding4.widget;

import android.view.View;
import android.widget.AdapterView;
import androidx.media3.extractor.text.ttml.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/AdapterViewItemSelectionEvent;", "Lcom/jakewharton/rxbinding4/widget/AdapterViewSelectionEvent;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class AdapterViewItemSelectionEvent extends AdapterViewSelectionEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdapterView f27982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f27983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27984c;
    public final long d;

    public AdapterViewItemSelectionEvent(AdapterView adapterView, View view, int i2, long j) {
        this.f27982a = adapterView;
        this.f27983b = view;
        this.f27984c = i2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdapterViewItemSelectionEvent)) {
            return false;
        }
        AdapterViewItemSelectionEvent adapterViewItemSelectionEvent = (AdapterViewItemSelectionEvent) obj;
        return Intrinsics.a(this.f27982a, adapterViewItemSelectionEvent.f27982a) && Intrinsics.a(this.f27983b, adapterViewItemSelectionEvent.f27983b) && this.f27984c == adapterViewItemSelectionEvent.f27984c && this.d == adapterViewItemSelectionEvent.d;
    }

    public final int hashCode() {
        AdapterView adapterView = this.f27982a;
        int iHashCode = (adapterView != null ? adapterView.hashCode() : 0) * 31;
        View view = this.f27983b;
        return Long.hashCode(this.d) + a.a(this.f27984c, (iHashCode + (view != null ? view.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdapterViewItemSelectionEvent(view=");
        sb.append(this.f27982a);
        sb.append(", selectedView=");
        sb.append(this.f27983b);
        sb.append(", position=");
        sb.append(this.f27984c);
        sb.append(", id=");
        return android.support.v4.media.a.j(this.d, ")", sb);
    }
}
