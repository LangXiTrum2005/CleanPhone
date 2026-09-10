package com.charging.screenshow.battery.animations.themes.view.dialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBindings;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.activity.ImagePreviewAct;
import com.charging.screenshow.battery.animations.themes.activity.r;
import com.charging.screenshow.battery.animations.themes.databinding.DialogSetAsBinding;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import com.charging.screenshow.battery.animations.themes.view.dialog.SetAsDialog;
import com.startapp.sdk.internal.F;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/view/dialog/SetAsDialog;", "Lcom/charging/screenshow/battery/animations/themes/view/dialog/BaseDialog;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SetAsDialog extends BaseDialog {
    public static final /* synthetic */ int h0 = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ImagePreviewAct f13333Y;
    public DialogSetAsBinding Z;
    public r e0;
    public r f0;
    public r g0;

    public SetAsDialog(ImagePreviewAct imagePreviewAct, F f) {
        super(imagePreviewAct);
        this.f13333Y = imagePreviewAct;
        f.invoke(this);
    }

    @Override // com.charging.screenshow.battery.animations.themes.view.dialog.BaseDialog
    public final View a() {
        View viewInflate = LayoutInflater.from(this.f13333Y).inflate(R.layout.dialog_set_as, (ViewGroup) null, false);
        int i2 = R.id.ivClose;
        ImageView imageView = (ImageView) ViewBindings.a(R.id.ivClose, viewInflate);
        if (imageView != null) {
            i2 = R.id.llBoth;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.a(R.id.llBoth, viewInflate);
            if (linearLayout != null) {
                i2 = R.id.llHomeScreen;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.a(R.id.llHomeScreen, viewInflate);
                if (linearLayout2 != null) {
                    i2 = R.id.llLockScreen;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.a(R.id.llLockScreen, viewInflate);
                    if (linearLayout3 != null) {
                        i2 = R.id.tvTitle;
                        if (((TextView) ViewBindings.a(R.id.tvTitle, viewInflate)) != null) {
                            FrameLayout frameLayout = (FrameLayout) viewInflate;
                            this.Z = new DialogSetAsBinding(frameLayout, imageView, linearLayout, linearLayout2, linearLayout3);
                            Intrinsics.e(frameLayout, "getRoot(...)");
                            return frameLayout;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // com.charging.screenshow.battery.animations.themes.view.dialog.BaseDialog
    public final void b() {
        super.b();
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        DialogSetAsBinding dialogSetAsBinding = this.Z;
        if (dialogSetAsBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        final int i2 = 0;
        ViewExt.c(dialogSetAsBinding.f13174b, new Function1(this) { // from class: n.b

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ SetAsDialog f45127Y;

            {
                this.f45127Y = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit unit = Unit.f43263a;
                SetAsDialog setAsDialog = this.f45127Y;
                View it = (View) obj;
                switch (i2) {
                    case 0:
                        int i3 = SetAsDialog.h0;
                        Intrinsics.f(it, "it");
                        setAsDialog.dismiss();
                        break;
                    case 1:
                        int i4 = SetAsDialog.h0;
                        Intrinsics.f(it, "it");
                        setAsDialog.dismiss();
                        r rVar = setAsDialog.e0;
                        if (rVar != null) {
                            rVar.invoke();
                        }
                        break;
                    case 2:
                        int i5 = SetAsDialog.h0;
                        Intrinsics.f(it, "it");
                        setAsDialog.dismiss();
                        r rVar2 = setAsDialog.f0;
                        if (rVar2 != null) {
                            rVar2.invoke();
                        }
                        break;
                    default:
                        int i6 = SetAsDialog.h0;
                        Intrinsics.f(it, "it");
                        setAsDialog.dismiss();
                        r rVar3 = setAsDialog.g0;
                        if (rVar3 != null) {
                            rVar3.invoke();
                        }
                        break;
                }
                return unit;
            }
        });
        DialogSetAsBinding dialogSetAsBinding2 = this.Z;
        if (dialogSetAsBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        final int i3 = 1;
        ViewExt.c(dialogSetAsBinding2.d, new Function1(this) { // from class: n.b

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ SetAsDialog f45127Y;

            {
                this.f45127Y = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit unit = Unit.f43263a;
                SetAsDialog setAsDialog = this.f45127Y;
                View it = (View) obj;
                switch (i3) {
                    case 0:
                        int i4 = SetAsDialog.h0;
                        Intrinsics.f(it, "it");
                        setAsDialog.dismiss();
                        break;
                    case 1:
                        int i5 = SetAsDialog.h0;
                        Intrinsics.f(it, "it");
                        setAsDialog.dismiss();
                        r rVar = setAsDialog.e0;
                        if (rVar != null) {
                            rVar.invoke();
                        }
                        break;
                    case 2:
                        int i6 = SetAsDialog.h0;
                        Intrinsics.f(it, "it");
                        setAsDialog.dismiss();
                        r rVar2 = setAsDialog.f0;
                        if (rVar2 != null) {
                            rVar2.invoke();
                        }
                        break;
                    default:
                        int i7 = SetAsDialog.h0;
                        Intrinsics.f(it, "it");
                        setAsDialog.dismiss();
                        r rVar3 = setAsDialog.g0;
                        if (rVar3 != null) {
                            rVar3.invoke();
                        }
                        break;
                }
                return unit;
            }
        });
        DialogSetAsBinding dialogSetAsBinding3 = this.Z;
        if (dialogSetAsBinding3 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        final int i4 = 2;
        ViewExt.c(dialogSetAsBinding3.f13176e, new Function1(this) { // from class: n.b

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ SetAsDialog f45127Y;

            {
                this.f45127Y = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit unit = Unit.f43263a;
                SetAsDialog setAsDialog = this.f45127Y;
                View it = (View) obj;
                switch (i4) {
                    case 0:
                        int i5 = SetAsDialog.h0;
                        Intrinsics.f(it, "it");
                        setAsDialog.dismiss();
                        break;
                    case 1:
                        int i6 = SetAsDialog.h0;
                        Intrinsics.f(it, "it");
                        setAsDialog.dismiss();
                        r rVar = setAsDialog.e0;
                        if (rVar != null) {
                            rVar.invoke();
                        }
                        break;
                    case 2:
                        int i7 = SetAsDialog.h0;
                        Intrinsics.f(it, "it");
                        setAsDialog.dismiss();
                        r rVar2 = setAsDialog.f0;
                        if (rVar2 != null) {
                            rVar2.invoke();
                        }
                        break;
                    default:
                        int i8 = SetAsDialog.h0;
                        Intrinsics.f(it, "it");
                        setAsDialog.dismiss();
                        r rVar3 = setAsDialog.g0;
                        if (rVar3 != null) {
                            rVar3.invoke();
                        }
                        break;
                }
                return unit;
            }
        });
        DialogSetAsBinding dialogSetAsBinding4 = this.Z;
        if (dialogSetAsBinding4 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        final int i5 = 3;
        ViewExt.c(dialogSetAsBinding4.f13175c, new Function1(this) { // from class: n.b

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ SetAsDialog f45127Y;

            {
                this.f45127Y = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit unit = Unit.f43263a;
                SetAsDialog setAsDialog = this.f45127Y;
                View it = (View) obj;
                switch (i5) {
                    case 0:
                        int i6 = SetAsDialog.h0;
                        Intrinsics.f(it, "it");
                        setAsDialog.dismiss();
                        break;
                    case 1:
                        int i7 = SetAsDialog.h0;
                        Intrinsics.f(it, "it");
                        setAsDialog.dismiss();
                        r rVar = setAsDialog.e0;
                        if (rVar != null) {
                            rVar.invoke();
                        }
                        break;
                    case 2:
                        int i8 = SetAsDialog.h0;
                        Intrinsics.f(it, "it");
                        setAsDialog.dismiss();
                        r rVar2 = setAsDialog.f0;
                        if (rVar2 != null) {
                            rVar2.invoke();
                        }
                        break;
                    default:
                        int i9 = SetAsDialog.h0;
                        Intrinsics.f(it, "it");
                        setAsDialog.dismiss();
                        r rVar3 = setAsDialog.g0;
                        if (rVar3 != null) {
                            rVar3.invoke();
                        }
                        break;
                }
                return unit;
            }
        });
    }
}
