package com.startapp.sdk.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.RcdMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RcdTargets;
import com.thinkup.core.common.n.mo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class sf {
    public static final String[] k = {"getSupportFragmentManager", "getFragmentManager"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f41484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f41485c;
    public final n4 d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f41487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f41488i;
    public final HashMap f = new HashMap();
    public final HashMap g = new HashMap();
    public final lf j = new lf(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nf f41486e = new nf(this);

    public sf(Context context, lb lbVar, n4 n4Var) {
        this.f41483a = context;
        this.f41484b = lbVar;
        this.f41485c = new lb(new mf(lbVar));
        this.d = n4Var;
    }

    public final boolean a() {
        Boolean boolValueOf = this.f41487h;
        if (boolValueOf == null) {
            this.d.getClass();
            RcdMetadata rcdMetadataR = MetaData.E().R();
            if (rcdMetadataR == null || !rcdMetadataR.c()) {
                rcdMetadataR = null;
            }
            boolValueOf = Boolean.valueOf(rcdMetadataR == null || Math.random() >= rcdMetadataR.a());
            this.f41487h = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public final void b(Activity activity) {
        this.d.getClass();
        RcdMetadata rcdMetadataR = MetaData.E().R();
        if (rcdMetadataR == null || !rcdMetadataR.c()) {
            rcdMetadataR = null;
        }
        RcdTargets rcdTargetsB = rcdMetadataR != null ? rcdMetadataR.b() : null;
        if (rcdTargetsB == null) {
            return;
        }
        try {
            Collection collectionA = rcdTargetsB.a(8);
            String name = activity.getClass().getName();
            if (collectionA.contains(name)) {
                a(name, 8);
                return;
            }
        } catch (Throwable th) {
            g9.a(th);
        }
        try {
            a(rcdTargetsB, activity, 16, 32);
        } catch (Throwable th2) {
            g9.a(th2);
        }
        String[] strArr = k;
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                Object objInvoke = activity.getClass().getMethod(strArr[i2], new Class[0]).invoke(activity, new Object[0]);
                if (objInvoke != null) {
                    Object objInvoke2 = objInvoke.getClass().getMethod("getFragments", new Class[0]).invoke(objInvoke, new Object[0]);
                    if (objInvoke2 instanceof Collection) {
                        for (Object obj : (Collection) objInvoke2) {
                            if (obj != null) {
                                a(rcdTargetsB, obj, 64, 128);
                            }
                        }
                    }
                }
            } catch (NoSuchMethodException unused) {
            } catch (Throwable th3) {
                g9.a(th3);
            }
        }
        ((Executor) this.f41485c.a()).execute(this.j);
    }

    public final void c() {
        HashMap map;
        this.d.getClass();
        RcdMetadata rcdMetadataR = MetaData.E().R();
        if (rcdMetadataR == null || !rcdMetadataR.c()) {
            rcdMetadataR = null;
        }
        RcdTargets rcdTargetsB = rcdMetadataR != null ? rcdMetadataR.b() : null;
        if (rcdTargetsB == null) {
            return;
        }
        synchronized (this.f) {
            map = new HashMap(this.f);
        }
        String strA = rcdTargetsB.a(map);
        if (strA.equals(this.f41488i)) {
            return;
        }
        this.f41488i = strA;
        g9 g9Var = new g9(h9.d);
        g9Var.d = "RCD.results";
        g9Var.f41002e = strA;
        g9Var.a();
    }

    public final void a(Activity activity) {
        Window window;
        View decorView;
        if (a()) {
            return;
        }
        String name = activity.getClass().getName();
        WeakHashMap weakHashMap = vi.f41589a;
        if (name.startsWith("com.startapp.")) {
            return;
        }
        List arrayList = (List) this.g.get(name);
        if (arrayList == null) {
            arrayList = new ArrayList(2);
            this.g.put(name, arrayList);
            ((Executor) this.f41484b.a()).execute(new of(this, activity));
        }
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                it.remove();
            } else if (weakReference.get() == activity) {
                z2 = true;
            }
        }
        if (z2 || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        arrayList.add(new WeakReference(activity));
        ((Executor) this.f41484b.a()).execute(new pf(this, activity, decorView));
    }

    public final void b() {
        this.d.getClass();
        RcdMetadata rcdMetadataR = MetaData.E().R();
        if (rcdMetadataR == null || !rcdMetadataR.c()) {
            rcdMetadataR = null;
        }
        RcdTargets rcdTargetsB = rcdMetadataR != null ? rcdMetadataR.b() : null;
        if (rcdTargetsB == null) {
            return;
        }
        for (String str : rcdTargetsB.a(1)) {
            try {
                Class.forName(str, false, sf.class.getClassLoader());
                a(str, 1);
            } catch (ClassNotFoundException unused) {
            } catch (Throwable th) {
                g9.a(th);
            }
        }
        try {
            String packageName = this.f41483a.getPackageName();
            PackageInfo packageInfo = this.f41483a.getPackageManager().getPackageInfo(packageName, 15);
            if (packageInfo != null) {
                a(rcdTargetsB, packageName, packageInfo.activities);
                a(rcdTargetsB, packageName, packageInfo.receivers);
                a(rcdTargetsB, packageName, packageInfo.services);
                a(rcdTargetsB, packageName, packageInfo.providers);
            }
        } catch (Throwable th2) {
            g9.a(th2);
        }
        ((Executor) this.f41485c.a()).execute(this.j);
    }

    public final void a(RcdTargets rcdTargets, String str, ComponentInfo[] componentInfoArr) {
        if (componentInfoArr == null) {
            return;
        }
        for (ComponentInfo componentInfo : componentInfoArr) {
            if (componentInfo != null) {
                String str2 = componentInfo.name;
                if (str2.startsWith(mo.ono)) {
                    a(rcdTargets, str + str2, 2);
                } else {
                    a(rcdTargets, str2, 2);
                }
            }
        }
    }

    public final void a(int i2) {
        try {
            if (a()) {
                return;
            }
            ((Executor) this.f41484b.a()).execute(new rf(this, Thread.currentThread().getStackTrace(), i2));
        } catch (Throwable th) {
            g9.a(th);
        }
    }

    public final void a(RcdTargets rcdTargets, View view) {
        if (view == null) {
            return;
        }
        a(rcdTargets, view.getClass().getName(), 4);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                a(rcdTargets, viewGroup.getChildAt(i2));
            }
        }
    }

    public final void a(RcdTargets rcdTargets, Object obj, int i2, int i3) {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            String name = superclass.getName();
            if (name.startsWith("android") || name.startsWith("java.")) {
                return;
            }
            for (Field field : superclass.getDeclaredFields()) {
                if (i2 != 0) {
                    a(rcdTargets, field.getType().getName(), i2);
                }
                try {
                    field.setAccessible(true);
                    if (field.get(obj) != null && i3 != 0) {
                        a(rcdTargets, field.getType().getName(), i3);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void a(String str, int i2) {
        synchronized (this.f) {
            try {
                Integer num = (Integer) this.f.get(str);
                if (num == null) {
                    num = 0;
                }
                this.f.put(str, Integer.valueOf(i2 | num.intValue()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(RcdTargets rcdTargets, String str, int i2) {
        if (str.startsWith("android") || str.startsWith("java.")) {
            return;
        }
        WeakHashMap weakHashMap = vi.f41589a;
        if (str.startsWith("com.startapp.")) {
            return;
        }
        for (String str2 : rcdTargets.a(i2)) {
            if (str2.length() > 0 && str.startsWith(str2)) {
                if (str2.charAt(str2.length() - 1) == '.') {
                    a(str2, i2);
                } else if (str.length() > str2.length()) {
                    if (str.charAt(str2.length()) == '$') {
                        a(str2, i2);
                    }
                } else {
                    a(str2, i2);
                    return;
                }
            }
        }
    }
}
