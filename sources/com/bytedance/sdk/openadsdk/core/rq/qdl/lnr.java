package com.bytedance.sdk.openadsdk.core.rq.qdl;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.yt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class lnr {
    public static int qdl = 20;
    private static volatile lnr ud;
    private final Object lnr = new Object();
    private final LruCache<String, qdl> mml = new LruCache<String, qdl>(qdl) { // from class: com.bytedance.sdk.openadsdk.core.rq.qdl.lnr.1
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, qdl qdlVar) {
            return 1;
        }
    };

    private lnr() {
    }

    public static String lnr() {
        return "CREATE TABLE IF NOT EXISTS ugen_template (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , rit TEXT , update_time TEXT)";
    }

    public static String mml() {
        return "ALTER TABLE ugen_template ADD COLUMN rit TEXT ";
    }

    public static lnr qdl() {
        if (ud == null) {
            synchronized (lnr.class) {
                try {
                    if (ud == null) {
                        ud = new lnr();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ud;
    }

    public List<qdl> ud() {
        ArrayList arrayList = new ArrayList();
        com.bytedance.sdk.openadsdk.multipro.aidl.lnr lnrVar = new com.bytedance.sdk.openadsdk.multipro.aidl.lnr(com.bytedance.sdk.openadsdk.multipro.qdl.qdl.qdl(yt.qdl(), "ugen_template", null, null, null, null, null, null));
        try {
            if (lnrVar.moveToFirst()) {
                do {
                    int columnIndex = lnrVar.getColumnIndex("id");
                    int columnIndex2 = lnrVar.getColumnIndex("md5");
                    int columnIndex3 = lnrVar.getColumnIndex("url");
                    int columnIndex4 = lnrVar.getColumnIndex("data");
                    int columnIndex5 = lnrVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = lnrVar.getColumnIndex("rit");
                        String string = columnIndex6 != -1 ? lnrVar.getString(columnIndex6) : null;
                        String string2 = lnrVar.getString(columnIndex);
                        String string3 = lnrVar.getString(columnIndex2);
                        String string4 = lnrVar.getString(columnIndex3);
                        qdl qdlVarQdl = new qdl().qdl(string2).ud(string3).lnr(string4).mml(lnrVar.getString(columnIndex4)).mzz(string).qdl(Long.valueOf(lnrVar.getLong(columnIndex5)));
                        arrayList.add(qdlVarQdl);
                        synchronized (this.lnr) {
                            this.mml.put(string2, qdlVarQdl);
                        }
                    }
                } while (lnrVar.moveToNext());
            }
            lnrVar.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                aaj.qdl("UGTmplDbHelper", "getUgenTemplate error", th);
                return arrayList;
            } finally {
                lnrVar.close();
            }
        }
    }

    public qdl qdl(String str, String str2) {
        qdl qdlVar;
        qdl qdlVarQdl;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.lnr) {
            qdlVar = this.mml.get(str);
        }
        if (qdlVar != null) {
            if (TextUtils.equals(str2, qdlVar.ud())) {
                return qdlVar;
            }
            ud(str2);
            return null;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.lnr lnrVar = new com.bytedance.sdk.openadsdk.multipro.aidl.lnr(com.bytedance.sdk.openadsdk.multipro.qdl.qdl.qdl(yt.qdl(), "ugen_template", null, "id=? AND md5=?", new String[]{str, str2}, null, null, null));
        try {
            if (lnrVar.moveToFirst()) {
                do {
                    int columnIndex = lnrVar.getColumnIndex("id");
                    int columnIndex2 = lnrVar.getColumnIndex("md5");
                    int columnIndex3 = lnrVar.getColumnIndex("url");
                    int columnIndex4 = lnrVar.getColumnIndex("data");
                    int columnIndex5 = lnrVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = lnrVar.getColumnIndex("rit");
                        String string = lnrVar.getString(columnIndex);
                        String string2 = lnrVar.getString(columnIndex2);
                        String string3 = lnrVar.getString(columnIndex3);
                        String string4 = lnrVar.getString(columnIndex4);
                        if (TextUtils.isEmpty(string4)) {
                            lnrVar.close();
                            return null;
                        }
                        qdlVarQdl = new qdl().qdl(string).ud(string2).mml(string4).lnr(string3).mzz(columnIndex6 != -1 ? lnrVar.getString(columnIndex6) : null).qdl(Long.valueOf(lnrVar.getLong(columnIndex5)));
                        synchronized (this.lnr) {
                            this.mml.put(string, qdlVarQdl);
                        }
                    }
                    lnrVar.close();
                    return null;
                } while (lnrVar.moveToNext());
                lnrVar.close();
                return qdlVarQdl;
            }
        } catch (Throwable th) {
            try {
                aaj.qdl("UGTmplDbHelper", "getGgenTemplate error", th);
            } finally {
                lnrVar.close();
            }
        }
        return null;
    }

    private void ud(String str) {
        if (!TextUtils.isEmpty(str) && this.mml.size() > 0) {
            synchronized (this.lnr) {
                this.mml.remove(str);
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
    public void qdl(com.bytedance.sdk.openadsdk.core.rq.qdl.qdl r10) {
        /*
            r9 = this;
            if (r10 != 0) goto L4
            goto La5
        L4:
            java.lang.String r0 = r10.qdl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            goto La5
        L10:
            com.bytedance.sdk.openadsdk.multipro.aidl.lnr r0 = new com.bytedance.sdk.openadsdk.multipro.aidl.lnr
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.yt.qdl()
            java.lang.String r2 = "ugen_template"
            java.lang.String r4 = "id=?"
            java.lang.String r3 = r10.qdl()
            java.lang.String[] r5 = new java.lang.String[]{r3}
            r7 = 0
            r8 = 0
            r3 = 0
            r6 = 0
            java.util.Map r1 = com.bytedance.sdk.openadsdk.multipro.qdl.qdl.qdl(r1, r2, r3, r4, r5, r6, r7, r8)
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
            java.lang.String r3 = r10.qdl()     // Catch: java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "md5"
            java.lang.String r3 = r10.ud()     // Catch: java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "url"
            java.lang.String r3 = r10.lnr()     // Catch: java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "data"
            java.lang.String r3 = r10.mzz()     // Catch: java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "rit"
            java.lang.String r3 = r10.mo()     // Catch: java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "update_time"
            java.lang.Long r3 = r10.mml()     // Catch: java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> La5
            if (r1 == 0) goto L8a
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.yt.qdl()     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "ugen_template"
            java.lang.String r3 = "id=?"
            java.lang.String r4 = r10.qdl()     // Catch: java.lang.Throwable -> La5
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> La5
            com.bytedance.sdk.openadsdk.multipro.qdl.qdl.qdl(r1, r2, r0, r3, r4)     // Catch: java.lang.Throwable -> La5
            goto L93
        L8a:
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.yt.qdl()     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "ugen_template"
            com.bytedance.sdk.openadsdk.multipro.qdl.qdl.qdl(r1, r2, r0)     // Catch: java.lang.Throwable -> La5
        L93:
            java.lang.Object r1 = r9.lnr     // Catch: java.lang.Throwable -> La5
            monitor-enter(r1)     // Catch: java.lang.Throwable -> La5
            android.util.LruCache<java.lang.String, com.bytedance.sdk.openadsdk.core.rq.qdl.qdl> r0 = r9.mml     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = r10.qdl()     // Catch: java.lang.Throwable -> La1
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.rq.qdl.lnr.qdl(com.bytedance.sdk.openadsdk.core.rq.qdl.qdl):void");
    }

    public Set<qdl> qdl(String str) {
        qdl qdlVar;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        com.bytedance.sdk.openadsdk.multipro.aidl.lnr lnrVar = new com.bytedance.sdk.openadsdk.multipro.aidl.lnr(com.bytedance.sdk.openadsdk.multipro.qdl.qdl.qdl(yt.qdl(), "ugen_template", null, "rit=?", new String[]{str}, null, null, null));
        try {
            if (lnrVar.moveToFirst()) {
                do {
                    int columnIndex = lnrVar.getColumnIndex("id");
                    if (columnIndex != -1) {
                        String string = lnrVar.getString(columnIndex);
                        if (!TextUtils.isEmpty(string)) {
                            synchronized (this.lnr) {
                                qdlVar = this.mml.get(string);
                            }
                            if (qdlVar != null) {
                                hashSet.add(qdlVar);
                            } else {
                                qdl qdlVar2 = new qdl();
                                int columnIndex2 = lnrVar.getColumnIndex("data");
                                if (columnIndex2 != -1) {
                                    String string2 = lnrVar.getString(columnIndex2);
                                    if (!TextUtils.isEmpty(string2)) {
                                        qdlVar2.mml(string2);
                                        qdlVar2.qdl(string);
                                        qdlVar2.mzz(str);
                                        int columnIndex3 = lnrVar.getColumnIndex("md5");
                                        int columnIndex4 = lnrVar.getColumnIndex("url");
                                        int columnIndex5 = lnrVar.getColumnIndex("update_time");
                                        if (columnIndex3 != -1) {
                                            qdlVar2.ud(lnrVar.getString(columnIndex3));
                                        }
                                        if (columnIndex4 != -1) {
                                            qdlVar2.lnr(lnrVar.getString(columnIndex4));
                                        }
                                        if (columnIndex5 != -1) {
                                            qdlVar2.qdl(Long.valueOf(lnrVar.getLong(columnIndex5)));
                                        }
                                        hashSet.add(qdlVar2);
                                        synchronized (this.lnr) {
                                            this.mml.put(string, qdlVar2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } while (lnrVar.moveToNext());
            }
            lnrVar.close();
            return hashSet;
        } catch (Throwable th) {
            try {
                aaj.qdl("UGTmplDbHelper", "getUgenTemplateFormRit error", th);
                return hashSet;
            } finally {
                lnrVar.close();
            }
        }
    }

    public void qdl(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (String str : strArr) {
                ud(str);
                com.bytedance.sdk.openadsdk.multipro.qdl.qdl.qdl(yt.qdl(), "ugen_template", "id=?", new String[]{str});
            }
        }
    }
}
