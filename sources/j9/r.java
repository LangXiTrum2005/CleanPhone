package j9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Parcelable.Creator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f43754b = new r(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43755a;

    public /* synthetic */ r(int i10) {
        this.f43755a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f43755a) {
            case 0:
                int iDataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(iDataPosition - 4);
                    return f.f43729d;
                }
                int iO0 = i0.o0(parcel);
                boolean zA0 = false;
                g gVar = null;
                while (parcel.dataPosition() < iO0) {
                    int i10 = parcel.readInt();
                    char c4 = (char) i10;
                    if (c4 == 1) {
                        gVar = (g) i0.s(parcel, i10, g.CREATOR);
                    } else if (c4 != 2) {
                        i0.l0(parcel, i10);
                    } else {
                        zA0 = i0.a0(parcel, i10);
                    }
                }
                i0.D(parcel, iO0);
                return new f(gVar, zA0);
            case 1:
                int iO1 = i0.o0(parcel);
                int iD0 = 0;
                boolean zA1 = true;
                int iD1 = 0;
                int iD2 = 0;
                while (parcel.dataPosition() < iO1) {
                    int i11 = parcel.readInt();
                    char c5 = (char) i11;
                    if (c5 == 1) {
                        iD0 = i0.d0(parcel, i11);
                    } else if (c5 == 2) {
                        iD1 = i0.d0(parcel, i11);
                    } else if (c5 == 3) {
                        iD2 = i0.d0(parcel, i11);
                    } else if (c5 != 4) {
                        i0.l0(parcel, i11);
                    } else {
                        zA1 = i0.a0(parcel, i11);
                    }
                }
                i0.D(parcel, iO1);
                return new g(iD0, iD1, iD2, zA1);
            case 2:
                int iO2 = i0.o0(parcel);
                String strV = null;
                int iD3 = 0;
                while (parcel.dataPosition() < iO2) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 1) {
                        iD3 = i0.d0(parcel, i12);
                    } else if (c10 != 2) {
                        i0.l0(parcel, i12);
                    } else {
                        strV = i0.v(parcel, i12);
                    }
                }
                i0.D(parcel, iO2);
                return new Scope(iD3, strV);
            default:
                int iO3 = i0.o0(parcel);
                String strV2 = null;
                ConnectionResult connectionResult = null;
                int iD4 = 0;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iO3) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 1) {
                        iD4 = i0.d0(parcel, i13);
                    } else if (c11 == 2) {
                        strV2 = i0.v(parcel, i13);
                    } else if (c11 == 3) {
                        pendingIntent = (PendingIntent) i0.s(parcel, i13, PendingIntent.CREATOR);
                    } else if (c11 != 4) {
                        i0.l0(parcel, i13);
                    } else {
                        connectionResult = (ConnectionResult) i0.s(parcel, i13, ConnectionResult.CREATOR);
                    }
                }
                i0.D(parcel, iO3);
                return new Status(iD4, strV2, pendingIntent, connectionResult);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f43755a) {
            case 0:
                return new f[i10];
            case 1:
                return new g[i10];
            case 2:
                return new Scope[i10];
            default:
                return new Status[i10];
        }
    }
}
