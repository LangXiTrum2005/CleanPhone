package com.bytedance.sdk.openadsdk.VVE;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.sdk.openadsdk.BusMonitorDependWrapper;
import com.umeng.analytics.pro.bg;
import com.umeng.ccg.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private static final long JXs = System.currentTimeMillis();
    private static Context ZU;
    private com.bytedance.sdk.openadsdk.VVE.lk.Lxb LD;
    private LD Lxb;
    private Boolean lk;
    private int lc = 0;
    private final ArrayList<ZU> ebl = new ArrayList<>();
    private Runnable OY = new Runnable() { // from class: com.bytedance.sdk.openadsdk.VVE.Lxb.2
        @Override // java.lang.Runnable
        public void run() {
            Lxb lxb = Lxb.this;
            lxb.lk = Boolean.valueOf(lxb.Lxb.isMonitorOpen());
            if (Lxb.this.lk.booleanValue()) {
                Lxb lxb2 = Lxb.this;
                lxb2.Lxb(lxb2.ebl);
                Lxb.this.ebl.clear();
            }
        }
    };
    private Runnable QAg = new Runnable() { // from class: com.bytedance.sdk.openadsdk.VVE.Lxb.4
        @Override // java.lang.Runnable
        public void run() {
            String str = bg.d;
            try {
                SQLiteDatabase sQLiteDatabaseLD = com.bytedance.sdk.openadsdk.VVE.Lxb.Lxb.LD();
                if (sQLiteDatabaseLD == null) {
                    return;
                }
                String[] strArr = {bg.d, "sdk_version", a.j, "start_count", "success_count", "fail_count", "rit", "tag", "label", "timestamp", "mediation", "is_init", "extra"};
                String str2 = "extra";
                String[] strArr2 = {String.valueOf(Lxb.JXs)};
                try {
                    int iMax = Math.max(10, Lxb.this.Lxb.getOnceLogCount());
                    int i = iMax > 100 ? 10 : iMax;
                    int i2 = i;
                    Cursor cursorQuery = sQLiteDatabaseLD.query("monitor_table", strArr, "timestamp <= ?", strArr2, null, null, null, String.valueOf(i));
                    if (cursorQuery != null) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        while (cursorQuery.moveToNext()) {
                            com.bytedance.sdk.openadsdk.VVE.LD.Lxb lxb = new com.bytedance.sdk.openadsdk.VVE.LD.Lxb();
                            if (cursorQuery.getColumnIndex(str) >= 0) {
                                long j = cursorQuery.getLong(cursorQuery.getColumnIndex(str));
                                lxb.Lxb(j);
                                arrayList2.add(String.valueOf(j));
                            }
                            if (cursorQuery.getColumnIndex("sdk_version") >= 0) {
                                lxb.Lxb(cursorQuery.getString(cursorQuery.getColumnIndex("sdk_version")));
                            }
                            if (cursorQuery.getColumnIndex(a.j) >= 0) {
                                lxb.LD(cursorQuery.getString(cursorQuery.getColumnIndex(a.j)));
                            }
                            if (cursorQuery.getColumnIndex("start_count") >= 0) {
                                lxb.Lxb(cursorQuery.getInt(cursorQuery.getColumnIndex("start_count")));
                            }
                            if (cursorQuery.getColumnIndex("success_count") >= 0) {
                                lxb.LD(cursorQuery.getInt(cursorQuery.getColumnIndex("success_count")));
                            }
                            if (cursorQuery.getColumnIndex("fail_count") >= 0) {
                                lxb.lk(cursorQuery.getInt(cursorQuery.getColumnIndex("fail_count")));
                            }
                            if (cursorQuery.getColumnIndex("rit") >= 0) {
                                lxb.lk(cursorQuery.getString(cursorQuery.getColumnIndex("rit")));
                            }
                            if (cursorQuery.getColumnIndex("tag") >= 0) {
                                lxb.ZU(cursorQuery.getString(cursorQuery.getColumnIndex("tag")));
                            }
                            if (cursorQuery.getColumnIndex("label") >= 0) {
                                lxb.JXs(cursorQuery.getString(cursorQuery.getColumnIndex("label")));
                            }
                            if (cursorQuery.getColumnIndex("mediation") >= 0) {
                                lxb.lc(cursorQuery.getString(cursorQuery.getColumnIndex("mediation")));
                            }
                            if (cursorQuery.getColumnIndex("is_init") >= 0) {
                                lxb.ZU(cursorQuery.getInt(cursorQuery.getColumnIndex("is_init")));
                            }
                            String str3 = str2;
                            if (cursorQuery.getColumnIndex(str3) >= 0) {
                                lxb.ebl(cursorQuery.getString(cursorQuery.getColumnIndex(str3)));
                            }
                            ArrayList arrayList3 = arrayList;
                            arrayList3.add(lxb);
                            str2 = str3;
                            arrayList = arrayList3;
                            str = str;
                        }
                        ArrayList arrayList4 = arrayList;
                        cursorQuery.close();
                        if (!arrayList4.isEmpty()) {
                            Lxb.this.Lxb.onMonitorUpload(arrayList4);
                            SQLiteDatabase sQLiteDatabaseLxb = com.bytedance.sdk.openadsdk.VVE.Lxb.Lxb.Lxb();
                            if (sQLiteDatabaseLxb != null && sQLiteDatabaseLxb.isOpen()) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("_id IN (");
                                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                                    sb.append("?");
                                    if (i3 < arrayList2.size() - 1) {
                                        sb.append(",");
                                    }
                                }
                                sb.append(")");
                                sQLiteDatabaseLxb.delete("monitor_table", sb.toString(), (String[]) arrayList2.toArray(new String[0]));
                                if (Lxb.this.LD != null) {
                                    Lxb.this.LD.Lxb(Lxb.JXs);
                                }
                            }
                            if (arrayList4.size() < i2 || Lxb.this.lc > 1000) {
                                return;
                            }
                            Lxb.this.Lxb(false);
                            return;
                        }
                    }
                    return;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            th.getMessage();
        }
    };

    private Lxb(LD ld) {
        try {
            this.Lxb = new BusMonitorDependWrapper(ld);
            this.LD = new com.bytedance.sdk.openadsdk.VVE.lk.Lxb(ld.getContext());
            ZU = ld.getContext();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static /* synthetic */ int ZU(Lxb lxb) {
        int i = lxb.lc;
        lxb.lc = i + 1;
        return i;
    }

    private boolean lk() {
        if (this.lk == null) {
            LD ld = this.Lxb;
            if (ld == null || ld.getContext() == null || this.Lxb.getHandler() == null) {
                return false;
            }
        } else {
            LD ld2 = this.Lxb;
            if (ld2 == null || ld2.getContext() == null || !this.Lxb.isMonitorOpen() || this.Lxb.getHandler() == null) {
                return false;
            }
        }
        return true;
    }

    public static Lxb Lxb(LD ld) {
        return new Lxb(ld);
    }

    public static Context Lxb() {
        Context context = ZU;
        return context != null ? context : BusMonitorDependWrapper.getReflectContext();
    }

    public void Lxb(final ZU zu) {
        if (zu == null || !lk()) {
            return;
        }
        this.Lxb.getHandler().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.VVE.Lxb.1
            @Override // java.lang.Runnable
            public void run() {
                Lxb lxb = Lxb.this;
                lxb.lk = Boolean.valueOf(lxb.Lxb.isMonitorOpen());
                if (Lxb.this.lk.booleanValue()) {
                    Lxb.this.ebl.add(zu);
                    if (Lxb.this.ebl.size() >= 10) {
                        Lxb lxb2 = Lxb.this;
                        lxb2.Lxb(lxb2.ebl);
                        Lxb.this.ebl.clear();
                    }
                }
            }
        });
        this.Lxb.getHandler().removeCallbacks(this.OY);
        this.Lxb.getHandler().postDelayed(this.OY, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0159  */
    /* JADX WARN: Code duplicated, block: B:94:0x0229 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    public void Lxb(List<ZU> list) {
        SQLiteDatabase sQLiteDatabase;
        String str;
        int i;
        String str2;
        com.bytedance.sdk.openadsdk.VVE.LD.Lxb lxbGeneratorModel;
        List<ZU> list2 = list;
        String str3 = "is_init";
        String str4 = "mediation";
        String str5 = a.j;
        if (list2 == null || list.isEmpty()) {
            return;
        }
        try {
            SQLiteDatabase sQLiteDatabaseLxb = com.bytedance.sdk.openadsdk.VVE.Lxb.Lxb.Lxb();
            if (sQLiteDatabaseLxb != null) {
                try {
                    sQLiteDatabaseLxb.beginTransaction();
                    int i2 = 0;
                    while (i2 < list.size()) {
                        ZU zu = list2.get(i2);
                        if (zu == null || (lxbGeneratorModel = zu.generatorModel()) == null) {
                            str = str5;
                            i = i2;
                            str3 = str3;
                            str2 = str4;
                        } else {
                            String str6 = str5;
                            i = i2;
                            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabaseLxb;
                            try {
                                Cursor cursorQuery = sQLiteDatabaseLxb.query("monitor_table", new String[]{bg.d, "sdk_version", str5, "start_count", "success_count", "fail_count", "rit", "tag", "label", "timestamp", str4, str3, "extra"}, new StringBuilder("sdk_version = ? AND scene = ? AND rit = ? AND tag = ? AND label = ? AND mediation = ? AND is_init = ? AND extra = ?").toString(), new String[]{lxbGeneratorModel.LD(), lxbGeneratorModel.lk(), lxbGeneratorModel.ebl(), lxbGeneratorModel.OY(), lxbGeneratorModel.QAg(), lxbGeneratorModel.JVA(), String.valueOf(lxbGeneratorModel.sLN()), lxbGeneratorModel.NXR()}, null, null, null);
                                if (cursorQuery != null) {
                                    try {
                                        if (cursorQuery.moveToNext()) {
                                            if (cursorQuery.getColumnIndex(bg.d) >= 0) {
                                                lxbGeneratorModel.Lxb(cursorQuery.getLong(cursorQuery.getColumnIndex(bg.d)));
                                            }
                                            if (cursorQuery.getColumnIndex("start_count") >= 0) {
                                                lxbGeneratorModel.Lxb(cursorQuery.getInt(cursorQuery.getColumnIndex("start_count")) + lxbGeneratorModel.ZU());
                                            }
                                            if (cursorQuery.getColumnIndex("success_count") >= 0) {
                                                lxbGeneratorModel.LD(cursorQuery.getInt(cursorQuery.getColumnIndex("success_count")) + lxbGeneratorModel.JXs());
                                            }
                                            if (cursorQuery.getColumnIndex("fail_count") >= 0) {
                                                lxbGeneratorModel.lk(cursorQuery.getInt(cursorQuery.getColumnIndex("fail_count")) + lxbGeneratorModel.lc());
                                            }
                                            if (cursorQuery.getColumnIndex("timestamp") >= 0) {
                                                lxbGeneratorModel.LD(Math.min(cursorQuery.getLong(cursorQuery.getColumnIndex("timestamp")), lxbGeneratorModel.nBu()));
                                            }
                                        }
                                        cursorQuery.close();
                                    } catch (Throwable th) {
                                        th = th;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        try {
                                            th.getMessage();
                                            if (sQLiteDatabase != null) {
                                                try {
                                                    return;
                                                } catch (Throwable th2) {
                                                    return;
                                                }
                                            }
                                            return;
                                        } finally {
                                            if (sQLiteDatabase != null) {
                                                try {
                                                    sQLiteDatabase.endTransaction();
                                                } catch (Throwable th3) {
                                                    th3.getMessage();
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    str3 = str3;
                                    str4 = str4;
                                }
                                ContentValues contentValues = new ContentValues();
                                if (lxbGeneratorModel.Lxb() > 0) {
                                    contentValues.put(bg.d, Long.valueOf(lxbGeneratorModel.Lxb()));
                                }
                                contentValues.put("sdk_version", lxbGeneratorModel.LD());
                                contentValues.put(str6, lxbGeneratorModel.lk());
                                contentValues.put("start_count", Integer.valueOf(lxbGeneratorModel.ZU()));
                                contentValues.put("success_count", Integer.valueOf(lxbGeneratorModel.JXs()));
                                contentValues.put("fail_count", Integer.valueOf(lxbGeneratorModel.lc()));
                                contentValues.put("rit", lxbGeneratorModel.ebl());
                                contentValues.put("tag", lxbGeneratorModel.OY());
                                contentValues.put("label", lxbGeneratorModel.QAg());
                                contentValues.put("timestamp", Long.valueOf(lxbGeneratorModel.nBu()));
                                str2 = str4;
                                contentValues.put(str2, lxbGeneratorModel.JVA());
                                contentValues.put(str3, Integer.valueOf(lxbGeneratorModel.sLN()));
                                contentValues.put("extra", lxbGeneratorModel.NXR());
                                str = str6;
                                sQLiteDatabaseLxb = sQLiteDatabase2;
                                sQLiteDatabaseLxb.insertWithOnConflict("monitor_table", null, contentValues, 5);
                            } catch (Throwable th4) {
                                th = th4;
                                sQLiteDatabaseLxb = sQLiteDatabase2;
                                sQLiteDatabase = sQLiteDatabaseLxb;
                                th.getMessage();
                                if (sQLiteDatabase != null) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                        str3 = str3;
                        str4 = str2;
                        str5 = str;
                        i2 = i + 1;
                        list2 = list;
                    }
                    list.size();
                    sQLiteDatabaseLxb.setTransactionSuccessful();
                } catch (Throwable th5) {
                    th = th5;
                }
            }
            if (sQLiteDatabaseLxb != null) {
                try {
                    sQLiteDatabaseLxb.endTransaction();
                } catch (Throwable th6) {
                    th6.getMessage();
                }
            }
        } catch (Throwable th7) {
            th = th7;
            sQLiteDatabase = null;
        }
    }

    public void Lxb(final boolean z) {
        LD ld = this.Lxb;
        if (ld == null || ld.getHandler() == null || this.Lxb.getContext() == null || this.LD == null || !this.Lxb.isMonitorOpen()) {
            return;
        }
        this.Lxb.getHandler().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.VVE.Lxb.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Lxb.ZU(Lxb.this);
                    if (z) {
                        long jLxb = Lxb.this.LD.Lxb();
                        if (jLxb == 0) {
                            Lxb.this.LD.Lxb(System.currentTimeMillis());
                            return;
                        } else if (Lxb.JXs - jLxb < Lxb.this.Lxb.getUploadIntervalTime()) {
                            return;
                        }
                    }
                    if (Lxb.this.Lxb.getHandler() != null) {
                        Lxb.this.Lxb.getHandler().post(Lxb.this.QAg);
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }, Math.max(this.Lxb.getOnceLogInterval(), 10000));
    }
}
