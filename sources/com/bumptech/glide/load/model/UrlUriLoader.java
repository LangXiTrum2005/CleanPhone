package com.bumptech.glide.load.model;

import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class UrlUriLoader<Data> implements ModelLoader<Uri, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f12610b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", HttpRequest.DEFAULT_SCHEME)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModelLoader f12611a;

    public static class StreamFactory implements ModelLoaderFactory<Uri, InputStream> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new UrlUriLoader(multiModelLoaderFactory.a(GlideUrl.class, InputStream.class));
        }
    }

    public UrlUriLoader(ModelLoader modelLoader) {
        this.f12611a = modelLoader;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean a(Object obj) {
        return f12610b.contains(((Uri) obj).getScheme());
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData b(Object obj, int i2, int i3, Options options) {
        return this.f12611a.b(new GlideUrl(((Uri) obj).toString(), Headers.f12564a), i2, i3, options);
    }
}
