package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.RelativeLayout;
import com.inmobi.media.C2773ae;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.flow.apical;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2773ae {
    public final RelativeLayout a;
    public final saran b;
    public final MediaPlayer c;
    public final Qm d;
    public final apical e;
    public final Q1 f;
    public final RelativeLayout g;
    public final float h;
    public boolean i;
    public final C2993j5 j;
    public final C2993j5 k;
    public final C2808bn l;

    public C2773ae(RelativeLayout parentView, saran coroutineScope, MediaPlayer mediaPlayer, Qm config, apical mediaPlayerFlow) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(mediaPlayerFlow, "mediaPlayerFlow");
        this.a = parentView;
        this.b = coroutineScope;
        this.c = mediaPlayer;
        this.d = config;
        this.e = mediaPlayerFlow;
        Context context = parentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Q1 q1 = new Q1(context);
        this.f = q1;
        RelativeLayout relativeLayout = new RelativeLayout(parentView.getContext());
        this.g = relativeLayout;
        this.h = J5.b();
        this.l = new C2808bn(coroutineScope, relativeLayout, config.c, mediaPlayerFlow);
        Vd listener = new Vd(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        q1.c = new WeakReference(listener);
        Context context2 = relativeLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.j = new C2993j5(context2, (byte) 9, null);
        Context context3 = relativeLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.k = new C2993j5(context3, (byte) 10, null);
        b();
        relativeLayout.setWillNotDraw(true);
        relativeLayout.setBackgroundColor(0);
        Rm.a(mediaPlayer, q1);
    }

    public static final void a(C2773ae c2773ae, View view) {
        P4.a(c2773ae.b, new Zd(c2773ae, null));
    }

    public final void b() {
        this.j.setOnClickListener(new View.OnClickListener() { // from class: adsuki.interweave
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2773ae.a(this.f3489kowloon, view);
            }
        });
        this.k.setOnClickListener(new View.OnClickListener() { // from class: adsuki.crosspiece
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2773ae.b(this.f3385kowloon, view);
            }
        });
    }

    public static final void b(C2773ae c2773ae, View view) {
        c2773ae.a();
        c2773ae.f.a();
    }

    public final void a() {
        MediaPlayer mediaPlayer = this.c;
        Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } catch (IllegalStateException unused) {
        }
        a(this.j, this.k);
        P4.a(this.e, this.b, new S1(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true));
        this.i = true;
    }

    public final void a(C2993j5 c2993j5, C2993j5 c2993j6) {
        if (Intrinsics.wireman(c2993j5.getParent(), this.g)) {
            return;
        }
        this.g.removeView(c2993j6);
        O1 audioConfig = this.d.d;
        float f = this.h;
        Intrinsics.checkNotNullParameter(c2993j5, "<this>");
        Intrinsics.checkNotNullParameter(audioConfig, "audioConfig");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (audioConfig.b * f), (int) (audioConfig.c * f));
        int i = audioConfig.e;
        if (i == 0) {
            layoutParams.addRule(9, -1);
            layoutParams.addRule(10, -1);
        } else if (i == 1) {
            layoutParams.addRule(11, -1);
            layoutParams.addRule(10, -1);
        } else if (i == 2) {
            layoutParams.addRule(9, -1);
            layoutParams.addRule(12, -1);
        } else if (i == 3) {
            layoutParams.addRule(11, -1);
            layoutParams.addRule(12, -1);
        }
        Yb yb = audioConfig.d;
        layoutParams.leftMargin = (int) (yb.a * f);
        layoutParams.topMargin = (int) (yb.b * f);
        layoutParams.rightMargin = (int) (yb.c * f);
        layoutParams.bottomMargin = (int) (yb.d * f);
        c2993j5.setLayoutParams(layoutParams);
        this.g.addView(c2993j5);
    }
}
