package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile c f33462a;

    private c(f fVar) {
        super(fVar);
    }

    public static c a(f fVar) {
        if (f33462a == null) {
            synchronized (c.class) {
                try {
                    if (f33462a == null) {
                        f33462a = new c(fVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f33462a;
    }

    public void b(String str, String str2, String str3) {
        if (a(str, str3)) {
            try {
                getWritableDatabase().execSQL("UPDATE CacheCampaign SET show_count = show_count + 1, show_time = ? WHERE rid = ? AND unitid = ? AND state = ?", new Object[]{Long.valueOf(System.currentTimeMillis()), str, str3, "1"});
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public long a(String str, String str2, String str3, int i10) {
        if (!a(str, str3)) {
            return -1L;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("state", Integer.valueOf(i10));
        return getWritableDatabase().update("CacheCampaign", contentValues, "rid= ? AND unitid = ? AND state = 0", new String[]{str, str3});
    }

    public synchronized boolean a(String str, String str2) {
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT rid FROM CacheCampaign WHERE rid= ? AND unitid = ? ", new String[]{str, str2});
        if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
            try {
                cursorRawQuery.close();
            } catch (Exception unused) {
            }
            return true;
        }
        if (cursorRawQuery != null) {
            try {
                cursorRawQuery.close();
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    public synchronized void a(String str, int i10) {
        if (i10 <= 0) {
            i10 = 1;
        }
        try {
            String str2 = "unitid = ? AND ( (ts + interval_ts) < " + System.currentTimeMillis() + " OR show_count >= ?)";
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return;
            }
            try {
                writableDatabase.delete("CacheCampaign", str2, new String[]{str, String.valueOf(i10)});
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } catch (Exception e11) {
            q0.b("CacheCampaignDao", e11.getLocalizedMessage());
        }
    }

    public synchronized void a(String str, String str2, String str3) {
        try {
            if (a(str2, str)) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                if (writableDatabase == null) {
                    return;
                }
                try {
                    writableDatabase.delete("CacheCampaign", "unitid = ? AND rid = ? ", new String[]{str, str2});
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        } catch (Exception e11) {
            q0.b("CampaignDao", e11.getLocalizedMessage());
        }
    }

    public long a(List<CampaignEx> list, String str) {
        CampaignEx campaignEx;
        if (list != null) {
            try {
                if (list.size() == 0 || TextUtils.isEmpty(str) || (campaignEx = list.get(0)) == null) {
                    return 0L;
                }
                if (getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("rid", campaignEx.getRequestId());
                contentValues.put("lrid", campaignEx.getLocalRequestId());
                contentValues.put("unitid", str);
                JSONArray jSONArray = new JSONArray();
                Iterator<CampaignEx> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(CampaignEx.campaignToJsonObject(it.next()));
                }
                contentValues.put("campaigns", jSONArray.toString());
                contentValues.put("ts", Long.valueOf(campaignEx.getTimestamp()));
                long candidateCacheTime = campaignEx.getCandidateCacheTime();
                if (candidateCacheTime == 0) {
                    candidateCacheTime = campaignEx.getPlctb();
                    if (candidateCacheTime == 0) {
                        com.mbridge.msdk.setting.g gVarF = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
                        if (gVarF == null) {
                            gVarF = com.mbridge.msdk.setting.i.b().a();
                        }
                        candidateCacheTime = gVarF.d0();
                    }
                }
                try {
                    if (s0.a().a("c_e_t", false)) {
                        candidateCacheTime *= 24;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                contentValues.put("interval_ts", Long.valueOf(candidateCacheTime * 1000));
                contentValues.put("ecppv", campaignEx.getEcppv());
                contentValues.put("show_count", Integer.valueOf(campaignEx.getShowCount()));
                contentValues.put("state", (Integer) 0);
                if (a(campaignEx.getRequestId(), str)) {
                    return getWritableDatabase().update("CacheCampaign", contentValues, "rid= ? AND lrid= ? AND unitid = ? AND state = 1", new String[]{campaignEx.getRequestId(), campaignEx.getLocalRequestId(), str});
                }
                return getWritableDatabase().insert("CacheCampaign", null, contentValues);
            } catch (Exception e11) {
                e11.printStackTrace();
                return -1L;
            }
        }
        return 0L;
    }

    public List<com.mbridge.msdk.foundation.cache.b> a(String str, long j10) {
        return a(str, 0, j10);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00f8 A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r3
  0x00f8: PHI (r3v3 android.database.Cursor) = (r3v2 android.database.Cursor), (r3v5 android.database.Cursor) binds: [B:32:0x00f6, B:27:0x00ee] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public List<com.mbridge.msdk.foundation.cache.b> a(String str, int i10, long j10) {
        Cursor cursorRawQuery;
        try {
            cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM CacheCampaign WHERE unitid = ? AND state > ? and (show_time is null or show_time < ? )", new String[]{str, String.valueOf(i10), String.valueOf(j10)});
            if (cursorRawQuery != null) {
                try {
                    if (cursorRawQuery.getCount() > 0) {
                        ArrayList arrayList = new ArrayList();
                        while (cursorRawQuery.moveToNext()) {
                            com.mbridge.msdk.foundation.cache.b bVar = new com.mbridge.msdk.foundation.cache.b();
                            String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("campaigns"));
                            JSONArray jSONArray = new JSONArray(string);
                            if (TextUtils.isEmpty(string)) {
                                try {
                                    cursorRawQuery.close();
                                } catch (Exception unused) {
                                }
                                return null;
                            }
                            if (jSONArray.length() > 0) {
                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                    copyOnWriteArrayList.add(CampaignEx.parseCampaignWithBackData((JSONObject) jSONArray.get(i11)));
                                }
                                bVar.a(copyOnWriteArrayList);
                            }
                            bVar.b(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("lrid")));
                            bVar.c(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("rid")));
                            bVar.d(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("unitid")));
                            bVar.a(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("ecppv")));
                            bVar.c(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("ts")));
                            bVar.b(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("state")));
                            bVar.a(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("show_count")));
                            bVar.b(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("show_time")));
                            bVar.a(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("interval_ts")));
                            arrayList.add(bVar);
                        }
                        try {
                            cursorRawQuery.close();
                        } catch (Exception unused2) {
                        }
                        return arrayList;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        th.printStackTrace();
                    } finally {
                        if (cursorRawQuery != null) {
                            try {
                                cursorRawQuery.close();
                            } catch (Exception unused3) {
                            }
                        }
                    }
                }
            }
            if (cursorRawQuery != null) {
            }
        } catch (Throwable th3) {
            th = th3;
            cursorRawQuery = null;
        }
        return null;
    }
}
