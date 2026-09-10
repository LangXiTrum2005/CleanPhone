package com.google.android.exoplayer2.scheduler;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new AnonymousClass1();
    public final int X;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.scheduler.Requirements$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<Requirements> {
        @Override // android.os.Parcelable.Creator
        public final Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Requirements[] newArray(int i2) {
            return new Requirements[i2];
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RequirementFlags {
    }

    public Requirements(int i2) {
        this.X = (i2 & 2) != 0 ? i2 | 1 : i2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0010  */
    public final int a(Context context) {
        int i2;
        boolean zIsDeviceIdleMode;
        Intent intentD;
        int intExtra;
        int i3 = this.X;
        if ((i3 & 1) != 0) {
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                i2 = i3 & 3;
            } else {
                if (Util.f18979a >= 24) {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (activeNetwork != null) {
                        try {
                            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                            if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
                            }
                        } catch (SecurityException unused) {
                        }
                    }
                    i2 = i3 & 3;
                }
                if ((i3 & 2) == 0 || !connectivityManager.isActiveNetworkMetered()) {
                    i2 = 0;
                } else {
                    i2 = 2;
                }
            }
        } else {
            i2 = 0;
        }
        if (((i3 & 8) != 0) && ((intentD = androidx.datastore.preferences.protobuf.a.d("android.intent.action.BATTERY_CHANGED", context, null)) == null || ((intExtra = intentD.getIntExtra("status", -1)) != 2 && intExtra != 5))) {
            i2 |= 8;
        }
        if ((i3 & 4) != 0) {
            Object systemService2 = context.getSystemService("power");
            systemService2.getClass();
            PowerManager powerManager = (PowerManager) systemService2;
            int i4 = Util.f18979a;
            if (i4 >= 23) {
                zIsDeviceIdleMode = powerManager.isDeviceIdleMode();
            } else {
                zIsDeviceIdleMode = i4 < 20 ? !powerManager.isScreenOn() : !powerManager.isInteractive();
            }
            if (!zIsDeviceIdleMode) {
                i2 |= 4;
            }
        }
        if ((i3 & 16) != 0) {
            return !(androidx.datastore.preferences.protobuf.a.d("android.intent.action.DEVICE_STORAGE_LOW", context, null) == null) ? i2 | 16 : i2;
        }
        return i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Requirements.class == obj.getClass()) {
            if (this.X == ((Requirements) obj).X) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.X;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.X);
    }
}
