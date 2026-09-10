package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hi extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f23553b;

    public hi(h hVar, h hVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(linkedHashMap, hVar);
        d(linkedHashMap, hVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((mh) entry.getKey()).f23755c) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.f23553b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void d(LinkedHashMap linkedHashMap, h hVar) {
        for (int i10 = 0; i10 < hVar.a(); i10++) {
            mh mhVarH = hVar.h(i10);
            Object obj = linkedHashMap.get(mhVarH);
            boolean z10 = mhVarH.f23755c;
            Class cls = mhVarH.f23754b;
            if (z10) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(mhVarH, arrayList);
                }
                arrayList.add(cls.cast(hVar.i(i10)));
            } else {
                linkedHashMap.put(mhVarH, cls.cast(hVar.i(i10)));
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final void a(di diVar, yh yhVar) {
        for (Map.Entry entry : this.f23553b.entrySet()) {
            mh mhVar = (mh) entry.getKey();
            Object value = entry.getValue();
            if (mhVar.f23755c) {
                diVar.b(mhVar, ((List) value).iterator(), yhVar);
            } else {
                diVar.a(mhVar, value, yhVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final int b() {
        return this.f23553b.size();
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final Set c() {
        return this.f23553b.keySet();
    }
}
