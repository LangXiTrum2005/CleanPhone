package com.google.android.gms.internal.ads;

import A.A;
import com.applovin.impl.Z;
import com.google.android.gms.internal.ads.zzhyt;
import com.google.android.gms.internal.ads.zzhyu;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzhyt<MessageType extends zzhyu<MessageType, BuilderType>, BuilderType extends zzhyt<MessageType, BuilderType>> implements zzicb {
    private String zza(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 16 + String.valueOf(str).length() + 44);
        androidx.media3.extractor.text.ttml.a.C(sb, "Reading ", name, " from a ", str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    public static zzide zzaR(zzicc zziccVar) {
        return new zzide(zziccVar);
    }

    @Deprecated
    public static <T> void zzaS(Iterable<T> iterable, Collection<? super T> collection) {
        zzaT(iterable, (List) collection);
    }

    public static <T> void zzaT(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = zzibe.zzb;
        iterable.getClass();
        if (!(iterable instanceof zzibn)) {
            if (iterable instanceof zzicl) {
                list.addAll((Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        List listZza = ((zzibn) iterable).zza();
        zzibn zzibnVar = (zzibn) list;
        int size = list.size();
        for (Object obj : listZza) {
            if (obj == null) {
                int size2 = zzibnVar.size() - size;
                String strN = Z.n(new StringBuilder(String.valueOf(size2).length() + 26), "Element at index ", size2, " is null.");
                int size3 = zzibnVar.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(strN);
                    }
                    zzibnVar.remove(size3);
                }
            } else if (obj instanceof zzhzl) {
                zzibnVar.zzb();
            } else if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                zzhzl.zzs(bArr2, 0, bArr2.length);
                zzibnVar.zzb();
            } else {
                zzibnVar.add((String) obj);
            }
        }
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof zzicn) {
                ((zzicn) list).zze(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    zzc(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i2 = 0; i2 < size3; i2++) {
            A a2 = (Object) list2.get(i2);
            if (a2 == null) {
                zzc(list, size2);
            }
            list.add(a2);
        }
    }

    private static void zzc(List<?> list, int i2) {
        int size = list.size() - i2;
        String strN = Z.n(new StringBuilder(String.valueOf(size).length() + 26), "Element at index ", size, " is null.");
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i2) {
                throw new NullPointerException(strN);
            }
            list.remove(size2);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: zzaC, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract BuilderType zzbf();

    /* JADX INFO: renamed from: zzaD, reason: merged with bridge method [inline-methods] */
    public BuilderType zzbe(zzhzq zzhzqVar) throws IOException {
        int i2 = zziab.zzb;
        int i3 = zzhyy.zza;
        return (BuilderType) zzbd(zzhzqVar, zziab.zza);
    }

    @Override // 
    /* JADX INFO: renamed from: zzaE, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzbd(zzhzq zzhzqVar, zziab zziabVar) throws IOException;

    public BuilderType zzaF(zzhzl zzhzlVar) throws zzibg {
        try {
            zzhzq zzhzqVarZzq = zzhzlVar.zzq();
            zzbe(zzhzqVarZzq);
            zzhzqVarZzq.zzb(0);
            return this;
        } catch (zzibg e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException(zza("ByteString"), e3);
        }
    }

    public BuilderType zzaG(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        try {
            zzhzq zzhzqVarZzq = zzhzlVar.zzq();
            zzbd(zzhzqVarZzq, zziabVar);
            zzhzqVarZzq.zzb(0);
            return this;
        } catch (zzibg e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException(zza("ByteString"), e3);
        }
    }

    /* JADX INFO: renamed from: zzaH, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr) throws zzibg {
        return (BuilderType) zzaZ(bArr, 0, bArr.length);
    }

    @Override // 
    /* JADX INFO: renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i2, int i3) throws zzibg {
        try {
            zzhzq zzhzqVarZzG = zzhzq.zzG(bArr, i2, i3, false);
            zzbe(zzhzqVarZzG);
            zzhzqVarZzG.zzb(0);
            return this;
        } catch (zzibg e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException(zza("byte array"), e3);
        }
    }

    /* JADX INFO: renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, zziab zziabVar) throws zzibg {
        return (BuilderType) zzaX(bArr, 0, bArr.length, zziabVar);
    }

    @Override // 
    /* JADX INFO: renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaX(byte[] bArr, int i2, int i3, zziab zziabVar) throws zzibg {
        try {
            zzhzq zzhzqVarZzG = zzhzq.zzG(bArr, i2, i3, false);
            zzbd(zzhzqVarZzG, zziabVar);
            zzhzqVarZzG.zzb(0);
            return this;
        } catch (zzibg e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException(zza("byte array"), e3);
        }
    }

    public BuilderType zzaL(InputStream inputStream) throws IOException {
        zzhzq zzhzqVarZzF = zzhzq.zzF(inputStream, 4096);
        zzbe(zzhzqVarZzF);
        zzhzqVarZzF.zzb(0);
        return this;
    }

    public BuilderType zzaM(InputStream inputStream, zziab zziabVar) throws IOException {
        zzhzq zzhzqVarZzF = zzhzq.zzF(inputStream, 4096);
        zzbd(zzhzqVarZzF, zziabVar);
        zzhzqVarZzF.zzb(0);
        return this;
    }

    public boolean zzaN(InputStream inputStream, zziab zziabVar) throws IOException {
        int i2 = inputStream.read();
        if (i2 == -1) {
            return false;
        }
        zzaM(new zzhys(inputStream, zzhzq.zzM(i2, inputStream)), zziabVar);
        return true;
    }

    public boolean zzaO(InputStream inputStream) throws IOException {
        int i2 = zziab.zzb;
        int i3 = zzhyy.zza;
        return zzaN(inputStream, zziab.zza);
    }

    /* JADX INFO: renamed from: zzaP, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(zzicc zziccVar) {
        if (zzbw().getClass().isInstance(zziccVar)) {
            return (BuilderType) zzaQ((zzhyu) zziccVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public abstract BuilderType zzaQ(MessageType messagetype);

    public /* bridge */ /* synthetic */ zzicb zzaV(InputStream inputStream, zziab zziabVar) throws IOException {
        zzaM(inputStream, zziabVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzicb zzaW(InputStream inputStream) throws IOException {
        zzaL(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzicb zzbb(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        zzaG(zzhzlVar, zziabVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzicb zzbc(zzhzl zzhzlVar) throws zzibg {
        zzaF(zzhzlVar);
        return this;
    }
}
