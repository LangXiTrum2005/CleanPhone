package ads_mobile_sdk;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import arytenoidectomy.apical;
import arytenoidectomy.marial;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.cutely;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Regex;
import p002kotlin.text.StringsKt;
import p002kotlin.text.dovishness;
import saneness.adultoid;
import saneness.coffeecake;
import saneness.evenfall;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class vy1 implements hemolysin {
    public final Context a;
    public final jk0 b;
    public final ip0 c;
    public final g6 d;
    public final e2 e;
    public final x f;
    public final adultoid g;
    public final adultoid h;
    public final qh1 i;
    public final oh j;
    public final yf2 k;
    public final v30 l;
    public final ch0 m;
    public final h1 n;
    public final gk2 o;
    public final hu1 p;
    public final r22 q;

    public vy1(Context applicationContext, jk0 flags, ip0 gmaUtil, g6 adSpamClient, e2 adEventEmitter, x activityTracker, coffeecake onePieceExpandableContentPresenter, coffeecake twoPieceExpandableContentPresenter, qh1 mraidResizeHandler, oh attributionReportingManager, yf2 requestType, v30 customTabsConnection, ch0 firebaseAnalyticsEventHandler, h1 adConfiguration, gk2 safeBrowsingManager, hu1 offlineOpenHandler, r22 postClickLifecycleMonitor) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(adSpamClient, "adSpamClient");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(onePieceExpandableContentPresenter, "onePieceExpandableContentPresenter");
        Intrinsics.checkNotNullParameter(twoPieceExpandableContentPresenter, "twoPieceExpandableContentPresenter");
        Intrinsics.checkNotNullParameter(mraidResizeHandler, "mraidResizeHandler");
        Intrinsics.checkNotNullParameter(attributionReportingManager, "attributionReportingManager");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(customTabsConnection, "customTabsConnection");
        Intrinsics.checkNotNullParameter(firebaseAnalyticsEventHandler, "firebaseAnalyticsEventHandler");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(safeBrowsingManager, "safeBrowsingManager");
        Intrinsics.checkNotNullParameter(offlineOpenHandler, "offlineOpenHandler");
        Intrinsics.checkNotNullParameter(postClickLifecycleMonitor, "postClickLifecycleMonitor");
        this.a = applicationContext;
        this.b = flags;
        this.c = gmaUtil;
        this.d = adSpamClient;
        this.e = adEventEmitter;
        this.f = activityTracker;
        this.g = onePieceExpandableContentPresenter;
        this.h = twoPieceExpandableContentPresenter;
        this.i = mraidResizeHandler;
        this.j = attributionReportingManager;
        this.k = requestType;
        this.l = customTabsConnection;
        this.m = firebaseAnalyticsEventHandler;
        this.n = adConfiguration;
        this.o = safeBrowsingManager;
        this.p = offlineOpenHandler;
        this.q = postClickLifecycleMonitor;
    }

    public final void a(apical apicalVar, Activity activity, Uri uri, String str, Map map) {
        marial.wireman wiremanVar = new marial.wireman(apicalVar);
        jk0 jk0Var = this.b;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:cct_v2_partial_custom_tab_config:enabled", X3.i.W);
        if (((Boolean) jk0Var.a("gads:cct_v2_partial_custom_tab_config:enabled", Boolean.TRUE, zk.b)).booleanValue()) {
            String str2 = (String) map.get("cct_init_h");
            String str3 = (String) map.get("cct_bp");
            if (str2 != null && !StringsKt.empress(str2) && Integer.parseInt(str2) > 0) {
                wiremanVar.apical(Integer.parseInt(str2));
            }
            if (str3 != null && !StringsKt.empress(str3) && Integer.parseInt(str3) >= 0 && Integer.parseInt(str3) <= 2) {
                wiremanVar.marial(Integer.parseInt(str3));
            }
        }
        marial marialVarAttabal = wiremanVar.attabal();
        Intrinsics.checkNotNullExpressionValue(marialVarAttabal, "build(...)");
        marialVarAttabal.f14372attabal.setPackage(str);
        marialVarAttabal.attabal(activity, uri);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:41:0x011f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0140 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0149  */
    /* JADX WARN: Code duplicated, block: B:49:0x0157  */
    /* JADX WARN: Code duplicated, block: B:52:0x016f  */
    /* JADX WARN: Code duplicated, block: B:60:0x018e  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:? A[LOOP:1: B:58:0x0188->B:81:?, LOOP_END, SYNTHETIC] */
    public final Object b(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        oy1 oy1Var;
        vy1 vy1Var;
        vy1 vy1Var2;
        Uri uriA;
        Intent intent;
        List<ResolveInfo> listQueryIntentActivities;
        ResolveInfo resolveInfoA;
        Uri uriBuild;
        Intent intent2;
        ResolveInfo resolveInfoA2;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo resolveInfo;
        ResolveInfo resolveInfo2;
        Iterator<T> it;
        Intent intent3;
        List<ResolveInfo> listQueryIntentActivities2;
        if (dernVar instanceof oy1) {
            oy1Var = (oy1) dernVar;
            int i = oy1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                oy1Var.f = i - Integer.MIN_VALUE;
            } else {
                oy1Var = new oy1(this, dernVar);
            }
        } else {
            oy1Var = new oy1(this, dernVar);
        }
        Object objA = oy1Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = oy1Var.f;
        Object obj = null;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            String str = (String) map.get("u");
            if (str == null || StringsKt.empress(str)) {
                y13.a("Blank URL for browser open GMSG.", null, 6);
                return null;
            }
            ch0 ch0Var = this.m;
            Uri uri = Uri.parse(str);
            tg0 tg0Var = tg0.b;
            Bundle bundle = this.n.q;
            oy1Var.a = this;
            oy1Var.b = map;
            oy1Var.c = gq0Var;
            oy1Var.f = 1;
            objA = ch0Var.a(uri, tg0Var, bundle, oy1Var);
            if (objA != objBeachfront) {
                vy1Var = this;
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            gq0Var = oy1Var.c;
            map = oy1Var.b;
            vy1Var = oy1Var.a;
            p002kotlin.dern.saneness(objA);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gq0Var = oy1Var.c;
            map = oy1Var.b;
            vy1Var2 = oy1Var.a;
            p002kotlin.dern.saneness(objA);
        }
        uriA = vy1Var2.d.a((Uri) objA, gq0Var);
        intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uriA);
        intent.setAction("android.intent.action.VIEW");
        listQueryIntentActivities = vy1Var2.a.getPackageManager().queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
        resolveInfoA = vy1Var2.a(intent, listQueryIntentActivities);
        if (resolveInfoA != null) {
            Intent intent4 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfoA.activityInfo;
            intent4.setClassName(activityInfo.packageName, activityInfo.name);
            return intent4;
        }
        if (dovishness.stratoscope("http", uriA.getScheme(), true)) {
            if (dovishness.stratoscope(HttpRequest.DEFAULT_SCHEME, uriA.getScheme(), true)) {
                uriBuild = uriA.buildUpon().scheme("http").build();
            }
            return intent;
        }
        uriBuild = uriA.buildUpon().scheme(HttpRequest.DEFAULT_SCHEME).build();
        Intrinsics.beachfront(uriBuild);
        intent2 = new Intent("android.intent.action.VIEW");
        intent2.addFlags(268435456);
        intent2.setData(uriBuild);
        intent2.setAction("android.intent.action.VIEW");
        List<ResolveInfo> listQueryIntentActivities3 = vy1Var2.a.getPackageManager().queryIntentActivities(intent2, 65536);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities3, "queryIntentActivities(...)");
        resolveInfoA2 = vy1Var2.a(intent2, listQueryIntentActivities3);
        if (resolveInfoA2 != null) {
            intent3 = new Intent(intent2);
            ActivityInfo activityInfo2 = resolveInfoA2.activityInfo;
            intent3.setClassName(activityInfo2.packageName, activityInfo2.name);
            listQueryIntentActivities2 = vy1Var2.a.getPackageManager().queryIntentActivities(intent3, 65536);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities2, "queryIntentActivities(...)");
            if (vy1Var2.a(intent3, listQueryIntentActivities2) != null) {
                return intent3;
            }
        }
        if (!listQueryIntentActivities.isEmpty()) {
            if (Boolean.parseBoolean((String) map.get("use_running_process"))) {
                runningAppProcesses = ((ActivityManager) vy1Var2.a.getSystemService(ActivityManager.class)).getRunningAppProcesses();
                loop0: for (Object obj2 : listQueryIntentActivities) {
                    resolveInfo2 = (ResolveInfo) obj2;
                    Intrinsics.beachfront(runningAppProcesses);
                    if ((runningAppProcesses instanceof Collection) || !runningAppProcesses.isEmpty()) {
                        it = runningAppProcesses.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.wireman(resolveInfo2.activityInfo.packageName, ((ActivityManager.RunningAppProcessInfo) it.next()).processName)) {
                                obj = obj2;
                                break loop0;
                            }
                        }
                    }
                }
                resolveInfo = (ResolveInfo) obj;
                if (resolveInfo != null) {
                    Intent intent5 = new Intent(intent);
                    ActivityInfo activityInfo3 = resolveInfo.activityInfo;
                    intent5.setClassName(activityInfo3.packageName, activityInfo3.name);
                    return intent5;
                }
            }
            if (Boolean.parseBoolean((String) map.get("use_first_package"))) {
                ResolveInfo resolveInfo3 = listQueryIntentActivities.get(0);
                Intrinsics.checkNotNullExpressionValue(resolveInfo3, "get(...)");
                Intent intent6 = new Intent(intent);
                ActivityInfo activityInfo4 = resolveInfo3.activityInfo;
                intent6.setClassName(activityInfo4.packageName, activityInfo4.name);
                return intent6;
            }
        }
        return intent;
        oh ohVar = vy1Var.j;
        oy1Var.a = vy1Var;
        oy1Var.b = map;
        oy1Var.c = gq0Var;
        oy1Var.f = 2;
        objA = ohVar.b((Uri) objA, oy1Var);
        if (objA != objBeachfront) {
            vy1Var2 = vy1Var;
            uriA = vy1Var2.d.a((Uri) objA, gq0Var);
            intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            intent.setData(uriA);
            intent.setAction("android.intent.action.VIEW");
            listQueryIntentActivities = vy1Var2.a.getPackageManager().queryIntentActivities(intent, 65536);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
            resolveInfoA = vy1Var2.a(intent, listQueryIntentActivities);
            if (resolveInfoA != null) {
                Intent intent7 = new Intent(intent);
                ActivityInfo activityInfo5 = resolveInfoA.activityInfo;
                intent7.setClassName(activityInfo5.packageName, activityInfo5.name);
                return intent7;
            }
            if (dovishness.stratoscope("http", uriA.getScheme(), true)) {
                if (dovishness.stratoscope(HttpRequest.DEFAULT_SCHEME, uriA.getScheme(), true)) {
                    uriBuild = uriA.buildUpon().scheme("http").build();
                }
                return intent;
            }
            uriBuild = uriA.buildUpon().scheme(HttpRequest.DEFAULT_SCHEME).build();
            Intrinsics.beachfront(uriBuild);
            intent2 = new Intent("android.intent.action.VIEW");
            intent2.addFlags(268435456);
            intent2.setData(uriBuild);
            intent2.setAction("android.intent.action.VIEW");
            List<ResolveInfo> listQueryIntentActivities4 = vy1Var2.a.getPackageManager().queryIntentActivities(intent2, 65536);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities4, "queryIntentActivities(...)");
            resolveInfoA2 = vy1Var2.a(intent2, listQueryIntentActivities4);
            if (resolveInfoA2 != null) {
                intent3 = new Intent(intent2);
                ActivityInfo activityInfo6 = resolveInfoA2.activityInfo;
                intent3.setClassName(activityInfo6.packageName, activityInfo6.name);
                listQueryIntentActivities2 = vy1Var2.a.getPackageManager().queryIntentActivities(intent3, 65536);
                Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities2, "queryIntentActivities(...)");
                if (vy1Var2.a(intent3, listQueryIntentActivities2) != null) {
                    return intent3;
                }
            }
            if (!listQueryIntentActivities.isEmpty()) {
                if (Boolean.parseBoolean((String) map.get("use_running_process"))) {
                    runningAppProcesses = ((ActivityManager) vy1Var2.a.getSystemService(ActivityManager.class)).getRunningAppProcesses();
                    loop0: while (r0.hasNext()) {
                        resolveInfo2 = (ResolveInfo) obj2;
                        Intrinsics.beachfront(runningAppProcesses);
                        if (runningAppProcesses instanceof Collection) {
                        }
                        it = runningAppProcesses.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.wireman(resolveInfo2.activityInfo.packageName, ((ActivityManager.RunningAppProcessInfo) it.next()).processName)) {
                                obj = obj2;
                                break loop0;
                            }
                        }
                    }
                    resolveInfo = (ResolveInfo) obj;
                    if (resolveInfo != null) {
                        Intent intent8 = new Intent(intent);
                        ActivityInfo activityInfo7 = resolveInfo.activityInfo;
                        intent8.setClassName(activityInfo7.packageName, activityInfo7.name);
                        return intent8;
                    }
                }
                if (Boolean.parseBoolean((String) map.get("use_first_package"))) {
                    ResolveInfo resolveInfo4 = listQueryIntentActivities.get(0);
                    Intrinsics.checkNotNullExpressionValue(resolveInfo4, "get(...)");
                    Intent intent9 = new Intent(intent);
                    ActivityInfo activityInfo8 = resolveInfo4.activityInfo;
                    intent9.setClassName(activityInfo8.packageName, activityInfo8.name);
                    return intent9;
                }
            }
            return intent;
        }
        return objBeachfront;
    }

    public final Intent a(String str, Map map, gq0 gq0Var) {
        String str2 = (String) map.get("m");
        String str3 = (String) map.get(TtmlNode.TAG_P);
        String str4 = (String) map.get("c");
        String str5 = (String) map.get("f");
        Intent intent = new Intent();
        Uri uriA = this.d.a(Uri.parse(str), gq0Var);
        if (str2 != null && !StringsKt.empress(str2)) {
            intent.setDataAndType(uriA, str2);
        } else {
            intent.setData(uriA);
        }
        intent.setAction("android.intent.action.VIEW");
        if (str3 != null && !StringsKt.empress(str3)) {
            intent.setPackage(str3);
        }
        if (str4 != null && !StringsKt.empress(str4)) {
            String[] strArr = (String[]) new Regex("/").split(str4, 2).toArray(new String[0]);
            if (strArr.length < 2) {
                y13.a("Could not parse component name from open GMSG: " + str4, null, 6);
                return null;
            }
            intent.setClassName(strArr[0], strArr[1]);
        }
        if (str5 != null && !StringsKt.empress(str5)) {
            try {
                intent.addFlags(Integer.parseInt(str5));
                return intent;
            } catch (NumberFormatException e) {
                y13.a("Could not parse intent flags (" + str5 + "): " + e);
            }
        }
        return intent;
    }

    public final Intent a(Map map) {
        String str = (String) map.get(TtmlNode.TAG_P);
        if (str == null) {
            y13.a("Package name missing from open app action: " + map, null, 6);
            return null;
        }
        return this.a.getPackageManager().getLaunchIntentForPackage(str);
    }

    public final Intent a(Map map, gq0 gq0Var) {
        Intent uri;
        String str = (String) map.get("intent_url");
        if (str == null || StringsKt.empress(str)) {
            uri = null;
        } else {
            try {
                uri = Intent.parseUri(str, 0);
                try {
                    Uri data = uri.getData();
                    if (data != null) {
                        uri.setDataAndType(this.d.a(data, gq0Var), uri.getType());
                    }
                } catch (URISyntaxException e) {
                    e = e;
                    y13.a("Error parsing the intent url (" + str + "): " + e);
                }
            } catch (URISyntaxException e2) {
                e = e2;
                uri = null;
            }
        }
        if (uri != null) {
            return uri;
        }
        String str2 = (String) map.get("u");
        if (str2 != null && !StringsKt.empress(str2)) {
            return a(str2, map, gq0Var);
        }
        y13.a("Blank URL and invalid intent URL for an open GMSG: " + map, null, 6);
        return uri;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0034 A[RETURN] */
    public final ResolveInfo a(Intent intent, List list) {
        ResolveInfo resolveInfoResolveActivity = this.a.getPackageManager().resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity == null) {
            return null;
        }
        for (Object obj : list) {
            if (Intrinsics.wireman(((ResolveInfo) obj).activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                if (obj != null) {
                    return resolveInfoResolveActivity;
                }
                return null;
            }
        }
        obj = null;
        if (obj != null) {
            return resolveInfoResolveActivity;
        }
        return null;
    }

    public static int b(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == 99) {
            return !str.equals("c") ? -1 : 14;
        }
        if (iHashCode != 108) {
            return (iHashCode == 112 && str.equals(TtmlNode.TAG_P)) ? 7 : -1;
        }
        return str.equals("l") ? 6 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007c A[PHI: r1 r2 r4 r7 r8 r9 r11 r12 r13 r14
  0x007c: PHI (r1v14 boolean) = (r1v10 boolean), (r1v18 boolean) binds: [B:45:0x015e, B:19:0x0067] A[DONT_GENERATE, DONT_INLINE]
  0x007c: PHI (r2v15 java.lang.Object) = (r2v14 java.lang.Object), (r2v1 java.lang.Object) binds: [B:45:0x015e, B:19:0x0067] A[DONT_GENERATE, DONT_INLINE]
  0x007c: PHI (r4v8 boolean) = (r4v6 boolean), (r4v11 boolean) binds: [B:45:0x015e, B:19:0x0067] A[DONT_GENERATE, DONT_INLINE]
  0x007c: PHI (r7v6 java.lang.String) = (r7v4 java.lang.String), (r7v12 java.lang.String) binds: [B:45:0x015e, B:19:0x0067] A[DONT_GENERATE, DONT_INLINE]
  0x007c: PHI (r8v6 android.net.Uri) = (r8v4 android.net.Uri), (r8v9 android.net.Uri) binds: [B:45:0x015e, B:19:0x0067] A[DONT_GENERATE, DONT_INLINE]
  0x007c: PHI (r9v7 android.app.Activity) = (r9v4 android.app.Activity), (r9v14 android.app.Activity) binds: [B:45:0x015e, B:19:0x0067] A[DONT_GENERATE, DONT_INLINE]
  0x007c: PHI (r11v9 java.lang.String) = (r11v6 java.lang.String), (r11v10 java.lang.String) binds: [B:45:0x015e, B:19:0x0067] A[DONT_GENERATE, DONT_INLINE]
  0x007c: PHI (r12v7 ads_mobile_sdk.gq0) = (r12v4 ads_mobile_sdk.gq0), (r12v8 ads_mobile_sdk.gq0) binds: [B:45:0x015e, B:19:0x0067] A[DONT_GENERATE, DONT_INLINE]
  0x007c: PHI (r13v6 java.util.Map) = (r13v4 java.util.Map), (r13v10 java.util.Map) binds: [B:45:0x015e, B:19:0x0067] A[DONT_GENERATE, DONT_INLINE]
  0x007c: PHI (r14v6 ads_mobile_sdk.vy1) = (r14v4 ads_mobile_sdk.vy1), (r14v9 ads_mobile_sdk.vy1) binds: [B:45:0x015e, B:19:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0124  */
    /* JADX WARN: Code duplicated, block: B:42:0x0139  */
    /* JADX WARN: Code duplicated, block: B:44:0x0141  */
    /* JADX WARN: Code duplicated, block: B:49:0x016a  */
    /* JADX WARN: Code duplicated, block: B:51:0x016d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0175  */
    /* JADX WARN: Code duplicated, block: B:55:0x017b  */
    /* JADX WARN: Code duplicated, block: B:59:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:70:0x0223  */
    /* JADX WARN: Code duplicated, block: B:76:0x023d  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01e4, code lost:
    
        if (r4.a(r5, true, r7, r8, r9, r10) == r3) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0237, code lost:
    
        if (r4.a(r5, true, r7, r8, r9, r10) == r3) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.Map r26, boolean r27, boolean r28, ads_mobile_sdk.gq0 r29, wretchedly.dern r30) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vy1.a(java.util.Map, boolean, boolean, ads_mobile_sdk.gq0, wretchedly.dern):java.lang.Object");
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_NAME_OPEN;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Boolean a(gq0 webView, String str, wretchedly.dern dernVar) {
        ry1 ry1Var;
        if (dernVar instanceof ry1) {
            ry1Var = (ry1) dernVar;
            int i = ry1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ry1Var.c = i - Integer.MIN_VALUE;
            } else {
                ry1Var = new ry1(this, dernVar);
            }
        } else {
            ry1Var = new ry1(this, dernVar);
        }
        Object obj = ry1Var.a;
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ry1Var.c;
        boolean z = true;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            hu1 hu1Var = this.p;
            hu1Var.getClass();
            Intrinsics.checkNotNullParameter(webView, "webView");
            if (str != null && hu1Var.a.b()) {
                no0 no0Var = no0.CUI_NAME_OFFLINE_OPEN;
                WeakHashMap weakHashMap = j13.a;
                w03 w03VarA = j13.a(no0Var, p002kotlin.collections.adultoid.formularize(), true);
                try {
                    if (hu1Var.c.l.get()) {
                        au1 au1Var = hu1Var.d;
                        String gwsQueryId = hu1Var.b.h;
                        au1Var.getClass();
                        Intrinsics.checkNotNullParameter(gwsQueryId, "gwsQueryId");
                        cutely.wireman(au1Var.a, null, null, new xt1(au1Var, new zt1(au1Var, gwsQueryId, null), null), 3, null);
                    } else {
                        h1 h1Var = hu1Var.a;
                        rt1 rt1Var = h1Var.r0;
                        boolean z2 = rt1Var != null ? rt1Var.c : false;
                        m22 m22Var = h1Var.s0;
                        if (m22Var == null || !m22Var.a || m22Var.b.length() <= 0 || !m22Var.c) {
                            z = false;
                        }
                        if (z2 && z) {
                            jk0 jk0Var = hu1Var.e;
                            jk0Var.getClass();
                            Intrinsics.checkNotNullParameter("gads:skip_offline_notification_flow:enabled", X3.i.W);
                            ((Boolean) jk0Var.a("gads:skip_offline_notification_flow:enabled", Boolean.FALSE, zk.b)).getClass();
                        }
                    }
                    interaction.saneness.attabal(w03VarA, null);
                } catch (Throwable th) {
                    try {
                        w03VarA.b(th);
                        if (!(th instanceof evenfall)) {
                            w03VarA.a(th);
                            if (!(th instanceof TimeoutCancellationException)) {
                                if (!(th instanceof CancellationException)) {
                                    if (th instanceof yn0) {
                                        throw th;
                                    }
                                    throw new gn0(th);
                                }
                                throw new bn0(th);
                            }
                            throw new cp0(th);
                        }
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            interaction.saneness.attabal(w03VarA, th2);
                            throw th3;
                        }
                    }
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return igo.attabal.attabal(false);
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0310  */
    /* JADX WARN: Code duplicated, block: B:124:0x031b  */
    /* JADX WARN: Code duplicated, block: B:155:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:158:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:160:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:162:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:170:0x040c  */
    /* JADX WARN: Code duplicated, block: B:171:0x0415  */
    /* JADX WARN: Code duplicated, block: B:172:0x0417  */
    /* JADX WARN: Code duplicated, block: B:175:0x0422  */
    /* JADX WARN: Code duplicated, block: B:179:0x043d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0448  */
    /* JADX WARN: Code duplicated, block: B:184:0x044b  */
    /* JADX WARN: Code duplicated, block: B:186:0x0453  */
    /* JADX WARN: Code duplicated, block: B:188:0x045a  */
    /* JADX WARN: Code duplicated, block: B:189:0x045c  */
    /* JADX WARN: Code duplicated, block: B:191:0x045f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0462  */
    /* JADX WARN: Code duplicated, block: B:197:0x0484  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x033a, code lost:
    
        if (a(r1, r13, r3, r18, r5) == r11) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x03fd, code lost:
    
        if (r4.a(r2, r10) == r11) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0486, code lost:
    
        if (r1 == r11) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0106, code lost:
    
        if (r2.b(r1, r5) == r11) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0243, code lost:
    
        if (r1 == r11) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x025e, code lost:
    
        if (a(r1, r3, r18, r5) == r11) goto L199;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v19, types: [ads_mobile_sdk.vy1] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v17, types: [ads_mobile_sdk.vy1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [ads_mobile_sdk.vy1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r17v0, types: [ads_mobile_sdk.vy1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v28, types: [int] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v32, types: [int] */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r4v21, types: [ads_mobile_sdk.vy1] */
    @Override // saneness.hemolysin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.gq0 r18, java.util.Map r19, wretchedly.dern r20) {
        /*
            Method dump skipped, instruction units count: 1214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vy1.a(ads_mobile_sdk.gq0, java.util.Map, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        if (r10.a(r8, "openIntentAsync", r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.Map r6, boolean r7, boolean r8, boolean r9, ads_mobile_sdk.gq0 r10, wretchedly.dern r11) {
        /*
            r5 = this;
            boolean r0 = r11 instanceof ads_mobile_sdk.ty1
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.ty1 r0 = (ads_mobile_sdk.ty1) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.ty1 r0 = new ads_mobile_sdk.ty1
            r0.<init>(r5, r11)
        L18:
            java.lang.Object r11 = r0.e
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p002kotlin.dern.saneness(r11)
            goto L82
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            boolean r8 = r0.d
            boolean r7 = r0.c
            ads_mobile_sdk.gq0 r10 = r0.b
            java.util.Map r6 = r0.a
            p002kotlin.dern.saneness(r11)
            goto L5a
        L40:
            p002kotlin.dern.saneness(r11)
            if (r7 == 0) goto L5a
            if (r9 == 0) goto L5a
            ads_mobile_sdk.e2 r9 = r5.e
            r0.a = r6
            r0.b = r10
            r0.c = r7
            r0.d = r8
            r0.g = r4
            java.lang.Object r9 = r9.n(r0)
            if (r9 != r1) goto L5a
            goto L81
        L5a:
            if (r8 == 0) goto L85
            com.google.gson.JsonObject r8 = new com.google.gson.JsonObject
            r8.<init>()
            java.lang.String r9 = "event_id"
            java.lang.Object r6 = r6.get(r9)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Boolean r7 = igo.attabal.attabal(r7)
            r8.addProperty(r6, r7)
            kotlin.Unit r6 = p002kotlin.Unit.f29295attabal
            r6 = 0
            r0.a = r6
            r0.b = r6
            r0.g = r3
            java.lang.String r6 = "openIntentAsync"
            java.lang.Object r6 = r10.a(r8, r6, r0)
            if (r6 != r1) goto L82
        L81:
            return r1
        L82:
            kotlin.Unit r6 = p002kotlin.Unit.f29295attabal
            return r6
        L85:
            kotlin.Unit r6 = p002kotlin.Unit.f29295attabal
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vy1.a(java.util.Map, boolean, boolean, boolean, ads_mobile_sdk.gq0, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00dd, code lost:
    
        if (ads_mobile_sdk.gk2.a(r4, r14, r13) == r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0105, code lost:
    
        if (r10.a(r5, r4, r9, r8, r12, r2, r11, r7, r13) == r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0107, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.Map r17, boolean r18, ads_mobile_sdk.gq0 r19, wretchedly.dern r20) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vy1.a(java.util.Map, boolean, ads_mobile_sdk.gq0, wretchedly.dern):java.lang.Object");
    }
}
