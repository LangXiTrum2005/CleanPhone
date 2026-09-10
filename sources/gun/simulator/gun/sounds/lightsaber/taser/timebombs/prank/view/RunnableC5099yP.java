package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import org.json.JSONException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5099yP implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5274a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC5099yP(Context context, String str, Si0 si0, InterfaceC3069bH interfaceC3069bH) {
        this.f5274a = 3;
        this.d = context;
        this.b = str;
        this.c = si0;
        this.e = interfaceC3069bH;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Double dValueOf;
        double dDoubleValue;
        int i = 17;
        Double dValueOf2 = null;
        int i2 = this.f5274a;
        int i3 = 1;
        Object obj = this.d;
        Object obj2 = this.e;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i2) {
            case 0:
                MintegralMediationAdapter mintegralMediationAdapter = (MintegralMediationAdapter) obj4;
                mintegralMediationAdapter.getClass();
                MintegralMediationAdapter.f759a.init((Map<String, String>) obj3, (Context) obj, new C3692iN(mintegralMediationAdapter, (InitializationCompleteCallback) obj2, i));
                break;
            case 1:
                C2653On c2653On = (C2653On) obj4;
                Sd0 sd0 = (Sd0) obj3;
                Nd0 nd0 = (Nd0) obj;
                Y7 y7 = (Y7) obj2;
                Logger logger = C2653On.f;
                c2653On.getClass();
                Logger logger2 = C2653On.f;
                try {
                    Qd0 qd0A = c2653On.c.a(((C4289p8) sd0).f4824a);
                    if (qd0A == null) {
                        String str = "Transport backend '" + ((C4289p8) sd0).f4824a + "' is not registered";
                        logger2.warning(str);
                        new IllegalArgumentException(str);
                        nd0.getClass();
                    } else {
                        ((E20) c2653On.e).n(new C2351Cw(c2653On, sd0, ((C3359ed) qd0A).a(y7), i3));
                        nd0.getClass();
                    }
                } catch (Exception e) {
                    logger2.warning("Error scheduling event " + e.getMessage());
                    nd0.getClass();
                    return;
                }
                break;
            case 2:
                ((EO) obj3).c(((DO) obj4).f2968a, (C5186zO) obj, (C3779jO) obj2);
                break;
            case 3:
                Si0.m207init$lambda2((Context) obj, (String) obj4, (Si0) obj3, (InterfaceC3069bH) obj2);
                break;
            case 4:
                C2971a9.m231onSuccess$lambda1((File) obj4, (C2971a9) obj3, (C2474Hp) obj, (AbstractC3325e9) obj2);
                break;
            case 5:
                UP.m214onSuccess$lambda1((File) obj4, (File) obj3, (C4980x2) obj, (File) obj2);
                break;
            case 6:
                UP.m213onError$lambda0((C3319e6) obj4, (C2474Hp) obj3, (C4980x2) obj, (File) obj2);
                break;
            case 7:
                AbstractApplicationC2673Ph abstractApplicationC2673Ph = (AbstractApplicationC2673Ph) obj3;
                String str2 = (String) obj;
                String str3 = (String) obj2;
                X0 x0 = ((W0) obj4).d;
                String str4 = ((Om0) x0.k()).p;
                if (AbstractC3375el.I(str4)) {
                    C2907Yh c2907Yh = C2375Du.a().g;
                    C2777Th c2777Th = c2907Yh.c;
                    C2803Uh c2803UhC = C2907Yh.c(c2777Th);
                    if (c2803UhC == null) {
                        dValueOf = null;
                    } else {
                        try {
                            dValueOf = Double.valueOf(c2803UhC.b.getDouble(str4));
                        } catch (JSONException unused) {
                            dValueOf = null;
                        }
                    }
                    if (dValueOf != null) {
                        c2907Yh.b(C2907Yh.c(c2777Th), str4);
                        dDoubleValue = dValueOf.doubleValue();
                    } else {
                        C2803Uh c2803UhC2 = C2907Yh.c(c2907Yh.d);
                        if (c2803UhC2 != null) {
                            try {
                                dValueOf2 = Double.valueOf(c2803UhC2.b.getDouble(str4));
                                break;
                            } catch (JSONException unused2) {
                            }
                        }
                        if (dValueOf2 != null) {
                            dDoubleValue = dValueOf2.doubleValue();
                        } else {
                            Pattern pattern = C2907Yh.e;
                            dDoubleValue = 0.0d;
                        }
                    }
                    float f = (float) dDoubleValue;
                    ((Om0) x0.k()).q = f;
                    SharedPreferences.Editor editorH = AbstractC2995aW.H(abstractApplicationC2673Ph);
                    editorH.putFloat(str2, f);
                    editorH.commit();
                    float fI = AbstractC2995aW.I(abstractApplicationC2673Ph, str3, -1.0f);
                    if (fI < 0.0f || fI > 1.0f) {
                        fI = (new Random().nextInt(100) * 1.0f) / 100.0f;
                        SharedPreferences.Editor editorH2 = AbstractC2995aW.H(abstractApplicationC2673Ph);
                        editorH2.putFloat(str3, fI);
                        editorH2.commit();
                    }
                    x0.b.set(f >= fI);
                }
                try {
                    Um0.l(abstractApplicationC2673Ph);
                    Um0.h(abstractApplicationC2673Ph);
                } catch (Exception e2) {
                    byte[] bArr = {-55, 66, -22, -84, -92, -68, -79, 33, -54, 83, -64, -81, -82, -65, -86, 102, -18, 67, -35, -96, -94, -119, -83, 37, -21, 67, -38, -80, -22, -67, -67, 50, -40, 71, -60, -113, -93, -87, -84, 0, -6, 73, -60, -111, -81, -73, -73, 50, -19};
                    byte[] bArr2 = {-120, 38, -87, -61, -54, -38, -40, 70};
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < 49) {
                        if (i5 >= 8) {
                            i5 = 0;
                        }
                        bArr[i4] = (byte) (bArr[i4] ^ bArr2[i5]);
                        i4++;
                        i5++;
                    }
                    new String(bArr, StandardCharsets.UTF_8);
                    e2.printStackTrace();
                    return;
                }
                break;
            case 8:
                C4082mn0 c4082mn0 = (C4082mn0) obj4;
                P8 p8 = (P8) obj3;
                AbstractC3950lJ.z(obj);
                AdView adView = (AdView) obj2;
                c4082mn0.getClass();
                Context contextJ = X0.j.j();
                String strW = ((C3491g4) p8.f3354a).w(1);
                String strI0 = C4082mn0.I0(p8);
                try {
                    throw null;
                } catch (Exception e3) {
                    e3.printStackTrace();
                    p8.h.getClass();
                    C4981x20.u().q(new SP(c4082mn0, null, Um0.c(contextJ, strW, strI0, AbstractC3661i1.p), p8, adView, 2));
                    return;
                }
            case 9:
                C4082mn0 c4082mn1 = (C4082mn0) obj4;
                C4015m3 c4015m3 = (C4015m3) obj3;
                AbstractC3950lJ.z(obj);
                c4082mn1.getClass();
                Context contextJ2 = X0.j.j();
                String strW2 = c4015m3.c.w(1);
                c4015m3.f.getClass();
                C4981x20.u().q(new RunnableC5099yP(c4082mn1, null, Um0.c(contextJ2, strW2, AbstractC3661i1.e, AbstractC3661i1.p), (AdView) obj2, 10));
                break;
            case 10:
                AbstractC3950lJ.z(obj3);
                ((C4082mn0) obj4).getClass();
                C4082mn0.M0().getClass();
                ((AdView) obj2).loadAd(((AdManagerAdRequest.Builder) obj).setHttpTimeoutMillis(MBridgeCommon.DEFAULT_LOAD_TIMEOUT).build());
                break;
            default:
                C3844k50 c3844k50 = (C3844k50) obj4;
                AdValue adValue = (AdValue) obj3;
                String str5 = (String) obj2;
                Context context = (Context) obj;
                c3844k50.getClass();
                float valueMicros = (float) (adValue.getValueMicros() / 1000.0d);
                int i6 = Um0.f3842a;
                String str6 = ((AbstractC4103n3) c3844k50.e).f4440a;
                Qm0.D(new byte[]{-51, 90, -112, -6, -10, 49, -62, -5, -23, 127, -103, -40, -11, 29, -62, -17, -23, 76, -35, -6, -6, 35, -62, -31, -24, 123, -117, -16, -6, 7, -125, -8, -19, 83, -74, -16, -19, 83, -98, -88}, new byte[]{-116, 62, -3, -107, -108, 115, -93, -120});
                Qm0.D(new byte[]{com.umeng.analytics.pro.cw.m, -107, 91, 36, 125, 121, 67, 17, 30, -107}, new byte[]{35, -75, 45, 69, 17, 12, 38, 49});
                Qm0.D(new byte[]{-49, -69, -63, -83, 86, 87, -90, -18, -35, -2, -56, -85, 91, 87, -68, -8, -54, -69, -101, -24}, new byte[]{-81, -101, -90, -56, 34, 20, -45, -100});
                adValue.getCurrencyCode();
                if (!TextUtils.isEmpty(str5) && valueMicros >= 0.0f) {
                    Qm0.D(new byte[]{-63, 29, -26, 7, -11, -27, 83, -24, -60, 25, -2, 23, -47, -41, 96, -31, -57, 25, -86, 66, -62, -32, 109, -8, -41, 70, -80}, new byte[]{-78, 124, -112, 98, -76, -127, 1, -115});
                    Qm0.D(new byte[]{46, 51, 125, 88, 59, -111, -113, -120, 56, 51}, new byte[]{2, 19, com.umeng.analytics.pro.cw.k, 57, 86, -38, -22, -15});
                    String str7 = Qm0.D(new byte[]{61, -42, -126, 58, -9, -62, 66, 95, com.umeng.analytics.pro.cw.l, -33, -127, 58, -58}, new byte[]{111, -77, -12, 95, -103, -73, 39, 9}) + str5;
                    HashMap mapR = Um0.r(AbstractC2995aW.P(context, str7));
                    Iterator it = mapR.entrySet().iterator();
                    while (it.hasNext()) {
                        if (System.currentTimeMillis() - ((Long) ((Map.Entry) it.next()).getKey()).longValue() > 1800000) {
                            it.remove();
                        }
                    }
                    mapR.put(Long.valueOf(System.currentTimeMillis()), Float.valueOf(valueMicros));
                    StringBuilder sb = new StringBuilder();
                    for (Map.Entry entry : mapR.entrySet()) {
                        sb.append(entry.getKey());
                        byte[] bArr3 = {-125};
                        bArr3[0] = (byte) (new byte[]{-84, -15, 48, -47, -101, 114, -3, -102}[0] ^ bArr3[0]);
                        sb.append(new String(bArr3, StandardCharsets.UTF_8));
                        sb.append(entry.getValue());
                        sb.append(" ");
                    }
                    AbstractC2995aW.r0(context, str7, sb.toString());
                    break;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC5099yP(C3844k50 c3844k50, AdValue adValue, String str, Context context) {
        this.f5274a = 11;
        this.b = c3844k50;
        this.c = adValue;
        this.e = str;
        this.d = context;
    }

    public /* synthetic */ RunnableC5099yP(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f5274a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
