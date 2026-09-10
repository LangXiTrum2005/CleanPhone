package com.bytedance.sdk.component.mo.qdl;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface mo extends IInterface {
    int qdl(Uri uri, ContentValues contentValues, String str, String[] strArr) throws RemoteException;

    int qdl(Uri uri, String str, String[] strArr) throws RemoteException;

    String qdl(Uri uri) throws RemoteException;

    String qdl(Uri uri, ContentValues contentValues) throws RemoteException;

    Map qdl(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws RemoteException;

    public static abstract class qdl extends Binder implements mo {
        public qdl() {
            attachInterface(this, "com.bytedance.sdk.component.log.impl.IListenerEventManager");
        }

        public static mo qdl(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof mo)) ? new C0084qdl(iBinder) : (mo) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1) {
                parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                Map mapQdl = qdl(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.createStringArray(), parcel.readString(), parcel.createStringArray(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeMap(mapQdl);
                return true;
            }
            if (i2 == 2) {
                parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                String strQdl = qdl(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeString(strQdl);
                return true;
            }
            if (i2 == 3) {
                parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                String strQdl2 = qdl(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (ContentValues) ContentValues.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeString(strQdl2);
                return true;
            }
            if (i2 == 4) {
                parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                int iQdl = qdl(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.createStringArray());
                parcel2.writeNoException();
                parcel2.writeInt(iQdl);
                return true;
            }
            if (i2 != 5) {
                if (i2 != 1598968902) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                parcel2.writeString("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                return true;
            }
            parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
            int iQdl2 = qdl(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (ContentValues) ContentValues.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.createStringArray());
            parcel2.writeNoException();
            parcel2.writeInt(iQdl2);
            return true;
        }

        public static mo qdl() {
            return C0084qdl.qdl;
        }

        /* JADX INFO: renamed from: com.bytedance.sdk.component.mo.qdl.mo$qdl$qdl, reason: collision with other inner class name */
        public static class C0084qdl implements mo {
            public static mo qdl;
            private IBinder ud;

            public C0084qdl(IBinder iBinder) {
                this.ud = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.ud;
            }

            @Override // com.bytedance.sdk.component.mo.qdl.mo
            public Map qdl(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws RemoteException {
                Map hashMap;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringArray(strArr2);
                    parcelObtain.writeString(str2);
                    if (this.ud.transact(1, parcelObtain, parcelObtain2, 0) || qdl.qdl() == null) {
                        parcelObtain2.readException();
                        hashMap = parcelObtain2.readHashMap(getClass().getClassLoader());
                    } else {
                        hashMap = qdl.qdl().qdl(uri, strArr, str, strArr2, str2);
                    }
                    return hashMap;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.mo.qdl.mo
            public String qdl(Uri uri) throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.ud.transact(2, parcelObtain, parcelObtain2, 0) && qdl.qdl() != null) {
                        string = qdl.qdl().qdl(uri);
                    } else {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.mo.qdl.mo
            public String qdl(Uri uri, ContentValues contentValues) throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (contentValues != null) {
                        parcelObtain.writeInt(1);
                        contentValues.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.ud.transact(3, parcelObtain, parcelObtain2, 0) && qdl.qdl() != null) {
                        string = qdl.qdl().qdl(uri, contentValues);
                    } else {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.mo.qdl.mo
            public int qdl(Uri uri, String str, String[] strArr) throws RemoteException {
                int iQdl;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringArray(strArr);
                    if (!this.ud.transact(4, parcelObtain, parcelObtain2, 0) && qdl.qdl() != null) {
                        iQdl = qdl.qdl().qdl(uri, str, strArr);
                    } else {
                        parcelObtain2.readException();
                        iQdl = parcelObtain2.readInt();
                    }
                    return iQdl;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.mo.qdl.mo
            public int qdl(Uri uri, ContentValues contentValues, String str, String[] strArr) throws RemoteException {
                int iQdl;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (contentValues != null) {
                        parcelObtain.writeInt(1);
                        contentValues.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringArray(strArr);
                    if (!this.ud.transact(5, parcelObtain, parcelObtain2, 0) && qdl.qdl() != null) {
                        iQdl = qdl.qdl().qdl(uri, contentValues, str, strArr);
                    } else {
                        parcelObtain2.readException();
                        iQdl = parcelObtain2.readInt();
                    }
                    return iQdl;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
