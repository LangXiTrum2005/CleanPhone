package com.startapp.sdk.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class t {
    public static final t d = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f41492a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f41493b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f41494c = new HashMap();

    public final synchronized void a(s sVar) {
        try {
            this.f41492a.add(0, sVar);
            List arrayList = (List) this.f41493b.get(sVar.f41459b);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f41493b.put(sVar.f41459b, arrayList);
            }
            arrayList.add(0, sVar);
            List arrayList2 = (List) this.f41494c.get(sVar.f41460c);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.f41494c.put(sVar.f41460c, arrayList2);
            }
            arrayList2.add(0, sVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
