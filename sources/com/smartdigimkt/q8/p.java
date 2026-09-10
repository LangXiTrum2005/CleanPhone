package com.smartdigimkt.q8;

import android.text.TextUtils;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.SDMAdConst;
import com.smartdigimkt.sdk.api.format.SDMLossInfo;
import com.smartdigimkt.sdk.api.format.SDMWinInfo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f37972b = "p";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.smartdigimkt.y4.c f37973a;

    public class a implements Runnable {
        final /* synthetic */ com.smartdigimkt.y4.c X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ SDMWinInfo f37974Y;

        public a(com.smartdigimkt.y4.c cVar, SDMWinInfo sDMWinInfo) {
            this.X = cVar;
            this.f37974Y = sDMWinInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            new p(this.X).a(this.f37974Y);
        }
    }

    public class b implements Runnable {
        final /* synthetic */ com.smartdigimkt.y4.c X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ SDMLossInfo f37975Y;

        public b(com.smartdigimkt.y4.c cVar, SDMLossInfo sDMLossInfo) {
            this.X = cVar;
            this.f37975Y = sDMLossInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            new p(this.X).a(this.f37975Y);
        }
    }

    public class c implements com.smartdigimkt.w7.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.r8.d f37976a;

        public c(com.smartdigimkt.r8.d dVar) {
            this.f37976a = dVar;
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2) {
        }

        @Override // com.smartdigimkt.w7.c
        public void b(int i2) {
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, Object obj) {
            p.b(this.f37976a);
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, String str, AdError adError) {
            if (adError != null) {
                this.f37976a.a(adError.getCode());
                this.f37976a.b(adError.getMessage());
            }
            p.b(this.f37976a);
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37978a;

        static {
            int[] iArr = new int[SDMLossInfo.LOSS_REASON.values().length];
            f37978a = iArr;
            try {
                iArr[SDMLossInfo.LOSS_REASON.LOSS_TO_AUCTION_FLOOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37978a[SDMLossInfo.LOSS_REASON.LOSS_TO_EXPIRE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37978a[SDMLossInfo.LOSS_REASON.LOSS_TO_HIGHER_BID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37978a[SDMLossInfo.LOSS_REASON.LOSS_TO_NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public p(com.smartdigimkt.y4.c cVar) {
        this.f37973a = cVar;
    }

    private void b(com.smartdigimkt.y4.c cVar, SDMWinInfo sDMWinInfo) {
        try {
            com.smartdigimkt.w6.f fVarG = cVar.g();
            com.smartdigimkt.v3.l lVar = new com.smartdigimkt.v3.l(fVarG.d0(), "", "");
            lVar.r = a(cVar, sDMWinInfo);
            com.smartdigimkt.m3.f.a(10, fVarG, lVar);
            com.smartdigimkt.p6.b.b().d(com.smartdigimkt.m6.b.p().k(), ((com.smartdigimkt.w6.d) fVarG).V0());
        } catch (Throwable unused) {
        }
    }

    private void c(com.smartdigimkt.y4.c cVar, SDMWinInfo sDMWinInfo) {
        try {
            com.smartdigimkt.r8.d dVarA = a(true, cVar, sDMWinInfo, null);
            if (TextUtils.isEmpty(dVarA.i())) {
                b(dVarA);
            } else {
                c(dVarA);
            }
        } catch (Throwable unused) {
        }
    }

    public static void d(com.smartdigimkt.y4.c cVar, SDMWinInfo sDMWinInfo) {
        com.smartdigimkt.l8.f fVarL;
        com.smartdigimkt.y6.b bVarD;
        if (cVar == null || sDMWinInfo == null || (fVarL = cVar.l()) == null || (bVarD = fVarL.D()) == null || bVarD.a(true, null)) {
            return;
        }
        if (fVarL.d()) {
            com.smartdigimkt.l7.b.a().f(new a(cVar, sDMWinInfo));
            return;
        }
        com.smartdigimkt.r8.d dVar = new com.smartdigimkt.r8.d(cVar, true);
        dVar.a(sDMWinInfo);
        b(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SDMWinInfo sDMWinInfo) {
        this.f37973a.h();
        if (!a(sDMWinInfo.getExtraMap())) {
            c(this.f37973a, sDMWinInfo);
        }
        b(this.f37973a, sDMWinInfo);
    }

    private void c(com.smartdigimkt.y4.c cVar, SDMLossInfo sDMLossInfo) {
        try {
            com.smartdigimkt.r8.d dVarA = a(false, cVar, null, sDMLossInfo);
            if (TextUtils.isEmpty(dVarA.c())) {
                b(dVarA);
            } else {
                c(dVarA);
            }
        } catch (Throwable unused) {
        }
    }

    private void b(com.smartdigimkt.y4.c cVar, SDMLossInfo sDMLossInfo) {
        try {
            com.smartdigimkt.w6.f fVarG = cVar.g();
            com.smartdigimkt.v3.l lVar = new com.smartdigimkt.v3.l(fVarG.d0(), "", "");
            lVar.r = a(cVar, sDMLossInfo);
            com.smartdigimkt.m3.f.a(36, fVarG, lVar);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SDMLossInfo sDMLossInfo) {
        if (!a(sDMLossInfo.getExtraMap())) {
            c(this.f37973a, sDMLossInfo);
        }
        b(this.f37973a, sDMLossInfo);
    }

    private String c(com.smartdigimkt.y6.b bVar, double d2) {
        if (bVar.s == 66 && bVar.l() > 0.0d) {
            return String.valueOf(d2 / bVar.l());
        }
        return String.valueOf(d2);
    }

    public static void d(com.smartdigimkt.y4.c cVar, SDMLossInfo sDMLossInfo) {
        com.smartdigimkt.l8.f fVarL;
        com.smartdigimkt.y6.b bVarD;
        if (cVar == null || sDMLossInfo == null || (fVarL = cVar.l()) == null || (bVarD = fVarL.D()) == null || bVarD.a(false, sDMLossInfo)) {
            return;
        }
        if (sDMLossInfo.getLossReason() == SDMLossInfo.LOSS_REASON.LOSS_TO_EXPIRE) {
            com.smartdigimkt.p6.b.b().c(com.smartdigimkt.m6.b.p().k(), bVarD.f40233e);
        }
        if (fVarL.c()) {
            com.smartdigimkt.l7.b.a().f(new b(cVar, sDMLossInfo));
            return;
        }
        com.smartdigimkt.r8.d dVar = new com.smartdigimkt.r8.d(cVar, false);
        dVar.a(sDMLossInfo);
        b(dVar);
    }

    private String b(com.smartdigimkt.y6.b bVar, double d2) {
        String strC = c(bVar, d2);
        try {
            return String.valueOf((int) Math.round(Double.parseDouble(strC)));
        } catch (Throwable unused) {
            return strC;
        }
    }

    private boolean a(Map<String, Object> map) {
        com.smartdigimkt.y4.c cVar = this.f37973a;
        com.smartdigimkt.a7.a aVarF = cVar != null ? cVar.f() : null;
        if (aVarF != null) {
            return aVarF.f0();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.smartdigimkt.r8.d dVar) {
        if (dVar == null) {
            return;
        }
        if (dVar.j()) {
            com.smartdigimkt.i7.d.b(dVar);
        } else {
            com.smartdigimkt.i7.d.a(dVar);
        }
    }

    private void c(com.smartdigimkt.r8.d dVar) {
        new com.smartdigimkt.b8.g(dVar.j() ? dVar.i() : dVar.c()).a(0, (com.smartdigimkt.w7.c) new c(dVar));
    }

    private com.smartdigimkt.r8.d a(boolean z2, com.smartdigimkt.y4.c cVar, SDMWinInfo sDMWinInfo, SDMLossInfo sDMLossInfo) {
        String strReplace;
        com.smartdigimkt.y6.b bVarI = cVar.i();
        com.smartdigimkt.r8.d dVar = new com.smartdigimkt.r8.d(cVar, z2);
        dVar.a(sDMWinInfo);
        dVar.a(sDMLossInfo);
        if (bVarI == null) {
            return dVar;
        }
        if (z2) {
            strReplace = bVarI.g;
            if (sDMWinInfo != null) {
                strReplace = a(strReplace, a(cVar, sDMWinInfo, dVar));
            }
        } else {
            String str = bVarI.f40234h;
            strReplace = sDMLossInfo != null ? a(str, a(cVar, sDMLossInfo, dVar)).replace("${AUCTION_SEAT_ID}", "") : str;
        }
        if (z2) {
            dVar.f(strReplace);
            return dVar;
        }
        dVar.c(strReplace);
        return dVar;
    }

    public double a(com.smartdigimkt.y6.b bVar, double d2) {
        double d3 = bVar.f40240E;
        return d3 > 0.0d ? d2 * d3 : d2;
    }

    private String a(SDMLossInfo.LOSS_REASON loss_reason) {
        if (loss_reason == null) {
            return "103";
        }
        int i2 = d.f37978a[loss_reason.ordinal()];
        if (i2 == 1) {
            return "100";
        }
        if (i2 != 2) {
            return i2 != 3 ? "103" : "102";
        }
        return "2";
    }

    private Map<String, Object> a(com.smartdigimkt.y4.c cVar, SDMWinInfo sDMWinInfo) {
        Map<String, Object> extraMap = sDMWinInfo.getExtraMap();
        return a(extraMap) ? extraMap : a(cVar, sDMWinInfo, (com.smartdigimkt.r8.d) null);
    }

    private Map<String, Object> a(com.smartdigimkt.y4.c cVar, SDMLossInfo sDMLossInfo) {
        Map<String, Object> extraMap = sDMLossInfo.getExtraMap();
        return a(extraMap) ? extraMap : a(cVar, sDMLossInfo, (com.smartdigimkt.r8.d) null);
    }

    private Map<String, Object> a(com.smartdigimkt.y4.c cVar, SDMWinInfo sDMWinInfo, com.smartdigimkt.r8.d dVar) {
        com.smartdigimkt.y6.b bVarI = cVar.i();
        if (bVarI == null) {
            return new HashMap();
        }
        double dA = a(bVarI, sDMWinInfo.getSecondPrice(SDMAdConst.CURRENCY.USD));
        String strE = com.smartdigimkt.n8.h.e(sDMWinInfo.getExtraMap(), "bidding_name");
        if (TextUtils.isEmpty(strE)) {
            strE = "";
        }
        HashMap map = new HashMap();
        String strC = c(bVarI, dA);
        map.put("${AUCTION_BID_TO_WIN}", strC);
        if (!TextUtils.isEmpty(strE)) {
            map.put("{__BIDDER__}", strE);
        } else {
            map.put("{__BIDDER__}", "");
        }
        if (dVar != null) {
            dVar.d(strC);
        }
        return map;
    }

    private Map<String, Object> a(com.smartdigimkt.y4.c cVar, SDMLossInfo sDMLossInfo, com.smartdigimkt.r8.d dVar) {
        HashMap map = new HashMap();
        double winPrice = sDMLossInfo.getWinPrice(SDMAdConst.CURRENCY.USD);
        String strA = a(sDMLossInfo.getLossReason());
        String str = TextUtils.equals(strA, "1") ? "900" : TextUtils.equals(strA, "2") ? "203" : (TextUtils.equals(strA, "102") || TextUtils.equals(strA, "103")) ? "203" : "900";
        String strE = com.smartdigimkt.n8.h.e(sDMLossInfo.getExtraMap(), "bidding_name");
        if (!TextUtils.isEmpty(strE)) {
            map.put("{__BIDDER__}", strE);
        } else {
            map.put("{__BIDDER__}", "");
        }
        map.put("${AUCTION_LOSS}", strA);
        map.put("${AUCTION_LOSS_BD}", str);
        map.put("{__TS__}", Long.valueOf(System.currentTimeMillis() / 1000));
        com.smartdigimkt.y6.b bVarI = cVar.i();
        if (bVarI != null) {
            double dA = a(bVarI, winPrice);
            String strC = c(bVarI, dA);
            map.put("${AUCTION_PRICE}", strC);
            map.put("${AUCTION_PRICE_INT}", b(bVarI, dA));
            if (dVar != null) {
                dVar.e(strC);
            }
        }
        return map;
    }

    private String a(String str, Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                str = str.replace(entry.getKey(), entry.getValue().toString());
            } catch (Throwable unused) {
            }
        }
        return str;
    }

    public static void a(com.smartdigimkt.y4.c cVar) {
        new p(cVar).a();
    }

    private void a() {
        com.smartdigimkt.y6.b bVarI;
        com.smartdigimkt.y4.c cVar = this.f37973a;
        if (cVar == null || (bVarI = cVar.i()) == null) {
            return;
        }
        double d2 = bVarI.f40240E;
        String str = bVarI.C;
        if (bVarI.y) {
            double dH = d2 > 0.0d ? bVarI.h() * d2 : bVarI.h();
            if (TextUtils.isEmpty(str)) {
                str = bVarI.f40235i;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            new com.smartdigimkt.b8.g(str.replace("${AUCTION_PRICE}", c(bVarI, dH))).a(0, (com.smartdigimkt.w7.c) null);
            return;
        }
        String strReplace = bVarI.f40235i;
        if (TextUtils.isEmpty(strReplace)) {
            return;
        }
        SDMLossInfo sDMLossInfo = bVarI.f40238A;
        if (sDMLossInfo != null) {
            strReplace = strReplace.replace("${AUCTION_LOSS}", a(sDMLossInfo.getLossReason()));
        }
        new com.smartdigimkt.b8.g(strReplace).a(0, (com.smartdigimkt.w7.c) null);
    }
}
