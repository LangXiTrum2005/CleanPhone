package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.ironsource.X3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f31903a;

    public d(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f31903a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        String strA;
        Object objB;
        Object objA = a(list);
        if (obj instanceof com.mbridge.msdk.config.component.common.express.entities.a) {
            com.mbridge.msdk.config.component.common.express.entities.a aVar = (com.mbridge.msdk.config.component.common.express.entities.a) obj;
            strA = aVar.a();
            objB = aVar.b();
        } else {
            strA = "";
            objB = null;
        }
        if (TextUtils.isEmpty(strA) || !(objB instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        Object objB2 = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) objB).b((Object) strA);
        if (objB2 == null || TextUtils.isEmpty(strA)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) objB2).a(strA, objA);
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(objA);
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        String strTrim = str.trim();
        return strTrim.equals(X3.j.f27830b) ? b(strTrim, obj, list) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private Object a(List<Object> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
