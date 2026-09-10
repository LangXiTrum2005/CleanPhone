package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Stack.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0088\u0001\u0005\u0092\u0001\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/rajahship;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "backing", "saneness", "(Ljava/util/ArrayList;)Ljava/util/ArrayList;", "value", "", "cutely", "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", "taiyuan", "(Ljava/util/ArrayList;)Ljava/lang/Object;", "competently", "", "index", "impromptu", "(Ljava/util/ArrayList;I)Ljava/lang/Object;", "marial", "(Ljava/util/ArrayList;)Z", "beachfront", "", "attabal", "(Ljava/util/ArrayList;)V", "", "apical", "(Ljava/util/ArrayList;)[Ljava/lang/Object;", "wireman", "(Ljava/util/ArrayList;)I", "size", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class rajahship<T> {
    public static final T[] apical(ArrayList<T> arrayList) {
        int size = arrayList.size();
        T[] tArr = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            tArr[i] = arrayList.get(i);
        }
        return tArr;
    }

    public static final void attabal(ArrayList<T> arrayList) {
        arrayList.clear();
    }

    public static final boolean beachfront(ArrayList<T> arrayList) {
        return !marial(arrayList);
    }

    public static final T competently(ArrayList<T> arrayList) {
        return arrayList.get(wireman(arrayList) - 1);
    }

    public static final boolean cutely(ArrayList<T> arrayList, T t) {
        return arrayList.add(t);
    }

    public static /* synthetic */ ArrayList dern(ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            arrayList = new ArrayList();
        }
        return saneness(arrayList);
    }

    public static final T impromptu(ArrayList<T> arrayList, int i) {
        return arrayList.get(i);
    }

    public static final boolean marial(ArrayList<T> arrayList) {
        return arrayList.isEmpty();
    }

    public static final T taiyuan(ArrayList<T> arrayList) {
        return arrayList.remove(wireman(arrayList) - 1);
    }

    public static final int wireman(ArrayList<T> arrayList) {
        return arrayList.size();
    }

    public static <T> ArrayList<T> saneness(ArrayList<T> arrayList) {
        return arrayList;
    }
}
