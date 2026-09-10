package com.facebook.gamingservices;

import android.content.Intent;
import android.net.Uri;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.share.model.ShareContent;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FriendFinderDialog extends FacebookDialogBase<Void, Result> {
    public static final /* synthetic */ int g = 0;

    /* JADX INFO: renamed from: com.facebook.gamingservices.FriendFinderDialog$1, reason: invalid class name */
    class AnonymousClass1 implements DaemonRequest.Callback {
        @Override // com.facebook.gamingservices.cloudgaming.DaemonRequest.Callback
        public final void a() {
            int i2 = FriendFinderDialog.g;
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.gamingservices.FriendFinderDialog$2, reason: invalid class name */
    class AnonymousClass2 implements CallbackManagerImpl.Callback {
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
        CallbackManagerImpl.RequestCodeOffset.GamingFriendFinder.d();
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
        Date date = AccessToken.m0;
        AccessToken accessTokenB = AccessToken.Companion.b();
        if (accessTokenB == null || accessTokenB.b()) {
            throw new FacebookException("Attempted to open GamingServices FriendFinder with an invalid access token");
        }
        h(new Intent("android.intent.action.VIEW", Uri.parse("https://fb.gg/me/friendfinder/" + accessTokenB.i0)), this.d);
    }
}
