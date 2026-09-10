package com.google.firebase.messaging;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Constants.java */
/* JADX INFO: loaded from: classes3.dex */
public final class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final long f22665attabal = TimeUnit.MINUTES.toMillis(3);

    /* JADX INFO: compiled from: Constants.java */
    public static final class attabal {
        public static androidx.collection.attabal<String, String> attabal(Bundle bundle) {
            androidx.collection.attabal<String, String> attabalVar = new androidx.collection.attabal<>();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        attabalVar.put(str, str2);
                    }
                }
            }
            return attabalVar;
        }
    }
}
