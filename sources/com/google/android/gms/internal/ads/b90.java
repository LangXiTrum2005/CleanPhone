package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b90 implements zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d90 f12690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ou0 f12691b;

    public b90(d90 d90Var, ou0 ou0Var) {
        this.f12690a = d90Var;
        this.f12691b = ou0Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        ou0 ou0Var = this.f12691b;
        d90 d90Var = this.f12690a;
        String str = ou0Var.f18366g;
        synchronized (d90Var.f13467a) {
            try {
                ConcurrentHashMap concurrentHashMap = d90Var.f13468b;
                Integer num = (Integer) concurrentHashMap.get(str);
                concurrentHashMap.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
