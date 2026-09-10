package com.smartdigimkt.m2;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.x.d;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    public static boolean a(List<d> list) {
        d dVar;
        if (list == null || list.size() <= 0 || (dVar = list.get(0)) == null) {
            return false;
        }
        return dVar.H2();
    }

    public static int b(d dVar) {
        if (dVar == null || dVar.U1() == null) {
            return 100;
        }
        int iG = dVar.U1().g();
        if (iG == 302 || iG == 802 || iG == 902) {
            return -3;
        }
        if (iG != 904) {
            return 100;
        }
        return !a(dVar.U1().f()) ? -1 : -3;
    }

    public static void a(d dVar, Activity activity) {
        if (dVar == null || dVar.U1() == null) {
            return;
        }
        int iC = dVar.U1().c();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        if (iC == 1) {
            activity.setRequestedOrientation(7);
        } else if (iC != 2) {
            a(activity);
        } else {
            activity.setRequestedOrientation(6);
        }
    }

    private static void a(Activity activity) {
        if (a((Context) activity)) {
            activity.setRequestedOrientation(6);
        } else {
            activity.setRequestedOrientation(7);
        }
    }

    public static int a(d dVar) {
        if (dVar == null || dVar.U1() == null) {
            return 1;
        }
        return dVar.U1().c();
    }

    public static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static String a(long j, Context context) {
        String strO = com.smartdigimkt.n8.c.o(context);
        if (!strO.startsWith(com.smartdigimkt.d2.a.S) && !strO.startsWith(com.smartdigimkt.d2.a.T)) {
            if (strO.startsWith("de")) {
                return androidx.media3.extractor.text.ttml.a.j(j, com.smartdigimkt.d2.a.f34395I, " Sekunden");
            }
            if (strO.startsWith(com.smartdigimkt.d2.a.f34402V)) {
                return j + com.smartdigimkt.d2.a.f34396J;
            }
            if (strO.startsWith(com.smartdigimkt.d2.a.W)) {
                return androidx.media3.extractor.text.ttml.a.j(j, com.smartdigimkt.d2.a.K, " secondes");
            }
            if (strO.startsWith(com.smartdigimkt.d2.a.X)) {
                return androidx.media3.extractor.text.ttml.a.j(j, " ثوان", com.smartdigimkt.d2.a.L);
            }
            if (strO.startsWith(com.smartdigimkt.d2.a.f34403Y)) {
                return androidx.media3.extractor.text.ttml.a.j(j, com.smartdigimkt.d2.a.M, " секунд");
            }
            return androidx.media3.extractor.text.ttml.a.j(j, com.smartdigimkt.d2.a.H, " s");
        }
        return j + " " + context.getString(k.a(context, "sdm_cm_video_auto_play_after", k.f38992h));
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String queryParameter = uri.getQueryParameter("alecfc");
                if (!TextUtils.isEmpty(queryParameter) && queryParameter.equals("1")) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String queryParameter = uri.getQueryParameter(str2);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return queryParameter;
                }
            }
            return "";
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.printStackTrace();
            }
            return "";
        }
    }
}
