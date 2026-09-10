package com.bytedance.sdk.component.lc.Lxb.LD.LD;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.ebl;
import com.bytedance.sdk.component.lc.Lxb.OY;
import com.bytedance.sdk.component.lc.Lxb.ZU;
import com.bytedance.sdk.component.lc.Lxb.lc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    public static lc Lxb;

    public static void LD() {
        if (OY.ebl().lc() == null) {
            return;
        }
        try {
            lc lcVarLxb = Lxb(OY.ebl().lc());
            if (lcVarLxb != null) {
                lcVarLxb.Lxb(Uri.parse(ZU() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    private static String ZU() {
        return DM.m(new StringBuilder(), ebl.LD, "/ad_log_event/");
    }

    public int Lxb(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public String lk() {
        return "ad_log_event";
    }

    public int Lxb(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public Cursor Lxb(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public Uri Lxb(Uri uri, ContentValues contentValues) {
        return null;
    }

    public static lc Lxb(Context context) {
        try {
            if (Lxb == null) {
                Lxb = OY.ebl().VVE().JVA();
            }
        } catch (Exception unused) {
        }
        return Lxb;
    }

    public static void Lxb() {
        if (OY.ebl().lc() == null) {
            return;
        }
        try {
            lc lcVarLxb = Lxb(OY.ebl().lc());
            if (lcVarLxb != null) {
                lcVarLxb.Lxb(Uri.parse(ZU() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void Lxb(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb) {
        if (lxb == null) {
            return;
        }
        try {
            lc lcVarLxb = Lxb(OY.ebl().lc());
            if (lcVarLxb != null) {
                lcVarLxb.Lxb(Uri.parse(ZU() + "adLogDispatch?event=" + com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.lc.Lxb(lxb.lc())));
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public static void Lxb(String str, List<String> list, boolean z, int i, String str2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.lc.Lxb(it.next()));
                sb.append(",");
            }
            String str3 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.lc.Lxb(sb.toString())) + "&replace=" + String.valueOf(z) + "&urlType=" + String.valueOf(i) + "&adId=" + str2;
            lc lcVarLxb = Lxb(OY.ebl().lc());
            if (lcVarLxb != null) {
                lcVarLxb.Lxb(Uri.parse(ZU() + "trackAdUrl" + str3));
            }
        } catch (Throwable unused) {
        }
    }

    public static void Lxb(String str, boolean z) {
        if (OY.ebl().VVE().lc() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        try {
            lc lcVarLxb = Lxb(OY.ebl().lc());
            if (lcVarLxb != null) {
                lcVarLxb.Lxb(Uri.parse(ZU() + "trackAdFailed?did=" + String.valueOf(str) + "&triggerOnInit=" + z));
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0019  */
    public String Lxb(Uri uri) {
        int i;
        com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxbLk;
        byte b = 2;
        String str = uri.getPath().split("/")[2];
        str.getClass();
        switch (str.hashCode()) {
            case -482705237:
                if (str.equals("trackAdFailed")) {
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case -171493183:
                if (str.equals("adLogStart")) {
                    b = 1;
                } else {
                    b = -1;
                }
                break;
            case 964299715:
                if (!str.equals("adLogStop")) {
                    b = -1;
                }
                break;
            case 1025736635:
                if (str.equals("adLogDispatch")) {
                    b = 3;
                } else {
                    b = -1;
                }
                break;
            case 1131732929:
                if (str.equals("trackAdUrl")) {
                    b = 4;
                } else {
                    b = -1;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                com.bytedance.sdk.component.lc.Lxb.lc.Lxb.Lxb().Lxb(uri.getQueryParameter("did"), uri.getBooleanQueryParameter("triggerOnInit", false));
                break;
            case 1:
                OY.ebl().QAg();
                break;
            case 2:
                OY.ebl().JVA();
                break;
            case 3:
                String queryParameter = uri.getQueryParameter(NotificationCompat.CATEGORY_EVENT);
                if (!TextUtils.isEmpty(queryParameter) && (lxbLk = com.bytedance.sdk.component.lc.Lxb.ZU.Lxb.Lxb.lk(com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.lc.LD(queryParameter))) != null) {
                    ZU.Lxb.Lxb(lxbLk);
                    break;
                }
                break;
            case 4:
                try {
                    String queryParameter2 = uri.getQueryParameter("did");
                    boolean zBooleanValue = Boolean.valueOf(uri.getQueryParameter("replace")).booleanValue();
                    String queryParameter3 = uri.getQueryParameter("track");
                    String queryParameter4 = uri.getQueryParameter("urlType");
                    String queryParameter5 = uri.getQueryParameter("adId");
                    String[] strArrSplit = com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.lc.LD(queryParameter3).split(",");
                    if (strArrSplit.length > 0) {
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : strArrSplit) {
                            String strLD = com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.lc.LD(str2);
                            if (!TextUtils.isEmpty(strLD)) {
                                arrayList.add(strLD);
                            }
                        }
                        try {
                            i = TextUtils.isEmpty(queryParameter4) ? 0 : Integer.parseInt(queryParameter4);
                        } catch (Exception unused) {
                            i = 0;
                        }
                        com.bytedance.sdk.component.lc.Lxb.lc.Lxb.Lxb().Lxb(queryParameter2, arrayList, zBooleanValue, null, i, queryParameter5);
                    }
                } catch (Throwable unused2) {
                    return null;
                }
                break;
        }
        return null;
    }
}
