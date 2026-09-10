package ii;

import android.app.Activity;
import android.view.Window;
import bc.i;
import defpackage.g;
import fc.f;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import ti.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lii/a;", "Lti/b;", "Lg;", "Lui/a;", "<init>", "()V", "wakelock_plus_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class a implements b, g, ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f43032a;

    @Override // ui.a
    public final void onAttachedToActivity(ui.b binding) {
        Window window;
        n.f(binding, "binding");
        i iVar = this.f43032a;
        if (iVar != null) {
            Activity activity = (Activity) ((f) binding).f40780b;
            iVar.f5553c = activity;
            if (!iVar.f5552b || activity == null || (window = activity.getWindow()) == null) {
                return;
            }
            if (iVar.f5552b) {
                window.addFlags(128);
            } else {
                window.clearFlags(128);
            }
        }
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a flutterPluginBinding) {
        n.f(flutterPluginBinding, "flutterPluginBinding");
        xi.f fVar = flutterPluginBinding.f50789c;
        n.e(fVar, "getBinaryMessenger(...)");
        defpackage.f.a(g.M8, fVar, this);
        this.f43032a = new i(9, false);
    }

    @Override // ui.a
    public final void onDetachedFromActivity() {
        i iVar = this.f43032a;
        if (iVar != null) {
            iVar.f5553c = null;
        }
    }

    @Override // ui.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a binding) {
        n.f(binding, "binding");
        xi.f fVar = binding.f50789c;
        n.e(fVar, "getBinaryMessenger(...)");
        defpackage.f.a(g.M8, fVar, null);
        this.f43032a = null;
    }

    @Override // ui.a
    public final void onReattachedToActivityForConfigChanges(ui.b binding) {
        n.f(binding, "binding");
        onAttachedToActivity(binding);
    }
}
