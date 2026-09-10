package iiion;

/* JADX INFO: compiled from: AutoValue_StartupTime.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal extends triweekly {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long f28411attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final long f28412dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long f28413saneness;

    public attabal(long j, long j2, long j3) {
        this.f28411attabal = j;
        this.f28413saneness = j2;
        this.f28412dern = j3;
    }

    @Override // iiion.triweekly
    public long dern() {
        return this.f28411attabal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof triweekly) {
            triweekly triweeklyVar = (triweekly) obj;
            if (this.f28411attabal == triweeklyVar.dern() && this.f28413saneness == triweeklyVar.saneness() && this.f28412dern == triweeklyVar.wireman()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f28411attabal;
        long j2 = this.f28413saneness;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f28412dern;
        return i ^ ((int) ((j3 >>> 32) ^ j3));
    }

    @Override // iiion.triweekly
    public long saneness() {
        return this.f28413saneness;
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f28411attabal + ", elapsedRealtime=" + this.f28413saneness + ", uptimeMillis=" + this.f28412dern + "}";
    }

    @Override // iiion.triweekly
    public long wireman() {
        return this.f28412dern;
    }
}
