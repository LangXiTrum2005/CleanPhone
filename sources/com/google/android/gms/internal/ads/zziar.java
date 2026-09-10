package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzial;
import com.google.android.gms.internal.ads.zziar;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zziar<MessageType extends zziar<MessageType, BuilderType>, BuilderType extends zzial<MessageType, BuilderType>> extends zzhyu<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, zziar<?, ?>> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc = -1;
    protected zzidg zzt = zzidg.zza();

    public static Method zzbA(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            String name = cls.getName();
            int length = name.length();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + length + 43 + 2);
            androidx.media3.extractor.text.ttml.a.C(sb, "Generated message class \"", name, "\" missing method \"", str);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    public static Object zzbB(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static zziaz zzbC() {
        return zzias.zzd();
    }

    public static zziaz zzbD(zziaz zziazVar) {
        int size = zziazVar.size();
        return zziazVar.zzh(size + size);
    }

    public static zzibc zzbE() {
        return zzibq.zzg();
    }

    public static zzibc zzbF(zzibc zzibcVar) {
        int size = zzibcVar.size();
        return zzibcVar.zzh(size + size);
    }

    public static zziay zzbG() {
        return zziai.zzd();
    }

    public static zziay zzbH(zziay zziayVar) {
        int size = zziayVar.size();
        return zziayVar.zzh(size + size);
    }

    public static zziau zzbI() {
        return zzhzy.zzd();
    }

    public static zziau zzbJ(zziau zziauVar) {
        int size = zziauVar.size();
        return zziauVar.zzh(size + size);
    }

    public static zziat zzbK() {
        return zzhzb.zzd();
    }

    public static zziat zzbL(zziat zziatVar) {
        int size = zziatVar.size();
        return zziatVar.zzh(size + size);
    }

    public static <E> zzibd<E> zzbM() {
        return zzicn.zzd();
    }

    public static <E> zzibd<E> zzbN(zzibd<E> zzibdVar) {
        int size = zzibdVar.size();
        return zzibdVar.zzh(size + size);
    }

    public static <T extends zziar<T, ?>> T zzbO(T t, zzhzq zzhzqVar, zziab zziabVar) throws zzibg {
        T t2 = (T) t.zzbg();
        try {
            zzicu zzicuVarZzb = zzicm.zza().zzb(t2.getClass());
            zzicuVarZzb.zzg(t2, zzhzr.zza(zzhzqVar), zziabVar);
            zzicuVarZzb.zzk(t2);
            return t2;
        } catch (zzibg e2) {
            if (e2.zzb()) {
                throw new zzibg(e2);
            }
            throw e2;
        } catch (zzide e3) {
            throw e3.zza();
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzibg) {
                throw ((zzibg) e4.getCause());
            }
            throw new zzibg(e4);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzibg) {
                throw ((zzibg) e5.getCause());
            }
            throw e5;
        }
    }

    public static <T extends zziar<T, ?>> T zzbP(T t, zzhzq zzhzqVar) throws zzibg {
        int i2 = zziab.zzb;
        int i3 = zzhyy.zza;
        return (T) zzbO(t, zzhzqVar, zziab.zza);
    }

    public static <T extends zziar<T, ?>> T zzbQ(T t, ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
        zzhzq zzhzqVarZzG;
        boolean z2 = false;
        if (byteBuffer.hasArray()) {
            zzhzqVarZzG = zzhzq.zzG(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && zzidm.zzb()) {
            zzhzqVarZzG = new zzhzp(byteBuffer, z2, null);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            zzhzqVarZzG = zzhzq.zzG(bArr, 0, iRemaining, true);
        }
        T t2 = (T) zzbZ(t, zzhzqVarZzG, zziabVar);
        zzi(t2);
        return t2;
    }

    public static <T extends zziar<T, ?>> T zzbR(T t, ByteBuffer byteBuffer) throws zzibg {
        int i2 = zziab.zzb;
        int i3 = zzhyy.zza;
        return (T) zzbQ(t, byteBuffer, zziab.zza);
    }

    public static <T extends zziar<T, ?>> T zzbS(T t, zzhzl zzhzlVar) throws zzibg {
        int i2 = zziab.zzb;
        int i3 = zzhyy.zza;
        T t2 = (T) zzbT(t, zzhzlVar, zziab.zza);
        zzi(t2);
        return t2;
    }

    public static <T extends zziar<T, ?>> T zzbT(T t, zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        T t2 = (T) zzj(t, zzhzlVar, zziabVar);
        zzi(t2);
        return t2;
    }

    public static <T extends zziar<T, ?>> T zzbU(T t, byte[] bArr) throws zzibg {
        int length = bArr.length;
        int i2 = zziab.zzb;
        int i3 = zzhyy.zza;
        T t2 = (T) zzh(t, bArr, 0, length, zziab.zza);
        zzi(t2);
        return t2;
    }

    public static <T extends zziar<T, ?>> T zzbV(T t, byte[] bArr, zziab zziabVar) throws zzibg {
        T t2 = (T) zzh(t, bArr, 0, bArr.length, zziabVar);
        zzi(t2);
        return t2;
    }

    public static <T extends zziar<T, ?>> T zzbW(T t, InputStream inputStream) throws zzibg {
        zzhzq zzhzqVarZzF = zzhzq.zzF(inputStream, 4096);
        int i2 = zziab.zzb;
        int i3 = zzhyy.zza;
        T t2 = (T) zzbO(t, zzhzqVarZzF, zziab.zza);
        zzi(t2);
        return t2;
    }

    public static <T extends zziar<T, ?>> T zzbX(T t, InputStream inputStream, zziab zziabVar) throws zzibg {
        T t2 = (T) zzbO(t, zzhzq.zzF(inputStream, 4096), zziabVar);
        zzi(t2);
        return t2;
    }

    public static <T extends zziar<T, ?>> T zzbY(T t, zzhzq zzhzqVar) throws zzibg {
        int i2 = zziab.zzb;
        int i3 = zzhyy.zza;
        return (T) zzbZ(t, zzhzqVar, zziab.zza);
    }

    public static <T extends zziar<T, ?>> T zzbZ(T t, zzhzq zzhzqVar, zziab zziabVar) throws zzibg {
        T t2 = (T) zzbO(t, zzhzqVar, zziabVar);
        zzi(t2);
        return t2;
    }

    public static <T extends zziar> T zzbt(Class<T> cls) {
        zziar<?, ?> zziarVar = zzd.get(cls);
        if (zziarVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zziarVar = zzd.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zziarVar != null) {
            return zziarVar;
        }
        zziar<?, ?> zziarVarZzbw = ((zziar) zzidm.zzc(cls)).zzbw();
        if (zziarVarZzbw == null) {
            throw new IllegalStateException();
        }
        zzd.put(cls, zziarVarZzbw);
        return zziarVarZzbw;
    }

    public static <T extends zziar> void zzbu(Class<T> cls, T t) {
        t.zzaY();
        zzd.put(cls, t);
    }

    public static Object zzbv(zzicc zziccVar, String str, Object[] objArr) {
        return new zzico(zziccVar, str, objArr);
    }

    public static <ContainingType extends zzicc, Type> zziap<ContainingType, Type> zzby(ContainingType containingtype, Type type, zzicc zziccVar, zziaw zziawVar, int i2, zzids zzidsVar, Class cls) {
        return new zziap<>(containingtype, type, zziccVar, new zziao(zziawVar, i2, zzidsVar, false, false), cls);
    }

    public static <ContainingType extends zzicc, Type> zziap<ContainingType, Type> zzbz(ContainingType containingtype, zzicc zziccVar, zziaw zziawVar, int i2, zzids zzidsVar, boolean z2, Class cls) {
        return new zziap<>(containingtype, zzicn.zzd(), zziccVar, new zziao(zziawVar, i2, zzidsVar, true, z2), cls);
    }

    private void zzc() {
        if (this.zzt == zzidg.zza()) {
            this.zzt = zzidg.zzb();
        }
    }

    public static <T extends zziar<T, ?>> T zzca(T t, InputStream inputStream) throws zzibg {
        int i2 = zziab.zzb;
        int i3 = zzhyy.zza;
        T t2 = (T) zzk(t, inputStream, zziab.zza);
        zzi(t2);
        return t2;
    }

    public static <T extends zziar<T, ?>> T zzcb(T t, InputStream inputStream, zziab zziabVar) throws zzibg {
        T t2 = (T) zzk(t, inputStream, zziabVar);
        zzi(t2);
        return t2;
    }

    private int zzd(zzicu<?> zzicuVar) {
        if (zzicuVar != null) {
            return zzicuVar.zze(this);
        }
        return zzicm.zza().zzb(getClass()).zze(this);
    }

    private static <MessageType extends zzian<MessageType, BuilderType>, BuilderType, T> zziap<MessageType, T> zze(zzhzz<MessageType, T> zzhzzVar) {
        return (zziap) zzhzzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends zziar<T, ?>> boolean zzg(T t, boolean z2) {
        byte bByteValue = ((Byte) t.zzdc(zziaq.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzicm.zza().zzb(t.getClass()).zzl(t);
        if (z2) {
            t.zzdc(zziaq.SET_MEMOIZED_IS_INITIALIZED, true != zZzl ? null : t, null);
        }
        return zZzl;
    }

    private static <T extends zziar<T, ?>> T zzh(T t, byte[] bArr, int i2, int i3, zziab zziabVar) throws zzibg {
        if (i3 == 0) {
            return t;
        }
        T t2 = (T) t.zzbg();
        try {
            zzicu zzicuVarZzb = zzicm.zza().zzb(t2.getClass());
            zzicuVarZzb.zzj(t2, bArr, i2, i2 + i3, new zzhyz(zziabVar));
            zzicuVarZzb.zzk(t2);
            return t2;
        } catch (zzibg e2) {
            if (e2.zzb()) {
                throw new zzibg(e2);
            }
            throw e2;
        } catch (zzide e3) {
            throw e3.zza();
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzibg) {
                throw ((zzibg) e4.getCause());
            }
            throw new zzibg(e4);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzibg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static <T extends zziar<T, ?>> T zzi(T t) throws zzibg {
        if (t == null || t.zzbi()) {
            return t;
        }
        throw t.zzaU().zza();
    }

    private static <T extends zziar<T, ?>> T zzj(T t, zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        zzhzq zzhzqVarZzq = zzhzlVar.zzq();
        T t2 = (T) zzbO(t, zzhzqVarZzq, zziabVar);
        zzhzqVarZzq.zzb(0);
        return t2;
    }

    private static <T extends zziar<T, ?>> T zzk(T t, InputStream inputStream, zziab zziabVar) throws zzibg {
        try {
            int i2 = inputStream.read();
            if (i2 == -1) {
                return null;
            }
            zzhzq zzhzqVarZzF = zzhzq.zzF(new zzhys(inputStream, zzhzq.zzM(i2, inputStream)), 4096);
            T t2 = (T) zzbO(t, zzhzqVarZzF, zziabVar);
            zzhzqVarZzF.zzb(0);
            return t2;
        } catch (zzibg e2) {
            if (e2.zzb()) {
                throw new zzibg(e2);
            }
            throw e2;
        } catch (IOException e3) {
            throw new zzibg(e3);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzicm.zza().zzb(getClass()).zzb(this, (zziar) obj);
    }

    public int hashCode() {
        if (zzaX()) {
            return zzbh();
        }
        if (zzbc()) {
            zzba(zzbh());
        }
        return zzaZ();
    }

    public String toString() {
        return zzice.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhyu
    public int zzaQ() {
        return this.zzc & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzhyu
    public void zzaR(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException(androidx.datastore.preferences.protobuf.a.g(i2, "serialized size must be non-negative, was ", new StringBuilder(String.valueOf(i2).length() + 42)));
        }
        this.zzc = i2 | (this.zzc & Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzhyu
    public int zzaT(zzicu zzicuVar) {
        if (zzaX()) {
            int iZzd = zzd(zzicuVar);
            if (iZzd >= 0) {
                return iZzd;
            }
            throw new IllegalStateException(androidx.datastore.preferences.protobuf.a.g(iZzd, "serialized size must be non-negative, was ", new StringBuilder(String.valueOf(iZzd).length() + 42)));
        }
        if (zzaQ() != Integer.MAX_VALUE) {
            return zzaQ();
        }
        int iZzd2 = zzd(zzicuVar);
        zzaR(iZzd2);
        return iZzd2;
    }

    public boolean zzaX() {
        return (this.zzc & Integer.MIN_VALUE) != 0;
    }

    public void zzaY() {
        this.zzc &= Integer.MAX_VALUE;
    }

    public int zzaZ() {
        return this.zzq;
    }

    public void zzba(int i2) {
        this.zzq = i2;
    }

    public void zzbb() {
        this.zzq = 0;
    }

    public boolean zzbc() {
        return zzaZ() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzicc
    public final zzick<MessageType> zzbd() {
        return (zzick) zzdc(zziaq.GET_PARSER, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzicd
    /* JADX INFO: renamed from: zzbe, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbw() {
        return (MessageType) zzdc(zziaq.GET_DEFAULT_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzicc
    /* JADX INFO: renamed from: zzbf, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcY() {
        return (BuilderType) zzdc(zziaq.NEW_BUILDER, null, null);
    }

    public MessageType zzbg() {
        return (MessageType) zzdc(zziaq.NEW_MUTABLE_INSTANCE, null, null);
    }

    public int zzbh() {
        return zzicm.zza().zzb(getClass()).zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzicd
    public final boolean zzbi() {
        return zzg(this, true);
    }

    public boolean zzbj(int i2, zzhzq zzhzqVar) throws IOException {
        if ((i2 & 7) == 4) {
            return false;
        }
        zzc();
        return this.zzt.zzl(i2, zzhzqVar);
    }

    public void zzbk(int i2, int i3) {
        zzc();
        zzidg zzidgVar = this.zzt;
        zzidgVar.zze();
        if (i2 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzidgVar.zzk(i2 << 3, Long.valueOf(i3));
    }

    public void zzbl(int i2, zzhzl zzhzlVar) {
        zzc();
        zzidg zzidgVar = this.zzt;
        zzidgVar.zze();
        if (i2 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzidgVar.zzk((i2 << 3) | 2, zzhzlVar);
    }

    public void zzbm() {
        zzicm.zza().zzb(getClass()).zzk(this);
        zzaY();
    }

    public final <MessageType2 extends zziar<MessageType2, BuilderType2>, BuilderType2 extends zzial<MessageType2, BuilderType2>> BuilderType2 zzbn() {
        return (BuilderType2) zzdc(zziaq.NEW_BUILDER, null, null);
    }

    public final <MessageType2 extends zziar<MessageType2, BuilderType2>, BuilderType2 extends zzial<MessageType2, BuilderType2>> BuilderType2 zzbo(MessageType2 messagetype2) {
        BuilderType2 buildertype2 = (BuilderType2) zzbn();
        buildertype2.zzbo(messagetype2);
        return buildertype2;
    }

    /* JADX INFO: renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcc() {
        BuilderType buildertype = (BuilderType) zzdc(zziaq.NEW_BUILDER, null, null);
        buildertype.zzbo(this);
        return buildertype;
    }

    public void zzbq() {
        zzaR(Integer.MAX_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzicc
    public int zzbr() {
        return zzaT(null);
    }

    public Object zzbs() throws Exception {
        return zzdc(zziaq.BUILD_MESSAGE_INFO, null, null);
    }

    public final void zzbx(zzidg zzidgVar) {
        this.zzt = zzidg.zzc(this.zzt, zzidgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzicc
    public void zzcX(zzhzw zzhzwVar) throws IOException {
        zzicm.zza().zzb(getClass()).zzf(this, zzhzx.zza(zzhzwVar));
    }

    public abstract Object zzdc(zziaq zziaqVar, Object obj, Object obj2);
}
