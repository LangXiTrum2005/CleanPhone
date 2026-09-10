package com.smartdigimkt.k8;

import android.text.TextUtils;
import android.util.Pair;
import com.smartdigimkt.sdk.api.AdError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f36264b = "b";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile b f36265c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f36266a = new Object();

    public interface a {
        void a();

        void a(com.smartdigimkt.v7.a aVar);

        void a(List<com.smartdigimkt.y6.b> list);

        void b();
    }

    private b() {
    }

    public static b b() {
        if (f36265c == null) {
            synchronized (b.class) {
                try {
                    if (f36265c == null) {
                        f36265c = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f36265c;
    }

    public void a(com.smartdigimkt.c8.e eVar, a aVar) {
        if (eVar == null) {
            if (aVar != null) {
                aVar.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39189h, "The loaderEntity or bidReqListener is null."));
            }
        } else {
            if (aVar == null) {
                return;
            }
            com.smartdigimkt.l8.e eVarO = eVar.o();
            if (eVarO == null) {
                aVar.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39189h, "The placeStrategy is null."));
                return;
            }
            try {
                new com.smartdigimkt.b8.e(eVar).a(0, (com.smartdigimkt.w7.c) new C0523b(eVarO.I(), aVar));
            } catch (Throwable th) {
                aVar.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39189h, "start bid request with an exception." + th));
            }
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.k8.b$b, reason: collision with other inner class name */
    public static class C0523b implements com.smartdigimkt.w7.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f36267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f36268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map<String, com.smartdigimkt.b8.e> f36269c;

        public C0523b(String str, a aVar) {
            this.f36267a = str;
            this.f36268b = aVar;
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, Object obj) {
            try {
                Pair<com.smartdigimkt.v7.a, List<com.smartdigimkt.y6.b>> pairA = a(obj);
                com.smartdigimkt.v7.a aVar = (com.smartdigimkt.v7.a) pairA.first;
                if (aVar != null) {
                    this.f36268b.a(aVar);
                } else {
                    this.f36268b.a((List<com.smartdigimkt.y6.b>) pairA.second);
                }
            } catch (Throwable th) {
                this.f36268b.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39189h, "onLoadFinish in error." + th));
            }
            Map<String, com.smartdigimkt.b8.e> map = this.f36269c;
            if (map != null) {
                map.remove(this.f36267a);
            }
        }

        @Override // com.smartdigimkt.w7.c
        public void b(int i2) {
            this.f36268b.b();
        }

        public C0523b(String str, a aVar, Map<String, com.smartdigimkt.b8.e> map) {
            this.f36267a = str;
            this.f36268b = aVar;
            this.f36269c = map;
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, String str, AdError adError) {
            if (adError != null) {
                this.f36268b.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39189h, adError.getErrorInfo()));
            } else {
                this.f36268b.a(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39189h, str));
            }
            Map<String, com.smartdigimkt.b8.e> map = this.f36269c;
            if (map != null) {
                map.remove(this.f36267a);
            }
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2) {
            this.f36268b.a();
            Map<String, com.smartdigimkt.b8.e> map = this.f36269c;
            if (map != null) {
                map.remove(this.f36267a);
            }
        }

        private Pair<com.smartdigimkt.v7.a, List<com.smartdigimkt.y6.b>> a(Object obj) {
            String string;
            ArrayList arrayList = new ArrayList();
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
                int iOptInt = jSONObject.optInt("code", 0);
                String strOptString = jSONObject.optString("msg", "");
                if (iOptInt == 0 && jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        com.smartdigimkt.y6.b bVarA = com.smartdigimkt.y6.b.a(jSONArrayOptJSONArray.optJSONObject(i2));
                        if (bVarA != null) {
                            if (!TextUtils.isEmpty(bVarA.f)) {
                                if (!TextUtils.isEmpty(bVarA.r)) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    try {
                                        jSONObject2.put("unit_id", bVarA.r);
                                        jSONObject2.put("error_msg", bVarA.f);
                                        jSONArray.put(jSONObject2);
                                    } catch (Throwable unused) {
                                    }
                                }
                            } else {
                                arrayList.add(bVarA);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return new Pair<>(null, arrayList);
                    }
                    if (jSONArray.length() > 0) {
                        string = jSONArray.toString();
                    } else {
                        string = "parse bidding result failed.";
                    }
                    return new Pair<>(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39189h, string), arrayList);
                }
                Pair<com.smartdigimkt.v7.a, List<com.smartdigimkt.y6.b>> pair = new Pair<>(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39189h, iOptInt + " " + strOptString), arrayList);
                String unused2 = b.f36264b;
                return pair;
            }
            return new Pair<>(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39189h, "The result is not a JSONObject."), arrayList);
        }
    }
}
