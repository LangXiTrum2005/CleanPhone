package com.bytedance.sdk.openadsdk.core.sf;

import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class lr {
    private static com.bytedance.sdk.openadsdk.core.sf.ri ri;

    public static class ri {
        private static final lr ri = new lr();
    }

    public long di() {
        com.bytedance.sdk.openadsdk.core.sf.ri riVar = ri;
        if (riVar != null) {
            return riVar.di();
        }
        return 0L;
    }

    public String fi() {
        com.bytedance.sdk.openadsdk.core.sf.ri riVar = ri;
        return riVar != null ? riVar.fi() : "";
    }

    public boolean ik() {
        com.bytedance.sdk.openadsdk.core.sf.ri riVar = ri;
        if (riVar == null) {
            return false;
        }
        return riVar.lr();
    }

    public String ka() {
        String strKa;
        com.bytedance.sdk.openadsdk.core.sf.ri riVar = ri;
        return (riVar == null || (strKa = riVar.ka()) == null) ? "" : strKa;
    }

    public void lr(String str) {
        com.bytedance.sdk.openadsdk.core.sf.ri riVar;
        if (TextUtils.isEmpty(str) || (riVar = ri) == null) {
            return;
        }
        riVar.lr(str);
    }

    public void ri(String str) {
        com.bytedance.sdk.openadsdk.core.sf.ri riVar;
        if (TextUtils.isEmpty(str) || (riVar = ri) == null) {
            return;
        }
        riVar.ri(str);
    }

    public int xha() {
        com.bytedance.sdk.openadsdk.core.sf.ri riVar = ri;
        if (riVar != null) {
            return riVar.xha();
        }
        return 1;
    }

    private lr() {
        ri = new com.bytedance.sdk.openadsdk.core.sf.ri();
    }

    public static lr lr() {
        return ri.ri;
    }

    public void ri(Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.sf.ri riVar = ri;
        if (riVar != null) {
            riVar.ri(map);
        }
    }

    public void ri() {
        com.bytedance.sdk.openadsdk.core.sf.ri riVar = ri;
        if (riVar != null) {
            riVar.ik();
        }
    }

    public void ri(String str, Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.sf.ri riVar = ri;
        if (riVar != null) {
            riVar.ri(str, map);
        }
    }

    public Map<String, String> ri(String str, byte[] bArr) {
        com.bytedance.sdk.openadsdk.core.sf.ri riVar = ri;
        if (riVar != null) {
            return riVar.ri(str, bArr);
        }
        return new HashMap();
    }

    public void ri(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.sf.ri riVar = ri;
        if (riVar != null) {
            riVar.ri(motionEvent);
        }
    }
}
