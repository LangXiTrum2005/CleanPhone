package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.FileDescriptorAssetPathFetcher;
import com.bumptech.glide.load.data.StreamAssetPathFetcher;
import com.bumptech.glide.signature.ObjectKey;
import com.p004ironsource.d9;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class AssetUriLoader<Data> implements ModelLoader<Uri, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetManager f12542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12543b;

    public interface AssetFetcherFactory<Data> {
        DataFetcher a(AssetManager assetManager, String str);
    }

    public static class FileDescriptorFactory implements ModelLoaderFactory<Uri, AssetFileDescriptor>, AssetFetcherFactory<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AssetManager f12544a;

        public FileDescriptorFactory(AssetManager assetManager) {
            this.f12544a = assetManager;
        }

        @Override // com.bumptech.glide.load.model.AssetUriLoader.AssetFetcherFactory
        public final DataFetcher a(AssetManager assetManager, String str) {
            return new FileDescriptorAssetPathFetcher(assetManager, str);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new AssetUriLoader(this.f12544a, this);
        }
    }

    public static class StreamFactory implements ModelLoaderFactory<Uri, InputStream>, AssetFetcherFactory<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AssetManager f12545a;

        public StreamFactory(AssetManager assetManager) {
            this.f12545a = assetManager;
        }

        @Override // com.bumptech.glide.load.model.AssetUriLoader.AssetFetcherFactory
        public final DataFetcher a(AssetManager assetManager, String str) {
            return new StreamAssetPathFetcher(assetManager, str);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new AssetUriLoader(this.f12545a, this);
        }
    }

    public AssetUriLoader(AssetManager assetManager, AssetFetcherFactory assetFetcherFactory) {
        this.f12542a = assetManager;
        this.f12543b = assetFetcherFactory;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean a(Object obj) {
        Uri uri = (Uri) obj;
        return d9.h.f24719b.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.bumptech.glide.load.model.AssetUriLoader$AssetFetcherFactory, java.lang.Object] */
    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData b(Object obj, int i2, int i3, Options options) {
        Uri uri = (Uri) obj;
        return new ModelLoader.LoadData(new ObjectKey(uri), this.f12543b.a(this.f12542a, uri.toString().substring(22)));
    }
}
