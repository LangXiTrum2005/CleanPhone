package io.reactivex.rxjava3.android.schedulers;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        return AndroidSchedulers.MainHolder.DEFAULT;
    }
}
