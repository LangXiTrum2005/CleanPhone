package com.mbridge.msdk.config.component.common.express.node;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class g extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d f31895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f31896b;

    public g(d dVar, d dVar2) {
        this.f31895a = dVar;
        this.f31896b = dVar2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objA = this.f31895a.a(dVar, eVar, aVar);
        Object objA2 = this.f31896b.a(dVar, eVar, aVar);
        HashMap map = new HashMap();
        map.put(objA, objA2);
        return map;
    }
}
