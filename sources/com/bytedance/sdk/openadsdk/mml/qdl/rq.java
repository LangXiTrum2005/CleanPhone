package com.bytedance.sdk.openadsdk.mml.qdl;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class rq {
    public static rq qdl = new rq();
    private final Map<String, qdl> lnr = new HashMap();
    private volatile boolean mml;
    private qdl ud;

    public static class qdl {
        private final int qdl;
        private final int ud;

        public qdl(int i2, int i3) {
            this.qdl = (i2 < 0 || i2 > 5) ? 3 : i2;
            this.ud = i3 < 10 ? 30 : i3;
        }

        public int qdl() {
            return this.qdl;
        }

        public int ud() {
            return this.ud;
        }
    }

    private int lnr() {
        qdl qdlVar = this.ud;
        if (qdlVar != null) {
            return qdlVar.ud();
        }
        return 30;
    }

    private int ud() {
        qdl qdlVar = this.ud;
        if (qdlVar != null) {
            return qdlVar.qdl();
        }
        return 3;
    }

    public void qdl(qdl qdlVar) {
        this.ud = qdlVar;
    }

    public void qdl(String str, qdl qdlVar) {
        if (TextUtils.isEmpty(str) || qdlVar == null) {
            return;
        }
        this.lnr.put(str, qdlVar);
    }

    public int ud(String str) {
        qdl qdlVar = this.lnr.get(str);
        if (qdlVar == null) {
            return lnr();
        }
        return qdlVar.ud();
    }

    public int qdl(String str) {
        if (!qdl()) {
            return 4;
        }
        qdl qdlVar = this.lnr.get(str);
        if (qdlVar == null) {
            return ud();
        }
        return qdlVar.qdl();
    }

    public boolean qdl() {
        return this.mml;
    }

    public void qdl(boolean z2) {
        this.mml = z2;
    }
}
