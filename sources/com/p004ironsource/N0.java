package com.p004ironsource;

import android.app.Activity;
import com.p004ironsource.sdk.controller.f;
import com.p004ironsource.sdk.controller.l;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class N0 implements l.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wn f24209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24210c;

    public /* synthetic */ N0(wn wnVar, Object obj, int i2) {
        this.f24208a = i2;
        this.f24209b = wnVar;
        this.f24210c = obj;
    }

    @Override // com.ironsource.sdk.controller.l.a
    public final void a(f.a aVar) {
        switch (this.f24208a) {
            case 0:
                wn.a(this.f24209b, (Activity) this.f24210c, aVar);
                break;
            default:
                wn.a(this.f24209b, (zh) this.f24210c, aVar);
                break;
        }
    }
}
