package com.bytedance.adsdk.ri;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class slm {
    public static Object ri(com.bytedance.adsdk.ri.lr.ri.ri riVar) {
        jbs jbsVarRi;
        if (riVar == null || (jbsVarRi = ri(riVar.ri())) == null) {
            return null;
        }
        return jbsVarRi.ri(null, riVar.lr());
    }

    public static jbs ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        switch (str) {
            case "toNumber":
                return new aw();
            case "toString":
                return new bgr();
            case "formatDecimal":
                return new xha();
            case "modArray":
                return new qt();
            case "find":
                return new di();
            case "size":
                return new sf();
            case "chunk":
                return new ri();
            case "exist":
                return new fi();
            case "split":
                return new co();
            case "decodeUrl":
                return new lr();
            case "translate":
                return new vr();
            case "encodeUrl":
                return new ka();
            case "isDigit":
                return new mj();
            default:
                return null;
        }
    }
}
