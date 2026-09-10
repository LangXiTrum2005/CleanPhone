package wl;

import zl.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public enum h implements o {
    NONE(0),
    INTERNAL_TO_CLASS_ID(1),
    DESC_TO_CLASS_ID(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53444a;

    h(int i10) {
        this.f53444a = i10;
    }

    @Override // zl.o
    public final int getNumber() {
        return this.f53444a;
    }
}
