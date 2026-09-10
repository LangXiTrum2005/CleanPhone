package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.ironsource.B5;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.o;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class n extends a<com.mbridge.msdk.foundation.entity.n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f33506a = "com.mbridge.msdk.foundation.db.n";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static n f33507b;

    private n(f fVar) {
        super(fVar);
    }

    public static n a(f fVar) {
        if (f33507b == null) {
            synchronized (n.class) {
                try {
                    if (f33507b == null) {
                        f33507b = new n(fVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f33507b;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0026 A[EXC_TOP_SPLITTER, PHI: r0 r1
  0x0026: PHI (r0v4 int) = (r0v0 int), (r0v6 int) binds: [B:17:0x0024, B:14:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0026: PHI (r1v3 android.database.Cursor) = (r1v2 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:17:0x0024, B:14:0x001e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public synchronized int d() {
        int i10;
        i10 = 0;
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = getReadableDatabase().rawQuery("select count(*) from reward_report", null);
                if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
                    i10 = cursorRawQuery.getInt(0);
                }
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception unused2) {
                }
            }
            throw th2;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x033c A[EXC_TOP_SPLITTER, PHI: r10 r21
  0x033c: PHI (r10v3 android.database.Cursor) = (r10v2 android.database.Cursor), (r10v14 android.database.Cursor) binds: [B:105:0x033a, B:99:0x0321] A[DONT_GENERATE, DONT_INLINE]
  0x033c: PHI (r21v3 java.util.List<com.mbridge.msdk.foundation.entity.n>) = 
  (r21v2 java.util.List<com.mbridge.msdk.foundation.entity.n>)
  (r21v6 java.util.List<com.mbridge.msdk.foundation.entity.n>)
 binds: [B:105:0x033a, B:99:0x0321] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0342 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x02d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x02d6  */
    public synchronized List<com.mbridge.msdk.foundation.entity.n> a(String str) {
        Cursor cursor;
        List<com.mbridge.msdk.foundation.entity.n> list;
        Cursor cursorQuery;
        Cursor cursor2;
        com.mbridge.msdk.foundation.entity.n nVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        Cursor cursor3;
        com.mbridge.msdk.foundation.entity.n nVar2;
        if (TextUtils.isEmpty(str)) {
            list = null;
        } else {
            try {
                cursorQuery = getReadableDatabase().query("reward_report", null, "key=?", new String[]{str}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        try {
                            if (cursorQuery.getCount() > 0) {
                                ArrayList arrayList3 = new ArrayList();
                                while (cursorQuery.moveToNext()) {
                                    String string = cursorQuery.getString(cursorQuery.getColumnIndex(X3.i.W));
                                    int i10 = cursorQuery.getInt(cursorQuery.getColumnIndex("networkType"));
                                    String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("network_str"));
                                    cursorQuery.getInt(cursorQuery.getColumnIndex("isCompleteView"));
                                    cursorQuery.getInt(cursorQuery.getColumnIndex("watchedMillis"));
                                    int i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(HandleInvocationsFromAdViewer.KEY_VIDEO_LENGTH));
                                    String string3 = cursorQuery.getString(cursorQuery.getColumnIndex("offerUrl"));
                                    String string4 = cursorQuery.getString(cursorQuery.getColumnIndex("reason"));
                                    int i12 = cursorQuery.getInt(cursorQuery.getColumnIndex("result"));
                                    String string5 = cursorQuery.getString(cursorQuery.getColumnIndex(IronSourceConstants.EVENTS_DURATION));
                                    int i13 = cursorQuery.getInt(cursorQuery.getColumnIndex("videoSize"));
                                    String string6 = cursorQuery.getString(cursorQuery.getColumnIndex("campaignId"));
                                    String string7 = cursorQuery.getString(cursorQuery.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_URL));
                                    String string8 = cursorQuery.getString(cursorQuery.getColumnIndex("unitId"));
                                    String string9 = cursorQuery.getString(cursorQuery.getColumnIndex("rid"));
                                    String string10 = cursorQuery.getString(cursorQuery.getColumnIndex("rid_n"));
                                    String string11 = cursorQuery.getString(cursorQuery.getColumnIndex("ad_type"));
                                    String string12 = cursorQuery.getString(cursorQuery.getColumnIndex("resource_type"));
                                    String string13 = cursorQuery.getString(cursorQuery.getColumnIndex("device_id"));
                                    list = null;
                                    try {
                                        String string14 = cursorQuery.getString(cursorQuery.getColumnIndex("creative"));
                                        int i14 = cursorQuery.getInt(cursorQuery.getColumnIndex(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T));
                                        if (str.equals("2000021")) {
                                            try {
                                                try {
                                                    nVar = new com.mbridge.msdk.foundation.entity.n(string, i10, string3, string4, string2);
                                                    nVar.b(string6);
                                                    nVar.v(string7);
                                                    nVar.n(string9);
                                                    nVar.o(string10);
                                                    nVar.u(string8);
                                                    cursor2 = cursorQuery;
                                                    arrayList = arrayList3;
                                                    if (nVar != null) {
                                                        try {
                                                            arrayList2 = arrayList;
                                                            arrayList2.add(nVar);
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            cursorQuery = cursor2;
                                                            e.printStackTrace();
                                                            q0.b(f33506a, e.getMessage());
                                                            if (cursorQuery != null) {
                                                                try {
                                                                    cursorQuery.close();
                                                                } catch (Exception unused) {
                                                                }
                                                            }
                                                            return list;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            cursor = cursor2;
                                                            if (cursor != null) {
                                                                try {
                                                                    cursor.close();
                                                                } catch (Exception unused2) {
                                                                }
                                                            }
                                                            throw th;
                                                        }
                                                    } else {
                                                        arrayList2 = arrayList;
                                                    }
                                                    int i15 = cursor2.getInt(cursor2.getColumnIndex("id"));
                                                    getWritableDatabase().delete("reward_report", "id = ?", new String[]{i15 + ""});
                                                    arrayList3 = arrayList2;
                                                    cursorQuery = cursor2;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    cursor = cursorQuery;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Exception e11) {
                                                e = e11;
                                                e.printStackTrace();
                                                q0.b(f33506a, e.getMessage());
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                return list;
                                            }
                                        } else {
                                            if (str.equals("2000022")) {
                                                nVar2 = new com.mbridge.msdk.foundation.entity.n(string, i10, i11, string3, i12, string5, i13, string2);
                                                nVar2.b(string6);
                                                nVar2.v(string7);
                                                nVar2.n(string9);
                                                nVar2.u(string8);
                                                nVar2.m(string4);
                                                nVar2.o(string10);
                                                nVar2.a(string11);
                                            } else {
                                                if (str.equals("2000025")) {
                                                    nVar2 = new com.mbridge.msdk.foundation.entity.n(string, i10, i11, string3, i12, string5, i13, string2);
                                                } else {
                                                    if (str.equals("2000024")) {
                                                        nVar = new com.mbridge.msdk.foundation.entity.n(string, i10, string3, string4, string2);
                                                    } else if ("2000039".equals(str)) {
                                                        nVar = new com.mbridge.msdk.foundation.entity.n(cursorQuery.getString(cursorQuery.getColumnIndex("h5_click_data")));
                                                    } else {
                                                        if ("2000043".equals(str)) {
                                                            try {
                                                                arrayList = arrayList3;
                                                                cursor3 = cursorQuery;
                                                                try {
                                                                    com.mbridge.msdk.foundation.entity.n nVar3 = new com.mbridge.msdk.foundation.entity.n(str, i12, string5, cursorQuery.getString(cursorQuery.getColumnIndex(CampaignEx.ENDCARD_URL)), string6, string8, string4, cursorQuery.getString(cursorQuery.getColumnIndex("type")));
                                                                    nVar3.n(string9);
                                                                    nVar3.o(string10);
                                                                    if (!TextUtils.isEmpty(string6)) {
                                                                        nVar3.b(string6);
                                                                    }
                                                                    nVar3.a(i14);
                                                                    nVar3.a(string11);
                                                                    nVar3.p(string12);
                                                                    nVar3.d(string13);
                                                                    nVar3.c(string14);
                                                                    nVar = nVar3;
                                                                    cursor2 = cursor3;
                                                                } catch (Exception e12) {
                                                                    e = e12;
                                                                    cursorQuery = cursor3;
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    cursor = cursor3;
                                                                    if (cursor != null) {
                                                                        cursor.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Exception e13) {
                                                                e = e13;
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                cursor3 = cursorQuery;
                                                            }
                                                        } else {
                                                            arrayList = arrayList3;
                                                            Cursor cursor4 = cursorQuery;
                                                            try {
                                                                if ("2000045".equals(str)) {
                                                                    com.mbridge.msdk.foundation.entity.n nVar4 = new com.mbridge.msdk.foundation.entity.n();
                                                                    nVar4.j(str);
                                                                    nVar4.c(i10);
                                                                    nVar4.d(i12);
                                                                    nVar4.b(string6);
                                                                    cursor2 = cursor4;
                                                                    nVar4.t(cursor2.getString(cursor2.getColumnIndex("template_url")));
                                                                    nVar4.m(string4);
                                                                    nVar4.n(string9);
                                                                    nVar4.o(string10);
                                                                    nVar4.u(string8);
                                                                    nVar = nVar4;
                                                                } else {
                                                                    cursor2 = cursor4;
                                                                    if ("2000044".equals(str)) {
                                                                        nVar = new com.mbridge.msdk.foundation.entity.n();
                                                                        nVar.j(str);
                                                                        nVar.c(i10);
                                                                        nVar.b(string6);
                                                                        nVar.i(cursor2.getString(cursor2.getColumnIndex(CampaignEx.JSON_KEY_IMAGE_URL)));
                                                                        nVar.m(string4);
                                                                        nVar.n(string9);
                                                                        nVar.o(string10);
                                                                        nVar.u(string8);
                                                                    } else if ("2000054".equals(str)) {
                                                                        com.mbridge.msdk.foundation.entity.n nVar5 = new com.mbridge.msdk.foundation.entity.n();
                                                                        nVar5.j(str);
                                                                        nVar5.p(string12);
                                                                        nVar5.u(string8);
                                                                        nVar5.d(string13);
                                                                        nVar5.a(string11);
                                                                        nVar5.b(string6);
                                                                        nVar5.n(string9);
                                                                        nVar5.o(string10);
                                                                        nVar5.d(i12);
                                                                        nVar5.m(string4);
                                                                        nVar5.c(i10);
                                                                        nVar5.c(string14);
                                                                        nVar5.a(i14);
                                                                        nVar = nVar5;
                                                                    } else {
                                                                        nVar = null;
                                                                    }
                                                                }
                                                            } catch (Exception e14) {
                                                                e = e14;
                                                                cursor2 = cursor4;
                                                                cursorQuery = cursor2;
                                                                e.printStackTrace();
                                                                q0.b(f33506a, e.getMessage());
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                return list;
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                cursor2 = cursor4;
                                                                cursor = cursor2;
                                                                if (cursor != null) {
                                                                    cursor.close();
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        if (nVar != null) {
                                                            arrayList2 = arrayList;
                                                            arrayList2.add(nVar);
                                                        } else {
                                                            arrayList2 = arrayList;
                                                        }
                                                        int i16 = cursor2.getInt(cursor2.getColumnIndex("id"));
                                                        getWritableDatabase().delete("reward_report", "id = ?", new String[]{i16 + ""});
                                                        arrayList3 = arrayList2;
                                                        cursorQuery = cursor2;
                                                    }
                                                    cursor2 = cursorQuery;
                                                    arrayList = arrayList3;
                                                    if (nVar != null) {
                                                        arrayList2 = arrayList;
                                                        arrayList2.add(nVar);
                                                    } else {
                                                        arrayList2 = arrayList;
                                                    }
                                                    int i17 = cursor2.getInt(cursor2.getColumnIndex("id"));
                                                    getWritableDatabase().delete("reward_report", "id = ?", new String[]{i17 + ""});
                                                    arrayList3 = arrayList2;
                                                    cursorQuery = cursor2;
                                                }
                                                e.printStackTrace();
                                                q0.b(f33506a, e.getMessage());
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                            }
                                            cursor2 = cursorQuery;
                                            arrayList = arrayList3;
                                            nVar = nVar2;
                                            if (nVar != null) {
                                                arrayList2 = arrayList;
                                                arrayList2.add(nVar);
                                            } else {
                                                arrayList2 = arrayList;
                                            }
                                            int i18 = cursor2.getInt(cursor2.getColumnIndex("id"));
                                            getWritableDatabase().delete("reward_report", "id = ?", new String[]{i18 + ""});
                                            arrayList3 = arrayList2;
                                            cursorQuery = cursor2;
                                        }
                                    } catch (Exception e15) {
                                        e = e15;
                                    }
                                }
                                ArrayList arrayList4 = arrayList3;
                                try {
                                    cursorQuery.close();
                                } catch (Exception unused3) {
                                }
                                return arrayList4;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            cursor2 = cursorQuery;
                        }
                    } catch (Exception e16) {
                        e = e16;
                        list = null;
                    }
                }
                list = null;
                if (cursorQuery != null) {
                    cursorQuery = cursorQuery;
                    cursorQuery.close();
                }
            } catch (Exception e17) {
                e = e17;
                list = null;
                cursorQuery = null;
            } catch (Throwable th8) {
                th = th8;
                cursor = null;
            }
        }
        return list;
    }

    public synchronized long a(com.mbridge.msdk.foundation.entity.n nVar) {
        try {
            if (nVar != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(X3.i.W, nVar.n());
                    contentValues.put("networkType", Integer.valueOf(nVar.q()));
                    contentValues.put("network_str", nVar.r());
                    contentValues.put("isCompleteView", Integer.valueOf(nVar.m()));
                    contentValues.put("watchedMillis", Integer.valueOf(nVar.F()));
                    contentValues.put(HandleInvocationsFromAdViewer.KEY_VIDEO_LENGTH, Integer.valueOf(nVar.C()));
                    if (!TextUtils.isEmpty(nVar.s())) {
                        contentValues.put("offerUrl", nVar.s());
                    }
                    if (!TextUtils.isEmpty(nVar.t())) {
                        contentValues.put("reason", URLEncoder.encode(nVar.t(), B5.O));
                    }
                    contentValues.put("result", Integer.valueOf(nVar.x()));
                    contentValues.put(IronSourceConstants.EVENTS_DURATION, nVar.g());
                    contentValues.put("videoSize", Long.valueOf(nVar.D()));
                    contentValues.put("type", nVar.h());
                    String strI = nVar.i();
                    if (!TextUtils.isEmpty(strI)) {
                        contentValues.put(CampaignEx.ENDCARD_URL, strI);
                    }
                    String strE = nVar.E();
                    if (!TextUtils.isEmpty(strE)) {
                        contentValues.put(CampaignEx.JSON_KEY_VIDEO_URL, strE);
                    }
                    String strU = nVar.u();
                    if (!TextUtils.isEmpty(strU)) {
                        contentValues.put("rid", strU);
                    }
                    String strV = nVar.v();
                    if (!TextUtils.isEmpty(strV)) {
                        contentValues.put("rid_n", strV);
                    }
                    String strZ = nVar.z();
                    if (!TextUtils.isEmpty(strZ)) {
                        contentValues.put("template_url", strZ);
                    }
                    String strL = nVar.l();
                    if (!TextUtils.isEmpty(strL)) {
                        contentValues.put(CampaignEx.JSON_KEY_IMAGE_URL, strL);
                    }
                    String strA = nVar.a();
                    if (!TextUtils.isEmpty(strA)) {
                        contentValues.put("ad_type", URLEncoder.encode(strA, B5.O));
                    }
                    contentValues.put("unitId", nVar.B());
                    contentValues.put("campaignId", nVar.d());
                    if ("2000039".equals(nVar.n())) {
                        String strB = o.b(nVar);
                        if (a1.b(strB)) {
                            contentValues.put("h5_click_data", strB);
                        }
                    }
                    String strW = nVar.w();
                    if (!TextUtils.isEmpty(strW)) {
                        contentValues.put("resource_type", URLEncoder.encode(strW, B5.O));
                    }
                    String strF = nVar.f();
                    if (!TextUtils.isEmpty(strF)) {
                        contentValues.put("device_id", URLEncoder.encode(strF, B5.O));
                    }
                    String strE2 = nVar.e();
                    if (!TextUtils.isEmpty(strE2)) {
                        contentValues.put("creative", URLEncoder.encode(strE2, B5.O));
                    }
                    contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(nVar.b()));
                    return getWritableDatabase().insert("reward_report", null, contentValues);
                } catch (Exception e10) {
                    q0.b(f33506a, e10.getMessage());
                }
            }
            return -1L;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
