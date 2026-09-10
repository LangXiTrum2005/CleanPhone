package com.bumptech.glide.load.model;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.signature.ObjectKey;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class DataUrlLoader<Model, Data> implements ModelLoader<Model, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataDecoder f12548a;

    public interface DataDecoder<Data> {
    }

    public static final class DataUriFetcher<Data> implements DataFetcher<Data> {
        public final String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final DataDecoder f12549Y;
        public Object Z;

        public DataUriFetcher(String str, DataDecoder dataDecoder) {
            this.X = str;
            this.f12549Y = dataDecoder;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final Class a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void b() {
            try {
                ((InputStream) this.Z).close();
            } catch (IOException unused) {
            }
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
            try {
                ByteArrayInputStream byteArrayInputStreamA = ((StreamFactory.AnonymousClass1) this.f12549Y).a(this.X);
                this.Z = byteArrayInputStreamA;
                dataCallback.f(byteArrayInputStreamA);
            } catch (IllegalArgumentException e2) {
                dataCallback.c(e2);
            }
        }
    }

    public static final class StreamFactory<Model> implements ModelLoaderFactory<Model, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataDecoder f12550a = new AnonymousClass1();

        /* JADX INFO: renamed from: com.bumptech.glide.load.model.DataUrlLoader$StreamFactory$1, reason: invalid class name */
        class AnonymousClass1 implements DataDecoder<InputStream> {
            public final ByteArrayInputStream a(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new DataUrlLoader(this.f12550a);
        }
    }

    public DataUrlLoader(DataDecoder dataDecoder) {
        this.f12548a = dataDecoder;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean a(Object obj) {
        return obj.toString().startsWith("data:image");
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData b(Object obj, int i2, int i3, Options options) {
        return new ModelLoader.LoadData(new ObjectKey(obj), new DataUriFetcher(obj.toString(), this.f12548a));
    }
}
