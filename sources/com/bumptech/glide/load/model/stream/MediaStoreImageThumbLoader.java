package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.load.data.mediastore.ThumbFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.signature.ObjectKey;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class MediaStoreImageThumbLoader implements ModelLoader<Uri, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12615a;

    public static class Factory implements ModelLoaderFactory<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f12616a;

        public Factory(Context context) {
            this.f12616a = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new MediaStoreImageThumbLoader(this.f12616a);
        }
    }

    public MediaStoreImageThumbLoader(Context context) {
        this.f12615a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean a(Object obj) {
        Uri uri = (Uri) obj;
        return MediaStoreUtil.a(uri) && !uri.getPathSegments().contains("video");
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData b(Object obj, int i2, int i3, Options options) {
        Uri uri = (Uri) obj;
        if (i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || i2 > 512 || i3 > 384) {
            return null;
        }
        return new ModelLoader.LoadData(new ObjectKey(uri), ThumbFetcher.f(this.f12615a, uri));
    }
}
