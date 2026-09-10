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
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.F7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class F7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3005ec f22817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3333z5 f22818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3271v7 f22819c;
    public C3223s7 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C3223s7 f22820e;
    public C3223s7 f;

    public F7(GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec, InterfaceC3333z5 interfaceC3333z5) {
        this.f22817a = gestureDetectorOnGestureListenerC3005ec;
        this.f22818b = interfaceC3333z5;
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean b() {
        Context contextD = Uc.d();
        if (contextD == null) {
            return false;
        }
        Object systemService = contextD.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        return audioManager != null && audioManager.isWiredHeadsetOn();
    }

    public final void a(String url, Activity activity) {
        Intrinsics.f(url, "url");
        Intrinsics.f(activity, "activity");
        InterfaceC3333z5 interfaceC3333z5 = this.f22818b;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("MraidMediaProcessor", "doPlayMedia");
        }
        C3271v7 c3271v7 = new C3271v7(activity, this.f22818b);
        this.f22819c = c3271v7;
        c3271v7.setPlaybackData(url);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        RelativeLayout.LayoutParams layoutParamsF = androidx.media3.extractor.text.ttml.a.f(-1, -1, 13);
        C3271v7 c3271v8 = this.f22819c;
        if (c3271v8 != null) {
            c3271v8.setLayoutParams(layoutParamsF);
        }
        C3287w7 c3287w7 = new C3287w7(activity);
        c3287w7.setOnTouchListener(new A.r(0));
        c3287w7.setBackgroundColor(-16777216);
        c3287w7.addView(this.f22819c);
        InterfaceC3333z5 interfaceC3333z6 = this.f22818b;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a("MraidMediaProcessor", "adding media view on top");
        }
        viewGroup.addView(c3287w7, new ViewGroup.LayoutParams(-1, -1));
        C3271v7 c3271v9 = this.f22819c;
        if (c3271v9 != null) {
            c3271v9.setViewContainer(c3287w7);
        }
        C3271v7 c3271v10 = this.f22819c;
        if (c3271v10 != null) {
            c3271v10.requestFocus();
        }
        C3271v7 c3271v11 = this.f22819c;
        if (c3271v11 != null) {
            c3271v11.setOnKeyListener(new View.OnKeyListener() { // from class: A.s
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                    return F7.a(this.X, view, i2, keyEvent);
                }
            });
        }
        C3271v7 c3271v12 = this.f22819c;
        if (c3271v12 != null) {
            c3271v12.setListener(new E7(this));
        }
        C3271v7 c3271v13 = this.f22819c;
        if (c3271v13 != null) {
            c3271v13.a();
        }
    }

    public static final boolean a(F7 this$0, View view, int i2, KeyEvent keyEvent) {
        Intrinsics.f(this$0, "this$0");
        if (4 != i2 || keyEvent.getAction() != 0) {
            return false;
        }
        C3271v7 c3271v7 = this$0.f22819c;
        if (c3271v7 == null) {
            return true;
        }
        c3271v7.b();
        return true;
    }

    public final int a() {
        AdConfig.RenderingConfig renderingConfig;
        InterfaceC3333z5 interfaceC3333z5 = this.f22818b;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("MraidMediaProcessor", com.ironsource.d9.i.f24741P);
        }
        Context contextD = Uc.d();
        if (contextD == null) {
            return -1;
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f22817a;
        if (((gestureDetectorOnGestureListenerC3005ec == null || (renderingConfig = gestureDetectorOnGestureListenerC3005ec.getRenderingConfig()) == null) ? false : renderingConfig.getEnablePubMuteControl()) && Uc.o()) {
            return 0;
        }
        Object systemService = contextD.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return -1;
    }
}
