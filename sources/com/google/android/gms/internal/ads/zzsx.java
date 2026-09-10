package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzsx {
    private static final byte[] zza = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};
    private static final byte[] zzb = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    private ByteBuffer zzc = zzco.zza;
    private int zze = 0;
    private int zzd = 2;

    private static final void zzc(ByteBuffer byteBuffer, long j, int i2, int i3, boolean z2) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z2 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i2);
        byteBuffer.putInt(0);
        byteBuffer.put(zzgxb.zza(i3));
    }

    public final void zza(zzih zzihVar, List list) {
        int length;
        ByteBuffer byteBuffer;
        int i2;
        ByteBuffer byteBuffer2 = zzihVar.zzc;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - zzihVar.zzc.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.zzd == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = zzihVar.zzc;
        int iPosition = byteBuffer3.position();
        int iLimit = byteBuffer3.limit();
        int i3 = iLimit - iPosition;
        int i4 = (i3 + 255) / 255;
        int i5 = i4 + 27 + i3;
        if (this.zzd == 2) {
            length = bArr != null ? bArr.length + 28 : 47;
            i5 += length + 44;
        } else {
            length = 0;
        }
        if (this.zzc.capacity() < i5) {
            this.zzc = ByteBuffer.allocate(i5).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.zzc.clear();
        }
        ByteBuffer byteBuffer4 = this.zzc;
        if (this.zzd == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                i2 = 22;
                zzc(byteBuffer, 0L, 0, 1, true);
                int length2 = bArr.length;
                byteBuffer.put(zzgxb.zza(length2));
                byteBuffer.put(bArr);
                int i6 = length2 + 28;
                byteBuffer.putInt(22, zzfj.zzG(byteBuffer.array(), byteBuffer.arrayOffset(), i6, 0));
                byteBuffer.position(i6);
            } else {
                byteBuffer = byteBuffer4;
                i2 = 22;
                byteBuffer.put(zza);
            }
            byteBuffer.put(zzb);
        } else {
            byteBuffer = byteBuffer4;
            i2 = 22;
        }
        int iZzc = this.zze + zzafn.zzc(byteBuffer3);
        this.zze = iZzc;
        int i7 = i2;
        ByteBuffer byteBuffer5 = byteBuffer;
        zzc(byteBuffer5, iZzc, this.zzd, i4, false);
        for (int i8 = 0; i8 < i4; i8++) {
            if (i3 >= 255) {
                byteBuffer5.put((byte) -1);
                i3 -= 255;
            } else {
                byteBuffer5.put((byte) i3);
                i3 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer5.put(byteBuffer3.get(iPosition));
            iPosition++;
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.zzd == 2) {
            byteBuffer5.putInt(length + 66, zzfj.zzG(byteBuffer5.array(), byteBuffer5.arrayOffset() + length + 44, byteBuffer5.limit() - byteBuffer5.position(), 0));
        } else {
            byteBuffer5.putInt(i7, zzfj.zzG(byteBuffer5.array(), byteBuffer5.arrayOffset(), byteBuffer5.limit() - byteBuffer5.position(), 0));
        }
        this.zzd++;
        this.zzc = byteBuffer5;
        zzihVar.zza();
        zzihVar.zzj(this.zzc.remaining());
        zzihVar.zzc.put(this.zzc);
        zzihVar.zzl();
    }

    public final void zzb() {
        this.zzc = zzco.zza;
        this.zze = 0;
        this.zzd = 2;
    }
}
