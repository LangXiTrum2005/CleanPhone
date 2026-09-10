package com.applovin.impl;

import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e9 implements u2.a, v0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppLovinCommunicatorSubscriber f7810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7811c;

    public /* synthetic */ e9(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, Object obj, int i10) {
        this.f7809a = i10;
        this.f7810b = appLovinCommunicatorSubscriber;
        this.f7811c = obj;
    }

    @Override // com.applovin.impl.u2.a
    public void a(l2 l2Var, t2 t2Var) {
        switch (this.f7809a) {
            case 0:
                ((g0) this.f7810b).a((List) this.f7811c, l2Var, t2Var);
                break;
            default:
                ((g7) this.f7810b).a((com.applovin.impl.sdk.l) this.f7811c, l2Var, t2Var);
                break;
        }
    }

    @Override // com.applovin.impl.v0.c
    public void a(v0.b bVar) {
        ((v0) this.f7810b).a((v0.c) this.f7811c, bVar);
    }
}
