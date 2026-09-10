package com.facebook.share.widget;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.charging.screenshow.battery.animations.themes.R;
import com.facebook.CallbackManager;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.share.Sharer;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.model.ShareContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareButton extends ShareButtonBase {
    @Override // com.facebook.FacebookButtonBase
    public int getDefaultRequestCode() {
        return CallbackManagerImpl.RequestCodeOffset.Share.d();
    }

    @Override // com.facebook.FacebookButtonBase
    public int getDefaultStyleResource() {
        return R.style.com_facebook_button_share;
    }

    @Override // com.facebook.share.widget.ShareButtonBase
    public FacebookDialogBase<ShareContent, Sharer.Result> getDialog() {
        ShareDialog shareDialog;
        if (getFragment() != null) {
            Fragment fragment = getFragment();
            shareDialog = new ShareDialog(new FragmentWrapper(fragment), getRequestCode());
        } else if (getNativeFragment() != null) {
            android.app.Fragment nativeFragment = getNativeFragment();
            shareDialog = new ShareDialog(new FragmentWrapper(nativeFragment), getRequestCode());
        } else {
            Activity activity = getActivity();
            int requestCode = getRequestCode();
            shareDialog = new ShareDialog(activity, requestCode);
            shareDialog.g = true;
            ShareInternalUtility.m(requestCode);
        }
        CallbackManager callbackManager = getCallbackManager();
        Intrinsics.f(callbackManager, "callbackManager");
        shareDialog.f16275e = callbackManager;
        return shareDialog;
    }
}
