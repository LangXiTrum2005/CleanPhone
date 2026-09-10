package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.zs;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gg implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23517a;

    public /* synthetic */ gg(int i10) {
        this.f23517a = i10;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        switch (this.f23517a) {
            case 0:
                if (obj != null) {
                    throw new ClassCastException();
                }
                zs zsVar = hg.f23550g;
                throw null;
            default:
                throw q4.a.h(obj);
        }
    }
}
