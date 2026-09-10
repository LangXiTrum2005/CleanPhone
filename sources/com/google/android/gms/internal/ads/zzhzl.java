package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzhzl implements Iterable<Byte>, Serializable {
    public static final zzhzl zzb = new zzhzj(zzibe.zzb);
    private int zza = 0;

    static {
        int i2 = zzhyy.zza;
    }

    public static zzhzk zzA() {
        return new zzhzk(128);
    }

    public static void zzB(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) < 0) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException(androidx.datastore.preferences.protobuf.a.g(i2, "Index < 0: ", new StringBuilder(String.valueOf(i2).length() + 11)));
            }
            throw new ArrayIndexOutOfBoundsException(p005e.a.a(new StringBuilder(String.valueOf(i2).length() + 18 + String.valueOf(i3).length()), i2, "Index > length: ", i3, ", "));
        }
    }

    public static int zzC(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(Z.n(new StringBuilder(String.valueOf(i2).length() + 21), "Beginning index: ", i2, " < 0"));
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException(p005e.a.a(new StringBuilder(String.valueOf(i2).length() + 44 + String.valueOf(i3).length()), i2, "Beginning index larger than ending index: ", i3, ", "));
        }
        throw new IndexOutOfBoundsException(p005e.a.a(new StringBuilder(String.valueOf(i3).length() + 15 + String.valueOf(i4).length()), i3, "End index: ", i4, " >= "));
    }

    private static zzhzl zzd(Iterator it, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.k("length (", i2, ") must be >= 1"));
        }
        if (i2 == 1) {
            return (zzhzl) it.next();
        }
        int i3 = i2 >>> 1;
        zzhzl zzhzlVarZzd = zzd(it, i3);
        zzhzl zzhzlVarZzd2 = zzd(it, i2 - i3);
        if (Integer.MAX_VALUE - zzhzlVarZzd.zzc() >= zzhzlVarZzd2.zzc()) {
            return zzict.zzd(zzhzlVarZzd, zzhzlVarZzd2);
        }
        int iZzc = zzhzlVarZzd.zzc();
        int iZzc2 = zzhzlVarZzd2.zzc();
        throw new IllegalArgumentException(p005e.a.a(new StringBuilder(String.valueOf(iZzc).length() + 31 + String.valueOf(iZzc2).length()), iZzc, "ByteString would be too long: ", iZzc2, "+"));
    }

    public static zzhzl zzs(byte[] bArr, int i2, int i3) {
        try {
            return zzt(bArr, i2, i3, false);
        } catch (zzibg e2) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
        }
    }

    public static zzhzl zzt(byte[] bArr, int i2, int i3, boolean z2) throws zzibg {
        zzC(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new zzhzj(bArr2);
    }

    public static zzhzl zzu(byte[] bArr) {
        try {
            return new zzhzj(bArr);
        } catch (zzibg e2) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
        }
    }

    public static zzhzl zzv(String str) {
        return new zzhzj(str.getBytes(zzibe.zza));
    }

    public static zzhzl zzw(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zzb : zzd(iterable.iterator(), size);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhzl)) {
            return false;
        }
        zzhzl zzhzlVar = (zzhzl) obj;
        int iZzc = zzc();
        if (iZzc != zzhzlVar.zzc()) {
            return false;
        }
        if (iZzc == 0) {
            return true;
        }
        int i2 = this.zza;
        int i3 = zzhzlVar.zza;
        if (i2 == 0 || i3 == 0 || i2 == i3) {
            return zzo(zzhzlVar);
        }
        return false;
    }

    public final int hashCode() {
        int iZzp = this.zza;
        if (iZzp == 0) {
            int iZzc = zzc();
            iZzp = zzp(iZzc, 0, iZzc);
            if (iZzp == 0) {
                iZzp = 1;
            }
            this.zza = iZzp;
        }
        return iZzp;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        return android.support.v4.media.a.r(android.support.v4.media.a.z("<ByteString@", Integer.toHexString(System.identityHashCode(this)), " size=", zzc(), " contents=\""), zzc() <= 50 ? zzidd.zza(this) : zzidd.zza(zzi(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i2);

    public abstract byte zzb(int i2);

    public abstract int zzc();

    public abstract void zze(byte[] bArr, int i2, int i3, int i4);

    public abstract int zzf();

    public abstract boolean zzg();

    public abstract zzhzl zzi(int i2, int i3);

    public abstract ByteBuffer zzj();

    public abstract void zzk(zzhzc zzhzcVar) throws IOException;

    public abstract String zzl(Charset charset);

    public abstract boolean zzm();

    public abstract int zzn(int i2, int i3, int i4);

    public abstract boolean zzo(zzhzl zzhzlVar);

    public abstract int zzp(int i2, int i3, int i4);

    public abstract zzhzq zzq();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public zzhzg iterator() {
        return new zzhzd(this);
    }

    @Deprecated
    public final void zzx(byte[] bArr, int i2, int i3, int i4) {
        zzC(0, i4, zzc());
        zzC(i3, i3 + i4, bArr.length);
        if (i4 > 0) {
            zze(bArr, 0, i3, i4);
        }
    }

    public final byte[] zzy() {
        int iZzc = zzc();
        if (iZzc == 0) {
            return zzibe.zzb;
        }
        byte[] bArr = new byte[iZzc];
        zze(bArr, 0, 0, iZzc);
        return bArr;
    }

    public final String zzz() {
        return zzc() == 0 ? "" : zzl(zzibe.zza);
    }
}
