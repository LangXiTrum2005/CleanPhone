package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hc implements ta.z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ hc f23544b = new hc(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ hc f23545c = new hc(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23546a;

    public /* synthetic */ hc(int i10) {
        this.f23546a = i10;
    }

    @Override // ta.z
    public final ListenableFuture apply(Object obj) {
        switch (this.f23546a) {
            case 0:
                j9.e eVar = (j9.e) obj;
                throw new gc(eVar.f43728a.f11654a, eVar.getMessage(), eVar);
            case 1:
                throw null;
            default:
                return ta.k0.d("");
        }
    }
}
