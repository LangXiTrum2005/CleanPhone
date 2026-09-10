package q7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.ironsource.C0605ua;
import com.ironsource.X3;
import ea.b1;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f48686a = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f48687b = 0;

    public static n a(int i10) {
        for (n nVar : n.values()) {
            if (nVar.f48746a == i10) {
                return nVar;
            }
        }
        return n.Unknown;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:105:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00db A[Catch: all -> 0x00ee, Exception -> 0x00f1, TryCatch #8 {Exception -> 0x00f1, all -> 0x00ee, blocks: (B:43:0x00cd, B:45:0x00db, B:47:0x00df, B:54:0x00f5, B:56:0x010f, B:58:0x011c, B:65:0x013b, B:67:0x0141, B:70:0x014d, B:72:0x0151, B:73:0x015a, B:61:0x0126, B:63:0x0133, B:95:0x01bc, B:96:0x01c3), top: B:111:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:56:0x010f A[Catch: all -> 0x00ee, Exception -> 0x00f1, TryCatch #8 {Exception -> 0x00f1, all -> 0x00ee, blocks: (B:43:0x00cd, B:45:0x00db, B:47:0x00df, B:54:0x00f5, B:56:0x010f, B:58:0x011c, B:65:0x013b, B:67:0x0141, B:70:0x014d, B:72:0x0151, B:73:0x015a, B:61:0x0126, B:63:0x0133, B:95:0x01bc, B:96:0x01c3), top: B:111:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:58:0x011c A[Catch: all -> 0x00ee, Exception -> 0x00f1, TryCatch #8 {Exception -> 0x00f1, all -> 0x00ee, blocks: (B:43:0x00cd, B:45:0x00db, B:47:0x00df, B:54:0x00f5, B:56:0x010f, B:58:0x011c, B:65:0x013b, B:67:0x0141, B:70:0x014d, B:72:0x0151, B:73:0x015a, B:61:0x0126, B:63:0x0133, B:95:0x01bc, B:96:0x01c3), top: B:111:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:5:0x0014  */
    /* JADX WARN: Code duplicated, block: B:60:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0126 A[Catch: all -> 0x00ee, Exception -> 0x00f1, TryCatch #8 {Exception -> 0x00f1, all -> 0x00ee, blocks: (B:43:0x00cd, B:45:0x00db, B:47:0x00df, B:54:0x00f5, B:56:0x010f, B:58:0x011c, B:65:0x013b, B:67:0x0141, B:70:0x014d, B:72:0x0151, B:73:0x015a, B:61:0x0126, B:63:0x0133, B:95:0x01bc, B:96:0x01c3), top: B:111:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0133 A[Catch: all -> 0x00ee, Exception -> 0x00f1, TryCatch #8 {Exception -> 0x00f1, all -> 0x00ee, blocks: (B:43:0x00cd, B:45:0x00db, B:47:0x00df, B:54:0x00f5, B:56:0x010f, B:58:0x011c, B:65:0x013b, B:67:0x0141, B:70:0x014d, B:72:0x0151, B:73:0x015a, B:61:0x0126, B:63:0x0133, B:95:0x01bc, B:96:0x01c3), top: B:111:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0141 A[Catch: all -> 0x00ee, Exception -> 0x00f1, TryCatch #8 {Exception -> 0x00f1, all -> 0x00ee, blocks: (B:43:0x00cd, B:45:0x00db, B:47:0x00df, B:54:0x00f5, B:56:0x010f, B:58:0x011c, B:65:0x013b, B:67:0x0141, B:70:0x014d, B:72:0x0151, B:73:0x015a, B:61:0x0126, B:63:0x0133, B:95:0x01bc, B:96:0x01c3), top: B:111:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:68:0x014a  */
    /* JADX WARN: Code duplicated, block: B:70:0x014d A[Catch: all -> 0x00ee, Exception -> 0x00f1, TryCatch #8 {Exception -> 0x00f1, all -> 0x00ee, blocks: (B:43:0x00cd, B:45:0x00db, B:47:0x00df, B:54:0x00f5, B:56:0x010f, B:58:0x011c, B:65:0x013b, B:67:0x0141, B:70:0x014d, B:72:0x0151, B:73:0x015a, B:61:0x0126, B:63:0x0133, B:95:0x01bc, B:96:0x01c3), top: B:111:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0151 A[Catch: all -> 0x00ee, Exception -> 0x00f1, TryCatch #8 {Exception -> 0x00f1, all -> 0x00ee, blocks: (B:43:0x00cd, B:45:0x00db, B:47:0x00df, B:54:0x00f5, B:56:0x010f, B:58:0x011c, B:65:0x013b, B:67:0x0141, B:70:0x014d, B:72:0x0151, B:73:0x015a, B:61:0x0126, B:63:0x0133, B:95:0x01bc, B:96:0x01c3), top: B:111:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:73:0x015a A[Catch: all -> 0x00ee, Exception -> 0x00f1, TRY_LEAVE, TryCatch #8 {Exception -> 0x00f1, all -> 0x00ee, blocks: (B:43:0x00cd, B:45:0x00db, B:47:0x00df, B:54:0x00f5, B:56:0x010f, B:58:0x011c, B:65:0x013b, B:67:0x0141, B:70:0x014d, B:72:0x0151, B:73:0x015a, B:61:0x0126, B:63:0x0133, B:95:0x01bc, B:96:0x01c3), top: B:111:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:77:0x016f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0170 A[Catch: all -> 0x019d, Exception -> 0x01a0, TryCatch #0 {Exception -> 0x01a0, blocks: (B:75:0x0169, B:78:0x0170, B:81:0x0186, B:83:0x018c, B:91:0x01ae), top: B:105:0x0169 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01bc A[Catch: all -> 0x00ee, Exception -> 0x00f1, TRY_ENTER, TryCatch #8 {Exception -> 0x00f1, all -> 0x00ee, blocks: (B:43:0x00cd, B:45:0x00db, B:47:0x00df, B:54:0x00f5, B:56:0x010f, B:58:0x011c, B:65:0x013b, B:67:0x0141, B:70:0x014d, B:72:0x0151, B:73:0x015a, B:61:0x0126, B:63:0x0133, B:95:0x01bc, B:96:0x01c3), top: B:111:0x00cd }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v2 */
    public static b b(Context context) throws Throwable {
        b bVar;
        Cursor cursorQuery;
        b bVar2;
        String[] strArr;
        ProviderInfo providerInfoResolveContentProvider;
        ProviderInfo providerInfoResolveContentProvider2;
        Uri uri;
        String str;
        Uri uri2;
        PackageManager packageManager;
        String installerPackageName;
        int columnIndex;
        int columnIndex2;
        String str2;
        Method methodQ;
        Object objS;
        ?? r10 = 0;
        try {
            if (!k(context) || (methodQ = e0.q("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class)) == null || (objS = e0.s(null, methodQ, context)) == null) {
                bVar = null;
            } else {
                Method methodP = e0.p(objS.getClass(), "getId", new Class[0]);
                Method methodP2 = e0.p(objS.getClass(), X3.j.M, new Class[0]);
                if (methodP == null || methodP2 == null) {
                    bVar = null;
                } else {
                    bVar = new b();
                    bVar.f48660a = (String) e0.s(objS, methodP, new Object[0]);
                    Boolean bool = (Boolean) e0.s(objS, methodP2, new Object[0]);
                    bVar.f48664e = bool != null ? bool.booleanValue() : false;
                }
            }
        } catch (Exception e10) {
            e0.A("android_id", e10);
        }
        if (bVar == null) {
            if (k(context)) {
                b1 b1Var = new b1();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (context.bindService(intent, b1Var, 1)) {
                        try {
                            try {
                                a aVar = new a(b1Var.a());
                                b bVar3 = new b();
                                bVar3.f48660a = aVar.q();
                                bVar3.f48664e = aVar.r();
                                context.unbindService(b1Var);
                                bVar = bVar3;
                            } catch (Exception e11) {
                                e0.A("android_id", e11);
                                context.unbindService(b1Var);
                                bVar = null;
                                if (bVar == null) {
                                    bVar = new b();
                                }
                                try {
                                    if (!kotlin.jvm.internal.n.a(Looper.myLooper(), Looper.getMainLooper())) {
                                        throw new l7.n("getAttributionIdentifiers cannot be called on the main thread.");
                                    }
                                    bVar2 = b.f48659f;
                                    if (bVar2 == null) {
                                    }
                                    strArr = new String[]{C0605ua.f30806b, "androidid", "limit_tracking"};
                                    providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
                                    providerInfoResolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
                                    if (providerInfoResolveContentProvider != null) {
                                        str2 = providerInfoResolveContentProvider.packageName;
                                        kotlin.jvm.internal.n.e(str2, "contentProviderInfo.packageName");
                                        if (k.a(context, str2)) {
                                            uri2 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                                        } else {
                                            if (providerInfoResolveContentProvider2 != null) {
                                                str = providerInfoResolveContentProvider2.packageName;
                                                kotlin.jvm.internal.n.e(str, "wakizashiProviderInfo.packageName");
                                                if (k.a(context, str)) {
                                                    uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                                                }
                                            }
                                            uri = null;
                                        }
                                        uri = uri2;
                                    } else {
                                        if (providerInfoResolveContentProvider2 != null) {
                                            str = providerInfoResolveContentProvider2.packageName;
                                            kotlin.jvm.internal.n.e(str, "wakizashiProviderInfo.packageName");
                                            if (k.a(context, str)) {
                                                uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                                                uri = uri2;
                                            }
                                        }
                                        uri = null;
                                    }
                                    packageManager = context.getPackageManager();
                                    if (packageManager != null) {
                                        installerPackageName = packageManager.getInstallerPackageName(context.getPackageName());
                                    } else {
                                        installerPackageName = null;
                                    }
                                    if (installerPackageName != null) {
                                        bVar.f48663d = installerPackageName;
                                    }
                                    if (uri == null) {
                                        bVar.f48661b = System.currentTimeMillis();
                                        b.f48659f = bVar;
                                    } else {
                                        cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                                        if (cursorQuery != null) {
                                            try {
                                                if (!cursorQuery.moveToFirst()) {
                                                    int columnIndex3 = cursorQuery.getColumnIndex(C0605ua.f30806b);
                                                    columnIndex = cursorQuery.getColumnIndex("androidid");
                                                    columnIndex2 = cursorQuery.getColumnIndex("limit_tracking");
                                                    bVar.f48662c = cursorQuery.getString(columnIndex3);
                                                    if (columnIndex > 0) {
                                                        bVar.f48660a = cursorQuery.getString(columnIndex);
                                                        bVar.f48664e = Boolean.parseBoolean(cursorQuery.getString(columnIndex2));
                                                    }
                                                    cursorQuery.close();
                                                    bVar.f48661b = System.currentTimeMillis();
                                                    b.f48659f = bVar;
                                                    return bVar;
                                                }
                                            } catch (Exception e12) {
                                                e = e12;
                                                e0.B("q7.b", "Caught unexpected exception in getAttributionId(): " + e);
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                return null;
                                            }
                                        }
                                        bVar.f48661b = System.currentTimeMillis();
                                        b.f48659f = bVar;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                    }
                                    return bVar;
                                } catch (Exception e13) {
                                    e = e13;
                                    cursorQuery = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (r10 != 0) {
                                        r10.close();
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            context.unbindService(b1Var);
                            throw th3;
                        }
                    } else {
                        bVar = null;
                    }
                } catch (SecurityException unused) {
                }
            } else {
                bVar = null;
            }
            if (bVar == null) {
                bVar = new b();
            }
        }
        try {
            if (!kotlin.jvm.internal.n.a(Looper.myLooper(), Looper.getMainLooper())) {
                throw new l7.n("getAttributionIdentifiers cannot be called on the main thread.");
            }
            bVar2 = b.f48659f;
            if (bVar2 == null && System.currentTimeMillis() - bVar2.f48661b < 3600000) {
                return bVar2;
            }
            strArr = new String[]{C0605ua.f30806b, "androidid", "limit_tracking"};
            providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
            providerInfoResolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
            if (providerInfoResolveContentProvider != null) {
                str2 = providerInfoResolveContentProvider.packageName;
                kotlin.jvm.internal.n.e(str2, "contentProviderInfo.packageName");
                if (k.a(context, str2)) {
                    uri2 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                } else {
                    if (providerInfoResolveContentProvider2 != null) {
                        str = providerInfoResolveContentProvider2.packageName;
                        kotlin.jvm.internal.n.e(str, "wakizashiProviderInfo.packageName");
                        if (k.a(context, str)) {
                            uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                        }
                    }
                    uri = null;
                }
                uri = uri2;
            } else {
                if (providerInfoResolveContentProvider2 != null) {
                    str = providerInfoResolveContentProvider2.packageName;
                    kotlin.jvm.internal.n.e(str, "wakizashiProviderInfo.packageName");
                    if (k.a(context, str)) {
                        uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                        uri = uri2;
                    }
                }
                uri = null;
            }
            packageManager = context.getPackageManager();
            if (packageManager != null) {
                installerPackageName = packageManager.getInstallerPackageName(context.getPackageName());
            } else {
                installerPackageName = null;
            }
            if (installerPackageName != null) {
                bVar.f48663d = installerPackageName;
            }
            if (uri == null) {
                bVar.f48661b = System.currentTimeMillis();
                b.f48659f = bVar;
            } else {
                cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                if (cursorQuery != null) {
                    if (!cursorQuery.moveToFirst()) {
                        int columnIndex4 = cursorQuery.getColumnIndex(C0605ua.f30806b);
                        columnIndex = cursorQuery.getColumnIndex("androidid");
                        columnIndex2 = cursorQuery.getColumnIndex("limit_tracking");
                        bVar.f48662c = cursorQuery.getString(columnIndex4);
                        if (columnIndex > 0 && columnIndex2 > 0 && bVar.a() == null) {
                            bVar.f48660a = cursorQuery.getString(columnIndex);
                            bVar.f48664e = Boolean.parseBoolean(cursorQuery.getString(columnIndex2));
                        }
                        cursorQuery.close();
                        bVar.f48661b = System.currentTimeMillis();
                        b.f48659f = bVar;
                        return bVar;
                    }
                }
                bVar.f48661b = System.currentTimeMillis();
                b.f48659f = bVar;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
            return bVar;
        } catch (Throwable th4) {
            th = th4;
            r10 = context;
            if (r10 != 0) {
                r10.close();
            }
            throw th;
        }
    }

    public static final String c() {
        if (!v7.a.b(f.class)) {
            try {
                Context contextB = l7.s.b();
                List<ResolveInfo> listQueryIntentServices = contextB.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                kotlin.jvm.internal.n.e(listQueryIntentServices, "context.packageManager.q…ervices(serviceIntent, 0)");
                String[] strArr = f48686a;
                HashSet hashSet = new HashSet(xj.b0.O(3));
                xj.k.A0(strArr, hashSet);
                Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
                while (it.hasNext()) {
                    ServiceInfo serviceInfo = it.next().serviceInfo;
                    if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                        return serviceInfo.packageName;
                    }
                }
            } catch (Throwable th2) {
                v7.a.a(f.class, th2);
                return null;
            }
        }
        return null;
    }

    public static final String d() {
        if (v7.a.b(f.class)) {
            return null;
        }
        try {
            return "fbconnect://cct." + l7.s.b().getPackageName();
        } catch (Throwable th2) {
            v7.a.a(f.class, th2);
            return null;
        }
    }

    public static final String e() {
        return String.format("m.%s", Arrays.copyOf(new Object[]{l7.s.f45228r}, 1));
    }

    public static final String f() {
        return String.format("m.%s", Arrays.copyOf(new Object[]{l7.s.f45227q}, 1));
    }

    public static void g(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        if (c.a() != null) {
            c.a();
            return;
        }
        c cVar = new c(context);
        if (!v7.a.b(c.class)) {
            try {
                if (!v7.a.b(cVar)) {
                    try {
                        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance((Context) cVar.f48672b);
                        kotlin.jvm.internal.n.e(localBroadcastManager, "getInstance(applicationContext)");
                        localBroadcastManager.registerReceiver(cVar, new IntentFilter("com.parse.bolts.measurement_event"));
                    } catch (Throwable th2) {
                        v7.a.a(cVar, th2);
                    }
                }
            } catch (Throwable th3) {
                v7.a.a(c.class, th3);
            }
        }
        if (!v7.a.b(c.class)) {
            try {
                c.f48670c = cVar;
            } catch (Throwable th4) {
                v7.a.a(c.class, th4);
            }
        }
        c.a();
    }

    public static final String h(String developerDefinedRedirectURI) {
        if (v7.a.b(f.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.n.f(developerDefinedRedirectURI, "developerDefinedRedirectURI");
            if (i(l7.s.b(), developerDefinedRedirectURI)) {
                return developerDefinedRedirectURI;
            }
            return i(l7.s.b(), d()) ? d() : "";
        } catch (Throwable th2) {
            v7.a.a(f.class, th2);
            return null;
        }
    }

    public static final boolean i(Context context, String redirectURI) {
        List<ResolveInfo> listQueryIntentActivities;
        kotlin.jvm.internal.n.f(redirectURI, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(redirectURI));
            listQueryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        } else {
            listQueryIntentActivities = null;
        }
        if (listQueryIntentActivities != null) {
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (kotlin.jvm.internal.n.a(activityInfo.name, "com.facebook.CustomTabActivity") && kotlin.jvm.internal.n.a(activityInfo.packageName, context.getPackageName())) {
                    z10 = true;
                }
            }
            return z10;
        }
        return false;
    }

    public static final void j(Context context) {
        ActivityInfo activityInfo;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (PackageManager.NameNotFoundException unused) {
                activityInfo = null;
            }
        } else {
            activityInfo = null;
        }
        if (activityInfo == null) {
            Log.w("q7.f", "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
        }
    }

    public static boolean k(Context context) {
        Method methodQ = e0.q("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodQ != null) {
            Object objS = e0.s(null, methodQ, context);
            if ((objS instanceof Integer) && objS.equals(0)) {
                return true;
            }
        }
        return false;
    }

    public static final void l(String arg, String str) {
        kotlin.jvm.internal.n.f(arg, "arg");
        if (arg.length() <= 0) {
            throw new IllegalArgumentException(defpackage.e.o("Argument '", str, "' cannot be empty").toString());
        }
    }

    public static final void m(l7.d0 container) {
        kotlin.jvm.internal.n.f(container, "container");
        Iterator it = container.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("Container 'requests' cannot contain null values");
            }
        }
        if (container.isEmpty()) {
            throw new IllegalArgumentException("Container 'requests' cannot be empty".toString());
        }
    }

    public static final void n(String str, String str2) {
        if (str == null || str.length() <= 0) {
            throw new IllegalArgumentException(defpackage.e.o("Argument '", str2, "' cannot be null or empty").toString());
        }
    }

    public static final void o() {
        if (!l7.s.f45226p.get()) {
            throw new l7.t("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}
