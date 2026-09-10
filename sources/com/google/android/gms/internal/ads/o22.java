package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class o22 extends rx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18092a;

    public o22(IllegalStateException illegalStateException, p22 p22Var) {
        super("Decoder failed: ".concat(String.valueOf(p22Var == null ? null : p22Var.f18452a)), illegalStateException);
        boolean z10 = illegalStateException instanceof MediaCodec.CodecException;
        if (z10) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f18092a = z10 ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
