package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class tw extends qh implements qz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ QueryInfoGenerationCallback f20517a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw(uw uwVar, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
        this.f20517a = queryInfoGenerationCallback;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void b(String str) {
        this.f20517a.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void s0(String str, Bundle bundle, String str2) {
        this.f20517a.onSuccess(new QueryInfo(new zzex(str, bundle, str2)));
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            parcel.readString();
            parcel.readString();
            rh.f(parcel);
        } else if (i10 == 2) {
            String string = parcel.readString();
            rh.f(parcel);
            b(string);
        } else {
            if (i10 != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) rh.b(parcel, Bundle.CREATOR);
            rh.f(parcel);
            s0(string2, bundle, string3);
        }
        parcel2.writeNoException();
        return true;
    }
}
