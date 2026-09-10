package io.reactivex.rxjava3.internal.jdk8;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableLastStageObserver<T> extends ObservableStageObserver<T> {
    final T defaultItem;
    final boolean hasDefault;

    public ObservableLastStageObserver(boolean z2, T t) {
        this.hasDefault = z2;
        this.defaultItem = t;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        if (isDone()) {
            return;
        }
        T t = this.value;
        clear();
        if (t != null) {
            complete(t);
        } else if (this.hasDefault) {
            complete(this.defaultItem);
        } else {
            completeExceptionally(new NoSuchElementException());
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(T t) {
        this.value = t;
    }
}
