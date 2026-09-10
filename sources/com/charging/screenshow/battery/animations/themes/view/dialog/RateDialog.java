package com.charging.screenshow.battery.animations.themes.view.dialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBindings;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.activity.MainAct;
import com.charging.screenshow.battery.animations.themes.activity.w;
import com.charging.screenshow.battery.animations.themes.activity.x;
import com.charging.screenshow.battery.animations.themes.databinding.DialogRateBinding;
import com.unity3d.ads.adplayer.b;
import com.willy.ratingbar.ScaleRatingBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/view/dialog/RateDialog;", "Lcom/charging/screenshow/battery/animations/themes/view/dialog/BaseDialog;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RateDialog extends BaseDialog {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final MainAct f13332Y;
    public DialogRateBinding Z;
    public x e0;

    public RateDialog(MainAct mainAct, w wVar) {
        super(mainAct);
        this.f13332Y = mainAct;
        wVar.invoke(this);
    }

    @Override // com.charging.screenshow.battery.animations.themes.view.dialog.BaseDialog
    public final View a() {
        View viewInflate = LayoutInflater.from(this.f13332Y).inflate(R.layout.dialog_rate, (ViewGroup) null, false);
        int i2 = R.id.srb;
        ScaleRatingBar scaleRatingBar = (ScaleRatingBar) ViewBindings.a(R.id.srb, viewInflate);
        if (scaleRatingBar != null) {
            i2 = R.id.tvTitle;
            if (((TextView) ViewBindings.a(R.id.tvTitle, viewInflate)) != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                this.Z = new DialogRateBinding(linearLayout, scaleRatingBar);
                Intrinsics.e(linearLayout, "getRoot(...)");
                return linearLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // com.charging.screenshow.battery.animations.themes.view.dialog.BaseDialog
    public final void b() {
        super.b();
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        DialogRateBinding dialogRateBinding = this.Z;
        if (dialogRateBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        dialogRateBinding.f13172a.setOnRatingChangeListener(new b(this, 6));
    }
}
