package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class k extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f33492a = "ReplaceTempDao";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static k f33493b;

    private k(f fVar) {
        super(fVar);
    }

    public static k a(f fVar) {
        if (f33493b == null) {
            synchronized (e.class) {
                try {
                    if (f33493b == null) {
                        f33493b = new k(fVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f33493b;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0058 A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r1
  0x0058: PHI (r1v4 org.json.JSONObject) = (r1v0 org.json.JSONObject), (r1v6 org.json.JSONObject) binds: [B:20:0x004c, B:26:0x0056] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public JSONObject b(String str) {
        JSONObject jSONObject = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM c_replace_temp WHERE d_key = ? ", new String[]{str});
        if (cursorRawQuery != null) {
            try {
                if (cursorRawQuery.getCount() > 0) {
                    jSONObject = new JSONObject();
                    while (cursorRawQuery.moveToNext()) {
                        jSONObject = new JSONObject(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("d_value")));
                    }
                } else if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Exception unused) {
                    }
                }
                if (cursorRawQuery != null) {
                }
            } catch (Throwable th2) {
                try {
                    q0.b(f33492a, th2.getMessage());
                } finally {
                    if (cursorRawQuery != null) {
                        try {
                            cursorRawQuery.close();
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
        } else {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            if (cursorRawQuery != null) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0047 A[Catch: all -> 0x0043, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0043, blocks: (B:4:0x0011, B:6:0x0017, B:17:0x0047), top: B:36:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068 A[RETURN] */
    public JSONObject d() {
        JSONObject jSONObject;
        a(7);
        JSONObject jSONObject2 = null;
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM c_replace_temp", null);
        if (cursorRawQuery != null) {
            try {
                if (cursorRawQuery.getCount() > 0) {
                    jSONObject = new JSONObject();
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            jSONObject.put(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("d_key")), new JSONObject(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("d_value"))));
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                q0.b(f33492a, th.getMessage());
                                return jSONObject;
                            } finally {
                                if (cursorRawQuery != null) {
                                    try {
                                        cursorRawQuery.close();
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                    }
                    jSONObject2 = jSONObject;
                } else if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                if (cursorRawQuery != null) {
                    return jSONObject2;
                }
                jSONObject = jSONObject2;
            } catch (Throwable th3) {
                JSONObject jSONObject3 = jSONObject2;
                th = th3;
                jSONObject = jSONObject3;
            }
        } else {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            if (cursorRawQuery != null) {
                return jSONObject2;
            }
            jSONObject = jSONObject2;
        }
        return jSONObject;
    }

    public void a(String str, JSONObject jSONObject) {
        try {
            if (getWritableDatabase() == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("d_key", str);
            contentValues.put("d_value", jSONObject.toString());
            contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
            if (!a(str)) {
                getWritableDatabase().insert("c_replace_temp", null, contentValues);
            } else {
                getWritableDatabase().update("c_replace_temp", contentValues, "d_key = ? ", new String[]{str});
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public boolean a(String str) {
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT d_value FROM c_replace_temp WHERE d_key= ? ", new String[]{str});
        if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
            try {
                cursorRawQuery.close();
                return true;
            } catch (Exception unused) {
                return true;
            }
        }
        if (cursorRawQuery == null) {
            return false;
        }
        try {
            cursorRawQuery.close();
            return false;
        } catch (Exception unused2) {
            return false;
        }
    }

    public void a(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis() - ((long) (i10 * 86400000));
        try {
            if (getWritableDatabase() == null) {
                return;
            }
            getWritableDatabase().delete("c_replace_temp", "time<?", new String[]{String.valueOf(jCurrentTimeMillis)});
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
