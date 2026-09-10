package ads_mobile_sdk;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.libraries.ads.mobile.sdk.initialization.AdapterStatus;
import com.ironsource.X3;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.cord;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.sakeen;
import kotlinx.coroutines.saran;
import kotlinx.coroutines.walach;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.amphitheatre;
import saneness.conclusively;
import saneness.evenfall;
import saneness.hyperleucocytosis;
import saneness.laky;
import saneness.metairie;
import saneness.naming;
import saneness.plo;
import saneness.spartacist;
import svd.AdapterVersionData;

/* JADX INFO: loaded from: classes.dex */
public final class v8 {
    public static final List o = adultoid.kowloon("com.google.ads.mediation.admob.AdMobAdapter", "com.google.ads.mediation.admob.AdMobCustomTabsAdapter");
    public final saran a;
    public final CoroutineContext b;
    public final Context c;
    public final naming d;
    public final plo e;
    public final x f;
    public final ug g;
    public final amphitheatre h;
    public final jk0 i;
    public final ri2 j;
    public final eddy.attabal k;
    public hyperleucocytosis l;
    public boolean m;
    public final LinkedHashMap n;

    public v8(saran backgroundScope, CoroutineContext uiContext, Context applicationContext, naming mediationAdapterProxyFactory, plo adapterStatusMapUpdater, x activityTracker, ug appState, amphitheatre clock, jk0 flags, ri2 rootTraceCreator, eddy.attabal initializationConfig) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(mediationAdapterProxyFactory, "mediationAdapterProxyFactory");
        Intrinsics.checkNotNullParameter(adapterStatusMapUpdater, "adapterStatusMapUpdater");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(appState, "appState");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(initializationConfig, "initializationConfig");
        this.a = backgroundScope;
        this.b = uiContext;
        this.c = applicationContext;
        this.d = mediationAdapterProxyFactory;
        this.e = adapterStatusMapUpdater;
        this.f = activityTracker;
        this.g = appState;
        this.h = clock;
        this.i = flags;
        this.j = rootTraceCreator;
        this.k = initializationConfig;
        this.n = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x015f A[Catch: all -> 0x016f, TryCatch #4 {all -> 0x016f, blocks: (B:47:0x0158, B:49:0x015f, B:51:0x0166, B:53:0x016a, B:55:0x016e, B:58:0x0172, B:59:0x0177, B:60:0x0178, B:61:0x017f, B:62:0x0180, B:63:0x0187, B:64:0x0188), top: B:76:0x0158 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0166 A[Catch: all -> 0x016f, TryCatch #4 {all -> 0x016f, blocks: (B:47:0x0158, B:49:0x015f, B:51:0x0166, B:53:0x016a, B:55:0x016e, B:58:0x0172, B:59:0x0177, B:60:0x0178, B:61:0x017f, B:62:0x0180, B:63:0x0187, B:64:0x0188), top: B:76:0x0158 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x016a A[Catch: all -> 0x016f, TryCatch #4 {all -> 0x016f, blocks: (B:47:0x0158, B:49:0x015f, B:51:0x0166, B:53:0x016a, B:55:0x016e, B:58:0x0172, B:59:0x0177, B:60:0x0178, B:61:0x017f, B:62:0x0180, B:63:0x0187, B:64:0x0188), top: B:76:0x0158 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x016e A[Catch: all -> 0x016f, TryCatch #4 {all -> 0x016f, blocks: (B:47:0x0158, B:49:0x015f, B:51:0x0166, B:53:0x016a, B:55:0x016e, B:58:0x0172, B:59:0x0177, B:60:0x0178, B:61:0x017f, B:62:0x0180, B:63:0x0187, B:64:0x0188), top: B:76:0x0158 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0172 A[Catch: all -> 0x016f, TryCatch #4 {all -> 0x016f, blocks: (B:47:0x0158, B:49:0x015f, B:51:0x0166, B:53:0x016a, B:55:0x016e, B:58:0x0172, B:59:0x0177, B:60:0x0178, B:61:0x017f, B:62:0x0180, B:63:0x0187, B:64:0x0188), top: B:76:0x0158 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0178 A[Catch: all -> 0x016f, TryCatch #4 {all -> 0x016f, blocks: (B:47:0x0158, B:49:0x015f, B:51:0x0166, B:53:0x016a, B:55:0x016e, B:58:0x0172, B:59:0x0177, B:60:0x0178, B:61:0x017f, B:62:0x0180, B:63:0x0187, B:64:0x0188), top: B:76:0x0158 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0180 A[Catch: all -> 0x016f, TryCatch #4 {all -> 0x016f, blocks: (B:47:0x0158, B:49:0x015f, B:51:0x0166, B:53:0x016a, B:55:0x016e, B:58:0x0172, B:59:0x0177, B:60:0x0178, B:61:0x017f, B:62:0x0180, B:63:0x0187, B:64:0x0188), top: B:76:0x0158 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0188 A[Catch: all -> 0x016f, TRY_LEAVE, TryCatch #4 {all -> 0x016f, blocks: (B:47:0x0158, B:49:0x015f, B:51:0x0166, B:53:0x016a, B:55:0x016e, B:58:0x0172, B:59:0x0177, B:60:0x0178, B:61:0x017f, B:62:0x0180, B:63:0x0187, B:64:0x0188), top: B:76:0x0158 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public static final Object a(v8 v8Var, String str, j8 j8Var, wretchedly.dern dernVar) {
        o8 o8Var;
        w03 w03Var;
        w03 w03Var2;
        v8 v8Var2;
        String adapterName;
        v8Var.getClass();
        if (dernVar instanceof o8) {
            o8Var = (o8) dernVar;
            int i = o8Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                o8Var.g = i - Integer.MIN_VALUE;
            } else {
                o8Var = new o8(v8Var, dernVar);
            }
        } else {
            o8Var = new o8(v8Var, dernVar);
        }
        Object obj = o8Var.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = o8Var.g;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            no0 no0Var = no0.CUI_NAME_SDKINIT_ADAPTERINIT;
            WeakHashMap weakHashMap = j13.a;
            w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
            try {
                j13.a().a.c.d = str;
                saran saranVar = v8Var.a;
                cord context = sakeen.saneness(null, 1, null);
                q8 block = new q8(v8Var, str, j8Var, null);
                Intrinsics.checkNotNullParameter(saranVar, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(block, "block");
                walach walachVarSaneness = cutely.saneness(saranVar, context, null, new w13(block, null), 2, null);
                laky lakyVar = ip0.f;
                jk0 jk0Var = v8Var.i;
                jk0Var.getClass();
                p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
                long jMolybdenite = p002kotlin.time.dern.molybdenite(30, DurationUnit.SECONDS);
                Intrinsics.checkNotNullParameter("gads:adapter_initialization:timeout", X3.i.W);
                long rawValue = ((p002kotlin.time.saneness) jk0Var.a("gads:adapter_initialization:timeout", p002kotlin.time.saneness.cutely(jMolybdenite), zk.l)).getRawValue();
                p8 p8Var = new p8(walachVarSaneness, null);
                o8Var.a = v8Var;
                o8Var.b = str;
                o8Var.c = w03VarA;
                o8Var.d = w03VarA;
                o8Var.g = 1;
                Object objSaneness = lakyVar.saneness(rawValue, p8Var, o8Var);
                if (objSaneness == objBeachfront) {
                    return objBeachfront;
                }
                w03Var2 = w03VarA;
                obj = objSaneness;
                v8Var2 = v8Var;
                adapterName = str;
                w03Var = w03Var2;
            } catch (Throwable th) {
                th = th;
                w03Var = w03VarA;
                w03Var2 = w03Var;
                w03Var2.b(th);
                if (!(th instanceof evenfall)) {
                    throw th;
                }
                w03Var2.a(th);
                if (!(th instanceof TimeoutCancellationException)) {
                    throw new cp0(th);
                }
                if (!(th instanceof CancellationException)) {
                    throw new bn0(th);
                }
                if (th instanceof yn0) {
                    throw th;
                }
                throw new gn0(th);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w03Var = o8Var.d;
            w03Var2 = o8Var.c;
            adapterName = o8Var.b;
            v8Var2 = o8Var.a;
            try {
                p002kotlin.dern.saneness(obj);
            } catch (Throwable th2) {
                th = th2;
                try {
                    w03Var2.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03Var2.a(th);
                    if (!(th instanceof TimeoutCancellationException)) {
                        throw new cp0(th);
                    }
                    if (!(th instanceof CancellationException)) {
                        throw new bn0(th);
                    }
                    if (th instanceof yn0) {
                        throw th;
                    }
                    throw new gn0(th);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        interaction.saneness.attabal(w03Var, th3);
                        throw th4;
                    }
                }
            }
        }
        spartacist spartacistVar = (spartacist) obj;
        if (spartacistVar instanceof nn0) {
            y13.a((nn0) spartacistVar, false);
        }
        if (spartacistVar instanceof un0) {
            synchronized (v8Var2) {
                try {
                    Pair pair = (Pair) v8Var2.n.get(adapterName);
                    AdapterVersionData adapterVersionData = pair != null ? (AdapterVersionData) pair.getSecond() : null;
                    plo ploVar = v8Var2.e;
                    LinkedHashMap adapterStatusMap = v8Var2.n;
                    AdapterStatus.InitializationState initializationState = AdapterStatus.InitializationState.TIMED_OUT;
                    jk0 jk0Var2 = v8Var2.i;
                    jk0Var2.getClass();
                    p002kotlin.time.saneness.Companion companion2 = p002kotlin.time.saneness.INSTANCE;
                    long jMolybdenite2 = p002kotlin.time.dern.molybdenite(30, DurationUnit.SECONDS);
                    Intrinsics.checkNotNullParameter("gads:adapter_initialization:timeout", X3.i.W);
                    n8 adapterStatus = new n8(initializationState, "Timeout.", (int) p002kotlin.time.saneness.adultoid(((p002kotlin.time.saneness) jk0Var2.a("gads:adapter_initialization:timeout", p002kotlin.time.saneness.cutely(jMolybdenite2), zk.l)).getRawValue()));
                    ploVar.getClass();
                    Intrinsics.checkNotNullParameter(adapterStatusMap, "adapterStatusMap");
                    Intrinsics.checkNotNullParameter(adapterName, "adapterName");
                    Intrinsics.checkNotNullParameter(adapterStatus, "adapterStatus");
                    adapterStatusMap.put(adapterName, new Pair(adapterStatus, adapterVersionData));
                    Unit unit = Unit.f29295attabal;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }
        if (spartacistVar instanceof nn0) {
            y13.a((nn0) spartacistVar, false);
        }
        interaction.saneness.attabal(w03Var, null);
        return spartacistVar;
    }

    public final Map a() {
        Map mapMathsort;
        synchronized (this) {
            mapMathsort = hereditist.wireman.mathsort(this.n);
        }
        return mapMathsort;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b9 A[Catch: all -> 0x0055, LOOP:0: B:99:0x01b3->B:101:0x01b9, LOOP_END, TryCatch #3 {all -> 0x0055, blocks: (B:22:0x0050, B:98:0x0199, B:99:0x01b3, B:101:0x01b9, B:102:0x01d3), top: B:148:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f9 A[Catch: all -> 0x003f, TryCatch #11 {all -> 0x003f, blocks: (B:15:0x0039, B:109:0x01ee, B:111:0x01f3, B:112:0x01f4, B:116:0x01ff, B:115:0x01f9, B:120:0x0209, B:121:0x020a, B:110:0x01ef), top: B:163:0x0039, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x01ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e8 A[Catch: all -> 0x0073, LOOP:1: B:46:0x00e2->B:48:0x00e8, LOOP_END, TryCatch #2 {all -> 0x0073, blocks: (B:32:0x006f, B:45:0x00c8, B:46:0x00e2, B:48:0x00e8, B:49:0x0102), top: B:146:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0112  */
    /* JADX WARN: Code duplicated, block: B:61:0x0128  */
    /* JADX WARN: Code duplicated, block: B:62:0x0129 A[Catch: all -> 0x0066, TryCatch #6 {all -> 0x0066, blocks: (B:27:0x0060, B:56:0x011e, B:58:0x0123, B:59:0x0124, B:63:0x012f, B:62:0x0129, B:67:0x0139, B:68:0x013a, B:57:0x011f), top: B:154:0x0060, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v33, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r4v35, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static Object a(v8 v8Var, wretchedly.dern dernVar) {
        r8 r8Var;
        Closeable closeable;
        ?? r4;
        ?? r5;
        w03 w03Var;
        Closeable closeable2;
        Closeable closeable3;
        ?? r6;
        ?? r7;
        w03 w03Var2;
        Closeable closeable4;
        ArrayList arrayList;
        Iterator it;
        v8 v8Var2;
        hyperleucocytosis hyperleucocytosisVar;
        ArrayList arrayList2;
        Iterator it2;
        v8 v8Var3;
        hyperleucocytosis hyperleucocytosisVar2;
        v8 v8Var4 = v8Var;
        if (dernVar instanceof r8) {
            r8Var = (r8) dernVar;
            int i = r8Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                r8Var.f = i - Integer.MIN_VALUE;
            } else {
                r8Var = new r8(v8Var4, dernVar);
            }
        } else {
            r8Var = new r8(v8Var4, dernVar);
        }
        Object obj = r8Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = r8Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            ri2 ri2Var = v8Var4.j;
            no0 no0Var = no0.CUI_NAME_SDKINIT_ADAPTERINIT;
            List listFormularize = adultoid.formularize();
            l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
            if (j13.b().a == null) {
                v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                try {
                    if (!v8Var4.k.getMediationAdapterInitializationDisabled()) {
                        ug ugVar = v8Var4.g;
                        r8Var.a = v8Var4;
                        r8Var.b = v62VarA;
                        r8Var.c = v62VarA;
                        r8Var.f = 1;
                        ugVar.getClass();
                        Object objA = ug.a(ugVar, r8Var);
                        if (objA != objBeachfront) {
                            w03Var2 = v62VarA;
                            obj = objA;
                            closeable4 = w03Var2;
                            Map mapS = ((vf) obj).s();
                            Intrinsics.beachfront(mapS);
                            arrayList = new ArrayList(mapS.size());
                            it = mapS.entrySet().iterator();
                            while (it.hasNext()) {
                                arrayList.add(cutely.wireman(v8Var4.a, null, null, new s8(v8Var4, (Map.Entry) it.next(), null), 3, null));
                            }
                            r8Var.a = v8Var4;
                            r8Var.b = w03Var2;
                            r8Var.c = closeable4;
                            r8Var.f = 2;
                            if (AwaitKt.dern(arrayList, r8Var) != objBeachfront) {
                                v8Var2 = v8Var4;
                                closeable3 = closeable4;
                                r6 = w03Var2;
                                synchronized (v8Var2) {
                                    v8Var2.m = true;
                                    Unit unit = Unit.f29295attabal;
                                    hyperleucocytosisVar = v8Var2.l;
                                    if (hyperleucocytosisVar != null) {
                                        Intrinsics.preprohormone("adapterListener");
                                        hyperleucocytosisVar = null;
                                    }
                                    ((z51) hyperleucocytosisVar).c();
                                    interaction.saneness.attabal(closeable3, null);
                                    return unit;
                                }
                            }
                        }
                    } else {
                        closeable3 = v62VarA;
                        r7 = closeable3;
                        v8Var2 = v8Var4;
                        r6 = r7;
                        synchronized (v8Var2) {
                            v8Var2.m = true;
                            Unit unit2 = Unit.f29295attabal;
                            hyperleucocytosisVar = v8Var2.l;
                            if (hyperleucocytosisVar != null) {
                                Intrinsics.preprohormone("adapterListener");
                                hyperleucocytosisVar = null;
                            }
                            ((z51) hyperleucocytosisVar).c();
                            interaction.saneness.attabal(closeable3, null);
                            return unit2;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    closeable3 = v62VarA;
                    r6 = closeable3;
                }
            } else {
                w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
                try {
                    if (!v8Var4.k.getMediationAdapterInitializationDisabled()) {
                        ug ugVar2 = v8Var4.g;
                        r8Var.a = v8Var4;
                        r8Var.b = w03VarA;
                        r8Var.c = w03VarA;
                        r8Var.f = 3;
                        ugVar2.getClass();
                        Object objA2 = ug.a(ugVar2, r8Var);
                        if (objA2 != objBeachfront) {
                            w03Var = w03VarA;
                            obj = objA2;
                            closeable2 = w03Var;
                            Map mapS2 = ((vf) obj).s();
                            Intrinsics.beachfront(mapS2);
                            arrayList2 = new ArrayList(mapS2.size());
                            it2 = mapS2.entrySet().iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(cutely.wireman(v8Var4.a, null, null, new s8(v8Var4, (Map.Entry) it2.next(), null), 3, null));
                            }
                            r8Var.a = v8Var4;
                            r8Var.b = w03Var;
                            r8Var.c = closeable2;
                            r8Var.f = 4;
                            if (AwaitKt.dern(arrayList2, r8Var) != objBeachfront) {
                                v8Var3 = v8Var4;
                                closeable = closeable2;
                                r4 = w03Var;
                                synchronized (v8Var3) {
                                    v8Var3.m = true;
                                    Unit unit3 = Unit.f29295attabal;
                                    hyperleucocytosisVar2 = v8Var3.l;
                                    if (hyperleucocytosisVar2 != null) {
                                        Intrinsics.preprohormone("adapterListener");
                                        hyperleucocytosisVar2 = null;
                                    }
                                    ((z51) hyperleucocytosisVar2).c();
                                    interaction.saneness.attabal(closeable, null);
                                    return unit3;
                                }
                            }
                        }
                    } else {
                        closeable = w03VarA;
                        r5 = closeable;
                        v8Var3 = v8Var4;
                        r4 = r5;
                        synchronized (v8Var3) {
                            v8Var3.m = true;
                            Unit unit4 = Unit.f29295attabal;
                            hyperleucocytosisVar2 = v8Var3.l;
                            if (hyperleucocytosisVar2 != null) {
                                Intrinsics.preprohormone("adapterListener");
                                hyperleucocytosisVar2 = null;
                            }
                            ((z51) hyperleucocytosisVar2).c();
                            interaction.saneness.attabal(closeable, null);
                            return unit4;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    closeable = w03VarA;
                    r4 = closeable;
                }
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            closeable4 = r8Var.c;
            w03Var2 = r8Var.b;
            v8Var4 = r8Var.a;
            try {
                p002kotlin.dern.saneness(obj);
                Map mapS3 = ((vf) obj).s();
                Intrinsics.beachfront(mapS3);
                arrayList = new ArrayList(mapS3.size());
                it = mapS3.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(cutely.wireman(v8Var4.a, null, null, new s8(v8Var4, (Map.Entry) it.next(), null), 3, null));
                }
                r8Var.a = v8Var4;
                r8Var.b = w03Var2;
                r8Var.c = closeable4;
                r8Var.f = 2;
                if (AwaitKt.dern(arrayList, r8Var) != objBeachfront) {
                    v8Var2 = v8Var4;
                    closeable3 = closeable4;
                    r6 = w03Var2;
                    synchronized (v8Var2) {
                        v8Var2.m = true;
                        Unit unit5 = Unit.f29295attabal;
                        hyperleucocytosisVar = v8Var2.l;
                        if (hyperleucocytosisVar != null) {
                            Intrinsics.preprohormone("adapterListener");
                            hyperleucocytosisVar = null;
                        }
                        ((z51) hyperleucocytosisVar).c();
                        interaction.saneness.attabal(closeable3, null);
                        return unit5;
                    }
                }
                return objBeachfront;
            } catch (Throwable th3) {
                th = th3;
                closeable3 = closeable4;
                r6 = w03Var2;
            }
        } else if (i2 == 2) {
            closeable3 = r8Var.c;
            r6 = r8Var.b;
            v8Var4 = r8Var.a;
            try {
                p002kotlin.dern.saneness(obj);
                r7 = r6;
                v8Var2 = v8Var4;
                r6 = r7;
                synchronized (v8Var2) {
                    v8Var2.m = true;
                    Unit unit6 = Unit.f29295attabal;
                }
                hyperleucocytosisVar = v8Var2.l;
                if (hyperleucocytosisVar != null) {
                    Intrinsics.preprohormone("adapterListener");
                    hyperleucocytosisVar = null;
                }
                ((z51) hyperleucocytosisVar).c();
                interaction.saneness.attabal(closeable3, null);
                return unit6;
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            if (i2 == 3) {
                closeable2 = r8Var.c;
                w03Var = r8Var.b;
                v8Var4 = r8Var.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    Map mapS4 = ((vf) obj).s();
                    Intrinsics.beachfront(mapS4);
                    arrayList2 = new ArrayList(mapS4.size());
                    it2 = mapS4.entrySet().iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(cutely.wireman(v8Var4.a, null, null, new s8(v8Var4, (Map.Entry) it2.next(), null), 3, null));
                    }
                    r8Var.a = v8Var4;
                    r8Var.b = w03Var;
                    r8Var.c = closeable2;
                    r8Var.f = 4;
                    if (AwaitKt.dern(arrayList2, r8Var) != objBeachfront) {
                        v8Var3 = v8Var4;
                        closeable = closeable2;
                        r4 = w03Var;
                        synchronized (v8Var3) {
                            v8Var3.m = true;
                            Unit unit7 = Unit.f29295attabal;
                            hyperleucocytosisVar2 = v8Var3.l;
                            if (hyperleucocytosisVar2 != null) {
                                Intrinsics.preprohormone("adapterListener");
                                hyperleucocytosisVar2 = null;
                            }
                            ((z51) hyperleucocytosisVar2).c();
                            interaction.saneness.attabal(closeable, null);
                            return unit7;
                        }
                    }
                    return objBeachfront;
                } catch (Throwable th5) {
                    th = th5;
                    closeable = closeable2;
                    r4 = w03Var;
                }
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = r8Var.c;
                r4 = r8Var.b;
                v8Var4 = r8Var.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    r5 = r4;
                    v8Var3 = v8Var4;
                    r4 = r5;
                    synchronized (v8Var3) {
                        v8Var3.m = true;
                        Unit unit8 = Unit.f29295attabal;
                    }
                    hyperleucocytosisVar2 = v8Var3.l;
                    if (hyperleucocytosisVar2 != null) {
                        Intrinsics.preprohormone("adapterListener");
                        hyperleucocytosisVar2 = null;
                    }
                    ((z51) hyperleucocytosisVar2).c();
                    interaction.saneness.attabal(closeable, null);
                    return unit8;
                } catch (Throwable th6) {
                    th = th6;
                }
            }
            th = th6;
            try {
                r4.b(th);
                if (!(th instanceof evenfall)) {
                    r4.a(th);
                    if (!(th instanceof TimeoutCancellationException)) {
                        if (!(th instanceof CancellationException)) {
                            if (th instanceof yn0) {
                                throw th;
                            }
                            throw new gn0(th);
                        }
                        throw new bn0(th);
                    }
                    throw new cp0(th);
                }
                throw th;
            } catch (Throwable th7) {
                try {
                    throw th7;
                } catch (Throwable th8) {
                    interaction.saneness.attabal(closeable, th7);
                    throw th8;
                }
            }
        }
        th = th4;
        try {
            r6.b(th);
            if (!(th instanceof evenfall)) {
                r6.a(th);
                if (!(th instanceof TimeoutCancellationException)) {
                    if (!(th instanceof CancellationException)) {
                        if (th instanceof yn0) {
                            throw th;
                        }
                        throw new gn0(th);
                    }
                    throw new bn0(th);
                }
                throw new cp0(th);
            }
            throw th;
        } catch (Throwable th9) {
            try {
                throw th9;
            } catch (Throwable th10) {
                interaction.saneness.attabal(closeable3, th9);
                throw th10;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(conclusively conclusivelyVar, String adapterName, j8 j8Var, wretchedly.dern dernVar) {
        t8 t8Var;
        AdapterVersionData adapterVersionData;
        v8 v8Var;
        String adapterName2;
        amphitheatre amphitheatreVar;
        AdapterVersionData adapterVersionData2;
        long j;
        Pair pair;
        if (dernVar instanceof t8) {
            t8Var = (t8) dernVar;
            int i = t8Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                t8Var.h = i - Integer.MIN_VALUE;
            } else {
                t8Var = new t8(this, dernVar);
            }
        } else {
            t8Var = new t8(this, dernVar);
        }
        Object objCompetently = t8Var.f;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = t8Var.h;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objCompetently);
            if (conclusivelyVar instanceof ux0) {
                ux0 ux0Var = (ux0) conclusivelyVar;
                adapterVersionData = new AdapterVersionData(ux0Var.a.getVersionInfo().toString(), ux0Var.a.getSDKVersionInfo().toString());
            } else {
                adapterVersionData = null;
            }
            synchronized (this) {
                plo ploVar = this.e;
                LinkedHashMap adapterStatusMap = this.n;
                n8 adapterStatus = new n8(AdapterStatus.InitializationState.INITIALIZING, "The adapter is still initializing.", 0);
                ploVar.getClass();
                Intrinsics.checkNotNullParameter(adapterStatusMap, "adapterStatusMap");
                Intrinsics.checkNotNullParameter(adapterName, "adapterName");
                Intrinsics.checkNotNullParameter(adapterStatus, "adapterStatus");
                adapterStatusMap.put(adapterName, new Pair(adapterStatus, adapterVersionData));
                Unit unit = Unit.f29295attabal;
            }
            Context contextB = this.f.b();
            if (contextB == null) {
                contextB = this.c;
            }
            laky lakyVar = ip0.f;
            amphitheatre amphitheatreVar2 = this.h;
            amphitheatreVar2.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            CoroutineContext coroutineContext = this.b;
            u8 u8Var = new u8(conclusivelyVar, contextB, j8Var, null);
            t8Var.a = this;
            t8Var.b = adapterName;
            t8Var.c = adapterVersionData;
            t8Var.d = amphitheatreVar2;
            t8Var.e = jElapsedRealtime;
            t8Var.h = 1;
            objCompetently = impromptu.competently(coroutineContext, u8Var, t8Var);
            if (objCompetently == objBeachfront) {
                return objBeachfront;
            }
            v8Var = this;
            adapterName2 = adapterName;
            amphitheatreVar = amphitheatreVar2;
            adapterVersionData2 = adapterVersionData;
            j = jElapsedRealtime;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = t8Var.e;
            amphitheatreVar = t8Var.d;
            adapterVersionData2 = t8Var.c;
            adapterName2 = t8Var.b;
            v8Var = t8Var.a;
            p002kotlin.dern.saneness(objCompetently);
        }
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        amphitheatreVar.getClass();
        Pair pair2 = new Pair((spartacist) objCompetently, p002kotlin.time.saneness.cutely(p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime() - j, DurationUnit.MILLISECONDS)));
        spartacist spartacistVar = (spartacist) pair2.component1();
        long rawValue = ((p002kotlin.time.saneness) pair2.component2()).getRawValue();
        v8Var.getClass();
        if (spartacistVar instanceof tn0) {
            pair = new Pair(AdapterStatus.InitializationState.COMPLETE, "");
        } else {
            if (!(spartacistVar instanceof nn0)) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(AdapterStatus.InitializationState.FAILED, metairie.attabal((nn0) spartacistVar));
        }
        AdapterStatus.InitializationState initializationState = (AdapterStatus.InitializationState) pair.component1();
        String str = (String) pair.component2();
        synchronized (v8Var) {
            plo ploVar2 = v8Var.e;
            LinkedHashMap adapterStatusMap2 = v8Var.n;
            n8 adapterStatus2 = new n8(initializationState, str, (int) p002kotlin.time.saneness.adultoid(rawValue));
            ploVar2.getClass();
            Intrinsics.checkNotNullParameter(adapterStatusMap2, "adapterStatusMap");
            Intrinsics.checkNotNullParameter(adapterName2, "adapterName");
            Intrinsics.checkNotNullParameter(adapterStatus2, "adapterStatus");
            adapterStatusMap2.put(adapterName2, new Pair(adapterStatus2, adapterVersionData2));
            Unit unit2 = Unit.f29295attabal;
        }
        return spartacistVar;
    }
}
