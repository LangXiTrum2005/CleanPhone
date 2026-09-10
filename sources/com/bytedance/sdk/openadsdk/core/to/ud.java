package com.bytedance.sdk.openadsdk.core.to;

import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ud {
    private static com.bytedance.sdk.openadsdk.core.to.qdl qdl;
    private String ud;

    public static class qdl {
        private static final ud qdl = new ud();
    }

    public boolean lnr() {
        com.bytedance.sdk.openadsdk.core.to.qdl qdlVar = qdl;
        if (qdlVar == null) {
            return false;
        }
        return qdlVar.ud();
    }

    public String mml() {
        String strMml;
        com.bytedance.sdk.openadsdk.core.to.qdl qdlVar = qdl;
        return (qdlVar == null || (strMml = qdlVar.mml()) == null) ? "" : strMml;
    }

    public long mo() {
        com.bytedance.sdk.openadsdk.core.to.qdl qdlVar = qdl;
        if (qdlVar != null) {
            return qdlVar.mo();
        }
        return 0L;
    }

    public String mzz() {
        com.bytedance.sdk.openadsdk.core.to.qdl qdlVar = qdl;
        return qdlVar != null ? qdlVar.mzz() : "";
    }

    public void qdl(String str) {
        com.bytedance.sdk.openadsdk.core.to.qdl qdlVar;
        if (TextUtils.isEmpty(str) || (qdlVar = qdl) == null) {
            return;
        }
        qdlVar.qdl(str);
    }

    public void ud(String str) {
        com.bytedance.sdk.openadsdk.core.to.qdl qdlVar;
        if (TextUtils.isEmpty(str) || (qdlVar = qdl) == null) {
            return;
        }
        qdlVar.ud(str);
    }

    public int wd() {
        com.bytedance.sdk.openadsdk.core.to.qdl qdlVar = qdl;
        if (qdlVar != null) {
            return qdlVar.wd();
        }
        return 1;
    }

    private ud() {
        this.ud = null;
        qdl = new com.bytedance.sdk.openadsdk.core.to.qdl();
    }

    public static ud ud() {
        return qdl.qdl;
    }

    public void qdl(Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.to.qdl qdlVar = qdl;
        if (qdlVar != null) {
            qdlVar.qdl(map);
        }
    }

    public void qdl() {
        com.bytedance.sdk.openadsdk.core.to.qdl qdlVar = qdl;
        if (qdlVar != null) {
            qdlVar.lnr();
        }
    }

    public void qdl(String str, Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.to.qdl qdlVar = qdl;
        if (qdlVar != null) {
            qdlVar.qdl(str, map);
        }
    }

    public Map<String, String> qdl(String str, byte[] bArr) {
        com.bytedance.sdk.openadsdk.core.to.qdl qdlVar = qdl;
        if (qdlVar != null) {
            return qdlVar.qdl(str, bArr);
        }
        return new HashMap();
    }

    public void qdl(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.to.qdl qdlVar = qdl;
        if (qdlVar != null) {
            qdlVar.qdl(motionEvent);
        }
    }
}
