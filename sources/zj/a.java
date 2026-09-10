package zj;

import java.util.Comparator;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f54957b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f54958c = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54959a;

    public /* synthetic */ a(int i10) {
        this.f54959a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f54959a) {
            case 0:
                Comparable a8 = (Comparable) obj;
                Comparable b10 = (Comparable) obj2;
                n.f(a8, "a");
                n.f(b10, "b");
                return a8.compareTo(b10);
            default:
                Comparable a10 = (Comparable) obj;
                Comparable b11 = (Comparable) obj2;
                n.f(a10, "a");
                n.f(b11, "b");
                return b11.compareTo(a10);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f54959a) {
            case 0:
                return f54958c;
            default:
                return f54957b;
        }
    }
}
