package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface ICustomTabsCallback extends IInterface {
    public static final String D8 = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    public static class Default implements ICustomTabsCallback {
        @Override // android.support.customtabs.ICustomTabsCallback
        public final void H(Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void J(Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void L(int i2, int i3, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void T(int i2, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void V(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void W(Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void X(int i2, Uri uri, boolean z2, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void a(int i2, int i3, int i4, int i5, int i6, Bundle bundle) {
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final Bundle h(String str, Bundle bundle) {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void r(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void v(Bundle bundle) {
        }
    }

    public static abstract class Stub extends Binder implements ICustomTabsCallback {

        public static class Proxy implements ICustomTabsCallback {
            public IBinder X;

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void H(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsCallback.D8);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.X.transact(11, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void J(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsCallback.D8);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.X.transact(12, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void L(int i2, int i3, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsCallback.D8);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.X.transact(8, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void T(int i2, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsCallback.D8);
                    parcelObtain.writeInt(i2);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.X.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void V(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsCallback.D8);
                    parcelObtain.writeString(str);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.X.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void W(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsCallback.D8);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.X.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void X(int i2, Uri uri, boolean z2, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsCallback.D8);
                    parcelObtain.writeInt(i2);
                    _Parcel.b(parcelObtain, uri, 0);
                    parcelObtain.writeInt(z2 ? 1 : 0);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.X.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void a(int i2, int i3, int i4, int i5, int i6, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsCallback.D8);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    parcelObtain.writeInt(i5);
                    parcelObtain.writeInt(i6);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.X.transact(10, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.X;
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final Bundle h(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsCallback.D8);
                    parcelObtain.writeString(str);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.X.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) _Parcel.a(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void r(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsCallback.D8);
                    parcelObtain.writeString(str);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.X.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void v(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsCallback.D8);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.X.transact(9, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static ICustomTabsCallback b0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICustomTabsCallback.D8);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof ICustomTabsCallback)) {
                return (ICustomTabsCallback) iInterfaceQueryLocalInterface;
            }
            Proxy proxy = new Proxy();
            proxy.X = iBinder;
            return proxy;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = ICustomTabsCallback.D8;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i2) {
                case 2:
                    T(parcel.readInt(), (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    r(parcel.readString(), (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    return true;
                case 4:
                    W((Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    V(parcel.readString(), (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    X(parcel.readInt(), (Uri) _Parcel.a(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle bundleH = h(parcel.readString(), (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.b(parcel2, bundleH, 1);
                    return true;
                case 8:
                    L(parcel.readInt(), parcel.readInt(), (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    return true;
                case 9:
                    v((Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    return true;
                case 10:
                    a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    return true;
                case 11:
                    H((Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    return true;
                case 12:
                    J((Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }
    }

    public static class _Parcel {
        public static Object a(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void b(Parcel parcel, Parcelable parcelable, int i2) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i2);
            }
        }
    }

    void H(Bundle bundle);

    void J(Bundle bundle);

    void L(int i2, int i3, Bundle bundle);

    void T(int i2, Bundle bundle);

    void V(String str, Bundle bundle);

    void W(Bundle bundle);

    void X(int i2, Uri uri, boolean z2, Bundle bundle);

    void a(int i2, int i3, int i4, int i5, int i6, Bundle bundle);

    Bundle h(String str, Bundle bundle);

    void r(String str, Bundle bundle);

    void v(Bundle bundle);
}
