package androidx.core.telephony;

import android.telephony.SubscriptionManager;

/* JADX INFO: loaded from: classes.dex */
public class SubscriptionManagerCompat {

    public static class Api29Impl {
        public static int a(int i2) {
            return SubscriptionManager.getSlotIndex(i2);
        }
    }
}
