package io.reactivex.rxjava3.parallel;

import io.reactivex.rxjava3.functions.BiFunction;

/* JADX INFO: loaded from: classes7.dex */
public enum ParallelFailureHandling implements BiFunction<Long, Throwable, ParallelFailureHandling> {
    STOP,
    ERROR,
    SKIP,
    RETRY;

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public ParallelFailureHandling apply(Long l2, Throwable th) {
        return this;
    }
}
