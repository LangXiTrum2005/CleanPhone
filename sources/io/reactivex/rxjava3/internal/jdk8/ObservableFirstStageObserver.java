package io.reactivex.rxjava3.internal.jdk8;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableFirstStageObserver<T> extends ObservableStageObserver<T> {
    final T defaultItem;
    final boolean hasDefault;

    public ObservableFirstStageObserver(boolean z2, T t) {
        this.hasDefault = z2;
        this.defaultItem = t;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        if (isDone()) {
            return;
        }
        clear();
        if (this.hasDefault) {
            complete(this.defaultItem);
        } else {
            completeExceptionally(new NoSuchElementException());
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(T t) {
        complete(t);
    }
}
