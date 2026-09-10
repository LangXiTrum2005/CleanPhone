package ads_mobile_sdk;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.libraries.ads.mobile.sdk.initialization.AdapterStatus;
import com.google.common.base.triweekly;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.cord;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.polder;
import p002kotlin.collections.seminary;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.amphitheatre;
import saneness.delouse;
import saneness.hobby;
import saneness.humidify;
import saneness.hyperleucocytosis;
import saneness.laky;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class z51 implements hyperleucocytosis {
    public static final humidify z = new humidify();
    public final Context a;
    public final saran b;
    public final CoroutineContext c;
    public final Set d;
    public final delouse e;
    public final Set f;
    public final ri2 g;
    public final ns h;
    public final v8 i;
    public final loun j;
    public final hobby k;
    public final jk0 l;
    public final amphitheatre m;
    public final delouse n;
    public final x o;
    public final lf2 p;
    public final delouse q;
    public final ll2 r;
    public final Object s;
    public final ArrayList t;
    public j51 u;
    public final cord v;
    public long w;
    public long x;
    public h51 y;

    public z51(Context context, saran backgroundScope, CoroutineContext backgroundContext, Set initializationTasks, delouse dependencyInjectors, Set postInitializationTasks, ri2 rootTraceCreator, ns concurrencyObjects, v8 adapterInitializer, loun traceLogger, hobby httpClient, jk0 flags, amphitheatre clock, delouse debugDialogManager, x activityTracker, lf2 requestConfigurationWrapper, delouse inspectorManager, ll2 sdkCoreDataStore) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(backgroundContext, "backgroundContext");
        Intrinsics.checkNotNullParameter(initializationTasks, "initializationTasks");
        Intrinsics.checkNotNullParameter(dependencyInjectors, "dependencyInjectors");
        Intrinsics.checkNotNullParameter(postInitializationTasks, "postInitializationTasks");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(concurrencyObjects, "concurrencyObjects");
        Intrinsics.checkNotNullParameter(adapterInitializer, "adapterInitializer");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(debugDialogManager, "debugDialogManager");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(requestConfigurationWrapper, "requestConfigurationWrapper");
        Intrinsics.checkNotNullParameter(inspectorManager, "inspectorManager");
        Intrinsics.checkNotNullParameter(sdkCoreDataStore, "sdkCoreDataStore");
        this.a = context;
        this.b = backgroundScope;
        this.c = backgroundContext;
        this.d = initializationTasks;
        this.e = dependencyInjectors;
        this.f = postInitializationTasks;
        this.g = rootTraceCreator;
        this.h = concurrencyObjects;
        this.i = adapterInitializer;
        this.j = traceLogger;
        this.k = httpClient;
        this.l = flags;
        this.m = clock;
        this.n = debugDialogManager;
        this.o = activityTracker;
        this.p = requestConfigurationWrapper;
        this.q = inspectorManager;
        this.r = sdkCoreDataStore;
        this.s = new Object();
        this.t = new ArrayList();
        this.u = j51.INITIALIZATION_NOT_STARTED;
        this.v = JobKt__JobKt.saneness(null, 1, null);
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        this.w = companion.dern();
        this.x = companion.dern();
        this.y = humidify.attabal(z, null, null, 7);
    }

    public final k51 a() {
        long jAdultoid;
        Set<Map.Entry> setEntrySet = this.i.a().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(p002kotlin.ranges.wireman.wireman(polder.marial(dovishness.gintrap(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put((String) entry.getKey(), (AdapterStatus) ((Pair) entry.getValue()).getFirst());
        }
        Map mapStratoscope = seminary.stratoscope(linkedHashMap);
        synchronized (this.s) {
            mapStratoscope.put("com.google.android.libraries.ads.mobile.sdk.MobileAds", this.y);
            Unit unit = Unit.f29295attabal;
        }
        synchronized (this.s) {
            jAdultoid = p002kotlin.time.saneness.adultoid(this.x);
        }
        return new k51((int) jAdultoid, mapStratoscope);
    }

    public final void b() {
        if (this.p.a().competently(this.a)) {
            kn0.a("This RequestConfiguration is configured as a test device.", null, null, 6);
            return;
        }
        triweekly triweeklyVar = kn0.a;
        laky lakyVar = ip0.f;
        kn0.a("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + laky.dern(this.a) + "\")) to get test ads on this device.", null, null, 6);
    }

    public final void c() {
        synchronized (this.s) {
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            this.m.getClass();
            this.x = p002kotlin.time.saneness.merc(p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS), this.w);
            Unit unit = Unit.f29295attabal;
        }
        saran saranVar = this.b;
        v51 block = new v51(this, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019e A[Catch: all -> 0x019f, TryCatch #8 {all -> 0x019f, blocks: (B:93:0x0188, B:95:0x018f, B:97:0x0196, B:99:0x019a, B:101:0x019e, B:104:0x01a2, B:105:0x01a7, B:106:0x01a8, B:107:0x01af, B:108:0x01b0, B:109:0x01b7, B:110:0x01b8), top: B:136:0x0188 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x01a2 A[Catch: all -> 0x019f, TryCatch #8 {all -> 0x019f, blocks: (B:93:0x0188, B:95:0x018f, B:97:0x0196, B:99:0x019a, B:101:0x019e, B:104:0x01a2, B:105:0x01a7, B:106:0x01a8, B:107:0x01af, B:108:0x01b0, B:109:0x01b7, B:110:0x01b8), top: B:136:0x0188 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01a8 A[Catch: all -> 0x019f, TryCatch #8 {all -> 0x019f, blocks: (B:93:0x0188, B:95:0x018f, B:97:0x0196, B:99:0x019a, B:101:0x019e, B:104:0x01a2, B:105:0x01a7, B:106:0x01a8, B:107:0x01af, B:108:0x01b0, B:109:0x01b7, B:110:0x01b8), top: B:136:0x0188 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01b0 A[Catch: all -> 0x019f, TryCatch #8 {all -> 0x019f, blocks: (B:93:0x0188, B:95:0x018f, B:97:0x0196, B:99:0x019a, B:101:0x019e, B:104:0x01a2, B:105:0x01a7, B:106:0x01a8, B:107:0x01af, B:108:0x01b0, B:109:0x01b7, B:110:0x01b8), top: B:136:0x0188 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01b8 A[Catch: all -> 0x019f, TRY_LEAVE, TryCatch #8 {all -> 0x019f, blocks: (B:93:0x0188, B:95:0x018f, B:97:0x0196, B:99:0x019a, B:101:0x019e, B:104:0x01a2, B:105:0x01a7, B:106:0x01a8, B:107:0x01af, B:108:0x01b0, B:109:0x01b7, B:110:0x01b8), top: B:136:0x0188 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0135 A[Catch: all -> 0x0145, TryCatch #3 {all -> 0x0145, blocks: (B:59:0x012e, B:61:0x0135, B:63:0x013c, B:65:0x0140, B:67:0x0144, B:70:0x0148, B:71:0x014d, B:72:0x014e, B:73:0x0155, B:74:0x0156, B:75:0x015d, B:76:0x015e), top: B:127:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:63:0x013c A[Catch: all -> 0x0145, TryCatch #3 {all -> 0x0145, blocks: (B:59:0x012e, B:61:0x0135, B:63:0x013c, B:65:0x0140, B:67:0x0144, B:70:0x0148, B:71:0x014d, B:72:0x014e, B:73:0x0155, B:74:0x0156, B:75:0x015d, B:76:0x015e), top: B:127:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0140 A[Catch: all -> 0x0145, TryCatch #3 {all -> 0x0145, blocks: (B:59:0x012e, B:61:0x0135, B:63:0x013c, B:65:0x0140, B:67:0x0144, B:70:0x0148, B:71:0x014d, B:72:0x014e, B:73:0x0155, B:74:0x0156, B:75:0x015d, B:76:0x015e), top: B:127:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0144 A[Catch: all -> 0x0145, TryCatch #3 {all -> 0x0145, blocks: (B:59:0x012e, B:61:0x0135, B:63:0x013c, B:65:0x0140, B:67:0x0144, B:70:0x0148, B:71:0x014d, B:72:0x014e, B:73:0x0155, B:74:0x0156, B:75:0x015d, B:76:0x015e), top: B:127:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0148 A[Catch: all -> 0x0145, TryCatch #3 {all -> 0x0145, blocks: (B:59:0x012e, B:61:0x0135, B:63:0x013c, B:65:0x0140, B:67:0x0144, B:70:0x0148, B:71:0x014d, B:72:0x014e, B:73:0x0155, B:74:0x0156, B:75:0x015d, B:76:0x015e), top: B:127:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:72:0x014e A[Catch: all -> 0x0145, TryCatch #3 {all -> 0x0145, blocks: (B:59:0x012e, B:61:0x0135, B:63:0x013c, B:65:0x0140, B:67:0x0144, B:70:0x0148, B:71:0x014d, B:72:0x014e, B:73:0x0155, B:74:0x0156, B:75:0x015d, B:76:0x015e), top: B:127:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0156 A[Catch: all -> 0x0145, TryCatch #3 {all -> 0x0145, blocks: (B:59:0x012e, B:61:0x0135, B:63:0x013c, B:65:0x0140, B:67:0x0144, B:70:0x0148, B:71:0x014d, B:72:0x014e, B:73:0x0155, B:74:0x0156, B:75:0x015d, B:76:0x015e), top: B:127:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:76:0x015e A[Catch: all -> 0x0145, TRY_LEAVE, TryCatch #3 {all -> 0x0145, blocks: (B:59:0x012e, B:61:0x0135, B:63:0x013c, B:65:0x0140, B:67:0x0144, B:70:0x0148, B:71:0x014d, B:72:0x014e, B:73:0x0155, B:74:0x0156, B:75:0x015d, B:76:0x015e), top: B:127:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:95:0x018f A[Catch: all -> 0x019f, TryCatch #8 {all -> 0x019f, blocks: (B:93:0x0188, B:95:0x018f, B:97:0x0196, B:99:0x019a, B:101:0x019e, B:104:0x01a2, B:105:0x01a7, B:106:0x01a8, B:107:0x01af, B:108:0x01b0, B:109:0x01b7, B:110:0x01b8), top: B:136:0x0188 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0196 A[Catch: all -> 0x019f, TryCatch #8 {all -> 0x019f, blocks: (B:93:0x0188, B:95:0x018f, B:97:0x0196, B:99:0x019a, B:101:0x019e, B:104:0x01a2, B:105:0x01a7, B:106:0x01a8, B:107:0x01af, B:108:0x01b0, B:109:0x01b7, B:110:0x01b8), top: B:136:0x0188 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x019a A[Catch: all -> 0x019f, TryCatch #8 {all -> 0x019f, blocks: (B:93:0x0188, B:95:0x018f, B:97:0x0196, B:99:0x019a, B:101:0x019e, B:104:0x01a2, B:105:0x01a7, B:106:0x01a8, B:107:0x01af, B:108:0x01b0, B:109:0x01b7, B:110:0x01b8), top: B:136:0x0188 }] */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01c7, code lost:
    
        if (r0.starveling(r3) == r4) goto L117;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(eddy.dern r20, wretchedly.dern r21) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.z51.a(eddy.dern, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Failed to calculate best type for var: r0v42 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v42 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v2 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final java.lang.Object a(wretchedly.dern r24) {
        /*
            Method dump skipped, instruction units count: 1044
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.z51.a(wretchedly.dern):java.lang.Object");
    }

    public final void a(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        saran saranVar = this.b;
        y51 block2 = new y51(this, block, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block2, "block");
        cutely.wireman(saranVar, context, null, new x13(block2, null), 2, null);
    }
}
