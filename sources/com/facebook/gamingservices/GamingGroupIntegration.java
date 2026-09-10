package com.facebook.gamingservices;

import android.content.Intent;
import android.net.Uri;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.share.model.ShareContent;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GamingGroupIntegration extends FacebookDialogBase<Void, Result> {

    /* JADX INFO: renamed from: com.facebook.gamingservices.GamingGroupIntegration$1, reason: invalid class name */
    class AnonymousClass1 implements CallbackManagerImpl.Callback {
        @Override // com.facebook.internal.CallbackManagerImpl.Callback
        public final boolean a(int i2, Intent intent) {
            if (intent == null || !intent.hasExtra("error")) {
                throw null;
            }
            FacebookException facebookException = ((FacebookRequestError) intent.getParcelableExtra("error")).f15913Y;
            throw null;
        }
    }

    public static class Result {
    }

    static {
        CallbackManagerImpl.RequestCodeOffset.GamingGroupIntegration.d();
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public final AppCall c() {
        return null;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public final List e() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.internal.FacebookDialogBase
    public final void f(ShareContent shareContent) {
        h(new Intent("android.intent.action.VIEW", Uri.parse("https://fb.gg/me/community/".concat(FacebookSdk.c()))), this.d);
    }
}
