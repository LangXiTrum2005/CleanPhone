package com.bytedance.sdk.component.utils;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class wjv {
    private static lr ri;

    public interface lr {
        void ri(String str, boolean z, ri riVar);
    }

    public static abstract class ri {
        public final String lr() {
            try {
                return ri().toString();
            } catch (Exception unused) {
                return "";
            }
        }

        public abstract JSONObject ri();
    }

    public static void ri(lr lrVar) {
        ri = lrVar;
    }

    public static void ri(String str, ri riVar) {
        lr lrVar = ri;
        if (lrVar == null) {
            return;
        }
        lrVar.ri(str, false, riVar);
    }
}
