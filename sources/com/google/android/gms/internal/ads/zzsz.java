package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class zzsz extends zzcp {
    private static final int zzd = Float.floatToIntBits(Float.NaN);

    private static void zzq(int i2, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i2) * 4.656612875245797E-10d));
        if (iFloatToIntBits == zzd) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferZzk;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.zzb.zzd;
        if (i3 == 2) {
            byteBufferZzk = zzk(i2 + i2);
            while (iPosition < iLimit) {
                zzq(((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), byteBufferZzk);
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            byteBufferZzk = zzk((i2 / 3) * 4);
            while (iPosition < iLimit) {
                zzq(((byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), byteBufferZzk);
                iPosition += 3;
            }
        } else if (i3 == 1610612736) {
            byteBufferZzk = zzk(i2);
            while (iPosition < iLimit) {
                int i4 = byteBuffer.get(iPosition + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int i5 = (byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                zzq(i4 | i5 | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), byteBufferZzk);
                iPosition += 4;
            }
        } else if (i3 == 21) {
            byteBufferZzk = zzk((i2 / 3) * 4);
            while (iPosition < iLimit) {
                zzq(((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), byteBufferZzk);
                iPosition += 3;
            }
        } else {
            if (i3 != 22) {
                throw new IllegalStateException();
            }
            byteBufferZzk = zzk(i2);
            while (iPosition < iLimit) {
                int i6 = byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int i7 = (byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                zzq(i6 | i7 | ((byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), byteBufferZzk);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferZzk.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzm(zzcl zzclVar) throws zzcn {
        int i2 = zzclVar.zzd;
        String str = zzfj.zza;
        if (i2 != 21 && i2 != 1342177280 && i2 != 22 && i2 != 1610612736) {
            if (i2 == 4) {
                return zzcl.zza;
            }
            if (i2 != 2) {
                throw new zzcn("Unhandled input format:", zzclVar);
            }
        }
        return new zzcl(zzclVar.zzb, zzclVar.zzc, 4);
    }
}
