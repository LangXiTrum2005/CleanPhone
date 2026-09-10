package com.p004ironsource;

import com.p004ironsource.mediationsdk.p;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class O implements InterfaceC3348c0, p.c, n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24212b;

    public /* synthetic */ O(Object obj, int i2) {
        this.f24211a = i2;
        this.f24212b = obj;
    }

    @Override // com.p004ironsource.n6
    public l6 a(boolean z2) {
        return v5.a((v5) this.f24212b, z2);
    }

    @Override // com.p004ironsource.InterfaceC3348c0
    public AbstractC3389z a(C3344a0 c3344a0, C3357g0 c3357g0) {
        switch (this.f24211a) {
            case 0:
                return ho.a((ho) this.f24212b, c3344a0, c3357g0);
            case 1:
                return l6.a((l6) this.f24212b, c3344a0, c3357g0);
            default:
                return qd.a((qd) this.f24212b, c3344a0, c3357g0);
        }
    }

    @Override // com.ironsource.mediationsdk.p.c
    public void a(String str) {
        ot.a((Ref.ObjectRef) this.f24212b, str);
    }
}
