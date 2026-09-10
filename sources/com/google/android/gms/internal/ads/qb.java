package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f19014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f19018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f19019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f19020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f19021h;

    public qb(String str, String str2, long j10, long j11, long j12, long j13, List list) {
        this.f19015b = str;
        this.f19016c = true == "".equals(str2) ? null : str2;
        this.f19017d = j10;
        this.f19018e = j11;
        this.f19019f = j12;
        this.f19020g = j13;
        this.f19021h = list;
    }

    public static qb a(rb rbVar) throws IOException {
        if (tb.g(rbVar) != 538247942) {
            throw new IOException();
        }
        String strK = tb.k(rbVar);
        String strK2 = tb.k(rbVar);
        long jI = tb.i(rbVar);
        long jI2 = tb.i(rbVar);
        long jI3 = tb.i(rbVar);
        long jI4 = tb.i(rbVar);
        int iG = tb.g(rbVar);
        if (iG < 0) {
            throw new IOException(l1.d.k(new StringBuilder(String.valueOf(iG).length() + 20), "readHeaderList size=", iG));
        }
        List arrayList = iG == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i10 = 0; i10 < iG; i10++) {
            arrayList.add(new bb(tb.k(rbVar).intern(), tb.k(rbVar).intern()));
        }
        return new qb(strK, strK2, jI, jI2, jI3, jI4, arrayList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    public qb(String str, wa waVar) {
        String str2 = waVar.f21470b;
        long j10 = waVar.f21471c;
        long j11 = waVar.f21472d;
        long j12 = waVar.f21473e;
        long j13 = waVar.f21474f;
        ?? arrayList = waVar.f21476h;
        if (arrayList == 0) {
            Map map = waVar.f21475g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new bb((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j10, j11, j12, j13, arrayList);
    }
}
