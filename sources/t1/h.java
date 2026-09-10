package t1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f50373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f50374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f50375d;

    public h(String str, long j10, ArrayList arrayList, List list) {
        this.f50372a = str;
        this.f50373b = j10;
        this.f50374c = Collections.unmodifiableList(arrayList);
        this.f50375d = Collections.unmodifiableList(list);
    }
}
