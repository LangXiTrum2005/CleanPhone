package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.mx0;
import com.google.android.gms.internal.ads.qw;
import com.google.android.gms.internal.ads.sw;
import com.google.android.gms.internal.ads.yd1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzz implements yd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sw f11531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzap f11533c;

    public zzz(zzap zzapVar, sw swVar, boolean z10) {
        this.f11531a = swVar;
        this.f11532b = z10;
        this.f11533c = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public final void zza(Throwable th2) {
        try {
            sw swVar = this.f11531a;
            String message = th2.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 16);
            sb2.append("Internal error: ");
            sb2.append(message);
            String string = sb2.toString();
            qw qwVar = (qw) swVar;
            Parcel parcelQ = qwVar.q();
            parcelQ.writeString(string);
            qwVar.m0(parcelQ, 2);
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public final void mo164zzb(Object obj) {
        ArrayList<Uri> arrayList = (ArrayList) obj;
        try {
            qw qwVar = (qw) this.f11531a;
            Parcel parcelQ = qwVar.q();
            parcelQ.writeTypedList(arrayList);
            qwVar.m0(parcelQ, 1);
            zzap zzapVar = this.f11533c;
            boolean z10 = zzapVar.f11407m;
            mx0 mx0Var = zzapVar.l;
            if (z10 || this.f11532b) {
                for (Uri uri : arrayList) {
                    if (zzap.B1(uri, zzapVar.f11419y, zzapVar.f11420z)) {
                        mx0Var.b(zzap.E1(uri, zzapVar.f11416v, "1").toString(), null, null, null);
                    } else {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.C8)).booleanValue()) {
                            mx0Var.b(uri.toString(), null, null, null);
                        }
                    }
                }
            }
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
    }
}
