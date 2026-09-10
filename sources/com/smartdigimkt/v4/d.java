package com.smartdigimkt.v4;

import android.net.Uri;
import android.text.TextUtils;
import com.thinkup.core.common.n.mo;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f39158a = {"wv_hybrid:", "mraid:", "ssp:", "mvb_hybrid:"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f39159b = Pattern.compile("hybrid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f39160c = Pattern.compile("mraid://(.+?):(.+?)/(.+?)(\\?(.*?))?");
    private static final Pattern d = Pattern.compile("ssp://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f39161e = Pattern.compile("mv://(.+?):(.+?)/(.+?)(\\?(.*?))?");
    private static Map<String, String> f = new HashMap();

    static {
        for (c cVar : c.values()) {
            f.put(cVar.d(), cVar.c());
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
        String str2 = f.get(d(str));
        return str2 == null ? "" : str2;
    }

    public static Pattern c(String str) {
        if ("wv_hybrid:".equals(str)) {
            return f39161e;
        }
        if ("mraid:".equals(str)) {
            return f39160c;
        }
        if ("ssp:".equals(str)) {
            return d;
        }
        if ("mvb_hybrid:".equals(str)) {
            return f39161e;
        }
        return null;
    }

    public static String d(String str) {
        String path;
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (path = Uri.parse(str).getPath()) == null || (iLastIndexOf = path.lastIndexOf(mo.ono)) == -1) ? "" : path.substring(iLastIndexOf + 1);
    }

    public static boolean e(String str) {
        return b(str).startsWith(com.smartdigimkt.x.d.c.k);
    }

    public static boolean f(String str) {
        for (String str2 : f39158a) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
