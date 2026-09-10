package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.jn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3011jn extends Rl {
    public final long a;

    public C3011jn(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3011jn) && this.a == ((C3011jn) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "VideoSkipped(currentPlaybackTime=" + this.a + ")";
    }
}
