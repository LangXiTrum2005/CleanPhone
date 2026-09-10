package ads_mobile_sdk;

import android.os.SystemClock;
import formularization.beachfront;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.cord;
import kotlinx.coroutines.dhss;
import kotlinx.coroutines.flow.marial;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.sakeen;
import kotlinx.coroutines.saran;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.amphitheatre;
import saneness.bostonian;
import saneness.dent;
import saneness.idolatry;
import saneness.imperceivable;
import saneness.laky;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class q02 {
    public final saran a;
    public final CoroutineContext b;
    public final uf2 c;
    public final amphitheatre d;
    public final ve2 e;
    public final dent f;
    public List g;
    public jm2 h;
    public final formularization.attabal i;
    public tn0 j;
    public int k;
    public boolean l;
    public final HashSet m;
    public final ArrayList n;
    public cord o;
    public List p;

    public q02(saran backgroundScope, CoroutineContext backgroundContext, uf2 requestThrottler, amphitheatre clock, ve2 renderingMonitor, dent adRendererProvider) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(backgroundContext, "backgroundContext");
        Intrinsics.checkNotNullParameter(requestThrottler, "requestThrottler");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(renderingMonitor, "renderingMonitor");
        Intrinsics.checkNotNullParameter(adRendererProvider, "adRendererProvider");
        this.a = backgroundScope;
        this.b = backgroundContext;
        this.c = requestThrottler;
        this.d = clock;
        this.e = renderingMonitor;
        this.f = adRendererProvider;
        this.i = beachfront.saneness(false, 1, null);
        this.k = Integer.MAX_VALUE;
        this.m = new HashSet();
        this.n = new ArrayList();
        cord cordVarSaneness = JobKt__JobKt.saneness(null, 1, null);
        cordVarSaneness.dern();
        this.o = cordVarSaneness;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0069 A[PHI: r0 r2
  0x0069: PHI (r0v18 java.lang.Object) = (r0v21 java.lang.Object), (r0v1 java.lang.Object) binds: [B:27:0x007c, B:23:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r2v6 ads_mobile_sdk.q02) = (r2v9 ads_mobile_sdk.q02), (r2v13 ads_mobile_sdk.q02) binds: [B:27:0x007c, B:23:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095 A[PHI: r0 r2 r4
  0x0095: PHI (r0v16 java.lang.Object) = (r0v19 java.lang.Object), (r0v1 java.lang.Object) binds: [B:34:0x0092, B:22:0x005c] A[DONT_GENERATE, DONT_INLINE]
  0x0095: PHI (r2v4 ads_mobile_sdk.h1) = (r2v8 ads_mobile_sdk.h1), (r2v14 ads_mobile_sdk.h1) binds: [B:34:0x0092, B:22:0x005c] A[DONT_GENERATE, DONT_INLINE]
  0x0095: PHI (r4v5 ads_mobile_sdk.q02) = (r4v7 ads_mobile_sdk.q02), (r4v11 ads_mobile_sdk.q02) binds: [B:34:0x0092, B:22:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b3 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:15:0x0040, B:53:0x00f7, B:55:0x00fb, B:40:0x00af, B:42:0x00b3, B:43:0x00b8, B:45:0x00cc, B:47:0x00d2, B:49:0x00d6, B:50:0x00df), top: B:69:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cc A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:15:0x0040, B:53:0x00f7, B:55:0x00fb, B:40:0x00af, B:42:0x00b3, B:43:0x00b8, B:45:0x00cc, B:47:0x00d2, B:49:0x00d6, B:50:0x00df), top: B:69:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d6 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:15:0x0040, B:53:0x00f7, B:55:0x00fb, B:40:0x00af, B:42:0x00b3, B:43:0x00b8, B:45:0x00cc, B:47:0x00d2, B:49:0x00d6, B:50:0x00df), top: B:69:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00df A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:15:0x0040, B:53:0x00f7, B:55:0x00fb, B:40:0x00af, B:42:0x00b3, B:43:0x00b8, B:45:0x00cc, B:47:0x00d2, B:49:0x00d6, B:50:0x00df), top: B:69:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x010e A[Catch: all -> 0x0132, TryCatch #0 {all -> 0x0132, blocks: (B:57:0x0108, B:59:0x010e, B:62:0x0134), top: B:67:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ca -> B:56:0x0106). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00d0 -> B:56:0x0106). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00d6 -> B:56:0x0106). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00f4 -> B:53:0x00f7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(ads_mobile_sdk.q02 r16, wretchedly.dern r17) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.q02.a(ads_mobile_sdk.q02, wretchedly.dern):java.lang.Object");
    }

    public final String b() {
        jm2 jm2Var = this.h;
        if (jm2Var == null) {
            Intrinsics.preprohormone("serverTransaction");
            jm2Var = null;
        }
        em emVar = jm2Var.b.b.g;
        if (emVar != null) {
            return String.valueOf(emVar);
        }
        ag0 ag0Var = ag0.b;
        return "No fill.";
    }

    public final h1 c() {
        Object next;
        List list = this.p;
        if (list == null) {
            Intrinsics.preprohormone("remainingAdConfigs");
            list = null;
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (CollectionsKt.permissivist(this.m, ((h1) next).S));
        h1 h1Var = (h1) next;
        if (h1Var == null || h1Var.w > this.k) {
            return null;
        }
        this.n.add(h1Var);
        List list2 = this.p;
        if (list2 == null) {
            Intrinsics.preprohormone("remainingAdConfigs");
            list2 = null;
        }
        list2.remove(h1Var);
        String str = h1Var.S;
        if (str != null && str.length() != 0) {
            this.m.add(str);
        }
        if (h1Var.Z) {
            this.o = JobKt__JobKt.saneness(null, 1, null);
        }
        return h1Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0057 A[PHI: r2
  0x0057: PHI (r2v6 ads_mobile_sdk.q02) = (r2v4 ads_mobile_sdk.q02), (r2v8 ads_mobile_sdk.q02) binds: [B:30:0x00a5, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x009a A[PHI: r2
  0x009a: PHI (r2v4 ads_mobile_sdk.q02) = (r2v2 ads_mobile_sdk.q02), (r2v5 ads_mobile_sdk.q02) binds: [B:27:0x0097, B:17:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:56:0x0101  */
    /* JADX WARN: Code duplicated, block: B:63:0x0112  */
    /* JADX WARN: Code duplicated, block: B:66:0x011b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x011c  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf A[EXC_TOP_SPLITTER, PHI: r2 r5 r8
  0x00cf: PHI (r2v13 formularization.attabal) = (r2v10 formularization.attabal), (r2v16 formularization.attabal) binds: [B:37:0x00cc, B:13:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x00cf: PHI (r5v5 ads_mobile_sdk.q02) = (r5v3 ads_mobile_sdk.q02), (r5v8 ads_mobile_sdk.q02) binds: [B:37:0x00cc, B:13:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x00cf: PHI (r8v19 ads_mobile_sdk.tn0) = (r8v18 ads_mobile_sdk.tn0), (r8v23 ads_mobile_sdk.tn0) binds: [B:37:0x00cc, B:13:0x0038] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00b8 A[EXC_TOP_SPLITTER, PHI: r2 r5
  0x00b8: PHI (r2v9 formularization.attabal) = (r2v7 formularization.attabal), (r2v12 formularization.attabal) binds: [B:33:0x00b5, B:14:0x0047] A[DONT_GENERATE, DONT_INLINE]
  0x00b8: PHI (r5v3 ads_mobile_sdk.q02) = (r5v2 ads_mobile_sdk.q02), (r5v4 ads_mobile_sdk.q02) binds: [B:33:0x00b5, B:14:0x0047] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(wretchedly.dern dernVar) {
        k02 k02Var;
        q02 q02Var;
        jm2 jm2Var;
        m02 m02Var;
        ve2 ve2Var;
        q02 q02Var2;
        formularization.attabal attabalVar;
        tn0 tn0Var;
        formularization.attabal attabalVar2;
        boolean z;
        tn0 tn0Var2;
        spartacist spartacistVar;
        kotlinx.coroutines.flow.dern dernVar2;
        q02 q02Var3;
        tn0 tn0Var3;
        imperceivable imperceivableVar;
        l13 l13VarA;
        if (dernVar instanceof k02) {
            k02Var = (k02) dernVar;
            int i = k02Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                k02Var.f = i - Integer.MIN_VALUE;
            } else {
                k02Var = new k02(this, dernVar);
            }
        } else {
            k02Var = new k02(this, dernVar);
        }
        Object obj = k02Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        le2 le2Var = null;
        switch (k02Var.f) {
            case 0:
                p002kotlin.dern.saneness(obj);
                k02Var.a = this;
                k02Var.f = 1;
                if (c(k02Var) != objBeachfront) {
                    q02Var = this;
                    jm2Var = q02Var.h;
                    if (jm2Var == null) {
                        Intrinsics.preprohormone("serverTransaction");
                        jm2Var = null;
                    }
                    m02Var = new m02(q02Var, Integer.max(1, jm2Var.b.b.l), null);
                    k02Var.a = q02Var;
                    k02Var.f = 2;
                    if (sakeen.dern(m02Var, k02Var) != objBeachfront) {
                        ve2Var = q02Var.e;
                        k02Var.a = q02Var;
                        k02Var.f = 3;
                        if (ve2Var.a(k02Var) != objBeachfront) {
                            q02Var2 = q02Var;
                            attabalVar = q02Var2.i;
                            k02Var.a = q02Var2;
                            k02Var.b = attabalVar;
                            k02Var.f = 4;
                            if (attabalVar.attabal(null, k02Var) != objBeachfront) {
                                try {
                                    tn0Var = q02Var2.j;
                                    attabalVar.wireman(null);
                                    attabalVar2 = q02Var2.i;
                                    k02Var.a = q02Var2;
                                    k02Var.b = tn0Var;
                                    k02Var.c = attabalVar2;
                                    k02Var.f = 5;
                                    if (attabalVar2.attabal(null, k02Var) != objBeachfront) {
                                        try {
                                            z = q02Var2.l;
                                            attabalVar2.wireman(null);
                                            if (!z) {
                                                if (tn0Var != null || (dernVar2 = (kotlinx.coroutines.flow.dern) tn0Var.b) == null) {
                                                    tn0Var2 = tn0Var;
                                                    spartacistVar = null;
                                                } else {
                                                    k02Var.a = q02Var2;
                                                    k02Var.b = tn0Var;
                                                    k02Var.c = null;
                                                    k02Var.f = 6;
                                                    Object objMolybdenite = marial.molybdenite(dernVar2, k02Var);
                                                    if (objMolybdenite != objBeachfront) {
                                                        tn0Var2 = tn0Var;
                                                        obj = objMolybdenite;
                                                        q02Var3 = q02Var2;
                                                        spartacistVar = (spartacist) obj;
                                                        q02Var2 = q02Var3;
                                                    }
                                                }
                                                if (spartacistVar instanceof tn0) {
                                                    tn0Var3 = (tn0) spartacistVar;
                                                } else {
                                                    tn0Var3 = null;
                                                }
                                                if (tn0Var3 != null && (imperceivableVar = (imperceivable) tn0Var3.b) != null && (l13VarA = imperceivableVar.a()) != null) {
                                                    le2Var = l13VarA.c;
                                                }
                                                if (le2Var != null) {
                                                    le2Var.f = igo.attabal.attabal(true);
                                                }
                                                tn0Var = tn0Var2;
                                            }
                                            if (tn0Var != null) {
                                                return tn0Var;
                                            }
                                            return new sn0(q02Var2.b());
                                        } catch (Throwable th) {
                                            attabalVar2.wireman(null);
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    attabalVar.wireman(null);
                                    throw th2;
                                }
                            }
                        }
                    }
                }
                return objBeachfront;
            case 1:
                q02Var = k02Var.a;
                p002kotlin.dern.saneness(obj);
                jm2Var = q02Var.h;
                if (jm2Var == null) {
                    Intrinsics.preprohormone("serverTransaction");
                    jm2Var = null;
                }
                m02Var = new m02(q02Var, Integer.max(1, jm2Var.b.b.l), null);
                k02Var.a = q02Var;
                k02Var.f = 2;
                if (sakeen.dern(m02Var, k02Var) != objBeachfront) {
                    ve2Var = q02Var.e;
                    k02Var.a = q02Var;
                    k02Var.f = 3;
                    if (ve2Var.a(k02Var) != objBeachfront) {
                        q02Var2 = q02Var;
                        attabalVar = q02Var2.i;
                        k02Var.a = q02Var2;
                        k02Var.b = attabalVar;
                        k02Var.f = 4;
                        if (attabalVar.attabal(null, k02Var) != objBeachfront) {
                            tn0Var = q02Var2.j;
                            attabalVar.wireman(null);
                            attabalVar2 = q02Var2.i;
                            k02Var.a = q02Var2;
                            k02Var.b = tn0Var;
                            k02Var.c = attabalVar2;
                            k02Var.f = 5;
                            if (attabalVar2.attabal(null, k02Var) != objBeachfront) {
                                z = q02Var2.l;
                                attabalVar2.wireman(null);
                                if (!z) {
                                    if (tn0Var != null) {
                                    }
                                    tn0Var2 = tn0Var;
                                    spartacistVar = null;
                                    if (spartacistVar instanceof tn0) {
                                        tn0Var3 = (tn0) spartacistVar;
                                    } else {
                                        tn0Var3 = null;
                                    }
                                    if (tn0Var3 != null) {
                                        le2Var = l13VarA.c;
                                    }
                                    if (le2Var != null) {
                                        le2Var.f = igo.attabal.attabal(true);
                                    }
                                    tn0Var = tn0Var2;
                                    break;
                                }
                                if (tn0Var != null) {
                                    return tn0Var;
                                }
                                return new sn0(q02Var2.b());
                            }
                        }
                    }
                }
                return objBeachfront;
            case 2:
                q02Var = k02Var.a;
                p002kotlin.dern.saneness(obj);
                ve2Var = q02Var.e;
                k02Var.a = q02Var;
                k02Var.f = 3;
                if (ve2Var.a(k02Var) != objBeachfront) {
                    q02Var2 = q02Var;
                    attabalVar = q02Var2.i;
                    k02Var.a = q02Var2;
                    k02Var.b = attabalVar;
                    k02Var.f = 4;
                    if (attabalVar.attabal(null, k02Var) != objBeachfront) {
                        tn0Var = q02Var2.j;
                        attabalVar.wireman(null);
                        attabalVar2 = q02Var2.i;
                        k02Var.a = q02Var2;
                        k02Var.b = tn0Var;
                        k02Var.c = attabalVar2;
                        k02Var.f = 5;
                        if (attabalVar2.attabal(null, k02Var) != objBeachfront) {
                            z = q02Var2.l;
                            attabalVar2.wireman(null);
                            if (!z) {
                                if (tn0Var != null) {
                                }
                                tn0Var2 = tn0Var;
                                spartacistVar = null;
                                if (spartacistVar instanceof tn0) {
                                    tn0Var3 = (tn0) spartacistVar;
                                } else {
                                    tn0Var3 = null;
                                }
                                if (tn0Var3 != null) {
                                    le2Var = l13VarA.c;
                                }
                                if (le2Var != null) {
                                    le2Var.f = igo.attabal.attabal(true);
                                }
                                tn0Var = tn0Var2;
                                break;
                            }
                            if (tn0Var != null) {
                                return tn0Var;
                            }
                            return new sn0(q02Var2.b());
                        }
                    }
                }
                return objBeachfront;
            case 3:
                q02Var = k02Var.a;
                p002kotlin.dern.saneness(obj);
                q02Var2 = q02Var;
                attabalVar = q02Var2.i;
                k02Var.a = q02Var2;
                k02Var.b = attabalVar;
                k02Var.f = 4;
                if (attabalVar.attabal(null, k02Var) != objBeachfront) {
                    tn0Var = q02Var2.j;
                    attabalVar.wireman(null);
                    attabalVar2 = q02Var2.i;
                    k02Var.a = q02Var2;
                    k02Var.b = tn0Var;
                    k02Var.c = attabalVar2;
                    k02Var.f = 5;
                    if (attabalVar2.attabal(null, k02Var) != objBeachfront) {
                        z = q02Var2.l;
                        attabalVar2.wireman(null);
                        if (!z) {
                            if (tn0Var != null) {
                            }
                            tn0Var2 = tn0Var;
                            spartacistVar = null;
                            if (spartacistVar instanceof tn0) {
                                tn0Var3 = (tn0) spartacistVar;
                            } else {
                                tn0Var3 = null;
                            }
                            if (tn0Var3 != null) {
                                le2Var = l13VarA.c;
                            }
                            if (le2Var != null) {
                                le2Var.f = igo.attabal.attabal(true);
                            }
                            tn0Var = tn0Var2;
                            break;
                        }
                        if (tn0Var != null) {
                            return tn0Var;
                        }
                        return new sn0(q02Var2.b());
                    }
                }
                return objBeachfront;
            case 4:
                attabalVar = (formularization.attabal) k02Var.b;
                q02Var2 = k02Var.a;
                p002kotlin.dern.saneness(obj);
                tn0Var = q02Var2.j;
                attabalVar.wireman(null);
                attabalVar2 = q02Var2.i;
                k02Var.a = q02Var2;
                k02Var.b = tn0Var;
                k02Var.c = attabalVar2;
                k02Var.f = 5;
                if (attabalVar2.attabal(null, k02Var) != objBeachfront) {
                    z = q02Var2.l;
                    attabalVar2.wireman(null);
                    if (!z) {
                        if (tn0Var != null) {
                        }
                        tn0Var2 = tn0Var;
                        spartacistVar = null;
                        if (spartacistVar instanceof tn0) {
                            tn0Var3 = (tn0) spartacistVar;
                        } else {
                            tn0Var3 = null;
                        }
                        if (tn0Var3 != null) {
                            le2Var = l13VarA.c;
                        }
                        if (le2Var != null) {
                            le2Var.f = igo.attabal.attabal(true);
                        }
                        tn0Var = tn0Var2;
                        break;
                    }
                    if (tn0Var != null) {
                        return tn0Var;
                    }
                    return new sn0(q02Var2.b());
                }
                return objBeachfront;
            case 5:
                attabalVar2 = k02Var.c;
                tn0 tn0Var4 = (tn0) k02Var.b;
                q02 q02Var4 = k02Var.a;
                p002kotlin.dern.saneness(obj);
                tn0Var = tn0Var4;
                q02Var2 = q02Var4;
                z = q02Var2.l;
                attabalVar2.wireman(null);
                if (!z) {
                    if (tn0Var != null) {
                    }
                    tn0Var2 = tn0Var;
                    spartacistVar = null;
                    if (spartacistVar instanceof tn0) {
                        tn0Var3 = (tn0) spartacistVar;
                    } else {
                        tn0Var3 = null;
                    }
                    if (tn0Var3 != null) {
                        le2Var = l13VarA.c;
                    }
                    if (le2Var != null) {
                        le2Var.f = igo.attabal.attabal(true);
                    }
                    tn0Var = tn0Var2;
                    break;
                }
                if (tn0Var != null) {
                    return tn0Var;
                }
                return new sn0(q02Var2.b());
            case 6:
                tn0Var2 = (tn0) k02Var.b;
                q02Var3 = k02Var.a;
                p002kotlin.dern.saneness(obj);
                spartacistVar = (spartacist) obj;
                q02Var2 = q02Var3;
                if (spartacistVar instanceof tn0) {
                    tn0Var3 = (tn0) spartacistVar;
                } else {
                    tn0Var3 = null;
                }
                if (tn0Var3 != null) {
                    le2Var = l13VarA.c;
                }
                if (le2Var != null) {
                    le2Var.f = igo.attabal.attabal(true);
                }
                tn0Var = tn0Var2;
                if (tn0Var != null) {
                    return tn0Var;
                }
                return new sn0(q02Var2.b());
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        if (r8.a(r2, r0) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(wretchedly.dern r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.p02
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.p02 r0 = (ads_mobile_sdk.p02) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.p02 r0 = new ads_mobile_sdk.p02
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            p002kotlin.dern.saneness(r8)
            goto L83
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            formularization.attabal r2 = r0.b
            ads_mobile_sdk.q02 r4 = r0.a
            p002kotlin.dern.saneness(r8)
            goto L50
        L3d:
            p002kotlin.dern.saneness(r8)
            formularization.attabal r2 = r7.i
            r0.a = r7
            r0.b = r2
            r0.e = r4
            java.lang.Object r8 = r2.attabal(r5, r0)
            if (r8 != r1) goto L4f
            goto L82
        L4f:
            r4 = r7
        L50:
            ads_mobile_sdk.jm2 r8 = r4.h     // Catch: java.lang.Throwable -> L5b
            java.lang.String r6 = "serverTransaction"
            if (r8 != 0) goto L5d
            p002kotlin.jvm.internal.Intrinsics.preprohormone(r6)     // Catch: java.lang.Throwable -> L5b
            r8 = r5
            goto L5d
        L5b:
            r8 = move-exception
            goto L86
        L5d:
            ads_mobile_sdk.fm2 r8 = r8.b     // Catch: java.lang.Throwable -> L5b
            java.util.List r8 = r8.a     // Catch: java.lang.Throwable -> L5b
            java.util.List r8 = p002kotlin.collections.CollectionsKt.basify(r8)     // Catch: java.lang.Throwable -> L5b
            r4.p = r8     // Catch: java.lang.Throwable -> L5b
            kotlin.Unit r8 = p002kotlin.Unit.f29295attabal     // Catch: java.lang.Throwable -> L5b
            r2.wireman(r5)
            ads_mobile_sdk.ve2 r8 = r4.e
            ads_mobile_sdk.jm2 r2 = r4.h
            if (r2 != 0) goto L76
            p002kotlin.jvm.internal.Intrinsics.preprohormone(r6)
            r2 = r5
        L76:
            r0.a = r5
            r0.b = r5
            r0.e = r3
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 != r1) goto L83
        L82:
            return r1
        L83:
            kotlin.Unit r8 = p002kotlin.Unit.f29295attabal
            return r8
        L86:
            r2.wireman(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.q02.c(wretchedly.dern):java.lang.Object");
    }

    public final boolean a() {
        ArrayList arrayList = this.n;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((h1) it.next()).w < this.k) {
                    return true;
                }
            }
        }
        List list = this.p;
        if (list == null) {
            Intrinsics.preprohormone("remainingAdConfigs");
            list = null;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (((h1) it2.next()).w < this.k) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[PHI: r0 r2
  0x0067: PHI (r0v9 ??) = (r0v19 ??), (r0v20 ??), (r0v21 ??) binds: [B:25:0x0063, B:44:0x00b8, B:14:0x002f] A[DONT_GENERATE, DONT_INLINE]
  0x0067: PHI (r2v8 ads_mobile_sdk.q02) = (r2v1 ads_mobile_sdk.q02), (r2v3 ads_mobile_sdk.q02), (r2v12 ads_mobile_sdk.q02) binds: [B:25:0x0063, B:44:0x00b8, B:14:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:32:0x0082 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:30:0x007a, B:32:0x0082, B:37:0x0093, B:20:0x0050), top: B:51:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0093 A[Catch: all -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:30:0x007a, B:32:0x0082, B:37:0x0093, B:20:0x0050), top: B:51:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [ads_mobile_sdk.g02, formularization.attabal] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v3, types: [ads_mobile_sdk.g02, wretchedly.dern] */
    /* JADX WARN: Type inference failed for: r0v5, types: [formularization.attabal] */
    /* JADX WARN: Type inference failed for: r0v6, types: [formularization.attabal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [ads_mobile_sdk.g02, wretchedly.dern] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v3, types: [formularization.attabal] */
    /* JADX WARN: Type inference failed for: r10v6, types: [ads_mobile_sdk.g02, wretchedly.dern] */
    /* JADX WARN: Type inference failed for: r10v8, types: [formularization.attabal] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v7, types: [formularization.attabal] */
    /* JADX WARN: Type inference failed for: r8v1, types: [kotlinx.coroutines.cord, kotlinx.coroutines.monroe] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00b8 -> B:26:0x0067). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(wretchedly.dern r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.g02
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.g02 r0 = (ads_mobile_sdk.g02) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.g02 r0 = new ads_mobile_sdk.g02
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.c
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.e
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L63
            if (r2 == r6) goto L57
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r2 = r0.a
            ads_mobile_sdk.q02 r2 = (ads_mobile_sdk.q02) r2
            p002kotlin.dern.saneness(r10)
            goto L67
        L37:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3f:
            formularization.attabal r2 = r0.b
            java.lang.Object r8 = r0.a
            ads_mobile_sdk.q02 r8 = (ads_mobile_sdk.q02) r8
            p002kotlin.dern.saneness(r10)
        L48:
            r10 = r2
            r2 = r8
            goto La9
        L4c:
            java.lang.Object r0 = r0.a
            formularization.attabal r0 = (formularization.attabal) r0
            p002kotlin.dern.saneness(r10)     // Catch: java.lang.Throwable -> L54
            goto L8f
        L54:
            r10 = move-exception
            goto Lc0
        L57:
            formularization.attabal r2 = r0.b
            java.lang.Object r8 = r0.a
            ads_mobile_sdk.q02 r8 = (ads_mobile_sdk.q02) r8
            p002kotlin.dern.saneness(r10)
            r10 = r0
            r0 = r2
            goto L7a
        L63:
            p002kotlin.dern.saneness(r10)
            r2 = r9
        L67:
            formularization.attabal r10 = r2.i
            r0.a = r2
            r0.b = r10
            r0.e = r6
            java.lang.Object r8 = r10.attabal(r7, r0)
            if (r8 != r1) goto L76
            goto Lba
        L76:
            r8 = r0
            r0 = r10
            r10 = r8
            r8 = r2
        L7a:
            kotlinx.coroutines.cord r2 = r8.o     // Catch: java.lang.Throwable -> L54
            boolean r2 = r2.saneness()     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L93
            r10.a = r0     // Catch: java.lang.Throwable -> L54
            r10.b = r7     // Catch: java.lang.Throwable -> L54
            r10.e = r5     // Catch: java.lang.Throwable -> L54
            ads_mobile_sdk.h1 r10 = r8.c()     // Catch: java.lang.Throwable -> L54
            if (r10 != r1) goto L8f
            goto Lba
        L8f:
            r0.wireman(r7)
            return r10
        L93:
            kotlin.Unit r2 = p002kotlin.Unit.f29295attabal     // Catch: java.lang.Throwable -> L54
            r0.wireman(r7)
            formularization.attabal r2 = r8.i
            r10.a = r8
            r10.b = r2
            r10.e = r4
            java.lang.Object r0 = r2.attabal(r7, r10)
            if (r0 != r1) goto La7
            goto Lba
        La7:
            r0 = r10
            goto L48
        La9:
            kotlinx.coroutines.cord r8 = r2.o     // Catch: java.lang.Throwable -> Lbb
            r10.wireman(r7)
            r0.a = r2
            r0.b = r7
            r0.e = r3
            java.lang.Object r10 = r8.starveling(r0)
            if (r10 != r1) goto L67
        Lba:
            return r1
        Lbb:
            r0 = move-exception
            r10.wireman(r7)
            throw r0
        Lc0:
            r0.wireman(r7)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.q02.a(wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00f3 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #4 {all -> 0x0039, blocks: (B:14:0x0034, B:44:0x00ed, B:46:0x00f3), top: B:84:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x010f A[Catch: all -> 0x011f, TryCatch #5 {all -> 0x011f, blocks: (B:53:0x0108, B:55:0x010f, B:57:0x0116, B:59:0x011a, B:61:0x011e, B:64:0x0121, B:65:0x0126, B:66:0x0127, B:67:0x012e, B:68:0x012f, B:69:0x0136, B:70:0x0137), top: B:86:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0116 A[Catch: all -> 0x011f, TryCatch #5 {all -> 0x011f, blocks: (B:53:0x0108, B:55:0x010f, B:57:0x0116, B:59:0x011a, B:61:0x011e, B:64:0x0121, B:65:0x0126, B:66:0x0127, B:67:0x012e, B:68:0x012f, B:69:0x0136, B:70:0x0137), top: B:86:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x011a A[Catch: all -> 0x011f, TryCatch #5 {all -> 0x011f, blocks: (B:53:0x0108, B:55:0x010f, B:57:0x0116, B:59:0x011a, B:61:0x011e, B:64:0x0121, B:65:0x0126, B:66:0x0127, B:67:0x012e, B:68:0x012f, B:69:0x0136, B:70:0x0137), top: B:86:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x011e A[Catch: all -> 0x011f, TryCatch #5 {all -> 0x011f, blocks: (B:53:0x0108, B:55:0x010f, B:57:0x0116, B:59:0x011a, B:61:0x011e, B:64:0x0121, B:65:0x0126, B:66:0x0127, B:67:0x012e, B:68:0x012f, B:69:0x0136, B:70:0x0137), top: B:86:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0121 A[Catch: all -> 0x011f, TryCatch #5 {all -> 0x011f, blocks: (B:53:0x0108, B:55:0x010f, B:57:0x0116, B:59:0x011a, B:61:0x011e, B:64:0x0121, B:65:0x0126, B:66:0x0127, B:67:0x012e, B:68:0x012f, B:69:0x0136, B:70:0x0137), top: B:86:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0127 A[Catch: all -> 0x011f, TryCatch #5 {all -> 0x011f, blocks: (B:53:0x0108, B:55:0x010f, B:57:0x0116, B:59:0x011a, B:61:0x011e, B:64:0x0121, B:65:0x0126, B:66:0x0127, B:67:0x012e, B:68:0x012f, B:69:0x0136, B:70:0x0137), top: B:86:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x012f A[Catch: all -> 0x011f, TryCatch #5 {all -> 0x011f, blocks: (B:53:0x0108, B:55:0x010f, B:57:0x0116, B:59:0x011a, B:61:0x011e, B:64:0x0121, B:65:0x0126, B:66:0x0127, B:67:0x012e, B:68:0x012f, B:69:0x0136, B:70:0x0137), top: B:86:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0137 A[Catch: all -> 0x011f, TRY_LEAVE, TryCatch #5 {all -> 0x011f, blocks: (B:53:0x0108, B:55:0x010f, B:57:0x0116, B:59:0x011a, B:61:0x011e, B:64:0x0121, B:65:0x0126, B:66:0x0127, B:67:0x012e, B:68:0x012f, B:69:0x0136, B:70:0x0137), top: B:86:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
    
        if (ads_mobile_sdk.uf2.a(r2, r5, r0) == r1) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r10v0, types: [ads_mobile_sdk.jm2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v15, types: [ads_mobile_sdk.jm2] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.jm2 r10, wretchedly.dern r11) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.q02.a(ads_mobile_sdk.jm2, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:57:0x0139 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x0182 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final Object a(h1 h1Var, wretchedly.dern dernVar) {
        i02 i02Var;
        sn0 sn0Var;
        dhss dhssVar;
        j02 j02Var;
        String str;
        q02 q02Var;
        idolatry idolatryVar;
        amphitheatre amphitheatreVar;
        long jElapsedRealtime;
        Object objA;
        amphitheatre amphitheatreVar2;
        q02 q02Var2;
        h1 h1Var2;
        spartacist spartacistVar;
        long rawValue;
        ve2 ve2Var;
        q02 q02Var3;
        h1 h1Var3 = h1Var;
        if (dernVar instanceof i02) {
            i02Var = (i02) dernVar;
            int i = i02Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                i02Var.h = i - Integer.MIN_VALUE;
            } else {
                i02Var = new i02(this, dernVar);
            }
        } else {
            i02Var = new i02(this, dernVar);
        }
        i02 i02Var2 = i02Var;
        Object obj = i02Var2.f;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = i02Var2.h;
        q02 q02Var4 = 5;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                dent dentVar = this.f;
                jm2 jm2Var = this.h;
                if (jm2Var == null) {
                    Intrinsics.preprohormone("serverTransaction");
                    jm2Var = null;
                }
                bostonian bostonianVarA = dentVar.a(jm2Var, h1Var3);
                try {
                    Iterator it = h1Var3.Y.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            str = (String) it.next();
                            idolatry idolatryVarA = bostonianVarA.a(str);
                            if (idolatryVarA != null && idolatryVarA.b()) {
                                ve2 ve2Var2 = this.e;
                                i02Var2.a = this;
                                i02Var2.b = h1Var3;
                                i02Var2.c = str;
                                i02Var2.d = idolatryVarA;
                                i02Var2.h = 1;
                                if (ve2Var2.a(h1Var3, i02Var2) != objBeachfront) {
                                    q02Var = this;
                                    idolatryVar = idolatryVarA;
                                    break;
                                }
                            }
                        } else {
                            sn0 sn0Var2 = new sn0(b());
                            ve2 ve2Var3 = this.e;
                            long jDern = p002kotlin.time.saneness.INSTANCE.dern();
                            i02Var2.a = sn0Var2;
                            i02Var2.h = 5;
                            if (ve2Var3.a(sn0Var2, h1Var3, jDern, i02Var2) != objBeachfront) {
                                return sn0Var2;
                            }
                        }
                    }
                    laky lakyVar = ip0.f;
                    amphitheatreVar = q02Var.d;
                    amphitheatreVar.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    int i3 = h1Var3.w;
                    i02Var2.a = q02Var;
                    i02Var2.b = h1Var3;
                    i02Var2.c = amphitheatreVar;
                    i02Var2.d = null;
                    i02Var2.e = jElapsedRealtime;
                    i02Var2.h = 2;
                    objA = idolatryVar.a(str, i3, i02Var2);
                    if (objA != objBeachfront) {
                        q02 q02Var5 = q02Var;
                        amphitheatreVar2 = amphitheatreVar;
                        obj = objA;
                        q02Var2 = q02Var5;
                        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
                        amphitheatreVar2.getClass();
                        Pair pair = new Pair((spartacist) obj, p002kotlin.time.saneness.cutely(p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime() - jElapsedRealtime, DurationUnit.MILLISECONDS)));
                        spartacistVar = (spartacist) pair.component1();
                        rawValue = ((p002kotlin.time.saneness) pair.component2()).getRawValue();
                        ve2Var = q02Var2.e;
                        i02Var2.a = q02Var2;
                        i02Var2.b = h1Var3;
                        i02Var2.c = spartacistVar;
                        i02Var2.h = 3;
                        h1Var2 = h1Var3;
                        if (ve2Var.a(spartacistVar, h1Var2, rawValue, i02Var2) != objBeachfront) {
                            return spartacistVar;
                        }
                    }
                } catch (CancellationException unused) {
                    h1Var3 = h1Var;
                    q02Var4 = this;
                }
            } else {
                if (i2 == 1) {
                    idolatryVar = i02Var2.d;
                    String str2 = (String) i02Var2.c;
                    h1 h1Var4 = i02Var2.b;
                    q02Var3 = (q02) i02Var2.a;
                    try {
                        p002kotlin.dern.saneness(obj);
                        str = str2;
                        h1Var3 = h1Var4;
                        q02Var = q02Var3;
                        laky lakyVar2 = ip0.f;
                        amphitheatreVar = q02Var.d;
                        amphitheatreVar.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i4 = h1Var3.w;
                        i02Var2.a = q02Var;
                        i02Var2.b = h1Var3;
                        i02Var2.c = amphitheatreVar;
                        i02Var2.d = null;
                        i02Var2.e = jElapsedRealtime;
                        i02Var2.h = 2;
                        objA = idolatryVar.a(str, i4, i02Var2);
                        if (objA != objBeachfront) {
                            q02 q02Var6 = q02Var;
                            amphitheatreVar2 = amphitheatreVar;
                            obj = objA;
                            q02Var2 = q02Var6;
                            p002kotlin.time.saneness.Companion companion2 = p002kotlin.time.saneness.INSTANCE;
                            amphitheatreVar2.getClass();
                            Pair pair2 = new Pair((spartacist) obj, p002kotlin.time.saneness.cutely(p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime() - jElapsedRealtime, DurationUnit.MILLISECONDS)));
                            spartacistVar = (spartacist) pair2.component1();
                            rawValue = ((p002kotlin.time.saneness) pair2.component2()).getRawValue();
                            ve2Var = q02Var2.e;
                            i02Var2.a = q02Var2;
                            i02Var2.b = h1Var3;
                            i02Var2.c = spartacistVar;
                            i02Var2.h = 3;
                            h1Var2 = h1Var3;
                            if (ve2Var.a(spartacistVar, h1Var2, rawValue, i02Var2) != objBeachfront) {
                                return spartacistVar;
                            }
                        }
                    } catch (CancellationException unused2) {
                        h1Var3 = h1Var4;
                        q02Var4 = q02Var3;
                    }
                } else {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            spartacist spartacistVar2 = (spartacist) i02Var2.c;
                            h1 h1Var5 = i02Var2.b;
                            p002kotlin.dern.saneness(obj);
                            return spartacistVar2;
                        }
                        if (i2 != 4 && i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sn0 sn0Var3 = (sn0) i02Var2.a;
                        p002kotlin.dern.saneness(obj);
                        return sn0Var3;
                    }
                    long j = i02Var2.e;
                    amphitheatreVar2 = (amphitheatre) i02Var2.c;
                    h1 h1Var6 = i02Var2.b;
                    q02Var3 = (q02) i02Var2.a;
                    try {
                        p002kotlin.dern.saneness(obj);
                        jElapsedRealtime = j;
                        h1Var3 = h1Var6;
                        q02Var2 = q02Var3;
                        try {
                            p002kotlin.time.saneness.Companion companion3 = p002kotlin.time.saneness.INSTANCE;
                            amphitheatreVar2.getClass();
                            Pair pair3 = new Pair((spartacist) obj, p002kotlin.time.saneness.cutely(p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime() - jElapsedRealtime, DurationUnit.MILLISECONDS)));
                            spartacistVar = (spartacist) pair3.component1();
                            rawValue = ((p002kotlin.time.saneness) pair3.component2()).getRawValue();
                            ve2Var = q02Var2.e;
                            i02Var2.a = q02Var2;
                            i02Var2.b = h1Var3;
                            i02Var2.c = spartacistVar;
                            i02Var2.h = 3;
                            h1Var2 = h1Var3;
                            try {
                                if (ve2Var.a(spartacistVar, h1Var2, rawValue, i02Var2) != objBeachfront) {
                                    return spartacistVar;
                                }
                            } catch (CancellationException unused3) {
                                i02Var2 = i02Var2;
                                q02Var4 = q02Var2;
                                h1Var3 = h1Var2;
                                sn0Var = new sn0(q02Var4.b());
                                dhssVar = dhss.f32190kowloon;
                                j02Var = new j02(q02Var4, sn0Var, h1Var3, null);
                                i02Var2.a = sn0Var;
                                i02Var2.b = null;
                                i02Var2.c = null;
                                i02Var2.d = null;
                                i02Var2.h = 4;
                                if (impromptu.competently(dhssVar, j02Var, i02Var2) == objBeachfront) {
                                    return sn0Var;
                                }
                            }
                        } catch (CancellationException unused4) {
                            h1Var2 = h1Var3;
                        }
                    } catch (CancellationException unused5) {
                        h1Var3 = h1Var6;
                        q02Var4 = q02Var3;
                    }
                }
                q02Var4 = q02Var3;
                sn0Var = new sn0(q02Var4.b());
                dhssVar = dhss.f32190kowloon;
                j02Var = new j02(q02Var4, sn0Var, h1Var3, null);
                i02Var2.a = sn0Var;
                i02Var2.b = null;
                i02Var2.c = null;
                i02Var2.d = null;
                i02Var2.h = 4;
                if (impromptu.competently(dhssVar, j02Var, i02Var2) == objBeachfront) {
                    return sn0Var;
                }
            }
        } catch (CancellationException unused6) {
        }
        return objBeachfront;
    }
}
