package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class zbt extends zba implements IInterface {
    public zbt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    public final void zbc(zbs zbsVar, zbp zbpVar) throws RemoteException {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbsVar);
        zbc.zbc(parcelZba, zbpVar);
        zbb(3, parcelZba);
    }

    public final void zbd(zbs zbsVar, CredentialRequest credentialRequest) throws RemoteException {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbsVar);
        zbc.zbc(parcelZba, credentialRequest);
        zbb(1, parcelZba);
    }

    public final void zbe(zbs zbsVar, zbu zbuVar) throws RemoteException {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbsVar);
        zbc.zbc(parcelZba, zbuVar);
        zbb(2, parcelZba);
    }

    public final void zbf(zbs zbsVar) throws RemoteException {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbsVar);
        zbb(4, parcelZba);
    }
}
