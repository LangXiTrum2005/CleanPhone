package com.google.android.gms.internal.measurement;

import com.applovin.impl.Z;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import p005e.a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzlh implements Iterable, Serializable {
    public static final zzlh zzb = new zzlg(zzmp.zzb);
    private int zza = 0;

    static {
        int i2 = zzkv.zza;
    }

    public static zzlh zzh(byte[] bArr, int i2, int i3) {
        zzj(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new zzlg(bArr2);
    }

    public static int zzj(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(Z.n(new StringBuilder(String.valueOf(i2).length() + 21), "Beginning index: ", i2, " < 0"));
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException(a.a(new StringBuilder(String.valueOf(i2).length() + 44 + String.valueOf(i3).length()), i2, "Beginning index larger than ending index: ", i3, ", "));
        }
        throw new IndexOutOfBoundsException(a.a(new StringBuilder(String.valueOf(i3).length() + 15 + String.valueOf(i4).length()), i3, "End index: ", i4, " >= "));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzg = this.zza;
        if (iZzg == 0) {
            int iZzc = zzc();
            iZzg = zzg(iZzc, 0, iZzc);
            if (iZzg == 0) {
                iZzg = 1;
            }
            this.zza = iZzg;
        }
        return iZzg;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzla(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        return android.support.v4.media.a.r(android.support.v4.media.a.z("<ByteString@", Integer.toHexString(System.identityHashCode(this)), " size=", zzc(), " contents=\""), zzc() <= 50 ? zzog.zza(this) : zzog.zza(zze(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i2);

    public abstract byte zzb(int i2);

    public abstract int zzc();

    public abstract zzlh zze(int i2, int i3);

    public abstract void zzf(zzkz zzkzVar) throws IOException;

    public abstract int zzg(int i2, int i3, int i4);

    public final int zzi() {
        return this.zza;
    }
}
