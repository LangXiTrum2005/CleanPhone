package androidx.datastore.preferences.protobuf;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class UnknownFieldSetLite {
    public static final UnknownFieldSetLite f = new UnknownFieldSetLite(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f4933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f4934c;
    public int d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4935e;

    public UnknownFieldSetLite(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.f4932a = i2;
        this.f4933b = iArr;
        this.f4934c = objArr;
        this.f4935e = z2;
    }

    public static UnknownFieldSetLite c() {
        return new UnknownFieldSetLite(0, new int[8], new Object[8], true);
    }

    public static void e(int i2, Object obj, Writer writer) {
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            writer.writeInt64(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 1) {
            writer.writeFixed64(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 2) {
            writer.b(i3, (ByteString) obj);
            return;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.i());
            }
            writer.writeFixed32(i3, ((Integer) obj).intValue());
        } else if (writer.fieldOrder() == Writer.FieldOrder.X) {
            writer.writeStartGroup(i3);
            ((UnknownFieldSetLite) obj).f(writer);
            writer.writeEndGroup(i3);
        } else {
            writer.writeEndGroup(i3);
            ((UnknownFieldSetLite) obj).f(writer);
            writer.writeStartGroup(i3);
        }
    }

    public final void a(int i2) {
        int[] iArr = this.f4933b;
        if (i2 > iArr.length) {
            int i3 = this.f4932a;
            int i4 = (i3 / 2) + i3;
            if (i4 >= i2) {
                i2 = i4;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.f4933b = Arrays.copyOf(iArr, i2);
            this.f4934c = Arrays.copyOf(this.f4934c, i2);
        }
    }

    public final int b() {
        int iO;
        int iQ;
        int iO2;
        int i2 = this.d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f4932a; i4++) {
            int i5 = this.f4933b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 == 1) {
                    ((Long) this.f4934c[i4]).getClass();
                    iO2 = CodedOutputStream.o(i6) + 8;
                } else if (i7 == 2) {
                    iO2 = CodedOutputStream.i(i6, (ByteString) this.f4934c[i4]);
                } else if (i7 == 3) {
                    iO = CodedOutputStream.o(i6) * 2;
                    iQ = ((UnknownFieldSetLite) this.f4934c[i4]).b();
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.i());
                    }
                    ((Integer) this.f4934c[i4]).getClass();
                    iO2 = CodedOutputStream.o(i6) + 4;
                }
                i3 = iO2 + i3;
            } else {
                long jLongValue = ((Long) this.f4934c[i4]).longValue();
                iO = CodedOutputStream.o(i6);
                iQ = CodedOutputStream.q(jLongValue);
            }
            i3 = iQ + iO + i3;
        }
        this.d = i3;
        return i3;
    }

    public final void d(int i2, Object obj) {
        if (!this.f4935e) {
            throw new UnsupportedOperationException();
        }
        a(this.f4932a + 1);
        int[] iArr = this.f4933b;
        int i3 = this.f4932a;
        iArr[i3] = i2;
        this.f4934c[i3] = obj;
        this.f4932a = i3 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i2 = this.f4932a;
        if (i2 == unknownFieldSetLite.f4932a) {
            int[] iArr = this.f4933b;
            int[] iArr2 = unknownFieldSetLite.f4933b;
            for (int i3 = 0; i3 < i2; i3++) {
                if (iArr[i3] == iArr2[i3]) {
                }
            }
            Object[] objArr = this.f4934c;
            Object[] objArr2 = unknownFieldSetLite.f4934c;
            int i4 = this.f4932a;
            for (int i5 = 0; i5 < i4; i5++) {
                if (objArr[i5].equals(objArr2[i5])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(Writer writer) {
        if (this.f4932a == 0) {
            return;
        }
        if (writer.fieldOrder() == Writer.FieldOrder.X) {
            for (int i2 = 0; i2 < this.f4932a; i2++) {
                e(this.f4933b[i2], this.f4934c[i2], writer);
            }
            return;
        }
        for (int i3 = this.f4932a - 1; i3 >= 0; i3--) {
            e(this.f4933b[i3], this.f4934c[i3], writer);
        }
    }

    public final int hashCode() {
        int i2 = this.f4932a;
        int i3 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i2) * 31;
        int[] iArr = this.f4933b;
        int iHashCode = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i3 + i4) * 31;
        Object[] objArr = this.f4934c;
        int i7 = this.f4932a;
        for (int i8 = 0; i8 < i7; i8++) {
            iHashCode = (iHashCode * 31) + objArr[i8].hashCode();
        }
        return i6 + iHashCode;
    }
}
