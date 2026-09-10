package com.jakewharton.rxbinding4.view;

import android.view.MenuItem;
import com.jakewharton.rxbinding4.internal.Preconditions;
import io.reactivex.rxjava3.android.MainThreadDisposable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/view/MenuItemActionViewEventObservable;", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/jakewharton/rxbinding4/view/MenuItemActionViewEvent;", "Listener", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
final class MenuItemActionViewEventObservable extends Observable<MenuItemActionViewEvent> {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/view/MenuItemActionViewEventObservable$Listener;", "Lio/reactivex/rxjava3/android/MainThreadDisposable;", "Landroid/view/MenuItem$OnActionExpandListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    public static final class Listener extends MainThreadDisposable implements MenuItem.OnActionExpandListener {
        public final Observer X;

        public Listener(Observer observer) {
            Intrinsics.g(null, "menuItem");
            Intrinsics.g(null, "handled");
            this.X = observer;
        }

        public final boolean a(MenuItemActionViewEvent menuItemActionViewEvent) {
            if (isDisposed()) {
                return false;
            }
            try {
                throw null;
            } catch (Exception e2) {
                this.X.onError(e2);
                dispose();
                return false;
            }
        }

        @Override // io.reactivex.rxjava3.android.MainThreadDisposable
        public final void onDispose() {
            throw null;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionCollapse(MenuItem item) {
            Intrinsics.g(item, "item");
            a(new MenuItemActionViewCollapseEvent(item));
            return false;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionExpand(MenuItem item) {
            Intrinsics.g(item, "item");
            a(new MenuItemActionViewExpandEvent(item));
            return false;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer<? super MenuItemActionViewEvent> observer) {
        Intrinsics.g(observer, "observer");
        if (Preconditions.a(observer)) {
            new Listener(observer);
            throw null;
        }
    }
}
