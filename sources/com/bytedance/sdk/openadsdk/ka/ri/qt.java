package com.bytedance.sdk.openadsdk.ka.ri;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class qt {
    public static qt ri = new qt();
    private final Map<String, ri> ik = new HashMap();
    private volatile boolean ka;
    private ri lr;

    public static class ri {
        private final int lr;
        private final int ri;

        public ri(int i, int i2) {
            this.ri = (i < 0 || i > 5) ? 3 : i;
            this.lr = i2 < 10 ? 30 : i2;
        }

        public int lr() {
            return this.lr;
        }

        public int ri() {
            return this.ri;
        }
    }

    private int ik() {
        ri riVar = this.lr;
        if (riVar != null) {
            return riVar.lr();
        }
        return 30;
    }

    private int lr() {
        ri riVar = this.lr;
        if (riVar != null) {
            return riVar.ri();
        }
        return 3;
    }

    public void ri(ri riVar) {
        this.lr = riVar;
    }

    public void ri(String str, ri riVar) {
        if (TextUtils.isEmpty(str) || riVar == null) {
            return;
        }
        this.ik.put(str, riVar);
    }

    public int lr(String str) {
        ri riVar = this.ik.get(str);
        if (riVar == null) {
            return ik();
        }
        return riVar.lr();
    }

    public int ri(String str) {
        if (!ri()) {
            return 4;
        }
        ri riVar = this.ik.get(str);
        if (riVar == null) {
            return lr();
        }
        return riVar.ri();
    }

    public boolean ri() {
        return this.ka;
    }

    public void ri(boolean z) {
        this.ka = z;
    }
}
