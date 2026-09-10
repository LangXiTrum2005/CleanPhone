package com.thinkup.core.common.on;

import android.text.TextUtils;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUSDKUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mmn {
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<o> f42199n;
    private final String o = "mmn";
    private boolean o0;
    private boolean oo;

    public final synchronized void o(String str, List<o> list) {
        boolean z2;
        if (TextUtils.equals(this.m, str) && this.oo) {
            return;
        }
        this.m = str;
        if (list != null && list.size() > 0) {
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    z2 = false;
                    break;
                }
                o0mm unitGroupInfo = list.get(i2).oo().getUnitGroupInfo();
                if (unitGroupInfo.nm() == 8 && unitGroupInfo.ommm() && unitGroupInfo.omno() == 1) {
                    z2 = true;
                    break;
                }
                i2++;
            }
        } else {
            z2 = false;
            break;
        }
        this.o0 = z2;
        if (z2) {
            this.f42199n = list;
            this.oo = false;
        } else {
            this.f42199n = null;
            this.oo = true;
        }
    }

    public final synchronized void o(String str, String str2, String str3) {
        List<o> list;
        double d;
        String str4;
        Map<String, Object> networkInfoMap;
        Object obj;
        try {
            List<o> list2 = this.f42199n;
            if (list2 != null) {
                list2.size();
            }
            if (TextUtils.equals(this.m, str2) && this.o0 && !this.oo && (list = this.f42199n) != null && list.size() > 0) {
                this.oo = true;
                try {
                    ArrayList arrayList = new ArrayList();
                    Collections.sort(this.f42199n);
                    String strOono = "";
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    int i2 = 0;
                    int i3 = 0;
                    double dO = 0.0d;
                    while (i2 < this.f42199n.size()) {
                        o oVar = this.f42199n.get(i2);
                        if (oVar.oo() == null || oVar.oo().getUnitGroupInfo() == null) {
                            d = 0.0d;
                        } else {
                            o0mm unitGroupInfo = oVar.oo().getUnitGroupInfo();
                            d = 0.0d;
                            if (TextUtils.equals(str3, unitGroupInfo.m0o())) {
                                strOono = oVar.mo().oono();
                                jSONObject.put("nw_firm_id", unitGroupInfo.nm());
                                jSONObject.put("price", o(unitGroupInfo.moo()));
                                BaseAd baseAdOm = oVar.om();
                                if (baseAdOm != null) {
                                    jSONObject.put("advertiser_name", baseAdOm.getAdvertiserName());
                                    jSONObject.put("title", baseAdOm.getTitle());
                                    jSONObject.put("image_url", baseAdOm.getMainImageUrl());
                                    jSONObject.put("desc", baseAdOm.getDescriptionText());
                                    jSONObject.put("video_url", baseAdOm.getVideoUrl());
                                }
                                i3 = i2;
                            }
                        }
                        if (i2 < i3 || oVar.oo() == null || oVar.oo().getUnitGroupInfo() == null) {
                            str4 = strOono;
                        } else {
                            o0mm unitGroupInfo2 = oVar.oo().getUnitGroupInfo();
                            if (oVar.om() != null) {
                                networkInfoMap = oVar.om().getNetworkInfoMap();
                            } else {
                                networkInfoMap = oVar.oo().getNetworkInfoMap();
                            }
                            String networkPlacementId = oVar.oo().getNetworkPlacementId();
                            str4 = strOono;
                            if (unitGroupInfo2.nm() == 8) {
                                if (dO == d) {
                                    dO = o(unitGroupInfo2.moo());
                                }
                                if (!TextUtils.isEmpty(networkPlacementId)) {
                                    String string = "";
                                    if (networkInfoMap != null && (obj = networkInfoMap.get("request_id")) != null) {
                                        string = obj.toString();
                                    }
                                    jSONObject2.put(networkPlacementId, string + "," + String.valueOf(oVar.o0() - oVar.mo().nom()) + "," + o(unitGroupInfo2.moo()));
                                }
                            } else if (!arrayList.contains(Integer.valueOf(unitGroupInfo2.nm()))) {
                                arrayList.add(Integer.valueOf(unitGroupInfo2.nm()));
                                StringBuilder sb = new StringBuilder();
                                sb.append(unitGroupInfo2.nm());
                                jSONObject3.put(sb.toString(), o(unitGroupInfo2.moo()));
                            }
                        }
                        i2++;
                        strOono = str4;
                    }
                    com.thinkup.core.common.oo0.oo.o(str, str2, strOono, dO, jSONObject2.toString(), jSONObject.toString(), jSONObject3.toString());
                    this.f42199n = null;
                    jSONObject.toString();
                    jSONObject2.toString();
                    jSONObject3.toString();
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static double o(double d) {
        return TUSDKUtils.getUsdChangeToRmbRate() > 0.0d ? TUSDKUtils.getUsdChangeToRmbRate() * d : d;
    }
}
