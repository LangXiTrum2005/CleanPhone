package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.hn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2962hn extends Rl {
    public final long a;

    public C2962hn(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2962hn) && this.a == ((C2962hn) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "VideoResume(currentPlaybackTime=" + this.a + ")";
    }
}
