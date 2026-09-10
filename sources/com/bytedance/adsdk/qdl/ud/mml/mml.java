package com.bytedance.adsdk.qdl.ud.mml;

import com.p004ironsource.d9;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public enum mml implements mzz {
    LEFT_PAREN("("),
    RIGHT_PAREN(")"),
    LEFT_BRACKET(d9.i.d),
    RIGHT_BRACKET(d9.i.f24752e),
    COMMA(",");

    private static final Map<String, mml> mo;
    private final String wd;

    static {
        HashMap map = new HashMap(128);
        mo = map;
        for (mml mmlVar : map.values()) {
            mo.put(mmlVar.qdl(), mmlVar);
        }
    }

    mml(String str) {
        this.wd = str;
    }

    public static boolean qdl(mzz mzzVar) {
        return mzzVar instanceof mml;
    }

    public String qdl() {
        return this.wd;
    }
}
