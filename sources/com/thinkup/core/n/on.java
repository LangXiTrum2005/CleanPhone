package com.thinkup.core.n;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.extractor.text.ttml.a;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUBidRequestInfo;
import com.thinkup.core.api.TUBiddingResult;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.mm0;
import com.thinkup.core.common.on.mmm;
import com.thinkup.core.common.on.mnn;
import com.thinkup.core.common.on.nm;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0om;
import com.thinkup.core.common.on.om0;
import com.thinkup.core.common.on.on0;
import com.thinkup.core.common.ooo.m0m;
import com.thinkup.core.common.ooo.nn;
import com.thinkup.core.common.ooo.omn;
import com.thinkup.core.common.ooo.ono;
import com.thinkup.core.common.ooo.oo0;
import com.thinkup.core.oo.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class on extends o {
    public static final String oo = "on";
    private long m0;
    private n0 mm;
    private List<TUBaseAdAdapter> mo;
    private List<o0mm> om;
    private com.thinkup.core.n.m.m on;

    /* JADX INFO: renamed from: com.thinkup.core.n.on$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] o;

        static {
            int[] iArr = new int[TUAdConst.CURRENCY.values().length];
            o = iArr;
            try {
                iArr[TUAdConst.CURRENCY.RMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                o[TUAdConst.CURRENCY.RMB_CENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                o[TUAdConst.CURRENCY.USD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public on(o0om o0omVar) {
        super(o0omVar);
        this.om = Collections.synchronizedList(new ArrayList(this.o.mm));
        this.mo = a.u();
    }

    @Override // com.thinkup.core.n.o
    public final synchronized void m() throws Throwable {
        try {
            try {
                if (!this.f42408n.get()) {
                    this.f42408n.set(true);
                    ArrayList arrayList = new ArrayList(3);
                    ArrayList arrayList2 = new ArrayList(3);
                    for (o0mm o0mmVar : this.om) {
                        if (o(o0mmVar, "bid timeout", -3)) {
                            arrayList.add(o0mmVar);
                        } else {
                            o(o0mmVar, TUBiddingResult.fail("bid timeout!"), SystemClock.elapsedRealtime() - this.m0, -3, (com.thinkup.core.n.n.m) null, (com.thinkup.core.n.n.o) null);
                            arrayList2.add(o0mmVar);
                        }
                    }
                    this.om.clear();
                    com.thinkup.core.n.m.m mVar = this.on;
                    if (mVar != null) {
                        mVar.o(arrayList, arrayList2);
                    }
                    this.on = null;
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // com.thinkup.core.n.o
    public final void o(final com.thinkup.core.n.m.m mVar) {
        this.on = mVar;
        List<o0mm> list = this.o.mm;
        this.m0 = SystemClock.elapsedRealtime();
        for (int i2 = 0; i2 < list.size(); i2++) {
            final o0mm o0mmVar = list.get(i2);
            if (o0mmVar != null) {
                long jOnnn = o0mmVar.onnn();
                if (jOnnn > 0) {
                    com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.core.n.on.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (on.this.f42408n.get()) {
                                o0mmVar.m0o();
                            } else {
                                on.this.o(o0mmVar, mVar);
                            }
                        }
                    }, jOnnn);
                } else {
                    o(o0mmVar, mVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(final o0mm o0mmVar, com.thinkup.core.n.m.m mVar) {
        nm nmVarO = oo0.o(o0mmVar);
        TUBaseAdAdapter tUBaseAdAdapter = nmVarO != null ? nmVarO.o : null;
        if (tUBaseAdAdapter == null) {
            String strO = o0mmVar.oo0() + " not exist!";
            if (nmVarO != null) {
                strO = nmVarO.o(strO);
            }
            o(false, TUBiddingResult.fail(strO), o0mmVar, -9, (com.thinkup.core.n.n.m) null, (com.thinkup.core.n.n.o) null);
            return;
        }
        this.mo.add(tUBaseAdAdapter);
        try {
            com.thinkup.core.n.m.n nVar = new com.thinkup.core.n.m.n(tUBaseAdAdapter) { // from class: com.thinkup.core.n.on.2
                private void o(final TUBiddingResult tUBiddingResult, final com.thinkup.core.n.n.m mVar2, final com.thinkup.core.n.n.o oVar) {
                    com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.core.n.on.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            on.this.o(tUBiddingResult.isSuccessWithUseType(), tUBiddingResult, o0mmVar, on.o(tUBiddingResult), mVar2, oVar);
                        }
                    });
                }

                @Override // com.thinkup.core.api.TUBiddingListener
                public final void onC2SBidResult(TUBiddingResult tUBiddingResult) {
                    TUBaseAdAdapter tUBaseAdAdapter2 = this.f42401n;
                    String internalNetworkSDKVersion = "";
                    if (tUBaseAdAdapter2 != null) {
                        try {
                            internalNetworkSDKVersion = tUBaseAdAdapter2.getInternalNetworkSDKVersion();
                        } catch (Throwable unused) {
                        }
                        on.this.mo.remove(this.f42401n);
                        this.f42401n.releaseLoadResource();
                    }
                    o(tUBiddingResult, null, new com.thinkup.core.n.n.o(internalNetworkSDKVersion));
                }

                @Override // com.thinkup.core.api.TUBiddingListener
                public final void onC2SBiddingResultWithCache(TUBiddingResult tUBiddingResult, BaseAd baseAd) {
                    TUBaseAdAdapter tUBaseAdAdapter2 = this.f42401n;
                    String internalNetworkSDKVersion = "";
                    if (tUBaseAdAdapter2 != null) {
                        try {
                            internalNetworkSDKVersion = tUBaseAdAdapter2.getInternalNetworkSDKVersion();
                        } catch (Throwable unused) {
                        }
                        on.this.mo.remove(this.f42401n);
                        this.f42401n.releaseLoadResource();
                    }
                    o(tUBiddingResult, new com.thinkup.core.n.n.m(this.f42401n, baseAd), new com.thinkup.core.n.n.o(internalNetworkSDKVersion));
                }
            };
            tUBaseAdAdapter.getInternalNetworkName();
            this.mm = com.thinkup.core.oo.nm.o(this.o.m).o(this.o.oo);
            mmm mmmVar = this.o.f42240n;
            TUAdRequest tUAdRequestM = mmmVar != null ? mmmVar.m() : null;
            n0 n0Var = this.mm;
            o0om o0omVar = this.o;
            Map<String, Object> mapO = n0Var.o(o0omVar.oo, o0omVar.o0, o0mmVar, tUAdRequestM);
            try {
                double dO = com.thinkup.core.n.o0.m.o(this.o, o0mmVar);
                if (dO > 0.0d) {
                    mapO.put("bid_floor", Double.valueOf(dO * o(o0mmVar)));
                }
            } catch (Throwable th) {
                Log.w(omn.o, "C2S startBidRequest with exception:" + th.getMessage());
            }
            com.thinkup.core.common.on.n0 n0VarNmm = this.o.o0n.nmm();
            m0m.o(n0VarNmm, o0mmVar, 0, false);
            nn.o(mapO, n0VarNmm);
            if (o0mmVar.nm() == 22) {
                com.thinkup.core.common.ooo.om.o(this.mm, mapO, o0mmVar, this.o.om0);
            }
            mmm mmmVar2 = this.o.f42240n;
            Context contextO = mmmVar2 != null ? mmmVar2.o() : null;
            if (contextO == null) {
                contextO = this.o.m;
            }
            o0om o0omVar2 = this.o;
            boolean zInternalStartBiddingRequest = tUBaseAdAdapter.internalStartBiddingRequest(contextO, mapO, o0omVar2.o0o, new com.thinkup.core.n.m.o(o0omVar2.o0n, o0mmVar.m0o(), mapO, nVar));
            if (mVar != null) {
                mVar.o(o0mmVar, tUBaseAdAdapter);
            }
            if (zInternalStartBiddingRequest) {
                return;
            }
            o(TUBiddingResult.fail("This network don't support head bidding in current TopOn's version."), o0mmVar);
        } catch (Throwable th2) {
            th2.printStackTrace();
            o(TUBiddingResult.fail(th2.getMessage()), o0mmVar);
        }
    }

    private static int m(TUBiddingResult tUBiddingResult) {
        if (tUBiddingResult.isSuccessWithUseType()) {
            return 0;
        }
        return TextUtils.equals(tUBiddingResult.errorMsg, TUBidRequestInfo.BID_TYPE_ERROR_TYPE) ? -10 : -1;
    }

    private static boolean m(double d, o0mm o0mmVar) {
        double dOmo0 = o0mmVar.omo0();
        return dOmo0 <= 0.0d || d <= dOmo0;
    }

    private boolean o(final o0mm o0mmVar, om0 om0Var, long j, int i2, com.thinkup.core.n.n.m mVar, com.thinkup.core.n.n.o oVar) throws Throwable {
        int i3;
        final TUBaseAdAdapter tUBaseAdAdapterO;
        boolean zIsSuccessWithUseType = om0Var.isSuccessWithUseType();
        on0 on0VarO = o(o0mmVar, om0Var, j, mVar, oVar);
        double price = zIsSuccessWithUseType ? on0VarO.getPrice() : 0.0d;
        boolean zO = o.o(zIsSuccessWithUseType, o0mmVar, on0VarO);
        double dOmo0 = o0mmVar.omo0();
        boolean z2 = dOmo0 <= 0.0d || price <= dOmo0;
        AdError adErrorO = ono.o(0, this.o.o0n, o0mmVar, on0VarO);
        boolean z3 = adErrorO != null;
        if (zIsSuccessWithUseType && !zO && z2 && !z3) {
            o0mmVar.m0o();
            o0mmVar.nm();
            om0Var.getPrice();
            om0Var.getSortPrice();
            om0Var.currency.toString();
            o(o0mmVar, on0VarO);
            String str = com.thinkup.core.common.n.mo.o0m.no;
            o0om o0omVar = this.o;
            omn.o(str, o0omVar.oo, nn.om(String.valueOf(o0omVar.om)), o0mmVar);
            return true;
        }
        if (zO) {
            o.o(o0mmVar, TUBidRequestInfo.LESS_THAN_BID_FLOOR_TYPE, j, -11);
            o0mmVar.m(price);
            o0mmVar.oo(on0VarO.getSortPrice());
            o0mmVar.o(on0VarO);
        } else if (z3) {
            o.o(o0mmVar, adErrorO.getPlatformMSG(), j, -13);
            o0mmVar.m(price);
            o0mmVar.oo(on0VarO.getSortPrice());
            o0mmVar.o(on0VarO);
        } else {
            if (z2 || o0mmVar.nm() != 72) {
                i3 = i2;
            } else {
                om0Var.errorMsg = TUBidRequestInfo.JAD_PRICE_EXCEPTION_TYPE;
                i3 = -12;
            }
            o.o(o0mmVar, om0Var.errorMsg, j, i3);
            on0VarO.errorMsg = om0Var.getErrorMsg();
            o0mmVar.o(on0VarO);
        }
        if (mVar != null && (tUBaseAdAdapterO = mVar.o()) != null) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.core.n.on.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Objects.toString(tUBaseAdAdapterO);
                        Objects.toString(o0mmVar);
                        TUBaseAdAdapter tUBaseAdAdapter = tUBaseAdAdapterO;
                        if (tUBaseAdAdapter != null) {
                            tUBaseAdAdapter.internalDestory();
                        }
                    } catch (Throwable th) {
                        Log.e(com.thinkup.core.common.n.mo.oo0, "destroy error:" + tUBaseAdAdapterO, th);
                    }
                }
            });
        }
        String str2 = com.thinkup.core.common.n.mo.o0m.nm;
        o0om o0omVar2 = this.o;
        omn.o(str2, o0omVar2.oo, nn.om(String.valueOf(o0omVar2.om)), o0mmVar);
        return false;
    }

    private static void o(o0mm o0mmVar, om0 om0Var) {
        if (o0mmVar.nm() == 75) {
            o0mmVar.m0o();
            Object extra = om0Var.getExtra();
            if (extra == null) {
                o0mmVar.m0o();
                return;
            }
            String str = (String) extra;
            JSONObject jSONObjectOmom = o0mmVar.omom();
            if (jSONObjectOmom != null && !TextUtils.isEmpty(str)) {
                double dOptDouble = jSONObjectOmom.optDouble(str, 0.0d);
                if (dOptDouble > 0.0d) {
                    o0mmVar.m0o();
                    om0Var.setSortPrice(dOptDouble);
                    om0Var.setPrice(dOptDouble);
                    return;
                }
                o0mmVar.m0o();
                return;
            }
            Objects.toString(jSONObjectOmom);
            o0mmVar.m0o();
        }
    }

    private on0 o(o0mm o0mmVar, om0 om0Var, long j, com.thinkup.core.n.n.m mVar, com.thinkup.core.n.n.o oVar) {
        double dO;
        Double dValueOf;
        o(o0mmVar, om0Var);
        o0mmVar.oo(j);
        o0mmVar.o(om0Var.currency);
        double dO2 = o(om0Var.getSortPrice(), o0mmVar);
        boolean zIsSamePrice = om0Var.isSamePrice();
        double dO3 = zIsSamePrice ? dO2 : o(om0Var.getPrice(), o0mmVar);
        Double dValueOf2 = null;
        if (dO2 <= 0.0d) {
            Log.w(omn.o, "NetworkName:" + o0mmVar.nn() + ",AdSourceId:" + o0mmVar.m0o() + " c2s sort price return 0,please check network placement c2s config");
            dValueOf = Double.valueOf(dO2);
            dO = nn.o(o0mmVar);
        } else {
            dO = dO2;
            dValueOf = null;
        }
        if (dO3 <= 0) {
            Log.w(omn.o, "NetworkName:" + o0mmVar.nn() + ",AdSourceId:" + o0mmVar.m0o() + " c2s real price return 0,please check network placement c2s config");
            dValueOf2 = Double.valueOf(dO3);
            dO3 = nn.o(o0mmVar);
        }
        double d = dO3;
        Double d2 = dValueOf2;
        if (dValueOf != null || d2 != null) {
            o0om o0omVar = this.o;
            com.thinkup.core.common.oo0.oo.o(o0omVar.o0, o0omVar.oo, o0mmVar, dValueOf, d2, oVar);
        }
        on0 on0Var = new on0(om0Var.isSuccessWithUseType(), dO, d, om0Var.token, om0Var.winNoticeUrl, om0Var.loseNoticeUrl, om0Var.displayNoticeUrl, "");
        on0Var.n0 = o(o0mmVar);
        TUAdConst.CURRENCY currency = om0Var.currency;
        if (currency != null) {
            on0Var.m = currency.toString();
        }
        on0Var.setExtra(om0Var.getExtra());
        on0Var.setBiddingNotice(om0Var.biddingNotice);
        on0Var.om = System.currentTimeMillis() + o0mmVar.omm();
        on0Var.oo = o0mmVar.omm();
        on0Var.mn = o0mmVar.m0o();
        on0Var.o0 = o0mmVar.nm();
        on0Var.o0n = mVar;
        on0Var.oo0 = mVar != null;
        double dO4 = om0Var.originPrice;
        int i2 = AnonymousClass4.o[om0Var.currency.ordinal()];
        if (i2 == 1) {
            dO4 = om0Var.originPrice;
        } else if (i2 == 2) {
            dO4 = om0Var.originPrice / 100.0d;
        } else if (i2 == 3) {
            dO4 = om0Var.originPrice * com.thinkup.core.common.ooo.o0n.o();
        }
        on0Var.rmbPrice = dO4;
        o(o0mmVar.nm(), on0Var, 0.0d, zIsSamePrice);
        o((om0) on0Var, o0mmVar);
        return on0Var;
    }

    @Override // com.thinkup.core.n.o
    public final void o(o0mm o0mmVar, om0 om0Var, long j) throws Throwable {
        o(o0mmVar, om0Var, j, -1, (com.thinkup.core.n.n.m) null, (com.thinkup.core.n.n.o) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(boolean z2, TUBiddingResult tUBiddingResult, o0mm o0mmVar, int i2, com.thinkup.core.n.n.m mVar, com.thinkup.core.n.n.o oVar) {
        boolean z3;
        mm0 mm0VarOmmn;
        mm0 mm0VarOmnm;
        if (z2) {
            try {
                n nVarO = n.o();
                String strM0o = o0mmVar.m0o();
                ConcurrentHashMap<String, Integer> concurrentHashMap = nVarO.m;
                if (concurrentHashMap != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(strM0o);
                    sb.append("_c2sfirstStatus");
                    z3 = concurrentHashMap.get(sb.toString()) == null;
                }
                com.thinkup.core.common.oo0.oo.o(this.o.oo, o0mmVar, z3, SystemClock.elapsedRealtime() - this.m0, this.o);
            } catch (Throwable th) {
                throw th;
            }
        }
        n nVarO2 = n.o();
        String strM0o2 = o0mmVar.m0o();
        if (nVarO2.m == null) {
            nVarO2.m = new ConcurrentHashMap<>();
        }
        nVarO2.m.put(strM0o2 + "_c2sfirstStatus", 1);
        if (!this.f42408n.get()) {
            boolean zO = o(o0mmVar, tUBiddingResult, SystemClock.elapsedRealtime() - this.m0, i2, mVar, oVar);
            List<o0mm> listSynchronizedList = Collections.synchronizedList(new ArrayList(1));
            listSynchronizedList.add(o0mmVar);
            this.om.remove(o0mmVar);
            if (this.om.size() == 0) {
                this.f42408n.set(true);
            }
            if (this.on != null) {
                if (!zO) {
                    zO = o(o0mmVar, tUBiddingResult.errorMsg, -1);
                }
                if (zO) {
                    n0 n0Var = this.mm;
                    if (n0Var != null && (mm0VarOmmn = o0mmVar.ommn()) != null && (mm0VarOmnm = n0Var.omnm()) != null) {
                        String strN = mm0VarOmnm.n();
                        mm0VarOmmn.n(strN);
                        if (!TextUtils.isEmpty(strN)) {
                            String strM0o3 = o0mmVar.m0o();
                            com.thinkup.core.common.o00.m mVarM = com.thinkup.core.common.o00.o.m(strN, strM0o3 + "_" + o0mmVar.moo() + "_" + this.o.o0);
                            mVarM.m();
                            mm0VarOmmn.m(mVarM.o());
                            com.thinkup.core.common.o00.m mVarM2 = com.thinkup.core.common.o00.o.m(strN, strM0o3 + "_" + o0mmVar.mm() + "_" + this.o.o0);
                            mVarM2.m();
                            mm0VarOmmn.o0(mVarM2.o());
                        }
                    }
                    this.on.o(listSynchronizedList, (List<o0mm>) null);
                    return;
                }
                this.on.o((List<o0mm>) null, listSynchronizedList);
            }
            return;
        }
        on0 on0VarO = o(o0mmVar, tUBiddingResult, SystemClock.elapsedRealtime() - this.m0, mVar, oVar);
        com.thinkup.core.n.o0.n.o(on0VarO, new mnn(4, o0mmVar, this.o.o0n, on0VarO.getPrice()), true, 29);
    }

    private synchronized void o(TUBiddingResult tUBiddingResult, o0mm o0mmVar) {
        o(false, tUBiddingResult, o0mmVar, -1, (com.thinkup.core.n.n.m) null, (com.thinkup.core.n.n.o) null);
    }

    private static TUBiddingResult o(String str) {
        return TUBiddingResult.fail(str);
    }

    private static void o(om0 om0Var, o0mm o0mmVar) {
        double dOmoo = o0mmVar.omoo();
        double d = om0Var.originPrice;
        if (dOmoo > 0.0d) {
            double d2 = (1.0d - dOmoo) * om0Var.originPrice;
            om0Var.setPrice(d2);
            om0Var.setSortPrice(d2);
        }
    }

    private void o(n0 n0Var, o0mm o0mmVar) {
        mm0 mm0VarOmmn;
        mm0 mm0VarOmnm;
        if (n0Var == null || o0mmVar == null || (mm0VarOmmn = o0mmVar.ommn()) == null || (mm0VarOmnm = n0Var.omnm()) == null) {
            return;
        }
        String strN = mm0VarOmnm.n();
        mm0VarOmmn.n(strN);
        if (TextUtils.isEmpty(strN)) {
            return;
        }
        String strM0o = o0mmVar.m0o();
        com.thinkup.core.common.o00.m mVarM = com.thinkup.core.common.o00.o.m(strN, strM0o + "_" + o0mmVar.moo() + "_" + this.o.o0);
        mVarM.m();
        mm0VarOmmn.m(mVarM.o());
        com.thinkup.core.common.o00.m mVarM2 = com.thinkup.core.common.o00.o.m(strN, strM0o + "_" + o0mmVar.mm() + "_" + this.o.o0);
        mVarM2.m();
        mm0VarOmmn.o0(mVarM2.o());
    }

    public static /* synthetic */ int o(TUBiddingResult tUBiddingResult) {
        if (tUBiddingResult.isSuccessWithUseType()) {
            return 0;
        }
        return TextUtils.equals(tUBiddingResult.errorMsg, TUBidRequestInfo.BID_TYPE_ERROR_TYPE) ? -10 : -1;
    }
}
