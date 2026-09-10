package androidx.core.telephony;

import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes.dex */
public class TelephonyManagerCompat {

    public static class Api23Impl {
        public static String a(TelephonyManager telephonyManager, int i2) {
            return telephonyManager.getDeviceId(i2);
        }
    }

    public static class Api26Impl {
        public static String a(TelephonyManager telephonyManager) {
            return telephonyManager.getImei();
        }
    }

    public static class Api30Impl {
        public static int a(TelephonyManager telephonyManager) {
            return telephonyManager.getSubscriptionId();
        }
    }
}
