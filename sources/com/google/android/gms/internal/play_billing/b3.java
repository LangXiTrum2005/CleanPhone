package com.google.android.gms.internal.play_billing;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f24231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f24232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a3 f24233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f24234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f24235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f24236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f24237g;

    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    static {
        boolean z10;
        boolean z11;
        a3 a3Var;
        Unsafe unsafeI = i();
        f24231a = unsafeI;
        int i10 = e1.f24262a;
        f24232b = Memory.class;
        Class cls = Long.TYPE;
        boolean zO = o(cls);
        Class cls2 = Integer.TYPE;
        boolean zO2 = o(cls2);
        a3 y2Var = null;
        if (unsafeI != null) {
            if (zO) {
                y2Var = new z2(unsafeI);
            } else if (zO2) {
                y2Var = new y2(unsafeI);
            }
        }
        f24233c = y2Var;
        if (y2Var == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls3 = y2Var.f24220a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (b() == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } catch (Throwable th2) {
                Logger.getLogger(b3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
            }
        }
        f24234d = z10;
        a3 a3Var2 = f24233c;
        if (a3Var2 == null) {
            z11 = false;
        } else {
            try {
                Class<?> cls4 = a3Var2.f24220a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z11 = true;
            } catch (Throwable th3) {
                Logger.getLogger(b3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th3.toString()));
                z11 = false;
            }
        }
        f24235e = z11;
        f24236f = p(byte[].class);
        p(boolean[].class);
        a(boolean[].class);
        p(int[].class);
        a(int[].class);
        p(long[].class);
        a(long[].class);
        p(float[].class);
        a(float[].class);
        p(double[].class);
        a(double[].class);
        p(Object[].class);
        a(Object[].class);
        Field fieldB = b();
        if (fieldB != null && (a3Var = f24233c) != null) {
            a3Var.f24220a.objectFieldOffset(fieldB);
        }
        f24237g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Class cls) {
        if (f24235e) {
            f24233c.f24220a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field declaredField;
        Field declaredField2;
        int i10 = e1.f24262a;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField(IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    public static void c(Object obj, long j10, byte b10) {
        Unsafe unsafe = f24233c.f24220a;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    public static void d(Object obj, long j10, byte b10) {
        Unsafe unsafe = f24233c.f24220a;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i10) | (unsafe.getInt(obj, j11) & (~(255 << i10))));
    }

    public static int e(long j10, Object obj) {
        return f24233c.f24220a.getInt(obj, j10);
    }

    public static long f(long j10, Object obj) {
        return f24233c.f24220a.getLong(obj, j10);
    }

    public static Object g(Class cls) {
        try {
            return f24231a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object h(long j10, Object obj) {
        return f24233c.f24220a.getObject(obj, j10);
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new x2());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(int i10, long j10, Object obj) {
        f24233c.f24220a.putInt(obj, j10, i10);
    }

    public static void k(Object obj, long j10, long j11) {
        f24233c.f24220a.putLong(obj, j10, j11);
    }

    public static void l(Object obj, long j10, Object obj2) {
        f24233c.f24220a.putObject(obj, j10, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean m(long j10, Object obj) {
        return ((byte) ((f24233c.f24220a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean n(long j10, Object obj) {
        return ((byte) ((f24233c.f24220a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    public static boolean o(Class cls) {
        int i10 = e1.f24262a;
        try {
            Class cls2 = f24232b;
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

    public static int p(Class cls) {
        if (f24235e) {
            return f24233c.f24220a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
