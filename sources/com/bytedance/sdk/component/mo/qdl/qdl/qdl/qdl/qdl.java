package com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.media.a;
import android.text.TextUtils;
import com.bytedance.sdk.component.mo.qdl.jpc;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class qdl extends lnr {
    private final Context lnr;
    private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl mml;
    protected List<String> qdl;

    public qdl(Context context, com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVar) {
        super(context);
        this.qdl = new ArrayList();
        this.lnr = context;
        this.mml = qdlVar;
        if (qdlVar == null) {
            this.mml = com.bytedance.sdk.component.mo.qdl.mml.ud.qdl.lnr();
        }
    }

    public byte lnr() {
        return (byte) 2;
    }

    public byte mml() {
        return (byte) 0;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0027 A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r0 r1
  0x0027: PHI (r0v3 int) = (r0v0 int), (r0v5 int) binds: [B:15:0x0031, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0027: PHI (r1v3 android.database.Cursor) = (r1v2 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:15:0x0031, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public int qdl() {
        Cursor cursorQdl = null;
        int i2 = 0;
        try {
            cursorQdl = com.bytedance.sdk.component.mo.qdl.qdl.qdl.lnr.qdl(mzz(), ud(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursorQdl != null) {
                cursorQdl.moveToFirst();
                i2 = cursorQdl.getInt(0);
            }
        } catch (Exception unused) {
        } finally {
            if (cursorQdl != null) {
                try {
                    cursorQdl.close();
                } catch (Exception unused2) {
                }
            }
        }
        return i2;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.lnr
    public String ud() {
        com.bytedance.sdk.component.mo.qdl.qdl.mzz mzzVarMml = jpc.wd().mml();
        if (mzzVarMml != null) {
            return mzzVarMml.ud();
        }
        return null;
    }

    public void ud(List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar : list) {
            linkedList.add(qdlVar.lnr());
            com.bytedance.sdk.component.mo.qdl.lnr.qdl.to(qdlVar);
        }
        ud();
        linkedList.size();
        com.bytedance.sdk.component.mo.qdl.qdl.qdl.lnr.qdl(mzz(), "DELETE FROM " + ud() + " WHERE " + qdl("id", linkedList, 1000, true));
        lnr(linkedList);
    }

    public List<com.bytedance.sdk.component.mo.qdl.mml.qdl> qdl(int i2, String str) {
        String str2;
        String[] strArr;
        String str3;
        byte b2;
        Cursor cursorQdl;
        long jQdl = com.bytedance.sdk.component.mo.qdl.ud.qdl.qdl(i2, mzz());
        ud();
        if (jQdl <= 0) {
            jQdl = 1;
        } else if (jQdl > 100) {
            jQdl = 100;
        }
        String str4 = str + " DESC limit " + jQdl;
        ArrayList arrayList = new ArrayList();
        this.qdl.clear();
        long jYt = jpc.wd().yt();
        if (jYt > 0) {
            strArr = new String[]{String.valueOf(System.currentTimeMillis() - jYt)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (com.bytedance.sdk.component.mo.qdl.lnr.qdl.mml() && mml() == 3) {
            str3 = "id";
            b2 = 3;
            cursorQdl = com.bytedance.sdk.component.mo.qdl.qdl.qdl.lnr.qdl(mzz(), ud(), new String[]{"id", "value", "encrypt", "channel"}, str2, strArr, null, null, str4);
        } else {
            str3 = "id";
            b2 = 3;
            cursorQdl = com.bytedance.sdk.component.mo.qdl.qdl.qdl.lnr.qdl(mzz(), ud(), new String[]{str3, "value", "encrypt"}, str2, strArr, null, null, str4);
        }
        Cursor cursor = cursorQdl;
        if (cursor != null) {
            try {
                com.bytedance.sdk.component.mo.qdl.mzz mzzVarJtx = jpc.wd().jtx();
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex(str3));
                        String string2 = cursor.getString(cursor.getColumnIndex("value"));
                        int i3 = cursor.getInt(cursor.getColumnIndex("encrypt"));
                        int i4 = (com.bytedance.sdk.component.mo.qdl.lnr.qdl.mml() && mml() == b2) ? cursor.getInt(cursor.getColumnIndex("channel")) : 0;
                        if (i3 == 1) {
                            try {
                                string2 = mzzVarJtx.qdl(string2);
                            } catch (Throwable th) {
                                th = th;
                                th.getMessage();
                            }
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.qdl.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(string2);
                            com.bytedance.sdk.component.mo.qdl.mml.qdl.qdl qdlVar = new com.bytedance.sdk.component.mo.qdl.mml.qdl.qdl(string, jSONObject);
                            qdlVar.qdl(mml());
                            qdlVar.ud(lnr());
                            if (com.bytedance.sdk.component.mo.qdl.lnr.qdl.mml() && mml() == b2) {
                                qdlVar.qdl(i4);
                            }
                            com.bytedance.sdk.component.mo.qdl.lnr.qdl.qdl(jSONObject, qdlVar);
                            arrayList.add(qdlVar);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                try {
                    cursor.close();
                    if (!this.qdl.isEmpty()) {
                        qdl(this.qdl);
                        this.qdl.clear();
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th3) {
                try {
                    cursor.close();
                    if (!this.qdl.isEmpty()) {
                        qdl(this.qdl);
                        this.qdl.clear();
                    }
                } catch (Exception unused2) {
                }
                throw th3;
            }
        }
        ud();
        arrayList.size();
        return arrayList;
    }

    private void ud(int i2, long j) {
        if (j > 0 || i2 > 0) {
            com.bytedance.sdk.component.mo.qdl.qdl.qdl.lnr.qdl(mzz(), ud(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i2)});
            ud();
        }
    }

    public static String ud(String str) {
        return a.n("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    public List<com.bytedance.sdk.component.mo.qdl.mml.qdl> qdl(String str) {
        com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVar = this.mml;
        if (qdlVar == null) {
            return new ArrayList();
        }
        return qdl(qdlVar.ud(), str);
    }

    public void qdl(List<String> list) {
        ud();
        list.size();
        com.bytedance.sdk.component.mo.qdl.qdl.qdl.lnr.qdl(mzz(), "DELETE FROM " + ud() + " WHERE " + qdl("id", list, 1000, true));
        com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.tid(), list.size());
        lnr(list);
    }

    public void qdl(int i2, long j) {
        ud(i2, j);
    }

    public boolean qdl(int i2) {
        if (this.mml == null) {
            return false;
        }
        int iQdl = qdl();
        int iQdl2 = this.mml.qdl();
        ud();
        if (com.bytedance.sdk.component.mo.qdl.lnr.qdl.lnr() && (i2 == 1 || i2 == 2)) {
            return iQdl > 0;
        }
        return iQdl >= iQdl2;
    }

    private static String qdl(String str, List<?> list, int i2, boolean z2) {
        int i3;
        String str2 = z2 ? " IN " : " NOT IN ";
        String str3 = z2 ? " OR " : " AND ";
        int iMin = Math.min(i2, 1000);
        int size = list.size();
        if (size % iMin == 0) {
            i3 = size / iMin;
        } else {
            i3 = (size / iMin) + 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i4 * iMin;
            String strQdl = qdl(TextUtils.join("','", list.subList(i5, Math.min(i5 + iMin, size))), "");
            if (i4 != 0) {
                sb.append(str3);
            }
            androidx.media3.extractor.text.ttml.a.C(sb, str, str2, "('", strQdl);
            sb.append("')");
        }
        return qdl(sb.toString(), a.D(str, str2, "('')"));
    }

    private static String qdl(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
