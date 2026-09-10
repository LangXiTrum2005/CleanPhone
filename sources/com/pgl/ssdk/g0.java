package com.pgl.ssdk;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class g0 {
    public static String a(String str) {
        String[] strArrB = b(str);
        ArrayList arrayList = new ArrayList();
        if (strArrB != null && strArrB.length > 0) {
            for (String str2 : strArrB) {
                try {
                    Class.forName(str2);
                    arrayList.add(str2);
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.toString();
    }

    public static String[] b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split("//");
    }
}
