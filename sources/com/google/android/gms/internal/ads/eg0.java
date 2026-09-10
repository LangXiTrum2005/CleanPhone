package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzea;
import com.ironsource.X3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class eg0 extends qh implements wo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee0 f13964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final je0 f13965c;

    public eg0(String str, ee0 ee0Var, je0 je0Var) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        this.f13963a = str;
        this.f13964b = ee0Var;
        this.f13965c = je0Var;
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        List list;
        mo moVar;
        double d10;
        String strP;
        String strP2;
        s9.a aVar;
        ee0 ee0Var = this.f13964b;
        je0 je0Var = this.f13965c;
        switch (i10) {
            case 2:
                s9.b bVar = new s9.b(ee0Var);
                parcel2.writeNoException();
                rh.e(parcel2, bVar);
                return true;
            case 3:
                String strA = je0Var.a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            case 4:
                synchronized (je0Var) {
                    list = je0Var.f16054e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                String strC = je0Var.c();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 6:
                synchronized (je0Var) {
                    moVar = je0Var.f16067s;
                }
                parcel2.writeNoException();
                rh.e(parcel2, moVar);
                return true;
            case 7:
                String strE = je0Var.e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 8:
                synchronized (je0Var) {
                    d10 = je0Var.f16066r;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d10);
                return true;
            case 9:
                synchronized (je0Var) {
                    strP = je0Var.p(X3.i.U);
                }
                parcel2.writeNoException();
                parcel2.writeString(strP);
                return true;
            case 10:
                synchronized (je0Var) {
                    strP2 = je0Var.p("price");
                }
                parcel2.writeNoException();
                parcel2.writeString(strP2);
                return true;
            case 11:
                Bundle bundleD = je0Var.d();
                parcel2.writeNoException();
                rh.d(parcel2, bundleD);
                return true;
            case 12:
                ee0Var.n();
                parcel2.writeNoException();
                return true;
            case 13:
                zzea zzeaVarR = je0Var.r();
                parcel2.writeNoException();
                rh.e(parcel2, zzeaVarR);
                return true;
            case 14:
                Bundle bundle = (Bundle) rh.b(parcel, Bundle.CREATOR);
                rh.f(parcel);
                synchronized (ee0Var) {
                    ee0Var.f13938n.n(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) rh.b(parcel, Bundle.CREATOR);
                rh.f(parcel);
                boolean zO = ee0Var.o(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zO ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) rh.b(parcel, Bundle.CREATOR);
                rh.f(parcel);
                synchronized (ee0Var) {
                    ee0Var.f13938n.h(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 17:
                ho hoVarS = je0Var.s();
                parcel2.writeNoException();
                rh.e(parcel2, hoVarS);
                return true;
            case 18:
                synchronized (je0Var) {
                    aVar = je0Var.f16065q;
                }
                parcel2.writeNoException();
                rh.e(parcel2, aVar);
                return true;
            case 19:
                String str = this.f13963a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
