package ads_mobile_sdk;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jacoco.core.runtime.AgentOptions;
import saneness.decantation;
import saneness.hotbox;
import saneness.mercenary;
import saneness.strum;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class n53 {
    public static final Unsafe a;
    public static final Class b;
    public static final m53 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:28:0x009b A[PHI: r3
  0x009b: PHI (r3v19 java.lang.reflect.Field) = (r3v17 java.lang.reflect.Field), (r3v22 java.lang.reflect.Field) binds: [B:35:0x00ab, B:27:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    static {
        m53 hotboxVar;
        Field declaredField;
        Unsafe unsafeA = a();
        a = unsafeA;
        b = sb.a();
        Class<?> cls = Long.TYPE;
        boolean zD = d(cls);
        boolean zD2 = d(Integer.TYPE);
        Field field = null;
        if (unsafeA == null) {
            hotboxVar = null;
        } else if (!sb.b()) {
            hotboxVar = new hotbox(unsafeA);
        } else if (zD) {
            hotboxVar = new decantation(unsafeA);
        } else if (zD2) {
            hotboxVar = new strum(unsafeA);
        } else {
            hotboxVar = null;
        }
        c = hotboxVar;
        d = hotboxVar == null ? false : hotboxVar.b();
        e = hotboxVar == null ? false : hotboxVar.a();
        f = b(byte[].class);
        b(boolean[].class);
        c(boolean[].class);
        b(int[].class);
        c(int[].class);
        b(long[].class);
        c(long[].class);
        b(float[].class);
        c(float[].class);
        b(double[].class);
        c(double[].class);
        b(Object[].class);
        c(Object[].class);
        if (sb.b()) {
            try {
                declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField = null;
            }
            if (declaredField != null) {
                field = declaredField;
            } else {
                try {
                    declaredField = Buffer.class.getDeclaredField(AgentOptions.ADDRESS);
                } catch (Throwable unused2) {
                    declaredField = null;
                }
                if (declaredField != null && declaredField.getType() == cls) {
                    field = declaredField;
                }
            }
        } else {
            declaredField = Buffer.class.getDeclaredField(AgentOptions.ADDRESS);
            if (declaredField != null) {
                field = declaredField;
            }
        }
        if (field != null && hotboxVar != null) {
            hotboxVar.a(field);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static byte a(Object obj, long j) {
        return (byte) ((c.e(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static void b(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        m53 m53Var = c;
        int i = (((int) j) & 3) << 3;
        m53Var.a(((255 & b2) << i) | (m53Var.e(obj, j2) & (~(255 << i))), j2, obj);
    }

    public static void c(Class cls) {
        if (e) {
            c.b(cls);
        }
    }

    public static boolean d(Class cls) {
        if (!sb.b()) {
            return false;
        }
        try {
            Class cls2 = b;
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

    public static Unsafe a() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new mercenary());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(n53.class.getName()).log(Level.WARNING, "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static int b(Class cls) {
        if (e) {
            return c.a(cls);
        }
        return -1;
    }

    public static void a(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        m53 m53Var = c;
        int iE = m53Var.e(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m53Var.a(((255 & b2) << i) | (iE & (~(255 << i))), j2, obj);
    }

    public static Object a(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void a(int i, long j, Object obj) {
        c.a(i, j, obj);
    }

    public static void a(Object obj, long j, boolean z) {
        c.a(obj, j, z);
    }

    public static void a(Object obj, long j, float f2) {
        c.a(obj, j, f2);
    }

    public static void a(Object obj, long j, double d2) {
        c.a(obj, j, d2);
    }

    public static void a(long j, Object obj, Serializable serializable) {
        c.a(j, obj, serializable);
    }

    public static void a(Throwable th) {
        Logger.getLogger(n53.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + String.valueOf(th));
    }
}
