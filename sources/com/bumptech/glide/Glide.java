package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Trace;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.manager.DefaultConnectivityMonitorFactory;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.module.GlideModule;
import com.bumptech.glide.module.ManifestParser;
import com.bumptech.glide.request.target.ImageViewTargetFactory;
import com.bumptech.glide.util.GlideSuppliers;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Glide implements ComponentCallbacks2 {
    public static volatile Glide j0;
    public static volatile boolean k0;
    public final BitmapPool X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final LruResourceCache f12282Y;
    public final GlideContext Z;
    public final LruArrayPool e0;
    public final RequestManagerRetriever f0;
    public final DefaultConnectivityMonitorFactory g0;
    public final ArrayList h0 = new ArrayList();
    public final RequestOptionsFactory i0;

    public interface RequestOptionsFactory {
    }

    public Glide(Context context, Engine engine, LruResourceCache lruResourceCache, BitmapPool bitmapPool, LruArrayPool lruArrayPool, RequestManagerRetriever requestManagerRetriever, DefaultConnectivityMonitorFactory defaultConnectivityMonitorFactory, int i2, RequestOptionsFactory requestOptionsFactory, ArrayMap arrayMap, List list, final ArrayList arrayList, final AppGlideModule appGlideModule, GlideExperiments glideExperiments) {
        this.X = bitmapPool;
        this.e0 = lruArrayPool;
        this.f12282Y = lruResourceCache;
        this.f0 = requestManagerRetriever;
        this.g0 = defaultConnectivityMonitorFactory;
        this.i0 = requestOptionsFactory;
        this.Z = new GlideContext(context, lruArrayPool, new GlideSuppliers.GlideSupplier<Registry>(arrayList, appGlideModule) { // from class: com.bumptech.glide.RegistryFactory.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f12307a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ArrayList f12309c;

            @Override // com.bumptech.glide.util.GlideSuppliers.GlideSupplier
            public final Object get() {
                if (this.f12307a) {
                    throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
                }
                Trace.beginSection("Glide registry");
                this.f12307a = true;
                try {
                    return RegistryFactory.a(this.f12308b, this.f12309c);
                } finally {
                    this.f12307a = false;
                    Trace.endSection();
                }
            }
        }, new ImageViewTargetFactory(), requestOptionsFactory, arrayMap, list, engine, glideExperiments, i2);
    }

    public static Glide a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (j0 == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (InstantiationException e3) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            } catch (InvocationTargetException e5) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e5);
            }
            synchronized (Glide.class) {
                if (j0 == null) {
                    if (k0) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    k0 = true;
                    try {
                        b(context, generatedAppGlideModule);
                        k0 = false;
                    } catch (Throwable th) {
                        k0 = false;
                        throw th;
                    }
                }
            }
        }
        return j0;
    }

    public static void b(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        GlideBuilder glideBuilder = new GlideBuilder();
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(ManifestParser.a(str));
                        if (Log.isLoggable("ManifestParser", 3)) {
                            Log.d("ManifestParser", "Loaded Glide module: " + str);
                        }
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
            if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
                HashSet hashSet = new HashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    GlideModule glideModule = (GlideModule) it.next();
                    if (hashSet.contains(glideModule.getClass())) {
                        if (Log.isLoggable("Glide", 3)) {
                            Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + glideModule);
                        }
                        it.remove();
                    }
                }
            }
            if (Log.isLoggable("Glide", 3)) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Log.d("Glide", "Discovered GlideModule from manifest: " + ((GlideModule) it2.next()).getClass());
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((GlideModule) it3.next()).b();
            }
            if (glideBuilder.g == null) {
                int i2 = GlideExecutor.Z;
                GlideExecutor.Builder builder = new GlideExecutor.Builder(false);
                if (GlideExecutor.Z == 0) {
                    GlideExecutor.Z = Math.min(4, Runtime.getRuntime().availableProcessors());
                }
                int i3 = GlideExecutor.Z;
                builder.f12535b = i3;
                builder.f12536c = i3;
                builder.f = "source";
                glideBuilder.g = builder.a();
            }
            if (glideBuilder.f12287h == null) {
                int i4 = GlideExecutor.Z;
                GlideExecutor.Builder builder2 = new GlideExecutor.Builder(true);
                builder2.f12535b = 1;
                builder2.f12536c = 1;
                builder2.f = "disk-cache";
                glideBuilder.f12287h = builder2.a();
            }
            if (glideBuilder.f12290n == null) {
                if (GlideExecutor.Z == 0) {
                    GlideExecutor.Z = Math.min(4, Runtime.getRuntime().availableProcessors());
                }
                int i5 = GlideExecutor.Z < 4 ? 1 : 2;
                GlideExecutor.Builder builder3 = new GlideExecutor.Builder(true);
                builder3.f12535b = i5;
                builder3.f12536c = i5;
                builder3.f = "animation";
                glideBuilder.f12290n = builder3.a();
            }
            if (glideBuilder.j == null) {
                glideBuilder.j = new MemorySizeCalculator(new MemorySizeCalculator.Builder(applicationContext));
            }
            if (glideBuilder.k == null) {
                glideBuilder.k = new DefaultConnectivityMonitorFactory();
            }
            if (glideBuilder.d == null) {
                int i6 = glideBuilder.j.f12522a;
                if (i6 > 0) {
                    glideBuilder.d = new LruBitmapPool(i6);
                } else {
                    glideBuilder.d = new BitmapPoolAdapter();
                }
            }
            if (glideBuilder.f12286e == null) {
                glideBuilder.f12286e = new LruArrayPool(glideBuilder.j.d);
            }
            if (glideBuilder.f == null) {
                glideBuilder.f = new LruResourceCache(glideBuilder.j.f12523b);
            }
            if (glideBuilder.f12288i == null) {
                glideBuilder.f12288i = new InternalCacheDiskCacheFactory(applicationContext);
            }
            if (glideBuilder.f12285c == null) {
                glideBuilder.f12285c = new Engine(glideBuilder.f, glideBuilder.f12288i, glideBuilder.f12287h, glideBuilder.g, GlideExecutor.a(), glideBuilder.f12290n);
            }
            List list2 = glideBuilder.o;
            if (list2 == null) {
                glideBuilder.o = Collections.EMPTY_LIST;
            } else {
                glideBuilder.o = Collections.unmodifiableList(list2);
            }
            GlideExperiments.Builder builder4 = glideBuilder.f12284b;
            builder4.getClass();
            GlideExperiments glideExperiments = new GlideExperiments(builder4);
            Glide glide = new Glide(applicationContext, glideBuilder.f12285c, glideBuilder.f, glideBuilder.d, glideBuilder.f12286e, new RequestManagerRetriever(glideExperiments), glideBuilder.k, glideBuilder.f12289l, glideBuilder.m, glideBuilder.f12283a, glideBuilder.o, arrayList, generatedAppGlideModule, glideExperiments);
            applicationContext.registerComponentCallbacks(glide);
            j0 = glide;
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e2);
        }
    }

    public static RequestManager c(Context context) {
        Preconditions.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).f0.b(context);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        Util.a();
        this.f12282Y.a();
        this.X.d();
        this.e0.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        long j;
        Util.a();
        synchronized (this.h0) {
            try {
                Iterator it = this.h0.iterator();
                while (it.hasNext()) {
                    ((RequestManager) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LruResourceCache lruResourceCache = this.f12282Y;
        lruResourceCache.getClass();
        if (i2 >= 40) {
            lruResourceCache.a();
        } else if (i2 >= 20 || i2 == 15) {
            synchronized (lruResourceCache) {
                j = lruResourceCache.f12844b;
            }
            lruResourceCache.g(j / 2);
        }
        this.X.c(i2);
        LruArrayPool lruArrayPool = this.e0;
        synchronized (lruArrayPool) {
            try {
                if (i2 >= 40) {
                    lruArrayPool.a();
                } else if (i2 >= 20 || i2 == 15) {
                    lruArrayPool.c(lruArrayPool.f12491e / 2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
