package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.inmobi.media.C3324wc;
import com.inmobi.media.core.config.models.AdConfig;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3324wc {
    public final GestureDetectorOnGestureListenerC2829ci a;
    public final InterfaceC3072m9 b;
    public C2951hc c;
    public C2771ac d;
    public C2771ac e;
    public C2771ac f;

    public C3324wc(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci, InterfaceC3072m9 interfaceC3072m9) {
        this.a = gestureDetectorOnGestureListenerC2829ci;
        this.b = interfaceC3072m9;
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean b() {
        Context context = Ji.a;
        if (context == null) {
            return false;
        }
        Object systemService = context.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        return audioManager != null && audioManager.isWiredHeadsetOn();
    }

    public final void a(String url, Activity activity) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(activity, "activity");
        InterfaceC3072m9 interfaceC3072m9 = this.b;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).c("MraidMediaProcessor", "doPlayMedia");
        }
        C2951hc c2951hc = new C2951hc(activity, this.b);
        this.c = c2951hc;
        c2951hc.setPlaybackData(url);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        C2951hc c2951hc2 = this.c;
        if (c2951hc2 != null) {
            c2951hc2.setLayoutParams(layoutParams);
        }
        C2976ic c2976ic = new C2976ic(activity);
        c2976ic.setOnTouchListener(new View.OnTouchListener() { // from class: adsuki.kaif
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C3324wc.a(view, motionEvent);
            }
        });
        c2976ic.setBackgroundColor(-16777216);
        c2976ic.addView(this.c);
        InterfaceC3072m9 interfaceC3072m10 = this.b;
        if (interfaceC3072m10 != null) {
            ((C3097n9) interfaceC3072m10).a("MraidMediaProcessor", "adding media view on top");
        }
        viewGroup.addView(c2976ic, new ViewGroup.LayoutParams(-1, -1));
        C2951hc c2951hc3 = this.c;
        if (c2951hc3 != null) {
            c2951hc3.setViewContainer(c2976ic);
        }
        C2951hc c2951hc4 = this.c;
        if (c2951hc4 != null) {
            c2951hc4.requestFocus();
        }
        C2951hc c2951hc5 = this.c;
        if (c2951hc5 != null) {
            c2951hc5.setOnKeyListener(new View.OnKeyListener() { // from class: adsuki.moresque
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    return C3324wc.a(this.f3546kowloon, view, i, keyEvent);
                }
            });
        }
        C2951hc c2951hc6 = this.c;
        if (c2951hc6 != null) {
            c2951hc6.setListener(new C3299vc(this));
        }
        C2951hc c2951hc7 = this.c;
        if (c2951hc7 != null) {
            c2951hc7.a();
        }
    }

    public final void b(String str, boolean z) {
        InterfaceC3072m9 interfaceC3072m9 = this.b;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).c("MraidMediaProcessor", "fireHeadphonePluggedEvent");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        if (gestureDetectorOnGestureListenerC2829ci != null) {
            gestureDetectorOnGestureListenerC2829ci.a(str, "fireHeadphonePluggedEvent(" + z + ");");
        }
    }

    public static final boolean a(C3324wc c3324wc, View view, int i, KeyEvent keyEvent) {
        if (4 != i || keyEvent.getAction() != 0) {
            return false;
        }
        C2951hc c2951hc = c3324wc.c;
        if (c2951hc == null) {
            return true;
        }
        c2951hc.b();
        return true;
    }

    public final int a() {
        AdConfig.RenderingConfig renderingConfig;
        InterfaceC3072m9 interfaceC3072m9 = this.b;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).c("MraidMediaProcessor", com.ironsource.X3.j.P);
        }
        Context context = Ji.a;
        if (context == null) {
            return -1;
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        if (((gestureDetectorOnGestureListenerC2829ci == null || (renderingConfig = gestureDetectorOnGestureListenerC2829ci.getRenderingConfig()) == null) ? false : renderingConfig.getEnablePubMuteControl()) && Ji.f) {
            return 0;
        }
        Object systemService = context.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return -1;
    }

    public final void a(String str, boolean z) {
        InterfaceC3072m9 interfaceC3072m9 = this.b;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).c("MraidMediaProcessor", "fireDeviceMuteChangeEvent");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        if (gestureDetectorOnGestureListenerC2829ci != null) {
            gestureDetectorOnGestureListenerC2829ci.a(str, "fireDeviceMuteChangeEvent(" + z + ");");
        }
    }

    public final void a(String str, int i) {
        InterfaceC3072m9 interfaceC3072m9 = this.b;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).c("MraidMediaProcessor", "fireDeviceVolumeChangeEvent");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        if (gestureDetectorOnGestureListenerC2829ci != null) {
            gestureDetectorOnGestureListenerC2829ci.a(str, "fireDeviceVolumeChangeEvent(" + i + ");");
        }
    }
}
