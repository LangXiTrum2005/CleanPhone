package sg.bigo.ads.common.j;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import sg.bigo.ads.common.utils.o;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f47312a = "a";

    public static long a(String str, long j) {
        if (!TextUtils.isEmpty(str) && j != 0) {
            try {
                long jLongValue = Long.valueOf(str).longValue();
                int iHashCode = String.valueOf(j).hashCode();
                return ((j ^ jLongValue) ^ ((long) Math.abs(iHashCode))) >> 20;
            } catch (Exception unused) {
            }
        }
        return 0L;
    }

    public static byte[] b(String str, String str2) {
        String str3;
        String str4;
        if (TextUtils.isEmpty(str)) {
            str3 = f47312a;
            str4 = "cip error with empty.";
        } else if (TextUtils.isEmpty(str2)) {
            str3 = f47312a;
            str4 = "string error with empty.";
        } else {
            byte[] bArrB = o.b(str, str2, null);
            if (bArrB != null) {
                return bArrB;
            }
            str3 = f47312a;
            str4 = "cip error with empty content.";
        }
        sg.bigo.ads.common.t.a.a(0, str3, str4);
        return null;
    }

    public static String a(String str, String str2) {
        String str3;
        String str4;
        if (TextUtils.isEmpty(str)) {
            str3 = f47312a;
            str4 = "data error with empty.";
        } else {
            if (!TextUtils.isEmpty(str2)) {
                String strA = o.a(str, str2);
                p005e.a.f(androidx.datastore.preferences.protobuf.a.q("data=", str, ", hexStringSecKey=", str2, ", cryptStr="), 0, strA, 3, f47312a);
                return strA;
            }
            str3 = f47312a;
            str4 = "cip error with empty.";
        }
        sg.bigo.ads.common.t.a.a(0, str3, str4);
        return null;
    }

    public static String a(String str, String str2, ValueCallback<Exception> valueCallback) {
        String str3;
        String str4;
        if (TextUtils.isEmpty(str)) {
            str3 = f47312a;
            str4 = "cip error with empty.";
        } else if (TextUtils.isEmpty(str2)) {
            str3 = f47312a;
            str4 = "string error with empty.";
        } else {
            String strA = o.a(str, str2, valueCallback);
            if (!TextUtils.isEmpty(strA)) {
                return strA;
            }
            str3 = f47312a;
            str4 = "cip error with empty content.";
        }
        sg.bigo.ads.common.t.a.a(0, str3, str4);
        return null;
    }
}
