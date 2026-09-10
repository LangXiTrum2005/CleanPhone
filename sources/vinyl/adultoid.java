package vinyl;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B5\u0012,\u0010\t\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u0003¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R:\u0010\t\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lvinyl/adultoid;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lvinyl/achondroplasia;", "Lkotlin/Function2;", "Lkurbash/wireman;", "", "", "Lkurbash/arytenoidectomy;", "Lasosan/wireman;", "compute", "<init>", "(Lkotlin/jvm/functions/Function2;)V", X3.i.W, "types", "Lkotlin/Result;", "attabal", "(Lkurbash/wireman;Ljava/util/List;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function2;", "Lvinyl/dovishness;", "Lvinyl/julian;", "saneness", "Lvinyl/dovishness;", "classValue", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class adultoid<T> implements achondroplasia<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Function2<kurbash.wireman<Object>, List<? extends kurbash.arytenoidectomy>, asosan.wireman<T>> compute;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final dovishness<julian<T>> classValue;

    /* JADX INFO: compiled from: Caching.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class attabal implements Function0<T> {
        @Override // p002kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) new julian();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public adultoid(Function2<? super kurbash.wireman<Object>, ? super List<? extends kurbash.arytenoidectomy>, ? extends asosan.wireman<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.classValue = new dovishness<>();
    }

    @Override // vinyl.achondroplasia
    public Object attabal(kurbash.wireman<Object> key, List<? extends kurbash.arytenoidectomy> types) {
        Object objM3351constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        Object obj = this.classValue.get(gibeonite.attabal.saneness(key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        empress empressVar = (empress) obj;
        T t = empressVar.reference.get();
        if (t == null) {
            t = (T) empressVar.attabal(new attabal());
        }
        julian julianVar = t;
        List<? extends kurbash.arytenoidectomy> list = types;
        ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new clubfoot((kurbash.arytenoidectomy) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = julianVar.serializers;
        Object obj2 = concurrentHashMap.get(arrayList);
        if (obj2 == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM3351constructorimpl = Result.m3351constructorimpl(this.compute.invoke(key, types));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            }
            Result resultM3350boximpl = Result.m3350boximpl(objM3351constructorimpl);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, resultM3350boximpl);
            obj2 = objPutIfAbsent == null ? resultM3350boximpl : objPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "getOrPut(...)");
        return ((Result) obj2).getValue();
    }
}
