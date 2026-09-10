package androidx.room;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: InvalidationTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman {

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final String[] f13602impassible = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public marial f13603apical;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public volatile iconoclasm.beachfront f13606competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public Map<String, Set<String>> f13608dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public saneness f13610impromptu;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String[] f13612saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final sulfarsenide.saneness f13613taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final RoomDatabase f13614wireman;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public AtomicBoolean f13611marial = new AtomicBoolean(false);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public volatile boolean f13605beachfront = false;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final impassible.saneness<dern, C0104wireman> f13607cutely = new impassible.saneness<>();

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public Runnable f13609formularize = new attabal();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final HashMap<String, Integer> f13604attabal = new HashMap<>();

    /* JADX INFO: compiled from: InvalidationTracker.java */
    public class attabal implements Runnable {
        public attabal() {
        }

        public final Set<Integer> attabal() {
            HashSet hashSet = new HashSet();
            Cursor cursorArytenoidectomy = wireman.this.f13614wireman.arytenoidectomy(new iconoclasm.attabal("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (cursorArytenoidectomy.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(cursorArytenoidectomy.getInt(0)));
                } catch (Throwable th) {
                    cursorArytenoidectomy.close();
                    throw th;
                }
            }
            cursorArytenoidectomy.close();
            if (!hashSet.isEmpty()) {
                wireman.this.f13606competently.triweekly();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            Lock lockImpromptu = wireman.this.f13614wireman.impromptu();
            Set<Integer> setAttabal = null;
            try {
                try {
                    lockImpromptu.lock();
                    if (!wireman.this.dern()) {
                        lockImpromptu.unlock();
                        return;
                    }
                    if (!wireman.this.f13611marial.compareAndSet(true, false)) {
                        lockImpromptu.unlock();
                        return;
                    }
                    if (wireman.this.f13614wireman.apical()) {
                        lockImpromptu.unlock();
                        return;
                    }
                    RoomDatabase roomDatabase = wireman.this.f13614wireman;
                    if (roomDatabase.f13531competently) {
                        iconoclasm.saneness writableDatabase = roomDatabase.taiyuan().getWritableDatabase();
                        writableDatabase.beachfront();
                        try {
                            setAttabal = attabal();
                            writableDatabase.preprohormone();
                            writableDatabase.oilcan();
                        } catch (Throwable th) {
                            writableDatabase.oilcan();
                            throw th;
                        }
                    } else {
                        setAttabal = attabal();
                    }
                    lockImpromptu.unlock();
                    if (setAttabal == null || setAttabal.isEmpty()) {
                        return;
                    }
                    synchronized (wireman.this.f13607cutely) {
                        try {
                            Iterator<Map.Entry<dern, C0104wireman>> it = wireman.this.f13607cutely.iterator();
                            while (it.hasNext()) {
                                it.next().getValue().attabal(setAttabal);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (SQLiteException | IllegalStateException unused) {
                }
            } catch (Throwable th3) {
                lockImpromptu.unlock();
                throw th3;
            }
        }
    }

    /* JADX INFO: compiled from: InvalidationTracker.java */
    public static abstract class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String[] f13616attabal;

        public dern(String[] strArr) {
            this.f13616attabal = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        public boolean attabal() {
            return false;
        }

        public abstract void saneness(Set<String> set);
    }

    /* JADX INFO: compiled from: InvalidationTracker.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final long[] f13617attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int[] f13618dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public boolean f13619marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final boolean[] f13620saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public boolean f13621wireman;

        public saneness(int i) {
            long[] jArr = new long[i];
            this.f13617attabal = jArr;
            boolean[] zArr = new boolean[i];
            this.f13620saneness = zArr;
            this.f13618dern = new int[i];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        public int[] attabal() {
            synchronized (this) {
                try {
                    if (this.f13621wireman && !this.f13619marial) {
                        int length = this.f13617attabal.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i >= length) {
                                this.f13619marial = true;
                                this.f13621wireman = false;
                                return this.f13618dern;
                            }
                            boolean z = this.f13617attabal[i] > 0;
                            boolean[] zArr = this.f13620saneness;
                            if (z != zArr[i]) {
                                int[] iArr = this.f13618dern;
                                if (!z) {
                                    i2 = 2;
                                }
                                iArr[i] = i2;
                            } else {
                                this.f13618dern[i] = 0;
                            }
                            zArr[i] = z;
                            i++;
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean dern(int... iArr) {
            boolean z;
            synchronized (this) {
                try {
                    z = false;
                    for (int i : iArr) {
                        long[] jArr = this.f13617attabal;
                        long j = jArr[i];
                        jArr[i] = j - 1;
                        if (j == 1) {
                            z = true;
                            this.f13621wireman = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        }

        public boolean saneness(int... iArr) {
            boolean z;
            synchronized (this) {
                try {
                    z = false;
                    for (int i : iArr) {
                        long[] jArr = this.f13617attabal;
                        long j = jArr[i];
                        jArr[i] = 1 + j;
                        if (j == 0) {
                            z = true;
                            this.f13621wireman = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        }

        public void wireman() {
            synchronized (this) {
                this.f13619marial = false;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.wireman$wireman, reason: collision with other inner class name */
    /* JADX INFO: compiled from: InvalidationTracker.java */
    public static class C0104wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int[] f13622attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final dern f13623dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final String[] f13624saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final Set<String> f13625wireman;

        public C0104wireman(dern dernVar, int[] iArr, String[] strArr) {
            this.f13623dern = dernVar;
            this.f13622attabal = iArr;
            this.f13624saneness = strArr;
            if (iArr.length != 1) {
                this.f13625wireman = null;
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(strArr[0]);
            this.f13625wireman = Collections.unmodifiableSet(hashSet);
        }

        public void attabal(Set<Integer> set) {
            int length = this.f13622attabal.length;
            Set<String> hashSet = null;
            for (int i = 0; i < length; i++) {
                if (set.contains(Integer.valueOf(this.f13622attabal[i]))) {
                    if (length == 1) {
                        hashSet = this.f13625wireman;
                    } else {
                        if (hashSet == null) {
                            hashSet = new HashSet<>(length);
                        }
                        hashSet.add(this.f13624saneness[i]);
                    }
                }
            }
            if (hashSet != null) {
                this.f13623dern.saneness(hashSet);
            }
        }

        public void saneness(String[] strArr) {
            Set<String> set = null;
            if (this.f13624saneness.length == 1) {
                for (String str : strArr) {
                    if (str.equalsIgnoreCase(this.f13624saneness[0])) {
                        set = this.f13625wireman;
                        break;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str2 : strArr) {
                    for (String str3 : this.f13624saneness) {
                        if (str3.equalsIgnoreCase(str2)) {
                            hashSet.add(str3);
                            break;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f13623dern.saneness(set);
            }
        }
    }

    public wireman(RoomDatabase roomDatabase, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f13614wireman = roomDatabase;
        this.f13610impromptu = new saneness(strArr.length);
        this.f13608dern = map2;
        this.f13613taiyuan = new sulfarsenide.saneness(roomDatabase);
        int length = strArr.length;
        this.f13612saneness = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f13604attabal.put(lowerCase, Integer.valueOf(i));
            String str2 = map.get(strArr[i]);
            if (str2 != null) {
                this.f13612saneness[i] = str2.toLowerCase(locale);
            } else {
                this.f13612saneness[i] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = value.toLowerCase(locale2);
            if (this.f13604attabal.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> map3 = this.f13604attabal;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    public static void saneness(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    public final void apical(iconoclasm.saneness sanenessVar, int i) {
        String str = this.f13612saneness[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f13602impassible) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            saneness(sb, str, str2);
            sanenessVar.impassible(sb.toString());
        }
    }

    public void attabal(dern dernVar) {
        C0104wireman c0104wiremanCompetently;
        String[] strArrImpromptu = impromptu(dernVar.f13616attabal);
        int[] iArr = new int[strArrImpromptu.length];
        int length = strArrImpromptu.length;
        for (int i = 0; i < length; i++) {
            Integer num = this.f13604attabal.get(strArrImpromptu[i].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + strArrImpromptu[i]);
            }
            iArr[i] = num.intValue();
        }
        C0104wireman c0104wireman = new C0104wireman(dernVar, iArr, strArrImpromptu);
        synchronized (this.f13607cutely) {
            c0104wiremanCompetently = this.f13607cutely.competently(dernVar, c0104wireman);
        }
        if (c0104wiremanCompetently == null && this.f13610impromptu.saneness(iArr)) {
            formularize();
        }
    }

    public void beachfront() {
        if (this.f13611marial.compareAndSet(false, true)) {
            this.f13614wireman.cutely().execute(this.f13609formularize);
        }
    }

    public void competently(dern dernVar) {
        C0104wireman c0104wiremanImpromptu;
        synchronized (this.f13607cutely) {
            c0104wiremanImpromptu = this.f13607cutely.impromptu(dernVar);
        }
        if (c0104wiremanImpromptu == null || !this.f13610impromptu.dern(c0104wiremanImpromptu.f13622attabal)) {
            return;
        }
        formularize();
    }

    public final void cutely(iconoclasm.saneness sanenessVar, int i) {
        sanenessVar.impassible("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f13612saneness[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f13602impassible) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            saneness(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            sanenessVar.impassible(sb.toString());
        }
    }

    public boolean dern() {
        if (!this.f13614wireman.kowloon()) {
            return false;
        }
        if (!this.f13605beachfront) {
            this.f13614wireman.taiyuan().getWritableDatabase();
        }
        return this.f13605beachfront;
    }

    public void formularize() {
        if (this.f13614wireman.kowloon()) {
            impassible(this.f13614wireman.taiyuan().getWritableDatabase());
        }
    }

    public void impassible(iconoclasm.saneness sanenessVar) {
        if (sanenessVar.empress()) {
            return;
        }
        while (true) {
            try {
                Lock lockImpromptu = this.f13614wireman.impromptu();
                lockImpromptu.lock();
                try {
                    int[] iArrAttabal = this.f13610impromptu.attabal();
                    if (iArrAttabal == null) {
                        lockImpromptu.unlock();
                        return;
                    }
                    int length = iArrAttabal.length;
                    sanenessVar.beachfront();
                    for (int i = 0; i < length; i++) {
                        try {
                            int i2 = iArrAttabal[i];
                            if (i2 == 1) {
                                cutely(sanenessVar, i);
                            } else if (i2 == 2) {
                                apical(sanenessVar, i);
                            }
                        } catch (Throwable th) {
                            sanenessVar.oilcan();
                            throw th;
                        }
                    }
                    sanenessVar.preprohormone();
                    sanenessVar.oilcan();
                    this.f13610impromptu.wireman();
                    lockImpromptu.unlock();
                } catch (Throwable th2) {
                    lockImpromptu.unlock();
                    throw th2;
                }
            } catch (SQLiteException | IllegalStateException unused) {
                return;
            }
        }
    }

    public final String[] impromptu(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f13608dern.containsKey(lowerCase)) {
                hashSet.addAll(this.f13608dern.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public void marial(String... strArr) {
        synchronized (this.f13607cutely) {
            try {
                for (Map.Entry<dern, C0104wireman> entry : this.f13607cutely) {
                    if (!entry.getKey().attabal()) {
                        entry.getValue().saneness(strArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void taiyuan(Context context, String str) {
        this.f13603apical = new marial(context, str, this, this.f13614wireman.cutely());
    }

    public void wireman(iconoclasm.saneness sanenessVar) {
        synchronized (this) {
            try {
                if (this.f13605beachfront) {
                    return;
                }
                sanenessVar.impassible("PRAGMA temp_store = MEMORY;");
                sanenessVar.impassible("PRAGMA recursive_triggers='ON';");
                sanenessVar.impassible("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                impassible(sanenessVar);
                this.f13606competently = sanenessVar.mathsort("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
                this.f13605beachfront = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
