package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.Options;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class ResourceLoader<Data> implements ModelLoader<Integer, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModelLoader f12592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f12593b;

    public static final class AssetFileDescriptorFactory implements ModelLoaderFactory<Integer, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f12594a;

        public AssetFileDescriptorFactory(Resources resources) {
            this.f12594a = resources;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceLoader(this.f12594a, multiModelLoaderFactory.a(Uri.class, AssetFileDescriptor.class));
        }
    }

    @Deprecated
    public static class FileDescriptorFactory implements ModelLoaderFactory<Integer, ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceLoader(null, multiModelLoaderFactory.a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class StreamFactory implements ModelLoaderFactory<Integer, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f12595a;

        public StreamFactory(Resources resources) {
            this.f12595a = resources;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceLoader(this.f12595a, multiModelLoaderFactory.a(Uri.class, InputStream.class));
        }
    }

    public static class UriFactory implements ModelLoaderFactory<Integer, Uri> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f12596a;

        public UriFactory(Resources resources) {
            this.f12596a = resources;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceLoader(this.f12596a, UnitModelLoader.f12603a);
        }
    }

    public ResourceLoader(Resources resources, ModelLoader modelLoader) {
        this.f12593b = resources;
        this.f12592a = modelLoader;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData b(Object obj, int i2, int i3, Options options) {
        Uri uri;
        Integer num = (Integer) obj;
        Resources resources = this.f12593b;
        try {
            uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num.intValue()) + IOUtils.DIR_SEPARATOR_UNIX + resources.getResourceTypeName(num.intValue()) + IOUtils.DIR_SEPARATOR_UNIX + resources.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e2) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e2);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f12592a.b(uri, i2, i3, options);
    }
}
