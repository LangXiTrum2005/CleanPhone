package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: loaded from: classes3.dex */
class DeviceAuthMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new AnonymousClass1();
    public static ScheduledThreadPoolExecutor Z;

    /* JADX INFO: renamed from: com.facebook.login.DeviceAuthMethodHandler$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new DeviceAuthMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i2) {
            return new DeviceAuthMethodHandler[i2];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final String j() {
        return "device_auth";
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final int r(LoginClient.Request request) {
        FragmentActivity activity = this.f16503Y.Z.getActivity();
        if (activity == null || activity.isFinishing()) {
            return 1;
        }
        DeviceAuthDialog deviceAuthDialog = new DeviceAuthDialog();
        deviceAuthDialog.show(activity.getSupportFragmentManager(), "login_with_facebook");
        deviceAuthDialog.k(request);
        return 1;
    }
}
