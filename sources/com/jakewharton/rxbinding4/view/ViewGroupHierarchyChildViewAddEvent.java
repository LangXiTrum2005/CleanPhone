package com.jakewharton.rxbinding4.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/view/ViewGroupHierarchyChildViewAddEvent;", "Lcom/jakewharton/rxbinding4/view/ViewGroupHierarchyChangeEvent;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class ViewGroupHierarchyChildViewAddEvent extends ViewGroupHierarchyChangeEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f27961a;

    public ViewGroupHierarchyChildViewAddEvent(View view) {
        Intrinsics.g(null, "view");
        this.f27961a = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewGroupHierarchyChildViewAddEvent)) {
            return false;
        }
        ViewGroupHierarchyChildViewAddEvent viewGroupHierarchyChildViewAddEvent = (ViewGroupHierarchyChildViewAddEvent) obj;
        viewGroupHierarchyChildViewAddEvent.getClass();
        return this.f27961a.equals(viewGroupHierarchyChildViewAddEvent.f27961a);
    }

    public final int hashCode() {
        return this.f27961a.hashCode();
    }

    public final String toString() {
        return "ViewGroupHierarchyChildViewAddEvent(view=null, child=" + this.f27961a + ")";
    }
}
