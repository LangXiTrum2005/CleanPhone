package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5062xz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f5254a;

    public C5062xz(Context context, String str) {
        this.f5254a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        try {
            long j = this.f5254a.getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : this.f5254a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f5254a.getStringSet(key, new HashSet()));
            hashSet.remove(str);
            this.f5254a.edit().putStringSet(key, hashSet).putLong("fire-count", j - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            SharedPreferences.Editor editorEdit = this.f5254a.edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : this.f5254a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String strD = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(strD)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(strD);
                        i++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i == 0) {
                editorEdit.remove("fire-count");
            } else {
                editorEdit.putLong("fire-count", i);
            }
            editorEdit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f5254a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new C2969a8(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            l(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String d(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f5254a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public final synchronized boolean f(long j, long j2) {
        return d(j).equals(d(j2));
    }

    public final synchronized void g() {
        String strD = d(System.currentTimeMillis());
        this.f5254a.edit().putString("last-used-date", strD).commit();
        h(strD);
    }

    public final synchronized void h(String str) {
        try {
            String strE = e(str);
            if (strE == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f5254a.getStringSet(strE, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f5254a.edit().remove(strE).commit();
            } else {
                this.f5254a.edit().putStringSet(strE, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean i(long j) {
        return j(j);
    }

    public final synchronized boolean j(long j) {
        if (!this.f5254a.contains("fire-global")) {
            this.f5254a.edit().putLong("fire-global", j).commit();
            return true;
        }
        if (f(this.f5254a.getLong("fire-global", -1L), j)) {
            return false;
        }
        this.f5254a.edit().putLong("fire-global", j).commit();
        return true;
    }

    public final synchronized void k(long j, String str) {
        String strD = d(j);
        if (this.f5254a.getString("last-used-date", "").equals(strD)) {
            String strE = e(strD);
            if (strE == null) {
                return;
            }
            if (strE.equals(str)) {
                return;
            }
            m(str, strD);
            return;
        }
        long j2 = this.f5254a.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            a();
            j2 = this.f5254a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f5254a.getStringSet(str, new HashSet()));
        hashSet.add(strD);
        this.f5254a.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", strD).commit();
    }

    public final synchronized void l(long j) {
        this.f5254a.edit().putLong("fire-global", j).commit();
    }

    public final synchronized void m(String str, String str2) {
        h(str2);
        HashSet hashSet = new HashSet(this.f5254a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f5254a.edit().putStringSet(str, hashSet).commit();
    }
}
