package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.a3;
import com.applovin.impl.e3;
import com.google.android.gms.internal.ads.aj0;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f8745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f8746h;

    public /* synthetic */ j(MediationServiceImpl mediationServiceImpl, h hVar, String str, MaxAdapterParametersImpl maxAdapterParametersImpl, a3 a3Var, Activity activity, com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a) {
        this.f8739a = 1;
        this.f8740b = mediationServiceImpl;
        this.f8741c = hVar;
        this.f8744f = str;
        this.f8745g = maxAdapterParametersImpl;
        this.f8746h = a3Var;
        this.f8742d = activity;
        this.f8743e = interfaceC0010a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean z10;
        long j10;
        Date date;
        boolean z11;
        switch (this.f8739a) {
            case 0:
                ((MediationServiceImpl) this.f8740b).a((e3) this.f8744f, (h) this.f8741c, (Activity) this.f8742d, (com.applovin.impl.mediation.ads.a.InterfaceC0010a) this.f8743e, (Map) this.f8745g, (Map) this.f8746h);
                return;
            case 1:
                ((MediationServiceImpl) this.f8740b).a((h) this.f8741c, (String) this.f8744f, (MaxAdapterParametersImpl) this.f8745g, (a3) this.f8746h, (Activity) this.f8742d, (com.applovin.impl.mediation.ads.a.InterfaceC0010a) this.f8743e);
                return;
            default:
                aj0 aj0Var = (aj0) this.f8740b;
                l7.a aVar = (l7.a) this.f8744f;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f8741c;
                Collection collection = (HashSet) this.f8742d;
                Collection collection2 = (HashSet) this.f8743e;
                Collection collection3 = (HashSet) this.f8745g;
                AtomicBoolean atomicBoolean2 = ((l7.f) this.f8746h).f45118d;
                String str = (String) aj0Var.f12046e;
                int i10 = aj0Var.f12042a;
                Long l = (Long) aj0Var.f12044c;
                String str2 = (String) aj0Var.f12045d;
                try {
                    j2.n nVar = l7.f.f45113f;
                    if (nVar.t().f45117c != null) {
                        try {
                            l7.a aVar2 = nVar.t().f45117c;
                            if ((aVar2 != null ? aVar2.f45079i : null) != aVar.f45079i) {
                                z11 = false;
                            } else {
                                if (!atomicBoolean.get() && str == null && i10 == 0) {
                                    atomicBoolean2.set(false);
                                    return;
                                }
                                Date date2 = aVar.f45071a;
                                if (aj0Var.f12042a != 0) {
                                    j10 = 1000;
                                    date = new Date(((long) aj0Var.f12042a) * 1000);
                                    nVar = nVar;
                                } else {
                                    j10 = 1000;
                                    if (aj0Var.f12043b != 0) {
                                        date2 = new Date((((long) aj0Var.f12043b) * 1000) + new Date().getTime());
                                    }
                                    date = date2;
                                }
                                long j11 = j10;
                                if (str == null) {
                                    str = aVar.f45075e;
                                }
                                String str3 = str;
                                String str4 = aVar.f45078h;
                                String str5 = aVar.f45079i;
                                if (!atomicBoolean.get()) {
                                    collection = aVar.f45072b;
                                }
                                Collection collection4 = collection;
                                if (!atomicBoolean.get()) {
                                    collection2 = aVar.f45073c;
                                }
                                Collection collection5 = collection2;
                                if (!atomicBoolean.get()) {
                                    collection3 = aVar.f45074d;
                                }
                                Collection collection6 = collection3;
                                l7.g gVar = aVar.f45076f;
                                Date date3 = new Date();
                                Date date4 = l != null ? new Date(l.longValue() * j11) : aVar.f45080j;
                                if (str2 == null) {
                                    str2 = aVar.f45081k;
                                }
                                nVar.t().c(new l7.a(str3, str4, str5, collection4, collection5, collection6, gVar, date, date3, date4, str2), true);
                                z11 = false;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = false;
                            atomicBoolean2.set(z10);
                            throw th;
                        }
                    } else {
                        z11 = false;
                    }
                    atomicBoolean2.set(z11);
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    z10 = false;
                }
                break;
        }
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f8739a = i10;
        this.f8740b = obj;
        this.f8744f = obj2;
        this.f8741c = obj3;
        this.f8742d = obj4;
        this.f8743e = obj5;
        this.f8745g = obj6;
        this.f8746h = obj7;
    }
}
