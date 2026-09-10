package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class df1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f13512a = new CopyOnWriteArrayList();

    public static void a(String str) {
        Iterator it = f13512a.iterator();
        if (!it.hasNext()) {
            throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
        }
        throw com.google.android.gms.internal.measurement.f2.j(it);
    }
}
