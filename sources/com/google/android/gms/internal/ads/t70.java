package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t70 extends k50 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20233i;

    public /* synthetic */ t70(int i10) {
        this.f20233i = i10;
    }

    public static void j(int i10, ByteBuffer byteBuffer) {
        float f10 = (float) (((double) i10) * 4.656612875245797E-10d);
        byteBuffer.putInt(Float.isNaN(f10) ? 0 : Float.floatToIntBits(f10));
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0176  */
    @Override // com.google.android.gms.internal.ads.x40
    public final void a(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferE;
        switch (this.f20233i) {
            case 0:
                int iPosition = byteBuffer.position();
                int iLimit = byteBuffer.limit();
                int i10 = iLimit - iPosition;
                int i11 = this.f16324b.f22474c;
                if (i11 == 3) {
                    i10 += i10;
                } else if (i11 == 4) {
                    i10 /= 2;
                } else {
                    if (i11 != 21) {
                        if (i11 == 22) {
                            i10 /= 2;
                        } else if (i11 != 268435456) {
                            if (i11 != 1342177280) {
                                if (i11 == 1610612736) {
                                    i10 /= 2;
                                } else {
                                    if (i11 != 1879048192) {
                                        if (i11 == 1895825408) {
                                            i10 /= 2;
                                        } else if (i11 != 1912602624) {
                                            throw new IllegalStateException();
                                        }
                                    }
                                    i10 /= 4;
                                }
                            }
                        }
                    }
                    i10 /= 3;
                    i10 += i10;
                }
                ByteBuffer byteBufferE2 = e(i10);
                int i12 = this.f16324b.f22474c;
                if (i12 == 3) {
                    while (iPosition < iLimit) {
                        byteBufferE2.put((byte) 0);
                        byteBufferE2.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                        iPosition++;
                    }
                } else if (i12 == 4) {
                    while (iPosition < iLimit) {
                        float f10 = byteBuffer.getFloat(iPosition);
                        String str = uu0.f20901a;
                        short sMax = (short) (Math.max(-1.0f, Math.min(f10, 1.0f)) * 32767.0f);
                        byteBufferE2.put((byte) (sMax & 255));
                        byteBufferE2.put((byte) ((sMax >> 8) & 255));
                        iPosition += 4;
                    }
                } else if (i12 == 21) {
                    while (iPosition < iLimit) {
                        byteBufferE2.put(byteBuffer.get(iPosition + 1));
                        byteBufferE2.put(byteBuffer.get(iPosition + 2));
                        iPosition += 3;
                    }
                } else if (i12 == 22) {
                    while (iPosition < iLimit) {
                        byteBufferE2.put(byteBuffer.get(iPosition + 2));
                        byteBufferE2.put(byteBuffer.get(iPosition + 3));
                        iPosition += 4;
                    }
                } else if (i12 == 268435456) {
                    while (iPosition < iLimit) {
                        byteBufferE2.put(byteBuffer.get(iPosition + 1));
                        byteBufferE2.put(byteBuffer.get(iPosition));
                        iPosition += 2;
                    }
                } else if (i12 == 1342177280) {
                    while (iPosition < iLimit) {
                        byteBufferE2.put(byteBuffer.get(iPosition + 1));
                        byteBufferE2.put(byteBuffer.get(iPosition));
                        iPosition += 3;
                    }
                } else if (i12 == 1610612736) {
                    while (iPosition < iLimit) {
                        byteBufferE2.put(byteBuffer.get(iPosition + 1));
                        byteBufferE2.put(byteBuffer.get(iPosition));
                        iPosition += 4;
                    }
                } else if (i12 == 1879048192) {
                    while (iPosition < iLimit) {
                        short sMax2 = (short) (Math.max(-1.0d, Math.min(byteBuffer.getDouble(iPosition), 1.0d)) * 32767.0d);
                        byteBufferE2.put((byte) (sMax2 & 255));
                        byteBufferE2.put((byte) ((sMax2 >> 8) & 255));
                        iPosition += 8;
                    }
                } else if (i12 == 1895825408) {
                    while (iPosition < iLimit) {
                        float fIntBitsToFloat = Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(iPosition)));
                        String str2 = uu0.f20901a;
                        short sMax3 = (short) (Math.max(-1.0f, Math.min(fIntBitsToFloat, 1.0f)) * 32767.0f);
                        byteBufferE2.put((byte) (sMax3 & 255));
                        byteBufferE2.put((byte) ((sMax3 >> 8) & 255));
                        iPosition += 4;
                    }
                } else {
                    if (i12 != 1912602624) {
                        throw new IllegalStateException();
                    }
                    while (iPosition < iLimit) {
                        short sMax4 = (short) (Math.max(-1.0d, Math.min(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(iPosition))), 1.0d)) * 32767.0d);
                        byteBufferE2.put((byte) (sMax4 & 255));
                        byteBufferE2.put((byte) ((sMax4 >> 8) & 255));
                        iPosition += 8;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                byteBufferE2.flip();
                return;
            default:
                int iPosition2 = byteBuffer.position();
                int iLimit2 = byteBuffer.limit();
                int i13 = iLimit2 - iPosition2;
                int i14 = this.f16324b.f22474c;
                if (i14 == 2) {
                    byteBufferE = e(i13 + i13);
                    while (iPosition2 < iLimit2) {
                        j(byteBuffer.getShort(iPosition2) << 16, byteBufferE);
                        iPosition2 += 2;
                    }
                } else if (i14 == 3) {
                    byteBufferE = e(i13 * 4);
                    while (iPosition2 < iLimit2) {
                        j(((byteBuffer.get(iPosition2) & 255) - 128) << 24, byteBufferE);
                        iPosition2++;
                    }
                } else if (i14 == 21) {
                    byteBufferE = e((i13 / 3) * 4);
                    while (iPosition2 < iLimit2) {
                        j(gc1.l(byteBuffer.get(iPosition2 + 2), byteBuffer.get(iPosition2 + 1), byteBuffer.get(iPosition2), (byte) 0), byteBufferE);
                        iPosition2 += 3;
                    }
                } else if (i14 == 22) {
                    byteBufferE = e(i13);
                    while (iPosition2 < iLimit2) {
                        j(byteBuffer.getInt(iPosition2), byteBufferE);
                        iPosition2 += 4;
                    }
                } else if (i14 == 268435456) {
                    byteBufferE = e(i13 + i13);
                    while (iPosition2 < iLimit2) {
                        j(Short.reverseBytes(byteBuffer.getShort(iPosition2)) << 16, byteBufferE);
                        iPosition2 += 2;
                    }
                } else if (i14 == 1342177280) {
                    byteBufferE = e((i13 / 3) * 4);
                    while (iPosition2 < iLimit2) {
                        j(gc1.l(byteBuffer.get(iPosition2), byteBuffer.get(iPosition2 + 1), byteBuffer.get(iPosition2 + 2), (byte) 0), byteBufferE);
                        iPosition2 += 3;
                    }
                } else if (i14 == 1610612736) {
                    byteBufferE = e(i13);
                    while (iPosition2 < iLimit2) {
                        j(Integer.reverseBytes(byteBuffer.getInt(iPosition2)), byteBufferE);
                        iPosition2 += 4;
                    }
                } else if (i14 == 1879048192) {
                    byteBufferE = e(i13 / 2);
                    while (iPosition2 < iLimit2) {
                        byteBufferE.putFloat((float) byteBuffer.getDouble(iPosition2));
                        iPosition2 += 8;
                    }
                } else if (i14 == 1895825408) {
                    byteBufferE = e(i13);
                    while (iPosition2 < iLimit2) {
                        byteBufferE.putFloat(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(iPosition2))));
                        iPosition2 += 4;
                    }
                } else {
                    if (i14 != 1912602624) {
                        throw new IllegalStateException();
                    }
                    byteBufferE = e(i13 / 2);
                    while (iPosition2 < iLimit2) {
                        byteBufferE.putFloat((float) Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(iPosition2))));
                        iPosition2 += 8;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                byteBufferE.flip();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.k50
    public final z20 f(z20 z20Var) throws p40 {
        switch (this.f20233i) {
            case 0:
                int i10 = z20Var.f22474c;
                if (uu0.d(i10)) {
                    return i10 != 2 ? new z20(z20Var.f22472a, z20Var.f22473b, 2) : z20.f22471e;
                }
                throw new p40("Unhandled input format:", z20Var);
            default:
                int i11 = z20Var.f22474c;
                if (uu0.d(i11)) {
                    return i11 != 4 ? new z20(z20Var.f22472a, z20Var.f22473b, 4) : z20.f22471e;
                }
                throw new p40("Unhandled input format:", z20Var);
        }
    }
}
