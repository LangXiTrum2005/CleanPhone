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
@Deprecated
public final class SendButton extends ShareButtonBase {
    @Override // com.facebook.FacebookButtonBase
    public int getDefaultRequestCode() {
        return CallbackManagerImpl.RequestCodeOffset.Message.d();
    }

    @Override // com.facebook.FacebookButtonBase
    public int getDefaultStyleResource() {
        return R.style.com_facebook_button_send;
    }

    @Override // com.facebook.share.widget.ShareButtonBase
    public FacebookDialogBase<ShareContent, Sharer.Result> getDialog() {
        MessageDialog messageDialog;
        if (getFragment() != null) {
            Fragment fragment = getFragment();
            int requestCode = getRequestCode();
            messageDialog = new MessageDialog(new FragmentWrapper(fragment), requestCode);
            ShareInternalUtility.m(requestCode);
        } else if (getNativeFragment() != null) {
            android.app.Fragment nativeFragment = getNativeFragment();
            int requestCode2 = getRequestCode();
            messageDialog = new MessageDialog(new FragmentWrapper(nativeFragment), requestCode2);
            ShareInternalUtility.m(requestCode2);
        } else {
            Activity activity = getActivity();
            int requestCode3 = getRequestCode();
            messageDialog = new MessageDialog(activity, requestCode3);
            ShareInternalUtility.m(requestCode3);
        }
        CallbackManager callbackManager = getCallbackManager();
        Intrinsics.f(callbackManager, "callbackManager");
        messageDialog.f16275e = callbackManager;
        return messageDialog;
    }
}
