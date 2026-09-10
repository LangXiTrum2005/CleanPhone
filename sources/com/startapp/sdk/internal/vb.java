package com.startapp.sdk.internal;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class vb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f41575a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f41576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f41577c;

    public vb(lb lbVar, lb lbVar2) {
        this.f41576b = lbVar;
        this.f41577c = lbVar2;
    }

    public final ub a(String str) {
        if (this.f41575a.containsKey(str)) {
            return (ub) this.f41575a.get(str);
        }
        ub ubVar = new ub(new d9(this.f41576b, this.f41577c));
        this.f41575a.put(str, ubVar);
        return ubVar;
    }
}
