package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class og extends yg {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b21 f18255i = new b21();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f18256h;

    public og(fg fgVar, xd xdVar, int i10, Context context) {
        super(fgVar, "00Zqkn2vthPYFLR6iH1rsdxNkw6KyQ/MlAMxaONveqkDgXIjpGg039P2HSigYq2Q", "KTJvuGh/PMe9EapQHUkRl8FZKF5qWyAzLDZ/DWV/log=", xdVar, i10, 29);
        this.f18256h = context;
    }

    @Override // com.google.android.gms.internal.ads.yg
    public final void a() {
        xd xdVar = this.f22234d;
        xdVar.b();
        ((je) xdVar.f19193b).z("E");
        Context context = this.f18256h;
        AtomicReference atomicReferenceD = f18255i.d(context.getPackageName());
        if (atomicReferenceD.get() == null) {
            synchronized (atomicReferenceD) {
                try {
                    if (atomicReferenceD.get() == null) {
                        atomicReferenceD.set((String) this.f22235e.invoke(null, context));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        String str = (String) atomicReferenceD.get();
        xd xdVar2 = this.f22234d;
        synchronized (xdVar2) {
            String strEncodeToString = Base64.encodeToString(str.getBytes(), 11);
            xdVar2.b();
            ((je) xdVar2.f19193b).z(strEncodeToString);
        }
    }
}
