package com.mbridge.msdk.config.global;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class a {
    public static com.mbridge.msdk.config.dynamic.binddata.wrapper.a a(com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        for (int i2 = 0; i2 < strArrSplit.length - 1; i2++) {
            if (!aVar.a((Object) strArrSplit[i2])) {
                com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar2 = new com.mbridge.msdk.config.dynamic.binddata.wrapper.a();
                aVar2.b(aVar.c());
                aVar.a(strArrSplit[i2], aVar2);
            }
            Object objB = aVar.b((Object) strArrSplit[i2]);
            if (objB instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) aVar.b((Object) strArrSplit[i2]);
            }
            if (objB instanceof Map) {
                com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar3 = new com.mbridge.msdk.config.dynamic.binddata.wrapper.a();
                aVar3.a((Map<? extends String, ?>) objB);
                aVar.a(strArrSplit[i2], aVar3);
                aVar = aVar3;
            }
        }
        return aVar;
    }
}
