package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends Binder implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22798a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i10 = this.f22798a;
        return this;
    }

    public abstract boolean m0(int i10, Parcel parcel, Parcel parcel2);

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        int i12 = 0;
        switch (this.f22798a) {
            case 0:
                if (i10 > 16777215) {
                    if (!super.onTransact(i10, parcel, parcel2, i11)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                k2 k2Var = (k2) this;
                if (i10 != 2) {
                    return false;
                }
                Status status = (Status) f.a(parcel, Status.CREATOR);
                Bundle bundle = (Bundle) f.a(parcel, Bundle.CREATOR);
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(l1.d.e(iDataAvail, "Parcel data not fully consumed, unread size: "));
                }
                b.d(status, bundle, k2Var.f22860b);
                return true;
            case 1:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return w1(i10, parcel, parcel2);
            case 2:
                if (i10 > 16777215) {
                    if (!super.onTransact(i10, parcel, parcel2, i11)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                ka.e eVar = (ka.e) this;
                if (i10 != 2) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                int i13 = la.a.f45246a;
                Bundle bundle2 = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
                int iDataAvail2 = parcel.dataAvail();
                if (iDataAvail2 > 0) {
                    throw new BadParcelableException(l1.d.e(iDataAvail2, "Parcel data not fully consumed, unread size: "));
                }
                la.k kVar = eVar.f44542d.f44544a;
                if (kVar != null) {
                    TaskCompletionSource taskCompletionSource = eVar.f44541c;
                    synchronized (kVar.f45265f) {
                        kVar.f45264e.remove(taskCompletionSource);
                        break;
                    }
                    kVar.a().post(new la.i(kVar, i12));
                }
                eVar.f44540b.a("onGetLaunchReviewFlowInfo", new Object[0]);
                eVar.f44541c.trySetResult(new ka.b((PendingIntent) bundle2.get("confirmation_intent"), bundle2.getBoolean("is_review_no_op")));
                return true;
            case 3:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return u1(i10, parcel, parcel2);
            case 4:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return m0(i10, parcel, parcel2);
            default:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return v1(i10, parcel, parcel2);
        }
    }

    public abstract boolean u1(int i10, Parcel parcel, Parcel parcel2);

    public boolean v1(int i10, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean w1(int i10, Parcel parcel, Parcel parcel2);

    public c(String str, int i10) {
        this.f22798a = i10;
        switch (i10) {
            case 3:
                attachInterface(this, str);
                break;
            case 4:
                attachInterface(this, str);
                break;
            case 5:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }
}
