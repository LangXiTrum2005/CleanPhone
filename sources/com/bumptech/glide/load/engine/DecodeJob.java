package com.bumptech.glide.load.engine;

import android.os.Build;
import android.os.SystemClock;
import android.support.v4.media.a;
import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class DecodeJob<R> implements DataFetcherGenerator.FetcherReadyCallback, Runnable, Comparable<DecodeJob<?>>, FactoryPools.Poolable {
    public DataSource A0;
    public DataFetcher B0;
    public volatile DataFetcherGenerator C0;
    public volatile boolean D0;
    public volatile boolean E0;
    public boolean F0;
    public final Engine.LazyDiskCacheProvider e0;
    public final Pools.Pool f0;
    public GlideContext i0;
    public Key j0;
    public Priority k0;
    public EngineKey l0;
    public int m0;
    public int n0;
    public DiskCacheStrategy o0;
    public Options p0;
    public EngineJob q0;
    public int r0;
    public Stage s0;
    public RunReason t0;
    public long u0;
    public Object v0;
    public Thread w0;
    public Key x0;
    public Key y0;
    public Object z0;
    public final DecodeHelper X = new DecodeHelper();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ArrayList f12413Y = new ArrayList();
    public final StateVerifier Z = StateVerifier.a();
    public final DeferredEncodeManager g0 = new DeferredEncodeManager();
    public final ReleaseManager h0 = new ReleaseManager();

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.DecodeJob$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f12415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f12416c;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            f12416c = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12416c[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Stage.values().length];
            f12415b = iArr2;
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12415b[2] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12415b[3] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12415b[5] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12415b[0] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[RunReason.values().length];
            f12414a = iArr3;
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12414a[1] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12414a[2] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public interface Callback<R> {
    }

    public final class DecodeCallback<Z> implements DecodePath.DecodeCallback<Z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataSource f12417a;

        public DecodeCallback(DataSource dataSource) {
            this.f12417a = dataSource;
        }

        public final Resource a(Resource resource) {
            Resource resourceA;
            Transformation transformation;
            EncodeStrategy encodeStrategyB;
            boolean z2;
            Key dataCacheKey;
            DecodeJob decodeJob = DecodeJob.this;
            decodeJob.getClass();
            Class<?> cls = resource.get().getClass();
            DataSource dataSource = DataSource.e0;
            DataSource dataSource2 = this.f12417a;
            DecodeHelper decodeHelper = decodeJob.X;
            ResourceEncoder resourceEncoderB = null;
            if (dataSource2 != dataSource) {
                Transformation transformationD = decodeHelper.d(cls);
                transformation = transformationD;
                resourceA = transformationD.a(decodeJob.i0, resource, decodeJob.m0, decodeJob.n0);
            } else {
                resourceA = resource;
                transformation = null;
            }
            if (!resource.equals(resourceA)) {
                resource.a();
            }
            if (decodeHelper.f12406c.a().d.b(resourceA.c()) != null) {
                Registry registryA = decodeHelper.f12406c.a();
                registryA.getClass();
                resourceEncoderB = registryA.d.b(resourceA.c());
                if (resourceEncoderB == null) {
                    throw new Registry.NoResultEncoderAvailableException(resourceA.c());
                }
                encodeStrategyB = resourceEncoderB.b(decodeJob.p0);
            } else {
                encodeStrategyB = EncodeStrategy.Z;
            }
            ResourceEncoder resourceEncoder = resourceEncoderB;
            Key key = decodeJob.x0;
            ArrayList arrayListB = decodeHelper.b();
            int size = arrayListB.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z2 = false;
                    break;
                }
                if (((ModelLoader.LoadData) arrayListB.get(i2)).f12575a.equals(key)) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (!decodeJob.o0.d(!z2, dataSource2, encodeStrategyB)) {
                return resourceA;
            }
            if (resourceEncoder == null) {
                throw new Registry.NoResultEncoderAvailableException(resourceA.get().getClass());
            }
            int iOrdinal = encodeStrategyB.ordinal();
            if (iOrdinal == 0) {
                dataCacheKey = new DataCacheKey(decodeJob.x0, decodeJob.j0);
            } else {
                if (iOrdinal != 1) {
                    throw new IllegalArgumentException("Unknown strategy: " + encodeStrategyB);
                }
                dataCacheKey = new ResourceCacheKey(decodeHelper.f12406c.f12291a, decodeJob.x0, decodeJob.j0, decodeJob.m0, decodeJob.n0, transformation, cls, decodeJob.p0);
            }
            LockedResource lockedResource = (LockedResource) LockedResource.f0.b();
            Preconditions.c(lockedResource, "Argument must not be null");
            lockedResource.e0 = false;
            lockedResource.Z = true;
            lockedResource.f12470Y = resourceA;
            DeferredEncodeManager deferredEncodeManager = decodeJob.g0;
            deferredEncodeManager.f12419a = dataCacheKey;
            deferredEncodeManager.f12420b = resourceEncoder;
            deferredEncodeManager.f12421c = lockedResource;
            return lockedResource;
        }
    }

    public static class DeferredEncodeManager<Z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Key f12419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ResourceEncoder f12420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LockedResource f12421c;
    }

    public interface DiskCacheProvider {
    }

    public static class ReleaseManager {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f12422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f12423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f12424c;

        public final boolean a() {
            return (this.f12424c || this.f12423b) && this.f12422a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RunReason {
        public static final RunReason X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final RunReason f12425Y;
        public static final RunReason Z;
        public static final /* synthetic */ RunReason[] e0;

        static {
            RunReason runReason = new RunReason("INITIALIZE", 0);
            X = runReason;
            RunReason runReason2 = new RunReason("SWITCH_TO_SOURCE_SERVICE", 1);
            f12425Y = runReason2;
            RunReason runReason3 = new RunReason("DECODE_DATA", 2);
            Z = runReason3;
            e0 = new RunReason[]{runReason, runReason2, runReason3};
        }

        public static RunReason valueOf(String str) {
            return (RunReason) Enum.valueOf(RunReason.class, str);
        }

        public static RunReason[] values() {
            return (RunReason[]) e0.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Stage {
        public static final Stage X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final Stage f12426Y;
        public static final Stage Z;
        public static final Stage e0;
        public static final Stage f0;
        public static final Stage g0;
        public static final /* synthetic */ Stage[] h0;

        static {
            Stage stage = new Stage("INITIALIZE", 0);
            X = stage;
            Stage stage2 = new Stage("RESOURCE_CACHE", 1);
            f12426Y = stage2;
            Stage stage3 = new Stage("DATA_CACHE", 2);
            Z = stage3;
            Stage stage4 = new Stage("SOURCE", 3);
            e0 = stage4;
            Stage stage5 = new Stage("ENCODE", 4);
            f0 = stage5;
            Stage stage6 = new Stage("FINISHED", 5);
            g0 = stage6;
            h0 = new Stage[]{stage, stage2, stage3, stage4, stage5, stage6};
        }

        public static Stage valueOf(String str) {
            return (Stage) Enum.valueOf(Stage.class, str);
        }

        public static Stage[] values() {
            return (Stage[]) h0.clone();
        }
    }

    public DecodeJob(Engine.LazyDiskCacheProvider lazyDiskCacheProvider, Pools.Pool pool) {
        this.e0 = lazyDiskCacheProvider;
        this.f0 = pool;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public final void a(Key key, Exception exc, DataFetcher dataFetcher, DataSource dataSource) {
        dataFetcher.b();
        GlideException glideException = new GlideException("Fetching data failed", Collections.singletonList(exc));
        Class clsA = dataFetcher.a();
        glideException.f12464Y = key;
        glideException.Z = dataSource;
        glideException.e0 = clsA;
        this.f12413Y.add(glideException);
        if (Thread.currentThread() == this.w0) {
            n();
            return;
        }
        this.t0 = RunReason.f12425Y;
        EngineJob engineJob = this.q0;
        (engineJob.n0 ? engineJob.j0 : engineJob.i0).execute(this);
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    public final StateVerifier b() {
        return this.Z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(DecodeJob<?> decodeJob) {
        DecodeJob<?> decodeJob2 = decodeJob;
        int iOrdinal = this.k0.ordinal() - decodeJob2.k0.ordinal();
        return iOrdinal == 0 ? this.r0 - decodeJob2.r0 : iOrdinal;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public final void d(Key key, Object obj, DataFetcher dataFetcher, DataSource dataSource, Key key2) {
        this.x0 = key;
        this.z0 = obj;
        this.B0 = dataFetcher;
        this.A0 = dataSource;
        this.y0 = key2;
        this.F0 = key != this.X.a().get(0);
        if (Thread.currentThread() == this.w0) {
            h();
            return;
        }
        this.t0 = RunReason.Z;
        EngineJob engineJob = this.q0;
        (engineJob.n0 ? engineJob.j0 : engineJob.i0).execute(this);
    }

    public final Resource f(DataFetcher dataFetcher, Object obj, DataSource dataSource) {
        if (obj == null) {
            dataFetcher.b();
            return null;
        }
        try {
            int i2 = LogTime.f12842b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            Resource resourceG = g(obj, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                k(jElapsedRealtimeNanos, "Decoded result " + resourceG, null);
            }
            return resourceG;
        } finally {
            dataFetcher.b();
        }
    }

    public final Resource g(Object obj, DataSource dataSource) {
        Class<?> cls = obj.getClass();
        DecodeHelper decodeHelper = this.X;
        LoadPath loadPathC = decodeHelper.c(cls);
        Options options = this.p0;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z2 = dataSource == DataSource.e0 || decodeHelper.r;
            Option option = Downsampler.f12656i;
            Boolean bool = (Boolean) options.c(option);
            if (bool == null || (bool.booleanValue() && !z2)) {
                options = new Options();
                Options options2 = this.p0;
                CachedHashCodeArrayMap cachedHashCodeArrayMap = options.f12369b;
                cachedHashCodeArrayMap.g(options2.f12369b);
                cachedHashCodeArrayMap.put(option, Boolean.valueOf(z2));
            }
        }
        Options options3 = options;
        DataRewinder dataRewinderC = this.i0.a().c(obj);
        try {
            int i2 = this.m0;
            int i3 = this.n0;
            DecodeCallback decodeCallback = new DecodeCallback(dataSource);
            Pools.Pool pool = loadPathC.f12467a;
            Object objB = pool.b();
            Preconditions.c(objB, "Argument must not be null");
            List list = (List) objB;
            try {
                Resource resourceA = loadPathC.a(dataRewinderC, options3, i2, i3, decodeCallback, list);
                pool.a(list);
                dataRewinderC.b();
                return resourceA;
            } catch (Throwable th) {
                pool.a(list);
                throw th;
            }
        } catch (Throwable th2) {
            dataRewinderC.b();
            throw th2;
        }
    }

    public final void h() {
        Resource resourceF;
        boolean zA;
        if (Log.isLoggable("DecodeJob", 2)) {
            k(this.u0, "Retrieved data", "data: " + this.z0 + ", cache key: " + this.x0 + ", fetcher: " + this.B0);
        }
        LockedResource lockedResource = null;
        try {
            resourceF = f(this.B0, this.z0, this.A0);
        } catch (GlideException e2) {
            Key key = this.y0;
            DataSource dataSource = this.A0;
            e2.f12464Y = key;
            e2.Z = dataSource;
            e2.e0 = null;
            this.f12413Y.add(e2);
            resourceF = null;
        }
        if (resourceF == null) {
            n();
            return;
        }
        DataSource dataSource2 = this.A0;
        boolean z2 = this.F0;
        if (resourceF instanceof Initializable) {
            ((Initializable) resourceF).initialize();
        }
        if (this.g0.f12421c != null) {
            lockedResource = (LockedResource) LockedResource.f0.b();
            Preconditions.c(lockedResource, "Argument must not be null");
            lockedResource.e0 = false;
            lockedResource.Z = true;
            lockedResource.f12470Y = resourceF;
            resourceF = lockedResource;
        }
        p();
        EngineJob engineJob = this.q0;
        synchronized (engineJob) {
            engineJob.o0 = resourceF;
            engineJob.p0 = dataSource2;
            engineJob.w0 = z2;
        }
        synchronized (engineJob) {
            try {
                engineJob.f12453Y.b();
                if (engineJob.v0) {
                    engineJob.o0.a();
                    engineJob.f();
                } else {
                    if (engineJob.X.X.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (engineJob.q0) {
                        throw new IllegalStateException("Already have resource");
                    }
                    EngineJob.EngineResourceFactory engineResourceFactory = engineJob.f0;
                    Resource resource = engineJob.o0;
                    boolean z3 = engineJob.m0;
                    Key key2 = engineJob.l0;
                    Engine engine = engineJob.Z;
                    engineResourceFactory.getClass();
                    engineJob.t0 = new EngineResource(resource, z3, true, key2, engine);
                    engineJob.q0 = true;
                    EngineJob.ResourceCallbacksAndExecutors resourceCallbacksAndExecutors = engineJob.X;
                    resourceCallbacksAndExecutors.getClass();
                    ArrayList<EngineJob.ResourceCallbackAndExecutor> arrayList = new ArrayList(resourceCallbacksAndExecutors.X);
                    engineJob.d(arrayList.size() + 1);
                    engineJob.g0.d(engineJob, engineJob.l0, engineJob.t0);
                    for (EngineJob.ResourceCallbackAndExecutor resourceCallbackAndExecutor : arrayList) {
                        resourceCallbackAndExecutor.f12457b.execute(new EngineJob.CallResourceReady(resourceCallbackAndExecutor.f12456a));
                    }
                    engineJob.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.s0 = Stage.f0;
        try {
            DeferredEncodeManager deferredEncodeManager = this.g0;
            if (deferredEncodeManager.f12421c != null) {
                Engine.LazyDiskCacheProvider lazyDiskCacheProvider = this.e0;
                Options options = this.p0;
                deferredEncodeManager.getClass();
                try {
                    lazyDiskCacheProvider.a().a(deferredEncodeManager.f12419a, new DataCacheWriter(deferredEncodeManager.f12420b, deferredEncodeManager.f12421c, options));
                    deferredEncodeManager.f12421c.d();
                } catch (Throwable th2) {
                    deferredEncodeManager.f12421c.d();
                    throw th2;
                }
            }
            if (lockedResource != null) {
                lockedResource.d();
            }
            ReleaseManager releaseManager = this.h0;
            synchronized (releaseManager) {
                releaseManager.f12423b = true;
                zA = releaseManager.a();
            }
            if (zA) {
                m();
            }
        } catch (Throwable th3) {
            if (lockedResource != null) {
                lockedResource.d();
            }
            throw th3;
        }
    }

    public final DataFetcherGenerator i() {
        int iOrdinal = this.s0.ordinal();
        DecodeHelper decodeHelper = this.X;
        if (iOrdinal == 1) {
            return new ResourceCacheGenerator(decodeHelper, this);
        }
        if (iOrdinal == 2) {
            return new DataCacheGenerator(decodeHelper.a(), decodeHelper, this);
        }
        if (iOrdinal == 3) {
            return new SourceGenerator(decodeHelper, this);
        }
        if (iOrdinal == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.s0);
    }

    public final Stage j(Stage stage) {
        int iOrdinal = stage.ordinal();
        if (iOrdinal == 0) {
            boolean zB = this.o0.b();
            Stage stage2 = Stage.f12426Y;
            return zB ? stage2 : j(stage2);
        }
        if (iOrdinal == 1) {
            boolean zA = this.o0.a();
            Stage stage3 = Stage.Z;
            return zA ? stage3 : j(stage3);
        }
        Stage stage4 = Stage.g0;
        if (iOrdinal == 2) {
            return Stage.e0;
        }
        if (iOrdinal == 3 || iOrdinal == 5) {
            return stage4;
        }
        throw new IllegalArgumentException("Unrecognized stage: " + stage);
    }

    public final void k(long j, String str, String str2) {
        StringBuilder sbX = a.x(str, " in ");
        sbX.append(LogTime.a(j));
        sbX.append(", load key: ");
        sbX.append(this.l0);
        sbX.append(str2 != null ? ", ".concat(str2) : "");
        sbX.append(", thread: ");
        sbX.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbX.toString());
    }

    public final void l() {
        boolean zA;
        p();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.f12413Y));
        EngineJob engineJob = this.q0;
        synchronized (engineJob) {
            engineJob.r0 = glideException;
        }
        synchronized (engineJob) {
            try {
                engineJob.f12453Y.b();
                if (engineJob.v0) {
                    engineJob.f();
                } else {
                    if (engineJob.X.X.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (engineJob.s0) {
                        throw new IllegalStateException("Already failed once");
                    }
                    engineJob.s0 = true;
                    Key key = engineJob.l0;
                    EngineJob.ResourceCallbacksAndExecutors resourceCallbacksAndExecutors = engineJob.X;
                    resourceCallbacksAndExecutors.getClass();
                    ArrayList<EngineJob.ResourceCallbackAndExecutor> arrayList = new ArrayList(resourceCallbacksAndExecutors.X);
                    engineJob.d(arrayList.size() + 1);
                    engineJob.g0.d(engineJob, key, null);
                    for (EngineJob.ResourceCallbackAndExecutor resourceCallbackAndExecutor : arrayList) {
                        resourceCallbackAndExecutor.f12457b.execute(new EngineJob.CallLoadFailed(resourceCallbackAndExecutor.f12456a));
                    }
                    engineJob.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ReleaseManager releaseManager = this.h0;
        synchronized (releaseManager) {
            releaseManager.f12424c = true;
            zA = releaseManager.a();
        }
        if (zA) {
            m();
        }
    }

    public final void m() {
        ReleaseManager releaseManager = this.h0;
        synchronized (releaseManager) {
            releaseManager.f12423b = false;
            releaseManager.f12422a = false;
            releaseManager.f12424c = false;
        }
        DeferredEncodeManager deferredEncodeManager = this.g0;
        deferredEncodeManager.f12419a = null;
        deferredEncodeManager.f12420b = null;
        deferredEncodeManager.f12421c = null;
        DecodeHelper decodeHelper = this.X;
        decodeHelper.f12406c = null;
        decodeHelper.d = null;
        decodeHelper.f12411n = null;
        decodeHelper.g = null;
        decodeHelper.k = null;
        decodeHelper.f12409i = null;
        decodeHelper.o = null;
        decodeHelper.j = null;
        decodeHelper.f12412p = null;
        decodeHelper.f12404a.clear();
        decodeHelper.f12410l = false;
        decodeHelper.f12405b.clear();
        decodeHelper.m = false;
        this.D0 = false;
        this.i0 = null;
        this.j0 = null;
        this.p0 = null;
        this.k0 = null;
        this.l0 = null;
        this.q0 = null;
        this.s0 = null;
        this.C0 = null;
        this.w0 = null;
        this.x0 = null;
        this.z0 = null;
        this.A0 = null;
        this.B0 = null;
        this.u0 = 0L;
        this.E0 = false;
        this.v0 = null;
        this.f12413Y.clear();
        this.f0.a(this);
    }

    public final void n() {
        this.w0 = Thread.currentThread();
        int i2 = LogTime.f12842b;
        this.u0 = SystemClock.elapsedRealtimeNanos();
        boolean zB = false;
        while (!this.E0 && this.C0 != null && !(zB = this.C0.b())) {
            this.s0 = j(this.s0);
            this.C0 = i();
            if (this.s0 == Stage.e0) {
                this.t0 = RunReason.f12425Y;
                EngineJob engineJob = this.q0;
                (engineJob.n0 ? engineJob.j0 : engineJob.i0).execute(this);
                return;
            }
        }
        if ((this.s0 == Stage.g0 || this.E0) && !zB) {
            l();
        }
    }

    public final void o() {
        int iOrdinal = this.t0.ordinal();
        if (iOrdinal == 0) {
            this.s0 = j(Stage.X);
            this.C0 = i();
            n();
        } else if (iOrdinal == 1) {
            n();
        } else if (iOrdinal == 2) {
            h();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.t0);
        }
    }

    public final void p() {
        this.Z.b();
        if (this.D0) {
            throw new IllegalStateException("Already notified", this.f12413Y.isEmpty() ? null : (Throwable) a.d(1, this.f12413Y));
        }
        this.D0 = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DataFetcher dataFetcher = this.B0;
        try {
            try {
                try {
                    if (this.E0) {
                        l();
                        if (dataFetcher != null) {
                            dataFetcher.b();
                            return;
                        }
                        return;
                    }
                    o();
                    if (dataFetcher != null) {
                        dataFetcher.b();
                    }
                } catch (CallbackException e2) {
                    throw e2;
                }
            } catch (Throwable th) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.E0 + ", stage: " + this.s0, th);
                }
                if (this.s0 != Stage.f0) {
                    this.f12413Y.add(th);
                    l();
                }
                if (!this.E0) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (dataFetcher != null) {
                dataFetcher.b();
            }
            throw th2;
        }
    }
}
