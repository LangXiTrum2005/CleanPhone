package com.thinkup.core.common.oo;

import android.content.ContentValues;
import android.database.Cursor;
import com.thinkup.core.common.on.non;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class nn extends n<non> {
    private static nn m;
    private final String o;

    public static class o {
        public static final String m = "adsource_id";
        public static final String m0 = "CREATE TABLE IF NOT EXISTS offer_action_record(adsource_id TEXT ,type INTEGER ,unit_id TEXT ,click_count INTEGER ,show_count INTEGER ,expire_time INTEGER )";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f42269n = "type";
        public static final String o = "offer_action_record";
        public static final String o0 = "unit_id";
        public static final String om = "show_count";
        public static final String on = "expire_time";
        public static final String oo = "click_count";
    }

    private nn(o0 o0Var) {
        super(o0Var);
        this.o = nn.class.getName();
    }

    private static String m(int i2) {
        if (i2 <= 0) {
            throw new RuntimeException("No placeholders");
        }
        StringBuilder sb = new StringBuilder((i2 * 2) - 1);
        sb.append("?");
        for (int i3 = 1; i3 < i2; i3++) {
            sb.append(",?");
        }
        return sb.toString();
    }

    private boolean n(String str, int i2, String str2) {
        Cursor cursorQuery = n().query("offer_action_record", null, "adsource_id = ? and type = ? and unit_id = ?", new String[]{str, String.valueOf(i2), str2}, null, null, null);
        if (cursorQuery != null && cursorQuery.getCount() > 0) {
            cursorQuery.close();
            return true;
        }
        if (cursorQuery == null) {
            return false;
        }
        cursorQuery.close();
        return false;
    }

    private static nn o(o0 o0Var) {
        if (m == null) {
            synchronized (nn.class) {
                try {
                    if (m == null) {
                        m = new nn(o0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    private synchronized long m(String str, int i2, String str2) {
        try {
            if (o0() == null) {
                return -1L;
            }
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("adsource_id", str);
                contentValues.put("type", Integer.valueOf(i2));
                contentValues.put("unit_id", str2);
                non nonVarO = o(i2, str2);
                if (nonVarO != null) {
                    contentValues.put("click_count", Integer.valueOf(nonVarO.o0()));
                    contentValues.put("show_count", Integer.valueOf(nonVarO.n()));
                    contentValues.put("expire_time", Long.valueOf(nonVarO.m()));
                } else {
                    contentValues.put("click_count", (Integer) 0);
                    contentValues.put("show_count", (Integer) 0);
                    contentValues.put("expire_time", (Integer) (-1));
                }
                return o0().insert("offer_action_record", null, contentValues);
            } catch (Exception unused) {
                return -1L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void o(int i2, String str, int i3, int i4) {
        non nonVarO = o(i2, str);
        if (nonVarO != null) {
            nonVarO.m(nonVarO.o0() + i3);
            nonVarO.o(nonVarO.n() + i4);
            o(nonVarO);
        }
    }

    private synchronized void o(int i2, String str, long j) {
        non nonVarO = o(i2, str);
        if (nonVarO != null) {
            nonVarO.o(j);
            o(nonVarO);
        }
    }

    private synchronized List<non> o(int i2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = n().query("offer_action_record", null, "type = ? and expire_time > ?", new String[]{String.valueOf(i2), String.valueOf(System.currentTimeMillis())}, null, null, null);
                if (cursorQuery != null && cursorQuery.getCount() > 0) {
                    while (cursorQuery.moveToNext()) {
                        non nonVar = new non(i2, cursorQuery.getString(cursorQuery.getColumnIndex("unit_id")));
                        nonVar.m(cursorQuery.getInt(cursorQuery.getColumnIndex("click_count")));
                        nonVar.o(cursorQuery.getInt(cursorQuery.getColumnIndex("show_count")));
                        nonVar.o(cursorQuery.getLong(cursorQuery.getColumnIndex("expire_time")));
                        arrayList.add(nonVar);
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception unused) {
                if (cursorQuery != null) {
                }
            } catch (OutOfMemoryError unused2) {
                System.gc();
                if (cursorQuery != null) {
                }
            } catch (Throwable unused3) {
                if (cursorQuery != null) {
                }
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
                throw th;
            }
            throw th;
        }
        return arrayList;
    }

    private boolean m(int i2, String str) {
        Cursor cursorQuery = n().query("offer_action_record", null, "type = ? and unit_id = ?", new String[]{String.valueOf(i2), str}, null, null, null);
        if (cursorQuery != null && cursorQuery.getCount() > 0) {
            cursorQuery.close();
            return true;
        }
        if (cursorQuery == null) {
            return false;
        }
        cursorQuery.close();
        return false;
    }

    private synchronized List<non> o(List<String> list, int i2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        m(list.size());
        Cursor cursorQuery = null;
        try {
            try {
                String[] strArr = new String[list.size() + 2];
                list.toArray(strArr);
                strArr[list.size()] = String.valueOf(i2);
                strArr[list.size() + 1] = String.valueOf(System.currentTimeMillis());
                cursorQuery = n().query("offer_action_record", null, "adsource_id IN (" + m(list.size()) + ") and type = ? and expire_time > ?", strArr, null, null, null);
                if (cursorQuery != null && cursorQuery.getCount() > 0) {
                    while (cursorQuery.moveToNext()) {
                        non nonVar = new non(i2, cursorQuery.getString(cursorQuery.getColumnIndex("unit_id")));
                        nonVar.m(cursorQuery.getInt(cursorQuery.getColumnIndex("click_count")));
                        nonVar.o(cursorQuery.getInt(cursorQuery.getColumnIndex("show_count")));
                        nonVar.o(cursorQuery.getLong(cursorQuery.getColumnIndex("expire_time")));
                        arrayList.add(nonVar);
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception unused) {
                if (cursorQuery != null) {
                }
            } catch (OutOfMemoryError unused2) {
                System.gc();
                if (cursorQuery != null) {
                }
            } catch (Throwable unused3) {
                if (cursorQuery != null) {
                }
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
                throw th;
            }
            throw th;
        }
        return arrayList;
    }

    private synchronized long o(non nonVar) {
        if (o0() == null || nonVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(nonVar.oo()));
            contentValues.put("unit_id", nonVar.o());
            contentValues.put("click_count", Integer.valueOf(nonVar.o0()));
            contentValues.put("show_count", Integer.valueOf(nonVar.n()));
            contentValues.put("expire_time", Long.valueOf(nonVar.m()));
            return o0().update("offer_action_record", contentValues, "type = ? and unit_id = ?", new String[]{String.valueOf(nonVar.oo()), nonVar.o()});
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[Catch: all -> 0x0059, PHI: r1
  0x0066: PHI (r1v5 android.database.Cursor) = (r1v3 android.database.Cursor), (r1v4 android.database.Cursor), (r1v6 android.database.Cursor) binds: [B:19:0x0064, B:24:0x006e, B:33:0x007c] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #7 {, blocks: (B:9:0x0054, B:15:0x005e, B:20:0x0066, B:29:0x0075, B:30:0x0078, B:23:0x006b), top: B:43:0x0002, inners: #0 }] */
    private synchronized non o(int i2, String str) {
        Cursor cursorQuery;
        try {
            cursorQuery = n().query("offer_action_record", null, "type=? and unit_id = ?", new String[]{String.valueOf(i2), str}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        cursorQuery.moveToNext();
                        non nonVar = new non(i2, str);
                        nonVar.m(cursorQuery.getInt(cursorQuery.getColumnIndex("click_count")));
                        nonVar.o(cursorQuery.getInt(cursorQuery.getColumnIndex("show_count")));
                        nonVar.o(cursorQuery.getLong(cursorQuery.getColumnIndex("expire_time")));
                        cursorQuery.close();
                        cursorQuery.close();
                        return nonVar;
                    }
                } catch (Exception unused) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                } catch (OutOfMemoryError unused2) {
                    try {
                        System.gc();
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    } catch (Throwable th) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                            throw th;
                        }
                        throw th;
                    }
                } catch (Throwable unused3) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Exception unused4) {
            cursorQuery = null;
        } catch (OutOfMemoryError unused5) {
            cursorQuery = null;
        } catch (Throwable unused6) {
            cursorQuery = null;
        }
    }

    private synchronized void o(String str, int i2, String str2) {
        try {
            Cursor cursorQuery = n().query("offer_action_record", null, "adsource_id = ? and type = ? and unit_id = ?", new String[]{str, String.valueOf(i2), str2}, null, null, null);
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                cursorQuery.close();
            } else {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                m(str, i2, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
