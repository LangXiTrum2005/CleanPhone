package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kr1 extends ae.o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16513f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kr1(nr1 nr1Var, int i10) {
        super(nr1Var);
        this.f16513f = i10;
    }

    @Override // ae.o, java.util.Iterator
    public Object next() {
        switch (this.f16513f) {
            case 1:
                return b().f17532f;
            default:
                return super.next();
        }
    }
}
