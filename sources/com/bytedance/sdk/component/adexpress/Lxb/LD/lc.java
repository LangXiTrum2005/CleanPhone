package com.bytedance.sdk.component.adexpress.Lxb.LD;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.utils.sLN;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class lc {
    private static volatile lc LD = null;
    public static int Lxb = 20;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.component.adexpress.Lxb.lk.lk> JXs;
    private final Object ZU = new Object();
    private AtomicBoolean lc = new AtomicBoolean(false);
    private LruCache<String, com.bytedance.sdk.component.adexpress.Lxb.lk.LD> ebl = new LruCache<String, com.bytedance.sdk.component.adexpress.Lxb.lk.LD>(Lxb) { // from class: com.bytedance.sdk.component.adexpress.Lxb.LD.lc.1
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, com.bytedance.sdk.component.adexpress.Lxb.lk.LD ld) {
            return 1;
        }
    };
    private Set<String> lk = Collections.synchronizedSet(new HashSet());

    private lc() {
    }

    public static void Lxb(int i) {
        Lxb = i;
    }

    private void ZU(String str) {
        LruCache<String, com.bytedance.sdk.component.adexpress.Lxb.lk.LD> lruCache;
        if (TextUtils.isEmpty(str) || (lruCache = this.ebl) == null || lruCache.size() <= 0) {
            return;
        }
        synchronized (this.ZU) {
            this.ebl.remove(str);
        }
    }

    public Set<String> LD(String str) {
        if (!TextUtils.isEmpty(str) && com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().LD() != null) {
            HashSet hashSet = new HashSet();
            Cursor cursorLxb = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().LD().Lxb("template_diff_new", null, "rit=?", new String[]{str}, null, null, null);
            if (cursorLxb != null) {
                try {
                    if (cursorLxb.moveToFirst()) {
                        do {
                            hashSet.add(cursorLxb.getString(cursorLxb.getColumnIndex("id")));
                        } while (cursorLxb.moveToNext());
                        return hashSet;
                    }
                } catch (Exception unused) {
                } finally {
                    cursorLxb.close();
                }
            }
        }
        return null;
    }

    public void lk(String str) {
        com.bytedance.sdk.component.adexpress.Lxb.lk.lk lkVar;
        try {
            if (this.JXs == null || this.JXs.isEmpty() || (lkVar = this.JXs.get(str)) == null) {
                return;
            }
            if (!TextUtils.isEmpty(lkVar.Lxb()) && com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lc() != null) {
                com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lc();
            }
            this.JXs.remove(str);
        } catch (Throwable unused) {
        }
    }

    public static lc Lxb() {
        if (LD == null) {
            synchronized (lc.class) {
                try {
                    if (LD == null) {
                        LD = new lc();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return LD;
    }

    public static String lk() {
        return "CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)";
    }

    public com.bytedance.sdk.component.adexpress.Lxb.lk.LD Lxb(String str) {
        com.bytedance.sdk.component.adexpress.Lxb.lk.LD ld;
        com.bytedance.sdk.component.adexpress.Lxb.lk.LD ldLxb;
        if (TextUtils.isEmpty(str) || com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().LD() == null) {
            return null;
        }
        synchronized (this.ZU) {
            ld = this.ebl.get(String.valueOf(str));
        }
        if (ld != null) {
            return ld;
        }
        Cursor cursorLxb = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().LD().Lxb("template_diff_new", null, "id=?", new String[]{str}, null, null, null);
        if (cursorLxb != null) {
            try {
                if (cursorLxb.moveToFirst()) {
                    do {
                        String string = cursorLxb.getString(cursorLxb.getColumnIndex("rit"));
                        String string2 = cursorLxb.getString(cursorLxb.getColumnIndex("id"));
                        String string3 = cursorLxb.getString(cursorLxb.getColumnIndex("md5"));
                        String string4 = cursorLxb.getString(cursorLxb.getColumnIndex("url"));
                        String string5 = cursorLxb.getString(cursorLxb.getColumnIndex("data"));
                        String string6 = cursorLxb.getString(cursorLxb.getColumnIndex("version"));
                        ldLxb = new com.bytedance.sdk.component.adexpress.Lxb.lk.LD().Lxb(string).LD(string2).lk(string3).ZU(string4).JXs(string5).lc(string6).Lxb(Long.valueOf(cursorLxb.getLong(cursorLxb.getColumnIndex("update_time"))));
                        synchronized (this.ZU) {
                            this.ebl.put(string2, ldLxb);
                        }
                        this.lk.add(string2);
                    } while (cursorLxb.moveToNext());
                    cursorLxb.close();
                    return ldLxb;
                }
            } catch (Throwable th) {
                try {
                    sLN.Lxb("TmplDbHelper", "getTemplate error", th);
                } finally {
                    cursorLxb.close();
                }
            }
        }
        return null;
    }

    public List<com.bytedance.sdk.component.adexpress.Lxb.lk.LD> LD() {
        if (com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().LD() == null) {
            return null;
        }
        boolean z = this.lc.get();
        this.lc.set(true);
        ArrayList arrayList = new ArrayList();
        Cursor cursorLxb = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().LD().Lxb("template_diff_new", null, null, null, null, null, null);
        if (cursorLxb != null) {
            while (cursorLxb.moveToNext()) {
                try {
                    String string = cursorLxb.getString(cursorLxb.getColumnIndex("rit"));
                    String string2 = cursorLxb.getString(cursorLxb.getColumnIndex("id"));
                    String string3 = cursorLxb.getString(cursorLxb.getColumnIndex("md5"));
                    String string4 = cursorLxb.getString(cursorLxb.getColumnIndex("url"));
                    String string5 = cursorLxb.getString(cursorLxb.getColumnIndex("data"));
                    String string6 = cursorLxb.getString(cursorLxb.getColumnIndex("version"));
                    arrayList.add(new com.bytedance.sdk.component.adexpress.Lxb.lk.LD().Lxb(string).LD(string2).lk(string3).ZU(string4).JXs(string5).lc(string6).Lxb(Long.valueOf(cursorLxb.getLong(cursorLxb.getColumnIndex("update_time")))));
                    synchronized (this.ZU) {
                        this.ebl.put(string2, (com.bytedance.sdk.component.adexpress.Lxb.lk.LD) arrayList.get(arrayList.size() - 1));
                    }
                    this.lk.add(string2);
                    if (!z && com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lc() != null) {
                        if (this.JXs == null) {
                            this.JXs = new ConcurrentHashMap<>();
                        }
                        if (string2 != null && !this.JXs.contains(string2)) {
                            this.JXs.put(string2, new com.bytedance.sdk.component.adexpress.Lxb.lk.lk(string, string2, string3));
                        }
                    }
                } catch (Throwable th) {
                    try {
                        sLN.Lxb("TmplDbHelper", "getTemplate error", th);
                    } finally {
                        cursorLxb.close();
                    }
                }
            }
        }
        return arrayList;
    }

    public void Lxb(com.bytedance.sdk.component.adexpress.Lxb.lk.LD ld, boolean z) {
        if (ld == null || com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().LD() == null || TextUtils.isEmpty(ld.LD())) {
            return;
        }
        Cursor cursorLxb = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().LD().Lxb("template_diff_new", null, "id=?", new String[]{ld.LD()}, null, null, null);
        boolean z2 = cursorLxb != null && cursorLxb.getCount() > 0;
        String string = null;
        if (cursorLxb != null) {
            try {
                string = cursorLxb.moveToFirst() ? cursorLxb.getString(cursorLxb.getColumnIndex("rit")) : null;
                cursorLxb.close();
            } catch (Throwable unused) {
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rit", ld.Lxb());
        contentValues.put("id", ld.LD());
        contentValues.put("md5", ld.lk());
        contentValues.put("url", ld.ZU());
        contentValues.put("data", ld.JXs());
        contentValues.put("version", ld.lc());
        contentValues.put("update_time", ld.ebl());
        if (z2) {
            com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().LD().Lxb("template_diff_new", contentValues, "id=?", new String[]{ld.LD()});
        } else {
            com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().LD().Lxb("template_diff_new", contentValues);
        }
        synchronized (this.ZU) {
            this.ebl.put(ld.LD(), ld);
        }
        this.lk.add(ld.LD());
        if (z) {
            return;
        }
        try {
            if (com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lc() == null) {
                return;
            }
            if (this.JXs == null) {
                this.JXs = new ConcurrentHashMap<>();
            }
            com.bytedance.sdk.component.adexpress.Lxb.lk.lk lkVar = new com.bytedance.sdk.component.adexpress.Lxb.lk.lk(ld.Lxb(), ld.LD(), ld.lk());
            this.JXs.put(ld.LD(), lkVar);
            if (string != null) {
                com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lc();
                lkVar.LD();
            }
            com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lc();
            ld.Lxb();
        } catch (Throwable unused2) {
        }
    }

    public void Lxb(Set<String> set) {
        if (set == null || set.isEmpty() || com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().LD() == null) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                ZU(strArr[i]);
                com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().LD().Lxb("template_diff_new", "id=?", new String[]{strArr[i]});
                lk(strArr[i]);
            }
        }
    }
}
