package com.codejoy.boom.clap.module.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.codejoy.boom.clap.BoomClapApplication;
import com.codejoy.boom.clap.MainActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.mbridge.msdk.MBridgeConstans;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppReviewDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0003J+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u0003R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/codejoy/boom/clap/module/dialog/AppReviewDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "", "apical", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "Landroid/app/Activity;", "activity", "impromptu", "(Landroid/app/Activity;)V", "triweekly", "Lsonnetize/kowloon;", "kowloon", "Lsonnetize/kowloon;", "binding", "", "arytenoidectomy", "Z", "clickRateUs", "Landroid/os/Handler;", "monoploid", "Landroid/os/Handler;", "mHandler", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppReviewDialog extends DialogFragment {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public boolean clickRateUs;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public sonnetize.kowloon binding;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final Handler mHandler = new Handler(Looper.getMainLooper());

    private final void apical() {
        sonnetize.kowloon kowloonVar = this.binding;
        if (kowloonVar == null) {
            Intrinsics.preprohormone("binding");
            kowloonVar = null;
        }
        kowloonVar.f37875saneness.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.dialog.wireman
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppReviewDialog.formularize(this.f18328kowloon, view);
            }
        });
        sonnetize.kowloon kowloonVar2 = this.binding;
        if (kowloonVar2 == null) {
            Intrinsics.preprohormone("binding");
            kowloonVar2 = null;
        }
        int childCount = kowloonVar2.f37876wireman.getChildCount();
        for (final int i = 0; i < childCount; i++) {
            sonnetize.kowloon kowloonVar3 = this.binding;
            if (kowloonVar3 == null) {
                Intrinsics.preprohormone("binding");
                kowloonVar3 = null;
            }
            kowloonVar3.f37876wireman.getChildAt(i).setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.dialog.marial
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppReviewDialog.impassible(this.f18321kowloon, i, view);
                }
            });
        }
    }

    public static final void cutely(AppReviewDialog appReviewDialog, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.isSuccessful()) {
            appReviewDialog.triweekly();
        } else {
            tau.saneness.f38666attabal.sealless(true);
            appReviewDialog.triweekly();
        }
    }

    public static final void formularize(AppReviewDialog appReviewDialog, View view) {
        Intrinsics.beachfront(view);
        if (vintage.taiyuan.taiyuan(view)) {
            return;
        }
        appReviewDialog.dismissAllowingStateLoss();
    }

    public static final void impassible(AppReviewDialog appReviewDialog, int i, View view) {
        Object objM3351constructorimpl;
        Unit unit;
        appReviewDialog.clickRateUs = true;
        sonnetize.kowloon kowloonVar = appReviewDialog.binding;
        if (kowloonVar == null) {
            Intrinsics.preprohormone("binding");
            kowloonVar = null;
        }
        int childCount = kowloonVar.f37876wireman.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            sonnetize.kowloon kowloonVar2 = appReviewDialog.binding;
            if (kowloonVar2 == null) {
                Intrinsics.preprohormone("binding");
                kowloonVar2 = null;
            }
            View childAt = kowloonVar2.f37876wireman.getChildAt(i2);
            Intrinsics.competently(childAt, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView = (ImageView) childAt;
            if (i2 <= i) {
                imageView.setImageResource(com.codejoy.boom.clap.formularize.boomclap_ic_pop_rate_star_selected);
            } else {
                imageView.setImageResource(com.codejoy.boom.clap.formularize.boomclap_ic_pop_rate_star_default);
            }
            imageView.setClickable(false);
            imageView.setEnabled(false);
            if (i + 1 >= 4) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    FragmentActivity activity = appReviewDialog.getActivity();
                    if (activity != null) {
                        stonecrop.wireman.saneness(stonecrop.wireman.f38163attabal, "6b_click_rate", null, null, null, null, 30, null);
                        appReviewDialog.impromptu(activity);
                        unit = Unit.f29295attabal;
                    } else {
                        unit = null;
                    }
                    objM3351constructorimpl = Result.m3351constructorimpl(unit);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
                }
                Result.m3350boximpl(objM3351constructorimpl);
            } else {
                tau.saneness.f38666attabal.sealless(true);
                appReviewDialog.triweekly();
            }
        }
    }

    public static final void kowloon(AppReviewDialog appReviewDialog) {
        try {
            Result.Companion companion = Result.INSTANCE;
            ToastUtils.molybdenite(BoomClapApplication.INSTANCE.attabal().getString(com.codejoy.boom.clap.arytenoidectomy.app_rate_result_tip), new Object[0]);
            appReviewDialog.dismissAllowingStateLoss();
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
    }

    public static final void taiyuan(final AppReviewDialog appReviewDialog, com.google.android.play.core.review.attabal attabalVar, Activity activity, Task task) {
        Object objM3351constructorimpl;
        Object objM3350boximpl;
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (task.isSuccessful()) {
                try {
                    Task<Void> taskSaneness = attabalVar.saneness(activity, (ReviewInfo) task.getResult());
                    Intrinsics.checkNotNullExpressionValue(taskSaneness, "launchReviewFlow(...)");
                    objM3351constructorimpl = Result.m3351constructorimpl(taskSaneness.addOnCompleteListener(new OnCompleteListener() { // from class: com.codejoy.boom.clap.module.dialog.impromptu
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task task2) {
                            AppReviewDialog.cutely(this.f18318attabal, task2);
                        }
                    }));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
                }
                objM3350boximpl = Result.m3350boximpl(objM3351constructorimpl);
            } else {
                appReviewDialog.triweekly();
                objM3350boximpl = Unit.f29295attabal;
            }
            Result.m3351constructorimpl(objM3350boximpl);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th2));
        }
    }

    public final void impromptu(final Activity activity) {
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        try {
            final com.google.android.play.core.review.attabal attabalVarSaneness = MainActivity.INSTANCE.saneness();
            if (attabalVarSaneness == null) {
                triweekly();
                return;
            }
            Task<ReviewInfo> taskAttabal = attabalVarSaneness.attabal();
            Intrinsics.checkNotNullExpressionValue(taskAttabal, "requestReviewFlow(...)");
            Intrinsics.beachfront(taskAttabal.addOnCompleteListener(new OnCompleteListener() { // from class: com.codejoy.boom.clap.module.dialog.competently
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    AppReviewDialog.taiyuan(this.f18309attabal, attabalVarSaneness, activity, task);
                }
            }));
        } catch (Exception unused) {
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
        sonnetize.kowloon kowloonVarDern = sonnetize.kowloon.dern(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(kowloonVarDern, "inflate(...)");
        this.binding = kowloonVarDern;
        if (kowloonVarDern == null) {
            Intrinsics.preprohormone("binding");
            kowloonVarDern = null;
        }
        ConstraintLayout root = kowloonVarDern.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        if (!this.clickRateUs) {
            stonecrop.wireman.saneness(stonecrop.wireman.f38163attabal, "6c_close_popup", null, null, null, null, 30, null);
        }
        super.onDismiss(dialog);
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
            attributes.height = -2;
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
        stonecrop.wireman.saneness(stonecrop.wireman.f38163attabal, "6a_rate_us_show", null, null, null, null, 30, null);
        apical();
    }

    public final void triweekly() {
        this.mHandler.post(new Runnable() { // from class: com.codejoy.boom.clap.module.dialog.beachfront
            @Override // java.lang.Runnable
            public final void run() {
                AppReviewDialog.kowloon(this.f18308kowloon);
            }
        });
    }
}
