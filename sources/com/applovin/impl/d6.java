package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.ironsource.C0375hc;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class d6 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f7745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f7746h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final m3 f7747i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f7748j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f7749k;
    private final Map l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final MaxError f7750m;

    public d6(String str, List list, Map map, Map map2, MaxError maxError, m3 m3Var, com.applovin.impl.sdk.l lVar, boolean z10) {
        super("TaskFireMediationPostbacks", lVar);
        this.f7745g = wi.d.h(str, "_urls");
        this.f7746h = list;
        this.f7748j = q7.a(map, lVar);
        this.f7749k = map2 == null ? new HashMap() : map2;
        this.f7750m = maxError != null ? maxError : new MaxErrorImpl(-1);
        this.f7747i = m3Var;
        HashMap map3 = new HashMap(7);
        map3.put("AppLovin-Event-Type", str);
        if (z10 && m3Var != null) {
            map3.put("AppLovin-Ad-Network-Name", m3Var.c());
        }
        if (m3Var instanceof a3) {
            a3 a3Var = (a3) m3Var;
            map3.put("AppLovin-Ad-Unit-Id", a3Var.getAdUnitId());
            map3.put("AppLovin-Ad-Format", a3Var.getFormat().getLabel());
            if (z10) {
                map3.put("AppLovin-Third-Party-Ad-Placement-Id", a3Var.U());
            }
        }
        if (maxError != null) {
            map3.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            map3.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.l = map3;
    }

    private void a(String str, Map map) {
        b().h0().e(com.applovin.impl.sdk.network.d.b().d(str).c(C0375hc.f28789b).a(this.l).a(false).c(map).c(((Boolean) this.f8297a.a(t3.G8)).booleanValue()).a());
    }

    private String b(String str, Map map) {
        for (String str2 : map.keySet()) {
            str = str.replace(str2, StringUtils.emptyIfNull((String) map.get(str2)));
        }
        return str;
    }

    private Map e() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.f8297a.a(t3.A7)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    private List f() {
        List list = this.f7746h;
        if (list != null) {
            return list;
        }
        m3 m3Var = this.f7747i;
        if (m3Var != null) {
            return m3Var.b(this.f7745g);
        }
        return null;
    }

    private h g() {
        m3 m3Var = this.f7747i;
        if (m3Var instanceof a3) {
            return ((a3) m3Var).Q().f();
        }
        if (m3Var instanceof f5) {
            return ((f5) m3Var).u().f();
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        h hVarG;
        List listF = f();
        if (CollectionUtils.isEmpty(listF)) {
            return;
        }
        Map mapE = e();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            Uri uri = Uri.parse(a(b((String) it.next(), this.f7748j), this.f7750m));
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            HashMap map = new HashMap(this.f7749k);
            for (String str : uri.getQueryParameterNames()) {
                String queryParameter = uri.getQueryParameter(str);
                if (mapE.containsKey(queryParameter)) {
                    m3 m3Var = this.f7747i;
                    if (m3Var != null) {
                        map.put(str, m3Var.a((String) mapE.get(queryParameter)));
                    }
                } else {
                    builderClearQuery.appendQueryParameter(str, queryParameter);
                }
            }
            Map mapE2 = this.f8297a.B().e();
            for (String str2 : mapE2.keySet()) {
                if (map.containsKey(str2)) {
                    map.put(str2, mapE2.get(str2));
                }
            }
            if (((Boolean) this.f8297a.a(t3.f9793y8)).booleanValue() && (hVarG = g()) != null) {
                map.put("arn_info", hVarG.e());
            }
            a(builderClearQuery.build().toString(), map);
        }
    }

    private String a(String str, MaxError maxError) {
        int mediatedNetworkErrorCode;
        String mediatedNetworkErrorMessage;
        if (maxError instanceof MaxAdapterError) {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            mediatedNetworkErrorCode = maxAdapterError.getMediatedNetworkErrorCode();
            mediatedNetworkErrorMessage = maxAdapterError.getMediatedNetworkErrorMessage();
        } else {
            mediatedNetworkErrorCode = 0;
            mediatedNetworkErrorMessage = "";
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUriString(maxError.getMessage())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(mediatedNetworkErrorCode)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUriString(mediatedNetworkErrorMessage));
    }
}
