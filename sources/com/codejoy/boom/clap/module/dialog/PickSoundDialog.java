package com.codejoy.boom.clap.module.dialog;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.codejoy.boom.clap.data.SoundData;
import com.codejoy.boom.clap.module.vip.VipActivity;
import com.codejoy.boom.clap.module.vip.VipEntranceSource;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.mbridge.msdk.MBridgeConstans;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PickSoundDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0003J-\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R$\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010%¨\u0006&"}, d2 = {"Lcom/codejoy/boom/clap/module/dialog/PickSoundDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "", "apical", "cutely", "kowloon", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lkotlin/Function1;", "Lcom/codejoy/boom/clap/data/SoundData;", "callback", "monoploid", "(Lkotlin/jvm/functions/Function1;)V", "Lhoiden/beachfront;", "Lpatroclinal/taiyuan;", "taiyuan", "()Lhoiden/beachfront;", "soundListAdapter", "Lsonnetize/molybdenite;", "arytenoidectomy", "Lsonnetize/molybdenite;", "binding", "Lkotlin/jvm/functions/Function1;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PickSoundDialog extends DialogFragment {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public sonnetize.molybdenite binding;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan soundListAdapter = p002kotlin.saneness.saneness(new Function0() { // from class: com.codejoy.boom.clap.module.dialog.adultoid
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PickSoundDialog.polloi();
        }
    });

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public Function1<? super SoundData, Unit> callback;

    /* JADX INFO: compiled from: PickSoundDialog.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/codejoy/boom/clap/module/dialog/PickSoundDialog$attabal", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal extends RecyclerView.OnScrollListener {
        public attabal() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, dx, dy);
            sonnetize.molybdenite molybdeniteVar = PickSoundDialog.this.binding;
            sonnetize.molybdenite molybdeniteVar2 = null;
            if (molybdeniteVar == null) {
                Intrinsics.preprohormone("binding");
                molybdeniteVar = null;
            }
            View shadowView = molybdeniteVar.f37892marial;
            Intrinsics.checkNotNullExpressionValue(shadowView, "shadowView");
            sonnetize.molybdenite molybdeniteVar3 = PickSoundDialog.this.binding;
            if (molybdeniteVar3 == null) {
                Intrinsics.preprohormone("binding");
            } else {
                molybdeniteVar2 = molybdeniteVar3;
            }
            shadowView.setVisibility(molybdeniteVar2.f37894wireman.canScrollVertically(-1) ? 0 : 8);
        }
    }

    private final void apical() {
        sonnetize.molybdenite molybdeniteVar = this.binding;
        sonnetize.molybdenite molybdeniteVar2 = null;
        if (molybdeniteVar == null) {
            Intrinsics.preprohormone("binding");
            molybdeniteVar = null;
        }
        molybdeniteVar.f37893saneness.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.dialog.monoploid
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PickSoundDialog.formularize(this.f18323kowloon, view);
            }
        });
        sonnetize.molybdenite molybdeniteVar3 = this.binding;
        if (molybdeniteVar3 == null) {
            Intrinsics.preprohormone("binding");
            molybdeniteVar3 = null;
        }
        molybdeniteVar3.f37894wireman.addOnScrollListener(new attabal());
        sonnetize.molybdenite molybdeniteVar4 = this.binding;
        if (molybdeniteVar4 == null) {
            Intrinsics.preprohormone("binding");
            molybdeniteVar4 = null;
        }
        molybdeniteVar4.f37894wireman.setItemAnimator(null);
        sonnetize.molybdenite molybdeniteVar5 = this.binding;
        if (molybdeniteVar5 == null) {
            Intrinsics.preprohormone("binding");
            molybdeniteVar5 = null;
        }
        molybdeniteVar5.f37894wireman.addItemDecoration(new leh.marial(3, (int) ((12 * Resources.getSystem().getDisplayMetrics().density) + 0.5f), (int) ((9 * Resources.getSystem().getDisplayMetrics().density) + 0.5f), false, null, 24, null));
        hoiden.beachfront beachfrontVarTaiyuan = taiyuan();
        tau.saneness sanenessVar = tau.saneness.f38666attabal;
        beachfrontVarTaiyuan.cutely(sanenessVar.triweekly());
        taiyuan().taiyuan(unbalanced.attabal.f39224attabal.saneness(), sanenessVar.impassible());
        taiyuan().impromptu(new Function1() { // from class: com.codejoy.boom.clap.module.dialog.polloi
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PickSoundDialog.impassible(this.f18324kowloon, (SoundData) obj);
            }
        });
        taiyuan().competently(new Function1() { // from class: com.codejoy.boom.clap.module.dialog.molybdenite
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PickSoundDialog.triweekly(this.f18322kowloon, (SoundData) obj);
            }
        });
        sonnetize.molybdenite molybdeniteVar6 = this.binding;
        if (molybdeniteVar6 == null) {
            Intrinsics.preprohormone("binding");
        } else {
            molybdeniteVar2 = molybdeniteVar6;
        }
        molybdeniteVar2.f37894wireman.setAdapter(taiyuan());
    }

    public static final Unit arytenoidectomy(PickSoundDialog pickSoundDialog, NativeAd it) {
        Intrinsics.checkNotNullParameter(it, "it");
        orometer.saneness sanenessVarAttabal = new orometer.saneness.attabal().attabal();
        sonnetize.molybdenite molybdeniteVar = pickSoundDialog.binding;
        sonnetize.molybdenite molybdeniteVar2 = null;
        if (molybdeniteVar == null) {
            Intrinsics.preprohormone("binding");
            molybdeniteVar = null;
        }
        molybdeniteVar.f37889beachfront.setStyles(sanenessVarAttabal);
        sonnetize.molybdenite molybdeniteVar3 = pickSoundDialog.binding;
        if (molybdeniteVar3 == null) {
            Intrinsics.preprohormone("binding");
            molybdeniteVar3 = null;
        }
        molybdeniteVar3.f37889beachfront.destroyNativeAdIfNeed();
        sonnetize.molybdenite molybdeniteVar4 = pickSoundDialog.binding;
        if (molybdeniteVar4 == null) {
            Intrinsics.preprohormone("binding");
        } else {
            molybdeniteVar2 = molybdeniteVar4;
        }
        molybdeniteVar2.f37889beachfront.setNativeAd(it);
        return Unit.f29295attabal;
    }

    public static final void formularize(PickSoundDialog pickSoundDialog, View view) {
        pickSoundDialog.dismissAllowingStateLoss();
    }

    public static final Unit impassible(PickSoundDialog pickSoundDialog, SoundData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentActivity activity = pickSoundDialog.getActivity();
        if (activity != null) {
            VipActivity.INSTANCE.attabal(activity, VipEntranceSource.UNLOCK_VIP_SOUND);
        }
        return Unit.f29295attabal;
    }

    private final void kowloon() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            com.yoadx.ad.lib.admob.format.natived.attabal attabalVarMarial = couple.beachfront.f24107attabal.marial();
            sonnetize.molybdenite molybdeniteVar = this.binding;
            if (molybdeniteVar == null) {
                Intrinsics.preprohormone("binding");
                molybdeniteVar = null;
            }
            attabalVarMarial.sealless(activity, "ad_scenes_sound_set_page", this, molybdeniteVar.f37889beachfront, new Function1() { // from class: com.codejoy.boom.clap.module.dialog.graveside
                @Override // p002kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PickSoundDialog.arytenoidectomy(this.f18316kowloon, (NativeAd) obj);
                }
            });
        }
    }

    public static final hoiden.beachfront polloi() {
        return new hoiden.beachfront();
    }

    public static final Unit triweekly(PickSoundDialog pickSoundDialog, SoundData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<? super SoundData, Unit> function1 = pickSoundDialog.callback;
        if (function1 != null) {
            function1.invoke(it);
        }
        pickSoundDialog.dismissAllowingStateLoss();
        return Unit.f29295attabal;
    }

    public final void monoploid(Function1<? super SoundData, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, com.codejoy.boom.clap.monoploid.Theme_Dialog_Dark);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        sonnetize.molybdenite molybdeniteVarDern = sonnetize.molybdenite.dern(getLayoutInflater(), container, false);
        Intrinsics.checkNotNullExpressionValue(molybdeniteVarDern, "inflate(...)");
        this.binding = molybdeniteVarDern;
        if (molybdeniteVarDern == null) {
            Intrinsics.preprohormone("binding");
            molybdeniteVarDern = null;
        }
        return molybdeniteVarDern.getRoot();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        Window window = dialog != null ? dialog.getWindow() : null;
        if (window != null) {
            window.setStatusBarColor(0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
            window.setGravity(80);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        kowloon();
        apical();
        cutely();
    }

    public final hoiden.beachfront taiyuan() {
        return (hoiden.beachfront) this.soundListAdapter.getValue();
    }

    private final void cutely() {
    }
}
