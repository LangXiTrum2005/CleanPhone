package com.codejoy.boom.clap.module.guide.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.codejoy.boom.clap.ad.native_templates.TemplateView;
import com.codejoy.boom.clap.module.base.BaseFragment;
import com.codejoy.boom.clap.module.guide.fragment.Guide3Fragment;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.yoadx.ad.lib.admob.format.natived.attabal;
import couple.beachfront;
import orometer.saneness;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import sonnetize.stratoscope;

/* JADX INFO: compiled from: Guide3Fragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J-\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0003R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/codejoy/boom/clap/module/guide/fragment/Guide3Fragment;", "Lcom/codejoy/boom/clap/module/base/BaseFragment;", "<init>", "()V", "", "wireman", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", X3.i.u0, "Lsonnetize/stratoscope;", "kowloon", "Lsonnetize/stratoscope;", "binding", "", "arytenoidectomy", "Z", "loadNativeAd", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Guide3Fragment extends BaseFragment {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public boolean loadNativeAd;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public stratoscope binding;

    public static final Unit marial(Guide3Fragment guide3Fragment, NativeAd it) {
        Intrinsics.checkNotNullParameter(it, "it");
        beachfront.wireman(beachfront.f24107attabal, it, "ad_scenes_guide_page3", null, 4, null);
        saneness sanenessVarAttabal = new saneness.attabal().attabal();
        stratoscope stratoscopeVar = guide3Fragment.binding;
        stratoscope stratoscopeVar2 = null;
        if (stratoscopeVar == null) {
            Intrinsics.preprohormone("binding");
            stratoscopeVar = null;
        }
        stratoscopeVar.f37974dern.setStyles(sanenessVarAttabal);
        stratoscope stratoscopeVar3 = guide3Fragment.binding;
        if (stratoscopeVar3 == null) {
            Intrinsics.preprohormone("binding");
            stratoscopeVar3 = null;
        }
        stratoscopeVar3.f37974dern.destroyNativeAdIfNeed();
        stratoscope stratoscopeVar4 = guide3Fragment.binding;
        if (stratoscopeVar4 == null) {
            Intrinsics.preprohormone("binding");
        } else {
            stratoscopeVar2 = stratoscopeVar4;
        }
        stratoscopeVar2.f37974dern.setNativeAd(it);
        return Unit.f29295attabal;
    }

    private final void wireman() {
        if (this.loadNativeAd) {
            return;
        }
        this.loadNativeAd = true;
        stratoscope stratoscopeVar = this.binding;
        stratoscope stratoscopeVar2 = null;
        if (stratoscopeVar == null) {
            Intrinsics.preprohormone("binding");
            stratoscopeVar = null;
        }
        TemplateView templateView = stratoscopeVar.f37974dern;
        Intrinsics.checkNotNullExpressionValue(templateView, "templateView");
        templateView.setVisibility(0);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            attabal attabalVarMarial = beachfront.f24107attabal.marial();
            stratoscope stratoscopeVar3 = this.binding;
            if (stratoscopeVar3 == null) {
                Intrinsics.preprohormone("binding");
            } else {
                stratoscopeVar2 = stratoscopeVar3;
            }
            attabalVarMarial.sealless(activity, "ad_scenes_guide_page3", this, stratoscopeVar2.f37974dern, new Function1() { // from class: emodin.dern
                @Override // p002kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Guide3Fragment.marial(this.f25649kowloon, (NativeAd) obj);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        stratoscope stratoscopeVarDern = stratoscope.dern(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(stratoscopeVarDern, "inflate(...)");
        this.binding = stratoscopeVarDern;
        if (stratoscopeVarDern == null) {
            Intrinsics.preprohormone("binding");
            stratoscopeVarDern = null;
        }
        return stratoscopeVarDern.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        wireman();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
    }
}
