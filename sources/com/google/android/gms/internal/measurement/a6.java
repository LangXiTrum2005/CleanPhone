package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a6 extends p4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f23293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f23294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d8 f23295e;

    public a6(a6 a6Var) {
        super(a6Var.f23836a);
        ArrayList arrayList = new ArrayList(a6Var.f23293c.size());
        this.f23293c = arrayList;
        arrayList.addAll(a6Var.f23293c);
        ArrayList arrayList2 = new ArrayList(a6Var.f23294d.size());
        this.f23294d = arrayList2;
        arrayList2.addAll(a6Var.f23294d);
        this.f23295e = a6Var.f23295e;
    }

    @Override // com.google.android.gms.internal.measurement.p4
    public final b6 a(d8 d8Var, List list) {
        f6 f6Var;
        d8 d8VarD = this.f23295e.d();
        h6 h6Var = (h6) d8VarD.f23388c;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f23293c;
            int size = arrayList.size();
            f6Var = b6.S8;
            if (i10 >= size) {
                break;
            }
            if (i10 < list.size()) {
                d8VarD.g((String) arrayList.get(i10), ((h6) d8Var.f23388c).e(d8Var, (b6) list.get(i10)));
            } else {
                d8VarD.g((String) arrayList.get(i10), f6Var);
            }
            i10++;
        }
        for (b6 b6Var : this.f23294d) {
            b6 b6VarE = h6Var.e(d8VarD, b6Var);
            if (b6VarE instanceof c6) {
                b6VarE = h6Var.e(d8VarD, b6Var);
            }
            if (b6VarE instanceof t2) {
                return ((t2) b6VarE).f23979a;
            }
        }
        return f6Var;
    }

    @Override // com.google.android.gms.internal.measurement.p4, com.google.android.gms.internal.measurement.b6
    public final b6 zzt() {
        return new a6(this);
    }

    public a6(String str, ArrayList arrayList, List list, d8 d8Var) {
        super(str);
        this.f23293c = new ArrayList();
        this.f23295e = d8Var;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f23293c.add(((b6) it.next()).zzc());
            }
        }
        this.f23294d = new ArrayList(list);
    }
}
