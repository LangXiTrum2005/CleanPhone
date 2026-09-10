package com.bytedance.sdk.openadsdk.core.QAg;

import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class LD {
    private static com.bytedance.sdk.openadsdk.core.QAg.Lxb Lxb;
    private String LD;

    public static class Lxb {
        private static final LD Lxb = new LD();
    }

    public String JXs() {
        com.bytedance.sdk.openadsdk.core.QAg.Lxb lxb = Lxb;
        return lxb != null ? lxb.JXs() : "";
    }

    public void LD(String str) {
        com.bytedance.sdk.openadsdk.core.QAg.Lxb lxb;
        if (TextUtils.isEmpty(str) || (lxb = Lxb) == null) {
            return;
        }
        lxb.LD(str);
    }

    public void Lxb(String str) {
        com.bytedance.sdk.openadsdk.core.QAg.Lxb lxb;
        if (TextUtils.isEmpty(str) || (lxb = Lxb) == null) {
            return;
        }
        lxb.Lxb(str);
    }

    public String ZU() {
        String strZU;
        com.bytedance.sdk.openadsdk.core.QAg.Lxb lxb = Lxb;
        return (lxb == null || (strZU = lxb.ZU()) == null) ? "" : strZU;
    }

    public int ebl() {
        com.bytedance.sdk.openadsdk.core.QAg.Lxb lxb = Lxb;
        if (lxb != null) {
            return lxb.ebl();
        }
        return 1;
    }

    public long lc() {
        com.bytedance.sdk.openadsdk.core.QAg.Lxb lxb = Lxb;
        if (lxb != null) {
            return lxb.lc();
        }
        return 0L;
    }

    public boolean lk() {
        com.bytedance.sdk.openadsdk.core.QAg.Lxb lxb = Lxb;
        if (lxb == null) {
            return false;
        }
        return lxb.LD();
    }

    private LD() {
        this.LD = null;
        Lxb = new com.bytedance.sdk.openadsdk.core.QAg.Lxb();
    }

    public static LD LD() {
        return Lxb.Lxb;
    }

    public void Lxb() {
        com.bytedance.sdk.openadsdk.core.QAg.Lxb lxb = Lxb;
        if (lxb != null) {
            lxb.lk();
        }
    }

    public void Lxb(@NonNull String str, Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.QAg.Lxb lxb = Lxb;
        if (lxb != null) {
            lxb.Lxb(str, map);
        }
    }

    public Map<String, String> Lxb(String str, byte[] bArr) {
        com.bytedance.sdk.openadsdk.core.QAg.Lxb lxb = Lxb;
        if (lxb != null) {
            return lxb.Lxb(str, bArr);
        }
        return new HashMap();
    }

    public void Lxb(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.QAg.Lxb lxb = Lxb;
        if (lxb != null) {
            lxb.Lxb(motionEvent);
        }
    }
}
