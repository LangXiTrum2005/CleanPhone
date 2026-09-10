package com.jakewharton.rxbinding4.view;

import android.view.ViewTreeObserver;
import com.jakewharton.rxbinding4.internal.Preconditions;
import io.reactivex.rxjava3.android.MainThreadDisposable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/view/ViewTreeObserverPreDrawObservable;", "Lio/reactivex/rxjava3/core/Observable;", "", "Listener", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
final class ViewTreeObserverPreDrawObservable extends Observable<Unit> {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/view/ViewTreeObserverPreDrawObservable$Listener;", "Lio/reactivex/rxjava3/android/MainThreadDisposable;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    public static final class Listener extends MainThreadDisposable implements ViewTreeObserver.OnPreDrawListener {
        public final Observer X;

        public Listener(Observer observer) {
            Intrinsics.g(null, "view");
            Intrinsics.g(null, "proceedDrawingPass");
            this.X = observer;
        }

        @Override // io.reactivex.rxjava3.android.MainThreadDisposable
        public final void onDispose() {
            throw null;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            if (isDisposed()) {
                return true;
            }
            Unit unit = Unit.f43263a;
            Observer observer = this.X;
            observer.onNext(unit);
            try {
                throw null;
            } catch (Exception e2) {
                observer.onError(e2);
                dispose();
                return true;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer<? super Unit> observer) {
        Intrinsics.g(observer, "observer");
        if (Preconditions.a(observer)) {
            new Listener(observer);
            throw null;
        }
    }
}
