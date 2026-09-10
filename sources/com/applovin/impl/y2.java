package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o4 f10056a = new o4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TreeSet f10057b = new TreeSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f10058c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10060e;

    public y2(MaxAdPlacerSettings maxAdPlacerSettings) {
        a(maxAdPlacerSettings);
    }

    private void a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            com.applovin.impl.sdk.p.h("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f10056a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (!maxAdPlacerSettings.isRepeatingEnabled()) {
            return;
        }
        int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
        if (this.f10056a.isEmpty()) {
            this.f10056a.add(Integer.valueOf(repeatingInterval - 1));
        }
        int iIntValue = ((Integer) this.f10056a.a()).intValue();
        while (true) {
            iIntValue += repeatingInterval;
            if (this.f10056a.size() >= maxAdPlacerSettings.getMaxAdCount()) {
                return;
            } else {
                this.f10056a.add(Integer.valueOf(iIntValue));
            }
        }
    }

    public Collection b() {
        return new TreeSet((SortedSet) this.f10057b);
    }

    public int c() {
        int i10 = this.f10059d;
        if (i10 != -1 && this.f10060e != -1) {
            while (i10 <= this.f10060e) {
                if (g(i10) && !h(i10)) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public int d(int i10) {
        if (g(i10)) {
            return -1;
        }
        return i10 - a(i10, true);
    }

    public Collection e(int i10) {
        return new TreeSet((SortedSet) this.f10057b.tailSet(Integer.valueOf(i10), false));
    }

    public void f(int i10) {
        int iB = this.f10056a.b(Integer.valueOf(i10));
        for (int size = this.f10056a.size() - 1; size >= iB; size--) {
            Integer num = (Integer) this.f10056a.a(size);
            int iIntValue = num.intValue() + 1;
            a(num.intValue(), iIntValue);
            this.f10056a.a(size, Integer.valueOf(iIntValue));
        }
    }

    public boolean g(int i10) {
        return this.f10056a.contains(Integer.valueOf(i10));
    }

    public boolean h(int i10) {
        return this.f10057b.contains(Integer.valueOf(i10));
    }

    public void i(int i10) {
        int iB = this.f10056a.b(Integer.valueOf(i10));
        if (g(i10)) {
            this.f10058c.remove(Integer.valueOf(i10));
            this.f10057b.remove(Integer.valueOf(i10));
            this.f10056a.b(iB);
        }
        while (iB < this.f10056a.size()) {
            Integer num = (Integer) this.f10056a.a(iB);
            int iIntValue = num.intValue() - 1;
            a(num.intValue(), iIntValue);
            this.f10056a.a(iB, Integer.valueOf(iIntValue));
            iB++;
        }
    }

    public int b(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 + a(i10 - 1, false);
    }

    public void b(int i10, int i11) {
        i(i10);
        f(i11);
    }

    public void c(int i10, int i11) {
        this.f10059d = i10;
        this.f10060e = i11;
    }

    public int c(int i10) {
        return i10 + a(i10, false);
    }

    public MaxAd a(int i10) {
        return (MaxAd) this.f10058c.get(Integer.valueOf(i10));
    }

    public void a(MaxAd maxAd, int i10) {
        this.f10058c.put(Integer.valueOf(i10), maxAd);
        this.f10057b.add(Integer.valueOf(i10));
    }

    public void a() {
        this.f10058c.clear();
        this.f10057b.clear();
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            this.f10058c.remove(num);
            this.f10057b.remove(num);
        }
    }

    private void a(int i10, int i11) {
        if (this.f10058c.containsKey(Integer.valueOf(i10))) {
            this.f10058c.put(Integer.valueOf(i11), (MaxAd) this.f10058c.get(Integer.valueOf(i10)));
            this.f10057b.add(Integer.valueOf(i11));
            this.f10058c.remove(Integer.valueOf(i10));
            this.f10057b.remove(Integer.valueOf(i10));
        }
    }

    private int a(int i10, boolean z10) {
        int iC = this.f10056a.c(Integer.valueOf(i10));
        if (!z10) {
            int i11 = i10 + iC;
            while (iC < this.f10056a.size() && i11 >= ((Integer) this.f10056a.a(iC)).intValue()) {
                i11++;
                iC++;
            }
        }
        return iC;
    }
}
