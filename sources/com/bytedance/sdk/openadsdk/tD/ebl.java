package com.bytedance.sdk.openadsdk.tD;

/* JADX INFO: loaded from: classes2.dex */
public class ebl {
    private static Lxb Lxb;

    public interface Lxb {
        void Lxb(String str, String str2, Throwable th);
    }

    public static void Lxb(Lxb lxb) {
        Lxb = lxb;
    }

    public static boolean Lxb() {
        return Lxb != null;
    }

    public static void Lxb(String str, String str2, Throwable th) {
        if (Lxb == null) {
            return;
        }
        if (th == null) {
            th = new Throwable();
        }
        Lxb.Lxb(str, str2, th);
    }
}
