package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.j8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3761j8 {
    public static final /* synthetic */ int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4538a;
    public final EnumC3699iU b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;

    static {
        C3274de0 c3274de0 = new C3274de0(5);
        c3274de0.f = 0L;
        c3274de0.k(EnumC3699iU.f4502a);
        c3274de0.e = 0L;
        c3274de0.f();
    }

    public C3761j8(String str, EnumC3699iU enumC3699iU, String str2, String str3, long j, long j2, String str4) {
        this.f4538a = str;
        this.b = enumC3699iU;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = j2;
        this.g = str4;
    }

    public final C3274de0 a() {
        C3274de0 c3274de0 = new C3274de0();
        c3274de0.f4281a = this.f4538a;
        c3274de0.b = this.b;
        c3274de0.c = this.c;
        c3274de0.d = this.d;
        c3274de0.e = Long.valueOf(this.e);
        c3274de0.f = Long.valueOf(this.f);
        c3274de0.g = this.g;
        return c3274de0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3761j8)) {
            return false;
        }
        C3761j8 c3761j8 = (C3761j8) obj;
        String str = this.f4538a;
        if (str != null ? str.equals(c3761j8.f4538a) : c3761j8.f4538a == null) {
            if (this.b.equals(c3761j8.b)) {
                String str2 = c3761j8.c;
                String str3 = this.c;
                if (str3 != null ? str3.equals(str2) : str2 == null) {
                    String str4 = c3761j8.d;
                    String str5 = this.d;
                    if (str5 != null ? str5.equals(str4) : str4 == null) {
                        if (this.e == c3761j8.e && this.f == c3761j8.f) {
                            String str6 = c3761j8.g;
                            String str7 = this.g;
                            if (str7 == null) {
                                if (str6 == null) {
                                    return true;
                                }
                            } else if (str7.equals(str6)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4538a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str2 = this.c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.e;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.g;
        return (str4 != null ? str4.hashCode() : 0) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f4538a);
        sb.append(", registrationStatus=");
        sb.append(this.b);
        sb.append(", authToken=");
        sb.append(this.c);
        sb.append(", refreshToken=");
        sb.append(this.d);
        sb.append(", expiresInSecs=");
        sb.append(this.e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f);
        sb.append(", fisError=");
        return DM.m(sb, this.g, "}");
    }
}
