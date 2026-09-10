package com.codejoy.boom.clap.module.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.gintrap;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.mbridge.msdk.MBridgeConstans;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppExistDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0003J-\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0003R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/codejoy/boom/clap/module/dialog/AppExistDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "", "beachfront", "taiyuan", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lsonnetize/triweekly;", "kowloon", "Lsonnetize/triweekly;", "binding", "arytenoidectomy", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppExistDialog extends DialogFragment {

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final int f18282monoploid = 8;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public sonnetize.triweekly binding;

    private final void beachfront() {
        sonnetize.triweekly triweeklyVar = this.binding;
        sonnetize.triweekly triweeklyVar2 = null;
        if (triweeklyVar == null) {
            Intrinsics.preprohormone("binding");
            triweeklyVar = null;
        }
        triweeklyVar.f37998saneness.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.dialog.attabal
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppExistDialog.competently(this.f18307kowloon, view);
            }
        });
        sonnetize.triweekly triweeklyVar3 = this.binding;
        if (triweeklyVar3 == null) {
            Intrinsics.preprohormone("binding");
        } else {
            triweeklyVar2 = triweeklyVar3;
        }
        triweeklyVar2.f37996dern.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.dialog.saneness
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppExistDialog.impromptu(this.f18325kowloon, view);
            }
        });
    }

    public static final void competently(AppExistDialog appExistDialog, View view) {
        appExistDialog.dismissAllowingStateLoss();
    }

    public static final Unit cutely(AppExistDialog appExistDialog, NativeAd nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        try {
            Result.Companion companion = Result.INSTANCE;
            orometer.saneness sanenessVarAttabal = new orometer.saneness.attabal().attabal();
            sonnetize.triweekly triweeklyVar = appExistDialog.binding;
            sonnetize.triweekly triweeklyVar2 = null;
            if (triweeklyVar == null) {
                Intrinsics.preprohormone("binding");
                triweeklyVar = null;
            }
            triweeklyVar.f37997marial.setStyles(sanenessVarAttabal);
            sonnetize.triweekly triweeklyVar3 = appExistDialog.binding;
            if (triweeklyVar3 == null) {
                Intrinsics.preprohormone("binding");
                triweeklyVar3 = null;
            }
            triweeklyVar3.f37997marial.destroyNativeAdIfNeed();
            sonnetize.triweekly triweeklyVar4 = appExistDialog.binding;
            if (triweeklyVar4 == null) {
                Intrinsics.preprohormone("binding");
            } else {
                triweeklyVar2 = triweeklyVar4;
            }
            triweeklyVar2.f37997marial.setNativeAd(nativeAd);
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        return Unit.f29295attabal;
    }

    public static final void impromptu(AppExistDialog appExistDialog, View view) {
        gintrap.saneness(appExistDialog, "exit_dialog", claque.wireman.attabal(patroclinal.formularize.attabal("exit", Boolean.TRUE)));
        appExistDialog.dismissAllowingStateLoss();
    }

    private final void taiyuan() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            com.yoadx.ad.lib.admob.format.natived.attabal attabalVarMarial = couple.beachfront.f24107attabal.marial();
            sonnetize.triweekly triweeklyVar = this.binding;
            if (triweeklyVar == null) {
                Intrinsics.preprohormone("binding");
                triweeklyVar = null;
            }
            attabalVarMarial.sealless(activity, "ad_scenes_exit_app_pop", this, triweeklyVar.f37997marial, new Function1() { // from class: com.codejoy.boom.clap.module.dialog.dern
                @Override // p002kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AppExistDialog.cutely(this.f18313kowloon, (NativeAd) obj);
                }
            });
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, com.codejoy.boom.clap.monoploid.Theme_Dialog_Dark);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        sonnetize.triweekly triweeklyVarDern = sonnetize.triweekly.dern(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(triweeklyVarDern, "inflate(...)");
        this.binding = triweeklyVarDern;
        if (triweeklyVarDern == null) {
            Intrinsics.preprohormone("binding");
            triweeklyVarDern = null;
        }
        return triweeklyVarDern.getRoot();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        sonnetize.triweekly triweeklyVar = this.binding;
        sonnetize.triweekly triweeklyVar2 = null;
        if (triweeklyVar == null) {
            Intrinsics.preprohormone("binding");
            triweeklyVar = null;
        }
        triweeklyVar.f37997marial.destroyNativeAdIfNeed();
        sonnetize.triweekly triweeklyVar3 = this.binding;
        if (triweeklyVar3 == null) {
            Intrinsics.preprohormone("binding");
        } else {
            triweeklyVar2 = triweeklyVar3;
        }
        triweeklyVar2.f37997marial.removeAllViews();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        Window window = dialog != null ? dialog.getWindow() : null;
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setGravity(80);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        taiyuan();
        beachfront();
    }
}
