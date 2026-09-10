package com.smartdigimkt.w6;

import android.text.TextUtils;
import com.applovin.impl.Z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a> f39556a = new ArrayList();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f39557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f39558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map<String, Long> f39559c;

        public a(String str, long j) {
            this.f39557a = str;
            this.f39558b = j;
        }

        public String a() {
            return this.f39557a;
        }

        public long b() {
            return this.f39558b;
        }

        public Map<String, Long> c() {
            return this.f39559c;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{errorCode='");
            sb.append(this.f39557a);
            sb.append("', errorCodeInterval=");
            sb.append(this.f39558b);
            sb.append(", msgMap=");
            return Z.o(sb, this.f39559c, AbstractJsonLexerKt.END_OBJ);
        }

        public void a(Map<String, Long> map) {
            this.f39559c = map;
        }
    }

    public i(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject != null) {
            try {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    try {
                        String next = itKeys.next();
                        if (!TextUtils.isEmpty(next) && (jSONObjectOptJSONObject = jSONObject.optJSONObject(next)) != null) {
                            a aVar = new a(next, jSONObjectOptJSONObject.optLong("c_t", 0L));
                            try {
                                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("msg");
                                if (jSONObjectOptJSONObject2 != null) {
                                    HashMap map = new HashMap();
                                    Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                    while (itKeys2.hasNext()) {
                                        try {
                                            String next2 = itKeys2.next();
                                            if (!TextUtils.isEmpty(next2)) {
                                                long jOptLong = jSONObjectOptJSONObject2.optLong(next2, 0L);
                                                if (jOptLong > 0) {
                                                    map.put(next2, Long.valueOf(jOptLong));
                                                }
                                            }
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    if (!map.isEmpty()) {
                                        aVar.a(map);
                                    }
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            this.f39556a.add(aVar);
                        }
                    } catch (Throwable unused2) {
                    }
                }
            } catch (Throwable unused3) {
            }
        }
    }

    public List<a> a() {
        return this.f39556a;
    }
}
