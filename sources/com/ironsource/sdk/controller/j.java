package com.ironsource.sdk.controller;

import com.ironsource.C0474n4;
import com.ironsource.C0498oa;
import com.ironsource.C0516pa;
import com.ironsource.C0532q8;
import com.ironsource.C0693z8;
import com.ironsource.InterfaceC0480na;
import com.ironsource.Oc;
import com.ironsource.V5;
import com.ironsource.X5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X5 f30421b;

    public j(String str, X5 x10) {
        this.f30420a = str;
        this.f30421b = x10;
    }

    private C0693z8 b(JSONObject jSONObject, String str) throws Exception {
        if (!jSONObject.has(V5.c.f27367c) || !jSONObject.has(V5.c.f27366b)) {
            throw new Exception(V5.a.f27351a);
        }
        String string = jSONObject.getString(V5.c.f27367c);
        return new C0693z8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString(V5.c.f27366b));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(JSONObject jSONObject, InterfaceC0480na interfaceC0480na) {
        C0498oa c0498oa = new C0498oa(jSONObject);
        C0516pa c0516pa = new C0516pa(interfaceC0480na);
        try {
            String strB = c0498oa.b();
            JSONObject jSONObjectC = c0498oa.c();
            C0693z8 c0693z8B = b(jSONObjectC, this.f30420a);
            IronSourceStorageUtils.ensurePathSafety(c0693z8B, this.f30420a);
            switch (strB.hashCode()) {
                case -2073025383:
                    if (strB.equals(V5.b.f27359a)) {
                        this.f30421b.a(c0693z8B, jSONObjectC.optString(V5.c.f27365a), jSONObjectC.optInt("connectionTimeout"), jSONObjectC.optInt("readTimeout"), a(c0498oa, c0516pa));
                    }
                    break;
                case -1137024519:
                    if (strB.equals("deleteFolder")) {
                        this.f30421b.b(c0693z8B);
                        c0516pa.b(c0498oa, a(c0498oa, c0693z8B.a()));
                    }
                    break;
                case -318115535:
                    if (strB.equals(V5.b.f27363e)) {
                        c0516pa.b(c0498oa, a(c0498oa, this.f30421b.d(c0693z8B)));
                    }
                    break;
                case 537556755:
                    if (strB.equals(V5.b.f27364f)) {
                        this.f30421b.a(c0693z8B, jSONObjectC.optJSONObject(V5.c.f27371g));
                        c0516pa.b(c0498oa, a(c0498oa, c0693z8B.a()));
                    }
                    break;
                case 1764172231:
                    if (strB.equals("deleteFile")) {
                        this.f30421b.a(c0693z8B);
                        c0516pa.b(c0498oa, a(c0498oa, c0693z8B.a()));
                    }
                    break;
                case 1953259713:
                    if (strB.equals(V5.b.f27362d)) {
                        c0516pa.b(c0498oa, a(c0498oa, this.f30421b.c(c0693z8B)));
                    }
                    break;
                default:
                    break;
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            c0516pa.a(c0498oa, a(c0498oa, e10.getMessage()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Oc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0516pa f30422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0498oa f30423b;

        public a(C0516pa c0516pa, C0498oa c0498oa) {
            this.f30422a = c0516pa;
            this.f30423b = c0498oa;
        }

        @Override // com.ironsource.Oc
        public void a(C0693z8 c0693z8) {
            try {
                C0516pa c0516pa = this.f30422a;
                C0498oa c0498oa = this.f30423b;
                c0516pa.b(c0498oa, j.this.a(c0498oa, c0693z8.a()));
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @Override // com.ironsource.Oc
        public void a(C0693z8 c0693z8, C0532q8 c0532q8) {
            try {
                C0516pa c0516pa = this.f30422a;
                C0498oa c0498oa = this.f30423b;
                c0516pa.a(c0498oa, j.this.a(c0498oa, c0532q8.b()));
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    private Oc a(C0498oa c0498oa, C0516pa c0516pa) {
        return new a(c0516pa, c0498oa);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(C0498oa c0498oa, JSONObject jSONObject) {
        try {
            return c0498oa.e().put("result", jSONObject);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return new JSONObject();
        }
    }

    private JSONObject a(C0498oa c0498oa, long j10) {
        try {
            return c0498oa.e().put("result", j10);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(C0498oa c0498oa, String str) {
        try {
            return c0498oa.e().put("errMsg", str);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return new JSONObject();
        }
    }

    private C0693z8 a(JSONObject jSONObject, String str) throws Exception {
        if (jSONObject.has(V5.c.f27368d)) {
            return new C0693z8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString(V5.c.f27368d)));
        }
        throw new Exception(V5.a.f27352b);
    }
}
