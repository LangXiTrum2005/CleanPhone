package com.google.android.gms.internal.auth;

import androidx.datastore.preferences.protobuf.a;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzee implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzee zzb = new zzeb(zzez.zzd);
    private static final zzed zzd;
    private int zzc = 0;

    static {
        int i2 = zzdr.zza;
        zzd = new zzed(null);
        zza = new zzdw();
    }

    public static int zzi(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(a.k("Beginning index: ", i2, " < 0"));
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException(android.support.v4.media.a.g(i2, i3, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(android.support.v4.media.a.g(i3, i4, "End index: ", " >= "));
    }

    public static zzee zzk(byte[] bArr, int i2, int i3) {
        zzi(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new zzeb(bArr2);
    }

    public static zzee zzl(String str) {
        return new zzeb(str.getBytes(zzez.zzb));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZze = this.zzc;
        if (iZze == 0) {
            int iZzd = zzd();
            iZze = zze(iZzd, 0, iZzd);
            if (iZze == 0) {
                iZze = 1;
            }
            this.zzc = iZze;
        }
        return iZze;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzdv(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        return android.support.v4.media.a.r(android.support.v4.media.a.z("<ByteString@", Integer.toHexString(System.identityHashCode(this)), " size=", zzd(), " contents=\""), zzd() <= 50 ? zzgw.zza(this) : zzgw.zza(zzf(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i2);

    public abstract byte zzb(int i2);

    public abstract int zzd();

    public abstract int zze(int i2, int i3, int i4);

    public abstract zzee zzf(int i2, int i3);

    public abstract String zzg(Charset charset);

    public abstract boolean zzh();

    public final int zzj() {
        return this.zzc;
    }

    public final String zzm(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
