package androidx.work;

/* JADX INFO: loaded from: classes.dex */
public final class Constraints {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Constraints f8605i = new Builder().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8608c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8609e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NetworkType f8606a = NetworkType.X;
    public long f = -1;
    public long g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ContentUriTriggers f8610h = new ContentUriTriggers();

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public NetworkType f8611a = NetworkType.X;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ContentUriTriggers f8612b = new ContentUriTriggers();

        public final Constraints a() {
            Constraints constraints = new Constraints();
            constraints.f8606a = NetworkType.X;
            constraints.f = -1L;
            constraints.g = -1L;
            new ContentUriTriggers();
            constraints.f8607b = false;
            constraints.f8608c = false;
            constraints.f8606a = this.f8611a;
            constraints.d = false;
            constraints.f8609e = false;
            constraints.f8610h = this.f8612b;
            constraints.f = -1L;
            constraints.g = -1L;
            return constraints;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Constraints.class != obj.getClass()) {
            return false;
        }
        Constraints constraints = (Constraints) obj;
        if (this.f8607b == constraints.f8607b && this.f8608c == constraints.f8608c && this.d == constraints.d && this.f8609e == constraints.f8609e && this.f == constraints.f && this.g == constraints.g && this.f8606a == constraints.f8606a) {
            return this.f8610h.equals(constraints.f8610h);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f8606a.hashCode() * 31) + (this.f8607b ? 1 : 0)) * 31) + (this.f8608c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f8609e ? 1 : 0)) * 31;
        long j = this.f;
        int i2 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.g;
        return this.f8610h.f8613a.hashCode() + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }
}
