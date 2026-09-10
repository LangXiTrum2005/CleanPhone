package b6;

import android.app.AppOpsManager;
import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.storage.StorageManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.ironsource.T3;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.n;
import wj.f;
import wj.g;
import xj.b0;
import xj.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements sg.c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r8v0, types: [b6.a] */
    public static void a(int i10, Context context, a aVar, a aVar2) {
        if (context == null) {
            Log.d("permissions_handler", "Context cannot be null.");
            aVar2.f5493b.b("PermissionHandler.ServiceManager", "Android context cannot be null.", null);
            return;
        }
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            LocationManager locationManager = (LocationManager) context.getSystemService(LocationManager.class);
            aVar.a(locationManager != null ? locationManager.isLocationEnabled() : 0);
            return;
        }
        if (i10 == 21) {
            aVar.a(((BluetoothManager) context.getSystemService(T3.f27212d)).getAdapter().isEnabled() ? 1 : 0);
            return;
        }
        if (i10 != 8) {
            if (i10 == 16) {
                aVar.a(1);
                return;
            } else {
                aVar.a(2);
                return;
            }
        }
        PackageManager packageManager = context.getPackageManager();
        if (!packageManager.hasSystemFeature("android.hardware.telephony")) {
            aVar.a(2);
            return;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null || telephonyManager.getPhoneType() == 0) {
            aVar.a(2);
            return;
        }
        Intent intent = new Intent("android.intent.action.CALL");
        intent.setData(Uri.parse("tel:123123"));
        if ((Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentActivities(intent, 0)).isEmpty()) {
            aVar.a(2);
        } else if (telephonyManager.getSimState() != 5) {
            aVar.a(0);
        } else {
            aVar.a(1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x023b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0141  */
    /* JADX WARN: Code duplicated, block: B:93:0x021c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0238  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v7, types: [wj.g] */
    /* JADX WARN: Type inference failed for: r8v8 */
    public ArrayList b(boolean z10, int i10, Set set) {
        Object objC;
        Long l;
        Iterator it;
        Map mapQ;
        Object objC2;
        long length;
        ?? C;
        Object objC3;
        Intent intentAddCategory = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER");
        n.e(intentAddCategory, "addCategory(...)");
        boolean z11 = false;
        List<ResolveInfo> listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? c().queryIntentActivities(intentAddCategory, PackageManager.ResolveInfoFlags.of(0L)) : c().queryIntentActivities(intentAddCategory, 0);
        n.c(listQueryIntentActivities);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listQueryIntentActivities.iterator();
        while (it2.hasNext()) {
            ActivityInfo activityInfo = ((ResolveInfo) it2.next()).activityInfo;
            String str = activityInfo != null ? activityInfo.packageName : null;
            if (str != null) {
                arrayList.add(str);
            }
        }
        List<String> listJ0 = xj.n.j0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : listJ0) {
            try {
                objC3 = Build.VERSION.SDK_INT >= 33 ? c().getPackageInfo(str2, PackageManager.PackageInfoFlags.of(0L)) : c().getPackageInfo(str2, 0);
            } catch (Throwable th2) {
                objC3 = t9.e.c(th2);
            }
            if (objC3 instanceof g) {
                objC3 = null;
            }
            PackageInfo packageInfo = (PackageInfo) objC3;
            if (packageInfo != null) {
                arrayList2.add(packageInfo);
            }
        }
        boolean zD = d();
        w wVar = w.f53867a;
        Map map = wVar;
        if (zD) {
            Object systemService = super.h().getSystemService("usagestats");
            n.d(systemService, "null cannot be cast to non-null type android.app.usage.UsageStatsManager");
            UsageStatsManager usageStatsManager = (UsageStatsManager) systemService;
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                Map<String, UsageStats> mapQueryAndAggregateUsageStats = usageStatsManager.queryAndAggregateUsageStats(jCurrentTimeMillis - (((long) i10) * 86400000), jCurrentTimeMillis);
                n.e(mapQueryAndAggregateUsageStats, "queryAndAggregateUsageStats(...)");
                C = new LinkedHashMap(b0.O(mapQueryAndAggregateUsageStats.size()));
                for (Object obj : mapQueryAndAggregateUsageStats.entrySet()) {
                    C.put(((Map.Entry) obj).getKey(), Long.valueOf(((UsageStats) ((Map.Entry) obj).getValue()).getTotalTimeInForeground()));
                }
            } catch (Throwable th3) {
                C = t9.e.c(th3);
            }
            ?? r10 = wVar;
            if (!(C instanceof g)) {
                r10 = C;
            }
            map = (Map) r10;
        }
        Object systemService2 = super.h().getSystemService("storagestats");
        n.d(systemService2, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManager = (StorageStatsManager) systemService2;
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            PackageInfo packageInfo2 = (PackageInfo) it3.next();
            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
            if (applicationInfo == null) {
                it = it3;
                mapQ = null;
            } else {
                boolean z12 = (applicationInfo.flags & 1) == 0 ? z11 : true;
                if (!z12 || z10) {
                    if (!set.contains(packageInfo2.packageName)) {
                        f fVar = new f("packageName", packageInfo2.packageName);
                        f fVar2 = new f("appName", c().getApplicationLabel(applicationInfo).toString());
                        f fVar3 = new f("isSystemApp", Boolean.valueOf(z12));
                        f fVar4 = new f("versionName", packageInfo2.versionName);
                        f fVar5 = new f("usageTimeMs", map.get(packageInfo2.packageName));
                        if (zD) {
                            try {
                                StorageStats storageStatsQueryStatsForPackage = storageStatsManager.queryStatsForPackage(StorageManager.UUID_DEFAULT, applicationInfo.packageName, Process.myUserHandle());
                                n.e(storageStatsQueryStatsForPackage, "queryStatsForPackage(...)");
                                objC = Long.valueOf(storageStatsQueryStatsForPackage.getAppBytes() + storageStatsQueryStatsForPackage.getDataBytes() + storageStatsQueryStatsForPackage.getCacheBytes());
                            } catch (Throwable th4) {
                                objC = t9.e.c(th4);
                            }
                            if (objC instanceof g) {
                                objC = null;
                            }
                            l = (Long) objC;
                            it = it3;
                        } else {
                            try {
                                long length2 = new File(applicationInfo.sourceDir).length();
                                String[] strArr = applicationInfo.splitSourceDirs;
                                if (strArr != null) {
                                    int length3 = strArr.length;
                                    int i11 = 0;
                                    length = 0;
                                    while (i11 < length3) {
                                        String[] strArr2 = strArr;
                                        it = it3;
                                        try {
                                            length += new File(strArr2[i11]).length();
                                            i11++;
                                            it3 = it;
                                            strArr = strArr2;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            objC2 = t9.e.c(th);
                                            if (objC2 instanceof g) {
                                                objC2 = null;
                                            }
                                            l = (Long) objC2;
                                            mapQ = b0.Q(fVar, fVar2, fVar3, fVar4, fVar5, new f("sizeBytes", l));
                                            if (mapQ != null) {
                                                arrayList3.add(mapQ);
                                            }
                                            it3 = it;
                                            z11 = false;
                                        }
                                    }
                                } else {
                                    length = 0;
                                }
                                it = it3;
                                objC2 = Long.valueOf(length2 + length);
                            } catch (Throwable th6) {
                                th = th6;
                                it = it3;
                            }
                            if (objC2 instanceof g) {
                                objC2 = null;
                            }
                            l = (Long) objC2;
                        }
                        mapQ = b0.Q(fVar, fVar2, fVar3, fVar4, fVar5, new f("sizeBytes", l));
                    }
                }
                it = it3;
                mapQ = null;
            }
            if (mapQ != null) {
                arrayList3.add(mapQ);
            }
            it3 = it;
            z11 = false;
        }
        return arrayList3;
    }

    public PackageManager c() {
        PackageManager packageManager = super.h().getPackageManager();
        n.e(packageManager, "getPackageManager(...)");
        return packageManager;
    }

    public boolean d() {
        Object systemService = super.h().getSystemService("appops");
        n.d(systemService, "null cannot be cast to non-null type android.app.AppOpsManager");
        return ((AppOpsManager) systemService).unsafeCheckOpNoThrow("android:get_usage_stats", Process.myUid(), super.h().getPackageName()) == 0;
    }

    public boolean e(String str) {
        Object objC;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                c().getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
            } else {
                c().getPackageInfo(str, 0);
            }
            objC = Boolean.TRUE;
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
        Object obj = Boolean.FALSE;
        if (objC instanceof g) {
            objC = obj;
        }
        return ((Boolean) objC).booleanValue();
    }

    public void f() {
        super.h().startActivity(new Intent("android.settings.USAGE_ACCESS_SETTINGS").addFlags(268435456));
    }

    public void g(String str) {
        super.h().startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:".concat(str))).addFlags(268435456));
    }
}
