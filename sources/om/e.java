package om;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f47568d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(l lVar, ConcurrentHashMap concurrentHashMap, jk.b bVar, int i10) {
        super(lVar, concurrentHashMap, bVar);
        this.f47568d = i10;
    }

    public static /* synthetic */ void a(int i10) {
        String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 3 ? 3 : 2];
        if (i10 == 1) {
            objArr[0] = "map";
        } else if (i10 == 2) {
            objArr[0] = "computation";
        } else if (i10 != 3) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        }
        if (i10 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        } else {
            objArr[1] = "computeIfAbsent";
        }
        if (i10 == 2) {
            objArr[2] = "computeIfAbsent";
        } else if (i10 != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 3) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // om.j, jk.b
    public Object invoke(Object obj) throws Throwable {
        switch (this.f47568d) {
            case 1:
                Object objInvoke = super.invoke(obj);
                if (objInvoke != null) {
                    return objInvoke;
                }
                throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull", "invoke"));
            default:
                return super.invoke(obj);
        }
    }
}
