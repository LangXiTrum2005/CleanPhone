package com.google.common.cache;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class LongAdder extends Striped64 implements Serializable, LongAddable {
    private static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.Z = 0;
        this.X = null;
        this.f19772Y = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(i());
    }

    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    @Override // com.google.common.cache.LongAddable
    public final void a(long j) {
        boolean zA;
        int iNextInt;
        Striped64.Cell[] cellArr;
        boolean z2;
        int length;
        boolean z3;
        int length2;
        int length3;
        Striped64.Cell cell;
        Striped64.Cell[] cellArr2 = this.X;
        if (cellArr2 == null) {
            long j2 = this.f19772Y;
            if (b(j2, j2 + j)) {
                return;
            }
        }
        ThreadLocal threadLocal = Striped64.e0;
        int[] iArr = (int[]) threadLocal.get();
        if (iArr == null || cellArr2 == null || (length3 = cellArr2.length) < 1 || (cell = cellArr2[(length3 - 1) & iArr[0]]) == null) {
            zA = true;
        } else {
            long j3 = cell.f19775a;
            zA = cell.a(j3, j3 + j);
            if (zA) {
                return;
            }
        }
        if (iArr == null) {
            iArr = new int[1];
            threadLocal.set(iArr);
            iNextInt = Striped64.f0.nextInt();
            if (iNextInt == 0) {
                iNextInt = 1;
            }
            iArr[0] = iNextInt;
        } else {
            iNextInt = iArr[0];
        }
        while (true) {
            boolean z4 = false;
            while (true) {
                cellArr = this.X;
                if (cellArr != null && (length = cellArr.length) > 0) {
                    Striped64.Cell cell2 = cellArr[(length - 1) & iNextInt];
                    if (cell2 != null) {
                        if (zA) {
                            long j4 = cell2.f19775a;
                            if (cell2.a(j4, j4 + j)) {
                                return;
                            }
                            if (length < Striped64.g0 && this.X == cellArr) {
                                if (z4) {
                                    if (this.Z == 0 && g()) {
                                        break;
                                    }
                                } else {
                                    z4 = true;
                                }
                            }
                        } else {
                            zA = true;
                        }
                        int i2 = iNextInt ^ (iNextInt << 13);
                        int i3 = i2 ^ (i2 >>> 17);
                        iNextInt = i3 ^ (i3 << 5);
                        iArr[0] = iNextInt;
                    } else if (this.Z == 0) {
                        Striped64.Cell cell3 = new Striped64.Cell(j);
                        if (this.Z == 0 && g()) {
                            try {
                                Striped64.Cell[] cellArr3 = this.X;
                                if (cellArr3 == null || (length2 = cellArr3.length) <= 0) {
                                    z3 = false;
                                } else {
                                    int i4 = (length2 - 1) & iNextInt;
                                    if (cellArr3[i4] == null) {
                                        cellArr3[i4] = cell3;
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                }
                                this.Z = 0;
                                if (z3) {
                                    return;
                                }
                            } catch (Throwable th) {
                                this.Z = 0;
                                throw th;
                            }
                        }
                    }
                    z4 = false;
                    int i5 = iNextInt ^ (iNextInt << 13);
                    int i6 = i5 ^ (i5 >>> 17);
                    iNextInt = i6 ^ (i6 << 5);
                    iArr[0] = iNextInt;
                } else if (this.Z == 0 && this.X == cellArr && g()) {
                    try {
                        if (this.X == cellArr) {
                            Striped64.Cell[] cellArr4 = new Striped64.Cell[2];
                            cellArr4[iNextInt & 1] = new Striped64.Cell(j);
                            this.X = cellArr4;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.Z = 0;
                        if (z2) {
                            return;
                        }
                    } catch (Throwable th2) {
                        this.Z = 0;
                        throw th2;
                    }
                } else {
                    long j5 = this.f19772Y;
                    if (b(j5, j5 + j)) {
                        return;
                    }
                }
            }
            try {
                if (this.X == cellArr) {
                    Striped64.Cell[] cellArr5 = new Striped64.Cell[length << 1];
                    for (int i7 = 0; i7 < length; i7++) {
                        cellArr5[i7] = cellArr[i7];
                    }
                    this.X = cellArr5;
                }
                this.Z = 0;
            } catch (Throwable th3) {
                this.Z = 0;
                throw th3;
            }
        }
    }

    @Override // com.google.common.cache.LongAddable
    public final void d() {
        a(1L);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return i();
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return i();
    }

    public final long i() {
        long j = this.f19772Y;
        Striped64.Cell[] cellArr = this.X;
        if (cellArr != null) {
            for (Striped64.Cell cell : cellArr) {
                if (cell != null) {
                    j += cell.f19775a;
                }
            }
        }
        return j;
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) i();
    }

    @Override // java.lang.Number
    public final long longValue() {
        return i();
    }

    public final String toString() {
        return Long.toString(i());
    }
}
