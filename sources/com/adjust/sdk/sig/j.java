package com.adjust.sdk.sig;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f6968a = Charset.forName("UTF-8");

    static {
        Charset.forName(C.UTF16_NAME);
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName(C.ASCII_NAME);
        Charset.forName("ISO-8859-1");
    }
}
