package com.inmobi.media;

/* JADX INFO: loaded from: classes3.dex */
public final class Pl extends Rl {
    public final long a;

    public Pl(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Pl) && this.a == ((Pl) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "VideoComplete(duration=" + this.a + ")";
    }
}
