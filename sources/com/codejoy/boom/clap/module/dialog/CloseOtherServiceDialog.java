package com.codejoy.boom.clap.module.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.codejoy.boom.clap.data.FunctionMode;
import com.codejoy.boom.clap.service.AntiPickPocketService;
import com.codejoy.boom.clap.service.ClapCounterService;
import com.codejoy.boom.clap.service.NotTouchPhoneService;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.mbridge.msdk.MBridgeConstans;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CloseOtherServiceDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0003J-\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0003R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/codejoy/boom/clap/module/dialog/CloseOtherServiceDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "", "apical", "kowloon", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lcom/codejoy/boom/clap/data/FunctionMode;", "Lpatroclinal/taiyuan;", "taiyuan", "()Lcom/codejoy/boom/clap/data/FunctionMode;", "originMode", "arytenoidectomy", "cutely", "targetMode", "Lsonnetize/arytenoidectomy;", "monoploid", "Lsonnetize/arytenoidectomy;", "binding", "polloi", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CloseOtherServiceDialog extends DialogFragment {

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public sonnetize.arytenoidectomy binding;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final int f18287molybdenite = 8;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan originMode = p002kotlin.saneness.saneness(new Function0() { // from class: com.codejoy.boom.clap.module.dialog.cutely
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CloseOtherServiceDialog.monoploid(this.f18312kowloon);
        }
    });

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan targetMode = p002kotlin.saneness.saneness(new Function0() { // from class: com.codejoy.boom.clap.module.dialog.apical
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CloseOtherServiceDialog.polloi(this.f18305kowloon);
        }
    });

    /* JADX INFO: renamed from: com.codejoy.boom.clap.module.dialog.CloseOtherServiceDialog$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CloseOtherServiceDialog.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/codejoy/boom/clap/module/dialog/CloseOtherServiceDialog$attabal;", "", "<init>", "()V", "Lcom/codejoy/boom/clap/data/FunctionMode;", "originMode", "targetMode", "Lcom/codejoy/boom/clap/module/dialog/CloseOtherServiceDialog;", "attabal", "(Lcom/codejoy/boom/clap/data/FunctionMode;Lcom/codejoy/boom/clap/data/FunctionMode;)Lcom/codejoy/boom/clap/module/dialog/CloseOtherServiceDialog;", "", "REQUEST_KEY", "Ljava/lang/String;", "KEY_ORIGIN_MODE", "KEY_TARGET_MODE", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CloseOtherServiceDialog attabal(FunctionMode originMode, FunctionMode targetMode) {
            Intrinsics.checkNotNullParameter(originMode, "originMode");
            Intrinsics.checkNotNullParameter(targetMode, "targetMode");
            CloseOtherServiceDialog closeOtherServiceDialog = new CloseOtherServiceDialog();
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_origin_mode", originMode);
            bundle.putSerializable("key_target_mode", targetMode);
            closeOtherServiceDialog.setArguments(bundle);
            return closeOtherServiceDialog;
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: CloseOtherServiceDialog.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f18292attabal;

        static {
            int[] iArr = new int[FunctionMode.values().length];
            try {
                iArr[FunctionMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FunctionMode.MODE_CLAP_FIND_PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FunctionMode.MODE_ANTI_PICKPOCKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FunctionMode.MODE_NOT_TOUCH_PHONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f18292attabal = iArr;
        }
    }

    private final void apical() {
        String string;
        FunctionMode functionModeTaiyuan = taiyuan();
        int[] iArr = saneness.f18292attabal;
        int i = iArr[functionModeTaiyuan.ordinal()];
        sonnetize.arytenoidectomy arytenoidectomyVar = null;
        String string2 = "";
        if (i == 1) {
            string = "";
        } else if (i == 2) {
            sonnetize.arytenoidectomy arytenoidectomyVar2 = this.binding;
            if (arytenoidectomyVar2 == null) {
                Intrinsics.preprohormone("binding");
                arytenoidectomyVar2 = null;
            }
            arytenoidectomyVar2.f37744wireman.setImageResource(com.codejoy.boom.clap.formularize.boom_img_deactivate_clap);
            string = getString(com.codejoy.boom.clap.arytenoidectomy.mode_find_phone);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else if (i == 3) {
            sonnetize.arytenoidectomy arytenoidectomyVar3 = this.binding;
            if (arytenoidectomyVar3 == null) {
                Intrinsics.preprohormone("binding");
                arytenoidectomyVar3 = null;
            }
            arytenoidectomyVar3.f37744wireman.setImageResource(com.codejoy.boom.clap.formularize.boom_img_deactivate_pocket);
            string = getString(com.codejoy.boom.clap.arytenoidectomy.mode_anti_pickpocket);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            sonnetize.arytenoidectomy arytenoidectomyVar4 = this.binding;
            if (arytenoidectomyVar4 == null) {
                Intrinsics.preprohormone("binding");
                arytenoidectomyVar4 = null;
            }
            arytenoidectomyVar4.f37744wireman.setImageResource(com.codejoy.boom.clap.formularize.boom_img_deactivate_touch);
            string = getString(com.codejoy.boom.clap.arytenoidectomy.mode_not_touch_my_phone);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        sonnetize.arytenoidectomy arytenoidectomyVar5 = this.binding;
        if (arytenoidectomyVar5 == null) {
            Intrinsics.preprohormone("binding");
            arytenoidectomyVar5 = null;
        }
        arytenoidectomyVar5.f37738cutely.setText(getString(com.codejoy.boom.clap.arytenoidectomy.close_service_title, string));
        int i2 = iArr[cutely().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                string2 = getString(com.codejoy.boom.clap.arytenoidectomy.mode_find_phone);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            } else if (i2 == 3) {
                string2 = getString(com.codejoy.boom.clap.arytenoidectomy.mode_anti_pickpocket);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                string2 = getString(com.codejoy.boom.clap.arytenoidectomy.mode_not_touch_my_phone);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            }
        }
        sonnetize.arytenoidectomy arytenoidectomyVar6 = this.binding;
        if (arytenoidectomyVar6 == null) {
            Intrinsics.preprohormone("binding");
            arytenoidectomyVar6 = null;
        }
        arytenoidectomyVar6.f37743taiyuan.setText(getString(com.codejoy.boom.clap.arytenoidectomy.close_service_tip, string2, string));
        sonnetize.arytenoidectomy arytenoidectomyVar7 = this.binding;
        if (arytenoidectomyVar7 == null) {
            Intrinsics.preprohormone("binding");
            arytenoidectomyVar7 = null;
        }
        arytenoidectomyVar7.f37739dern.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.dialog.formularize
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CloseOtherServiceDialog.formularize(this.f18315kowloon, view);
            }
        });
        sonnetize.arytenoidectomy arytenoidectomyVar8 = this.binding;
        if (arytenoidectomyVar8 == null) {
            Intrinsics.preprohormone("binding");
            arytenoidectomyVar8 = null;
        }
        arytenoidectomyVar8.f37742saneness.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.dialog.impassible
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CloseOtherServiceDialog.impassible(this.f18317kowloon, view);
            }
        });
        sonnetize.arytenoidectomy arytenoidectomyVar9 = this.binding;
        if (arytenoidectomyVar9 == null) {
            Intrinsics.preprohormone("binding");
            arytenoidectomyVar9 = null;
        }
        FrameLayout okButton = arytenoidectomyVar9.f37741marial;
        Intrinsics.checkNotNullExpressionValue(okButton, "okButton");
        vintage.taiyuan.kowloon(okButton);
        sonnetize.arytenoidectomy arytenoidectomyVar10 = this.binding;
        if (arytenoidectomyVar10 == null) {
            Intrinsics.preprohormone("binding");
        } else {
            arytenoidectomyVar = arytenoidectomyVar10;
        }
        arytenoidectomyVar.f37741marial.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.dialog.triweekly
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CloseOtherServiceDialog.triweekly(this.f18327kowloon, view);
            }
        });
    }

    public static final Unit arytenoidectomy(CloseOtherServiceDialog closeOtherServiceDialog, NativeAd nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        try {
            Result.Companion companion = Result.INSTANCE;
            orometer.saneness sanenessVarAttabal = new orometer.saneness.attabal().attabal();
            sonnetize.arytenoidectomy arytenoidectomyVar = closeOtherServiceDialog.binding;
            sonnetize.arytenoidectomy arytenoidectomyVar2 = null;
            if (arytenoidectomyVar == null) {
                Intrinsics.preprohormone("binding");
                arytenoidectomyVar = null;
            }
            arytenoidectomyVar.f37737competently.setStyles(sanenessVarAttabal);
            sonnetize.arytenoidectomy arytenoidectomyVar3 = closeOtherServiceDialog.binding;
            if (arytenoidectomyVar3 == null) {
                Intrinsics.preprohormone("binding");
            } else {
                arytenoidectomyVar2 = arytenoidectomyVar3;
            }
            arytenoidectomyVar2.f37737competently.setNativeAd(nativeAd);
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        return Unit.f29295attabal;
    }

    public static final void formularize(CloseOtherServiceDialog closeOtherServiceDialog, View view) {
        closeOtherServiceDialog.dismissAllowingStateLoss();
    }

    public static final void impassible(CloseOtherServiceDialog closeOtherServiceDialog, View view) {
        closeOtherServiceDialog.dismissAllowingStateLoss();
    }

    private final void kowloon() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            com.yoadx.ad.lib.admob.format.natived.attabal attabalVarMarial = couple.beachfront.f24107attabal.marial();
            sonnetize.arytenoidectomy arytenoidectomyVar = this.binding;
            if (arytenoidectomyVar == null) {
                Intrinsics.preprohormone("binding");
                arytenoidectomyVar = null;
            }
            attabalVarMarial.sealless(activity, "ad_scenes_change_mode_pop", this, arytenoidectomyVar.f37737competently, new Function1() { // from class: com.codejoy.boom.clap.module.dialog.taiyuan
                @Override // p002kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CloseOtherServiceDialog.arytenoidectomy(this.f18326kowloon, (NativeAd) obj);
                }
            });
        }
    }

    public static final FunctionMode monoploid(CloseOtherServiceDialog closeOtherServiceDialog) {
        FunctionMode functionMode;
        Bundle arguments = closeOtherServiceDialog.getArguments();
        return (arguments == null || (functionMode = (FunctionMode) claque.dern.saneness(arguments, "key_origin_mode", FunctionMode.class)) == null) ? FunctionMode.MODE_CLAP_FIND_PHONE : functionMode;
    }

    public static final FunctionMode polloi(CloseOtherServiceDialog closeOtherServiceDialog) {
        FunctionMode functionMode;
        Bundle arguments = closeOtherServiceDialog.getArguments();
        return (arguments == null || (functionMode = (FunctionMode) claque.dern.saneness(arguments, "key_target_mode", FunctionMode.class)) == null) ? FunctionMode.MODE_CLAP_FIND_PHONE : functionMode;
    }

    public static final void triweekly(CloseOtherServiceDialog closeOtherServiceDialog, View view) {
        int i = saneness.f18292attabal[closeOtherServiceDialog.taiyuan().ordinal()];
        if (i != 1) {
            if (i == 2) {
                ClapCounterService.Companion companion = ClapCounterService.INSTANCE;
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                companion.impromptu(context);
            } else if (i == 3) {
                AntiPickPocketService.Companion attabalVar = AntiPickPocketService.INSTANCE;
                Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                attabalVar.wireman(context2);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                NotTouchPhoneService.Companion attabalVar2 = NotTouchPhoneService.INSTANCE;
                Context context3 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                attabalVar2.wireman(context3);
            }
        }
        kotlinx.coroutines.cutely.wireman(androidx.p001lifecycle.monoploid.attabal(closeOtherServiceDialog), null, null, new CloseOtherServiceDialog$initView$3$1(closeOtherServiceDialog, null), 3, null);
    }

    public final FunctionMode cutely() {
        return (FunctionMode) this.targetMode.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, com.codejoy.boom.clap.monoploid.Theme_Dialog_Dark);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        sonnetize.arytenoidectomy arytenoidectomyVarDern = sonnetize.arytenoidectomy.dern(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(arytenoidectomyVarDern, "inflate(...)");
        this.binding = arytenoidectomyVarDern;
        if (arytenoidectomyVarDern == null) {
            Intrinsics.preprohormone("binding");
            arytenoidectomyVarDern = null;
        }
        return arytenoidectomyVarDern.getRoot();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        sonnetize.arytenoidectomy arytenoidectomyVar = this.binding;
        if (arytenoidectomyVar == null) {
            Intrinsics.preprohormone("binding");
            arytenoidectomyVar = null;
        }
        arytenoidectomyVar.f37737competently.removeAllViews();
        super.onDestroyView();
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
        kowloon();
        apical();
    }

    public final FunctionMode taiyuan() {
        return (FunctionMode) this.originMode.getValue();
    }
}
