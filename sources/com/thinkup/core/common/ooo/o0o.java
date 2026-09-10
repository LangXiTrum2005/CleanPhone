package com.thinkup.core.common.ooo;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUCustomContentInfo;
import com.thinkup.core.api.TUCustomContentResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class o0o {
    private static final String o = "o0o";

    public static class o implements Comparable<o> {
        TUCustomContentInfo m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        double f42346n;
        int o;
        com.thinkup.core.common.on.o o0;

        public o(int i2, TUCustomContentInfo tUCustomContentInfo, double d, com.thinkup.core.common.on.o oVar) {
            this.o = i2;
            this.m = tUCustomContentInfo;
            this.f42346n = d;
            this.o0 = oVar;
        }

        private int o(o oVar) {
            double d = this.f42346n;
            double d2 = oVar.f42346n;
            if (d > d2) {
                return -1;
            }
            return d < d2 ? 1 : 0;
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(o oVar) {
            double d = this.f42346n;
            double d2 = oVar.f42346n;
            if (d > d2) {
                return -1;
            }
            return d < d2 ? 1 : 0;
        }
    }

    public static TUCustomContentResult m(List<TUCustomContentInfo> list) {
        try {
            return n(list);
        } catch (Throwable unused) {
            return new TUCustomContentResult(list);
        }
    }

    private static TUCustomContentResult n(List<TUCustomContentInfo> list) {
        long j;
        com.thinkup.core.common.on.o oVarM;
        com.thinkup.core.common.on.o oVar;
        int i2;
        Objects.toString(list);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (list == null || list.size() == 0) {
            Log.e(o, "List<TUCustomContentInfo> can not be empty");
            return null;
        }
        ArrayList<TUCustomContentInfo> arrayList = new ArrayList(list);
        if (!com.thinkup.core.common.n.o0n.m().n0o()) {
            return o0(arrayList);
        }
        LinkedList<o> linkedList = new LinkedList();
        for (TUCustomContentInfo tUCustomContentInfo : arrayList) {
            if (tUCustomContentInfo != null) {
                try {
                    String customContentString = tUCustomContentInfo.getCustomContentString();
                    double customContentDouble = tUCustomContentInfo.getCustomContentDouble();
                    double dMoo = 0.0d;
                    if (customContentDouble > 0.0d) {
                        dMoo = customContentDouble;
                        i2 = 2;
                        oVar = null;
                    } else {
                        if (TextUtils.isEmpty(customContentString)) {
                            oVarM = null;
                        } else {
                            try {
                                com.thinkup.core.oo.n0 n0VarO = com.thinkup.core.oo.nm.o(com.thinkup.core.common.n.o0n.m().on()).o(customContentString);
                                if (n0VarO == null) {
                                    throw new RuntimeException("placementId: " + customContentString + ", place strategy is null");
                                }
                                com.thinkup.core.common.om omVarO = com.thinkup.core.common.ooo.o().o(customContentString, String.valueOf(n0VarO.o00n()));
                                if (omVarO == null) {
                                    throw new RuntimeException("The \" + placementId + \" object has not been created yet!");
                                }
                                oVarM = omVarO.m(com.thinkup.core.common.n.o0n.m().on(), false, false, new com.thinkup.core.common.on.ono());
                                if (oVarM == null) {
                                    throw new RuntimeException("no cache, placementId: ".concat(String.valueOf(customContentString)));
                                }
                                try {
                                    oVarM.toString();
                                    oVar = oVarM;
                                    dMoo = oVarM.oo().getUnitGroupInfo().moo();
                                    i2 = 1;
                                } catch (Throwable th) {
                                    th = th;
                                    th.getMessage();
                                    oVar = oVarM;
                                    i2 = 0;
                                }
                                th = th;
                                th.getMessage();
                            } catch (Throwable th2) {
                                th = th2;
                                oVarM = null;
                            }
                        }
                        oVar = oVarM;
                        i2 = 0;
                    }
                    linkedList.add(new o(i2, tUCustomContentInfo, dMoo, oVar));
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
            }
        }
        if (linkedList.size() == 0) {
            return new TUCustomContentResult(arrayList);
        }
        Collections.sort(linkedList);
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList2 = new ArrayList();
        double d = -1.0d;
        String customContentString2 = "";
        int i3 = 0;
        TUCustomContentInfo tUCustomContentInfo2 = null;
        for (o oVar2 : linkedList) {
            if (oVar2 != null) {
                TUCustomContentInfo tUCustomContentInfo3 = oVar2.m;
                double d2 = d;
                double d3 = oVar2.f42346n;
                com.thinkup.core.common.on.o oVar3 = oVar2.o0;
                if (tUCustomContentInfo2 == null) {
                    i3 = oVar2.o;
                    d2 = d3;
                    customContentString2 = tUCustomContentInfo3.getCustomContentString();
                    tUCustomContentInfo2 = tUCustomContentInfo3;
                }
                tUCustomContentInfo3.getCustomContentString();
                Objects.toString(tUCustomContentInfo3.getCustomContentObject());
                if (oVar3 != null) {
                    tUCustomContentInfo3.setTUAdInfo(oVar3.o00());
                }
                arrayList2.add(tUCustomContentInfo3);
                JSONObject jSONObject = new JSONObject();
                try {
                    if (tUCustomContentInfo3.getCustomContentObject() instanceof String) {
                        j = jElapsedRealtime;
                        try {
                            jSONObject.put("custom_string", tUCustomContentInfo3.getCustomContentObject());
                        } catch (Throwable unused) {
                        }
                    } else {
                        j = jElapsedRealtime;
                    }
                    jSONObject.put("price", String.valueOf(d3));
                    if (oVar2.o != 2) {
                        jSONObject.put("pl_id", tUCustomContentInfo3.getCustomContentString());
                        com.thinkup.core.common.on.n0 n0VarMo = oVar3 != null ? oVar3.mo() : null;
                        jSONObject.put("req_id", n0VarMo != null ? n0VarMo.oon0() : "");
                        jSONObject.put("network_firm_id", n0VarMo != null ? n0VarMo.n0n() : 0);
                        jSONObject.put("adsource_id", n0VarMo != null ? n0VarMo.mon() : "");
                        jSONObject.put("adsource_isheaderbidding", (n0VarMo == null || !n0VarMo.moo()) ? 0 : 1);
                        jSONObject.put("network_placement_id", n0VarMo != null ? n0VarMo.omo() : "");
                    }
                    jSONArray.put(jSONObject);
                } catch (Throwable unused2) {
                    j = jElapsedRealtime;
                }
                d = d2;
                jElapsedRealtime = j;
            }
        }
        long j2 = jElapsedRealtime;
        com.thinkup.core.common.on.n nVar = new com.thinkup.core.common.on.n(jSONArray, i3, i3 == 2 ? String.valueOf(d) : i3 == 1 ? customContentString2 : null, SystemClock.elapsedRealtime() - j2);
        com.thinkup.core.common.on.n0 n0Var = new com.thinkup.core.common.on.n0();
        n0Var.o(nVar);
        com.thinkup.core.common.oo0.n.o(com.thinkup.core.common.n.o0n.m().on()).o(26, n0Var);
        return new TUCustomContentResult(arrayList2);
    }

    public static TUCustomContentInfo o(List<TUCustomContentInfo> list) {
        try {
            TUCustomContentResult tUCustomContentResultN = n(list);
            if (tUCustomContentResultN != null) {
                return tUCustomContentResultN.getCustomContentInfoList().get(0);
            }
        } catch (Throwable unused) {
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    private static TUCustomContentResult o0(List<TUCustomContentInfo> list) {
        Objects.toString(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (TUCustomContentInfo tUCustomContentInfo : list) {
            if (tUCustomContentInfo != null) {
                if (TextUtils.isEmpty(tUCustomContentInfo.getCustomContentString())) {
                    arrayList.add(tUCustomContentInfo);
                } else {
                    arrayList2.add(tUCustomContentInfo);
                }
            }
        }
        if (arrayList.size() != 0) {
            Collections.sort(arrayList, new Comparator<TUCustomContentInfo>() { // from class: com.thinkup.core.common.ooo.o0o.1
                private static int o(TUCustomContentInfo tUCustomContentInfo2, TUCustomContentInfo tUCustomContentInfo3) {
                    if (tUCustomContentInfo2.getCustomContentDouble() > tUCustomContentInfo3.getCustomContentDouble()) {
                        return -1;
                    }
                    return tUCustomContentInfo2.getCustomContentDouble() < tUCustomContentInfo3.getCustomContentDouble() ? 1 : 0;
                }

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(TUCustomContentInfo tUCustomContentInfo2, TUCustomContentInfo tUCustomContentInfo3) {
                    TUCustomContentInfo tUCustomContentInfo4 = tUCustomContentInfo2;
                    TUCustomContentInfo tUCustomContentInfo5 = tUCustomContentInfo3;
                    if (tUCustomContentInfo4.getCustomContentDouble() > tUCustomContentInfo5.getCustomContentDouble()) {
                        return -1;
                    }
                    return tUCustomContentInfo4.getCustomContentDouble() < tUCustomContentInfo5.getCustomContentDouble() ? 1 : 0;
                }
            });
        }
        arrayList.addAll(arrayList2);
        return new TUCustomContentResult(arrayList);
    }

    public static void o(TUCustomContentResult tUCustomContentResult, com.thinkup.core.common.on.n0 n0Var) {
        List<TUCustomContentInfo> customContentInfoList;
        TUAdInfo adInfo;
        if (tUCustomContentResult == null || n0Var == null || (customContentInfoList = tUCustomContentResult.getCustomContentInfoList()) == null || customContentInfoList.size() == 0) {
            return;
        }
        n0Var.o(tUCustomContentResult);
        String strOon0 = n0Var.oon0();
        String strMon = n0Var.mon();
        customContentInfoList.toString();
        for (TUCustomContentInfo tUCustomContentInfo : customContentInfoList) {
            if (tUCustomContentInfo != null && (adInfo = tUCustomContentInfo.getAdInfo()) != null) {
                String requestId = adInfo.getRequestId();
                String adsourceId = adInfo.getAdsourceId();
                if (TextUtils.equals(strOon0, requestId) && TextUtils.equals(strMon, adsourceId)) {
                    double dO00 = n0Var.o00();
                    double dO0o = n0Var.o0o();
                    tUCustomContentInfo.toString();
                    if (adInfo instanceof com.thinkup.core.common.n.mn) {
                        com.thinkup.core.common.n.mn mnVar = (com.thinkup.core.common.n.mn) adInfo;
                        mnVar.o(dO00);
                        mnVar.m(dO0o);
                        return;
                    }
                    return;
                }
            }
        }
    }
}
