package com.mbridge.msdk.click;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.widget.Toast;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.f0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static Handler f31636a = new a(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String str;
            String str2;
            String string;
            super.handleMessage(message);
            try {
                if (message.what == 1000) {
                    int i10 = message.arg1;
                    int i11 = message.arg2;
                    Bundle data = message.getData();
                    if (data != null) {
                        String string2 = data.getString("rid");
                        String string3 = data.getString("rid_n");
                        string = data.getString(BidResponsedEx.KEY_CID);
                        str = string2;
                        str2 = string3;
                    } else {
                        str = "";
                        str2 = str;
                        string = str2;
                    }
                    new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.n().d()).a(i10, i11, str, str2, string);
                }
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    th2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f31637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f31638b;

        public b(Context context, String str) {
            this.f31637a = context;
            this.f31638b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = f0.class.getMethod("mia", Context.class, String.class);
                Context context = this.f31637a;
                if (context != null) {
                    method.invoke(null, context, this.f31638b);
                } else {
                    q0.b("CommonClickUtil", "Context is null");
                }
            } catch (Throwable th2) {
                q0.b("CommonClickUtil", th2.getMessage());
            }
        }
    }

    public static boolean a(CampaignEx campaignEx) {
        return d.a(campaignEx);
    }

    public static void b(Context context, String str) {
        Intent launchIntentForPackage;
        List<ResolveInfo> listQueryIntentActivities;
        ResolveInfo next;
        try {
            if (TextUtils.isEmpty(str) || !a(context, str) || (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str)) == null || (listQueryIntentActivities = context.getPackageManager().queryIntentActivities(launchIntentForPackage, 0)) == null || listQueryIntentActivities.size() <= 0 || (next = listQueryIntentActivities.iterator().next()) == null) {
                return;
            }
            ActivityInfo activityInfo = next.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            Intent intent = new Intent();
            intent.setComponent(componentName);
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e10) {
            if (com.mbridge.msdk.util.b.a()) {
                Toast.makeText(context, "The app connot start up", 0).show();
            }
            e10.printStackTrace();
        }
    }

    public static void c(Context context, String str) {
        if (str == null || context == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            if (resolveInfoResolveActivity != null) {
                ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
            }
            context.startActivity(intent);
        } catch (Exception e10) {
            e10.printStackTrace();
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent2.addFlags(268435456);
                context.startActivity(intent2);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public static boolean d(Context context, String str) {
        Intent intent;
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri uri = Uri.parse(str);
            if (uri.getScheme().equals("intent")) {
                intent = Intent.parseUri(str, 1);
            } else if (uri.getScheme().equals("android-app")) {
                intent = Intent.parseUri(str, 2);
            } else {
                intent = new Intent("android.intent.action.VIEW", uri);
                intent.setData(uri);
            }
            if (intent == null) {
                return false;
            }
            intent.setComponent(null);
            intent.setSelector(null);
            if (a(context, intent)) {
                return true;
            }
            intent.setFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Throwable th2) {
            q0.b("CommonClickUtil", th2.getMessage(), th2);
            return false;
        }
    }

    public static void e(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            int i10 = MBCommonActivity.f31378e;
            Intent intent = new Intent(context, (Class<?>) MBCommonActivity.class);
            intent.putExtra("url", str);
            if (!(context instanceof ContextThemeWrapper)) {
                intent.setFlags(268435456);
            }
            context.startActivity(intent);
        } catch (ClassNotFoundException e10) {
            q0.b("CommonClickUtil", e10.getMessage());
        } catch (Throwable th2) {
            q0.b("CommonClickUtil", th2.getMessage());
        }
    }

    public static String a(String str, String str2, String str3) {
        Map<String, com.mbridge.msdk.setting.b.a> mapL;
        try {
            if (!TextUtils.isEmpty(str)) {
                String host = Uri.parse(str).getHost();
                com.mbridge.msdk.setting.g gVarF = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarF != null && (mapL = gVarF.l()) != null && !TextUtils.isEmpty(host)) {
                    Iterator<Map.Entry<String, com.mbridge.msdk.setting.b.a>> it = mapL.entrySet().iterator();
                    while (it.hasNext()) {
                        String key = it.next().getKey();
                        if (!TextUtils.isEmpty(key) && host.contains(key)) {
                            com.mbridge.msdk.setting.b.a aVar = mapL.get(key);
                            if (aVar == null) {
                                break;
                            }
                            return a(a(a(a(str, aVar.a(), String.valueOf(m0.m(com.mbridge.msdk.foundation.controller.c.n().d()))), aVar.b(), String.valueOf(m0.n(com.mbridge.msdk.foundation.controller.c.n().d()))), aVar.c(), str2), aVar.d(), str3);
                        }
                    }
                }
            }
            return str;
        } catch (Exception e10) {
            e10.printStackTrace();
            return str;
        }
    }

    private static String a(String str, List<String> list, String str2) {
        if (list != null) {
            for (String str3 : list) {
                if (!TextUtils.isEmpty(str3)) {
                    str = str.replaceAll(str3, str2);
                }
            }
        }
        return str;
    }

    public static boolean a(Context context, String str) {
        if (str != null && !"".equals(str)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, Segment.SIZE);
                if (packageInfo != null) {
                    return str.equals(packageInfo.packageName);
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean a(Context context, Intent intent) {
        try {
            if (context instanceof Activity) {
                context.startActivity(intent);
                return true;
            }
            if (com.mbridge.msdk.foundation.controller.c.n().f() != null) {
                Context contextF = com.mbridge.msdk.foundation.controller.c.n().f();
                if (!(contextF instanceof Activity)) {
                    return false;
                }
                contextF.startActivity(intent);
                return true;
            }
            return false;
        } catch (Throwable th2) {
            q0.b("CommonClickUtil", th2.getMessage(), th2);
        }
    }

    public static void a(Context context, int i10, String str) {
        if (i10 == 0) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new b(context, str));
        } catch (Throwable th2) {
            q0.b("CommonClickUtil", th2.getMessage());
        }
    }
}
