package com.google.firebase.crashlytics.internal.metadata;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_RolloutAssignment extends RolloutAssignment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20384c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20385e;
    public final long f;

    public AutoValue_RolloutAssignment(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f20383b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f20384c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f20385e = str4;
        this.f = j;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public final String b() {
        return this.f20384c;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public final String c() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public final String d() {
        return this.f20383b;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public final long e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RolloutAssignment)) {
            return false;
        }
        RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
        return this.f20383b.equals(rolloutAssignment.d()) && this.f20384c.equals(rolloutAssignment.b()) && this.d.equals(rolloutAssignment.c()) && this.f20385e.equals(rolloutAssignment.f()) && this.f == rolloutAssignment.e();
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public final String f() {
        return this.f20385e;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f20383b.hashCode() ^ 1000003) * 1000003) ^ this.f20384c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f20385e.hashCode()) * 1000003;
        long j = this.f;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.f20383b);
        sb.append(", parameterKey=");
        sb.append(this.f20384c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.f20385e);
        sb.append(", templateVersion=");
        return android.support.v4.media.a.j(this.f, "}", sb);
    }
}
