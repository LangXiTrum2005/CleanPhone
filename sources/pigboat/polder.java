package pigboat;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import pigboat.seminary;

/* JADX INFO: compiled from: ThreadSafeHeap.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0017\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0010H\u0082\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0010H\u0082\u0010¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001f\u0010 R \u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010!R$\u0010'\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00108F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\u0019R\u0011\u0010*\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u000b\u0010,\u001a\u00020+8\u0002X\u0082\u0004¨\u0006-"}, d2 = {"Lpigboat/polder;", "Lpigboat/seminary;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "beachfront", "()Lpigboat/seminary;", "cutely", "node", "", "impromptu", "(Lpigboat/seminary;)Z", "saneness", "", "index", "taiyuan", "(I)Lpigboat/seminary;", "", "attabal", "(Lpigboat/seminary;)V", "i", "impassible", "(I)V", "formularize", "", "competently", "()[Lpigboat/seminary;", "j", "triweekly", "(II)V", "[Lpigboat/seminary;", "a", "value", "dern", "()I", "apical", "size", "marial", "()Z", "isEmpty", "Lkotlinx/atomicfu/AtomicInt;", "_size", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class polder<T extends seminary & Comparable<? super T>> {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f35367saneness = AtomicIntegerFieldUpdater.newUpdater(polder.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public T[] a;

    public final void apical(int i) {
        f35367saneness.set(this, i);
    }

    public final void attabal(T node) {
        node.marial(this);
        seminary[] seminaryVarArrCompetently = competently();
        int iDern = dern();
        apical(iDern + 1);
        seminaryVarArrCompetently[iDern] = node;
        node.setIndex(iDern);
        impassible(iDern);
    }

    public final T beachfront() {
        T t;
        synchronized (this) {
            t = (T) saneness();
        }
        return t;
    }

    public final T[] competently() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new seminary[4];
            this.a = tArr2;
            return tArr2;
        }
        if (dern() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, dern() * 2);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        T[] tArr3 = (T[]) ((seminary[]) objArrCopyOf);
        this.a = tArr3;
        return tArr3;
    }

    public final T cutely() {
        T t;
        synchronized (this) {
            t = dern() > 0 ? (T) taiyuan(0) : null;
        }
        return t;
    }

    public final int dern() {
        return f35367saneness.get(this);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    public final void formularize(int i) {
        while (true) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            if (i3 >= dern()) {
                return;
            }
            T[] tArr = this.a;
            Intrinsics.beachfront(tArr);
            int i4 = i2 + 2;
            if (i4 < dern()) {
                T t = tArr[i4];
                Intrinsics.beachfront(t);
                T t2 = tArr[i3];
                Intrinsics.beachfront(t2);
                if (((Comparable) t).compareTo(t2) >= 0) {
                    i4 = i3;
                }
            } else {
                i4 = i3;
            }
            T t3 = tArr[i];
            Intrinsics.beachfront(t3);
            T t4 = tArr[i4];
            Intrinsics.beachfront(t4);
            if (((Comparable) t3).compareTo(t4) <= 0) {
                return;
            }
            triweekly(i, i4);
            i = i4;
        }
    }

    public final void impassible(int i) {
        while (i > 0) {
            T[] tArr = this.a;
            Intrinsics.beachfront(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            Intrinsics.beachfront(t);
            T t2 = tArr[i];
            Intrinsics.beachfront(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            triweekly(i, i2);
            i = i2;
        }
    }

    public final boolean impromptu(T node) {
        boolean z;
        synchronized (this) {
            if (node.wireman() == null) {
                z = false;
            } else {
                taiyuan(node.getIndex());
                z = true;
            }
        }
        return z;
    }

    public final boolean marial() {
        return dern() == 0;
    }

    public final T saneness() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    public final T taiyuan(int index) {
        T[] tArr = this.a;
        Intrinsics.beachfront(tArr);
        apical(dern() - 1);
        if (index < dern()) {
            triweekly(index, dern());
            int i = (index - 1) / 2;
            if (index > 0) {
                T t = tArr[index];
                Intrinsics.beachfront(t);
                T t2 = tArr[i];
                Intrinsics.beachfront(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    triweekly(index, i);
                    impassible(i);
                } else {
                    formularize(index);
                }
            } else {
                formularize(index);
            }
        }
        T t3 = tArr[dern()];
        Intrinsics.beachfront(t3);
        t3.marial(null);
        t3.setIndex(-1);
        tArr[dern()] = null;
        return t3;
    }

    public final void triweekly(int i, int j) {
        T[] tArr = this.a;
        Intrinsics.beachfront(tArr);
        T t = tArr[j];
        Intrinsics.beachfront(t);
        T t2 = tArr[i];
        Intrinsics.beachfront(t2);
        tArr[i] = t;
        tArr[j] = t2;
        t.setIndex(i);
        t2.setIndex(j);
    }
}
