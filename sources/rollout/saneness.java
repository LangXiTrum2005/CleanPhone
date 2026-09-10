package rollout;

/* JADX INFO: compiled from: AutoValue_RolloutAssignment.java */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness extends cutely {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final long f36785beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f36786dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final String f36787marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f36788saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final String f36789wireman;

    public saneness(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f36788saneness = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f36786dern = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f36789wireman = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f36787marial = str4;
        this.f36785beachfront = j;
    }

    @Override // rollout.cutely
    public long beachfront() {
        return this.f36785beachfront;
    }

    @Override // rollout.cutely
    public String competently() {
        return this.f36787marial;
    }

    @Override // rollout.cutely
    public String dern() {
        return this.f36786dern;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cutely) {
            cutely cutelyVar = (cutely) obj;
            if (this.f36788saneness.equals(cutelyVar.marial()) && this.f36786dern.equals(cutelyVar.dern()) && this.f36789wireman.equals(cutelyVar.wireman()) && this.f36787marial.equals(cutelyVar.competently()) && this.f36785beachfront == cutelyVar.beachfront()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f36788saneness.hashCode() ^ 1000003) * 1000003) ^ this.f36786dern.hashCode()) * 1000003) ^ this.f36789wireman.hashCode()) * 1000003) ^ this.f36787marial.hashCode()) * 1000003;
        long j = this.f36785beachfront;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // rollout.cutely
    public String marial() {
        return this.f36788saneness;
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f36788saneness + ", parameterKey=" + this.f36786dern + ", parameterValue=" + this.f36789wireman + ", variantId=" + this.f36787marial + ", templateVersion=" + this.f36785beachfront + "}";
    }

    @Override // rollout.cutely
    public String wireman() {
        return this.f36789wireman;
    }
}
