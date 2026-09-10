package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.MotionEvent;
import android.webkit.WebView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.SettingActivity;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2547Kk extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3323a = 1;

    public C2547Kk(Context context) {
        super(context, null);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3323a) {
            case 1:
                super.onTouchEvent(motionEvent);
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        switch (this.f3323a) {
            case 1:
                super.performClick();
                return false;
            default:
                return super.performClick();
        }
    }

    public C2547Kk(SettingActivity settingActivity) {
        super(Build.VERSION.SDK_INT < 23 ? settingActivity.createConfigurationContext(new Configuration()) : settingActivity);
    }
}
