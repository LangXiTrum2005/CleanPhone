package com.jakewharton.rxbinding4.view;

import android.view.View;
import com.jakewharton.rxbinding4.internal.Preconditions;
import io.reactivex.rxjava3.android.MainThreadDisposable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/view/ViewClickObservable;", "Lio/reactivex/rxjava3/core/Observable;", "", "Listener", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
final class ViewClickObservable extends Observable<Unit> {
    public final View X;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/view/ViewClickObservable$Listener;", "Lio/reactivex/rxjava3/android/MainThreadDisposable;", "Landroid/view/View$OnClickListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    public static final class Listener extends MainThreadDisposable implements View.OnClickListener {
        public final View X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Observer f27960Y;

        public Listener(View view, Observer observer) {
            Intrinsics.g(view, "view");
            this.X = view;
            this.f27960Y = observer;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View v) {
            Intrinsics.g(v, "v");
            if (isDisposed()) {
                return;
            }
            this.f27960Y.onNext(Unit.f43263a);
        }

        @Override // io.reactivex.rxjava3.android.MainThreadDisposable
        public final void onDispose() {
            this.X.setOnClickListener(null);
        }
    }

    public ViewClickObservable(View view) {
        Intrinsics.g(view, "view");
        this.X = view;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer<? super Unit> observer) {
        Intrinsics.g(observer, "observer");
        if (Preconditions.a(observer)) {
            View view = this.X;
            Listener listener = new Listener(view, observer);
            observer.onSubscribe(listener);
            view.setOnClickListener(listener);
        }
    }
}
