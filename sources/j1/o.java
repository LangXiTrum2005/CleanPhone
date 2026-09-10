package j1;

import java.nio.ByteBuffer;
import l1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends l {
    @Override // j1.l
    public final h c(h hVar) throws j {
        int i10 = hVar.f43599c;
        if (i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4) {
            return i10 != 2 ? new h(hVar.f43597a, hVar.f43598b, 2) : h.f43596e;
        }
        throw new j(hVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    @Override // j1.k
    public final void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f43604b.f43599c;
        if (i11 == 3) {
            i10 *= 2;
        } else if (i11 == 4) {
            i10 /= 2;
        } else {
            if (i11 != 21) {
                if (i11 == 22) {
                    i10 /= 2;
                } else if (i11 != 268435456) {
                    if (i11 != 1342177280) {
                        if (i11 != 1610612736) {
                            throw new IllegalStateException();
                        }
                        i10 /= 2;
                    }
                }
            }
            i10 /= 3;
            i10 *= 2;
        }
        ByteBuffer byteBufferG = g(i10);
        int i12 = this.f43604b.f43599c;
        if (i12 == 3) {
            while (iPosition < iLimit) {
                byteBufferG.put((byte) 0);
                byteBufferG.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i12 == 4) {
            while (iPosition < iLimit) {
                short sI = (short) (y.i(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferG.put((byte) (sI & 255));
                byteBufferG.put((byte) ((sI >> 8) & 255));
                iPosition += 4;
            }
        } else if (i12 == 21) {
            while (iPosition < iLimit) {
                byteBufferG.put(byteBuffer.get(iPosition + 1));
                byteBufferG.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i12 == 22) {
            while (iPosition < iLimit) {
                byteBufferG.put(byteBuffer.get(iPosition + 2));
                byteBufferG.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i12 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferG.put(byteBuffer.get(iPosition + 1));
                byteBufferG.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i12 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferG.put(byteBuffer.get(iPosition + 1));
                byteBufferG.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i12 != 1610612736) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferG.put(byteBuffer.get(iPosition + 1));
                byteBufferG.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferG.flip();
    }
}
