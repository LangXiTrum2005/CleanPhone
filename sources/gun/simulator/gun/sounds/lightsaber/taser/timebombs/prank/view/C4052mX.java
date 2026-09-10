package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4052mX {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogC4228oX f4698a;

    public C4052mX(DialogC4228oX dialogC4228oX) {
        this.f4698a = dialogC4228oX;
    }

    public final void a() {
        LifecycleCoroutineScope lifecycleScope;
        DialogC4228oX dialogC4228oX = this.f4698a;
        LifecycleOwner lifecycleOwner = dialogC4228oX.b;
        if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            WD.D(lifecycleScope, null, 0, new C3964lX(2, null), 3);
        }
        Activity activity = dialogC4228oX.c;
        String packageName = dialogC4228oX.getContext().getPackageName();
        try {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName));
                intent.setPackage("com.android.vending");
                activity.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
