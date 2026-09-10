package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final class zzidm {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzidl zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z2;
        boolean z3;
        zzidl zzidlVar;
        Unsafe unsafeZzt = zzt();
        zzc = unsafeZzt;
        int i2 = zzhyy.zza;
        zzd = Memory.class;
        Class cls = Long.TYPE;
        boolean zZzu = zzu(cls);
        zze = zZzu;
        Class cls2 = Integer.TYPE;
        boolean zZzu2 = zzu(cls2);
        zzidl zzidjVar = null;
        if (unsafeZzt != null) {
            if (zZzu) {
                zzidjVar = new zzidk(unsafeZzt);
            } else if (zZzu2) {
                zzidjVar = new zzidj(unsafeZzt);
            }
        }
        zzf = zzidjVar;
        if (zzidjVar == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls3 = zzidjVar.zza.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (zzE() == null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } catch (Throwable th) {
                zzB(th);
            }
        }
        zzg = z2;
        zzidl zzidlVar2 = zzf;
        if (zzidlVar2 == null) {
            z3 = false;
        } else {
            try {
                Class<?> cls4 = zzidlVar2.zza.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z3 = true;
            } catch (Throwable th2) {
                zzB(th2);
                z3 = false;
            }
        }
        zzh = z3;
        zza = zzC(byte[].class);
        zzC(boolean[].class);
        zzD(boolean[].class);
        zzC(int[].class);
        zzD(int[].class);
        zzC(long[].class);
        zzD(long[].class);
        zzC(float[].class);
        zzD(float[].class);
        zzC(double[].class);
        zzD(double[].class);
        zzC(Object[].class);
        zzD(Object[].class);
        Field fieldZzE = zzE();
        long jObjectFieldOffset = -1;
        if (fieldZzE != null && (zzidlVar = zzf) != null) {
            jObjectFieldOffset = zzidlVar.zza.objectFieldOffset(fieldZzE);
        }
        zzi = jObjectFieldOffset;
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzidm() {
    }

    public static /* synthetic */ void zzB(Throwable th) {
        Logger.getLogger(zzidm.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    private static int zzC(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzD(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzE() {
        int i2 = zzhyy.zza;
        Field fieldZzF = zzF(Buffer.class, "effectiveDirectAddress");
        if (fieldZzF != null) {
            return fieldZzF;
        }
        Field fieldZzF2 = zzF(Buffer.class, "address");
        if (fieldZzF2 == null || fieldZzF2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzF2;
    }

    private static Field zzF(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzG(Object obj, long j, byte b2) {
        Unsafe unsafe = zzf.zza;
        long j2 = (-4) & j;
        int i2 = unsafe.getInt(obj, j2);
        int i3 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i3) | (i2 & (~(255 << i3))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzH(Object obj, long j, byte b2) {
        Unsafe unsafe = zzf.zza;
        long j2 = (-4) & j;
        int i2 = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i2) | (unsafe.getInt(obj, j2) & (~(255 << i2))));
    }

    public static boolean zza() {
        return zzh;
    }

    public static boolean zzb() {
        return zzg;
    }

    public static Object zzc(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int zzd(Object obj, long j) {
        return zzf.zza.getInt(obj, j);
    }

    public static void zze(Object obj, long j, int i2) {
        zzf.zza.putInt(obj, j, i2);
    }

    public static long zzf(Object obj, long j) {
        return zzf.zza.getLong(obj, j);
    }

    public static void zzg(Object obj, long j, long j2) {
        zzf.zza.putLong(obj, j, j2);
    }

    public static boolean zzh(Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    public static void zzi(Object obj, long j, boolean z2) {
        zzf.zzc(obj, j, z2);
    }

    public static float zzj(Object obj, long j) {
        return zzf.zzd(obj, j);
    }

    public static void zzk(Object obj, long j, float f) {
        zzf.zze(obj, j, f);
    }

    public static double zzl(Object obj, long j) {
        return zzf.zzf(obj, j);
    }

    public static void zzm(Object obj, long j, double d) {
        zzf.zzg(obj, j, d);
    }

    public static Object zzn(Object obj, long j) {
        return zzf.zza.getObject(obj, j);
    }

    public static void zzo(Object obj, long j, Object obj2) {
        zzf.zza.putObject(obj, j, obj2);
    }

    public static void zzp(byte[] bArr, long j, byte b2) {
        zzf.zza(bArr, zza + j, b2);
    }

    public static void zzq(long j, byte[] bArr, long j2, long j3) {
        zzf.zzi(j, bArr, j2, j3);
    }

    public static byte zzr(long j) {
        return zzf.zzh(j);
    }

    public static long zzs(ByteBuffer byteBuffer) {
        zzidl zzidlVar = zzf;
        return zzidlVar.zza.getLong(byteBuffer, zzi);
    }

    public static Unsafe zzt() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzidi());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean zzu(Class cls) {
        int i2 = zzhyy.zza;
        try {
            Class cls2 = zzd;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean zzx(Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean zzy(Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
