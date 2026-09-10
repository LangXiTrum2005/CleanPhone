package com.mbridge.msdk.playercommon.exoplayer2.drm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class DecryptionException extends Exception {
    public final int errorCode;

    public DecryptionException(int i10, String str) {
        super(str);
        this.errorCode = i10;
    }
}
