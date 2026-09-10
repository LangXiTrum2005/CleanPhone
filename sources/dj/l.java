package dj;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldj/l;", "Lti/b;", "Ldj/h;", "Ldj/e;", "<init>", "()V", "firebase_core_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class l implements ti.b, h, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f38942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f38943b;

    public static a a(mb.i iVar) {
        String str = iVar.f45943a;
        if (str == null) {
            str = "";
        }
        String str2 = iVar.f45944b;
        n.e(str2, "getApplicationId(...)");
        String str3 = iVar.f45947e;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = iVar.f45950h;
        return new a(str, str2, str3, str4 != null ? str4 : "", null, iVar.f45945c, iVar.f45948f, null, iVar.f45946d, null, null, null, null, null);
    }

    public static void b(TaskCompletionSource taskCompletionSource, jk.b bVar) {
        taskCompletionSource.getTask().addOnCompleteListener(new com.unity3d.ads.core.data.datasource.a(bVar));
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a binding) {
        n.f(binding, "binding");
        xi.f fVar = binding.f50789c;
        n.e(fVar, "getBinaryMessenger(...)");
        g.a(h.f38930e9, fVar, this);
        d.a(e.f38925d9, fVar, this);
        this.f38942a = binding.f50787a;
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a binding) {
        n.f(binding, "binding");
        this.f38942a = null;
        xi.f fVar = binding.f50789c;
        n.e(fVar, "getBinaryMessenger(...)");
        g.a(h.f38930e9, fVar, null);
        d.a(e.f38925d9, fVar, null);
    }
}
