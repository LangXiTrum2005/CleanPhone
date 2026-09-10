package com.bytedance.sdk.component.utils;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class bch {
    private static ud qdl;

    public static abstract class qdl {
        public abstract JSONObject qdl();

        public final String ud() {
            try {
                return qdl().toString();
            } catch (Exception unused) {
                return "";
            }
        }
    }

    public interface ud {
        void reportStatsByRate(String str, boolean z2, qdl qdlVar);
    }

    public static void qdl(ud udVar) {
        qdl = udVar;
    }

    public static void qdl(String str, qdl qdlVar) {
        ud udVar = qdl;
        if (udVar == null) {
            return;
        }
        udVar.reportStatsByRate(str, false, qdlVar);
    }
}
