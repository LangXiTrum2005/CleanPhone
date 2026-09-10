package kotlin.reflect.jvm.internal.impl.storage;

import android.support.v4.media.a;
import com.thinkup.core.common.n.mo;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public class LockBasedStorageManager implements StorageManager {
    public static final String d = StringsKt.U(LockBasedStorageManager.class.getCanonicalName(), mo.ono, "");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final StorageManager f44473e = new AnonymousClass1("NO_LOCKS", EmptySimpleLock.f44472a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleLock f44474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExceptionHandlingStrategy f44475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44476c;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$1, reason: invalid class name */
    public static class AnonymousClass1 extends LockBasedStorageManager {
        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager
        public final RecursionDetectedResult j(Object obj, String str) {
            return new RecursionDetectedResult(null, true);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$4, reason: invalid class name */
    class AnonymousClass4 extends LockBasedNotNullLazyValue<Object> {
        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
        public final RecursionDetectedResult d(boolean z2) {
            return new RecursionDetectedResult(EmptyList.X, false);
        }
    }

    public static class CacheWithNotNullValuesBasedOnMemoizedFunction<K, V> extends CacheWithNullableValuesBasedOnMemoizedFunction<K, V> implements CacheWithNotNullValues<K, V> {
        @Override // kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues
        public final Object a(Object obj, Function0 function0) throws Throwable {
            Object objInvoke = invoke(new KeyWithComputation((FqName) obj, function0));
            if (objInvoke != null) {
                return objInvoke;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction", "computeIfAbsent"));
        }
    }

    public static class CacheWithNullableValuesBasedOnMemoizedFunction<K, V> extends MapBasedMemoizedFunction<KeyWithComputation<K, V>, V> implements CacheWithNullableValues<K, V> {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction$1, reason: invalid class name */
        class AnonymousClass1 implements Function1<KeyWithComputation<Object, Object>, Object> {
            /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ((KeyWithComputation) obj).f44479b.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CacheWithNullableValuesBasedOnMemoizedFunction(LockBasedStorageManager lockBasedStorageManager, ConcurrentHashMap concurrentHashMap) {
            super(lockBasedStorageManager, concurrentHashMap, new AnonymousClass1());
            if (lockBasedStorageManager == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "storageManager", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction", "<init>"));
            }
        }
    }

    public interface ExceptionHandlingStrategy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExceptionHandlingStrategy f44477a = new AnonymousClass1();

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$ExceptionHandlingStrategy$1, reason: invalid class name */
        public static class AnonymousClass1 implements ExceptionHandlingStrategy {
        }
    }

    public static class KeyWithComputation<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FqName f44478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Lambda f44479b;

        /* JADX WARN: Multi-variable type inference failed */
        public KeyWithComputation(FqName fqName, Function0 function0) {
            this.f44478a = fqName;
            this.f44479b = (Lambda) function0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f44478a.equals(((KeyWithComputation) obj).f44478a);
        }

        public final int hashCode() {
            return this.f44478a.hashCode();
        }
    }

    public static class LockBasedLazyValue<T> implements NullableLazyValue<T> {
        public final LockBasedStorageManager X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Function0 f44480Y;
        public volatile Object Z;

        public LockBasedLazyValue(LockBasedStorageManager lockBasedStorageManager, Function0 function0) {
            if (lockBasedStorageManager == null) {
                a(0);
                throw null;
            }
            this.Z = NotValue.X;
            this.X = lockBasedStorageManager;
            this.f44480Y = function0;
        }

        public static /* synthetic */ void a(int i2) {
            String str = (i2 == 2 || i2 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i2 == 2 || i2 == 3) ? 2 : 3];
            if (i2 == 1) {
                objArr[0] = "computable";
            } else if (i2 == 2 || i2 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i2 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i2 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i2 != 2 && i2 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i2 != 2 && i2 != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public void c(Object obj) {
        }

        public RecursionDetectedResult d(boolean z2) {
            RecursionDetectedResult recursionDetectedResultJ = this.X.j(null, "in a lazy value");
            if (recursionDetectedResultJ != null) {
                return recursionDetectedResultJ;
            }
            a(2);
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0038 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:20:0x003a A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:16:0x002a, B:18:0x0035, B:20:0x003a, B:22:0x0043, B:23:0x0046, B:27:0x0055, B:29:0x005b, B:31:0x005f, B:32:0x0065, B:33:0x006e, B:34:0x006f, B:35:0x0075, B:24:0x0048), top: B:38:0x0011, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x0043 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:16:0x002a, B:18:0x0035, B:20:0x003a, B:22:0x0043, B:23:0x0046, B:27:0x0055, B:29:0x005b, B:31:0x005f, B:32:0x0065, B:33:0x006e, B:34:0x006f, B:35:0x0075, B:24:0x0048), top: B:38:0x0011, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x0046 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:16:0x002a, B:18:0x0035, B:20:0x003a, B:22:0x0043, B:23:0x0046, B:27:0x0055, B:29:0x005b, B:31:0x005f, B:32:0x0065, B:33:0x006e, B:34:0x006f, B:35:0x0075, B:24:0x0048), top: B:38:0x0011, inners: #1 }] */
        @Override // kotlin.jvm.functions.Function0
        public Object invoke() throws Throwable {
            RecursionDetectedResult recursionDetectedResultD;
            Object obj = this.Z;
            if (!(obj instanceof NotValue)) {
                WrappedValues.b(obj);
                return obj;
            }
            this.X.f44474a.lock();
            try {
                Object objInvoke = this.Z;
                if (objInvoke instanceof NotValue) {
                    NotValue notValue = NotValue.f44482Y;
                    NotValue notValue2 = NotValue.Z;
                    if (objInvoke == notValue) {
                        this.Z = notValue2;
                        RecursionDetectedResult recursionDetectedResultD2 = d(true);
                        if (!recursionDetectedResultD2.f44484b) {
                            objInvoke = recursionDetectedResultD2.f44483a;
                        } else if (objInvoke == notValue2) {
                            recursionDetectedResultD = d(false);
                            if (recursionDetectedResultD.f44484b) {
                                this.Z = notValue;
                                try {
                                    objInvoke = this.f44480Y.invoke();
                                    c(objInvoke);
                                    this.Z = objInvoke;
                                } catch (Throwable th) {
                                    if (ExceptionUtilsKt.a(th)) {
                                        this.Z = NotValue.X;
                                        throw th;
                                    }
                                    if (this.Z == notValue) {
                                        this.Z = WrappedValues.a(th);
                                    }
                                    ((ExceptionHandlingStrategy.AnonymousClass1) this.X.f44475b).getClass();
                                    throw th;
                                }
                            } else {
                                objInvoke = recursionDetectedResultD.f44483a;
                            }
                        } else {
                            this.Z = notValue;
                            objInvoke = this.f44480Y.invoke();
                            c(objInvoke);
                            this.Z = objInvoke;
                        }
                    } else if (objInvoke == notValue2) {
                        recursionDetectedResultD = d(false);
                        if (recursionDetectedResultD.f44484b) {
                            objInvoke = recursionDetectedResultD.f44483a;
                        } else {
                            this.Z = notValue;
                            objInvoke = this.f44480Y.invoke();
                            c(objInvoke);
                            this.Z = objInvoke;
                        }
                    } else {
                        this.Z = notValue;
                        objInvoke = this.f44480Y.invoke();
                        c(objInvoke);
                        this.Z = objInvoke;
                    }
                } else {
                    WrappedValues.b(objInvoke);
                }
                this.X.f44474a.unlock();
                return objInvoke;
            } catch (Throwable th2) {
                this.X.f44474a.unlock();
                throw th2;
            }
        }

        public final boolean j() {
            return (this.Z == NotValue.X || this.Z == NotValue.f44482Y) ? false : true;
        }
    }

    public static abstract class LockBasedLazyValueWithPostCompute<T> extends LockBasedLazyValue<T> {
        public volatile SingleThreadValue e0;

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
        public final void c(Object obj) {
            this.e0 = new SingleThreadValue(obj);
            try {
                e(obj);
            } finally {
                this.e0 = null;
            }
        }

        public abstract void e(Object obj);

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue, kotlin.jvm.functions.Function0
        public Object invoke() {
            SingleThreadValue singleThreadValue = this.e0;
            if (singleThreadValue == null || singleThreadValue.f44486b != Thread.currentThread()) {
                return super.invoke();
            }
            if (singleThreadValue.f44486b == Thread.currentThread()) {
                return singleThreadValue.f44485a;
            }
            throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
        }
    }

    public static class LockBasedNotNullLazyValue<T> extends LockBasedLazyValue<T> implements NotNullLazyValue<T> {
        public static /* synthetic */ void a(int i2) {
            String str = i2 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i2 != 2 ? 3 : 2];
            if (i2 == 1) {
                objArr[0] = "computable";
            } else if (i2 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i2 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i2 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i2 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue, kotlin.jvm.functions.Function0
        public final Object invoke() throws Throwable {
            Object objInvoke = super.invoke();
            if (objInvoke != null) {
                return objInvoke;
            }
            a(2);
            throw null;
        }
    }

    public static abstract class LockBasedNotNullLazyValueWithPostCompute<T> extends LockBasedLazyValueWithPostCompute<T> implements NotNullLazyValue<T> {
        public static /* synthetic */ void a(int i2) {
            String str = i2 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i2 != 2 ? 3 : 2];
            if (i2 == 1) {
                objArr[0] = "computable";
            } else if (i2 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i2 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i2 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i2 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValueWithPostCompute, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue, kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object objInvoke = super.invoke();
            if (objInvoke != null) {
                return objInvoke;
            }
            a(2);
            throw null;
        }
    }

    public static class MapBasedMemoizedFunction<K, V> implements MemoizedFunctionToNullable<K, V> {
        public final LockBasedStorageManager X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final ConcurrentHashMap f44481Y;
        public final Function1 Z;

        public MapBasedMemoizedFunction(LockBasedStorageManager lockBasedStorageManager, ConcurrentHashMap concurrentHashMap, Function1 function1) {
            if (lockBasedStorageManager == null) {
                c(0);
                throw null;
            }
            this.X = lockBasedStorageManager;
            this.f44481Y = concurrentHashMap;
            this.Z = function1;
        }

        public static /* synthetic */ void c(int i2) {
            String str = (i2 == 3 || i2 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i2 == 3 || i2 == 4) ? 2 : 3];
            if (i2 == 1) {
                objArr[0] = "map";
            } else if (i2 == 2) {
                objArr[0] = "compute";
            } else if (i2 == 3 || i2 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i2 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i2 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i2 != 3 && i2 != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i2 != 3 && i2 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable
        public final boolean b(FqName fqName) {
            Object obj = this.f44481Y.get(fqName);
            return (obj == null || obj == NotValue.f44482Y) ? false : true;
        }

        public final AssertionError d(Object obj, Object obj2) {
            AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.X);
            LockBasedStorageManager.k(assertionError);
            return assertionError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public Object invoke(Object obj) throws Throwable {
            ConcurrentHashMap concurrentHashMap = this.f44481Y;
            Object obj2 = concurrentHashMap.get(obj);
            NotValue notValue = NotValue.f44482Y;
            Object obj3 = WrappedValues.f44651a;
            AssertionError assertionErrorD = null;
            if (obj2 != null && obj2 != notValue) {
                WrappedValues.b(obj2);
                if (obj2 == obj3) {
                    return null;
                }
                return obj2;
            }
            LockBasedStorageManager lockBasedStorageManager = this.X;
            SimpleLock simpleLock = lockBasedStorageManager.f44474a;
            SimpleLock simpleLock2 = lockBasedStorageManager.f44474a;
            simpleLock.lock();
            try {
                Object obj4 = concurrentHashMap.get(obj);
                NotValue notValue2 = NotValue.Z;
                if (obj4 == notValue) {
                    RecursionDetectedResult recursionDetectedResultJ = lockBasedStorageManager.j(obj, "");
                    if (recursionDetectedResultJ == null) {
                        c(3);
                        throw null;
                    }
                    if (!recursionDetectedResultJ.f44484b) {
                        Object obj5 = recursionDetectedResultJ.f44483a;
                        simpleLock2.unlock();
                        return obj5;
                    }
                    obj4 = notValue2;
                }
                if (obj4 == notValue2) {
                    RecursionDetectedResult recursionDetectedResultJ2 = lockBasedStorageManager.j(obj, "");
                    if (recursionDetectedResultJ2 == null) {
                        c(3);
                        throw null;
                    }
                    if (!recursionDetectedResultJ2.f44484b) {
                        Object obj6 = recursionDetectedResultJ2.f44483a;
                        simpleLock2.unlock();
                        return obj6;
                    }
                }
                if (obj4 != null) {
                    WrappedValues.b(obj4);
                    Object obj7 = obj4 != obj3 ? obj4 : null;
                    simpleLock2.unlock();
                    return obj7;
                }
                try {
                    concurrentHashMap.put(obj, notValue);
                    Object objInvoke = this.Z.invoke(obj);
                    if (objInvoke != null) {
                        obj3 = objInvoke;
                    }
                    Object objPut = concurrentHashMap.put(obj, obj3);
                    if (objPut == notValue) {
                        simpleLock2.unlock();
                        return objInvoke;
                    }
                    assertionErrorD = d(obj, objPut);
                    throw assertionErrorD;
                } catch (Throwable th) {
                    if (ExceptionUtilsKt.a(th)) {
                        concurrentHashMap.remove(obj);
                        throw th;
                    }
                    ExceptionHandlingStrategy exceptionHandlingStrategy = lockBasedStorageManager.f44475b;
                    if (th == assertionErrorD) {
                        ((ExceptionHandlingStrategy.AnonymousClass1) exceptionHandlingStrategy).getClass();
                        throw th;
                    }
                    Object objPut2 = concurrentHashMap.put(obj, WrappedValues.a(th));
                    if (objPut2 != notValue) {
                        throw d(obj, objPut2);
                    }
                    ((ExceptionHandlingStrategy.AnonymousClass1) exceptionHandlingStrategy).getClass();
                    throw th;
                }
            } catch (Throwable th2) {
                simpleLock2.unlock();
                throw th2;
            }
        }
    }

    public static class MapBasedMemoizedFunctionToNotNull<K, V> extends MapBasedMemoizedFunction<K, V> implements MemoizedFunctionToNotNull<K, V> {
        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.MapBasedMemoizedFunction, kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) throws Throwable {
            Object objInvoke = super.invoke(obj);
            if (objInvoke != null) {
                return objInvoke;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull", "invoke"));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NotValue {
        public static final NotValue X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final NotValue f44482Y;
        public static final NotValue Z;
        public static final /* synthetic */ NotValue[] e0;

        static {
            NotValue notValue = new NotValue("NOT_COMPUTED", 0);
            X = notValue;
            NotValue notValue2 = new NotValue("COMPUTING", 1);
            f44482Y = notValue2;
            NotValue notValue3 = new NotValue("RECURSION_WAS_DETECTED", 2);
            Z = notValue3;
            e0 = new NotValue[]{notValue, notValue2, notValue3};
        }

        public static NotValue valueOf(String str) {
            return (NotValue) Enum.valueOf(NotValue.class, str);
        }

        public static NotValue[] values() {
            return (NotValue[]) e0.clone();
        }
    }

    public static class RecursionDetectedResult<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f44483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f44484b;

        public RecursionDetectedResult(Object obj, boolean z2) {
            this.f44483a = obj;
            this.f44484b = z2;
        }

        public final String toString() {
            return this.f44484b ? "FALL_THROUGH" : String.valueOf(this.f44483a);
        }
    }

    public LockBasedStorageManager(String str) {
        this(str, new DefaultSimpleLock(new ReentrantLock()));
    }

    public static void k(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i2 = 0;
        while (i2 < length) {
            if (!stackTrace[i2].getClassName().startsWith(d)) {
                List listSubList = Arrays.asList(stackTrace).subList(i2, length);
                assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
            }
            i2++;
        }
        i2 = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i2, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public final NotNullLazyValue a(Function0 function0) {
        return new LockBasedNotNullLazyValue(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public final NullableLazyValue b(Function0 function0) {
        return new LockBasedLazyValue(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public final NotNullLazyValue c(Function0 function0, final Function1 function1, final Function1 function2) {
        return new LockBasedNotNullLazyValueWithPostCompute<Object>(this, function0) { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.5
            {
                if (this != null) {
                    this.e0 = null;
                } else {
                    LockBasedNotNullLazyValueWithPostCompute.a(0);
                    throw null;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
            public final RecursionDetectedResult d(boolean z2) {
                return new RecursionDetectedResult(function1.invoke(Boolean.valueOf(z2)), false);
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValueWithPostCompute
            public final void e(Object obj) {
                if (obj == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "value", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5", "doPostCompute"));
                }
                function2.invoke(obj);
            }
        };
    }

    public final Object d(Function0 function0) {
        SimpleLock simpleLock = this.f44474a;
        simpleLock.lock();
        try {
            function0.invoke();
            simpleLock.unlock();
            return null;
        } catch (Throwable th) {
            try {
                ((ExceptionHandlingStrategy.AnonymousClass1) this.f44475b).getClass();
                throw th;
            } catch (Throwable th2) {
                simpleLock.unlock();
                throw th2;
            }
        }
    }

    public final CacheWithNotNullValues e() {
        return new CacheWithNotNullValuesBasedOnMemoizedFunction(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    public final CacheWithNullableValues f() {
        return new CacheWithNullableValuesBasedOnMemoizedFunction(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    public final MemoizedFunctionToNotNull g(Function1 function1) {
        return new MapBasedMemoizedFunctionToNotNull(this, new ConcurrentHashMap(3, 1.0f, 2), function1);
    }

    public final MemoizedFunctionToNullable h(Function1 function1) {
        return new MapBasedMemoizedFunction(this, new ConcurrentHashMap(3, 1.0f, 2), function1);
    }

    public final NotNullLazyValue i(Function0 function0) {
        return new AnonymousClass4(this, function0);
    }

    public RecursionDetectedResult j(Object obj, String str) {
        String str2;
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        k(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return a.r(sb, this.f44476c, ")");
    }

    public LockBasedStorageManager(String str, SimpleLock simpleLock) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.f44477a;
        this.f44474a = simpleLock;
        this.f44475b = exceptionHandlingStrategy;
        this.f44476c = str;
    }
}
