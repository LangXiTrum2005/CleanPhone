package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f33568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f33569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f33570h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f33571i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f33572j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f33573k;
    private String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f33574m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f33575n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f33576o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f33577p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f33578q;

    public String a() {
        return this.f33563a;
    }

    public String b() {
        return this.f33565c;
    }

    public int c() {
        return this.f33566d;
    }

    public String d() {
        return this.f33564b;
    }

    public void e(int i10) {
        this.f33574m = i10;
    }

    public void f(int i10) {
        this.f33577p = i10;
    }

    public String g() {
        return this.f33569g;
    }

    public void h(String str) {
        this.l = str;
    }

    public void i(String str) {
        this.f33575n = str;
    }

    public String j() {
        return this.f33572j;
    }

    public void k(String str) {
        this.f33578q = str;
    }

    public String l() {
        return this.l;
    }

    public int m() {
        return this.f33574m;
    }

    public String n() {
        return this.f33575n;
    }

    public String o() {
        return this.f33576o;
    }

    public int p() {
        return this.f33577p;
    }

    public String q() {
        return this.f33578q;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ClickTime [campaignId=");
        sb2.append(this.f33563a);
        sb2.append(", click_duration=");
        sb2.append(this.f33564b);
        sb2.append(", lastUrl=");
        sb2.append(this.f33572j);
        sb2.append(", code=");
        sb2.append(this.f33567e);
        sb2.append(", excepiton=");
        sb2.append(this.f33569g);
        sb2.append(", header=");
        sb2.append(this.f33570h);
        sb2.append(", content=");
        sb2.append(this.f33568f);
        sb2.append(", type=");
        sb2.append(this.f33577p);
        sb2.append(", click_type=");
        return l1.d.i(sb2, this.f33566d, X3.j.f27836e);
    }

    public void a(int i10) {
        this.f33566d = i10;
    }

    public void b(String str) {
        this.f33565c = str;
    }

    public void c(int i10) {
        this.f33571i = i10;
    }

    public void d(int i10) {
        this.f33573k = i10;
    }

    public int e() {
        return this.f33567e;
    }

    public String f() {
        return this.f33568f;
    }

    public void g(String str) {
        this.f33572j = str;
    }

    public String h() {
        return this.f33570h;
    }

    public int i() {
        return this.f33571i;
    }

    public void j(String str) {
        this.f33576o = str;
    }

    public int k() {
        return this.f33573k;
    }

    public void a(String str) {
        this.f33563a = str;
    }

    public void b(int i10) {
        this.f33567e = i10;
    }

    public void c(String str) {
        this.f33564b = str;
    }

    public void d(String str) {
        this.f33568f = str;
    }

    public void e(String str) {
        this.f33569g = str;
    }

    public void f(String str) {
        this.f33570h = str;
    }

    public static JSONObject a(e eVar) {
        if (eVar == null) {
            return null;
        }
        String strJ = eVar.j();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rid", eVar.n());
            jSONObject.put("rid_n", eVar.o());
            jSONObject.put("click_type", eVar.c());
            jSONObject.put("type", eVar.p());
            jSONObject.put(BidResponsedEx.KEY_CID, eVar.a());
            jSONObject.put("click_duration", eVar.d());
            jSONObject.put(X3.i.W, "2000012");
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, eVar.q());
            jSONObject.put("last_url", strJ);
            jSONObject.put("code", eVar.e());
            jSONObject.put("exception", eVar.g());
            jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, eVar.i());
            jSONObject.put(CampaignEx.JSON_KEY_LINK_TYPE, eVar.k());
            jSONObject.put("click_time", eVar.b());
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("network_type", eVar.m());
                jSONObject.put("network_str", eVar.l());
            }
            return jSONObject;
        } catch (Throwable th2) {
            q0.b("ClickTime", th2.getMessage());
            return null;
        }
    }

    public static ArrayList<JSONObject> a(List<e> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList<JSONObject> arrayList = new ArrayList<>();
        for (e eVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("rid", eVar.n());
                jSONObject.put("rid_n", eVar.o());
                jSONObject.put(BidResponsedEx.KEY_CID, eVar.a());
                jSONObject.put("click_type", eVar.c());
                jSONObject.put("type", eVar.p());
                jSONObject.put("click_duration", eVar.d());
                jSONObject.put(X3.i.W, "2000013");
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, eVar.q());
                jSONObject.put("last_url", eVar.j());
                jSONObject.put("content", eVar.f());
                jSONObject.put("code", eVar.e());
                jSONObject.put("exception", eVar.g());
                jSONObject.put("header", eVar.h());
                jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, eVar.i());
                jSONObject.put(CampaignEx.JSON_KEY_LINK_TYPE, eVar.k());
                jSONObject.put("click_time", eVar.b());
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", eVar.m());
                    jSONObject.put("network_str", eVar.l());
                }
                String strQ = eVar.q();
                if (!TextUtils.isEmpty(strQ)) {
                    String str = com.mbridge.msdk.foundation.controller.a.f33385r.get(strQ);
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("u_stid", str);
                }
                arrayList.add(jSONObject);
            } catch (Throwable th2) {
                q0.b("ClickTime", th2.getMessage());
            }
        }
        return arrayList;
    }
}
