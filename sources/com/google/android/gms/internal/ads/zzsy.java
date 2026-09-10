package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zzsy extends zzcp {
    private int zzd;
    private boolean zze;
    private int zzf;
    private long zzg;
    private byte[] zzi;
    private byte[] zzl;
    private int zzh = 0;
    private int zzj = 0;
    private int zzk = 0;

    public zzsy() {
        byte[] bArr = zzfj.zzb;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    private final void zzs(boolean z2) {
        int i2;
        int length;
        int i3 = this.zzk;
        int length2 = this.zzi.length;
        if (i3 != length2) {
            if (!z2) {
                return;
            } else {
                z2 = true;
            }
        }
        if (this.zzh == 0) {
            if (z2) {
                zzu(i3, 3);
                length = i3;
            } else {
                zzgqa.zzi(i3 >= (length2 >> 1));
                length = this.zzi.length >> 1;
                zzu(length, 0);
            }
            i2 = length;
        } else {
            int i4 = length2 >> 1;
            int i5 = i3 - i4;
            if (z2) {
                int iZzt = zzt(i5) + (this.zzi.length >> 1);
                zzu(iZzt, 2);
                int i6 = i4 + i5;
                i2 = iZzt;
                length = i6;
            } else {
                int iZzt2 = zzt(i5);
                zzu(iZzt2, 1);
                i2 = iZzt2;
                length = i5;
            }
        }
        if (length % this.zzd != 0) {
            throw new IllegalStateException(zzgqr.zzd("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
        }
        zzgqa.zzi(i3 >= i2);
        this.zzk -= length;
        int i7 = this.zzj + length;
        this.zzj = i7;
        this.zzj = i7 % this.zzi.length;
        int i8 = this.zzh;
        int i9 = this.zzd;
        this.zzh = (i2 / i9) + i8;
        this.zzg += (long) ((length - i2) / i9);
    }

    private final int zzt(int i2) {
        int iZzw = ((zzw(2000000L) - this.zzh) * this.zzd) - (this.zzi.length >> 1);
        zzgqa.zzi(iZzw >= 0);
        int iMin = (int) Math.min((i2 * 0.2f) + 0.5f, iZzw);
        int i3 = this.zzd;
        return (iMin / i3) * i3;
    }

    private final void zzu(int i2, int i3) {
        int i4;
        if (i2 == 0) {
            return;
        }
        zzgqa.zza(this.zzk >= i2);
        if (i3 == 2) {
            int i5 = this.zzj;
            int i6 = this.zzk;
            int i7 = i5 + i6;
            byte[] bArr = this.zzi;
            int length = bArr.length;
            if (i7 <= length) {
                System.arraycopy(bArr, i7 - i2, this.zzl, 0, i2);
            } else {
                int i8 = i6 - (length - i5);
                if (i8 >= i2) {
                    System.arraycopy(bArr, i8 - i2, this.zzl, 0, i2);
                } else {
                    int i9 = i2 - i8;
                    System.arraycopy(bArr, length - i9, this.zzl, 0, i9);
                    System.arraycopy(this.zzi, 0, this.zzl, i9, i8);
                }
            }
        } else {
            int i10 = this.zzj;
            int i11 = i10 + i2;
            byte[] bArr2 = this.zzi;
            int length2 = bArr2.length;
            if (i11 <= length2) {
                System.arraycopy(bArr2, i10, this.zzl, 0, i2);
            } else {
                int i12 = length2 - i10;
                System.arraycopy(bArr2, i10, this.zzl, 0, i12);
                System.arraycopy(this.zzi, 0, this.zzl, i12, i2 - i12);
            }
        }
        zzgqa.zzd(i2 % this.zzd == 0, "sizeToOutput is not aligned to frame size: %s", i2);
        zzgqa.zzi(this.zzj < this.zzi.length);
        byte[] bArr3 = this.zzl;
        zzgqa.zzd(i2 % this.zzd == 0, "byteOutput size is not aligned to frame size %s", i2);
        if (i3 != 3) {
            for (int i13 = 0; i13 < i2; i13 += 2) {
                int i14 = i13 + 1;
                int iZzv = zzv(bArr3[i14], bArr3[i13]);
                if (i3 == 0) {
                    i4 = ((((i13 * 1000) / (i2 - 1)) * (-90)) / 1000) + 100;
                } else {
                    i4 = 10;
                    if (i3 == 2) {
                        i4 = 10 + (((com.smartdigimkt.b0.a.Q1 * i13) / (i2 - 1)) / 1000);
                    }
                }
                int i15 = (iZzv * i4) / 100;
                if (i15 >= 32767) {
                    bArr3[i13] = -1;
                    bArr3[i14] = AbstractJsonLexerKt.TC_INVALID;
                } else if (i15 <= -32768) {
                    bArr3[i13] = 0;
                    bArr3[i14] = -128;
                } else {
                    bArr3[i13] = (byte) (i15 & 255);
                    bArr3[i14] = (byte) (i15 >> 8);
                }
            }
        }
        zzk(i2).put(bArr3, 0, i2).flip();
    }

    private static int zzv(byte b2, byte b3) {
        return (b2 << 8) | (b3 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    private final int zzw(long j) {
        return (int) ((j * ((long) this.zzb.zzb)) / 1000000);
    }

    private static final boolean zzx(byte b2, byte b3) {
        return Math.abs(zzv(b2, b3)) > 1024;
    }

    @Override // com.google.android.gms.internal.ads.zzcp, com.google.android.gms.internal.ads.zzco
    public final boolean zzc() {
        return super.zzc() && this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(ByteBuffer byteBuffer) {
        int iLimit;
        int i2;
        int iPosition;
        while (byteBuffer.hasRemaining() && !zzl()) {
            if (this.zzf != 0) {
                zzgqa.zzi(this.zzj < this.zzi.length);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    } else {
                        if (zzx(byteBuffer.get(iPosition2), byteBuffer.get(iPosition2 - 1))) {
                            int i3 = this.zzd;
                            iLimit = (iPosition2 / i3) * i3;
                            break;
                        }
                        iPosition2 += 2;
                    }
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i4 = this.zzj;
                int i5 = this.zzk;
                int i6 = i4 + i5;
                int length = this.zzi.length;
                if (i6 < length) {
                    i2 = length - i6;
                } else {
                    i6 = i5 - (length - i4);
                    i2 = i4 - i6;
                }
                int iMin = Math.min(iPosition3, i2);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.zzi, i6, iMin);
                int i7 = this.zzk + iMin;
                this.zzk = i7;
                zzgqa.zzi(i7 <= this.zzi.length);
                boolean z2 = iLimit < iLimit2 && iPosition3 < i2;
                zzs(z2);
                if (z2) {
                    this.zzf = 0;
                    this.zzh = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.zzi.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (zzx(byteBuffer.get(iLimit4), byteBuffer.get(iLimit4 - 1))) {
                            int i8 = this.zzd;
                            iPosition = androidx.datastore.preferences.protobuf.a.a(iLimit4, i8, i8, i8);
                            break;
                        }
                        iLimit4 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.zzf = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    zzk(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzm(zzcl zzclVar) throws zzcn {
        if (zzclVar.zzd == 2) {
            return zzclVar.zzb == -1 ? zzcl.zza : zzclVar;
        }
        throw new zzcn("Unhandled input format:", zzclVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzn() {
        if (this.zzk > 0) {
            zzs(true);
            this.zzh = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzo() {
        if (zzc()) {
            int i2 = this.zzb.zzc;
            this.zzd = i2 + i2;
            int iZzw = zzw(100000L) / 2;
            int i3 = this.zzd;
            int i4 = (iZzw / i3) * i3;
            int i5 = i4 + i4;
            if (this.zzi.length != i5) {
                this.zzi = new byte[i5];
                this.zzl = new byte[i5];
            }
        }
        this.zzf = 0;
        this.zzg = 0L;
        this.zzh = 0;
        this.zzj = 0;
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzp() {
        this.zze = false;
        byte[] bArr = zzfj.zzb;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    public final void zzq(boolean z2) {
        this.zze = z2;
    }

    public final long zzr() {
        return this.zzg;
    }
}
