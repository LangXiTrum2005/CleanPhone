package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f21194a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f21195b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f21196c = new ArrayList();

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f21195b.iterator();
        while (it.hasNext()) {
            String str = (String) zzba.zzc().a((ul) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        rb0.y(arrayList2, new pb(4, "gad:dynamite_module:experiment_id", ""));
        rb0.y(arrayList2, pi1.f18674i);
        rb0.y(arrayList2, pi1.f18675j);
        rb0.y(arrayList2, pi1.f18676k);
        rb0.y(arrayList2, pi1.l);
        rb0.y(arrayList2, pi1.f18677m);
        rb0.y(arrayList2, pi1.C);
        rb0.y(arrayList2, pi1.f18678n);
        rb0.y(arrayList2, pi1.f18685u);
        rb0.y(arrayList2, pi1.f18686v);
        rb0.y(arrayList2, pi1.f18687w);
        rb0.y(arrayList2, pi1.f18688x);
        rb0.y(arrayList2, pi1.f18689y);
        rb0.y(arrayList2, pi1.f18690z);
        rb0.y(arrayList2, pi1.A);
        rb0.y(arrayList2, pi1.B);
        rb0.y(arrayList2, pi1.f18679o);
        rb0.y(arrayList2, pi1.f18680p);
        rb0.y(arrayList2, pi1.f18681q);
        rb0.y(arrayList2, pi1.f18682r);
        rb0.y(arrayList2, pi1.f18683s);
        rb0.y(arrayList2, pi1.f18684t);
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final ArrayList b() {
        ArrayList arrayListA = a();
        Iterator it = this.f21196c.iterator();
        while (it.hasNext()) {
            String str = (String) zzba.zzc().a((ul) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayListA.add(str);
            }
        }
        ArrayList arrayList = new ArrayList();
        rb0.y(arrayList, dv.f13732d);
        arrayListA.addAll(arrayList);
        return arrayListA;
    }
}
