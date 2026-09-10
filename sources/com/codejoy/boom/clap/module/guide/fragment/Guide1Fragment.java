package com.codejoy.boom.clap.module.guide.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.codejoy.boom.clap.ad.native_templates.TemplateView;
import com.codejoy.boom.clap.module.base.BaseFragment;
import com.codejoy.boom.clap.module.guide.fragment.Guide1Fragment;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.mbridge.msdk.MBridgeConstans;
import com.yoadx.ad.lib.admob.format.natived.attabal;
import couple.beachfront;
import orometer.saneness;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import sonnetize.cord;

/* JADX INFO: compiled from: Guide1Fragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J-\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/codejoy/boom/clap/module/guide/fragment/Guide1Fragment;", "Lcom/codejoy/boom/clap/module/base/BaseFragment;", "<init>", "()V", "", "wireman", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lsonnetize/cord;", "kowloon", "Lsonnetize/cord;", "binding", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Guide1Fragment extends BaseFragment {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public cord binding;

    public static final Unit marial(Guide1Fragment guide1Fragment, NativeAd it) {
        Intrinsics.checkNotNullParameter(it, "it");
        beachfront.wireman(beachfront.f24107attabal, it, "ad_scenes_guide_page1", null, 4, null);
        saneness sanenessVarAttabal = new saneness.attabal().attabal();
        cord cordVar = guide1Fragment.binding;
        cord cordVar2 = null;
        if (cordVar == null) {
            Intrinsics.preprohormone("binding");
            cordVar = null;
        }
        cordVar.f37762dern.setStyles(sanenessVarAttabal);
        cord cordVar3 = guide1Fragment.binding;
        if (cordVar3 == null) {
            Intrinsics.preprohormone("binding");
            cordVar3 = null;
        }
        cordVar3.f37762dern.destroyNativeAdIfNeed();
        cord cordVar4 = guide1Fragment.binding;
        if (cordVar4 == null) {
            Intrinsics.preprohormone("binding");
        } else {
            cordVar2 = cordVar4;
        }
        cordVar2.f37762dern.setNativeAd(it);
        return Unit.f29295attabal;
    }

    private final void wireman() {
        cord cordVar = this.binding;
        cord cordVar2 = null;
        if (cordVar == null) {
            Intrinsics.preprohormone("binding");
            cordVar = null;
        }
        TemplateView templateView = cordVar.f37762dern;
        Intrinsics.checkNotNullExpressionValue(templateView, "templateView");
        templateView.setVisibility(0);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            attabal attabalVarMarial = beachfront.f24107attabal.marial();
            cord cordVar3 = this.binding;
            if (cordVar3 == null) {
                Intrinsics.preprohormone("binding");
            } else {
                cordVar2 = cordVar3;
            }
            attabalVarMarial.sealless(activity, "ad_scenes_guide_page1", this, cordVar2.f37762dern, new Function1() { // from class: emodin.attabal
                @Override // p002kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Guide1Fragment.marial(this.f25648kowloon, (NativeAd) obj);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        cord cordVarDern = cord.dern(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(cordVarDern, "inflate(...)");
        this.binding = cordVarDern;
        if (cordVarDern == null) {
            Intrinsics.preprohormone("binding");
            cordVarDern = null;
        }
        return cordVarDern.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        wireman();
    }
}
