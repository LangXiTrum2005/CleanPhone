package polonize;

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
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: HeartBeatInfoStorage.java */
/* JADX INFO: loaded from: classes3.dex */
public class triweekly {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final SharedPreferences f35554attabal;

    public triweekly(Context context, String str) {
        this.f35554attabal = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public synchronized void apical(long j, String str) {
        String strWireman = wireman(j);
        if (this.f35554attabal.getString("last-used-date", "").equals(strWireman)) {
            String strMarial = marial(strWireman);
            if (strMarial == null) {
                return;
            }
            if (strMarial.equals(str)) {
                return;
            }
            impassible(str, strWireman);
            return;
        }
        long j2 = this.f35554attabal.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            attabal();
            j2 = this.f35554attabal.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f35554attabal.getStringSet(str, new HashSet()));
        hashSet.add(strWireman);
        this.f35554attabal.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", strWireman).commit();
    }

    public final synchronized void attabal() {
        try {
            long j = this.f35554attabal.getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : this.f35554attabal.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f35554attabal.getStringSet(key, new HashSet()));
            hashSet.remove(str);
            this.f35554attabal.edit().putStringSet(key, hashSet).putLong("fire-count", j - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean beachfront(long j, long j2) {
        return wireman(j).equals(wireman(j2));
    }

    public synchronized void competently() {
        String strWireman = wireman(System.currentTimeMillis());
        this.f35554attabal.edit().putString("last-used-date", strWireman).commit();
        impromptu(strWireman);
    }

    public synchronized boolean cutely(String str, long j) {
        if (!this.f35554attabal.contains(str)) {
            this.f35554attabal.edit().putLong(str, j).commit();
            return true;
        }
        if (beachfront(this.f35554attabal.getLong(str, -1L), j)) {
            return false;
        }
        this.f35554attabal.edit().putLong(str, j).commit();
        return true;
    }

    public synchronized List<kowloon> dern() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f35554attabal.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(wireman(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(kowloon.attabal(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            formularize(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized void formularize(long j) {
        this.f35554attabal.edit().putLong("fire-global", j).commit();
    }

    public final synchronized void impassible(String str, String str2) {
        impromptu(str2);
        HashSet hashSet = new HashSet(this.f35554attabal.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f35554attabal.edit().putStringSet(str, hashSet).commit();
    }

    public final synchronized void impromptu(String str) {
        try {
            String strMarial = marial(str);
            if (strMarial == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f35554attabal.getStringSet(strMarial, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f35554attabal.edit().remove(strMarial).commit();
            } else {
                this.f35554attabal.edit().putStringSet(strMarial, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized String marial(String str) {
        for (Map.Entry<String, ?> entry : this.f35554attabal.getAll().entrySet()) {
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

    public synchronized void saneness() {
        try {
            SharedPreferences.Editor editorEdit = this.f35554attabal.edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : this.f35554attabal.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String strWireman = wireman(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(strWireman)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(strWireman);
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

    public synchronized boolean taiyuan(long j) {
        return cutely("fire-global", j);
    }

    public final synchronized String wireman(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }
}
