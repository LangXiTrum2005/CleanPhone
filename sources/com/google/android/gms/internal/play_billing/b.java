package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.InterfaceC0341fe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.google.android.gms.internal.auth.a implements d {
    public final int C1(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelY1 = y1();
        parcelY1.writeInt(i10);
        parcelY1.writeString(str);
        parcelY1.writeString(str2);
        int i11 = e.f24258a;
        parcelY1.writeInt(1);
        bundle.writeToParcel(parcelY1, 0);
        Parcel parcelZ1 = z1(parcelY1, 10);
        int i12 = parcelZ1.readInt();
        parcelZ1.recycle();
        return i12;
    }

    public final Bundle D1(String str, Bundle bundle, String str2) {
        Parcel parcelY1 = y1();
        parcelY1.writeInt(9);
        parcelY1.writeString(str);
        parcelY1.writeString(str2);
        int i10 = e.f24258a;
        parcelY1.writeInt(1);
        bundle.writeToParcel(parcelY1, 0);
        Parcel parcelZ1 = z1(parcelY1, 902);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) e.a(parcelZ1);
        parcelZ1.recycle();
        return bundle2;
    }

    public final Bundle E1(String str, Bundle bundle, String str2) {
        Parcel parcelY1 = y1();
        parcelY1.writeInt(9);
        parcelY1.writeString(str);
        parcelY1.writeString(str2);
        int i10 = e.f24258a;
        parcelY1.writeInt(1);
        bundle.writeToParcel(parcelY1, 0);
        Parcel parcelZ1 = z1(parcelY1, 12);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) e.a(parcelZ1);
        parcelZ1.recycle();
        return bundle2;
    }

    public final Bundle F1(String str, String str2, String str3) {
        Parcel parcelY1 = y1();
        parcelY1.writeInt(3);
        parcelY1.writeString(str);
        parcelY1.writeString(str2);
        parcelY1.writeString(str3);
        parcelY1.writeString(null);
        Parcel parcelZ1 = z1(parcelY1, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) e.a(parcelZ1);
        parcelZ1.recycle();
        return bundle;
    }

    public final Bundle G1(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelY1 = y1();
        parcelY1.writeInt(i10);
        parcelY1.writeString(str);
        parcelY1.writeString(str2);
        parcelY1.writeString(str3);
        parcelY1.writeString(null);
        int i11 = e.f24258a;
        parcelY1.writeInt(1);
        bundle.writeToParcel(parcelY1, 0);
        Parcel parcelZ1 = z1(parcelY1, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) e.a(parcelZ1);
        parcelZ1.recycle();
        return bundle2;
    }

    public final Bundle H1(String str, String str2, String str3) {
        Parcel parcelY1 = y1();
        parcelY1.writeInt(3);
        parcelY1.writeString(str);
        parcelY1.writeString(str2);
        parcelY1.writeString(str3);
        Parcel parcelZ1 = z1(parcelY1, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) e.a(parcelZ1);
        parcelZ1.recycle();
        return bundle;
    }

    public final Bundle I1(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelY1 = y1();
        parcelY1.writeInt(i10);
        parcelY1.writeString(str);
        parcelY1.writeString(str2);
        parcelY1.writeString(str3);
        int i11 = e.f24258a;
        parcelY1.writeInt(1);
        bundle.writeToParcel(parcelY1, 0);
        Parcel parcelZ1 = z1(parcelY1, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) e.a(parcelZ1);
        parcelZ1.recycle();
        return bundle2;
    }

    public final Bundle J1(int i10, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelY1 = y1();
        parcelY1.writeInt(i10);
        parcelY1.writeString(str);
        parcelY1.writeString(str2);
        int i11 = e.f24258a;
        parcelY1.writeInt(1);
        bundle.writeToParcel(parcelY1, 0);
        parcelY1.writeInt(1);
        bundle2.writeToParcel(parcelY1, 0);
        Parcel parcelZ1 = z1(parcelY1, 901);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) e.a(parcelZ1);
        parcelZ1.recycle();
        return bundle3;
    }

    public final void K1(String str, Bundle bundle, y5.b bVar) {
        Parcel parcelY1 = y1();
        parcelY1.writeInt(21);
        parcelY1.writeString(str);
        int i10 = e.f24258a;
        parcelY1.writeInt(1);
        bundle.writeToParcel(parcelY1, 0);
        parcelY1.writeStrongBinder(bVar);
        B1(parcelY1, 1501);
    }

    public final void L1(String str, Bundle bundle, y5.b bVar) {
        Parcel parcelY1 = y1();
        parcelY1.writeInt(22);
        parcelY1.writeString(str);
        int i10 = e.f24258a;
        parcelY1.writeInt(1);
        bundle.writeToParcel(parcelY1, 0);
        parcelY1.writeStrongBinder(bVar);
        B1(parcelY1, 1801);
    }

    public final void M1(String str, Bundle bundle, com.android.billingclient.api.e eVar) {
        Parcel parcelY1 = y1();
        parcelY1.writeInt(21);
        parcelY1.writeString(str);
        int i10 = e.f24258a;
        parcelY1.writeInt(1);
        bundle.writeToParcel(parcelY1, 0);
        parcelY1.writeStrongBinder(eVar);
        B1(parcelY1, 1601);
    }

    public final void N1(String str, Bundle bundle, com.android.billingclient.api.f fVar) {
        Parcel parcelY1 = y1();
        parcelY1.writeInt(18);
        parcelY1.writeString(str);
        int i10 = e.f24258a;
        parcelY1.writeInt(1);
        bundle.writeToParcel(parcelY1, 0);
        parcelY1.writeStrongBinder(fVar);
        A1(parcelY1, InterfaceC0341fe.c.f28695e);
    }

    public final void O1(String str, Bundle bundle, com.android.billingclient.api.g gVar) {
        Parcel parcelY1 = y1();
        parcelY1.writeInt(22);
        parcelY1.writeString(str);
        int i10 = e.f24258a;
        parcelY1.writeInt(1);
        bundle.writeToParcel(parcelY1, 0);
        parcelY1.writeStrongBinder(gVar);
        B1(parcelY1, 1901);
    }

    public final void P1(String str, Bundle bundle, y5.b bVar) {
        Parcel parcelY1 = y1();
        parcelY1.writeInt(21);
        parcelY1.writeString(str);
        int i10 = e.f24258a;
        parcelY1.writeInt(1);
        bundle.writeToParcel(parcelY1, 0);
        parcelY1.writeStrongBinder(bVar);
        B1(parcelY1, 1401);
    }

    public final void Q1(String str, Bundle bundle, y5.b bVar) {
        Parcel parcelY1 = y1();
        parcelY1.writeInt(24);
        parcelY1.writeString(str);
        int i10 = e.f24258a;
        parcelY1.writeInt(1);
        bundle.writeToParcel(parcelY1, 0);
        parcelY1.writeStrongBinder(bVar);
        B1(parcelY1, 1701);
    }

    public final void R1(String str, Bundle bundle, com.android.billingclient.api.h hVar) {
        Parcel parcelY1 = y1();
        parcelY1.writeInt(12);
        parcelY1.writeString(str);
        int i10 = e.f24258a;
        parcelY1.writeInt(1);
        bundle.writeToParcel(parcelY1, 0);
        parcelY1.writeStrongBinder(hVar);
        A1(parcelY1, InterfaceC0341fe.a.f28680b);
    }
}
