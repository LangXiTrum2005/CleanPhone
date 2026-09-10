package com.google.android.gms.internal.measurement;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23972a;

    public /* synthetic */ t(int i10) {
        this.f23972a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f23972a) {
            case 0:
                int iA = com.applovin.impl.ca.a(obj);
                int iA2 = com.applovin.impl.ca.a(obj2);
                if (iA != iA2) {
                    return v0.i.a(iA, iA2);
                }
                int iC = v0.i.c(iA);
                if (iC == 0) {
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                if (iC == 1) {
                    return ((String) obj).compareTo((String) obj2);
                }
                if (iC == 2) {
                    return ((Long) obj).compareTo((Long) obj2);
                }
                if (iC == 3) {
                    return ((Double) obj).compareTo((Double) obj2);
                }
                throw null;
            default:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
        }
    }
}
