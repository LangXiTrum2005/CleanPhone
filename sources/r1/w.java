package r1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends j1.l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f49393i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f49394j;

    @Override // j1.l
    public final j1.h c(j1.h hVar) throws j1.j {
        int i10 = hVar.f43599c;
        int[] iArr = this.f49393i;
        if (iArr == null) {
            return j1.h.f43596e;
        }
        int i11 = hVar.f43598b;
        if (!l1.y.H(i10)) {
            throw new j1.j(hVar);
        }
        boolean z10 = i11 != iArr.length;
        int i12 = 0;
        while (i12 < iArr.length) {
            int i13 = iArr[i12];
            if (i13 >= i11) {
                throw new j1.j("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", hVar);
            }
            z10 |= i13 != i12;
            i12++;
        }
        return z10 ? new j1.h(hVar.f43597a, iArr.length, i10) : j1.h.f43596e;
    }

    @Override // j1.l
    public final void d() {
        this.f49394j = this.f49393i;
    }

    @Override // j1.l
    public final void f() {
        this.f49394j = null;
        this.f49393i = null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:57:0x010f  */
    @Override // j1.k
    public final void queueInput(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder;
        ByteOrder byteOrder;
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int[] iArr = this.f49394j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferG = g(((iLimit - iPosition) / this.f43604b.f43600d) * this.f43605c.f43600d);
        while (iPosition < iLimit) {
            for (int i14 : iArr) {
                int iT = (l1.y.t(this.f43604b.f43599c) * i14) + iPosition;
                int i15 = this.f43604b.f43599c;
                if (i15 == 2) {
                    byteBufferG.putShort(byteBuffer.getShort(iT));
                } else if (i15 == 3) {
                    byteBufferG.put(byteBuffer.get(iT));
                } else if (i15 == 4) {
                    byteBufferG.putFloat(byteBuffer.getFloat(iT));
                } else if (i15 == 21) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i10 = iT;
                    } else {
                        i10 = iT + 2;
                    }
                    byte b10 = byteBuffer.get(i10);
                    byte b11 = byteBuffer.get(iT + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iT += 2;
                    }
                    i11 = ((((b10 << 24) & (-16777216)) | ((b11 << 16) & 16711680)) | ((byteBuffer.get(iT) << 8) & 65280)) >> 8;
                    if ((i11 & (-16777216)) != 0 || (i11 & (-8388608)) == -8388608) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    go.k.k(z10, "Value out of range of 24-bit integer: %s", Integer.toHexString(i11));
                    go.k.i(byteBufferG.remaining() >= 3);
                    if (byteBufferG.order() == byteOrder) {
                        i12 = (i11 & 16711680) >> 16;
                    } else {
                        i12 = i11 & 255;
                    }
                    byte b12 = (byte) i12;
                    byte b13 = (byte) ((i11 & 65280) >> 8);
                    if (byteBufferG.order() == byteOrder) {
                        i13 = i11 & 255;
                    } else {
                        i13 = (i11 & 16711680) >> 16;
                    }
                    byteBufferG.put(b12).put(b13).put((byte) i13);
                } else {
                    if (i15 != 22) {
                        if (i15 == 268435456) {
                            byteBufferG.putShort(byteBuffer.getShort(iT));
                        } else if (i15 == 1342177280) {
                            byteOrderOrder = byteBuffer.order();
                            byteOrder = ByteOrder.BIG_ENDIAN;
                            if (byteOrderOrder == byteOrder) {
                                i10 = iT;
                            } else {
                                i10 = iT + 2;
                            }
                            byte b14 = byteBuffer.get(i10);
                            byte b15 = byteBuffer.get(iT + 1);
                            if (byteBuffer.order() == byteOrder) {
                                iT += 2;
                            }
                            i11 = ((((b14 << 24) & (-16777216)) | ((b15 << 16) & 16711680)) | ((byteBuffer.get(iT) << 8) & 65280)) >> 8;
                            if ((i11 & (-16777216)) != 0) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            go.k.k(z10, "Value out of range of 24-bit integer: %s", Integer.toHexString(i11));
                            go.k.i(byteBufferG.remaining() >= 3);
                            if (byteBufferG.order() == byteOrder) {
                                i12 = (i11 & 16711680) >> 16;
                            } else {
                                i12 = i11 & 255;
                            }
                            byte b16 = (byte) i12;
                            byte b17 = (byte) ((i11 & 65280) >> 8);
                            if (byteBufferG.order() == byteOrder) {
                                i13 = i11 & 255;
                            } else {
                                i13 = (i11 & 16711680) >> 16;
                            }
                            byteBufferG.put(b16).put(b17).put((byte) i13);
                        } else if (i15 != 1610612736) {
                            throw new IllegalStateException("Unexpected encoding: " + this.f43604b.f43599c);
                        }
                    }
                    byteBufferG.putInt(byteBuffer.getInt(iT));
                }
            }
            iPosition += this.f43604b.f43600d;
        }
        byteBuffer.position(iLimit);
        byteBufferG.flip();
    }
}
