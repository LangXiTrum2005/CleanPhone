package com.bytedance.sdk.openadsdk.nr;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import com.bytedance.sdk.openadsdk.BusMonitorDependWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private static Context ka;
    private lr di;
    private Boolean mj;
    private com.bytedance.sdk.openadsdk.nr.ik.ri xha;
    public static final long ri = com.bytedance.sdk.openadsdk.nr.ka.ri.ri();
    private static final String[] lr = {"_id", "sdk_version", "scene", "start_count", "success_count", "fail_count", "rit", "tag", "label", "timestamp", "mediation", "is_init", "extra"};
    private static final long ik = System.currentTimeMillis();
    private final ArrayList<ka> fi = new ArrayList<>();
    private final Runnable jbs = new Runnable() { // from class: com.bytedance.sdk.openadsdk.nr.ri.1
        @Override // java.lang.Runnable
        public void run() {
            if (!ri.this.ka() || ri.this.fi.isEmpty()) {
                return;
            }
            ri riVar = ri.this;
            riVar.ri(riVar.fi);
            ri.this.fi.clear();
        }
    };
    private int qt = 0;
    private final Runnable sf = new Runnable() { // from class: com.bytedance.sdk.openadsdk.nr.ri.4
        @Override // java.lang.Runnable
        public void run() {
            int i;
            try {
                SQLiteDatabase sQLiteDatabaseLr = com.bytedance.sdk.openadsdk.nr.ri.ri.lr();
                if (sQLiteDatabaseLr != null) {
                    String[] strArr = {String.valueOf(ri.this.di.getOnceLogInterval() < 86400000 ? ri.ik : ri.ri)};
                    int iMax = Math.max(10, ri.this.di.getOnceLogCount());
                    int i2 = iMax > 100 ? 10 : iMax;
                    Cursor cursorQuery = sQLiteDatabaseLr.query("monitor_table", ri.lr, "timestamp < ?", strArr, null, null, null, String.valueOf(i2));
                    if (cursorQuery != null) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex = cursorQuery.getColumnIndex("_id");
                        int columnIndex2 = cursorQuery.getColumnIndex("sdk_version");
                        int columnIndex3 = cursorQuery.getColumnIndex("scene");
                        int columnIndex4 = cursorQuery.getColumnIndex("start_count");
                        int columnIndex5 = cursorQuery.getColumnIndex("success_count");
                        int columnIndex6 = cursorQuery.getColumnIndex("fail_count");
                        int columnIndex7 = cursorQuery.getColumnIndex("rit");
                        int columnIndex8 = cursorQuery.getColumnIndex("tag");
                        int columnIndex9 = cursorQuery.getColumnIndex("label");
                        int columnIndex10 = cursorQuery.getColumnIndex("timestamp");
                        int columnIndex11 = cursorQuery.getColumnIndex("mediation");
                        int i3 = i2;
                        int columnIndex12 = cursorQuery.getColumnIndex("is_init");
                        try {
                            int columnIndex13 = cursorQuery.getColumnIndex("extra");
                            while (cursorQuery.moveToNext()) {
                                ArrayList arrayList3 = arrayList;
                                com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                                if (columnIndex >= 0) {
                                    long j = cursorQuery.getLong(columnIndex);
                                    riVar.ri(j);
                                    arrayList2.add(String.valueOf(j));
                                }
                                if (columnIndex2 >= 0) {
                                    riVar.ri(cursorQuery.getString(columnIndex2));
                                }
                                if (columnIndex3 >= 0) {
                                    riVar.lr(cursorQuery.getString(columnIndex3));
                                }
                                if (columnIndex4 >= 0) {
                                    riVar.ri(cursorQuery.getInt(columnIndex4));
                                }
                                if (columnIndex5 >= 0) {
                                    riVar.lr(cursorQuery.getInt(columnIndex5));
                                }
                                if (columnIndex6 >= 0) {
                                    riVar.ik(cursorQuery.getInt(columnIndex6));
                                }
                                if (columnIndex7 >= 0) {
                                    riVar.ik(cursorQuery.getString(columnIndex7));
                                }
                                if (columnIndex8 >= 0) {
                                    riVar.ka(cursorQuery.getString(columnIndex8));
                                }
                                if (columnIndex9 >= 0) {
                                    riVar.fi(cursorQuery.getString(columnIndex9));
                                }
                                if (columnIndex10 >= 0) {
                                    riVar.lr(cursorQuery.getLong(columnIndex10));
                                }
                                if (columnIndex11 >= 0) {
                                    columnIndex10 = columnIndex10;
                                    i = columnIndex11;
                                    riVar.di(cursorQuery.getString(i));
                                } else {
                                    columnIndex10 = columnIndex10;
                                    i = columnIndex11;
                                }
                                if (columnIndex12 >= 0) {
                                    columnIndex10 = columnIndex10;
                                    columnIndex10 = columnIndex10;
                                    riVar.ka(cursorQuery.getInt(columnIndex12));
                                }
                                if (columnIndex13 >= 0) {
                                    riVar.xha(cursorQuery.getString(columnIndex13));
                                }
                                arrayList3.add(riVar);
                                columnIndex11 = i;
                                columnIndex = columnIndex;
                                arrayList = arrayList3;
                                columnIndex2 = columnIndex2;
                            }
                            ArrayList arrayList4 = arrayList;
                            cursorQuery.close();
                            if (!arrayList4.isEmpty()) {
                                ri.this.di.onMonitorUpload(arrayList4);
                                SQLiteDatabase sQLiteDatabaseRi = com.bytedance.sdk.openadsdk.nr.ri.ri.ri();
                                if (sQLiteDatabaseRi != null && sQLiteDatabaseRi.isOpen()) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("_id IN (");
                                    for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                        sb.append("?");
                                        if (i4 < arrayList2.size() - 1) {
                                            sb.append(",");
                                        }
                                    }
                                    sb.append(")");
                                    sQLiteDatabaseRi.delete("monitor_table", sb.toString(), (String[]) arrayList2.toArray(new String[0]));
                                    if (ri.this.xha != null) {
                                        ri.this.xha.ri(ri.ik);
                                    }
                                }
                                if (arrayList4.size() < i3 || ri.this.qt > 1000) {
                                    return;
                                }
                                ri.this.ri(false);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    };

    private ri(lr lrVar) {
        try {
            this.di = new BusMonitorDependWrapper(lrVar);
            this.xha = new com.bytedance.sdk.openadsdk.nr.ik.ri(lrVar.getContext());
            ka = lrVar.getContext();
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ int ka(ri riVar) {
        int i = riVar.qt;
        riVar.qt = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ka() {
        if (this.mj == null) {
            lr lrVar = this.di;
            this.mj = Boolean.valueOf((lrVar == null || lrVar.getContext() == null || !this.di.isMonitorOpen() || this.di.getHandler() == null) ? false : true);
        }
        return this.mj.booleanValue();
    }

    public static ri ri(lr lrVar) {
        return new ri(lrVar);
    }

    public static Context ri() {
        Context context = ka;
        return context != null ? context : BusMonitorDependWrapper.getReflectContext();
    }

    public void ri(final ka kaVar) {
        if (kaVar == null || !ka()) {
            return;
        }
        final Handler handler = this.di.getHandler();
        handler.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.nr.ri.2
            @Override // java.lang.Runnable
            public void run() {
                ri.this.fi.add(kaVar);
                if (ri.this.fi.size() >= 10) {
                    handler.removeCallbacks(ri.this.jbs);
                    ri riVar = ri.this;
                    riVar.ri(riVar.fi);
                    ri.this.fi.clear();
                }
            }
        });
        handler.removeCallbacks(this.jbs);
        handler.postDelayed(this.jbs, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(List<ka> list) {
        com.bytedance.sdk.openadsdk.nr.lr.ri riVarRi;
        if (list == null || list.isEmpty()) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseRi = com.bytedance.sdk.openadsdk.nr.ri.ri.ri();
            if (sQLiteDatabaseRi != null) {
                try {
                    sQLiteDatabaseRi.beginTransaction();
                    for (int i = 0; i < list.size(); i++) {
                        ka kaVar = list.get(i);
                        if (kaVar != null && (riVarRi = kaVar.ri()) != null) {
                            Cursor cursorQuery = sQLiteDatabaseRi.query("monitor_table", lr, "sdk_version = ? AND scene = ? AND rit = ? AND tag = ? AND label = ? AND mediation = ? AND is_init = ? AND timestamp = ? AND extra = ?", new String[]{riVarRi.lr(), riVarRi.ik(), riVarRi.xha(), riVarRi.mj(), riVarRi.jbs(), riVarRi.sf(), String.valueOf(riVarRi.co()), String.valueOf(riVarRi.qt()), riVarRi.aw()}, null, null, null);
                            if (cursorQuery != null) {
                                if (cursorQuery.moveToNext()) {
                                    int columnIndex = cursorQuery.getColumnIndex("_id");
                                    if (columnIndex >= 0) {
                                        riVarRi.ri(cursorQuery.getLong(columnIndex));
                                    }
                                    int columnIndex2 = cursorQuery.getColumnIndex("start_count");
                                    if (columnIndex2 >= 0) {
                                        riVarRi.ri(cursorQuery.getInt(columnIndex2) + riVarRi.ka());
                                    }
                                    int columnIndex3 = cursorQuery.getColumnIndex("success_count");
                                    if (columnIndex3 >= 0) {
                                        riVarRi.lr(cursorQuery.getInt(columnIndex3) + riVarRi.fi());
                                    }
                                    int columnIndex4 = cursorQuery.getColumnIndex("fail_count");
                                    if (columnIndex4 >= 0) {
                                        riVarRi.ik(cursorQuery.getInt(columnIndex4) + riVarRi.di());
                                    }
                                }
                                cursorQuery.close();
                            }
                            ContentValues contentValues = new ContentValues();
                            if (riVarRi.ri() > 0) {
                                contentValues.put("_id", Long.valueOf(riVarRi.ri()));
                            }
                            contentValues.put("sdk_version", riVarRi.lr());
                            contentValues.put("scene", riVarRi.ik());
                            contentValues.put("start_count", Integer.valueOf(riVarRi.ka()));
                            contentValues.put("success_count", Integer.valueOf(riVarRi.fi()));
                            contentValues.put("fail_count", Integer.valueOf(riVarRi.di()));
                            contentValues.put("rit", riVarRi.xha());
                            contentValues.put("tag", riVarRi.mj());
                            contentValues.put("label", riVarRi.jbs());
                            contentValues.put("timestamp", Long.valueOf(riVarRi.qt()));
                            contentValues.put("mediation", riVarRi.sf());
                            contentValues.put("is_init", Integer.valueOf(riVarRi.co()));
                            contentValues.put("extra", riVarRi.aw());
                            sQLiteDatabaseRi.insertWithOnConflict("monitor_table", null, contentValues, 5);
                        }
                    }
                    sQLiteDatabaseRi.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseRi;
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                            return;
                        } catch (Throwable unused2) {
                            return;
                        }
                    }
                    return;
                }
            }
            if (sQLiteDatabaseRi != null) {
                try {
                    sQLiteDatabaseRi.endTransaction();
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public void ri(final boolean z) {
        final Handler handler = this.di.getHandler();
        lr lrVar = this.di;
        if (lrVar == null || handler == null || lrVar.getContext() == null || this.xha == null || !ka()) {
            return;
        }
        handler.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.nr.ri.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ri.ka(ri.this);
                    if (z) {
                        long jRi = ri.this.xha.ri();
                        if (jRi == 0) {
                            ri.this.xha.ri(System.currentTimeMillis());
                            return;
                        } else if (com.bytedance.sdk.openadsdk.nr.ka.ri.ri(jRi) && System.currentTimeMillis() - jRi < ri.this.di.getUploadIntervalTime()) {
                            return;
                        }
                    }
                    handler.post(ri.this.sf);
                } catch (Throwable unused) {
                }
            }
        }, Math.max(this.di.getOnceLogInterval(), 10000));
    }
}
