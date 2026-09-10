package w1;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q implements a2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f52872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f52873c;

    public q(String str, List list, boolean z10) {
        this.f52871a = str;
        this.f52872b = Collections.unmodifiableList(list);
        this.f52873c = z10;
    }
}
