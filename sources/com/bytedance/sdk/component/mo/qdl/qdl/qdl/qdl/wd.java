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
public class wd extends lnr {
    private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl lnr;
    protected List<String> qdl;

    public wd(Context context, com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVar) {
        super(context);
        this.qdl = new ArrayList();
        this.lnr = qdlVar;
        if (qdlVar == null) {
            this.lnr = com.bytedance.sdk.component.mo.qdl.mml.ud.qdl.lnr();
        }
    }

    public byte lnr() {
        return (byte) 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0023 A[EXC_TOP_SPLITTER, PHI: r0 r1
  0x0023: PHI (r0v2 int) = (r0v0 int), (r0v6 int) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0023: PHI (r1v2 android.database.Cursor) = (r1v1 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public int mml() {
        Cursor cursorQdl;
        int i2 = 0;
        try {
            cursorQdl = com.bytedance.sdk.component.mo.qdl.qdl.qdl.lnr.qdl(mzz(), ud(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursorQdl != null) {
                try {
                    cursorQdl.moveToFirst();
                    i2 = cursorQdl.getInt(0);
                } catch (Throwable unused) {
                    if (cursorQdl != null) {
                        try {
                            cursorQdl.close();
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
            if (cursorQdl != null) {
                cursorQdl.close();
            }
        } catch (Throwable unused3) {
            cursorQdl = null;
        }
        return i2;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.lnr
    public long mo() {
        return com.bytedance.sdk.component.mo.qdl.wd.qdl.ud();
    }

    public byte qdl() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.lnr
    public String ud() {
        return jpc.wd().mml().mml();
    }

    public static String lnr(String str) {
        return a.n("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    public List<com.bytedance.sdk.component.mo.qdl.mml.qdl> qdl(int i2, String str) {
        long jQdl = com.bytedance.sdk.component.mo.qdl.ud.qdl.qdl(i2, mzz());
        if (jQdl <= 0) {
            jQdl = 1;
        } else if (jQdl > 100) {
            jQdl = 100;
        }
        ArrayList arrayList = new ArrayList();
        this.qdl.clear();
        Cursor cursorQdl = com.bytedance.sdk.component.mo.qdl.qdl.qdl.lnr.qdl(mzz(), ud(), new String[]{"id", "value", "encrypt"}, null, null, null, null, str + " DESC limit " + jQdl);
        if (cursorQdl != null) {
            while (cursorQdl.moveToNext()) {
                try {
                    try {
                        String string = cursorQdl.getString(cursorQdl.getColumnIndex("id"));
                        String string2 = cursorQdl.getString(cursorQdl.getColumnIndex("value"));
                        if (cursorQdl.getInt(cursorQdl.getColumnIndex("encrypt")) == 1) {
                            string2 = jpc.wd().jtx().qdl(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.qdl.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            com.bytedance.sdk.component.mo.qdl.mml.qdl.qdl qdlVar = new com.bytedance.sdk.component.mo.qdl.mml.qdl.qdl(string, new JSONObject(string2));
                            qdlVar.ud(lnr());
                            qdlVar.qdl(qdl());
                            arrayList.add(qdlVar);
                        }
                    } catch (Throwable unused) {
                    }
                } finally {
                    try {
                        cursorQdl.close();
                        if (!this.qdl.isEmpty()) {
                            qdl(this.qdl);
                            this.qdl.clear();
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        return arrayList;
    }

    public List<com.bytedance.sdk.component.mo.qdl.mml.qdl> ud(String str) {
        com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVar = this.lnr;
        return qdlVar == null ? new ArrayList() : qdl(qdlVar.ud(), str);
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

    private void ud(int i2, long j) {
        com.bytedance.sdk.component.mo.qdl.qdl.qdl.lnr.qdl(mzz(), ud(), "gen_time <? AND retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i2)});
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
        return this.lnr != null && mml() >= this.lnr.qdl();
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
