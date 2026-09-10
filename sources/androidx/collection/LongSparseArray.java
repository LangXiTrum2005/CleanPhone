package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.p004ironsource.dc;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/LongSparseArray;", "E", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class LongSparseArray<E> implements Cloneable {
    public /* synthetic */ boolean X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ long[] f3745Y;
    public /* synthetic */ Object[] Z;
    public /* synthetic */ int e0;

    public LongSparseArray(int i2) {
        if (i2 == 0) {
            this.f3745Y = ContainerHelpersKt.f3776b;
            this.Z = ContainerHelpersKt.f3777c;
            return;
        }
        int i3 = i2 * 8;
        for (int i4 = 4; i4 < 32; i4++) {
            int i5 = (1 << i4) - 12;
            if (i3 <= i5) {
                i3 = i5;
                break;
            }
        }
        int i6 = i3 / 8;
        this.f3745Y = new long[i6];
        this.Z = new Object[i6];
    }

    public final void b() {
        int i2 = this.e0;
        Object[] objArr = this.Z;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.e0 = 0;
        this.X = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final LongSparseArray clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.d(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        LongSparseArray longSparseArray = (LongSparseArray) objClone;
        longSparseArray.f3745Y = (long[]) this.f3745Y.clone();
        longSparseArray.Z = (Object[]) this.Z.clone();
        return longSparseArray;
    }

    public final Object d(long j) {
        Object obj;
        int iB = ContainerHelpersKt.b(this.f3745Y, this.e0, j);
        if (iB < 0 || (obj = this.Z[iB]) == LongSparseArrayKt.f3746a) {
            return null;
        }
        return obj;
    }

    public final Object e(long j) {
        Object obj;
        int iB = ContainerHelpersKt.b(this.f3745Y, this.e0, j);
        if (iB < 0 || (obj = this.Z[iB]) == LongSparseArrayKt.f3746a) {
            return -1L;
        }
        return obj;
    }

    public final int f(long j) {
        if (this.X) {
            int i2 = this.e0;
            long[] jArr = this.f3745Y;
            Object[] objArr = this.Z;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != LongSparseArrayKt.f3746a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.X = false;
            this.e0 = i3;
        }
        return ContainerHelpersKt.b(this.f3745Y, this.e0, j);
    }

    public final long g(int i2) {
        if (!(i2 >= 0 && i2 < this.e0)) {
            RuntimeHelpersKt.a("Expected index to be within 0..size()-1, but was " + i2);
            throw null;
        }
        if (this.X) {
            int i3 = this.e0;
            long[] jArr = this.f3745Y;
            Object[] objArr = this.Z;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != LongSparseArrayKt.f3746a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.X = false;
            this.e0 = i4;
        }
        return this.f3745Y[i2];
    }

    public final void h(long j, Object obj) {
        int iB = ContainerHelpersKt.b(this.f3745Y, this.e0, j);
        if (iB >= 0) {
            this.Z[iB] = obj;
            return;
        }
        int i2 = ~iB;
        int i3 = this.e0;
        Object obj2 = LongSparseArrayKt.f3746a;
        if (i2 < i3) {
            Object[] objArr = this.Z;
            if (objArr[i2] == obj2) {
                this.f3745Y[i2] = j;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.X) {
            long[] jArr = this.f3745Y;
            if (i3 >= jArr.length) {
                Object[] objArr2 = this.Z;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    Object obj3 = objArr2[i5];
                    if (obj3 != obj2) {
                        if (i5 != i4) {
                            jArr[i4] = jArr[i5];
                            objArr2[i4] = obj3;
                            objArr2[i5] = null;
                        }
                        i4++;
                    }
                }
                this.X = false;
                this.e0 = i4;
                i2 = ~ContainerHelpersKt.b(this.f3745Y, i4, j);
            }
        }
        int i6 = this.e0;
        if (i6 >= this.f3745Y.length) {
            int i7 = (i6 + 1) * 8;
            for (int i8 = 4; i8 < 32; i8++) {
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
            }
            int i10 = i7 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f3745Y, i10);
            Intrinsics.e(jArrCopyOf, "copyOf(...)");
            this.f3745Y = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.Z, i10);
            Intrinsics.e(objArrCopyOf, "copyOf(...)");
            this.Z = objArrCopyOf;
        }
        int i11 = this.e0 - i2;
        if (i11 != 0) {
            long[] jArr2 = this.f3745Y;
            int i12 = i2 + 1;
            Intrinsics.f(jArr2, "<this>");
            System.arraycopy(jArr2, i2, jArr2, i12, i11);
            Object[] objArr3 = this.Z;
            ArraysKt.o(objArr3, i12, objArr3, i2, this.e0);
        }
        this.f3745Y[i2] = j;
        this.Z[i2] = obj;
        this.e0++;
    }

    public final int i() {
        if (this.X) {
            int i2 = this.e0;
            long[] jArr = this.f3745Y;
            Object[] objArr = this.Z;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != LongSparseArrayKt.f3746a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.X = false;
            this.e0 = i3;
        }
        return this.e0;
    }

    public final Object j(int i2) {
        if (!(i2 >= 0 && i2 < this.e0)) {
            RuntimeHelpersKt.a("Expected index to be within 0..size()-1, but was " + i2);
            throw null;
        }
        if (this.X) {
            int i3 = this.e0;
            long[] jArr = this.f3745Y;
            Object[] objArr = this.Z;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != LongSparseArrayKt.f3746a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.X = false;
            this.e0 = i4;
        }
        return this.Z[i2];
    }

    public final String toString() {
        if (i() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.e0 * 28);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i2 = this.e0;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(g(i3));
            sb.append(dc.T);
            Object objJ = j(i3);
            if (objJ != sb) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb.toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }

    public LongSparseArray() {
        this(10);
    }
}
