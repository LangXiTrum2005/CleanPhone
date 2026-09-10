package com.mbridge.msdk.video.dynview.util;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static int a(CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getRewardTemplateMode() == null) {
            return 1;
        }
        return campaignEx.getRewardTemplateMode().g();
    }

    public static int b(CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getRewardTemplateMode() == null) {
            return 100;
        }
        int iK = campaignEx.getRewardTemplateMode().k();
        if (iK == 302 || iK == 802 || iK == 902) {
            return -3;
        }
        if (iK != 904) {
            return 100;
        }
        return !a(campaignEx.getRewardTemplateMode().j()) ? -1 : -3;
    }

    public static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static String a(long j10, Context context) {
        String strP = m0.p(context);
        if (strP.startsWith("zh")) {
            if (!strP.contains("TW") && !strP.contains("HK")) {
                return j10 + " 秒后自动播放";
            }
            return j10 + " 秒後自動播放";
        }
        if (strP.startsWith("ja")) {
            return j10 + " 秒後自動的に再生 ";
        }
        if (strP.startsWith(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR)) {
            return e.j(j10, "Automatische Wiedergabe nach ", " Sekunden");
        }
        if (strP.startsWith("ko")) {
            return j10 + " 초 후 자동 재생 ";
        }
        if (strP.startsWith("fr")) {
            return e.j(j10, "Lecture de vidéo dans ", " secondes");
        }
        if (strP.startsWith("ar")) {
            return e.j(j10, " ثوان", "لعب تلقائيا بعد ");
        }
        if (strP.startsWith("ru")) {
            return e.j(j10, "Автовоспроизведение через ", " секунд");
        }
        return e.j(j10, "Auto play after ", " s");
    }

    public static String a(Context context, int i10) {
        String str;
        if (i10 == 1) {
            str = "_por";
        } else {
            str = "_land";
        }
        String strP = m0.p(context);
        if (strP.startsWith("zh")) {
            if (!strP.contains("TW") && !strP.contains("HK")) {
                return "mbridge_reward_two_title_zh";
            }
            return "mbridge_reward_two_title_zh_trad";
        }
        if (strP.startsWith("ja")) {
            return "mbridge_reward_two_title_japan".concat(str);
        }
        if (strP.startsWith(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR)) {
            return "mbridge_reward_two_title_germany".concat(str);
        }
        if (strP.startsWith("ko")) {
            return "mbridge_reward_two_title_korea".concat(str);
        }
        if (strP.startsWith("fr")) {
            return "mbridge_reward_two_title_france".concat(str);
        }
        if (strP.startsWith("ar")) {
            return "mbridge_reward_two_title_arabia".concat(str);
        }
        if (strP.startsWith("ru")) {
            return "mbridge_reward_two_title_russian".concat(str);
        }
        return "mbridge_reward_two_title_en".concat(str);
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
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return "";
        }
    }
}
