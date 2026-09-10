package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f17867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f17868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wo0 f17869c;

    public nn0(wo0 wo0Var, y yVar, Executor executor) {
        this.f17869c = wo0Var;
        this.f17867a = new WeakReference(yVar);
        this.f17868b = executor;
    }
}
