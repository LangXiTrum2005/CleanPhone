package ads_mobile_sdk;

import com.google.gson.Gson;
import complexometry.formularize;
import kotlinx.coroutines.flow.arytenoidectomy;
import kotlinx.coroutines.flow.marial;
import kotlinx.coroutines.saran;
import liquory.beachfront;
import liquory.competently;
import p002kotlin.Pair;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.adultoid;
import saneness.alloy;
import saneness.coffeecake;
import saneness.eigenvalue;
import saneness.environ;
import saneness.evaluating;
import saneness.forkful;
import saneness.hobby;
import saneness.phytopathogen;
import saneness.rockless;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class ra2 extends s92 {
    public final adultoid z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra2(coffeecake componentProvider, op2 signalGenerationMap, py cryptoUtil, String adString, saran loadScope, saran backgroundScope, l13 traceMetaSet, jk0 flags, ri2 rootTraceCreator, String publisherRequestId, yf2 requestType, String appId, gy0 inspectorAdLifecycleMonitor, Gson gson, hobby httpClient, b63 urlPinger, arytenoidectomy cancellationChannel) {
        super(signalGenerationMap, cryptoUtil, adString, gson, httpClient, urlPinger, loadScope, backgroundScope, traceMetaSet, flags, rootTraceCreator, publisherRequestId, requestType, appId, inspectorAdLifecycleMonitor, cancellationChannel);
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        Intrinsics.checkNotNullParameter(signalGenerationMap, "signalGenerationMap");
        Intrinsics.checkNotNullParameter(cryptoUtil, "cryptoUtil");
        Intrinsics.checkNotNullParameter(adString, "adString");
        Intrinsics.checkNotNullParameter(loadScope, "loadScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(publisherRequestId, "publisherRequestId");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(inspectorAdLifecycleMonitor, "inspectorAdLifecycleMonitor");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(urlPinger, "urlPinger");
        Intrinsics.checkNotNullParameter(cancellationChannel, "cancellationChannel");
        this.z = componentProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ads_mobile_sdk.s92
    public final Object a(String str, jp2 jp2Var, p92 p92Var) {
        adjudge.saneness sanenessVar = jp2Var.b;
        beachfront beachfrontVar = sanenessVar instanceof beachfront ? (beachfront) sanenessVar : null;
        if (beachfrontVar == null || !(sanenessVar instanceof competently)) {
            return marial.gintrap(new Pair(s92.w, null));
        }
        Object obj = this.z.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        t60 t60Var = (t60) ((environ) a((eigenvalue) obj, sanenessVar, str, jp2Var));
        t60Var.k = beachfrontVar;
        t60Var.j = new evaluating();
        t60Var.l = new forkful();
        t60Var.m = Boolean.FALSE;
        vilification.saneness(t60Var.b, jp2.class);
        vilification.saneness(t60Var.c, String.class);
        vilification.saneness(t60Var.d, formularize.class);
        vilification.saneness(t60Var.e, yf2.class);
        vilification.saneness(t60Var.f, Boolean.class);
        vilification.saneness(t60Var.g, xb2.class);
        vilification.saneness(t60Var.h, j71.class);
        vilification.saneness(t60Var.i, gy0.class);
        vilification.saneness(t60Var.j, phytopathogen.class);
        vilification.saneness(t60Var.k, beachfront.class);
        vilification.saneness(t60Var.l, rockless.class);
        vilification.saneness(t60Var.m, Boolean.class);
        return ((j31) ((alloy) new u60(t60Var.a, t60Var.b, t60Var.c, t60Var.d, t60Var.f, t60Var.g, t60Var.h, t60Var.i, t60Var.j, t60Var.k, t60Var.l, t60Var.m).A.get())).a(p92Var);
    }
}
