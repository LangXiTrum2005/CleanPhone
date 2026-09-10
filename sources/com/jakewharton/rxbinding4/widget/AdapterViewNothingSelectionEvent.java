package com.jakewharton.rxbinding4.widget;

import android.widget.AdapterView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/AdapterViewNothingSelectionEvent;", "Lcom/jakewharton/rxbinding4/widget/AdapterViewSelectionEvent;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class AdapterViewNothingSelectionEvent extends AdapterViewSelectionEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdapterView f27985a;

    public AdapterViewNothingSelectionEvent(AdapterView adapterView) {
        this.f27985a = adapterView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdapterViewNothingSelectionEvent) {
            return Intrinsics.a(this.f27985a, ((AdapterViewNothingSelectionEvent) obj).f27985a);
        }
        return false;
    }

    public final int hashCode() {
        AdapterView adapterView = this.f27985a;
        if (adapterView != null) {
            return adapterView.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "AdapterViewNothingSelectionEvent(view=" + this.f27985a + ")";
    }
}
