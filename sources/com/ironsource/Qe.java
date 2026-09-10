package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Qe implements Re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0300d9 f27108a;

    public Qe() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final Ae b(Context context, Ge ge2, C0627ve c0627ve) throws Throwable {
        Ae aeA = a(context, ge2, c0627ve);
        if (aeA instanceof Ae.a) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
            Ve veA = ge2.a(context, c0627ve.d());
            if (veA != null && veA.q()) {
                Ae.b bVar = new Ae.b(new C0645we(veA), null);
                IronSourceError ironSourceErrorBuildUsingCachedConfigurationError = ErrorBuilder.buildUsingCachedConfigurationError(c0627ve.d(), c0627ve.f());
                IronSourceLoggerManager.getLogger().log(ironSourceTag, ironSourceErrorBuildUsingCachedConfigurationError + ": " + bVar.d(), 1);
                ge2.b();
                return bVar;
            }
        }
        return aeA;
    }

    @Override // com.ironsource.Re
    public void a(Context context, C0627ve request, Ge tools, InterfaceC0591te listener) throws Throwable {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(request, "request");
        kotlin.jvm.internal.n.f(tools, "tools");
        kotlin.jvm.internal.n.f(listener, "listener");
        String strF = request.f();
        if (strF == null) {
            strF = "";
        }
        tools.a("userId", strF);
        tools.a("appKey", request.d());
        tools.g().i(request.f());
        tools.f();
        Ae aeB = b(context, tools, request);
        if (aeB instanceof Ae.b) {
            Ae.b bVar = (Ae.b) aeB;
            listener.a(new C0484ne(bVar.d(), null, bVar.c()));
        } else if (aeB instanceof Ae.a) {
            Ae.a aVar = (Ae.a) aeB;
            listener.a(aVar.c(), aVar.d());
        }
    }

    public Qe(C0300d9 performanceMeasurer) {
        kotlin.jvm.internal.n.f(performanceMeasurer, "performanceMeasurer");
        this.f27108a = performanceMeasurer;
    }

    public /* synthetic */ Qe(C0300d9 c0300d9, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? new C0300d9(null, null, 3, null) : c0300d9);
    }

    private final Ae a(Context context, Ge ge2, C0627ve c0627ve) throws Throwable {
        C0520pe c0520pe;
        try {
            String strC = ge2.c(context);
            if (TextUtils.isEmpty(strC)) {
                strC = ge2.a(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str = strC;
            C0265ba c0265baC = ge2.c();
            String strA = Xe.a(context, c0627ve.d(), c0627ve.f(), str, null, true, c0265baC != null ? c0265baC.f() : null, false);
            String string = C0336f9.a().toString();
            kotlin.jvm.internal.n.e(string, "createRequestData().toString()");
            InterfaceC0370h7 interfaceC0370h7A = C0334f7.a(strA, string);
            if (interfaceC0370h7A instanceof InterfaceC0370h7.a) {
                IronLog.INTERNAL.warning("HTTP init request failed: " + ((InterfaceC0370h7.a) interfaceC0370h7A).a());
                return new Ae.a(a((InterfaceC0370h7.a) interfaceC0370h7A), null, 2, null);
            }
            if (interfaceC0370h7A instanceof InterfaceC0370h7.b) {
                String strD = ((InterfaceC0370h7.b) interfaceC0370h7A).d();
                if (ge2.d()) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("encrypt");
                    JSONObject jSONObject = new JSONObject(strD);
                    String encryptedResponse = jSONObject.optString(Ve.f27442n);
                    if (TextUtils.isEmpty(encryptedResponse)) {
                        ironLog.warning("encryptedResponse is empty - return null");
                        return new Ae.a(new C0520pe(C0520pe.f30018g, C0573se.f30699h), null, 2, null);
                    }
                    boolean zOptBoolean = jSONObject.optBoolean("compression", false);
                    kotlin.jvm.internal.n.e(encryptedResponse, "encryptedResponse");
                    strD = a(encryptedResponse, zOptBoolean);
                    if (TextUtils.isEmpty(strD)) {
                        ironLog.warning("encoded response invalid - return null");
                        ge2.e();
                        return new Ae.a(new C0520pe(C0520pe.f30017f, C0573se.f30698g), null, 2, null);
                    }
                }
                this.f27108a.a(strD);
                Ve ve = new Ve(context, c0627ve.d(), c0627ve.f(), strD);
                ve.a(Ve.a.SERVER);
                if (!ve.q()) {
                    IronLog.INTERNAL.warning("response invalid - return null");
                    String strE = ve.e();
                    if (strE == null) {
                        strE = "Unknown";
                    }
                    return new Ae.a(new C0520pe(C0520pe.f30016e, strE), this.f27108a);
                }
                return new Ae.b(new C0645we(ve), this.f27108a);
            }
            throw new aa.b((byte) 0, 20);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.warning("exception = " + e10);
            if (e10 instanceof JSONException) {
                c0520pe = new C0520pe(C0520pe.f30016e, "serverResponseIsNotValid");
            } else {
                c0520pe = new C0520pe(510, "internal error");
            }
            return new Ae.a(c0520pe, null, 2, null);
        }
    }

    private final String a(String str, boolean z10) {
        if (z10) {
            String strD = J9.d(C0421k5.b().c(), str);
            kotlin.jvm.internal.n.e(strD, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
            return strD;
        }
        String strB = J9.b(C0421k5.b().c(), str);
        kotlin.jvm.internal.n.e(strB, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
        return strB;
    }

    private final C0520pe a(InterfaceC0370h7.a aVar) {
        return new C0520pe(aVar.b() ? C0520pe.f30015d : C0520pe.f30019h, aVar.a());
    }
}
