package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.ImageViewTargetFactory;
import com.bumptech.glide.util.GlideSuppliers;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class GlideContext extends ContextWrapper {
    public static final GenericTransitionOptions k = new GenericTransitionOptions();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruArrayPool f12291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GlideSuppliers.GlideSupplier f12292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageViewTargetFactory f12293c;
    public final Glide.RequestOptionsFactory d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f12294e;
    public final ArrayMap f;
    public final Engine g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final GlideExperiments f12295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f12296i;
    public RequestOptions j;

    public GlideContext(Context context, LruArrayPool lruArrayPool, GlideSuppliers.GlideSupplier glideSupplier, ImageViewTargetFactory imageViewTargetFactory, Glide.RequestOptionsFactory requestOptionsFactory, ArrayMap arrayMap, List list, Engine engine, GlideExperiments glideExperiments, int i2) {
        super(context.getApplicationContext());
        this.f12291a = lruArrayPool;
        this.f12293c = imageViewTargetFactory;
        this.d = requestOptionsFactory;
        this.f12294e = list;
        this.f = arrayMap;
        this.g = engine;
        this.f12295h = glideExperiments;
        this.f12296i = i2;
        this.f12292b = GlideSuppliers.a(glideSupplier);
    }

    public final Registry a() {
        return (Registry) this.f12292b.get();
    }
}
