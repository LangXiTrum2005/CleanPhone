package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Intent;
import android.os.Handler;
import android.util.Pair;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import androidx.core.view.PointerIconCompat;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.load.LoadOperationState;
import com.unity3d.services.core.webview.WebView;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.uO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4746uO implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5076a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC4746uO(Object obj, Object obj2, Object obj3, int i) {
        this.f5076a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final int i = 0;
        final int i2 = 1;
        switch (this.f5076a) {
            case 0:
                C4834vO c4834vO = (C4834vO) this.b;
                C4998xC c4998xC = (C4998xC) this.c;
                C5186zO c5186zO = (C5186zO) this.d;
                c4834vO.getClass();
                C3965lY c3965lYJ0 = c4998xC.J0();
                C4167nm c4167nm = (C4167nm) c4834vO.c;
                LU lu = c4167nm.g;
                lu.getClass();
                C4079mm c4079mm = c4167nm.d;
                c4079mm.getClass();
                c4079mm.b = AC.j(c3965lYJ0);
                if (!c3965lYJ0.isEmpty()) {
                    c4079mm.e = (C5186zO) c3965lYJ0.get(0);
                    c5186zO.getClass();
                    c4079mm.f = c5186zO;
                }
                if (c4079mm.d == null) {
                    c4079mm.d = C4079mm.b(lu, c4079mm.b, c4079mm.e, c4079mm.f4714a);
                }
                c4079mm.d(((C2736Rs) lu).t());
                return;
            case 1:
                C3692iN c3692iN = (C3692iN) this.b;
                Pair pair = (Pair) this.c;
                Exception exc = (Exception) this.d;
                ((C4167nm) ((OO) c3692iN.c).h).E(((Integer) pair.first).intValue(), (C5186zO) pair.second, exc);
                return;
            case 2:
                C3491g4 c3491g4 = (C3491g4) this.b;
                final C4619sw c4619sw = (C4619sw) this.c;
                final C2729Rl c2729Rl = (C2729Rl) this.d;
                SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os = (SurfaceHolderCallbackC2658Os) c3491g4.c;
                int i3 = Ug0.f3833a;
                surfaceHolderCallbackC2658Os.getClass();
                C2736Rs c2736Rs = ((SurfaceHolderCallbackC2658Os) c3491g4.c).f3526a;
                c2736Rs.getClass();
                C4167nm c4167nm2 = (C4167nm) c2736Rs.q;
                final C3403f4 c3403f4M = c4167nm2.M();
                c4167nm2.N(c3403f4M, PointerIconCompat.TYPE_VERTICAL_TEXT, new BI(c3403f4M, c4619sw, c2729Rl, i) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.im

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f4518a;

                    {
                        this.f4518a = i;
                    }

                    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
                    public final void invoke(Object obj) {
                        InterfaceC3579h4 interfaceC3579h4 = (InterfaceC3579h4) obj;
                        switch (this.f4518a) {
                            case 0:
                                interfaceC3579h4.getClass();
                                break;
                            default:
                                interfaceC3579h4.getClass();
                                break;
                        }
                    }
                });
                return;
            case 3:
                C3031aq c3031aq = (C3031aq) this.b;
                ((InterfaceC3120bq) this.c).E(c3031aq.f4145a, c3031aq.b, (Exception) this.d);
                return;
            case 4:
                DO r0 = (DO) this.b;
                ((EO) this.c).s(r0.f2968a, r0.b, (C3779jO) this.d);
                return;
            case 5:
                AbstractC3950lJ.z(((C3491g4) this.b).c);
                int i4 = I3.k;
                throw null;
            case 6:
                C5065y00 c5065y00 = (C5065y00) this.b;
                String str = (String) this.c;
                InterfaceC4977x00 interfaceC4977x00 = (InterfaceC4977x00) this.d;
                V00 v00 = (V00) c5065y00.c.b;
                v00.c = str;
                Cd0 cd0E = interfaceC4977x00.e();
                Y00 y00 = v00.d;
                if (cd0E != null) {
                    R00 r00 = y00.d;
                    int iB = interfaceC4977x00.b();
                    C3398f10 c3398f10 = r00.j;
                    c3398f10.c.put(Integer.valueOf(iB), cd0E);
                    y00.v = true;
                }
                y00.u();
                return;
            case 7:
                C3310e10 c3310e10 = (C3310e10) this.b;
                byte[] bArr = (byte[]) this.c;
                c3310e10.getClass();
                try {
                    c3310e10.f4302a.write(bArr);
                    return;
                } catch (Exception unused) {
                    if (c3310e10.d.f) {
                        return;
                    }
                    c3310e10.d.f4345a.getClass();
                    return;
                }
            case 8:
                Gh0 gh0 = (Gh0) this.b;
                final C4619sw c4619sw2 = (C4619sw) this.c;
                final C2729Rl c2729Rl2 = (C2729Rl) this.d;
                gh0.getClass();
                int i5 = Ug0.f3833a;
                Hh0 hh0 = gh0.b;
                hh0.getClass();
                C2736Rs c2736Rs2 = ((SurfaceHolderCallbackC2658Os) hh0).f3526a;
                c2736Rs2.getClass();
                C4167nm c4167nm3 = (C4167nm) c2736Rs2.q;
                final C3403f4 c3403f4M2 = c4167nm3.M();
                c4167nm3.N(c3403f4M2, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, new BI(c3403f4M2, c4619sw2, c2729Rl2, i2) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.im

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f4518a;

                    {
                        this.f4518a = i2;
                    }

                    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
                    public final void invoke(Object obj) {
                        InterfaceC3579h4 interfaceC3579h4 = (InterfaceC3579h4) obj;
                        switch (this.f4518a) {
                            case 0:
                                interfaceC3579h4.getClass();
                                break;
                            default:
                                interfaceC3579h4.getClass();
                                break;
                        }
                    }
                });
                return;
            case 9:
                AbstractServiceC2320Br abstractServiceC2320Br = (AbstractServiceC2320Br) this.b;
                Intent intent = (Intent) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                int i6 = AbstractServiceC2320Br.f;
                abstractServiceC2320Br.getClass();
                try {
                    abstractServiceC2320Br.b(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            case 10:
                BiConsumer biConsumer = (BiConsumer) this.b;
                String str2 = (String) this.c;
                C2803Uh c2803Uh = (C2803Uh) this.d;
                Pattern pattern = C2907Yh.e;
                biConsumer.accept(str2, c2803Uh);
                return;
            case 11:
                ((LoadOperationState) this.b).lambda$onUnityAdsFailedToLoad$0((UnityAds.UnityAdsLoadError) this.c, (String) this.d);
                return;
            case 12:
                ((IUnityAdsInitializationListener) this.b).onInitializationFailed((UnityAds.UnityAdsInitializationError) this.c, (String) this.d);
                return;
            case 13:
                WebView.evaluateJavascript$lambda$1((WebView) this.b, (String) this.c, (ValueCallback) this.d);
                return;
            case 14:
                C2961a4.m228logError$lambda2((EnumC4719u30) this.b, (String) this.c, (C4126nJ) this.d);
                return;
            case 15:
                C4197o6.m260download$lambda0((C4197o6) this.b, (C2474Hp) this.c, (InterfaceC3757j6) this.d);
                return;
            case 16:
                C2971a9.m230onError$lambda0((AbstractC3325e9) this.b, (C2474Hp) this.c, (C3319e6) this.d);
                return;
            case 17:
                C2781Tl.m212onResponse$lambda0((C2807Ul) this.b, (C4664tU) this.c, (C5109yZ) this.d);
                return;
            case 18:
                C3624hd0.m247sendTpat$lambda2((C3624hd0) this.b, (String) this.c, (String) this.d);
                return;
            case 19:
                C5041xj0.m284shouldOverrideUrlLoading$lambda6$lambda1$lambda0((C5041xj0) this.b, (android.webkit.WebView) this.c, (String) this.d);
                return;
            case 20:
                C5041xj0.m283shouldOverrideUrlLoading$lambda6$lambda1((C5041xj0) this.b, (Handler) this.c, (android.webkit.WebView) this.d);
                return;
            case 21:
                ((C4082mn0) this.b).J0((ViewGroup) this.c, (Pm0) this.d);
                return;
            case 22:
                C4312pT c4312pT = (C4312pT) this.b;
                AbstractApplicationC2673Ph abstractApplicationC2673Ph = (AbstractApplicationC2673Ph) this.c;
                InterfaceC3960lT interfaceC3960lT = (InterfaceC3960lT) this.d;
                C4312pT c4312pT2 = C4312pT.n;
                c4312pT.getClass();
                String strA = "";
                Qm0.D(new byte[]{101, 52, 60, -13, 99, 98, 36, -128, 120, 63, 43, -17, 97, 43, 112, -80, 99, 48, 63, -14}, new byte[]{23, 81, 77, -122, 6, 17, 80, -61});
                if (abstractApplicationC2673Ph == null) {
                    c4312pT.d.set(2);
                    if (interfaceC3960lT != null) {
                        interfaceC3960lT.c();
                        return;
                    }
                    return;
                }
                try {
                    String strP = AbstractC2995aW.P(abstractApplicationC2673Ph, c4312pT.b);
                    Qm0.D(new byte[]{-8, 39, -88, 78, -118, -108, 98, 49, -27, 44, -65, 82, -120, -35, 54, 2, -23, 12, -72, 79, -122, -111, 115, 49, -27, 44, -65, 82, -120, -57, 43, 82}, new byte[]{-118, 66, -39, 59, -17, -25, 22, 114});
                    strA = AbstractC3923l1.a(strP, AbstractC3923l1.f4625a);
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                C4981x20.u().q(new RunnableC4746uO(interfaceC3960lT, c4312pT.i(strA, abstractApplicationC2673Ph), new C4224oT(c4312pT, abstractApplicationC2673Ph, interfaceC3960lT, i), 23));
                return;
            case 23:
                InterfaceC3960lT interfaceC3960lT2 = (InterfaceC3960lT) this.b;
                List list = (List) this.c;
                C4224oT c4224oT = (C4224oT) this.d;
                C4312pT c4312pT3 = C4312pT.n;
                if (interfaceC3960lT2 != null && list.isEmpty()) {
                    interfaceC3960lT2.f(list);
                }
                AbstractC4969wu.a(c4224oT);
                return;
            default:
                final C4332pg0 c4332pg0 = (C4332pg0) this.b;
                String str3 = (String) this.c;
                final AbstractC2995aW abstractC2995aW = (AbstractC2995aW) this.d;
                c4332pg0.getClass();
                try {
                    synchronized (c4332pg0) {
                        try {
                            c4332pg0.f4844a = new K5();
                            ArrayList arrayList = new ArrayList();
                            JSONObject jSONObject = new JSONObject(str3);
                            c4332pg0.f4844a.f3300a = Boolean.valueOf(jSONObject.optBoolean(Qm0.D(new byte[]{8, 104, 27, -60, 33, 25}, new byte[]{109, 6, 122, -90, 77, 124, 123, -13})));
                            c4332pg0.f4844a.b = Boolean.valueOf(jSONObject.optBoolean(Qm0.D(new byte[]{-48, 61, -56, -101, 25, -23, 118}, new byte[]{-71, 78, -114, -12, 107, -118, 19, -120})));
                            if (jSONObject.has(Qm0.D(new byte[]{-115, -42, -75, -26, 27, -14, 54, -12, -116, -64, -126, -11}, new byte[]{-28, -91, -16, -112, 126, -128, 79, -93}))) {
                                c4332pg0.f4844a.c = Boolean.valueOf(jSONObject.optBoolean(Qm0.D(new byte[]{19, -2, -63, 96, 49, 32, -126, 101, 18, -24, -10, 115}, new byte[]{122, -115, -124, 22, 84, 82, -5, 50})));
                            }
                            c4332pg0.f4844a.d = jSONObject.optInt(Qm0.D(new byte[]{-95, 44, 93, -20, -90, 110, -90, -9, -83, 52, 102, -57, -70, 115, -94}, new byte[]{-52, 77, 37, -88, -49, 29, -42, -101}), -1);
                            c4332pg0.f4844a.e = Boolean.valueOf(jSONObject.optBoolean(Qm0.D(new byte[]{3, -65, -97, -31, 123, 97, 19, 122}, new byte[]{106, -52, -38, -113, 24, com.umeng.analytics.pro.cw.l, 119, 31})));
                            c4332pg0.f4844a.g = jSONObject.optString(Qm0.D(new byte[]{55, 122, -29, 3, 122, -34, 68, -87, 32, 114, -12}, new byte[]{65, 31, -111, 112, 19, -79, 42, -25}));
                            c4332pg0.f4844a.f = Integer.valueOf(jSONObject.optInt(Qm0.D(new byte[]{125, -88, 64, -95, -84, -95, 22, -89, 100, -87, 87}, new byte[]{11, -51, 50, -46, -59, -50, 120, -28})));
                            c4332pg0.f4844a.i = jSONObject.optString(Qm0.D(new byte[]{113, -12, -19, 48, 53, -40, 52, 41, 102, -4, -6, 48}, new byte[]{7, -111, -97, 67, 92, -73, 90, 103}));
                            c4332pg0.f4844a.h = jSONObject.optString(Qm0.D(new byte[]{-66, 0, 37, -66, 54, 81, 34, 100, -89, 1, 50, -66}, new byte[]{-56, 101, 87, -51, 95, 62, 76, 39}));
                            c4332pg0.f4844a.k = jSONObject.optString(Qm0.D(new byte[]{-103, -111, 43, -66}, new byte[]{-19, -24, 91, -37, 107, 23, -46, -41}));
                            c4332pg0.f4844a.j = jSONObject.optString(Qm0.D(new byte[]{18, -31, -16, -53, 75, -11, -30, -48, 3, -19, -10}, new byte[]{98, -128, -109, -96, 42, -110, -121, -98}));
                            c4332pg0.f4844a.l = jSONObject.optString(Qm0.D(new byte[]{-31, -99, -70}, new byte[]{-108, -23, -41, 45, 96, -96, -37, 87}));
                            c4332pg0.f4844a.m = jSONObject.optString(Qm0.D(new byte[]{-64, 69, -127, -127, -70, -11}, new byte[]{-73, 32, -29, -44, -56, -103, 111, -42}));
                            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(Qm0.D(new byte[]{-30, -61, 43, 65}, new byte[]{-122, -90, 88, 34, 7, 7, 122, -110}));
                            if (jSONArrayOptJSONArray != null) {
                                for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                                    C2317Bo c2317Bo = new C2317Bo();
                                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i7);
                                    c2317Bo.f2892a = jSONObject2.optString(Qm0.D(new byte[]{-21, -91, -69, com.umeng.analytics.pro.cw.m}, new byte[]{-121, -60, -43, 104, 44, -26, 96, -36}));
                                    c2317Bo.b = jSONObject2.optString(Qm0.D(new byte[]{-53, -73, -80, -115, -11}, new byte[]{-65, -34, -60, -31, -112, 99, 31, 3}));
                                    c2317Bo.c = jSONObject2.optString(Qm0.D(new byte[]{1, -50, -8}, new byte[]{108, -67, -97, -98, 88, 111, -82, 20}));
                                    c2317Bo.d = jSONObject2.optString(Qm0.D(new byte[]{39, 18, 56, -92, -14, -25, 76, -18, 60, 54, 53, -75}, new byte[]{82, 98, 92, -59, -122, -126, com.umeng.analytics.pro.cw.l, -102}));
                                    c2317Bo.e = jSONObject2.optString(Qm0.D(new byte[]{-104, 58, 86, 7, -48, 36, -12, -63, -107, com.umeng.analytics.pro.cw.m, 81, 20}, new byte[]{-5, 91, 56, 100, -75, 72, -74, -75}));
                                    arrayList.add(c2317Bo);
                                }
                            }
                            c4332pg0.f4844a.n = arrayList;
                            C4981x20.u().q(new Runnable() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.og0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i8 = i;
                                    AbstractC2995aW abstractC2995aW2 = abstractC2995aW;
                                    C4332pg0 c4332pg1 = c4332pg0;
                                    switch (i8) {
                                        case 0:
                                            if (abstractC2995aW2 == null) {
                                                c4332pg1.getClass();
                                            } else {
                                                abstractC2995aW2.A(c4332pg1.f4844a);
                                            }
                                            break;
                                        default:
                                            c4332pg1.f4844a = null;
                                            if (abstractC2995aW2 != null) {
                                                abstractC2995aW2.z();
                                            }
                                            break;
                                    }
                                }
                            });
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    C4981x20.u().q(new Runnable() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.og0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i8 = i2;
                            AbstractC2995aW abstractC2995aW2 = abstractC2995aW;
                            C4332pg0 c4332pg1 = c4332pg0;
                            switch (i8) {
                                case 0:
                                    if (abstractC2995aW2 == null) {
                                        c4332pg1.getClass();
                                    } else {
                                        abstractC2995aW2.A(c4332pg1.f4844a);
                                    }
                                    break;
                                default:
                                    c4332pg1.f4844a = null;
                                    if (abstractC2995aW2 != null) {
                                        abstractC2995aW2.z();
                                    }
                                    break;
                            }
                        }
                    });
                    return;
                }
        }
    }
}
