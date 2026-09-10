package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.a;

/* JADX INFO: loaded from: classes4.dex */
final class zzlc extends zzlg {
    private final int zzc;

    public zzlc(byte[] bArr, int i2, int i3) {
        super(bArr);
        zzlh.zzj(0, i3, bArr.length);
        this.zzc = i3;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final byte zza(int i2) {
        int i3 = this.zzc;
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return ((zzlg) this).zza[i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(a.g(i2, "Index < 0: ", new StringBuilder(String.valueOf(i2).length() + 11)));
        }
        throw new ArrayIndexOutOfBoundsException(p005e.a.a(new StringBuilder(String.valueOf(i2).length() + 18 + String.valueOf(i3).length()), i2, "Index > length: ", i3, ", "));
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final byte zzb(int i2) {
        return ((zzlg) this).zza[i2];
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final int zzd() {
        return 0;
    }
}
