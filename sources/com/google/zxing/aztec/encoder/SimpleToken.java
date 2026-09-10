package com.google.zxing.aztec.encoder;

/* JADX INFO: loaded from: classes3.dex */
final class SimpleToken extends Token {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short f21339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f21340c;

    public SimpleToken(Token token, int i2, int i3) {
        this.f21339b = (short) i2;
        this.f21340c = (short) i3;
    }

    public final String toString() {
        short s = this.f21340c;
        return "<" + Integer.toBinaryString((1 << s) | (((1 << s) - 1) & this.f21339b) | (1 << s)).substring(1) + '>';
    }
}
