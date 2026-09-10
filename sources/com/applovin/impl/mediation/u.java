package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.a3;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapter;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8791d;

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, int i10) {
        this.f8788a = i10;
        this.f8789b = obj;
        this.f8790c = obj2;
        this.f8791d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8788a) {
            case 0:
                ((h.b) this.f8789b).a((MaxError) this.f8790c, (Bundle) this.f8791d);
                break;
            case 1:
                ((h.c) this.f8789b).a((MaxAdapter.InitializationStatus) this.f8790c, (String) this.f8791d);
                break;
            case 2:
                ((h) this.f8789b).a((String) this.f8790c, (Runnable) this.f8791d);
                break;
            default:
                ((h) this.f8789b).a((a3) this.f8790c, (Runnable) this.f8791d);
                break;
        }
    }
}
