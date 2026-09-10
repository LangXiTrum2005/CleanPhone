package com.bumptech.glide;

import a7.p;
import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import cc.a2;
import com.google.android.gms.internal.ads.dm0;
import com.google.android.gms.internal.ads.t0;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import ea.a0;
import g6.m;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import t6.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile b f10455i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile boolean f10456j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f10457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h6.a f10458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i6.e f10459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f10460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dm0 f10461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t6.i f10462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ne.c f10463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f10464h = new ArrayList();

    public b(Context context, m mVar, i6.e eVar, h6.a aVar, dm0 dm0Var, t6.i iVar, ne.c cVar, fd.b bVar, x.e eVar2, List list, ArrayList arrayList, a2 a2Var, od.c cVar2) {
        this.f10457a = mVar;
        this.f10458b = aVar;
        this.f10461e = dm0Var;
        this.f10459c = eVar;
        this.f10462f = iVar;
        this.f10463g = cVar;
        this.f10460d = new e(context, dm0Var, new l(this, arrayList, a2Var), bVar, eVar2, list, mVar, cVar2);
    }

    public static b a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f10455i == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (InstantiationException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e13);
            }
            synchronized (b.class) {
                if (f10455i == null) {
                    if (f10456j) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f10456j = true;
                    try {
                        b(context, generatedAppGlideModule);
                        f10456j = false;
                    } catch (Throwable th2) {
                        f10456j = false;
                        throw th2;
                    }
                }
            }
        }
        return f10455i;
    }

    public static void b(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        x.e eVar = new x.e(0);
        ni.f fVar = new ni.f(1);
        fd.b bVar = new fd.b(7);
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
                        c.A(str);
                        throw null;
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
        } catch (PackageManager.NameNotFoundException e10) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e10);
            }
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            new HashSet();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw f2.j(it);
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                throw f2.j(it2);
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            throw f2.j(it3);
        }
        j6.b bVar2 = new j6.b();
        if (j6.e.f43723c == 0) {
            j6.e.f43723c = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i10 = j6.e.f43723c;
        if (TextUtils.isEmpty("source")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        j6.e eVar2 = new j6.e(new ThreadPoolExecutor(i10, i10, 0L, timeUnit, new PriorityBlockingQueue(), new j6.c(bVar2, "source", false)));
        j6.b bVar3 = new j6.b();
        if (TextUtils.isEmpty("disk-cache")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
        }
        j6.e eVar3 = new j6.e(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new j6.c(bVar3, "disk-cache", true)));
        if (j6.e.f43723c == 0) {
            j6.e.f43723c = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i11 = j6.e.f43723c >= 4 ? 2 : 1;
        j6.b bVar4 = new j6.b();
        if (TextUtils.isEmpty("animation")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
        }
        j6.e eVar4 = new j6.e(new ThreadPoolExecutor(i11, i11, 0L, timeUnit, new PriorityBlockingQueue(), new j6.c(bVar4, "animation", true)));
        i6.f fVar2 = new i6.f(applicationContext);
        t0 t0Var = new t0();
        Context context2 = (Context) fVar2.f42899b;
        float f10 = fVar2.f42898a;
        ActivityManager activityManager = (ActivityManager) fVar2.f42900c;
        int i12 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        t0Var.f20105c = i12;
        int iRound = Math.round(activityManager.getMemoryClass() * ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) ((am.e) fVar2.f42901d).f3698b;
        float f11 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(f11 * f10);
        int iRound3 = Math.round(f11 * 2.0f);
        int i13 = iRound - i12;
        int i14 = iRound3 + iRound2;
        if (i14 <= i13) {
            t0Var.f20104b = iRound3;
            t0Var.f20103a = iRound2;
        } else {
            float f12 = i13 / (f10 + 2.0f);
            t0Var.f20104b = Math.round(2.0f * f12);
            t0Var.f20103a = Math.round(f12 * f10);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb2.append(Formatter.formatFileSize(context2, t0Var.f20104b));
            sb2.append(", pool size: ");
            sb2.append(Formatter.formatFileSize(context2, t0Var.f20103a));
            sb2.append(", byte array size: ");
            sb2.append(Formatter.formatFileSize(context2, i12));
            sb2.append(", memory class limited? ");
            sb2.append(i14 > iRound);
            sb2.append(", max size: ");
            sb2.append(Formatter.formatFileSize(context2, iRound));
            sb2.append(", memoryClass: ");
            sb2.append(activityManager.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb2.toString());
        }
        ne.c cVar = new ne.c(15);
        int i15 = t0Var.f20103a;
        h6.a fVar3 = i15 > 0 ? new h6.f(i15) : new a0(21);
        dm0 dm0Var = new dm0(t0Var.f20105c);
        i6.e eVar5 = new i6.e(t0Var.f20104b);
        b bVar5 = new b(applicationContext, new m(eVar5, new n5.f(applicationContext), eVar3, eVar2, new j6.e(new ThreadPoolExecutor(0, Integer.MAX_VALUE, j6.e.f43722b, timeUnit, new SynchronousQueue(), new j6.c(new j6.b(), "source-unlimited", false))), eVar4), eVar5, fVar3, dm0Var, new t6.i(), cVar, bVar, eVar, Collections.EMPTY_LIST, arrayList, generatedAppGlideModule, new od.c(fVar));
        applicationContext.registerComponentCallbacks(bVar5);
        f10455i = bVar5;
    }

    public static k c(Context context) {
        a7.h.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).f10462f.b(context);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        p.a();
        this.f10459c.f(0L);
        this.f10458b.k();
        dm0 dm0Var = this.f10461e;
        synchronized (dm0Var) {
            dm0Var.c(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        long j10;
        p.a();
        synchronized (this.f10464h) {
            try {
                Iterator it = this.f10464h.iterator();
                while (it.hasNext()) {
                    ((k) it.next()).getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i6.e eVar = this.f10459c;
        eVar.getClass();
        if (i10 >= 40) {
            eVar.f(0L);
        } else if (i10 >= 20 || i10 == 15) {
            synchronized (eVar) {
                j10 = eVar.f3435a;
            }
            eVar.f(j10 / 2);
        }
        this.f10458b.e(i10);
        dm0 dm0Var = this.f10461e;
        synchronized (dm0Var) {
            try {
                if (i10 >= 40) {
                    synchronized (dm0Var) {
                        dm0Var.c(0);
                    }
                } else if (i10 >= 20 || i10 == 15) {
                    dm0Var.c(dm0Var.f13583a / 2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
