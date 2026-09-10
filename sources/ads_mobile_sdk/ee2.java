package ads_mobile_sdk;

import android.os.SystemClock;
import android.view.View;
import com.ironsource.X3;
import formularization.beachfront;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.cord;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.flow.arytenoidectomy;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.amphitheatre;
import saneness.phytopathogen;
import saneness.rockless;

/* JADX INFO: loaded from: classes.dex */
public final class ee2 implements rockless, phytopathogen {
    public final saran a;
    public final amphitheatre b;
    public final jk0 c;
    public AtomicBoolean d;
    public na2 e;
    public final formularization.attabal f;
    public monroe g;
    public cord h;
    public cord i;
    public boolean j;
    public boolean k;
    public boolean l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    public ee2(saran backgroundScope, amphitheatre clock, jk0 flags) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = backgroundScope;
        this.b = clock;
        this.c = flags;
        this.d = new AtomicBoolean(false);
        this.f = beachfront.saneness(false, 1, null);
        cord cordVarSaneness = JobKt__JobKt.saneness(null, 1, null);
        cordVarSaneness.dern();
        this.h = cordVarSaneness;
        cord cordVarSaneness2 = JobKt__JobKt.saneness(null, 1, null);
        cordVarSaneness2.dern();
        this.i = cordVarSaneness2;
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        this.m = companion.dern();
        this.n = companion.dern();
        this.o = companion.dern();
        this.p = flags.s();
        this.q = flags.t();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0091 A[Catch: CancellationException -> 0x003e, PHI: r12
  0x0091: PHI (r12v33 ??) = (r12v36 ??), (r12v37 ??), (r12v38 ??) binds: [B:41:0x008e, B:79:0x0155, B:14:0x003a] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x003e, blocks: (B:14:0x003a, B:42:0x0091, B:49:0x00b2, B:51:0x00b7, B:53:0x00ba, B:56:0x00ce, B:58:0x00d2, B:59:0x00d6, B:62:0x00ea, B:78:0x0148, B:85:0x015e, B:86:0x0161, B:32:0x0074, B:35:0x007b, B:45:0x00a1), top: B:93:0x0028, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b7 A[Catch: CancellationException -> 0x003e, TryCatch #2 {CancellationException -> 0x003e, blocks: (B:14:0x003a, B:42:0x0091, B:49:0x00b2, B:51:0x00b7, B:53:0x00ba, B:56:0x00ce, B:58:0x00d2, B:59:0x00d6, B:62:0x00ea, B:78:0x0148, B:85:0x015e, B:86:0x0161, B:32:0x0074, B:35:0x007b, B:45:0x00a1), top: B:93:0x0028, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ba A[Catch: CancellationException -> 0x003e, TryCatch #2 {CancellationException -> 0x003e, blocks: (B:14:0x003a, B:42:0x0091, B:49:0x00b2, B:51:0x00b7, B:53:0x00ba, B:56:0x00ce, B:58:0x00d2, B:59:0x00d6, B:62:0x00ea, B:78:0x0148, B:85:0x015e, B:86:0x0161, B:32:0x0074, B:35:0x007b, B:45:0x00a1), top: B:93:0x0028, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ce A[Catch: CancellationException -> 0x003e, PHI: r12
  0x00ce: PHI (r12v30 ??) = (r12v40 ??), (r12v41 ??) binds: [B:35:0x007b, B:54:0x00ca] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x003e, blocks: (B:14:0x003a, B:42:0x0091, B:49:0x00b2, B:51:0x00b7, B:53:0x00ba, B:56:0x00ce, B:58:0x00d2, B:59:0x00d6, B:62:0x00ea, B:78:0x0148, B:85:0x015e, B:86:0x0161, B:32:0x0074, B:35:0x007b, B:45:0x00a1), top: B:93:0x0028, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00d2 A[Catch: CancellationException -> 0x003e, TryCatch #2 {CancellationException -> 0x003e, blocks: (B:14:0x003a, B:42:0x0091, B:49:0x00b2, B:51:0x00b7, B:53:0x00ba, B:56:0x00ce, B:58:0x00d2, B:59:0x00d6, B:62:0x00ea, B:78:0x0148, B:85:0x015e, B:86:0x0161, B:32:0x0074, B:35:0x007b, B:45:0x00a1), top: B:93:0x0028, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ea A[Catch: CancellationException -> 0x003e, PHI: r12 r13
  0x00ea: PHI (r12v28 ??) = (r12v42 ??), (r12v43 ??) binds: [B:32:0x0074, B:60:0x00e6] A[DONT_GENERATE, DONT_INLINE]
  0x00ea: PHI (r13v11 java.lang.Object) = (r13v1 java.lang.Object), (r13v17 java.lang.Object) binds: [B:32:0x0074, B:60:0x00e6] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {CancellationException -> 0x003e, blocks: (B:14:0x003a, B:42:0x0091, B:49:0x00b2, B:51:0x00b7, B:53:0x00ba, B:56:0x00ce, B:58:0x00d2, B:59:0x00d6, B:62:0x00ea, B:78:0x0148, B:85:0x015e, B:86:0x0161, B:32:0x0074, B:35:0x007b, B:45:0x00a1), top: B:93:0x0028, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x010d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0124  */
    /* JADX WARN: Code duplicated, block: B:73:0x0131 A[Catch: CancellationException -> 0x005f, TryCatch #0 {CancellationException -> 0x005f, blocks: (B:66:0x0110, B:71:0x012a, B:73:0x0131, B:74:0x0135, B:82:0x0159, B:83:0x015c, B:24:0x005a, B:29:0x006a, B:70:0x0126), top: B:93:0x0028, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0147  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code duplicated, block: B:97:0x00a1 A[EXC_TOP_SPLITTER, PHI: r12 r13
  0x00a1: PHI (r12v31 ??) = (r12v10 ??), (r12v39 ??) binds: [B:39:0x0088, B:43:0x009d] A[DONT_GENERATE, DONT_INLINE]
  0x00a1: PHI (r13v19 formularization.attabal) = (r13v4 formularization.attabal), (r13v22 formularization.attabal) binds: [B:39:0x0088, B:43:0x009d] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [ads_mobile_sdk.ee2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19, types: [ads_mobile_sdk.ee2] */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v28, types: [ads_mobile_sdk.ee2] */
    /* JADX WARN: Type inference failed for: r12v30, types: [ads_mobile_sdk.ee2] */
    /* JADX WARN: Type inference failed for: r12v31, types: [ads_mobile_sdk.ee2] */
    /* JADX WARN: Type inference failed for: r12v33, types: [ads_mobile_sdk.ee2] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [ads_mobile_sdk.ee2] */
    /* JADX WARN: Type inference failed for: r8v6, types: [ads_mobile_sdk.ee2] */
    /* JADX WARN: Type inference failed for: r8v7, types: [ads_mobile_sdk.ee2] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0155 -> B:42:0x0091). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(ads_mobile_sdk.ee2 r12, wretchedly.dern r13) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ee2.a(ads_mobile_sdk.ee2, wretchedly.dern):java.lang.Object");
    }

    public final long b() {
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        this.b.getClass();
        return p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(boolean z, wretchedly.dern dernVar) {
        nd2 nd2Var;
        ee2 ee2Var;
        formularization.attabal attabalVar;
        if (dernVar instanceof nd2) {
            nd2Var = (nd2) dernVar;
            int i = nd2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                nd2Var.f = i - Integer.MIN_VALUE;
            } else {
                nd2Var = new nd2(this, dernVar);
            }
        } else {
            nd2Var = new nd2(this, dernVar);
        }
        Object obj = nd2Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = nd2Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            formularization.attabal attabalVar2 = this.f;
            nd2Var.a = this;
            nd2Var.b = attabalVar2;
            nd2Var.c = z;
            nd2Var.f = 1;
            if (attabalVar2.attabal(null, nd2Var) == objBeachfront) {
                return objBeachfront;
            }
            ee2Var = this;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = nd2Var.c;
            attabalVar = nd2Var.b;
            ee2Var = nd2Var.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            long jB = ee2Var.b();
            if (ee2Var.d.get() && p002kotlin.time.saneness.formularize(ee2Var.p, p002kotlin.time.saneness.INSTANCE.dern()) <= 0) {
                ee2Var.p = ee2Var.c.s();
            }
            jk0 jk0Var = ee2Var.c;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:proactive_banner_refresh:enabled", X3.i.W);
            if (!((Boolean) jk0Var.a("gads:proactive_banner_refresh:enabled", Boolean.FALSE, zk.b)).booleanValue() || p002kotlin.time.saneness.formularize(ee2Var.q, p002kotlin.time.saneness.INSTANCE.dern()) <= 0) {
                long jPolder = p002kotlin.time.saneness.polder(jB, ee2Var.p);
                ee2Var.o = jPolder;
                ee2Var.n = jPolder;
            } else {
                if (z) {
                    ee2Var.n = p002kotlin.time.saneness.polder(jB, ee2Var.q);
                } else {
                    long jMerc = p002kotlin.time.saneness.merc(jB, ee2Var.o);
                    if (p002kotlin.time.saneness.formularize(jMerc, ee2Var.q) < 0) {
                        jB = p002kotlin.time.saneness.merc(p002kotlin.time.saneness.polder(jB, ee2Var.q), jMerc);
                    }
                    ee2Var.n = jB;
                }
                ee2Var.o = p002kotlin.time.saneness.merc(p002kotlin.time.saneness.polder(ee2Var.n, ee2Var.p), ee2Var.q);
            }
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.phytopathogen
    public final Object b(boolean z, wretchedly.dern dernVar) {
        vd2 vd2Var;
        ee2 ee2Var;
        formularization.attabal attabalVar;
        if (dernVar instanceof vd2) {
            vd2Var = (vd2) dernVar;
            int i = vd2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                vd2Var.f = i - Integer.MIN_VALUE;
            } else {
                vd2Var = new vd2(this, dernVar);
            }
        } else {
            vd2Var = new vd2(this, dernVar);
        }
        Object obj = vd2Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = vd2Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            formularization.attabal attabalVar2 = this.f;
            vd2Var.a = this;
            vd2Var.b = attabalVar2;
            vd2Var.c = z;
            vd2Var.f = 1;
            if (attabalVar2.attabal(null, vd2Var) == objBeachfront) {
                return objBeachfront;
            }
            ee2Var = this;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = vd2Var.c;
            attabalVar = vd2Var.b;
            ee2Var = vd2Var.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            if (z) {
                ee2Var.j = false;
            } else {
                ee2Var.k = false;
            }
            if (!ee2Var.j && !ee2Var.k && !ee2Var.h.saneness()) {
                long jMerc = p002kotlin.time.saneness.merc(ee2Var.b(), ee2Var.m);
                ee2Var.o = p002kotlin.time.saneness.polder(ee2Var.o, jMerc);
                ee2Var.n = p002kotlin.time.saneness.polder(ee2Var.n, jMerc);
                ee2Var.h.dern();
            }
            Unit unit = Unit.f29295attabal;
            attabalVar.wireman(null);
            return unit;
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(wretchedly.dern dernVar) {
        ae2 ae2Var;
        formularization.attabal attabalVar;
        ee2 ee2Var;
        formularization.attabal attabalVar2;
        ee2 ee2Var2;
        boolean z;
        na2 na2Var;
        if (dernVar instanceof ae2) {
            ae2Var = (ae2) dernVar;
            int i = ae2Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ae2Var.e = i - Integer.MIN_VALUE;
            } else {
                ae2Var = new ae2(this, dernVar);
            }
        } else {
            ae2Var = new ae2(this, dernVar);
        }
        Object obj = ae2Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ae2Var.e;
        boolean z2 = true;
        na2 na2Var2 = null;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                attabalVar = this.f;
                ae2Var.a = this;
                ae2Var.b = attabalVar;
                ae2Var.e = 1;
                if (attabalVar.attabal(null, ae2Var) != objBeachfront) {
                    ee2Var = this;
                }
                return objBeachfront;
            }
            if (i2 == 1) {
                attabalVar = ae2Var.b;
                ee2Var = ae2Var.a;
                p002kotlin.dern.saneness(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar2 = ae2Var.b;
                ee2Var2 = ae2Var.a;
                p002kotlin.dern.saneness(obj);
            }
            try {
                if (!ee2Var2.j || ee2Var2.k) {
                    z = false;
                } else {
                    z = true;
                }
                attabalVar2.wireman(null);
                if (z) {
                    na2Var = ee2Var2.e;
                    if (na2Var == null) {
                        Intrinsics.preprohormone("adLoader");
                    } else {
                        na2Var2 = na2Var;
                    }
                    if ((na2Var2.v.b() || !na2Var2.m.get()) && (!(na2Var2.b().getParent() instanceof View) || !na2Var2.t.a(na2Var2.b(), false))) {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                return igo.attabal.attabal(z2);
            } catch (Throwable th) {
                attabalVar2.wireman(null);
                throw th;
            }
            boolean z3 = ee2Var.l;
            attabalVar.wireman(null);
            if (!z3) {
                formularization.attabal attabalVar3 = ee2Var.f;
                ae2Var.a = ee2Var;
                ae2Var.b = attabalVar3;
                ae2Var.e = 2;
                if (attabalVar3.attabal(null, ae2Var) != objBeachfront) {
                    attabalVar2 = attabalVar3;
                    ee2Var2 = ee2Var;
                    if (ee2Var2.j) {
                        z = false;
                    } else {
                        z = false;
                    }
                    attabalVar2.wireman(null);
                    if (z) {
                        z2 = false;
                    } else {
                        na2Var = ee2Var2.e;
                        if (na2Var == null) {
                            Intrinsics.preprohormone("adLoader");
                        } else {
                            na2Var2 = na2Var;
                        }
                        if (na2Var2.v.b()) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                    }
                }
                return objBeachfront;
            }
            return igo.attabal.attabal(z2);
        } catch (Throwable th2) {
            attabalVar.wireman(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.rockless
    public final Object a(jm2 jm2Var, wretchedly.dern dernVar) {
        sd2 sd2Var;
        formularization.attabal attabalVar;
        ee2 ee2Var;
        if (dernVar instanceof sd2) {
            sd2Var = (sd2) dernVar;
            int i = sd2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                sd2Var.f = i - Integer.MIN_VALUE;
            } else {
                sd2Var = new sd2(this, dernVar);
            }
        } else {
            sd2Var = new sd2(this, dernVar);
        }
        Object obj = sd2Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = sd2Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = this.f;
            sd2Var.a = this;
            sd2Var.b = jm2Var;
            sd2Var.c = attabalVar;
            sd2Var.f = 1;
            if (attabalVar.attabal(null, sd2Var) == objBeachfront) {
                return objBeachfront;
            }
            ee2Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = sd2Var.c;
            jm2 jm2Var2 = sd2Var.b;
            ee2Var = sd2Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            jm2Var = jm2Var2;
        }
        try {
            ee2Var.q = jm2Var.b.b.o;
            if (ee2Var.d.get() && p002kotlin.time.saneness.formularize(jm2Var.b.b.n, p002kotlin.time.saneness.INSTANCE.dern()) <= 0) {
                return Unit.f29295attabal;
            }
            ee2Var.p = jm2Var.b.b.n;
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.phytopathogen
    public final Object a(wretchedly.dern dernVar) {
        td2 td2Var;
        ee2 ee2Var;
        formularization.attabal attabalVar;
        if (dernVar instanceof td2) {
            td2Var = (td2) dernVar;
            int i = td2Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                td2Var.e = i - Integer.MIN_VALUE;
            } else {
                td2Var = new td2(this, dernVar);
            }
        } else {
            td2Var = new td2(this, dernVar);
        }
        Object obj = td2Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = td2Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            formularization.attabal attabalVar2 = this.f;
            td2Var.a = this;
            td2Var.b = attabalVar2;
            td2Var.e = 1;
            if (attabalVar2.attabal(null, td2Var) == objBeachfront) {
                return objBeachfront;
            }
            ee2Var = this;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = td2Var.b;
            ee2Var = td2Var.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            ee2Var.j = false;
            ee2Var.k = false;
            ee2Var.l = true;
            long jB = ee2Var.b();
            ee2Var.n = jB;
            ee2Var.o = jB;
            ee2Var.h.dern();
            ee2Var.i.dern();
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.phytopathogen
    public final Object a(boolean z, wretchedly.dern dernVar) {
        ud2 ud2Var;
        ee2 ee2Var;
        formularization.attabal attabalVar;
        if (dernVar instanceof ud2) {
            ud2Var = (ud2) dernVar;
            int i = ud2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ud2Var.f = i - Integer.MIN_VALUE;
            } else {
                ud2Var = new ud2(this, dernVar);
            }
        } else {
            ud2Var = new ud2(this, dernVar);
        }
        Object obj = ud2Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ud2Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            formularization.attabal attabalVar2 = this.f;
            ud2Var.a = this;
            ud2Var.b = attabalVar2;
            ud2Var.c = z;
            ud2Var.f = 1;
            if (attabalVar2.attabal(null, ud2Var) == objBeachfront) {
                return objBeachfront;
            }
            ee2Var = this;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = ud2Var.c;
            attabalVar = ud2Var.b;
            ee2Var = ud2Var.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            if (!ee2Var.j && !ee2Var.k) {
                ee2Var.h = JobKt__JobKt.saneness(null, 1, null);
                ee2Var.m = ee2Var.b();
            }
            if (z) {
                ee2Var.j = true;
            } else {
                ee2Var.k = true;
            }
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object a(na2 na2Var, AtomicBoolean atomicBoolean, arytenoidectomy arytenoidectomyVar, wretchedly.dern dernVar) {
        wd2 wd2Var;
        arytenoidectomy arytenoidectomyVar2;
        ee2 ee2Var;
        formularization.attabal attabalVar;
        ee2 ee2Var2;
        arytenoidectomy arytenoidectomyVar3;
        EmptyCoroutineContext context;
        if (dernVar instanceof wd2) {
            wd2Var = (wd2) dernVar;
            int i = wd2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                wd2Var.f = i - Integer.MIN_VALUE;
            } else {
                wd2Var = new wd2(this, dernVar);
            }
        } else {
            wd2Var = new wd2(this, dernVar);
        }
        Object obj = wd2Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = wd2Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            this.d = atomicBoolean;
            this.e = na2Var;
            wd2Var.a = this;
            arytenoidectomyVar2 = arytenoidectomyVar;
            wd2Var.b = arytenoidectomyVar2;
            wd2Var.f = 1;
            if (c(true, wd2Var) != objBeachfront) {
                ee2Var = this;
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            arytenoidectomy arytenoidectomyVar4 = wd2Var.b;
            ee2Var = wd2Var.a;
            p002kotlin.dern.saneness(obj);
            arytenoidectomyVar2 = arytenoidectomyVar4;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = wd2Var.c;
            arytenoidectomyVar3 = wd2Var.b;
            ee2Var2 = wd2Var.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            saran saranVar = ee2Var2.a;
            xd2 block = new xd2(ee2Var2, null);
            context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            ee2Var2.g = cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
            Unit unit = Unit.f29295attabal;
            attabalVar.wireman(null);
            if (arytenoidectomyVar3 != null) {
                saran saranVar2 = ee2Var2.a;
                zd2 block2 = new zd2(ee2Var2, arytenoidectomyVar3, null);
                Intrinsics.checkNotNullParameter(saranVar2, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(block2, "block");
                cutely.wireman(saranVar2, context, null, new x13(block2, null), 2, null);
            }
            return unit;
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
        formularization.attabal attabalVar2 = ee2Var.f;
        wd2Var.a = ee2Var;
        wd2Var.b = arytenoidectomyVar2;
        wd2Var.c = attabalVar2;
        wd2Var.f = 2;
        if (attabalVar2.attabal(null, wd2Var) != objBeachfront) {
            attabalVar = attabalVar2;
            ee2Var2 = ee2Var;
            arytenoidectomyVar3 = arytenoidectomyVar2;
            saran saranVar3 = ee2Var2.a;
            xd2 block3 = new xd2(ee2Var2, null);
            context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar3, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block3, "block");
            ee2Var2.g = cutely.wireman(saranVar3, context, null, new x13(block3, null), 2, null);
            Unit unit2 = Unit.f29295attabal;
            attabalVar.wireman(null);
            if (arytenoidectomyVar3 != null) {
                saran saranVar4 = ee2Var2.a;
                zd2 block4 = new zd2(ee2Var2, arytenoidectomyVar3, null);
                Intrinsics.checkNotNullParameter(saranVar4, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(block4, "block");
                cutely.wireman(saranVar4, context, null, new x13(block4, null), 2, null);
            }
            return unit2;
        }
        return objBeachfront;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c8, code lost:
    
        if (r0.starveling(r4) == r5) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r19, wretchedly.dern r21) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ee2.a(long, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006b A[PHI: r2 r5 r10
  0x006b: PHI (r2v16 kotlin.jvm.functions.Function1) = (r2v4 kotlin.jvm.functions.Function1), (r2v19 kotlin.jvm.functions.Function1) binds: [B:19:0x0060, B:34:0x00ce] A[DONT_GENERATE, DONT_INLINE]
  0x006b: PHI (r5v7 ads_mobile_sdk.ee2) = (r5v2 ads_mobile_sdk.ee2), (r5v9 ads_mobile_sdk.ee2) binds: [B:19:0x0060, B:34:0x00ce] A[DONT_GENERATE, DONT_INLINE]
  0x006b: PHI (r10v16 ads_mobile_sdk.ee2) = (r10v5 ads_mobile_sdk.ee2), (r10v26 ads_mobile_sdk.ee2) binds: [B:19:0x0060, B:34:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d6 A[Catch: all -> 0x0186, TRY_LEAVE, TryCatch #2 {all -> 0x0186, blocks: (B:36:0x00d2, B:38:0x00d6), top: B:88:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0188  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:84:0x00a4 A[EXC_TOP_SPLITTER, PHI: r2 r5 r10 r11
  0x00a4: PHI (r2v20 ads_mobile_sdk.ee2) = (r2v2 ads_mobile_sdk.ee2), (r2v22 ads_mobile_sdk.ee2) binds: [B:22:0x007b, B:26:0x00a0] A[DONT_GENERATE, DONT_INLINE]
  0x00a4: PHI (r5v10 kotlin.jvm.functions.Function1) = (r5v0 kotlin.jvm.functions.Function1), (r5v12 kotlin.jvm.functions.Function1) binds: [B:22:0x007b, B:26:0x00a0] A[DONT_GENERATE, DONT_INLINE]
  0x00a4: PHI (r10v27 formularization.attabal) = (r10v1 formularization.attabal), (r10v31 formularization.attabal) binds: [B:22:0x007b, B:26:0x00a0] A[DONT_GENERATE, DONT_INLINE]
  0x00a4: PHI (r11v25 ads_mobile_sdk.ee2) = (r11v3 ads_mobile_sdk.ee2), (r11v27 ads_mobile_sdk.ee2) binds: [B:22:0x007b, B:26:0x00a0] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x015a -> B:13:0x0038). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0183 -> B:24:0x008e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(p002kotlin.jvm.functions.Function1 r10, wretchedly.dern r11) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ee2.a(kotlin.jvm.functions.Function1, wretchedly.dern):java.lang.Object");
    }
}
