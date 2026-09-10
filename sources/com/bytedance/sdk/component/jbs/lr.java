package com.bytedance.sdk.component.jbs;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    public static boolean ri(List<String> list, String str) {
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                try {
                    if (Pattern.matches(it.next(), str)) {
                        return true;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return false;
    }
}
