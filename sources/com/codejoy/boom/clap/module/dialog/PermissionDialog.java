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
import androidx.fragment.app.gintrap;
import com.codejoy.boom.clap.widget.ParkinsansFontText;
import com.mbridge.msdk.MBridgeConstans;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PermissionDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0003J-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/codejoy/boom/clap/module/dialog/PermissionDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "", "wireman", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lsonnetize/polloi;", "kowloon", "Lsonnetize/polloi;", "binding", "arytenoidectomy", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PermissionDialog extends DialogFragment {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final int f18298monoploid = 8;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public sonnetize.polloi binding;

    /* JADX INFO: renamed from: com.codejoy.boom.clap.module.dialog.PermissionDialog$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: PermissionDialog.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/codejoy/boom/clap/module/dialog/PermissionDialog$attabal;", "", "<init>", "()V", "Lcom/codejoy/boom/clap/module/dialog/PermissionDialog;", "attabal", "()Lcom/codejoy/boom/clap/module/dialog/PermissionDialog;", "", "REQUEST_KEY", "Ljava/lang/String;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PermissionDialog attabal() {
            return new PermissionDialog();
        }

        public Companion() {
        }
    }

    public static final void marial(PermissionDialog permissionDialog, View view) {
        Intrinsics.beachfront(view);
        if (vintage.taiyuan.taiyuan(view)) {
            return;
        }
        gintrap.saneness(permissionDialog, "permission_dialog_request_key", claque.wireman.attabal(patroclinal.formularize.attabal("continue", Boolean.TRUE)));
        permissionDialog.dismissAllowingStateLoss();
    }

    private final void wireman() {
        sonnetize.polloi polloiVar = this.binding;
        sonnetize.polloi polloiVar2 = null;
        if (polloiVar == null) {
            Intrinsics.preprohormone("binding");
            polloiVar = null;
        }
        ParkinsansFontText continueButton = polloiVar.f37927wireman;
        Intrinsics.checkNotNullExpressionValue(continueButton, "continueButton");
        vintage.taiyuan.competently(continueButton);
        sonnetize.polloi polloiVar3 = this.binding;
        if (polloiVar3 == null) {
            Intrinsics.preprohormone("binding");
        } else {
            polloiVar2 = polloiVar3;
        }
        polloiVar2.f37927wireman.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.dialog.arytenoidectomy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PermissionDialog.marial(this.f18306kowloon, view);
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, com.codejoy.boom.clap.monoploid.Theme_Dialog_Dark);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        sonnetize.polloi polloiVarDern = sonnetize.polloi.dern(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(polloiVarDern, "inflate(...)");
        this.binding = polloiVarDern;
        if (polloiVarDern == null) {
            Intrinsics.preprohormone("binding");
            polloiVarDern = null;
        }
        return polloiVarDern.getRoot();
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
        wireman();
    }
}
