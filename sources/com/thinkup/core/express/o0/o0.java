package com.thinkup.core.express.o0;

import android.net.Uri;
import android.text.TextUtils;
import com.smartdigimkt.x.d;
import com.thinkup.core.common.n.mo;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class o0 {
    private static final String[] o = {"wv_hybrid:", "mraid:", "ssp:", "mvb_hybrid:"};
    private static final Pattern m = Pattern.compile("hybrid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f42388n = Pattern.compile("mraid://(.+?):(.+?)/(.+?)(\\?(.*?))?");
    private static final Pattern o0 = Pattern.compile("ssp://(.+?):(.+?)/(.+?)(\\?(.*?))?");
    private static final Pattern oo = Pattern.compile("mv://(.+?):(.+?)/(.+?)(\\?(.*?))?");
    private static Map<String, String> om = new HashMap();

    static {
        for (n nVar : n.values()) {
            om.put(nVar.o(), nVar.m());
        }
    }

    private static boolean m(String str) {
        for (String str2 : o) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static Pattern n(String str) {
        if ("wv_hybrid:".equals(str)) {
            return oo;
        }
        if ("mraid:".equals(str)) {
            return f42388n;
        }
        if ("ssp:".equals(str)) {
            return o0;
        }
        if ("mvb_hybrid:".equals(str)) {
            return oo;
        }
        return null;
    }

    public static String o(String str) {
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
                        stringBuffer.append("\\".concat(String.valueOf(cCharAt)));
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

    private static boolean o0(String str) {
        String path;
        int iLastIndexOf;
        String str2 = om.get((TextUtils.isEmpty(str) || (path = Uri.parse(str).getPath()) == null || (iLastIndexOf = path.lastIndexOf(mo.ono)) == -1) ? "" : path.substring(iLastIndexOf + 1));
        return (str2 != null ? str2 : "").startsWith(d.c.k);
    }

    private static String om(String str) {
        String path;
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (path = Uri.parse(str).getPath()) == null || (iLastIndexOf = path.lastIndexOf(mo.ono)) == -1) ? "" : path.substring(iLastIndexOf + 1);
    }

    private static String oo(String str) {
        String path;
        int iLastIndexOf;
        String str2 = om.get((TextUtils.isEmpty(str) || (path = Uri.parse(str).getPath()) == null || (iLastIndexOf = path.lastIndexOf(mo.ono)) == -1) ? "" : path.substring(iLastIndexOf + 1));
        return str2 == null ? "" : str2;
    }
}
