package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzza implements Comparator {
    static final /* synthetic */ zzza zza = new zzza();

    private /* synthetic */ zzza() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        Integer num2 = (Integer) obj;
        int i2 = zzzu.zzb;
        if (num2.intValue() == -1) {
            return num.intValue() == -1 ? 0 : -1;
        }
        if (num.intValue() == -1) {
            return 1;
        }
        return num2.intValue() - num.intValue();
    }
}
