package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jacoco.core.runtime.AgentOptions;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: UnsafeUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class sayid {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final long f9818adultoid;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final long f9819apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final long f9820arytenoidectomy;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final long f9824cutely;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static final int f9826dovishness;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final long f9827formularize;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public static final boolean f9828gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final long f9829graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final long f9830impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final long f9831impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final long f9832kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final long f9834molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final long f9835monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final long f9836polloi;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final long f9838taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public static final long f9839triweekly;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Unsafe f9821attabal = kattegat();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Class<?> f9837saneness = androidx.datastore.preferences.protobuf.wireman.saneness();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final boolean f9825dern = arytenoidectomy(Long.TYPE);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final boolean f9840wireman = arytenoidectomy(Integer.TYPE);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final marial f9833marial = yemenite();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final boolean f9822beachfront = clubfoot();

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final boolean f9823competently = overspeculate();

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public class attabal implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public static final class dern extends marial {
        public dern(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public void arytenoidectomy(Object obj, long j, double d) {
            molybdenite(obj, j, Double.doubleToLongBits(d));
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public byte beachfront(Object obj, long j) {
            return sayid.f9828gintrap ? sayid.rotuma(obj, j) : sayid.preprohormone(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public double competently(Object obj, long j) {
            return Double.longBitsToDouble(apical(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public long cutely(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public void dern(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public boolean dovishness() {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public float impromptu(Object obj, long j) {
            return Float.intBitsToFloat(taiyuan(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public void kowloon(Object obj, long j, byte b) {
            if (sayid.f9828gintrap) {
                sayid.creditor(obj, j, b);
            } else {
                sayid.starveling(obj, j, b);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public byte marial(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public void monoploid(Object obj, long j, float f) {
            polloi(obj, j, Float.floatToIntBits(f));
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public void triweekly(Object obj, long j, boolean z) {
            if (sayid.f9828gintrap) {
                sayid.grimness(obj, j, z);
            } else {
                sayid.saran(obj, j, z);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public boolean wireman(Object obj, long j) {
            return sayid.f9828gintrap ? sayid.graveside(obj, j) : sayid.adultoid(obj, j);
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public static abstract class marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public Unsafe f9841attabal;

        public marial(Unsafe unsafe) {
            this.f9841attabal = unsafe;
        }

        public boolean adultoid() {
            Unsafe unsafe = this.f9841attabal;
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
                sayid.merc(th);
                return false;
            }
        }

        public final long apical(Object obj, long j) {
            return this.f9841attabal.getLong(obj, j);
        }

        public abstract void arytenoidectomy(Object obj, long j, double d);

        public final int attabal(Class<?> cls) {
            return this.f9841attabal.arrayBaseOffset(cls);
        }

        public abstract byte beachfront(Object obj, long j);

        public abstract double competently(Object obj, long j);

        public abstract long cutely(long j);

        public abstract void dern(long j, byte[] bArr, long j2, long j3);

        public boolean dovishness() {
            Unsafe unsafe = this.f9841attabal;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return sayid.triweekly() != null;
            } catch (Throwable th) {
                sayid.merc(th);
                return false;
            }
        }

        public final Object formularize(Object obj, long j) {
            return this.f9841attabal.getObject(obj, j);
        }

        public final void graveside(Object obj, long j, Object obj2) {
            this.f9841attabal.putObject(obj, j, obj2);
        }

        public final long impassible(Field field) {
            return this.f9841attabal.objectFieldOffset(field);
        }

        public abstract float impromptu(Object obj, long j);

        public abstract void kowloon(Object obj, long j, byte b);

        public abstract byte marial(long j);

        public final void molybdenite(Object obj, long j, long j2) {
            this.f9841attabal.putLong(obj, j, j2);
        }

        public abstract void monoploid(Object obj, long j, float f);

        public final void polloi(Object obj, long j, int i) {
            this.f9841attabal.putInt(obj, j, i);
        }

        public final int saneness(Class<?> cls) {
            return this.f9841attabal.arrayIndexScale(cls);
        }

        public final int taiyuan(Object obj, long j) {
            return this.f9841attabal.getInt(obj, j);
        }

        public abstract void triweekly(Object obj, long j, boolean z);

        public abstract boolean wireman(Object obj, long j);
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public static final class saneness extends marial {
        public saneness(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public void arytenoidectomy(Object obj, long j, double d) {
            molybdenite(obj, j, Double.doubleToLongBits(d));
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public byte beachfront(Object obj, long j) {
            return sayid.f9828gintrap ? sayid.rotuma(obj, j) : sayid.preprohormone(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public double competently(Object obj, long j) {
            return Double.longBitsToDouble(apical(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public long cutely(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public void dern(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public boolean dovishness() {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public float impromptu(Object obj, long j) {
            return Float.intBitsToFloat(taiyuan(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public void kowloon(Object obj, long j, byte b) {
            if (sayid.f9828gintrap) {
                sayid.creditor(obj, j, b);
            } else {
                sayid.starveling(obj, j, b);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public byte marial(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public void monoploid(Object obj, long j, float f) {
            polloi(obj, j, Float.floatToIntBits(f));
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public void triweekly(Object obj, long j, boolean z) {
            if (sayid.f9828gintrap) {
                sayid.grimness(obj, j, z);
            } else {
                sayid.saran(obj, j, z);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public boolean wireman(Object obj, long j) {
            return sayid.f9828gintrap ? sayid.graveside(obj, j) : sayid.adultoid(obj, j);
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public static final class wireman extends marial {
        public wireman(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public boolean adultoid() {
            if (!super.adultoid()) {
                return false;
            }
            try {
                Class<?> cls = this.f9841attabal.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                sayid.merc(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public void arytenoidectomy(Object obj, long j, double d) {
            this.f9841attabal.putDouble(obj, j, d);
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public byte beachfront(Object obj, long j) {
            return this.f9841attabal.getByte(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public double competently(Object obj, long j) {
            return this.f9841attabal.getDouble(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public long cutely(long j) {
            return this.f9841attabal.getLong(j);
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public void dern(long j, byte[] bArr, long j2, long j3) {
            this.f9841attabal.copyMemory((Object) null, j, bArr, sayid.f9831impromptu + j2, j3);
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public boolean dovishness() {
            if (!super.dovishness()) {
                return false;
            }
            try {
                Class<?> cls = this.f9841attabal.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                sayid.merc(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public float impromptu(Object obj, long j) {
            return this.f9841attabal.getFloat(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public void kowloon(Object obj, long j, byte b) {
            this.f9841attabal.putByte(obj, j, b);
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public byte marial(long j) {
            return this.f9841attabal.getByte(j);
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public void monoploid(Object obj, long j, float f) {
            this.f9841attabal.putFloat(obj, j, f);
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public void triweekly(Object obj, long j, boolean z) {
            this.f9841attabal.putBoolean(obj, j, z);
        }

        @Override // androidx.datastore.preferences.protobuf.sayid.marial
        public boolean wireman(Object obj, long j) {
            return this.f9841attabal.getBoolean(obj, j);
        }
    }

    static {
        long jFormularize = formularize(byte[].class);
        f9831impromptu = jFormularize;
        f9838taiyuan = formularize(boolean[].class);
        f9824cutely = impassible(boolean[].class);
        f9819apical = formularize(int[].class);
        f9827formularize = impassible(int[].class);
        f9830impassible = formularize(long[].class);
        f9839triweekly = impassible(long[].class);
        f9832kowloon = formularize(float[].class);
        f9820arytenoidectomy = impassible(float[].class);
        f9835monoploid = formularize(double[].class);
        f9836polloi = impassible(double[].class);
        f9834molybdenite = formularize(Object[].class);
        f9829graveside = impassible(Object[].class);
        f9818adultoid = polloi(triweekly());
        f9826dovishness = (int) (jFormularize & 7);
        f9828gintrap = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static boolean adultoid(Object obj, long j) {
        return preprohormone(obj, j) != 0;
    }

    public static <T> T allocateInstance(Class<T> cls) {
        try {
            return (T) f9821attabal.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static long apical(ByteBuffer byteBuffer) {
        return f9833marial.apical(byteBuffer, f9818adultoid);
    }

    public static boolean arytenoidectomy(Class<?> cls) {
        if (!androidx.datastore.preferences.protobuf.wireman.dern()) {
            return false;
        }
        try {
            Class<?> cls2 = f9837saneness;
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

    public static boolean clubfoot() {
        marial marialVar = f9833marial;
        if (marialVar == null) {
            return false;
        }
        return marialVar.dovishness();
    }

    public static double cord(Object obj, long j) {
        return f9833marial.competently(obj, j);
    }

    public static void creditor(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iStratoscope = stratoscope(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        peridotite(obj, j2, ((255 & b) << i) | (iStratoscope & (~(255 << i))));
    }

    public static float cuirassed(Object obj, long j) {
        return f9833marial.impromptu(obj, j);
    }

    public static byte dovishness(long j) {
        return f9833marial.marial(j);
    }

    public static int formularize(Class<?> cls) {
        if (f9823competently) {
            return f9833marial.attabal(cls);
        }
        return -1;
    }

    public static byte gintrap(byte[] bArr, long j) {
        return f9833marial.beachfront(bArr, f9831impromptu + j);
    }

    public static boolean graveside(Object obj, long j) {
        return rotuma(obj, j) != 0;
    }

    public static void grimness(Object obj, long j, boolean z) {
        creditor(obj, j, z ? (byte) 1 : (byte) 0);
    }

    public static void hydrovane(Object obj, long j, double d) {
        f9833marial.arytenoidectomy(obj, j, d);
    }

    public static int impassible(Class<?> cls) {
        if (f9823competently) {
            return f9833marial.saneness(cls);
        }
        return -1;
    }

    public static Unsafe kattegat() {
        try {
            return (Unsafe) AccessController.doPrivileged(new attabal());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void kowloon(long j, byte[] bArr, long j2, long j3) {
        f9833marial.dern(j, bArr, j2, j3);
    }

    public static void mathsort(Object obj, long j, long j2) {
        f9833marial.molybdenite(obj, j, j2);
    }

    public static void merc(Throwable th) {
        Logger.getLogger(sayid.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean molybdenite(Object obj, long j) {
        return f9833marial.wireman(obj, j);
    }

    public static Field monoploid(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long oilcan(Object obj, long j) {
        return f9833marial.apical(obj, j);
    }

    public static boolean overspeculate() {
        marial marialVar = f9833marial;
        if (marialVar == null) {
            return false;
        }
        return marialVar.adultoid();
    }

    public static void peridotite(Object obj, long j, int i) {
        f9833marial.polloi(obj, j, i);
    }

    public static long polder(Field field) {
        return f9833marial.impassible(field);
    }

    public static long polloi(Field field) {
        marial marialVar;
        if (field == null || (marialVar = f9833marial) == null) {
            return -1L;
        }
        return marialVar.impassible(field);
    }

    public static byte preprohormone(Object obj, long j) {
        return (byte) ((stratoscope(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static void privatdozent(byte[] bArr, long j, byte b) {
        f9833marial.kowloon(bArr, f9831impromptu + j, b);
    }

    public static boolean restrictive() {
        return f9822beachfront;
    }

    public static byte rotuma(Object obj, long j) {
        return (byte) ((stratoscope(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static void saran(Object obj, long j, boolean z) {
        starveling(obj, j, z ? (byte) 1 : (byte) 0);
    }

    public static Object sealless(Object obj, long j) {
        return f9833marial.formularize(obj, j);
    }

    public static void seminary(Object obj, long j, boolean z) {
        f9833marial.triweekly(obj, j, z);
    }

    public static void splinterproof(Object obj, long j, Object obj2) {
        f9833marial.graveside(obj, j, obj2);
    }

    public static void starveling(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        peridotite(obj, j2, ((255 & b) << i) | (stratoscope(obj, j2) & (~(255 << i))));
    }

    public static int stratoscope(Object obj, long j) {
        return f9833marial.taiyuan(obj, j);
    }

    public static boolean supplicat() {
        return f9823competently;
    }

    public static Field triweekly() {
        Field fieldMonoploid;
        if (androidx.datastore.preferences.protobuf.wireman.dern() && (fieldMonoploid = monoploid(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldMonoploid;
        }
        Field fieldMonoploid2 = monoploid(Buffer.class, AgentOptions.ADDRESS);
        if (fieldMonoploid2 == null || fieldMonoploid2.getType() != Long.TYPE) {
            return null;
        }
        return fieldMonoploid2;
    }

    public static long trm(long j) {
        return f9833marial.cutely(j);
    }

    public static void walach(Object obj, long j, float f) {
        f9833marial.monoploid(obj, j, f);
    }

    public static marial yemenite() {
        Unsafe unsafe = f9821attabal;
        if (unsafe == null) {
            return null;
        }
        if (!androidx.datastore.preferences.protobuf.wireman.dern()) {
            return new wireman(unsafe);
        }
        if (f9825dern) {
            return new dern(unsafe);
        }
        if (f9840wireman) {
            return new saneness(unsafe);
        }
        return null;
    }
}
