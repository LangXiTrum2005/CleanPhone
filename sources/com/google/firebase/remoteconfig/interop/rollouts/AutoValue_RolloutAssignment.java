package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.firebase.crashlytics.internal.model.a;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_RolloutAssignment extends RolloutAssignment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21007c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f21008e;
    public final long f;

    public static final class Builder extends RolloutAssignment.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f21009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f21010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f21011c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f21012e;
        public byte f;

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public final RolloutAssignment a() {
            if (this.f == 1 && this.f21009a != null && this.f21010b != null && this.f21011c != null && this.d != null) {
                return new AutoValue_RolloutAssignment(this.f21009a, this.f21010b, this.f21011c, this.d, this.f21012e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f21009a == null) {
                sb.append(" rolloutId");
            }
            if (this.f21010b == null) {
                sb.append(" variantId");
            }
            if (this.f21011c == null) {
                sb.append(" parameterKey");
            }
            if (this.d == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException(a.m(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public final RolloutAssignment.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f21011c = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public final RolloutAssignment.Builder c(String str) {
            this.d = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public final RolloutAssignment.Builder d(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f21009a = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public final RolloutAssignment.Builder e(long j) {
            this.f21012e = j;
            this.f = (byte) (this.f | 1);
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public final RolloutAssignment.Builder f(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f21010b = str;
            return this;
        }
    }

    public AutoValue_RolloutAssignment(String str, String str2, String str3, String str4, long j) {
        this.f21006b = str;
        this.f21007c = str2;
        this.d = str3;
        this.f21008e = str4;
        this.f = j;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public final String b() {
        return this.d;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public final String c() {
        return this.f21008e;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public final String d() {
        return this.f21006b;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
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
        return this.f21006b.equals(rolloutAssignment.d()) && this.f21007c.equals(rolloutAssignment.f()) && this.d.equals(rolloutAssignment.b()) && this.f21008e.equals(rolloutAssignment.c()) && this.f == rolloutAssignment.e();
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public final String f() {
        return this.f21007c;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f21006b.hashCode() ^ 1000003) * 1000003) ^ this.f21007c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f21008e.hashCode()) * 1000003;
        long j = this.f;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.f21006b);
        sb.append(", variantId=");
        sb.append(this.f21007c);
        sb.append(", parameterKey=");
        sb.append(this.d);
        sb.append(", parameterValue=");
        sb.append(this.f21008e);
        sb.append(", templateVersion=");
        return android.support.v4.media.a.j(this.f, "}", sb);
    }
}
