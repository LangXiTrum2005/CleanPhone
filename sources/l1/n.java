package l1;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.am0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static void a(Context context, p pVar) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            am0 am0Var = new am0(pVar, 1);
            telephonyManager.registerTelephonyCallback(pVar.f44804a, am0Var);
            telephonyManager.unregisterTelephonyCallback(am0Var);
        } catch (RuntimeException unused) {
            pVar.c(5);
        }
    }
}
