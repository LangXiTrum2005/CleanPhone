package com.p004ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p004ironsource.ac;
import com.p004ironsource.d8;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.environment.thread.IronSourceThreadManager;
import com.p004ironsource.h7;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.q9;
import com.p004ironsource.wj;
import com.p004ironsource.zb;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f25924a = "BANNER";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f25925b = "LARGE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f25926c = "RECTANGLE";
    public static final String d = "LEADERBOARD";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f25927e = "SMART";
    public static final String f = "CUSTOM";
    public static final String g = "MEDIUM_RECTANGLE";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f25928h = "bannerAdSize";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f25929i = 0;
    public static final int j = 1;
    public static final int k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f25930l = 3;
    public static final int m = 4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f25931n = 5;
    public static final int o = 6;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f25932p = -1;
    public static final String q = "Adaptive=true";

    public interface a {
        void a(Map<String, Object> map, List<String> list, StringBuilder sb);
    }

    public interface b {
        void a();

        void a(String str);
    }

    public static int a(int i2) {
        int iA = -1;
        try {
            iA = a(a(c.b()), i2);
            a(i2, iA);
            IronLog.API.verbose("Maximal height - " + iA + " for width - " + i2);
            return iA;
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error("Failed to get adaptive height: " + e2.getMessage());
            return iA;
        }
    }

    public static boolean c(IronSourceBannerLayout ironSourceBannerLayout) {
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }

    private static int a(Object obj, int i2) {
        if (obj instanceof AbstractAdapter) {
            return ((AbstractAdapter) obj).getAdaptiveHeight(i2);
        }
        if (obj instanceof LevelPlayBaseAdapter) {
            return ((LevelPlayBaseAdapter) obj).getAdaptiveHeight(i2);
        }
        return -1;
    }

    public static int b(int i2) {
        if (p.j().M()) {
            return a(i2);
        }
        IronLog.API.error("The mediation must be successfully initiated before calling this API");
        return -1;
    }

    private static int a(Map<String, Object> map, int i2) {
        int iMax = -1;
        for (Object obj : map.values()) {
            try {
                iMax = Math.max(iMax, a(obj, i2));
            } catch (Throwable th) {
                a(obj, th);
            }
        }
        return iMax;
    }

    public static ISBannerSize b() {
        if (AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())) {
            a(f25927e, 728, 90);
        }
        return a(f25927e, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
    }

    public static long a(long j2, long j3) {
        return j3 - (new Date().getTime() - j2);
    }

    public static void b(IronSourceBannerLayout ironSourceBannerLayout) {
        ISBannerSize size;
        if (ironSourceBannerLayout == null || (size = ironSourceBannerLayout.getSize()) == null || !size.isSmart()) {
            return;
        }
        ISBannerSize iSBannerSizeB = b();
        iSBannerSizeB.setContainerParams(size.containerParams);
        iSBannerSizeB.setAdaptive(size.isAdaptive());
        ironSourceBannerLayout.setBannerSize(iSBannerSizeB);
    }

    public static ISBannerSize a() {
        return new ISBannerSize(d, 728, 90);
    }

    public static ISBannerSize a(String str, int i2, int i3) {
        return new ISBannerSize(str, i2, i3);
    }

    public static String a(ISBannerSize iSBannerSize) {
        return "Adaptive=true, size: " + iSBannerSize.containerParams.getWidth() + "x" + iSBannerSize.containerParams.getHeight() + "; fallback: " + iSBannerSize.getDescription() + ", size: " + iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight() + ";";
    }

    private static Map<String, Object> a(c cVar) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(cVar.a());
        concurrentHashMap.putAll(cVar.c());
        return concurrentHashMap;
    }

    private static void a(int i2, int i3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (i3 == -1) {
                jSONObject.put("errorCode", 2);
                jSONObject.put("reason", "No networks found supporting adaptive banners");
            } else {
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, "w:" + i2 + ",h:" + i3);
            }
            wj.i().a(new zb(ac.BN_GET_MAXIMAL_ADAPTIVE_HEIGHT, jSONObject));
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public static void a(IronSourceBannerLayout ironSourceBannerLayout) {
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.a();
        }
    }

    private static void a(IronSourceBannerLayout ironSourceBannerLayout, View view, Context context, ISBannerSize iSBannerSize) {
        int iDpToPixels = AdapterUtils.dpToPixels(context, iSBannerSize.containerParams.getWidth());
        int iDpToPixels2 = AdapterUtils.dpToPixels(context, iSBannerSize.containerParams.getHeight());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iDpToPixels, iDpToPixels2);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setGravity(17);
        relativeLayout.addView(view, 0);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ironSourceBannerLayout.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iDpToPixels, iDpToPixels2);
        }
        layoutParams2.height = iDpToPixels2;
        layoutParams2.width = iDpToPixels;
        layoutParams2.gravity = 17;
        ironSourceBannerLayout.setLayoutParams(layoutParams2);
        IronLog.INTERNAL.verbose("containerParams height - " + iSBannerSize.containerParams.getHeight() + " width - " + iSBannerSize.containerParams.getWidth());
        ironSourceBannerLayout.addView(relativeLayout, 0, layoutParams2);
    }

    public static void a(IronSourceBannerLayout ironSourceBannerLayout, View view, FrameLayout.LayoutParams layoutParams) {
        a(ironSourceBannerLayout, view, layoutParams, (d8) null);
    }

    public static void a(IronSourceBannerLayout ironSourceBannerLayout, View view, FrameLayout.LayoutParams layoutParams, d8 d8Var) {
        if (ironSourceBannerLayout == null || view == null || layoutParams == null) {
            return;
        }
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new J.a(ironSourceBannerLayout, view, ironSourceBannerLayout.getSize(), applicationContext, layoutParams, d8Var, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(IronSourceBannerLayout ironSourceBannerLayout, View view, ISBannerSize iSBannerSize, Context context, FrameLayout.LayoutParams layoutParams, d8 d8Var) {
        try {
            ironSourceBannerLayout.removeAllViews();
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            if (iSBannerSize != null) {
                if (iSBannerSize.isAdaptive()) {
                    a(ironSourceBannerLayout, view, context, iSBannerSize);
                } else {
                    ironSourceBannerLayout.addView(view, 0, layoutParams);
                }
            }
            if (d8Var != null) {
                d8Var.a();
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error("Error while binding a banner - " + Log.getStackTraceString(e2));
        }
    }

    public static void a(IronSourceBannerLayout ironSourceBannerLayout, h7 h7Var, b bVar) {
        String strConcat;
        if (c(ironSourceBannerLayout)) {
            strConcat = null;
        } else {
            strConcat = "can't load banner - ".concat(ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed");
        }
        if (h7Var == null || TextUtils.isEmpty(h7Var.getPlacementName())) {
            strConcat = "can't load banner - ".concat(h7Var == null ? "placement is null" : "placement name is empty");
        }
        if (TextUtils.isEmpty(strConcat)) {
            bVar.a();
        } else {
            IronLog.INTERNAL.error(strConcat);
            bVar.a(strConcat);
        }
    }

    public static void a(IronSourceBannerLayout ironSourceBannerLayout, b bVar) {
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            bVar.a("can't destroy banner - ".concat(ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed"));
        } else {
            bVar.a();
        }
    }

    private static void a(Object obj, Throwable th) {
        String simpleName = obj != null ? obj.getClass().getSimpleName() : "unknown";
        q9.d().a(th);
        IronLog ironLog = IronLog.INTERNAL;
        StringBuilder sbY = android.support.v4.media.a.y("Exception while calling getAdaptiveHeight for adapter - ", simpleName, ": ");
        sbY.append(th.getMessage());
        ironLog.error(sbY.toString());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac A[Catch: Exception -> 0x00d6, TryCatch #0 {Exception -> 0x00d6, blocks: (B:4:0x0004, B:5:0x0011, B:35:0x0062, B:42:0x00a6, B:44:0x00ac, B:46:0x00b6, B:47:0x00d2, B:36:0x008b, B:41:0x00a3, B:37:0x0090, B:38:0x0095, B:39:0x009a, B:40:0x009f, B:7:0x0015, B:10:0x001f, B:13:0x0029, B:16:0x0033, B:19:0x003d, B:22:0x0047), top: B:52:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6 A[Catch: Exception -> 0x00d6, TryCatch #0 {Exception -> 0x00d6, blocks: (B:4:0x0004, B:5:0x0011, B:35:0x0062, B:42:0x00a6, B:44:0x00ac, B:46:0x00b6, B:47:0x00d2, B:36:0x008b, B:41:0x00a3, B:37:0x0090, B:38:0x0095, B:39:0x009a, B:40:0x009f, B:7:0x0015, B:10:0x001f, B:13:0x0029, B:16:0x0033, B:19:0x003d, B:22:0x0047), top: B:52:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x00b6, please report this as an issue */
    public static void a(Map<String, Object> map, ISBannerSize iSBannerSize) {
        byte b2;
        int i2;
        String strA;
        if (iSBannerSize != null) {
            try {
                String description = iSBannerSize.getDescription();
                switch (description.hashCode()) {
                    case -387072689:
                        if (!description.equals(f25926c)) {
                            b2 = -1;
                        } else {
                            b2 = 2;
                        }
                        break;
                    case 72205083:
                        if (!description.equals(f25925b)) {
                            b2 = -1;
                        } else {
                            b2 = 1;
                        }
                        break;
                    case 79011241:
                        if (!description.equals(f25927e)) {
                            b2 = -1;
                        } else {
                            b2 = 4;
                        }
                        break;
                    case 446888797:
                        if (!description.equals(d)) {
                            b2 = -1;
                        } else {
                            b2 = 3;
                        }
                        break;
                    case 1951953708:
                        if (!description.equals("BANNER")) {
                            b2 = -1;
                        } else {
                            b2 = 0;
                        }
                        break;
                    case 1999208305:
                        if (!description.equals(f)) {
                            b2 = -1;
                        } else {
                            b2 = 5;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 == 0) {
                    i2 = 1;
                } else if (b2 == 1) {
                    i2 = 2;
                } else if (b2 == 2) {
                    i2 = 3;
                } else {
                    if (b2 != 3) {
                        if (b2 == 4) {
                            i2 = 5;
                        } else if (b2 == 5) {
                            map.put(f25928h, 6);
                            map.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
                        }
                        if (iSBannerSize.isAdaptive()) {
                            strA = a(iSBannerSize);
                            if (map.containsKey(IronSourceConstants.EVENTS_EXT1)) {
                                strA = map.get(IronSourceConstants.EVENTS_EXT1) + " , " + a(iSBannerSize);
                            }
                            map.put(IronSourceConstants.EVENTS_EXT1, strA);
                        }
                    }
                    i2 = 4;
                }
                map.put(f25928h, i2);
                if (iSBannerSize.isAdaptive()) {
                    strA = a(iSBannerSize);
                    if (map.containsKey(IronSourceConstants.EVENTS_EXT1)) {
                        strA = map.get(IronSourceConstants.EVENTS_EXT1) + " , " + a(iSBannerSize);
                    }
                    map.put(IronSourceConstants.EVENTS_EXT1, strA);
                }
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(Log.getStackTraceString(e2));
            }
        }
    }

    public static boolean a(ISContainerParams iSContainerParams, int i2, int i3) {
        if (iSContainerParams == null || iSContainerParams.getWidth() <= 0 || iSContainerParams.getHeight() <= 0) {
            IronLog.API.warning("Container size is invalid: Default banner size will be used.");
            return false;
        }
        if (iSContainerParams.getWidth() >= i2 && iSContainerParams.getHeight() >= i3) {
            return true;
        }
        IronLog.API.warning("Container size too small: Banner may not display correctly.");
        return true;
    }
}
