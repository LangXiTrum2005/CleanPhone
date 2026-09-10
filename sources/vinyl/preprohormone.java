package vinyl;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\u001e\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR,\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR*\u0010\u0013\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lvinyl/preprohormone;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lvinyl/basify;", "Lkotlin/Function1;", "Lkurbash/wireman;", "Lasosan/wireman;", "compute", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", X3.i.W, "attabal", "(Lkurbash/wireman;)Lasosan/wireman;", "Lkotlin/jvm/functions/Function1;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "Lvinyl/impassible;", "saneness", "Ljava/util/concurrent/ConcurrentHashMap;", "cache", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class preprohormone<T> implements basify<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Function1<kurbash.wireman<?>, asosan.wireman<T>> compute;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final ConcurrentHashMap<Class<?>, impassible<T>> cache;

    /* JADX WARN: Multi-variable type inference failed */
    public preprohormone(Function1<? super kurbash.wireman<?>, ? extends asosan.wireman<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.cache = new ConcurrentHashMap<>();
    }

    @Override // vinyl.basify
    public asosan.wireman<T> attabal(kurbash.wireman<Object> key) {
        impassible<T> impassibleVarPutIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap<Class<?>, impassible<T>> concurrentHashMap = this.cache;
        Class<?> clsSaneness = gibeonite.attabal.saneness(key);
        impassible<T> impassibleVar = concurrentHashMap.get(clsSaneness);
        if (impassibleVar == null && (impassibleVarPutIfAbsent = concurrentHashMap.putIfAbsent(clsSaneness, (impassibleVar = new impassible<>(this.compute.invoke(key))))) != null) {
            impassibleVar = impassibleVarPutIfAbsent;
        }
        return impassibleVar.serializer;
    }
}
