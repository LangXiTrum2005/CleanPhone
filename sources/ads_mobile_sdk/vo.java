package ads_mobile_sdk;

import android.net.Uri;
import android.util.Base64;
import com.google.common.base.triweekly;
import com.ironsource.X3;
import formularization.beachfront;
import http.arytenoidectomy;
import http.kowloon;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.preprohormone;
import kotlinx.coroutines.saran;
import kotlinx.coroutines.walach;
import org.chromium.support_lib_boundary.util.Features;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.graveside;
import p002kotlin.collections.polder;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Regex;
import p002kotlin.text.StringsKt;
import patroclinal.formularize;
import saneness.evenfall;
import saneness.godward;
import saneness.grout;
import saneness.microchemistry;

/* JADX INFO: loaded from: classes.dex */
public final class vo extends godward {
    public final saran c;
    public final microchemistry d;
    public final ri2 e;
    public final jk0 f;
    public final ip0 g;
    public final formularization.attabal h;
    public walach i;
    public no j;
    public monroe k;

    public vo(saran backgroundScope, microchemistry webviewCompatWrapper, ri2 rootTraceCreator, jk0 flags, ip0 gmaUtil) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(webviewCompatWrapper, "webviewCompatWrapper");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        this.c = backgroundScope;
        this.d = webviewCompatWrapper;
        this.e = rootTraceCreator;
        this.f = flags;
        this.g = gmaUtil;
        this.h = beachfront.saneness(false, 1, null);
    }

    public static final no a(vo voVar) {
        ri2 ri2Var = voVar.e;
        no0 no0Var = no0.CUI_NAME_GET_WEBVIEW_VARIATIONS;
        List listFormularize = adultoid.formularize();
        l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
        if (j13.b().a == null) {
            v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
            try {
                try {
                    voVar.d.getClass();
                    String strApical = kowloon.apical();
                    Intrinsics.checkNotNullExpressionValue(strApical, "getVariationsHeader(...)");
                    if (StringsKt.empress(strApical)) {
                        triweekly triweeklyVar = kn0.a;
                        kn0.a(oo.a);
                        interaction.saneness.attabal(v62VarA, null);
                        return null;
                    }
                    try {
                        mo moVarA = mo.a(Base64.decode(strApical, 0));
                        jk0 jk0Var = voVar.f;
                        jk0Var.getClass();
                        Intrinsics.checkNotNullParameter("gads:parse_chrome_variations_client_header", X3.i.W);
                        vp vpVarA = ((Boolean) jk0Var.a("gads:parse_chrome_variations_client_header", Boolean.TRUE, zk.b)).booleanValue() ? vp.a(Base64.decode(strApical, 2), vf0.b()) : null;
                        Intrinsics.beachfront(moVarA);
                        no noVar = new no(strApical, moVarA, vpVarA);
                        triweekly triweeklyVar2 = kn0.a;
                        kn0.a(new po(noVar));
                        voVar.j = noVar;
                        interaction.saneness.attabal(v62VarA, null);
                        return noVar;
                    } catch (Throwable exception) {
                        Intrinsics.checkNotNullParameter(exception, "exception");
                        w03 w03VarA = j13.a();
                        w03VarA.e().m = false;
                        w03VarA.a(exception);
                        interaction.saneness.attabal(v62VarA, null);
                    }
                } catch (Exception exception2) {
                    Intrinsics.checkNotNullParameter(exception2, "exception");
                    w03 w03VarA2 = j13.a();
                    w03VarA2.e().m = false;
                    w03VarA2.a(exception2);
                    interaction.saneness.attabal(v62VarA, null);
                }
            } catch (Throwable th) {
                try {
                    v62VarA.b(th);
                    if (th instanceof evenfall) {
                        throw th;
                    }
                    v62VarA.a(th);
                    if (th instanceof TimeoutCancellationException) {
                        throw new cp0(th);
                    }
                    if (th instanceof CancellationException) {
                        throw new bn0(th);
                    }
                    if (th instanceof yn0) {
                        throw th;
                    }
                    throw new gn0(th);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        interaction.saneness.attabal(v62VarA, th2);
                        throw th3;
                    }
                }
            }
        } else {
            w03 w03VarA3 = j13.a(no0Var, adultoid.formularize(), true);
            try {
                try {
                    voVar.d.getClass();
                    String strApical2 = kowloon.apical();
                    Intrinsics.checkNotNullExpressionValue(strApical2, "getVariationsHeader(...)");
                    if (StringsKt.empress(strApical2)) {
                        triweekly triweeklyVar3 = kn0.a;
                        kn0.a(oo.a);
                        interaction.saneness.attabal(w03VarA3, null);
                        return null;
                    }
                    try {
                        mo moVarA2 = mo.a(Base64.decode(strApical2, 0));
                        jk0 jk0Var2 = voVar.f;
                        jk0Var2.getClass();
                        Intrinsics.checkNotNullParameter("gads:parse_chrome_variations_client_header", X3.i.W);
                        vp vpVarA2 = ((Boolean) jk0Var2.a("gads:parse_chrome_variations_client_header", Boolean.TRUE, zk.b)).booleanValue() ? vp.a(Base64.decode(strApical2, 2), vf0.b()) : null;
                        Intrinsics.beachfront(moVarA2);
                        no noVar2 = new no(strApical2, moVarA2, vpVarA2);
                        triweekly triweeklyVar4 = kn0.a;
                        kn0.a(new po(noVar2));
                        voVar.j = noVar2;
                        interaction.saneness.attabal(w03VarA3, null);
                        return noVar2;
                    } catch (Throwable exception3) {
                        Intrinsics.checkNotNullParameter(exception3, "exception");
                        w03 w03VarA4 = j13.a();
                        w03VarA4.e().m = false;
                        w03VarA4.a(exception3);
                        interaction.saneness.attabal(w03VarA3, null);
                    }
                } catch (Exception exception4) {
                    Intrinsics.checkNotNullParameter(exception4, "exception");
                    w03 w03VarA5 = j13.a();
                    w03VarA5.e().m = false;
                    w03VarA5.a(exception4);
                    interaction.saneness.attabal(w03VarA3, null);
                }
            } catch (Throwable th4) {
                try {
                    w03VarA3.b(th4);
                    if (th4 instanceof evenfall) {
                        throw th4;
                    }
                    w03VarA3.a(th4);
                    if (th4 instanceof TimeoutCancellationException) {
                        throw new cp0(th4);
                    }
                    if (th4 instanceof CancellationException) {
                        throw new bn0(th4);
                    }
                    if (th4 instanceof yn0) {
                        throw th4;
                    }
                    throw new gn0(th4);
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        interaction.saneness.attabal(w03VarA3, th5);
                        throw th6;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object b(vo voVar, wretchedly.dern dernVar) {
        uo uoVar;
        if (dernVar instanceof uo) {
            uoVar = (uo) dernVar;
            int i = uoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uoVar.c = i - Integer.MIN_VALUE;
            } else {
                uoVar = new uo(voVar, dernVar);
            }
        } else {
            uoVar = new uo(voVar, dernVar);
        }
        Object obj = uoVar.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = uoVar.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            jk0 jk0Var = voVar.f;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:chrome_variations_initialization_task_enabled", X3.i.W);
            if (((Boolean) jk0Var.a("gads:chrome_variations_initialization_task_enabled", Boolean.TRUE, zk.b)).booleanValue()) {
                uoVar.c = 1;
                if (a(voVar, uoVar) == objBeachfront) {
                    return objBeachfront;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return new tn0(Unit.f29295attabal);
    }

    @Override // ads_mobile_sdk.ox0
    public final Object e(wretchedly.dern dernVar) {
        return b(this, dernVar);
    }

    public final Map a(Uri uri) {
        String strA;
        Intrinsics.checkNotNullParameter(uri, "uri");
        jk0 jk0Var = this.f;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:parse_chrome_variations_client_header", X3.i.W);
        if (!((Boolean) jk0Var.a("gads:parse_chrome_variations_client_header", Boolean.TRUE, zk.b)).booleanValue()) {
            return null;
        }
        if (!this.g.c(uri) && !this.g.a(uri)) {
            ip0 ip0Var = this.g;
            ip0Var.getClass();
            Intrinsics.checkNotNullParameter(uri, "uri");
            if (ip0Var.b(uri)) {
                String string = uri.toString();
                jk0 jk0Var2 = ip0Var.c;
                jk0Var2.getClass();
                List defaultValue = graveside.marial("^[^?]*(/mads/gma|/gampad/ads|/pagead/ads).*");
                Intrinsics.checkNotNullParameter("gads:ad_request_url_pattern_match", X3.i.W);
                Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
                List list = (List) jk0Var2.a("gads:ad_request_url_pattern_match", defaultValue, zk.g);
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Regex regex = new Regex((String) it.next());
                        Intrinsics.beachfront(string);
                        if (regex.containsMatchIn(string)) {
                        }
                    }
                }
            }
            return null;
        }
        no noVar = this.j;
        if (noVar == null) {
            cutely.wireman(this.c, null, null, new to(this, null), 3, null);
        }
        if (noVar == null || (strA = noVar.a()) == null) {
            return null;
        }
        jk0 jk0Var3 = this.f;
        grout.attabal(jk0Var3, "gads:client_data_header", X3.i.W, "x-client-data", "defaultValue");
        return polder.beachfront(formularize.attabal((String) jk0Var3.a("gads:client_data_header", "x-client-data", zk.o), strA));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(vo voVar, wretchedly.dern dernVar) {
        qo qoVar;
        formularization.attabal attabalVar;
        walach walachVarAttabal;
        if (dernVar instanceof qo) {
            qoVar = (qo) dernVar;
            int i = qoVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                qoVar.e = i - Integer.MIN_VALUE;
            } else {
                qoVar = new qo(voVar, dernVar);
            }
        } else {
            qoVar = new qo(voVar, dernVar);
        }
        Object obj = qoVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = qoVar.e;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                voVar.d.getClass();
                if (!arytenoidectomy.attabal(Features.GET_VARIATIONS_HEADER)) {
                    return null;
                }
                attabalVar = voVar.h;
                qoVar.a = voVar;
                qoVar.b = attabalVar;
                qoVar.e = 1;
                if (attabalVar.attabal(null, qoVar) != objBeachfront) {
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
                return obj;
            }
            formularization.attabal attabalVar2 = qoVar.b;
            vo voVar2 = qoVar.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            voVar = voVar2;
            no noVar = voVar.j;
            if (noVar != null) {
                walachVarAttabal = preprohormone.attabal(noVar);
            } else {
                walach walachVarSaneness = voVar.i;
                if (walachVarSaneness == null) {
                    saran saranVar = voVar.c;
                    so block = new so(voVar, null);
                    EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
                    Intrinsics.checkNotNullParameter(saranVar, "<this>");
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(block, "block");
                    walachVarSaneness = cutely.saneness(saranVar, context, null, new w13(block, null), 2, null);
                    voVar.i = walachVarSaneness;
                    jk0 jk0Var = voVar.f;
                    jk0Var.getClass();
                    Intrinsics.checkNotNullParameter("gads:chrome_variations_refresh_enabled", X3.i.W);
                    if (((Boolean) jk0Var.a("gads:chrome_variations_refresh_enabled", Boolean.TRUE, zk.b)).booleanValue() && voVar.k == null) {
                        voVar.k = cutely.wireman(voVar.c, null, null, new ro(voVar, null), 3, null);
                    }
                }
                walachVarAttabal = walachVarSaneness;
            }
            attabalVar.wireman(null);
            qoVar.a = null;
            qoVar.b = null;
            qoVar.e = 2;
            Object objDent = walachVarAttabal.dent(qoVar);
            return objDent == objBeachfront ? objBeachfront : objDent;
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
    }
}
