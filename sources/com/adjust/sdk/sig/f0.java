package com.adjust.sdk.sig;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum[] f6953a;

    public f0(Enum[] enumArr) {
        this.f6953a = enumArr;
    }

    @Override // com.adjust.sdk.sig.d
    public final int a() {
        return this.f6953a.length;
    }

    @Override // com.adjust.sdk.sig.d, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r10 = (Enum) obj;
        Enum[] enumArr = this.f6953a;
        int iOrdinal = r10.ordinal();
        return ((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Enum[] enumArr = this.f6953a;
        int length = enumArr.length;
        if (i10 < 0 || i10 >= length) {
            throw new IndexOutOfBoundsException(defpackage.e.g(i10, length, "index: ", ", size: "));
        }
        return enumArr[i10];
    }

    @Override // com.adjust.sdk.sig.d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r10 = (Enum) obj;
        int iOrdinal = r10.ordinal();
        Enum[] enumArr = this.f6953a;
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r10) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // com.adjust.sdk.sig.d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r10 = (Enum) obj;
        int iOrdinal = r10.ordinal();
        Enum[] enumArr = this.f6953a;
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r10) {
            return iOrdinal;
        }
        return -1;
    }
}
