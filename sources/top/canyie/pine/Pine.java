package top.canyie.pine;

import android.support.v4.media.a;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import top.canyie.pine.callback.MethodHook;
import top.canyie.pine.entry.Arm64MarshmallowEntry;

/* JADX INFO: loaded from: classes7.dex */
public final class Pine {
    private static int arch;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f48853b;
    public static long closeElf;
    public static volatile int f;
    public static long findElfSymbol;
    public static long getMethodDeclaringClass;
    public static long openElf;
    public static long resumeVM;
    public static long suspendVM;
    public static long syncMethodEntry;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object[] f48852a = new Object[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f48854c = new HashMap(8, 2.0f);
    public static final ConcurrentHashMap d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f48855e = new Object();
    public static final HookHandler g = new AnonymousClass1();

    /* JADX INFO: renamed from: top.canyie.pine.Pine$1, reason: invalid class name */
    public class AnonymousClass1 implements HookHandler {
    }

    public static class CallFrame {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f48856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object[] f48857b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f48858c;
        public Throwable d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f48859e;
        public HookRecord f;
    }

    public interface HookHandler {
    }

    public interface HookListener {
    }

    public interface HookMode {
    }

    public static final class HookRecord {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f48860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f48861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f48862c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Class[] f48863e;
        public final HashSet f = new HashSet();
        public volatile Object g;
        public long trampoline;

        public HookRecord(Method method) {
            this.f48860a = method;
        }
    }

    public interface LibLoader {
    }

    public static Object a(HookRecord hookRecord, Object obj, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        Method method = hookRecord.f48860a;
        Method method2 = hookRecord.f48861b;
        Class<?> declaringClass = method.getDeclaringClass();
        syncMethodInfo(method, method2, false);
        Object objInvoke = method2.invoke(obj, objArr);
        declaringClass.getClass();
        return objInvoke;
    }

    public static HookRecord b(long j) {
        HookRecord hookRecord = (HookRecord) d.get(Long.valueOf(j));
        if (hookRecord != null) {
            return hookRecord;
        }
        throw new AssertionError("No HookRecord found for ArtMethod pointer 0x" + Long.toHexString(j));
    }

    public static Object c(long j, long j2) {
        if (j2 == 0) {
            return null;
        }
        return getObject0(j, j2);
    }

    public static native long cloneExtras(long j);

    private static native boolean compile0(long j, Member member);

    public static native long currentArtThread0();

    public static Object d(HookRecord hookRecord, Object obj, Object[] objArr) throws Throwable {
        boolean zIsEmpty;
        MethodHook[] methodHookArr;
        if (PineConfig.f48865b) {
            Log.d("Pine", "handleCall for method " + hookRecord.f48860a);
        }
        synchronized (hookRecord) {
            zIsEmpty = hookRecord.f.isEmpty();
        }
        if (zIsEmpty) {
            try {
                return a(hookRecord, obj, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getTargetException();
            }
        }
        CallFrame callFrame = new CallFrame();
        callFrame.f = hookRecord;
        callFrame.f48856a = obj;
        callFrame.f48857b = objArr;
        synchronized (hookRecord) {
            HashSet hashSet = hookRecord.f;
            methodHookArr = (MethodHook[]) hashSet.toArray(new MethodHook[hashSet.size()]);
        }
        int i2 = 0;
        do {
            MethodHook methodHook = methodHookArr[i2];
            try {
                methodHook.b(callFrame);
                if (callFrame.f48859e) {
                    i2++;
                    break;
                }
                i2++;
            } catch (Throwable th) {
                Log.e("Pine", "Unexpected exception occurred when calling " + methodHook.getClass().getName() + ".beforeCall()", th);
                callFrame.f48858c = null;
                callFrame.d = null;
                callFrame.f48859e = false;
            }
        } while (i2 < methodHookArr.length);
        if (!callFrame.f48859e) {
            try {
                callFrame.f48858c = a(callFrame.f, callFrame.f48856a, callFrame.f48857b);
                callFrame.d = null;
                callFrame.f48859e = true;
            } catch (InvocationTargetException e3) {
                callFrame.d = e3.getTargetException();
                callFrame.f48858c = null;
                callFrame.f48859e = true;
            }
        }
        int i3 = i2 - 1;
        do {
            MethodHook methodHook2 = methodHookArr[i3];
            Object obj2 = callFrame.f48858c;
            Throwable th2 = callFrame.d;
            try {
                methodHook2.a(callFrame);
            } catch (Throwable th3) {
                Log.e("Pine", "Unexpected exception occurred when calling " + methodHook2.getClass().getName() + ".afterCall()", th3);
                if (th2 == null) {
                    callFrame.f48858c = obj2;
                    callFrame.d = null;
                    callFrame.f48859e = true;
                } else {
                    callFrame.d = th2;
                    callFrame.f48858c = null;
                    callFrame.f48859e = true;
                }
            }
            i3--;
        } while (i3 >= 0);
        Throwable th4 = callFrame.d;
        if (th4 == null) {
            return callFrame.f48858c;
        }
        throw th4;
    }

    private static native boolean decompile0(Member member, boolean z2);

    private static native void disableHiddenApiPolicy0(boolean z2, boolean z3);

    private static native boolean disableJitInline0();

    private static native boolean disableProfileSaver0();

    public static void e(Method method, MethodHook methodHook) {
        boolean z2;
        HookRecord hookRecord;
        boolean z3;
        if (PineConfig.f48865b) {
            Log.d("Pine", "Hooking method " + method + " with callback " + methodHook);
        }
        if (method == null) {
            throw new NullPointerException("method == null");
        }
        int modifiers = method.getModifiers();
        if (Modifier.isAbstract(modifiers)) {
            throw new IllegalArgumentException("Cannot hook abstract methods: " + method);
        }
        method.setAccessible(true);
        if (!f48853b) {
            synchronized (Pine.class) {
                try {
                    if (!f48853b) {
                        g();
                        f48853b = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        long artMethod = getArtMethod(method);
        synchronized (f48855e) {
            try {
                ConcurrentHashMap concurrentHashMap = d;
                HookRecord hookRecord2 = (HookRecord) concurrentHashMap.get(Long.valueOf(artMethod));
                if (hookRecord2 == null) {
                    hookRecord2 = new HookRecord(method);
                    concurrentHashMap.put(Long.valueOf(artMethod), hookRecord2);
                    z2 = true;
                } else {
                    z2 = false;
                }
                hookRecord = hookRecord2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ((AnonymousClass1) g).getClass();
        if (z2) {
            Method method2 = hookRecord.f48860a;
            int i2 = f;
            boolean z4 = i2 == 1 || i2 == 3;
            long jCurrentArtThread0 = currentArtThread0();
            boolean zIsStatic = Modifier.isStatic(modifiers);
            hookRecord.f48862c = zIsStatic;
            if (zIsStatic) {
                try {
                    method2.invoke(null, method2.getParameterTypes().length > 0 ? null : new Object[1]);
                    throw new RuntimeException("No IllegalArgumentException thrown when resolve static method.");
                } catch (IllegalArgumentException unused) {
                    if (PineConfig.f48864a >= 29) {
                        makeClassesVisiblyInitialized(jCurrentArtThread0);
                    }
                } catch (Exception e2) {
                    throw new RuntimeException("Unknown exception thrown when resolve static method.", e2);
                }
            }
            Class<?> declaringClass = method2.getDeclaringClass();
            boolean zIsNative = Modifier.isNative(modifiers);
            boolean zIsProxyClass = Proxy.isProxyClass(declaringClass);
            if (!z4) {
                z3 = z4;
            } else if (zIsNative || zIsProxyClass) {
                z3 = false;
            } else {
                if (i2 == 1 && !compile0(jCurrentArtThread0, method2)) {
                    Log.w("Pine", "Cannot compile the target method, force replacement mode.");
                    z4 = false;
                }
                z3 = z4;
            }
            hookRecord.f48863e = method2.getParameterTypes();
            Class<?> returnType = method2.getReturnType();
            String strConcat = returnType.isPrimitive() ? returnType.getName().concat("Bridge") : "objectBridge";
            int length = hookRecord.f48863e.length;
            hookRecord.d = length;
            Method bridge = (PineConfig.f48864a == 23 && arch == 2) ? Arm64MarshmallowEntry.getBridge(strConcat, length) : (Method) f48854c.get(strConcat);
            if (bridge == null) {
                throw new AssertionError("Cannot find bridge method for " + method2);
            }
            Method methodHook0 = hook0(jCurrentArtThread0, declaringClass, hookRecord, method2, bridge, z3, zIsNative, zIsProxyClass);
            if (methodHook0 == null) {
                throw new RuntimeException("Failed to hook method " + method2);
            }
            methodHook0.setAccessible(true);
            hookRecord.f48861b = methodHook0;
        }
        synchronized (hookRecord) {
            hookRecord.f.add(methodHook);
        }
    }

    private static native void enableFastNative();

    public static void f() {
        String str;
        Class<?>[] clsArr;
        try {
            int i2 = arch;
            if (i2 == 2) {
                str = "top.canyie.pine.entry.Arm64Entry";
                Class cls = Long.TYPE;
                clsArr = new Class[]{cls, cls, cls, cls, cls, cls, cls};
            } else {
                Class cls2 = Integer.TYPE;
                if (i2 == 1) {
                    str = "top.canyie.pine.entry.Arm32Entry";
                    clsArr = new Class[]{cls2, cls2, cls2};
                } else {
                    if (i2 != 3) {
                        throw new RuntimeException("Unexpected arch " + arch);
                    }
                    str = "top.canyie.pine.entry.X86Entry";
                    clsArr = new Class[]{cls2, cls2, cls2};
                }
            }
            Class<?> cls3 = Class.forName(str, true, Pine.class.getClassLoader());
            String[] strArr = {"voidBridge", "intBridge", "longBridge", "doubleBridge", "floatBridge", "booleanBridge", "byteBridge", "charBridge", "shortBridge", "objectBridge"};
            for (int i3 = 0; i3 < 10; i3++) {
                String str2 = strArr[i3];
                Method declaredMethod = cls3.getDeclaredMethod(str2, clsArr);
                declaredMethod.setAccessible(true);
                f48854c.put(str2, declaredMethod);
            }
        } catch (Exception e2) {
            throw new RuntimeException("Failed to init bridge methods", e2);
        }
    }

    public static void g() {
        int i2 = PineConfig.f48864a;
        if (i2 < 19) {
            throw new RuntimeException(a.h(i2, "Unsupported android sdk level "));
        }
        String property = System.getProperty("java.vm.version");
        if (property == null || !property.startsWith("2")) {
            throw new RuntimeException("Only supports ART runtime");
        }
        f = i2 < 26 ? 3 : 2;
        try {
            System.loadLibrary("pine");
            init0(i2, PineConfig.f48865b, false, false, true, true);
            f();
        } catch (Exception e2) {
            throw new RuntimeException("Pine init error", e2);
        }
    }

    private static native long getAddress0(long j, Object obj);

    public static native void getArgsArm32(int i2, int i3, int[] iArr, int[] iArr2, float[] fArr);

    public static native void getArgsArm64(long j, long j2, boolean[] zArr, long[] jArr, long[] jArr2, double[] dArr);

    public static native void getArgsX86(int i2, int[] iArr, int i3);

    public static native long getArtMethod(Member member);

    private static native Object getObject0(long j, long j2);

    private static native Method hook0(long j, Class<?> cls, HookRecord hookRecord, Member member, Method method, boolean z2, boolean z3, boolean z4);

    private static native Method hookReplace0(long j, Class<?> cls, HookRecord hookRecord, Member member, Method method, Method method2, boolean z2, boolean z3, boolean z4);

    private static native void init0(int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6);

    private static native void makeClassesVisiblyInitialized(long j);

    private static native void setDebuggable0(boolean z2);

    private static native void setJitCompilationAllowed0(boolean z2, boolean z3);

    private static native void syncMethodInfo(Member member, Method method, boolean z2);
}
