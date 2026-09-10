package om;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class j implements jk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f47574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f47575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jk.b f47576c;

    public j(l lVar, ConcurrentHashMap concurrentHashMap, jk.b bVar) {
        this.f47574a = lVar;
        this.f47575b = concurrentHashMap;
        this.f47576c = bVar;
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "map";
        } else if (i10 == 2) {
            objArr[0] = "compute";
        } else if (i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 3) {
            objArr[1] = "recursionDetected";
        } else if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i10 != 3 && i10 != 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public final AssertionError b(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.f47574a);
        l.e(assertionError);
        return assertionError;
    }

    @Override // jk.b
    public Object invoke(Object obj) throws Throwable {
        l lVar = this.f47574a;
        a aVar = lVar.f47584b;
        n nVar = lVar.f47583a;
        ConcurrentHashMap concurrentHashMap = this.f47575b;
        Object obj2 = concurrentHashMap.get(obj);
        Object obj3 = ym.l.f54559a;
        AssertionError assertionErrorB = null;
        k kVar = k.f47578b;
        if (obj2 != null && obj2 != kVar) {
            ym.l.j(obj2);
            if (obj2 == obj3) {
                return null;
            }
            return obj2;
        }
        nVar.lock();
        try {
            Object obj4 = concurrentHashMap.get(obj);
            k kVar2 = k.f47579c;
            if (obj4 == kVar) {
                bc.i iVarD = lVar.d(obj, "");
                if (iVarD == null) {
                    a(3);
                    throw null;
                }
                if (!iVarD.f5552b) {
                    Object obj5 = iVarD.f5553c;
                    nVar.unlock();
                    return obj5;
                }
                obj4 = kVar2;
            }
            if (obj4 == kVar2) {
                bc.i iVarD2 = lVar.d(obj, "");
                if (iVarD2 == null) {
                    a(3);
                    throw null;
                }
                if (!iVarD2.f5552b) {
                    Object obj6 = iVarD2.f5553c;
                    nVar.unlock();
                    return obj6;
                }
            }
            if (obj4 != null) {
                ym.l.j(obj4);
                assertionErrorB = obj4 != obj3 ? obj4 : null;
                nVar.unlock();
                return assertionErrorB;
            }
            try {
                concurrentHashMap.put(obj, kVar);
                Object objInvoke = this.f47576c.invoke(obj);
                if (objInvoke != null) {
                    obj3 = objInvoke;
                }
                Object objPut = concurrentHashMap.put(obj, obj3);
                if (objPut == kVar) {
                    nVar.unlock();
                    return objInvoke;
                }
                assertionErrorB = b(obj, objPut);
                throw assertionErrorB;
            } catch (Throwable th2) {
                if (ym.l.h(th2)) {
                    concurrentHashMap.remove(obj);
                    throw th2;
                }
                if (th2 == assertionErrorB) {
                    aVar.getClass();
                    throw th2;
                }
                Object objPut2 = concurrentHashMap.put(obj, new ym.k(th2));
                if (objPut2 != kVar) {
                    throw b(obj, objPut2);
                }
                aVar.getClass();
                throw th2;
            }
        } catch (Throwable th3) {
            nVar.unlock();
            throw th3;
        }
    }
}
