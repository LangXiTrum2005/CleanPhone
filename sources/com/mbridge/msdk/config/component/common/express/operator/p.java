package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f31924a;

    public p(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f31924a = cVar;
    }

    private Object a(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" and (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(" ");
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        sb2.append(" )");
        return sb2.toString();
    }

    private Object b() {
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new String());
    }

    private Object c(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" group by");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(" ");
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030 A[PHI: r2
  0x0030: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v12 java.lang.String) binds: [B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    private Object d(String str, Object obj, List<Object> list) {
        Map map;
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        String strValueOf = "";
        if (list.size() != 2) {
            map = null;
        } else {
            Object obj2 = list.get(0);
            strValueOf = obj2 != null ? String.valueOf(obj2) : "";
            Object obj3 = list.get(1);
            if (obj3 instanceof Map) {
                map = (Map) obj3;
            } else {
                map = null;
            }
        }
        if (TextUtils.isEmpty(strValueOf) || map == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        sb2.append(" insert into ".concat(strValueOf));
        StringBuilder sb3 = new StringBuilder(" (");
        StringBuilder sb4 = new StringBuilder(" VALUES (");
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Object obj4 = map.get(str2);
            sb3.append(str2);
            if (obj4 == null) {
                sb4.append("NULL");
            } else if (obj4 instanceof Number) {
                sb4.append(obj4);
            } else {
                sb4.append("'");
                sb4.append(a(obj4.toString()));
                sb4.append("'");
            }
            if (it.hasNext()) {
                sb3.append(",");
                sb4.append(",");
            } else {
                sb3.append(" )");
                sb4.append(" )");
            }
        }
        sb2.append(sb3.toString());
        sb2.append(sb4.toString());
        return sb2.toString();
    }

    private Object e(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" limit");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(" ");
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        return sb2.toString();
    }

    private Object f(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" or (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(" ");
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        sb2.append(" )");
        return sb2.toString();
    }

    private Object g(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" order by");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(" ");
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        return sb2.toString();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a h(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        try {
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("829"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(b());
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("830"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(j(str, obj, list));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("831"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(b(str, obj, list));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("832"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(l(str, obj, list));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("833"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(str, obj, list));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("834"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(f(str, obj, list));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("835"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(g(str, obj, list));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("836"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(c(str, obj, list));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("837"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a());
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("838"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(k(str, obj, list));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("839"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(d(str, obj, list));
            }
            return str.equals(com.mbridge.msdk.config.component.common.util.c.c("840")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(e(str, obj, list)) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        } catch (Exception e10) {
            q0.b("SQLOperator", e10.getMessage(), e10);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    private Object j(String str, Object obj, List<Object> list) {
        if (list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder("select");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(" ");
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030 A[PHI: r1
  0x0030: PHI (r1v1 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    private Object k(String str, Object obj, List<Object> list) {
        Map map;
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        String strValueOf = "";
        if (list.size() != 2) {
            map = null;
        } else {
            Object obj2 = list.get(0);
            strValueOf = obj2 != null ? String.valueOf(obj2) : "";
            Object obj3 = list.get(1);
            if (obj3 instanceof Map) {
                map = (Map) obj3;
            } else {
                map = null;
            }
        }
        if (TextUtils.isEmpty(strValueOf) || map == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        sb2.append("update ");
        sb2.append(strValueOf);
        sb2.append(" set");
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            wi.d.m(sb2, " ", str2, X3.j.f27830b);
            sb2.append(map.get(str2));
            if (it.hasNext()) {
                sb2.append(",");
            }
        }
        return sb2.toString();
    }

    private Object l(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" where");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(" ");
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        return sb2.toString();
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a i(String str, Object obj, List<Object> list) {
        return b(str) ? h(str, obj, list) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private Object b(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" from");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(" ");
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        return sb2.toString();
    }

    private Object a() {
        return new StringBuilder(" delete ");
    }

    private boolean b(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("829")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("830")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("831")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("832")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("833")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("834")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("835")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("836")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("837")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("838")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("839")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("840"));
    }

    private String a(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("'", "''");
    }
}
