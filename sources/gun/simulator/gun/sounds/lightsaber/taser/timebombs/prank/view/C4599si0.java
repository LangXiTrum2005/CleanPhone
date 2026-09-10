package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.annotation.VisibleForTesting;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.internal.network.VungleApi;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.si0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4599si0 implements VungleApi {
    private static final String VUNGLE_VERSION = "7.1.0";
    private String appId;
    private final C2864Wq emptyResponseConverter;
    private final InterfaceC2383Ec okHttpClient;
    public static final C4424qi0 Companion = new C4424qi0(null);
    private static final VE json = WD.b(C4336pi0.INSTANCE);

    public C4599si0(InterfaceC2383Ec interfaceC2383Ec) {
        AbstractC2995aW.q(interfaceC2383Ec, "okHttpClient");
        this.okHttpClient = interfaceC2383Ec;
        this.emptyResponseConverter = new C2864Wq();
    }

    private final GY defaultBuilder(String str, String str2, String str3, Map<String, String> map) {
        GY gy = new GY();
        gy.g(str2);
        gy.a("User-Agent", str);
        gy.a("Vungle-Version", VUNGLE_VERSION);
        gy.a("Content-Type", "application/json");
        String str4 = this.appId;
        if (str4 != null) {
            gy.a("X-Vungle-App-Id", str4);
        }
        if (map != null) {
            String[] strArr = new String[map.size() * 2];
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = AbstractC3089ba0.V0(key).toString();
                String string2 = AbstractC3089ba0.V0(value).toString();
                C3336eJ.e(string);
                C3336eJ.f(string2, string);
                strArr[i] = string;
                strArr[i + 1] = string2;
                i += 2;
            }
            gy.d(new C4447qz(strArr));
        }
        if (str3 != null) {
            gy.a("X-Vungle-Placement-Ref-Id", str3);
        }
        return gy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GY defaultBuilder$default(C4599si0 c4599si0, String str, String str2, String str3, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        return c4599si0.defaultBuilder(str, str2, str3, map);
    }

    private final GY defaultProtoBufBuilder(String str, String str2) {
        GY gy = new GY();
        gy.g(str2);
        gy.a("User-Agent", str);
        gy.a("Vungle-Version", VUNGLE_VERSION);
        gy.a("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        String str3 = this.appId;
        if (str3 != null) {
            gy.a("X-Vungle-App-Id", str3);
        }
        return gy;
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public InterfaceC2435Gc ads(String str, String str2, C2543Kg c2543Kg) {
        List<String> placements;
        AbstractC2995aW.q(str, com.umeng.analytics.pro.ay.d);
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(c2543Kg, TtmlNode.TAG_BODY);
        try {
            VE ve = json;
            String strB = ve.b(AbstractC3375el.V(ve.b, AbstractC3263dY.d(C2543Kg.class)), c2543Kg);
            C2439Gg request = c2543Kg.getRequest();
            GY gyDefaultBuilder$default = defaultBuilder$default(this, str, str2, (request == null || (placements = request.getPlacements()) == null) ? null : (String) AbstractC2853Wf.i0(placements), null, 8, null);
            NY.Companion.getClass();
            gyDefaultBuilder$default.f(MY.a(strB, null));
            return new C4662tS(((C4838vS) this.okHttpClient).b(gyDefaultBuilder$default.b()), new C3332eF(AbstractC3263dY.d(C4980x2.class)));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public InterfaceC2435Gc config(String str, String str2, C2543Kg c2543Kg) {
        AbstractC2995aW.q(str, com.umeng.analytics.pro.ay.d);
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(c2543Kg, TtmlNode.TAG_BODY);
        try {
            VE ve = json;
            String strB = ve.b(AbstractC3375el.V(ve.b, AbstractC3263dY.d(C2543Kg.class)), c2543Kg);
            GY gyDefaultBuilder$default = defaultBuilder$default(this, str, str2, null, null, 12, null);
            NY.Companion.getClass();
            gyDefaultBuilder$default.f(MY.a(strB, null));
            return new C4662tS(((C4838vS) this.okHttpClient).b(gyDefaultBuilder$default.b()), new C3332eF(AbstractC3263dY.d(C2622Ni.class)));
        } catch (Exception unused) {
            return null;
        }
    }

    @VisibleForTesting
    public final InterfaceC2383Ec getOkHttpClient$vungle_ads_release() {
        return this.okHttpClient;
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public InterfaceC2435Gc pingTPAT(String str, String str2, XA xa, Map<String, String> map, NY ny) {
        HY hyB;
        AbstractC2995aW.q(str, com.umeng.analytics.pro.ay.d);
        AbstractC2995aW.q(str2, "url");
        AbstractC2995aW.q(xa, "requestType");
        char[] cArr = ZA.k;
        GY gyDefaultBuilder$default = defaultBuilder$default(this, str, C3336eJ.k(str2).f().a().i, null, map, 4, null);
        int i = AbstractC4511ri0.$EnumSwitchMapping$0[xa.ordinal()];
        if (i == 1) {
            gyDefaultBuilder$default.e("GET", null);
            hyB = gyDefaultBuilder$default.b();
        } else {
            if (i != 2) {
                throw new C3770jF(7, 0);
            }
            if (ny == null) {
                ny = MY.d(NY.Companion, new byte[0], null, 0, 6);
            }
            gyDefaultBuilder$default.f(ny);
            hyB = gyDefaultBuilder$default.b();
        }
        return new C4662tS(((C4838vS) this.okHttpClient).b(hyB), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public InterfaceC2435Gc ri(String str, String str2, C2543Kg c2543Kg) {
        AbstractC2995aW.q(str, com.umeng.analytics.pro.ay.d);
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(c2543Kg, TtmlNode.TAG_BODY);
        try {
            VE ve = json;
            String strB = ve.b(AbstractC3375el.V(ve.b, AbstractC3263dY.d(C2543Kg.class)), c2543Kg);
            GY gyDefaultBuilder$default = defaultBuilder$default(this, str, str2, null, null, 12, null);
            NY.Companion.getClass();
            gyDefaultBuilder$default.f(MY.a(strB, null));
            return new C4662tS(((C4838vS) this.okHttpClient).b(gyDefaultBuilder$default.b()), this.emptyResponseConverter);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public InterfaceC2435Gc sendAdMarkup(String str, NY ny) {
        AbstractC2995aW.q(str, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(ny, "requestBody");
        char[] cArr = ZA.k;
        GY gyDefaultBuilder$default = defaultBuilder$default(this, "debug", C3336eJ.k(str).f().a().i, null, null, 12, null);
        gyDefaultBuilder$default.f(ny);
        return new C4662tS(((C4838vS) this.okHttpClient).b(gyDefaultBuilder$default.b()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public InterfaceC2435Gc sendErrors(String str, String str2, NY ny) {
        AbstractC2995aW.q(str, com.umeng.analytics.pro.ay.d);
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(ny, "requestBody");
        char[] cArr = ZA.k;
        GY gyDefaultProtoBufBuilder = defaultProtoBufBuilder(str, C3336eJ.k(str2).f().a().i);
        gyDefaultProtoBufBuilder.f(ny);
        return new C4662tS(((C4838vS) this.okHttpClient).b(gyDefaultProtoBufBuilder.b()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public InterfaceC2435Gc sendMetrics(String str, String str2, NY ny) {
        AbstractC2995aW.q(str, com.umeng.analytics.pro.ay.d);
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(ny, "requestBody");
        char[] cArr = ZA.k;
        GY gyDefaultProtoBufBuilder = defaultProtoBufBuilder(str, C3336eJ.k(str2).f().a().i);
        gyDefaultProtoBufBuilder.f(ny);
        return new C4662tS(((C4838vS) this.okHttpClient).b(gyDefaultProtoBufBuilder.b()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public void setAppId(String str) {
        AbstractC2995aW.q(str, "appId");
        this.appId = str;
    }
}
