package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f31919a;

    public l(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f31919a = cVar;
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str) || !(str.contains(com.mbridge.msdk.config.component.common.util.c.c("882")) || str.contains(com.mbridge.msdk.config.component.common.util.c.c("883")))) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        boolean z10 = false;
        boolean zA = (list == null || list.isEmpty()) ? false : a(list.get(0));
        boolean zA2 = a(obj);
        if (!str.equals(com.mbridge.msdk.config.component.common.util.c.c("882"))) {
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("883"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(zA2 || zA));
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        if (zA2 && zA) {
            z10 = true;
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(z10));
    }

    private boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (!(obj instanceof String)) {
            return (obj instanceof Number) && ((Number) obj).intValue() == 1;
        }
        String str = (String) obj;
        return "1".equals(str) || com.ironsource.mediationsdk.metadata.a.f29610g.equalsIgnoreCase(str);
    }
}
