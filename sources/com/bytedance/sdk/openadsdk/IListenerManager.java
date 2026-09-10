package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface IListenerManager extends IInterface {

    public static class Default implements IListenerManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void broadcastDialogListener(String str, int i2) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void broadcastPermissionListener(String str, String str2) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void executeAppOpenAdCallback(String str, String str2) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void executeDisLikeClosedCallback(String str, String str2) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void executeFullVideoCallback(String str, String str2) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void executeRewardVideoCallback(String str, String str2, boolean z2, int i2, String str3, int i3, String str4) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void registerAppOpenAdListener(String str, IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void registerDialogListener(String str, ICommonDialogListener iCommonDialogListener) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void registerFullVideoListener(String str, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void registerRewardVideoListener(String str, IRewardAdInteractionListener iRewardAdInteractionListener) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IListenerManager
        public void unregisterDisLikeClosedListener(String str) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IListenerManager {

        public static class qdl implements IListenerManager {
            public static IListenerManager qdl;
            private IBinder ud;

            public qdl(IBinder iBinder) {
                this.ud = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.ud;
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void broadcastDialogListener(String str, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i2);
                    if (this.ud.transact(6, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().broadcastDialogListener(str, i2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void broadcastPermissionListener(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (this.ud.transact(8, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().broadcastPermissionListener(str, str2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void executeAppOpenAdCallback(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (this.ud.transact(13, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().executeAppOpenAdCallback(str, str2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void executeDisLikeClosedCallback(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (this.ud.transact(11, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().executeDisLikeClosedCallback(str, str2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void executeFullVideoCallback(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (this.ud.transact(4, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().executeFullVideoCallback(str, str2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void executeRewardVideoCallback(String str, String str2, boolean z2, int i2, String str3, int i3, String str4) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(z2 ? 1 : 0);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeString(str4);
                    if (this.ud.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().executeRewardVideoCallback(str, str2, z2, i2, str3, i3, str4);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void registerAppOpenAdListener(String str, IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iAppOpenAdInteractionListener != null ? iAppOpenAdInteractionListener.asBinder() : null);
                    if (this.ud.transact(12, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().registerAppOpenAdListener(str, iAppOpenAdInteractionListener);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void registerDialogListener(String str, ICommonDialogListener iCommonDialogListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iCommonDialogListener != null ? iCommonDialogListener.asBinder() : null);
                    if (this.ud.transact(5, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().registerDialogListener(str, iCommonDialogListener);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iDislikeClosedListener != null ? iDislikeClosedListener.asBinder() : null);
                    if (this.ud.transact(9, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().registerDisLikeClosedListener(str, iDislikeClosedListener);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void registerFullVideoListener(String str, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iFullScreenVideoAdInteractionListener != null ? iFullScreenVideoAdInteractionListener.asBinder() : null);
                    if (this.ud.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().registerFullVideoListener(str, iFullScreenVideoAdInteractionListener);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iCommonPermissionListener != null ? iCommonPermissionListener.asBinder() : null);
                    if (this.ud.transact(7, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().registerPermissionListener(str, iCommonPermissionListener);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void registerRewardVideoListener(String str, IRewardAdInteractionListener iRewardAdInteractionListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iRewardAdInteractionListener != null ? iRewardAdInteractionListener.asBinder() : null);
                    if (this.ud.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().registerRewardVideoListener(str, iRewardAdInteractionListener);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IListenerManager
            public void unregisterDisLikeClosedListener(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcelObtain.writeString(str);
                    if (this.ud.transact(10, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().unregisterDisLikeClosedListener(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.IListenerManager");
        }

        public static IListenerManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.IListenerManager");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IListenerManager)) ? new qdl(iBinder) : (IListenerManager) iInterfaceQueryLocalInterface;
        }

        public static IListenerManager getDefaultImpl() {
            return qdl.qdl;
        }

        public static boolean setDefaultImpl(IListenerManager iListenerManager) {
            if (qdl.qdl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iListenerManager == null) {
                return false;
            }
            qdl.qdl = iListenerManager;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1598968902) {
                parcel2.writeString("com.bytedance.sdk.openadsdk.IListenerManager");
                return true;
            }
            switch (i2) {
                case 1:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    registerRewardVideoListener(parcel.readString(), IRewardAdInteractionListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    executeRewardVideoCallback(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    registerFullVideoListener(parcel.readString(), IFullScreenVideoAdInteractionListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    executeFullVideoCallback(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    registerDialogListener(parcel.readString(), ICommonDialogListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    broadcastDialogListener(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    registerPermissionListener(parcel.readString(), ICommonPermissionListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    broadcastPermissionListener(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    registerDisLikeClosedListener(parcel.readString(), IDislikeClosedListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    unregisterDisLikeClosedListener(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    executeDisLikeClosedCallback(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    registerAppOpenAdListener(parcel.readString(), IAppOpenAdInteractionListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                    executeAppOpenAdCallback(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }
    }

    void broadcastDialogListener(String str, int i2) throws RemoteException;

    void broadcastPermissionListener(String str, String str2) throws RemoteException;

    void executeAppOpenAdCallback(String str, String str2) throws RemoteException;

    void executeDisLikeClosedCallback(String str, String str2) throws RemoteException;

    void executeFullVideoCallback(String str, String str2) throws RemoteException;

    void executeRewardVideoCallback(String str, String str2, boolean z2, int i2, String str3, int i3, String str4) throws RemoteException;

    void registerAppOpenAdListener(String str, IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws RemoteException;

    void registerDialogListener(String str, ICommonDialogListener iCommonDialogListener) throws RemoteException;

    void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException;

    void registerFullVideoListener(String str, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws RemoteException;

    void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) throws RemoteException;

    void registerRewardVideoListener(String str, IRewardAdInteractionListener iRewardAdInteractionListener) throws RemoteException;

    void unregisterDisLikeClosedListener(String str) throws RemoteException;
}
