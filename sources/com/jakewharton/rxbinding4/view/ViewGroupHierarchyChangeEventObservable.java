package com.jakewharton.rxbinding4.view;

import android.view.View;
import android.view.ViewGroup;
import com.jakewharton.rxbinding4.internal.Preconditions;
import io.reactivex.rxjava3.android.MainThreadDisposable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/view/ViewGroupHierarchyChangeEventObservable;", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/jakewharton/rxbinding4/view/ViewGroupHierarchyChangeEvent;", "Listener", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
final class ViewGroupHierarchyChangeEventObservable extends Observable<ViewGroupHierarchyChangeEvent> {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/view/ViewGroupHierarchyChangeEventObservable$Listener;", "Lio/reactivex/rxjava3/android/MainThreadDisposable;", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    public static final class Listener extends MainThreadDisposable implements ViewGroup.OnHierarchyChangeListener {
        public final Observer X;

        public Listener(Observer observer) {
            Intrinsics.g(null, "viewGroup");
            this.X = observer;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View parent, View child) {
            Intrinsics.g(parent, "parent");
            Intrinsics.g(child, "child");
            if (isDisposed()) {
                return;
            }
            this.X.onNext(new ViewGroupHierarchyChildViewAddEvent(child));
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View parent, View child) {
            Intrinsics.g(parent, "parent");
            Intrinsics.g(child, "child");
            if (isDisposed()) {
                return;
            }
            this.X.onNext(new ViewGroupHierarchyChildViewRemoveEvent(child));
        }

        @Override // io.reactivex.rxjava3.android.MainThreadDisposable
        public final void onDispose() {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer<? super ViewGroupHierarchyChangeEvent> observer) {
        Intrinsics.g(observer, "observer");
        if (Preconditions.a(observer)) {
            new Listener(observer);
            throw null;
        }
    }
}
