package io.reactivex.parallel;

/* JADX INFO: loaded from: classes7.dex */
public interface ParallelFlowableConverter<T, R> {
    R apply(ParallelFlowable<T> parallelFlowable);
}
