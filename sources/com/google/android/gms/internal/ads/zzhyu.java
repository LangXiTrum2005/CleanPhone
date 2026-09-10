package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhyt;
import com.google.android.gms.internal.ads.zzhyu;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzhyu<MessageType extends zzhyu<MessageType, BuilderType>, BuilderType extends zzhyt<MessageType, BuilderType>> implements zzicc {
    protected int zzq = 0;

    public static void zzaV(zzhzl zzhzlVar) throws IllegalArgumentException {
        if (!zzhzlVar.zzm()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    public static <T> void zzaW(Iterable<T> iterable, List<? super T> list) {
        zzhyt.zzaT(iterable, list);
    }

    private String zzdU(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 18 + String.valueOf(str).length() + 44);
        androidx.media3.extractor.text.ttml.a.C(sb, "Serializing ", name, " to a ", str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzicc
    public zzhzl zzaM() {
        try {
            int iZzbr = zzbr();
            zzhzl zzhzlVar = zzhzl.zzb;
            byte[] bArr = new byte[iZzbr];
            int i2 = zzhzw.zzf;
            zzhzt zzhztVar = new zzhzt(bArr, 0, iZzbr);
            zzcX(zzhztVar);
            return zzhzh.zza(zzhztVar, bArr);
        } catch (IOException e2) {
            throw new RuntimeException(zzdU("ByteString"), e2);
        }
    }

    public byte[] zzaN() {
        try {
            int iZzbr = zzbr();
            byte[] bArr = new byte[iZzbr];
            int i2 = zzhzw.zzf;
            zzhzt zzhztVar = new zzhzt(bArr, 0, iZzbr);
            zzcX(zzhztVar);
            zzhztVar.zzE();
            return bArr;
        } catch (IOException e2) {
            throw new RuntimeException(zzdU("byte array"), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzicc
    public void zzaO(OutputStream outputStream) throws IOException {
        zzhzv zzhzvVar = new zzhzv(outputStream, zzhzw.zzz(zzbr()));
        zzcX(zzhzvVar);
        zzhzvVar.zzy();
    }

    public void zzaP(OutputStream outputStream) throws IOException {
        int iZzbr = zzbr();
        zzhzv zzhzvVar = new zzhzv(outputStream, zzhzw.zzz(zzhzw.zzA(iZzbr) + iZzbr));
        zzhzvVar.zzs(iZzbr);
        zzcX(zzhzvVar);
        zzhzvVar.zzy();
    }

    public int zzaQ() {
        throw new UnsupportedOperationException();
    }

    public void zzaR(int i2) {
        throw new UnsupportedOperationException();
    }

    public zzich zzaS() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public int zzaT(zzicu zzicuVar) {
        return zzaQ();
    }

    public zzide zzaU() {
        return new zzide(this);
    }
}
