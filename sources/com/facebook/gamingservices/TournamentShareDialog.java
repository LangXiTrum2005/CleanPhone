package com.facebook.gamingservices;

import android.content.Intent;
import android.content.pm.PackageManager;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FacebookDialogBase;
import com.inmobi.media.C3312y0;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/gamingservices/TournamentShareDialog;", "Lcom/facebook/internal/FacebookDialogBase;", "Lcom/facebook/gamingservices/TournamentConfig;", "Lcom/facebook/gamingservices/TournamentShareDialog$Result;", "AppSwitchHandler", "Companion", "FacebookAppHandler", "Result", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
public final class TournamentShareDialog extends FacebookDialogBase<TournamentConfig, Result> {
    public static final /* synthetic */ int g = 0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00160\u0001R\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¨\u0006\u0005"}, d2 = {"Lcom/facebook/gamingservices/TournamentShareDialog$AppSwitchHandler;", "Lcom/facebook/internal/FacebookDialogBase$ModeHandler;", "Lcom/facebook/internal/FacebookDialogBase;", "Lcom/facebook/gamingservices/TournamentConfig;", "Lcom/facebook/gamingservices/TournamentShareDialog$Result;", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
    public final class AppSwitchHandler extends FacebookDialogBase<TournamentConfig, Result>.ModeHandler {
        public AppSwitchHandler() {
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final /* bridge */ /* synthetic */ boolean a(Object obj, boolean z2) {
            return true;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final AppCall b(Object obj) {
            TournamentShareDialog.this.c();
            Date date = AccessToken.m0;
            AccessToken accessTokenB = AccessToken.Companion.b();
            if (accessTokenB == null || accessTokenB.b()) {
                throw new FacebookException("Attempted to share tournament with an invalid access token");
            }
            String str = accessTokenB.l0;
            if (str == null || "gaming".equals(str)) {
                throw new FacebookException("Attempted to share tournament without a score");
            }
            throw new FacebookException("Attempted to share tournament without without gaming login");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/gamingservices/TournamentShareDialog$Companion;", "", "", "defaultRequestCode", "I", "", C3312y0.KEY_REQUEST_ID, "Ljava/lang/String;", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00160\u0001R\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¨\u0006\u0005"}, d2 = {"Lcom/facebook/gamingservices/TournamentShareDialog$FacebookAppHandler;", "Lcom/facebook/internal/FacebookDialogBase$ModeHandler;", "Lcom/facebook/internal/FacebookDialogBase;", "Lcom/facebook/gamingservices/TournamentConfig;", "Lcom/facebook/gamingservices/TournamentShareDialog$Result;", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
    public final class FacebookAppHandler extends FacebookDialogBase<TournamentConfig, Result>.ModeHandler {
        public FacebookAppHandler() {
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final boolean a(Object obj, boolean z2) {
            PackageManager packageManager = FacebookSdk.b().getPackageManager();
            Intrinsics.e(packageManager, "getApplicationContext().packageManager");
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            return intent.resolveActivity(packageManager) != null;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public final AppCall b(Object obj) {
            Date date = AccessToken.m0;
            AccessToken accessTokenB = AccessToken.Companion.b();
            TournamentShareDialog.this.c();
            new Intent("com.facebook.games.gaming_services.DEEPLINK").setType("text/plain");
            if (accessTokenB == null || accessTokenB.b()) {
                throw new FacebookException("Attempted to share tournament with an invalid access token");
            }
            String str = accessTokenB.l0;
            if (str == null || "gaming".equals(str)) {
                throw new FacebookException("Attempted to share tournament without a score");
            }
            throw new FacebookException("Attempted to share tournament while user is not gaming logged in");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/gamingservices/TournamentShareDialog$Result;", "", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
    public static final class Result {
    }

    static {
        CallbackManagerImpl.RequestCodeOffset.TournamentShareDialog.d();
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public final AppCall c() {
        return new AppCall(this.d, 0);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FacebookAppHandler());
        arrayList.add(new AppSwitchHandler());
        return arrayList;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public final void g(Object obj, Object obj2) {
        super.g((TournamentConfig) obj, FacebookDialogBase.f);
    }
}
