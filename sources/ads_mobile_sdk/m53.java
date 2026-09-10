package ads_mobile_sdk;

import java.lang.reflect.Field;
import java.nio.Buffer;
import org.jacoco.core.runtime.AgentOptions;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class m53 {
    public final Unsafe a;

    public m53(Unsafe unsafe) {
        this.a = unsafe;
    }

    public final int a(Class cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public abstract void a(Object obj, long j, byte b);

    public abstract void a(Object obj, long j, double d);

    public abstract void a(Object obj, long j, float f);

    public abstract void a(Object obj, long j, boolean z);

    public abstract boolean a(Object obj, long j);

    public abstract byte b(Object obj, long j);

    public final int b(Class cls) {
        return this.a.arrayIndexScale(cls);
    }

    public abstract double c(Object obj, long j);

    public abstract float d(Object obj, long j);

    public final int e(Object obj, long j) {
        return this.a.getInt(obj, j);
    }

    public final long f(Object obj, long j) {
        return this.a.getLong(obj, j);
    }

    public final Object g(Object obj, long j) {
        return this.a.getObject(obj, j);
    }

    public final long a(Field field) {
        return this.a.objectFieldOffset(field);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037 A[PHI: r1
  0x0037: PHI (r1v8 java.lang.reflect.Field) = (r1v6 java.lang.reflect.Field), (r1v11 java.lang.reflect.Field) binds: [B:22:0x0049, B:12:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    public boolean b() {
        Field declaredField;
        Class<?> cls = Long.TYPE;
        Unsafe unsafe = this.a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", Field.class);
            cls2.getMethod("getLong", Object.class, cls);
            Unsafe unsafe2 = n53.a;
            Field field = null;
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
            return field != null;
        } catch (Throwable th) {
            n53.a(th);
            return false;
        }
    }

    public final void a(int i, long j, Object obj) {
        this.a.putInt(obj, j, i);
    }

    public final void a(Object obj, long j, long j2) {
        this.a.putLong(obj, j, j2);
    }

    public final void a(long j, Object obj, Object obj2) {
        this.a.putObject(obj, j, obj2);
    }

    public boolean a() {
        Unsafe unsafe = this.a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            n53.a(th);
            return false;
        }
    }
}
