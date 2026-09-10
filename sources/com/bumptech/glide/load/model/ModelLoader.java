package com.bumptech.glide.load.model;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.util.Preconditions;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ModelLoader<Model, Data> {

    public static class LoadData<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Key f12575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f12576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DataFetcher f12577c;

        public LoadData(Key key, DataFetcher dataFetcher) {
            List list = Collections.EMPTY_LIST;
            Preconditions.c(key, "Argument must not be null");
            this.f12575a = key;
            Preconditions.c(list, "Argument must not be null");
            this.f12576b = list;
            Preconditions.c(dataFetcher, "Argument must not be null");
            this.f12577c = dataFetcher;
        }
    }

    boolean a(Object obj);

    LoadData b(Object obj, int i2, int i3, Options options);
}
