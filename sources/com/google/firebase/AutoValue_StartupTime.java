package com.google.firebase;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_StartupTime extends StartupTime {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20143c;

    public AutoValue_StartupTime(long j, long j2, long j3) {
        this.f20141a = j;
        this.f20142b = j2;
        this.f20143c = j3;
    }

    @Override // com.google.firebase.StartupTime
    public final long a() {
        return this.f20142b;
    }

    @Override // com.google.firebase.StartupTime
    public final long b() {
        return this.f20141a;
    }

    @Override // com.google.firebase.StartupTime
    public final long c() {
        return this.f20143c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartupTime)) {
            return false;
        }
        StartupTime startupTime = (StartupTime) obj;
        return this.f20141a == startupTime.b() && this.f20142b == startupTime.a() && this.f20143c == startupTime.c();
    }

    public final int hashCode() {
        long j = this.f20141a;
        long j2 = this.f20142b;
        int i2 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f20143c;
        return i2 ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f20141a);
        sb.append(", elapsedRealtime=");
        sb.append(this.f20142b);
        sb.append(", uptimeMillis=");
        return android.support.v4.media.a.j(this.f20143c, "}", sb);
    }
}
