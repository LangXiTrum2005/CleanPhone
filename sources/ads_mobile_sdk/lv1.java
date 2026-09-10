package ads_mobile_sdk;

import android.content.Context;
import android.view.View;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.cord;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.glassmaker;
import saneness.groundwood;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class lv1 extends ox0 {
    public final Context c;
    public final CoroutineContext d;
    public final saran e;
    public final loun f;
    public final ri2 g;
    public final String h;
    public final cord i;
    public final w02 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv1(Context applicationContext, CoroutineContext uiContext, saran backgroundScope, loun traceLogger, ri2 rootTraceCreator, String gmaVersion) {
        super((no0) null, 3);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(gmaVersion, "gmaVersion");
        this.c = applicationContext;
        this.d = uiContext;
        this.e = backgroundScope;
        this.f = traceLogger;
        this.g = rootTraceCreator;
        this.h = gmaVersion;
        this.i = JobKt__JobKt.saneness(null, 1, null);
        this.j = w02.a("Google", gmaVersion);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(lv1 lv1Var, wretchedly.dern dernVar) {
        dv1 dv1Var;
        lv1Var.getClass();
        if (dernVar instanceof dv1) {
            dv1Var = (dv1) dernVar;
            int i = dv1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dv1Var.c = i - Integer.MIN_VALUE;
            } else {
                dv1Var = new dv1(lv1Var, dernVar);
            }
        } else {
            dv1Var = new dv1(lv1Var, dernVar);
        }
        Object obj = dv1Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = dv1Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            loun lounVar = lv1Var.f;
            fv1 fv1Var = new fv1(lv1Var, null);
            dv1Var.c = 1;
            lounVar.getClass();
            if (loun.saneness(lounVar, "ActivateOmid", fv1Var, dv1Var) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        if (!groundwood.f37158attabal.a) {
            y13.a("OMSDK failed to activate.", null, 6);
        }
        return Unit.f29295attabal;
    }

    public final String b() {
        return (String) this.f.attabal("GetOmidVersion", cv1.a);
    }

    @Override // ads_mobile_sdk.ox0
    public final Object e(wretchedly.dern dernVar) {
        saran saranVar = this.e;
        iv1 block = new iv1(this, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        return new tn0(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(lv1 lv1Var, gq0 gq0Var, sz1 sz1Var, iv0 iv0Var, fw fwVar, sz1 sz1Var2, String str, wretchedly.dern dernVar) {
        vu1 vu1Var;
        lv1 lv1Var2;
        sz1 sz1Var3;
        gq0 gq0Var2;
        sz1 sz1Var4;
        String str2;
        if (dernVar instanceof vu1) {
            vu1Var = (vu1) dernVar;
            int i = vu1Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                vu1Var.j = i - Integer.MIN_VALUE;
            } else {
                vu1Var = new vu1(lv1Var, dernVar);
            }
        } else {
            vu1Var = new vu1(lv1Var, dernVar);
        }
        Object obj = vu1Var.h;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = vu1Var.j;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            cord cordVar = lv1Var.i;
            vu1Var.a = lv1Var;
            vu1Var.b = gq0Var;
            vu1Var.c = sz1Var;
            vu1Var.d = iv0Var;
            vu1Var.e = fwVar;
            vu1Var.f = sz1Var2;
            vu1Var.g = str;
            vu1Var.j = 1;
            if (cordVar.starveling(vu1Var) == objBeachfront) {
                return objBeachfront;
            }
            lv1Var2 = lv1Var;
            sz1Var3 = sz1Var;
            gq0Var2 = gq0Var;
            sz1Var4 = sz1Var2;
            str2 = str;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = vu1Var.g;
            sz1 sz1Var5 = vu1Var.f;
            fwVar = vu1Var.e;
            iv0Var = vu1Var.d;
            sz1 sz1Var6 = vu1Var.c;
            gq0 gq0Var3 = vu1Var.b;
            lv1 lv1Var3 = vu1Var.a;
            p002kotlin.dern.saneness(obj);
            str2 = str3;
            sz1Var4 = sz1Var5;
            sz1Var3 = sz1Var6;
            lv1Var2 = lv1Var3;
            gq0Var2 = gq0Var3;
        }
        if (!groundwood.f37158attabal.a) {
            return null;
        }
        iv0 iv0Var2 = iv0Var;
        return lv1Var2.f.attabal("CreateOmidSession", new wu1(lv1Var2, gq0Var2, str2, fwVar, iv0Var2, sz1Var3, sz1Var4));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static Object a(lv1 lv1Var, gq0 gq0Var, String str, String str2, fw fwVar, iv0 iv0Var, sz1 sz1Var, sz1 sz1Var2, wretchedly.dern dernVar) {
        yu1 yu1Var;
        String str3;
        fw fwVar2;
        iv0 iv0Var2;
        sz1 sz1Var3;
        gq0 gq0Var2;
        String str4;
        lv1 lv1Var2;
        sz1 sz1Var4;
        if (dernVar instanceof yu1) {
            yu1Var = (yu1) dernVar;
            int i = yu1Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                yu1Var.k = i - Integer.MIN_VALUE;
            } else {
                yu1Var = new yu1(lv1Var, dernVar);
            }
        } else {
            yu1Var = new yu1(lv1Var, dernVar);
        }
        Object obj = yu1Var.i;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = yu1Var.k;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            cord cordVar = lv1Var.i;
            yu1Var.a = lv1Var;
            yu1Var.b = gq0Var;
            yu1Var.c = str;
            yu1Var.d = str2;
            yu1Var.e = fwVar;
            yu1Var.f = iv0Var;
            yu1Var.g = sz1Var;
            yu1Var.h = sz1Var2;
            yu1Var.k = 1;
            if (cordVar.starveling(yu1Var) == objBeachfront) {
                return objBeachfront;
            }
            str3 = str2;
            fwVar2 = fwVar;
            iv0Var2 = iv0Var;
            sz1Var3 = sz1Var;
            gq0Var2 = gq0Var;
            str4 = str;
            lv1Var2 = lv1Var;
            sz1Var4 = sz1Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sz1Var4 = yu1Var.h;
            sz1 sz1Var5 = yu1Var.g;
            iv0 iv0Var3 = yu1Var.f;
            fw fwVar3 = yu1Var.e;
            str3 = yu1Var.d;
            String str5 = yu1Var.c;
            gq0 gq0Var3 = yu1Var.b;
            lv1 lv1Var3 = yu1Var.a;
            p002kotlin.dern.saneness(obj);
            sz1Var3 = sz1Var5;
            iv0Var2 = iv0Var3;
            lv1Var2 = lv1Var3;
            str4 = str5;
            fwVar2 = fwVar3;
            gq0Var2 = gq0Var3;
        }
        if (!groundwood.f37158attabal.a) {
            return null;
        }
        return lv1Var2.f.attabal("CreateJavascriptAdSession", new zu1(str4, lv1Var2, gq0Var2, str3, fwVar2, iv0Var2, sz1Var3, sz1Var4));
    }

    public final Unit a(glassmaker adSession, View view) {
        Intrinsics.checkNotNullParameter(adSession, "adSession");
        Intrinsics.checkNotNullParameter(view, "view");
        return (Unit) this.f.attabal("RegisterOmidAdView", new hv1(adSession, view));
    }
}
