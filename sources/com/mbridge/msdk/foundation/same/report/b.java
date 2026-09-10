package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f33902a = "DomainReport";

    public static boolean a(com.mbridge.msdk.setting.g gVar, String str) {
        if (gVar != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    int iM = gVar.M();
                    JSONArray jSONArrayK = gVar.K();
                    JSONArray jSONArrayJ = gVar.J();
                    if (jSONArrayJ != null) {
                        for (int i10 = 0; i10 < jSONArrayJ.length(); i10++) {
                            if (str.contains(jSONArrayJ.getString(i10))) {
                                return false;
                            }
                        }
                    }
                    if (iM == 2) {
                        if (jSONArrayK != null) {
                            for (int i11 = 0; i11 < jSONArrayK.length(); i11++) {
                                if (str.contains(jSONArrayK.getString(i11))) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }
            } catch (Exception e10) {
                q0.b(f33902a, e10.getMessage());
            }
        }
        return true;
    }
}
