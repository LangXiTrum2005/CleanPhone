package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ci {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23367a;

    public /* synthetic */ ci(int i10) {
        this.f23367a = i10;
    }

    public final void a(mh mhVar, Iterator it, yh yhVar) {
        switch (this.f23367a) {
            case 0:
                return;
            default:
                if (!mhVar.f23755c) {
                    throw new IllegalStateException("non repeating key");
                }
                if (!mhVar.f23756d || ((e0) e0.f23403b.get()).f23404a <= 20) {
                    mhVar.a(it, yhVar);
                    return;
                }
                while (it.hasNext()) {
                    yhVar.a(it.next(), mhVar.f23753a);
                }
                return;
        }
    }

    private final void b(mh mhVar, Iterator it, yh yhVar) {
    }
}
