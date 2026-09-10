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
public class Lxb extends lk {
    protected List<String> Lxb;
    private com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb ZU;
    private final Context lk;

    public Lxb(Context context, com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxb) {
        super(context);
        this.Lxb = new ArrayList();
        this.lk = context;
        this.ZU = lxb;
        if (lxb == null) {
            this.ZU = com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb.lk();
        }
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.lk
    public String LD() {
        com.bytedance.sdk.component.lc.Lxb.Lxb.JXs jXsZU = OY.ebl().ZU();
        if (jXsZU != null) {
            return jXsZU.LD();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002a A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r0 r1
  0x002a: PHI (r0v3 android.database.Cursor) = (r0v2 android.database.Cursor), (r0v4 android.database.Cursor) binds: [B:16:0x0034, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE]
  0x002a: PHI (r1v3 int) = (r1v0 int), (r1v5 int) binds: [B:16:0x0034, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public int Lxb() {
        Cursor cursorLxb = null;
        int i = 0;
        try {
            cursorLxb = com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.lk.Lxb(JXs(), LD(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursorLxb != null) {
                cursorLxb.moveToFirst();
                i = cursorLxb.getInt(0);
            }
        } catch (Exception unused) {
        } finally {
            if (cursorLxb != null) {
                try {
                    cursorLxb.close();
                } catch (Exception unused2) {
                }
            }
        }
        return i;
    }

    public byte ZU() {
        return (byte) 0;
    }

    public byte lk() {
        return (byte) 2;
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

    public List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> Lxb(int i, String str) {
        String str2;
        String[] strArr;
        Cursor cursorLxb;
        long jLxb = com.bytedance.sdk.component.lc.Lxb.LD.Lxb.Lxb(i, JXs());
        LD();
        if (jLxb <= 0) {
            jLxb = 1;
        } else if (jLxb > 100) {
            jLxb = 100;
        }
        String str3 = str + " DESC limit " + jLxb;
        ArrayList arrayList = new ArrayList();
        this.Lxb.clear();
        long jKqm = OY.ebl().kqm();
        if (jKqm > 0) {
            strArr = new String[]{String.valueOf(System.currentTimeMillis() - jKqm)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (com.bytedance.sdk.component.lc.Lxb.lk.Lxb.ZU() && ZU() == 3) {
            cursorLxb = com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.lk.Lxb(JXs(), LD(), new String[]{"id", AppMeasurementSdk.ConditionalUserProperty.VALUE, "encrypt", "channel"}, str2, strArr, null, null, str3);
        } else {
            cursorLxb = com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.lk.Lxb(JXs(), LD(), new String[]{"id", AppMeasurementSdk.ConditionalUserProperty.VALUE, "encrypt"}, str2, strArr, null, null, str3);
        }
        if (cursorLxb != null) {
            try {
                com.bytedance.sdk.component.lc.Lxb.JXs jXsVVE = OY.ebl().VVE();
                while (cursorLxb.moveToNext()) {
                    try {
                        String string = cursorLxb.getString(cursorLxb.getColumnIndex("id"));
                        String string2 = cursorLxb.getString(cursorLxb.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        int i2 = cursorLxb.getInt(cursorLxb.getColumnIndex("encrypt"));
                        int i3 = (com.bytedance.sdk.component.lc.Lxb.lk.Lxb.ZU() && ZU() == 3) ? cursorLxb.getInt(cursorLxb.getColumnIndex("channel")) : 0;
                        if (i2 == 1) {
                            string2 = jXsVVE.Lxb(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.Lxb.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(string2);
                            com.bytedance.sdk.component.lc.Lxb.ZU.Lxb.Lxb lxb = new com.bytedance.sdk.component.lc.Lxb.ZU.Lxb.Lxb(string, jSONObject);
                            lxb.Lxb(ZU());
                            lxb.LD(lk());
                            if (com.bytedance.sdk.component.lc.Lxb.lk.Lxb.ZU() && ZU() == 3) {
                                lxb.Lxb(i3);
                            }
                            com.bytedance.sdk.component.lc.Lxb.lk.Lxb.Lxb(jSONObject, lxb);
                            arrayList.add(lxb);
                        }
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                try {
                    cursorLxb.close();
                    if (!this.Lxb.isEmpty()) {
                        Lxb(this.Lxb);
                        this.Lxb.clear();
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                try {
                    cursorLxb.close();
                    if (!this.Lxb.isEmpty()) {
                        Lxb(this.Lxb);
                        this.Lxb.clear();
                    }
                } catch (Exception unused2) {
                }
                throw th2;
            }
        }
        LD();
        arrayList.size();
        return arrayList;
    }

    private void LD(int i, long j) {
        if (j > 0 || i > 0) {
            com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.lk.Lxb(JXs(), LD(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i)});
            LD();
        }
    }

    public static String LD(String str) {
        return DM.B("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    public List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> Lxb(String str) {
        com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxb = this.ZU;
        if (lxb == null) {
            return new ArrayList();
        }
        return Lxb(lxb.LD(), str);
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
        if (this.ZU == null) {
            return false;
        }
        int iLxb = Lxb();
        int iLxb2 = this.ZU.Lxb();
        LD();
        if (com.bytedance.sdk.component.lc.Lxb.lk.Lxb.lk() && (i == 1 || i == 2)) {
            return iLxb > 0;
        }
        return iLxb >= iLxb2;
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
