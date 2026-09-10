package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TextureViewSurfaceTextureListenerC1267am extends TextureView implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, MediaPlayer.OnSeekCompleteListener, TextureView.SurfaceTextureListener, JG {
    public static byte[] A0O;
    public static String[] A0P = {"8kg0gsxxraVcY9760AfDDdqqLp5YK9AT", "N8j2Ddyx", "HVNw4PtkXrEg8LlUN7XWbo", "maxPy5SeUtgOYTWaW", "FkAKyJNQQf2eCz2ilXM7tuAli1jbjSs3", "vA9Mb9Xk6BXUb", "TQHC", "vy65DpAohCvDmaIHVnToJ2EB52e80kqi"};
    public static final String A0Q;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public MediaPlayer A06;
    public Uri A07;
    public Surface A08;
    public View A09;
    public MediaController A0A;
    public IP A0B;
    public JI A0C;
    public JI A0D;
    public JJ A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final long A0L;
    public final MediaController.MediaPlayerControl A0M;
    public final C1828k1 A0N;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0O, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0O = new byte[]{115, 125, 113, 115, -74, -55, -59, -61, -78, 115, 113, -117, 113, 115, -54, 37, -115, -85, -72, -72, -71, -66, 106, -70, -68, -81, -70, -85, -68, -81, 106, -73, -81, -82, -77, -85, 106, -70, -74, -85, -61, -81, -68, 106, -63, -77, -66, -78, 106, -99, -65, -68, -80, -85, -83, -81, -98, -81, -62, -66, -65, -68, -81, -124, 106, -70, -26, -20, -29, -37, -27, -98, -21, -105, -23, -36, -21, -23, -32, -36, -19, -36, -105, -19, -32, -37, -36, -26, -105, -32, -27, -35, -26, -23, -28, -40, -21, -32, -26, -27, -47, -20, -12, -9, -16, -17, -85, -1, -6, -85, -6, -5, -16, -7, -85, -20, -2, -2, -16, -1, -2, -104, -64, -64, -72, -67, -74, 113, -78, -67, -56, -78, -54, -60, 113, -59, -71, -61, -64, -56, 113, -78, -65, 113, -74, -55, -76, -74, -63, -59, -70, -64, -65, 113, -56, -70, -59, -71, 113, -60, -74, -59, -109, -78, -76, -68, -72, -61, -64, -58, -65, -75, -107, -61, -78, -56, -78, -77, -67, -74, 113, -64, -65, 113, -97, -64, -58, -72, -78, -59, 113, -78, -77, -64, -57, -74, 127, 113, -60, -64, 113, -56, -74, 113, -60, -70, -67, -74, -65, -59, -67, -54, 113, -70, -72, -65, -64, -61, -74, 113, -70, -59, 127, -23, 17, 17, 9, cw.l, 7, -62, 3, cw.l, 25, 3, 27, 21, -62, 22, 10, 20, 17, 25, -62, 3, cw.n, -62, 7, 26, 5, 7, 18, 22, 11, 17, cw.n, -62, 25, 11, 22, 10, -62, 21, 7, 22, -24, 17, 20, 7, 9, 20, 17, 23, cw.n, 6, -62, 17, cw.n, -62, -16, 17, 23, 9, 3, 22, -62, 3, 4, 17, 24, 7, -48, -62, 21, 17, -62, 25, 7, -62, 21, 11, cw.l, 7, cw.n, 22, cw.l, 27, -62, 11, 9, cw.n, 17, 20, 7, -62, 11, 22, -48, -47, -22, -35, -34, -24, -31, -100, -16, -21, -100, -33, -24, -21, -17, -31, -13, cw.n, 7, -66, 17, 6, cw.k, 19, 10, 2, -66, 12, cw.k, 18, -66, 0, 3, -66, 3, 11, cw.l, 18, 23, -52, -4, cw.m, 10, 11, 21, -58, 25, 26, 7, 26, 11, -58, 9, cw.l, 7, 20, cw.k, 11, 10, -58, 26, 21, -58, -97, -79, -79, -93, -78, 26, 22, 11, 35, cw.m, 28, 12, -77, 8, -7, -14, 5, -77, -79, -53, -79, -77};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (C05789m.A1t(this.A0N)) {
            MediaPlayer mediaPlayer = this.A06;
            if (A0P[4].charAt(10) != '2') {
                throw new RuntimeException();
            }
            A0P[4] = "ZKmo0lxTtT2mJSQRRhI8B7lsvNxlt9ka";
            if (mediaPlayer == null || !A07()) {
                return;
            }
            if (!this.A0I) {
                this.A0I = true;
                this.A0N.A0F().AI9();
            }
            long currentPosition = getCurrentPosition();
            long currentPosition2 = getCurrentPosition();
            long jCurrentTimeMillis = System.currentTimeMillis();
            float volume = getVolume();
            if (this.A0E != null) {
                this.A0E.ADD(currentPosition, currentPosition2, jCurrentTimeMillis, volume);
            }
        }
    }

    static {
        A04();
        A0Q = TextureViewSurfaceTextureListenerC1267am.class.getSimpleName();
    }

    public TextureViewSurfaceTextureListenerC1267am(C1828k1 c1828k1) {
        super(c1828k1);
        this.A0C = JI.A04;
        this.A0D = JI.A04;
        this.A0J = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0K = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = IP.A03;
        this.A0M = new JD(this);
        this.A0I = false;
        this.A0N = c1828k1;
    }

    public TextureViewSurfaceTextureListenerC1267am(C1828k1 c1828k1, AttributeSet attributeSet) {
        super(c1828k1, attributeSet);
        this.A0C = JI.A04;
        this.A0D = JI.A04;
        this.A0J = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0K = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = IP.A03;
        this.A0M = new JD(this);
        this.A0I = false;
        this.A0N = c1828k1;
    }

    public TextureViewSurfaceTextureListenerC1267am(C1828k1 c1828k1, AttributeSet attributeSet, int i) {
        super(c1828k1, attributeSet, i);
        this.A0C = JI.A04;
        this.A0D = JI.A04;
        this.A0J = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0K = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = IP.A03;
        this.A0M = new JD(this);
        this.A0I = false;
        this.A0N = c1828k1;
    }

    private final void A05(MediaPlayer mediaPlayer, Uri uri) {
        String strA03 = A03(317, 15, 64);
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            try {
                try {
                    String uriPath = uri.getPath();
                    if (!TextUtils.isEmpty(uriPath)) {
                        AssetFileDescriptor assetFileDescriptorOpenFd = getContext().getAssets().openFd(uriPath.substring(1));
                        mediaPlayer.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                        if (assetFileDescriptorOpenFd != null) {
                            assetFileDescriptorOpenFd.close();
                            return;
                        }
                        return;
                    }
                    throw new IOException(A03(332, 24, 98));
                } catch (IOException | SecurityException e) {
                    Log.w(A0Q, A03(100, 21, 79), e);
                    setVideoState(JI.A03);
                    this.A0N.A0F().A3Y(2);
                    if (0 != 0) {
                        assetFileDescriptor.close();
                    }
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException e2) {
                        Log.w(A0Q, strA03, e2);
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            String str = A0Q;
            if (A0P[6].length() != 4) {
                throw new RuntimeException();
            }
            A0P[3] = "IDdSaYeoVr3R4FZ1u";
            Log.w(str, strA03, e3);
        }
    }

    private boolean A06() {
        return (this.A0C == JI.A08 || this.A0C == JI.A07) ? false : true;
    }

    private boolean A07() {
        return this.A0C == JI.A07 || this.A0C == JI.A0A || this.A0C == JI.A05 || this.A0C == JI.A06;
    }

    private boolean A08() {
        return (this.A0C == JI.A08 || this.A0C == JI.A07) ? false : true;
    }

    private boolean A09() {
        if (this.A06 == null) {
            return false;
        }
        try {
            this.A06.reset();
            return true;
        } catch (IllegalStateException e) {
            this.A0N.A08().AAu(A03(384, 6, 110), AbstractC05418a.A2H, new C05428b(e));
            return false;
        }
    }

    private boolean A0A(Surface surface) {
        if (this.A06 == null) {
            return false;
        }
        try {
            this.A06.setSurface(surface);
            return true;
        } catch (IllegalStateException e) {
            this.A0N.A08().AAu(A03(384, 6, 110), AbstractC05418a.A2I, new C05428b(e));
            return false;
        }
    }

    public final /* synthetic */ void A0C() {
        Activity activity = this.A0N.A0E();
        if (activity != null && activity.isInMultiWindowMode()) {
            return;
        }
        A9T();
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public final void A9T() {
        if (!this.A0F) {
            AFz(false, 3);
        }
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public final boolean A9g() {
        if (this.A06 == null) {
            return false;
        }
        try {
            for (MediaPlayer.TrackInfo trackInfo : this.A06.getTrackInfo()) {
                if (trackInfo.getTrackType() == 2) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e) {
            Log.e(A0Q, A03(65, 35, 59), e);
            return true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public final boolean A9h() {
        return this.A0K;
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public final boolean AAR() {
        return this.A0J;
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public final void AFz(boolean z, int i) {
        this.A0N.A0F().A3U(i);
        this.A0D = JI.A05;
        if (this.A06 != null) {
            if (!A06()) {
                return;
            }
            this.A0J = z;
            this.A06.pause();
            if (this.A0C != JI.A06) {
                setVideoState(JI.A05);
                return;
            }
            return;
        }
        setVideoState(JI.A04);
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public final void AJ7(int i) {
        this.A0N.A0F().ABs(i);
        setVideoState(JI.A09);
        AJK(5);
        this.A03 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public final void AJC(IP ip, int i) {
        this.A0N.A0F().A3f(i);
        this.A0J = false;
        this.A0D = JI.A0A;
        this.A0B = ip;
        if (this.A0C == JI.A0A || this.A0C == JI.A07 || this.A0C == JI.A04 || this.A0C == JI.A05 || this.A0C == JI.A06) {
            if (this.A06 == null) {
                setup(this.A07);
            } else {
                if (this.A03 > 0) {
                    this.A06.seekTo(this.A03);
                }
                this.A06.start();
                if (this.A0C != JI.A07 || this.A0K) {
                    setVideoState(JI.A0A);
                }
            }
        }
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public final void AJK(int i) {
        this.A0N.A0F().A3h(i);
        this.A0D = JI.A04;
        if (this.A06 != null) {
            int currentPosition = this.A06.getCurrentPosition();
            if (currentPosition > 0) {
                this.A03 = currentPosition;
            }
            this.A06.stop();
            A09();
            this.A06.release();
            this.A06 = null;
            if (this.A0A != null) {
                this.A0A.hide();
                this.A0A.setEnabled(false);
            }
        }
        setVideoState(JI.A04);
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public final void destroy() {
        if (this.A06 != null) {
            A0A(null);
            this.A06.setOnBufferingUpdateListener(null);
            this.A06.setOnCompletionListener(null);
            this.A06.setOnErrorListener(null);
            MediaPlayer mediaPlayer = this.A06;
            if (A0P[1].length() == 0) {
                throw new RuntimeException();
            }
            A0P[3] = "r7bVcQo0vwDc4SuX1";
            mediaPlayer.setOnInfoListener(null);
            this.A06.setOnPreparedListener(null);
            this.A06.setOnVideoSizeChangedListener(null);
            this.A06.setOnSeekCompleteListener(null);
            A09();
            this.A06 = null;
            setVideoState(JI.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public int getCurrentPosition() {
        if (this.A06 == null || !A07()) {
            return 0;
        }
        return this.A06.getCurrentPosition();
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public int getDuration() {
        if (this.A06 == null || !A07()) {
            return 0;
        }
        return this.A06.getDuration();
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public long getInitialBufferTime() {
        return this.A0L;
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public IP getStartReason() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public JI getState() {
        return this.A0C;
    }

    public JI getTargetState() {
        return this.A0D;
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public int getVideoHeight() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public int getVideoWidth() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.View
    public final boolean isHardwareAccelerated() {
        return super.isHardwareAccelerated();
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isHardwareAccelerated()) {
            setVideoState(JI.A03);
            this.A0N.A0F().A3Y(5);
            AJK(8);
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (this.A06 != null) {
            this.A06.pause();
        }
        setVideoState(JI.A06);
        seekTo(0);
        this.A03 = 0;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.A0N.A0F().ABr(A03(390, 11, 85) + i + A03(0, 14, 21) + i2 + A03(14, 2, 108));
        if (this.A01 > 0 && getState() == JI.A0A) {
            this.A01--;
            AJK(6);
            AJC(this.A0B, 10);
        } else {
            setVideoState(JI.A03);
            this.A0N.A0F().A3Y(1);
            AJK(7);
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        switch (i) {
            case 3:
                this.A0K = true;
                if (this.A0D == JI.A0A) {
                    setVideoState(JI.A0A);
                }
                return true;
            case TypedValues.TransitionType.TYPE_FROM /* 701 */:
                setVideoState(JI.A02);
                return false;
            case TypedValues.TransitionType.TYPE_TO /* 702 */:
                if (!A08()) {
                    return false;
                }
                setVideoState(JI.A0A);
                return false;
            default:
                return false;
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        setVideoState(JI.A07);
        if (this.A0H && !this.A0G) {
            Activity activityA0E = this.A0N.A0E();
            if (activityA0E != null) {
                this.A0A = new MediaController(activityA0E);
                this.A0A.setAnchorView(this.A09 == null ? this : this.A09);
                this.A0A.setMediaPlayer(this.A0M);
                this.A0A.setEnabled(true);
            } else {
                this.A0A = null;
            }
        }
        setRequestedVolume(this.A00);
        this.A05 = mediaPlayer.getVideoWidth();
        this.A04 = mediaPlayer.getVideoHeight();
        if (this.A03 > 0) {
            int i = this.A03;
            MediaPlayer mediaPlayer2 = this.A06;
            if (A0P[3].length() != 17) {
                throw new RuntimeException();
            }
            A0P[5] = "vYKpudhGuKF00mC0lqJEZv1Z";
            if (i >= mediaPlayer2.getDuration()) {
                this.A03 = 0;
            }
            this.A06.seekTo(this.A03);
            this.A03 = 0;
        }
        if (this.A0D == JI.A0A) {
            AJC(this.A0B, 8);
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        if (this.A0E == null) {
            return;
        }
        this.A0E.AF1(this.A02, this.A03);
        this.A03 = 0;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.A08 == null) {
            this.A08 = new Surface(surfaceTexture);
        }
        if (!A0A(this.A08)) {
            setVideoState(JI.A03);
            this.A0N.A0F().A3Y(4);
            destroy();
        } else if (this.A0C == JI.A05 && !this.A0J) {
            AJC(this.A0B, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        A0A(null);
        if (this.A08 != null) {
            this.A08.release();
            this.A08 = null;
        }
        if (this.A0C != JI.A05) {
            AFz(false, 5);
            return true;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        this.A05 = mediaPlayer.getVideoWidth();
        this.A04 = mediaPlayer.getVideoHeight();
        if (this.A05 != 0 && this.A04 != 0) {
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.A06 == null) {
            return;
        }
        if (this.A0A != null && this.A0A.isShowing()) {
            return;
        }
        if (!z) {
            if (this.A0C != JI.A05) {
                if (!this.A0N.A0H().A01()) {
                    boolean zA1x = C05789m.A1x(this.A0N);
                    if (A0P[2].length() != 22) {
                        throw new RuntimeException();
                    }
                    A0P[5] = "q2iXdwHPhxMMYJm8CrOmbfqNZQSE";
                    if (zA1x) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.JC
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.A00.A0C();
                                }
                            }, 1000L);
                            return;
                        }
                    }
                } else if (Build.VERSION.SDK_INT >= 24) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.JC
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.A00.A0C();
                        }
                    }, 1000L);
                    return;
                }
                A9T();
                return;
            }
            return;
        }
        JI ji = this.A0C;
        JI ji2 = JI.A05;
        if (A0P[6].length() == 4) {
            A0P[6] = "r8oy";
            if (ji != ji2) {
                return;
            }
        } else if (ji != ji2) {
            return;
        }
        if (!this.A0J) {
            IP ip = this.A0B;
            if (A0P[3].length() != 17) {
                throw new RuntimeException();
            }
            A0P[1] = "grk6xKjGgtFswoEyrqXB";
            AJC(ip, 9);
        }
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public final void seekTo(int i) {
        if (this.A06 != null && A07()) {
            if (i < getDuration() && i > 0) {
                this.A02 = getCurrentPosition();
                this.A03 = i;
                this.A06.seekTo(i);
                return;
            }
            return;
        }
        this.A03 = i;
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0Q, A03(121, 102, 21));
        }
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public void setBackgroundPlaybackEnabled(boolean z) {
        this.A0F = z;
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public void setControlsAnchorView(View view) {
        this.A09 = view;
        view.setOnTouchListener(new JF(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0Q, A03(EnumC4719u30.STALE_CACHED_RESPONSE_VALUE, 94, 102));
        }
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public void setFullScreen(boolean z) {
        this.A0H = z;
        if (this.A0H && !this.A0G) {
            setOnTouchListener(new JE(this));
        }
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public void setRequestedVolume(float f) {
        this.A00 = f;
        if (this.A06 == null || this.A0C == JI.A08) {
            return;
        }
        JI ji = this.A0C;
        String[] strArr = A0P;
        if (strArr[0].charAt(16) == strArr[7].charAt(16)) {
            throw new RuntimeException();
        }
        A0P[3] = "xC5rxgqNbqLUjjPrr";
        if (ji != JI.A04) {
            this.A06.setVolume(f, f);
        }
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public void setVideoMPD(String str) {
    }

    private void setVideoState(JI ji) {
        if (ji != this.A0C) {
            if (this.A0N.A05().AAD()) {
                String str = A03(356, 23, 106) + ji;
            }
            this.A0C = ji;
            if (this.A0E != null) {
                this.A0E.AFl(ji);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public void setVideoStateChangeListener(JJ jj) {
        this.A0E = jj;
    }

    @Override // com.facebook.ads.redexgen.core.JG
    public void setup(Uri uri) {
        MediaPlayer mediaPlayer;
        this.A0N.A0F().A3X();
        this.A0K = false;
        this.A07 = uri;
        if (this.A06 != null) {
            A09();
            A0A(null);
            mediaPlayer = this.A06;
            setVideoState(JI.A04);
        } else {
            mediaPlayer = new MediaPlayer();
        }
        try {
            if (uri.getScheme().equals(A03(379, 5, 2))) {
                A05(mediaPlayer, uri);
            } else {
                mediaPlayer.setDataSource(uri.toString());
            }
            mediaPlayer.setLooping(false);
            mediaPlayer.setOnBufferingUpdateListener(this);
            mediaPlayer.setOnCompletionListener(this);
            mediaPlayer.setOnErrorListener(this);
            mediaPlayer.setOnInfoListener(this);
            mediaPlayer.setOnPreparedListener(this);
            mediaPlayer.setOnVideoSizeChangedListener(this);
            mediaPlayer.setOnSeekCompleteListener(this);
            mediaPlayer.prepareAsync();
            this.A06 = mediaPlayer;
            setVideoState(JI.A08);
        } catch (Exception e) {
            setVideoState(JI.A03);
            this.A0N.A0F().A3Y(3);
            mediaPlayer.release();
            Log.e(A0Q, A03(16, 49, 14) + e);
        }
        setSurfaceTextureListener(this);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }
}
