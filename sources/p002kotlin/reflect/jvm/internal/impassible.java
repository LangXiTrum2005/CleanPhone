package p002kotlin.reflect.jvm.internal;

import healthily.apical;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* JADX INFO: compiled from: moduleByClassLoader.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Ljava/lang/Class;", "Lhealthily/apical;", "attabal", "(Ljava/lang/Class;)Lhealthily/apical;", "Ljava/util/concurrent/ConcurrentMap;", "Lkotlin/reflect/jvm/internal/graveside;", "Ljava/lang/ref/WeakReference;", "Ljava/util/concurrent/ConcurrentMap;", "moduleByClassLoader", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class impassible {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ConcurrentMap<graveside, WeakReference<apical>> f29620attabal = new ConcurrentHashMap();

    public static final apical attabal(Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        ClassLoader classLoaderBeachfront = ReflectClassUtilKt.beachfront(cls);
        graveside gravesideVar = new graveside(classLoaderBeachfront);
        ConcurrentMap<graveside, WeakReference<apical>> concurrentMap = f29620attabal;
        WeakReference<apical> weakReference = concurrentMap.get(gravesideVar);
        if (weakReference != null) {
            apical apicalVar = weakReference.get();
            if (apicalVar != null) {
                return apicalVar;
            }
            concurrentMap.remove(gravesideVar, weakReference);
        }
        apical apicalVarAttabal = apical.f27597dern.attabal(classLoaderBeachfront);
        while (true) {
            try {
                ConcurrentMap<graveside, WeakReference<apical>> concurrentMap2 = f29620attabal;
                WeakReference<apical> weakReferencePutIfAbsent = concurrentMap2.putIfAbsent(gravesideVar, new WeakReference<>(apicalVarAttabal));
                if (weakReferencePutIfAbsent == null) {
                    gravesideVar.attabal(null);
                    return apicalVarAttabal;
                }
                apical apicalVar2 = weakReferencePutIfAbsent.get();
                if (apicalVar2 != null) {
                    gravesideVar.attabal(null);
                    return apicalVar2;
                }
                concurrentMap2.remove(gravesideVar, weakReferencePutIfAbsent);
            } catch (Throwable th) {
                gravesideVar.attabal(null);
                throw th;
            }
        }
    }
}
