package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qb implements na.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f23894b;

    public /* synthetic */ qb(Context context, int i10) {
        this.f23893a = i10;
        this.f23894b = context;
    }

    @Override // na.r
    public final Object get() {
        int i10 = this.f23893a;
        Context context = this.f23894b;
        switch (i10) {
            case 0:
                Object obj = pb.f23842j;
                final com.google.android.gms.internal.consent_sdk.x xVar = new com.google.android.gms.internal.consent_sdk.x();
                xVar.f23260a = context;
                context.getClass();
                if (((na.r) xVar.f23261b) == null) {
                    xVar.f23261b = pb.f23844m;
                }
                final int i11 = 1;
                if (((na.r) xVar.f23262c) == null) {
                    xVar.f23262c = no.b.z(new qb((Context) xVar.f23260a, i11));
                }
                if (((ob) xVar.f23263d) == null) {
                    xVar.f23263d = new na.r() { // from class: com.google.android.gms.internal.measurement.ob
                        @Override // na.r
                        public final Object get() {
                            int i12 = i11;
                            com.google.android.gms.internal.consent_sdk.x xVar2 = xVar;
                            switch (i12) {
                                case 0:
                                    Context context2 = (Context) xVar2.f23260a;
                                    Object obj2 = pb.f23842j;
                                    try {
                                        ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                        applicationInfo.getClass();
                                        return new na.p(applicationInfo);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return na.a.f46626a;
                                    }
                                default:
                                    return new na.p(new fe((na.r) xVar2.f23261b));
                            }
                        }
                    };
                }
                final int i12 = 0;
                if (((na.r) xVar.f23264e) == null) {
                    Context context2 = (Context) xVar.f23260a;
                    ArrayList arrayList = new ArrayList();
                    ve veVar = new ve(new q6(context2));
                    new ConcurrentHashMap();
                    Collections.addAll(arrayList, veVar, new ye());
                    xVar.f23264e = no.b.z(new rb(arrayList, i12));
                }
                if (((ob) xVar.f23265f) == null) {
                    xVar.f23265f = new na.r() { // from class: com.google.android.gms.internal.measurement.ob
                        @Override // na.r
                        public final Object get() {
                            int i13 = i12;
                            com.google.android.gms.internal.consent_sdk.x xVar2 = xVar;
                            switch (i13) {
                                case 0:
                                    Context context3 = (Context) xVar2.f23260a;
                                    Object obj2 = pb.f23842j;
                                    try {
                                        ApplicationInfo applicationInfo = context3.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                        applicationInfo.getClass();
                                        return new na.p(applicationInfo);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return na.a.f46626a;
                                    }
                                default:
                                    return new na.p(new fe((na.r) xVar2.f23261b));
                            }
                        }
                    };
                }
                return new pb((Context) xVar.f23260a, (na.r) xVar.f23261b, (na.r) xVar.f23262c, (ob) xVar.f23263d, (na.r) xVar.f23264e, (ob) xVar.f23265f);
            case 1:
                Object obj2 = pb.f23842j;
                return new ic(new bb(this.f23894b, null, e1.f23405a, j9.b.f43727o9, j9.h.f43737c));
            default:
                Object obj3 = vb.f24091a;
                return mb.d(context);
        }
    }
}
