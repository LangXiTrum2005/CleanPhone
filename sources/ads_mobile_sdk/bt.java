package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import complexometry.formularize;
import formularization.beachfront;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.saran;
import kotlinx.coroutines.splinterproof;
import manhattanization.ConfigLoaderRequest;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.amphitheatre;
import saneness.juju;
import saneness.loun;
import saneness.rockless;
import saneness.supercargo;

/* JADX INFO: loaded from: classes.dex */
public final class bt extends ox0 implements rockless {
    public final CoroutineContext c;
    public final saran d;
    public final Context e;
    public final String f;
    public final String g;
    public final supercargo h;
    public final ug i;
    public final v8 j;
    public final loun k;
    public final amphitheatre l;
    public final jk0 m;
    public final ri2 n;
    public final iv o;
    public final formularization.attabal p;
    public boolean q;
    public long r;
    public long s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt(CoroutineContext backgroundContext, saran backgroundScope, Context context, String applicationId, String afmaVersion, supercargo javascriptEngine, ug appState, v8 adapterInitializer, loun traceLogger, amphitheatre clock, jk0 flags, ri2 rootTraceCreator, iv consentManager) {
        super((no0) null, 1);
        Intrinsics.checkNotNullParameter(backgroundContext, "backgroundContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(javascriptEngine, "javascriptEngine");
        Intrinsics.checkNotNullParameter(appState, "appState");
        Intrinsics.checkNotNullParameter(adapterInitializer, "adapterInitializer");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        this.c = backgroundContext;
        this.d = backgroundScope;
        this.e = context;
        this.f = applicationId;
        this.g = afmaVersion;
        this.h = javascriptEngine;
        this.i = appState;
        this.j = adapterInitializer;
        this.k = traceLogger;
        this.l = clock;
        this.m = flags;
        this.n = rootTraceCreator;
        this.o = consentManager;
        this.p = beachfront.saneness(false, 1, null);
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        this.r = companion.dern();
        this.s = companion.dern();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object a(bt btVar, boolean z, String str, wretchedly.dern dernVar) {
        qs qsVar;
        Integer numValueOf;
        boolean z2;
        bt btVar2;
        boolean z3;
        formularization.attabal attabalVar;
        bt btVar3 = btVar;
        btVar3.getClass();
        if (dernVar instanceof qs) {
            qsVar = (qs) dernVar;
            int i = qsVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                qsVar.f = i - Integer.MIN_VALUE;
            } else {
                qsVar = new qs(btVar3, dernVar);
            }
        } else {
            qsVar = new qs(btVar3, dernVar);
        }
        Object objA = qsVar.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = qsVar.f;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z4 = qsVar.c;
                bt btVar4 = qsVar.a;
                p002kotlin.dern.saneness(objA);
                z2 = z4;
                btVar3 = btVar4;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z3 = qsVar.c;
                attabalVar = qsVar.b;
                btVar2 = qsVar.a;
                p002kotlin.dern.saneness(objA);
            }
            try {
                btVar2.q = false;
                Unit unit = Unit.f29295attabal;
                return igo.attabal.attabal(z3);
            } finally {
                attabalVar.wireman(null);
            }
        }
        p002kotlin.dern.saneness(objA);
        String str2 = btVar3.f;
        String packageName = btVar3.e.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        try {
            ApplicationInfo applicationInfo = btVar3.e.getApplicationInfo();
            numValueOf = applicationInfo == null ? null : Integer.valueOf(btVar3.e.getPackageManager().getPackageInfo(applicationInfo.packageName, 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        z2 = z;
        JsonObject asJsonObject = new Gson().toJsonTree(new ConfigLoaderRequest(str2, str, z2, packageName, numValueOf, btVar3.g, btVar3.m.s.dern())).getAsJsonObject();
        Intrinsics.beachfront(asJsonObject);
        qsVar.a = btVar3;
        qsVar.c = z2;
        qsVar.f = 1;
        objA = btVar3.a(asJsonObject, qsVar);
        if (objA == objBeachfront) {
            return objBeachfront;
        }
        boolean zBooleanValue = ((Boolean) objA).booleanValue();
        jk0 jk0Var = btVar3.m;
        if ((jk0Var.v || jk0Var.w > 0.0d) && zBooleanValue && !z2) {
            saran saranVar = btVar3.d;
            rs block = new rs(btVar3, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        formularization.attabal attabalVar2 = btVar3.p;
        qsVar.a = btVar3;
        qsVar.b = attabalVar2;
        qsVar.c = zBooleanValue;
        qsVar.f = 2;
        if (attabalVar2.attabal(null, qsVar) == objBeachfront) {
            return objBeachfront;
        }
        btVar2 = btVar3;
        z3 = zBooleanValue;
        attabalVar = attabalVar2;
        btVar2.q = false;
        Unit unit2 = Unit.f29295attabal;
        return igo.attabal.attabal(z3);
    }

    @Override // ads_mobile_sdk.ox0
    public final Object e(wretchedly.dern dernVar) {
        saran saranVar = this.d;
        zs block = new zs(this, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        return new tn0(Unit.f29295attabal);
    }

    public static final boolean a(bt btVar) {
        if (btVar.q) {
            return false;
        }
        long j = btVar.r;
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        if (!p002kotlin.time.saneness.kowloon(j, companion.dern())) {
            btVar.l.getClass();
            long jMerc = p002kotlin.time.saneness.merc(p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS), btVar.r);
            jk0 jk0Var = btVar.m;
            jk0Var.getClass();
            if (p002kotlin.time.saneness.formularize(jMerc, ((p002kotlin.time.saneness) jk0Var.a("gads:fetch_app_settings_using_cld:throttle_interval_ms", juju.attabal(5, DurationUnit.SECONDS, "gads:fetch_app_settings_using_cld:throttle_interval_ms", X3.i.W), zk.j)).getRawValue()) < 0) {
                return false;
            }
        }
        if (p002kotlin.time.saneness.kowloon(btVar.s, companion.dern())) {
            return true;
        }
        btVar.l.getClass();
        long jMerc2 = p002kotlin.time.saneness.merc(p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS), btVar.s);
        jk0 jk0Var2 = btVar.m;
        jk0Var2.getClass();
        return p002kotlin.time.saneness.formularize(jMerc2, ((p002kotlin.time.saneness) jk0Var2.a("gads:fetch_app_settings_using_cld:refresh_interval_ms", juju.attabal(2, DurationUnit.HOURS, "gads:fetch_app_settings_using_cld:refresh_interval_ms", X3.i.W), zk.j)).getRawValue()) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
    
        if (ads_mobile_sdk.ug.a(r12, r2, r8, r0) == r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.gson.JsonObject] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v9, types: [ads_mobile_sdk.bt] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [ads_mobile_sdk.bt] */
    /* JADX WARN: Type inference failed for: r4v9, types: [ads_mobile_sdk.bt] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.google.gson.JsonObject r11, wretchedly.dern r12) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bt.a(com.google.gson.JsonObject, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(bt btVar, wretchedly.dern dernVar) {
        ts tsVar;
        formularization.attabal attabalVar;
        long jElapsedRealtime;
        if (dernVar instanceof ts) {
            tsVar = (ts) dernVar;
            int i = tsVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                tsVar.e = i - Integer.MIN_VALUE;
            } else {
                tsVar = new ts(btVar, dernVar);
            }
        } else {
            tsVar = new ts(btVar, dernVar);
        }
        Object obj = tsVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = tsVar.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = btVar.p;
            tsVar.a = btVar;
            tsVar.b = attabalVar;
            tsVar.e = 1;
            if (attabalVar.attabal(null, tsVar) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = tsVar.b;
            bt btVar2 = tsVar.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            btVar = btVar2;
        }
        try {
            if (p002kotlin.time.saneness.kowloon(btVar.s, p002kotlin.time.saneness.INSTANCE.dern())) {
                jElapsedRealtime = 0;
            } else {
                btVar.l.getClass();
                jElapsedRealtime = SystemClock.elapsedRealtime() - p002kotlin.time.saneness.adultoid(btVar.s);
            }
            return igo.attabal.marial(jElapsedRealtime);
        } finally {
            attabalVar.wireman(null);
        }
    }

    @Override // saneness.rockless
    public final Object a(formularize formularizeVar, wretchedly.dern dernVar) {
        return a(this, formularizeVar, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object a(bt btVar, formularize formularizeVar, wretchedly.dern dernVar) {
        vs vsVar;
        if (dernVar instanceof vs) {
            vsVar = (vs) dernVar;
            int i = vsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vsVar.c = i - Integer.MIN_VALUE;
            } else {
                vsVar = new vs(btVar, dernVar);
            }
        } else {
            vsVar = new vs(btVar, dernVar);
        }
        Object objA = vsVar.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = vsVar.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            String adUnitId = formularizeVar.getAdUnitId();
            vsVar.c = 1;
            objA = btVar.a(adUnitId, vsVar);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objA);
        }
        ((Boolean) objA).getClass();
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, wretchedly.dern dernVar) {
        at atVar;
        bt btVar;
        if (dernVar instanceof at) {
            atVar = (at) dernVar;
            int i = atVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                atVar.e = i - Integer.MIN_VALUE;
            } else {
                atVar = new at(this, dernVar);
            }
        } else {
            atVar = new at(this, dernVar);
        }
        Object obj = atVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = atVar.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            jk0 jk0Var = this.m;
            jk0Var.getClass();
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            long rawValue = ((p002kotlin.time.saneness) jk0Var.a("gads:cld_fetch_delay_on_cache_hit", juju.attabal(60, DurationUnit.SECONDS, "gads:cld_fetch_delay_on_cache_hit", X3.i.W), zk.l)).getRawValue();
            atVar.a = this;
            atVar.b = str;
            atVar.e = 1;
            if (splinterproof.saneness(rawValue, atVar) != objBeachfront) {
                btVar = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
            return obj;
        }
        str = atVar.b;
        btVar = atVar.a;
        p002kotlin.dern.saneness(obj);
        atVar.a = null;
        atVar.b = null;
        atVar.e = 2;
        Object objCompetently = impromptu.competently(btVar.c, new us(btVar, false, str, null), atVar);
        return objCompetently == objBeachfront ? objBeachfront : objCompetently;
    }
}
