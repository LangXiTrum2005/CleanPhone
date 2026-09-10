package com.charging.screenshow.battery.animations.themes.fragment;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.activity.MainAct;
import com.charging.screenshow.battery.animations.themes.activity.PrivacyAct;
import com.charging.screenshow.battery.animations.themes.activity.w;
import com.charging.screenshow.battery.animations.themes.databinding.FragSettingsBinding;
import com.charging.screenshow.battery.animations.themes.utils.ActUtils;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import com.charging.screenshow.battery.animations.themes.view.dialog.RateDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/fragment/SettingsFrag;", "Lcom/charging/screenshow/battery/animations/themes/fragment/BaseFrag;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SettingsFrag extends BaseFrag {
    public FragSettingsBinding Z;

    @Override // com.charging.screenshow.battery.animations.themes.fragment.BaseFrag
    public final View b() {
        View viewInflate = getLayoutInflater().inflate(R.layout.frag_settings, (ViewGroup) null, false);
        int i2 = R.id.rlPrivacy;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.a(R.id.rlPrivacy, viewInflate);
        if (relativeLayout != null) {
            i2 = R.id.rlRate;
            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.a(R.id.rlRate, viewInflate);
            if (relativeLayout2 != null) {
                i2 = R.id.rlShare;
                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.a(R.id.rlShare, viewInflate);
                if (relativeLayout3 != null) {
                    i2 = R.id.tvTitle;
                    TextView textView = (TextView) ViewBindings.a(R.id.tvTitle, viewInflate);
                    if (textView != null) {
                        i2 = R.id.tvVersion;
                        TextView textView2 = (TextView) ViewBindings.a(R.id.tvVersion, viewInflate);
                        if (textView2 != null) {
                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                            this.Z = new FragSettingsBinding(linearLayout, relativeLayout, relativeLayout2, relativeLayout3, textView, textView2);
                            Intrinsics.e(linearLayout, "getRoot(...)");
                            return linearLayout;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // com.charging.screenshow.battery.animations.themes.fragment.BaseFrag
    public final TextView c() {
        FragSettingsBinding fragSettingsBinding = this.Z;
        if (fragSettingsBinding != null) {
            return fragSettingsBinding.d;
        }
        Intrinsics.m("binding");
        throw null;
    }

    @Override // com.charging.screenshow.battery.animations.themes.fragment.BaseFrag
    public final void f() {
        String str;
        FragSettingsBinding fragSettingsBinding = this.Z;
        if (fragSettingsBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        String str2 = "";
        try {
            PackageManager packageManager = AppExt.a().getPackageManager();
            Intrinsics.e(packageManager, "getPackageManager(...)");
            PackageInfo packageInfo = packageManager.getPackageInfo(AppExt.a().getPackageName(), 0);
            if (packageInfo != null && (str = packageInfo.versionName) != null) {
                str2 = str;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
        fragSettingsBinding.f13193e.setText(str2);
        FragSettingsBinding fragSettingsBinding2 = this.Z;
        if (fragSettingsBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        final int i2 = 0;
        ViewExt.c(fragSettingsBinding2.f13191b, new Function1(this) { // from class: com.charging.screenshow.battery.animations.themes.fragment.j

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ SettingsFrag f13273Y;

            {
                this.f13273Y = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit unit = Unit.f43263a;
                SettingsFrag settingsFrag = this.f13273Y;
                View it = (View) obj;
                switch (i2) {
                    case 0:
                        Intrinsics.f(it, "it");
                        if (settingsFrag.requireActivity() instanceof MainAct) {
                            FragmentActivity fragmentActivityRequireActivity = settingsFrag.requireActivity();
                            Intrinsics.d(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.charging.screenshow.battery.animations.themes.activity.MainAct");
                            MainAct mainAct = (MainAct) fragmentActivityRequireActivity;
                            RateDialog rateDialog = new RateDialog(mainAct, new w(mainAct, 0));
                            mainAct.l0 = rateDialog;
                            rateDialog.show();
                        }
                        break;
                    case 1:
                        Intrinsics.f(it, "it");
                        try {
                            if (settingsFrag.getActivity() != null) {
                                Intent intent = new Intent();
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", settingsFrag.getString(R.string.share_text, "http://play.google.com/store/apps/details?id=" + settingsFrag.requireActivity().getPackageName()));
                                settingsFrag.startActivity(intent);
                            }
                        } catch (Exception unused) {
                        }
                        break;
                    default:
                        Intrinsics.f(it, "it");
                        if (settingsFrag.requireActivity() != null) {
                            int i3 = PrivacyAct.j0;
                            FragmentActivity fragmentActivityRequireActivity2 = settingsFrag.requireActivity();
                            Intrinsics.e(fragmentActivityRequireActivity2, "requireActivity(...)");
                            Intent intentA = ActUtils.a(fragmentActivityRequireActivity2, PrivacyAct.class);
                            intentA.putExtra("url", "https://sites.google.com/view/zhikenet-privacy/");
                            fragmentActivityRequireActivity2.startActivity(intentA);
                        }
                        break;
                }
                return unit;
                return unit;
            }
        });
        FragSettingsBinding fragSettingsBinding3 = this.Z;
        if (fragSettingsBinding3 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        final int i3 = 1;
        ViewExt.c(fragSettingsBinding3.f13192c, new Function1(this) { // from class: com.charging.screenshow.battery.animations.themes.fragment.j

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ SettingsFrag f13273Y;

            {
                this.f13273Y = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit unit = Unit.f43263a;
                SettingsFrag settingsFrag = this.f13273Y;
                View it = (View) obj;
                switch (i3) {
                    case 0:
                        Intrinsics.f(it, "it");
                        if (settingsFrag.requireActivity() instanceof MainAct) {
                            FragmentActivity fragmentActivityRequireActivity = settingsFrag.requireActivity();
                            Intrinsics.d(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.charging.screenshow.battery.animations.themes.activity.MainAct");
                            MainAct mainAct = (MainAct) fragmentActivityRequireActivity;
                            RateDialog rateDialog = new RateDialog(mainAct, new w(mainAct, 0));
                            mainAct.l0 = rateDialog;
                            rateDialog.show();
                        }
                        break;
                    case 1:
                        Intrinsics.f(it, "it");
                        try {
                            if (settingsFrag.getActivity() != null) {
                                Intent intent = new Intent();
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", settingsFrag.getString(R.string.share_text, "http://play.google.com/store/apps/details?id=" + settingsFrag.requireActivity().getPackageName()));
                                settingsFrag.startActivity(intent);
                            }
                        } catch (Exception unused) {
                        }
                        break;
                    default:
                        Intrinsics.f(it, "it");
                        if (settingsFrag.requireActivity() != null) {
                            int i4 = PrivacyAct.j0;
                            FragmentActivity fragmentActivityRequireActivity2 = settingsFrag.requireActivity();
                            Intrinsics.e(fragmentActivityRequireActivity2, "requireActivity(...)");
                            Intent intentA = ActUtils.a(fragmentActivityRequireActivity2, PrivacyAct.class);
                            intentA.putExtra("url", "https://sites.google.com/view/zhikenet-privacy/");
                            fragmentActivityRequireActivity2.startActivity(intentA);
                        }
                        break;
                }
                return unit;
                return unit;
            }
        });
        FragSettingsBinding fragSettingsBinding4 = this.Z;
        if (fragSettingsBinding4 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        final int i4 = 2;
        ViewExt.c(fragSettingsBinding4.f13190a, new Function1(this) { // from class: com.charging.screenshow.battery.animations.themes.fragment.j

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ SettingsFrag f13273Y;

            {
                this.f13273Y = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit unit = Unit.f43263a;
                SettingsFrag settingsFrag = this.f13273Y;
                View it = (View) obj;
                switch (i4) {
                    case 0:
                        Intrinsics.f(it, "it");
                        if (settingsFrag.requireActivity() instanceof MainAct) {
                            FragmentActivity fragmentActivityRequireActivity = settingsFrag.requireActivity();
                            Intrinsics.d(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.charging.screenshow.battery.animations.themes.activity.MainAct");
                            MainAct mainAct = (MainAct) fragmentActivityRequireActivity;
                            RateDialog rateDialog = new RateDialog(mainAct, new w(mainAct, 0));
                            mainAct.l0 = rateDialog;
                            rateDialog.show();
                        }
                        break;
                    case 1:
                        Intrinsics.f(it, "it");
                        try {
                            if (settingsFrag.getActivity() != null) {
                                Intent intent = new Intent();
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", settingsFrag.getString(R.string.share_text, "http://play.google.com/store/apps/details?id=" + settingsFrag.requireActivity().getPackageName()));
                                settingsFrag.startActivity(intent);
                            }
                        } catch (Exception unused) {
                        }
                        break;
                    default:
                        Intrinsics.f(it, "it");
                        if (settingsFrag.requireActivity() != null) {
                            int i5 = PrivacyAct.j0;
                            FragmentActivity fragmentActivityRequireActivity2 = settingsFrag.requireActivity();
                            Intrinsics.e(fragmentActivityRequireActivity2, "requireActivity(...)");
                            Intent intentA = ActUtils.a(fragmentActivityRequireActivity2, PrivacyAct.class);
                            intentA.putExtra("url", "https://sites.google.com/view/zhikenet-privacy/");
                            fragmentActivityRequireActivity2.startActivity(intentA);
                        }
                        break;
                }
                return unit;
                return unit;
            }
        });
    }
}
