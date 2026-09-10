package com.jakewharton.rxbinding4.internal;

import android.os.Looper;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"rxbinding_release"}, k = 2, mv = {1, 4, 0})
public final class Preconditions {
    public static final boolean a(Observer observer) {
        Intrinsics.g(observer, "observer");
        if (Intrinsics.a(Looper.myLooper(), Looper.getMainLooper())) {
            return true;
        }
        observer.onSubscribe(Disposable.empty());
        StringBuilder sb = new StringBuilder("Expected to be called on the main thread but was ");
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics.b(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        observer.onError(new IllegalStateException(sb.toString()));
        return false;
    }
}
