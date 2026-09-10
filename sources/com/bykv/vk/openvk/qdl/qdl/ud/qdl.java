package com.bykv.vk.openvk.qdl.qdl.ud;

import com.bykv.vk.openvk.qdl.qdl.qdl.qdl.ud;
import com.p004ironsource.x4;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class qdl {
    public static int lnr = 10;
    public static int mml = 10;
    private static ud mzz = null;
    public static int qdl = 10;
    public static int ud = 10;

    public static int lnr() {
        return ud;
    }

    public static int mml() {
        return lnr;
    }

    public static int mzz() {
        return mml;
    }

    public static void qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            qdl = jSONObject.optInt("splash", 10);
            ud = jSONObject.optInt("reward", 10);
            lnr = jSONObject.optInt("brand", 10);
            int iOptInt = jSONObject.optInt(x4.d, 10);
            mml = iOptInt;
            if (qdl < 0) {
                qdl = 10;
            }
            if (ud < 0) {
                ud = 10;
            }
            if (lnr < 0) {
                lnr = 10;
            }
            if (iOptInt < 0) {
                mml = 10;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static int ud() {
        return qdl;
    }

    public static void qdl(ud udVar) {
        mzz = udVar;
    }

    public static void qdl() {
        ud udVar = mzz;
        if (udVar != null) {
            udVar.mml();
        }
    }
}
