package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.resource.drawable.DrawableDecoderCompat;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import com.bumptech.glide.signature.ObjectKey;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class DirectResourceLoader<DataT> implements ModelLoader<Integer, DataT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12552b;

    public static final class AssetFileDescriptorFactory implements ModelLoaderFactory<Integer, AssetFileDescriptor>, ResourceOpener<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f12553a;

        public AssetFileDescriptorFactory(Context context) {
            this.f12553a = context;
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public final Class a() {
            return AssetFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public final void b(Object obj) throws IOException {
            ((AssetFileDescriptor) obj).close();
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public final Object c(Resources resources, int i2, Resources.Theme theme) {
            return resources.openRawResourceFd(i2);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new DirectResourceLoader(this.f12553a, this);
        }
    }

    public static final class DrawableFactory implements ModelLoaderFactory<Integer, Drawable>, ResourceOpener<Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f12554a;

        public DrawableFactory(Context context) {
            this.f12554a = context;
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public final Class a() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public final /* bridge */ /* synthetic */ void b(Object obj) {
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public final Object c(Resources resources, int i2, Resources.Theme theme) {
            Context context = this.f12554a;
            return DrawableDecoderCompat.a(context, context, i2, theme);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new DirectResourceLoader(this.f12554a, this);
        }
    }

    public static final class InputStreamFactory implements ModelLoaderFactory<Integer, InputStream>, ResourceOpener<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f12555a;

        public InputStreamFactory(Context context) {
            this.f12555a = context;
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public final Class a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public final void b(Object obj) throws IOException {
            ((InputStream) obj).close();
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public final Object c(Resources resources, int i2, Resources.Theme theme) {
            return resources.openRawResource(i2);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new DirectResourceLoader(this.f12555a, this);
        }
    }

    public static final class ResourceDataFetcher<DataT> implements DataFetcher<DataT> {
        public final Resources.Theme X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Resources f12556Y;
        public final Object Z;
        public final int e0;
        public Object f0;

        public ResourceDataFetcher(Resources.Theme theme, Resources resources, ResourceOpener resourceOpener, int i2) {
            this.X = theme;
            this.f12556Y = resources;
            this.Z = resourceOpener;
            this.e0 = i2;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.DataFetcher
        public final Class a() {
            return this.Z.a();
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void b() {
            Object obj = this.f0;
            if (obj != null) {
                try {
                    this.Z.b(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final DataSource d() {
            return DataSource.X;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void e(Priority priority, DataFetcher.DataCallback dataCallback) {
            try {
                Object objC = this.Z.c(this.f12556Y, this.e0, this.X);
                this.f0 = objC;
                dataCallback.f(objC);
            } catch (Resources.NotFoundException e2) {
                dataCallback.c(e2);
            }
        }
    }

    public interface ResourceOpener<DataT> {
        Class a();

        void b(Object obj);

        Object c(Resources resources, int i2, Resources.Theme theme);
    }

    public DirectResourceLoader(Context context, ResourceOpener resourceOpener) {
        this.f12551a = context.getApplicationContext();
        this.f12552b = resourceOpener;
    }

    public static ModelLoaderFactory c(Context context) {
        return new AssetFileDescriptorFactory(context);
    }

    public static ModelLoaderFactory d(Context context) {
        return new DrawableFactory(context);
    }

    public static ModelLoaderFactory e(Context context) {
        return new InputStreamFactory(context);
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener, java.lang.Object] */
    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData b(Object obj, int i2, int i3, Options options) {
        Integer num = (Integer) obj;
        Resources.Theme theme = (Resources.Theme) options.c(ResourceDrawableDecoder.f12708b);
        return new ModelLoader.LoadData(new ObjectKey(num), new ResourceDataFetcher(theme, theme != null ? theme.getResources() : this.f12551a.getResources(), this.f12552b, num.intValue()));
    }
}
