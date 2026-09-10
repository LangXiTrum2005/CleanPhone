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
import com.mbridge.msdk.MBridgeConstans;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FunctionCountDownDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/codejoy/boom/clap/module/dialog/FunctionCountDownDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "kowloon", "Lpatroclinal/taiyuan;", "beachfront", "()Ljava/lang/String;", "functionMode", "Lsonnetize/monoploid;", "arytenoidectomy", "Lsonnetize/monoploid;", "binding", "monoploid", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FunctionCountDownDialog extends DialogFragment {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final int f18294polloi = 8;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public sonnetize.monoploid binding;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan functionMode = p002kotlin.saneness.saneness(new Function0() { // from class: com.codejoy.boom.clap.module.dialog.kowloon
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FunctionCountDownDialog.marial(this.f18319kowloon);
        }
    });

    /* JADX INFO: renamed from: com.codejoy.boom.clap.module.dialog.FunctionCountDownDialog$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: compiled from: FunctionCountDownDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 2, 0})
    @igo.wireman(c = "com.codejoy.boom.clap.module.dialog.FunctionCountDownDialog$onViewCreated$1", f = "FunctionCountDownDialog.kt", l = {87, 89, 91, 93, 95}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
        int label;

        public AnonymousClass1(wretchedly.dern<? super AnonymousClass1> dernVar) {
            super(2, dernVar);
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
            return FunctionCountDownDialog.this.new AnonymousClass1(dernVar);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x007e  */
        /* JADX WARN: Code duplicated, block: B:34:0x0092  */
        /* JADX WARN: Code duplicated, block: B:36:0x009a  */
        /* JADX WARN: Code duplicated, block: B:40:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:42:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:43:0x00ba  */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00c8, code lost:
        
            if (kotlinx.coroutines.splinterproof.attabal(1000, r11) == r0) goto L46;
         */
        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 236
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.codejoy.boom.clap.module.dialog.FunctionCountDownDialog.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
            return ((AnonymousClass1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
        }
    }

    public static final String marial(FunctionCountDownDialog functionCountDownDialog) {
        String string;
        Bundle arguments = functionCountDownDialog.getArguments();
        return (arguments == null || (string = arguments.getString("functionMode")) == null) ? "" : string;
    }

    public final String beachfront() {
        return (String) this.functionMode.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, com.codejoy.boom.clap.monoploid.Theme_Dialog_Dark);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        sonnetize.monoploid monoploidVarDern = sonnetize.monoploid.dern(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(monoploidVarDern, "inflate(...)");
        this.binding = monoploidVarDern;
        if (monoploidVarDern == null) {
            Intrinsics.preprohormone("binding");
            monoploidVarDern = null;
        }
        return monoploidVarDern.getRoot();
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
        Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            dialog3.setCancelable(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        String strBeachfront = beachfront();
        if (Intrinsics.wireman(strBeachfront, "MODE_ANTI_PICKPOCKET")) {
            sonnetize.monoploid monoploidVar = this.binding;
            if (monoploidVar == null) {
                Intrinsics.preprohormone("binding");
                monoploidVar = null;
            }
            monoploidVar.f37896dern.setText(getString(com.codejoy.boom.clap.arytenoidectomy.function_count_down_pocket_tip));
        } else if (Intrinsics.wireman(strBeachfront, "MODE_NOT_TOUCH_PHONE")) {
            sonnetize.monoploid monoploidVar2 = this.binding;
            if (monoploidVar2 == null) {
                Intrinsics.preprohormone("binding");
                monoploidVar2 = null;
            }
            monoploidVar2.f37896dern.setText(getString(com.codejoy.boom.clap.arytenoidectomy.function_count_down_tips));
        }
        kotlinx.coroutines.cutely.wireman(androidx.p001lifecycle.monoploid.attabal(this), null, null, new AnonymousClass1(null), 3, null);
    }
}
