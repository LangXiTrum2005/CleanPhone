package na;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f46637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f46638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f46639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f46640e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f46642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ am.e f46643h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46636a = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f46641f = 0;

    public q(am.e eVar, com.google.android.gms.common.api.internal.m mVar, CharSequence charSequence) {
        this.f46643h = eVar;
        this.f46639d = (b) mVar.f11732d;
        this.f46640e = mVar.f11730b;
        this.f46642g = mVar.f11731c;
        this.f46638c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        b bVar;
        go.k.t(this.f46636a != 4);
        int iC = v0.i.c(this.f46636a);
        if (iC == 0) {
            return true;
        }
        if (iC != 2) {
            this.f46636a = 4;
            int i10 = this.f46641f;
            while (true) {
                int length = this.f46641f;
                if (length == -1) {
                    this.f46636a = 3;
                    string = null;
                    break;
                }
                c cVar = (c) this.f46643h.f3698b;
                CharSequence charSequence = this.f46638c;
                int length2 = charSequence.length();
                go.k.q(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (cVar.a(charSequence.charAt(length))) {
                        break;
                    }
                    length++;
                }
                CharSequence charSequence2 = this.f46638c;
                if (length == -1) {
                    length = charSequence2.length();
                    this.f46641f = -1;
                } else {
                    this.f46641f = length + 1;
                }
                int i11 = this.f46641f;
                if (i11 == i10) {
                    int i12 = i11 + 1;
                    this.f46641f = i12;
                    if (i12 > charSequence2.length()) {
                        this.f46641f = -1;
                    }
                } else {
                    while (true) {
                        bVar = this.f46639d;
                        if (i10 >= length || !bVar.a(charSequence2.charAt(i10))) {
                            break;
                        }
                        i10++;
                    }
                    while (length > i10 && bVar.a(charSequence2.charAt(length - 1))) {
                        length--;
                    }
                    if (!this.f46640e || i10 != length) {
                        int i13 = this.f46642g;
                        if (i13 == 1) {
                            length = charSequence2.length();
                            this.f46641f = -1;
                            while (length > i10 && bVar.a(charSequence2.charAt(length - 1))) {
                                length--;
                            }
                        } else {
                            this.f46642g = i13 - 1;
                        }
                        string = charSequence2.subSequence(i10, length).toString();
                        break;
                    }
                    i10 = this.f46641f;
                }
            }
            this.f46637b = string;
            if (this.f46636a != 3) {
                this.f46636a = 1;
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
        this.f46636a = 2;
        String str = this.f46637b;
        this.f46637b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
