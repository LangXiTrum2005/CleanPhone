package androidx.datastore.preferences.protobuf;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f4155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f4156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p1 f4157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f4158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f4159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f4160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f4161g;

    static {
        Unsafe unsafeI = i();
        f4155a = unsafeI;
        f4156b = c.f4057a;
        boolean zH = h(Long.TYPE);
        boolean zH2 = h(Integer.TYPE);
        p1 o1Var = null;
        if (unsafeI != null) {
            if (!c.a()) {
                o1Var = new o1(unsafeI);
            } else if (zH) {
                o1Var = new n1(unsafeI, 1);
            } else if (zH2) {
                o1Var = new n1(unsafeI, 0);
            }
        }
        f4157c = o1Var;
        f4158d = o1Var == null ? false : o1Var.r();
        f4159e = o1Var == null ? false : o1Var.q();
        f4160f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field fieldG = g();
        if (fieldG != null && o1Var != null) {
            o1Var.i(fieldG);
        }
        f4161g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th2) {
        Logger.getLogger(q1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static boolean b(long j10, Object obj) {
        return ((byte) ((f4157c.f((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(long j10, Object obj) {
        return ((byte) ((f4157c.f((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f4155a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int e(Class cls) {
        if (f4159e) {
            return f4157c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f4159e) {
            f4157c.b(cls);
        }
    }

    public static Field g() {
        Field declaredField;
        Field declaredField2;
        if (c.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField(IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean h(Class cls) {
        if (!c.a()) {
            return false;
        }
        try {
            Class cls2 = f4156b;
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

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new m1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j10, byte b10) {
        f4157c.k(bArr, f4160f + j10, b10);
    }

    public static void k(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iF = f4157c.f(j11, obj);
        int i10 = ((~((int) j10)) & 3) << 3;
        m(((255 & b10) << i10) | (iF & (~(255 << i10))), j11, obj);
    }

    public static void l(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        m(((255 & b10) << i10) | (f4157c.f(j11, obj) & (~(255 << i10))), j11, obj);
    }

    public static void m(int i10, long j10, Object obj) {
        f4157c.n(i10, j10, obj);
    }

    public static void n(Object obj, long j10, long j11) {
        f4157c.o(obj, j10, j11);
    }

    public static void o(Object obj, long j10, Object obj2) {
        f4157c.p(obj, j10, obj2);
    }
}
