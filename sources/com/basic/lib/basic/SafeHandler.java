package com.basic.lib.basic;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W9;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class SafeHandler extends Handler implements LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f209a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeHandler(AppCompatActivity appCompatActivity, W9 w9) {
        super(appCompatActivity.getMainLooper(), w9);
        AbstractC2995aW.q(appCompatActivity, f.X);
        Lifecycle lifecycle = appCompatActivity.getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(this);
        }
        this.f209a = new WeakReference(appCompatActivity);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onActivityDestroy() {
        removeCallbacksAndMessages(null);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        AbstractC2995aW.q(message, NotificationCompat.CATEGORY_MESSAGE);
        WeakReference weakReference = this.f209a;
        Context context = (Context) weakReference.get();
        if (context != null && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
        }
        if (((Context) weakReference.get()) == null) {
            return;
        }
        super.dispatchMessage(message);
    }
}
