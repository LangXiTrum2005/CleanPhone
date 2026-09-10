package com.smartdigimkt.e0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e f34602a;

    public f(String str) {
        e eVar = new e();
        eVar.a(str);
        eVar.a(a.AD_ROOT);
        List<e> listB = b();
        if (listB != null && listB.size() > 0) {
            eVar.a(listB);
        }
        this.f34602a = eVar;
    }

    public e a() {
        return this.f34602a;
    }

    public abstract List<e> b();

    public e a(ArrayList<e> arrayList, a aVar, String str) {
        e eVar = new e();
        eVar.a(aVar);
        eVar.a(str);
        arrayList.add(eVar);
        return eVar;
    }
}
