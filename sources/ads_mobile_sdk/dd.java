package ads_mobile_sdk;

import com.google.common.base.triweekly;
import com.ironsource.X3;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import formularization.beachfront;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.channels.competently;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import kotlinx.coroutines.splinterproof;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.amphitheatre;
import saneness.beclomethasone;
import saneness.copestone;
import saneness.hobby;
import saneness.juju;
import saneness.mutative;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class dd extends ox0 implements mutative {
    public final saran c;
    public final saran d;
    public final jk0 e;
    public final amphitheatre f;
    public final hobby g;
    public final yb h;
    public final gc i;
    public long j;
    public long k;
    public long l;
    public final AtomicBoolean m;
    public monroe n;
    public monroe o;
    public lc p;
    public final beclomethasone q;
    public co0 r;
    public String s;
    public final formularization.attabal t;
    public long u;
    public final kotlinx.coroutines.channels.wireman v;
    public final formularization.attabal w;
    public boolean x;
    public long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd(saran backgroundScope, saran uiScope, jk0 flags, amphitheatre clock, hobby httpClient, yb anrDataCollector, gc anrLogsDataStore) {
        super((no0) null, 1);
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(anrDataCollector, "anrDataCollector");
        Intrinsics.checkNotNullParameter(anrLogsDataStore, "anrLogsDataStore");
        this.c = backgroundScope;
        this.d = uiScope;
        this.e = flags;
        this.f = clock;
        this.g = httpClient;
        this.h = anrDataCollector;
        this.i = anrLogsDataStore;
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        this.j = companion.dern();
        this.k = companion.dern();
        this.l = companion.dern();
        this.m = new AtomicBoolean(false);
        this.p = lc.NO_ANR;
        this.q = io0.o();
        this.t = beachfront.saneness(false, 1, null);
        this.u = companion.dern();
        this.v = competently.saneness(0, null, null, 7, null);
        this.w = beachfront.saneness(false, 1, null);
        this.x = true;
        this.y = companion.dern();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(dd ddVar, wretchedly.dern dernVar) {
        qc qcVar;
        ddVar.getClass();
        if (dernVar instanceof qc) {
            qcVar = (qc) dernVar;
            int i = qcVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qcVar.d = i - Integer.MIN_VALUE;
            } else {
                qcVar = new qc(ddVar, dernVar);
            }
        } else {
            qcVar = new qc(ddVar, dernVar);
        }
        Object obj = qcVar.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = qcVar.d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ddVar = qcVar.a;
        }
        p002kotlin.dern.saneness(obj);
        while (ddVar.m.get()) {
            cutely.wireman(ddVar.d, null, null, new rc(ddVar, null), 3, null);
            long j = ddVar.l;
            qcVar.a = ddVar;
            qcVar.d = 1;
            if (splinterproof.saneness(j, qcVar) == objBeachfront) {
                return objBeachfront;
            }
        }
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[LOOP:0: B:22:0x0062->B:32:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r7 == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(ads_mobile_sdk.dd r6, wretchedly.dern r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof ads_mobile_sdk.zc
            if (r0 == 0) goto L16
            r0 = r7
            ads_mobile_sdk.zc r0 = (ads_mobile_sdk.zc) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f = r1
            goto L1b
        L16:
            ads_mobile_sdk.zc r0 = new ads_mobile_sdk.zc
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.d
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.util.Iterator r6 = r0.c
            java.util.Map r2 = r0.b
            ads_mobile_sdk.dd r4 = r0.a
            p002kotlin.dern.saneness(r7)
            goto L62
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            ads_mobile_sdk.dd r6 = r0.a
            p002kotlin.dern.saneness(r7)
            goto L53
        L43:
            p002kotlin.dern.saneness(r7)
            ads_mobile_sdk.gc r7 = r6.i
            r0.a = r6
            r0.f = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L53
            goto L88
        L53:
            r2 = r7
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L89
            java.util.Set r7 = r2.entrySet()
            java.util.Iterator r7 = r7.iterator()
            r4 = r6
            r6 = r7
        L62:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L89
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r5 = r7.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r7 = r7.getValue()
            ads_mobile_sdk.co0 r7 = (ads_mobile_sdk.co0) r7
            r0.a = r4
            r0.b = r2
            r0.c = r6
            r0.f = r3
            java.lang.Object r7 = r4.a(r5, r7, r0)
            if (r7 != r1) goto L62
        L88:
            return r1
        L89:
            kotlin.Unit r6 = p002kotlin.Unit.f29295attabal
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dd.b(ads_mobile_sdk.dd, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048 A[PHI: r9
  0x0048: PHI (r9v3 ads_mobile_sdk.dd) = (r9v1 ads_mobile_sdk.dd), (r9v5 ads_mobile_sdk.dd) binds: [B:14:0x0030, B:28:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x005b A[PHI: r9 r10
  0x005b: PHI (r9v2 ads_mobile_sdk.dd) = (r9v3 ads_mobile_sdk.dd), (r9v6 ads_mobile_sdk.dd) binds: [B:22:0x0058, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x005b: PHI (r10v2 java.lang.Object) = (r10v8 java.lang.Object), (r10v1 java.lang.Object) binds: [B:22:0x0058, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x008c A[PHI: r9
  0x008c: PHI (r9v5 ads_mobile_sdk.dd) = (r9v2 ads_mobile_sdk.dd), (r9v7 ads_mobile_sdk.dd) binds: [B:25:0x0089, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0094 -> B:19:0x0048). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(ads_mobile_sdk.dd r9, wretchedly.dern r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof ads_mobile_sdk.ad
            if (r0 == 0) goto L16
            r0 = r10
            ads_mobile_sdk.ad r0 = (ads_mobile_sdk.ad) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            ads_mobile_sdk.ad r0 = new ads_mobile_sdk.ad
            r0.<init>(r9, r10)
        L1b:
            java.lang.Object r10 = r0.b
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L30
            if (r2 == r5) goto L42
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            ads_mobile_sdk.dd r9 = r0.a
        L30:
            p002kotlin.dern.saneness(r10)
            goto L48
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            ads_mobile_sdk.dd r9 = r0.a
            p002kotlin.dern.saneness(r10)
            goto L8c
        L42:
            ads_mobile_sdk.dd r9 = r0.a
            p002kotlin.dern.saneness(r10)
            goto L5b
        L48:
            java.util.concurrent.atomic.AtomicBoolean r10 = r9.m
            boolean r10 = r10.get()
            if (r10 == 0) goto L97
            r0.a = r9
            r0.d = r5
            java.lang.Object r10 = r9.g(r0)
            if (r10 != r1) goto L5b
            goto L96
        L5b:
            kotlin.time.saneness r10 = (p002kotlin.time.saneness) r10
            long r6 = r10.getRawValue()
            kotlinx.coroutines.selects.SelectImplementation r10 = new kotlinx.coroutines.selects.SelectImplementation
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            r10.<init>(r2)
            ads_mobile_sdk.bd r2 = new ads_mobile_sdk.bd
            r8 = 0
            r2.<init>(r8)
            kotlinx.coroutines.selects.saneness.saneness(r10, r6, r2)
            kotlinx.coroutines.channels.wireman r2 = r9.v
            kotlinx.coroutines.selects.beachfront r2 = r2.monoploid()
            ads_mobile_sdk.cd r6 = new ads_mobile_sdk.cd
            r6.<init>(r8)
            r10.marial(r2, r6)
            r0.a = r9
            r0.d = r4
            java.lang.Object r10 = r10.kowloon(r0)
            if (r10 != r1) goto L8c
            goto L96
        L8c:
            r0.a = r9
            r0.d = r3
            java.lang.Object r10 = r9.h(r0)
            if (r10 != r1) goto L48
        L96:
            return r1
        L97:
            kotlin.Unit r9 = p002kotlin.Unit.f29295attabal
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dd.c(ads_mobile_sdk.dd, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.mutative
    public final Object d(long j, wretchedly.dern dernVar) {
        oc ocVar;
        dd ddVar;
        formularization.attabal attabalVar;
        if (dernVar instanceof oc) {
            ocVar = (oc) dernVar;
            int i = ocVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ocVar.f = i - Integer.MIN_VALUE;
            } else {
                ocVar = new oc(this, dernVar);
            }
        } else {
            ocVar = new oc(this, dernVar);
        }
        Object obj = ocVar.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ocVar.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            formularization.attabal attabalVar2 = this.w;
            ocVar.a = this;
            ocVar.b = attabalVar2;
            ocVar.c = j;
            ocVar.f = 1;
            if (attabalVar2.attabal(null, ocVar) == objBeachfront) {
                return objBeachfront;
            }
            ddVar = this;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = ocVar.c;
            attabalVar = ocVar.b;
            ddVar = ocVar.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            if (p002kotlin.time.saneness.formularize(j, ddVar.y) > 0 && ddVar.x) {
                ddVar.x = false;
                ddVar.y = j;
                ddVar.m.set(false);
                monroe monroeVar = ddVar.n;
                if (monroeVar != null) {
                    monroe.attabal.attabal(monroeVar, null, 1, null);
                }
                monroe monroeVar2 = ddVar.o;
                if (monroeVar2 != null) {
                    monroe.attabal.attabal(monroeVar2, null, 1, null);
                }
                kn0.b("ANR watchdog stopped", null);
                return Unit.f29295attabal;
            }
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // ads_mobile_sdk.ox0
    public final Object e(wretchedly.dern dernVar) {
        uc ucVar;
        formularization.attabal attabalVar;
        dd ddVar;
        if (dernVar instanceof uc) {
            ucVar = (uc) dernVar;
            int i = ucVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ucVar.e = i - Integer.MIN_VALUE;
            } else {
                ucVar = new uc(this, dernVar);
            }
        } else {
            ucVar = new uc(this, dernVar);
        }
        Object obj = ucVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ucVar.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            jk0 jk0Var = this.e;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:system_health:anr_watchdog:enabled", X3.i.W);
            if (!((Boolean) jk0Var.a("gads:system_health:anr_watchdog:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
                return new rn0("ANR watchdog is disabled", k41.INTERNAL_ERROR);
            }
            jk0 jk0Var2 = this.e;
            jk0Var2.getClass();
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            DurationUnit durationUnit = DurationUnit.MILLISECONDS;
            p002kotlin.time.saneness sanenessVarAttabal = juju.attabal(1000, durationUnit, "gads:system_health:early_anr_threshold_millis", X3.i.W);
            tk tkVar = zk.j;
            if (p002kotlin.time.saneness.formularize(((p002kotlin.time.saneness) jk0Var2.a("gads:system_health:early_anr_threshold_millis", sanenessVarAttabal, tkVar)).getRawValue(), companion.dern()) > 0) {
                jk0 jk0Var3 = this.e;
                jk0Var3.getClass();
                long jMolybdenite = p002kotlin.time.dern.molybdenite(4500, durationUnit);
                Intrinsics.checkNotNullParameter("gads:system_health:full_anr_threshold_millis", X3.i.W);
                if (p002kotlin.time.saneness.formularize(((p002kotlin.time.saneness) jk0Var3.a("gads:system_health:full_anr_threshold_millis", p002kotlin.time.saneness.cutely(jMolybdenite), tkVar)).getRawValue(), companion.dern()) > 0) {
                    jk0 jk0Var4 = this.e;
                    jk0Var4.getClass();
                    long jMolybdenite2 = p002kotlin.time.dern.molybdenite(500, durationUnit);
                    Intrinsics.checkNotNullParameter("gads:system_health:anr_polling_millis", X3.i.W);
                    if (p002kotlin.time.saneness.formularize(((p002kotlin.time.saneness) jk0Var4.a("gads:system_health:anr_polling_millis", p002kotlin.time.saneness.cutely(jMolybdenite2), tkVar)).getRawValue(), companion.dern()) > 0) {
                        if (this.m.getAndSet(true)) {
                            return new rn0("ANR watchdog is already running", k41.INTERNAL_ERROR);
                        }
                        jk0 jk0Var5 = this.e;
                        jk0Var5.getClass();
                        long jMolybdenite3 = p002kotlin.time.dern.molybdenite(1000, durationUnit);
                        Intrinsics.checkNotNullParameter("gads:system_health:early_anr_threshold_millis", X3.i.W);
                        this.j = ((p002kotlin.time.saneness) jk0Var5.a("gads:system_health:early_anr_threshold_millis", p002kotlin.time.saneness.cutely(jMolybdenite3), tkVar)).getRawValue();
                        jk0 jk0Var6 = this.e;
                        jk0Var6.getClass();
                        long jMolybdenite4 = p002kotlin.time.dern.molybdenite(4500, durationUnit);
                        Intrinsics.checkNotNullParameter("gads:system_health:full_anr_threshold_millis", X3.i.W);
                        this.k = ((p002kotlin.time.saneness) jk0Var6.a("gads:system_health:full_anr_threshold_millis", p002kotlin.time.saneness.cutely(jMolybdenite4), tkVar)).getRawValue();
                        jk0 jk0Var7 = this.e;
                        jk0Var7.getClass();
                        long jMolybdenite5 = p002kotlin.time.dern.molybdenite(500, durationUnit);
                        Intrinsics.checkNotNullParameter("gads:system_health:anr_polling_millis", X3.i.W);
                        this.l = ((p002kotlin.time.saneness) jk0Var7.a("gads:system_health:anr_polling_millis", p002kotlin.time.saneness.cutely(jMolybdenite5), tkVar)).getRawValue();
                        formularization.attabal attabalVar2 = this.t;
                        ucVar.a = this;
                        ucVar.b = attabalVar2;
                        ucVar.e = 1;
                        if (attabalVar2.attabal(null, ucVar) == objBeachfront) {
                            return objBeachfront;
                        }
                        attabalVar = attabalVar2;
                        ddVar = this;
                    }
                }
            }
            return new rn0("Invalid ANR watchdog flags", k41.INTERNAL_ERROR);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        attabalVar = ucVar.b;
        ddVar = ucVar.a;
        p002kotlin.dern.saneness(obj);
        try {
            p002kotlin.time.saneness.Companion companion2 = p002kotlin.time.saneness.INSTANCE;
            ddVar.f.getClass();
            ddVar.u = p002kotlin.time.dern.graveside(System.currentTimeMillis(), DurationUnit.MILLISECONDS);
            Unit unit = Unit.f29295attabal;
            attabalVar.wireman(null);
            y13.a(ddVar.c, new vc(ddVar, null));
            ddVar.n = y13.a(ddVar.c, new wc(ddVar, null));
            ddVar.o = y13.a(ddVar.c, new xc(ddVar, null));
            copestone.dern("ANR watchdog started", 4);
            return new tn0(unit);
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(wretchedly.dern dernVar) {
        mc mcVar;
        dd ddVar;
        dd ddVar2;
        if (dernVar instanceof mc) {
            mcVar = (mc) dernVar;
            int i = mcVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                mcVar.e = i - Integer.MIN_VALUE;
            } else {
                mcVar = new mc(this, dernVar);
            }
        } else {
            mcVar = new mc(this, dernVar);
        }
        Object objA = mcVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = mcVar.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            yb ybVar = this.h;
            mcVar.a = this;
            mcVar.b = this;
            mcVar.e = 1;
            objA = ybVar.a(mcVar);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
            ddVar = this;
            ddVar2 = ddVar;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ddVar2 = mcVar.b;
            ddVar = mcVar.a;
            p002kotlin.dern.saneness(objA);
        }
        ddVar2.r = (co0) objA;
        ddVar.s = UUID.randomUUID().toString();
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(wretchedly.dern dernVar) {
        nc ncVar;
        dd ddVar;
        long j;
        formularization.attabal attabalVar;
        long jMerc;
        if (dernVar instanceof nc) {
            ncVar = (nc) dernVar;
            int i = ncVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncVar.f = i - Integer.MIN_VALUE;
            } else {
                ncVar = new nc(this, dernVar);
            }
        } else {
            ncVar = new nc(this, dernVar);
        }
        Object obj = ncVar.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ncVar.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            this.f.getClass();
            long jGraveside = p002kotlin.time.dern.graveside(System.currentTimeMillis(), DurationUnit.MILLISECONDS);
            formularization.attabal attabalVar2 = this.t;
            ncVar.a = this;
            ncVar.b = attabalVar2;
            ncVar.c = jGraveside;
            ncVar.f = 1;
            if (attabalVar2.attabal(null, ncVar) == objBeachfront) {
                return objBeachfront;
            }
            ddVar = this;
            j = jGraveside;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = ncVar.c;
            attabalVar = ncVar.b;
            ddVar = ncVar.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            long j2 = ddVar.u;
            attabalVar.wireman(null);
            long jMerc2 = p002kotlin.time.saneness.merc(j, j2);
            int iOrdinal = ddVar.p.ordinal();
            if (iOrdinal == 0) {
                jMerc = p002kotlin.time.saneness.merc(ddVar.j, jMerc2);
            } else if (iOrdinal == 1) {
                jMerc = p002kotlin.time.saneness.merc(ddVar.k, jMerc2);
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                jMerc = ddVar.l;
            }
            return frenchy.dern.taiyuan(p002kotlin.time.saneness.cutely(p002kotlin.time.saneness.INSTANCE.dern()), p002kotlin.time.saneness.cutely(jMerc));
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b5, code lost:
    
        if (r10.f(r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0125, code lost:
    
        if (r4.a(r3, r2, r0) == r1) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(wretchedly.dern r14) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dd.h(wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bb, code lost:
    
        if (r9 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r8, ads_mobile_sdk.co0 r9, wretchedly.dern r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.tc
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.tc r0 = (ads_mobile_sdk.tc) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.tc r0 = new ads_mobile_sdk.tc
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.c
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            ads_mobile_sdk.dd r8 = r0.a
            p002kotlin.dern.saneness(r10)
            goto Lbe
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.String r8 = r0.b
            ads_mobile_sdk.dd r9 = r0.a
            p002kotlin.dern.saneness(r10)
            r6 = r9
            r9 = r8
            r8 = r6
            goto L90
        L42:
            p002kotlin.dern.saneness(r10)
            java.lang.String r10 = "log"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r10)
            saneness.beclomethasone r10 = r7.q
            saneness.logician r2 = ads_mobile_sdk.ho0.o()
            java.lang.String r5 = "newBuilder(...)"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            java.lang.String r5 = "builder"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            java.lang.String r5 = "value"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r5)
            r2.attabal(r9)
            ads_mobile_sdk.xm0 r9 = r2.a()
            java.lang.String r2 = "build(...)"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            ads_mobile_sdk.ho0 r9 = (ads_mobile_sdk.ho0) r9
            r10.attabal(r9)
            saneness.beclomethasone r9 = r7.q
            ads_mobile_sdk.xm0 r9 = r9.a()
            ads_mobile_sdk.io0 r9 = (ads_mobile_sdk.io0) r9
            byte[] r9 = r9.a()
            java.lang.String r10 = "toByteArray(...)"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            r0.a = r7
            r0.b = r8
            r0.e = r4
            java.lang.Object r10 = r7.a(r9, r0)
            if (r10 != r1) goto L8e
            goto Lbd
        L8e:
            r9 = r8
            r8 = r7
        L90:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lbe
            ads_mobile_sdk.gc r10 = r8.i
            r0.a = r8
            r2 = 0
            r0.b = r2
            r0.e = r3
            saneness.delouse r10 = r10.a
            java.lang.Object r10 = r10.get()
            androidx.datastore.core.competently r10 = (androidx.datastore.core.competently) r10
            ads_mobile_sdk.ec r3 = new ads_mobile_sdk.ec
            r3.<init>(r9, r2)
            java.lang.Object r9 = r10.attabal(r3, r0)
            java.lang.Object r10 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            if (r9 != r10) goto Lb9
            goto Lbb
        Lb9:
            kotlin.Unit r9 = p002kotlin.Unit.f29295attabal
        Lbb:
            if (r9 != r1) goto Lbe
        Lbd:
            return r1
        Lbe:
            saneness.beclomethasone r8 = r8.q
            r8.wireman()
            kotlin.Unit r8 = p002kotlin.Unit.f29295attabal
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dd.a(java.lang.String, ads_mobile_sdk.co0, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.mutative
    public final Object b(long j, wretchedly.dern dernVar) throws Throwable {
        pc pcVar;
        formularization.attabal attabalVar;
        dd ddVar;
        Throwable th;
        formularization.attabal attabalVar2;
        if (dernVar instanceof pc) {
            pcVar = (pc) dernVar;
            int i = pcVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pcVar.f = i - Integer.MIN_VALUE;
            } else {
                pcVar = new pc(this, dernVar);
            }
        } else {
            pcVar = new pc(this, dernVar);
        }
        Object obj = pcVar.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = pcVar.f;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                attabalVar = this.w;
                pcVar.a = this;
                pcVar.b = attabalVar;
                pcVar.c = j;
                pcVar.f = 1;
                if (attabalVar.attabal(null, pcVar) != objBeachfront) {
                    ddVar = this;
                }
                return objBeachfront;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar2 = (formularization.attabal) pcVar.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    Unit unit = Unit.f29295attabal;
                    attabalVar2.wireman(null);
                    return unit;
                } catch (Throwable th2) {
                    th = th2;
                    attabalVar = attabalVar2;
                    attabalVar.wireman(null);
                    throw th;
                }
            }
            j = pcVar.c;
            formularization.attabal attabalVar3 = pcVar.b;
            ddVar = (dd) pcVar.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar3;
            if (p002kotlin.time.saneness.formularize(j, ddVar.y) > 0 && !ddVar.x) {
                ddVar.x = true;
                ddVar.y = j;
                pcVar.a = attabalVar;
                try {
                    pcVar.b = null;
                    pcVar.f = 2;
                    Object objE = ddVar.e(pcVar);
                    if (objE != objBeachfront) {
                        formularization.attabal attabalVar4 = attabalVar;
                        obj = objE;
                        attabalVar2 = attabalVar4;
                        Unit unit2 = Unit.f29295attabal;
                        attabalVar2.wireman(null);
                        return unit2;
                    }
                    return objBeachfront;
                } catch (Throwable th3) {
                    th = th3;
                    attabalVar.wireman(null);
                    throw th;
                }
            }
            Unit unit3 = Unit.f29295attabal;
            attabalVar.wireman(null);
            return unit3;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(byte[] bArr, wretchedly.dern dernVar) {
        yc ycVar;
        if (dernVar instanceof yc) {
            ycVar = (yc) dernVar;
            int i = ycVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ycVar.c = i - Integer.MIN_VALUE;
            } else {
                ycVar = new yc(this, dernVar);
            }
        } else {
            ycVar = new yc(this, dernVar);
        }
        Object objSaneness = ycVar.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ycVar.c;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(objSaneness);
                xt0 xt0VarA = new wt0().a(this.e.Z()).b(CommonGatewayClient.HEADER_PROTOBUF, bArr).a();
                hobby hobbyVar = this.g;
                ycVar.c = 1;
                objSaneness = hobby.saneness(hobbyVar, xt0VarA, null, ycVar, 14);
                if (objSaneness == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(objSaneness);
            }
            return igo.attabal.attabal(((spartacist) objSaneness) instanceof tn0);
        } catch (Exception e) {
            triweekly triweeklyVar = kn0.a;
            kn0.b("Failed to ping RCS payload: " + e, null);
            return igo.attabal.attabal(false);
        }
    }
}
