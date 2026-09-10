package com.bytedance.sdk.openadsdk.core.act;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsService;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.browser.customtabs.EngagementSignalsCallback;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.STP.Lxb.ZU;
import com.bytedance.sdk.openadsdk.core.STP;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private static Boolean JXs = null;
    private static int LD = -1;
    private static String Lxb = null;
    private static volatile boolean ZU = false;
    private static ActServiceConnection lc = null;
    private static int lk = -1;

    private Lxb() {
    }

    public static int LD(Context context) {
        try {
            return !TextUtils.isEmpty(Lxb(context)) ? 1 : 0;
        } catch (Throwable unused) {
        }
    }

    public static int lk() {
        return lk;
    }

    public static int LD() {
        return LD;
    }

    public static String Lxb(final Context context) {
        String str = Lxb;
        if (str != null) {
            return str;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            String str2 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList.add(resolveInfo.activityInfo.packageName);
                }
            }
            if (arrayList.isEmpty()) {
                Lxb = null;
            } else if (!TextUtils.isEmpty(str2) && !Lxb(context, intent) && arrayList.contains(str2)) {
                Lxb = str2;
            } else {
                Lxb = (String) arrayList.get(0);
            }
            if (!TextUtils.isEmpty(Lxb)) {
                synchronized (Lxb.class) {
                    try {
                        if (!ZU) {
                            LD ld = new LD() { // from class: com.bytedance.sdk.openadsdk.core.act.Lxb.1
                                @Override // com.bytedance.sdk.openadsdk.core.act.LD
                                public void Lxb(final CustomTabsClient customTabsClient) {
                                    STP.LD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.act.Lxb.1.1
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            try {
                                                CustomTabsCallback customTabsCallback = new CustomTabsCallback();
                                                EngagementSignalsCallback engagementSignalsCallback = new EngagementSignalsCallback() { // from class: com.bytedance.sdk.openadsdk.core.act.Lxb.1.1.1
                                                    @Override // androidx.browser.customtabs.EngagementSignalsCallback
                                                    public void onGreatestScrollPercentageIncreased(int i, @NonNull Bundle bundle) {
                                                    }

                                                    @Override // androidx.browser.customtabs.EngagementSignalsCallback
                                                    public void onSessionEnded(boolean z, @NonNull Bundle bundle) {
                                                    }

                                                    @Override // androidx.browser.customtabs.EngagementSignalsCallback
                                                    public void onVerticalScrollEvent(boolean z, @NonNull Bundle bundle) {
                                                    }
                                                };
                                                CustomTabsSession customTabsSessionNewSession = customTabsClient.newSession(customTabsCallback);
                                                boolean z = false;
                                                boolean zIsEngagementSignalsApiAvailable = customTabsSessionNewSession != null ? customTabsSessionNewSession.isEngagementSignalsApiAvailable(Bundle.EMPTY) : false;
                                                if (zIsEngagementSignalsApiAvailable) {
                                                    int unused = Lxb.LD = 1;
                                                    boolean engagementSignalsCallback2 = customTabsSessionNewSession.setEngagementSignalsCallback(engagementSignalsCallback, Bundle.EMPTY);
                                                    if (engagementSignalsCallback2) {
                                                        int unused2 = Lxb.lk = 1;
                                                    }
                                                    z = engagementSignalsCallback2;
                                                } else {
                                                    int unused3 = Lxb.LD = 0;
                                                }
                                                if (zIsEngagementSignalsApiAvailable && z) {
                                                    Boolean unused4 = Lxb.JXs = Boolean.TRUE;
                                                } else {
                                                    Boolean unused5 = Lxb.JXs = Boolean.FALSE;
                                                }
                                            } catch (Throwable th) {
                                                sLN.Lxb("CustomTabsHelper", th.getMessage());
                                            }
                                            ActServiceConnection actServiceConnection = Lxb.lc;
                                            if (!Lxb.ZU || actServiceConnection == null) {
                                                return;
                                            }
                                            try {
                                                context.unbindService(actServiceConnection);
                                            } catch (Throwable unused6) {
                                            }
                                        }
                                    });
                                }

                                @Override // com.bytedance.sdk.openadsdk.core.act.LD
                                public void Lxb() {
                                    ActServiceConnection unused = Lxb.lc = null;
                                }
                            };
                            if (lc == null) {
                                lc = new ActServiceConnection(ld);
                            }
                            CustomTabsClient.bindCustomTabsService(context, Lxb, lc);
                            ZU = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            sLN.Lxb("CustomTabsHelper", th2.getMessage());
        }
        com.bytedance.sdk.openadsdk.STP.lk.Lxb("act_package_name", false, new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.core.act.Lxb.2
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            @Nullable
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("package_name", Lxb.Lxb);
                return ZU.LD().Lxb("act_package_name").LD(jSONObject.toString());
            }
        });
        return Lxb;
    }

    public static void LD(int i) {
        lk = i;
    }

    private static boolean Lxb(Context context, Intent intent) {
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            if (listQueryIntentActivities.size() == 0) {
                return false;
            }
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
        } catch (RuntimeException unused) {
        }
        return false;
    }

    public static int Lxb() {
        Boolean bool = JXs;
        return (bool != null && bool.booleanValue()) ? 1 : 0;
    }

    public static void Lxb(int i) {
        LD = i;
    }
}
