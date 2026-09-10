package com.mbridge.msdk.foundation.tools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class u0 extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static char[] f34198a = {'a', 'n', 'd', 'r', 'o', 'i', 'd', 'c', 'o', 'n', 't', 'e', 'n', 't', 'p', 'm', 'g', 'e', 't', 'C', 'o', 'n', 't', 'e', 'x', 't'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f34199b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static LinearLayout f34200c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {
        public static boolean a(Context context, String str, NativeListener.NativeTrackingListener nativeTrackingListener) {
            try {
                List<ResolveInfo> listA = a(context);
                if (listA != null && listA.size() > 0) {
                    String strA = a(str);
                    if (TextUtils.isEmpty(strA)) {
                        return false;
                    }
                    Intent intentB = b(context);
                    intentB.setData(Uri.parse(strA));
                    intentB.addFlags(268435456);
                    Iterator<ResolveInfo> it = listA.iterator();
                    while (it.hasNext()) {
                        if (it.next().activityInfo.packageName.equals("com.android.vending")) {
                            intentB.setPackage("com.android.vending");
                            break;
                        }
                    }
                    context.startActivity(intentB);
                    u0.a(nativeTrackingListener);
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                q0.b("SDKUtil", Log.getStackTraceString(th2));
                return false;
            }
        }

        public static Intent b(Context context) {
            return new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.package.name"));
        }

        public static boolean c(String str) {
            Uri uri;
            try {
                if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || TextUtils.isEmpty(uri.getHost())) {
                    return false;
                }
                return uri.getHost().equals("play.google.com") || uri.getHost().equals("market.android.com");
            } catch (Throwable th2) {
                q0.b("SDKUtil", Log.getStackTraceString(th2));
            }
            return false;
        }

        public static boolean d(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                return Uri.parse(str).getScheme().equals("market");
            } catch (Throwable th2) {
                q0.b("SDKUtil", Log.getStackTraceString(th2));
                return false;
            }
        }

        public static boolean b(String str) {
            return d(str) || c(str);
        }

        public static List<ResolveInfo> a(Context context) {
            try {
                return context.getPackageManager().queryIntentActivities(b(context), 0);
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        }

        public static String a(String str) {
            if (d(str)) {
                return str;
            }
            if (c(str)) {
                return defpackage.e.n("market://", str.substring(str.indexOf("details?id=")));
            }
            return null;
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new File(com.mbridge.msdk.foundation.same.directory.e.a(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_IMG), b(str)).getAbsolutePath();
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.lastIndexOf("/") == -1) {
            return str.hashCode() + "";
        }
        return (str.substring(str.lastIndexOf("/") + 1).hashCode() + str.hashCode()) + "";
    }

    public static void a(Context context, String str, NativeListener.NativeTrackingListener nativeTrackingListener) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            boolean z10 = listQueryIntentActivities.size() > 0;
            if (!str.startsWith("market://")) {
                if (str.startsWith("https://play.google.com/")) {
                    a(context, "market://details?id=" + str.replace("https://play.google.com/store/apps/details?id=", ""), nativeTrackingListener);
                    return;
                }
                return;
            }
            if (!z10) {
                a(context, "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", ""), (BaseTrackingListener) nativeTrackingListener);
                return;
            }
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (it.next().activityInfo.packageName.equals("com.android.vending")) {
                    intent.setClassName("com.android.vending", "com.android.vending.AssetBrowserActivity");
                    break;
                }
            }
            try {
                context.startActivity(intent);
                a(nativeTrackingListener);
            } catch (Exception unused) {
                a(context, "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", ""), (BaseTrackingListener) nativeTrackingListener);
            }
        } catch (Exception e10) {
            q0.b("SDKUtil", e10.getMessage());
        }
    }

    public static void b(Campaign campaign, ViewGroup viewGroup) {
        a(campaign, viewGroup, 0, 0);
    }

    public static void a(Campaign campaign, ViewGroup viewGroup) {
        if (campaign != null) {
            CampaignEx campaignEx = (CampaignEx) campaign;
            if (campaignEx.getLinkType() == 8 && campaignEx.getAabEntity() != null && campaignEx.getAabEntity().getHlp() == 1) {
                if (viewGroup == null) {
                    q0.d("SDKUtil", "hide linkType==8 loading view failed. viewGroup is null");
                    return;
                }
                try {
                    LinearLayout linearLayout = f34200c;
                    if (linearLayout == null) {
                        return;
                    }
                    viewGroup.removeView(linearLayout);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
    }

    public static void a(Context context, String str, BaseTrackingListener baseTrackingListener) {
        a(context, str, baseTrackingListener, (CampaignEx) null, new ArrayList());
    }

    public static void a(Context context, String str, CampaignEx campaignEx, NativeListener.NativeTrackingListener nativeTrackingListener, List<String> list) {
        if (context == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("url", str);
        if (list != null) {
            list.add("web_view");
        }
        if (f34199b) {
            a(context, str, nativeTrackingListener, campaignEx, list);
            return;
        }
        try {
            int i10 = MBCommonActivity.f31378e;
            Intent intent = new Intent(context, (Class<?>) MBCommonActivity.class);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (a.d(str)) {
                str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
            }
            intent.putExtra("url", str);
            q0.c("url", "webview url = " + str);
            intent.setFlags(268435456);
            intent.putExtra("mvcommon", campaignEx);
            context.startActivity(intent);
            eVar.a("result", 1);
            eVar.a("replaced_url", str);
        } catch (Exception unused) {
            eVar.a("result", 2);
            a(context, str, nativeTrackingListener, campaignEx, list);
        }
        eVar.a("type", 9);
        if (list != null) {
            eVar.a("click_path", list.toString());
        }
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000150", campaignEx, eVar);
    }

    public static void a(Context context, String str, BaseTrackingListener baseTrackingListener, CampaignEx campaignEx, List<String> list) {
        if (str == null || context == null) {
            return;
        }
        if (list != null) {
            list.add("browser");
        }
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("url", str);
        try {
            if (a.d(str)) {
                str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setComponent(null);
            intent.setSelector(null);
            intent.addFlags(268435456);
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            if (resolveInfoResolveActivity != null) {
                ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
            }
            context.startActivity(intent);
            a(baseTrackingListener);
            eVar.a("result", 1);
            eVar.a("replaced_url", str);
        } catch (Exception e10) {
            e10.printStackTrace();
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent2.addFlags(268468224);
                context.startActivity(intent2);
                a(baseTrackingListener);
                eVar.a("result", 1);
            } catch (Exception e11) {
                e11.printStackTrace();
                eVar.a("result", 2);
            }
        }
        try {
            eVar.a("type", 5);
            if (list != null) {
                eVar.a("click_path", list.toString());
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000150", campaignEx, eVar);
        } catch (Exception unused) {
        }
    }

    public static void a(BaseTrackingListener baseTrackingListener) {
        if (baseTrackingListener instanceof NativeListener.TrackingExListener) {
            ((NativeListener.TrackingExListener) baseTrackingListener).onLeaveApp();
        }
    }

    public static void a(Context context, String str, CampaignEx campaignEx, com.mbridge.msdk.click.a aVar, BaseTrackingListener baseTrackingListener, List<String> list) {
        CampaignEx campaignEx2;
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("type", 9);
        eVar.a("url", str);
        try {
            BrowserView browserView = new BrowserView(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
            browserView.setLayoutParams(new LinearLayout.LayoutParams(m0.n(context), m0.m(context)));
            campaignEx2 = campaignEx;
            try {
                browserView.setListener(new com.mbridge.msdk.foundation.webview.a(context, campaignEx2, aVar, browserView, baseTrackingListener));
                browserView.loadUrl(str);
                eVar.a("result", "1");
            } catch (Exception e10) {
                e = e10;
                q0.b("SDKUtil", e.getMessage());
                eVar.a("result", "2");
            }
        } catch (Exception e11) {
            e = e11;
            campaignEx2 = campaignEx;
        }
        if (list != null) {
            eVar.a("click_path", list.toString());
        }
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000150", campaignEx2, eVar);
    }

    public static void a(Campaign campaign, ViewGroup viewGroup, int i10, int i11) {
        if (campaign != null) {
            CampaignEx campaignEx = (CampaignEx) campaign;
            if (campaignEx.getLinkType() == 8 && campaignEx.getAabEntity() != null && campaignEx.getAabEntity().getHlp() == 1) {
                if (viewGroup == null) {
                    q0.d("SDKUtil", "show linkType==8 loading view failed. viewGroup is null");
                    return;
                }
                try {
                    if (f34200c == null) {
                        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                        if (contextD instanceof Activity) {
                            f34200c = (LinearLayout) LayoutInflater.from(contextD.getApplicationContext()).inflate(i0.a(contextD.getApplicationContext(), "mbridge_cm_loading_layout", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
                        } else {
                            f34200c = (LinearLayout) LayoutInflater.from(contextD).inflate(i0.a(contextD, "mbridge_cm_loading_layout", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
                        }
                    }
                    int iMin = Math.min(viewGroup.getWidth(), viewGroup.getHeight());
                    int iMin2 = Math.min(Math.max(iMin / 4, 70), iMin);
                    if (viewGroup instanceof FrameLayout) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iMin2, iMin2);
                        layoutParams.gravity = 17;
                        f1.a(f34200c);
                        viewGroup.addView(f34200c, layoutParams);
                        return;
                    }
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iMin2, iMin2);
                    if (i11 == 0 && i10 == 0) {
                        layoutParams2.addRule(13);
                    } else {
                        layoutParams2.leftMargin = i11;
                        layoutParams2.topMargin = i10;
                    }
                    f1.a(f34200c);
                    viewGroup.addView(f34200c, layoutParams2);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }
}
