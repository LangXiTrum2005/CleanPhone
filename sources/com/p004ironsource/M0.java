package com.p004ironsource;

import com.p004ironsource.sdk.controller.f;
import com.p004ironsource.sdk.controller.l;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class M0 implements l.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wn f24206b;

    public /* synthetic */ M0(wn wnVar, int i2) {
        this.f24205a = i2;
        this.f24206b = wnVar;
    }

    @Override // com.ironsource.sdk.controller.l.a
    public final void a(f.a aVar) {
        switch (this.f24205a) {
            case 0:
                wn.a(this.f24206b, aVar);
                break;
            default:
                wn.b(this.f24206b, aVar);
                break;
        }
    }
}
