package g4;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements k4.c, Closeable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final TreeMap f41506i = new TreeMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile String f41507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f41508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double[] f41509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f41510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[][] f41511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f41512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f41513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f41514h;

    public h(int i10) {
        this.f41513g = i10;
        int i11 = i10 + 1;
        this.f41512f = new int[i11];
        this.f41508b = new long[i11];
        this.f41509c = new double[i11];
        this.f41510d = new String[i11];
        this.f41511e = new byte[i11][];
    }

    public static h b(int i10, String str) {
        TreeMap treeMap = f41506i;
        synchronized (treeMap) {
            try {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
                if (entryCeilingEntry == null) {
                    h hVar = new h(i10);
                    hVar.f41507a = str;
                    hVar.f41514h = i10;
                    return hVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                h hVar2 = (h) entryCeilingEntry.getValue();
                hVar2.f41507a = str;
                hVar2.f41514h = i10;
                return hVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // k4.c
    public final void a(l4.b bVar) {
        for (int i10 = 1; i10 <= this.f41514h; i10++) {
            int i11 = this.f41512f[i10];
            if (i11 == 1) {
                bVar.k(i10);
            } else if (i11 == 2) {
                bVar.j(i10, this.f41508b[i10]);
            } else if (i11 == 3) {
                ((SQLiteProgram) bVar.f45023b).bindDouble(i10, this.f41509c[i10]);
            } else if (i11 == 4) {
                bVar.n(i10, this.f41510d[i10]);
            } else if (i11 == 5) {
                bVar.h(i10, this.f41511e[i10]);
            }
        }
    }

    public final void c(int i10, long j10) {
        this.f41512f[i10] = 2;
        this.f41508b[i10] = j10;
    }

    @Override // k4.c
    public final String d() {
        return this.f41507a;
    }

    public final void h(int i10) {
        this.f41512f[i10] = 1;
    }

    public final void j(int i10, String str) {
        this.f41512f[i10] = 4;
        this.f41510d[i10] = str;
    }

    public final void k() {
        TreeMap treeMap = f41506i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f41513g), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i10 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i10;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
