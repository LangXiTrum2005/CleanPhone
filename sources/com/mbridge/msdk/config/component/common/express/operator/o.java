package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f31923a;

    public o(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f31923a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        try {
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("880"))) {
                return a(obj, list);
            }
            return str.equals(com.mbridge.msdk.config.component.common.util.c.c("881")) ? a(obj, list, aVar) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        } catch (Exception e10) {
            StringBuilder sbK = d5.u.k("Error handling object operation: ", str, ", ");
            sbK.append(e10.getMessage());
            q0.b("OperatorObject", sbK.toString(), e10);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        return (str.equals(com.mbridge.msdk.config.component.common.util.c.c("880")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("881"))) ? a(str, obj, list, aVar) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, List<Object> list) {
        if (obj == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(0);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(1);
    }

    private synchronized com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, List<Object> list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        String strSubstring;
        if (list != null) {
            try {
                if (list.size() == 3) {
                    try {
                        boolean z10 = ((Integer) list.get(0)).intValue() == 1;
                        if (z10) {
                            strSubstring = (String) list.get(1);
                        } else {
                            strSubstring = (String) list.get(2);
                        }
                        if (strSubstring.startsWith("\"") && strSubstring.endsWith("\"") && strSubstring.replace("\\\"", "").split("\"").length == 2) {
                            strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                        }
                        if (!TextUtils.isEmpty(strSubstring)) {
                            new com.mbridge.msdk.config.component.common.express.d().a(strSubstring, aVar);
                        }
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(z10));
                    } catch (Exception e10) {
                        q0.a("OperatorObject", e10.getMessage());
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.FALSE);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.FALSE);
    }
}
