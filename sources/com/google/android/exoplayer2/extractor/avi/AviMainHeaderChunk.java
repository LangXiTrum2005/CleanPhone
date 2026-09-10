package com.google.android.exoplayer2.extractor.avi;

/* JADX INFO: loaded from: classes3.dex */
final class AviMainHeaderChunk implements AviChunk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17602c;

    public AviMainHeaderChunk(int i2, int i3, int i4) {
        this.f17600a = i2;
        this.f17601b = i3;
        this.f17602c = i4;
    }

    @Override // com.google.android.exoplayer2.extractor.avi.AviChunk
    public final int getType() {
        return 1751742049;
    }
}
