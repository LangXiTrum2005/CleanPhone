package com.bytedance.sdk.component.ebl.ZU;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    private LD LD;
    private Lxb Lxb;

    public interface LD {
    }

    public enum Lxb {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.ebl.ZU.lk$lk, reason: collision with other inner class name */
    public static class C0063lk {
        private static final lk Lxb = new lk();
    }

    public static void Lxb(Lxb lxb) {
        synchronized (lk.class) {
            C0063lk.Lxb.Lxb = lxb;
        }
    }

    private lk() {
        this.Lxb = Lxb.OFF;
        this.LD = new com.bytedance.sdk.component.ebl.ZU.LD();
    }
}
