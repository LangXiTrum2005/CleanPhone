package io.reactivex;

/* JADX INFO: loaded from: classes7.dex */
public interface SingleTransformer<Upstream, Downstream> {
    SingleSource<Downstream> apply(Single<Upstream> single);
}
