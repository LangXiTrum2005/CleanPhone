package androidx.compose.runtime.collection;

import androidx.collection.ObjectList;
import androidx.collection.seminary;
import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import p002kotlin.Metadata;
import p002kotlin.collections.preprohormone;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Extensions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aK\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007H\u0000¢\u0006\u0004\b\f\u0010\r\u001aE\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/collection/ObjectList;", "Landroidx/collection/seminary;", "marial", "(Landroidx/collection/ObjectList;)Landroidx/collection/seminary;", "", "K", "Lkotlin/Function1;", "selector", "wireman", "(Landroidx/collection/ObjectList;Lkotlin/jvm/functions/Function1;)Landroidx/collection/ObjectList;", "", "attabal", "(Landroidx/collection/ObjectList;Lkotlin/jvm/functions/Function1;)Z", "", "dern", "(Landroidx/collection/seminary;Lkotlin/jvm/functions/Function1;)V", "saneness", "(Landroidx/collection/seminary;)Ljava/lang/Object;", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: androidx.compose.runtime.collection.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "kotlin.jvm.PlatformType", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class C0035attabal<T> implements Comparator {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Function1 f5874kowloon;

        public C0035attabal(Function1 function1) {
            this.f5874kowloon = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Function1 function1 = this.f5874kowloon;
            return frenchy.saneness.wireman((Comparable) function1.invoke(t), (Comparable) function1.invoke(t2));
        }
    }

    public static final <T, K extends Comparable<? super K>> boolean attabal(ObjectList<T> objectList, Function1<? super T, ? extends K> function1) {
        if (objectList.get_size() <= 1) {
            return true;
        }
        K kInvoke = function1.invoke(objectList.wireman(0));
        if (kInvoke == null) {
            return false;
        }
        int i = objectList.get_size();
        int i2 = 1;
        while (i2 < i) {
            K kInvoke2 = function1.invoke(objectList.wireman(i2));
            if (kInvoke2 == null || kInvoke.compareTo(kInvoke2) > 0) {
                return false;
            }
            i2++;
            kInvoke = kInvoke2;
        }
        return true;
    }

    public static final <T, K extends Comparable<? super K>> void dern(seminary<T> seminaryVar, Function1<? super T, ? extends K> function1) {
        List<T> listPolloi = seminaryVar.polloi();
        if (listPolloi.size() > 1) {
            preprohormone.cuirassed(listPolloi, new C0035attabal(function1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> seminary<T> marial(ObjectList<T> objectList) {
        seminary<T> seminaryVar = (seminary<T>) new seminary(objectList.get_size());
        Object[] objArr = objectList.content;
        int i = objectList._size;
        for (int i2 = 0; i2 < i; i2++) {
            seminaryVar.triweekly(objArr[i2]);
        }
        return seminaryVar;
    }

    public static final <T> T saneness(seminary<T> seminaryVar) {
        if (seminaryVar.competently()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i = seminaryVar.get_size() - 1;
        T tWireman = seminaryVar.wireman(i);
        seminaryVar.preprohormone(i);
        return tWireman;
    }

    public static final <T, K extends Comparable<? super K>> ObjectList<T> wireman(ObjectList<T> objectList, Function1<? super T, ? extends K> function1) {
        if (attabal(objectList, function1)) {
            return objectList;
        }
        seminary seminaryVarMarial = marial(objectList);
        dern(seminaryVarMarial, function1);
        return seminaryVarMarial;
    }
}
