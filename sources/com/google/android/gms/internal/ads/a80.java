package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a80 implements ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b30 f11932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f11933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f11934c = new AtomicReference();

    public a80(b30 b30Var, Executor executor) {
        this.f11932a = b30Var;
        this.f11933b = executor;
    }

    @Override // com.google.android.gms.internal.ads.ai
    public final synchronized void v(zh zhVar) {
        b30 b30Var = this.f11932a;
        if (b30Var != null) {
            if (((Boolean) zzba.zzc().a(am.f12275ne)).booleanValue()) {
                if (zhVar.f22617j) {
                    AtomicReference atomicReference = this.f11934c;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.f11933b.execute(new m30(b30Var, 3));
                    }
                } else {
                    AtomicReference atomicReference2 = this.f11934c;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        this.f11933b.execute(new m30(b30Var, 2));
                    }
                }
            }
        }
    }
}
