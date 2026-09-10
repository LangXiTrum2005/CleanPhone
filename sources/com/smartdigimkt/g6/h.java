package com.smartdigimkt.g6;

import android.net.Uri;
import android.text.TextUtils;
import com.thinkup.core.common.n.mo;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f35485a = "atwt:";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f35486b = {f35485a};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f35487c = Pattern.compile("atwt://(.+?)#(.+?)/(.+?)(\\?(.*?))?");
    private static Map<String, String> d = new HashMap();

    static {
        for (com.smartdigimkt.v4.c cVar : com.smartdigimkt.v4.c.values()) {
            d.put(cVar.d(), cVar.c());
        }
    }

    public static String a(String str) {
        char[] cArr = {'\'', '\\'};
        StringBuffer stringBuffer = new StringBuffer(1000);
        stringBuffer.setLength(0);
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 255) {
                int i3 = 0;
                while (true) {
                    if (i3 >= 2) {
                        stringBuffer.append(cCharAt);
                        break;
                    }
                    if (cArr[i3] == cCharAt) {
                        stringBuffer.append("\\" + cCharAt);
                        break;
                    }
                    i3++;
                }
            } else {
                stringBuffer.append("\\u");
                String upperCase = Integer.toHexString(cCharAt >>> '\b').toUpperCase();
                if (upperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase);
                String upperCase2 = Integer.toHexString(cCharAt & 255).toUpperCase();
                if (upperCase2.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase2);
            }
        }
        return new String(stringBuffer);
    }

    public static String b(String str) {
        return TextUtils.isEmpty(str) ? str : com.smartdigimkt.n8.b.a(str);
    }

    public static String c(String str) {
        return TextUtils.isEmpty(str) ? str : com.smartdigimkt.n8.b.b(str);
    }

    public static String d(String str) {
        String str2 = d.get(f(str));
        return str2 == null ? "" : str2;
    }

    public static Pattern e(String str) {
        if (f35485a.equals(str)) {
            return f35487c;
        }
        return null;
    }

    public static String f(String str) {
        String path;
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (path = Uri.parse(str).getPath()) == null || (iLastIndexOf = path.lastIndexOf(mo.ono)) == -1) ? "" : path.substring(iLastIndexOf + 1);
    }

    public static boolean g(String str) {
        return d(str).startsWith(com.smartdigimkt.x.d.c.k);
    }

    public static boolean h(String str) {
        for (String str2 : f35486b) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
