package ea;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.m6;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends com.google.android.gms.internal.auth.a implements g0 {
    public e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 1);
    }

    @Override // ea.g0
    public final void A(e eVar, n4 n4Var) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, eVar);
        m6.b(parcelU1, n4Var);
        w1(parcelU1, 12);
    }

    @Override // ea.g0
    public final byte[] A0(u uVar, String str) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, uVar);
        parcelU1.writeString(str);
        Parcel parcelM0 = m0(parcelU1, 9);
        byte[] bArrCreateByteArray = parcelM0.createByteArray();
        parcelM0.recycle();
        return bArrCreateByteArray;
    }

    @Override // ea.g0
    public final void D0(long j10, String str, String str2, String str3) {
        Parcel parcelU1 = u1();
        parcelU1.writeLong(j10);
        parcelU1.writeString(str);
        parcelU1.writeString(str2);
        parcelU1.writeString(str3);
        w1(parcelU1, 10);
    }

    @Override // ea.g0
    public final List F(String str, String str2, String str3) {
        Parcel parcelU1 = u1();
        parcelU1.writeString(null);
        parcelU1.writeString(str2);
        parcelU1.writeString(str3);
        Parcel parcelM0 = m0(parcelU1, 17);
        ArrayList arrayListCreateTypedArrayList = parcelM0.createTypedArrayList(e.CREATOR);
        parcelM0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // ea.g0
    public final void I(n4 n4Var, x3 x3Var, k0 k0Var) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, n4Var);
        m6.b(parcelU1, x3Var);
        m6.c(parcelU1, k0Var);
        w1(parcelU1, 29);
    }

    @Override // ea.g0
    public final void J0(n4 n4Var) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, n4Var);
        w1(parcelU1, 25);
    }

    @Override // ea.g0
    public final void O0(n4 n4Var) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, n4Var);
        w1(parcelU1, 4);
    }

    @Override // ea.g0
    public final List P0(String str, String str2, n4 n4Var) {
        Parcel parcelU1 = u1();
        parcelU1.writeString(str);
        parcelU1.writeString(str2);
        m6.b(parcelU1, n4Var);
        Parcel parcelM0 = m0(parcelU1, 16);
        ArrayList arrayListCreateTypedArrayList = parcelM0.createTypedArrayList(e.CREATOR);
        parcelM0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // ea.g0
    public final i T0(n4 n4Var) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, n4Var);
        Parcel parcelM0 = m0(parcelU1, 21);
        i iVar = (i) m6.a(parcelM0, i.CREATOR);
        parcelM0.recycle();
        return iVar;
    }

    @Override // ea.g0
    public final void W0(n4 n4Var, d dVar) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, n4Var);
        m6.b(parcelU1, dVar);
        w1(parcelU1, 30);
    }

    @Override // ea.g0
    public final String b0(n4 n4Var) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, n4Var);
        Parcel parcelM0 = m0(parcelU1, 11);
        String string = parcelM0.readString();
        parcelM0.recycle();
        return string;
    }

    @Override // ea.g0
    public final void b1(n4 n4Var) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, n4Var);
        w1(parcelU1, 20);
    }

    @Override // ea.g0
    public final void g0(n4 n4Var, Bundle bundle, i0 i0Var) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, n4Var);
        m6.b(parcelU1, bundle);
        m6.c(parcelU1, i0Var);
        w1(parcelU1, 31);
    }

    @Override // ea.g0
    public final void h1(Bundle bundle, n4 n4Var) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, bundle);
        m6.b(parcelU1, n4Var);
        w1(parcelU1, 19);
    }

    @Override // ea.g0
    public final List j1(String str, String str2, boolean z10, n4 n4Var) {
        Parcel parcelU1 = u1();
        parcelU1.writeString(str);
        parcelU1.writeString(str2);
        ClassLoader classLoader = m6.f23729a;
        parcelU1.writeInt(z10 ? 1 : 0);
        m6.b(parcelU1, n4Var);
        Parcel parcelM0 = m0(parcelU1, 14);
        ArrayList arrayListCreateTypedArrayList = parcelM0.createTypedArrayList(i4.CREATOR);
        parcelM0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // ea.g0
    public final void m1(n4 n4Var) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, n4Var);
        w1(parcelU1, 27);
    }

    @Override // ea.g0
    public final void p1(n4 n4Var) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, n4Var);
        w1(parcelU1, 18);
    }

    @Override // ea.g0
    public final void r1(u uVar, n4 n4Var) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, uVar);
        m6.b(parcelU1, n4Var);
        w1(parcelU1, 1);
    }

    @Override // ea.g0
    public final List t(String str, String str2, String str3, boolean z10) {
        Parcel parcelU1 = u1();
        parcelU1.writeString(null);
        parcelU1.writeString(str2);
        parcelU1.writeString(str3);
        ClassLoader classLoader = m6.f23729a;
        parcelU1.writeInt(z10 ? 1 : 0);
        Parcel parcelM0 = m0(parcelU1, 15);
        ArrayList arrayListCreateTypedArrayList = parcelM0.createTypedArrayList(i4.CREATOR);
        parcelM0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // ea.g0
    public final void v0(i4 i4Var, n4 n4Var) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, i4Var);
        m6.b(parcelU1, n4Var);
        w1(parcelU1, 2);
    }

    @Override // ea.g0
    public final void x0(n4 n4Var) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, n4Var);
        w1(parcelU1, 6);
    }

    @Override // ea.g0
    public final void y0(n4 n4Var) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, n4Var);
        w1(parcelU1, 26);
    }
}
