package lj;

import android.app.Activity;
import com.android.billingclient.api.BillingClient;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class h implements ti.b, ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f45379a;

    @Override // ui.a
    public final void onAttachedToActivity(ui.b bVar) {
        ((Activity) ((fc.f) bVar).f40780b).getIntent().putExtra("PROXY_PACKAGE", "io.flutter.plugins.inapppurchase");
        this.f45379a.f45389c = (Activity) ((fc.f) bVar).f40780b;
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a aVar) {
        xi.f fVar = aVar.f50789c;
        i iVar = new i(aVar.f50787a, new g(fVar), new a());
        this.f45379a = iVar;
        e.f45361s9.getClass();
        d.b(fVar, iVar);
    }

    @Override // ui.a
    public final void onDetachedFromActivity() {
        i iVar = this.f45379a;
        iVar.f45389c = null;
        BillingClient billingClient = iVar.f45387a;
        if (billingClient != null) {
            billingClient.endConnection();
            iVar.f45387a = null;
        }
    }

    @Override // ui.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f45379a.f45389c = null;
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a aVar) {
        xi.f fVar = aVar.f50789c;
        e.f45361s9.getClass();
        d.b(fVar, null);
        this.f45379a = null;
    }

    @Override // ui.a
    public final void onReattachedToActivityForConfigChanges(ui.b bVar) {
        onAttachedToActivity(bVar);
    }
}
