package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/AuthenticationTokenManager;", "", "Companion", "CurrentAuthenticationTokenChangedBroadcastReceiver", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AuthenticationTokenManager {
    public static AuthenticationTokenManager d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f15903e = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AuthenticationToken f15904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalBroadcastManager f15905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AuthenticationTokenCache f15906c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/facebook/AuthenticationTokenManager$Companion;", "", "", "ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED", "Ljava/lang/String;", "EXTRA_NEW_AUTHENTICATION_TOKEN", "EXTRA_OLD_AUTHENTICATION_TOKEN", "SHARED_PREFERENCES_NAME", "TAG", "Lcom/facebook/AuthenticationTokenManager;", "instanceField", "Lcom/facebook/AuthenticationTokenManager;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Intrinsics.f(context, "context");
            Intrinsics.f(intent, "intent");
        }
    }

    public AuthenticationTokenManager(LocalBroadcastManager localBroadcastManager, AuthenticationTokenCache authenticationTokenCache) {
        this.f15905b = localBroadcastManager;
        this.f15906c = authenticationTokenCache;
    }
}
