package com.charging.screenshow.battery.animations.themes.view.dialog;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.databinding.DialogLoadingBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/view/dialog/LoadingDialog;", "Lcom/charging/screenshow/battery/animations/themes/view/dialog/BaseDialog;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoadingDialog extends BaseDialog {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final FragmentActivity f13331Y;
    public final String Z;
    public DialogLoadingBinding e0;

    public LoadingDialog(FragmentActivity fragmentActivity, String str) {
        super(fragmentActivity);
        this.f13331Y = fragmentActivity;
        this.Z = str;
    }

    @Override // com.charging.screenshow.battery.animations.themes.view.dialog.BaseDialog
    public final View a() {
        View viewInflate = LayoutInflater.from(this.f13331Y).inflate(R.layout.dialog_loading, (ViewGroup) null, false);
        int i2 = R.id.pbb;
        if (((ProgressBar) ViewBindings.a(R.id.pbb, viewInflate)) != null) {
            i2 = R.id.tv;
            TextView textView = (TextView) ViewBindings.a(R.id.tv, viewInflate);
            if (textView != null) {
                FrameLayout frameLayout = (FrameLayout) viewInflate;
                this.e0 = new DialogLoadingBinding(frameLayout, textView);
                Intrinsics.e(frameLayout, "getRoot(...)");
                return frameLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // com.charging.screenshow.battery.animations.themes.view.dialog.BaseDialog
    public final void b() {
        super.b();
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        String str = this.Z;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DialogLoadingBinding dialogLoadingBinding = this.e0;
        if (dialogLoadingBinding != null) {
            dialogLoadingBinding.f13171b.setText(str);
        } else {
            Intrinsics.m("binding");
            throw null;
        }
    }
}
