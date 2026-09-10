package com.google.zxing.aztec.encoder;

/* JADX INFO: loaded from: classes3.dex */
final class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21343c;

    static {
        SimpleToken simpleToken = Token.f21344a;
    }

    public State(Token token, int i2, int i3, int i4) {
        this.f21341a = i2;
        this.f21342b = i3;
        this.f21343c = i4;
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", HighLevelEncoder.f21336a[this.f21341a], Integer.valueOf(this.f21343c), Integer.valueOf(this.f21342b));
    }
}
