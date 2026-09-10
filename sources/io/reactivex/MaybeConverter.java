package io.reactivex;

/* JADX INFO: loaded from: classes7.dex */
public interface MaybeConverter<T, R> {
    R apply(Maybe<T> maybe);
}
