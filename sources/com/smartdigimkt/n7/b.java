package com.smartdigimkt.n7;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;
import com.smartdigimkt.k3.c;
import com.smartdigimkt.k5.e;
import com.smartdigimkt.p6.d;
import com.smartdigimkt.p6.f;
import com.smartdigimkt.r6.h;
import com.smartdigimkt.sdk.api.ISDMAdManager;
import com.smartdigimkt.sdk.core.bridge.entity.LoadInfoEntity;
import com.smartdigimkt.w6.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class b implements ISDMAdManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile b f37127b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37128a = "SDMAdManager";

    public class a implements c.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ISDMAdManager.BidTokenCallBack f37129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f37130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.v6.a f37131c;

        public a(ISDMAdManager.BidTokenCallBack bidTokenCallBack, Map map, com.smartdigimkt.v6.a aVar) {
            this.f37129a = bidTokenCallBack;
            this.f37130b = map;
            this.f37131c = aVar;
        }

        @Override // com.smartdigimkt.k3.c.e
        public void fail(String str) {
            ISDMAdManager.BidTokenCallBack bidTokenCallBack = this.f37129a;
            if (bidTokenCallBack != null) {
                bidTokenCallBack.onComplete(null);
            }
        }

        @Override // com.smartdigimkt.k3.c.e
        public void success() {
            if (this.f37129a != null) {
                JSONObject jSONObjectA = b.this.a((Map<String, Object>) this.f37130b, this.f37131c);
                if (jSONObjectA != null && com.smartdigimkt.n8.c.R()) {
                    try {
                        jSONObjectA.put("bit_token_al_it", h.e().h());
                        jSONObjectA.put("bit_token_mk_it", h.e().f());
                    } catch (Throwable unused) {
                    }
                }
                this.f37129a.onComplete(jSONObjectA);
            }
        }
    }

    private b() {
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0055 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:4:0x0007, B:6:0x000d, B:8:0x0017, B:13:0x0027, B:15:0x002d, B:19:0x0042, B:21:0x004c, B:22:0x0051, B:23:0x0055, B:25:0x005f, B:27:0x0066), top: B:40:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x005f A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:4:0x0007, B:6:0x000d, B:8:0x0017, B:13:0x0027, B:15:0x002d, B:19:0x0042, B:21:0x004c, B:22:0x0051, B:23:0x0055, B:25:0x005f, B:27:0x0066), top: B:40:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0066 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:4:0x0007, B:6:0x000d, B:8:0x0017, B:13:0x0027, B:15:0x002d, B:19:0x0042, B:21:0x004c, B:22:0x0051, B:23:0x0055, B:25:0x005f, B:27:0x0066), top: B:40:0x0007 }] */
    @Override // com.smartdigimkt.sdk.api.ISDMAdManager
    public void getBidTokenJSONObject(Map<String, Object> map, ISDMAdManager.BidTokenCallBack bidTokenCallBack) {
        if (map != null) {
            try {
                if (map.isEmpty()) {
                    if (com.smartdigimkt.m6.b.p().D()) {
                        Log.w("SDMAdManager", "getBidTokenJSONObject fail with empty extraMap");
                    }
                    if (bidTokenCallBack != null) {
                        bidTokenCallBack.onComplete(null);
                    }
                } else {
                    Object obj = map.get("sdm_load_data");
                    LoadInfoEntity loadInfoEntity = obj instanceof Bundle ? (LoadInfoEntity) com.smartdigimkt.n6.b.a((Bundle) obj, LoadInfoEntity.class) : null;
                    if (loadInfoEntity != null && loadInfoEntity.getRequestInfoEntity() != null) {
                        a(map, loadInfoEntity.getRequestInfoEntity().convertToBaseAdRequestInfo(), bidTokenCallBack);
                        com.smartdigimkt.k8.a.e().i();
                    } else if (bidTokenCallBack != null) {
                        if (com.smartdigimkt.m6.b.p().D()) {
                            Log.w("SDMAdManager", "getBidTokenJSONObject fail with loadInfoEntity == null");
                        }
                        bidTokenCallBack.onComplete(null);
                    }
                }
            } catch (Throwable th) {
                try {
                    if (com.smartdigimkt.m6.b.p().D()) {
                        Log.w("SDMAdManager", "getBidTokenJSONObject fail with empty Throwable:" + th.getMessage());
                    }
                    if (bidTokenCallBack != null) {
                        bidTokenCallBack.onComplete(null);
                    }
                } finally {
                    com.smartdigimkt.k8.a.e().i();
                }
            }
        } else {
            if (com.smartdigimkt.m6.b.p().D()) {
                Log.w("SDMAdManager", "getBidTokenJSONObject fail with empty extraMap");
            }
            if (bidTokenCallBack != null) {
                bidTokenCallBack.onComplete(null);
            }
        }
    }

    @Override // com.smartdigimkt.sdk.api.ISDMAdManager
    public JSONObject getDirectlyBidTokenJSONObject(Context context, Map<String, Object> map, Map<String, String> map2) {
        if (map2 != null) {
            try {
                if (!map2.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry<String, String> entry : map2.entrySet()) {
                        arrayList.add(entry.getKey());
                        com.smartdigimkt.q6.c.a(context).a(entry.getKey(), entry.getValue());
                    }
                    JSONObject jSONObject = new JSONObject();
                    List<j> listA = com.smartdigimkt.q6.c.a(context).a(arrayList);
                    if (listA.size() > 0) {
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        for (j jVar : listA) {
                            if (jVar.a() > 0) {
                                jSONObject2.put(jVar.e(), jVar.a());
                            }
                            if (jVar.c() > 0) {
                                jSONObject3.put(jVar.e(), jVar.c());
                            }
                        }
                        if (jSONObject2.length() > 0) {
                            jSONObject.put("o_cl", jSONObject2);
                        }
                        if (jSONObject3.length() > 0) {
                            jSONObject.put("o_im", jSONObject3);
                        }
                    }
                    return jSONObject;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static b a() {
        if (f37127b == null) {
            synchronized (b.class) {
                try {
                    if (f37127b == null) {
                        f37127b = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f37127b;
    }

    public void a(Map<String, Object> map, com.smartdigimkt.v6.a aVar, ISDMAdManager.BidTokenCallBack bidTokenCallBack) {
        c.d().a(new a(bidTokenCallBack, map, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:49:0x0136 A[Catch: all -> 0x0158, TryCatch #0 {all -> 0x0158, blocks: (B:47:0x010e, B:49:0x0136, B:50:0x013b, B:52:0x0153), top: B:59:0x010e }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0153 A[Catch: all -> 0x0158, TRY_LEAVE, TryCatch #0 {all -> 0x0158, blocks: (B:47:0x010e, B:49:0x0136, B:50:0x013b, B:52:0x0153), top: B:59:0x010e }] */
    public JSONObject a(Map<String, Object> map, com.smartdigimkt.v6.a aVar) {
        Object objC;
        if (aVar == null) {
            if (com.smartdigimkt.m6.b.p().D()) {
                Log.w("SDMAdManager", "createBidTokenJSONObject fail with baseAdRequestInfo == null");
            }
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("unit_id", aVar.f39166e);
            jSONObject.put("tpl_ver", c.d().g() ? 1 : 0);
            int i2 = aVar.s;
            if (i2 > 0) {
                List<com.smartdigimkt.p6.j> listB = d.b().b(i2);
                if (listB.size() > 0) {
                    jSONObject.put("exclude_ids", a(listB));
                }
            }
            int i3 = aVar.r;
            if (i3 > 0) {
                List<com.smartdigimkt.p6.j> listA = d.b().a(i3);
                if (listA.size() > 0) {
                    jSONObject.put("install_ids", a(listA));
                }
            }
            a(jSONObject, map, aVar.f39164b);
            f.c().a(aVar.f39163a, jSONObject);
            String strB = e.a().b();
            if (!TextUtils.isEmpty(strB)) {
                jSONObject.put(com.smartdigimkt.n7.a.f37119h, strB);
            }
            if (com.smartdigimkt.m6.b.p().a("sensor_deny")) {
                jSONObject.put("sensor_deny", 1);
            }
            int i4 = aVar.f39164b;
            try {
                if (i4 == 0) {
                    boolean zEquals = TextUtils.equals("1", com.smartdigimkt.n8.h.e(map, MBridgeConstans.PROPERTIES_LAYOUT_TYPE));
                    if (zEquals) {
                        a(jSONObject, c.d().a(map));
                    }
                    if (!zEquals) {
                        jSONObject.put("adp_accept_type", new JSONArray("[3]"));
                    }
                    jSONObject.put("unit_id", aVar.f39166e);
                    jSONObject.put("ad_source_id", aVar.f39166e);
                    jSONObject.put("nw_firm_id", aVar.j);
                    jSONObject.put("ad_format", String.valueOf(aVar.f39164b));
                    if (com.smartdigimkt.m6.b.p().F()) {
                        jSONObject.put("test", 1);
                    }
                    jSONObject.put("bidfloor", aVar.x);
                    jSONObject.put("p_bidfloor", aVar.y);
                    objC = com.smartdigimkt.m6.b.p().c();
                    if (objC != null) {
                        jSONObject.put("ecpoffer", objC);
                    }
                    return jSONObject;
                }
                if (i4 == 3) {
                    String strE = com.smartdigimkt.n8.h.e(map, "unit_type");
                    if (!TextUtils.isEmpty(strE)) {
                        jSONObject.put("unit_type", Integer.parseInt(strE));
                    }
                    String strE2 = com.smartdigimkt.n8.h.e(map, "inter_type");
                    if (!TextUtils.isEmpty(strE2)) {
                        jSONObject.put(com.smartdigimkt.n7.a.g, strE2);
                    }
                } else if (i4 == 4) {
                    jSONObject.put("get_offer", 2);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(4);
                    jSONArray.put(5);
                    jSONObject.put("ad_mtg_mix_type", jSONArray);
                }
                jSONObject.put("unit_id", aVar.f39166e);
                jSONObject.put("ad_source_id", aVar.f39166e);
                jSONObject.put("nw_firm_id", aVar.j);
                jSONObject.put("ad_format", String.valueOf(aVar.f39164b));
                if (com.smartdigimkt.m6.b.p().F()) {
                    jSONObject.put("test", 1);
                }
                jSONObject.put("bidfloor", aVar.x);
                jSONObject.put("p_bidfloor", aVar.y);
                objC = com.smartdigimkt.m6.b.p().c();
                if (objC != null) {
                    jSONObject.put("ecpoffer", objC);
                }
            } catch (Throwable unused) {
            }
            a(jSONObject, aVar.f39164b);
            return jSONObject;
        } catch (Throwable th) {
            if (!com.smartdigimkt.m6.b.p().D()) {
                return null;
            }
            Log.w("SDMAdManager", "createBidTokenJSONObject fail with throwable:" + th.getMessage(), th);
            return null;
        }
    }

    private JSONObject a(List<com.smartdigimkt.p6.j> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            HashMap map = new HashMap();
            for (com.smartdigimkt.p6.j jVar : list) {
                List arrayList = (List) map.get(jVar.a());
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(jVar.a(), arrayList);
                }
                arrayList.add(jVar.b());
            }
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), new JSONArray((Collection) entry.getValue()));
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private void a(JSONObject jSONObject, Map<String, Object> map, int i2) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        String string = map.get("size").toString();
                        if (TextUtils.isEmpty(string)) {
                            return;
                        }
                        String[] strArrSplit = string.split("x");
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        jSONObject.put("ad_width", i3);
                        jSONObject.put("ad_height", i4);
                        return;
                    }
                    if (i2 != 3 && i2 != 4) {
                        return;
                    }
                }
                jSONObject.put("ad_width", com.smartdigimkt.n8.c.j(com.smartdigimkt.m6.b.p().k()));
                jSONObject.put("ad_height", com.smartdigimkt.n8.c.i(com.smartdigimkt.m6.b.p().k()));
                return;
            }
            jSONObject.put("ad_width", com.smartdigimkt.n8.c.j(com.smartdigimkt.m6.b.p().k()));
            jSONObject.put("ad_height", com.smartdigimkt.n8.c.i(com.smartdigimkt.m6.b.p().k()));
        } catch (Throwable unused) {
        }
    }

    public void a(JSONObject jSONObject, int i2) {
        if (jSONObject != null) {
            try {
                JSONArray jSONArray = new JSONArray("[1,2,3]");
                if ((i2 == 1 || i2 == 3 || i2 == 4) && c.d().i()) {
                    jSONArray.put(4);
                }
                jSONObject.put("adp_accept_type", jSONArray);
                jSONObject.put("vst_m_v", new JSONArray("[1,2,3,4,5,6]"));
            } catch (Throwable unused) {
            }
        }
    }

    public void a(JSONObject jSONObject, JSONArray jSONArray) {
        if (jSONObject == null || jSONArray == null) {
            return;
        }
        try {
            JSONArray jSONArray2 = new JSONArray();
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                jSONArray2.put(jSONArray.getInt(i2));
            }
            jSONObject.put("nv_unit_type", jSONArray2);
        } catch (Throwable unused) {
        }
    }
}
