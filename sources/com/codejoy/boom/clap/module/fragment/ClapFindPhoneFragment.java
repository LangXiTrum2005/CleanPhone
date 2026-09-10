package com.codejoy.boom.clap.module.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.gintrap;
import androidx.p001lifecycle.cord;
import com.codejoy.boom.clap.BoomClapApplication;
import com.codejoy.boom.clap.ad.native_templates.TemplateView;
import com.codejoy.boom.clap.data.FunctionMode;
import com.codejoy.boom.clap.module.dialog.PermissionDialog;
import com.codejoy.boom.clap.module.faq.FaqActivity;
import com.codejoy.boom.clap.module.result.ActivateResultActivity;
import com.codejoy.boom.clap.module.vip.VipInfoManager;
import com.codejoy.boom.clap.service.ClapCounterService;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Set;
import kotlinx.coroutines.premeiotic;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.collections.creditor;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ClapFindPhoneFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u0012J\u000f\u0010\u001a\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/codejoy/boom/clap/module/fragment/ClapFindPhoneFragment;", "Lcom/codejoy/boom/clap/module/fragment/PhoneFunctionFragment;", "<init>", "()V", "", "permissivist", "mathsort", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", X3.i.u0, "", "triweekly", "()Z", "kowloon", "", "polloi", "()Ljava/lang/String;", "premeiotic", "lerp", "coffeecake", "dent", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ClapFindPhoneFragment extends PhoneFunctionFragment {

    /* JADX INFO: compiled from: PermissionUtils.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class attabal<O> implements wireman.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ minuteness.marial f18344attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ Fragment f18345dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ String f18346saneness;

        public attabal(minuteness.marial marialVar, String str, Fragment fragment) {
            this.f18344attabal = marialVar;
            this.f18346saneness = str;
            this.f18345dern = fragment;
        }

        public final void attabal(boolean z) {
            if (z) {
                this.f18344attabal.competently().invoke(this.f18346saneness);
                return;
            }
            if (!z && this.f18345dern.shouldShowRequestPermissionRationale(this.f18346saneness)) {
                this.f18344attabal.beachfront().invoke(this.f18346saneness);
            } else {
                if (z || this.f18345dern.shouldShowRequestPermissionRationale(this.f18346saneness)) {
                    return;
                }
                this.f18344attabal.taiyuan().invoke(this.f18346saneness);
            }
        }

        @Override // wireman.attabal
        public /* bridge */ /* synthetic */ void onActivityResult(Object obj) {
            attabal(((Boolean) obj).booleanValue());
        }
    }

    /* JADX INFO: compiled from: ClapFindPhoneFragment.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class dern implements cord, p002kotlin.jvm.internal.apical {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Function1 f18347kowloon;

        public dern(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f18347kowloon = function;
        }

        @Override // androidx.p001lifecycle.cord
        public final /* synthetic */ void attabal(Object obj) {
            this.f18347kowloon.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof cord) && (obj instanceof p002kotlin.jvm.internal.apical)) {
                return Intrinsics.wireman(getFunctionDelegate(), ((p002kotlin.jvm.internal.apical) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p002kotlin.jvm.internal.apical
        public final patroclinal.beachfront<?> getFunctionDelegate() {
            return this.f18347kowloon;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: compiled from: PermissionUtils.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class saneness<O> implements wireman.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ minuteness.marial f18349attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ Fragment f18350dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ String f18351saneness;

        public saneness(minuteness.marial marialVar, String str, Fragment fragment) {
            this.f18349attabal = marialVar;
            this.f18351saneness = str;
            this.f18350dern = fragment;
        }

        public final void attabal(boolean z) {
            if (z) {
                this.f18349attabal.competently().invoke(this.f18351saneness);
                return;
            }
            if (!z && this.f18350dern.shouldShowRequestPermissionRationale(this.f18351saneness)) {
                this.f18349attabal.beachfront().invoke(this.f18351saneness);
            } else {
                if (z || this.f18350dern.shouldShowRequestPermissionRationale(this.f18351saneness)) {
                    return;
                }
                this.f18349attabal.taiyuan().invoke(this.f18351saneness);
            }
        }

        @Override // wireman.attabal
        public /* bridge */ /* synthetic */ void onActivityResult(Object obj) {
            attabal(((Boolean) obj).booleanValue());
        }
    }

    public static final Unit clubfoot(ClapFindPhoneFragment clapFindPhoneFragment, String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        stonecrop.attabal.f38160attabal.saneness();
        if (clapFindPhoneFragment.dent()) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            BoomClapApplication.Companion companion = BoomClapApplication.INSTANCE;
            intent.putExtra("android.provider.extra.APP_PACKAGE", companion.attabal().getPackageName());
            intent.putExtra("android.provider.extra.CHANNEL_ID", companion.attabal().getApplicationInfo().uid);
            clapFindPhoneFragment.startActivity(intent);
        } else {
            com.blankj.utilcode.util.kowloon.saneness();
        }
        return Unit.f29295attabal;
    }

    public static final Unit cultivated(ClapFindPhoneFragment clapFindPhoneFragment, Boolean bool) {
        if (bool.booleanValue()) {
            TemplateView templateView = clapFindPhoneFragment.arytenoidectomy().f38004impromptu;
            Intrinsics.checkNotNullExpressionValue(templateView, "templateView");
            templateView.setVisibility(8);
        }
        return Unit.f29295attabal;
    }

    public static final Unit itchy(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        stonecrop.wireman.saneness(stonecrop.wireman.f38163attabal, "3c_reject", null, null, null, null, 30, null);
        com.blankj.utilcode.util.kowloon.saneness();
        return Unit.f29295attabal;
    }

    private final void mathsort() {
        Set setMarial;
        if (Build.VERSION.SDK_INT < 33) {
            if (igbo.polloi.saneness(BoomClapApplication.INSTANCE.attabal()).attabal() && coffeecake()) {
                lerp();
                return;
            }
            return;
        }
        if (picketboat.saneness.checkSelfPermission(BoomClapApplication.INSTANCE.attabal(), "android.permission.POST_NOTIFICATIONS") == 0) {
            lerp();
            return;
        }
        stonecrop.attabal.f38160attabal.dern();
        if ("android.permission.POST_NOTIFICATIONS".length() == 0) {
            return;
        }
        minuteness.marial marialVar = new minuteness.marial();
        marialVar.triweekly(new Function1() { // from class: com.codejoy.boom.clap.module.fragment.taiyuan
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClapFindPhoneFragment.splinterproof(this.f18377kowloon, (String) obj);
            }
        });
        marialVar.impassible(new Function1() { // from class: com.codejoy.boom.clap.module.fragment.cutely
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClapFindPhoneFragment.overspeculate((String) obj);
            }
        });
        marialVar.kowloon(new Function1() { // from class: com.codejoy.boom.clap.module.fragment.apical
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClapFindPhoneFragment.clubfoot(this.f18363kowloon, (String) obj);
            }
        });
        String[] strArr = requireActivity().getPackageManager().getPackageInfo(nonviolence.attabal.dern(null, 1, null), 4096).requestedPermissions;
        if (strArr == null || (setMarial = p002kotlin.collections.polloi.lampshade(strArr)) == null) {
            setMarial = creditor.marial();
        }
        if (!setMarial.contains("android.permission.POST_NOTIFICATIONS")) {
            marialVar.impromptu().invoke("android.permission.POST_NOTIFICATIONS");
            return;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        minuteness.competently<String, Boolean> competentlyVarAttabal = minuteness.taiyuan.attabal(fragmentActivityRequireActivity);
        if (competentlyVarAttabal != null) {
            competentlyVarAttabal.saneness("android.permission.POST_NOTIFICATIONS", new attabal(marialVar, "android.permission.POST_NOTIFICATIONS", this));
        }
    }

    public static final Unit milliradian(ClapFindPhoneFragment clapFindPhoneFragment, String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        stonecrop.wireman.saneness(stonecrop.wireman.f38163attabal, "3b_allow", null, null, null, null, 30, null);
        clapFindPhoneFragment.mathsort();
        return Unit.f29295attabal;
    }

    public static final void nosophobia(ClapFindPhoneFragment clapFindPhoneFragment, View view) {
        FaqActivity.Companion attabalVar = FaqActivity.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        attabalVar.attabal(context, clapFindPhoneFragment.getFunctionMode());
    }

    public static final Unit overspeculate(String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        stonecrop.attabal.f38160attabal.saneness();
        return Unit.f29295attabal;
    }

    private final void permissivist() {
        kotlinx.coroutines.cutely.wireman(androidx.p001lifecycle.monoploid.attabal(this), premeiotic.dern(), null, new ClapFindPhoneFragment$initData$1(this, null), 2, null);
        VipInfoManager.INSTANCE.attabal().impromptu().competently(getViewLifecycleOwner(), new dern(new Function1() { // from class: com.codejoy.boom.clap.module.fragment.wireman
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClapFindPhoneFragment.cultivated(this.f18379kowloon, (Boolean) obj);
            }
        }));
    }

    public static final Unit splinterproof(ClapFindPhoneFragment clapFindPhoneFragment, String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        stonecrop.attabal.f38160attabal.attabal();
        if (clapFindPhoneFragment.coffeecake()) {
            clapFindPhoneFragment.lerp();
        }
        return Unit.f29295attabal;
    }

    public static final Unit timberyard(final ClapFindPhoneFragment clapFindPhoneFragment, String str, Bundle data) {
        Set setMarial;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(data, "data");
        if (clapFindPhoneFragment.coffeecake()) {
            clapFindPhoneFragment.mathsort();
        } else {
            stonecrop.wireman.saneness(stonecrop.wireman.f38163attabal, "3a_microphone_popup_show", null, null, null, null, 30, null);
            if ("android.permission.RECORD_AUDIO".length() != 0) {
                minuteness.marial marialVar = new minuteness.marial();
                marialVar.triweekly(new Function1() { // from class: com.codejoy.boom.clap.module.fragment.beachfront
                    @Override // p002kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ClapFindPhoneFragment.milliradian(this.f18366kowloon, (String) obj);
                    }
                });
                marialVar.impassible(new Function1() { // from class: com.codejoy.boom.clap.module.fragment.competently
                    @Override // p002kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ClapFindPhoneFragment.treadless((String) obj);
                    }
                });
                marialVar.kowloon(new Function1() { // from class: com.codejoy.boom.clap.module.fragment.impromptu
                    @Override // p002kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ClapFindPhoneFragment.itchy((String) obj);
                    }
                });
                String[] strArr = clapFindPhoneFragment.requireActivity().getPackageManager().getPackageInfo(nonviolence.attabal.dern(null, 1, null), 4096).requestedPermissions;
                if (strArr == null || (setMarial = p002kotlin.collections.polloi.lampshade(strArr)) == null) {
                    setMarial = creditor.marial();
                }
                if (setMarial.contains("android.permission.RECORD_AUDIO")) {
                    FragmentActivity fragmentActivityRequireActivity = clapFindPhoneFragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    minuteness.competently<String, Boolean> competentlyVarAttabal = minuteness.taiyuan.attabal(fragmentActivityRequireActivity);
                    if (competentlyVarAttabal != null) {
                        competentlyVarAttabal.saneness("android.permission.RECORD_AUDIO", new saneness(marialVar, "android.permission.RECORD_AUDIO", clapFindPhoneFragment));
                    }
                } else {
                    marialVar.impromptu().invoke("android.permission.RECORD_AUDIO");
                }
            }
        }
        return Unit.f29295attabal;
    }

    public static final Unit treadless(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        stonecrop.wireman.saneness(stonecrop.wireman.f38163attabal, "3c_reject", null, null, null, null, 30, null);
        return Unit.f29295attabal;
    }

    public final boolean coffeecake() {
        return picketboat.saneness.checkSelfPermission(BoomClapApplication.INSTANCE.attabal(), "android.permission.RECORD_AUDIO") == 0;
    }

    public final boolean dent() {
        try {
            Result.Companion companion = Result.INSTANCE;
            Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            BoomClapApplication.Companion companion2 = BoomClapApplication.INSTANCE;
            intent.putExtra("android.provider.extra.APP_PACKAGE", companion2.attabal().getPackageName());
            return companion2.attabal().getPackageManager().resolveActivity(intent, 65536) != null;
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            return false;
        }
    }

    @Override // com.codejoy.boom.clap.module.fragment.PhoneFunctionFragment
    public boolean kowloon() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ActivateResultActivity.INSTANCE.attabal(activity, false, "", FunctionMode.MODE_CLAP_FIND_PHONE);
        }
        stonecrop.wireman.saneness(stonecrop.wireman.f38163attabal, "4d_deactivate_clap", null, null, null, null, 30, null);
        return true;
    }

    public final void lerp() {
        try {
            Result.Companion companion = Result.INSTANCE;
            Fragment fragmentCzestochowa = getChildFragmentManager().czestochowa("permissionDialog");
            Unit unit = null;
            PermissionDialog permissionDialog = fragmentCzestochowa instanceof PermissionDialog ? (PermissionDialog) fragmentCzestochowa : null;
            if (permissionDialog != null) {
                permissionDialog.dismissAllowingStateLoss();
                unit = Unit.f29295attabal;
            }
            Result.m3351constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        arytenoidectomy().f38007wireman.enterActivatedAfterPermissionGrant();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ActivateResultActivity.INSTANCE.attabal(activity, true, "", FunctionMode.MODE_CLAP_FIND_PHONE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        yemenite(FunctionMode.MODE_CLAP_FIND_PHONE);
        super.onCreate(savedInstanceState);
    }

    @Override // com.codejoy.boom.clap.module.fragment.PhoneFunctionFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        try {
            Result.Companion companion = Result.INSTANCE;
            if (igbo.polloi.saneness(BoomClapApplication.INSTANCE.attabal()).attabal() && coffeecake()) {
                Fragment fragmentCzestochowa = getChildFragmentManager().czestochowa("permissionDialog");
                PermissionDialog permissionDialog = fragmentCzestochowa instanceof PermissionDialog ? (PermissionDialog) fragmentCzestochowa : null;
                if (permissionDialog != null) {
                    permissionDialog.dismissAllowingStateLoss();
                }
            }
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
    }

    @Override // com.codejoy.boom.clap.module.fragment.PhoneFunctionFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        permissivist();
        arytenoidectomy().f38006saneness.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.fragment.dern
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ClapFindPhoneFragment.nosophobia(this.f18367kowloon, view2);
            }
        });
    }

    @Override // com.codejoy.boom.clap.module.fragment.PhoneFunctionFragment
    public String polloi() {
        return "ad_scenes_find_phone";
    }

    public final void premeiotic() {
        if (igbo.polloi.saneness(BoomClapApplication.INSTANCE.attabal()).attabal() && coffeecake()) {
            lerp();
            return;
        }
        PermissionDialog permissionDialogAttabal = PermissionDialog.INSTANCE.attabal();
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        vintage.saneness.saneness(permissionDialogAttabal, childFragmentManager, "permissionDialog");
        gintrap.dern(permissionDialogAttabal, "permission_dialog_request_key", new Function2() { // from class: com.codejoy.boom.clap.module.fragment.marial
            @Override // p002kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ClapFindPhoneFragment.timberyard(this.f18373kowloon, (String) obj, (Bundle) obj2);
            }
        });
    }

    @Override // com.codejoy.boom.clap.module.fragment.PhoneFunctionFragment
    public boolean triweekly() {
        stonecrop.wireman.saneness(stonecrop.wireman.f38163attabal, "4a_activate_clap", null, null, null, null, 30, null);
        if (!ClapCounterService.INSTANCE.attabal().getValue().booleanValue()) {
            premeiotic();
            return false;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ActivateResultActivity.INSTANCE.attabal(activity, true, "", FunctionMode.MODE_CLAP_FIND_PHONE);
        }
        return true;
    }
}
