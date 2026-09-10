package com.adjust.sdk.sig;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f6993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6994b;

    public o1() {
        char[] cArr;
        i iVar = i.f6963c;
        synchronized (iVar) {
            e eVar = iVar.f6964a;
            cArr = null;
            char[] cArr2 = (char[]) (eVar.isEmpty() ? null : eVar.removeLast());
            if (cArr2 != null) {
                iVar.f6965b -= cArr2.length;
                cArr = cArr2;
            }
        }
        this.f6993a = cArr == null ? new char[128] : cArr;
    }

    public final void a() {
        i iVar = i.f6963c;
        char[] cArr = this.f6993a;
        synchronized (iVar) {
            int i10 = iVar.f6965b;
            if (cArr.length + i10 < g.f6959a) {
                iVar.f6965b = i10 + cArr.length;
                iVar.f6964a.addLast(cArr);
            }
        }
    }

    public final String toString() {
        return new String(this.f6993a, 0, this.f6994b);
    }

    public final int a(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = this.f6993a;
        if (cArr.length <= i12) {
            int i13 = i10 * 2;
            if (i12 < i13) {
                i12 = i13;
            }
            this.f6993a = Arrays.copyOf(cArr, i12);
        }
        return i10;
    }
}
