package com.bytedance.sdk.component.di.ri.ri.ri.ri;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerProperties;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends ik {
    private final Context ik;
    private com.bytedance.sdk.component.di.ri.ka.lr.ri ka;
    protected List<String> ri;

    public ri(Context context, com.bytedance.sdk.component.di.ri.ka.lr.ri riVar) {
        super(context);
        this.ri = new ArrayList();
        this.ik = context;
        this.ka = riVar;
        if (riVar == null) {
            this.ka = com.bytedance.sdk.component.di.ri.ka.lr.ri.ik();
        }
    }

    public byte ik() {
        return (byte) 2;
    }

    public byte ka() {
        return (byte) 0;
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.ri.ri.ik
    public String lr() {
        com.bytedance.sdk.component.di.ri.ri.fi fiVarIk = com.bytedance.sdk.component.di.ri.xha.di().ik();
        if (fiVarIk != null) {
            return fiVarIk.lr();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0027 A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r0 r1
  0x0027: PHI (r0v3 int) = (r0v0 int), (r0v5 int) binds: [B:15:0x0031, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0027: PHI (r1v3 android.database.Cursor) = (r1v2 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:15:0x0031, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public int ri() {
        Cursor cursorRi = null;
        int i = 0;
        try {
            cursorRi = com.bytedance.sdk.component.di.ri.ri.ri.ik.ri(fi(), lr(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursorRi != null) {
                cursorRi.moveToFirst();
                i = cursorRi.getInt(0);
            }
        } catch (Exception unused) {
        } finally {
            if (cursorRi != null) {
                try {
                    cursorRi.close();
                } catch (Exception unused2) {
                }
            }
        }
        return i;
    }

    public void lr(List<com.bytedance.sdk.component.di.ri.ka.ri> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.sdk.component.di.ri.ka.ri riVar : list) {
            linkedList.add(riVar.ik());
            com.bytedance.sdk.component.di.ri.ik.ri.qt(riVar);
        }
        lr();
        linkedList.size();
        com.bytedance.sdk.component.di.ri.ri.ri.ik.ri(fi(), "DELETE FROM " + lr() + " WHERE " + ri("id", linkedList, 1000, true));
        ik(linkedList);
    }

    public List<com.bytedance.sdk.component.di.ri.ka.ri> ri(int i, String str) {
        String str2;
        String[] strArr;
        String str3;
        byte b;
        Cursor cursorRi;
        long jRi = com.bytedance.sdk.component.di.ri.lr.ri.ri(i, fi());
        lr();
        if (jRi <= 0) {
            jRi = 1;
        } else if (jRi > 100) {
            jRi = 100;
        }
        String str4 = str + " DESC limit " + jRi;
        ArrayList arrayList = new ArrayList();
        this.ri.clear();
        long jSlm = com.bytedance.sdk.component.di.ri.xha.di().slm();
        if (jSlm > 0) {
            strArr = new String[]{String.valueOf(System.currentTimeMillis() - jSlm)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (com.bytedance.sdk.component.di.ri.ik.ri.ka() && ka() == 3) {
            str3 = "id";
            b = 3;
            cursorRi = com.bytedance.sdk.component.di.ri.ri.ri.ik.ri(fi(), lr(), new String[]{"id", "value", "encrypt", AppsFlyerProperties.CHANNEL}, str2, strArr, null, null, str4);
        } else {
            str3 = "id";
            b = 3;
            cursorRi = com.bytedance.sdk.component.di.ri.ri.ri.ik.ri(fi(), lr(), new String[]{str3, "value", "encrypt"}, str2, strArr, null, null, str4);
        }
        Cursor cursor = cursorRi;
        if (cursor != null) {
            try {
                com.bytedance.sdk.component.di.ri.fi fiVarVr = com.bytedance.sdk.component.di.ri.xha.di().vr();
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex(str3));
                        String string2 = cursor.getString(cursor.getColumnIndex("value"));
                        int i2 = cursor.getInt(cursor.getColumnIndex("encrypt"));
                        int i3 = (com.bytedance.sdk.component.di.ri.ik.ri.ka() && ka() == b) ? cursor.getInt(cursor.getColumnIndex(AppsFlyerProperties.CHANNEL)) : 0;
                        if (i2 == 1) {
                            try {
                                string2 = fiVarVr.ri(string2);
                            } catch (Throwable th) {
                                th = th;
                                th.getMessage();
                            }
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.ri.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(string2);
                            com.bytedance.sdk.component.di.ri.ka.ri.ri riVar = new com.bytedance.sdk.component.di.ri.ka.ri.ri(string, jSONObject);
                            riVar.lr(ka());
                            riVar.ik(ik());
                            if (com.bytedance.sdk.component.di.ri.ik.ri.ka() && ka() == b) {
                                riVar.ri(i3);
                            }
                            com.bytedance.sdk.component.di.ri.ik.ri.ri(jSONObject, riVar);
                            arrayList.add(riVar);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                try {
                    cursor.close();
                    if (!this.ri.isEmpty()) {
                        ri(this.ri);
                        this.ri.clear();
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th3) {
                try {
                    cursor.close();
                    if (!this.ri.isEmpty()) {
                        ri(this.ri);
                        this.ri.clear();
                    }
                } catch (Exception unused2) {
                }
                throw th3;
            }
        }
        lr();
        arrayList.size();
        return arrayList;
    }

    private void lr(int i, long j) {
        if (j > 0 || i > 0) {
            com.bytedance.sdk.component.di.ri.ri.ri.ik.ri(fi(), lr(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i)});
            lr();
        }
    }

    public static String lr(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    public List<com.bytedance.sdk.component.di.ri.ka.ri> ri(String str) {
        com.bytedance.sdk.component.di.ri.ka.lr.ri riVar = this.ka;
        if (riVar == null) {
            return new ArrayList();
        }
        return ri(riVar.lr(), str);
    }

    public void ri(List<String> list) {
        lr();
        list.size();
        com.bytedance.sdk.component.di.ri.ri.ri.ik.ri(fi(), "DELETE FROM " + lr() + " WHERE " + ri("id", list, 1000, true));
        com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.qh(), list.size());
        ik(list);
    }

    public void ri(int i, long j) {
        lr(i, j);
    }

    public boolean ri(int i) {
        if (this.ka == null) {
            return false;
        }
        int iRi = ri();
        int iRi2 = this.ka.ri();
        lr();
        if (com.bytedance.sdk.component.di.ri.ik.ri.ik() && (i == 1 || i == 2)) {
            return iRi > 0;
        }
        return iRi >= iRi2;
    }

    private static String ri(String str, List<?> list, int i, boolean z) {
        int i2;
        String str2 = z ? " IN " : " NOT IN ";
        String str3 = z ? " OR " : " AND ";
        int iMin = Math.min(i, 1000);
        int size = list.size();
        if (size % iMin == 0) {
            i2 = size / iMin;
        } else {
            i2 = (size / iMin) + 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * iMin;
            String strRi = ri(TextUtils.join("','", list.subList(i4, Math.min(i4 + iMin, size))), "");
            if (i3 != 0) {
                sb.append(str3);
            }
            sb.append(str);
            sb.append(str2);
            sb.append("('");
            sb.append(strRi);
            sb.append("')");
        }
        return ri(sb.toString(), str + str2 + "('')");
    }

    private static String ri(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
