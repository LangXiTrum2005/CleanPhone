package com.blankj.utilcode.util;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: IntentUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class cutely {
    public static Intent attabal(Intent intent, boolean z) {
        return z ? intent.addFlags(268435456) : intent;
    }

    public static boolean dern(Intent intent) {
        return adultoid.attabal().getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }

    public static Intent saneness(String str, boolean z) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + str));
        return attabal(intent, z);
    }
}
