package com.smartdigimkt.o0;

import android.text.TextUtils;
import com.p004ironsource.d9;
import com.p004ironsource.dc;
import com.smartdigimkt.v0.y;
import com.smartdigimkt.v0.z;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f37297a = "d";

    public static String a(List<com.smartdigimkt.k0.c> list) {
        com.smartdigimkt.k0.c cVarA = a(list, "Content-Type");
        if (cVarA == null) {
            return "UTF-8";
        }
        String strB = cVarA.b();
        if (TextUtils.isEmpty(strB)) {
            return "UTF-8";
        }
        String[] strArrSplit = strB.split(";");
        for (int i2 = 1; i2 < strArrSplit.length; i2++) {
            String[] strArrSplit2 = strArrSplit[i2].trim().split(d9.i.f24747b);
            if (strArrSplit2.length == 2 && strArrSplit2[0].equals(dc.M)) {
                return strArrSplit2[1];
            }
        }
        return "UTF-8";
    }

    public static String b(List<com.smartdigimkt.k0.c> list, String str) {
        com.smartdigimkt.k0.c cVarA = a(list, str);
        return cVarA != null ? cVarA.b() : "";
    }

    public static boolean c(List<com.smartdigimkt.k0.c> list) {
        if (TextUtils.equals(b(list, "Accept-Ranges"), "bytes")) {
            return true;
        }
        String strB = b(list, "Content-Range");
        return strB != null && strB.startsWith("bytes");
    }

    public static boolean b(List<com.smartdigimkt.k0.c> list) {
        return TextUtils.equals(b(list, "Content-Encoding"), b.d);
    }

    public static com.smartdigimkt.k0.c a(List<com.smartdigimkt.k0.c> list, String str) {
        if (list == null) {
            return null;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.smartdigimkt.k0.c cVar = list.get(i2);
            if (cVar != null && str.equals(cVar.a())) {
                return cVar;
            }
        }
        return null;
    }

    public static void a(com.smartdigimkt.p0.b bVar, String str, String str2) {
        if (bVar != null) {
            try {
                if (!y.a(str) && !y.a(str2)) {
                    bVar.a(str, str2);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.startsWith("http")) {
                str = z.a(str);
            }
            TextUtils.isEmpty(str);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
