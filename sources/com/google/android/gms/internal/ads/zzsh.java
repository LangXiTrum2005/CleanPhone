package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzsh extends zzcp {
    private int[] zzd;
    private int[] zze;

    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:56:0x010f  */
    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder;
        ByteOrder byteOrder;
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int[] iArr = this.zze;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferZzk = zzk(((iLimit - iPosition) / this.zzb.zze) * this.zzc.zze);
        while (iPosition < iLimit) {
            for (int i7 : iArr) {
                int iZzD = (zzfj.zzD(this.zzb.zzd) * i7) + iPosition;
                int i8 = this.zzb.zzd;
                if (i8 == 2) {
                    byteBufferZzk.putShort(byteBuffer.getShort(iZzD));
                } else if (i8 == 3) {
                    byteBufferZzk.put(byteBuffer.get(iZzD));
                } else if (i8 == 4) {
                    byteBufferZzk.putFloat(byteBuffer.getFloat(iZzD));
                } else if (i8 == 21) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i2 = iZzD;
                    } else {
                        i2 = iZzD + 2;
                    }
                    byte b2 = byteBuffer.get(i2);
                    byte b3 = byteBuffer.get(iZzD + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iZzD += 2;
                    }
                    i3 = ((b2 << 24) & (-16777216)) | ((b3 << 16) & 16711680) | ((byteBuffer.get(iZzD) << 8) & 65280);
                    i4 = i3 >> 8;
                    if ((i4 & (-16777216)) != 0 || (i4 & (-8388608)) == -8388608) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zzgqa.zzf(z2, "Value out of range of 24-bit integer: %s", Integer.toHexString(i4));
                    zzgqa.zza(byteBufferZzk.remaining() >= 3);
                    if (byteBufferZzk.order() == byteOrder) {
                        i5 = (i3 >> 24) & 255;
                    } else {
                        i5 = i4 & 255;
                    }
                    byte b4 = (byte) i5;
                    int i9 = (i3 >> 16) & 255;
                    if (byteBufferZzk.order() == byteOrder) {
                        i6 = i4 & 255;
                    } else {
                        i6 = (i3 >> 24) & 255;
                    }
                    byteBufferZzk.put(b4).put((byte) i9).put((byte) i6);
                } else {
                    if (i8 != 22) {
                        if (i8 == 268435456) {
                            byteBufferZzk.putShort(byteBuffer.getShort(iZzD));
                        } else if (i8 == 1342177280) {
                            byteOrderOrder = byteBuffer.order();
                            byteOrder = ByteOrder.BIG_ENDIAN;
                            if (byteOrderOrder == byteOrder) {
                                i2 = iZzD;
                            } else {
                                i2 = iZzD + 2;
                            }
                            byte b5 = byteBuffer.get(i2);
                            byte b6 = byteBuffer.get(iZzD + 1);
                            if (byteBuffer.order() == byteOrder) {
                                iZzD += 2;
                            }
                            i3 = ((b5 << 24) & (-16777216)) | ((b6 << 16) & 16711680) | ((byteBuffer.get(iZzD) << 8) & 65280);
                            i4 = i3 >> 8;
                            if ((i4 & (-16777216)) != 0) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            zzgqa.zzf(z2, "Value out of range of 24-bit integer: %s", Integer.toHexString(i4));
                            zzgqa.zza(byteBufferZzk.remaining() >= 3);
                            if (byteBufferZzk.order() == byteOrder) {
                                i5 = (i3 >> 24) & 255;
                            } else {
                                i5 = i4 & 255;
                            }
                            byte b7 = (byte) i5;
                            int i10 = (i3 >> 16) & 255;
                            if (byteBufferZzk.order() == byteOrder) {
                                i6 = i4 & 255;
                            } else {
                                i6 = (i3 >> 24) & 255;
                            }
                            byteBufferZzk.put(b7).put((byte) i10).put((byte) i6);
                        } else if (i8 != 1610612736) {
                            throw new IllegalStateException(androidx.datastore.preferences.protobuf.a.g(i8, "Unexpected encoding: ", new StringBuilder(String.valueOf(i8).length() + 21)));
                        }
                    }
                    byteBufferZzk.putInt(byteBuffer.getInt(iZzD));
                }
            }
            iPosition += this.zzb.zze;
        }
        byteBuffer.position(iLimit);
        byteBufferZzk.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzm(zzcl zzclVar) throws zzcn {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzcl.zza;
        }
        int i2 = zzclVar.zzd;
        if (!zzfj.zzA(i2)) {
            throw new zzcn("Unhandled input format:", zzclVar);
        }
        int i3 = zzclVar.zzc;
        boolean z2 = i3 != iArr.length;
        int i4 = 0;
        while (true) {
            int length = iArr.length;
            if (i4 >= length) {
                return z2 ? new zzcl(zzclVar.zzb, length, i2) : zzcl.zza;
            }
            int i5 = iArr[i4];
            if (i5 >= i3) {
                String string = Arrays.toString(iArr);
                throw new zzcn(android.support.v4.media.a.s(new StringBuilder(String.valueOf(string).length() + 59), "Channel map (", string, ") trying to access non-existent input channel."), zzclVar);
            }
            z2 |= i5 != i4;
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzo() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzp() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzq(int[] iArr) {
        this.zzd = iArr;
    }
}
