package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.Net;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class GY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ZA f3127a;
    public NY d;
    public LinkedHashMap e = new LinkedHashMap();
    public String b = "GET";
    public C5036xh c = new C5036xh();

    public final void a(String str, String str2) {
        AbstractC2995aW.q(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.c.a(str, str2);
    }

    public final HY b() {
        Map mapUnmodifiableMap;
        ZA za = this.f3127a;
        if (za == null) {
            throw new IllegalStateException("url == null".toString());
        }
        String str = this.b;
        C4447qz c4447qzE = this.c.e();
        NY ny = this.d;
        LinkedHashMap linkedHashMap = this.e;
        byte[] bArr = Vg0.f3884a;
        AbstractC2995aW.q(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = C2838Vq.f3896a;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            AbstractC2995aW.p(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new HY(za, str, c4447qzE, ny, mapUnmodifiableMap);
    }

    public final void c(String str, String str2) {
        AbstractC2995aW.q(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        C5036xh c5036xh = this.c;
        c5036xh.getClass();
        C3336eJ.e(str);
        C3336eJ.f(str2, str);
        c5036xh.j(str);
        c5036xh.c(str, str2);
    }

    public final void d(C4447qz c4447qz) {
        AbstractC2995aW.q(c4447qz, "headers");
        this.c = c4447qz.c();
    }

    public final void e(String str, NY ny) {
        AbstractC2995aW.q(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }
        if (ny == null) {
            if (!(!(AbstractC2995aW.i(str, "POST") || AbstractC2995aW.i(str, Net.HttpMethods.PUT) || AbstractC2995aW.i(str, Net.HttpMethods.PATCH) || AbstractC2995aW.i(str, "PROPPATCH") || AbstractC2995aW.i(str, "REPORT")))) {
                throw new IllegalArgumentException(DM.B("method ", str, " must have a request body.").toString());
            }
        } else if (!WD.K(str)) {
            throw new IllegalArgumentException(DM.B("method ", str, " must not have a request body.").toString());
        }
        this.b = str;
        this.d = ny;
    }

    public final void f(NY ny) {
        AbstractC2995aW.q(ny, TtmlNode.TAG_BODY);
        e("POST", ny);
    }

    public final void g(String str) {
        AbstractC2995aW.q(str, "url");
        if (AbstractC3089ba0.N0(str, "ws:", true)) {
            String strSubstring = str.substring(3);
            AbstractC2995aW.p(strSubstring, "this as java.lang.String).substring(startIndex)");
            str = AbstractC2995aW.v0(strSubstring, "http:");
        } else if (AbstractC3089ba0.N0(str, "wss:", true)) {
            String strSubstring2 = str.substring(4);
            AbstractC2995aW.p(strSubstring2, "this as java.lang.String).substring(startIndex)");
            str = AbstractC2995aW.v0(strSubstring2, "https:");
        }
        char[] cArr = ZA.k;
        this.f3127a = C3336eJ.k(str);
    }
}
