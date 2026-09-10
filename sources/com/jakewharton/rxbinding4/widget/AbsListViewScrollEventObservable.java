package com.jakewharton.rxbinding4.widget;

import android.widget.AbsListView;
import com.jakewharton.rxbinding4.internal.Preconditions;
import io.reactivex.rxjava3.android.MainThreadDisposable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/AbsListViewScrollEventObservable;", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/jakewharton/rxbinding4/widget/AbsListViewScrollEvent;", "Listener", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
final class AbsListViewScrollEventObservable extends Observable<AbsListViewScrollEvent> {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/AbsListViewScrollEventObservable$Listener;", "Lio/reactivex/rxjava3/android/MainThreadDisposable;", "Landroid/widget/AbsListView$OnScrollListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    public static final class Listener extends MainThreadDisposable implements AbsListView.OnScrollListener {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Observer f27976Y;

        public Listener(Observer observer) {
            Intrinsics.g(null, "view");
            this.f27976Y = observer;
        }

        @Override // io.reactivex.rxjava3.android.MainThreadDisposable
        public final void onDispose() {
            throw null;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
            Intrinsics.g(absListView, "absListView");
            if (isDisposed()) {
                return;
            }
            this.f27976Y.onNext(new AbsListViewScrollEvent(this.X, i2, i3, i4));
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i2) {
            Intrinsics.g(absListView, "absListView");
            this.X = i2;
            if (!isDisposed()) {
                throw null;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer<? super AbsListViewScrollEvent> observer) {
        Intrinsics.g(observer, "observer");
        if (Preconditions.a(observer)) {
            new Listener(observer);
            throw null;
        }
    }
}
