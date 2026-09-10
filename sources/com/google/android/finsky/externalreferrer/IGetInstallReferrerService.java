package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.a.a;
import com.google.android.a.b;
import com.google.android.a.c;

/* JADX INFO: loaded from: classes3.dex */
public interface IGetInstallReferrerService extends IInterface {

    public static abstract class Stub extends b implements IGetInstallReferrerService {
        public static final /* synthetic */ int X = 0;

        public static class Proxy extends a implements IGetInstallReferrerService {
            @Override // com.google.android.finsky.externalreferrer.IGetInstallReferrerService
            public final Bundle i(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                int i2 = c.f16670a;
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        this.X.transact(1, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        parcelObtain.recycle();
                        Bundle bundle2 = (Bundle) (parcelObtain2.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(parcelObtain2));
                        parcelObtain2.recycle();
                        return bundle2;
                    } catch (RuntimeException e2) {
                        parcelObtain2.recycle();
                        throw e2;
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }

        @Override // com.google.android.a.b
        public final boolean b0(int i2, Parcel parcel, Parcel parcel2) {
            if (i2 != 1) {
                return false;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            int i3 = c.f16670a;
            Bundle bundleI = i((Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel)));
            parcel2.writeNoException();
            if (bundleI == null) {
                parcel2.writeInt(0);
                return true;
            }
            parcel2.writeInt(1);
            bundleI.writeToParcel(parcel2, 1);
            return true;
        }
    }

    Bundle i(Bundle bundle);
}
