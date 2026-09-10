package sa;

import com.applovin.shadow.okhttp3.HttpUrl;
import go.k;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f50220c = new a(new int[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f50221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50222b;

    public a(int[] iArr) {
        int length = iArr.length;
        this.f50221a = iArr;
        this.f50222b = length;
    }

    public final boolean equals(Object obj) {
        a aVar;
        int i10;
        int i11;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof a) && (i11 = this.f50222b) == (i10 = (aVar = (a) obj).f50222b)) {
            for (int i12 = 0; i12 < i11; i12++) {
                k.m(i12, i11);
                int i13 = this.f50221a[i12];
                k.m(i12, i10);
                if (i13 == aVar.f50221a[i12]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f50222b; i11++) {
            i10 = (i10 * 31) + this.f50221a[i11];
        }
        return i10;
    }

    public Object readResolve() {
        return this.f50222b == 0 ? f50220c : this;
    }

    public final String toString() {
        int i10 = this.f50222b;
        if (i10 == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        sb2.append('[');
        int[] iArr = this.f50221a;
        sb2.append(iArr[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(", ");
            sb2.append(iArr[i11]);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public Object writeReplace() {
        int[] iArr = this.f50221a;
        int length = iArr.length;
        int i10 = this.f50222b;
        return i10 < length ? new a(Arrays.copyOfRange(iArr, 0, i10)) : this;
    }
}
