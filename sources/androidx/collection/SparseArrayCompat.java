package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.p004ironsource.dc;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/SparseArrayCompat;", "E", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class SparseArrayCompat<E> implements Cloneable {
    public /* synthetic */ int[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object[] f3772Y;
    public /* synthetic */ int Z;

    public SparseArrayCompat() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.X = new int[i5];
        this.f3772Y = new Object[i5];
    }

    public final void b(int i2, Object obj) {
        int i3 = this.Z;
        if (i3 != 0 && i2 <= this.X[i3 - 1]) {
            e(i2, obj);
            return;
        }
        if (i3 >= this.X.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.X, i7);
            Intrinsics.e(iArrCopyOf, "copyOf(...)");
            this.X = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f3772Y, i7);
            Intrinsics.e(objArrCopyOf, "copyOf(...)");
            this.f3772Y = objArrCopyOf;
        }
        this.X[i3] = i2;
        this.f3772Y[i3] = obj;
        this.Z = i3 + 1;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final SparseArrayCompat clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.d(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) objClone;
        sparseArrayCompat.X = (int[]) this.X.clone();
        sparseArrayCompat.f3772Y = (Object[]) this.f3772Y.clone();
        return sparseArrayCompat;
    }

    public final Object d(int i2) {
        Object obj;
        int iA = ContainerHelpersKt.a(this.Z, i2, this.X);
        if (iA < 0 || (obj = this.f3772Y[iA]) == SparseArrayCompatKt.f3773a) {
            return null;
        }
        return obj;
    }

    public final void e(int i2, Object obj) {
        int iA = ContainerHelpersKt.a(this.Z, i2, this.X);
        if (iA >= 0) {
            this.f3772Y[iA] = obj;
            return;
        }
        int i3 = ~iA;
        int i4 = this.Z;
        if (i3 < i4) {
            Object[] objArr = this.f3772Y;
            if (objArr[i3] == SparseArrayCompatKt.f3773a) {
                this.X[i3] = i2;
                objArr[i3] = obj;
                return;
            }
        }
        if (i4 >= this.X.length) {
            int i5 = (i4 + 1) * 4;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.X, i8);
            Intrinsics.e(iArrCopyOf, "copyOf(...)");
            this.X = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f3772Y, i8);
            Intrinsics.e(objArrCopyOf, "copyOf(...)");
            this.f3772Y = objArrCopyOf;
        }
        int i9 = this.Z;
        if (i9 - i3 != 0) {
            int[] iArr = this.X;
            int i10 = i3 + 1;
            ArraysKt.n(i10, i3, i9, iArr, iArr);
            Object[] objArr2 = this.f3772Y;
            ArraysKt.o(objArr2, i10, objArr2, i3, this.Z);
        }
        this.X[i3] = i2;
        this.f3772Y[i3] = obj;
        this.Z++;
    }

    public final Object f(int i2) {
        Object[] objArr = this.f3772Y;
        if (i2 < objArr.length) {
            return objArr[i2];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        int i2 = this.Z;
        if (i2 <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i3 = this.Z;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(this.X[i4]);
            sb.append(dc.T);
            Object objF = f(i4);
            if (objF != this) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb.toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }
}
