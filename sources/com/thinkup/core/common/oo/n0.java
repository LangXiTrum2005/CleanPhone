package com.thinkup.core.common.oo;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.thinkup.core.common.on.mn0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class n0 extends n<mn0> {
    private static volatile n0 m = null;
    private static final String o = "com.thinkup.core.common.oo.n0";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42266n;
    private int o0;

    public static class o {
        public static final String m = "inspect_id";
        public static final String m0 = "ALTER TABLE inspect_info ADD COLUMN inspect_result INTEGER DEFAULT 1";
        public static final String mo = "ALTER TABLE inspect_info DROP COLUMN pgk_name";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f42267n = "update_time";
        public static final String o = "inspect_info";
        public static final String o0 = "inspect_result";
        public static final String om = "CREATE TABLE IF NOT EXISTS inspect_info(inspect_id TEXT, inspect_result INTEGER, pgk_name TEXT, update_time INTEGER )";
        public static final String on = "CREATE TABLE IF NOT EXISTS inspect_info(inspect_id TEXT, update_time INTEGER )";
        public static final String oo = "pgk_name";
    }

    private n0(o0 o0Var) {
        super(o0Var);
        this.f42266n = 500;
        this.o0 = -1627869184;
    }

    private synchronized void m(String str) {
        try {
            o0().delete("inspect_info", "inspect_id = ? ", new String[]{str});
        } catch (Throwable unused) {
        }
    }

    private static n0 o(o0 o0Var) {
        if (m == null) {
            synchronized (n0.class) {
                try {
                    if (m == null) {
                        m = new n0(o0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    private synchronized List<mn0> m() {
        Cursor cursorQuery;
        try {
            cursorQuery = n().query("inspect_info", null, null, null, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        ArrayList arrayList = new ArrayList();
                        while (cursorQuery.moveToNext()) {
                            mn0 mn0Var = new mn0();
                            String string = cursorQuery.getString(cursorQuery.getColumnIndex("inspect_id"));
                            if (!TextUtils.isEmpty(string)) {
                                int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("inspect_result"));
                                long j = cursorQuery.getLong(cursorQuery.getColumnIndex("update_time"));
                                mn0Var.o(string);
                                mn0Var.o(i2);
                                mn0Var.o(j);
                                arrayList.add(mn0Var);
                            }
                        }
                        cursorQuery.close();
                        cursorQuery.close();
                        return arrayList;
                    }
                } catch (Exception unused) {
                    if (cursorQuery != null) {
                    }
                    return null;
                } catch (OutOfMemoryError unused2) {
                    try {
                        System.gc();
                        if (cursorQuery != null) {
                        }
                        return null;
                    } catch (Throwable th) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        throw th;
                    }
                } catch (Throwable unused3) {
                    if (cursorQuery != null) {
                    }
                    return null;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception unused4) {
            cursorQuery = null;
        } catch (OutOfMemoryError unused5) {
            cursorQuery = null;
        } catch (Throwable unused6) {
            cursorQuery = null;
        }
        return null;
    }

    private synchronized long o(String str, boolean z2) {
        if (o0() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("inspect_id", str);
            contentValues.put("inspect_result", Integer.valueOf(z2 ? 1 : 2));
            contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
            if (o(str)) {
                return o0().update("inspect_info", contentValues, "inspect_id = ? ", new String[]{str});
            }
            return o0().insert("inspect_info", null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    private synchronized boolean o(String str) {
        Cursor cursorQuery;
        try {
            if (str == null) {
                return false;
            }
            try {
                cursorQuery = n().query("inspect_info", new String[]{"inspect_id"}, "inspect_id=?", new String[]{str}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.getCount() > 0) {
                            cursorQuery.close();
                            cursorQuery.close();
                            return true;
                        }
                    } catch (Throwable unused) {
                        if (cursorQuery != null) {
                        }
                        return false;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable unused2) {
                cursorQuery = null;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void o() {
        Cursor cursorQuery = null;
        long j = -1;
        try {
            cursorQuery = n().query("inspect_info", null, null, null, null, null, "update_time DESC", String.valueOf(this.f42266n));
            if (cursorQuery != null && cursorQuery.getCount() >= this.f42266n) {
                cursorQuery.moveToLast();
                j = cursorQuery.getLong(cursorQuery.getColumnIndex("update_time"));
                cursorQuery.close();
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception unused) {
            if (cursorQuery != null) {
            }
        } catch (OutOfMemoryError unused2) {
            long j2 = j;
            Cursor cursor = cursorQuery;
            try {
                System.gc();
                if (cursor != null) {
                    cursor.close();
                }
                j = j2;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable unused3) {
            if (cursorQuery != null) {
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - ((long) this.o0);
        if (j == 0 || j > jCurrentTimeMillis) {
            j = jCurrentTimeMillis;
        }
        if (j > 0) {
            try {
                o0().delete("inspect_info", "update_time<?", new String[]{String.valueOf(j)});
            } catch (Throwable unused4) {
            }
        }
    }
}
