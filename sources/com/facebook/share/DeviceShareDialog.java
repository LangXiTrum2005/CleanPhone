package com.facebook.share;

import android.app.Activity;
import android.content.Intent;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DeviceShareDialog extends FacebookDialogBase<ShareContent, Result> {
    public static final int g = CallbackManagerImpl.RequestCodeOffset.DeviceShare.d();

    /* JADX INFO: renamed from: com.facebook.share.DeviceShareDialog$1, reason: invalid class name */
    class AnonymousClass1 implements CallbackManagerImpl.Callback {
        @Override // com.facebook.internal.CallbackManagerImpl.Callback
        public final boolean a(int i2, Intent intent) {
            if (!intent.hasExtra("error")) {
                throw null;
            }
            FacebookException facebookException = ((FacebookRequestError) intent.getParcelableExtra("error")).f15913Y;
            throw null;
        }
    }

    public static class Result {
    }

    public DeviceShareDialog(Activity activity) {
        super(activity, g);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public final boolean b(ShareContent shareContent) {
        return (shareContent instanceof ShareLinkContent) || (shareContent instanceof ShareOpenGraphContent);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public final AppCall c() {
        return null;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public final List e() {
        return null;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public final void g(Object obj, Object obj2) {
        ShareContent shareContent = (ShareContent) obj;
        if (shareContent == null) {
            throw new FacebookException("Must provide non-null content to share");
        }
        if (!(shareContent instanceof ShareLinkContent) && !(shareContent instanceof ShareOpenGraphContent)) {
            throw new FacebookException(getClass().getSimpleName().concat(" only supports ShareLinkContent or ShareOpenGraphContent"));
        }
        Intent intent = new Intent();
        intent.setClass(FacebookSdk.b(), FacebookActivity.class);
        intent.setAction("DeviceShareDialogFragment");
        intent.putExtra("content", shareContent);
        h(intent, this.d);
    }
}
