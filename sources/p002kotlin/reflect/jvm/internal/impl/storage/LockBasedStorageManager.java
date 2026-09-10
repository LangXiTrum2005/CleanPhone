package p002kotlin.reflect.jvm.internal.impl.storage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import p002kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public class LockBasedStorageManager implements yeast.formularize {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final p002kotlin.reflect.jvm.internal.impl.storage.attabal f31627attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f31628dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final beachfront f31629saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final String f31626wireman = StringsKt.demilitarize(LockBasedStorageManager.class.getCanonicalName(), ".", "");

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final yeast.formularize f31625marial = new attabal("NO_LOCKS", beachfront.f31631attabal, yeast.marial.f39731saneness);

    public enum NotValue {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    public static abstract class apical<T> extends taiyuan<T> implements yeast.impromptu<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public apical(LockBasedStorageManager lockBasedStorageManager, Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                attabal(0);
            }
            if (function0 == null) {
                attabal(1);
            }
        }

        private static /* synthetic */ void attabal(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.taiyuan, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.impromptu, p002kotlin.jvm.functions.Function0
        public T invoke() {
            T t = (T) super.invoke();
            if (t == null) {
                attabal(2);
            }
            return t;
        }
    }

    public static class attabal extends LockBasedStorageManager {
        public attabal(String str, beachfront beachfrontVar, p002kotlin.reflect.jvm.internal.impl.storage.attabal attabalVar) {
            super(str, beachfrontVar, attabalVar, null);
        }

        public static /* synthetic */ void cutely(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 1 ? 3 : 2];
            if (i != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String str2 = String.format(str, objArr);
            if (i == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager
        public <K, V> triweekly<V> arytenoidectomy(String str, K k) {
            if (str == null) {
                cutely(0);
            }
            triweekly<V> triweeklyVarAttabal = triweekly.attabal();
            if (triweeklyVarAttabal == null) {
                cutely(1);
            }
            return triweeklyVarAttabal;
        }
    }

    public interface beachfront {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final beachfront f31631attabal = new attabal();

        public static class attabal implements beachfront {
            public static /* synthetic */ void saneness(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.beachfront
            public RuntimeException attabal(Throwable th) {
                if (th == null) {
                    saneness(0);
                }
                throw lyreflower.wireman.saneness(th);
            }
        }

        RuntimeException attabal(Throwable th);
    }

    public static class competently<K, V> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final K f31632attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Function0<? extends V> f31633saneness;

        public competently(K k, Function0<? extends V> function0) {
            this.f31632attabal = k;
            this.f31633saneness = function0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f31632attabal.equals(((competently) obj).f31632attabal);
        }

        public int hashCode() {
            return this.f31632attabal.hashCode();
        }
    }

    public static class cutely<T> extends impromptu<T> implements yeast.impromptu<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public cutely(LockBasedStorageManager lockBasedStorageManager, Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                attabal(0);
            }
            if (function0 == null) {
                attabal(1);
            }
        }

        private static /* synthetic */ void attabal(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.impromptu, p002kotlin.jvm.functions.Function0
        public T invoke() {
            T t = (T) super.invoke();
            if (t == null) {
                attabal(2);
            }
            return t;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class dern<T> extends apical<T> {

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public final /* synthetic */ Function1 f31635molybdenite;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final /* synthetic */ Function1 f31636polloi;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dern(LockBasedStorageManager lockBasedStorageManager, Function0 function0, Function1 function1, Function1 function2) {
            super(lockBasedStorageManager, function0);
            this.f31636polloi = function1;
            this.f31635molybdenite = function2;
        }

        private static /* synthetic */ void attabal(int i) {
            String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i != 2 ? 2 : 3];
            if (i != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i == 2) {
                objArr[2] = "doPostCompute";
            }
            String str2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalArgumentException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.impromptu
        public triweekly<T> dern(boolean z) {
            Function1 function1 = this.f31636polloi;
            if (function1 == null) {
                triweekly<T> triweeklyVarDern = super.dern(z);
                if (triweeklyVarDern == null) {
                    attabal(0);
                }
                return triweeklyVarDern;
            }
            triweekly<T> triweeklyVarWireman = triweekly.wireman(function1.invoke(Boolean.valueOf(z)));
            if (triweeklyVarWireman == null) {
                attabal(1);
            }
            return triweeklyVarWireman;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.taiyuan
        public void wireman(T t) {
            if (t == null) {
                attabal(2);
            }
            this.f31635molybdenite.invoke(t);
        }
    }

    public static class formularize<K, V> implements yeast.competently<K, V> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final ConcurrentMap<K, Object> f31637arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final LockBasedStorageManager f31638kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final Function1<? super K, ? extends V> f31639monoploid;

        public formularize(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap<K, Object> concurrentMap, Function1<? super K, ? extends V> function1) {
            if (lockBasedStorageManager == null) {
                saneness(0);
            }
            if (concurrentMap == null) {
                saneness(1);
            }
            if (function1 == null) {
                saneness(2);
            }
            this.f31638kowloon = lockBasedStorageManager;
            this.f31637arytenoidectomy = concurrentMap;
            this.f31639monoploid = function1;
        }

        private static /* synthetic */ void saneness(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 3 && i != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // yeast.competently
        public boolean apical(K k) {
            Object obj = this.f31637arytenoidectomy.get(k);
            return (obj == null || obj == NotValue.COMPUTING) ? false : true;
        }

        public final AssertionError beachfront(K k, Throwable th) {
            return (AssertionError) LockBasedStorageManager.monoploid(new AssertionError("Unable to remove " + k + " under " + this.f31638kowloon, th));
        }

        public final AssertionError dern(K k, Object obj) {
            return (AssertionError) LockBasedStorageManager.monoploid(new AssertionError("Inconsistent key detected. " + NotValue.COMPUTING + " is expected, was: " + obj + ", most probably race condition detected on input " + k + " under " + this.f31638kowloon));
        }

        /* JADX WARN: Code duplicated, block: B:18:0x003e A[Catch: all -> 0x003b, PHI: r0
  0x003e: PHI (r0v8 java.lang.Object) = (r0v7 java.lang.Object), (r0v21 java.lang.Object) binds: [B:10:0x0020, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:20:0x0042 A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x004d A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x0052 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:24:0x0054 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x0059  */
        /* JADX WARN: Code duplicated, block: B:29:0x0071  */
        /* JADX WARN: Code duplicated, block: B:31:0x0079 A[Catch: all -> 0x007e, TRY_ENTER, TryCatch #3 {all -> 0x007e, blocks: (B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:66:0x005a, outer: #1 }] */
        @Override // p002kotlin.jvm.functions.Function1
        public V invoke(K k) {
            AssertionError assertionErrorWireman;
            V vInvoke;
            Object objPut;
            V vSaneness;
            triweekly<V> triweeklyVarMarial;
            Object obj = this.f31637arytenoidectomy.get(k);
            if (obj != null && obj != NotValue.COMPUTING) {
                return (V) WrappedValues.wireman(obj);
            }
            this.f31638kowloon.f31627attabal.lock();
            try {
                Object obj2 = this.f31637arytenoidectomy.get(k);
                NotValue notValue = NotValue.COMPUTING;
                if (obj2 == notValue) {
                    obj2 = NotValue.RECURSION_WAS_DETECTED;
                    triweekly<V> triweeklyVarMarial2 = marial(k, true);
                    if (!triweeklyVarMarial2.dern()) {
                        vSaneness = triweeklyVarMarial2.saneness();
                    } else if (obj2 == NotValue.RECURSION_WAS_DETECTED) {
                        triweeklyVarMarial = marial(k, false);
                        if (!triweeklyVarMarial.dern()) {
                            vSaneness = triweeklyVarMarial.saneness();
                        } else {
                            if (obj2 != null) {
                                assertionErrorWireman = null;
                                try {
                                    this.f31637arytenoidectomy.put(k, notValue);
                                    vInvoke = this.f31639monoploid.invoke(k);
                                    objPut = this.f31637arytenoidectomy.put(k, WrappedValues.saneness(vInvoke));
                                    if (objPut == notValue) {
                                        this.f31638kowloon.f31627attabal.unlock();
                                        return vInvoke;
                                    }
                                    assertionErrorWireman = wireman(k, objPut);
                                    throw assertionErrorWireman;
                                } catch (Throwable th) {
                                    if (lyreflower.wireman.attabal(th)) {
                                        try {
                                            Object objRemove = this.f31637arytenoidectomy.remove(k);
                                            if (objRemove != NotValue.COMPUTING) {
                                                throw dern(k, objRemove);
                                            }
                                            throw th;
                                        } catch (Throwable th2) {
                                            throw beachfront(k, th2);
                                        }
                                    }
                                    if (th != assertionErrorWireman) {
                                        Object objPut2 = this.f31637arytenoidectomy.put(k, WrappedValues.dern(th));
                                        if (objPut2 != NotValue.COMPUTING) {
                                            throw wireman(k, objPut2);
                                        }
                                        throw this.f31638kowloon.f31629saneness.attabal(th);
                                    }
                                    try {
                                        this.f31637arytenoidectomy.remove(k);
                                        throw this.f31638kowloon.f31629saneness.attabal(th);
                                    } catch (Throwable th3) {
                                        throw beachfront(k, th3);
                                    }
                                }
                                this.f31638kowloon.f31627attabal.unlock();
                                throw th;
                            }
                            vSaneness = (V) WrappedValues.wireman(obj2);
                        }
                    } else {
                        if (obj2 != null) {
                            assertionErrorWireman = null;
                            this.f31637arytenoidectomy.put(k, notValue);
                            vInvoke = this.f31639monoploid.invoke(k);
                            objPut = this.f31637arytenoidectomy.put(k, WrappedValues.saneness(vInvoke));
                            if (objPut == notValue) {
                                this.f31638kowloon.f31627attabal.unlock();
                                return vInvoke;
                            }
                            assertionErrorWireman = wireman(k, objPut);
                            throw assertionErrorWireman;
                            this.f31638kowloon.f31627attabal.unlock();
                            throw th;
                        }
                        vSaneness = (V) WrappedValues.wireman(obj2);
                    }
                } else if (obj2 == NotValue.RECURSION_WAS_DETECTED) {
                    triweeklyVarMarial = marial(k, false);
                    if (!triweeklyVarMarial.dern()) {
                        vSaneness = triweeklyVarMarial.saneness();
                    } else {
                        if (obj2 != null) {
                            assertionErrorWireman = null;
                            this.f31637arytenoidectomy.put(k, notValue);
                            vInvoke = this.f31639monoploid.invoke(k);
                            objPut = this.f31637arytenoidectomy.put(k, WrappedValues.saneness(vInvoke));
                            if (objPut == notValue) {
                                this.f31638kowloon.f31627attabal.unlock();
                                return vInvoke;
                            }
                            assertionErrorWireman = wireman(k, objPut);
                            throw assertionErrorWireman;
                            this.f31638kowloon.f31627attabal.unlock();
                            throw th;
                        }
                        vSaneness = (V) WrappedValues.wireman(obj2);
                    }
                } else {
                    if (obj2 != null) {
                        assertionErrorWireman = null;
                        this.f31637arytenoidectomy.put(k, notValue);
                        vInvoke = this.f31639monoploid.invoke(k);
                        objPut = this.f31637arytenoidectomy.put(k, WrappedValues.saneness(vInvoke));
                        if (objPut == notValue) {
                            this.f31638kowloon.f31627attabal.unlock();
                            return vInvoke;
                        }
                        assertionErrorWireman = wireman(k, objPut);
                        throw assertionErrorWireman;
                        this.f31638kowloon.f31627attabal.unlock();
                        throw th;
                    }
                    vSaneness = (V) WrappedValues.wireman(obj2);
                }
                this.f31638kowloon.f31627attabal.unlock();
                return vSaneness;
            } catch (Throwable th4) {
                this.f31638kowloon.f31627attabal.unlock();
                throw th4;
            }
        }

        public triweekly<V> marial(K k, boolean z) {
            triweekly<V> triweeklyVarArytenoidectomy = this.f31638kowloon.arytenoidectomy("", k);
            if (triweeklyVarArytenoidectomy == null) {
                saneness(3);
            }
            return triweeklyVarArytenoidectomy;
        }

        public final AssertionError wireman(K k, Object obj) {
            AssertionError assertionError = (AssertionError) LockBasedStorageManager.monoploid(new AssertionError("Race condition detected on input " + k + ". Old value is " + obj + " under " + this.f31638kowloon));
            if (assertionError == null) {
                saneness(4);
            }
            return assertionError;
        }
    }

    public static class impassible<K, V> extends formularize<K, V> implements yeast.beachfront<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public impassible(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap<K, Object> concurrentMap, Function1<? super K, ? extends V> function1) {
            super(lockBasedStorageManager, concurrentMap, function1);
            if (lockBasedStorageManager == null) {
                saneness(0);
            }
            if (concurrentMap == null) {
                saneness(1);
            }
            if (function1 == null) {
                saneness(2);
            }
        }

        private static /* synthetic */ void saneness(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.formularize, p002kotlin.jvm.functions.Function1
        public V invoke(K k) {
            V v = (V) super.invoke(k);
            if (v == null) {
                saneness(3);
            }
            return v;
        }
    }

    public static class marial<K, V> extends formularize<competently<K, V>, V> implements yeast.saneness<K, V> {

        public class attabal implements Function1<competently<K, V>, V> {
            @Override // p002kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
            public V invoke(competently<K, V> competentlyVar) {
                return (V) competentlyVar.f31633saneness.invoke();
            }
        }

        public /* synthetic */ marial(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, attabal attabalVar) {
            this(lockBasedStorageManager, concurrentMap);
        }

        private static /* synthetic */ void saneness(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public V attabal(K k, Function0<? extends V> function0) {
            if (function0 == null) {
                saneness(2);
            }
            return invoke(new competently(k, function0));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public marial(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap<competently<K, V>, Object> concurrentMap) {
            super(lockBasedStorageManager, concurrentMap, new attabal());
            if (lockBasedStorageManager == null) {
                saneness(0);
            }
            if (concurrentMap == null) {
                saneness(1);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class saneness<T> extends cutely<T> {

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ Object f31642monoploid;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public saneness(LockBasedStorageManager lockBasedStorageManager, Function0 function0, Object obj) {
            super(lockBasedStorageManager, function0);
            this.f31642monoploid = obj;
        }

        private static /* synthetic */ void attabal(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.impromptu
        public triweekly<T> dern(boolean z) {
            triweekly<T> triweeklyVarWireman = triweekly.wireman(this.f31642monoploid);
            if (triweeklyVarWireman == null) {
                attabal(0);
            }
            return triweeklyVarWireman;
        }
    }

    public static abstract class taiyuan<T> extends impromptu<T> {

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public volatile yeast.cutely<T> f31644monoploid;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public taiyuan(LockBasedStorageManager lockBasedStorageManager, Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                attabal(0);
            }
            if (function0 == null) {
                attabal(1);
            }
            this.f31644monoploid = null;
        }

        private static /* synthetic */ void attabal(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.impromptu, p002kotlin.jvm.functions.Function0
        public T invoke() {
            yeast.cutely<T> cutelyVar = this.f31644monoploid;
            return (cutelyVar == null || !cutelyVar.saneness()) ? (T) super.invoke() : cutelyVar.attabal();
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.impromptu
        public final void saneness(T t) {
            this.f31644monoploid = new yeast.cutely<>(t);
            try {
                wireman(t);
            } finally {
                this.f31644monoploid = null;
            }
        }

        public abstract void wireman(T t);
    }

    public static class triweekly<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final boolean f31645attabal;
        private final T value;

        public triweekly(T t, boolean z) {
            this.value = t;
            this.f31645attabal = z;
        }

        public static <T> triweekly<T> attabal() {
            return new triweekly<>(null, true);
        }

        public static <T> triweekly<T> wireman(T t) {
            return new triweekly<>(t, false);
        }

        public boolean dern() {
            return this.f31645attabal;
        }

        public T saneness() {
            return this.value;
        }

        public String toString() {
            return dern() ? "FALL_THROUGH" : String.valueOf(this.value);
        }
    }

    public static class wireman<K, V> extends marial<K, V> implements yeast.attabal<K, V> {
        public /* synthetic */ wireman(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, attabal attabalVar) {
            this(lockBasedStorageManager, concurrentMap);
        }

        private static /* synthetic */ void saneness(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "computation";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.marial, yeast.attabal
        public V attabal(K k, Function0<? extends V> function0) {
            if (function0 == null) {
                saneness(2);
            }
            V v = (V) super.attabal(k, function0);
            if (v == null) {
                saneness(3);
            }
            return v;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wireman(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap<competently<K, V>, Object> concurrentMap) {
            super(lockBasedStorageManager, concurrentMap, null);
            if (lockBasedStorageManager == null) {
                saneness(0);
            }
            if (concurrentMap == null) {
                saneness(1);
            }
        }
    }

    public /* synthetic */ LockBasedStorageManager(String str, beachfront beachfrontVar, p002kotlin.reflect.jvm.internal.impl.storage.attabal attabalVar, attabal attabalVar2) {
        this(str, beachfrontVar, attabalVar);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    private static /* synthetic */ void cutely(int i) {
        String str = (i == 10 || i == 13 || i == 20 || i == 37) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 10 || i == 13 || i == 20 || i == 37) ? 2 : 3];
        if (i == 1 || i == 3 || i == 5) {
            objArr[0] = "exceptionHandlingStrategy";
        } else if (i != 6) {
            switch (i) {
                case 8:
                    objArr[0] = "exceptionHandlingStrategy";
                    break;
                case 9:
                case 11:
                case 14:
                case 16:
                case 19:
                case 21:
                    objArr[0] = "compute";
                    break;
                case 10:
                case 13:
                case 20:
                case 37:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                    break;
                case 12:
                case 17:
                case 25:
                case 27:
                    objArr[0] = "onRecursiveCall";
                    break;
                case 15:
                case 18:
                case 22:
                    objArr[0] = "map";
                    break;
                case 23:
                case 24:
                case 26:
                case 28:
                case 30:
                case 31:
                case 32:
                case 34:
                    objArr[0] = "computable";
                    break;
                case 29:
                case 33:
                    objArr[0] = "postCompute";
                    break;
                case 35:
                    objArr[0] = "source";
                    break;
                case 36:
                    objArr[0] = "throwable";
                    break;
                default:
                    objArr[0] = "debugText";
                    break;
            }
        } else {
            objArr[0] = "lock";
        }
        if (i == 10 || i == 13) {
            objArr[1] = "createMemoizedFunction";
        } else if (i == 20) {
            objArr[1] = "createMemoizedFunctionWithNullableValues";
        } else if (i != 37) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
        } else {
            objArr[1] = "sanitizeStackTrace";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "<init>";
                break;
            case 7:
            case 8:
                objArr[2] = "replaceExceptionHandling";
                break;
            case 9:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createMemoizedFunction";
                break;
            case 10:
            case 13:
            case 20:
            case 37:
                break;
            case 19:
            case 21:
            case 22:
                objArr[2] = "createMemoizedFunctionWithNullableValues";
                break;
            case 23:
            case 24:
            case 25:
                objArr[2] = "createLazyValue";
                break;
            case 26:
            case 27:
                objArr[2] = "createRecursionTolerantLazyValue";
                break;
            case 28:
            case 29:
                objArr[2] = "createLazyValueWithPostCompute";
                break;
            case 30:
                objArr[2] = "createNullableLazyValue";
                break;
            case 31:
                objArr[2] = "createRecursionTolerantNullableLazyValue";
                break;
            case 32:
            case 33:
                objArr[2] = "createNullableLazyValueWithPostCompute";
                break;
            case 34:
                objArr[2] = "compute";
                break;
            case 35:
                objArr[2] = "recursionDetectedDefault";
                break;
            case 36:
                objArr[2] = "sanitizeStackTrace";
                break;
            default:
                objArr[2] = "createWithExceptionHandling";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 10 && i != 13 && i != 20 && i != 37) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static <K> ConcurrentMap<K, Object> impassible() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    public static <T extends Throwable> T monoploid(T t) {
        if (t == null) {
            cutely(36);
        }
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (i < length) {
            if (!stackTrace[i].getClassName().startsWith(f31626wireman)) {
                List listSubList = Arrays.asList(stackTrace).subList(i, length);
                t.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
                return t;
            }
            i++;
        }
        i = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i, length);
        t.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
        return t;
    }

    public <K, V> triweekly<V> arytenoidectomy(String str, K k) {
        String str2;
        if (str == null) {
            cutely(35);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Recursion detected ");
        sb.append(str);
        if (k == null) {
            str2 = "";
        } else {
            str2 = "on input: " + k;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        throw ((AssertionError) monoploid(new AssertionError(sb.toString())));
    }

    @Override // yeast.formularize
    public <K, V> yeast.attabal<K, V> attabal() {
        return new wireman(this, impassible(), null);
    }

    @Override // yeast.formularize
    public <T> yeast.impromptu<T> beachfront(Function0<? extends T> function0, Function1<? super Boolean, ? extends T> function1, Function1<? super T, Unit> function2) {
        if (function0 == null) {
            cutely(28);
        }
        if (function2 == null) {
            cutely(29);
        }
        return new dern(this, function0, function1, function2);
    }

    @Override // yeast.formularize
    public <K, V> yeast.competently<K, V> competently(Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            cutely(19);
        }
        yeast.competently<K, V> competentlyVarKowloon = kowloon(function1, impassible());
        if (competentlyVarKowloon == null) {
            cutely(20);
        }
        return competentlyVarKowloon;
    }

    @Override // yeast.formularize
    public <T> yeast.impromptu<T> dern(Function0<? extends T> function0) {
        if (function0 == null) {
            cutely(23);
        }
        return new cutely(this, function0);
    }

    @Override // yeast.formularize
    public <K, V> yeast.saneness<K, V> impromptu() {
        return new marial(this, impassible(), null);
    }

    public <K, V> yeast.competently<K, V> kowloon(Function1<? super K, ? extends V> function1, ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            cutely(21);
        }
        if (concurrentMap == null) {
            cutely(22);
        }
        return new formularize(this, concurrentMap, function1);
    }

    @Override // yeast.formularize
    public <T> yeast.taiyuan<T> marial(Function0<? extends T> function0) {
        if (function0 == null) {
            cutely(30);
        }
        return new impromptu(this, function0);
    }

    @Override // yeast.formularize
    public <T> yeast.impromptu<T> saneness(Function0<? extends T> function0, T t) {
        if (function0 == null) {
            cutely(26);
        }
        if (t == null) {
            cutely(27);
        }
        return new saneness(this, function0, t);
    }

    @Override // yeast.formularize
    public <K, V> yeast.beachfront<K, V> taiyuan(Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            cutely(9);
        }
        yeast.beachfront<K, V> beachfrontVarTriweekly = triweekly(function1, impassible());
        if (beachfrontVarTriweekly == null) {
            cutely(10);
        }
        return beachfrontVarTriweekly;
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f31628dern + ")";
    }

    public <K, V> yeast.beachfront<K, V> triweekly(Function1<? super K, ? extends V> function1, ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            cutely(14);
        }
        if (concurrentMap == null) {
            cutely(15);
        }
        return new impassible(this, concurrentMap, function1);
    }

    @Override // yeast.formularize
    public <T> T wireman(Function0<? extends T> function0) {
        if (function0 == null) {
            cutely(34);
        }
        this.f31627attabal.lock();
        try {
            T tInvoke = function0.invoke();
            this.f31627attabal.unlock();
            return tInvoke;
        } catch (Throwable th) {
            try {
                throw this.f31629saneness.attabal(th);
            } catch (Throwable th2) {
                this.f31627attabal.unlock();
                throw th2;
            }
        }
    }

    public LockBasedStorageManager(String str, beachfront beachfrontVar, p002kotlin.reflect.jvm.internal.impl.storage.attabal attabalVar) {
        if (str == null) {
            cutely(4);
        }
        if (beachfrontVar == null) {
            cutely(5);
        }
        if (attabalVar == null) {
            cutely(6);
        }
        this.f31627attabal = attabalVar;
        this.f31629saneness = beachfrontVar;
        this.f31628dern = str;
    }

    public LockBasedStorageManager(String str) {
        this(str, (Runnable) null, (Function1<InterruptedException, Unit>) null);
    }

    public LockBasedStorageManager(String str, Runnable runnable, Function1<InterruptedException, Unit> function1) {
        this(str, beachfront.f31631attabal, p002kotlin.reflect.jvm.internal.impl.storage.attabal.f31646attabal.attabal(runnable, function1));
    }

    public static class impromptu<T> implements yeast.taiyuan<T> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final Function0<? extends T> f31640arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final LockBasedStorageManager f31641kowloon;
        private volatile Object value;

        public impromptu(LockBasedStorageManager lockBasedStorageManager, Function0<? extends T> function0) {
            if (lockBasedStorageManager == null) {
                attabal(0);
            }
            if (function0 == null) {
                attabal(1);
            }
            this.value = NotValue.NOT_COMPUTED;
            this.f31641kowloon = lockBasedStorageManager;
            this.f31640arytenoidectomy = function0;
        }

        private static /* synthetic */ void attabal(int i) {
            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i != 2 && i != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public boolean cutely() {
            return (this.value == NotValue.NOT_COMPUTED || this.value == NotValue.COMPUTING) ? false : true;
        }

        public triweekly<T> dern(boolean z) {
            triweekly<T> triweeklyVarArytenoidectomy = this.f31641kowloon.arytenoidectomy("in a lazy value", null);
            if (triweeklyVarArytenoidectomy == null) {
                attabal(2);
            }
            return triweeklyVarArytenoidectomy;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003e A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x0042 A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x004d A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x0052 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        @Override // p002kotlin.jvm.functions.Function0
        public T invoke() {
            T tInvoke;
            triweekly<T> triweeklyVarDern;
            Object obj = this.value;
            if (!(obj instanceof NotValue)) {
                return (T) WrappedValues.beachfront(obj);
            }
            this.f31641kowloon.f31627attabal.lock();
            try {
                Object obj2 = this.value;
                if (obj2 instanceof NotValue) {
                    NotValue notValue = NotValue.COMPUTING;
                    if (obj2 == notValue) {
                        this.value = NotValue.RECURSION_WAS_DETECTED;
                        triweekly<T> triweeklyVarDern2 = dern(true);
                        if (!triweeklyVarDern2.dern()) {
                            tInvoke = triweeklyVarDern2.saneness();
                        } else if (obj2 == NotValue.RECURSION_WAS_DETECTED) {
                            triweeklyVarDern = dern(false);
                            if (triweeklyVarDern.dern()) {
                                this.value = notValue;
                                try {
                                    tInvoke = this.f31640arytenoidectomy.invoke();
                                    saneness(tInvoke);
                                    this.value = tInvoke;
                                } catch (Throwable th) {
                                    if (lyreflower.wireman.attabal(th)) {
                                        this.value = NotValue.NOT_COMPUTED;
                                        throw th;
                                    }
                                    if (this.value == NotValue.COMPUTING) {
                                        this.value = WrappedValues.dern(th);
                                    }
                                    throw this.f31641kowloon.f31629saneness.attabal(th);
                                }
                            } else {
                                tInvoke = triweeklyVarDern.saneness();
                            }
                        } else {
                            this.value = notValue;
                            tInvoke = this.f31640arytenoidectomy.invoke();
                            saneness(tInvoke);
                            this.value = tInvoke;
                        }
                    } else if (obj2 == NotValue.RECURSION_WAS_DETECTED) {
                        triweeklyVarDern = dern(false);
                        if (triweeklyVarDern.dern()) {
                            tInvoke = triweeklyVarDern.saneness();
                        } else {
                            this.value = notValue;
                            tInvoke = this.f31640arytenoidectomy.invoke();
                            saneness(tInvoke);
                            this.value = tInvoke;
                        }
                    } else {
                        this.value = notValue;
                        tInvoke = this.f31640arytenoidectomy.invoke();
                        saneness(tInvoke);
                        this.value = tInvoke;
                    }
                } else {
                    tInvoke = (T) WrappedValues.beachfront(obj2);
                }
                this.f31641kowloon.f31627attabal.unlock();
                return tInvoke;
            } catch (Throwable th2) {
                this.f31641kowloon.f31627attabal.unlock();
                throw th2;
            }
        }

        public void saneness(T t) {
        }
    }
}
