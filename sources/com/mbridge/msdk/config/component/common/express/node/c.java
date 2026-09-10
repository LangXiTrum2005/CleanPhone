package com.mbridge.msdk.config.component.common.express.node;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f31887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f31888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    d f31889c;

    public c(String str, d dVar, d dVar2) {
        this.f31887a = str;
        this.f31888b = dVar;
        this.f31889c = dVar2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objA = this.f31888b.a(dVar, eVar, aVar);
        Object objA2 = this.f31889c.a(dVar, eVar, aVar);
        if (eVar != com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(objA2);
            return dVar.a(objA, arrayList, this.f31887a, aVar);
        }
        com.mbridge.msdk.config.component.common.express.entities.a aVar2 = new com.mbridge.msdk.config.component.common.express.entities.a();
        if (!(objA instanceof com.mbridge.msdk.config.component.common.express.entities.a)) {
            return null;
        }
        com.mbridge.msdk.config.component.common.express.entities.a aVar3 = (com.mbridge.msdk.config.component.common.express.entities.a) objA;
        String strA = aVar3.a();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(objA2);
        Object objA3 = dVar.a(aVar3, arrayList2, this.f31887a, aVar);
        aVar2.a(strA);
        aVar2.a(objA3);
        return aVar2;
    }
}
