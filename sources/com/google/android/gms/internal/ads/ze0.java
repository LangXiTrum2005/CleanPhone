package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ze0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eh0 f22588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ng0 f22589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f70 f22590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final td0 f22591d;

    public ze0(eh0 eh0Var, ng0 ng0Var, f70 f70Var, td0 td0Var) {
        this.f22588a = eh0Var;
        this.f22589b = ng0Var;
        this.f22590c = f70Var;
        this.f22591d = td0Var;
    }

    public final View a() {
        b30 b30VarA = this.f22588a.a(zzr.zzb(), null, null);
        b30VarA.zzE().setVisibility(8);
        final int i10 = 4;
        b30VarA.D("/sendMessageToSdk", new oq(this) { // from class: com.google.android.gms.internal.ads.ye0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ze0 f22218b;

            {
                this.f22218b = this;
            }

            @Override // com.google.android.gms.internal.ads.oq
            public final void b(Object obj, Map map) {
                int i11 = i10;
                ze0 ze0Var = this.f22218b;
                switch (i11) {
                    case 0:
                        ze0Var.f22591d.z();
                        break;
                    case 1:
                        b30 b30Var = (b30) obj;
                        b30Var.zzP().f14700g = new md0(18, ze0Var, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            b30Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                        } else {
                            b30Var.loadData(str, "text/html", "UTF-8");
                        }
                        break;
                    case 2:
                        int i12 = zze.zza;
                        zzo.zzh("Showing native ads overlay.");
                        ((b30) obj).zzE().setVisibility(0);
                        ze0Var.f22590c.f14302f = true;
                        break;
                    case 3:
                        int i13 = zze.zza;
                        zzo.zzh("Hiding native ads overlay.");
                        ((b30) obj).zzE().setVisibility(8);
                        ze0Var.f22590c.f14302f = false;
                        break;
                    default:
                        ze0Var.f22589b.d(map);
                        break;
                }
            }
        });
        final int i11 = 0;
        b30VarA.D("/adMuted", new oq(this) { // from class: com.google.android.gms.internal.ads.ye0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ze0 f22218b;

            {
                this.f22218b = this;
            }

            @Override // com.google.android.gms.internal.ads.oq
            public final void b(Object obj, Map map) {
                int i12 = i11;
                ze0 ze0Var = this.f22218b;
                switch (i12) {
                    case 0:
                        ze0Var.f22591d.z();
                        break;
                    case 1:
                        b30 b30Var = (b30) obj;
                        b30Var.zzP().f14700g = new md0(18, ze0Var, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            b30Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                        } else {
                            b30Var.loadData(str, "text/html", "UTF-8");
                        }
                        break;
                    case 2:
                        int i13 = zze.zza;
                        zzo.zzh("Showing native ads overlay.");
                        ((b30) obj).zzE().setVisibility(0);
                        ze0Var.f22590c.f14302f = true;
                        break;
                    case 3:
                        int i14 = zze.zza;
                        zzo.zzh("Hiding native ads overlay.");
                        ((b30) obj).zzE().setVisibility(8);
                        ze0Var.f22590c.f14302f = false;
                        break;
                    default:
                        ze0Var.f22589b.d(map);
                        break;
                }
            }
        });
        WeakReference weakReference = new WeakReference(b30VarA);
        final int i12 = 1;
        oq oqVar = new oq(this) { // from class: com.google.android.gms.internal.ads.ye0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ze0 f22218b;

            {
                this.f22218b = this;
            }

            @Override // com.google.android.gms.internal.ads.oq
            public final void b(Object obj, Map map) {
                int i13 = i12;
                ze0 ze0Var = this.f22218b;
                switch (i13) {
                    case 0:
                        ze0Var.f22591d.z();
                        break;
                    case 1:
                        b30 b30Var = (b30) obj;
                        b30Var.zzP().f14700g = new md0(18, ze0Var, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            b30Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                        } else {
                            b30Var.loadData(str, "text/html", "UTF-8");
                        }
                        break;
                    case 2:
                        int i14 = zze.zza;
                        zzo.zzh("Showing native ads overlay.");
                        ((b30) obj).zzE().setVisibility(0);
                        ze0Var.f22590c.f14302f = true;
                        break;
                    case 3:
                        int i15 = zze.zza;
                        zzo.zzh("Hiding native ads overlay.");
                        ((b30) obj).zzE().setVisibility(8);
                        ze0Var.f22590c.f14302f = false;
                        break;
                    default:
                        ze0Var.f22589b.d(map);
                        break;
                }
            }
        };
        ng0 ng0Var = this.f22589b;
        ng0Var.b("/loadHtml", new sd0(ng0Var, weakReference, "/loadHtml", oqVar));
        final int i13 = 2;
        ng0Var.b("/showOverlay", new sd0(ng0Var, new WeakReference(b30VarA), "/showOverlay", new oq(this) { // from class: com.google.android.gms.internal.ads.ye0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ze0 f22218b;

            {
                this.f22218b = this;
            }

            @Override // com.google.android.gms.internal.ads.oq
            public final void b(Object obj, Map map) {
                int i14 = i13;
                ze0 ze0Var = this.f22218b;
                switch (i14) {
                    case 0:
                        ze0Var.f22591d.z();
                        break;
                    case 1:
                        b30 b30Var = (b30) obj;
                        b30Var.zzP().f14700g = new md0(18, ze0Var, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            b30Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                        } else {
                            b30Var.loadData(str, "text/html", "UTF-8");
                        }
                        break;
                    case 2:
                        int i15 = zze.zza;
                        zzo.zzh("Showing native ads overlay.");
                        ((b30) obj).zzE().setVisibility(0);
                        ze0Var.f22590c.f14302f = true;
                        break;
                    case 3:
                        int i16 = zze.zza;
                        zzo.zzh("Hiding native ads overlay.");
                        ((b30) obj).zzE().setVisibility(8);
                        ze0Var.f22590c.f14302f = false;
                        break;
                    default:
                        ze0Var.f22589b.d(map);
                        break;
                }
            }
        }));
        final int i14 = 3;
        ng0Var.b("/hideOverlay", new sd0(ng0Var, new WeakReference(b30VarA), "/hideOverlay", new oq(this) { // from class: com.google.android.gms.internal.ads.ye0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ze0 f22218b;

            {
                this.f22218b = this;
            }

            @Override // com.google.android.gms.internal.ads.oq
            public final void b(Object obj, Map map) {
                int i15 = i14;
                ze0 ze0Var = this.f22218b;
                switch (i15) {
                    case 0:
                        ze0Var.f22591d.z();
                        break;
                    case 1:
                        b30 b30Var = (b30) obj;
                        b30Var.zzP().f14700g = new md0(18, ze0Var, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            b30Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                        } else {
                            b30Var.loadData(str, "text/html", "UTF-8");
                        }
                        break;
                    case 2:
                        int i16 = zze.zza;
                        zzo.zzh("Showing native ads overlay.");
                        ((b30) obj).zzE().setVisibility(0);
                        ze0Var.f22590c.f14302f = true;
                        break;
                    case 3:
                        int i17 = zze.zza;
                        zzo.zzh("Hiding native ads overlay.");
                        ((b30) obj).zzE().setVisibility(8);
                        ze0Var.f22590c.f14302f = false;
                        break;
                    default:
                        ze0Var.f22589b.d(map);
                        break;
                }
            }
        }));
        return b30VarA.zzE();
    }
}
