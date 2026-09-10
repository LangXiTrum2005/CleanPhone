package v9;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.play_billing.q1;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends Binder implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52506a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f52507b;

    public f(TaskCompletionSource taskCompletionSource) {
        this.f52507b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i10 = this.f52506a;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        g4.a aVar = null;
        g4.a aVar2 = null;
        int i12 = 0;
        switch (this.f52506a) {
            case 0:
                if (i10 > 16777215) {
                    if (!super.onTransact(i10, parcel, parcel2, i11)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                if (i10 != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator = Status.CREATOR;
                int i13 = a.f52496a;
                Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                zzc zzcVarCreateFromParcel = parcel.readInt() == 0 ? null : zzc.CREATOR.createFromParcel(parcel);
                q1.x(statusCreateFromParcel, zzcVarCreateFromParcel != null ? new AppSetIdInfo(zzcVarCreateFromParcel.zzb(), zzcVarCreateFromParcel.zza()) : null, (TaskCompletionSource) this.f52507b);
                return true;
            case 1:
                if (i10 > 16777215) {
                    if (!super.onTransact(i10, parcel, parcel2, i11)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                if (i10 != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator2 = Status.CREATOR;
                int i14 = y9.a.f54350a;
                Status statusCreateFromParcel2 = parcel.readInt() == 0 ? null : creator2.createFromParcel(parcel);
                String string = parcel.readString();
                j9.f fVarCreateFromParcel = parcel.readInt() != 0 ? j9.f.CREATOR.createFromParcel(parcel) : null;
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(l1.d.k(new StringBuilder(String.valueOf(iDataAvail).length() + 45), "Parcel data not fully consumed, unread size: ", iDataAvail));
                }
                q1.x(statusCreateFromParcel2, string, (TaskCompletionSource) this.f52507b);
                return true;
            default:
                if (i10 == 1) {
                    parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                    IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder != null) {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof g4.a)) {
                            aVar2 = new g4.a();
                            aVar2.f41472a = strongBinder;
                        } else {
                            aVar2 = (g4.a) iInterfaceQueryLocalInterface;
                        }
                    }
                    String string2 = parcel.readString();
                    if (string2 != null) {
                        synchronized (((MultiInstanceInvalidationService) this.f52507b).f4983c) {
                            try {
                                MultiInstanceInvalidationService multiInstanceInvalidationService = (MultiInstanceInvalidationService) this.f52507b;
                                int i15 = multiInstanceInvalidationService.f4981a + 1;
                                multiInstanceInvalidationService.f4981a = i15;
                                if (multiInstanceInvalidationService.f4983c.register(aVar2, Integer.valueOf(i15))) {
                                    ((MultiInstanceInvalidationService) this.f52507b).f4982b.put(Integer.valueOf(i15), string2);
                                    i12 = i15;
                                } else {
                                    ((MultiInstanceInvalidationService) this.f52507b).f4981a--;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        break;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(i12);
                    return true;
                }
                if (i10 == 2) {
                    parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof g4.a)) {
                            aVar = new g4.a();
                            aVar.f41472a = strongBinder2;
                        } else {
                            aVar = (g4.a) iInterfaceQueryLocalInterface2;
                        }
                    }
                    int i16 = parcel.readInt();
                    synchronized (((MultiInstanceInvalidationService) this.f52507b).f4983c) {
                        ((MultiInstanceInvalidationService) this.f52507b).f4983c.unregister(aVar);
                        ((MultiInstanceInvalidationService) this.f52507b).f4982b.remove(Integer.valueOf(i16));
                        break;
                    }
                    parcel2.writeNoException();
                    return true;
                }
                if (i10 != 3) {
                    if (i10 != 1598968902) {
                        return super.onTransact(i10, parcel, parcel2, i11);
                    }
                    parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                    return true;
                }
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int i17 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                synchronized (((MultiInstanceInvalidationService) this.f52507b).f4983c) {
                    try {
                        String str = (String) ((MultiInstanceInvalidationService) this.f52507b).f4982b.get(Integer.valueOf(i17));
                        if (str == null) {
                            Log.w("ROOM", "Remote invalidation client ID not registered");
                            return true;
                        }
                        int iBeginBroadcast = ((MultiInstanceInvalidationService) this.f52507b).f4983c.beginBroadcast();
                        while (i12 < iBeginBroadcast) {
                            try {
                                Integer num = (Integer) ((MultiInstanceInvalidationService) this.f52507b).f4983c.getBroadcastCookie(i12);
                                int iIntValue = num.intValue();
                                String str2 = (String) ((MultiInstanceInvalidationService) this.f52507b).f4982b.get(num);
                                if (i17 != iIntValue && str.equals(str2)) {
                                    try {
                                        ((g4.a) ((MultiInstanceInvalidationService) this.f52507b).f4983c.getBroadcastItem(i12)).q(strArrCreateStringArray);
                                    } catch (RemoteException e10) {
                                        Log.w("ROOM", "Error invoking a remote callback", e10);
                                    }
                                }
                                i12++;
                            } catch (Throwable th3) {
                                ((MultiInstanceInvalidationService) this.f52507b).f4983c.finishBroadcast();
                                throw th3;
                            }
                        }
                        ((MultiInstanceInvalidationService) this.f52507b).f4983c.finishBroadcast();
                        return true;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
        }
    }

    public f(y9.d dVar, TaskCompletionSource taskCompletionSource) {
        this.f52507b = taskCompletionSource;
        Objects.requireNonNull(dVar);
        attachInterface(this, "com.google.android.gms.cloudmessaging.internal.IRegisterCallback");
    }

    public f(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f52507b = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }
}
