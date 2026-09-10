package com.mbridge.msdk.config.component.common.express.node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d f31890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f31891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    List<d> f31892c;

    public e(d dVar, String str, List<d> list) {
        this.f31890a = dVar;
        this.f31891b = str;
        this.f31892c = list;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (this.f31892c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (Arrays.asList(com.mbridge.msdk.config.component.common.util.c.c("876"), com.mbridge.msdk.config.component.common.util.c.c("877"), com.mbridge.msdk.config.component.common.util.c.c("878")).contains(this.f31891b)) {
            arrayList.add(new com.mbridge.msdk.config.component.common.express.operator.parts.b(dVar, eVar, this.f31892c.get(0), aVar));
            for (int i10 = 1; i10 < this.f31892c.size(); i10++) {
                arrayList.add(this.f31892c.get(i10).a(dVar, eVar, aVar));
            }
        } else {
            Iterator<d> it = this.f31892c.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a(dVar, eVar, aVar));
            }
        }
        return dVar.a(this.f31890a.a(dVar, eVar, aVar), arrayList, this.f31891b, aVar);
    }
}
