package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzea;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gg0 extends qh implements xo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee0 f14852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final je0 f14853c;

    public gg0(String str, ee0 ee0Var, je0 je0Var) {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
        this.f14851a = str;
        this.f14852b = ee0Var;
        this.f14853c = je0Var;
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        List list;
        mo moVar;
        s9.a aVar;
        switch (i10) {
            case 2:
                s9.b bVar = new s9.b(this.f14852b);
                parcel2.writeNoException();
                rh.e(parcel2, bVar);
                return true;
            case 3:
                String strA = this.f14853c.a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            case 4:
                je0 je0Var = this.f14853c;
                synchronized (je0Var) {
                    list = je0Var.f16054e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                String strC = this.f14853c.c();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 6:
                je0 je0Var2 = this.f14853c;
                synchronized (je0Var2) {
                    moVar = je0Var2.f16068t;
                }
                parcel2.writeNoException();
                rh.e(parcel2, moVar);
                return true;
            case 7:
                String strE = this.f14853c.e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 8:
                String strF = this.f14853c.f();
                parcel2.writeNoException();
                parcel2.writeString(strF);
                return true;
            case 9:
                Bundle bundleD = this.f14853c.d();
                parcel2.writeNoException();
                rh.d(parcel2, bundleD);
                return true;
            case 10:
                this.f14852b.n();
                parcel2.writeNoException();
                return true;
            case 11:
                zzea zzeaVarR = this.f14853c.r();
                parcel2.writeNoException();
                rh.e(parcel2, zzeaVarR);
                return true;
            case 12:
                Bundle bundle = (Bundle) rh.b(parcel, Bundle.CREATOR);
                rh.f(parcel);
                ee0 ee0Var = this.f14852b;
                synchronized (ee0Var) {
                    ee0Var.f13938n.n(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) rh.b(parcel, Bundle.CREATOR);
                rh.f(parcel);
                boolean zO = this.f14852b.o(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zO ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) rh.b(parcel, Bundle.CREATOR);
                rh.f(parcel);
                ee0 ee0Var2 = this.f14852b;
                synchronized (ee0Var2) {
                    ee0Var2.f13938n.h(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                ho hoVarS = this.f14853c.s();
                parcel2.writeNoException();
                rh.e(parcel2, hoVarS);
                return true;
            case 16:
                je0 je0Var3 = this.f14853c;
                synchronized (je0Var3) {
                    aVar = je0Var3.f16065q;
                }
                parcel2.writeNoException();
                rh.e(parcel2, aVar);
                return true;
            case 17:
                String str = this.f14851a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
