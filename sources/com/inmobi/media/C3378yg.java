package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.yg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3378yg extends Tn {
    public final int a;

    public C3378yg(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3378yg) && this.a == ((C3378yg) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "PollingVisibilityTrackerConfig(pollingIntervalInMillis=" + this.a + ")";
    }
}
