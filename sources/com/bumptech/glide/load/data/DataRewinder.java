package com.bumptech.glide.load.data;

/* JADX INFO: loaded from: classes.dex */
public interface DataRewinder<T> {

    public interface Factory<T> {
        Class a();

        DataRewinder b(Object obj);
    }

    Object a();

    void b();
}
