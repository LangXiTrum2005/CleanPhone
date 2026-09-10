package com.android.billingclient.api;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzcg {
    public static final /* synthetic */ int zza = 0;

    static {
        int i10 = y5.d.B9;
    }

    @Nullable
    public static String zza(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + ":" + message;
            int i10 = u.f24478a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to get truncated exception info", th2);
            return null;
        }
    }

    @Nullable
    public static f3 zzb(@Nullable j3 j3Var, int i10, BillingResult billingResult, @Nullable String str, m3 m3Var) {
        try {
            i3 i3VarS = k3.s();
            i3VarS.e(billingResult.getResponseCode());
            String debugMessage = billingResult.getDebugMessage();
            i3VarS.c();
            k3.o((k3) i3VarS.f24469b, debugMessage);
            if (billingResult.getOnPurchasesUpdatedSubResponseCode() != 0) {
                int onPurchasesUpdatedSubResponseCode = billingResult.getOnPurchasesUpdatedSubResponseCode();
                i3VarS.c();
                k3.p((k3) i3VarS.f24469b, onPurchasesUpdatedSubResponseCode);
            }
            if (j3Var != null) {
                i3VarS.d(j3Var);
            }
            if (str != null) {
                i3VarS.c();
                k3.n((k3) i3VarS.f24469b, str);
            }
            e3 e3VarV = f3.v();
            e3VarV.d(i3VarS);
            e3VarV.f(i10);
            if (!m3Var.equals(m3.BROADCAST_ACTION_UNSPECIFIED)) {
                e3VarV.c();
                f3.p((f3) e3VarV.f24469b, m3Var);
            }
            return (f3) e3VarV.a();
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to create logging payload", th2);
            return null;
        }
    }

    @Nullable
    public static h3 zzc(int i10, m3 m3Var) {
        try {
            g3 g3VarT = h3.t();
            g3VarT.c();
            h3.s((h3) g3VarT.f24469b, i10);
            if (!m3Var.equals(m3.BROADCAST_ACTION_UNSPECIFIED)) {
                g3VarT.c();
                h3.o((h3) g3VarT.f24469b, m3Var);
            }
            return (h3) g3VarT.a();
        } catch (Exception e10) {
            u.i("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }
}
