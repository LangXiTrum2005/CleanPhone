package androidx.media3.exoplayer;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes.dex */
final class MediaPeriodInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaSource.MediaPeriodId f5930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5932c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5933e;
    public final boolean f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5934h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f5935i;

    public MediaPeriodInfo(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, long j3, long j4, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        Assertions.b(!z5 || z3);
        Assertions.b(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        Assertions.b(z6);
        this.f5930a = mediaPeriodId;
        this.f5931b = j;
        this.f5932c = j2;
        this.d = j3;
        this.f5933e = j4;
        this.f = z2;
        this.g = z3;
        this.f5934h = z4;
        this.f5935i = z5;
    }

    public final MediaPeriodInfo a(long j) {
        if (j == this.f5932c) {
            return this;
        }
        return new MediaPeriodInfo(this.f5930a, this.f5931b, j, this.d, this.f5933e, this.f, this.g, this.f5934h, this.f5935i);
    }

    public final MediaPeriodInfo b(long j) {
        if (j == this.f5931b) {
            return this;
        }
        return new MediaPeriodInfo(this.f5930a, j, this.f5932c, this.d, this.f5933e, this.f, this.g, this.f5934h, this.f5935i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MediaPeriodInfo.class == obj.getClass()) {
            MediaPeriodInfo mediaPeriodInfo = (MediaPeriodInfo) obj;
            if (this.f5931b == mediaPeriodInfo.f5931b && this.f5932c == mediaPeriodInfo.f5932c && this.d == mediaPeriodInfo.d && this.f5933e == mediaPeriodInfo.f5933e && this.f == mediaPeriodInfo.f && this.g == mediaPeriodInfo.g && this.f5934h == mediaPeriodInfo.f5934h && this.f5935i == mediaPeriodInfo.f5935i && Util.a(this.f5930a, mediaPeriodInfo.f5930a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f5930a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.f5931b)) * 31) + ((int) this.f5932c)) * 31) + ((int) this.d)) * 31) + ((int) this.f5933e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.f5934h ? 1 : 0)) * 31) + (this.f5935i ? 1 : 0);
    }
}
