package ea;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.UserChoiceBillingListener;
import com.android.billingclient.api.UserChoiceDetails;
import com.android.billingclient.api.zzc;
import com.android.billingclient.api.zzcg;
import com.google.android.gms.internal.ads.p12;
import com.ironsource.X3;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39901a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f39902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f39903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f39904d;

    public x0(p12 p12Var, boolean z10) {
        this.f39904d = p12Var;
        this.f39903c = z10;
    }

    public synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f39902b) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f39903c ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f39902b = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void b() {
        e4 e4Var = (e4) this.f39904d;
        e4Var.m0();
        e4Var.P().G0();
        e4Var.P().G0();
        if (this.f39902b) {
            e4Var.t().f39760n.b("Unregistering connectivity change receiver");
            this.f39902b = false;
            this.f39903c = false;
            try {
                e4Var.l.f39582a.unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                e4Var.t().f39753f.c(e10, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    public synchronized void c(Context context) {
        if (!this.f39902b) {
            com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f39902b = false;
        }
    }

    public void d(Bundle bundle, BillingResult billingResult, int i10, com.google.android.gms.internal.play_billing.m3 m3Var, long j10, boolean z10) {
        com.google.android.gms.internal.play_billing.l1 l1VarK;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
                ((wi.b) ((y5.d) ((p12) this.f39904d).f18441e)).j(zzcg.zzb(com.google.android.gms.internal.play_billing.j3.BILLING_RESULT_RECEIVED_FROM_PHONESKY, i10, billingResult, null, m3Var), j10, z10);
                return;
            }
            y5.d dVar = (y5.d) ((p12) this.f39904d).f18441e;
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            int i11 = com.google.android.gms.internal.play_billing.l1.f24404a;
            synchronized (com.google.android.gms.internal.play_billing.l1.class) {
                int i12 = com.google.android.gms.internal.play_billing.l1.f24404a;
                com.google.android.gms.internal.play_billing.p2 p2Var = com.google.android.gms.internal.play_billing.p2.f24443c;
                l1VarK = com.google.android.gms.internal.play_billing.q1.K();
                int i13 = com.google.android.gms.internal.play_billing.l1.f24404a;
            }
            ((wi.b) dVar).j(com.google.android.gms.internal.play_billing.f3.n(byteArray, l1VarK), j10, z10);
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    /* JADX WARN: Code duplicated, block: B:99:0x0271  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        com.google.android.gms.internal.play_billing.m3 m3Var;
        int i10;
        BillingResult billingResultE;
        int iIntValue;
        int i11 = this.f39901a;
        Object obj = this.f39904d;
        switch (i11) {
            case 0:
                e4 e4Var = (e4) obj;
                e4Var.m0();
                String action = intent.getAction();
                e4Var.t().f39760n.c(action, "NetworkBroadcastReceiver received action");
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    e4Var.t().f39756i.c(action, "NetworkBroadcastReceiver received unknown action");
                    return;
                }
                v0 v0Var = e4Var.f39372b;
                e4.T(v0Var);
                boolean zK0 = v0Var.K0();
                if (this.f39903c != zK0) {
                    this.f39903c = zK0;
                    e4Var.P().P0(new androidx.lifecycle.a0(this, zK0));
                    return;
                }
                return;
            default:
                p12 p12Var = (p12) obj;
                String action2 = intent.getAction();
                int iHashCode = action2.hashCode();
                com.google.android.gms.internal.play_billing.m3 m3Var2 = com.google.android.gms.internal.play_billing.m3.LOCAL_PURCHASES_UPDATED_ACTION;
                com.google.android.gms.internal.play_billing.m3 m3Var3 = com.google.android.gms.internal.play_billing.m3.PURCHASES_UPDATED_ACTION;
                com.google.android.gms.internal.play_billing.m3 m3Var4 = com.google.android.gms.internal.play_billing.m3.ALTERNATIVE_BILLING_ACTION;
                if (iHashCode != -1484087650) {
                    if (iHashCode != -337612916) {
                        if (iHashCode == 345207161 && action2.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                            m3Var = m3Var4;
                        } else {
                            m3Var = com.google.android.gms.internal.play_billing.m3.BROADCAST_ACTION_UNSPECIFIED;
                        }
                    } else if (action2.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                        m3Var = m3Var2;
                    } else {
                        m3Var = com.google.android.gms.internal.play_billing.m3.BROADCAST_ACTION_UNSPECIFIED;
                    }
                } else if (action2.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
                    m3Var = m3Var3;
                } else {
                    m3Var = com.google.android.gms.internal.play_billing.m3.BROADCAST_ACTION_UNSPECIFIED;
                }
                if (m3Var.equals(m3Var2) || m3Var.equals(m3Var4)) {
                    i10 = 2;
                } else {
                    i10 = m3Var.equals(m3Var3) ? 32 : 1;
                }
                Bundle extras = intent.getExtras();
                ArrayList arrayList = null;
                if (extras == null) {
                    com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Bundle is null.");
                    y5.d dVar = (y5.d) p12Var.f18441e;
                    BillingResult billingResult = com.android.billingclient.api.k.f7274h;
                    ((wi.b) dVar).c(zzcg.zzb(com.google.android.gms.internal.play_billing.j3.NULL_BUNDLE_IN_BROADCAST_RECEIVER, i10, billingResult, null, m3Var));
                    PurchasesUpdatedListener purchasesUpdatedListener = (PurchasesUpdatedListener) p12Var.f18439c;
                    if (purchasesUpdatedListener != null) {
                        purchasesUpdatedListener.onPurchasesUpdated(billingResult, null);
                        return;
                    }
                    return;
                }
                int i12 = 0;
                if (i10 == 2) {
                    int i13 = com.google.android.gms.internal.play_billing.u.f24478a;
                    BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
                    builderNewBuilder.setResponseCode(com.google.android.gms.internal.play_billing.u.a(intent.getExtras(), "BillingBroadcastManager"));
                    Bundle extras2 = intent.getExtras();
                    if (extras2 == null) {
                        com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Unexpected null bundle received!");
                    } else {
                        Object obj2 = extras2.get("SUB_RESPONSE_CODE");
                        if (obj2 == null) {
                            com.google.android.gms.internal.play_billing.u.g("BillingBroadcastManager", "getLaunchBillingFlowSubResponseCodeFromBundle() got null response code, assuming OK");
                        } else {
                            if (obj2 instanceof Integer) {
                                iIntValue = ((Integer) obj2).intValue();
                            } else {
                                com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj2.getClass().getName()));
                            }
                            builderNewBuilder.setOnPurchasesUpdatedSubResponseCode(iIntValue);
                            builderNewBuilder.setDebugMessage(com.google.android.gms.internal.play_billing.u.f(intent.getExtras(), "BillingBroadcastManager"));
                            billingResultE = builderNewBuilder.build();
                        }
                    }
                    iIntValue = 0;
                    builderNewBuilder.setOnPurchasesUpdatedSubResponseCode(iIntValue);
                    builderNewBuilder.setDebugMessage(com.google.android.gms.internal.play_billing.u.f(intent.getExtras(), "BillingBroadcastManager"));
                    billingResultE = builderNewBuilder.build();
                } else {
                    billingResultE = com.google.android.gms.internal.play_billing.u.e(intent, "BillingBroadcastManager");
                }
                long j10 = extras.getLong("billingClientTransactionId", 0L);
                boolean z10 = extras.getBoolean("wasServiceAutoReconnected", false);
                if (m3Var.equals(m3Var3) || m3Var.equals(m3Var2)) {
                    BillingResult billingResult2 = billingResultE;
                    int i14 = i10;
                    com.google.android.gms.internal.play_billing.m3 m3Var5 = m3Var;
                    ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    ArrayList arrayList2 = new ArrayList();
                    if (stringArrayList == null || stringArrayList2 == null) {
                        Purchase purchaseJ = com.google.android.gms.internal.play_billing.u.j(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
                        if (purchaseJ == null) {
                            com.google.android.gms.internal.play_billing.u.g("BillingHelper", "Couldn't find single purchase data as well.");
                        } else {
                            arrayList2.add(purchaseJ);
                        }
                        if (billingResult2.getResponseCode() == 0) {
                            ((wi.b) ((y5.d) p12Var.f18441e)).l(zzcg.zzc(i14, m3Var5), j10, z10);
                        } else {
                            d(extras, billingResult2, i14, m3Var5, j10, z10);
                        }
                        ((PurchasesUpdatedListener) p12Var.f18439c).onPurchasesUpdated(billingResult2, arrayList);
                        return;
                    }
                    com.google.android.gms.internal.play_billing.u.g("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
                    while (i12 < stringArrayList.size() && i12 < stringArrayList2.size()) {
                        Purchase purchaseJ2 = com.google.android.gms.internal.play_billing.u.j(stringArrayList.get(i12), stringArrayList2.get(i12));
                        if (purchaseJ2 != null) {
                            arrayList2.add(purchaseJ2);
                        }
                        i12++;
                    }
                    arrayList = arrayList2;
                    if (billingResult2.getResponseCode() == 0) {
                        ((wi.b) ((y5.d) p12Var.f18441e)).l(zzcg.zzc(i14, m3Var5), j10, z10);
                    } else {
                        d(extras, billingResult2, i14, m3Var5, j10, z10);
                    }
                    ((PurchasesUpdatedListener) p12Var.f18439c).onPurchasesUpdated(billingResult2, arrayList);
                    return;
                }
                if (m3Var.equals(m3Var4)) {
                    if (billingResultE.getResponseCode() != 0) {
                        BillingResult billingResult3 = billingResultE;
                        d(extras, billingResult3, i10, m3Var, j10, z10);
                        PurchasesUpdatedListener purchasesUpdatedListener2 = (PurchasesUpdatedListener) p12Var.f18439c;
                        com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f24456b;
                        purchasesUpdatedListener2.onPurchasesUpdated(billingResult3, com.google.android.gms.internal.play_billing.v.f24489e);
                        return;
                    }
                    com.google.android.gms.internal.play_billing.m3 m3Var6 = m3Var;
                    int i15 = i10;
                    p12Var.getClass();
                    PurchasesUpdatedListener purchasesUpdatedListener3 = (PurchasesUpdatedListener) p12Var.f18439c;
                    y5.d dVar2 = (y5.d) p12Var.f18441e;
                    UserChoiceBillingListener userChoiceBillingListener = (UserChoiceBillingListener) p12Var.f18440d;
                    if (userChoiceBillingListener == null) {
                        com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                        BillingResult billingResult4 = com.android.billingclient.api.k.f7274h;
                        ((wi.b) dVar2).j(zzcg.zzb(com.google.android.gms.internal.play_billing.j3.MISSING_USER_CHOICE_BILLING_LISTENER, i15, billingResult4, null, m3Var6), j10, z10);
                        com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.f24456b;
                        purchasesUpdatedListener3.onPurchasesUpdated(billingResult4, com.google.android.gms.internal.play_billing.v.f24489e);
                        return;
                    }
                    String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                    if (string == null) {
                        com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                        BillingResult billingResult5 = com.android.billingclient.api.k.f7274h;
                        ((wi.b) dVar2).j(zzcg.zzb(com.google.android.gms.internal.play_billing.j3.MISSING_ALTERNATIVE_BILLING_USER_CHOICE_DATA, i15, billingResult5, null, m3Var6), j10, z10);
                        com.google.android.gms.internal.play_billing.p pVar3 = com.google.android.gms.internal.play_billing.r.f24456b;
                        purchasesUpdatedListener3.onPurchasesUpdated(billingResult5, com.google.android.gms.internal.play_billing.v.f24489e);
                        return;
                    }
                    try {
                        if (userChoiceBillingListener != null) {
                            userChoiceBillingListener.userSelectedAlternativeBilling(new UserChoiceDetails(string));
                            ((wi.b) dVar2).l(zzcg.zzc(i15, m3Var6), j10, z10);
                            return;
                        }
                        JSONArray jSONArrayOptJSONArray = new JSONObject(string).optJSONArray("products");
                        ArrayList arrayList3 = new ArrayList();
                        if (jSONArrayOptJSONArray == null) {
                            throw null;
                        }
                        while (i12 < jSONArrayOptJSONArray.length()) {
                            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i12);
                            if (jSONObjectOptJSONObject != null) {
                                arrayList3.add(new zzc(jSONObjectOptJSONObject));
                            }
                            i12++;
                        }
                        throw null;
                    } catch (JSONException unused) {
                        com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Error when parsing invalid user choice data: [" + string + X3.j.f27836e);
                        BillingResult billingResult6 = com.android.billingclient.api.k.f7274h;
                        ((wi.b) dVar2).j(zzcg.zzb(com.google.android.gms.internal.play_billing.j3.INVALID_ALTERNATIVE_BILLING_USER_CHOICE_DATA, i15, billingResult6, null, m3Var6), j10, z10);
                        com.google.android.gms.internal.play_billing.p pVar4 = com.google.android.gms.internal.play_billing.r.f24456b;
                        purchasesUpdatedListener3.onPurchasesUpdated(billingResult6, com.google.android.gms.internal.play_billing.v.f24489e);
                        return;
                    }
                }
                return;
        }
    }

    public x0(e4 e4Var) {
        k9.c0.h(e4Var);
        this.f39904d = e4Var;
    }
}
