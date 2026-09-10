package com.facebook.share.widget;

import android.view.View;
import androidx.datastore.preferences.protobuf.a;
import com.charging.screenshow.battery.animations.themes.R;
import com.facebook.FacebookButtonBase;
import com.facebook.FacebookSdk;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.DeviceShareDialog;
import com.facebook.share.model.ShareContent;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class DeviceShareButton extends FacebookButtonBase {
    public static final /* synthetic */ int o0 = 0;
    public ShareContent k0;
    public int l0;
    public boolean m0;
    public DeviceShareDialog n0;

    /* JADX INFO: Access modifiers changed from: private */
    public DeviceShareDialog getDialog() {
        DeviceShareDialog deviceShareDialog = this.n0;
        if (deviceShareDialog != null) {
            return deviceShareDialog;
        }
        if (getFragment() != null) {
            this.n0 = new DeviceShareDialog(new FragmentWrapper(getFragment()), DeviceShareDialog.g);
        } else if (getNativeFragment() != null) {
            this.n0 = new DeviceShareDialog(new FragmentWrapper(getNativeFragment()), DeviceShareDialog.g);
        } else {
            this.n0 = new DeviceShareDialog(getActivity());
        }
        return this.n0;
    }

    private void setRequestCode(int i2) {
        int i3 = FacebookSdk.j;
        if (i2 >= i3 && i2 < i3 + 100) {
            throw new IllegalArgumentException(a.k("Request code ", i2, " cannot be within the range reserved by the Facebook SDK."));
        }
        this.l0 = i2;
    }

    @Override // com.facebook.FacebookButtonBase
    public int getDefaultRequestCode() {
        return CallbackManagerImpl.RequestCodeOffset.Share.d();
    }

    @Override // com.facebook.FacebookButtonBase
    public int getDefaultStyleResource() {
        return R.style.com_facebook_button_share;
    }

    @Override // com.facebook.FacebookButtonBase
    public int getRequestCode() {
        return this.l0;
    }

    public ShareContent getShareContent() {
        return this.k0;
    }

    public View.OnClickListener getShareOnClickListener() {
        return new View.OnClickListener() { // from class: com.facebook.share.widget.DeviceShareButton.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceShareButton deviceShareButton = DeviceShareButton.this;
                if (CrashShieldHandler.b(this)) {
                    return;
                }
                try {
                    int i2 = DeviceShareButton.o0;
                    deviceShareButton.a(view);
                    deviceShareButton.getDialog().f(deviceShareButton.getShareContent());
                } catch (Throwable th) {
                    CrashShieldHandler.a(this, th);
                }
            }
        };
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        this.m0 = true;
    }

    public void setShareContent(ShareContent shareContent) {
        this.k0 = shareContent;
        if (this.m0) {
            return;
        }
        setEnabled(new DeviceShareDialog(getActivity()).b(getShareContent()));
        this.m0 = false;
    }
}
