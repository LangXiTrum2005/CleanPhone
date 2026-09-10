package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2577Lo {
    public static final C2473Ho Companion = new C2473Ho(null);
    private final String carrier;
    private C2551Ko ext;
    private final int h;
    private String ifa;
    private Integer lmt;
    private final String make;
    private final String model;
    private final String os;
    private final String osv;
    private String ua;
    private final int w;

    public /* synthetic */ C2577Lo(int i, String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6, String str7, Integer num, C2551Ko c2551Ko, O40 o40) {
        if (119 != (i & EnumC4719u30.JSON_ENCODE_ERROR_VALUE)) {
            AbstractC4496rb.B(i, EnumC4719u30.JSON_ENCODE_ERROR_VALUE, C2447Go.INSTANCE.getDescriptor());
            throw null;
        }
        this.make = str;
        this.model = str2;
        this.osv = str3;
        if ((i & 8) == 0) {
            this.carrier = null;
        } else {
            this.carrier = str4;
        }
        this.os = str5;
        this.w = i2;
        this.h = i3;
        if ((i & 128) == 0) {
            this.ua = null;
        } else {
            this.ua = str6;
        }
        if ((i & 256) == 0) {
            this.ifa = null;
        } else {
            this.ifa = str7;
        }
        if ((i & 512) == 0) {
            this.lmt = null;
        } else {
            this.lmt = num;
        }
        if ((i & 1024) == 0) {
            this.ext = null;
        } else {
            this.ext = c2551Ko;
        }
    }

    public static final void write$Self(C2577Lo c2577Lo, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c2577Lo, "self");
        AbstractC2995aW.q(interfaceC4596sh, "output");
        AbstractC2995aW.q(d40, "serialDesc");
        interfaceC4596sh.o(0, c2577Lo.make, d40);
        interfaceC4596sh.o(1, c2577Lo.model, d40);
        interfaceC4596sh.o(2, c2577Lo.osv, d40);
        if (interfaceC4596sh.j(d40) || c2577Lo.carrier != null) {
            interfaceC4596sh.r(d40, 3, W90.f3912a, c2577Lo.carrier);
        }
        interfaceC4596sh.o(4, c2577Lo.os, d40);
        interfaceC4596sh.g(5, c2577Lo.w, d40);
        interfaceC4596sh.g(6, c2577Lo.h, d40);
        if (interfaceC4596sh.j(d40) || c2577Lo.ua != null) {
            interfaceC4596sh.r(d40, 7, W90.f3912a, c2577Lo.ua);
        }
        if (interfaceC4596sh.j(d40) || c2577Lo.ifa != null) {
            interfaceC4596sh.r(d40, 8, W90.f3912a, c2577Lo.ifa);
        }
        if (interfaceC4596sh.j(d40) || c2577Lo.lmt != null) {
            interfaceC4596sh.r(d40, 9, AD.f2808a, c2577Lo.lmt);
        }
        if (!interfaceC4596sh.j(d40) && c2577Lo.ext == null) {
            return;
        }
        interfaceC4596sh.r(d40, 10, C2499Io.INSTANCE, c2577Lo.ext);
    }

    public final String component1() {
        return this.make;
    }

    public final Integer component10() {
        return this.lmt;
    }

    public final C2551Ko component11() {
        return this.ext;
    }

    public final String component2() {
        return this.model;
    }

    public final String component3() {
        return this.osv;
    }

    public final String component4() {
        return this.carrier;
    }

    public final String component5() {
        return this.os;
    }

    public final int component6() {
        return this.w;
    }

    public final int component7() {
        return this.h;
    }

    public final String component8() {
        return this.ua;
    }

    public final String component9() {
        return this.ifa;
    }

    public final C2577Lo copy(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, String str7, Integer num, C2551Ko c2551Ko) {
        AbstractC2995aW.q(str, "make");
        AbstractC2995aW.q(str2, "model");
        AbstractC2995aW.q(str3, "osv");
        AbstractC2995aW.q(str5, com.umeng.analytics.pro.bc.x);
        return new C2577Lo(str, str2, str3, str4, str5, i, i2, str6, str7, num, c2551Ko);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2577Lo)) {
            return false;
        }
        C2577Lo c2577Lo = (C2577Lo) obj;
        return AbstractC2995aW.i(this.make, c2577Lo.make) && AbstractC2995aW.i(this.model, c2577Lo.model) && AbstractC2995aW.i(this.osv, c2577Lo.osv) && AbstractC2995aW.i(this.carrier, c2577Lo.carrier) && AbstractC2995aW.i(this.os, c2577Lo.os) && this.w == c2577Lo.w && this.h == c2577Lo.h && AbstractC2995aW.i(this.ua, c2577Lo.ua) && AbstractC2995aW.i(this.ifa, c2577Lo.ifa) && AbstractC2995aW.i(this.lmt, c2577Lo.lmt) && AbstractC2995aW.i(this.ext, c2577Lo.ext);
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final C2551Ko getExt() {
        return this.ext;
    }

    public final int getH() {
        return this.h;
    }

    public final String getIfa() {
        return this.ifa;
    }

    public final Integer getLmt() {
        return this.lmt;
    }

    public final String getMake() {
        return this.make;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getOsv() {
        return this.osv;
    }

    public final String getUa() {
        return this.ua;
    }

    public final int getW() {
        return this.w;
    }

    public int hashCode() {
        int iD = DM.d(this.osv, DM.d(this.model, this.make.hashCode() * 31, 31), 31);
        String str = this.carrier;
        int iD2 = (((DM.d(this.os, (iD + (str == null ? 0 : str.hashCode())) * 31, 31) + this.w) * 31) + this.h) * 31;
        String str2 = this.ua;
        int iHashCode = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ifa;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.lmt;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        C2551Ko c2551Ko = this.ext;
        return iHashCode3 + (c2551Ko != null ? c2551Ko.hashCode() : 0);
    }

    public final void setExt(C2551Ko c2551Ko) {
        this.ext = c2551Ko;
    }

    public final void setIfa(String str) {
        this.ifa = str;
    }

    public final void setLmt(Integer num) {
        this.lmt = num;
    }

    public final void setUa(String str) {
        this.ua = str;
    }

    public String toString() {
        return "DeviceNode(make=" + this.make + ", model=" + this.model + ", osv=" + this.osv + ", carrier=" + this.carrier + ", os=" + this.os + ", w=" + this.w + ", h=" + this.h + ", ua=" + this.ua + ", ifa=" + this.ifa + ", lmt=" + this.lmt + ", ext=" + this.ext + ')';
    }

    public C2577Lo(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, String str7, Integer num, C2551Ko c2551Ko) {
        AbstractC2995aW.q(str, "make");
        AbstractC2995aW.q(str2, "model");
        AbstractC2995aW.q(str3, "osv");
        AbstractC2995aW.q(str5, com.umeng.analytics.pro.bc.x);
        this.make = str;
        this.model = str2;
        this.osv = str3;
        this.carrier = str4;
        this.os = str5;
        this.w = i;
        this.h = i2;
        this.ua = str6;
        this.ifa = str7;
        this.lmt = num;
        this.ext = c2551Ko;
    }

    public /* synthetic */ C2577Lo(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, String str7, Integer num, C2551Ko c2551Ko, int i3, AbstractC2471Hm abstractC2471Hm) {
        this(str, str2, str3, (i3 & 8) != 0 ? null : str4, str5, i, i2, (i3 & 128) != 0 ? null : str6, (i3 & 256) != 0 ? null : str7, (i3 & 512) != 0 ? null : num, (i3 & 1024) != 0 ? null : c2551Ko);
    }
}
