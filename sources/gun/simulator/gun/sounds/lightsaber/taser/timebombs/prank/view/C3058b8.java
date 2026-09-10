package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.b8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3058b8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4160a;
    public final String b;
    public final String c;
    public final C4113n8 d;
    public final EnumC4471rD e;

    public C3058b8(String str, String str2, String str3, C4113n8 c4113n8, EnumC4471rD enumC4471rD) {
        this.f4160a = str;
        this.b = str2;
        this.c = str3;
        this.d = c4113n8;
        this.e = enumC4471rD;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3058b8)) {
            return false;
        }
        C3058b8 c3058b8 = (C3058b8) obj;
        String str = this.f4160a;
        if (str != null ? str.equals(c3058b8.f4160a) : c3058b8.f4160a == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(c3058b8.b) : c3058b8.b == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(c3058b8.c) : c3058b8.c == null) {
                    C4113n8 c4113n8 = this.d;
                    if (c4113n8 != null ? c4113n8.equals(c3058b8.d) : c3058b8.d == null) {
                        EnumC4471rD enumC4471rD = this.e;
                        if (enumC4471rD == null) {
                            if (c3058b8.e == null) {
                                return true;
                            }
                        } else if (enumC4471rD.equals(c3058b8.e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4160a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C4113n8 c4113n8 = this.d;
        int iHashCode4 = (iHashCode3 ^ (c4113n8 == null ? 0 : c4113n8.hashCode())) * 1000003;
        EnumC4471rD enumC4471rD = this.e;
        return (enumC4471rD != null ? enumC4471rD.hashCode() : 0) ^ iHashCode4;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f4160a + ", fid=" + this.b + ", refreshToken=" + this.c + ", authToken=" + this.d + ", responseCode=" + this.e + "}";
    }
}
