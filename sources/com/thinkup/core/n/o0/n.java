package com.thinkup.core.n.o0;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.p004ironsource.x4;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUAdMixBidInfo;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUBiddingNotice;
import com.thinkup.core.api.TUIBiddingResultListener;
import com.thinkup.core.common.n.mo;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.n.ooo;
import com.thinkup.core.common.n0.o0o;
import com.thinkup.core.common.on.mnn;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.omm;
import com.thinkup.core.common.on.on0;
import com.thinkup.core.common.on.oo0m;
import com.thinkup.core.common.oo0.oo;
import com.thinkup.core.common.ooo.m0n;
import com.thinkup.core.common.ooo.nn;
import com.thinkup.core.mg.api.MgAdInfo;
import com.thinkup.core.mg.api.MgComparedResult;
import com.thinkup.core.oo.o0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class n {
    public static final String m = "${AUCTION_PRICE}";
    public static final String m0 = "${SECOND_PRICE}";
    public static final String m00 = "100";
    public static final String m0m = "103";
    public static final String m0n = "103";
    public static final String m0o = "102";
    public static final String mm = "${AUCTION_LOSS_BD}";
    public static final String mn = "{__TS__}";
    public static final String mo = "{__BIDDER__}";
    public static final String mo0 = "2";
    public static final String moo = "1";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f42411n = "${AUCTION_PRICE_INT}";
    public static final String n0 = "__ADN_TYPE__";
    public static final String nm = "__AD_N__";
    public static final String nn = "__AD_TI__";
    public static final String no = "__ADN_NAME__";
    static final String o = "n";
    public static final String o0 = "${AUCTION_LOSS}";
    public static final String o00 = "__AD_REQID__";
    public static final String o0m = "__IS_C__";
    public static final String o0n = "__AD_ECPM__";
    public static final String o0o = "__IS_S__";
    public static final String om = "${AUCTION_BID_TO_WIN}";
    public static final int om0 = 4;
    public static final int omm = 6;
    public static final int omn = 7;
    public static final int omo = 5;
    public static final String on = "${AUCTION_CURRENCY}";
    public static final int on0 = 8;
    public static final int onm = 10;
    public static final int onn = 11;
    public static final int ono = 9;
    public static final String oo = "${AUCTION_SEAT_ID}";
    public static final String oo0 = "${WIN_PRICE}";
    public static final int oom = 2;
    public static final int oon = 3;
    public static final int ooo = 1;

    public static class m {
        public static final int m = 2;
        public static final int m0 = 24;
        public static final int mm = 26;
        public static final int mn = 27;
        public static final int mo = 25;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f42415n = 3;
        public static final int n0 = 28;
        public static final int nm = 30;
        public static final int nn = 31;
        public static final int no = 29;
        public static final int o = 1;
        public static final int o0 = 4;
        public static final int o00 = 32;
        public static final int o0m = 34;
        public static final int o0n = 35;
        public static final int o0o = 33;
        public static final int om = 22;
        public static final int on = 23;
        public static final int oo = 21;
        public static final int oo0 = 36;

        public static boolean o(int i2) {
            return i2 == 34 || i2 == 35;
        }
    }

    public static class o {
        public static final int m = 2;
        public static final int o = 1;
    }

    private static o0mm m(on0 on0Var) {
        if (on0Var != null) {
            return on0Var.om();
        }
        return null;
    }

    public static void o(com.thinkup.core.common.on.o oVar, boolean z2, int i2) {
        try {
            o0mm unitGroupInfo = oVar.oo().getUnitGroupInfo();
            n0 n0VarMo = oVar.mo();
            on0 on0VarN0n = unitGroupInfo.n0n();
            if (on0VarN0n != null) {
                o(on0VarN0n, new mnn(z2 ? 2 : 1, unitGroupInfo, n0VarMo), true, i2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void o(com.thinkup.core.common.on.o oVar) {
        o(oVar, false, 25);
    }

    public static void o(com.thinkup.core.common.on.o oVar, int i2) {
        int i3;
        try {
            o0mm unitGroupInfo = oVar.oo().getUnitGroupInfo();
            n0 n0VarMo = oVar.mo();
            on0 on0VarN0n = unitGroupInfo.n0n();
            if (on0VarN0n != null) {
                mnn mnnVar = new mnn(i2, unitGroupInfo, n0VarMo);
                if (i2 == 2) {
                    i3 = 34;
                } else {
                    i3 = i2 == 11 ? 36 : 30;
                }
                unitGroupInfo.on0();
                o(on0VarN0n, mnnVar, true, i3);
            }
        } catch (Throwable unused) {
        }
    }

    public static void o(final n0 n0Var, final List<o0mm> list, final long j, final long j2, final int i2, final int i3) {
        com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.core.n.o0.n.1
            @Override // java.lang.Runnable
            public final void run() {
                if (n0Var == null) {
                    oo.m("BiddingUtil#sendFinishHBTracking", "placementTrackingInfo is null.", o0n.m().o0m());
                    return;
                }
                JSONArray jSONArray = new JSONArray();
                n0Var.ooo(j);
                n0Var.oon(j2);
                n0Var.oom(System.currentTimeMillis());
                n0Var.om0(SystemClock.elapsedRealtime());
                n0Var.oo0 = i2;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    o0mm o0mmVar = (o0mm) list.get(i4);
                    if (i4 == 0) {
                        n0Var.oo0(o0mmVar.m0o0());
                    }
                    if (o0mmVar.om0() != 7 && o0mmVar.oom()) {
                        try {
                            int iOmn = o0mmVar.omn();
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("sorttype", iOmn);
                            jSONObject.put("unit_id", o0mmVar.m0o());
                            jSONObject.put("bidresult", o0mmVar.nom());
                            jSONObject.put("bid_token_succ_t", o0mmVar.o());
                            jSONObject.put("bid_token_succ_ts", o0mmVar.m());
                            jSONObject.put("bid_start_t", o0mmVar.n());
                            jSONObject.put("bidprice", o0mmVar.n0m() ? String.valueOf(o0mmVar.moo()) : "0");
                            jSONObject.put("bidprice_cny", o0mmVar.n0m() ? String.valueOf(o0mmVar.mm()) : "0");
                            jSONObject.put("s_pty", o0mmVar.n0m() ? String.valueOf(o0mmVar.o0nm()) : "0");
                            jSONObject.put("nw_firm_id", String.valueOf(o0mmVar.nm()));
                            jSONObject.put("tp_bid_id", o0mmVar.n0n() != null ? o0mmVar.n0n().on : null);
                            jSONObject.put("rl_bid_status", o0mmVar.noo());
                            jSONObject.put("errormsg", o0mmVar.mon());
                            int iNnn = o0mmVar.nnn();
                            String strValueOf = String.valueOf(i3);
                            if (!strValueOf.equals("0")) {
                                if (iNnn == -1) {
                                    try {
                                        iNnn = Integer.parseInt(strValueOf);
                                    } catch (Exception unused) {
                                    }
                                }
                                jSONObject.put("ad_type", iNnn);
                            }
                            jSONObject.put("ads_list_type", o0mmVar.mn());
                            jSONObject.put("unit_type", o0mmVar.om0o());
                            on0 on0VarN0n = o0mmVar.n0n();
                            jSONObject.put("dd_ori_price", on0VarN0n != null ? String.valueOf(on0VarN0n.originPrice) : "0");
                            jSONObject.put("dd_dis_rate", o0mmVar.omoo());
                            jSONObject.put("dy_bidfloor_sw", o0mmVar.omon());
                            jSONObject.put("bid_floor", o0mmVar.o0n0());
                            jSONObject.put("en_p", on0VarN0n != null ? on0VarN0n.getExtra() : "");
                            if (on0VarN0n != null && on0VarN0n.o0n() != 0) {
                                jSONObject.put("deal_id", on0VarN0n.ooo());
                                jSONObject.put("deal_type", on0VarN0n.oo0());
                                n0Var.on0(on0VarN0n.oo0());
                                n0Var.ono(on0VarN0n.ooo());
                            }
                            jSONObject.put("bid_req_delay_t", o0mmVar.onnn());
                            jSONObject.put("p_coef", o0mmVar.onnm());
                            jSONObject.put("network_pl_id", m0n.o(o0mmVar, (TUBaseAdAdapter) null));
                            jSONObject.put("nw_ver", o0mmVar.omn);
                            jSONArray.put(jSONObject);
                        } catch (Exception unused2) {
                        }
                        try {
                            com.thinkup.core.oo.m mVarM = o0.o(o0n.m().on()).m(o0n.m().o00());
                            if (mVarM != null && mVarM.n() != null) {
                                String strValueOf2 = String.valueOf(o0mmVar.nm());
                                if (mVarM.n().contains(Integer.valueOf(o0mmVar.nm()))) {
                                    oo.o(n0Var, strValueOf2, com.thinkup.core.common.ooo.n0.o(strValueOf2), o0mmVar.m0o());
                                }
                            }
                        } catch (Throwable unused3) {
                        }
                    }
                }
                n0Var.mom(String.valueOf(i3));
                n0Var.om0(jSONArray.toString());
                com.thinkup.core.common.oo0.n.o(o0n.m().on()).o(11, n0Var);
            }
        });
    }

    public static void o(on0 on0Var, boolean z2, double d, boolean z3, boolean z4) {
        if (on0Var == null) {
            return;
        }
        double d2 = on0Var.n0;
        String str = on0Var.mm;
        int i2 = on0Var.o0;
        if (d2 > 0.0d) {
            d *= d2;
        }
        if (z2) {
            if (TextUtils.isEmpty(str)) {
                str = on0Var.displayNoticeUrl;
            }
            if (!TextUtils.isEmpty(str)) {
                o(str.replace("${AUCTION_PRICE}", com.thinkup.core.n.o0.o.o(on0Var, d)), (o0o) null);
            }
        } else {
            String str2 = on0Var.displayNoticeUrl;
            if (!TextUtils.isEmpty(str2)) {
                o(str2.replace("${AUCTION_PRICE}", com.thinkup.core.n.o0.o.o(on0Var, d)).replace("${AUCTION_LOSS}", com.thinkup.core.n.o0.o.o(z3, 2, i2, z4)), (o0o) null);
            }
        }
        synchronized (on0Var) {
            try {
                TUBiddingNotice tUBiddingNotice = on0Var.biddingNotice;
                if (tUBiddingNotice != null) {
                    tUBiddingNotice.notifyBidDisplay(z2, d);
                    if (z2) {
                        on0Var.oo();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static o0mm o(on0 on0Var) {
        if (on0Var != null) {
            return on0Var.on();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:195:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:197:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:199:0x03ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:203:0x0421  */
    /* JADX WARN: Code duplicated, block: B:205:0x0425  */
    /* JADX WARN: Code duplicated, block: B:206:0x042a  */
    /* JADX WARN: Code duplicated, block: B:209:0x042f  */
    /* JADX WARN: Code duplicated, block: B:210:0x043c  */
    /* JADX WARN: Code duplicated, block: B:212:0x0440  */
    /* JADX WARN: Code duplicated, block: B:213:0x0445  */
    /* JADX WARN: Code duplicated, block: B:221:0x0455  */
    /* JADX WARN: Code duplicated, block: B:225:0x0461  */
    /* JADX WARN: Code duplicated, block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0174  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 6 */
    public static void o(final on0 on0Var, final mnn mnnVar, boolean z2, int i2) throws Throwable {
        boolean z3;
        boolean zOom;
        boolean z4;
        boolean z5;
        int i3;
        double sortPrice;
        double dO;
        int i4;
        int i5;
        boolean z6;
        o0mm o0mmVar;
        final double d;
        int i6;
        on0 on0Var2;
        int i7;
        double d2;
        boolean z7;
        int i8;
        Map<String, Object> map;
        boolean z8;
        final double d3;
        String strO;
        final String str;
        mnn mnnVar2;
        ooo oooVarO0;
        double dNextDouble;
        Map<String, Object> mapOmn0;
        if (on0Var == null) {
            return;
        }
        if (z2) {
            com.thinkup.core.n.n.o().o(mnnVar.mm(), on0Var);
            if (mnnVar.om()) {
                com.thinkup.core.common.o.o.o().o(o0n.m().on(), on0Var.token);
            }
        }
        if ((mnnVar.m0() == 8 || !on0Var.o0()) && on0Var.useType != 2) {
            mnnVar.m(i2);
            double sortPrice2 = on0Var.getSortPrice();
            double rmbPrice = on0Var.getRmbPrice();
            int i9 = on0Var.o0;
            o0mm o0mmVarOm = on0Var.om();
            boolean z9 = false;
            if (o0mmVarOm != null) {
                boolean z10 = m0n.m(o0mmVarOm) && o0mmVarOm.n0n() != null && o0mmVarOm.n0n().o0m();
                double dO2 = nn.o(o0mmVarOm);
                double dM = nn.m(o0mmVarOm);
                int iNm = o0mmVarOm.nm();
                zOom = o0mmVarOm.oom();
                try {
                    if (mnnVar.m0() != 8 && (mapOmn0 = o0mmVarOm.omn0()) != null) {
                        TUAdMixBidInfo.BidEntity bidEntity = new TUAdMixBidInfo.BidEntity();
                        Object obj = mapOmn0.get("native_material_tittle");
                        Object obj2 = mapOmn0.get("native_material_publisher_name");
                        Object obj3 = mapOmn0.get("native_material_package_name");
                        if (obj != null) {
                            bidEntity.setAdTittle((String) obj);
                        }
                        if (obj2 != null) {
                            bidEntity.setAdUserName((String) obj2);
                        }
                        if (obj3 != null) {
                            bidEntity.setAdPackageName((String) obj3);
                        }
                        mnnVar.o(bidEntity);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                z3 = z10;
                sortPrice2 = dO2;
                i9 = iNm;
                rmbPrice = dM;
            } else {
                z3 = false;
                zOom = true;
            }
            if (mnnVar.on() > 0.0d && mnnVar.on() > sortPrice2) {
                sortPrice2 = mnnVar.on();
                i9 = on0Var.o0;
                zOom = true;
            }
            o0mm o0mmVarOmn = mnnVar.omn();
            double dM0n = mnnVar.m0n();
            double d4 = 0.01d;
            if (sortPrice2 < dM0n) {
                if (o0mmVarOmn != null) {
                    z4 = true;
                    if (o0mmVarOmn.mo() == 1) {
                        if (dM0n > 0.0d) {
                            sortPrice2 = dM0n;
                        }
                    }
                } else {
                    z4 = true;
                }
                sortPrice2 = on0Var.getSortPrice() + 0.01d;
            } else {
                z4 = true;
            }
            double dN = mnnVar.n();
            String strOo = mnnVar.oo();
            if (dN > 0.0d) {
                i3 = -1;
                z5 = (TextUtils.equals("102", strOo) || TextUtils.equals("100", strOo)) ? z4 : false;
            } else {
                dN = sortPrice2;
                z5 = zOom;
                i3 = i9;
            }
            int iM0 = mnnVar.m0();
            if (on0Var.o0 == 28) {
                sortPrice = on0Var.originPrice;
            } else {
                sortPrice = on0Var.getSortPrice();
            }
            double d5 = sortPrice;
            int i10 = on0Var.o0;
            double rmbPrice2 = on0Var.getRmbPrice();
            if (dN <= d5) {
                mnnVar.o(Double.valueOf(dN));
                if (z3) {
                    o0mm o0mmVarO = o(on0Var);
                    if (o0mmVarO != null) {
                        dNextDouble = nn.o(o0mmVarO);
                        if (d5 >= dNextDouble) {
                            dNextDouble = d5;
                        }
                    } else {
                        dNextDouble = d5;
                    }
                    int iOnm = mnnVar.onm();
                    if (iOnm != 2) {
                        if (iOnm == 3) {
                            strOo = strOo;
                        } else if (iOnm == 4) {
                            strOo = strOo;
                            dN = 0.0d;
                        } else if (iOnm != 5) {
                            d4 = dNextDouble + 0.01d;
                            dNextDouble = ((dNextDouble * 1.3d) - d4) * new Random(System.currentTimeMillis()).nextDouble();
                        } else {
                            strOo = strOo;
                            dN = -1.0d;
                        }
                    }
                    dN = dNextDouble + d4;
                } else {
                    strOo = strOo;
                    dN = d5 + 0.01d;
                }
            } else {
                strOo = strOo;
            }
            final String strO2 = com.thinkup.core.n.o0.o.o(z5, iM0, i10, z3);
            if (strOo != null) {
                strO2 = strOo;
            }
            if (m.o(i2)) {
                dO = o(mnnVar.m00());
                if (dO <= 0.0d || dO <= dN) {
                    dO = dN;
                }
            } else {
                dO = dN;
            }
            mnnVar.o(dO);
            mnnVar.o(strO2);
            mnnVar.n(i3);
            mnnVar.m(rmbPrice);
            mnnVar.n(rmbPrice2);
            n0 n0VarOmm = mnnVar.omm();
            n0VarOmm.o(omm.o(mnnVar));
            com.thinkup.core.common.oo0.n.o(o0n.m().on()).o(24, n0VarOmm);
            mnnVar.o(on0Var.biddingNotice == null);
            if (mnnVar.ooo() || !strO2.equals(x4.DISABLED_AUCTION_FALLBACK_ID)) {
                i4 = i10;
                i5 = i3;
                z6 = z5;
                o0mmVar = o0mmVarOm;
                d = dO;
                i6 = 1;
            } else {
                String str2 = strO2;
                double d6 = dO;
                boolean z11 = z3;
                z6 = z5;
                i5 = i3;
                i4 = i10;
                o0mmVar = o0mmVarOm;
                i6 = 1;
                oo.o(mnnVar, d6, str2, 0.0d, d6, on0Var.getSortPrice(), on0Var.mm(), "200", "", z11);
                d = d6;
                strO2 = str2;
                z3 = z11;
            }
            double dO3 = o(on0Var, d);
            com.thinkup.core.common.ooo.o0.o().o(mnnVar.omm(), mnnVar.omn(), com.thinkup.core.common.ooo.o0.o0, "2");
            if (mnnVar.om()) {
                com.thinkup.core.common.o.o.o().o(on0Var);
            }
            if (mnnVar.ooo()) {
                if (strO2.equals(x4.DISABLED_AUCTION_FALLBACK_ID)) {
                    on0Var2 = on0Var;
                    i7 = i4;
                } else {
                    o0mm o0mmVar2 = o0mmVar;
                    boolean z12 = z6;
                    int i11 = i5;
                    int i12 = i4;
                    Map<String, Object> mapO = com.thinkup.core.n.o0.o.o(z12, i11, i12, o0mmVar2, on0Var);
                    if (mnnVar.m0() == 8) {
                        mapO.put(TUBiddingNotice.ADN_REQUEST_IS_SHOW, Integer.valueOf(i6));
                        int i13 = i6;
                        if (mnnVar.m() == i13) {
                            mapO.put(TUBiddingNotice.ADN_REQUEST_IS_CLICK, Integer.valueOf(i13));
                        } else {
                            mapO.put(TUBiddingNotice.ADN_REQUEST_IS_CLICK, 0);
                        }
                        if (mnnVar.o() != null) {
                            Map<String, Object> mapOmn1 = o0mmVar2 != null ? o0mmVar2.omn0() : null;
                            if (mapOmn1 == null) {
                                mapOmn1 = new HashMap<>();
                            }
                            TUAdMixBidInfo.BidEntity bidEntityO = mnnVar.o();
                            mapOmn1.put("native_material_tittle", bidEntityO.getAdTittle());
                            mapOmn1.put("native_material_publisher_name", bidEntityO.getAdUserName());
                            mapO.put(TUBiddingNotice.ADN_EXTRA_NATIVE_MATERIAL_INFO, mapOmn1);
                        }
                    }
                    synchronized (on0Var) {
                        try {
                            TUBiddingNotice tUBiddingNotice = on0Var.biddingNotice;
                            if (tUBiddingNotice != null) {
                                try {
                                    String strO3 = com.thinkup.core.n.o0.o.o(z12, iM0);
                                    final double d7 = d;
                                    z7 = z12;
                                    z8 = true;
                                    final boolean z13 = z3;
                                    try {
                                        TUIBiddingResultListener tUIBiddingResultListener = new TUIBiddingResultListener() { // from class: com.thinkup.core.n.o0.n.2
                                            final /* synthetic */ double o0 = 0.0d;

                                            @Override // com.thinkup.core.api.TUIBiddingResultListener
                                            public final void reportFailed(int i14, String str3, Map<String, Object> map2) {
                                                if (isNeedWait()) {
                                                    oo.o(mnnVar, d, strO2, this.o0, d7, on0Var.getSortPrice(), on0Var.mm(), String.valueOf(i14), str3, z13);
                                                }
                                            }

                                            @Override // com.thinkup.core.api.TUIBiddingResultListener
                                            public final void reportSuccess(Map<String, Object> map2) {
                                                if (isNeedWait()) {
                                                    oo.o(mnnVar, d, strO2, this.o0, d7, on0Var.getSortPrice(), on0Var.mm(), "200", "", z13);
                                                }
                                            }
                                        };
                                        try {
                                            mapO.put(TUBiddingNotice.ADN_BID_LISTENER_OBJECT, tUIBiddingResultListener);
                                            try {
                                                tUBiddingNotice.notifyBidLoss(strO3, dO3, mapO);
                                            } catch (Throwable unused) {
                                            }
                                            if (tUIBiddingResultListener.isNeedWait()) {
                                                d2 = dO3;
                                                i8 = i11;
                                                i12 = i12;
                                                z3 = z13;
                                                map = mapO;
                                            } else {
                                                try {
                                                    i8 = i11;
                                                    try {
                                                        d2 = dO3;
                                                        z3 = z13;
                                                        i12 = i12;
                                                        map = mapO;
                                                        try {
                                                            oo.o(mnnVar, d, strO2, 0.0d, d, on0Var.getSortPrice(), on0Var.mm(), "200", "", z3);
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            try {
                                                                th.printStackTrace();
                                                                Log.e(mo.oo0, "notifyBidLoss: error: " + th.getMessage());
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        d2 = dO3;
                                                        z3 = z13;
                                                        map = mapO;
                                                        th.printStackTrace();
                                                        Log.e(mo.oo0, "notifyBidLoss: error: " + th.getMessage());
                                                        z9 = z8;
                                                        String str3 = strO2;
                                                        d3 = d2;
                                                        strO = com.thinkup.core.n.o0.o.o(on0Var, mnnVar, i8, z7, d3, d5, str3, map);
                                                        str = str3;
                                                        if (!TextUtils.isEmpty(strO)) {
                                                            final double d8 = d;
                                                            final boolean z14 = z3;
                                                            final boolean z15 = z9;
                                                            final double d9 = d;
                                                            com.thinkup.core.common.n0.m mVar = new com.thinkup.core.common.n0.m() { // from class: com.thinkup.core.n.o0.n.3
                                                                final /* synthetic */ double om = 0.0d;

                                                                @Override // com.thinkup.core.common.n0.o0o
                                                                public final void onLoadError(int i14, String str4, AdError adError) {
                                                                    String platformCode;
                                                                    String platformMSG;
                                                                    if (on0Var.biddingNotice != null || z15) {
                                                                        return;
                                                                    }
                                                                    if (adError != null) {
                                                                        platformCode = adError.getPlatformCode();
                                                                        platformMSG = !TextUtils.isEmpty(adError.getPlatformMSG()) ? adError.getPlatformMSG() : adError.toString();
                                                                    } else {
                                                                        platformCode = "-10000";
                                                                        platformMSG = "";
                                                                    }
                                                                    oo.o(mnnVar, d9, str, this.om, d8, on0Var.getSortPrice(), on0Var.mm(), platformCode, platformMSG, z14, d3);
                                                                }

                                                                @Override // com.thinkup.core.common.n0.o0o
                                                                public final void onLoadFinish(int i14, Object obj4) {
                                                                    on0 on0Var3 = on0Var;
                                                                    if (on0Var3.biddingNotice != null || z15) {
                                                                        return;
                                                                    }
                                                                    oo.o(mnnVar, d9, str, this.om, d8, on0Var3.getSortPrice(), on0Var.mm(), "200", "", z14, d3);
                                                                }
                                                            };
                                                            str = str;
                                                            d3 = d3;
                                                            o(strO, mVar);
                                                        } else {
                                                            double d10 = d;
                                                            if (on0Var.biddingNotice != null) {
                                                            }
                                                            i7 = i12;
                                                            if (i7 == 66) {
                                                                if (o0mmVarOmn != null) {
                                                                    oooVarO0 = o0mmVarOmn.o0();
                                                                } else {
                                                                    oooVarO0 = null;
                                                                }
                                                                if (oooVarO0 instanceof TUBaseAdAdapter) {
                                                                    on0Var2 = on0Var;
                                                                    ((TUBaseAdAdapter) oooVarO0).notifyWLInfo(2, com.thinkup.core.n.o0.o.o(on0Var2, mnnVar2, d3, str));
                                                                } else {
                                                                    on0Var2 = on0Var;
                                                                }
                                                                if (o0mmVarOmn != null) {
                                                                    o0mmVarOmn.o((ooo) null);
                                                                }
                                                            } else {
                                                                on0Var2 = on0Var;
                                                            }
                                                            if (on0Var2.o0 == 25) {
                                                                on0Var2.om0();
                                                            }
                                                            if (i7 != 28) {
                                                                on0Var2.oo();
                                                                on0Var2.m0();
                                                            }
                                                        }
                                                        mnnVar2 = mnnVar;
                                                        i7 = i12;
                                                        if (i7 == 66) {
                                                            if (o0mmVarOmn != null) {
                                                                oooVarO0 = o0mmVarOmn.o0();
                                                            } else {
                                                                oooVarO0 = null;
                                                            }
                                                            if (oooVarO0 instanceof TUBaseAdAdapter) {
                                                                on0Var2 = on0Var;
                                                                ((TUBaseAdAdapter) oooVarO0).notifyWLInfo(2, com.thinkup.core.n.o0.o.o(on0Var2, mnnVar2, d3, str));
                                                            } else {
                                                                on0Var2 = on0Var;
                                                            }
                                                            if (o0mmVarOmn != null) {
                                                                o0mmVarOmn.o((ooo) null);
                                                            }
                                                        } else {
                                                            on0Var2 = on0Var;
                                                        }
                                                        if (on0Var2.o0 == 25) {
                                                            on0Var2.om0();
                                                        }
                                                        if (i7 != 28) {
                                                            on0Var2.oo();
                                                            on0Var2.m0();
                                                        }
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    d2 = dO3;
                                                    i8 = i11;
                                                    z3 = z13;
                                                    map = mapO;
                                                    th.printStackTrace();
                                                    Log.e(mo.oo0, "notifyBidLoss: error: " + th.getMessage());
                                                    z9 = z8;
                                                    String str4 = strO2;
                                                    d3 = d2;
                                                    strO = com.thinkup.core.n.o0.o.o(on0Var, mnnVar, i8, z7, d3, d5, str4, map);
                                                    str = str4;
                                                    if (!TextUtils.isEmpty(strO)) {
                                                        final double d11 = d;
                                                        final boolean z16 = z3;
                                                        final boolean z17 = z9;
                                                        final double d12 = d;
                                                        com.thinkup.core.common.n0.m mVar2 = new com.thinkup.core.common.n0.m() { // from class: com.thinkup.core.n.o0.n.3
                                                            final /* synthetic */ double om = 0.0d;

                                                            @Override // com.thinkup.core.common.n0.o0o
                                                            public final void onLoadError(int i14, String str5, AdError adError) {
                                                                String platformCode;
                                                                String platformMSG;
                                                                if (on0Var.biddingNotice != null || z17) {
                                                                    return;
                                                                }
                                                                if (adError != null) {
                                                                    platformCode = adError.getPlatformCode();
                                                                    platformMSG = !TextUtils.isEmpty(adError.getPlatformMSG()) ? adError.getPlatformMSG() : adError.toString();
                                                                } else {
                                                                    platformCode = "-10000";
                                                                    platformMSG = "";
                                                                }
                                                                oo.o(mnnVar, d12, str, this.om, d11, on0Var.getSortPrice(), on0Var.mm(), platformCode, platformMSG, z16, d3);
                                                            }

                                                            @Override // com.thinkup.core.common.n0.o0o
                                                            public final void onLoadFinish(int i14, Object obj4) {
                                                                on0 on0Var3 = on0Var;
                                                                if (on0Var3.biddingNotice != null || z17) {
                                                                    return;
                                                                }
                                                                oo.o(mnnVar, d12, str, this.om, d11, on0Var3.getSortPrice(), on0Var.mm(), "200", "", z16, d3);
                                                            }
                                                        };
                                                        str = str;
                                                        d3 = d3;
                                                        o(strO, mVar2);
                                                    } else {
                                                        double d13 = d;
                                                        if (on0Var.biddingNotice != null) {
                                                        }
                                                        i7 = i12;
                                                        if (i7 == 66) {
                                                            if (o0mmVarOmn != null) {
                                                                oooVarO0 = o0mmVarOmn.o0();
                                                            } else {
                                                                oooVarO0 = null;
                                                            }
                                                            if (oooVarO0 instanceof TUBaseAdAdapter) {
                                                                on0Var2 = on0Var;
                                                                ((TUBaseAdAdapter) oooVarO0).notifyWLInfo(2, com.thinkup.core.n.o0.o.o(on0Var2, mnnVar2, d3, str));
                                                            } else {
                                                                on0Var2 = on0Var;
                                                            }
                                                            if (o0mmVarOmn != null) {
                                                                o0mmVarOmn.o((ooo) null);
                                                            }
                                                        } else {
                                                            on0Var2 = on0Var;
                                                        }
                                                        if (on0Var2.o0 == 25) {
                                                            on0Var2.om0();
                                                        }
                                                        if (i7 != 28) {
                                                            on0Var2.oo();
                                                            on0Var2.m0();
                                                        }
                                                    }
                                                    mnnVar2 = mnnVar;
                                                    i7 = i12;
                                                    if (i7 == 66) {
                                                        if (o0mmVarOmn != null) {
                                                            oooVarO0 = o0mmVarOmn.o0();
                                                        } else {
                                                            oooVarO0 = null;
                                                        }
                                                        if (oooVarO0 instanceof TUBaseAdAdapter) {
                                                            on0Var2 = on0Var;
                                                            ((TUBaseAdAdapter) oooVarO0).notifyWLInfo(2, com.thinkup.core.n.o0.o.o(on0Var2, mnnVar2, d3, str));
                                                        } else {
                                                            on0Var2 = on0Var;
                                                        }
                                                        if (o0mmVarOmn != null) {
                                                            o0mmVarOmn.o((ooo) null);
                                                        }
                                                    } else {
                                                        on0Var2 = on0Var;
                                                    }
                                                    if (on0Var2.o0 == 25) {
                                                        on0Var2.om0();
                                                    }
                                                    if (i7 != 28) {
                                                        on0Var2.oo();
                                                        on0Var2.m0();
                                                    }
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            d2 = dO3;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        z3 = z13;
                                        d2 = dO3;
                                        i8 = i11;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    d2 = dO3;
                                    z7 = z12;
                                    i8 = i11;
                                    i12 = i12;
                                    map = mapO;
                                    z8 = true;
                                }
                                z9 = z8;
                            } else {
                                d2 = dO3;
                                z7 = z12;
                                i8 = i11;
                                i12 = i12;
                                map = mapO;
                                d = d;
                            }
                            String str5 = strO2;
                            d3 = d2;
                            strO = com.thinkup.core.n.o0.o.o(on0Var, mnnVar, i8, z7, d3, d5, str5, map);
                            str = str5;
                            if (!TextUtils.isEmpty(strO)) {
                                final double d14 = d;
                                final boolean z18 = z3;
                                final boolean z19 = z9;
                                final double d15 = d;
                                com.thinkup.core.common.n0.m mVar3 = new com.thinkup.core.common.n0.m() { // from class: com.thinkup.core.n.o0.n.3
                                    final /* synthetic */ double om = 0.0d;

                                    @Override // com.thinkup.core.common.n0.o0o
                                    public final void onLoadError(int i14, String str6, AdError adError) {
                                        String platformCode;
                                        String platformMSG;
                                        if (on0Var.biddingNotice != null || z19) {
                                            return;
                                        }
                                        if (adError != null) {
                                            platformCode = adError.getPlatformCode();
                                            platformMSG = !TextUtils.isEmpty(adError.getPlatformMSG()) ? adError.getPlatformMSG() : adError.toString();
                                        } else {
                                            platformCode = "-10000";
                                            platformMSG = "";
                                        }
                                        oo.o(mnnVar, d15, str, this.om, d14, on0Var.getSortPrice(), on0Var.mm(), platformCode, platformMSG, z18, d3);
                                    }

                                    @Override // com.thinkup.core.common.n0.o0o
                                    public final void onLoadFinish(int i14, Object obj4) {
                                        on0 on0Var3 = on0Var;
                                        if (on0Var3.biddingNotice != null || z19) {
                                            return;
                                        }
                                        oo.o(mnnVar, d15, str, this.om, d14, on0Var3.getSortPrice(), on0Var.mm(), "200", "", z18, d3);
                                    }
                                };
                                str = str;
                                d3 = d3;
                                o(strO, mVar3);
                            } else {
                                double d16 = d;
                                if (on0Var.biddingNotice != null && !z9) {
                                    mnnVar2 = mnnVar;
                                    oo.o(mnnVar2, d16, str, 0.0d, d16, on0Var.getSortPrice(), on0Var.mm(), "200", "", z3, d3);
                                    d3 = d3;
                                }
                                i7 = i12;
                                if (i7 == 66) {
                                    if (o0mmVarOmn != null) {
                                        oooVarO0 = o0mmVarOmn.o0();
                                    } else {
                                        oooVarO0 = null;
                                    }
                                    if (oooVarO0 instanceof TUBaseAdAdapter) {
                                        on0Var2 = on0Var;
                                        ((TUBaseAdAdapter) oooVarO0).notifyWLInfo(2, com.thinkup.core.n.o0.o.o(on0Var2, mnnVar2, d3, str));
                                    } else {
                                        on0Var2 = on0Var;
                                    }
                                    if (o0mmVarOmn != null) {
                                        o0mmVarOmn.o((ooo) null);
                                    }
                                } else {
                                    on0Var2 = on0Var;
                                }
                            }
                            mnnVar2 = mnnVar;
                            i7 = i12;
                            if (i7 == 66) {
                                if (o0mmVarOmn != null) {
                                    oooVarO0 = o0mmVarOmn.o0();
                                } else {
                                    oooVarO0 = null;
                                }
                                if (oooVarO0 instanceof TUBaseAdAdapter) {
                                    on0Var2 = on0Var;
                                    ((TUBaseAdAdapter) oooVarO0).notifyWLInfo(2, com.thinkup.core.n.o0.o.o(on0Var2, mnnVar2, d3, str));
                                } else {
                                    on0Var2 = on0Var;
                                }
                                if (o0mmVarOmn != null) {
                                    o0mmVarOmn.o((ooo) null);
                                }
                            } else {
                                on0Var2 = on0Var;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                        }
                    }
                }
                if (on0Var2.o0 == 25) {
                    on0Var2.om0();
                }
            } else {
                on0Var2 = on0Var;
                i7 = i4;
            }
            if (i7 != 28) {
                on0Var2.oo();
                on0Var2.m0();
            }
        }
    }

    private static void o(String str, o0o o0oVar) {
        com.thinkup.core.common.n0.mo.m(str).o(0, o0oVar);
    }

    private static void o(String str, oo0m oo0mVar) {
        if (oo0mVar == null) {
            return;
        }
        com.thinkup.core.common.n0.mo.o(str, oo0mVar).o(0, (o0o) null);
    }

    public static void o(oo0m oo0mVar) {
        n0 n0VarOmo = oo0mVar.omo();
        n0VarOmo.o(omm.o(oo0mVar));
        com.thinkup.core.common.oo0.n.o(o0n.m().on()).o(24, n0VarOmo);
        oo.o(oo0mVar);
    }

    public static void o(TUBaseAdAdapter tUBaseAdAdapter, o0mm o0mmVar, n0 n0Var, BaseAd... baseAdArr) {
        on0 on0VarN0n;
        Map<String, Object> internalNetworkInfoMap;
        BaseAd baseAd;
        if (tUBaseAdAdapter == null || o0mmVar == null || (on0VarN0n = o0mmVar.n0n()) == null) {
            return;
        }
        if (baseAdArr != null && baseAdArr.length > 0 && (baseAd = baseAdArr[0]) != null) {
            internalNetworkInfoMap = baseAd.getNetworkInfoMap();
        } else {
            internalNetworkInfoMap = tUBaseAdAdapter.getInternalNetworkInfoMap();
        }
        oo0m oo0mVar = new oo0m();
        n0 n0VarNmm = n0Var.nmm();
        oo0mVar.o(n0VarNmm);
        oo0mVar.o(internalNetworkInfoMap);
        oo0mVar.o(o0mmVar);
        if (oo0mVar.o0() != 0) {
            o0mmVar.mo0(oo0mVar.o0());
        }
        on0VarN0n.oom = oo0mVar;
        if (n0Var.n0n() == 66 && n0VarNmm.nno()) {
            on0VarN0n.o(new com.thinkup.core.basead.o.oo(on0VarN0n, o0mmVar, n0VarNmm));
        }
    }

    private static double o(on0 on0Var, double d) {
        double d2 = on0Var.n0;
        return d2 > 0.0d ? d * d2 : d;
    }

    private static double o(int i2, double d, double d2) {
        if (i2 == 2) {
            return d2 + 0.01d;
        }
        if (i2 == 3) {
            return d;
        }
        if (i2 == 4) {
            return 0.0d;
        }
        if (i2 == 5) {
            return -1.0d;
        }
        double d3 = 0.01d + d2;
        return (((d2 * 1.3d) - d3) * new Random(System.currentTimeMillis()).nextDouble()) + d3;
    }

    private static double o(MgComparedResult mgComparedResult) {
        MgAdInfo mgAdInfo = mgComparedResult != null ? mgComparedResult.getMgAdInfo() : null;
        if (mgAdInfo != null) {
            return mgAdInfo.getUSDEcpm();
        }
        return 0.0d;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00a6  */
    public static void o(on0 on0Var, o0mm o0mmVar, int i2) {
        oo0m oo0mVar;
        if (on0Var == null || o0mmVar == null || (oo0mVar = on0Var.oom) == null || on0Var.o0()) {
            return;
        }
        oo0mVar.o(i2);
        double dO = nn.o(o0mmVar);
        double dM = nn.m(o0mmVar);
        double d = on0Var.o0m;
        Double dO2 = oo0mVar.o();
        double dDoubleValue = dO2 != null ? dO2.doubleValue() : d;
        if (on0Var.o0m() || (dDoubleValue <= dO && dDoubleValue > 0.0d)) {
            d = dDoubleValue;
        } else if (d != 0.0d) {
            oo0mVar.o(Double.valueOf(dDoubleValue));
            d = dO - 0.01d;
            if (d < 0.0d) {
                d = 0.0d;
            }
        }
        if (o0mmVar.nm() == 8) {
            double dO0n0 = o0mmVar.o0n0();
            if (dO0n0 > 0.0d && dO0n0 > d) {
                d = dO0n0;
            }
        }
        if (m.o(i2)) {
            double dO3 = o(oo0mVar.ono());
            if (dO3 > 0.0d) {
                if (dO3 > d) {
                    d = dO3;
                } else {
                    String strM0o = o0mmVar.m0o();
                    o0mm o0mmVarMn = on0Var.mn();
                    String strM0o2 = o0mmVarMn != null ? o0mmVarMn.m0o() : "";
                    if (!TextUtils.isEmpty(strM0o) && strM0o.equals(strM0o2)) {
                        d = dO3;
                    }
                }
            }
        }
        oo0mVar.o(dO);
        oo0mVar.m(d);
        oo0mVar.n(dM);
        oo0mVar.o0n();
        oo0mVar.o0(d);
        oo0mVar.m(Double.valueOf(on0Var.mm()));
        double dO4 = o(on0Var, dO);
        double dO5 = o(on0Var, d);
        boolean zOom = oo0mVar.oom();
        com.thinkup.core.common.ooo.o0.o().o(oo0mVar.omo(), o0mmVar, com.thinkup.core.common.ooo.o0.o0, "1");
        if (o0mmVar.o0on()) {
            com.thinkup.core.common.o.o.o().o(on0Var);
        }
        oo0mVar.o(on0Var.biddingNotice == null);
        if (zOom) {
            String strO = com.thinkup.core.n.o0.o.o(on0Var, oo0mVar, dO4, dO5);
            if (!TextUtils.isEmpty(strO)) {
                com.thinkup.core.common.n0.mo.o(strO, oo0mVar).o(0, (o0o) null);
            } else {
                o(oo0mVar);
            }
            TUBiddingNotice tUBiddingNotice = on0Var.biddingNotice;
            if (tUBiddingNotice != null) {
                try {
                    tUBiddingNotice.notifyBidWin(dO4, dO5, com.thinkup.core.n.o0.o.o(o0mmVar.nm(), on0Var.mn()));
                } catch (Throwable th) {
                    th.printStackTrace();
                    Log.e(mo.oo0, "notifyBidWin: error: " + th.getMessage());
                }
            }
            if (o0mmVar.nm() == 66) {
                ooo oooVarO0 = o0mmVar.o0();
                if (oooVarO0 instanceof TUBaseAdAdapter) {
                    ((TUBaseAdAdapter) oooVarO0).notifyWLInfo(1, com.thinkup.core.n.o0.o.o(on0Var, oo0mVar, dO5));
                    o0mmVar.o((ooo) null);
                }
            }
        } else {
            o(oo0mVar);
        }
        on0Var.m0();
    }
}
