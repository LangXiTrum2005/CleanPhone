package wn;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import com.ironsource.sdk.controller.y;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import ti.b;
import tj.i0;
import wi.j;
import xi.m;
import xi.n;
import xi.o;
import xi.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lwn/a;", "Lti/b;", "Lxi/n;", "<init>", "()V", "app_set_id_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class a implements b, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f53479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f53480b;

    @Override // ti.b
    public final void onAttachedToEngine(ti.a flutterPluginBinding) {
        kotlin.jvm.internal.n.f(flutterPluginBinding, "flutterPluginBinding");
        Context context = flutterPluginBinding.f50787a;
        kotlin.jvm.internal.n.e(context, "getApplicationContext(...)");
        this.f53480b = context;
        p pVar = new p(flutterPluginBinding.f50789c, "app_set_id");
        this.f53479a = pVar;
        pVar.b(this);
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        p pVar = this.f53479a;
        if (pVar != null) {
            pVar.b(null);
        } else {
            kotlin.jvm.internal.n.l("channel");
            throw null;
        }
    }

    @Override // xi.n
    public final void onMethodCall(m call, o oVar) {
        kotlin.jvm.internal.n.f(call, "call");
        if (!kotlin.jvm.internal.n.a(call.f53822a, "getIdentifier")) {
            ((j) oVar).c();
            return;
        }
        Context context = this.f53480b;
        if (context == null) {
            kotlin.jvm.internal.n.l("engineContext");
            throw null;
        }
        AppSetIdClient client = AppSet.getClient(context);
        kotlin.jvm.internal.n.e(client, "getClient(...)");
        Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
        kotlin.jvm.internal.n.e(appSetIdInfo, "getAppSetIdInfo(...)");
        j jVar = (j) oVar;
        kotlin.jvm.internal.n.c(appSetIdInfo.addOnSuccessListener(new i0(new y(jVar, 9), 8)).addOnFailureListener(new b6.a(jVar, 7)));
    }
}
