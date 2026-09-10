package com.thinkup.core.common.on;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUBidRequestInfo;
import com.thinkup.core.basead.adx.api.TUAdxBidFloorInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class o0om {
    public static final String o = "o0om";
    public Context m;
    public long m0;
    public com.thinkup.core.common.m0 m00;
    public List<o0mm> mm;
    public List<o0mm> mn;
    public long mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public mmm f42240n;
    public String n0;
    public oo00 nm;
    public String nn;
    public boolean no;
    public String o0;
    public String o00;
    public JSONObject o0m;
    public n0 o0n;
    public Map<String, Object> o0o;
    public int om;
    public omn om0;
    public TUAdxBidFloorInfo omn;
    public com.thinkup.core.common.oom.mo omo;
    public long on;
    public String on0;
    public int onm;
    public double ono;
    public String oo;
    public o0nm oom;
    public o00n oon;
    public Map<String, Double> ooo;
    public int oo0 = 2;
    public int omm = 0;
    public int onn = 2;

    private o0om o0(List<o0mm> list) {
        o0om o0omVar = new o0om();
        o0omVar.m = this.m;
        o0omVar.o0 = this.o0;
        o0omVar.oo = this.oo;
        o0omVar.om = this.om;
        o0omVar.m0 = this.m0;
        o0omVar.nm = this.nm;
        long j = this.on;
        if (j < 0) {
            o0omVar.on = 10000L;
        } else {
            o0omVar.on = j;
        }
        o0omVar.no = this.no;
        o0omVar.nn = this.nn;
        o0omVar.o00 = this.o00;
        o0omVar.mm = list;
        o0omVar.o0o = this.o0o;
        o0omVar.mo = this.mo;
        o0omVar.f42240n = this.f42240n;
        o0omVar.o0n = this.o0n;
        o0omVar.oo0 = this.oo0;
        o0omVar.ooo = this.ooo;
        o0omVar.omm = this.omm;
        o0omVar.omo = this.omo;
        o0omVar.om0 = this.om0;
        o0omVar.omn = this.omn;
        o0omVar.on0 = this.on0;
        o0omVar.ono = this.ono;
        o0omVar.onm = this.onm;
        o0omVar.onn = this.onn;
        return o0omVar;
    }

    public final o0om m(List<o0mm> list) {
        o0om o0omVarO0 = o0(list);
        o0omVarO0.nn = this.nn;
        o0omVarO0.m0 = this.m0;
        return o0omVarO0;
    }

    public final o0om n(List<o0mm> list) {
        o0om o0omVarO0 = o0(list);
        o0omVarO0.o00 = this.o00;
        return o0omVarO0;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
    public final o0om o(List<o0mm> list, List<o0mm> list2) {
        JSONObject innerBidToken;
        o0om o0omVarO0 = o0(list);
        o0omVarO0.n0 = this.n0;
        if (list2 != null && list2.size() > 0) {
            Collections.sort(list2);
            List<o0mm> listO = com.thinkup.core.common.ooo.nn.o(list2, (com.thinkup.core.common.mm.om) null);
            byte b2 = 0;
            o0mm o0mmVar = listO.get(0);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (o0mm o0mmVar2 : listO) {
                if (o0mmVar2.om0() == 7) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(o0mmVar2.m0o())));
                    arrayList2.add(o0mmVar2.m0o());
                    linkedHashMap.put(o0mmVar2.m0o(), o0mmVar2.oo);
                }
            }
            nm nmVarO = com.thinkup.core.common.ooo.oo0.o(o0mmVar);
            TUBaseAdAdapter tUBaseAdAdapter = nmVarO != null ? nmVarO.o : null;
            if (tUBaseAdAdapter == null) {
                if (nmVarO != null) {
                    nmVarO.o(TUBidRequestInfo.NO_ADAPTER_ERROR_TYPE);
                }
                innerBidToken = null;
            } else {
                mmm mmmVar = this.f42240n;
                innerBidToken = tUBaseAdAdapter.getInnerBidToken(com.thinkup.core.common.n.o0n.m().on(), this.nm.o().o(this.oo, this.o0, o0mmVar, mmmVar != null ? mmmVar.m() : null), linkedHashMap);
            }
            if (innerBidToken != null) {
                String strValueOf = String.valueOf(o0omVarO0.om);
                this.nm.o();
                com.thinkup.core.n.o0.m.o(innerBidToken, strValueOf, o0mmVar, o0omVarO0);
                try {
                    String strValueOf2 = String.valueOf(o0omVarO0.om);
                    int iHashCode = strValueOf2.hashCode();
                    if (iHashCode != 50) {
                        if (iHashCode == 52 && strValueOf2.equals("4")) {
                            b2 = 1;
                        } else {
                            b2 = -1;
                        }
                    } else if (!strValueOf2.equals("2")) {
                        b2 = -1;
                    }
                    if (b2 == 0) {
                        mmm mmmVar2 = o0omVarO0.f42240n;
                        String string = o0omVarO0.nm.o().o(o0omVarO0.oo, o0omVarO0.o0, o0mmVar, mmmVar2 != null ? mmmVar2.m() : null).get("size").toString();
                        if (!TextUtils.isEmpty(string)) {
                            innerBidToken.put("size", string);
                        }
                    } else if (b2 == 1) {
                        innerBidToken.put("get_offer", 2);
                    }
                    if (o0omVarO0.omm == listO.size()) {
                        innerBidToken.put("get_offer", 2);
                    }
                    innerBidToken.put("unit_ids", new JSONArray(arrayList.toString()));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                o0omVarO0.mn = listO;
                o0omVarO0.o0m = innerBidToken;
            }
        }
        o0omVarO0.oom = this.oom;
        o0omVarO0.oon = this.oon;
        return o0omVarO0;
    }

    public final o0om o(List<o0mm> list) {
        return o0(list);
    }
}
