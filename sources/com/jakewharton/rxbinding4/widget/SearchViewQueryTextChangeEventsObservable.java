package com.jakewharton.rxbinding4.widget;

import android.widget.SearchView;
import com.jakewharton.rxbinding4.InitialValueObservable;
import com.jakewharton.rxbinding4.internal.Preconditions;
import io.reactivex.rxjava3.android.MainThreadDisposable;
import io.reactivex.rxjava3.core.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/SearchViewQueryTextChangeEventsObservable;", "Lcom/jakewharton/rxbinding4/InitialValueObservable;", "Lcom/jakewharton/rxbinding4/widget/SearchViewQueryTextEvent;", "Listener", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
final class SearchViewQueryTextChangeEventsObservable extends InitialValueObservable<SearchViewQueryTextEvent> {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/SearchViewQueryTextChangeEventsObservable$Listener;", "Lio/reactivex/rxjava3/android/MainThreadDisposable;", "Landroid/widget/SearchView$OnQueryTextListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    public static final class Listener extends MainThreadDisposable implements SearchView.OnQueryTextListener {
        public final Observer X;

        public Listener(Observer observer) {
            Intrinsics.g(null, "view");
            this.X = observer;
        }

        @Override // io.reactivex.rxjava3.android.MainThreadDisposable
        public final void onDispose() {
            throw null;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public final boolean onQueryTextChange(String s) {
            Intrinsics.g(s, "s");
            if (isDisposed()) {
                return false;
            }
            this.X.onNext(new SearchViewQueryTextEvent(s, false));
            return true;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public final boolean onQueryTextSubmit(String query) {
            Intrinsics.g(query, "query");
            if (isDisposed()) {
                return false;
            }
            this.X.onNext(new SearchViewQueryTextEvent(query, true));
            return true;
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
