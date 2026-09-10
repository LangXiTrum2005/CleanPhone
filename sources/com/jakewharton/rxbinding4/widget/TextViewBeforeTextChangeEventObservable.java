package com.jakewharton.rxbinding4.widget;

import android.text.Editable;
import android.text.TextWatcher;
import com.jakewharton.rxbinding4.InitialValueObservable;
import io.reactivex.rxjava3.android.MainThreadDisposable;
import io.reactivex.rxjava3.core.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/TextViewBeforeTextChangeEventObservable;", "Lcom/jakewharton/rxbinding4/InitialValueObservable;", "Lcom/jakewharton/rxbinding4/widget/TextViewBeforeTextChangeEvent;", "Listener", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
final class TextViewBeforeTextChangeEventObservable extends InitialValueObservable<TextViewBeforeTextChangeEvent> {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/TextViewBeforeTextChangeEventObservable$Listener;", "Lio/reactivex/rxjava3/android/MainThreadDisposable;", "Landroid/text/TextWatcher;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    public static final class Listener extends MainThreadDisposable implements TextWatcher {
        public final Observer X;

        public Listener(Observer observer) {
            Intrinsics.g(null, "view");
            this.X = observer;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable s) {
            Intrinsics.g(s, "s");
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence s, int i2, int i3, int i4) {
            Intrinsics.g(s, "s");
            if (isDisposed()) {
                return;
            }
            this.X.onNext(new TextViewBeforeTextChangeEvent(i2, i3, i4, s));
        }

        @Override // io.reactivex.rxjava3.android.MainThreadDisposable
        public final void onDispose() {
            throw null;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            Intrinsics.g(charSequence, "charSequence");
        }
    }

    @Override // com.jakewharton.rxbinding4.InitialValueObservable
    public final Object a() {
        throw null;
    }

    @Override // com.jakewharton.rxbinding4.InitialValueObservable
    public final void b(Observer observer) {
        new Listener(observer);
        throw null;
    }
}
