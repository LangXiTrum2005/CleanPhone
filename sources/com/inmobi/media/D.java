package com.inmobi.media;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class D implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        B4 b4 = (B4) obj2;
        B4 b5 = (B4) obj;
        return ComparisonsKt.a(Integer.valueOf(b4.f22718c * b4.d), Integer.valueOf(b5.f22718c * b5.d));
    }
}
