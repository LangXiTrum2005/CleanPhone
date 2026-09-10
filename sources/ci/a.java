package ci;

import android.content.ContentResolver;
import android.provider.Settings;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import ti.b;
import wi.j;
import xi.m;
import xi.n;
import xi.o;
import xi.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lci/a;", "Lti/b;", "Lxi/n;", "<init>", "()V", "android_id_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class a implements b, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f6434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ContentResolver f6435b;

    @Override // ti.b
    public final void onAttachedToEngine(ti.a flutterPluginBinding) {
        kotlin.jvm.internal.n.f(flutterPluginBinding, "flutterPluginBinding");
        ContentResolver contentResolver = flutterPluginBinding.f50787a.getContentResolver();
        kotlin.jvm.internal.n.e(contentResolver, "getContentResolver(...)");
        this.f6435b = contentResolver;
        p pVar = new p(flutterPluginBinding.f50789c, "android_id");
        this.f6434a = pVar;
        pVar.b(this);
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        p pVar = this.f6434a;
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
        if (!kotlin.jvm.internal.n.a(call.f53822a, "getId")) {
            ((j) oVar).c();
            return;
        }
        try {
            ContentResolver contentResolver = this.f6435b;
            if (contentResolver == null) {
                kotlin.jvm.internal.n.l("contentResolver");
                throw null;
            }
            ((j) oVar).a(Settings.Secure.getString(contentResolver, "android_id"));
        } catch (Exception e10) {
            ((j) oVar).b("ERROR_GETTING_ID", "Failed to get Android ID", e10.getLocalizedMessage());
        }
    }
}
