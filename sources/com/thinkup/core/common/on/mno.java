package com.thinkup.core.common.on;

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
public final class mno {
    private final List<o> o = new ArrayList();

    public static class o {
        private final long m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Map<String, Long> f42203n;
        private final String o;

        public o(String str, long j) {
            this.o = str;
            this.m = j;
        }

        public final long m() {
            return this.m;
        }

        public final Map<String, Long> n() {
            return this.f42203n;
        }

        public final String o() {
            return this.o;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{errorCode='");
            sb.append(this.o);
            sb.append("', errorCodeInterval=");
            sb.append(this.m);
            sb.append(", msgMap=");
            return Z.o(sb, this.f42203n, AbstractJsonLexerKt.END_OBJ);
        }

        public final void o(Map<String, Long> map) {
            this.f42203n = map;
        }
    }

    public mno(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject != null) {
            try {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    try {
                        String next = itKeys.next();
                        if (!TextUtils.isEmpty(next) && (jSONObjectOptJSONObject = jSONObject.optJSONObject(next)) != null) {
                            o oVar = new o(next, jSONObjectOptJSONObject.optLong("c_t", 0L));
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
                                        oVar.o(map);
                                    }
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            this.o.add(oVar);
                        }
                    } catch (Throwable unused2) {
                    }
                }
            } catch (Throwable unused3) {
            }
        }
    }

    public final List<o> o() {
        return this.o;
    }
}
