package com.google.common.collect;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: TopKSelector.java */
/* JADX INFO: loaded from: classes3.dex */
public final class deadwork<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f21890attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final T[] f21891dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    @CheckForNull
    public T f21892marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Comparator<? super T> f21893saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f21894wireman;

    public deadwork(Comparator<? super T> comparator, int i) {
        this.f21893saneness = (Comparator) com.google.common.base.formularize.kowloon(comparator, "comparator");
        this.f21890attabal = i;
        com.google.common.base.formularize.competently(i >= 0, "k (%s) must be >= 0", i);
        com.google.common.base.formularize.competently(i <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", i);
        this.f21891dern = (T[]) new Object[moresque.dern.saneness(i, 2)];
        this.f21894wireman = 0;
        this.f21892marial = null;
    }

    public static <T> deadwork<T> attabal(int i, Comparator<? super T> comparator) {
        return new deadwork<>(comparator, i);
    }

    public List<T> beachfront() {
        T[] tArr = this.f21891dern;
        Arrays.sort(tArr, 0, this.f21894wireman, this.f21893saneness);
        int i = this.f21894wireman;
        int i2 = this.f21890attabal;
        if (i > i2) {
            T[] tArr2 = this.f21891dern;
            Arrays.fill(tArr2, i2, tArr2.length, (Object) null);
            int i3 = this.f21890attabal;
            this.f21894wireman = i3;
            this.f21892marial = this.f21891dern[i3 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(tArr, this.f21894wireman)));
    }

    public final void competently() {
        int i = (this.f21890attabal * 2) - 1;
        int iBeachfront = moresque.dern.beachfront(i, RoundingMode.CEILING) * 3;
        int iMax = 0;
        int i2 = 0;
        int i3 = 0;
        while (iMax < i) {
            int iWireman = wireman(iMax, i, ((iMax + i) + 1) >>> 1);
            int i4 = this.f21890attabal;
            if (iWireman <= i4) {
                if (iWireman >= i4) {
                    break;
                }
                iMax = Math.max(iWireman, iMax + 1);
                i3 = iWireman;
            } else {
                i = iWireman - 1;
            }
            i2++;
            if (i2 >= iBeachfront) {
                Arrays.sort(this.f21891dern, iMax, i + 1, this.f21893saneness);
                break;
            }
        }
        this.f21894wireman = this.f21890attabal;
        this.f21892marial = (T) herdbook.attabal(this.f21891dern[i3]);
        while (true) {
            i3++;
            if (i3 >= this.f21890attabal) {
                return;
            }
            if (this.f21893saneness.compare((Object) herdbook.attabal(this.f21891dern[i3]), (Object) herdbook.attabal(this.f21892marial)) > 0) {
                this.f21892marial = this.f21891dern[i3];
            }
        }
    }

    public void dern(Iterator<? extends T> it) {
        while (it.hasNext()) {
            saneness(it.next());
        }
    }

    public final void marial(int i, int i2) {
        T[] tArr = this.f21891dern;
        T t = tArr[i];
        tArr[i] = tArr[i2];
        tArr[i2] = t;
    }

    public void saneness(T t) {
        int i = this.f21890attabal;
        if (i == 0) {
            return;
        }
        int i2 = this.f21894wireman;
        if (i2 == 0) {
            this.f21891dern[0] = t;
            this.f21892marial = t;
            this.f21894wireman = 1;
            return;
        }
        if (i2 < i) {
            T[] tArr = this.f21891dern;
            this.f21894wireman = i2 + 1;
            tArr[i2] = t;
            if (this.f21893saneness.compare(t, (Object) herdbook.attabal(this.f21892marial)) > 0) {
                this.f21892marial = t;
                return;
            }
            return;
        }
        if (this.f21893saneness.compare(t, (Object) herdbook.attabal(this.f21892marial)) < 0) {
            T[] tArr2 = this.f21891dern;
            int i3 = this.f21894wireman;
            int i4 = i3 + 1;
            this.f21894wireman = i4;
            tArr2[i3] = t;
            if (i4 == this.f21890attabal * 2) {
                competently();
            }
        }
    }

    public final int wireman(int i, int i2, int i3) {
        Object objAttabal = herdbook.attabal(this.f21891dern[i3]);
        T[] tArr = this.f21891dern;
        tArr[i3] = tArr[i2];
        int i4 = i;
        while (i < i2) {
            if (this.f21893saneness.compare((Object) herdbook.attabal(this.f21891dern[i]), objAttabal) < 0) {
                marial(i4, i);
                i4++;
            }
            i++;
        }
        T[] tArr2 = this.f21891dern;
        tArr2[i2] = tArr2[i4];
        tArr2[i4] = objAttabal;
        return i4;
    }
}
