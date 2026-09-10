package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hg0 extends qh implements ap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je0 f15279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public se0 f15280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ee0 f15281d;

    public hg0(Context context, je0 je0Var, se0 se0Var, ee0 ee0Var) {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        this.f15278a = context;
        this.f15279b = je0Var;
        this.f15280c = se0Var;
        this.f15281d = ee0Var;
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final void a1(s9.a aVar) {
        ee0 ee0Var;
        Object objY1 = s9.b.y1(aVar);
        if (!(objY1 instanceof View) || this.f15279b.k() == null || (ee0Var = this.f15281d) == null) {
            return;
        }
        ee0Var.f((View) objY1);
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final boolean o(s9.a aVar) {
        se0 se0Var;
        Object objY1 = s9.b.y1(aVar);
        if (!(objY1 instanceof ViewGroup) || (se0Var = this.f15280c) == null || !se0Var.c((ViewGroup) objY1, false)) {
            return false;
        }
        this.f15279b.i().x0(new vf(this, 21));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        je0 je0Var = this.f15279b;
        switch (i10) {
            case 1:
                String string = parcel.readString();
                rh.f(parcel);
                String strZze = zze(string);
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 2:
                String string2 = parcel.readString();
                rh.f(parcel);
                mo moVarZzf = zzf(string2);
                parcel2.writeNoException();
                rh.e(parcel2, moVarZzf);
                return true;
            case 3:
                List<String> listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeStringList(listZzg);
                return true;
            case 4:
                String strG = je0Var.g();
                parcel2.writeNoException();
                parcel2.writeString(strG);
                return true;
            case 5:
                String string3 = parcel.readString();
                rh.f(parcel);
                zzi(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzj();
                parcel2.writeNoException();
                return true;
            case 7:
                zzea zzeaVarR = je0Var.r();
                parcel2.writeNoException();
                rh.e(parcel2, zzeaVarR);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                s9.a aVarZzm = zzm();
                parcel2.writeNoException();
                rh.e(parcel2, aVarZzm);
                return true;
            case 10:
                s9.a aVarX1 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                boolean zZzn = zzn(aVarX1);
                parcel2.writeNoException();
                parcel2.writeInt(zZzn ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                ClassLoader classLoader = rh.f19590a;
                parcel2.writeStrongBinder(null);
                return true;
            case 12:
                boolean z10 = z();
                parcel2.writeNoException();
                ClassLoader classLoader2 = rh.f19590a;
                parcel2.writeInt(z10 ? 1 : 0);
                return true;
            case 13:
                boolean zZzp = zzp();
                parcel2.writeNoException();
                ClassLoader classLoader3 = rh.f19590a;
                parcel2.writeInt(zZzp ? 1 : 0);
                return true;
            case 14:
                s9.a aVarX2 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                a1(aVarX2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzr();
                parcel2.writeNoException();
                return true;
            case 16:
                ko koVarZzs = zzs();
                parcel2.writeNoException();
                rh.e(parcel2, koVarZzs);
                return true;
            case 17:
                s9.a aVarX3 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                boolean zO = o(aVarX3);
                parcel2.writeNoException();
                parcel2.writeInt(zO ? 1 : 0);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final boolean z() {
        ee0 ee0Var = this.f15281d;
        if (ee0Var != null && !ee0Var.f13940p.c()) {
            return false;
        }
        je0 je0Var = this.f15279b;
        return je0Var.j() != null && je0Var.h() == null;
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final String zze(String str) {
        x.i iVar;
        je0 je0Var = this.f15279b;
        synchronized (je0Var) {
            iVar = je0Var.f16071w;
        }
        return (String) iVar.get(str);
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final mo zzf(String str) {
        x.i iVar;
        je0 je0Var = this.f15279b;
        synchronized (je0Var) {
            iVar = je0Var.f16070v;
        }
        return (mo) iVar.get(str);
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final List zzg() {
        x.i iVar;
        x.i iVar2;
        try {
            je0 je0Var = this.f15279b;
            synchronized (je0Var) {
                iVar = je0Var.f16070v;
            }
            synchronized (je0Var) {
                iVar2 = je0Var.f16071w;
            }
            String[] strArr = new String[iVar.f53506c + iVar2.f53506c];
            int i10 = 0;
            for (int i11 = 0; i11 < iVar.f53506c; i11++) {
                strArr[i10] = (String) iVar.f(i11);
                i10++;
            }
            for (int i12 = 0; i12 < iVar2.f53506c; i12++) {
                strArr[i10] = (String) iVar2.f(i12);
                i10++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e10) {
            zzt.zzh().d("InternalNativeCustomTemplateAdShim.getAvailableAssetNames", e10);
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final String zzh() {
        return this.f15279b.g();
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final void zzi(String str) {
        ee0 ee0Var = this.f15281d;
        if (ee0Var != null) {
            synchronized (ee0Var) {
                ee0Var.f13938n.f(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final void zzj() {
        ee0 ee0Var = this.f15281d;
        if (ee0Var != null) {
            synchronized (ee0Var) {
                if (ee0Var.f13949y) {
                    return;
                }
                ee0Var.f13938n.p();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final void zzl() {
        ee0 ee0Var = this.f15281d;
        if (ee0Var != null) {
            ee0Var.n();
        }
        this.f15281d = null;
        this.f15280c = null;
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final s9.a zzm() {
        return new s9.b(this.f15278a);
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final boolean zzn(s9.a aVar) {
        se0 se0Var;
        Object objY1 = s9.b.y1(aVar);
        if (!(objY1 instanceof ViewGroup) || (se0Var = this.f15280c) == null || !se0Var.c((ViewGroup) objY1, true)) {
            return false;
        }
        this.f15279b.h().x0(new vf(this, 21));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final boolean zzp() {
        je0 je0Var = this.f15279b;
        km0 km0VarK = je0Var.k();
        if (km0VarK == null) {
            int i10 = zze.zza;
            zzo.zzi("Trying to start OMID session before creation.");
            return false;
        }
        ((tc0) zzt.zzu()).h(km0VarK.f16480a);
        if (je0Var.j() == null) {
            return true;
        }
        je0Var.j().e("onSdkLoaded", new x.e(0));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final void zzr() {
        String str;
        try {
            je0 je0Var = this.f15279b;
            synchronized (je0Var) {
                str = je0Var.f16073y;
            }
            if (Objects.equals(str, "Google")) {
                int i10 = zze.zza;
                zzo.zzi("Illegal argument specified for omid partner name.");
            } else if (TextUtils.isEmpty(str)) {
                int i11 = zze.zza;
                zzo.zzi("Not starting OMID session. OM partner name has not been configured.");
            } else {
                ee0 ee0Var = this.f15281d;
                if (ee0Var != null) {
                    ee0Var.e(str, false);
                }
            }
        } catch (NullPointerException e10) {
            zzt.zzh().d("InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.ap
    public final ko zzs() {
        ko koVar;
        try {
            ge0 ge0Var = this.f15281d.F;
            synchronized (ge0Var) {
                koVar = ge0Var.f14835a;
            }
            return koVar;
        } catch (NullPointerException e10) {
            zzt.zzh().d("InternalNativeCustomTemplateAdShim.getMediaContent", e10);
            return null;
        }
    }
}
