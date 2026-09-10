package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zbr extends zbb implements zbs {
    public zbr() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            Status status = (Status) zbc.zba(parcel, Status.CREATOR);
            Credential credential = (Credential) zbc.zba(parcel, Credential.CREATOR);
            zbc.zbb(parcel);
            zbb(status, credential);
        } else if (i2 == 2) {
            Status status2 = (Status) zbc.zba(parcel, Status.CREATOR);
            zbc.zbb(parcel);
            zbc(status2);
        } else {
            if (i2 != 3) {
                return false;
            }
            Status status3 = (Status) zbc.zba(parcel, Status.CREATOR);
            String string = parcel.readString();
            zbc.zbb(parcel);
            zbd(status3, string);
        }
        parcel2.writeNoException();
        return true;
    }
}
