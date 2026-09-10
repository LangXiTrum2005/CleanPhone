package bc;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5543a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5544b = 64;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5545c;

    public e(int i10) {
        this.f5545c = i10;
    }

    public static String a(int i10, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i10) {
                return str.substring(0, i10);
            }
        }
        return str;
    }

    public final synchronized boolean b(String str, String str2) {
        boolean zEquals;
        try {
            if (str == null) {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
            String strA = a(this.f5545c, str);
            if (this.f5543a.size() >= this.f5544b && !this.f5543a.containsKey(strA)) {
                Log.w("FirebaseCrashlytics", "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f5544b, null);
                return false;
            }
            String strA2 = a(this.f5545c, str2);
            String str3 = (String) this.f5543a.get(strA);
            if (str3 == null) {
                zEquals = strA2 == null;
            } else {
                zEquals = str3.equals(strA2);
            }
            if (zEquals) {
                return false;
            }
            HashMap map = this.f5543a;
            if (str2 == null) {
                strA2 = "";
            }
            map.put(strA, strA2);
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c(Map map) {
        try {
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strA = a(this.f5545c, str);
                if (this.f5543a.size() < this.f5544b || this.f5543a.containsKey(strA)) {
                    String str2 = (String) entry.getValue();
                    this.f5543a.put(strA, str2 == null ? "" : a(this.f5545c, str2));
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f5544b, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
