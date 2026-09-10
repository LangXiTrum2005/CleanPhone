package com.facebook.ads;

import androidx.media3.extractor.text.ttml.a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AdSDKNotificationManager {
    private static final List<AdSDKNotificationListener> sNotificationListeners = a.u();

    public static void addSDKNotificationListener(AdSDKNotificationListener adSDKNotificationListener) {
        List<AdSDKNotificationListener> list = sNotificationListeners;
        synchronized (list) {
            list.add(adSDKNotificationListener);
        }
    }

    public static List<AdSDKNotificationListener> getNotificationListeners() {
        return sNotificationListeners;
    }

    public static void removeSDKNotificationListener(AdSDKNotificationListener adSDKNotificationListener) {
        List<AdSDKNotificationListener> list = sNotificationListeners;
        synchronized (list) {
            list.remove(adSDKNotificationListener);
        }
    }
}
