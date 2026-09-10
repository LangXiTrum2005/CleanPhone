package x5;

import android.content.Context;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lx5/g;", "Lti/b;", "Lx5/f;", "<init>", "()V", "flutter_install_referrer_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class g implements ti.b, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f53659a;

    public final b a(c cVar, a aVar) {
        Context context = this.f53659a;
        n.c(context);
        return new b(cVar, aVar, d.ANDROID, context.getPackageName());
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a flutterPluginBinding) {
        n.f(flutterPluginBinding, "flutterPluginBinding");
        xi.f fVar = flutterPluginBinding.f50789c;
        n.e(fVar, "getBinaryMessenger(...)");
        e.a(f.A9, fVar, this);
        this.f53659a = flutterPluginBinding.f50787a;
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a binding) {
        n.f(binding, "binding");
        xi.f fVar = binding.f50789c;
        n.e(fVar, "getBinaryMessenger(...)");
        e.a(f.A9, fVar, null);
        this.f53659a = null;
    }
}
