package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.subjects.Subject;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
final class ObservableWindowSubscribeIntercept<T> extends Observable<T> {
    final AtomicBoolean once = new AtomicBoolean();
    final Subject<T> window;

    public ObservableWindowSubscribeIntercept(Subject<T> subject) {
        this.window = subject;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.window.subscribe(observer);
        this.once.set(true);
    }

    public boolean tryAbandon() {
        return !this.once.get() && this.once.compareAndSet(false, true);
    }
}
