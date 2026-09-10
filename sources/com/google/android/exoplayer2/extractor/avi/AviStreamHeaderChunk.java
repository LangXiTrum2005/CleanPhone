package com.google.android.exoplayer2.extractor.avi;

/* JADX INFO: loaded from: classes3.dex */
final class AviStreamHeaderChunk implements AviChunk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17605c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17606e;

    public AviStreamHeaderChunk(int i2, int i3, int i4, int i5, int i6) {
        this.f17603a = i2;
        this.f17604b = i3;
        this.f17605c = i4;
        this.d = i5;
        this.f17606e = i6;
    }

    @Override // com.google.android.exoplayer2.extractor.avi.AviChunk
    public final int getType() {
        return 1752331379;
    }
}
