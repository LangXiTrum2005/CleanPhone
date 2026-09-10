package ads_mobile_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class lr0 {
    public static lr0 c;
    public final String a;
    public final SharedPreferences b;

    public lr0(Context context) {
        this.a = context.getPackageName();
        this.b = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public final void a(Object obj, String str) throws IOException {
        boolean zCommit;
        if (obj instanceof String) {
            zCommit = this.b.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            zCommit = this.b.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else {
            if (!(obj instanceof Boolean)) {
                if (obj instanceof Integer) {
                    zCommit = this.b.edit().putInt(str, ((Integer) obj).intValue()).commit();
                } else {
                    obj.getClass().toString();
                }
                throw new IOException("Failed to store " + str + " for app " + this.a);
            }
            zCommit = this.b.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        }
        if (zCommit) {
            return;
        }
        throw new IOException("Failed to store " + str + " for app " + this.a);
    }

    public final void a(String str) throws IOException {
        if (this.b.edit().remove(str).commit()) {
            return;
        }
        throw new IOException("Failed to remove " + str + " for app " + this.a);
    }

    public static lr0 a(Context context) {
        if (c == null) {
            c = new lr0(context);
        }
        return c;
    }
}
