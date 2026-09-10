package com.bytedance.sdk.component.embedapplog;

/* JADX INFO: loaded from: classes2.dex */
class PangleEncryptUtils {
    static {
        try {
            System.loadLibrary("tobEmbedPagEncrypt");
        } catch (UnsatisfiedLinkError e) {
            e.getMessage();
        }
    }

    public static byte[] decrypt(byte[] bArr, int i) {
        try {
            return ttDecrypt(bArr, i);
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static byte[] encrypt(byte[] bArr, int i) {
        try {
            return ttEncrypt(bArr, i);
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    private static native byte[] ttDecrypt(byte[] bArr, int i);

    private static native byte[] ttEncrypt(byte[] bArr, int i);
}
