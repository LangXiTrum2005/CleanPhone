package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdz;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbp;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.zzc;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zm0 implements tm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f22670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f22671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f22672d;

    public /* synthetic */ zm0(Context context, Object obj, Executor executor, int i10) {
        this.f22669a = i10;
        this.f22670b = context;
        this.f22672d = obj;
        this.f22671c = executor;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x052f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0547  */
    private final Object c(ju0 ju0Var, du0 du0Var, qm0 qm0Var) throws eo0, qu0 {
        wu0 wu0Var;
        au auVar;
        eu euVar;
        bu buVar;
        je0 je0VarM;
        bu buVar2;
        wu0 wu0Var2 = (wu0) qm0Var.f19127b;
        ut utVar = wu0Var2.f21609a;
        try {
            au auVarN = utVar.n();
            try {
                bu buVarZzP = utVar.zzP();
                try {
                    eu euVarZzC = utVar.zzC();
                    if (euVarZzC == null || !d(ju0Var, 6)) {
                        if (auVarN != null && d(ju0Var, 6)) {
                            try {
                                Parcel parcelR = auVarN.r(auVarN.q(), 17);
                                zzea zzeaVarZzb = zzdz.zzb(parcelR.readStrongBinder());
                                parcelR.recycle();
                                ie0 ie0Var = zzeaVarZzb == null ? null : new ie0(zzeaVarZzb, null);
                                Parcel parcelR2 = auVarN.r(auVarN.q(), 19);
                                ho hoVarX1 = go.x1(parcelR2.readStrongBinder());
                                parcelR2.recycle();
                                Parcel parcelR3 = auVarN.r(auVarN.q(), 18);
                                s9.a aVarX1 = s9.b.x1(parcelR3.readStrongBinder());
                                parcelR3.recycle();
                                View view = (View) je0.n(aVarX1);
                                Parcel parcelR4 = auVarN.r(auVarN.q(), 2);
                                String string = parcelR4.readString();
                                parcelR4.recycle();
                                Parcel parcelR5 = auVarN.r(auVarN.q(), 3);
                                ArrayList arrayList = parcelR5.readArrayList(rh.f19590a);
                                parcelR5.recycle();
                                Parcel parcelR6 = auVarN.r(auVarN.q(), 4);
                                String string2 = parcelR6.readString();
                                parcelR6.recycle();
                                Parcel parcelR7 = auVarN.r(auVarN.q(), 15);
                                Bundle bundle = (Bundle) rh.b(parcelR7, Bundle.CREATOR);
                                parcelR7.recycle();
                                Parcel parcelR8 = auVarN.r(auVarN.q(), 6);
                                String string3 = parcelR8.readString();
                                parcelR8.recycle();
                                View view2 = (View) je0.n(auVarN.v1());
                                Parcel parcelR9 = auVarN.r(auVarN.q(), 21);
                                s9.a aVarX2 = s9.b.x1(parcelR9.readStrongBinder());
                                parcelR9.recycle();
                                Parcel parcelR10 = auVarN.r(auVarN.q(), 8);
                                String string4 = parcelR10.readString();
                                parcelR10.recycle();
                                Parcel parcelR11 = auVarN.r(auVarN.q(), 9);
                                String string5 = parcelR11.readString();
                                parcelR11.recycle();
                                Parcel parcelR12 = auVarN.r(auVarN.q(), 7);
                                double d10 = parcelR12.readDouble();
                                parcelR12.recycle();
                                Parcel parcelR13 = auVarN.r(auVarN.q(), 5);
                                mo moVarX1 = yn.x1(parcelR13.readStrongBinder());
                                parcelR13.recycle();
                                je0VarM = je0.m(ie0Var, hoVarX1, view, string, arrayList, string2, bundle, string3, view2, aVarX2, string4, string5, d10, moVarX1, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            } catch (RemoteException e10) {
                                int i10 = zze.zza;
                                zzo.zzj("Failed to get native ad assets from app install ad mapper", e10);
                                je0VarM = null;
                            }
                        } else if (auVarN == null || !d(ju0Var, 2)) {
                            wu0Var = wu0Var2;
                            auVar = auVarN;
                            euVar = euVarZzC;
                            if (buVarZzP != null && d(ju0Var, 6)) {
                                try {
                                    buVar2 = buVarZzP;
                                    try {
                                        Parcel parcelR14 = buVar2.r(buVarZzP.q(), 16);
                                        zzea zzeaVarZzb2 = zzdz.zzb(parcelR14.readStrongBinder());
                                        parcelR14.recycle();
                                        ie0 ie0Var2 = zzeaVarZzb2 == null ? null : new ie0(zzeaVarZzb2, null);
                                        Parcel parcelR15 = buVar2.r(buVar2.q(), 19);
                                        ho hoVarX2 = go.x1(parcelR15.readStrongBinder());
                                        parcelR15.recycle();
                                        Parcel parcelR16 = buVar2.r(buVar2.q(), 15);
                                        s9.a aVarX3 = s9.b.x1(parcelR16.readStrongBinder());
                                        parcelR16.recycle();
                                        View view3 = (View) je0.n(aVarX3);
                                        Parcel parcelR17 = buVar2.r(buVar2.q(), 2);
                                        String string6 = parcelR17.readString();
                                        parcelR17.recycle();
                                        Parcel parcelR18 = buVar2.r(buVar2.q(), 3);
                                        ArrayList arrayList2 = parcelR18.readArrayList(rh.f19590a);
                                        parcelR18.recycle();
                                        Parcel parcelR19 = buVar2.r(buVar2.q(), 4);
                                        String string7 = parcelR19.readString();
                                        parcelR19.recycle();
                                        Parcel parcelR20 = buVar2.r(buVar2.q(), 13);
                                        Bundle bundle2 = (Bundle) rh.b(parcelR20, Bundle.CREATOR);
                                        parcelR20.recycle();
                                        Parcel parcelR21 = buVar2.r(buVar2.q(), 6);
                                        String string8 = parcelR21.readString();
                                        parcelR21.recycle();
                                        View view4 = (View) je0.n(buVar2.zzu());
                                        Parcel parcelR22 = buVar2.r(buVar2.q(), 21);
                                        s9.a aVarX4 = s9.b.x1(parcelR22.readStrongBinder());
                                        parcelR22.recycle();
                                        Parcel parcelR23 = buVar2.r(buVar2.q(), 5);
                                        mo moVarX2 = yn.x1(parcelR23.readStrongBinder());
                                        parcelR23.recycle();
                                        Parcel parcelR24 = buVar2.r(buVar2.q(), 7);
                                        String string9 = parcelR24.readString();
                                        parcelR24.recycle();
                                        je0VarM = je0.m(ie0Var2, hoVarX2, view3, string6, arrayList2, string7, bundle2, string8, view4, aVarX4, null, null, -1.0d, moVarX2, string9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    } catch (RemoteException e11) {
                                        e = e11;
                                        int i11 = zze.zza;
                                        zzo.zzj("Failed to get native ad assets from content ad mapper", e);
                                        je0VarM = null;
                                    }
                                } catch (RemoteException e12) {
                                    e = e12;
                                    buVar2 = buVarZzP;
                                }
                                buVar = buVar2;
                            } else {
                                if (buVarZzP == null || !d(ju0Var, 1)) {
                                    throw new eo0(1, "No native ad mappers");
                                }
                                try {
                                    Parcel parcelR25 = buVarZzP.r(buVarZzP.q(), 16);
                                    zzea zzeaVarZzb3 = zzdz.zzb(parcelR25.readStrongBinder());
                                    parcelR25.recycle();
                                    ie0 ie0Var3 = zzeaVarZzb3 == null ? null : new ie0(zzeaVarZzb3, null);
                                    Parcel parcelR26 = buVarZzP.r(buVarZzP.q(), 19);
                                    ho hoVarX3 = go.x1(parcelR26.readStrongBinder());
                                    parcelR26.recycle();
                                    Parcel parcelR27 = buVarZzP.r(buVarZzP.q(), 15);
                                    s9.a aVarX5 = s9.b.x1(parcelR27.readStrongBinder());
                                    parcelR27.recycle();
                                    View view5 = (View) je0.n(aVarX5);
                                    Parcel parcelR28 = buVarZzP.r(buVarZzP.q(), 2);
                                    String string10 = parcelR28.readString();
                                    parcelR28.recycle();
                                    Parcel parcelR29 = buVarZzP.r(buVarZzP.q(), 3);
                                    ArrayList arrayList3 = parcelR29.readArrayList(rh.f19590a);
                                    parcelR29.recycle();
                                    Parcel parcelR30 = buVarZzP.r(buVarZzP.q(), 4);
                                    String string11 = parcelR30.readString();
                                    parcelR30.recycle();
                                    Parcel parcelR31 = buVarZzP.r(buVarZzP.q(), 13);
                                    Bundle bundle3 = (Bundle) rh.b(parcelR31, Bundle.CREATOR);
                                    parcelR31.recycle();
                                    Parcel parcelR32 = buVarZzP.r(buVarZzP.q(), 6);
                                    String string12 = parcelR32.readString();
                                    parcelR32.recycle();
                                    View view6 = (View) je0.n(buVarZzP.zzu());
                                    Parcel parcelR33 = buVarZzP.r(buVarZzP.q(), 21);
                                    s9.a aVarX6 = s9.b.x1(parcelR33.readStrongBinder());
                                    parcelR33.recycle();
                                    Parcel parcelR34 = buVarZzP.r(buVarZzP.q(), 7);
                                    String string13 = parcelR34.readString();
                                    parcelR34.recycle();
                                    Parcel parcelR35 = buVarZzP.r(buVarZzP.q(), 5);
                                    mo moVarX3 = yn.x1(parcelR35.readStrongBinder());
                                    parcelR35.recycle();
                                    je0 je0Var = new je0();
                                    buVar = buVarZzP;
                                    try {
                                        je0Var.f16050a = 1;
                                        je0Var.f16051b = ie0Var3;
                                        je0Var.f16052c = hoVarX3;
                                        je0Var.f16053d = view5;
                                        je0Var.o("headline", string10);
                                        je0Var.f16054e = arrayList3;
                                        je0Var.o("body", string11);
                                        je0Var.f16057h = bundle3;
                                        je0Var.o("call_to_action", string12);
                                        je0Var.f16063o = view6;
                                        je0Var.f16065q = aVarX6;
                                        je0Var.o(X3.i.F0, string13);
                                        je0Var.f16068t = moVarX3;
                                        je0VarM = je0Var;
                                    } catch (RemoteException e13) {
                                        e = e13;
                                        int i12 = zze.zza;
                                        zzo.zzj("Failed to get native ad from content ad mapper", e);
                                        je0VarM = null;
                                    }
                                } catch (RemoteException e14) {
                                    e = e14;
                                    buVar = buVarZzP;
                                }
                            }
                        } else {
                            try {
                                Parcel parcelR36 = auVarN.r(auVarN.q(), 17);
                                zzea zzeaVarZzb4 = zzdz.zzb(parcelR36.readStrongBinder());
                                parcelR36.recycle();
                                ie0 ie0Var4 = zzeaVarZzb4 == null ? null : new ie0(zzeaVarZzb4, null);
                                Parcel parcelR37 = auVarN.r(auVarN.q(), 19);
                                ho hoVarX4 = go.x1(parcelR37.readStrongBinder());
                                parcelR37.recycle();
                                Parcel parcelR38 = auVarN.r(auVarN.q(), 18);
                                s9.a aVarX7 = s9.b.x1(parcelR38.readStrongBinder());
                                parcelR38.recycle();
                                View view7 = (View) je0.n(aVarX7);
                                Parcel parcelR39 = auVarN.r(auVarN.q(), 2);
                                String string14 = parcelR39.readString();
                                parcelR39.recycle();
                                Parcel parcelR40 = auVarN.r(auVarN.q(), 3);
                                ArrayList arrayList4 = parcelR40.readArrayList(rh.f19590a);
                                parcelR40.recycle();
                                wu0Var = wu0Var2;
                                try {
                                    Parcel parcelR41 = auVarN.r(auVarN.q(), 4);
                                    String string15 = parcelR41.readString();
                                    parcelR41.recycle();
                                    euVar = euVarZzC;
                                    try {
                                        Parcel parcelR42 = auVarN.r(auVarN.q(), 15);
                                        Bundle bundle4 = (Bundle) rh.b(parcelR42, Bundle.CREATOR);
                                        parcelR42.recycle();
                                        Parcel parcelR43 = auVarN.r(auVarN.q(), 6);
                                        String string16 = parcelR43.readString();
                                        parcelR43.recycle();
                                        View view8 = (View) je0.n(auVarN.v1());
                                        buVar = buVarZzP;
                                        try {
                                            Parcel parcelR44 = auVarN.r(auVarN.q(), 21);
                                            s9.a aVarX8 = s9.b.x1(parcelR44.readStrongBinder());
                                            parcelR44.recycle();
                                            Parcel parcelR45 = auVarN.r(auVarN.q(), 8);
                                            String string17 = parcelR45.readString();
                                            parcelR45.recycle();
                                            Parcel parcelR46 = auVarN.r(auVarN.q(), 9);
                                            String string18 = parcelR46.readString();
                                            parcelR46.recycle();
                                            Parcel parcelR47 = auVarN.r(auVarN.q(), 7);
                                            double d11 = parcelR47.readDouble();
                                            parcelR47.recycle();
                                            Parcel parcelR48 = auVarN.r(auVarN.q(), 5);
                                            mo moVarX4 = yn.x1(parcelR48.readStrongBinder());
                                            parcelR48.recycle();
                                            je0 je0Var2 = new je0();
                                            auVar = auVarN;
                                            try {
                                                je0Var2.f16050a = 2;
                                                je0Var2.f16051b = ie0Var4;
                                                je0Var2.f16052c = hoVarX4;
                                                je0Var2.f16053d = view7;
                                                je0Var2.o("headline", string14);
                                                je0Var2.f16054e = arrayList4;
                                                je0Var2.o("body", string15);
                                                je0Var2.f16057h = bundle4;
                                                je0Var2.o("call_to_action", string16);
                                                je0Var2.f16063o = view8;
                                                je0Var2.f16065q = aVarX8;
                                                je0Var2.o(X3.i.U, string17);
                                                je0Var2.o("price", string18);
                                                je0Var2.f16066r = d11;
                                                je0Var2.f16067s = moVarX4;
                                                je0VarM = je0Var2;
                                            } catch (RemoteException e15) {
                                                e = e15;
                                                int i13 = zze.zza;
                                                zzo.zzj("Failed to get native ad from app install ad mapper", e);
                                                je0VarM = null;
                                            }
                                        } catch (RemoteException e16) {
                                            e = e16;
                                            auVar = auVarN;
                                        }
                                    } catch (RemoteException e17) {
                                        e = e17;
                                        auVar = auVarN;
                                        buVar = buVarZzP;
                                    }
                                } catch (RemoteException e18) {
                                    e = e18;
                                    auVar = auVarN;
                                    buVar = buVarZzP;
                                    euVar = euVarZzC;
                                    int i14 = zze.zza;
                                    zzo.zzj("Failed to get native ad from app install ad mapper", e);
                                    je0VarM = null;
                                    if (je0VarM != null) {
                                        if (((ou0) ju0Var.f16195a.f20839b).f18367h.contains(Integer.toString(je0VarM.q()))) {
                                            pd0 pd0Var = (pd0) this.f22672d;
                                            vu0 vu0Var = new vu0(ju0Var, du0Var, qm0Var.f19126a);
                                            so0 so0Var = new so0(je0VarM, 21);
                                            hf0 hf0Var = new hf0(buVar, auVar, euVar);
                                            y40 y40Var = (y40) pd0Var;
                                            a50 a50Var = y40Var.f22103b;
                                            y40 y40Var2 = y40Var.f22104c;
                                            t80 t80Var = new t80(vu0Var, 0);
                                            fx1 fx1Var = y40Var2.f22109h;
                                            ei eiVar = a50Var.G0;
                                            fx1 fx1VarA = fx1.a(new p60(fx1Var, t80Var, 1));
                                            fx1 fx1VarA2 = fx1.a(new g90(fx1VarA, 7));
                                            int i15 = lx1.f17149c;
                                            ArrayList arrayList5 = new ArrayList(1);
                                            ArrayList arrayList6 = new ArrayList(2);
                                            arrayList6.add(y40Var2.f22117q);
                                            arrayList6.add(y40Var2.f22118r);
                                            arrayList5.add(fx1VarA2);
                                            fx1 fx1VarA3 = fx1.a(new ca0(new lx1(arrayList5, arrayList6), 3));
                                            fx1 fx1VarA4 = fx1.a(ps1.f18799g);
                                            fx1 fx1Var2 = a50Var.f11856c;
                                            fx1 fx1VarA5 = fx1.a(new a70(fx1VarA4, (kx1) fx1Var2, 4));
                                            t80 t80Var2 = new t80(vu0Var, 3);
                                            t80 t80Var3 = new t80(vu0Var, 2);
                                            o40 o40Var = a50Var.f11864g;
                                            fx1 fx1VarA6 = fx1.a(new n60(a50Var.N, a50Var.M, t80Var, t80Var3, fx1.a(new n60(o40Var, a50Var.F, fx1.a(new v50(o40Var, 24)), fx1.a(rb0.f19504g), a50Var.E0, a50Var.f11858d)), y40Var2.f22106e));
                                            qd0 qd0Var = new qd0(4);
                                            qd0 qd0Var2 = new qd0(2);
                                            fx1 fx1VarA7 = fx1.a(new a70(fx1VarA4, (kx1) fx1Var2, 9));
                                            fx1 fx1VarA8 = fx1.a(dv.f13735g);
                                            wd0 wd0Var = new wd0(fx1VarA8, 2);
                                            ArrayList arrayList7 = new ArrayList(2);
                                            ArrayList arrayList8 = new ArrayList(1);
                                            arrayList8.add(y40Var2.f22123w);
                                            arrayList7.add(fx1VarA7);
                                            arrayList7.add(wd0Var);
                                            fx1 fx1VarA9 = fx1.a(new fz(new lx1(arrayList7, arrayList8), t80Var, t80Var2, 5));
                                            fx1 fx1VarA10 = fx1.a(new e60(t80Var2, 8));
                                            fx1 fx1VarA11 = fx1.a(new v60(a50Var.f11864g, a50Var.f11856c, a50Var.f11858d, t80Var2, t80Var, y40Var2.f22113m, fx1VarA6, qd0Var, qd0Var2, a50Var.J, y40Var2.f22114n, y40Var2.f22106e, y40Var2.f22122v, fx1VarA9, fx1VarA10, y40Var2.f22112k));
                                            r40 r40Var = new r40(fx1VarA11, 24);
                                            g90 g90Var = new g90(fx1.a(new p60(t80Var, a50Var.Z, 0)), 11);
                                            ArrayList arrayList9 = new ArrayList(4);
                                            ArrayList arrayList10 = new ArrayList(2);
                                            arrayList9.add(y40Var2.f22119s);
                                            arrayList10.add(y40Var2.f22120t);
                                            arrayList10.add(y40Var2.f22121u);
                                            arrayList9.add(fx1VarA5);
                                            arrayList9.add(r40Var);
                                            arrayList9.add(g90Var);
                                            fx1 fx1VarA12 = fx1.a(new ca0(new lx1(arrayList9, arrayList10), 4));
                                            fx1 fx1VarA13 = fx1.a(new j90(a50Var.f11864g, a50Var.D0, a50Var.f11874m, t80Var2, t80Var, a50Var.L, ps1.f18800h));
                                            fx1 fx1VarA14 = fx1.a(new g90(fx1VarA13, 5));
                                            fx1 fx1VarA15 = fx1.a(new a70(fx1VarA4, (kx1) fx1Var2, 3));
                                            fx1 fx1Var3 = a50Var.f11899z0;
                                            z90 z90Var = y40Var2.f22105d;
                                            fx1 fx1VarA16 = fx1.a(new g90(fx1.a(new w70(fx1Var3, z90Var, 1)), 3));
                                            r40 r40Var2 = new r40(fx1VarA11, 23);
                                            ArrayList arrayList11 = new ArrayList(5);
                                            ArrayList arrayList12 = new ArrayList(3);
                                            arrayList11.add(y40Var2.f22124x);
                                            arrayList11.add(y40Var2.f22125y);
                                            arrayList12.add(y40Var2.f22126z);
                                            arrayList12.add(y40Var2.A);
                                            arrayList11.add(fx1VarA14);
                                            arrayList11.add(fx1VarA15);
                                            arrayList12.add(fx1VarA16);
                                            arrayList11.add(r40Var2);
                                            fx1 fx1VarA17 = fx1.a(new ca0(new lx1(arrayList11, arrayList12), 0));
                                            fx1 fx1VarA18 = fx1.a(new g90(fx1VarA13, 6));
                                            fx1 fx1VarA19 = fx1.a(new a70(fx1VarA4, (kx1) fx1Var2, 6));
                                            fx1 fx1VarA20 = fx1.a(new v50(y40Var2.f22108g, 14));
                                            r40 r40Var3 = new r40(fx1VarA9, 12);
                                            r40 r40Var4 = new r40(fx1VarA11, 26);
                                            ArrayList arrayList13 = new ArrayList(7);
                                            ArrayList arrayList14 = new ArrayList(2);
                                            arrayList13.add(y40Var2.B);
                                            arrayList13.add(y40Var2.C);
                                            arrayList14.add(y40Var2.D);
                                            arrayList14.add(y40Var2.E);
                                            arrayList13.add(fx1VarA18);
                                            arrayList13.add(fx1VarA19);
                                            arrayList13.add(fx1VarA20);
                                            arrayList13.add(r40Var3);
                                            arrayList13.add(r40Var4);
                                            fx1 fx1VarA21 = fx1.a(new ca0(new lx1(arrayList13, arrayList14), 2));
                                            r40 r40Var5 = new r40(fx1VarA11, 29);
                                            ArrayList arrayList15 = new ArrayList(1);
                                            ArrayList arrayList16 = new ArrayList(1);
                                            arrayList16.add(y40Var2.F);
                                            arrayList15.add(r40Var5);
                                            fx1 fx1VarA22 = fx1.a(new ca0(new lx1(arrayList15, arrayList16), 19));
                                            r40 r40Var6 = new r40(fx1.a(new p60(t80Var, a50Var.N, 2)), 22);
                                            ArrayList arrayList17 = new ArrayList(1);
                                            new ArrayList(1).add(y40Var2.G);
                                            arrayList17.add(r40Var6);
                                            fx1 fx1VarA23 = fx1.a(new a70(fx1VarA4, (kx1) fx1Var2, 10));
                                            ArrayList arrayList18 = new ArrayList(1);
                                            ArrayList arrayList19 = new ArrayList(1);
                                            arrayList19.add(y40Var2.H);
                                            arrayList18.add(fx1VarA23);
                                            fx1 fx1VarA24 = fx1.a(new ca0(new lx1(arrayList18, arrayList19), 20));
                                            fx1 fx1VarA25 = fx1.a(new g90(fx1VarA, 8));
                                            r40 r40Var7 = new r40(fx1VarA11, 27);
                                            ArrayList arrayList20 = new ArrayList(7);
                                            ArrayList arrayList21 = new ArrayList(4);
                                            arrayList20.add(y40Var2.I);
                                            arrayList21.add(y40Var2.J);
                                            arrayList20.add(y40Var2.K);
                                            arrayList20.add(y40Var2.L);
                                            arrayList21.add(y40Var2.M);
                                            arrayList21.add(y40Var2.N);
                                            arrayList21.add(y40Var2.O);
                                            arrayList20.add(y40Var2.P);
                                            arrayList20.add(y40Var2.Q);
                                            arrayList20.add(fx1VarA25);
                                            arrayList20.add(r40Var7);
                                            fx1 fx1VarA26 = fx1.a(new ca0(new lx1(arrayList20, arrayList21), 5));
                                            g90 g90Var2 = new g90(fx1.a(new r40(fx1VarA12, 11)), 1);
                                            fx1 fx1VarA27 = fx1.a(new a70(fx1VarA4, (kx1) fx1Var2, 8));
                                            ArrayList arrayList22 = new ArrayList(2);
                                            ArrayList arrayList23 = new ArrayList(1);
                                            arrayList23.add(y40Var2.S);
                                            arrayList22.add(g90Var2);
                                            arrayList22.add(fx1VarA27);
                                            fx1 fx1VarA28 = fx1.a(new ca0(new lx1(arrayList22, arrayList23), 9));
                                            e60 e60Var = new e60(so0Var, 13);
                                            jf0 jf0Var = new jf0(new zd0(e60Var, 1), fx1Var2);
                                            ArrayList arrayList24 = new ArrayList(1);
                                            ArrayList arrayList25 = new ArrayList(1);
                                            arrayList25.add(y40Var2.T);
                                            arrayList24.add(jf0Var);
                                            fx1 fx1VarA29 = fx1.a(new yc0(new lx1(arrayList24, arrayList25)));
                                            fx1 fx1VarA30 = fx1.a(new g90(fx1VarA13, 4));
                                            if0 if0Var = new if0(hf0Var, 0);
                                            if0 if0Var2 = new if0(hf0Var, 1);
                                            if0 if0Var3 = new if0(hf0Var, 2);
                                            fx1 fx1VarA31 = fx1.a(new g90(fx1VarA13, 2));
                                            r40 r40Var8 = new r40(fx1VarA11, 28);
                                            ArrayList arrayList26 = new ArrayList(2);
                                            ArrayList arrayList27 = new ArrayList(1);
                                            arrayList27.add(y40Var2.f22102a0);
                                            arrayList26.add(fx1VarA31);
                                            arrayList26.add(r40Var8);
                                            fx1 fx1VarA32 = fx1.a(new w80(if0Var, if0Var2, if0Var3, fx1VarA21, fx1.a(new ca0(new lx1(arrayList26, arrayList27), 10)), fx1VarA17, fx1VarA24, y40Var2.f22109h, t80Var, a50Var.f11865h, z90Var));
                                            wd0 wd0Var2 = new wd0(fx1VarA32, 5);
                                            ArrayList arrayList28 = new ArrayList(1);
                                            ArrayList arrayList29 = new ArrayList(1);
                                            arrayList28.add(fx1VarA30);
                                            arrayList29.add(wd0Var2);
                                            fx1 fx1VarA33 = fx1.a(new ca0(new lx1(arrayList28, arrayList29), 13));
                                            fx1 fx1VarA34 = fx1.a(new a70(fx1VarA4, (kx1) fx1Var2, 5));
                                            r40 r40Var9 = new r40(fx1VarA11, 25);
                                            ArrayList arrayList30 = new ArrayList(2);
                                            ArrayList arrayList31 = new ArrayList(1);
                                            arrayList31.add(y40Var2.U);
                                            arrayList30.add(fx1VarA34);
                                            arrayList30.add(r40Var9);
                                            ca0 ca0Var = new ca0(new lx1(arrayList30, arrayList31), 1);
                                            fx1 fx1VarA35 = fx1.a(new g90(fx1VarA13, 0));
                                            ArrayList arrayList32 = new ArrayList(1);
                                            List list = Collections.EMPTY_LIST;
                                            arrayList32.add(fx1VarA35);
                                            fx1 fx1VarA36 = fx1.a(new fz(ca0Var, new lx1(arrayList32, list), a50Var.f11858d, 4));
                                            t80 t80Var4 = new t80(vu0Var, 1);
                                            d80 d80Var = new d80(t80Var, t80Var4, y40Var2.f22110i, t80Var3, y40Var2.f22107f);
                                            ArrayList arrayList33 = new ArrayList(1);
                                            ArrayList arrayList34 = new ArrayList(1);
                                            arrayList34.add(y40Var2.W);
                                            arrayList33.add(y40Var2.X);
                                            w80 w80Var = new w80(t80Var2, t80Var, fx1VarA3, fx1VarA26, y40Var2.V, d80Var, fx1VarA4, new ca0(new lx1(arrayList33, arrayList34), 6), fx1VarA22, fx1VarA10, a50Var.f11879o0);
                                            wd0 wd0Var3 = new wd0(fx1VarA32, 4);
                                            fx1 fx1VarA37 = fx1.a(new g70(t80Var, 1));
                                            qd0 qd0Var3 = new qd0(5);
                                            qd0 qd0Var4 = new qd0(6);
                                            fx1 fx1VarA38 = fx1.a(new e60(new zd0(e60Var, 0), 12));
                                            k40 k40Var = a50Var.F;
                                            fx1 fx1Var4 = a50Var.f11856c;
                                            te0 te0Var = new te0(k40Var, z90Var, fx1VarA37, e60Var, qd0Var3, qd0Var4, fx1Var4, fx1VarA38);
                                            er0 er0Var = new er0();
                                            fx1 fx1VarA39 = fx1.a(new fg0(t80Var4, er0Var, e60Var, 1));
                                            fx1 fx1VarA40 = fx1.a(new fg0(t80Var4, er0Var, e60Var, 0));
                                            fx1 fx1VarA41 = fx1.a(new l40((kx1) t80Var4, (kx1) er0Var, (kx1) e60Var, (kx1) a50Var.f11874m, 8));
                                            fx1 fx1VarA42 = fx1.a(new oz(er0Var, e60Var, 16));
                                            o40 o40Var2 = a50Var.f11864g;
                                            er0.a(er0Var, fx1.a(new fe0(w80Var, fx1Var4, e60Var, wd0Var3, te0Var, fx1VarA37, y40Var2.f22111j, fx1VarA39, fx1VarA40, fx1VarA41, fx1VarA42, fx1.a(new l40(o40Var2, e60Var, te0Var, er0Var, 7)), new oe0(o40Var2, z90Var), a50Var.J, a50Var.f11865h, o40Var2, fx1VarA38, fx1VarA8, a50Var.N0)));
                                            ((jn0) qm0Var.f19128c).y1(new qo0((ba0) fx1VarA17.zzb(), (pc0) fx1VarA24.zzb(), (ma0) fx1VarA21.zzb(), (qa0) fx1VarA12.zzb(), (sa0) fx1VarA26.zzb(), (tb0) y40Var2.R.zzb(), (bb0) fx1VarA28.zzb(), (xc0) fx1VarA29.zzb(), (qb0) fx1VarA33.zzb(), (ka0) fx1VarA36.zzb()));
                                            ((pa0) fx1VarA3.zzb()).P0(new k60(wu0Var, 0), this.f22671c);
                                            return (ee0) er0Var.zzb();
                                        }
                                    }
                                    throw new eo0(1, "No corresponding native ad listener");
                                }
                            } catch (RemoteException e19) {
                                e = e19;
                                wu0Var = wu0Var2;
                            }
                        }
                        if (je0VarM != null) {
                            if (((ou0) ju0Var.f16195a.f20839b).f18367h.contains(Integer.toString(je0VarM.q()))) {
                                pd0 pd0Var2 = (pd0) this.f22672d;
                                vu0 vu0Var2 = new vu0(ju0Var, du0Var, qm0Var.f19126a);
                                so0 so0Var2 = new so0(je0VarM, 21);
                                hf0 hf0Var2 = new hf0(buVar, auVar, euVar);
                                y40 y40Var3 = (y40) pd0Var2;
                                a50 a50Var2 = y40Var3.f22103b;
                                y40 y40Var4 = y40Var3.f22104c;
                                t80 t80Var5 = new t80(vu0Var2, 0);
                                fx1 fx1Var5 = y40Var4.f22109h;
                                ei eiVar2 = a50Var2.G0;
                                fx1 fx1VarA43 = fx1.a(new p60(fx1Var5, t80Var5, 1));
                                fx1 fx1VarA44 = fx1.a(new g90(fx1VarA43, 7));
                                int i16 = lx1.f17149c;
                                ArrayList arrayList35 = new ArrayList(1);
                                ArrayList arrayList36 = new ArrayList(2);
                                arrayList36.add(y40Var4.f22117q);
                                arrayList36.add(y40Var4.f22118r);
                                arrayList35.add(fx1VarA44);
                                fx1 fx1VarA45 = fx1.a(new ca0(new lx1(arrayList35, arrayList36), 3));
                                fx1 fx1VarA46 = fx1.a(ps1.f18799g);
                                fx1 fx1Var6 = a50Var2.f11856c;
                                fx1 fx1VarA47 = fx1.a(new a70(fx1VarA46, (kx1) fx1Var6, 4));
                                t80 t80Var6 = new t80(vu0Var2, 3);
                                t80 t80Var7 = new t80(vu0Var2, 2);
                                o40 o40Var3 = a50Var2.f11864g;
                                fx1 fx1VarA48 = fx1.a(new n60(a50Var2.N, a50Var2.M, t80Var5, t80Var7, fx1.a(new n60(o40Var3, a50Var2.F, fx1.a(new v50(o40Var3, 24)), fx1.a(rb0.f19504g), a50Var2.E0, a50Var2.f11858d)), y40Var4.f22106e));
                                qd0 qd0Var5 = new qd0(4);
                                qd0 qd0Var6 = new qd0(2);
                                fx1 fx1VarA49 = fx1.a(new a70(fx1VarA46, (kx1) fx1Var6, 9));
                                fx1 fx1VarA50 = fx1.a(dv.f13735g);
                                wd0 wd0Var4 = new wd0(fx1VarA50, 2);
                                ArrayList arrayList37 = new ArrayList(2);
                                ArrayList arrayList38 = new ArrayList(1);
                                arrayList38.add(y40Var4.f22123w);
                                arrayList37.add(fx1VarA49);
                                arrayList37.add(wd0Var4);
                                fx1 fx1VarA51 = fx1.a(new fz(new lx1(arrayList37, arrayList38), t80Var5, t80Var6, 5));
                                fx1 fx1VarA110 = fx1.a(new e60(t80Var6, 8));
                                fx1 fx1VarA111 = fx1.a(new v60(a50Var2.f11864g, a50Var2.f11856c, a50Var2.f11858d, t80Var6, t80Var5, y40Var4.f22113m, fx1VarA48, qd0Var5, qd0Var6, a50Var2.J, y40Var4.f22114n, y40Var4.f22106e, y40Var4.f22122v, fx1VarA51, fx1VarA110, y40Var4.f22112k));
                                r40 r40Var10 = new r40(fx1VarA111, 24);
                                g90 g90Var3 = new g90(fx1.a(new p60(t80Var5, a50Var2.Z, 0)), 11);
                                ArrayList arrayList39 = new ArrayList(4);
                                ArrayList arrayList110 = new ArrayList(2);
                                arrayList39.add(y40Var4.f22119s);
                                arrayList110.add(y40Var4.f22120t);
                                arrayList110.add(y40Var4.f22121u);
                                arrayList39.add(fx1VarA47);
                                arrayList39.add(r40Var10);
                                arrayList39.add(g90Var3);
                                fx1 fx1VarA112 = fx1.a(new ca0(new lx1(arrayList39, arrayList110), 4));
                                fx1 fx1VarA113 = fx1.a(new j90(a50Var2.f11864g, a50Var2.D0, a50Var2.f11874m, t80Var6, t80Var5, a50Var2.L, ps1.f18800h));
                                fx1 fx1VarA114 = fx1.a(new g90(fx1VarA113, 5));
                                fx1 fx1VarA115 = fx1.a(new a70(fx1VarA46, (kx1) fx1Var6, 3));
                                fx1 fx1Var7 = a50Var2.f11899z0;
                                z90 z90Var2 = y40Var4.f22105d;
                                fx1 fx1VarA116 = fx1.a(new g90(fx1.a(new w70(fx1Var7, z90Var2, 1)), 3));
                                r40 r40Var11 = new r40(fx1VarA111, 23);
                                ArrayList arrayList111 = new ArrayList(5);
                                ArrayList arrayList112 = new ArrayList(3);
                                arrayList111.add(y40Var4.f22124x);
                                arrayList111.add(y40Var4.f22125y);
                                arrayList112.add(y40Var4.f22126z);
                                arrayList112.add(y40Var4.A);
                                arrayList111.add(fx1VarA114);
                                arrayList111.add(fx1VarA115);
                                arrayList112.add(fx1VarA116);
                                arrayList111.add(r40Var11);
                                fx1 fx1VarA117 = fx1.a(new ca0(new lx1(arrayList111, arrayList112), 0));
                                fx1 fx1VarA118 = fx1.a(new g90(fx1VarA113, 6));
                                fx1 fx1VarA119 = fx1.a(new a70(fx1VarA46, (kx1) fx1Var6, 6));
                                fx1 fx1VarA210 = fx1.a(new v50(y40Var4.f22108g, 14));
                                r40 r40Var12 = new r40(fx1VarA51, 12);
                                r40 r40Var13 = new r40(fx1VarA111, 26);
                                ArrayList arrayList113 = new ArrayList(7);
                                ArrayList arrayList114 = new ArrayList(2);
                                arrayList113.add(y40Var4.B);
                                arrayList113.add(y40Var4.C);
                                arrayList114.add(y40Var4.D);
                                arrayList114.add(y40Var4.E);
                                arrayList113.add(fx1VarA118);
                                arrayList113.add(fx1VarA119);
                                arrayList113.add(fx1VarA210);
                                arrayList113.add(r40Var12);
                                arrayList113.add(r40Var13);
                                fx1 fx1VarA211 = fx1.a(new ca0(new lx1(arrayList113, arrayList114), 2));
                                r40 r40Var14 = new r40(fx1VarA111, 29);
                                ArrayList arrayList115 = new ArrayList(1);
                                ArrayList arrayList116 = new ArrayList(1);
                                arrayList116.add(y40Var4.F);
                                arrayList115.add(r40Var14);
                                fx1 fx1VarA212 = fx1.a(new ca0(new lx1(arrayList115, arrayList116), 19));
                                r40 r40Var15 = new r40(fx1.a(new p60(t80Var5, a50Var2.N, 2)), 22);
                                ArrayList arrayList117 = new ArrayList(1);
                                new ArrayList(1).add(y40Var4.G);
                                arrayList117.add(r40Var15);
                                fx1 fx1VarA213 = fx1.a(new a70(fx1VarA46, (kx1) fx1Var6, 10));
                                ArrayList arrayList118 = new ArrayList(1);
                                ArrayList arrayList119 = new ArrayList(1);
                                arrayList119.add(y40Var4.H);
                                arrayList118.add(fx1VarA213);
                                fx1 fx1VarA214 = fx1.a(new ca0(new lx1(arrayList118, arrayList119), 20));
                                fx1 fx1VarA215 = fx1.a(new g90(fx1VarA43, 8));
                                r40 r40Var16 = new r40(fx1VarA111, 27);
                                ArrayList arrayList210 = new ArrayList(7);
                                ArrayList arrayList211 = new ArrayList(4);
                                arrayList210.add(y40Var4.I);
                                arrayList211.add(y40Var4.J);
                                arrayList210.add(y40Var4.K);
                                arrayList210.add(y40Var4.L);
                                arrayList211.add(y40Var4.M);
                                arrayList211.add(y40Var4.N);
                                arrayList211.add(y40Var4.O);
                                arrayList210.add(y40Var4.P);
                                arrayList210.add(y40Var4.Q);
                                arrayList210.add(fx1VarA215);
                                arrayList210.add(r40Var16);
                                fx1 fx1VarA216 = fx1.a(new ca0(new lx1(arrayList210, arrayList211), 5));
                                g90 g90Var4 = new g90(fx1.a(new r40(fx1VarA112, 11)), 1);
                                fx1 fx1VarA217 = fx1.a(new a70(fx1VarA46, (kx1) fx1Var6, 8));
                                ArrayList arrayList212 = new ArrayList(2);
                                ArrayList arrayList213 = new ArrayList(1);
                                arrayList213.add(y40Var4.S);
                                arrayList212.add(g90Var4);
                                arrayList212.add(fx1VarA217);
                                fx1 fx1VarA218 = fx1.a(new ca0(new lx1(arrayList212, arrayList213), 9));
                                e60 e60Var2 = new e60(so0Var2, 13);
                                jf0 jf0Var2 = new jf0(new zd0(e60Var2, 1), fx1Var6);
                                ArrayList arrayList214 = new ArrayList(1);
                                ArrayList arrayList215 = new ArrayList(1);
                                arrayList215.add(y40Var4.T);
                                arrayList214.add(jf0Var2);
                                fx1 fx1VarA219 = fx1.a(new yc0(new lx1(arrayList214, arrayList215)));
                                fx1 fx1VarA310 = fx1.a(new g90(fx1VarA113, 4));
                                if0 if0Var4 = new if0(hf0Var2, 0);
                                if0 if0Var5 = new if0(hf0Var2, 1);
                                if0 if0Var6 = new if0(hf0Var2, 2);
                                fx1 fx1VarA311 = fx1.a(new g90(fx1VarA113, 2));
                                r40 r40Var17 = new r40(fx1VarA111, 28);
                                ArrayList arrayList216 = new ArrayList(2);
                                ArrayList arrayList217 = new ArrayList(1);
                                arrayList217.add(y40Var4.f22102a0);
                                arrayList216.add(fx1VarA311);
                                arrayList216.add(r40Var17);
                                fx1 fx1VarA312 = fx1.a(new w80(if0Var4, if0Var5, if0Var6, fx1VarA211, fx1.a(new ca0(new lx1(arrayList216, arrayList217), 10)), fx1VarA117, fx1VarA214, y40Var4.f22109h, t80Var5, a50Var2.f11865h, z90Var2));
                                wd0 wd0Var5 = new wd0(fx1VarA312, 5);
                                ArrayList arrayList218 = new ArrayList(1);
                                ArrayList arrayList219 = new ArrayList(1);
                                arrayList218.add(fx1VarA310);
                                arrayList219.add(wd0Var5);
                                fx1 fx1VarA313 = fx1.a(new ca0(new lx1(arrayList218, arrayList219), 13));
                                fx1 fx1VarA314 = fx1.a(new a70(fx1VarA46, (kx1) fx1Var6, 5));
                                r40 r40Var18 = new r40(fx1VarA111, 25);
                                ArrayList arrayList310 = new ArrayList(2);
                                ArrayList arrayList311 = new ArrayList(1);
                                arrayList311.add(y40Var4.U);
                                arrayList310.add(fx1VarA314);
                                arrayList310.add(r40Var18);
                                ca0 ca0Var2 = new ca0(new lx1(arrayList310, arrayList311), 1);
                                fx1 fx1VarA315 = fx1.a(new g90(fx1VarA113, 0));
                                ArrayList arrayList312 = new ArrayList(1);
                                List list2 = Collections.EMPTY_LIST;
                                arrayList312.add(fx1VarA315);
                                fx1 fx1VarA316 = fx1.a(new fz(ca0Var2, new lx1(arrayList312, list2), a50Var2.f11858d, 4));
                                t80 t80Var8 = new t80(vu0Var2, 1);
                                d80 d80Var2 = new d80(t80Var5, t80Var8, y40Var4.f22110i, t80Var7, y40Var4.f22107f);
                                ArrayList arrayList313 = new ArrayList(1);
                                ArrayList arrayList314 = new ArrayList(1);
                                arrayList314.add(y40Var4.W);
                                arrayList313.add(y40Var4.X);
                                w80 w80Var2 = new w80(t80Var6, t80Var5, fx1VarA45, fx1VarA216, y40Var4.V, d80Var2, fx1VarA46, new ca0(new lx1(arrayList313, arrayList314), 6), fx1VarA212, fx1VarA110, a50Var2.f11879o0);
                                wd0 wd0Var6 = new wd0(fx1VarA312, 4);
                                fx1 fx1VarA317 = fx1.a(new g70(t80Var5, 1));
                                qd0 qd0Var7 = new qd0(5);
                                qd0 qd0Var8 = new qd0(6);
                                fx1 fx1VarA318 = fx1.a(new e60(new zd0(e60Var2, 0), 12));
                                k40 k40Var2 = a50Var2.F;
                                fx1 fx1Var8 = a50Var2.f11856c;
                                te0 te0Var2 = new te0(k40Var2, z90Var2, fx1VarA317, e60Var2, qd0Var7, qd0Var8, fx1Var8, fx1VarA318);
                                er0 er0Var2 = new er0();
                                fx1 fx1VarA319 = fx1.a(new fg0(t80Var8, er0Var2, e60Var2, 1));
                                fx1 fx1VarA410 = fx1.a(new fg0(t80Var8, er0Var2, e60Var2, 0));
                                fx1 fx1VarA411 = fx1.a(new l40((kx1) t80Var8, (kx1) er0Var2, (kx1) e60Var2, (kx1) a50Var2.f11874m, 8));
                                fx1 fx1VarA412 = fx1.a(new oz(er0Var2, e60Var2, 16));
                                o40 o40Var4 = a50Var2.f11864g;
                                er0.a(er0Var2, fx1.a(new fe0(w80Var2, fx1Var8, e60Var2, wd0Var6, te0Var2, fx1VarA317, y40Var4.f22111j, fx1VarA319, fx1VarA410, fx1VarA411, fx1VarA412, fx1.a(new l40(o40Var4, e60Var2, te0Var2, er0Var2, 7)), new oe0(o40Var4, z90Var2), a50Var2.J, a50Var2.f11865h, o40Var4, fx1VarA318, fx1VarA50, a50Var2.N0)));
                                ((jn0) qm0Var.f19128c).y1(new qo0((ba0) fx1VarA117.zzb(), (pc0) fx1VarA214.zzb(), (ma0) fx1VarA211.zzb(), (qa0) fx1VarA112.zzb(), (sa0) fx1VarA216.zzb(), (tb0) y40Var4.R.zzb(), (bb0) fx1VarA218.zzb(), (xc0) fx1VarA219.zzb(), (qb0) fx1VarA313.zzb(), (ka0) fx1VarA316.zzb()));
                                ((pa0) fx1VarA45.zzb()).P0(new k60(wu0Var, 0), this.f22671c);
                                return (ee0) er0Var2.zzb();
                            }
                        }
                        throw new eo0(1, "No corresponding native ad listener");
                    }
                    je0VarM = je0.l(euVarZzC);
                    wu0Var = wu0Var2;
                    auVar = auVarN;
                    buVar = buVarZzP;
                    euVar = euVarZzC;
                    if (je0VarM != null) {
                        if (((ou0) ju0Var.f16195a.f20839b).f18367h.contains(Integer.toString(je0VarM.q()))) {
                            pd0 pd0Var3 = (pd0) this.f22672d;
                            vu0 vu0Var3 = new vu0(ju0Var, du0Var, qm0Var.f19126a);
                            so0 so0Var3 = new so0(je0VarM, 21);
                            hf0 hf0Var3 = new hf0(buVar, auVar, euVar);
                            y40 y40Var5 = (y40) pd0Var3;
                            a50 a50Var3 = y40Var5.f22103b;
                            y40 y40Var6 = y40Var5.f22104c;
                            t80 t80Var9 = new t80(vu0Var3, 0);
                            fx1 fx1Var9 = y40Var6.f22109h;
                            ei eiVar3 = a50Var3.G0;
                            fx1 fx1VarA413 = fx1.a(new p60(fx1Var9, t80Var9, 1));
                            fx1 fx1VarA414 = fx1.a(new g90(fx1VarA413, 7));
                            int i17 = lx1.f17149c;
                            ArrayList arrayList315 = new ArrayList(1);
                            ArrayList arrayList316 = new ArrayList(2);
                            arrayList316.add(y40Var6.f22117q);
                            arrayList316.add(y40Var6.f22118r);
                            arrayList315.add(fx1VarA414);
                            fx1 fx1VarA415 = fx1.a(new ca0(new lx1(arrayList315, arrayList316), 3));
                            fx1 fx1VarA416 = fx1.a(ps1.f18799g);
                            fx1 fx1Var10 = a50Var3.f11856c;
                            fx1 fx1VarA417 = fx1.a(new a70(fx1VarA416, (kx1) fx1Var10, 4));
                            t80 t80Var10 = new t80(vu0Var3, 3);
                            t80 t80Var11 = new t80(vu0Var3, 2);
                            o40 o40Var5 = a50Var3.f11864g;
                            fx1 fx1VarA418 = fx1.a(new n60(a50Var3.N, a50Var3.M, t80Var9, t80Var11, fx1.a(new n60(o40Var5, a50Var3.F, fx1.a(new v50(o40Var5, 24)), fx1.a(rb0.f19504g), a50Var3.E0, a50Var3.f11858d)), y40Var6.f22106e));
                            qd0 qd0Var9 = new qd0(4);
                            qd0 qd0Var10 = new qd0(2);
                            fx1 fx1VarA419 = fx1.a(new a70(fx1VarA416, (kx1) fx1Var10, 9));
                            fx1 fx1VarA52 = fx1.a(dv.f13735g);
                            wd0 wd0Var7 = new wd0(fx1VarA52, 2);
                            ArrayList arrayList317 = new ArrayList(2);
                            ArrayList arrayList318 = new ArrayList(1);
                            arrayList318.add(y40Var6.f22123w);
                            arrayList317.add(fx1VarA419);
                            arrayList317.add(wd0Var7);
                            fx1 fx1VarA53 = fx1.a(new fz(new lx1(arrayList317, arrayList318), t80Var9, t80Var10, 5));
                            fx1 fx1VarA1110 = fx1.a(new e60(t80Var10, 8));
                            fx1 fx1VarA1111 = fx1.a(new v60(a50Var3.f11864g, a50Var3.f11856c, a50Var3.f11858d, t80Var10, t80Var9, y40Var6.f22113m, fx1VarA418, qd0Var9, qd0Var10, a50Var3.J, y40Var6.f22114n, y40Var6.f22106e, y40Var6.f22122v, fx1VarA53, fx1VarA1110, y40Var6.f22112k));
                            r40 r40Var19 = new r40(fx1VarA1111, 24);
                            g90 g90Var5 = new g90(fx1.a(new p60(t80Var9, a50Var3.Z, 0)), 11);
                            ArrayList arrayList319 = new ArrayList(4);
                            ArrayList arrayList1110 = new ArrayList(2);
                            arrayList319.add(y40Var6.f22119s);
                            arrayList1110.add(y40Var6.f22120t);
                            arrayList1110.add(y40Var6.f22121u);
                            arrayList319.add(fx1VarA417);
                            arrayList319.add(r40Var19);
                            arrayList319.add(g90Var5);
                            fx1 fx1VarA1112 = fx1.a(new ca0(new lx1(arrayList319, arrayList1110), 4));
                            fx1 fx1VarA1113 = fx1.a(new j90(a50Var3.f11864g, a50Var3.D0, a50Var3.f11874m, t80Var10, t80Var9, a50Var3.L, ps1.f18800h));
                            fx1 fx1VarA1114 = fx1.a(new g90(fx1VarA1113, 5));
                            fx1 fx1VarA1115 = fx1.a(new a70(fx1VarA416, (kx1) fx1Var10, 3));
                            fx1 fx1Var11 = a50Var3.f11899z0;
                            z90 z90Var3 = y40Var6.f22105d;
                            fx1 fx1VarA1116 = fx1.a(new g90(fx1.a(new w70(fx1Var11, z90Var3, 1)), 3));
                            r40 r40Var110 = new r40(fx1VarA1111, 23);
                            ArrayList arrayList1111 = new ArrayList(5);
                            ArrayList arrayList1112 = new ArrayList(3);
                            arrayList1111.add(y40Var6.f22124x);
                            arrayList1111.add(y40Var6.f22125y);
                            arrayList1112.add(y40Var6.f22126z);
                            arrayList1112.add(y40Var6.A);
                            arrayList1111.add(fx1VarA1114);
                            arrayList1111.add(fx1VarA1115);
                            arrayList1112.add(fx1VarA1116);
                            arrayList1111.add(r40Var110);
                            fx1 fx1VarA1117 = fx1.a(new ca0(new lx1(arrayList1111, arrayList1112), 0));
                            fx1 fx1VarA1118 = fx1.a(new g90(fx1VarA1113, 6));
                            fx1 fx1VarA1119 = fx1.a(new a70(fx1VarA416, (kx1) fx1Var10, 6));
                            fx1 fx1VarA2110 = fx1.a(new v50(y40Var6.f22108g, 14));
                            r40 r40Var111 = new r40(fx1VarA53, 12);
                            r40 r40Var112 = new r40(fx1VarA1111, 26);
                            ArrayList arrayList1113 = new ArrayList(7);
                            ArrayList arrayList1114 = new ArrayList(2);
                            arrayList1113.add(y40Var6.B);
                            arrayList1113.add(y40Var6.C);
                            arrayList1114.add(y40Var6.D);
                            arrayList1114.add(y40Var6.E);
                            arrayList1113.add(fx1VarA1118);
                            arrayList1113.add(fx1VarA1119);
                            arrayList1113.add(fx1VarA2110);
                            arrayList1113.add(r40Var111);
                            arrayList1113.add(r40Var112);
                            fx1 fx1VarA2111 = fx1.a(new ca0(new lx1(arrayList1113, arrayList1114), 2));
                            r40 r40Var113 = new r40(fx1VarA1111, 29);
                            ArrayList arrayList1115 = new ArrayList(1);
                            ArrayList arrayList1116 = new ArrayList(1);
                            arrayList1116.add(y40Var6.F);
                            arrayList1115.add(r40Var113);
                            fx1 fx1VarA2112 = fx1.a(new ca0(new lx1(arrayList1115, arrayList1116), 19));
                            r40 r40Var114 = new r40(fx1.a(new p60(t80Var9, a50Var3.N, 2)), 22);
                            ArrayList arrayList1117 = new ArrayList(1);
                            new ArrayList(1).add(y40Var6.G);
                            arrayList1117.add(r40Var114);
                            fx1 fx1VarA2113 = fx1.a(new a70(fx1VarA416, (kx1) fx1Var10, 10));
                            ArrayList arrayList1118 = new ArrayList(1);
                            ArrayList arrayList1119 = new ArrayList(1);
                            arrayList1119.add(y40Var6.H);
                            arrayList1118.add(fx1VarA2113);
                            fx1 fx1VarA2114 = fx1.a(new ca0(new lx1(arrayList1118, arrayList1119), 20));
                            fx1 fx1VarA2115 = fx1.a(new g90(fx1VarA413, 8));
                            r40 r40Var115 = new r40(fx1VarA1111, 27);
                            ArrayList arrayList2110 = new ArrayList(7);
                            ArrayList arrayList2111 = new ArrayList(4);
                            arrayList2110.add(y40Var6.I);
                            arrayList2111.add(y40Var6.J);
                            arrayList2110.add(y40Var6.K);
                            arrayList2110.add(y40Var6.L);
                            arrayList2111.add(y40Var6.M);
                            arrayList2111.add(y40Var6.N);
                            arrayList2111.add(y40Var6.O);
                            arrayList2110.add(y40Var6.P);
                            arrayList2110.add(y40Var6.Q);
                            arrayList2110.add(fx1VarA2115);
                            arrayList2110.add(r40Var115);
                            fx1 fx1VarA2116 = fx1.a(new ca0(new lx1(arrayList2110, arrayList2111), 5));
                            g90 g90Var6 = new g90(fx1.a(new r40(fx1VarA1112, 11)), 1);
                            fx1 fx1VarA2117 = fx1.a(new a70(fx1VarA416, (kx1) fx1Var10, 8));
                            ArrayList arrayList2112 = new ArrayList(2);
                            ArrayList arrayList2113 = new ArrayList(1);
                            arrayList2113.add(y40Var6.S);
                            arrayList2112.add(g90Var6);
                            arrayList2112.add(fx1VarA2117);
                            fx1 fx1VarA2118 = fx1.a(new ca0(new lx1(arrayList2112, arrayList2113), 9));
                            e60 e60Var3 = new e60(so0Var3, 13);
                            jf0 jf0Var3 = new jf0(new zd0(e60Var3, 1), fx1Var10);
                            ArrayList arrayList2114 = new ArrayList(1);
                            ArrayList arrayList2115 = new ArrayList(1);
                            arrayList2115.add(y40Var6.T);
                            arrayList2114.add(jf0Var3);
                            fx1 fx1VarA2119 = fx1.a(new yc0(new lx1(arrayList2114, arrayList2115)));
                            fx1 fx1VarA3110 = fx1.a(new g90(fx1VarA1113, 4));
                            if0 if0Var7 = new if0(hf0Var3, 0);
                            if0 if0Var8 = new if0(hf0Var3, 1);
                            if0 if0Var9 = new if0(hf0Var3, 2);
                            fx1 fx1VarA3111 = fx1.a(new g90(fx1VarA1113, 2));
                            r40 r40Var116 = new r40(fx1VarA1111, 28);
                            ArrayList arrayList2116 = new ArrayList(2);
                            ArrayList arrayList2117 = new ArrayList(1);
                            arrayList2117.add(y40Var6.f22102a0);
                            arrayList2116.add(fx1VarA3111);
                            arrayList2116.add(r40Var116);
                            fx1 fx1VarA3112 = fx1.a(new w80(if0Var7, if0Var8, if0Var9, fx1VarA2111, fx1.a(new ca0(new lx1(arrayList2116, arrayList2117), 10)), fx1VarA1117, fx1VarA2114, y40Var6.f22109h, t80Var9, a50Var3.f11865h, z90Var3));
                            wd0 wd0Var8 = new wd0(fx1VarA3112, 5);
                            ArrayList arrayList2118 = new ArrayList(1);
                            ArrayList arrayList2119 = new ArrayList(1);
                            arrayList2118.add(fx1VarA3110);
                            arrayList2119.add(wd0Var8);
                            fx1 fx1VarA3113 = fx1.a(new ca0(new lx1(arrayList2118, arrayList2119), 13));
                            fx1 fx1VarA3114 = fx1.a(new a70(fx1VarA416, (kx1) fx1Var10, 5));
                            r40 r40Var117 = new r40(fx1VarA1111, 25);
                            ArrayList arrayList3110 = new ArrayList(2);
                            ArrayList arrayList3111 = new ArrayList(1);
                            arrayList3111.add(y40Var6.U);
                            arrayList3110.add(fx1VarA3114);
                            arrayList3110.add(r40Var117);
                            ca0 ca0Var3 = new ca0(new lx1(arrayList3110, arrayList3111), 1);
                            fx1 fx1VarA3115 = fx1.a(new g90(fx1VarA1113, 0));
                            ArrayList arrayList3112 = new ArrayList(1);
                            List list3 = Collections.EMPTY_LIST;
                            arrayList3112.add(fx1VarA3115);
                            fx1 fx1VarA3116 = fx1.a(new fz(ca0Var3, new lx1(arrayList3112, list3), a50Var3.f11858d, 4));
                            t80 t80Var12 = new t80(vu0Var3, 1);
                            d80 d80Var3 = new d80(t80Var9, t80Var12, y40Var6.f22110i, t80Var11, y40Var6.f22107f);
                            ArrayList arrayList3113 = new ArrayList(1);
                            ArrayList arrayList3114 = new ArrayList(1);
                            arrayList3114.add(y40Var6.W);
                            arrayList3113.add(y40Var6.X);
                            w80 w80Var3 = new w80(t80Var10, t80Var9, fx1VarA415, fx1VarA2116, y40Var6.V, d80Var3, fx1VarA416, new ca0(new lx1(arrayList3113, arrayList3114), 6), fx1VarA2112, fx1VarA1110, a50Var3.f11879o0);
                            wd0 wd0Var9 = new wd0(fx1VarA3112, 4);
                            fx1 fx1VarA3117 = fx1.a(new g70(t80Var9, 1));
                            qd0 qd0Var11 = new qd0(5);
                            qd0 qd0Var12 = new qd0(6);
                            fx1 fx1VarA3118 = fx1.a(new e60(new zd0(e60Var3, 0), 12));
                            k40 k40Var3 = a50Var3.F;
                            fx1 fx1Var12 = a50Var3.f11856c;
                            te0 te0Var3 = new te0(k40Var3, z90Var3, fx1VarA3117, e60Var3, qd0Var11, qd0Var12, fx1Var12, fx1VarA3118);
                            er0 er0Var3 = new er0();
                            fx1 fx1VarA3119 = fx1.a(new fg0(t80Var12, er0Var3, e60Var3, 1));
                            fx1 fx1VarA4110 = fx1.a(new fg0(t80Var12, er0Var3, e60Var3, 0));
                            fx1 fx1VarA4111 = fx1.a(new l40((kx1) t80Var12, (kx1) er0Var3, (kx1) e60Var3, (kx1) a50Var3.f11874m, 8));
                            fx1 fx1VarA4112 = fx1.a(new oz(er0Var3, e60Var3, 16));
                            o40 o40Var6 = a50Var3.f11864g;
                            er0.a(er0Var3, fx1.a(new fe0(w80Var3, fx1Var12, e60Var3, wd0Var9, te0Var3, fx1VarA3117, y40Var6.f22111j, fx1VarA3119, fx1VarA4110, fx1VarA4111, fx1VarA4112, fx1.a(new l40(o40Var6, e60Var3, te0Var3, er0Var3, 7)), new oe0(o40Var6, z90Var3), a50Var3.J, a50Var3.f11865h, o40Var6, fx1VarA3118, fx1VarA52, a50Var3.N0)));
                            ((jn0) qm0Var.f19128c).y1(new qo0((ba0) fx1VarA1117.zzb(), (pc0) fx1VarA2114.zzb(), (ma0) fx1VarA2111.zzb(), (qa0) fx1VarA1112.zzb(), (sa0) fx1VarA2116.zzb(), (tb0) y40Var6.R.zzb(), (bb0) fx1VarA2118.zzb(), (xc0) fx1VarA2119.zzb(), (qb0) fx1VarA3113.zzb(), (ka0) fx1VarA3116.zzb()));
                            ((pa0) fx1VarA415.zzb()).P0(new k60(wu0Var, 0), this.f22671c);
                            return (ee0) er0Var3.zzb();
                        }
                    }
                    throw new eo0(1, "No corresponding native ad listener");
                } catch (Throwable th2) {
                    throw new qu0(th2);
                }
            } catch (Throwable th3) {
                throw new qu0(th3);
            }
        } catch (Throwable th4) {
            throw new qu0(th4);
        }
    }

    public static final boolean d(ju0 ju0Var, int i10) {
        return ((ou0) ju0Var.f16195a.f20839b).f18367h.contains(Integer.toString(i10));
    }

    @Override // com.google.android.gms.internal.ads.tm0
    public final Object a(ju0 ju0Var, du0 du0Var, qm0 qm0Var) throws qu0 {
        View view;
        int i10 = this.f22669a;
        Executor executor = this.f22671c;
        Object obj = this.f22672d;
        switch (i10) {
            case 0:
                d50 d50Var = (d50) ((k70) obj);
                b50 b50Var = new b50(d50Var.f13403c, d50Var.f13404d, new vu0(ju0Var, du0Var, qm0Var.f19126a), new lj1((Object) new ym0(this, qm0Var, du0Var, 0), false, (Object) null, 17), new d5.o(du0Var.f13676a0, 2));
                ((pa0) b50Var.X.zzb()).P0(new k60((wu0) qm0Var.f19127b, 0), executor);
                ((jn0) qm0Var.f19128c).y1(new qo0((ba0) b50Var.f12641f0.zzb(), (pc0) b50Var.f12642h0.zzb(), (ma0) b50Var.f12637b0.zzb(), (qa0) b50Var.f12640e0.zzb(), (sa0) b50Var.f12643i0.zzb(), (tb0) b50Var.W.S.zzb(), (bb0) b50Var.f12644j0.zzb(), (xc0) b50Var.f12645k0.zzb(), (qb0) b50Var.f12646l0.zzb(), (ka0) b50Var.f12648n0.zzb()));
                return b50Var.W();
            case 1:
                Object obj2 = qm0Var.f19127b;
                if (!((Boolean) zzba.zzc().a(am.f12151f9)).booleanValue() || !du0Var.g0) {
                    try {
                        view = (View) s9.b.y1(((wu0) obj2).f21609a.zzf());
                    } catch (Throwable th2) {
                        throw new qu0(th2);
                    }
                    break;
                } else {
                    try {
                        zt ztVarD = ((wu0) obj2).f21609a.d();
                        if (ztVarD == null) {
                            int i11 = zze.zza;
                            zzo.zzf("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                            throw new qu0(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
                        }
                        try {
                            view = (View) s9.b.y1(ztVarD.zze());
                            boolean zZzf = ztVarD.zzf();
                            if (view == null) {
                                throw new qu0(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                            }
                            if (zZzf) {
                                try {
                                    view = (View) zw1.x(be1.f12743b, new q80(this, view, du0Var, 5), l00.f16613f).get();
                                } catch (InterruptedException | ExecutionException e10) {
                                    throw new qu0(e10);
                                }
                            }
                        } catch (RemoteException e11) {
                            throw new qu0(e11);
                        }
                    } catch (Throwable th3) {
                        throw new qu0(th3);
                    }
                    break;
                }
                wu0 wu0Var = (wu0) obj2;
                f50 f50Var = (f50) ((y70) obj);
                e50 e50Var = new e50(f50Var.f14224d, f50Var.f14226e, new vu0(ju0Var, du0Var, qm0Var.f19126a), new hz(view, (b30) null, new b21(wu0Var, 26), (eu0) du0Var.f13711u.get(0)));
                ((oc0) e50Var.f13854q0.zzb()).X0(view);
                ((pa0) e50Var.X.zzb()).P0(new k60(wu0Var, 0), executor);
                ((jn0) qm0Var.f19128c).y1(new qo0((ba0) e50Var.f13841c0.zzb(), (pc0) e50Var.f13846i0.zzb(), (ma0) e50Var.f13844f0.zzb(), (qa0) e50Var.f13840b0.zzb(), e50Var.V(), (tb0) e50Var.V.U.zzb(), (bb0) e50Var.f13849l0.zzb(), (xc0) e50Var.f13850m0.zzb(), (qb0) e50Var.f13851n0.zzb(), (ka0) e50Var.f13852o0.zzb()));
                return e50Var.W();
            default:
                return c(ju0Var, du0Var, qm0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.tm0
    public final void b(ju0 ju0Var, du0 du0Var, qm0 qm0Var) throws qu0 {
        zzr zzrVar;
        switch (this.f22669a) {
            case 0:
                wu0 wu0Var = (wu0) qm0Var.f19127b;
                ou0 ou0Var = (ou0) ju0Var.f16195a.f20839b;
                String string = du0Var.f13713v.toString();
                Context context = this.f22670b;
                try {
                    wu0Var.f21609a.G(new s9.b(context), ou0Var.f18363d, string, (xt) qm0Var.f19128c);
                    return;
                } catch (Throwable th2) {
                    throw new qu0(th2);
                }
            case 1:
                hu0 hu0Var = du0Var.f13708s;
                JSONObject jSONObject = du0Var.f13713v;
                boolean z10 = du0Var.g0;
                IInterface iInterface = qm0Var.f19128c;
                Object obj = qm0Var.f19127b;
                ou0 ou0Var2 = (ou0) ju0Var.f16195a.f20839b;
                zzr zzrVar2 = ou0Var2.f18365f;
                boolean z11 = zzrVar2.zzn;
                Context context2 = this.f22670b;
                if (z11) {
                    zzrVar = new zzr(context2, zzc.zzb(zzrVar2.zze, zzrVar2.zzb));
                } else {
                    zzrVar = (((Boolean) zzba.zzc().a(am.f12151f9)).booleanValue() && z10) ? new zzr(context2, zzc.zzc(zzrVar2.zze, zzrVar2.zzb)) : x10.c(context2, du0Var.f13711u);
                }
                zzr zzrVar3 = zzrVar;
                if (((Boolean) zzba.zzc().a(am.f12151f9)).booleanValue() && z10) {
                    try {
                        ((wu0) obj).f21609a.T(new s9.b(context2), zzrVar3, ou0Var2.f18363d, jSONObject.toString(), zzbp.zzm(hu0Var), (xt) iInterface);
                        return;
                    } catch (Throwable th3) {
                        throw new qu0(th3);
                    }
                }
                try {
                    ((wu0) obj).f21609a.J(new s9.b(context2), zzrVar3, ou0Var2.f18363d, jSONObject.toString(), zzbp.zzm(hu0Var), (xt) iInterface);
                    return;
                } catch (Throwable th4) {
                    throw new qu0(th4);
                }
            default:
                wu0 wu0Var2 = (wu0) qm0Var.f19127b;
                ou0 ou0Var3 = (ou0) ju0Var.f16195a.f20839b;
                String string2 = du0Var.f13713v.toString();
                String strZzm = zzbp.zzm(du0Var.f13708s);
                Context context3 = this.f22670b;
                try {
                    wu0Var2.f21609a.y(new s9.b(context3), ou0Var3.f18363d, string2, strZzm, (xt) qm0Var.f19128c, ou0Var3.f18369j, ou0Var3.f18367h);
                    return;
                } catch (Throwable th5) {
                    throw new qu0(th5);
                }
        }
    }
}
