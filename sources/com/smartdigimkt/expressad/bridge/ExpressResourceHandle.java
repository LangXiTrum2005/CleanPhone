package com.smartdigimkt.expressad.bridge;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.smartdigimkt.c3.o;
import com.smartdigimkt.c5.b;
import com.smartdigimkt.c5.c;
import com.smartdigimkt.expressad.out.TemplateBannerView;
import com.smartdigimkt.f1.p;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.api.business.express.IExpressAdManager;
import com.smartdigimkt.sdk.api.business.express.IExpressComponent;
import com.smartdigimkt.v0.l;
import com.smartdigimkt.v3.i;
import com.smartdigimkt.v6.a;
import com.smartdigimkt.w6.d;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.w6.g;
import com.smartdigimkt.w6.n;
import com.smartdigimkt.x.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class ExpressResourceHandle extends IExpressAdManager {
    private final String TAG = getClass().getSimpleName();
    ConcurrentHashMap<String, b> expressOfferLoader = new ConcurrentHashMap<>(2);

    /* JADX INFO: Access modifiers changed from: private */
    public String buildFullScreenClickable(String str, boolean z2) {
        HashMap map = new HashMap();
        if (z2) {
            map.put("alecfc", "1");
        } else {
            map.put("alecfc", "0");
        }
        try {
            return l.a(str, map);
        } catch (Throwable unused) {
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String buildShowShakeIcon(String str, boolean z2, int i2, long j) {
        HashMap map = new HashMap();
        if (z2) {
            map.put("shake_show", "1");
        } else {
            map.put("shake_show", "0");
        }
        map.put("shake_time", "" + (j / 1000));
        map.put("shake_strength", "" + i2);
        try {
            return l.a(str, map);
        } catch (Throwable unused) {
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String buildShowSplashCTAIcon(String str, boolean z2) {
        HashMap map = new HashMap();
        if (z2) {
            map.put("hdbtn", "0");
        } else {
            map.put("hdbtn", "1");
        }
        try {
            return l.a(str, map);
        } catch (Throwable unused) {
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackExpressRequestFail(String str, a aVar, c cVar) {
        this.expressOfferLoader.remove(aVar.f39163a + aVar.f39168i);
        if (cVar != null) {
            cVar.a(i.a("30003", str));
        }
    }

    private void requestBannerResource(d dVar, final a aVar, e eVar, final c cVar) {
        int i2 = 2;
        g gVar = aVar.t;
        int iA = h.a(com.smartdigimkt.m6.b.p().k(), 50.0f);
        if (gVar.M() <= 0) {
            String strQ = gVar.q();
            strQ.getClass();
            switch (strQ) {
                case "300x250":
                    iA = h.a(com.smartdigimkt.m6.b.p().k(), 250.0f);
                    break;
                case "320x90":
                case "728x90":
                    iA = h.a(com.smartdigimkt.m6.b.p().k(), 90.0f);
                    i2 = 1;
                    break;
                default:
                    i2 = 4;
                    break;
            }
        } else {
            iA = gVar.M();
            i2 = 5;
        }
        TemplateBannerView templateBannerView = new TemplateBannerView(com.smartdigimkt.m6.b.p().k());
        templateBannerView.init(new com.smartdigimkt.f1.i(i2, 0, gVar.M()), "", TextUtils.isEmpty(dVar.M0()) ? aVar.f39166e : dVar.M0());
        templateBannerView.setAllowShowCloseBtn(gVar.t0() == 0);
        if (iA > 0) {
            templateBannerView.setLayoutParams(new ViewGroup.LayoutParams(-1, iA));
        }
        templateBannerView.setBannerAdListener(new com.smartdigimkt.f1.h() { // from class: com.smartdigimkt.expressad.bridge.ExpressResourceHandle.2
            @Override // com.smartdigimkt.f1.h
            public void closeFullScreen() {
            }

            @Override // com.smartdigimkt.f1.h
            public void onClick(com.smartdigimkt.x.d dVar2) {
            }

            @Override // com.smartdigimkt.f1.h
            public void onCloseBanner() {
            }

            @Override // com.smartdigimkt.f1.h
            public void onLeaveApp() {
            }

            @Override // com.smartdigimkt.f1.h
            public void onLoadFailed(String str) {
                ExpressResourceHandle.this.callbackExpressRequestFail(str, aVar, cVar);
            }

            @Override // com.smartdigimkt.f1.h
            public void onLoadSuccessed() {
                TemplateBannerView templateBannerView2 = (TemplateBannerView) ExpressResourceHandle.this.expressOfferLoader.remove(aVar.f39163a + aVar.f39168i);
                if (templateBannerView2 != null) {
                    c cVar2 = cVar;
                    if (cVar2 != null) {
                        cVar2.b(templateBannerView2);
                        return;
                    }
                    return;
                }
                if (cVar != null) {
                    cVar.a(i.a("30003", "Resource download fail."));
                }
            }

            @Override // com.smartdigimkt.f1.h
            public void onLogImpression() {
            }

            @Override // com.smartdigimkt.f1.h
            public void showFullScreen() {
            }
        });
        if (cVar != null) {
            cVar.a(templateBannerView);
        }
        this.expressOfferLoader.put(aVar.f39163a + aVar.f39168i, templateBannerView);
        templateBannerView.load(eVar);
    }

    private void requestFullScreenResource(d dVar, final a aVar, e eVar, final c cVar) {
        ExpressResourceHandle expressResourceHandle;
        com.smartdigimkt.h1.a aVar2 = new com.smartdigimkt.h1.a();
        String strM0 = TextUtils.isEmpty(dVar.M0()) ? aVar.f39166e : dVar.M0();
        int i2 = aVar.f39164b;
        int i3 = aVar.f39170n;
        if (i3 >= 0) {
            i2 = i3;
        }
        if (i2 == 1) {
            com.smartdigimkt.f3.c.b().a(com.smartdigimkt.u.a.f().a(), strM0, false);
            aVar2.a(false);
        } else if (i2 == 3) {
            com.smartdigimkt.f3.c.b().a(com.smartdigimkt.u.a.f().a(), strM0, true);
            aVar2.a(true);
        }
        aVar2.b(aVar.t.L1() == 0 ? 1 : 2);
        aVar2.b("", strM0);
        com.smartdigimkt.f3.d dVarA = com.smartdigimkt.f3.c.b().a(com.smartdigimkt.u.a.f().a(), strM0, false);
        if (aVar.t.o1() >= 0) {
            dVarA.M(aVar.t.o1());
        }
        if (i2 == 1) {
            dVarA.l(1);
        }
        ArrayList<com.smartdigimkt.x.d> arrayListF = eVar.f();
        if (arrayListF != null && arrayListF.size() > 0) {
            for (com.smartdigimkt.x.d dVar2 : arrayListF) {
                if (dVar2 != null) {
                    boolean zA = com.smartdigimkt.m3.i.a(aVar);
                    boolean z2 = aVar.t.T() == 0;
                    String strB2 = dVar2.B2();
                    if (TextUtils.isEmpty(strB2)) {
                        expressResourceHandle = this;
                    } else {
                        expressResourceHandle = this;
                        dVar2.x0(expressResourceHandle.buildShowShakeIcon(buildFullScreenClickable(strB2, z2), zA, aVar.t.k1(), aVar.t.e1()));
                    }
                    String strX0 = dVar2.x0();
                    if (!TextUtils.isEmpty(strX0)) {
                        dVar2.L(expressResourceHandle.buildShowShakeIcon(buildFullScreenClickable(strX0, z2), zA, aVar.t.k1(), aVar.t.e1()));
                    }
                    com.smartdigimkt.x.d.c cVarU1 = dVar2.U1();
                    boolean z3 = aVar.t.J1() == 1;
                    if (cVarU1 != null) {
                        String strF = cVarU1.f();
                        if (!TextUtils.isEmpty(strF)) {
                            cVarU1.e(buildFullScreenClickable(strF, z3));
                        }
                    }
                }
            }
        }
        aVar2.a(new com.smartdigimkt.e3.a() { // from class: com.smartdigimkt.expressad.bridge.ExpressResourceHandle.3
            @Override // com.smartdigimkt.e3.a
            public void onAdClose(boolean z4, String str, float f) {
            }

            @Override // com.smartdigimkt.e3.a
            public void onAdCloseWithIVReward(boolean z4, int i4) {
            }

            @Override // com.smartdigimkt.e3.a
            public void onAdShow() {
            }

            @Override // com.smartdigimkt.e3.a
            public void onEndcardShow() {
            }

            @Override // com.smartdigimkt.e3.a
            public void onLoadSuccess() {
            }

            @Override // com.smartdigimkt.e3.a
            public void onShowFail(String str) {
            }

            @Override // com.smartdigimkt.e3.a
            public void onVideoAdClicked(com.smartdigimkt.x.d dVar3) {
            }

            @Override // com.smartdigimkt.e3.a
            public void onVideoComplete() {
            }

            @Override // com.smartdigimkt.e3.a
            public void onVideoLoadFail(String str) {
                ExpressResourceHandle.this.callbackExpressRequestFail(str, aVar, cVar);
            }

            @Override // com.smartdigimkt.e3.a
            public void onVideoLoadSuccess() {
                com.smartdigimkt.h1.a aVar3 = (com.smartdigimkt.h1.a) ExpressResourceHandle.this.expressOfferLoader.remove(aVar.f39163a + aVar.f39168i);
                if (aVar3 == null || !aVar3.isReady()) {
                    if (cVar != null) {
                        cVar.a(i.a("30003", "Resource download fail."));
                        return;
                    }
                    return;
                }
                c cVar2 = cVar;
                if (cVar2 != null) {
                    cVar2.b(aVar3);
                }
            }
        });
        if (cVar != null) {
            cVar.a(aVar2);
        }
        this.expressOfferLoader.put(aVar.f39163a + aVar.f39168i, aVar2);
        aVar2.a(eVar);
    }

    private void requestNativeResource(final d dVar, final a aVar, final e eVar, final c cVar) {
        com.smartdigimkt.l7.b.a().e(new Runnable() { // from class: com.smartdigimkt.expressad.bridge.ExpressResourceHandle.4
            @Override // java.lang.Runnable
            public void run() {
                com.smartdigimkt.f.c cVar2 = new com.smartdigimkt.f.c("", TextUtils.isEmpty(dVar.M0()) ? aVar.f39166e : dVar.M0(), com.smartdigimkt.m6.b.p().k());
                cVar2.a(new p() { // from class: com.smartdigimkt.expressad.bridge.ExpressResourceHandle.4.1
                    @Override // com.smartdigimkt.f1.p
                    public void closeFullScreen() {
                    }

                    @Override // com.smartdigimkt.f1.p
                    public void onClick(com.smartdigimkt.x.d dVar2) {
                    }

                    @Override // com.smartdigimkt.f1.p
                    public void onClose() {
                    }

                    @Override // com.smartdigimkt.f1.p
                    public void onLeaveApp() {
                    }

                    @Override // com.smartdigimkt.f1.p
                    public void onLoadFailed(String str) {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        ExpressResourceHandle.this.callbackExpressRequestFail(str, aVar, cVar);
                    }

                    @Override // com.smartdigimkt.f1.p
                    public void onLoadSuccessed() {
                        com.smartdigimkt.f.c cVar3 = (com.smartdigimkt.f.c) ExpressResourceHandle.this.expressOfferLoader.remove(aVar.f39163a + aVar.f39168i);
                        if (cVar3 != null) {
                            c cVar4 = cVar;
                            if (cVar4 != null) {
                                cVar4.b(cVar3);
                                return;
                            }
                            return;
                        }
                        if (cVar != null) {
                            cVar.a(i.a("30004", "Failed to load template content."));
                        }
                    }

                    @Override // com.smartdigimkt.f1.p
                    public void onLogImpression() {
                    }

                    @Override // com.smartdigimkt.f1.p
                    public void showFullScreen() {
                    }
                });
                c cVar3 = cVar;
                if (cVar3 != null) {
                    cVar3.a(cVar2);
                }
                ExpressResourceHandle.this.expressOfferLoader.put(aVar.f39163a + aVar.f39168i, cVar2);
                cVar2.a(eVar);
            }
        });
    }

    private void requestSplashResource(final d dVar, final a aVar, final e eVar, final c cVar) {
        com.smartdigimkt.l7.b.a().e(new Runnable() { // from class: com.smartdigimkt.expressad.bridge.ExpressResourceHandle.1
            @Override // java.lang.Runnable
            public void run() {
                com.smartdigimkt.u1.c cVar2 = new com.smartdigimkt.u1.c(com.smartdigimkt.m6.b.p().k(), "", TextUtils.isEmpty(dVar.M0()) ? aVar.f39166e : dVar.M0());
                cVar2.d(aVar.t.u() == 0);
                int iZ1 = ((int) aVar.t.z1()) / 1000;
                if (iZ1 <= 2) {
                    cVar2.d(2);
                } else if (iZ1 >= 10) {
                    cVar2.d(10);
                } else {
                    cVar2.d(iZ1);
                }
                cVar2.c(aVar.t.B1());
                cVar2.b(aVar.t.T() == 0);
                cVar2.b(aVar.t.D1());
                cVar2.b(100, 100);
                ArrayList<com.smartdigimkt.x.d> arrayListF = eVar.f();
                if (arrayListF != null && arrayListF.size() > 0) {
                    for (com.smartdigimkt.x.d dVar2 : arrayListF) {
                        if (dVar2 != null) {
                            String strU = dVar2.U();
                            if (!TextUtils.isEmpty(strU)) {
                                boolean z2 = aVar.t.T() == 0;
                                boolean zA = com.smartdigimkt.m3.i.a(aVar);
                                strU = ExpressResourceHandle.this.buildShowShakeIcon(ExpressResourceHandle.this.buildFullScreenClickable(strU, z2), zA, aVar.t.k1(), aVar.t.e1());
                                if (!zA && !z2) {
                                    strU = ExpressResourceHandle.this.buildShowSplashCTAIcon(strU, true);
                                } else if (zA) {
                                    strU = ExpressResourceHandle.this.buildShowSplashCTAIcon(strU, false);
                                }
                            }
                            dVar2.y(strU);
                        }
                    }
                }
                cVar2.a(new com.smartdigimkt.f1.d() { // from class: com.smartdigimkt.expressad.bridge.ExpressResourceHandle.1.1
                    @Override // com.smartdigimkt.f1.d
                    public void isSupportZoomOut(boolean z3) {
                    }

                    @Override // com.smartdigimkt.f1.d
                    public void onLoadFailed(String str, int i2) {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        ExpressResourceHandle.this.callbackExpressRequestFail(str, aVar, cVar);
                    }

                    @Override // com.smartdigimkt.f1.d
                    public void onLoadSuccessed(int i2) {
                        com.smartdigimkt.u1.c cVar3 = (com.smartdigimkt.u1.c) ExpressResourceHandle.this.expressOfferLoader.remove(aVar.f39163a + aVar.f39168i);
                        if (cVar3 != null) {
                            c cVar4 = cVar;
                            if (cVar4 != null) {
                                cVar4.b(cVar3);
                                return;
                            }
                            return;
                        }
                        if (cVar != null) {
                            cVar.a(i.a("30003", "Resource download fail."));
                        }
                    }
                });
                c cVar3 = cVar;
                if (cVar3 != null) {
                    cVar3.a(cVar2);
                }
                ExpressResourceHandle.this.expressOfferLoader.put(aVar.f39163a + aVar.f39168i, cVar2);
                cVar2.a(eVar);
            }
        });
    }

    public static void syncAdxOfferToCampaings(d dVar, List<com.smartdigimkt.x.d> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<com.smartdigimkt.x.d> it = list.iterator();
        while (it.hasNext()) {
            it.next().w(dVar.c());
        }
    }

    public static void syncBaseAdSettingToCampaings(a aVar, List<com.smartdigimkt.x.d> list) {
        g gVar;
        g gVar2;
        int i2 = aVar.f39164b;
        int i3 = aVar.f39170n;
        if (i3 >= 0) {
            i2 = i3;
        }
        com.smartdigimkt.x.d dVar = list.get(0);
        if ((i2 == 1 || i2 == 3) && dVar != null && (gVar = aVar.t) != null) {
            dVar.z0(gVar.o1());
        }
        if (dVar == null || (gVar2 = aVar.t) == null) {
            return;
        }
        dVar.r(gVar2.r());
    }

    private synchronized e syncCampaignAndBaseAdContentInfo(d dVar, a aVar) {
        if (TextUtils.isEmpty(dVar.W0())) {
            return null;
        }
        e eVarB = e.b(dVar.W0());
        ArrayList<com.smartdigimkt.x.d> arrayListF = eVarB.f();
        syncCampaingToAdxOffer(dVar, arrayListF.get(0));
        syncAdxOfferToCampaings(dVar, arrayListF);
        syncBaseAdSettingToCampaings(aVar, arrayListF);
        return eVarB;
    }

    public static void syncCampaingToAdxOffer(d dVar, com.smartdigimkt.x.d dVar2) {
        dVar.J(dVar2.n());
        dVar.s(dVar2.i());
        dVar.P(dVar2.f());
        dVar.m(dVar2.e());
        dVar.h(dVar2.p0());
        dVar.l(dVar2.s0());
        n nVarR0 = dVar.R0();
        if (nVarR0 == null) {
            nVarR0 = new n();
            dVar.a(nVarR0);
        }
        com.smartdigimkt.x.p pVarP1 = dVar2.p1();
        if (pVarP1 != null) {
            nVarR0.b(pVarP1.w());
            nVarR0.a(pVarP1.v());
            nVarR0.c(pVarP1.x());
        }
        syncClickTracking(dVar, dVar2);
    }

    public static void syncClickTracking(f fVar, com.smartdigimkt.x.d dVar) {
        String[] strArrE;
        d dVar2 = fVar instanceof d ? (d) fVar : null;
        if (fVar == null || dVar == null) {
            return;
        }
        fVar.l(dVar.s0());
        fVar.h(dVar.p0());
        fVar.T(dVar.C());
        fVar.U(dVar.B());
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.r1() + "&opdptype={opdptype}&apk_ptype={apk_ptype}");
        com.smartdigimkt.x.p pVarP1 = dVar.p1();
        if (pVarP1 != null && (strArrE = pVarP1.e()) != null) {
            for (String str : strArrE) {
                arrayList.add(str);
            }
        }
        n nVarR0 = dVar2.R0();
        if (nVarR0 == null) {
            nVarR0 = new n();
            dVar2.a(nVarR0);
        }
        nVarR0.h((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    public static com.smartdigimkt.m3.g syncOfferClickControll(com.smartdigimkt.m3.g gVar, com.smartdigimkt.x.d dVar) {
        g gVarI = gVar.b().i();
        if (gVar.b().L().equals(dVar.j())) {
            syncClickTracking(gVar.b(), dVar);
            return gVar;
        }
        d dVar2 = new d();
        if (gVar.b() instanceof d) {
            dVar2.c(((d) gVar.b()).Q0());
            dVar2.a(((d) gVar.b()).R0());
        }
        syncCampaingToAdxOffer(dVar2, dVar);
        dVar2.C(dVar.j());
        int iE1 = dVar.e1();
        if (iE1 == 0) {
            dVar2.b(2);
        } else if (iE1 == 1 || iE1 == 2) {
            dVar2.b(1);
        } else if (iE1 == 3) {
            dVar2.b(4);
        } else if (iE1 == 4) {
            dVar2.b(3);
        } else if (iE1 == 5) {
            dVar2.b(2);
        } else if (iE1 == 8) {
            dVar2.b(3);
        } else if (iE1 == 9) {
            dVar2.b(2);
        } else if (iE1 == 12) {
            dVar2.b(6);
        }
        com.smartdigimkt.x.b bVarX = dVar.x();
        if (bVarX != null) {
            dVar2.W(bVarX.b());
            dVar2.M(bVarX.d());
            dVar2.g(bVarX.c());
            dVar2.L(bVarX.j());
            dVar2.I(bVarX.i());
        }
        com.smartdigimkt.m3.g gVar2 = new com.smartdigimkt.m3.g(com.smartdigimkt.m6.b.p().k(), gVar.c(), dVar2, null);
        dVar2.b(gVarI);
        return gVar2;
    }

    @Override // com.smartdigimkt.sdk.api.business.express.IExpressAdManager
    public IExpressComponent createExpressComponent(Context context, a aVar, f fVar, b bVar) {
        return new ExpressComponent(context, aVar, fVar, bVar);
    }

    @Override // com.smartdigimkt.sdk.api.business.express.IExpressAdManager
    public void handleExpressAdResourceRequest(d dVar, a aVar, c cVar) {
        e eVarSyncCampaignAndBaseAdContentInfo = syncCampaignAndBaseAdContentInfo(dVar, aVar);
        initExpressSDK(dVar);
        int i2 = aVar.f39164b;
        int i3 = aVar.f39170n;
        if (i3 >= 0) {
            i2 = i3;
        }
        if (String.valueOf(i2).equals("0")) {
            requestNativeResource(dVar, aVar, eVarSyncCampaignAndBaseAdContentInfo, cVar);
            return;
        }
        if (String.valueOf(i2).equals("2")) {
            requestBannerResource(dVar, aVar, eVarSyncCampaignAndBaseAdContentInfo, cVar);
        } else if (String.valueOf(i2).equals("4")) {
            requestSplashResource(dVar, aVar, eVarSyncCampaignAndBaseAdContentInfo, cVar);
        } else {
            requestFullScreenResource(dVar, aVar, eVarSyncCampaignAndBaseAdContentInfo, cVar);
        }
    }

    @Override // com.smartdigimkt.sdk.api.business.express.IExpressAdManager
    public void initExpressSDK(d dVar) {
        if (!TextUtils.isEmpty(dVar.f0())) {
            com.smartdigimkt.f1.b.f34972a = dVar.f0();
        }
        if (com.smartdigimkt.u.a.f().d() == null) {
            com.smartdigimkt.u.a.f().b(com.smartdigimkt.m6.b.p().k());
            com.smartdigimkt.u.a.f().a(com.smartdigimkt.m6.b.p().i());
            com.smartdigimkt.w1.b bVarA = com.smartdigimkt.f1.g.a();
            HashMap map = new HashMap(3);
            map.put(com.smartdigimkt.b.b.d, dVar.G0());
            map.put(com.smartdigimkt.b.b.f33806e, dVar.H0());
            bVarA.a(map, com.smartdigimkt.m6.b.p().k());
        }
    }

    @Override // com.smartdigimkt.sdk.api.business.express.IExpressAdManager
    public boolean isLocalResourceReady(d dVar, a aVar) {
        e eVarSyncCampaignAndBaseAdContentInfo = syncCampaignAndBaseAdContentInfo(dVar, aVar);
        int i2 = aVar.f39164b;
        int i3 = aVar.f39170n;
        if (i3 >= 0) {
            i2 = i3;
        }
        if (String.valueOf(i2).equals("0") || String.valueOf(i2).equals("2")) {
            return true;
        }
        if (String.valueOf(i2).equals("4")) {
            if (eVarSyncCampaignAndBaseAdContentInfo != null && eVarSyncCampaignAndBaseAdContentInfo.f() != null && eVarSyncCampaignAndBaseAdContentInfo.f().size() > 0) {
                return com.smartdigimkt.t1.d.a(eVarSyncCampaignAndBaseAdContentInfo.f().get(0));
            }
        } else if (eVarSyncCampaignAndBaseAdContentInfo != null && eVarSyncCampaignAndBaseAdContentInfo.f() != null && eVarSyncCampaignAndBaseAdContentInfo.f().size() > 0) {
            return o.b(eVarSyncCampaignAndBaseAdContentInfo.f());
        }
        return false;
    }
}
