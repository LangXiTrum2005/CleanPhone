package com.inmobi.media;

import A.C0888e0;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.VideoView;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: com.inmobi.media.v7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3271v7 extends VideoView implements MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3333z5 f24052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3239t7 f24053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f24054c;
    public InterfaceC3255u7 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24055e;
    public final WeakReference f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f24056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f24057i;
    public int j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3271v7(Activity activity, InterfaceC3333z5 interfaceC3333z5) {
        super(activity);
        Intrinsics.f(activity, "activity");
        this.f24052a = interfaceC3333z5;
        setZOrderOnTop(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT < 28) {
            setDrawingCacheEnabled(true);
        }
        this.g = 100;
        this.j = -1;
        this.k = 0;
        this.f = new WeakReference(activity);
        Uc.a(activity, this);
    }

    public static final void a(C3271v7 this$0, MediaPlayer mediaPlayer, int i2, int i3) {
        Intrinsics.f(this$0, "this$0");
        InterfaceC3333z5 interfaceC3333z5 = this$0.f24052a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("MediaRenderView", ">>> onVideoSizeChanged");
        }
        if (this$0.f24053b == null) {
            C3239t7 c3239t7 = new C3239t7(this$0.getContext());
            this$0.f24053b = c3239t7;
            c3239t7.setAnchorView(this$0);
            this$0.setMediaController(this$0.f24053b);
            this$0.requestLayout();
            this$0.requestFocus();
        }
    }

    public final void b() {
        InterfaceC3333z5 interfaceC3333z5 = this.f24052a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("MediaRenderView", "Release the media render view");
        }
        stopPlayback();
        ViewGroup viewGroup = this.f24054c;
        if (viewGroup != null) {
            ViewParent parent = viewGroup.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f24054c);
            }
            ViewParent parent2 = getParent();
            ViewGroup viewGroup3 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(this);
            }
            setBackgroundColor(0);
            this.f24054c = null;
        }
        setMediaController(null);
        this.f24053b = null;
        InterfaceC3255u7 interfaceC3255u7 = this.d;
        if (interfaceC3255u7 != null) {
            InterfaceC3333z5 interfaceC3333z6 = ((E7) interfaceC3255u7).f22799a.f22818b;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).a("MraidMediaProcessor", ">>> onPlayerCompleted");
            }
            ViewGroup viewContainer = getViewContainer();
            if (viewContainer != null) {
                ViewParent parent3 = viewContainer.getParent();
                ViewGroup viewGroup4 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
                if (viewGroup4 != null) {
                    viewGroup4.removeView(viewContainer);
                }
            }
            setViewContainer(null);
        }
    }

    public final int getCurrentAudioVolume() {
        return this.g;
    }

    @Override // android.view.View
    public final String getId() {
        return this.f24056h;
    }

    public final InterfaceC3255u7 getListener() {
        return this.d;
    }

    public final int getMCurrentPosition() {
        return this.k;
    }

    public final String getPlaybackUrl() {
        return this.f24057i;
    }

    public final int getPreviousPosition() {
        return this.j;
    }

    public final ViewGroup getViewContainer() {
        return this.f24054c;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.f(activity, "activity");
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.f(activity, "activity");
        Intrinsics.f(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.f(activity, "activity");
        if (this.f.get() == null || !Intrinsics.a(this.f.get(), activity)) {
            return;
        }
        this.f24055e = false;
        start();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.f(activity, "activity");
        Activity activity2 = (Activity) this.f.get();
        if (activity2 == null || !activity2.equals(activity)) {
            return;
        }
        this.f24055e = true;
        if (getCurrentPosition() != 0) {
            this.k = getCurrentPosition();
        }
        pause();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mp) {
        Intrinsics.f(mp, "mp");
        InterfaceC3333z5 interfaceC3333z5 = this.f24052a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("MediaRenderView", ">>> onCompletion");
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mp, int i2, int i3) {
        Intrinsics.f(mp, "mp");
        InterfaceC3333z5 interfaceC3333z5 = this.f24052a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).b("MediaRenderView", ">>> onError (" + i2 + ", " + i3 + ')');
        }
        b();
        return false;
    }

    @Override // android.widget.VideoView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        getHolder().setSizeFromLayout();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mp) {
        InterfaceC3333z5 interfaceC3333z5;
        Intrinsics.f(mp, "mp");
        InterfaceC3333z5 interfaceC3333z6 = this.f24052a;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a("MediaRenderView", ">>> onPrepared");
        }
        mp.setOnVideoSizeChangedListener(new C0888e0(this, 1));
        int i2 = this.k;
        if (i2 < getDuration()) {
            this.k = i2;
            seekTo(i2);
        }
        InterfaceC3255u7 interfaceC3255u7 = this.d;
        if (interfaceC3255u7 != null && (interfaceC3333z5 = ((E7) interfaceC3255u7).f22799a.f22818b) != null) {
            ((A5) interfaceC3333z5).a("MraidMediaProcessor", ">>> onPlayerPrepared");
        }
        start();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i2) {
        Context contextD;
        Intrinsics.f(view, "view");
        super.onVisibilityChanged(view, i2);
        InterfaceC3333z5 interfaceC3333z5 = this.f24052a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("MediaRenderView", ">>> onVisibilityChanged (" + i2 + ')');
        }
        if (i2 != 0 || (contextD = Uc.d()) == null) {
            return;
        }
        setBackground(new BitmapDrawable(contextD.getResources(), (Bitmap) null));
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        InterfaceC3333z5 interfaceC3333z5 = this.f24052a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("MediaRenderView", ">>> onWindowVisibilityChanged (" + i2 + ')');
        }
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC3333z5 interfaceC3333z5 = this.f24052a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("MediaRenderView", "Pause media playback");
        }
        super.pause();
    }

    public final void setAudioMuted(boolean z2) {
    }

    public final void setCurrentAudioVolume(int i2) {
        this.g = i2;
    }

    public final void setId(String str) {
        this.f24056h = str;
    }

    public final void setListener(InterfaceC3255u7 interfaceC3255u7) {
        this.d = interfaceC3255u7;
    }

    public final void setMCurrentPosition(int i2) {
        this.k = i2;
    }

    public final void setPlaybackData(String url) {
        String str;
        Intrinsics.f(url, "url");
        byte[] bytes = url.getBytes(Charsets.f44691a);
        Intrinsics.e(bytes, "this as java.lang.String).getBytes(charset)");
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bytes) {
            if (((byte) (b2 & (-128))) > 0) {
                sb.append("%");
                char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
                sb.append(new String(new char[]{cArr[(b2 >> 4) & 15], cArr[(byte) (b2 & 15)]}));
            } else {
                sb.append((char) b2);
            }
        }
        try {
            String string = sb.toString();
            Intrinsics.e(string, "toString(...)");
            byte[] bytes2 = string.getBytes(Charsets.f44691a);
            Intrinsics.e(bytes2, "this as java.lang.String).getBytes(charset)");
            str = new String(bytes2, Charsets.f44692b);
        } catch (UnsupportedEncodingException unused) {
            str = "";
        }
        this.f24057i = str;
        this.f24056h = "anonymous";
    }

    public final void setPlaybackUrl(String str) {
        this.f24057i = str;
    }

    public final void setPlayerPrepared(boolean z2) {
    }

    public final void setPreviousPosition(int i2) {
        this.j = i2;
    }

    public final void setViewContainer(ViewGroup viewGroup) {
        this.f24054c = viewGroup;
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void start() {
        if (this.f24055e) {
            return;
        }
        InterfaceC3333z5 interfaceC3333z5 = this.f24052a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("MediaRenderView", "Start media playback");
        }
        super.start();
    }

    public final void a() {
        setVideoPath(this.f24057i);
        setOnCompletionListener(this);
        setOnPreparedListener(this);
        setOnErrorListener(this);
        if (this.f24053b == null) {
            C3239t7 c3239t7 = new C3239t7(getContext());
            this.f24053b = c3239t7;
            c3239t7.setAnchorView(this);
            setMediaController(this.f24053b);
        }
    }
}
