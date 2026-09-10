package sulfarsenide;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: RoomSQLiteQuery.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman implements iconoclasm.marial, iconoclasm.wireman {

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public static final TreeMap<Integer, wireman> f38262gintrap = new TreeMap<>();

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final int f38263adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final long[] f38264arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public int f38265dovishness;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final int[] f38266graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public volatile String f38267kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final byte[][] f38268molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final double[] f38269monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final String[] f38270polloi;

    public wireman(int i) {
        this.f38263adultoid = i;
        int i2 = i + 1;
        this.f38266graveside = new int[i2];
        this.f38264arytenoidectomy = new long[i2];
        this.f38269monoploid = new double[i2];
        this.f38270polloi = new String[i2];
        this.f38268molybdenite = new byte[i2][];
    }

    public static void cutely() {
        TreeMap<Integer, wireman> treeMap = f38262gintrap;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator<Integer> it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i;
        }
    }

    public static wireman dern(String str, int i) {
        TreeMap<Integer, wireman> treeMap = f38262gintrap;
        synchronized (treeMap) {
            try {
                Map.Entry<Integer, wireman> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (entryCeilingEntry == null) {
                    wireman wiremanVar = new wireman(i);
                    wiremanVar.marial(str, i);
                    return wiremanVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                wireman value = entryCeilingEntry.getValue();
                value.marial(str, i);
                return value;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // iconoclasm.marial
    public String attabal() {
        return this.f38267kowloon;
    }

    @Override // iconoclasm.wireman
    public void lotta(int i) {
        this.f38266graveside[i] = 1;
    }

    public void marial(String str, int i) {
        this.f38267kowloon = str;
        this.f38265dovishness = i;
    }

    @Override // iconoclasm.wireman
    public void peridotite(int i, String str) {
        this.f38266graveside[i] = 4;
        this.f38270polloi[i] = str;
    }

    @Override // iconoclasm.wireman
    public void permissivist(int i, long j) {
        this.f38266graveside[i] = 2;
        this.f38264arytenoidectomy[i] = j;
    }

    @Override // iconoclasm.wireman
    public void polloi(int i, double d) {
        this.f38266graveside[i] = 3;
        this.f38269monoploid[i] = d;
    }

    @Override // iconoclasm.wireman
    public void premeiotic(int i, byte[] bArr) {
        this.f38266graveside[i] = 5;
        this.f38268molybdenite[i] = bArr;
    }

    public void release() {
        TreeMap<Integer, wireman> treeMap = f38262gintrap;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f38263adultoid), this);
            cutely();
        }
    }

    @Override // iconoclasm.marial
    public void saneness(iconoclasm.wireman wiremanVar) {
        for (int i = 1; i <= this.f38265dovishness; i++) {
            int i2 = this.f38266graveside[i];
            if (i2 == 1) {
                wiremanVar.lotta(i);
            } else if (i2 == 2) {
                wiremanVar.permissivist(i, this.f38264arytenoidectomy[i]);
            } else if (i2 == 3) {
                wiremanVar.polloi(i, this.f38269monoploid[i]);
            } else if (i2 == 4) {
                wiremanVar.peridotite(i, this.f38270polloi[i]);
            } else if (i2 == 5) {
                wiremanVar.premeiotic(i, this.f38268molybdenite[i]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
