package fi;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import g9.k;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import ti.b;
import xi.f;
import xi.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfi/a;", "Lti/b;", "<init>", "()V", "device_info_plus_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f40952a;

    @Override // ti.b
    public final void onAttachedToEngine(ti.a binding) {
        n.f(binding, "binding");
        f fVar = binding.f50789c;
        n.e(fVar, "getBinaryMessenger(...)");
        Context context = binding.f50787a;
        n.e(context, "getApplicationContext(...)");
        this.f40952a = new p(fVar, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = context.getPackageManager();
        n.e(packageManager, "getPackageManager(...)");
        Object systemService = context.getSystemService("activity");
        n.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ContentResolver contentResolver = context.getContentResolver();
        n.c(contentResolver);
        k kVar = new k(packageManager, (ActivityManager) systemService, contentResolver, 16);
        p pVar = this.f40952a;
        if (pVar != null) {
            pVar.b(kVar);
        } else {
            n.l("methodChannel");
            throw null;
        }
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a binding) {
        n.f(binding, "binding");
        p pVar = this.f40952a;
        if (pVar != null) {
            pVar.b(null);
        } else {
            n.l("methodChannel");
            throw null;
        }
    }
}
