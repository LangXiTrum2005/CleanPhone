package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w00 extends z00 implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final HashMap f21336t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b30 f21337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k10 f21338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yh0 f21340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaPlayer f21343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Uri f21344j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21345k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f21346m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i10 f21347n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f21348o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f21349p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public d10 f21350q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f21351r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Integer f21352s;

    static {
        HashMap map = new HashMap();
        f21336t = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(Integer.valueOf(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(Integer.valueOf(IronSourceError.ERROR_NT_LOAD_AFTER_LONG_INITIATION), "MEDIA_INFO_BUFFERING_START");
        map.put(Integer.valueOf(IronSourceError.ERROR_NT_INIT_FAILED_AFTER_LOAD), "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        map.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public w00(Context context, b30 b30Var, boolean z10, boolean z11, k10 k10Var, yh0 yh0Var) {
        super(context);
        this.f21341g = 0;
        this.f21342h = 0;
        this.f21351r = false;
        this.f21352s = null;
        this.f21337c = b30Var;
        this.f21338d = k10Var;
        this.f21348o = z10;
        this.f21339e = z11;
        k10Var.a(this);
        this.f21340f = yh0Var;
    }

    public final void B() {
        SurfaceTexture surfaceTexture;
        yh0 yh0Var;
        zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture2 = getSurfaceTexture();
        if (this.f21344j == null || surfaceTexture2 == null) {
            return;
        }
        C(false);
        try {
            zzt.zzv();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f21343i = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f21343i.setOnCompletionListener(this);
            this.f21343i.setOnErrorListener(this);
            this.f21343i.setOnInfoListener(this);
            this.f21343i.setOnPreparedListener(this);
            this.f21343i.setOnVideoSizeChangedListener(this);
            this.f21346m = 0;
            if (this.f21348o) {
                if (((Boolean) zzba.zzc().a(am.We)).booleanValue() && (yh0Var = this.f21340f) != null) {
                    lj1 lj1VarA = yh0Var.a();
                    lj1VarA.l("action", "svp_ampv");
                    lj1VarA.m();
                }
                i10 i10Var = new i10(getContext());
                this.f21347n = i10Var;
                int width = getWidth();
                int height = getHeight();
                i10Var.f15480m = width;
                i10Var.l = height;
                i10Var.f15482o = surfaceTexture2;
                i10 i10Var2 = this.f21347n;
                i10Var2.start();
                if (i10Var2.f15482o == null) {
                    surfaceTexture = null;
                } else {
                    try {
                        i10Var2.f15487t.await();
                    } catch (InterruptedException unused) {
                    }
                    surfaceTexture = i10Var2.f15481n;
                }
                if (surfaceTexture != null) {
                    surfaceTexture2 = surfaceTexture;
                } else {
                    this.f21347n.b();
                    this.f21347n = null;
                }
            }
            this.f21343i.setDataSource(getContext(), this.f21344j);
            zzt.zzw();
            this.f21343i.setSurface(new Surface(surfaceTexture2));
            this.f21343i.setAudioStreamType(3);
            this.f21343i.setScreenOnWhilePlaying(true);
            this.f21343i.prepareAsync();
            E(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e10) {
            zzo.zzj("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f21344j)), e10);
            onError(this.f21343i, 1, 0);
        }
    }

    public final void C(boolean z10) {
        zze.zza("AdMediaPlayerView release");
        i10 i10Var = this.f21347n;
        if (i10Var != null) {
            i10Var.b();
            this.f21347n = null;
        }
        MediaPlayer mediaPlayer = this.f21343i;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f21343i.release();
            this.f21343i = null;
            E(0);
            if (z10) {
                this.f21342h = 0;
            }
        }
    }

    public final boolean D() {
        int i10;
        return (this.f21343i == null || (i10 = this.f21341g) == -1 || i10 == 0 || i10 == 1) ? false : true;
    }

    public final void E(int i10) {
        m10 m10Var = this.f22442b;
        k10 k10Var = this.f21338d;
        if (i10 == 3) {
            k10Var.d();
            m10Var.f17206d = true;
            m10Var.a();
        } else if (this.f21341g == 3) {
            k10Var.f16258m = false;
            m10Var.f17206d = false;
            m10Var.a();
        }
        this.f21341g = i10;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final String h() {
        return "MediaPlayer".concat(true != this.f21348o ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void i(d10 d10Var) {
        this.f21350q = d10Var;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void j(String str) {
        Uri uri = Uri.parse(str);
        ij ijVarB = ij.b(uri);
        if (ijVarB == null || ijVarB.f15758a != null) {
            if (ijVarB != null) {
                uri = Uri.parse(ijVarB.f15758a);
            }
            this.f21344j = uri;
            this.f21349p = 0;
            B();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void k() {
        zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f21343i;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f21343i.release();
            this.f21343i = null;
            E(0);
            this.f21342h = 0;
        }
        this.f21338d.b();
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void l() {
        zze.zza("AdMediaPlayerView play");
        if (D()) {
            this.f21343i.start();
            E(3);
            this.f22441a.f14655c = true;
            zzs.zza.post(new u00(this, 3));
        }
        this.f21342h = 3;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void m() {
        zze.zza("AdMediaPlayerView pause");
        if (D() && this.f21343i.isPlaying()) {
            this.f21343i.pause();
            E(4);
            zzs.zza.post(new u00(this, 4));
        }
        this.f21342h = 4;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final int n() {
        if (D()) {
            return this.f21343i.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final int o() {
        if (D()) {
            return this.f21343i.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        this.f21346m = i10;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        zze.zza("AdMediaPlayerView completion");
        E(5);
        this.f21342h = 5;
        zzs.zza.post(new u00(this, 0));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = f21336t;
        String str = (String) map.get(numValueOf);
        String str2 = (String) map.get(Integer.valueOf(i11));
        String strH = d5.u.h(new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length()), "AdMediaPlayerView MediaPlayer error: ", str, ":", str2);
        int i12 = zze.zza;
        zzo.zzi(strH);
        E(-1);
        this.f21342h = -1;
        zzs.zza.post(new o1(this, str, str2, false, 4));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = f21336t;
        String str = (String) map.get(numValueOf);
        String str2 = (String) map.get(Integer.valueOf(i11));
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb2.append("AdMediaPlayerView MediaPlayer info: ");
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        zze.zza(sb2.toString());
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int defaultSize = View.getDefaultSize(this.f21345k, i10);
        int defaultSize2 = View.getDefaultSize(this.l, i11);
        if (this.f21345k > 0 && this.l > 0 && this.f21347n == null) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i11);
            if (mode != 1073741824) {
                if (mode == 1073741824) {
                    i15 = (this.l * size) / this.f21345k;
                    if (mode2 == Integer.MIN_VALUE || i15 <= size2) {
                        defaultSize2 = i15;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                } else {
                    if (mode2 == 1073741824) {
                        i14 = (this.f21345k * size2) / this.l;
                        if (mode != Integer.MIN_VALUE && i14 > size) {
                            defaultSize = size;
                        }
                        defaultSize2 = size2;
                    } else {
                        i12 = this.f21345k;
                        i13 = this.l;
                        if (mode2 == Integer.MIN_VALUE || i13 <= size2) {
                            i14 = i12;
                            size2 = i13;
                        } else {
                            i14 = (size2 * i12) / i13;
                        }
                        if (mode == Integer.MIN_VALUE && i14 > size) {
                            defaultSize2 = (i13 * size) / i12;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i14;
                    defaultSize2 = size2;
                }
            } else if (mode2 == 1073741824) {
                int i16 = this.f21345k;
                int i17 = i16 * size2;
                int i18 = this.l;
                int i19 = size * i18;
                if (i17 < i19) {
                    defaultSize = i17 / i18;
                } else {
                    if (i17 > i19) {
                        defaultSize2 = i19 / i16;
                        defaultSize = size;
                    }
                    defaultSize = size;
                }
                defaultSize2 = size2;
            } else {
                mode = 1073741824;
                if (mode == 1073741824) {
                    i15 = (this.l * size) / this.f21345k;
                    if (mode2 == Integer.MIN_VALUE) {
                    }
                    defaultSize2 = i15;
                    defaultSize = size;
                } else {
                    if (mode2 == 1073741824) {
                        i14 = (this.f21345k * size2) / this.l;
                        if (mode != Integer.MIN_VALUE) {
                        }
                    } else {
                        i12 = this.f21345k;
                        i13 = this.l;
                        if (mode2 == Integer.MIN_VALUE) {
                            i14 = i12;
                            size2 = i13;
                        } else {
                            i14 = i12;
                            size2 = i13;
                        }
                        if (mode == Integer.MIN_VALUE) {
                            defaultSize2 = (i13 * size) / i12;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i14;
                    defaultSize2 = size2;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        i10 i10Var = this.f21347n;
        if (i10Var != null) {
            i10Var.a(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        zze.zza("AdMediaPlayerView prepared");
        E(2);
        k10 k10Var = this.f21338d;
        if (k10Var.f16255i && !k10Var.f16256j) {
            pi1.j(k10Var.f16251e, k10Var.f16250d, "vfr2");
            k10Var.f16256j = true;
        }
        zzs.zza.post(new zd1(this, false, mediaPlayer, 12));
        this.f21345k = mediaPlayer.getVideoWidth();
        this.l = mediaPlayer.getVideoHeight();
        int i10 = this.f21349p;
        if (i10 != 0) {
            p(i10);
        }
        if (this.f21339e && D() && this.f21343i.getCurrentPosition() > 0 && this.f21342h != 3) {
            zze.zza("AdMediaPlayerView nudging MediaPlayer");
            MediaPlayer mediaPlayer2 = this.f21343i;
            if (mediaPlayer2 != null) {
                try {
                    mediaPlayer2.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } catch (IllegalStateException unused) {
                }
            } else {
                zzo.zzi("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            }
            this.f21343i.start();
            int currentPosition = this.f21343i.getCurrentPosition();
            ((p9.b) zzt.zzk()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (D() && this.f21343i.getCurrentPosition() == currentPosition) {
                ((p9.b) zzt.zzk()).getClass();
                if (System.currentTimeMillis() - jCurrentTimeMillis > 250) {
                    break;
                }
            }
            this.f21343i.pause();
            zzq();
        }
        int i11 = this.f21345k;
        int i12 = this.l;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 40 + String.valueOf(i12).length());
        sb2.append("AdMediaPlayerView stream dimensions: ");
        sb2.append(i11);
        sb2.append(" x ");
        sb2.append(i12);
        zzo.zzh(sb2.toString());
        if (this.f21342h == 3) {
            l();
        }
        zzq();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        zze.zza("AdMediaPlayerView surface created");
        B();
        zzs.zza.post(new u00(this, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f21343i;
        if (mediaPlayer != null && this.f21349p == 0) {
            this.f21349p = mediaPlayer.getCurrentPosition();
        }
        i10 i10Var = this.f21347n;
        if (i10Var != null) {
            i10Var.b();
        }
        zzs.zza.post(new u00(this, 2));
        C(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        zze.zza("AdMediaPlayerView surface changed");
        int i12 = this.f21342h;
        boolean z10 = false;
        if (this.f21345k == i10 && this.l == i11) {
            z10 = true;
        }
        if (this.f21343i != null && i12 == 3 && z10) {
            int i13 = this.f21349p;
            if (i13 != 0) {
                p(i13);
            }
            l();
        }
        i10 i10Var = this.f21347n;
        if (i10Var != null) {
            i10Var.a(i10, i11);
        }
        zzs.zza.post(new v00(this, i10, i11, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f21338d.c(this);
        this.f22441a.a(surfaceTexture, this.f21350q);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 35 + String.valueOf(i11).length());
        sb2.append("AdMediaPlayerView size changed: ");
        sb2.append(i10);
        sb2.append(" x ");
        sb2.append(i11);
        zze.zza(sb2.toString());
        this.f21345k = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.l = videoHeight;
        if (this.f21345k == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 47);
        sb2.append("AdMediaPlayerView window visibility changed to ");
        sb2.append(i10);
        zze.zza(sb2.toString());
        zzs.zza.post(new com.google.android.gms.common.api.internal.q(i10, 3, this));
        super.onWindowVisibilityChanged(i10);
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void p(int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 23);
        sb2.append("AdMediaPlayerView seek ");
        sb2.append(i10);
        zze.zza(sb2.toString());
        if (!D()) {
            this.f21349p = i10;
        } else {
            this.f21343i.seekTo(i10);
            this.f21349p = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void q(float f10, float f11) {
        i10 i10Var = this.f21347n;
        if (i10Var != null) {
            i10Var.c(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final int r() {
        MediaPlayer mediaPlayer = this.f21343i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final int s() {
        MediaPlayer mediaPlayer = this.f21343i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final long t() {
        if (this.f21352s != null) {
            return (v() * ((long) this.f21346m)) / 100;
        }
        return -1L;
    }

    @Override // android.view.View
    public final String toString() {
        String name = w00.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return q4.a.j(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final long u() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final long v() {
        if (this.f21352s != null) {
            return ((long) n()) * ((long) this.f21352s.intValue());
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final int w() {
        if (D()) {
            return this.f21343i.getMetrics().getInt("android.media.mediaplayer.dropped");
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.l10
    public final void zzq() {
        m10 m10Var = this.f22442b;
        boolean z10 = m10Var.f17207e;
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f11 = z10 ? 0.0f : m10Var.f17208f;
        if (m10Var.f17205c) {
            f10 = f11;
        }
        MediaPlayer mediaPlayer = this.f21343i;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f10, f10);
            } catch (IllegalStateException unused) {
            }
        } else {
            int i10 = zze.zza;
            zzo.zzi("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }
}
