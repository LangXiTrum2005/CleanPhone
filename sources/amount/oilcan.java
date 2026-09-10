package amount;

/* JADX INFO: compiled from: AutoValue_StaticSessionData_DeviceData.java */
/* JADX INFO: loaded from: classes3.dex */
public final class oilcan extends kattegat.saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f4313attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final boolean f4314beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final int f4315competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f4316dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final String f4317impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final long f4318marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f4319saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final String f4320taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final long f4321wireman;

    public oilcan(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f4313attabal = i;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f4319saneness = str;
        this.f4316dern = i2;
        this.f4321wireman = j;
        this.f4318marial = j2;
        this.f4314beachfront = z;
        this.f4315competently = i3;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f4317impromptu = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f4320taiyuan = str3;
    }

    @Override // amount.kattegat.saneness
    public int attabal() {
        return this.f4313attabal;
    }

    @Override // amount.kattegat.saneness
    public String beachfront() {
        return this.f4317impromptu;
    }

    @Override // amount.kattegat.saneness
    public String competently() {
        return this.f4319saneness;
    }

    @Override // amount.kattegat.saneness
    public long cutely() {
        return this.f4321wireman;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kattegat.saneness) {
            kattegat.saneness sanenessVar = (kattegat.saneness) obj;
            if (this.f4313attabal == sanenessVar.attabal() && this.f4319saneness.equals(sanenessVar.competently()) && this.f4316dern == sanenessVar.saneness() && this.f4321wireman == sanenessVar.cutely() && this.f4318marial == sanenessVar.wireman() && this.f4314beachfront == sanenessVar.marial() && this.f4315competently == sanenessVar.taiyuan() && this.f4317impromptu.equals(sanenessVar.beachfront()) && this.f4320taiyuan.equals(sanenessVar.impromptu())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((this.f4313attabal ^ 1000003) * 1000003) ^ this.f4319saneness.hashCode()) * 1000003) ^ this.f4316dern) * 1000003;
        long j = this.f4321wireman;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f4318marial;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f4314beachfront ? 1231 : 1237)) * 1000003) ^ this.f4315competently) * 1000003) ^ this.f4317impromptu.hashCode()) * 1000003) ^ this.f4320taiyuan.hashCode();
    }

    @Override // amount.kattegat.saneness
    public String impromptu() {
        return this.f4320taiyuan;
    }

    @Override // amount.kattegat.saneness
    public boolean marial() {
        return this.f4314beachfront;
    }

    @Override // amount.kattegat.saneness
    public int saneness() {
        return this.f4316dern;
    }

    @Override // amount.kattegat.saneness
    public int taiyuan() {
        return this.f4315competently;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f4313attabal + ", model=" + this.f4319saneness + ", availableProcessors=" + this.f4316dern + ", totalRam=" + this.f4321wireman + ", diskSpace=" + this.f4318marial + ", isEmulator=" + this.f4314beachfront + ", state=" + this.f4315competently + ", manufacturer=" + this.f4317impromptu + ", modelClass=" + this.f4320taiyuan + "}";
    }

    @Override // amount.kattegat.saneness
    public long wireman() {
        return this.f4318marial;
    }
}
