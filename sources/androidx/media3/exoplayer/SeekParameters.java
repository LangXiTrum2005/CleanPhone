package androidx.media3.exoplayer;

import androidx.media3.common.util.Assertions;

/* JADX INFO: loaded from: classes.dex */
public final class SeekParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SeekParameters f5984c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5986b;

    static {
        SeekParameters seekParameters = new SeekParameters(0L, 0L);
        new SeekParameters(Long.MAX_VALUE, Long.MAX_VALUE);
        new SeekParameters(Long.MAX_VALUE, 0L);
        new SeekParameters(0L, Long.MAX_VALUE);
        f5984c = seekParameters;
    }

    public SeekParameters(long j, long j2) {
        Assertions.b(j >= 0);
        Assertions.b(j2 >= 0);
        this.f5985a = j;
        this.f5986b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SeekParameters.class == obj.getClass()) {
            SeekParameters seekParameters = (SeekParameters) obj;
            if (this.f5985a == seekParameters.f5985a && this.f5986b == seekParameters.f5986b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f5985a) * 31) + ((int) this.f5986b);
    }
}
