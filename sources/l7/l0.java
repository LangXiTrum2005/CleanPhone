package l7;

import android.util.Log;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import lj.n0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements BillingClientStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f45184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f45185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f45186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f45187d;

    public l0(lj.i iVar, hj.b bVar, long j10) {
        this.f45187d = iVar;
        this.f45186c = bVar;
        this.f45185b = j10;
        this.f45184a = false;
    }

    public boolean a() {
        Boolean bool = (Boolean) this.f45187d;
        return bool != null ? bool.booleanValue() : this.f45184a;
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingServiceDisconnected() {
        lj.g gVar = ((lj.i) this.f45187d).f45391e;
        long j10 = this.f45185b;
        lj.l0 l0Var = new lj.l0(new bh.a(14), 0);
        gVar.getClass();
        String strN = defpackage.e.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onBillingServiceDisconnected", "");
        new k5.g(gVar.f45374a, strN, (xi.l) lj.g.f45373b.getValue(), (Object) null).y(j1.f.C(Long.valueOf(j10)), new lj.f(l0Var, strN, 1));
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingSetupFinished(BillingResult billingResult) {
        if (this.f45184a) {
            Log.d("InAppPurchasePlugin", "Tried to call onBillingSetupFinished multiple times.");
        } else {
            this.f45184a = true;
            lj.m0.a(n0.a(billingResult), (hj.b) this.f45186c);
        }
    }

    public l0(boolean z10, String str) {
        this.f45184a = z10;
        this.f45186c = str;
    }
}
