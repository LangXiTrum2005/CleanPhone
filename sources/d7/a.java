package d7;

import android.os.Build;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import ti.b;
import wi.j;
import xi.m;
import xi.n;
import xi.o;
import xi.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ld7/a;", "Lti/b;", "Lxi/n;", "<init>", "()V", "codewall_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class a implements b, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f38756a;

    @Override // ti.b
    public final void onAttachedToEngine(ti.a flutterPluginBinding) {
        kotlin.jvm.internal.n.f(flutterPluginBinding, "flutterPluginBinding");
        p pVar = new p(flutterPluginBinding.f50789c, "codewall");
        this.f38756a = pVar;
        pVar.b(this);
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        p pVar = this.f38756a;
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
        if (!kotlin.jvm.internal.n.a(call.f53822a, "getPlatformVersion")) {
            ((j) oVar).c();
            return;
        }
        ((j) oVar).a("Android " + Build.VERSION.RELEASE);
    }
}
