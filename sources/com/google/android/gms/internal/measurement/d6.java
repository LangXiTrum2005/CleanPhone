package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d6 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23384b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23385c;

    public /* synthetic */ d6(Object obj, int i10) {
        this.f23383a = i10;
        this.f23385c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f23383a) {
            case 0:
                return this.f23384b < ((e6) this.f23385c).f23417a.length();
            case 1:
                return this.f23384b < ((e6) this.f23385c).f23417a.length();
            default:
                return this.f23384b < ((m1) this.f23385c).q();
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f23383a) {
            case 0:
                String str = ((e6) this.f23385c).f23417a;
                int i10 = this.f23384b;
                if (i10 >= str.length()) {
                    throw new NoSuchElementException();
                }
                this.f23384b = i10 + 1;
                return new e6(String.valueOf(i10));
            case 1:
                e6 e6Var = (e6) this.f23385c;
                String str2 = e6Var.f23417a;
                int i11 = this.f23384b;
                if (i11 >= str2.length()) {
                    throw new NoSuchElementException();
                }
                this.f23384b = i11 + 1;
                return new e6(String.valueOf(e6Var.f23417a.charAt(i11)));
            default:
                m1 m1Var = (m1) this.f23385c;
                if (this.f23384b >= m1Var.q()) {
                    int i12 = this.f23384b;
                    throw new NoSuchElementException(l1.d.k(new StringBuilder(String.valueOf(i12).length() + 21), "Out of bounds index: ", i12));
                }
                int i13 = this.f23384b;
                this.f23384b = i13 + 1;
                return m1Var.r(i13);
        }
    }
}
