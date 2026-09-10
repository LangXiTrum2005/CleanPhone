package com.jakewharton.rxbinding4.widget;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding4.InitialValueObservable;
import com.jakewharton.rxbinding4.internal.Preconditions;
import io.reactivex.rxjava3.android.MainThreadDisposable;
import io.reactivex.rxjava3.core.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/AdapterViewSelectionObservable;", "Lcom/jakewharton/rxbinding4/InitialValueObservable;", "Lcom/jakewharton/rxbinding4/widget/AdapterViewSelectionEvent;", "Listener", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
final class AdapterViewSelectionObservable extends InitialValueObservable<AdapterViewSelectionEvent> {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/AdapterViewSelectionObservable$Listener;", "Lio/reactivex/rxjava3/android/MainThreadDisposable;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    public static final class Listener extends MainThreadDisposable implements AdapterView.OnItemSelectedListener {
        public final Observer X;

        public Listener(Observer observer) {
            Intrinsics.g(null, "view");
            this.X = observer;
        }

        @Override // io.reactivex.rxjava3.android.MainThreadDisposable
        public final void onDispose() {
            throw null;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView parent, View view, int i2, long j) {
            Intrinsics.g(parent, "parent");
            if (isDisposed()) {
                return;
            }
            this.X.onNext(new AdapterViewItemSelectionEvent(parent, view, i2, j));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView parent) {
            Intrinsics.g(parent, "parent");
            if (isDisposed()) {
                return;
            }
            this.X.onNext(new AdapterViewNothingSelectionEvent(parent));
        }
    }

    @Override // com.jakewharton.rxbinding4.InitialValueObservable
    public final Object a() {
        throw null;
    }

    @Override // com.jakewharton.rxbinding4.InitialValueObservable
    public final void b(Observer observer) {
        if (Preconditions.a(observer)) {
            new Listener(observer);
            throw null;
        }
    }
}
