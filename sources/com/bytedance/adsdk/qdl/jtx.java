package com.bytedance.adsdk.qdl;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class jtx {
    public static Object qdl(com.bytedance.adsdk.qdl.ud.qdl.qdl qdlVar) {
        tvp tvpVarQdl;
        if (qdlVar == null || (tvpVarQdl = qdl(qdlVar.qdl())) == null) {
            return null;
        }
        return tvpVarQdl.qdl(null, qdlVar.ud());
    }

    public static tvp qdl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        switch (str) {
            case "toNumber":
                return new exu();
            case "toString":
                return new rdp();
            case "formatDecimal":
                return new wd();
            case "modArray":
                return new to();
            case "find":
                return new mo();
            case "size":
                return new rq();
            case "chunk":
                return new qdl();
            case "exist":
                return new mzz();
            case "split":
                return new fs();
            case "decodeUrl":
                return new ud();
            case "translate":
                return new bjy();
            case "encodeUrl":
                return new mml();
            case "isDigit":
                return new jpc();
            default:
                return null;
        }
    }
}
