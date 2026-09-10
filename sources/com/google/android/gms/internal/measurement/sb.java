package com.google.android.gms.internal.measurement;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sb implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ sb f23966a = new sb();

    @Override // java.util.concurrent.ThreadFactory
    public final /* synthetic */ Thread newThread(Runnable runnable) {
        Object obj = pb.f23842j;
        return new Thread(runnable, "ProcessStablePhenotypeFlag");
    }
}
