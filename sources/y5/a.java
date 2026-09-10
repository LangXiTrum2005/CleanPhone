package y5;

import android.os.Looper;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.k;
import com.google.android.gms.internal.play_billing.j4;
import com.google.android.gms.internal.play_billing.u;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements BillingClientStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j4 f54205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.a f54206b;

    public a(com.android.billingclient.api.a aVar, j4 j4Var) {
        this.f54205a = j4Var;
        Objects.requireNonNull(aVar);
        this.f54206b = aVar;
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingServiceDisconnected() {
        u.g("BillingClient", "Reconnection attempt failed.");
        try {
            this.f54205a.a(k.f7276j);
        } catch (Throwable th2) {
            u.i("BillingClient", "Exception setting completer.", th2);
        }
        com.android.billingclient.api.a aVar = this.f54206b;
        if (aVar.G != null) {
            Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.zzba
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.zza.f54206b.G.onBillingServiceDisconnected();
                    } catch (Throwable th3) {
                        u.i("BillingClient", "Exception calling onBillingServiceDisconnected.", th3);
                    }
                }
            };
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                aVar.f7227e.post(runnable);
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingSetupFinished(final BillingResult billingResult) {
        u.g("BillingClient", "Reconnection finished with result: " + billingResult.getResponseCode());
        try {
            this.f54205a.a(billingResult);
        } catch (Throwable th2) {
            u.i("BillingClient", "Exception setting completer.", th2);
        }
        com.android.billingclient.api.a aVar = this.f54206b;
        if (aVar.G != null) {
            Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.zzbb
                @Override // java.lang.Runnable
                public final void run() {
                    y5.a aVar2 = this.zza;
                    try {
                        aVar2.f54206b.G.onBillingSetupFinished(billingResult);
                    } catch (Throwable th3) {
                        u.i("BillingClient", "Exception calling onBillingSetupFinished.", th3);
                    }
                }
            };
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                aVar.f7227e.post(runnable);
            }
        }
    }
}
