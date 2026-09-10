package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.ironsource.X3;
import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class SeekPoint {
    public static final SeekPoint START = new SeekPoint(0, 0);
    public final long position;
    public final long timeUs;

    public SeekPoint(long j10, long j11) {
        this.timeUs = j10;
        this.position = j11;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SeekPoint.class == obj.getClass()) {
            SeekPoint seekPoint = (SeekPoint) obj;
            if (this.timeUs == seekPoint.timeUs && this.position == seekPoint.position) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.timeUs) * 31) + ((int) this.position);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.timeUs);
        sb2.append(", position=");
        return e.r(sb2, this.position, X3.j.f27836e);
    }
}
