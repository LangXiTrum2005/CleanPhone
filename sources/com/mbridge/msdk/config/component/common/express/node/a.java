package com.mbridge.msdk.config.component.common.express.node;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List<d> f31882a;

    public a(List<d> list) {
        this.f31882a = list;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<d> it = this.f31882a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a(dVar, eVar, aVar));
        }
        return arrayList;
    }
}
