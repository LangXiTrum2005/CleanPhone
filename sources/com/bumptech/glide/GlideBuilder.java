package com.bumptech.glide;

import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.manager.DefaultConnectivityMonitorFactory;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GlideBuilder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Engine f12285c;
    public BitmapPool d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LruArrayPool f12286e;
    public LruResourceCache f;
    public GlideExecutor g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GlideExecutor f12287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InternalCacheDiskCacheFactory f12288i;
    public MemorySizeCalculator j;
    public DefaultConnectivityMonitorFactory k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public GlideExecutor f12290n;
    public List o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayMap f12283a = new ArrayMap(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GlideExperiments.Builder f12284b = new GlideExperiments.Builder();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f12289l = 4;
    public final Glide.RequestOptionsFactory m = new AnonymousClass1();

    /* JADX INFO: renamed from: com.bumptech.glide.GlideBuilder$1, reason: invalid class name */
    public class AnonymousClass1 implements Glide.RequestOptionsFactory {
    }

    /* JADX INFO: renamed from: com.bumptech.glide.GlideBuilder$2, reason: invalid class name */
    class AnonymousClass2 implements Glide.RequestOptionsFactory {
    }

    public static final class EnableImageDecoderForBitmaps implements GlideExperiments.Experiment {
    }

    public static final class LogRequestOrigins implements GlideExperiments.Experiment {
    }

    public static final class ManualOverrideHardwareBitmapMaxFdCount implements GlideExperiments.Experiment {
    }

    public static final class UseDirectResourceLoader implements GlideExperiments.Experiment {
    }

    public static final class WaitForFramesAfterTrimMemory implements GlideExperiments.Experiment {
    }
}
