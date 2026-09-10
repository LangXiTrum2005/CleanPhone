package com.bytedance.sdk.component.QAg;

import com.bytedance.sdk.component.utils.sLN;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    public static boolean Lxb(List<String> list, String str) {
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                try {
                    if (Pattern.matches(it.next(), str)) {
                        return true;
                    }
                } catch (Throwable th) {
                    sLN.LD(th.toString());
                }
            }
        }
        return false;
    }
}
