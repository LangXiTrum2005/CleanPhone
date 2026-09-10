package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class zzp implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ zzp f10896a = new zzp();

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        List list = RequestConfiguration.zza;
        return list.indexOf((String) obj) - list.indexOf((String) obj2);
    }
}
