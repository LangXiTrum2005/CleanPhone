package com.bytedance.sdk.openadsdk.ay;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.core.aw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.ig;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private static int ri(int i) {
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

    public static List<String> ri(List<String> list, boolean z) {
        String strRi = aw.ri(nr.ri());
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
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(strRi)) {
                next = next.replace("{UID}", strRi).replace("__UID__", strRi);
            }
            if (z) {
                next = ri(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    private static String ri(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return str.replace("[ss_random]", String.valueOf(new SecureRandom().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception e) {
                ac.ik("TrackAdUrlUtils", e.getMessage());
            }
        }
        return str;
    }

    public static List<String> ri(List<String> list, boolean z, wjv wjvVar) {
        String strRi = aw.ri(nr.ri());
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
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(strRi)) {
                next = next.replace("{UID}", strRi).replace("__UID__", strRi);
            }
            if (next.contains("__CID__") && wjvVar != null && !TextUtils.isEmpty(wjvVar.tn())) {
                next = next.replace("__CID__", wjvVar.tn());
            }
            if (next.contains("__CTYPE__") && wjvVar != null) {
                next = next.replace("__CTYPE__", String.valueOf(ri(wjvVar.vz())));
            }
            if (next.contains("__GAID__")) {
                next = next.replace("__GAID__", com.bytedance.sdk.openadsdk.ihz.ri.lr.ri.ri().lr());
            }
            if (next.contains("__OS__")) {
                next = next.replace("__OS__", "0");
            }
            if (next.contains("__UA1__")) {
                next = next.replace("__UA1__", URLEncoder.encode(ig.ka()));
            }
            if (z) {
                next = ri(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
