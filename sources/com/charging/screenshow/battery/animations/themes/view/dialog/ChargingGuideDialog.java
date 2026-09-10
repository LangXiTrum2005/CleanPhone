package com.charging.screenshow.battery.animations.themes.view.dialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.room.b;
import androidx.viewbinding.ViewBindings;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.databinding.DialogChargingGuideBinding;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/view/dialog/ChargingGuideDialog;", "Lcom/charging/screenshow/battery/animations/themes/view/dialog/BaseDialog;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChargingGuideDialog extends BaseDialog {
    public static final /* synthetic */ int Z = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public DialogChargingGuideBinding f13328Y;

    @Override // com.charging.screenshow.battery.animations.themes.view.dialog.BaseDialog
    public final View a() {
        View viewInflate = LayoutInflater.from(null).inflate(R.layout.dialog_charging_guide, (ViewGroup) null, false);
        int i2 = R.id.tvBtn;
        TextView textView = (TextView) ViewBindings.a(R.id.tvBtn, viewInflate);
        if (textView != null) {
            i2 = R.id.tvText;
            if (((TextView) ViewBindings.a(R.id.tvText, viewInflate)) != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                this.f13328Y = new DialogChargingGuideBinding(linearLayout, textView);
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
        setCanceledOnTouchOutside(false);
        ViewExt.c(this.f13328Y.f13165a, new b(this, 24));
    }
}
