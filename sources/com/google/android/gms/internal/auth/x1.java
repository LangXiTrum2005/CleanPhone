package com.google.android.gms.internal.auth;

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
public abstract class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f22917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f22918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w1 f22919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f22920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f22921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f22922f;

    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    static {
        boolean z10;
        boolean z11;
        w1 w1Var;
        Unsafe unsafeE = e();
        f22917a = unsafeE;
        int i10 = e0.f22815a;
        f22918b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM = m(cls);
        Class cls2 = Integer.TYPE;
        boolean zM2 = m(cls2);
        w1 u1Var = null;
        if (unsafeE != null) {
            if (zM) {
                u1Var = new v1(unsafeE);
            } else if (zM2) {
                u1Var = new u1(unsafeE);
            }
        }
        f22919c = u1Var;
        if (u1Var == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls3 = u1Var.f22913a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (p() == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } catch (Throwable th2) {
                Logger.getLogger(x1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
            }
        }
        f22920d = z10;
        w1 w1Var2 = f22919c;
        if (w1Var2 == null) {
            z11 = false;
        } else {
            try {
                Class<?> cls4 = w1Var2.f22913a.getClass();
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
                Logger.getLogger(x1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th3.toString()));
                z11 = false;
            }
        }
        f22921e = z11;
        n(byte[].class);
        n(boolean[].class);
        o(boolean[].class);
        n(int[].class);
        o(int[].class);
        n(long[].class);
        o(long[].class);
        n(float[].class);
        o(float[].class);
        n(double[].class);
        o(double[].class);
        n(Object[].class);
        o(Object[].class);
        Field fieldP = p();
        if (fieldP != null && (w1Var = f22919c) != null) {
            w1Var.f22913a.objectFieldOffset(fieldP);
        }
        f22922f = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(long j10, Object obj) {
        return f22919c.f22913a.getInt(obj, j10);
    }

    public static long b(long j10, Object obj) {
        return f22919c.f22913a.getLong(obj, j10);
    }

    public static Object c(Class cls) {
        try {
            return f22917a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object d(long j10, Object obj) {
        return f22919c.f22913a.getObject(obj, j10);
    }

    public static Unsafe e() {
        try {
            return (Unsafe) AccessController.doPrivileged(new t1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void f(Object obj, long j10, boolean z10) {
        w1 w1Var = f22919c;
        long j11 = (-4) & j10;
        int i10 = w1Var.f22913a.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        w1Var.f22913a.putInt(obj, j11, ((z10 ? 1 : 0) << i11) | ((~(255 << i11)) & i10));
    }

    public static /* synthetic */ void g(Object obj, long j10, boolean z10) {
        w1 w1Var = f22919c;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        w1Var.f22913a.putInt(obj, j11, ((z10 ? 1 : 0) << i10) | ((~(255 << i10)) & w1Var.f22913a.getInt(obj, j11)));
    }

    public static void h(int i10, long j10, Object obj) {
        f22919c.f22913a.putInt(obj, j10, i10);
    }

    public static void i(Object obj, long j10, long j11) {
        f22919c.f22913a.putLong(obj, j10, j11);
    }

    public static void j(Object obj, long j10, Object obj2) {
        f22919c.f22913a.putObject(obj, j10, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean k(long j10, Object obj) {
        return ((byte) ((f22919c.f22913a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean l(long j10, Object obj) {
        return ((byte) ((f22919c.f22913a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    public static boolean m(Class cls) {
        int i10 = e0.f22815a;
        try {
            Class cls2 = f22918b;
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

    public static void n(Class cls) {
        if (f22921e) {
            f22919c.f22913a.arrayBaseOffset(cls);
        }
    }

    public static void o(Class cls) {
        if (f22921e) {
            f22919c.f22913a.arrayIndexScale(cls);
        }
    }

    public static Field p() {
        Field declaredField;
        Field declaredField2;
        int i10 = e0.f22815a;
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
}
