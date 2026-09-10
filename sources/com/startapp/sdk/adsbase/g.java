package com.startapp.sdk.adsbase;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import com.applovin.shadow.okio.Segment;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.i6;
import com.startapp.sdk.internal.q0;
import com.startapp.sdk.internal.uf;
import com.startapp.sdk.internal.vf;
import com.startapp.sdk.internal.vg;
import com.startapp.sdk.internal.vi;
import com.startapp.sdk.internal.wg;
import com.startapp.sdk.internal.x0;
import com.startapp.sdk.internal.xg;
import com.startapp.sdk.internal.yg;
import com.startapp.simple.bloomfilter.api.BloomFilterCreator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List f40659a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List f40660b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f40661c = 0;
    public static volatile Pair d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile Pair f40662e = null;
    public static boolean f = true;
    public static boolean g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static SimpleTokenUtils$TokenType f40663h = SimpleTokenUtils$TokenType.UNDEFINED;

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair a() {
        return d != null ? new Pair(((SimpleTokenUtils$TokenType) d.first).toString(), (String) d.second) : new Pair(SimpleTokenUtils$TokenType.T1.toString(), "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair b() {
        return f40662e != null ? new Pair(((SimpleTokenUtils$TokenType) f40662e.first).toString(), (String) f40662e.second) : new Pair(SimpleTokenUtils$TokenType.T2.toString(), "");
    }

    public static void c(Context context) {
        Context contextA = x0.a(context);
        if (contextA != null) {
            context = contextA;
        }
        f(context);
        f = true;
        g = false;
        f40663h = SimpleTokenUtils$TokenType.UNDEFINED;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        context.registerReceiver(new vg(), intentFilter);
        MetaData.E().a(new wg(context));
    }

    public static void d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Set setD = MetaData.E().D();
        Set setP = MetaData.E().P();
        f40659a = new CopyOnWriteArrayList();
        f40660b = new CopyOnWriteArrayList();
        try {
            int i2 = q0.f41381a;
            List<PackageInfo> list = (List) packageManager.getClass().getMethod("getInstalledPackages", Integer.TYPE).invoke(packageManager, Integer.valueOf(Segment.SIZE));
            f40661c = System.currentTimeMillis();
            PackageInfo packageInfo = null;
            for (PackageInfo packageInfo2 : list) {
                int i3 = packageInfo2.applicationInfo.flags;
                if ((i3 & 1) == 0 && (i3 & 128) == 0) {
                    long j = packageInfo2.firstInstallTime;
                    if (j < f40661c && j >= 1291593600000L) {
                        f40661c = j;
                    }
                    f40659a.add(packageInfo2);
                    try {
                        String strB = vi.b(context);
                        if (setD != null && setD.contains(strB)) {
                            f40660b.add(packageInfo2);
                        }
                    } catch (Throwable th) {
                        g9.a(th);
                    }
                } else if (setP.contains(packageInfo2.packageName)) {
                    f40659a.add(packageInfo2);
                } else if (packageInfo2.packageName.equals(i6.f41083a)) {
                    packageInfo = packageInfo2;
                }
            }
            List listSubList = f40659a;
            if (listSubList.size() > 100) {
                ArrayList arrayList = new ArrayList(listSubList);
                Collections.sort(arrayList, new yg());
                listSubList = arrayList.subList(0, 100);
            }
            f40659a = listSubList;
            List listSubList2 = f40660b;
            if (listSubList2.size() > 100) {
                ArrayList arrayList2 = new ArrayList(listSubList2);
                Collections.sort(arrayList2, new yg());
                listSubList2 = arrayList2.subList(0, 100);
            }
            f40660b = listSubList2;
            if (packageInfo != null) {
                f40659a.add(0, packageInfo);
            }
        } catch (Throwable th2) {
            if (vi.a(th2, RemoteException.class)) {
                return;
            }
            g9.a(th2);
        }
    }

    public static void e(Context context) {
        boolean zA = MetaData.E().W().a(context);
        synchronized (g.class) {
            if ((d == null || f40662e == null) && zA) {
                try {
                    d(context);
                    SimpleTokenUtils$TokenType simpleTokenUtils$TokenType = SimpleTokenUtils$TokenType.T1;
                    List list = f40659a;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PackageInfo) it.next()).packageName);
                    }
                    d = new Pair(simpleTokenUtils$TokenType, new BloomFilterCreator().fromKeys(arrayList));
                    SimpleTokenUtils$TokenType simpleTokenUtils$TokenType2 = SimpleTokenUtils$TokenType.T2;
                    List list2 = f40660b;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((PackageInfo) it2.next()).packageName);
                    }
                    f40662e = new Pair(simpleTokenUtils$TokenType2, new BloomFilterCreator().fromKeys(arrayList2));
                } catch (Throwable th) {
                    g9.a(th);
                }
            }
        }
    }

    public static void f(Context context) {
        Context contextA = x0.a(context);
        if (contextA != null) {
            context = contextA;
        }
        try {
            if ((d == null || f40662e == null) && MetaData.E().W().a(context)) {
                ((Executor) com.startapp.sdk.components.a.a(context).D.a()).execute(new xg(context));
            }
        } catch (Throwable th) {
            g9.a(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair a(Context context) {
        if (d == null) {
            e(context);
        }
        uf ufVarEdit = ((vf) com.startapp.sdk.components.a.a(context).G.a()).edit();
        String str = (String) d.second;
        ufVarEdit.a("shared_prefs_simple_token", str);
        ufVarEdit.f41545a.putString("shared_prefs_simple_token", str);
        ufVarEdit.apply();
        f = false;
        f40663h = SimpleTokenUtils$TokenType.UNDEFINED;
        return new Pair(SimpleTokenUtils$TokenType.T1, (String) d.second);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair b(Context context) {
        if (f40662e == null) {
            e(context);
        }
        uf ufVarEdit = ((vf) com.startapp.sdk.components.a.a(context).G.a()).edit();
        String str = (String) f40662e.second;
        ufVarEdit.a("shared_prefs_simple_token2", str);
        ufVarEdit.f41545a.putString("shared_prefs_simple_token2", str);
        ufVarEdit.apply();
        f = false;
        f40663h = SimpleTokenUtils$TokenType.UNDEFINED;
        return new Pair(SimpleTokenUtils$TokenType.T2, (String) f40662e.second);
    }
}
