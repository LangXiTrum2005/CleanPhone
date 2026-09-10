package com.bytedance.sdk.openadsdk.core.co.ri;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.core.nr;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private static volatile ik lr = null;
    public static int ri = 20;
    private final Object ik = new Object();
    private final LruCache<String, ri> ka = new LruCache<String, ri>(ri) { // from class: com.bytedance.sdk.openadsdk.core.co.ri.ik.1
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, ri riVar) {
            return 1;
        }
    };

    private ik() {
    }

    public static String ik() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS ugen_template (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , rit TEXT , update_time TEXT)").toString();
    }

    public static String ka() {
        return "ALTER TABLE ugen_template ADD COLUMN rit TEXT ";
    }

    public static ik ri() {
        if (lr == null) {
            synchronized (ik.class) {
                try {
                    if (lr == null) {
                        lr = new ik();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lr;
    }

    public List<ri> lr() {
        ArrayList arrayList = new ArrayList();
        com.bytedance.sdk.openadsdk.tan.ri.ri riVar = new com.bytedance.sdk.openadsdk.tan.ri.ri(com.bytedance.sdk.openadsdk.tan.lr.ri.ri(nr.ri(), "ugen_template", null, null, null, null, null, null));
        try {
            if (riVar.moveToFirst()) {
                do {
                    int columnIndex = riVar.getColumnIndex("id");
                    int columnIndex2 = riVar.getColumnIndex("md5");
                    int columnIndex3 = riVar.getColumnIndex("url");
                    int columnIndex4 = riVar.getColumnIndex("data");
                    int columnIndex5 = riVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = riVar.getColumnIndex("rit");
                        String string = columnIndex6 != -1 ? riVar.getString(columnIndex6) : null;
                        String string2 = riVar.getString(columnIndex);
                        String string3 = riVar.getString(columnIndex2);
                        String string4 = riVar.getString(columnIndex3);
                        ri riVarRi = new ri().ri(string2).lr(string3).ik(string4).ka(riVar.getString(columnIndex4)).fi(string).ri(Long.valueOf(riVar.getLong(columnIndex5)));
                        arrayList.add(riVarRi);
                        synchronized (this.ik) {
                            this.ka.put(string2, riVarRi);
                        }
                    }
                } while (riVar.moveToNext());
            }
            riVar.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                ac.ri("UGTmplDbHelper", "getUgenTemplate error", th);
                return arrayList;
            } finally {
                riVar.close();
            }
        }
    }

    public ri ri(String str, String str2) {
        ri riVar;
        ri riVarRi;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.ik) {
            riVar = this.ka.get(str);
        }
        if (riVar != null) {
            if (TextUtils.equals(str2, riVar.lr())) {
                return riVar;
            }
            lr(str2);
            return null;
        }
        com.bytedance.sdk.openadsdk.tan.ri.ri riVar2 = new com.bytedance.sdk.openadsdk.tan.ri.ri(com.bytedance.sdk.openadsdk.tan.lr.ri.ri(nr.ri(), "ugen_template", null, "id=? AND md5=?", new String[]{str, str2}, null, null, null));
        try {
            if (riVar2.moveToFirst()) {
                do {
                    int columnIndex = riVar2.getColumnIndex("id");
                    int columnIndex2 = riVar2.getColumnIndex("md5");
                    int columnIndex3 = riVar2.getColumnIndex("url");
                    int columnIndex4 = riVar2.getColumnIndex("data");
                    int columnIndex5 = riVar2.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = riVar2.getColumnIndex("rit");
                        String string = riVar2.getString(columnIndex);
                        String string2 = riVar2.getString(columnIndex2);
                        String string3 = riVar2.getString(columnIndex3);
                        String string4 = riVar2.getString(columnIndex4);
                        if (TextUtils.isEmpty(string4)) {
                            riVar2.close();
                            return null;
                        }
                        riVarRi = new ri().ri(string).lr(string2).ka(string4).ik(string3).fi(columnIndex6 != -1 ? riVar2.getString(columnIndex6) : null).ri(Long.valueOf(riVar2.getLong(columnIndex5)));
                        synchronized (this.ik) {
                            this.ka.put(string, riVarRi);
                        }
                    }
                    riVar2.close();
                    return null;
                } while (riVar2.moveToNext());
                riVar2.close();
                return riVarRi;
            }
        } catch (Throwable th) {
            try {
                ac.ri("UGTmplDbHelper", "getGgenTemplate error", th);
            } finally {
                riVar2.close();
            }
        }
        return null;
    }

    private void lr(String str) {
        if (!TextUtils.isEmpty(str) && this.ka.size() > 0) {
            synchronized (this.ik) {
                this.ka.remove(str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ri(com.bytedance.sdk.openadsdk.core.co.ri.ri r10) {
        /*
            r9 = this;
            if (r10 != 0) goto L4
            goto La5
        L4:
            java.lang.String r0 = r10.ri()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            goto La5
        L10:
            com.bytedance.sdk.openadsdk.tan.ri.ri r0 = new com.bytedance.sdk.openadsdk.tan.ri.ri
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.nr.ri()
            java.lang.String r2 = "ugen_template"
            java.lang.String r4 = "id=?"
            java.lang.String r3 = r10.ri()
            java.lang.String[] r5 = new java.lang.String[]{r3}
            r7 = 0
            r8 = 0
            r3 = 0
            r6 = 0
            java.util.Map r1 = com.bytedance.sdk.openadsdk.tan.lr.ri.ri(r1, r2, r3, r4, r5, r6, r7, r8)
            r0.<init>(r1)
            int r1 = r0.getCount()
            if (r1 <= 0) goto L35
            r1 = 1
            goto L36
        L35:
            r1 = 0
        L36:
            r0.close()     // Catch: java.lang.Throwable -> La5
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Throwable -> La5
            r0.<init>()     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "id"
            java.lang.String r3 = r10.ri()     // Catch: java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "md5"
            java.lang.String r3 = r10.lr()     // Catch: java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "url"
            java.lang.String r3 = r10.ik()     // Catch: java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "data"
            java.lang.String r3 = r10.fi()     // Catch: java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "rit"
            java.lang.String r3 = r10.di()     // Catch: java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "update_time"
            java.lang.Long r3 = r10.ka()     // Catch: java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> La5
            if (r1 == 0) goto L8a
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.nr.ri()     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "ugen_template"
            java.lang.String r3 = "id=?"
            java.lang.String r4 = r10.ri()     // Catch: java.lang.Throwable -> La5
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> La5
            com.bytedance.sdk.openadsdk.tan.lr.ri.ri(r1, r2, r0, r3, r4)     // Catch: java.lang.Throwable -> La5
            goto L93
        L8a:
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.nr.ri()     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "ugen_template"
            com.bytedance.sdk.openadsdk.tan.lr.ri.ri(r1, r2, r0)     // Catch: java.lang.Throwable -> La5
        L93:
            java.lang.Object r1 = r9.ik     // Catch: java.lang.Throwable -> La5
            monitor-enter(r1)     // Catch: java.lang.Throwable -> La5
            android.util.LruCache<java.lang.String, com.bytedance.sdk.openadsdk.core.co.ri.ri> r0 = r9.ka     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = r10.ri()     // Catch: java.lang.Throwable -> La1
            r0.put(r2, r10)     // Catch: java.lang.Throwable -> La1
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La1
            return
        La1:
            r0 = move-exception
            r10 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La5
            throw r10     // Catch: java.lang.Throwable -> La5
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.co.ri.ik.ri(com.bytedance.sdk.openadsdk.core.co.ri.ri):void");
    }

    public Set<ri> ri(String str) {
        ri riVar;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        com.bytedance.sdk.openadsdk.tan.ri.ri riVar2 = new com.bytedance.sdk.openadsdk.tan.ri.ri(com.bytedance.sdk.openadsdk.tan.lr.ri.ri(nr.ri(), "ugen_template", null, "rit=?", new String[]{str}, null, null, null));
        try {
            if (riVar2.moveToFirst()) {
                do {
                    int columnIndex = riVar2.getColumnIndex("id");
                    if (columnIndex != -1) {
                        String string = riVar2.getString(columnIndex);
                        if (!TextUtils.isEmpty(string)) {
                            synchronized (this.ik) {
                                riVar = this.ka.get(string);
                            }
                            if (riVar != null) {
                                hashSet.add(riVar);
                            } else {
                                ri riVar3 = new ri();
                                int columnIndex2 = riVar2.getColumnIndex("data");
                                if (columnIndex2 != -1) {
                                    String string2 = riVar2.getString(columnIndex2);
                                    if (!TextUtils.isEmpty(string2)) {
                                        riVar3.ka(string2);
                                        riVar3.ri(string);
                                        riVar3.fi(str);
                                        int columnIndex3 = riVar2.getColumnIndex("md5");
                                        int columnIndex4 = riVar2.getColumnIndex("url");
                                        int columnIndex5 = riVar2.getColumnIndex("update_time");
                                        if (columnIndex3 != -1) {
                                            riVar3.lr(riVar2.getString(columnIndex3));
                                        }
                                        if (columnIndex4 != -1) {
                                            riVar3.ik(riVar2.getString(columnIndex4));
                                        }
                                        if (columnIndex5 != -1) {
                                            riVar3.ri(Long.valueOf(riVar2.getLong(columnIndex5)));
                                        }
                                        hashSet.add(riVar3);
                                        synchronized (this.ik) {
                                            this.ka.put(string, riVar3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } while (riVar2.moveToNext());
            }
            riVar2.close();
            return hashSet;
        } catch (Throwable th) {
            try {
                ac.ri("UGTmplDbHelper", "getUgenTemplateFormRit error", th);
                return hashSet;
            } finally {
                riVar2.close();
            }
        }
    }

    public void ri(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (String str : strArr) {
                lr(str);
                com.bytedance.sdk.openadsdk.tan.lr.ri.ri(nr.ri(), "ugen_template", "id=?", new String[]{str});
            }
        }
    }
}
