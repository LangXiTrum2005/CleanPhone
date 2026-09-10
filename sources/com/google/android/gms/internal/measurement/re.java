package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jf f23935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public oa.j0 f23936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f23937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Uri f23938d;

    public ArrayList a(OutputStream outputStream) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        ArrayList arrayList2 = this.f23937c;
        if (!arrayList2.isEmpty()) {
            int i10 = qe.f23899b;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                throw f2.j(it);
            }
            qe qeVar = !arrayList3.isEmpty() ? new qe(outputStream, arrayList3) : null;
            if (qeVar != null) {
                arrayList.add(qeVar);
            }
        }
        Iterator it2 = this.f23936b.iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
            return arrayList;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        }
        throw null;
    }
}
