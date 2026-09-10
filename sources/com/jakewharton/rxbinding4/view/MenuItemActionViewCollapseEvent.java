package com.jakewharton.rxbinding4.view;

import android.view.MenuItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/view/MenuItemActionViewCollapseEvent;", "Lcom/jakewharton/rxbinding4/view/MenuItemActionViewEvent;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class MenuItemActionViewCollapseEvent extends MenuItemActionViewEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem f27958a;

    public MenuItemActionViewCollapseEvent(MenuItem menuItem) {
        this.f27958a = menuItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MenuItemActionViewCollapseEvent) {
            return Intrinsics.a(this.f27958a, ((MenuItemActionViewCollapseEvent) obj).f27958a);
        }
        return false;
    }

    public final int hashCode() {
        MenuItem menuItem = this.f27958a;
        if (menuItem != null) {
            return menuItem.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "MenuItemActionViewCollapseEvent(menuItem=" + this.f27958a + ")";
    }
}
