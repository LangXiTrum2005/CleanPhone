package com.google.android.gms.internal.auth;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f22890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f22891b;

    static {
        Charset.forName(C.ASCII_NAME);
        f22890a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f22891b = bArr;
        ByteBuffer.wrap(bArr);
    }
}
