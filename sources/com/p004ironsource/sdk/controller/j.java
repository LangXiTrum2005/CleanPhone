package com.p004ironsource.sdk.controller;

import com.p004ironsource.al;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.nh;
import com.p004ironsource.q9;
import com.p004ironsource.rp;
import com.p004ironsource.sdk.utils.IronSourceStorageUtils;
import com.p004ironsource.vc;
import com.p004ironsource.vh;
import com.p004ironsource.xc;
import com.p004ironsource.yk;
import com.p004ironsource.zk;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xc f26945b;

    public class a implements rp {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ al f26946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zk f26947b;

        public a(al alVar, zk zkVar) {
            this.f26946a = alVar;
            this.f26947b = zkVar;
        }

        @Override // com.p004ironsource.rp
        public void a(vh vhVar) {
            try {
                al alVar = this.f26946a;
                zk zkVar = this.f26947b;
                alVar.b(zkVar, j.this.a(zkVar, vhVar.a()));
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @Override // com.p004ironsource.rp
        public void a(vh vhVar, nh nhVar) {
            try {
                al alVar = this.f26946a;
                zk zkVar = this.f26947b;
                alVar.a(zkVar, j.this.a(zkVar, nhVar.b()));
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }
    }

    public j(String str, xc xcVar) {
        this.f26944a = str;
        this.f26945b = xcVar;
    }

    private rp a(zk zkVar, al alVar) {
        return new a(alVar, zkVar);
    }

    private vh b(JSONObject jSONObject, String str) throws Exception {
        if (!jSONObject.has(vc.c.f27495c) || !jSONObject.has(vc.c.f27494b)) {
            throw new Exception(vc.a.f27484a);
        }
        String string = jSONObject.getString(vc.c.f27495c);
        return new vh(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString(vc.c.f27494b));
    }

    private vh a(JSONObject jSONObject, String str) throws Exception {
        if (jSONObject.has(vc.c.d)) {
            return new vh(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString(vc.c.d)));
        }
        throw new Exception(vc.a.f27485b);
    }

    private JSONObject a(zk zkVar, long j) {
        try {
            return zkVar.e().put("result", j);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(zk zkVar, String str) {
        try {
            return zkVar.e().put("errMsg", str);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(zk zkVar, JSONObject jSONObject) {
        try {
            return zkVar.e().put("result", jSONObject);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return new JSONObject();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(JSONObject jSONObject, yk ykVar) {
        byte b2;
        JSONObject jSONObjectA;
        JSONObject jSONObjectA2;
        zk zkVar = new zk(jSONObject);
        al alVar = new al(ykVar);
        try {
            String strB = zkVar.b();
            JSONObject jSONObjectC = zkVar.c();
            vh vhVarB = b(jSONObjectC, this.f26944a);
            IronSourceStorageUtils.ensurePathSafety(vhVarB, this.f26944a);
            switch (strB.hashCode()) {
                case -2073025383:
                    if (!strB.equals(vc.b.f27489a)) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                case -1137024519:
                    if (!strB.equals(vc.b.f27491c)) {
                        b2 = -1;
                    } else {
                        b2 = 2;
                    }
                    break;
                case -318115535:
                    if (!strB.equals(vc.b.f27492e)) {
                        b2 = -1;
                    } else {
                        b2 = 4;
                    }
                    break;
                case 537556755:
                    if (!strB.equals(vc.b.f)) {
                        b2 = -1;
                    } else {
                        b2 = 5;
                    }
                    break;
                case 1764172231:
                    if (!strB.equals(vc.b.f27490b)) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                case 1953259713:
                    if (!strB.equals(vc.b.d)) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                this.f26945b.a(vhVarB, jSONObjectC.optString(vc.c.f27493a), jSONObjectC.optInt("connectionTimeout"), jSONObjectC.optInt("readTimeout"), a(zkVar, alVar));
                return;
            }
            if (b2 == 1) {
                this.f26945b.a(vhVarB);
                jSONObjectA = vhVarB.a();
            } else if (b2 == 2) {
                this.f26945b.b(vhVarB);
                jSONObjectA = vhVarB.a();
            } else {
                if (b2 != 3) {
                    if (b2 == 4) {
                        jSONObjectA2 = a(zkVar, this.f26945b.d(vhVarB));
                    } else {
                        if (b2 != 5) {
                            return;
                        }
                        this.f26945b.a(vhVarB, jSONObjectC.optJSONObject(vc.c.g));
                        jSONObjectA = vhVarB.a();
                    }
                    alVar.b(zkVar, jSONObjectA2);
                }
                jSONObjectA = this.f26945b.c(vhVarB);
            }
            jSONObjectA2 = a(zkVar, jSONObjectA);
            alVar.b(zkVar, jSONObjectA2);
        } catch (Exception e2) {
            q9.d().a(e2);
            alVar.a(zkVar, a(zkVar, e2.getMessage()));
        }
    }
}
