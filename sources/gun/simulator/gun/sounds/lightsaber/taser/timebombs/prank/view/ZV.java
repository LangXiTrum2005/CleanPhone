package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class ZV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4073a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ZV(String str, String str2, String str3, String str4, String str5) {
        this.f4073a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZV)) {
            return false;
        }
        ZV zv = (ZV) obj;
        return Ug0.a(this.f4073a, zv.f4073a) && Ug0.a(this.b, zv.b) && Ug0.a(this.c, zv.c) && Ug0.a(this.d, zv.d) && Ug0.a(this.e, zv.e);
    }

    public final int hashCode() {
        String str = this.f4073a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
