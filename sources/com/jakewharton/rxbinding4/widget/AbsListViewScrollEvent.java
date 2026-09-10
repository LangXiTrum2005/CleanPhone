package com.jakewharton.rxbinding4.widget;

import androidx.media3.extractor.text.ttml.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/AbsListViewScrollEvent;", "", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class AbsListViewScrollEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27975c;
    public final int d;

    public AbsListViewScrollEvent(int i2, int i3, int i4, int i5) {
        Intrinsics.g(null, "view");
        this.f27973a = i2;
        this.f27974b = i3;
        this.f27975c = i4;
        this.d = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsListViewScrollEvent)) {
            return false;
        }
        AbsListViewScrollEvent absListViewScrollEvent = (AbsListViewScrollEvent) obj;
        absListViewScrollEvent.getClass();
        return this.f27973a == absListViewScrollEvent.f27973a && this.f27974b == absListViewScrollEvent.f27974b && this.f27975c == absListViewScrollEvent.f27975c && this.d == absListViewScrollEvent.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + a.a(this.f27975c, a.a(this.f27974b, Integer.hashCode(this.f27973a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbsListViewScrollEvent(view=null, scrollState=");
        sb.append(this.f27973a);
        sb.append(", firstVisibleItem=");
        sb.append(this.f27974b);
        sb.append(", visibleItemCount=");
        sb.append(this.f27975c);
        sb.append(", totalItemCount=");
        return android.support.v4.media.a.i(this.d, ")", sb);
    }
}
