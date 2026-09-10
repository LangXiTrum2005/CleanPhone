package com.bumptech.glide.load.model;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.signature.ObjectKey;

/* JADX INFO: loaded from: classes.dex */
public class UnitModelLoader<Model> implements ModelLoader<Model, Model> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UnitModelLoader f12603a = new UnitModelLoader();

    public static class Factory<Model> implements ModelLoaderFactory<Model, Model> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Factory f12604a = new Factory();

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return UnitModelLoader.f12603a;
        }
    }

    public static class UnitFetcher<Model> implements DataFetcher<Model> {
        public final Object X;

        public UnitFetcher(Object obj) {
            this.X = obj;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final Class a() {
            return this.X.getClass();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void b() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final DataSource d() {
            return DataSource.X;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void e(Priority priority, DataFetcher.DataCallback dataCallback) {
            dataCallback.f(this.X);
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean a(Object obj) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData b(Object obj, int i2, int i3, Options options) {
        return new ModelLoader.LoadData(new ObjectKey(obj), new UnitFetcher(obj));
    }
}
