package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzidp extends zzido {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0080, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.zzido
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidp.zza(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.ads.zzido
    public final String zzb(byte[] bArr, int i2, int i3) throws zzibg {
        int i4;
        int length = bArr.length;
        if ((((length - i2) - i3) | i2 | i3) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i5 = i2 + i3;
        char[] cArr = new char[i3];
        int i6 = 0;
        while (i2 < i5) {
            byte b2 = bArr[i2];
            if (!zzidn.zza(b2)) {
                break;
            }
            i2++;
            cArr[i6] = (char) b2;
            i6++;
        }
        int i7 = i6;
        while (i2 < i5) {
            int i8 = i2 + 1;
            byte b3 = bArr[i2];
            if (zzidn.zza(b3)) {
                cArr[i7] = (char) b3;
                i7++;
                i2 = i8;
                while (i2 < i5) {
                    byte b4 = bArr[i2];
                    if (!zzidn.zza(b4)) {
                        break;
                    }
                    i2++;
                    cArr[i7] = (char) b4;
                    i7++;
                }
            } else {
                if (zzidn.zzb(b3)) {
                    if (i8 >= i5) {
                        throw new zzibg("Protocol message had invalid UTF-8.");
                    }
                    i4 = i7 + 1;
                    i2 += 2;
                    zzidn.zzd(b3, bArr[i8], cArr, i7);
                } else if (zzidn.zzc(b3)) {
                    if (i8 >= i5 - 1) {
                        throw new zzibg("Protocol message had invalid UTF-8.");
                    }
                    i4 = i7 + 1;
                    int i9 = i2 + 2;
                    i2 += 3;
                    zzidn.zze(b3, bArr[i8], bArr[i9], cArr, i7);
                } else {
                    if (i8 >= i5 - 2) {
                        throw new zzibg("Protocol message had invalid UTF-8.");
                    }
                    byte b5 = bArr[i8];
                    int i10 = i2 + 3;
                    byte b6 = bArr[i2 + 2];
                    i2 += 4;
                    zzidn.zzf(b3, b5, b6, bArr[i10], cArr, i7);
                    i7 += 2;
                }
                i7 = i4;
            }
        }
        return new String(cArr, 0, i7);
    }
}
