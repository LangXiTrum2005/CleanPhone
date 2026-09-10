package com.smartdigimkt.o;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static String a(String str, String str2, String str3) {
        return str;
    }

    private static String a(String str, List<String> list, String str2) {
        if (list != null) {
            for (String str3 : list) {
                if (!TextUtils.isEmpty(str3)) {
                    str = str.replaceAll(str3, str2);
                }
            }
        }
        return str;
    }
}
