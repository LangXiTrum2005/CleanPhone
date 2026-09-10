package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hk0 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15317b;

    public /* synthetic */ hk0(Object obj, int i10) {
        this.f15316a = i10;
        this.f15317b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = this.f15316a;
        Object obj = this.f15317b;
        switch (i10) {
            case 0:
                mk0 mk0Var = (mk0) obj;
                xi0 xi0Var = (xi0) mk0Var.f17463e;
                xi0Var.getClass();
                for (mj0 mj0Var : (CopyOnWriteArraySet) mk0Var.f17464f) {
                    if (!mj0Var.f17457d && mj0Var.f17456c) {
                        z02 z02VarD = mj0Var.f17455b.d();
                        mj0Var.f17455b = new t02(0);
                        mj0Var.f17456c = false;
                        xi0Var.a(mj0Var.f17454a, z02VarD);
                    }
                    ys0 ys0Var = (ys0) mk0Var.f17462d;
                    ys0Var.getClass();
                    if (ys0Var.f22362a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) obj;
                dVar.getClass();
                int i11 = message.what;
                if (i11 == 1) {
                    ((br0) dVar.f22986f).b();
                    return true;
                }
                if (i11 == 2) {
                    ((gr0) dVar.f22987g).b();
                    return true;
                }
                if (i11 == 3) {
                    ((nr0) dVar.f22988h).b();
                    return true;
                }
                if (i11 != 4) {
                    return false;
                }
                ((vr0) dVar.f22989i).b();
                return true;
        }
    }
}
