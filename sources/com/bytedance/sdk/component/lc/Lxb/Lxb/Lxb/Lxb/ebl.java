package com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.component.lc.Lxb.OY;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ebl extends lk {
    protected List<String> Lxb;
    private com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lk;

    public ebl(Context context, com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxb) {
        super(context);
        this.Lxb = new ArrayList();
        this.lk = lxb;
        if (lxb == null) {
            this.lk = com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb.lk();
        }
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.lk
    public String LD() {
        return OY.ebl().ZU().ZU();
    }

    public byte Lxb() {
        return (byte) 1;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0027 A[EXC_TOP_SPLITTER, PHI: r0 r1
  0x0027: PHI (r0v2 int) = (r0v0 int), (r0v6 int) binds: [B:12:0x002c, B:8:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0027: PHI (r1v2 android.database.Cursor) = (r1v1 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:12:0x002c, B:8:0x0025] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public int ZU() {
        Cursor cursorLxb;
        int i = 0;
        try {
            cursorLxb = com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.lk.Lxb(JXs(), LD(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursorLxb != null) {
                try {
                    cursorLxb.moveToFirst();
                    i = cursorLxb.getInt(0);
                } catch (Throwable unused) {
                    if (cursorLxb != null) {
                        try {
                            cursorLxb.close();
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
            if (cursorLxb != null) {
                cursorLxb.close();
            }
        } catch (Throwable unused3) {
            cursorLxb = null;
        }
        return i;
    }

    public byte lk() {
        return (byte) 2;
    }

    public static String lk(String str) {
        return DM.B("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    public List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> LD(String str) {
        com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxb = this.lk;
        return lxb == null ? new ArrayList() : Lxb(lxb.LD(), str);
    }

    public List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> Lxb(int i, String str) {
        long jLxb = com.bytedance.sdk.component.lc.Lxb.LD.Lxb.Lxb(i, JXs());
        if (jLxb <= 0) {
            jLxb = 1;
        } else if (jLxb > 100) {
            jLxb = 100;
        }
        ArrayList arrayList = new ArrayList();
        this.Lxb.clear();
        Cursor cursorLxb = com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.lk.Lxb(JXs(), LD(), new String[]{"id", AppMeasurementSdk.ConditionalUserProperty.VALUE, "encrypt"}, null, null, null, null, str + " DESC limit " + jLxb);
        if (cursorLxb != null) {
            while (cursorLxb.moveToNext()) {
                try {
                    try {
                        String string = cursorLxb.getString(cursorLxb.getColumnIndex("id"));
                        String string2 = cursorLxb.getString(cursorLxb.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        if (cursorLxb.getInt(cursorLxb.getColumnIndex("encrypt")) == 1) {
                            string2 = OY.ebl().VVE().Lxb(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.Lxb.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            com.bytedance.sdk.component.lc.Lxb.ZU.Lxb.Lxb lxb = new com.bytedance.sdk.component.lc.Lxb.ZU.Lxb.Lxb(string, new JSONObject(string2));
                            lxb.LD(lk());
                            lxb.Lxb(Lxb());
                            arrayList.add(lxb);
                        }
                    } catch (Throwable unused) {
                    }
                } finally {
                    try {
                        cursorLxb.close();
                        if (!this.Lxb.isEmpty()) {
                            Lxb(this.Lxb);
                            this.Lxb.clear();
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        return arrayList;
    }

    public void LD(List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb : list) {
            linkedList.add(lxb.lk());
            com.bytedance.sdk.component.lc.Lxb.lk.Lxb.nBu(lxb);
        }
        LD();
        linkedList.size();
        com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.lk.Lxb(JXs(), "DELETE FROM " + LD() + " WHERE " + Lxb("id", linkedList, 1000, true));
        lk(linkedList);
    }

    private void LD(int i, long j) {
        com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.lk.Lxb(JXs(), LD(), "gen_time <? AND retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i)});
    }

    public void Lxb(List<String> list) {
        LD();
        list.size();
        com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.lk.Lxb(JXs(), "DELETE FROM " + LD() + " WHERE " + Lxb("id", list, 1000, true));
        com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.Nu(), list.size());
        lk(list);
    }

    public void Lxb(int i, long j) {
        LD(i, j);
    }

    public boolean Lxb(int i) {
        return this.lk != null && ZU() >= this.lk.Lxb();
    }

    private static String Lxb(String str, List<?> list, int i, boolean z) {
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
            String strLxb = Lxb(TextUtils.join("','", list.subList(i4, Math.min(i4 + iMin, size))), "");
            if (i3 != 0) {
                sb.append(str3);
            }
            AbstractC5044xl.t(sb, str, str2, "('", strLxb);
            sb.append("')");
        }
        return Lxb(sb.toString(), DM.i(str, str2, "('')"));
    }

    private static String Lxb(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
