package com.bytedance.sdk.openadsdk.bch;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.fs;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.gy;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    private static int qdl(int i2) {
        int i3 = 2;
        if (i2 != 2) {
            i3 = 3;
            if (i2 != 3) {
                i3 = 4;
                if (i2 != 4) {
                    i3 = 5;
                    if (i2 != 5 && i2 != 15) {
                        return -1;
                    }
                }
            }
        }
        return i3;
    }

    public static List<String> qdl(List<String> list, boolean z2) {
        String strQdl = fs.qdl(yt.qdl());
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
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(strQdl)) {
                next = next.replace("{UID}", strQdl).replace("__UID__", strQdl);
            }
            if (z2) {
                next = qdl(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    private static String qdl(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return str.replace("[ss_random]", String.valueOf(new SecureRandom().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception e2) {
                aaj.lnr("TrackAdUrlUtils", e2.getMessage());
            }
        }
        return str;
    }

    public static List<String> qdl(List<String> list, boolean z2, ljh ljhVar) {
        String strQdl = fs.qdl(yt.qdl());
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
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(strQdl)) {
                next = next.replace("{UID}", strQdl).replace("__UID__", strQdl);
            }
            if (next.contains("__CID__") && ljhVar != null && !TextUtils.isEmpty(ljhVar.yre())) {
                next = next.replace("__CID__", ljhVar.yre());
            }
            if (next.contains("__CTYPE__") && ljhVar != null) {
                next = next.replace("__CTYPE__", String.valueOf(qdl(ljhVar.vxg())));
            }
            if (next.contains("__GAID__")) {
                next = next.replace("__GAID__", com.bytedance.sdk.openadsdk.exc.qdl.ud.qdl.qdl().ud());
            }
            if (next.contains("__OS__")) {
                next = next.replace("__OS__", "0");
            }
            if (next.contains("__UA1__")) {
                next = next.replace("__UA1__", URLEncoder.encode(gy.mml()));
            }
            if (z2) {
                next = qdl(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
