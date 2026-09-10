package com.thinkup.core.n;

import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUBidRequestInfo;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.basead.adx.api.TUAdxBidFloorInfo;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.mmm;
import com.thinkup.core.common.on.nm;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0om;
import com.thinkup.core.common.ooo.m0m;
import com.thinkup.core.common.ooo.nn;
import com.thinkup.core.common.ooo.oo0;
import com.thinkup.core.oo.n0;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class om {
    public static String o = "om";
    o0om m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Map<String, Object> f42416n;
    o o0;

    /* JADX INFO: renamed from: com.thinkup.core.n.om$2, reason: invalid class name */
    public class AnonymousClass2 implements TUBidRequestInfoListener {
        final /* synthetic */ o0mm o;

        public AnonymousClass2(o0mm o0mmVar) {
            this.o = o0mmVar;
        }

        @Override // com.thinkup.core.api.TUBidRequestInfoListener
        public final void onFailed(String str) {
            o oVar = om.this.o0;
            if (oVar != null) {
                oVar.onBidTokenObtainFail(str, this.o);
            }
        }

        @Override // com.thinkup.core.api.TUBidRequestInfoListener
        public final void onSuccess(TUBidRequestInfo tUBidRequestInfo) {
            om.o(om.this, this.o, tUBidRequestInfo);
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.n.om$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        final /* synthetic */ o0mm m;
        final /* synthetic */ TUBidRequestInfo o;

        public AnonymousClass3(TUBidRequestInfo tUBidRequestInfo, o0mm o0mmVar) {
            this.o = tUBidRequestInfo;
            this.m = o0mmVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            JSONObject requestJSONObject;
            TUAdxBidFloorInfo tUAdxBidFloorInfo;
            try {
                TUBidRequestInfo tUBidRequestInfo = this.o;
                if (tUBidRequestInfo != null && (requestJSONObject = tUBidRequestInfo.toRequestJSONObject()) != null) {
                    String strValueOf = String.valueOf(om.this.m.om);
                    om.this.m.nm.o();
                    com.thinkup.core.n.o0.m.o(requestJSONObject, strValueOf, this.m, om.this.m);
                    if (this.m.om0() == 3) {
                        try {
                            requestJSONObject.put("ecpoffer", o0n.m().n0());
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        if (om.this.m.omm == 1) {
                            requestJSONObject.put("get_offer", 2);
                        }
                        if (om.this.m.o0n.nno() && (tUAdxBidFloorInfo = om.this.m.omn) != null) {
                            double bidFloor = tUAdxBidFloorInfo.getBidFloor();
                            if (bidFloor > 0.0d) {
                                TUAdConst.CURRENCY currency = tUAdxBidFloorInfo.getCurrency();
                                if (currency == null) {
                                    currency = TUAdConst.CURRENCY.USD;
                                }
                                double dMom = om.this.m.nm.o().mom();
                                if (currency == TUAdConst.CURRENCY.RMB) {
                                    bidFloor *= dMom;
                                } else if (currency == TUAdConst.CURRENCY.RMB_CENT) {
                                    bidFloor /= 100.0d;
                                    bidFloor *= dMom;
                                }
                                Map<String, Object> extraMap = tUAdxBidFloorInfo.getExtraMap();
                                boolean z2 = false;
                                if (extraMap != null) {
                                    Object obj = extraMap.get("extra_type");
                                    if (obj instanceof Integer) {
                                        z2 = ((Integer) obj).intValue() == 1;
                                    }
                                    if (z2) {
                                        try {
                                            requestJSONObject.put("g_bidfloor", bidFloor);
                                            Object obj2 = extraMap.get("extra_m_info");
                                            Object obj3 = extraMap.get("extra_tp_m_info");
                                            Object obj4 = extraMap.get("extra_l_s_p");
                                            if (obj2 instanceof JSONObject) {
                                                JSONObject jSONObject = (JSONObject) obj2;
                                                Iterator<String> itKeys = jSONObject.keys();
                                                while (itKeys.hasNext()) {
                                                    String next = itKeys.next();
                                                    requestJSONObject.put(next, jSONObject.opt(next));
                                                }
                                            }
                                            if (obj3 instanceof JSONArray) {
                                                requestJSONObject.put("wf_g", (JSONArray) obj3);
                                            }
                                            if (obj4 instanceof Double) {
                                                requestJSONObject.put("last_stop_price", ((Double) obj4).doubleValue());
                                            }
                                        } catch (Throwable th2) {
                                            th2.printStackTrace();
                                        }
                                    }
                                }
                                if (!z2) {
                                    requestJSONObject.put("c_bidfloor", bidFloor);
                                }
                            }
                        }
                        try {
                            Object objRemove = requestJSONObject.remove("bit_token_al_it");
                            if (objRemove != null && (objRemove instanceof JSONArray[])) {
                                com.thinkup.core.common.m.m.o().o((JSONArray[]) objRemove);
                            }
                            Object objRemove2 = requestJSONObject.remove("bit_token_mk_it");
                            if (objRemove2 != null && (objRemove2 instanceof Map)) {
                                com.thinkup.core.common.m.m.o().o((Map<String, String>) objRemove2);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    om.o(requestJSONObject, this.m);
                    o oVar = om.this.o0;
                    if (oVar != null) {
                        oVar.onBidTokenObtainSuccess(this.m, requestJSONObject);
                        return;
                    }
                    return;
                }
                o oVar2 = om.this.o0;
                if (oVar2 != null) {
                    oVar2.onBidTokenObtainFail(TUBidRequestInfo.RETURN_PARAMS_ERROR_TYPE, this.m);
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
                o oVar3 = om.this.o0;
                if (oVar3 != null) {
                    oVar3.onBidTokenObtainFail(th3.getMessage(), this.m);
                }
            }
        }
    }

    public interface o {
        void onBidTokenObtainFail(String str, o0mm o0mmVar);

        void onBidTokenObtainStart(o0mm o0mmVar, TUBaseAdAdapter tUBaseAdAdapter);

        void onBidTokenObtainSuccess(o0mm o0mmVar, JSONObject jSONObject);
    }

    public om(o0om o0omVar) {
        this.m = o0omVar;
        this.f42416n = o0omVar.o0o;
    }

    private static void m(JSONObject jSONObject, o0mm o0mmVar) {
        if (o0mmVar == null || jSONObject == null || o0mmVar.nm() != 2) {
            return;
        }
        try {
            jSONObject.put("admob_bid_type", o0mmVar.om0o());
            jSONObject.put("network_id", o0mmVar.om00());
        } catch (Throwable unused) {
        }
    }

    public final void o(final o0mm o0mmVar, o oVar) {
        this.o0 = oVar;
        nm nmVarO = oo0.o(o0mmVar);
        final TUBaseAdAdapter tUBaseAdAdapter = nmVarO != null ? nmVarO.o : null;
        if (tUBaseAdAdapter != null) {
            com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.core.n.om.1
                @Override // java.lang.Runnable
                public final void run() {
                    om.o(om.this, tUBaseAdAdapter, o0mmVar);
                }
            });
            return;
        }
        String strO = TUBidRequestInfo.NO_ADAPTER_ERROR_TYPE;
        if (nmVarO != null) {
            strO = nmVarO.o(TUBidRequestInfo.NO_ADAPTER_ERROR_TYPE);
        }
        oVar.onBidTokenObtainFail(strO, o0mmVar);
    }

    private void o(TUBaseAdAdapter tUBaseAdAdapter, o0mm o0mmVar) {
        try {
            mmm mmmVar = this.m.f42240n;
            TUAdRequest tUAdRequestM = mmmVar != null ? mmmVar.m() : null;
            n0 n0VarO = this.m.nm.o();
            o0om o0omVar = this.m;
            Map<String, Object> mapO = n0VarO.o(o0omVar.oo, o0omVar.o0, o0mmVar, tUAdRequestM);
            com.thinkup.core.common.on.n0 n0VarNmm = this.m.o0n.nmm();
            m0m.o(n0VarNmm, o0mmVar, 0, false);
            nn.o(mapO, n0VarNmm);
            if (o0mmVar.nm() == 66) {
                o0mmVar.o(tUBaseAdAdapter);
            }
            tUBaseAdAdapter.internalGetBidRequestInfo(this.m.m, mapO, this.f42416n, new AnonymousClass2(o0mmVar));
            o oVar = this.o0;
            if (oVar != null) {
                oVar.onBidTokenObtainStart(o0mmVar, tUBaseAdAdapter);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            o oVar2 = this.o0;
            if (oVar2 != null) {
                oVar2.onBidTokenObtainFail(th.getMessage(), o0mmVar);
            }
        }
    }

    private void o(o0mm o0mmVar, TUBidRequestInfo tUBidRequestInfo) {
        com.thinkup.core.common.ooo.m.m.o().o(new AnonymousClass3(tUBidRequestInfo, o0mmVar));
    }

    public static /* synthetic */ void o(om omVar, TUBaseAdAdapter tUBaseAdAdapter, o0mm o0mmVar) {
        try {
            mmm mmmVar = omVar.m.f42240n;
            TUAdRequest tUAdRequestM = mmmVar != null ? mmmVar.m() : null;
            n0 n0VarO = omVar.m.nm.o();
            o0om o0omVar = omVar.m;
            Map<String, Object> mapO = n0VarO.o(o0omVar.oo, o0omVar.o0, o0mmVar, tUAdRequestM);
            com.thinkup.core.common.on.n0 n0VarNmm = omVar.m.o0n.nmm();
            m0m.o(n0VarNmm, o0mmVar, 0, false);
            nn.o(mapO, n0VarNmm);
            if (o0mmVar.nm() == 66) {
                o0mmVar.o(tUBaseAdAdapter);
            }
            tUBaseAdAdapter.internalGetBidRequestInfo(omVar.m.m, mapO, omVar.f42416n, omVar.new AnonymousClass2(o0mmVar));
            o oVar = omVar.o0;
            if (oVar != null) {
                oVar.onBidTokenObtainStart(o0mmVar, tUBaseAdAdapter);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            o oVar2 = omVar.o0;
            if (oVar2 != null) {
                oVar2.onBidTokenObtainFail(th.getMessage(), o0mmVar);
            }
        }
    }

    public static /* synthetic */ void o(om omVar, o0mm o0mmVar, TUBidRequestInfo tUBidRequestInfo) {
        com.thinkup.core.common.ooo.m.m.o().o(omVar.new AnonymousClass3(tUBidRequestInfo, o0mmVar));
    }

    public static /* synthetic */ void o(JSONObject jSONObject, o0mm o0mmVar) {
        if (o0mmVar == null || jSONObject == null || o0mmVar.nm() != 2) {
            return;
        }
        try {
            jSONObject.put("admob_bid_type", o0mmVar.om0o());
            jSONObject.put("network_id", o0mmVar.om00());
        } catch (Throwable unused) {
        }
    }
}
