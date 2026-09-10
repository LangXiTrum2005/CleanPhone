package com.charging.screenshow.battery.animations.themes.view.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.utils.DeviceUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/view/dialog/BaseDialog;", "Landroid/app/Dialog;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseDialog extends Dialog {
    public final FragmentActivity X;

    public BaseDialog(FragmentActivity fragmentActivity) {
        super(fragmentActivity, R.style.AppDialog);
        this.X = fragmentActivity;
    }

    public abstract View a();

    public void b() {
        Window window = getWindow();
        Intrinsics.c(window);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = (int) (((double) DeviceUtil.b(this.X)) * 0.8d);
        Window window2 = getWindow();
        Intrinsics.c(window2);
        window2.setAttributes(attributes);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(a());
        b();
    }
}
