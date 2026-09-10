package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m12 extends k50 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public dc1 f17212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public dc1 f17213j;

    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:60:0x0102  */
    /* JADX WARN: Code duplicated, block: B:62:0x0114  */
    /* JADX WARN: Code duplicated, block: B:64:0x0124  */
    @Override // com.google.android.gms.internal.ads.x40
    public final void a(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder;
        ByteOrder byteOrder;
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        dc1 dc1Var = this.f17213j;
        dc1Var.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferE = e(((iLimit - iPosition) / this.f16324b.f22475d) * this.f16325c.f22475d);
        while (iPosition < iLimit) {
            for (int i15 = 0; i15 < dc1Var.f13495b; i15++) {
                int iF = (uu0.f(this.f16324b.f22474c) * dc1Var.a(i15)) + iPosition;
                int i16 = this.f16324b.f22474c;
                if (i16 == 2) {
                    byteBufferE.putShort(byteBuffer.getShort(iF));
                } else if (i16 == 3) {
                    byteBufferE.put(byteBuffer.get(iF));
                } else if (i16 == 4) {
                    byteBufferE.putFloat(byteBuffer.getFloat(iF));
                } else if (i16 == 21) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i10 = iF;
                    } else {
                        i10 = iF + 2;
                    }
                    byte b10 = byteBuffer.get(i10);
                    byte b11 = byteBuffer.get(iF + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iF += 2;
                    }
                    i11 = ((b10 << 24) & (-16777216)) | ((b11 << 16) & 16711680) | ((byteBuffer.get(iF) << 8) & 65280);
                    i12 = i11 >> 8;
                    if ((i12 & (-16777216)) != 0 || (i12 & (-8388608)) == -8388608) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ps1.V(z10, "Value out of range of 24-bit integer: %s", Integer.toHexString(i12));
                    ps1.v(byteBufferE.remaining() >= 3);
                    if (byteBufferE.order() == byteOrder) {
                        i13 = (i11 >> 24) & 255;
                    } else {
                        i13 = i12 & 255;
                    }
                    byte b12 = (byte) i13;
                    int i17 = (i11 >> 16) & 255;
                    if (byteBufferE.order() == byteOrder) {
                        i14 = i12 & 255;
                    } else {
                        i14 = (i11 >> 24) & 255;
                    }
                    byteBufferE.put(b12).put((byte) i17).put((byte) i14);
                } else if (i16 == 22) {
                    byteBufferE.putInt(byteBuffer.getInt(iF));
                } else if (i16 == 268435456) {
                    byteBufferE.putShort(byteBuffer.getShort(iF));
                } else if (i16 == 1342177280) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i10 = iF;
                    } else {
                        i10 = iF + 2;
                    }
                    byte b13 = byteBuffer.get(i10);
                    byte b14 = byteBuffer.get(iF + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iF += 2;
                    }
                    i11 = ((b13 << 24) & (-16777216)) | ((b14 << 16) & 16711680) | ((byteBuffer.get(iF) << 8) & 65280);
                    i12 = i11 >> 8;
                    if ((i12 & (-16777216)) != 0) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    ps1.V(z10, "Value out of range of 24-bit integer: %s", Integer.toHexString(i12));
                    ps1.v(byteBufferE.remaining() >= 3);
                    if (byteBufferE.order() == byteOrder) {
                        i13 = (i11 >> 24) & 255;
                    } else {
                        i13 = i12 & 255;
                    }
                    byte b15 = (byte) i13;
                    int i18 = (i11 >> 16) & 255;
                    if (byteBufferE.order() == byteOrder) {
                        i14 = i12 & 255;
                    } else {
                        i14 = (i11 >> 24) & 255;
                    }
                    byteBufferE.put(b15).put((byte) i18).put((byte) i14);
                } else if (i16 != 1610612736) {
                    if (i16 != 1879048192) {
                        if (i16 == 1895825408) {
                            byteBufferE.putFloat(byteBuffer.getFloat(iF));
                        } else if (i16 != 1912602624) {
                            throw new IllegalStateException(l1.d.k(new StringBuilder(String.valueOf(i16).length() + 21), "Unexpected encoding: ", i16));
                        }
                    }
                    byteBufferE.putDouble(byteBuffer.getDouble(iF));
                } else {
                    byteBufferE.putInt(byteBuffer.getInt(iF));
                }
            }
            iPosition += this.f16324b.f22475d;
        }
        byteBuffer.position(iLimit);
        byteBufferE.flip();
    }

    @Override // com.google.android.gms.internal.ads.k50
    public final z20 f(z20 z20Var) throws p40 {
        dc1 dc1Var = this.f17212i;
        if (dc1Var == null) {
            return z20.f22471e;
        }
        int i10 = z20Var.f22474c;
        if (!uu0.d(i10)) {
            throw new p40("Unhandled input format:", z20Var);
        }
        int i11 = dc1Var.f13495b;
        int i12 = z20Var.f22473b;
        boolean z10 = i12 != i11;
        int i13 = 0;
        while (i13 < i11) {
            int iA = dc1Var.a(i13);
            if (iA >= i12) {
                String string = dc1Var.toString();
                throw new p40(q4.a.j(new StringBuilder(string.length() + 59), "Channel map (", string, ") trying to access non-existent input channel."), z20Var);
            }
            z10 |= iA != i13;
            i13++;
        }
        return z10 ? new z20(z20Var.f22472a, i11, i10) : z20.f22471e;
    }

    @Override // com.google.android.gms.internal.ads.k50
    public final void h() {
        this.f17213j = this.f17212i;
    }

    @Override // com.google.android.gms.internal.ads.k50
    public final void i() {
        this.f17213j = null;
        this.f17212i = null;
    }
}
