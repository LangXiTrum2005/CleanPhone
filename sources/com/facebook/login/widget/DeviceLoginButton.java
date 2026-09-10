package com.facebook.login.widget;

import android.net.Uri;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.DeviceLoginManager;
import com.facebook.login.LoginBehavior;
import com.facebook.login.LoginManager;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceLoginButton extends LoginButton {
    public Uri t0;

    public class DeviceLoginClickListener extends LoginButton.LoginClickListener {
        public DeviceLoginClickListener() {
            super();
        }

        @Override // com.facebook.login.widget.LoginButton.LoginClickListener
        public final LoginManager a() {
            DeviceLoginButton deviceLoginButton = DeviceLoginButton.this;
            if (CrashShieldHandler.b(this)) {
                return null;
            }
            try {
                DeviceLoginManager deviceLoginManagerH = DeviceLoginManager.h();
                deviceLoginManagerH.f16490b = deviceLoginButton.getDefaultAudience();
                deviceLoginManagerH.f16489a = LoginBehavior.DEVICE_AUTH;
                deviceLoginButton.getDeviceRedirectUri();
                CrashShieldHandler.b(deviceLoginManagerH);
                return deviceLoginManagerH;
            } catch (Throwable th) {
                CrashShieldHandler.a(this, th);
                return null;
            }
        }
    }

    public Uri getDeviceRedirectUri() {
        return this.t0;
    }

    @Override // com.facebook.login.widget.LoginButton
    public LoginButton.LoginClickListener getNewLoginClickListener() {
        return new DeviceLoginClickListener();
    }

    public void setDeviceRedirectUri(Uri uri) {
        this.t0 = uri;
    }
}
