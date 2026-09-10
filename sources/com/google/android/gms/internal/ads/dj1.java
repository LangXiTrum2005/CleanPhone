package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dj1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zq1 f13570b = zq1.a(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f13571a;

    public final Iterable a(byte[] bArr) {
        List list;
        zq1 zq1Var = f13570b;
        HashMap map = this.f13571a;
        List list2 = (List) map.get(zq1Var);
        if (bArr.length >= 5) {
            int length = bArr.length;
            list = (List) map.get(new zq1(bArr, 5 > length ? length : 5));
        } else {
            list = null;
        }
        if (list2 == null && list == null) {
            return new ArrayList();
        }
        if (list2 == null) {
            return list;
        }
        return list == null ? list2 : new bj1(this, list, list2);
    }
}
