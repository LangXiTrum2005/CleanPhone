package com.google.android.exoplayer2;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ParserException extends IOException {
    public final boolean X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f17174Y;

    public ParserException(String str, Exception exc, boolean z2, int i2) {
        super(str, exc);
        this.X = z2;
        this.f17174Y = i2;
    }

    public static ParserException a(Exception exc, String str) {
        return new ParserException(str, exc, true, 1);
    }

    public static ParserException b(String str) {
        return new ParserException(str, null, false, 1);
    }
}
