package com.bytedance.sdk.openadsdk.eK;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.sLN;
import com.bytedance.sdk.openadsdk.utils.nJ;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private static int Lxb(int i) {
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    i2 = 5;
                    if (i != 5 && i != 15) {
                        return -1;
                    }
                }
            }
        }
        return i2;
    }

    public static List<String> Lxb(List<String> list, boolean z) {
        String strLxb = sLN.Lxb(kqm.Lxb());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(strLxb)) {
                next = next.replace("{UID}", strLxb).replace("__UID__", strLxb);
            }
            if (z) {
                next = Lxb(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    private static String Lxb(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return str.replace("[ss_random]", String.valueOf(new SecureRandom().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TrackAdUrlUtils", e.getMessage());
            return str;
        }
    }

    public static List<String> Lxb(List<String> list, boolean z, tD tDVar) {
        String strLxb = sLN.Lxb(kqm.Lxb());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(strLxb)) {
                next = next.replace("{UID}", strLxb).replace("__UID__", strLxb);
            }
            if (next.contains("__CID__") && tDVar != null && !TextUtils.isEmpty(tDVar.bG())) {
                next = next.replace("__CID__", tDVar.bG());
            }
            if (next.contains("__CTYPE__") && tDVar != null) {
                next = next.replace("__CTYPE__", String.valueOf(Lxb(tDVar.FGm())));
            }
            if (next.contains("__GAID__")) {
                next = next.replace("__GAID__", com.bytedance.sdk.openadsdk.brP.Lxb.LD.Lxb.Lxb().LD());
            }
            if (next.contains("__OS__")) {
                next = next.replace("__OS__", "0");
            }
            if (next.contains("__UA1__")) {
                next = next.replace("__UA1__", URLEncoder.encode(nJ.lk()));
            }
            if (z) {
                next = Lxb(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
