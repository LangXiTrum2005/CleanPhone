package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23066a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23068c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23067b = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23069d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23070e = Integer.MAX_VALUE;

    public k0(String str) {
        this.f23068c = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        int i11 = this.f23067b;
        if (i11 == 4) {
            throw new IllegalStateException();
        }
        int i12 = i11 - 1;
        String string = null;
        if (i11 == 0) {
            throw null;
        }
        if (i12 == 0) {
            return true;
        }
        if (i12 == 2) {
            return false;
        }
        this.f23067b = 4;
        int i13 = this.f23069d;
        while (true) {
            int length = this.f23069d;
            if (length == -1) {
                this.f23067b = 3;
                break;
            }
            String str = this.f23068c;
            int length2 = str.length();
            j0.d(length, length2);
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (str.charAt(length) == ',') {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str.length();
                this.f23069d = -1;
                i10 = -1;
            } else {
                i10 = length + 1;
                this.f23069d = i10;
            }
            if (i10 != i13) {
                if (i13 < length) {
                    str.charAt(i13);
                }
                if (i13 < length) {
                    str.charAt(length - 1);
                }
                int i14 = this.f23070e;
                if (i14 == 1) {
                    length = str.length();
                    this.f23069d = -1;
                    if (length > i13) {
                        str.charAt(length - 1);
                    }
                } else {
                    this.f23070e = i14 - 1;
                }
                string = str.subSequence(i13, length).toString();
                break;
            }
            int i15 = i10 + 1;
            this.f23069d = i15;
            if (i15 > str.length()) {
                this.f23069d = -1;
            }
        }
        this.f23066a = string;
        if (this.f23067b == 3) {
            return false;
        }
        this.f23067b = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f23067b = 2;
        String str = this.f23066a;
        this.f23066a = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
