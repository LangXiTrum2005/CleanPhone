package com.chartboost.sdk.impl;

import android.content.Context;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheEvictor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final si f14154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f14155c;
    public final Function4 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function2 f14156e;
    public final DefaultHttpDataSource.Factory f;
    public final Function5 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Function1 f14157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Function0 f14158i;
    public final Function1 j;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14159b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n7 invoke(Context c2) {
            Intrinsics.f(c2, "c");
            return new n7(c2, null, null, null, 14, null);
        }
    }

    public static final class b extends Lambda implements Function4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f14160b = new b();

        public b() {
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Cache invoke(m7 fc, si vcp, DatabaseProvider dp, t3.b c2) {
            Intrinsics.f(fc, "fc");
            Intrinsics.f(vcp, "vcp");
            Intrinsics.f(dp, "dp");
            Intrinsics.f(c2, "c");
            return w5.a(fc, dp, vcp, c2, (CacheEvictor) null, 16, (Object) null);
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f14161b = new c();

        public c() {
            super(2, w5.class, "cacheDataSourceFactory", "cacheDataSourceFactory(Lcom/google/android/exoplayer2/upstream/cache/Cache;Lcom/google/android/exoplayer2/upstream/HttpDataSource$Factory;)Lcom/google/android/exoplayer2/upstream/cache/CacheDataSource$Factory;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CacheDataSource.Factory invoke(Cache p0, HttpDataSource.Factory p1) {
            Intrinsics.f(p0, "p0");
            Intrinsics.f(p1, "p1");
            return w5.a(p0, p1);
        }
    }

    public static final class d extends Lambda implements Function5 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f14162b = new d();

        public d() {
            super(5);
        }

        @Override // kotlin.jvm.functions.Function5
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DownloadManager invoke(Context c2, DatabaseProvider dp, Cache ca, HttpDataSource.Factory hf, DownloadManager.Listener l2) {
            Intrinsics.f(c2, "c");
            Intrinsics.f(dp, "dp");
            Intrinsics.f(ca, "ca");
            Intrinsics.f(hf, "hf");
            Intrinsics.f(l2, "l");
            return w5.a(c2, dp, ca, hf, l2, 0, 0, 96, null);
        }
    }

    public /* synthetic */ class e extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f14163b = new e();

        public e() {
            super(1, w5.class, "databaseProvider", "databaseProvider(Landroid/content/Context;)Lcom/google/android/exoplayer2/database/DatabaseProvider;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DatabaseProvider invoke(Context p0) {
            Intrinsics.f(p0, "p0");
            return w5.a(p0);
        }
    }

    public /* synthetic */ class f extends FunctionReferenceImpl implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f14164b = new f();

        public f() {
            super(0, w5.class, "setCookieHandler", "setCookieHandler()V", 1);
        }

        public final void a() {
            w5.a();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class g extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f14165b = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z7 invoke(m7 fc) {
            Intrinsics.f(fc, "fc");
            return new z7(fc);
        }
    }

    public i7(Context context, si videoCachePolicy, Function1 fileCachingFactory, Function4 cacheFactory, Function2 cacheDataSourceFactoryFactory, DefaultHttpDataSource.Factory httpDataSourceFactory, Function5 downloadManagerFactory, Function1 databaseProviderFactory, Function0 setCookieHandler, Function1 fakePrecacheFilesManagerFactory) {
        Intrinsics.f(context, "context");
        Intrinsics.f(videoCachePolicy, "videoCachePolicy");
        Intrinsics.f(fileCachingFactory, "fileCachingFactory");
        Intrinsics.f(cacheFactory, "cacheFactory");
        Intrinsics.f(cacheDataSourceFactoryFactory, "cacheDataSourceFactoryFactory");
        Intrinsics.f(httpDataSourceFactory, "httpDataSourceFactory");
        Intrinsics.f(downloadManagerFactory, "downloadManagerFactory");
        Intrinsics.f(databaseProviderFactory, "databaseProviderFactory");
        Intrinsics.f(setCookieHandler, "setCookieHandler");
        Intrinsics.f(fakePrecacheFilesManagerFactory, "fakePrecacheFilesManagerFactory");
        this.f14153a = context;
        this.f14154b = videoCachePolicy;
        this.f14155c = fileCachingFactory;
        this.d = cacheFactory;
        this.f14156e = cacheDataSourceFactoryFactory;
        this.f = httpDataSourceFactory;
        this.g = downloadManagerFactory;
        this.f14157h = databaseProviderFactory;
        this.f14158i = setCookieHandler;
        this.j = fakePrecacheFilesManagerFactory;
    }

    public final Function2 a() {
        return this.f14156e;
    }

    public final Function4 b() {
        return this.d;
    }

    public final Context c() {
        return this.f14153a;
    }

    public final Function1 d() {
        return this.f14157h;
    }

    public final Function5 e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7)) {
            return false;
        }
        i7 i7Var = (i7) obj;
        return Intrinsics.a(this.f14153a, i7Var.f14153a) && Intrinsics.a(this.f14154b, i7Var.f14154b) && Intrinsics.a(this.f14155c, i7Var.f14155c) && Intrinsics.a(this.d, i7Var.d) && Intrinsics.a(this.f14156e, i7Var.f14156e) && Intrinsics.a(this.f, i7Var.f) && Intrinsics.a(this.g, i7Var.g) && Intrinsics.a(this.f14157h, i7Var.f14157h) && Intrinsics.a(this.f14158i, i7Var.f14158i) && Intrinsics.a(this.j, i7Var.j);
    }

    public final Function1 f() {
        return this.j;
    }

    public final Function1 g() {
        return this.f14155c;
    }

    public final DefaultHttpDataSource.Factory h() {
        return this.f;
    }

    public int hashCode() {
        return this.j.hashCode() + ((this.f14158i.hashCode() + ((this.f14157h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.f14156e.hashCode() + ((this.d.hashCode() + ((this.f14155c.hashCode() + ((this.f14154b.hashCode() + (this.f14153a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final Function0 i() {
        return this.f14158i;
    }

    public final si j() {
        return this.f14154b;
    }

    public String toString() {
        return "ExoPlayerDownloadManagerDependencies(context=" + this.f14153a + ", videoCachePolicy=" + this.f14154b + ", fileCachingFactory=" + this.f14155c + ", cacheFactory=" + this.d + ", cacheDataSourceFactoryFactory=" + this.f14156e + ", httpDataSourceFactory=" + this.f + ", downloadManagerFactory=" + this.g + ", databaseProviderFactory=" + this.f14157h + ", setCookieHandler=" + this.f14158i + ", fakePrecacheFilesManagerFactory=" + this.j + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ i7(Context context, si siVar, Function1 function1, Function4 function4, Function2 function2, DefaultHttpDataSource.Factory factory, Function5 function5, Function1 function3, Function0 function0, Function1 function6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            context = w3.f15454b.d().getContext().getApplicationContext();
            Intrinsics.e(context, "getApplicationContext(...)");
        }
        this(context, (i2 & 2) != 0 ? w3.f15454b.a().r() : siVar, (i2 & 4) != 0 ? a.f14159b : function1, (i2 & 8) != 0 ? b.f14160b : function4, (i2 & 16) != 0 ? c.f14161b : function2, (i2 & 32) != 0 ? new DefaultHttpDataSource.Factory() : factory, (i2 & 64) != 0 ? d.f14162b : function5, (i2 & 128) != 0 ? e.f14163b : function3, (i2 & 256) != 0 ? f.f14164b : function0, (i2 & 512) != 0 ? g.f14165b : function6);
    }
}
