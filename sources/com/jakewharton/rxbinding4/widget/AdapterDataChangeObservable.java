package com.jakewharton.rxbinding4.widget;

import android.database.DataSetObserver;
import android.widget.Adapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.jakewharton.rxbinding4.InitialValueObservable;
import com.jakewharton.rxbinding4.internal.Preconditions;
import com.p004ironsource.ne;
import io.reactivex.rxjava3.android.MainThreadDisposable;
import io.reactivex.rxjava3.core.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/AdapterDataChangeObservable;", "Landroid/widget/Adapter;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/jakewharton/rxbinding4/InitialValueObservable;", "ObserverDisposable", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
final class AdapterDataChangeObservable<T extends Adapter> extends InitialValueObservable<T> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/AdapterDataChangeObservable$ObserverDisposable;", "Landroid/widget/Adapter;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lio/reactivex/rxjava3/android/MainThreadDisposable;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    public static final class ObserverDisposable<T extends Adapter> extends MainThreadDisposable {
        @Override // io.reactivex.rxjava3.android.MainThreadDisposable
        public final void onDispose() {
            throw null;
        }
    }

    @Override // com.jakewharton.rxbinding4.InitialValueObservable
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // com.jakewharton.rxbinding4.InitialValueObservable
    public final void b(final Observer observer) {
        if (Preconditions.a(observer)) {
            Intrinsics.g(null, ne.E1);
            final ObserverDisposable observerDisposable = new ObserverDisposable();
            new DataSetObserver() { // from class: com.jakewharton.rxbinding4.widget.AdapterDataChangeObservable$ObserverDisposable$dataSetObserver$1
                @Override // android.database.DataSetObserver
                public final void onChanged() {
                    if (observerDisposable.isDisposed()) {
                        return;
                    }
                    observer.onNext(null);
                }
            };
            throw null;
        }
    }
}
