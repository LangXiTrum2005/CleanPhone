package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.measurement.db;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 extends com.bumptech.glide.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22852a;

    public /* synthetic */ j2(int i10) {
        this.f22852a = i10;
    }

    @Override // com.bumptech.glide.d
    public j9.c b(Context context, Looper looper, com.google.android.gms.internal.consent_sdk.x xVar, Object obj, j9.j jVar, j9.k kVar) {
        switch (this.f22852a) {
            case 1:
                return new db(context, looper, 51, xVar, jVar, kVar, 0);
            case 2:
                return new w9.c(context, looper, xVar, (e9.b) obj, (com.google.android.gms.common.api.internal.r) jVar, (com.google.android.gms.common.api.internal.r) kVar);
            case 3:
                return new g9.e(context, looper, xVar, (GoogleSignInOptions) obj, (com.google.android.gms.common.api.internal.r) jVar, (com.google.android.gms.common.api.internal.r) kVar);
            case 4:
                xVar.getClass();
                Integer num = (Integer) xVar.f23265f;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new ia.a(context, looper, xVar, bundle, jVar, kVar);
            case 5:
                throw q4.a.h(obj);
            default:
                return super.b(context, looper, xVar, obj, jVar, kVar);
        }
    }

    @Override // com.bumptech.glide.d
    public j9.c c(Context context, Looper looper, com.google.android.gms.internal.consent_sdk.x xVar, Object obj, com.google.android.gms.common.api.internal.r rVar, com.google.android.gms.common.api.internal.r rVar2) {
        switch (this.f22852a) {
            case 0:
                return new h2(context, looper, 224, xVar, rVar, rVar2, 0);
            case 6:
                return new m9.a(context, looper, 449, xVar, rVar, rVar2, 0);
            case 7:
                return new m9.e(context, looper, xVar, (k9.q) obj, rVar, rVar2);
            case 8:
                return new v9.b(context, looper, 300, xVar, rVar, rVar2, 0);
            case 9:
                return new y9.b(context, looper, 457, xVar, rVar, rVar2, 0);
            default:
                return super.c(context, looper, xVar, obj, rVar, rVar2);
        }
    }
}
