package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.applovin.impl.ca;
import eb.d0;
import f9.d;
import java.util.Arrays;
import k9.c0;
import l9.a;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ConnectionResult extends a {
    public static final int SUCCESS = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f11642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f11644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ConnectionResult f11639f = new ConnectionResult(0, null, null);

    @NonNull
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new d(12);

    public ConnectionResult(int i10, int i11, PendingIntent pendingIntent, String str, Integer num) {
        this.f11640a = i10;
        this.f11641b = i11;
        this.f11642c = pendingIntent;
        this.f11643d = str;
        this.f11644e = num;
    }

    public static String h(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return ca.m(new StringBuilder(String.valueOf(i10).length() + 20), "UNKNOWN_ERROR_CODE(", i10, ")");
                }
        }
    }

    public final boolean b() {
        return this.f11641b == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f11641b == connectionResult.f11641b && c0.l(this.f11642c, connectionResult.f11642c) && c0.l(this.f11643d, connectionResult.f11643d) && c0.l(this.f11644e, connectionResult.f11644e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11641b), this.f11642c, this.f11643d, this.f11644e});
    }

    public final String toString() {
        d0 d0Var = new d0(this);
        d0Var.P0(h(this.f11641b), "statusCode");
        d0Var.P0(this.f11642c, "resolution");
        d0Var.P0(this.f11643d, "message");
        d0Var.P0(this.f11644e, "clientMethodKey");
        return d0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = b.R(parcel, 20293);
        b.Q(parcel, 1, 4);
        parcel.writeInt(this.f11640a);
        b.Q(parcel, 2, 4);
        parcel.writeInt(this.f11641b);
        b.I(parcel, 3, this.f11642c, i10);
        b.J(parcel, 4, this.f11643d);
        Integer num = this.f11644e;
        if (num != null) {
            b.Q(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        b.S(parcel, iR);
    }

    public ConnectionResult(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str, null);
    }
}
