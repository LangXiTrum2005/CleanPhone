package com.mbridge.msdk.dycreator.viewobserver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends com.mbridge.msdk.dycreator.observable.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Object> f33313a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ConcurrentHashMap<Integer, Object> f33314b = new ConcurrentHashMap<>();

    public synchronized void a(Object obj, int i10) {
        if (obj != null) {
            ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f33314b;
            if (concurrentHashMap != null && !concurrentHashMap.containsValue(obj)) {
                this.f33314b.put(Integer.valueOf(i10), obj);
            }
        }
    }

    public synchronized void a() {
        this.f33314b.clear();
    }
}
