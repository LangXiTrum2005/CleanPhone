package ads_mobile_sdk;

import android.content.Context;
import android.os.Bundle;
import formularization.beachfront;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;
import saneness.digress;
import saneness.evenfall;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class wg0 {
    public final Context a;
    public final loun b;
    public final ri2 c;
    public final jk0 d;
    public final taiyuan e;
    public final formularization.attabal f;
    public String g;

    public wg0(Context applicationContext, loun traceLogger, ri2 rootTraceCreator, jk0 flags) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = applicationContext;
        this.b = traceLogger;
        this.c = rootTraceCreator;
        this.d = flags;
        this.e = p002kotlin.saneness.saneness(new ug0(this));
        this.f = beachfront.saneness(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object a(wg0 wg0Var, wretchedly.dern dernVar) {
        vg0 vg0Var;
        formularization.attabal attabalVar;
        if (dernVar instanceof vg0) {
            vg0Var = (vg0) dernVar;
            int i = vg0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                vg0Var.e = i - Integer.MIN_VALUE;
            } else {
                vg0Var = new vg0(wg0Var, dernVar);
            }
        } else {
            vg0Var = new vg0(wg0Var, dernVar);
        }
        Object obj = vg0Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = vg0Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = wg0Var.f;
            vg0Var.a = wg0Var;
            vg0Var.b = attabalVar;
            vg0Var.e = 1;
            if (attabalVar.attabal(null, vg0Var) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = vg0Var.b;
            wg0 wg0Var2 = vg0Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            wg0Var = wg0Var2;
        }
        try {
            String string = wg0Var.g;
            if (string == null) {
                Object objA = wg0Var.a("getGmpAppId");
                string = objA != null ? objA.toString() : null;
                wg0Var.g = string;
            }
            return string;
        } finally {
            attabalVar.wireman(null);
        }
    }

    public final Object a(String str) {
        try {
            if (this.e.getValue() != null) {
                return Class.forName(this.d.C()).getMethod(str, null).invoke(this.e.getValue(), null);
            }
        } catch (Exception e) {
            y13.a("Exception while calling Firebase Analytics SDK method", e, 4);
            ((d13) this.b).a("FirebaseAnalyticsAdapter.invokeMethod " + str, e);
        }
        return null;
    }

    public static Unit a(wg0 wg0Var, tg0 tg0Var, Bundle bundle, String str) {
        ri2 ri2Var = wg0Var.c;
        no0 no0Var = no0.CUI_NAME_LOG_EVENT_TO_FIREBASE_ANALYTICS;
        List listFormularize = adultoid.formularize();
        l13 l13VarAttabal = digress.attabal();
        if (j13.c() == null) {
            v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13VarAttabal);
            try {
                try {
                    if (wg0Var.e.getValue() != null) {
                        Method method = Class.forName(wg0Var.d.C()).getMethod("logEvent", String.class, String.class, Bundle.class);
                        Bundle bundle2 = bundle.getBundle(tg0Var.a());
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        Intrinsics.beachfront(bundle2);
                        bundle2.putLong("_aeid", Long.parseLong(str));
                        String str2 = tg0Var.a;
                        tg0 tg0Var2 = tg0.b;
                        if (Intrinsics.wireman(str2, "_ac")) {
                            bundle2.putInt("_r", 1);
                        }
                        method.invoke(wg0Var.e.getValue(), "am", tg0Var.a(), bundle2);
                    }
                } catch (Throwable th) {
                    try {
                        v62VarA.b(th);
                        if (!(th instanceof evenfall)) {
                            v62VarA.a(th);
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
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            interaction.saneness.attabal(v62VarA, th2);
                            throw th3;
                        }
                    }
                }
            } catch (Exception e) {
                y13.a("Exception while calling Firebase Analytics SDK logEvent method", e, 4);
                ((d13) wg0Var.b).a("FirebaseAnalyticsAdapter.invokeMethod logEvent for " + tg0Var, e);
            }
            Unit unit = Unit.f29295attabal;
            interaction.saneness.attabal(v62VarA, null);
        } else {
            w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
            try {
                try {
                    if (wg0Var.e.getValue() != null) {
                        Method method2 = Class.forName(wg0Var.d.C()).getMethod("logEvent", String.class, String.class, Bundle.class);
                        Bundle bundle3 = bundle.getBundle(tg0Var.a());
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        Intrinsics.beachfront(bundle3);
                        bundle3.putLong("_aeid", Long.parseLong(str));
                        String str3 = tg0Var.a;
                        tg0 tg0Var3 = tg0.b;
                        if (Intrinsics.wireman(str3, "_ac")) {
                            bundle3.putInt("_r", 1);
                        }
                        method2.invoke(wg0Var.e.getValue(), "am", tg0Var.a(), bundle3);
                    }
                } catch (Throwable th4) {
                    try {
                        w03VarA.b(th4);
                        if (!(th4 instanceof evenfall)) {
                            w03VarA.a(th4);
                            if (!(th4 instanceof TimeoutCancellationException)) {
                                if (!(th4 instanceof CancellationException)) {
                                    if (th4 instanceof yn0) {
                                        throw th4;
                                    }
                                    throw new gn0(th4);
                                }
                                throw new bn0(th4);
                            }
                            throw new cp0(th4);
                        }
                        throw th4;
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            interaction.saneness.attabal(w03VarA, th5);
                            throw th6;
                        }
                    }
                }
            } catch (Exception e2) {
                y13.a("Exception while calling Firebase Analytics SDK logEvent method", e2, 4);
                ((d13) wg0Var.b).a("FirebaseAnalyticsAdapter.invokeMethod logEvent for " + tg0Var, e2);
            }
            Unit unit2 = Unit.f29295attabal;
            interaction.saneness.attabal(w03VarA, null);
        }
        return Unit.f29295attabal;
    }
}
