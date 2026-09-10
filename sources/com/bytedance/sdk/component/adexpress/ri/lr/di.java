package com.bytedance.sdk.component.adexpress.ri.lr;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class di {
    private static volatile di lr = null;
    public static int ri = 20;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.component.adexpress.ri.ik.ik> fi;
    private final Object ka = new Object();
    private AtomicBoolean di = new AtomicBoolean(false);
    private LruCache<String, com.bytedance.sdk.component.adexpress.ri.ik.lr> xha = new LruCache<String, com.bytedance.sdk.component.adexpress.ri.ik.lr>(ri) { // from class: com.bytedance.sdk.component.adexpress.ri.lr.di.1
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, com.bytedance.sdk.component.adexpress.ri.ik.lr lrVar) {
            return 1;
        }
    };
    private Set<String> ik = Collections.synchronizedSet(new HashSet());

    private di() {
    }

    private void ka(String str) {
        LruCache<String, com.bytedance.sdk.component.adexpress.ri.ik.lr> lruCache;
        if (TextUtils.isEmpty(str) || (lruCache = this.xha) == null || lruCache.size() <= 0) {
            return;
        }
        synchronized (this.ka) {
            this.xha.remove(str);
        }
    }

    public static void ri(int i) {
        ri = i;
    }

    public void ik(String str) {
        com.bytedance.sdk.component.adexpress.ri.ik.ik ikVar;
        try {
            if (this.fi != null && !this.fi.isEmpty() && (ikVar = this.fi.get(str)) != null) {
                if (!TextUtils.isEmpty(ikVar.ri()) && com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().di() != null) {
                    com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().di();
                }
                this.fi.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    public Set<String> lr(String str) {
        if (!TextUtils.isEmpty(str) && com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().lr() != null) {
            HashSet hashSet = new HashSet();
            Cursor cursorRi = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().lr().ri("template_diff_new", null, "rit=?", new String[]{str}, null, null, null);
            if (cursorRi != null) {
                try {
                    if (cursorRi.moveToFirst()) {
                        do {
                            hashSet.add(cursorRi.getString(cursorRi.getColumnIndex("id")));
                        } while (cursorRi.moveToNext());
                        return hashSet;
                    }
                } catch (Exception unused) {
                } finally {
                    cursorRi.close();
                }
            }
        }
        return null;
    }

    public static di ri() {
        if (lr == null) {
            synchronized (di.class) {
                try {
                    if (lr == null) {
                        lr = new di();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lr;
    }

    public static String ik() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)").toString();
    }

    public com.bytedance.sdk.component.adexpress.ri.ik.lr ri(String str) {
        com.bytedance.sdk.component.adexpress.ri.ik.lr lrVar;
        com.bytedance.sdk.component.adexpress.ri.ik.lr lrVarRi;
        if (TextUtils.isEmpty(str) || com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().lr() == null) {
            return null;
        }
        synchronized (this.ka) {
            lrVar = this.xha.get(String.valueOf(str));
        }
        if (lrVar != null) {
            return lrVar;
        }
        Cursor cursorRi = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().lr().ri("template_diff_new", null, "id=?", new String[]{str}, null, null, null);
        if (cursorRi != null) {
            try {
                if (cursorRi.moveToFirst()) {
                    do {
                        String string = cursorRi.getString(cursorRi.getColumnIndex("rit"));
                        String string2 = cursorRi.getString(cursorRi.getColumnIndex("id"));
                        String string3 = cursorRi.getString(cursorRi.getColumnIndex("md5"));
                        String string4 = cursorRi.getString(cursorRi.getColumnIndex("url"));
                        String string5 = cursorRi.getString(cursorRi.getColumnIndex("data"));
                        String string6 = cursorRi.getString(cursorRi.getColumnIndex("version"));
                        lrVarRi = new com.bytedance.sdk.component.adexpress.ri.ik.lr().ri(string).lr(string2).ik(string3).ka(string4).fi(string5).di(string6).ri(Long.valueOf(cursorRi.getLong(cursorRi.getColumnIndex("update_time"))));
                        synchronized (this.ka) {
                            this.xha.put(string2, lrVarRi);
                        }
                        this.ik.add(string2);
                    } while (cursorRi.moveToNext());
                    cursorRi.close();
                    return lrVarRi;
                }
            } catch (Throwable unused) {
            }
            cursorRi.close();
        }
        return null;
    }

    public List<com.bytedance.sdk.component.adexpress.ri.ik.lr> lr() {
        if (com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().lr() == null) {
            return null;
        }
        boolean z = this.di.get();
        this.di.set(true);
        ArrayList arrayList = new ArrayList();
        Cursor cursorRi = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().lr().ri("template_diff_new", null, null, null, null, null, null);
        if (cursorRi != null) {
            while (cursorRi.moveToNext()) {
                try {
                    String string = cursorRi.getString(cursorRi.getColumnIndex("rit"));
                    String string2 = cursorRi.getString(cursorRi.getColumnIndex("id"));
                    String string3 = cursorRi.getString(cursorRi.getColumnIndex("md5"));
                    String string4 = cursorRi.getString(cursorRi.getColumnIndex("url"));
                    String string5 = cursorRi.getString(cursorRi.getColumnIndex("data"));
                    String string6 = cursorRi.getString(cursorRi.getColumnIndex("version"));
                    arrayList.add(new com.bytedance.sdk.component.adexpress.ri.ik.lr().ri(string).lr(string2).ik(string3).ka(string4).fi(string5).di(string6).ri(Long.valueOf(cursorRi.getLong(cursorRi.getColumnIndex("update_time")))));
                    synchronized (this.ka) {
                        this.xha.put(string2, (com.bytedance.sdk.component.adexpress.ri.ik.lr) arrayList.get(arrayList.size() - 1));
                    }
                    this.ik.add(string2);
                    if (!z && com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().di() != null) {
                        if (this.fi == null) {
                            this.fi = new ConcurrentHashMap<>();
                        }
                        if (string2 != null && !this.fi.contains(string2)) {
                            this.fi.put(string2, new com.bytedance.sdk.component.adexpress.ri.ik.ik(string, string2, string3));
                        }
                    }
                } catch (Throwable unused) {
                    cursorRi.close();
                }
            }
            cursorRi.close();
            return arrayList;
        }
        return arrayList;
    }

    public void ri(com.bytedance.sdk.component.adexpress.ri.ik.lr lrVar, boolean z) {
        if (lrVar == null || com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().lr() == null || TextUtils.isEmpty(lrVar.lr())) {
            return;
        }
        Cursor cursorRi = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().lr().ri("template_diff_new", null, "id=?", new String[]{lrVar.lr()}, null, null, null);
        boolean z2 = cursorRi != null && cursorRi.getCount() > 0;
        String string = null;
        if (cursorRi != null) {
            try {
                string = cursorRi.moveToFirst() ? cursorRi.getString(cursorRi.getColumnIndex("rit")) : null;
                cursorRi.close();
            } catch (Throwable unused) {
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rit", lrVar.ri());
        contentValues.put("id", lrVar.lr());
        contentValues.put("md5", lrVar.ik());
        contentValues.put("url", lrVar.ka());
        contentValues.put("data", lrVar.fi());
        contentValues.put("version", lrVar.di());
        contentValues.put("update_time", lrVar.xha());
        if (z2) {
            com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().lr().ri("template_diff_new", contentValues, "id=?", new String[]{lrVar.lr()});
        } else {
            com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().lr().ri("template_diff_new", contentValues);
        }
        synchronized (this.ka) {
            this.xha.put(lrVar.lr(), lrVar);
        }
        this.ik.add(lrVar.lr());
        if (z) {
            return;
        }
        try {
            if (com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().di() == null) {
                return;
            }
            if (this.fi == null) {
                this.fi = new ConcurrentHashMap<>();
            }
            com.bytedance.sdk.component.adexpress.ri.ik.ik ikVar = new com.bytedance.sdk.component.adexpress.ri.ik.ik(lrVar.ri(), lrVar.lr(), lrVar.ik());
            this.fi.put(lrVar.lr(), ikVar);
            if (string != null) {
                com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().di();
                ikVar.lr();
            }
            com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().di();
            lrVar.ri();
        } catch (Throwable unused2) {
        }
    }

    public void ri(Set<String> set) {
        if (set == null || set.isEmpty() || com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().lr() == null) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                ka(strArr[i]);
                com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().lr().ri("template_diff_new", "id=?", new String[]{strArr[i]});
                ik(strArr[i]);
            }
        }
    }
}
