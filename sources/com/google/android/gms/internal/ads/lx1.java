package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class lx1 implements gx1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f17149c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f17151b;

    static {
        hx1.a(Collections.EMPTY_SET);
    }

    public /* synthetic */ lx1(List list, List list2) {
        this.f17150a = list;
        this.f17151b = list2;
    }

    public static f81 a(int i10, int i11) {
        return new f81(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.kx1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        List list = this.f17150a;
        int size = list.size();
        List list2 = this.f17151b;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Collection collection = (Collection) ((kx1) list2.get(i10)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i11 = 0; i11 < size3; i11++) {
            Object objZzb = ((kx1) list.get(i11)).zzb();
            objZzb.getClass();
            hashSet.add(objZzb);
        }
        int size4 = arrayList.size();
        for (int i12 = 0; i12 < size4; i12++) {
            for (Object obj : (Collection) arrayList.get(i12)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
