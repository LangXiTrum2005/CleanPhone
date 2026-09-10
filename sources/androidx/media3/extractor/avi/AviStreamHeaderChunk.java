package androidx.media3.extractor.avi;

/* JADX INFO: loaded from: classes.dex */
final class AviStreamHeaderChunk implements AviChunk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6849c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6850e;

    public AviStreamHeaderChunk(int i2, int i3, int i4, int i5, int i6) {
        this.f6847a = i2;
        this.f6848b = i3;
        this.f6849c = i4;
        this.d = i5;
        this.f6850e = i6;
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public final int getType() {
        return 1752331379;
    }
}
