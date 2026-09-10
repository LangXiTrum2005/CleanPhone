package com.codejoy.boom.clap.module.guide.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.codejoy.boom.clap.ad.native_templates.TemplateView;
import com.codejoy.boom.clap.module.base.BaseFragment;
import com.codejoy.boom.clap.module.guide.fragment.Guide2Fragment;
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
import sonnetize.cuirassed;

/* JADX INFO: compiled from: Guide2Fragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J-\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0003R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/codejoy/boom/clap/module/guide/fragment/Guide2Fragment;", "Lcom/codejoy/boom/clap/module/base/BaseFragment;", "<init>", "()V", "", "wireman", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", X3.i.u0, "Lsonnetize/cuirassed;", "kowloon", "Lsonnetize/cuirassed;", "binding", "", "arytenoidectomy", "Z", "loadNativeAd", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Guide2Fragment extends BaseFragment {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public boolean loadNativeAd;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public cuirassed binding;

    public static final Unit marial(Guide2Fragment guide2Fragment, NativeAd it) {
        Intrinsics.checkNotNullParameter(it, "it");
        beachfront.wireman(beachfront.f24107attabal, it, "ad_scenes_guide_page2", null, 4, null);
        saneness sanenessVarAttabal = new saneness.attabal().attabal();
        cuirassed cuirassedVar = guide2Fragment.binding;
        cuirassed cuirassedVar2 = null;
        if (cuirassedVar == null) {
            Intrinsics.preprohormone("binding");
            cuirassedVar = null;
        }
        cuirassedVar.f37765dern.setStyles(sanenessVarAttabal);
        cuirassed cuirassedVar3 = guide2Fragment.binding;
        if (cuirassedVar3 == null) {
            Intrinsics.preprohormone("binding");
            cuirassedVar3 = null;
        }
        cuirassedVar3.f37765dern.destroyNativeAdIfNeed();
        cuirassed cuirassedVar4 = guide2Fragment.binding;
        if (cuirassedVar4 == null) {
            Intrinsics.preprohormone("binding");
        } else {
            cuirassedVar2 = cuirassedVar4;
        }
        cuirassedVar2.f37765dern.setNativeAd(it);
        return Unit.f29295attabal;
    }

    private final void wireman() {
        if (this.loadNativeAd) {
            return;
        }
        this.loadNativeAd = true;
        cuirassed cuirassedVar = this.binding;
        cuirassed cuirassedVar2 = null;
        if (cuirassedVar == null) {
            Intrinsics.preprohormone("binding");
            cuirassedVar = null;
        }
        TemplateView templateView = cuirassedVar.f37765dern;
        Intrinsics.checkNotNullExpressionValue(templateView, "templateView");
        templateView.setVisibility(0);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            attabal attabalVarMarial = beachfront.f24107attabal.marial();
            cuirassed cuirassedVar3 = this.binding;
            if (cuirassedVar3 == null) {
                Intrinsics.preprohormone("binding");
            } else {
                cuirassedVar2 = cuirassedVar3;
            }
            attabalVarMarial.sealless(activity, "ad_scenes_guide_page2", this, cuirassedVar2.f37765dern, new Function1() { // from class: emodin.saneness
                @Override // p002kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Guide2Fragment.marial(this.f25650kowloon, (NativeAd) obj);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        cuirassed cuirassedVarDern = cuirassed.dern(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(cuirassedVarDern, "inflate(...)");
        this.binding = cuirassedVarDern;
        if (cuirassedVarDern == null) {
            Intrinsics.preprohormone("binding");
            cuirassedVarDern = null;
        }
        return cuirassedVarDern.getRoot();
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
