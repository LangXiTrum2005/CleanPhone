package com.jakewharton.rxbinding4.view;

import android.view.View;
import com.jakewharton.rxbinding4.internal.Preconditions;
import io.reactivex.rxjava3.android.MainThreadDisposable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/view/ViewSystemUiVisibilityChangeObservable;", "Lio/reactivex/rxjava3/core/Observable;", "", "Listener", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
final class ViewSystemUiVisibilityChangeObservable extends Observable<Integer> {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/view/ViewSystemUiVisibilityChangeObservable$Listener;", "Lio/reactivex/rxjava3/android/MainThreadDisposable;", "Landroid/view/View$OnSystemUiVisibilityChangeListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    public static final class Listener extends MainThreadDisposable implements View.OnSystemUiVisibilityChangeListener {
        public final Observer X;

        public Listener(Observer observer) {
            Intrinsics.g(null, "view");
            this.X = observer;
        }

        @Override // io.reactivex.rxjava3.android.MainThreadDisposable
        public final void onDispose() {
            throw null;
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public final void onSystemUiVisibilityChange(int i2) {
            if (isDisposed()) {
                return;
            }
            this.X.onNext(Integer.valueOf(i2));
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer<? super Integer> observer) {
        Intrinsics.g(observer, "observer");
        if (Preconditions.a(observer)) {
            new Listener(observer);
            throw null;
        }
    }
}
