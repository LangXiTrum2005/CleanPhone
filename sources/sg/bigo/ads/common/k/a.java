package sg.bigo.ads.common.k;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static sg.bigo.ads.common.a a(Context context) {
        String string = "";
        boolean z2 = true;
        if ("Amazon".equalsIgnoreCase(Build.MANUFACTURER)) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") == 0) {
                    z2 = false;
                }
                string = Settings.Secure.getString(contentResolver, "advertising_id");
            } catch (Settings.SettingNotFoundException unused) {
            }
        }
        return new sg.bigo.ads.common.a(string, z2);
    }
}
