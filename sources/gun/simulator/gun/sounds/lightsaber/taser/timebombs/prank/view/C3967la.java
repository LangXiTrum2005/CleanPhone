package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.la, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3967la {
    public static final C3791ja Companion = new C3791ja(null);
    private final C4980x2 ad;
    private final String adunit;
    private final List<String> impression;
    private final VE json;
    private final Integer version;

    public C3967la() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3967la copy$default(C3967la c3967la, Integer num, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = c3967la.version;
        }
        if ((i & 2) != 0) {
            str = c3967la.adunit;
        }
        if ((i & 4) != 0) {
            list = c3967la.impression;
        }
        return c3967la.copy(num, str, list);
    }

    private final String gzipDecode(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 1024);
            try {
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int i = gZIPInputStream.read(bArr2);
                    if (i == -1) {
                        AbstractC3375el.n(gZIPInputStream, null);
                        AbstractC3375el.n(byteArrayInputStream, null);
                        String string = byteArrayOutputStream.toString();
                        AbstractC2995aW.p(string, "result.toString()");
                        return string;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i);
                    try {
                        throw th;
                    } catch (Throwable th) {
                        AbstractC3375el.n(byteArrayInputStream, th);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC3375el.n(gZIPInputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public static final void write$Self(C3967la c3967la, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        String decodedAdsResponse;
        AbstractC2995aW.q(c3967la, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || c3967la.version != null) {
            interfaceC4596sh.r(d40, 0, AD.f2808a, c3967la.version);
        }
        if (interfaceC4596sh.j(d40) || c3967la.adunit != null) {
            interfaceC4596sh.r(d40, 1, W90.f3912a, c3967la.adunit);
        }
        if (interfaceC4596sh.j(d40) || c3967la.impression != null) {
            interfaceC4596sh.r(d40, 2, new T5(W90.f3912a, 0), c3967la.impression);
        }
        if (!interfaceC4596sh.j(d40)) {
            C4980x2 c4980x2 = c3967la.ad;
            C4980x2 c4980x3 = null;
            if (c3967la.adunit != null && (decodedAdsResponse = c3967la.getDecodedAdsResponse()) != null) {
                VE ve = c3967la.json;
                c4980x3 = (C4980x2) ve.a(AbstractC3375el.V(ve.b, AbstractC3263dY.d(C4980x2.class)), decodedAdsResponse);
            }
            if (AbstractC2995aW.i(c4980x2, c4980x3)) {
                return;
            }
        }
        interfaceC4596sh.r(d40, 3, Y1.INSTANCE, c3967la.ad);
    }

    public final Integer component1() {
        return this.version;
    }

    public final String component2() {
        return this.adunit;
    }

    public final List<String> component3() {
        return this.impression;
    }

    public final C3967la copy(Integer num, String str, List<String> list) {
        return new C3967la(num, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3967la)) {
            return false;
        }
        C3967la c3967la = (C3967la) obj;
        return AbstractC2995aW.i(this.version, c3967la.version) && AbstractC2995aW.i(this.adunit, c3967la.adunit) && AbstractC2995aW.i(this.impression, c3967la.impression);
    }

    public final C4980x2 getAdPayload() {
        return this.ad;
    }

    public final String getAdunit() {
        return this.adunit;
    }

    public final String getCreativeId() {
        C4980x2 c4980x2 = this.ad;
        if (c4980x2 != null) {
            return c4980x2.getCreativeId();
        }
        return null;
    }

    public final String getDecodedAdsResponse() throws Throwable {
        byte[] bArrDecode = Base64.decode(this.adunit, 0);
        if (bArrDecode != null) {
            return gzipDecode(bArrDecode);
        }
        return null;
    }

    public final String getEventId() {
        C4980x2 c4980x2 = this.ad;
        if (c4980x2 != null) {
            return c4980x2.eventId();
        }
        return null;
    }

    public final List<String> getImpression() {
        return this.impression;
    }

    public final String getPlacementId() {
        C4980x2 c4980x2 = this.ad;
        if (c4980x2 != null) {
            return c4980x2.placementId();
        }
        return null;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        Integer num = this.version;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.adunit;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.impression;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "BidPayload(version=" + this.version + ", adunit=" + this.adunit + ", impression=" + this.impression + ')';
    }

    public /* synthetic */ C3967la(Integer num, String str, List list, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
    }

    public C3967la(int i, Integer num, String str, List list, C4980x2 c4980x2, O40 o40) {
        String decodedAdsResponse;
        C4980x2 c4980x3 = null;
        if ((i & 1) == 0) {
            this.version = null;
        } else {
            this.version = num;
        }
        if ((i & 2) == 0) {
            this.adunit = null;
        } else {
            this.adunit = str;
        }
        if ((i & 4) == 0) {
            this.impression = null;
        } else {
            this.impression = list;
        }
        C4913wF c4913wFB = WD.b(C3705ia.INSTANCE);
        this.json = c4913wFB;
        if ((i & 8) != 0) {
            this.ad = c4980x2;
            return;
        }
        if (this.adunit != null && (decodedAdsResponse = getDecodedAdsResponse()) != null) {
            c4980x3 = (C4980x2) c4913wFB.a(AbstractC3375el.V(c4913wFB.b, AbstractC3263dY.d(C4980x2.class)), decodedAdsResponse);
        }
        this.ad = c4980x3;
    }

    public C3967la(Integer num, String str, List<String> list) {
        String decodedAdsResponse;
        this.version = num;
        this.adunit = str;
        this.impression = list;
        C4913wF c4913wFB = WD.b(C3879ka.INSTANCE);
        this.json = c4913wFB;
        C4980x2 c4980x2 = null;
        if (str != null && (decodedAdsResponse = getDecodedAdsResponse()) != null) {
            c4980x2 = (C4980x2) c4913wFB.a(AbstractC3375el.V(c4913wFB.b, AbstractC3263dY.d(C4980x2.class)), decodedAdsResponse);
        }
        this.ad = c4980x2;
    }

    private static /* synthetic */ void getJson$annotations() {
    }
}
