package com.mbridge.msdk.tracker.network.toolbox;

import android.text.TextUtils;
import com.mbridge.msdk.tracker.network.t;
import d5.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d {
    public static String a(String str, t<?> tVar) {
        if (TextUtils.isEmpty(str) || tVar == null) {
            return "";
        }
        byte[] bArrB = tVar.b();
        if (bArrB == null || bArrB.length == 0) {
            return str;
        }
        if (str.endsWith("?")) {
            return str.concat(new String(bArrB));
        }
        StringBuilder sbJ = u.j(str, "?");
        sbJ.append(new String(bArrB));
        return sbJ.toString();
    }
}
