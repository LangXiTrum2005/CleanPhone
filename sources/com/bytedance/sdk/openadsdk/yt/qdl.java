package com.bytedance.sdk.openadsdk.yt;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.bytedance.sdk.openadsdk.BusMonitorDependWrapper;
import com.smartdigimkt.b0.a;
import com.thinkup.core.common.oo.o;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    private static Context mzz;
    private com.bytedance.sdk.openadsdk.yt.lnr.qdl lnr;
    private Boolean mml;
    private ud ud;
    private static final long mo = System.currentTimeMillis();
    public static final long qdl = com.bytedance.sdk.openadsdk.yt.mml.qdl.qdl();
    private int wd = 0;
    private final ArrayList<mml> jpc = new ArrayList<>();
    private Runnable tvp = new Runnable() { // from class: com.bytedance.sdk.openadsdk.yt.qdl.2
        @Override // java.lang.Runnable
        public void run() {
            qdl qdlVar = qdl.this;
            qdlVar.mml = Boolean.valueOf(qdlVar.ud.isMonitorOpen());
            if (qdl.this.mml.booleanValue()) {
                qdl qdlVar2 = qdl.this;
                qdlVar2.qdl(qdlVar2.jpc);
                qdl.this.jpc.clear();
            }
        }
    };
    private Runnable to = new Runnable() { // from class: com.bytedance.sdk.openadsdk.yt.qdl.4
        @Override // java.lang.Runnable
        public void run() {
            String str;
            String str2 = "extra";
            String str3 = "is_init";
            String str4 = "mediation";
            try {
                SQLiteDatabase sQLiteDatabaseUd = com.bytedance.sdk.openadsdk.yt.qdl.qdl.ud();
                if (sQLiteDatabaseUd != null) {
                    String[] strArr = {"_id", a.s1, "scene", "start_count", "success_count", o.C0684o.o00, "rit", "tag", "label", "timestamp", "mediation", "is_init", "extra"};
                    try {
                        String[] strArr2 = {String.valueOf(qdl.this.ud.getOnceLogInterval() < 86400000 ? qdl.mo : qdl.qdl)};
                        int iMax = Math.max(10, qdl.this.ud.getOnceLogCount());
                        if (iMax > 100) {
                            iMax = 10;
                        }
                        Cursor cursorQuery = sQLiteDatabaseUd.query("monitor_table", strArr, "timestamp < ?", strArr2, null, null, null, String.valueOf(iMax));
                        if (cursorQuery != null) {
                            int i2 = iMax;
                            ArrayList arrayList = new ArrayList();
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                while (cursorQuery.moveToNext()) {
                                    ArrayList arrayList3 = arrayList;
                                    com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                                    if (cursorQuery.getColumnIndex("_id") >= 0) {
                                        long j = cursorQuery.getLong(cursorQuery.getColumnIndex("_id"));
                                        qdlVar.qdl(j);
                                        arrayList2.add(String.valueOf(j));
                                    }
                                    if (cursorQuery.getColumnIndex(a.s1) >= 0) {
                                        qdlVar.qdl(cursorQuery.getString(cursorQuery.getColumnIndex(a.s1)));
                                    }
                                    if (cursorQuery.getColumnIndex("scene") >= 0) {
                                        qdlVar.ud(cursorQuery.getString(cursorQuery.getColumnIndex("scene")));
                                    }
                                    if (cursorQuery.getColumnIndex("start_count") >= 0) {
                                        qdlVar.qdl(cursorQuery.getInt(cursorQuery.getColumnIndex("start_count")));
                                    }
                                    if (cursorQuery.getColumnIndex("success_count") >= 0) {
                                        qdlVar.ud(cursorQuery.getInt(cursorQuery.getColumnIndex("success_count")));
                                    }
                                    if (cursorQuery.getColumnIndex(o.C0684o.o00) >= 0) {
                                        qdlVar.lnr(cursorQuery.getInt(cursorQuery.getColumnIndex(o.C0684o.o00)));
                                    }
                                    if (cursorQuery.getColumnIndex("rit") >= 0) {
                                        qdlVar.lnr(cursorQuery.getString(cursorQuery.getColumnIndex("rit")));
                                    }
                                    if (cursorQuery.getColumnIndex("tag") >= 0) {
                                        qdlVar.mml(cursorQuery.getString(cursorQuery.getColumnIndex("tag")));
                                    }
                                    if (cursorQuery.getColumnIndex("label") >= 0) {
                                        qdlVar.mzz(cursorQuery.getString(cursorQuery.getColumnIndex("label")));
                                    }
                                    if (cursorQuery.getColumnIndex("timestamp") >= 0) {
                                        qdlVar.ud(cursorQuery.getLong(cursorQuery.getColumnIndex("timestamp")));
                                    }
                                    String str5 = str4;
                                    if (cursorQuery.getColumnIndex(str5) >= 0) {
                                        qdlVar.mo(cursorQuery.getString(cursorQuery.getColumnIndex(str5)));
                                    }
                                    str3 = str3;
                                    if (cursorQuery.getColumnIndex(str3) >= 0) {
                                        qdlVar.mml(cursorQuery.getInt(cursorQuery.getColumnIndex(str3)));
                                    }
                                    String str6 = str2;
                                    if (cursorQuery.getColumnIndex(str6) >= 0) {
                                        qdlVar.wd(cursorQuery.getString(cursorQuery.getColumnIndex(str6)));
                                    }
                                    arrayList3.add(qdlVar);
                                    arrayList = arrayList3;
                                    str2 = str6;
                                    str4 = str5;
                                }
                                ArrayList arrayList4 = arrayList;
                                cursorQuery.close();
                                str = "BusMonitorCenter";
                                try {
                                    Log.i(str, "exec upload ...");
                                    if (arrayList4.isEmpty()) {
                                        return;
                                    }
                                    try {
                                        qdl.this.ud.onMonitorUpload(arrayList4);
                                        SQLiteDatabase sQLiteDatabaseQdl = com.bytedance.sdk.openadsdk.yt.qdl.qdl.qdl();
                                        if (sQLiteDatabaseQdl != null && sQLiteDatabaseQdl.isOpen()) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("_id IN (");
                                            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                                                sb.append("?");
                                                if (i3 < arrayList2.size() - 1) {
                                                    sb.append(",");
                                                }
                                            }
                                            sb.append(")");
                                            sQLiteDatabaseQdl.delete("monitor_table", sb.toString(), (String[]) arrayList2.toArray(new String[0]));
                                            if (qdl.this.lnr != null) {
                                                qdl.this.lnr.qdl(qdl.mo);
                                            }
                                        }
                                        if (arrayList4.size() < i2 || qdl.this.wd > 1000) {
                                            return;
                                        }
                                        qdl.this.qdl(false);
                                    } catch (Throwable th) {
                                        th = th;
                                        Log.e(str, th.getMessage());
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                str = "BusMonitorCenter";
                                Log.e(str, th.getMessage());
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                str = "BusMonitorCenter";
            }
        }
    };

    private qdl(ud udVar) {
        try {
            this.ud = new BusMonitorDependWrapper(udVar);
            this.lnr = new com.bytedance.sdk.openadsdk.yt.lnr.qdl(udVar.getContext());
            mzz = udVar.getContext();
        } catch (Throwable th) {
            Log.e("BusMonitorCenter", th.getMessage());
        }
    }

    public static /* synthetic */ int mml(qdl qdlVar) {
        int i2 = qdlVar.wd;
        qdlVar.wd = i2 + 1;
        return i2;
    }

    private boolean lnr() {
        if (this.mml == null) {
            ud udVar = this.ud;
            return (udVar == null || udVar.getContext() == null || this.ud.getHandler() == null) ? false : true;
        }
        ud udVar2 = this.ud;
        return (udVar2 == null || udVar2.getContext() == null || !this.ud.isMonitorOpen() || this.ud.getHandler() == null) ? false : true;
    }

    public static qdl qdl(ud udVar) {
        return new qdl(udVar);
    }

    public static Context qdl() {
        Context context = mzz;
        return context != null ? context : BusMonitorDependWrapper.getReflectContext();
    }

    public void qdl(final mml mmlVar) {
        if (mmlVar == null || !lnr()) {
            return;
        }
        this.ud.getHandler().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yt.qdl.1
            @Override // java.lang.Runnable
            public void run() {
                qdl qdlVar = qdl.this;
                qdlVar.mml = Boolean.valueOf(qdlVar.ud.isMonitorOpen());
                if (qdl.this.mml.booleanValue()) {
                    qdl.this.jpc.add(mmlVar);
                    if (qdl.this.jpc.size() >= 10) {
                        qdl qdlVar2 = qdl.this;
                        qdlVar2.qdl(qdlVar2.jpc);
                        qdl.this.jpc.clear();
                    }
                }
            }
        });
        this.ud.getHandler().removeCallbacks(this.tvp);
        this.ud.getHandler().postDelayed(this.tvp, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(List<mml> list) {
        com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVarGeneratorModel;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            if (list != null) {
                try {
                    if (!list.isEmpty()) {
                        SQLiteDatabase sQLiteDatabaseQdl = com.bytedance.sdk.openadsdk.yt.qdl.qdl.qdl();
                        if (sQLiteDatabaseQdl != null) {
                            try {
                                sQLiteDatabaseQdl.beginTransaction();
                                for (int i2 = 0; i2 < list.size(); i2++) {
                                    mml mmlVar = list.get(i2);
                                    if (mmlVar != null && (qdlVarGeneratorModel = mmlVar.generatorModel()) != null) {
                                        Cursor cursorQuery = sQLiteDatabaseQdl.query("monitor_table", new String[]{"_id", a.s1, "scene", "start_count", "success_count", o.C0684o.o00, "rit", "tag", "label", "timestamp", "mediation", "is_init", "extra"}, new StringBuilder("sdk_version = ? AND scene = ? AND rit = ? AND tag = ? AND label = ? AND mediation = ? AND is_init = ? AND timestamp = ? AND extra = ?").toString(), new String[]{qdlVarGeneratorModel.ud(), qdlVarGeneratorModel.lnr(), qdlVarGeneratorModel.wd(), qdlVarGeneratorModel.jpc(), qdlVarGeneratorModel.tvp(), qdlVarGeneratorModel.rq(), String.valueOf(qdlVarGeneratorModel.fs()), String.valueOf(qdlVarGeneratorModel.to()), qdlVarGeneratorModel.exu()}, null, null, null);
                                        if (cursorQuery != null) {
                                            if (cursorQuery.moveToNext()) {
                                                int columnIndex = cursorQuery.getColumnIndex("_id");
                                                if (columnIndex >= 0) {
                                                    qdlVarGeneratorModel.qdl(cursorQuery.getLong(columnIndex));
                                                }
                                                int columnIndex2 = cursorQuery.getColumnIndex("start_count");
                                                if (columnIndex2 >= 0) {
                                                    qdlVarGeneratorModel.qdl(cursorQuery.getInt(columnIndex2) + qdlVarGeneratorModel.mml());
                                                }
                                                int columnIndex3 = cursorQuery.getColumnIndex("success_count");
                                                if (columnIndex3 >= 0) {
                                                    qdlVarGeneratorModel.ud(cursorQuery.getInt(columnIndex3) + qdlVarGeneratorModel.mzz());
                                                }
                                                int columnIndex4 = cursorQuery.getColumnIndex(o.C0684o.o00);
                                                if (columnIndex4 >= 0) {
                                                    qdlVarGeneratorModel.lnr(cursorQuery.getInt(columnIndex4) + qdlVarGeneratorModel.mo());
                                                }
                                            }
                                            cursorQuery.close();
                                        }
                                        ContentValues contentValues = new ContentValues();
                                        if (qdlVarGeneratorModel.qdl() > 0) {
                                            contentValues.put("_id", Long.valueOf(qdlVarGeneratorModel.qdl()));
                                        }
                                        contentValues.put(a.s1, qdlVarGeneratorModel.ud());
                                        contentValues.put("scene", qdlVarGeneratorModel.lnr());
                                        contentValues.put("start_count", Integer.valueOf(qdlVarGeneratorModel.mml()));
                                        contentValues.put("success_count", Integer.valueOf(qdlVarGeneratorModel.mzz()));
                                        contentValues.put(o.C0684o.o00, Integer.valueOf(qdlVarGeneratorModel.mo()));
                                        contentValues.put("rit", qdlVarGeneratorModel.wd());
                                        contentValues.put("tag", qdlVarGeneratorModel.jpc());
                                        contentValues.put("label", qdlVarGeneratorModel.tvp());
                                        contentValues.put("timestamp", Long.valueOf(qdlVarGeneratorModel.to()));
                                        contentValues.put("mediation", qdlVarGeneratorModel.rq());
                                        contentValues.put("is_init", Integer.valueOf(qdlVarGeneratorModel.fs()));
                                        contentValues.put("extra", qdlVarGeneratorModel.exu());
                                        sQLiteDatabaseQdl.insertWithOnConflict("monitor_table", null, contentValues, 5);
                                    }
                                }
                                Log.i("BusMonitorCenter", "exec save size = " + list.size());
                                sQLiteDatabaseQdl.setTransactionSuccessful();
                            } catch (Throwable th) {
                                th = th;
                                sQLiteDatabase = sQLiteDatabaseQdl;
                                try {
                                    Log.e("BusMonitorCenter", th.getMessage());
                                    if (sQLiteDatabase == null) {
                                        return;
                                    } else {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th2) {
                                    if (sQLiteDatabase != null) {
                                        try {
                                            sQLiteDatabase.endTransaction();
                                            throw th2;
                                        } catch (Throwable th3) {
                                            Log.e("BusMonitorCenter", th3.getMessage());
                                            throw th2;
                                        }
                                    }
                                    throw th2;
                                }
                            }
                        }
                        sQLiteDatabase = sQLiteDatabaseQdl;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            if (sQLiteDatabase != null) {
                sQLiteDatabase.endTransaction();
            }
        } catch (Throwable th5) {
            Log.e("BusMonitorCenter", th5.getMessage());
        }
    }

    public void qdl(final boolean z2) {
        ud udVar = this.ud;
        if (udVar == null || udVar.getHandler() == null || this.ud.getContext() == null || this.lnr == null || !this.ud.isMonitorOpen()) {
            return;
        }
        this.ud.getHandler().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yt.qdl.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    qdl.mml(qdl.this);
                    if (z2) {
                        long jQdl = qdl.this.lnr.qdl();
                        if (jQdl == 0) {
                            qdl.this.lnr.qdl(System.currentTimeMillis());
                            return;
                        } else if (com.bytedance.sdk.openadsdk.yt.mml.qdl.qdl(jQdl) && System.currentTimeMillis() - jQdl < qdl.this.ud.getUploadIntervalTime()) {
                            return;
                        }
                    }
                    if (qdl.this.ud.getHandler() != null) {
                        qdl.this.ud.getHandler().post(qdl.this.to);
                    }
                } catch (Throwable th) {
                    Log.e("BusMonitorCenter", th.getMessage());
                }
            }
        }, Math.max(this.ud.getOnceLogInterval(), 10000));
    }
}
