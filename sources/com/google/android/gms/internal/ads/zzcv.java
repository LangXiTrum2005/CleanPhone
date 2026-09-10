package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcv extends zzcp {
    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.zzb.zzd;
        if (i3 == 3) {
            i2 += i2;
        } else if (i3 == 4) {
            i2 /= 2;
        } else {
            if (i3 != 21) {
                if (i3 == 22) {
                    i2 /= 2;
                } else if (i3 != 268435456) {
                    if (i3 != 1342177280) {
                        if (i3 != 1610612736) {
                            throw new IllegalStateException();
                        }
                        i2 /= 2;
                    }
                }
            }
            i2 /= 3;
            i2 += i2;
        }
        ByteBuffer byteBufferZzk = zzk(i2);
        int i4 = this.zzb.zzd;
        if (i4 == 3) {
            while (iPosition < iLimit) {
                byteBufferZzk.put((byte) 0);
                byteBufferZzk.put((byte) ((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) - 128));
                iPosition++;
            }
        } else if (i4 == 4) {
            while (iPosition < iLimit) {
                float f = byteBuffer.getFloat(iPosition);
                String str = zzfj.zza;
                short sMax = (short) (Math.max(-1.0f, Math.min(f, 1.0f)) * 32767.0f);
                byteBufferZzk.put((byte) (sMax & 255));
                byteBufferZzk.put((byte) ((sMax >> 8) & 255));
                iPosition += 4;
            }
        } else if (i4 == 21) {
            while (iPosition < iLimit) {
                byteBufferZzk.put(byteBuffer.get(iPosition + 1));
                byteBufferZzk.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i4 == 22) {
            while (iPosition < iLimit) {
                byteBufferZzk.put(byteBuffer.get(iPosition + 2));
                byteBufferZzk.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i4 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferZzk.put(byteBuffer.get(iPosition + 1));
                byteBufferZzk.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i4 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferZzk.put(byteBuffer.get(iPosition + 1));
                byteBufferZzk.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i4 != 1610612736) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferZzk.put(byteBuffer.get(iPosition + 1));
                byteBufferZzk.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferZzk.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzm(zzcl zzclVar) throws zzcn {
        int i2 = zzclVar.zzd;
        if (i2 != 3) {
            if (i2 == 2) {
                return zzcl.zza;
            }
            if (i2 != 268435456 && i2 != 21 && i2 != 1342177280 && i2 != 22 && i2 != 1610612736 && i2 != 4) {
                throw new zzcn("Unhandled input format:", zzclVar);
            }
        }
        return new zzcl(zzclVar.zzb, zzclVar.zzc, 2);
    }
}
