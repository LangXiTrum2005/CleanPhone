package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.w0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d extends a<JumpLoaderResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f33463a = "d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static d f33464b;

    private d(f fVar) {
        super(fVar);
    }

    public static synchronized d a(f fVar) {
        try {
            if (f33464b == null) {
                f33464b = new d(fVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f33464b;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0062 A[Catch: all -> 0x0040, PHI: r12
  0x0062: PHI (r12v4 android.database.Cursor) = (r12v3 android.database.Cursor), (r12v5 android.database.Cursor) binds: [B:31:0x0060, B:22:0x004a] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:32:0x0062, B:36:0x0069, B:37:0x006c), top: B:40:0x0002 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.database.Cursor] */
    public synchronized JumpLoaderResult b(String str, String str2) {
        Throwable th2;
        Exception exc;
        Cursor cursorQuery;
        ?? r2 = 0;
        try {
            try {
                try {
                    cursorQuery = getReadableDatabase().query("campaignclick", null, "id=? AND unitid=?", new String[]{str, str2}, null, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.getCount() > 0 && cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndex("result"));
                                if (!TextUtils.isEmpty(string)) {
                                    JumpLoaderResult jumpLoaderResult = (JumpLoaderResult) w0.a(string);
                                    cursorQuery.close();
                                    return jumpLoaderResult;
                                }
                            }
                        } catch (Exception e10) {
                            exc = e10;
                            if (MBridgeConstans.DEBUG) {
                                q0.b(f33463a, exc.getMessage());
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Exception e11) {
                    exc = e11;
                    cursorQuery = null;
                } catch (Throwable th3) {
                    th2 = th3;
                    if (r2 == 0) {
                        throw th2;
                    }
                    r2.close();
                    throw th2;
                }
                return null;
            } catch (Throwable th4) {
                throw th4;
            }
        } catch (Throwable th5) {
            th2 = th5;
            r2 = str;
        }
    }

    public synchronized boolean c(String str, String str2) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT id FROM campaignclick WHERE id= ? AND unitid= ? AND cti + ts > " + System.currentTimeMillis(), new String[]{str, str2});
            if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                cursorRawQuery.close();
                return true;
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return false;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(f33463a, e10.getMessage());
            }
            return false;
        }
    }

    public synchronized void d() {
        try {
            getWritableDatabase().delete("campaignclick", " ( " + System.currentTimeMillis() + " - ts) > cti", null);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(f33463a, e10.getMessage());
            }
        }
    }

    public synchronized long a(CampaignEx campaignEx, String str) {
        if (campaignEx == null) {
            return 0L;
        }
        try {
            try {
                String strA = w0.a(campaignEx.getJumpResult());
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", campaignEx.getId());
                contentValues.put("unitid", str);
                contentValues.put("result", strA);
                contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval() * 1000));
                contentValues.put("package_name", campaignEx.getPackageName());
                com.mbridge.msdk.setting.g gVarF = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
                contentValues.put("ts", Long.valueOf(System.currentTimeMillis()));
                if (gVarF != null && gVarF.Z() > 0) {
                    contentValues.put("cpei", Integer.valueOf(gVarF.Z() * 1000));
                }
                if (gVarF != null && gVarF.a0() > 0) {
                    contentValues.put("cpoci", Integer.valueOf(gVarF.a0() * 1000));
                }
                if (a(campaignEx.getId(), str)) {
                    if (getWritableDatabase() == null) {
                        return -1L;
                    }
                    return getWritableDatabase().update("campaignclick", contentValues, "id = ? AND unitid = ? ", new String[]{campaignEx.getId(), str});
                }
                return getWritableDatabase().insert("campaignclick", null, contentValues);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b(f33463a, e10.getMessage());
                }
                return -1L;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean a(String str, String str2) {
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT id FROM campaignclick WHERE id= ? AND unitid= ?", new String[]{str, str2});
        if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
            cursorRawQuery.close();
            return true;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return false;
    }
}
