package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends v0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f22907c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // com.google.android.gms.internal.auth.v0
    public final void a(long j10, Object obj) {
        Object objUnmodifiableList;
        List list = (List) x1.d(j10, obj);
        if (list instanceof s0) {
            objUnmodifiableList = ((s0) list).zze();
        } else {
            if (f22907c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof h1) && (list instanceof n0)) {
                d0 d0Var = (d0) ((n0) list);
                boolean z10 = d0Var.f22802a;
                if (z10 && z10) {
                    d0Var.f22802a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        x1.j(obj, j10, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.auth.v0
    public final void b(Object obj, long j10, Object obj2) {
        List list;
        List list2;
        List listF;
        List list3 = (List) x1.d(j10, obj2);
        int size = list3.size();
        List list4 = (List) x1.d(j10, obj);
        if (list4.isEmpty()) {
            if (list4 instanceof s0) {
                listF = new r0(size);
            } else {
                listF = ((list4 instanceof h1) && (list4 instanceof n0)) ? ((n0) list4).f(size) : new ArrayList(size);
            }
            x1.j(obj, j10, listF);
            list2 = listF;
        } else {
            if (f22907c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                x1.j(obj, j10, arrayList);
                list = arrayList;
            } else if (list4 instanceof s1) {
                r0 r0Var = new r0(list4.size() + size);
                r0Var.addAll(r0Var.f22903b.size(), (s1) list4);
                x1.j(obj, j10, r0Var);
                list = r0Var;
            } else if ((list4 instanceof h1) && (list4 instanceof n0)) {
                n0 n0Var = (n0) list4;
                if (!((d0) n0Var).f22802a) {
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    n0 n0VarF = n0Var.f(list4.size() + size);
                    x1.j(obj, j10, n0VarF);
                    list2 = n0VarF;
                }
            }
            list2 = list;
        }
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        x1.j(obj, j10, list3);
    }
}
