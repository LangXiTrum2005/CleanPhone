package vinyl;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B5\u0012,\u0010\t\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u0003¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R:\u0010\t\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R*\u0010\u0017\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lvinyl/cord;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lvinyl/achondroplasia;", "Lkotlin/Function2;", "Lkurbash/wireman;", "", "", "Lkurbash/arytenoidectomy;", "Lasosan/wireman;", "compute", "<init>", "(Lkotlin/jvm/functions/Function2;)V", X3.i.W, "types", "Lkotlin/Result;", "attabal", "(Lkurbash/wireman;Ljava/util/List;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function2;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "Lvinyl/julian;", "saneness", "Ljava/util/concurrent/ConcurrentHashMap;", "cache", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class cord<T> implements achondroplasia<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Function2<kurbash.wireman<Object>, List<? extends kurbash.arytenoidectomy>, asosan.wireman<T>> compute;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final ConcurrentHashMap<Class<?>, julian<T>> cache;

    /* JADX WARN: Multi-variable type inference failed */
    public cord(Function2<? super kurbash.wireman<Object>, ? super List<? extends kurbash.arytenoidectomy>, ? extends asosan.wireman<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.cache = new ConcurrentHashMap<>();
    }

    @Override // vinyl.achondroplasia
    public Object attabal(kurbash.wireman<Object> key, List<? extends kurbash.arytenoidectomy> types) {
        Object objM3351constructorimpl;
        julian<T> julianVarPutIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        ConcurrentHashMap<Class<?>, julian<T>> concurrentHashMap = this.cache;
        Class<?> clsSaneness = gibeonite.attabal.saneness(key);
        julian<T> julianVar = concurrentHashMap.get(clsSaneness);
        if (julianVar == null && (julianVarPutIfAbsent = concurrentHashMap.putIfAbsent(clsSaneness, (julianVar = new julian<>()))) != null) {
            julianVar = julianVarPutIfAbsent;
        }
        julian<T> julianVar2 = julianVar;
        List<? extends kurbash.arytenoidectomy> list = types;
        ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new clubfoot((kurbash.arytenoidectomy) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = julianVar2.serializers;
        Object obj = concurrentHashMap2.get(arrayList);
        if (obj == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM3351constructorimpl = Result.m3351constructorimpl(this.compute.invoke(key, types));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            }
            Result resultM3350boximpl = Result.m3350boximpl(objM3351constructorimpl);
            Object objPutIfAbsent = concurrentHashMap2.putIfAbsent(arrayList, resultM3350boximpl);
            obj = objPutIfAbsent == null ? resultM3350boximpl : objPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj, "getOrPut(...)");
        return ((Result) obj).getValue();
    }
}
