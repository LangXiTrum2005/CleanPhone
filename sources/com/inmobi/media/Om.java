package com.inmobi.media;

/* JADX INFO: loaded from: classes3.dex */
public final class Om extends Rl {
    public final long a;

    public Om(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Om) && this.a == ((Om) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "VideoPause(currentPlaybackTime=" + this.a + ")";
    }
}
