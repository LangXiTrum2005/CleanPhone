package com.mbridge.msdk.config.component.common.express.node;

import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set<String> f31883d = Set.of(X3.j.f27830b, "+=", "-=", "*=", "/=", "%=");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f31884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f31885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    d f31886c;

    public b(String str, d dVar, d dVar2) {
        this.f31884a = str;
        this.f31885b = dVar;
        this.f31886c = dVar2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objA = this.f31885b.a(dVar, com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT, aVar);
        Object objA2 = this.f31886c.a(dVar, eVar, aVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(objA2);
        return dVar.a(objA, arrayList, this.f31884a, aVar);
    }
}
