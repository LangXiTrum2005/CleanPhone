package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;

/* JADX INFO: loaded from: classes7.dex */
public final class NullabilityAnnotationStatesImpl<T> implements NullabilityAnnotationStates<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f43786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MemoizedFunctionToNullable f43787c = new LockBasedStorageManager("Java nullability annotation states").h(new Function1<FqName, Object>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStatesImpl$cache$1
        {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Object next;
            FqName it = (FqName) obj;
            Intrinsics.e(it, "it");
            ?? r0 = this.X.f43786b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = r0.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                FqName packageName = (FqName) entry.getKey();
                if (!it.equals(packageName)) {
                    Intrinsics.f(packageName, "packageName");
                    if (Intrinsics.a(it.d() ? null : it.e(), packageName)) {
                    }
                }
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            if (linkedHashMap.isEmpty()) {
                linkedHashMap = null;
            }
            if (linkedHashMap != null) {
                Iterator it3 = linkedHashMap.entrySet().iterator();
                if (it3.hasNext()) {
                    next = it3.next();
                    if (it3.hasNext()) {
                        int length = FqNamesUtilKt.b((FqName) ((Map.Entry) next).getKey(), it).b().length();
                        do {
                            Object next2 = it3.next();
                            int length2 = FqNamesUtilKt.b((FqName) ((Map.Entry) next2).getKey(), it).b().length();
                            if (length > length2) {
                                next = next2;
                                length = length2;
                            }
                        } while (it3.hasNext());
                    }
                } else {
                    next = null;
                }
                Map.Entry entry2 = (Map.Entry) next;
                if (entry2 != null) {
                    return entry2.getValue();
                }
            }
            return null;
        }
    });

    public NullabilityAnnotationStatesImpl(Map map) {
        this.f43786b = map;
    }
}
