package com.codejoy.boom.clap.module.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.p001lifecycle.cord;
import com.codejoy.boom.clap.ad.native_templates.TemplateView;
import com.codejoy.boom.clap.data.FunctionMode;
import com.codejoy.boom.clap.module.faq.FaqActivity;
import com.codejoy.boom.clap.module.result.ActivateResultActivity;
import com.codejoy.boom.clap.module.vip.VipInfoManager;
import com.mbridge.msdk.MBridgeConstans;
import kotlinx.coroutines.premeiotic;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NoTouchFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/codejoy/boom/clap/module/fragment/NoTouchFragment;", "Lcom/codejoy/boom/clap/module/fragment/PhoneFunctionFragment;", "<init>", "()V", "", "saran", "starveling", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "triweekly", "()Z", "kowloon", "", "polloi", "()Ljava/lang/String;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NoTouchFragment extends PhoneFunctionFragment {

    /* JADX INFO: compiled from: NoTouchFragment.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class attabal implements cord, p002kotlin.jvm.internal.apical {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Function1 f18352kowloon;

        public attabal(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f18352kowloon = function;
        }

        @Override // androidx.p001lifecycle.cord
        public final /* synthetic */ void attabal(Object obj) {
            this.f18352kowloon.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof cord) && (obj instanceof p002kotlin.jvm.internal.apical)) {
                return Intrinsics.wireman(getFunctionDelegate(), ((p002kotlin.jvm.internal.apical) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p002kotlin.jvm.internal.apical
        public final patroclinal.beachfront<?> getFunctionDelegate() {
            return this.f18352kowloon;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static final void creditor(NoTouchFragment noTouchFragment, View view) {
        FaqActivity.Companion attabalVar = FaqActivity.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        attabalVar.attabal(context, noTouchFragment.getFunctionMode());
    }

    public static final Unit privatdozent(NoTouchFragment noTouchFragment, Boolean bool) {
        if (bool.booleanValue()) {
            TemplateView templateView = noTouchFragment.arytenoidectomy().f38004impromptu;
            Intrinsics.checkNotNullExpressionValue(templateView, "templateView");
            templateView.setVisibility(8);
        }
        return Unit.f29295attabal;
    }

    private final void saran() {
        kotlinx.coroutines.cutely.wireman(androidx.p001lifecycle.monoploid.attabal(this), premeiotic.dern(), null, new NoTouchFragment$initData$1(this, null), 2, null);
        VipInfoManager.INSTANCE.attabal().impromptu().competently(getViewLifecycleOwner(), new attabal(new Function1() { // from class: com.codejoy.boom.clap.module.fragment.impassible
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NoTouchFragment.privatdozent(this.f18370kowloon, (Boolean) obj);
            }
        }));
    }

    private final void starveling() {
        arytenoidectomy().f38007wireman.enterActivatedAfterPermissionGrant();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ActivateResultActivity.INSTANCE.attabal(activity, true, "", getFunctionMode());
        }
    }

    @Override // com.codejoy.boom.clap.module.fragment.PhoneFunctionFragment
    public boolean kowloon() {
        stonecrop.wireman.saneness(stonecrop.wireman.f38163attabal, "8d_deactivate_not_touch", null, null, null, null, 30, null);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return true;
        }
        ActivateResultActivity.INSTANCE.attabal(activity, false, "", getFunctionMode());
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        yemenite(FunctionMode.MODE_NOT_TOUCH_PHONE);
        super.onCreate(savedInstanceState);
    }

    @Override // com.codejoy.boom.clap.module.fragment.PhoneFunctionFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        saran();
        arytenoidectomy().f38006saneness.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.fragment.formularize
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                NoTouchFragment.creditor(this.f18368kowloon, view2);
            }
        });
    }

    @Override // com.codejoy.boom.clap.module.fragment.PhoneFunctionFragment
    public String polloi() {
        return "ad_scenes_not_touch_phone";
    }

    @Override // com.codejoy.boom.clap.module.fragment.PhoneFunctionFragment
    public boolean triweekly() {
        stonecrop.wireman.saneness(stonecrop.wireman.f38163attabal, "8a_activate_not_touch_phone", null, null, null, null, 30, null);
        starveling();
        return true;
    }
}
