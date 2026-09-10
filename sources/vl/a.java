package vl;

import d5.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.n;
import xj.k;
import xj.l;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f52622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f52625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f52626e;

    public a(int... numbers) {
        List listN0;
        n.f(numbers, "numbers");
        this.f52622a = numbers;
        Integer numR0 = k.r0(0, numbers);
        this.f52623b = numR0 != null ? numR0.intValue() : -1;
        Integer numR1 = k.r0(1, numbers);
        this.f52624c = numR1 != null ? numR1.intValue() : -1;
        Integer numR2 = k.r0(2, numbers);
        this.f52625d = numR2 != null ? numR2.intValue() : -1;
        if (numbers.length <= 3) {
            listN0 = v.f53866a;
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException(u.g(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), numbers.length, '.'));
            }
            listN0 = xj.n.N0(new l(numbers).subList(3, numbers.length));
        }
        this.f52626e = listN0;
    }

    public final boolean a(int i10, int i11, int i12) {
        int i13 = this.f52623b;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.f52624c;
        if (i14 > i11) {
            return true;
        }
        return i14 >= i11 && this.f52625d >= i12;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        return this.f52623b == aVar.f52623b && this.f52624c == aVar.f52624c && this.f52625d == aVar.f52625d && n.a(this.f52626e, aVar.f52626e);
    }

    public final int hashCode() {
        int i10 = this.f52623b;
        int i11 = (i10 * 31) + this.f52624c + i10;
        int i12 = (i11 * 31) + this.f52625d + i11;
        return this.f52626e.hashCode() + (i12 * 31) + i12;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f52622a) {
            if (i10 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList.isEmpty() ? "unknown" : xj.n.u0(arrayList, ".", null, null, null, 62);
    }
}
