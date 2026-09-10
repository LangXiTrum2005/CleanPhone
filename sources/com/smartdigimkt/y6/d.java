package com.smartdigimkt.y6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    HashMap<String, List<b>> f40259a = new HashMap<>(2);

    public synchronized void a(String str, b bVar) {
        try {
            List<b> arrayList = this.f40259a.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f40259a.put(str, arrayList);
            }
            arrayList.add(bVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized b a(String str) {
        try {
            HashMap<String, List<b>> map = this.f40259a;
            b bVar = null;
            if (map == null) {
                return null;
            }
            List<b> list = map.get(str);
            if (list != null && list.size() != 0) {
                for (b bVar2 : list) {
                    double d = bVar2.f40232c;
                    if (bVar == null || d > bVar.f40232c) {
                        bVar = bVar2;
                    }
                }
                if (bVar != null) {
                    list.remove(bVar);
                }
                return bVar;
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
