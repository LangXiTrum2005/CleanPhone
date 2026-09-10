package ongoing;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: AppStoreUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness {
    public static boolean attabal(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return context.getApplicationContext().getPackageManager().getPackageInfo("com.android.vending", 0) != null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean dern(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=" + str));
        return attabal.attabal(context, intent);
    }

    public static boolean saneness(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (wireman(context, str)) {
            return true;
        }
        return dern(context, str);
    }

    public static boolean wireman(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str) || !attabal(context)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.setClassName("com.android.vending", "com.google.android.finsky.activities.MainActivity");
        intent.setData(Uri.parse("market://details?id=" + str));
        return attabal.attabal(context, intent);
    }
}
