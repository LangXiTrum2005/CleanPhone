package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface ICustomTabsService extends IInterface {
    public static final String E8 = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    public static class Default implements ICustomTabsService {
        @Override // android.support.customtabs.ICustomTabsService
        public final boolean G(long j) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final int O(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
            return 0;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean Q(ICustomTabsCallback iCustomTabsCallback) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean S(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, ArrayList arrayList) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean U(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean Y(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return false;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean g(int i2, Uri uri, Bundle bundle, ICustomTabsCallback iCustomTabsCallback) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean o(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean q(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean s(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle) {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements ICustomTabsService {

        public static class Proxy implements ICustomTabsService {
            public IBinder X;

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean G(long j) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsService.E8);
                    parcelObtain.writeLong(0L);
                    this.X.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final int O(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsService.E8);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    parcelObtain.writeString(str);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.X.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean Q(ICustomTabsCallback iCustomTabsCallback) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsService.E8);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    this.X.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean S(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, ArrayList arrayList) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsService.E8);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    _Parcel.b(parcelObtain, uri, 0);
                    _Parcel.b(parcelObtain, bundle, 0);
                    if (arrayList == null) {
                        parcelObtain.writeInt(-1);
                    } else {
                        int size = arrayList.size();
                        parcelObtain.writeInt(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            _Parcel.b(parcelObtain, (Parcelable) arrayList.get(i2), 0);
                        }
                    }
                    this.X.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean U(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsService.E8);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    _Parcel.b(parcelObtain, uri, 0);
                    this.X.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean Y(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsService.E8);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.X.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.X;
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean g(int i2, Uri uri, Bundle bundle, ICustomTabsCallback iCustomTabsCallback) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsService.E8);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    parcelObtain.writeInt(i2);
                    _Parcel.b(parcelObtain, uri, 0);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.X.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean o(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsService.E8);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    _Parcel.b(parcelObtain, uri, 0);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.X.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean q(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsService.E8);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.X.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean s(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsService.E8);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    parcelObtain.writeStrongBinder(iBinder);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.X.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static ICustomTabsService b0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICustomTabsService.E8);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof ICustomTabsService)) {
                return (ICustomTabsService) iInterfaceQueryLocalInterface;
            }
            Proxy proxy = new Proxy();
            proxy.X = iBinder;
            return proxy;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = ICustomTabsService.E8;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i2) {
                case 2:
                    boolean zG = G(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zG ? 1 : 0);
                    return true;
                case 3:
                    boolean zQ = Q(ICustomTabsCallback.Stub.b0(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zQ ? 1 : 0);
                    return true;
                case 4:
                    ICustomTabsCallback iCustomTabsCallbackB0 = ICustomTabsCallback.Stub.b0(parcel.readStrongBinder());
                    Uri uri = (Uri) _Parcel.a(parcel, Uri.CREATOR);
                    Parcelable.Creator creator = Bundle.CREATOR;
                    boolean zS = S(iCustomTabsCallbackB0, uri, (Bundle) _Parcel.a(parcel, creator), parcel.createTypedArrayList(creator));
                    parcel2.writeNoException();
                    parcel2.writeInt(zS ? 1 : 0);
                    return true;
                case 5:
                    Bundle bundleM = m((Bundle) _Parcel.a(parcel, Bundle.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    _Parcel.b(parcel2, bundleM, 1);
                    return true;
                case 6:
                    boolean zW = w(ICustomTabsCallback.Stub.b0(parcel.readStrongBinder()), (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zW ? 1 : 0);
                    return true;
                case 7:
                    boolean zU = U(ICustomTabsCallback.Stub.b0(parcel.readStrongBinder()), (Uri) _Parcel.a(parcel, Uri.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zU ? 1 : 0);
                    return true;
                case 8:
                    int iO = O(ICustomTabsCallback.Stub.b0(parcel.readStrongBinder()), parcel.readString(), (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iO);
                    return true;
                case 9:
                    boolean zG2 = g(parcel.readInt(), (Uri) _Parcel.a(parcel, Uri.CREATOR), (Bundle) _Parcel.a(parcel, Bundle.CREATOR), ICustomTabsCallback.Stub.b0(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zG2 ? 1 : 0);
                    return true;
                case 10:
                    boolean zQ2 = q(ICustomTabsCallback.Stub.b0(parcel.readStrongBinder()), (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zQ2 ? 1 : 0);
                    return true;
                case 11:
                    boolean zO = o(ICustomTabsCallback.Stub.b0(parcel.readStrongBinder()), (Uri) _Parcel.a(parcel, Uri.CREATOR), (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zO ? 1 : 0);
                    return true;
                case 12:
                    ICustomTabsCallback iCustomTabsCallbackB1 = ICustomTabsCallback.Stub.b0(parcel.readStrongBinder());
                    boolean zL = l(parcel.readInt(), (Uri) _Parcel.a(parcel, Uri.CREATOR), (Bundle) _Parcel.a(parcel, Bundle.CREATOR), iCustomTabsCallbackB1);
                    parcel2.writeNoException();
                    parcel2.writeInt(zL ? 1 : 0);
                    return true;
                case 13:
                    boolean zY = Y(ICustomTabsCallback.Stub.b0(parcel.readStrongBinder()), (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zY ? 1 : 0);
                    return true;
                case 14:
                    boolean zS2 = s(ICustomTabsCallback.Stub.b0(parcel.readStrongBinder()), parcel.readStrongBinder(), (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zS2 ? 1 : 0);
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

    boolean G(long j);

    int O(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle);

    boolean Q(ICustomTabsCallback iCustomTabsCallback);

    boolean S(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, ArrayList arrayList);

    boolean U(ICustomTabsCallback iCustomTabsCallback, Uri uri);

    boolean Y(ICustomTabsCallback iCustomTabsCallback, Bundle bundle);

    boolean g(int i2, Uri uri, Bundle bundle, ICustomTabsCallback iCustomTabsCallback);

    boolean l(int i2, Uri uri, Bundle bundle, ICustomTabsCallback iCustomTabsCallback);

    Bundle m(Bundle bundle, String str);

    boolean o(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle);

    boolean q(ICustomTabsCallback iCustomTabsCallback, Bundle bundle);

    boolean s(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle);

    boolean w(ICustomTabsCallback iCustomTabsCallback, Bundle bundle);
}
