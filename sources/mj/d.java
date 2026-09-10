package mj;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.h1;
import androidx.lifecycle.o;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import qj.x;
import t.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class d implements ti.b, ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f46105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f46106b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f46108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public na.g f46109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public KeyguardManager f46110f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f46107c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f46111g = new c(this);

    public static void a(xi.f fVar, final d dVar) {
        j jVar = j.f46143d;
        Object obj = null;
        k5.g gVar = new k5.g(fVar, "dev.flutter.pigeon.local_auth_android.LocalAuthApi.isDeviceSupported", jVar, obj);
        if (dVar != null) {
            final int i10 = 0;
            gVar.C(new xi.b(dVar) { // from class: mj.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f46142b;

                {
                    this.f46142b = dVar;
                }

                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    na.g gVar2;
                    na.g gVar3;
                    na.g gVar4;
                    switch (i10) {
                        case 0:
                            d dVar2 = this.f46142b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                KeyguardManager keyguardManager = dVar2.f46110f;
                                arrayList.add(0, Boolean.valueOf((keyguardManager == null ? false : keyguardManager.isDeviceSecure()) || ((gVar2 = dVar2.f46109e) != null && gVar2.t(255) == 0)));
                            } catch (Throwable th2) {
                                arrayList = t9.e.C(th2);
                            }
                            bVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f46142b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                na.g gVar5 = dVar3.f46109e;
                                arrayList2.add(0, Boolean.valueOf((gVar5 == null || gVar5.t(255) == 12) ? false : true));
                            } catch (Throwable th3) {
                                arrayList2 = t9.e.C(th3);
                            }
                            bVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f46142b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                arrayList3.add(0, dVar4.b());
                            } catch (Throwable th4) {
                                arrayList3 = t9.e.C(th4);
                            }
                            bVar.e(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f46142b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                dVar5.getClass();
                                ArrayList arrayList5 = new ArrayList();
                                if (dVar5.f46109e.t(255) == 0) {
                                    arrayList5.add(e.WEAK);
                                }
                                if (dVar5.f46109e.t(15) == 0) {
                                    arrayList5.add(e.STRONG);
                                }
                                arrayList4.add(0, arrayList5);
                            } catch (Throwable th5) {
                                arrayList4 = t9.e.C(th5);
                            }
                            bVar.e(arrayList4);
                            break;
                        default:
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj2;
                            f fVar2 = (f) arrayList7.get(0);
                            h hVar = (h) arrayList7.get(1);
                            jj.f fVar3 = new jj.f(arrayList6, bVar, 3);
                            d dVar6 = this.f46142b;
                            AtomicBoolean atomicBoolean = dVar6.f46107c;
                            if (!atomicBoolean.get()) {
                                Activity activity = dVar6.f46105a;
                                if (activity == null || activity.isFinishing()) {
                                    fVar3.d(g.ERROR_NO_ACTIVITY);
                                } else if (!(dVar6.f46105a instanceof FragmentActivity)) {
                                    fVar3.d(g.ERROR_NOT_FRAGMENT_ACTIVITY);
                                } else {
                                    KeyguardManager keyguardManager2 = dVar6.f46110f;
                                    if (!((keyguardManager2 == null ? false : keyguardManager2.isDeviceSecure()) || ((gVar4 = dVar6.f46109e) != null && gVar4.t(255) == 0))) {
                                        fVar3.d(g.ERROR_NOT_AVAILABLE);
                                    } else {
                                        atomicBoolean.set(true);
                                        cj.h hVar2 = new cj.h(20, dVar6, fVar3);
                                        boolean z10 = (fVar2.f46116a.booleanValue() || (gVar3 = dVar6.f46109e) == null || gVar3.t(32768) != 0) ? false : true;
                                        o oVar = dVar6.f46108d;
                                        FragmentActivity fragmentActivity = (FragmentActivity) dVar6.f46105a;
                                        b bVar2 = new b(oVar, fragmentActivity, fVar2, hVar, hVar2, z10);
                                        dVar6.f46106b = bVar2;
                                        if (oVar != null) {
                                            oVar.a(bVar2);
                                        } else {
                                            fragmentActivity.getApplication().registerActivityLifecycleCallbacks(bVar2);
                                        }
                                        x xVar = new x(fragmentActivity, bVar2.f46101i, bVar2);
                                        bVar2.f46103k = xVar;
                                        xVar.c(bVar2.f46099g);
                                    }
                                }
                            } else {
                                fVar3.d(g.ERROR_ALREADY_IN_PROGRESS);
                            }
                            break;
                    }
                }
            });
        } else {
            gVar.C(null);
        }
        k5.g gVar2 = new k5.g(fVar, "dev.flutter.pigeon.local_auth_android.LocalAuthApi.deviceCanSupportBiometrics", jVar, obj);
        if (dVar != null) {
            final int i11 = 1;
            gVar2.C(new xi.b(dVar) { // from class: mj.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f46142b;

                {
                    this.f46142b = dVar;
                }

                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    na.g gVar3;
                    na.g gVar4;
                    na.g gVar5;
                    switch (i11) {
                        case 0:
                            d dVar2 = this.f46142b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                KeyguardManager keyguardManager = dVar2.f46110f;
                                arrayList.add(0, Boolean.valueOf((keyguardManager == null ? false : keyguardManager.isDeviceSecure()) || ((gVar3 = dVar2.f46109e) != null && gVar3.t(255) == 0)));
                            } catch (Throwable th2) {
                                arrayList = t9.e.C(th2);
                            }
                            bVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f46142b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                na.g gVar6 = dVar3.f46109e;
                                arrayList2.add(0, Boolean.valueOf((gVar6 == null || gVar6.t(255) == 12) ? false : true));
                            } catch (Throwable th3) {
                                arrayList2 = t9.e.C(th3);
                            }
                            bVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f46142b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                arrayList3.add(0, dVar4.b());
                            } catch (Throwable th4) {
                                arrayList3 = t9.e.C(th4);
                            }
                            bVar.e(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f46142b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                dVar5.getClass();
                                ArrayList arrayList5 = new ArrayList();
                                if (dVar5.f46109e.t(255) == 0) {
                                    arrayList5.add(e.WEAK);
                                }
                                if (dVar5.f46109e.t(15) == 0) {
                                    arrayList5.add(e.STRONG);
                                }
                                arrayList4.add(0, arrayList5);
                            } catch (Throwable th5) {
                                arrayList4 = t9.e.C(th5);
                            }
                            bVar.e(arrayList4);
                            break;
                        default:
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj2;
                            f fVar2 = (f) arrayList7.get(0);
                            h hVar = (h) arrayList7.get(1);
                            jj.f fVar3 = new jj.f(arrayList6, bVar, 3);
                            d dVar6 = this.f46142b;
                            AtomicBoolean atomicBoolean = dVar6.f46107c;
                            if (!atomicBoolean.get()) {
                                Activity activity = dVar6.f46105a;
                                if (activity == null || activity.isFinishing()) {
                                    fVar3.d(g.ERROR_NO_ACTIVITY);
                                } else if (!(dVar6.f46105a instanceof FragmentActivity)) {
                                    fVar3.d(g.ERROR_NOT_FRAGMENT_ACTIVITY);
                                } else {
                                    KeyguardManager keyguardManager2 = dVar6.f46110f;
                                    if (!((keyguardManager2 == null ? false : keyguardManager2.isDeviceSecure()) || ((gVar5 = dVar6.f46109e) != null && gVar5.t(255) == 0))) {
                                        fVar3.d(g.ERROR_NOT_AVAILABLE);
                                    } else {
                                        atomicBoolean.set(true);
                                        cj.h hVar2 = new cj.h(20, dVar6, fVar3);
                                        boolean z10 = (fVar2.f46116a.booleanValue() || (gVar4 = dVar6.f46109e) == null || gVar4.t(32768) != 0) ? false : true;
                                        o oVar = dVar6.f46108d;
                                        FragmentActivity fragmentActivity = (FragmentActivity) dVar6.f46105a;
                                        b bVar2 = new b(oVar, fragmentActivity, fVar2, hVar, hVar2, z10);
                                        dVar6.f46106b = bVar2;
                                        if (oVar != null) {
                                            oVar.a(bVar2);
                                        } else {
                                            fragmentActivity.getApplication().registerActivityLifecycleCallbacks(bVar2);
                                        }
                                        x xVar = new x(fragmentActivity, bVar2.f46101i, bVar2);
                                        bVar2.f46103k = xVar;
                                        xVar.c(bVar2.f46099g);
                                    }
                                }
                            } else {
                                fVar3.d(g.ERROR_ALREADY_IN_PROGRESS);
                            }
                            break;
                    }
                }
            });
        } else {
            gVar2.C(null);
        }
        k5.g gVar3 = new k5.g(fVar, "dev.flutter.pigeon.local_auth_android.LocalAuthApi.stopAuthentication", jVar, obj);
        if (dVar != null) {
            final int i12 = 2;
            gVar3.C(new xi.b(dVar) { // from class: mj.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f46142b;

                {
                    this.f46142b = dVar;
                }

                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    na.g gVar4;
                    na.g gVar5;
                    na.g gVar6;
                    switch (i12) {
                        case 0:
                            d dVar2 = this.f46142b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                KeyguardManager keyguardManager = dVar2.f46110f;
                                arrayList.add(0, Boolean.valueOf((keyguardManager == null ? false : keyguardManager.isDeviceSecure()) || ((gVar4 = dVar2.f46109e) != null && gVar4.t(255) == 0)));
                            } catch (Throwable th2) {
                                arrayList = t9.e.C(th2);
                            }
                            bVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f46142b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                na.g gVar7 = dVar3.f46109e;
                                arrayList2.add(0, Boolean.valueOf((gVar7 == null || gVar7.t(255) == 12) ? false : true));
                            } catch (Throwable th3) {
                                arrayList2 = t9.e.C(th3);
                            }
                            bVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f46142b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                arrayList3.add(0, dVar4.b());
                            } catch (Throwable th4) {
                                arrayList3 = t9.e.C(th4);
                            }
                            bVar.e(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f46142b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                dVar5.getClass();
                                ArrayList arrayList5 = new ArrayList();
                                if (dVar5.f46109e.t(255) == 0) {
                                    arrayList5.add(e.WEAK);
                                }
                                if (dVar5.f46109e.t(15) == 0) {
                                    arrayList5.add(e.STRONG);
                                }
                                arrayList4.add(0, arrayList5);
                            } catch (Throwable th5) {
                                arrayList4 = t9.e.C(th5);
                            }
                            bVar.e(arrayList4);
                            break;
                        default:
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj2;
                            f fVar2 = (f) arrayList7.get(0);
                            h hVar = (h) arrayList7.get(1);
                            jj.f fVar3 = new jj.f(arrayList6, bVar, 3);
                            d dVar6 = this.f46142b;
                            AtomicBoolean atomicBoolean = dVar6.f46107c;
                            if (!atomicBoolean.get()) {
                                Activity activity = dVar6.f46105a;
                                if (activity == null || activity.isFinishing()) {
                                    fVar3.d(g.ERROR_NO_ACTIVITY);
                                } else if (!(dVar6.f46105a instanceof FragmentActivity)) {
                                    fVar3.d(g.ERROR_NOT_FRAGMENT_ACTIVITY);
                                } else {
                                    KeyguardManager keyguardManager2 = dVar6.f46110f;
                                    if (!((keyguardManager2 == null ? false : keyguardManager2.isDeviceSecure()) || ((gVar6 = dVar6.f46109e) != null && gVar6.t(255) == 0))) {
                                        fVar3.d(g.ERROR_NOT_AVAILABLE);
                                    } else {
                                        atomicBoolean.set(true);
                                        cj.h hVar2 = new cj.h(20, dVar6, fVar3);
                                        boolean z10 = (fVar2.f46116a.booleanValue() || (gVar5 = dVar6.f46109e) == null || gVar5.t(32768) != 0) ? false : true;
                                        o oVar = dVar6.f46108d;
                                        FragmentActivity fragmentActivity = (FragmentActivity) dVar6.f46105a;
                                        b bVar2 = new b(oVar, fragmentActivity, fVar2, hVar, hVar2, z10);
                                        dVar6.f46106b = bVar2;
                                        if (oVar != null) {
                                            oVar.a(bVar2);
                                        } else {
                                            fragmentActivity.getApplication().registerActivityLifecycleCallbacks(bVar2);
                                        }
                                        x xVar = new x(fragmentActivity, bVar2.f46101i, bVar2);
                                        bVar2.f46103k = xVar;
                                        xVar.c(bVar2.f46099g);
                                    }
                                }
                            } else {
                                fVar3.d(g.ERROR_ALREADY_IN_PROGRESS);
                            }
                            break;
                    }
                }
            });
        } else {
            gVar3.C(null);
        }
        k5.g gVar4 = new k5.g(fVar, "dev.flutter.pigeon.local_auth_android.LocalAuthApi.getEnrolledBiometrics", jVar, obj);
        if (dVar != null) {
            final int i13 = 3;
            gVar4.C(new xi.b(dVar) { // from class: mj.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f46142b;

                {
                    this.f46142b = dVar;
                }

                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    na.g gVar5;
                    na.g gVar6;
                    na.g gVar7;
                    switch (i13) {
                        case 0:
                            d dVar2 = this.f46142b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                KeyguardManager keyguardManager = dVar2.f46110f;
                                arrayList.add(0, Boolean.valueOf((keyguardManager == null ? false : keyguardManager.isDeviceSecure()) || ((gVar5 = dVar2.f46109e) != null && gVar5.t(255) == 0)));
                            } catch (Throwable th2) {
                                arrayList = t9.e.C(th2);
                            }
                            bVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f46142b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                na.g gVar8 = dVar3.f46109e;
                                arrayList2.add(0, Boolean.valueOf((gVar8 == null || gVar8.t(255) == 12) ? false : true));
                            } catch (Throwable th3) {
                                arrayList2 = t9.e.C(th3);
                            }
                            bVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f46142b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                arrayList3.add(0, dVar4.b());
                            } catch (Throwable th4) {
                                arrayList3 = t9.e.C(th4);
                            }
                            bVar.e(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f46142b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                dVar5.getClass();
                                ArrayList arrayList5 = new ArrayList();
                                if (dVar5.f46109e.t(255) == 0) {
                                    arrayList5.add(e.WEAK);
                                }
                                if (dVar5.f46109e.t(15) == 0) {
                                    arrayList5.add(e.STRONG);
                                }
                                arrayList4.add(0, arrayList5);
                            } catch (Throwable th5) {
                                arrayList4 = t9.e.C(th5);
                            }
                            bVar.e(arrayList4);
                            break;
                        default:
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj2;
                            f fVar2 = (f) arrayList7.get(0);
                            h hVar = (h) arrayList7.get(1);
                            jj.f fVar3 = new jj.f(arrayList6, bVar, 3);
                            d dVar6 = this.f46142b;
                            AtomicBoolean atomicBoolean = dVar6.f46107c;
                            if (!atomicBoolean.get()) {
                                Activity activity = dVar6.f46105a;
                                if (activity == null || activity.isFinishing()) {
                                    fVar3.d(g.ERROR_NO_ACTIVITY);
                                } else if (!(dVar6.f46105a instanceof FragmentActivity)) {
                                    fVar3.d(g.ERROR_NOT_FRAGMENT_ACTIVITY);
                                } else {
                                    KeyguardManager keyguardManager2 = dVar6.f46110f;
                                    if (!((keyguardManager2 == null ? false : keyguardManager2.isDeviceSecure()) || ((gVar7 = dVar6.f46109e) != null && gVar7.t(255) == 0))) {
                                        fVar3.d(g.ERROR_NOT_AVAILABLE);
                                    } else {
                                        atomicBoolean.set(true);
                                        cj.h hVar2 = new cj.h(20, dVar6, fVar3);
                                        boolean z10 = (fVar2.f46116a.booleanValue() || (gVar6 = dVar6.f46109e) == null || gVar6.t(32768) != 0) ? false : true;
                                        o oVar = dVar6.f46108d;
                                        FragmentActivity fragmentActivity = (FragmentActivity) dVar6.f46105a;
                                        b bVar2 = new b(oVar, fragmentActivity, fVar2, hVar, hVar2, z10);
                                        dVar6.f46106b = bVar2;
                                        if (oVar != null) {
                                            oVar.a(bVar2);
                                        } else {
                                            fragmentActivity.getApplication().registerActivityLifecycleCallbacks(bVar2);
                                        }
                                        x xVar = new x(fragmentActivity, bVar2.f46101i, bVar2);
                                        bVar2.f46103k = xVar;
                                        xVar.c(bVar2.f46099g);
                                    }
                                }
                            } else {
                                fVar3.d(g.ERROR_ALREADY_IN_PROGRESS);
                            }
                            break;
                    }
                }
            });
        } else {
            gVar4.C(null);
        }
        k5.g gVar5 = new k5.g(fVar, "dev.flutter.pigeon.local_auth_android.LocalAuthApi.authenticate", jVar, obj);
        if (dVar == null) {
            gVar5.C(null);
        } else {
            final int i14 = 4;
            gVar5.C(new xi.b(dVar) { // from class: mj.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f46142b;

                {
                    this.f46142b = dVar;
                }

                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    na.g gVar6;
                    na.g gVar7;
                    na.g gVar8;
                    switch (i14) {
                        case 0:
                            d dVar2 = this.f46142b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                KeyguardManager keyguardManager = dVar2.f46110f;
                                arrayList.add(0, Boolean.valueOf((keyguardManager == null ? false : keyguardManager.isDeviceSecure()) || ((gVar6 = dVar2.f46109e) != null && gVar6.t(255) == 0)));
                            } catch (Throwable th2) {
                                arrayList = t9.e.C(th2);
                            }
                            bVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f46142b;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                na.g gVar9 = dVar3.f46109e;
                                arrayList2.add(0, Boolean.valueOf((gVar9 == null || gVar9.t(255) == 12) ? false : true));
                            } catch (Throwable th3) {
                                arrayList2 = t9.e.C(th3);
                            }
                            bVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f46142b;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                arrayList3.add(0, dVar4.b());
                            } catch (Throwable th4) {
                                arrayList3 = t9.e.C(th4);
                            }
                            bVar.e(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f46142b;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                dVar5.getClass();
                                ArrayList arrayList5 = new ArrayList();
                                if (dVar5.f46109e.t(255) == 0) {
                                    arrayList5.add(e.WEAK);
                                }
                                if (dVar5.f46109e.t(15) == 0) {
                                    arrayList5.add(e.STRONG);
                                }
                                arrayList4.add(0, arrayList5);
                            } catch (Throwable th5) {
                                arrayList4 = t9.e.C(th5);
                            }
                            bVar.e(arrayList4);
                            break;
                        default:
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj2;
                            f fVar2 = (f) arrayList7.get(0);
                            h hVar = (h) arrayList7.get(1);
                            jj.f fVar3 = new jj.f(arrayList6, bVar, 3);
                            d dVar6 = this.f46142b;
                            AtomicBoolean atomicBoolean = dVar6.f46107c;
                            if (!atomicBoolean.get()) {
                                Activity activity = dVar6.f46105a;
                                if (activity == null || activity.isFinishing()) {
                                    fVar3.d(g.ERROR_NO_ACTIVITY);
                                } else if (!(dVar6.f46105a instanceof FragmentActivity)) {
                                    fVar3.d(g.ERROR_NOT_FRAGMENT_ACTIVITY);
                                } else {
                                    KeyguardManager keyguardManager2 = dVar6.f46110f;
                                    if (!((keyguardManager2 == null ? false : keyguardManager2.isDeviceSecure()) || ((gVar8 = dVar6.f46109e) != null && gVar8.t(255) == 0))) {
                                        fVar3.d(g.ERROR_NOT_AVAILABLE);
                                    } else {
                                        atomicBoolean.set(true);
                                        cj.h hVar2 = new cj.h(20, dVar6, fVar3);
                                        boolean z10 = (fVar2.f46116a.booleanValue() || (gVar7 = dVar6.f46109e) == null || gVar7.t(32768) != 0) ? false : true;
                                        o oVar = dVar6.f46108d;
                                        FragmentActivity fragmentActivity = (FragmentActivity) dVar6.f46105a;
                                        b bVar2 = new b(oVar, fragmentActivity, fVar2, hVar, hVar2, z10);
                                        dVar6.f46106b = bVar2;
                                        if (oVar != null) {
                                            oVar.a(bVar2);
                                        } else {
                                            fragmentActivity.getApplication().registerActivityLifecycleCallbacks(bVar2);
                                        }
                                        x xVar = new x(fragmentActivity, bVar2.f46101i, bVar2);
                                        bVar2.f46103k = xVar;
                                        xVar.c(bVar2.f46099g);
                                    }
                                }
                            } else {
                                fVar3.d(g.ERROR_ALREADY_IN_PROGRESS);
                            }
                            break;
                    }
                }
            });
        }
    }

    public final Boolean b() {
        try {
            b bVar = this.f46106b;
            AtomicBoolean atomicBoolean = this.f46107c;
            if (bVar != null && atomicBoolean.get()) {
                b bVar2 = this.f46106b;
                x xVar = bVar2.f46103k;
                if (xVar != null) {
                    h1 h1Var = (h1) xVar.f49096b;
                    if (h1Var == null) {
                        Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
                    } else {
                        l lVar = (l) h1Var.C("androidx.biometric.BiometricFragment");
                        if (lVar == null) {
                            Log.e("BiometricPromptCompat", "Unable to cancel authentication. BiometricFragment not found.");
                        } else {
                            lVar.D(3);
                        }
                    }
                    bVar2.f46103k = null;
                }
                this.f46106b = null;
            }
            atomicBoolean.set(false);
            return Boolean.TRUE;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    @Override // ui.a
    public final void onAttachedToActivity(ui.b bVar) {
        fc.f fVar = (fc.f) bVar;
        fVar.b(this.f46111g);
        Activity activity = (Activity) fVar.f40780b;
        if (activity != null) {
            this.f46105a = activity;
            Context baseContext = activity.getBaseContext();
            this.f46109e = new na.g(new i6.d(activity));
            this.f46110f = (KeyguardManager) baseContext.getSystemService("keyguard");
        }
        this.f46108d = ((HiddenLifecycleReference) fVar.f40781c).getLifecycle();
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a aVar) {
        a(aVar.f50789c, this);
    }

    @Override // ui.a
    public final void onDetachedFromActivity() {
        this.f46108d = null;
        this.f46105a = null;
    }

    @Override // ui.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f46108d = null;
        this.f46105a = null;
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a aVar) {
        a(aVar.f50789c, null);
    }

    @Override // ui.a
    public final void onReattachedToActivityForConfigChanges(ui.b bVar) {
        fc.f fVar = (fc.f) bVar;
        fVar.b(this.f46111g);
        Activity activity = (Activity) fVar.f40780b;
        if (activity != null) {
            this.f46105a = activity;
            Context baseContext = activity.getBaseContext();
            this.f46109e = new na.g(new i6.d(activity));
            this.f46110f = (KeyguardManager) baseContext.getSystemService("keyguard");
        }
        this.f46108d = ((HiddenLifecycleReference) fVar.f40781c).getLifecycle();
    }
}
