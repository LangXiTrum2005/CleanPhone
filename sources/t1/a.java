package t1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f50329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f50331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f50332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f50333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f50334f;

    public a(long j10, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f50329a = j10;
        this.f50330b = i10;
        this.f50331c = Collections.unmodifiableList(arrayList);
        this.f50332d = Collections.unmodifiableList(list);
        this.f50333e = Collections.unmodifiableList(list2);
        this.f50334f = Collections.unmodifiableList(list3);
    }
}
