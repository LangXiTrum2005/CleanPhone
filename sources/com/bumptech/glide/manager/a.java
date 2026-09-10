package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.collection.ArrayMap;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2557Ku;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3743iz;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4710tz;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5003xH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5091yH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2481Hw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Qm0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Tg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.VY;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Handler.Callback {
    public static final Qm0 e = new Qm0(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile VY f220a;
    public final Qm0 b;
    public final InterfaceC2481Hw c;
    public final C5091yH d;

    public a(Qm0 qm0) {
        new ArrayMap();
        qm0 = qm0 == null ? e : qm0;
        this.b = qm0;
        this.d = new C5091yH(qm0);
        this.c = (C3743iz.f && C3743iz.e) ? new C2557Ku() : new Qm0(18);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final VY b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = Tg0.f3783a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return c((FragmentActivity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f220a == null) {
            synchronized (this) {
                try {
                    if (this.f220a == null) {
                        com.bumptech.glide.a aVarA = com.bumptech.glide.a.a(context.getApplicationContext());
                        Qm0 qm0 = this.b;
                        Qm0 qm1 = new Qm0(17);
                        C4710tz c4710tz = new C4710tz(19);
                        Context applicationContext = context.getApplicationContext();
                        qm0.getClass();
                        this.f220a = new VY(aVarA, qm1, c4710tz, applicationContext);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f220a;
    }

    public final VY c(FragmentActivity fragmentActivity) {
        char[] cArr = Tg0.f3783a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return b(fragmentActivity.getApplicationContext());
        }
        if (fragmentActivity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.c.e(fragmentActivity);
        Activity activityA = a(fragmentActivity);
        boolean z = activityA == null || !activityA.isFinishing();
        com.bumptech.glide.a aVarA = com.bumptech.glide.a.a(fragmentActivity.getApplicationContext());
        Lifecycle lifecycle = fragmentActivity.getLifecycle();
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        C5091yH c5091yH = this.d;
        c5091yH.getClass();
        Tg0.a();
        Tg0.a();
        Object obj = c5091yH.f5270a;
        VY vy = (VY) ((Map) obj).get(lifecycle);
        if (vy != null) {
            return vy;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(lifecycle);
        Qm0 qm0 = (Qm0) c5091yH.b;
        C5091yH c5091yH2 = new C5091yH(c5091yH, supportFragmentManager);
        qm0.getClass();
        VY vy2 = new VY(aVarA, lifecycleLifecycle, c5091yH2, fragmentActivity);
        ((Map) obj).put(lifecycle, vy2);
        lifecycleLifecycle.s(new C5003xH(c5091yH, lifecycle));
        if (z) {
            vy2.onStart();
        }
        return vy2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
