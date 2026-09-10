package com.kochava.tracker.privacy.internal;

import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.log.internal.Logger;
import com.kochava.core.task.manager.internal.TaskManagerApi;
import com.kochava.core.util.internal.ObjectUtil;
import com.kochava.tracker.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class PrivacyProfileManager implements PrivacyProfileManagerApi {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ClassLoggerApi f28274i = ((Logger) com.kochava.tracker.log.internal.Logger.b()).a(BuildConfig.SDK_MODULE_NAME, "PrivacyProfileManager");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskManagerApi f28275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f28276b = androidx.media3.extractor.text.ttml.a.u();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f28277c = new ArrayList();
    public final ArrayList d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f28278e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f28279h = false;

    class a implements Runnable {
        public final /* synthetic */ boolean X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ ArrayList f28280Y;
        public final /* synthetic */ boolean Z;

        public a(boolean z2, ArrayList arrayList, boolean z3) {
            this.X = z2;
            this.f28280Y = arrayList;
            this.Z = z3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f28280Y;
            if (this.X) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((PrivacyDenyListChangedListener) it.next()).a();
                }
            }
            if (this.Z) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((PrivacyDenyListChangedListener) it2.next()).k();
                }
            }
        }
    }

    public PrivacyProfileManager(TaskManagerApi taskManagerApi) {
        this.f28275a = taskManagerApi;
    }

    public static void b(ArrayList arrayList, List list) {
        for (Object obj : list) {
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
        }
    }

    public final void a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z2 = false;
        for (PrivacyProfileApi privacyProfileApi : this.f28277c) {
            if (c(privacyProfileApi.getName())) {
                b(arrayList, privacyProfileApi.c());
                b(arrayList2, privacyProfileApi.b());
                if (privacyProfileApi.a()) {
                    z2 = true;
                }
            }
        }
        for (PrivacyProfileApi privacyProfileApi2 : this.d) {
            if (c(privacyProfileApi2.getName())) {
                b(arrayList, privacyProfileApi2.c());
                b(arrayList2, privacyProfileApi2.b());
                if (privacyProfileApi2.a()) {
                    z2 = true;
                }
            }
        }
        Collections.sort(arrayList);
        Collections.sort(arrayList2);
        ArrayList arrayList3 = this.f;
        boolean zEquals = arrayList.equals(arrayList3);
        ArrayList arrayList4 = this.g;
        boolean zEquals2 = arrayList2.equals(arrayList4);
        boolean z3 = z2 != this.f28279h;
        if (zEquals && zEquals2 && !z3) {
            return;
        }
        arrayList3.clear();
        b(arrayList3, arrayList);
        arrayList4.clear();
        b(arrayList4, arrayList2);
        this.f28279h = z2;
        ClassLoggerApi classLoggerApi = f28274i;
        if (!zEquals) {
            classLoggerApi.d("Privacy Profile datapoint deny list has changed to " + arrayList3);
        }
        if (z3) {
            classLoggerApi.d("Privacy Profile sleep has changed to ".concat(this.f28279h ? "Enabled" : "Disabled"));
        }
        boolean z4 = (zEquals && zEquals2) ? false : true;
        ArrayList arrayListQ = ObjectUtil.q(this.f28276b);
        if (arrayListQ.isEmpty()) {
            return;
        }
        this.f28275a.b(new a(z4, arrayListQ, z3));
    }

    public final boolean c(String str) {
        if ("_always".equals(str)) {
            return true;
        }
        return this.f28278e.contains(str);
    }

    public final synchronized void d(PrivacyProfileApi privacyProfileApi) {
        try {
            for (PrivacyProfileApi privacyProfileApi2 : this.d) {
                if (privacyProfileApi2.getName().equals(privacyProfileApi.getName())) {
                    this.d.remove(privacyProfileApi2);
                    break;
                }
            }
            this.d.add(privacyProfileApi);
            a();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e(List list) {
        this.f28277c.clear();
        this.f28277c.addAll(list);
        a();
    }

    public final synchronized void f(String str, boolean z2) {
        try {
            boolean zC = c(str);
            if (z2 && !zC) {
                f28274i.d("Enabling privacy profile " + str);
                this.f28278e.add(str);
                a();
            } else if (!z2 && zC) {
                f28274i.d("Disabling privacy profile " + str);
                this.f28278e.remove(str);
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
