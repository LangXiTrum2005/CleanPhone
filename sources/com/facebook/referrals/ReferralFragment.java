package com.facebook.referrals;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookSdk;
import com.facebook.internal.CustomTab;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.Utility;
import com.facebook.login.CustomTabPrefetchHelper;
import com.smartdigimkt.x.n;
import java.math.BigInteger;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class ReferralFragment extends Fragment {
    public ReferralClient X;

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        FragmentActivity activity;
        super.onActivityResult(i2, i3, intent);
        ReferralClient referralClient = this.X;
        referralClient.getClass();
        boolean zEquals = true;
        if (i2 != 1) {
            return;
        }
        if (intent != null) {
            int i4 = CustomTabMainActivity.Z;
            String stringExtra = intent.getStringExtra("CustomTabMainActivity.extra_url");
            if (stringExtra != null) {
                if (stringExtra.startsWith(CustomTabUtils.c(n.f39791p + FacebookSdk.c() + "://authorize"))) {
                    Bundle bundleL = Utility.L(Uri.parse(stringExtra).getQuery());
                    if (referralClient.f16527c != null) {
                        zEquals = referralClient.f16527c.equals(bundleL.getString("state"));
                        referralClient.f16527c = null;
                    }
                    if (zEquals) {
                        intent.putExtras(bundleL);
                    } else {
                        intent.putExtra("error_message", "The referral response was missing a valid challenge string.");
                        i3 = 0;
                    }
                }
            }
        }
        ReferralFragment referralFragment = referralClient.f16525a;
        if (!referralFragment.isAdded() || (activity = referralFragment.getActivity()) == null) {
            return;
        }
        activity.setResult(i3, intent);
        activity.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReferralClient referralClient = new ReferralClient();
        referralClient.f16525a = this;
        this.X = referralClient;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        FragmentActivity activity;
        CustomTabsClient customTabsClient;
        super.onResume();
        ReferralClient referralClient = this.X;
        ReferralFragment referralFragment = referralClient.f16525a;
        if (referralFragment.getActivity() != null && referralFragment.getActivity().checkCallingOrSelfPermission("android.permission.INTERNET") == 0) {
            if (referralClient.f16526b == null) {
                referralClient.f16526b = CustomTabUtils.a();
            }
            if (referralClient.f16526b != null) {
                Bundle bundle = new Bundle();
                String string = new BigInteger(100, new Random()).toString(32);
                Intrinsics.e(string, "BigInteger(length * 5, r).toString(32)");
                referralClient.f16527c = string;
                bundle.putString("redirect_uri", CustomTabUtils.c(n.f39791p + FacebookSdk.c() + "://authorize"));
                bundle.putString("app_id", FacebookSdk.c());
                bundle.putString("state", referralClient.f16527c);
                if (FacebookSdk.m) {
                    Uri uriA = CustomTab.a(bundle, "share_referral");
                    CustomTabsSession customTabsSession = CustomTabPrefetchHelper.f16459Y;
                    if (customTabsSession == null && customTabsSession == null && (customTabsClient = CustomTabPrefetchHelper.X) != null) {
                        CustomTabPrefetchHelper.f16459Y = customTabsClient.d(null);
                    }
                    CustomTabsSession customTabsSession2 = CustomTabPrefetchHelper.f16459Y;
                    if (customTabsSession2 != null) {
                        customTabsSession2.c(uriA, null);
                    }
                }
                Intent intent = new Intent(referralFragment.getActivity(), (Class<?>) CustomTabMainActivity.class);
                int i2 = CustomTabMainActivity.Z;
                intent.putExtra("CustomTabMainActivity.extra_action", "share_referral");
                intent.putExtra("CustomTabMainActivity.extra_params", bundle);
                if (referralClient.f16526b == null) {
                    referralClient.f16526b = CustomTabUtils.a();
                }
                intent.putExtra("CustomTabMainActivity.extra_chromePackage", referralClient.f16526b);
                referralFragment.startActivityForResult(intent, 1);
                return;
            }
        }
        Intent intent2 = new Intent();
        intent2.putExtra("error_message", "Failed to open Referral dialog: Chrome custom tab could not be started. Please make sure internet permission is granted and Chrome is installed");
        ReferralFragment referralFragment2 = referralClient.f16525a;
        if (!referralFragment2.isAdded() || (activity = referralFragment2.getActivity()) == null) {
            return;
        }
        activity.setResult(0, intent2);
        activity.finish();
    }
}
