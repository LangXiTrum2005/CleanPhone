package com.mbridge.msdk.setting;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f35678b = "k";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35679a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends com.mbridge.msdk.foundation.same.net.wrapper.d {
        public a() {
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) {
            if (jSONObject == null || !jSONObject.has(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I)) {
                return;
            }
            try {
                g0.a().a(jSONObject.getString(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I));
            } catch (Exception e10) {
                q0.b(k.f35678b, e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c extends com.mbridge.msdk.foundation.same.net.handler.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f35686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f35688d;

        public c(Context context, String str, String str2) {
            this.f35686b = context;
            this.f35687c = str;
            this.f35688d = str2;
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void a(String str) {
            com.mbridge.msdk.foundation.same.net.utils.d.h().f33867r = false;
            f2.z("fetch CNDSettingHost failed, errorCode = ", str, k.f35678b);
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void b(String str) {
            q0.a(k.f35678b, "fetch CNDSettingHost success, content = " + str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("mkey_spare_host_ts", System.currentTimeMillis());
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("mkey_spare_host", str);
            for (String str2 : str.split("\n")) {
                if (!TextUtils.isEmpty(str2.trim()) && !com.mbridge.msdk.foundation.same.net.utils.d.h().f33870u.contains(str2.trim())) {
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f33870u.add(str2.trim());
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f33873x.add(str2.trim());
                }
            }
            k.this.a(this.f35686b, this.f35687c, this.f35688d);
        }
    }

    private String b() {
        String str = com.mbridge.msdk.foundation.same.net.utils.d.h().f33868s ? com.mbridge.msdk.foundation.same.net.utils.d.h().R : com.mbridge.msdk.foundation.same.net.utils.d.h().Q;
        try {
            if (com.mbridge.msdk.foundation.same.net.utils.d.h().f33868s && com.mbridge.msdk.foundation.same.net.utils.d.h().f33867r && com.mbridge.msdk.foundation.same.net.utils.d.h().f33872w < com.mbridge.msdk.foundation.same.net.utils.d.h().f33873x.size()) {
                String str2 = com.mbridge.msdk.foundation.same.net.utils.d.h().f33873x.get(com.mbridge.msdk.foundation.same.net.utils.d.h().f33872w);
                if (!TextUtils.isEmpty(str2)) {
                    if (!str2.startsWith("http")) {
                        if (str2.startsWith("https")) {
                        }
                    }
                    return str2.concat("/setting");
                }
            }
        } catch (Throwable th2) {
            q0.b(f35678b, th2.getMessage());
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.n().d()).a();
        } catch (Throwable th2) {
            q0.b(f35678b, th2.getMessage());
        }
    }

    public void d(Context context, String str, String str2) {
        try {
            if (com.mbridge.msdk.foundation.same.net.utils.d.h().f33867r) {
                return;
            }
            com.mbridge.msdk.foundation.same.net.utils.d.h().f33867r = true;
            if (System.currentTimeMillis() >= com.mbridge.msdk.foundation.buffer.sharedperference.a.b().b("mkey_spare_host_ts").longValue() + 86400000) {
                String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("mkey_spare_host");
                if (!TextUtils.isEmpty(strA)) {
                    for (String str3 : strA.split("\n")) {
                        if (!TextUtils.isEmpty(str3.trim()) && !com.mbridge.msdk.foundation.same.net.utils.d.h().f33870u.contains(str3.trim())) {
                            com.mbridge.msdk.foundation.same.net.utils.d.h().f33870u.add(str3.trim());
                            com.mbridge.msdk.foundation.same.net.utils.d.h().f33873x.add(str3.trim());
                        }
                    }
                    a(context, str, str2);
                    return;
                }
            }
            new com.mbridge.msdk.foundation.same.net.wrapper.c(context.getApplicationContext()).get(0, com.mbridge.msdk.foundation.same.net.utils.d.h().f33849c, new com.mbridge.msdk.foundation.same.net.wrapper.e(), new c(context, str, str2), "setting", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        } catch (Throwable th2) {
            com.mbridge.msdk.foundation.same.net.utils.d.h().f33867r = false;
            q0.b(f35678b, th2.getMessage());
        }
    }

    public void c(Context context, String str, String str2) {
        a(context, str, str2, "1", new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2) {
        if (!com.mbridge.msdk.foundation.same.net.utils.d.h().g()) {
            d(context, str, str2);
        } else {
            b(context, str, str2);
        }
    }

    public void a(Context context, String str, String str2, String str3, com.mbridge.msdk.foundation.same.net.wrapper.d dVar) {
        if (context == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.a.W++;
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
        eVar.a(MBridgeConstans.APP_ID, str);
        eVar.a("sign", SameMD5.getMD5(str + str2));
        try {
            g gVarD = i.b().d(str);
            String strB0 = gVarD.B0();
            if (TextUtils.isEmpty(strB0)) {
                strB0 = "";
            }
            eVar.a("vtag", strB0);
            eVar.a("current_pipeline_id", String.valueOf(gVarD.b0()));
            eVar.a("p_p_c_id", String.valueOf(gVarD.f0()));
            eVar.a("c_m_l_id", String.valueOf(gVarD.o()));
            eVar.a("csi", com.mbridge.msdk.foundation.same.report.metrics.d.b().d());
            eVar.a("ind", String.valueOf(com.mbridge.msdk.foundation.same.a.W));
            eVar.a("fir", String.valueOf(com.mbridge.msdk.foundation.same.a.X));
            eVar.a("fir_t", String.valueOf(com.mbridge.msdk.foundation.same.a.Y));
            String strA = gVarD.a();
            this.f35679a = strA;
            eVar.a("a_stid", TextUtils.isEmpty(strA) ? "" : this.f35679a);
        } catch (Throwable th2) {
            q0.b(f35678b, th2.getMessage());
        }
        if (com.mbridge.msdk.foundation.same.net.utils.d.h().f33867r) {
            eVar.a("st_net", com.mbridge.msdk.foundation.same.net.utils.d.h().f33869t + "");
        }
        eVar.a("only_p_info", str3);
        com.mbridge.msdk.setting.net.c cVar = new com.mbridge.msdk.setting.net.c(context);
        String strConcat = com.mbridge.msdk.foundation.same.net.utils.d.h().Q;
        try {
            if (com.mbridge.msdk.foundation.same.net.utils.d.h().f33868s && com.mbridge.msdk.foundation.same.net.utils.d.h().f33867r && com.mbridge.msdk.foundation.same.net.utils.d.h().f33872w < com.mbridge.msdk.foundation.same.net.utils.d.h().f33873x.size()) {
                String str4 = com.mbridge.msdk.foundation.same.net.utils.d.h().f33873x.get(com.mbridge.msdk.foundation.same.net.utils.d.h().f33872w);
                if (!TextUtils.isEmpty(str4) && (str4.startsWith("http") || str4.startsWith("https"))) {
                    strConcat = str4.concat("/setting");
                }
            }
        } catch (Throwable th3) {
            q0.b(f35678b, th3.getMessage());
        }
        cVar.get(1, strConcat, eVar, dVar, "setting", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    }

    public void b(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        String md5 = SameMD5.getMD5(v0.d());
        a(context, str, str2, "0", new b(md5, i.b().h(str), str, md5, context, str2));
        a(3, 0, "");
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d extends com.mbridge.msdk.foundation.same.net.wrapper.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f35690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35691c;

        public d(String str, String str2) {
            this.f35690b = str;
            this.f35691c = str2;
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) {
            try {
                if (v0.a(jSONObject)) {
                    String strOptString = jSONObject.optString("vtag", "");
                    String strOptString2 = jSONObject.optString("rid", "");
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("unitSetting");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
                        if (jSONObject.optInt("vtag_status", 0) == 1) {
                            String strF = i.b().f(this.f35690b, this.f35691c);
                            if (!TextUtils.isEmpty(strF)) {
                                try {
                                    jSONObjectOptJSONObject = i.b().a(new JSONObject(strF), jSONObjectOptJSONObject);
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                            }
                        }
                        jSONObjectOptJSONObject.put("current_time", System.currentTimeMillis());
                        jSONObjectOptJSONObject.put("vtag", strOptString);
                        jSONObjectOptJSONObject.put("rid", strOptString2);
                        i.b().a(this.f35690b, this.f35691c, jSONObjectOptJSONObject.toString());
                    }
                } else {
                    i.b().j(this.f35690b, this.f35691c);
                }
                k.this.a(1, 1, "");
            } catch (Exception e11) {
                q0.b(k.f35678b, e11.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
            k.this.a(2, 1, "");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends com.mbridge.msdk.foundation.same.net.wrapper.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f35681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f35683d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f35684e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3, String str4, Context context, String str5) {
            super(str, str2);
            this.f35681b = str3;
            this.f35682c = str4;
            this.f35683d = context;
            this.f35684e = str5;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0077 A[Catch: Exception -> 0x0037, TryCatch #3 {Exception -> 0x0037, blocks: (B:3:0x000a, B:5:0x0010, B:14:0x003b, B:16:0x0043, B:21:0x0058, B:22:0x0063, B:24:0x0077, B:26:0x0081, B:30:0x009e, B:37:0x00de, B:39:0x00e8, B:40:0x00f5, B:42:0x0108, B:36:0x00d3, B:27:0x008b, B:29:0x0095, B:10:0x002b, B:41:0x00ff, B:7:0x0024, B:18:0x0049, B:31:0x00ba, B:33:0x00c4), top: B:56:0x000a, inners: #1, #2, #4 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x0081 A[Catch: Exception -> 0x0037, TryCatch #3 {Exception -> 0x0037, blocks: (B:3:0x000a, B:5:0x0010, B:14:0x003b, B:16:0x0043, B:21:0x0058, B:22:0x0063, B:24:0x0077, B:26:0x0081, B:30:0x009e, B:37:0x00de, B:39:0x00e8, B:40:0x00f5, B:42:0x0108, B:36:0x00d3, B:27:0x008b, B:29:0x0095, B:10:0x002b, B:41:0x00ff, B:7:0x0024, B:18:0x0049, B:31:0x00ba, B:33:0x00c4), top: B:56:0x000a, inners: #1, #2, #4 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x008b A[Catch: Exception -> 0x0037, TryCatch #3 {Exception -> 0x0037, blocks: (B:3:0x000a, B:5:0x0010, B:14:0x003b, B:16:0x0043, B:21:0x0058, B:22:0x0063, B:24:0x0077, B:26:0x0081, B:30:0x009e, B:37:0x00de, B:39:0x00e8, B:40:0x00f5, B:42:0x0108, B:36:0x00d3, B:27:0x008b, B:29:0x0095, B:10:0x002b, B:41:0x00ff, B:7:0x0024, B:18:0x0049, B:31:0x00ba, B:33:0x00c4), top: B:56:0x000a, inners: #1, #2, #4 }] */
        /* JADX WARN: Code duplicated, block: B:29:0x0095 A[Catch: Exception -> 0x0037, TryCatch #3 {Exception -> 0x0037, blocks: (B:3:0x000a, B:5:0x0010, B:14:0x003b, B:16:0x0043, B:21:0x0058, B:22:0x0063, B:24:0x0077, B:26:0x0081, B:30:0x009e, B:37:0x00de, B:39:0x00e8, B:40:0x00f5, B:42:0x0108, B:36:0x00d3, B:27:0x008b, B:29:0x0095, B:10:0x002b, B:41:0x00ff, B:7:0x0024, B:18:0x0049, B:31:0x00ba, B:33:0x00c4), top: B:56:0x000a, inners: #1, #2, #4 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x00c4 A[Catch: Exception -> 0x00d2, TRY_LEAVE, TryCatch #4 {Exception -> 0x00d2, blocks: (B:31:0x00ba, B:33:0x00c4), top: B:58:0x00ba, outer: #3 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00e8 A[Catch: Exception -> 0x0037, TryCatch #3 {Exception -> 0x0037, blocks: (B:3:0x000a, B:5:0x0010, B:14:0x003b, B:16:0x0043, B:21:0x0058, B:22:0x0063, B:24:0x0077, B:26:0x0081, B:30:0x009e, B:37:0x00de, B:39:0x00e8, B:40:0x00f5, B:42:0x0108, B:36:0x00d3, B:27:0x008b, B:29:0x0095, B:10:0x002b, B:41:0x00ff, B:7:0x0024, B:18:0x0049, B:31:0x00ba, B:33:0x00c4), top: B:56:0x000a, inners: #1, #2, #4 }] */
        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) {
            JSONObject jSONObject2;
            try {
                try {
                    if (v0.a(jSONObject)) {
                        boolean zD = h.d(jSONObject);
                        String strG = i.b().g(this.f35681b);
                        if (TextUtils.isEmpty(strG)) {
                            jSONObject2 = null;
                            if (jSONObject.optInt("vtag_status", 0) == 1) {
                                jSONObject = i.b().a(new JSONObject(strG), jSONObject);
                            }
                            l.a(jSONObject);
                            jSONObject.put("current_time", System.currentTimeMillis());
                            if (com.mbridge.msdk.foundation.same.net.utils.d.h().f33868s) {
                                if (TextUtils.isEmpty(jSONObject.optString("hst_st_t"))) {
                                    jSONObject.put("hst_st_t", com.mbridge.msdk.foundation.same.net.utils.d.h().f33862m);
                                }
                            } else if (TextUtils.isEmpty(jSONObject.optString("hst_st"))) {
                                jSONObject.put("hst_st", com.mbridge.msdk.foundation.same.net.utils.d.h().f33859i);
                            }
                            h.b(jSONObject, jSONObject2, this.f35682c, zD);
                            i.b().h(this.f35681b, jSONObject.toString());
                            com.mbridge.msdk.foundation.same.net.utils.d.h().j();
                            l.a();
                            if (!TextUtils.isEmpty(jSONObject.optString("mraid_js"))) {
                                com.mbridge.msdk.setting.util.a.a().a(this.f35683d, jSONObject.optString("mraid_js"));
                            }
                            if (!TextUtils.isEmpty(jSONObject.optString("web_env_url"))) {
                                com.mbridge.msdk.setting.util.b.c().a(this.f35683d, jSONObject.optString("web_env_url"));
                            }
                            k.this.a(this.f35683d, this.f35681b);
                        } else {
                            try {
                                jSONObject2 = new JSONObject(strG);
                            } catch (Exception e10) {
                                q0.b(k.f35678b, e10.getMessage());
                                jSONObject2 = null;
                            }
                            if (jSONObject.optInt("vtag_status", 0) == 1 && !TextUtils.isEmpty(strG)) {
                                try {
                                    jSONObject = i.b().a(new JSONObject(strG), jSONObject);
                                } catch (Exception e11) {
                                    q0.b(k.f35678b, e11.getMessage());
                                }
                            }
                            l.a(jSONObject);
                            jSONObject.put("current_time", System.currentTimeMillis());
                            if (com.mbridge.msdk.foundation.same.net.utils.d.h().f33868s) {
                                if (TextUtils.isEmpty(jSONObject.optString("hst_st_t"))) {
                                    jSONObject.put("hst_st_t", com.mbridge.msdk.foundation.same.net.utils.d.h().f33862m);
                                }
                            } else if (TextUtils.isEmpty(jSONObject.optString("hst_st"))) {
                                jSONObject.put("hst_st", com.mbridge.msdk.foundation.same.net.utils.d.h().f33859i);
                            }
                            h.b(jSONObject, jSONObject2, this.f35682c, zD);
                            i.b().h(this.f35681b, jSONObject.toString());
                            com.mbridge.msdk.foundation.same.net.utils.d.h().j();
                            l.a();
                            try {
                                if (!TextUtils.isEmpty(jSONObject.optString("mraid_js"))) {
                                    com.mbridge.msdk.setting.util.a.a().a(this.f35683d, jSONObject.optString("mraid_js"));
                                }
                            } catch (Exception e12) {
                                q0.b(k.f35678b, e12.getMessage());
                            }
                            if (!TextUtils.isEmpty(jSONObject.optString("web_env_url"))) {
                                com.mbridge.msdk.setting.util.b.c().a(this.f35683d, jSONObject.optString("web_env_url"));
                            }
                            k.this.a(this.f35683d, this.f35681b);
                        }
                        k.this.a(1, 0, "");
                        return;
                    }
                    i.b().l(this.f35681b);
                    k.this.a(1, 0, "");
                    return;
                } catch (Throwable th2) {
                    q0.b(k.f35678b, th2.getMessage());
                    return;
                }
                k.this.c();
            } catch (Exception e13) {
                q0.b(k.f35678b, e13.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
            try {
                k.this.a(2, 0, str);
            } catch (Throwable th2) {
                q0.b(k.f35678b, th2.getMessage());
            }
            if (!com.mbridge.msdk.foundation.same.net.utils.d.h().f33868s) {
                com.mbridge.msdk.foundation.same.net.utils.d.h().f33871v++;
            } else {
                com.mbridge.msdk.foundation.same.net.utils.d.h().f33872w++;
            }
            k.this.a(this.f35683d, this.f35681b, this.f35684e);
            k.this.c();
            f2.s("get app setting error", str, k.f35678b);
        }
    }

    public void a(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str = com.mbridge.msdk.foundation.controller.c.n().b();
            str2 = com.mbridge.msdk.foundation.controller.c.n().c();
        }
        if (i.b().g(str3, str) && i.b().a(str, 2, str3)) {
            com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
            String str4 = X3.j.f27834d + str3 + X3.j.f27836e;
            eVar.a("unit_ids", str4);
            eVar.a(MBridgeConstans.APP_ID, str);
            eVar.a("sign", SameMD5.getMD5(str + str2));
            try {
                String strJ = i.b().d(str, str4).J();
                if (TextUtils.isEmpty(strJ)) {
                    strJ = "";
                }
                eVar.a("vtag", strJ);
            } catch (Throwable th2) {
                q0.b(f35678b, th2.getMessage());
            }
            d dVar = new d(str, str3);
            dVar.setUnitId(str3);
            new com.mbridge.msdk.setting.net.c(context).get(1, com.mbridge.msdk.foundation.same.net.utils.d.h().Q, eVar, dVar, "setting", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            a(3, 1, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str) {
        g gVarF;
        i iVarB = i.b();
        if (iVarB != null && (gVarF = iVarB.f(str)) != null) {
            MBridgeConstans.OMID_JS_SERVICE_URL = gVarF.W();
            MBridgeConstans.OMID_JS_H5_URL = gVarF.V();
        }
        com.mbridge.msdk.omsdk.b.b(context);
        com.mbridge.msdk.omsdk.b.c(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11, String str) {
        String strB;
        g gVarF;
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a(X3.i.W, "2000112");
            eVar.a("st_net", Integer.valueOf(com.mbridge.msdk.foundation.same.net.utils.d.h().f33869t));
            eVar.a("result", Integer.valueOf(i10));
            eVar.a("type", Integer.valueOf(i11));
            if (i11 == 0) {
                strB = b();
                eVar.a("ind", String.valueOf(com.mbridge.msdk.foundation.same.a.W));
                eVar.a("fir", String.valueOf(com.mbridge.msdk.foundation.same.a.X));
                eVar.a("fir_t", String.valueOf(com.mbridge.msdk.foundation.same.a.Y));
                String str2 = "";
                eVar.a("a_stid", TextUtils.isEmpty(this.f35679a) ? "" : this.f35679a);
                if (i10 == 2 && (gVarF = i.b().f(com.mbridge.msdk.foundation.controller.c.n().b())) != null) {
                    String strA = gVarF.a();
                    if (!TextUtils.isEmpty(strA)) {
                        str2 = strA;
                    }
                    eVar.a("a_stid_n", str2);
                }
            } else {
                strB = com.mbridge.msdk.foundation.same.net.utils.d.h().f33868s ? com.mbridge.msdk.foundation.same.net.utils.d.h().R : com.mbridge.msdk.foundation.same.net.utils.d.h().Q;
            }
            eVar.a("url", strB);
            eVar.a("reason", str);
            cVar.a("2000112", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000112", cVar);
        } catch (Throwable th2) {
            q0.b(f35678b, th2.getMessage());
        }
    }
}
