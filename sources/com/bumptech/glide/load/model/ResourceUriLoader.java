package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.Options;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ResourceUriLoader<DataT> implements ModelLoader<Uri, DataT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModelLoader f12598b;

    public static final class AssetFileDescriptorFactory implements ModelLoaderFactory<Uri, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f12599a;

        public AssetFileDescriptorFactory(Context context) {
            this.f12599a = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceUriLoader(this.f12599a, multiModelLoaderFactory.a(Integer.class, AssetFileDescriptor.class));
        }
    }

    public static final class InputStreamFactory implements ModelLoaderFactory<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f12600a;

        public InputStreamFactory(Context context) {
            this.f12600a = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceUriLoader(this.f12600a, multiModelLoaderFactory.a(Integer.class, InputStream.class));
        }
    }

    public ResourceUriLoader(Context context, ModelLoader modelLoader) {
        this.f12597a = context.getApplicationContext();
        this.f12598b = modelLoader;
    }

    public static ModelLoaderFactory c(Context context) {
        return new AssetFileDescriptorFactory(context);
    }

    public static ModelLoaderFactory d(Context context) {
        return new InputStreamFactory(context);
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean a(Object obj) {
        Uri uri = (Uri) obj;
        return "android.resource".equals(uri.getScheme()) && this.f12597a.getPackageName().equals(uri.getAuthority());
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData b(Object obj, int i2, int i3, Options options) {
        Uri uri = (Uri) obj;
        List<String> pathSegments = uri.getPathSegments();
        int size = pathSegments.size();
        ModelLoader modelLoader = this.f12598b;
        if (size == 1) {
            try {
                int i4 = Integer.parseInt(uri.getPathSegments().get(0));
                if (i4 != 0) {
                    return modelLoader.b(Integer.valueOf(i4), i2, i3, options);
                }
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
                    return null;
                }
            } catch (NumberFormatException e2) {
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e2);
                }
            }
        } else if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            Context context = this.f12597a;
            int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
            if (identifier != 0) {
                return modelLoader.b(Integer.valueOf(identifier), i2, i3, options);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
                return null;
            }
        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
            Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        }
        return null;
    }
}
