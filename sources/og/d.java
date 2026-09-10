package og;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements Closeable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f47428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f47429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f47430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47431e;

    public final int d() {
        int i10 = this.f47427a;
        if (i10 != 0) {
            return this.f47428b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }
}
