package com.bytedance.sdk.openadsdk.ZU.Lxb;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class STP {
    public static STP Lxb = new STP();
    private Lxb LD;
    private volatile boolean ZU;
    private final Map<String, Lxb> lk = new HashMap();

    public static class Lxb {
        private final int LD;
        private final int Lxb;

        public Lxb(int i, int i2) {
            this.Lxb = (i < 0 || i > 5) ? 3 : i;
            this.LD = i2 < 10 ? 30 : i2;
        }

        public int LD() {
            return this.LD;
        }

        public int Lxb() {
            return this.Lxb;
        }
    }

    private int LD() {
        Lxb lxb = this.LD;
        if (lxb != null) {
            return lxb.Lxb();
        }
        return 3;
    }

    private int lk() {
        Lxb lxb = this.LD;
        if (lxb != null) {
            return lxb.LD();
        }
        return 30;
    }

    public void Lxb(Lxb lxb) {
        this.LD = lxb;
    }

    public void Lxb(String str, Lxb lxb) {
        if (TextUtils.isEmpty(str) || lxb == null) {
            return;
        }
        this.lk.put(str, lxb);
    }

    public int LD(String str) {
        Lxb lxb = this.lk.get(str);
        if (lxb == null) {
            return lk();
        }
        return lxb.LD();
    }

    public int Lxb(String str) {
        if (!Lxb()) {
            return 4;
        }
        Lxb lxb = this.lk.get(str);
        if (lxb == null) {
            return LD();
        }
        return lxb.Lxb();
    }

    public boolean Lxb() {
        return this.ZU;
    }

    public void Lxb(boolean z) {
        this.ZU = z;
    }
}
