package com.jakewharton.rxbinding4.widget;

import android.support.v4.media.a;
import android.widget.RatingBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/RatingBarChangeEvent;", "", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class RatingBarChangeEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RatingBar f27987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f27988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f27989c;

    public RatingBarChangeEvent(RatingBar ratingBar, float f, boolean z2) {
        this.f27987a = ratingBar;
        this.f27988b = f;
        this.f27989c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingBarChangeEvent)) {
            return false;
        }
        RatingBarChangeEvent ratingBarChangeEvent = (RatingBarChangeEvent) obj;
        return Intrinsics.a(this.f27987a, ratingBarChangeEvent.f27987a) && Float.compare(this.f27988b, ratingBarChangeEvent.f27988b) == 0 && this.f27989c == ratingBarChangeEvent.f27989c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public final int hashCode() {
        RatingBar ratingBar = this.f27987a;
        int iHashCode = (Float.hashCode(this.f27988b) + ((ratingBar != null ? ratingBar.hashCode() : 0) * 31)) * 31;
        boolean z2 = this.f27989c;
        ?? r0 = z2;
        if (z2) {
            r0 = 1;
        }
        return iHashCode + r0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RatingBarChangeEvent(view=");
        sb.append(this.f27987a);
        sb.append(", rating=");
        sb.append(this.f27988b);
        sb.append(", fromUser=");
        return a.t(sb, this.f27989c, ")");
    }
}
