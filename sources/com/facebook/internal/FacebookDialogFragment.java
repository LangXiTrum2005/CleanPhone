package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.media.a;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginTargetApp;
import com.smartdigimkt.x.n;
import java.util.Date;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public class FacebookDialogFragment extends DialogFragment {
    public Dialog X;

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((this.X instanceof WebDialog) && isResumed()) {
            ((WebDialog) this.X).d();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        WebDialog facebookWebFallbackDialog;
        super.onCreate(bundle);
        if (this.X == null) {
            FragmentActivity activity = getActivity();
            Bundle bundleN = NativeProtocol.n(activity.getIntent());
            if (bundleN.getBoolean("is_fallback", false)) {
                String string = bundleN.getString("url");
                if (Utility.C(string)) {
                    HashSet hashSet = FacebookSdk.f15915a;
                    activity.finish();
                    return;
                }
                String strN = a.n(n.f39791p, FacebookSdk.c(), "://bridge/");
                int i2 = FacebookWebFallbackDialog.p0;
                WebDialog.b(activity);
                Validate.h();
                int i3 = WebDialog.n0;
                if (i3 == 0) {
                    Validate.h();
                    i3 = WebDialog.n0;
                }
                facebookWebFallbackDialog = new FacebookWebFallbackDialog(activity, i3);
                facebookWebFallbackDialog.j0 = false;
                facebookWebFallbackDialog.k0 = false;
                facebookWebFallbackDialog.l0 = false;
                facebookWebFallbackDialog.X = string;
                facebookWebFallbackDialog.f16387Y = strN;
                facebookWebFallbackDialog.Z = new WebDialog.OnCompleteListener() { // from class: com.facebook.internal.FacebookDialogFragment.2
                    @Override // com.facebook.internal.WebDialog.OnCompleteListener
                    public final void a(Bundle bundle2, FacebookException facebookException) {
                        FragmentActivity activity2 = FacebookDialogFragment.this.getActivity();
                        Intent intent = new Intent();
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        intent.putExtras(bundle2);
                        activity2.setResult(-1, intent);
                        activity2.finish();
                    }
                };
            } else {
                String string2 = bundleN.getString("action");
                Bundle bundle2 = bundleN.getBundle("params");
                if (Utility.C(string2)) {
                    HashSet hashSet2 = FacebookSdk.f15915a;
                    activity.finish();
                    return;
                }
                WebDialog.Builder builder = new WebDialog.Builder();
                Date date = AccessToken.m0;
                builder.f = AccessToken.Companion.b();
                if (!AccessToken.Companion.c()) {
                    builder.f16389b = FacebookSdk.c();
                }
                builder.f16388a = activity;
                builder.f16390c = string2;
                if (bundle2 != null) {
                    builder.f16391e = bundle2;
                } else {
                    builder.f16391e = new Bundle();
                }
                builder.d = new WebDialog.OnCompleteListener() { // from class: com.facebook.internal.FacebookDialogFragment.1
                    @Override // com.facebook.internal.WebDialog.OnCompleteListener
                    public final void a(Bundle bundle3, FacebookException facebookException) {
                        FragmentActivity activity2 = FacebookDialogFragment.this.getActivity();
                        activity2.setResult(facebookException == null ? -1 : 0, NativeProtocol.g(activity2.getIntent(), bundle3, facebookException));
                        activity2.finish();
                    }
                };
                AccessToken accessToken = builder.f;
                if (accessToken != null) {
                    builder.f16391e.putString("app_id", accessToken.i0);
                    builder.f16391e.putString("access_token", accessToken.f0);
                } else {
                    builder.f16391e.putString("app_id", builder.f16389b);
                }
                FragmentActivity fragmentActivity = builder.f16388a;
                String str = builder.f16390c;
                Bundle bundle3 = builder.f16391e;
                WebDialog.OnCompleteListener onCompleteListener = builder.d;
                WebDialog.b(fragmentActivity);
                facebookWebFallbackDialog = new WebDialog(fragmentActivity, str, bundle3, LoginTargetApp.FACEBOOK, onCompleteListener);
            }
            this.X = facebookWebFallbackDialog;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.X == null) {
            FragmentActivity activity = getActivity();
            activity.setResult(-1, NativeProtocol.g(activity.getIntent(), null, null));
            activity.finish();
            setShowsDialog(false);
        }
        return this.X;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Dialog dialog = this.X;
        if (dialog instanceof WebDialog) {
            ((WebDialog) dialog).d();
        }
    }
}
