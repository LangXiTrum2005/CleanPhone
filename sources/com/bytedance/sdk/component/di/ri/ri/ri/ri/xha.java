package com.bytedance.sdk.component.di.ri.ri.ri.ri;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class xha extends ik {
    private com.bytedance.sdk.component.di.ri.ka.lr.ri ik;
    protected List<String> ri;

    public xha(Context context, com.bytedance.sdk.component.di.ri.ka.lr.ri riVar) {
        super(context);
        this.ri = new ArrayList();
        this.ik = riVar;
        if (riVar == null) {
            this.ik = com.bytedance.sdk.component.di.ri.ka.lr.ri.ik();
        }
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.ri.ri.ik
    public long di() {
        return com.bytedance.sdk.component.di.ri.xha.ri.lr();
    }

    public byte ik() {
        return (byte) 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0023 A[EXC_TOP_SPLITTER, PHI: r0 r1
  0x0023: PHI (r0v2 int) = (r0v0 int), (r0v6 int) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0023: PHI (r1v2 android.database.Cursor) = (r1v1 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public int ka() {
        Cursor cursorRi;
        int i = 0;
        try {
            cursorRi = com.bytedance.sdk.component.di.ri.ri.ri.ik.ri(fi(), lr(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursorRi != null) {
                try {
                    cursorRi.moveToFirst();
                    i = cursorRi.getInt(0);
                } catch (Throwable unused) {
                    if (cursorRi != null) {
                        try {
                            cursorRi.close();
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
            if (cursorRi != null) {
                cursorRi.close();
            }
        } catch (Throwable unused3) {
            cursorRi = null;
        }
        return i;
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.ri.ri.ik
    public String lr() {
        return com.bytedance.sdk.component.di.ri.xha.di().ik().ka();
    }

    public byte ri() {
        return (byte) 1;
    }

    public static String ik(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    public List<com.bytedance.sdk.component.di.ri.ka.ri> lr(String str) {
        com.bytedance.sdk.component.di.ri.ka.lr.ri riVar = this.ik;
        return riVar == null ? new ArrayList() : ri(riVar.lr(), str);
    }

    public List<com.bytedance.sdk.component.di.ri.ka.ri> ri(int i, String str) {
        long jRi = com.bytedance.sdk.component.di.ri.lr.ri.ri(i, fi());
        if (jRi <= 0) {
            jRi = 1;
        } else if (jRi > 100) {
            jRi = 100;
        }
        ArrayList arrayList = new ArrayList();
        this.ri.clear();
        Cursor cursorRi = com.bytedance.sdk.component.di.ri.ri.ri.ik.ri(fi(), lr(), new String[]{"id", "value", "encrypt"}, null, null, null, null, str + " DESC limit " + jRi);
        if (cursorRi != null) {
            while (cursorRi.moveToNext()) {
                try {
                    try {
                        String string = cursorRi.getString(cursorRi.getColumnIndex("id"));
                        String string2 = cursorRi.getString(cursorRi.getColumnIndex("value"));
                        if (cursorRi.getInt(cursorRi.getColumnIndex("encrypt")) == 1) {
                            string2 = com.bytedance.sdk.component.di.ri.xha.di().vr().ri(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.ri.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            com.bytedance.sdk.component.di.ri.ka.ri.ri riVar = new com.bytedance.sdk.component.di.ri.ka.ri.ri(string, new JSONObject(string2));
                            riVar.ik(ik());
                            riVar.lr(ri());
                            arrayList.add(riVar);
                        }
                    } catch (Throwable unused) {
                    }
                } finally {
                    try {
                        cursorRi.close();
                        if (!this.ri.isEmpty()) {
                            ri(this.ri);
                            this.ri.clear();
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        return arrayList;
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

    private void lr(int i, long j) {
        com.bytedance.sdk.component.di.ri.ri.ri.ik.ri(fi(), lr(), "gen_time <? AND retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i)});
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
        return this.ik != null && ka() >= this.ik.ri();
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
