package com.thinkup.core.common.oom.o.o0;

import android.support.v4.media.a;
import android.text.TextUtils;
import com.thinkup.core.common.on.m0n;
import com.thinkup.core.common.on.m0o;
import com.thinkup.core.common.on.mo0;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class o {
    public static String o(String str, m0n m0nVar) {
        List<String> list;
        if (m0nVar == null) {
            return "";
        }
        List<String> listO = m0nVar.o();
        Map<String, List<String>> mapN = m0nVar.n();
        if (listO != null && !listO.isEmpty()) {
            for (String str2 : listO) {
                if (!TextUtils.isEmpty(str2) && str.contains(str2)) {
                    if (mapN != null && !mapN.isEmpty() && (list = mapN.get(str2)) != null && !list.isEmpty()) {
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            String str3 = list.get(i2);
                            if (str.contains(str3)) {
                                return a.D(str2, "&&", str3);
                            }
                        }
                    }
                    return str2;
                }
            }
        }
        return "";
    }

    private static m0n o(mo0 mo0Var, m0o m0oVar) {
        Map<Integer, m0n> mapOo;
        if (mo0Var == null || m0oVar == null || (mapOo = m0oVar.oo()) == null) {
            return null;
        }
        return mapOo.get(Integer.valueOf(mo0Var.n()));
    }
}
