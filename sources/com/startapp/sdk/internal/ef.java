package com.startapp.sdk.internal;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class ef extends kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f40938a;

    public ef(LinkedList linkedList) {
        this.f40938a = linkedList;
    }

    @Override // com.startapp.sdk.internal.kf
    public final boolean a(Object obj) {
        if (obj instanceof x9) {
            return this.f40938a.contains(((x9) obj).j0.f40999a);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ef.class != obj.getClass()) {
            return false;
        }
        LinkedList linkedList = this.f40938a;
        LinkedList linkedList2 = ((ef) obj).f40938a;
        WeakHashMap weakHashMap = vi.f41589a;
        return linkedList.equals(linkedList2);
    }

    public final int hashCode() {
        Object[] objArr = {this.f40938a};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }
}
