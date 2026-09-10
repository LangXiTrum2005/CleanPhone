package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f31920a;

    public m(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f31920a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        try {
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("849"))) {
                return a();
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("850"))) {
                return d(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("851"))) {
                return f(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("852"))) {
                return c(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("853"))) {
                return a(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("854"))) {
                return e(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("855"))) {
                return e(obj);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("856"))) {
                return d(obj);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("857"))) {
                return g(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("858"))) {
                return a(obj);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("859"))) {
                return b(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("897"))) {
                return b(obj);
            }
            return str.equals(com.mbridge.msdk.config.component.common.util.c.c("898")) ? c(obj) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        } catch (Exception e10) {
            StringBuilder sbK = d5.u.k("Error handling map operation: ", str, ", ");
            sbK.append(e10.getMessage());
            q0.b("MapOperator", sbK.toString(), e10);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a c(Object obj, List<Object> list) {
        String strValueOf = (list == null || list.isEmpty()) ? "" : String.valueOf(list.get(0));
        if (!TextUtils.isEmpty(strValueOf)) {
            if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).b((Object) strValueOf));
            }
            if (obj instanceof Map) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(((Map) obj).get(strValueOf));
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a d(Object obj, List<Object> list) {
        Map<String, Object> mapA;
        String strValueOf = (list == null || list.isEmpty()) ? "" : String.valueOf(list.get(0));
        if (!TextUtils.isEmpty(strValueOf)) {
            try {
                mapA = new com.mbridge.msdk.config.dynamic.utils.e().a(new JSONObject(strValueOf));
            } catch (JSONException e10) {
                q0.b("MapOperator", e10.getMessage());
                mapA = null;
            }
            if (mapA != null) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(mapA);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a e(Object obj, List<Object> list) {
        String strValueOf = (list == null || list.isEmpty()) ? "" : String.valueOf(list.get(0));
        if (!TextUtils.isEmpty(strValueOf)) {
            if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj;
                aVar.c(strValueOf);
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(aVar);
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                map.remove(strValueOf);
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(map);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a f(Object obj, List<Object> list) {
        if (list != null && list.size() == 2) {
            String strValueOf = String.valueOf(list.get(0));
            Object obj2 = list.get(1);
            if (!TextUtils.isEmpty(strValueOf)) {
                if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj;
                    aVar.a(strValueOf.trim(), obj2);
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(aVar);
                }
                if (obj instanceof Map) {
                    Map map = (Map) obj;
                    map.put(strValueOf.trim(), obj2);
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(map);
                }
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.HashMap] */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a g(Object obj, List<Object> list) {
        ?? map;
        String str;
        boolean z10 = obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a;
        if (!z10 && !(obj instanceof Map)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (z10) {
            map = new HashMap();
            for (Map.Entry<String, Object> entry : ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a()) {
                map.put(entry.getKey(), entry.getValue());
            }
        } else {
            map = (Map) obj;
        }
        if (list != null && !list.isEmpty()) {
            str = "or".equals(String.valueOf(list.get(0)).trim().toLowerCase()) ? "or" : "and";
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = true;
        for (Map.Entry entry2 : map.entrySet()) {
            if (!z11) {
                wi.d.m(sb2, " ", str, " ");
            }
            sb2.append((String) entry2.getKey());
            sb2.append(X3.j.f27830b);
            sb2.append(entry2.getValue());
            z11 = false;
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(sb2.toString());
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        return a(str) ? a(str, obj, list) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(Object obj, List<Object> list) {
        String strValueOf;
        if (list != null && !list.isEmpty()) {
            strValueOf = String.valueOf(list.get(0));
        } else {
            strValueOf = "";
        }
        if (!TextUtils.isEmpty(strValueOf)) {
            if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a((Object) strValueOf)));
            }
            if (obj instanceof Map) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(((Map) obj).containsKey(strValueOf)));
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.HashMap] */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a d(Object obj) {
        ?? map;
        boolean z10 = obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a;
        if (!z10 && !(obj instanceof Map)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (z10) {
            map = new HashMap();
            for (Map.Entry<String, Object> entry : ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a()) {
                map.put(entry.getKey(), entry.getValue());
            }
        } else {
            map = (Map) obj;
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new JSONObject((Map) map).toString());
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a c(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            Collection<Object> collectionG = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).g();
            if (!collectionG.isEmpty()) {
                arrayList.addAll(collectionG);
            }
        }
        if (obj instanceof Map) {
            Collection collectionValues = ((Map) obj).values();
            if (!collectionValues.isEmpty()) {
                arrayList.addAll(collectionValues);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:15:0x003f, B:16:0x004d, B:18:0x0053, B:20:0x005b, B:23:0x0063, B:24:0x0086), top: B:28:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:20:0x005b A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:15:0x003f, B:16:0x004d, B:18:0x0053, B:20:0x005b, B:23:0x0063, B:24:0x0086), top: B:28:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0063 A[SYNTHETIC] */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a e(Object obj) {
        Map map;
        StringBuilder sb2;
        boolean z10;
        boolean z11 = obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a;
        if (!z11 && !(obj instanceof Map)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        try {
            if (z11) {
                HashMap map2 = new HashMap();
                Iterator<Map.Entry<String, Object>> it = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a().iterator();
                while (true) {
                    map = map2;
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<String, Object> next = it.next();
                    map2.put(next.getKey(), next.getValue());
                }
                sb2 = new StringBuilder();
                z10 = true;
                for (Map.Entry entry : map.entrySet()) {
                    if (!z10) {
                        sb2.append(X3.j.f27832c);
                    }
                    sb2.append(URLEncoder.encode((String) entry.getKey(), "UTF-8"));
                    sb2.append(X3.j.f27830b);
                    sb2.append(URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8"));
                    z10 = false;
                }
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(sb2.toString());
            }
            map = (Map) obj;
            sb2 = new StringBuilder();
            z10 = true;
            while (r0.hasNext()) {
                if (!z10) {
                    sb2.append(X3.j.f27832c);
                }
                sb2.append(URLEncoder.encode((String) entry.getKey(), "UTF-8"));
                sb2.append(X3.j.f27830b);
                sb2.append(URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8"));
                z10 = false;
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(sb2.toString());
        } catch (Throwable th2) {
            q0.b("MapOperator", "Error encoding URL parameters: " + th2.getMessage(), th2);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            Set<String> setE = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).e();
            if (!setE.isEmpty()) {
                arrayList.addAll(setE);
            }
        }
        if (obj instanceof Map) {
            Set setKeySet = ((Map) obj).keySet();
            if (!setKeySet.isEmpty()) {
                arrayList.addAll(setKeySet);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(arrayList);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a() {
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new HashMap());
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, List<Object> list) {
        Object obj2 = (list == null || list.isEmpty()) ? null : list.get(0);
        if (obj2 instanceof Map) {
            Map<? extends String, ?> map = (Map) obj2;
            if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a(map);
            } else if (obj instanceof Map) {
                ((Map) obj).putAll(map);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(obj);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj) {
        if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).f()));
        }
        if (obj instanceof Map) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(((Map) obj).size()));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(0);
    }

    private boolean a(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("849")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("850")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("851")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("852")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("853")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("854")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("855")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("856")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("857")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("858")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("859")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("897")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("898"));
    }
}
