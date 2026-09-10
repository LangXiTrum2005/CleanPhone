package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: compiled from: ProxyNotificationPreferences.java */
/* JADX INFO: loaded from: classes3.dex */
public final class hydrovane {
    public static void beachfront(final Context context, yemenite yemeniteVar, final boolean z) {
        if (PlatformVersion.isAtLeastQ() && !wireman(saneness(context), z)) {
            yemeniteVar.cutely(z).addOnSuccessListener(new androidx.privacysandbox.ads.adservices.measurement.cutely(), new OnSuccessListener() { // from class: com.google.firebase.messaging.starveling
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    hydrovane.competently(context, z);
                }
            });
        }
    }

    public static void competently(Context context, boolean z) {
        SharedPreferences.Editor editorEdit = saneness(context).edit();
        editorEdit.putBoolean("proxy_retention", z);
        editorEdit.apply();
    }

    public static boolean dern(Context context) {
        return saneness(context).getBoolean("proxy_notification_initialized", false);
    }

    public static void marial(Context context, boolean z) {
        SharedPreferences.Editor editorEdit = saneness(context).edit();
        editorEdit.putBoolean("proxy_notification_initialized", z);
        editorEdit.apply();
    }

    public static SharedPreferences saneness(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static boolean wireman(SharedPreferences sharedPreferences, boolean z) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z;
    }
}
