package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o81 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18186a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f18188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y71 f18189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18190e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18187b = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18191f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18192g = Integer.MAX_VALUE;

    public o81(t6.l lVar, CharSequence charSequence) {
        this.f18189d = (y71) lVar.f50550c;
        this.f18190e = lVar.f50549b;
        this.f18188c = charSequence;
    }

    public abstract int a(int i10);

    public abstract int b(int i10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int iB;
        y71 y71Var;
        ps1.c0(this.f18187b != 4);
        int i10 = this.f18187b;
        int i11 = i10 - 1;
        String string = null;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            return true;
        }
        if (i11 != 2) {
            this.f18187b = 4;
            int i12 = this.f18191f;
            while (true) {
                int i13 = this.f18191f;
                if (i13 == -1) {
                    this.f18187b = 3;
                    break;
                }
                int iA = a(i13);
                CharSequence charSequence = this.f18188c;
                if (iA == -1) {
                    iA = charSequence.length();
                    this.f18191f = -1;
                    iB = -1;
                } else {
                    iB = b(iA);
                    this.f18191f = iB;
                }
                if (iB == i12) {
                    int i14 = iB + 1;
                    this.f18191f = i14;
                    if (i14 > charSequence.length()) {
                        this.f18191f = -1;
                    }
                } else {
                    while (true) {
                        y71Var = this.f18189d;
                        if (i12 >= iA || !y71Var.a(charSequence.charAt(i12))) {
                            break;
                        }
                        i12++;
                    }
                    while (iA > i12) {
                        int i15 = iA - 1;
                        if (!y71Var.a(charSequence.charAt(i15))) {
                            break;
                        }
                        iA = i15;
                    }
                    if (!this.f18190e || i12 != iA) {
                        int i16 = this.f18192g;
                        if (i16 == 1) {
                            iA = charSequence.length();
                            this.f18191f = -1;
                            while (iA > i12) {
                                int i17 = iA - 1;
                                if (!y71Var.a(charSequence.charAt(i17))) {
                                    break;
                                }
                                iA = i17;
                            }
                        } else {
                            this.f18192g = i16 - 1;
                        }
                        string = charSequence.subSequence(i12, iA).toString();
                        break;
                    }
                    i12 = this.f18191f;
                }
            }
            this.f18186a = string;
            if (this.f18187b != 3) {
                this.f18187b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f18187b = 2;
        String str = this.f18186a;
        this.f18186a = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
