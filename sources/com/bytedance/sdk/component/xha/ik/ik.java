package com.bytedance.sdk.component.xha.ik;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private lr lr;
    private ri ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.xha.ik.ik$ik, reason: collision with other inner class name */
    public static class C0218ik {
        private static final ik ri = new ik();
    }

    public interface lr {
    }

    public enum ri {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    public static void ri(ri riVar) {
        synchronized (ik.class) {
            C0218ik.ri.ri = riVar;
        }
    }

    private ik() {
        this.ri = ri.OFF;
        this.lr = new com.bytedance.sdk.component.xha.ik.lr();
    }
}
