package an;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements Iterator, kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f3781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3785e;

    public d(CharSequence string) {
        kotlin.jvm.internal.n.f(string, "string");
        this.f3781a = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f3782b;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f3785e < 0) {
            this.f3782b = 2;
            return false;
        }
        CharSequence charSequence = this.f3781a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i13 = this.f3783c; i13 < length2; i13++) {
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < charSequence.length() && charSequence.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f3782b = 1;
                this.f3785e = i10;
                this.f3784d = length;
                return true;
            }
        }
        i10 = -1;
        this.f3782b = 1;
        this.f3785e = i10;
        this.f3784d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3782b = 0;
        int i10 = this.f3784d;
        int i11 = this.f3783c;
        this.f3783c = this.f3785e + i10;
        return this.f3781a.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
