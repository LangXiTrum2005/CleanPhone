package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.applovin.impl.Z;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzceo extends zzceq implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    private static final Map zzc;
    private final zzcfk zzd;
    private final zzcfl zze;
    private final boolean zzf;
    private final zzdxe zzg;
    private int zzh;
    private int zzi;
    private MediaPlayer zzj;
    private Uri zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private zzcfi zzo;
    private final boolean zzp;
    private int zzq;
    private zzcep zzr;
    private boolean zzs;
    private Integer zzt;

    static {
        HashMap map = new HashMap();
        zzc = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(Integer.valueOf(IronSourceError.ERROR_NT_LOAD_AFTER_LONG_INITIATION), "MEDIA_INFO_BUFFERING_START");
        map.put(Integer.valueOf(IronSourceError.ERROR_NT_INIT_FAILED_AFTER_LOAD), "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(Integer.valueOf(com.smartdigimkt.d2.a.s), "MEDIA_INFO_METADATA_UPDATE");
        map.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(Integer.valueOf(com.smartdigimkt.d2.a.h0), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzceo(Context context, zzcfk zzcfkVar, boolean z2, boolean z3, zzcfj zzcfjVar, zzcfl zzcflVar, zzdxe zzdxeVar) {
        super(context);
        this.zzh = 0;
        this.zzi = 0;
        this.zzs = false;
        this.zzt = null;
        this.zzd = zzcfkVar;
        this.zze = zzcflVar;
        this.zzp = z2;
        this.zzf = z3;
        zzcflVar.zza(this);
        this.zzg = zzdxeVar;
    }

    private final void zzD() {
        zzdxe zzdxeVar;
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzk == null || surfaceTexture == null) {
            return;
        }
        zzE(false);
        try {
            com.google.android.gms.ads.internal.zzt.zzv();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.zzj = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.zzj.setOnCompletionListener(this);
            this.zzj.setOnErrorListener(this);
            this.zzj.setOnInfoListener(this);
            this.zzj.setOnPreparedListener(this);
            this.zzj.setOnVideoSizeChangedListener(this);
            this.zzn = 0;
            if (this.zzp) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzoF)).booleanValue() && (zzdxeVar = this.zzg) != null) {
                    zzdxd zzdxdVarZza = zzdxeVar.zza();
                    zzdxdVarZza.zzc("action", "svp_ampv");
                    zzdxdVarZza.zzd();
                }
                zzcfi zzcfiVar = new zzcfi(getContext());
                this.zzo = zzcfiVar;
                zzcfiVar.zzb(surfaceTexture, getWidth(), getHeight());
                zzcfi zzcfiVar2 = this.zzo;
                zzcfiVar2.start();
                SurfaceTexture surfaceTextureZze = zzcfiVar2.zze();
                if (surfaceTextureZze != null) {
                    surfaceTexture = surfaceTextureZze;
                } else {
                    this.zzo.zzd();
                    this.zzo = null;
                }
            }
            this.zzj.setDataSource(getContext(), this.zzk);
            com.google.android.gms.ads.internal.zzt.zzw();
            this.zzj.setSurface(new Surface(surfaceTexture));
            this.zzj.setAudioStreamType(3);
            this.zzj.setScreenOnWhilePlaying(true);
            this.zzj.prepareAsync();
            zzH(1);
        } catch (IOException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzk)), e);
            onError(this.zzj, 1, 0);
        } catch (IllegalArgumentException e3) {
            e = e3;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzk)), e);
            onError(this.zzj, 1, 0);
        } catch (IllegalStateException e4) {
            e = e4;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzk)), e);
            onError(this.zzj, 1, 0);
        }
    }

    private final void zzE(boolean z2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView release");
        zzcfi zzcfiVar = this.zzo;
        if (zzcfiVar != null) {
            zzcfiVar.zzd();
            this.zzo = null;
        }
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzj.release();
            this.zzj = null;
            zzH(0);
            if (z2) {
                this.zzi = 0;
            }
        }
    }

    private final boolean zzF() {
        int i2;
        return (this.zzj == null || (i2 = this.zzh) == -1 || i2 == 0 || i2 == 1) ? false : true;
    }

    private final void zzG(float f) {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    private final void zzH(int i2) {
        if (i2 == 3) {
            this.zze.zze();
            this.zzb.zzd();
        } else if (this.zzh == 3) {
            this.zze.zzf();
            this.zzb.zze();
        }
        this.zzh = i2;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
        this.zzn = i2;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView completion");
        zzH(5);
        this.zzi = 5;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzceg(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        Map map = zzc;
        String str = (String) map.get(Integer.valueOf(i2));
        String str2 = (String) map.get(Integer.valueOf(i3));
        String strQ = androidx.media3.extractor.text.ttml.a.q(new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length()), "AdMediaPlayerView MediaPlayer error: ", str, ":", str2);
        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strQ);
        zzH(-1);
        this.zzi = -1;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzceh(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        Map map = zzc;
        String str = (String) map.get(Integer.valueOf(i2));
        String str2 = (String) map.get(Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int defaultSize = View.getDefaultSize(this.zzl, i2);
        int defaultSize2 = View.getDefaultSize(this.zzm, i3);
        if (this.zzl > 0 && this.zzm > 0 && this.zzo == null) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size2 = View.MeasureSpec.getSize(i3);
            if (mode != 1073741824) {
                if (mode == 1073741824) {
                    i7 = (this.zzm * size) / this.zzl;
                    if (mode2 == Integer.MIN_VALUE || i7 <= size2) {
                        defaultSize2 = i7;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                } else {
                    if (mode2 == 1073741824) {
                        i6 = (this.zzl * size2) / this.zzm;
                        if (mode != Integer.MIN_VALUE && i6 > size) {
                            defaultSize = size;
                        }
                        defaultSize2 = size2;
                    } else {
                        i4 = this.zzl;
                        i5 = this.zzm;
                        if (mode2 == Integer.MIN_VALUE || i5 <= size2) {
                            i6 = i4;
                            size2 = i5;
                        } else {
                            i6 = (size2 * i4) / i5;
                        }
                        if (mode == Integer.MIN_VALUE && i6 > size) {
                            defaultSize2 = (i5 * size) / i4;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i6;
                    defaultSize2 = size2;
                }
            } else if (mode2 == 1073741824) {
                int i8 = this.zzl;
                int i9 = i8 * size2;
                int i10 = this.zzm;
                int i11 = size * i10;
                if (i9 < i11) {
                    defaultSize = i9 / i10;
                } else {
                    if (i9 > i11) {
                        defaultSize2 = i11 / i8;
                        defaultSize = size;
                    }
                    defaultSize = size;
                }
                defaultSize2 = size2;
            } else {
                mode = 1073741824;
                if (mode == 1073741824) {
                    i7 = (this.zzm * size) / this.zzl;
                    if (mode2 == Integer.MIN_VALUE) {
                    }
                    defaultSize2 = i7;
                    defaultSize = size;
                } else {
                    if (mode2 == 1073741824) {
                        i6 = (this.zzl * size2) / this.zzm;
                        if (mode != Integer.MIN_VALUE) {
                        }
                    } else {
                        i4 = this.zzl;
                        i5 = this.zzm;
                        if (mode2 == Integer.MIN_VALUE) {
                            i6 = i4;
                            size2 = i5;
                        } else {
                            i6 = i4;
                            size2 = i5;
                        }
                        if (mode == Integer.MIN_VALUE) {
                            defaultSize2 = (i5 * size) / i4;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i6;
                    defaultSize2 = size2;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        zzcfi zzcfiVar = this.zzo;
        if (zzcfiVar != null) {
            zzcfiVar.zzc(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView prepared");
        zzH(2);
        this.zze.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcef(this, mediaPlayer));
        this.zzl = mediaPlayer.getVideoWidth();
        this.zzm = mediaPlayer.getVideoHeight();
        int i2 = this.zzq;
        if (i2 != 0) {
            zzi(i2);
        }
        if (this.zzf && zzF() && this.zzj.getCurrentPosition() > 0 && this.zzi != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView nudging MediaPlayer");
            zzG(0.0f);
            this.zzj.start();
            int currentPosition = this.zzj.getCurrentPosition();
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            while (zzF() && this.zzj.getCurrentPosition() == currentPosition && com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - jCurrentTimeMillis <= 250) {
            }
            this.zzj.pause();
            zzq();
        }
        int i3 = this.zzl;
        int i4 = this.zzm;
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 40 + String.valueOf(i4).length());
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i3);
        sb.append(" x ");
        sb.append(i4);
        com.google.android.gms.ads.internal.util.client.zzo.zzh(sb.toString());
        if (this.zzi == 3) {
            zze();
        }
        zzq();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface created");
        zzD();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcei(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null && this.zzq == 0) {
            this.zzq = mediaPlayer.getCurrentPosition();
        }
        zzcfi zzcfiVar = this.zzo;
        if (zzcfiVar != null) {
            zzcfiVar.zzd();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcek(this));
        zzE(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface changed");
        int i4 = this.zzi;
        boolean z2 = false;
        if (this.zzl == i2 && this.zzm == i3) {
            z2 = true;
        }
        if (this.zzj != null && i4 == 3 && z2) {
            int i5 = this.zzq;
            if (i5 != 0) {
                zzi(i5);
            }
            zze();
        }
        zzcfi zzcfiVar = this.zzo;
        if (zzcfiVar != null) {
            zzcfiVar.zzc(i2, i3);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcej(this, i2, i3));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zze.zzd(this);
        this.zza.zzb(surfaceTexture, this.zzr);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 35 + String.valueOf(i3).length());
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        this.zzl = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.zzm = videoHeight;
        if (this.zzl == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 47);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i2);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcen
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzr(i2);
            }
        });
        super.onWindowVisibilityChanged(i2);
    }

    @Override // android.view.View
    public final String toString() {
        String name = zzceo.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return android.support.v4.media.a.s(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final String zza() {
        return "MediaPlayer".concat(true != this.zzp ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzb(zzcep zzcepVar) {
        this.zzr = zzcepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzc(String str) {
        Uri uri = Uri.parse(str);
        zzbev zzbevVarZza = zzbev.zza(uri);
        if (zzbevVarZza == null || zzbevVarZza.zza != null) {
            if (zzbevVarZza != null) {
                uri = Uri.parse(zzbevVarZza.zza);
            }
            this.zzk = uri;
            this.zzq = 0;
            zzD();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzd() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzj.release();
            this.zzj = null;
            zzH(0);
            this.zzi = 0;
        }
        this.zze.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zze() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView play");
        if (zzF()) {
            this.zzj.start();
            zzH(3);
            this.zza.zza();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcel(this));
        }
        this.zzi = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzf() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView pause");
        if (zzF() && this.zzj.isPlaying()) {
            this.zzj.pause();
            zzH(4);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcem(this));
        }
        this.zzi = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final int zzg() {
        if (zzF()) {
            return this.zzj.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final int zzh() {
        if (zzF()) {
            return this.zzj.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzi(int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 23);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i2);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        if (!zzF()) {
            this.zzq = i2;
        } else {
            this.zzj.seekTo(i2);
            this.zzq = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzj(float f, float f2) {
        zzcfi zzcfiVar = this.zzo;
        if (zzcfiVar != null) {
            zzcfiVar.zzf(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final int zzk() {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final int zzl() {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final long zzm() {
        if (this.zzt != null) {
            return (zzo() * ((long) this.zzn)) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final long zzn() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final long zzo() {
        if (this.zzt != null) {
            return ((long) zzg()) * ((long) this.zzt.intValue());
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final int zzp() {
        if (Build.VERSION.SDK_INT < 26 || !zzF()) {
            return -1;
        }
        return this.zzj.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.zzceq, com.google.android.gms.internal.ads.zzcfn
    public final void zzq() {
        zzG(this.zzb.zzc());
    }

    public final /* synthetic */ void zzr(int i2) {
        zzcep zzcepVar = this.zzr;
        if (zzcepVar != null) {
            zzcepVar.onWindowVisibilityChanged(i2);
        }
    }

    public final /* synthetic */ void zzs(MediaPlayer mediaPlayer) {
        MediaFormat format;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcu)).booleanValue() || this.zzd == null || mediaPlayer == null) {
            return;
        }
        try {
            MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
            if (trackInfo != null) {
                HashMap map = new HashMap();
                for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                    if (trackInfo2 != null) {
                        int trackType = trackInfo2.getTrackType();
                        if (trackType == 1) {
                            MediaFormat format2 = trackInfo2.getFormat();
                            if (format2 != null) {
                                if (format2.containsKey("frame-rate")) {
                                    try {
                                        map.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                    } catch (ClassCastException unused) {
                                        map.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                    }
                                }
                                if (format2.containsKey("bitrate")) {
                                    Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                    this.zzt = numValueOf;
                                    map.put("bitRate", String.valueOf(numValueOf));
                                }
                                if (format2.containsKey("width") && format2.containsKey("height")) {
                                    int integer = format2.getInteger("width");
                                    int integer2 = format2.getInteger("height");
                                    StringBuilder sb = new StringBuilder(Z.a(integer, 1) + String.valueOf(integer2).length());
                                    sb.append(integer);
                                    sb.append("x");
                                    sb.append(integer2);
                                    map.put("resolution", sb.toString());
                                }
                                if (format2.containsKey("mime")) {
                                    map.put("videoMime", format2.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                    map.put("videoCodec", format2.getString("codecs-string"));
                                }
                            }
                        } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                            if (format.containsKey("mime")) {
                                map.put("audioMime", format.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                map.put("audioCodec", format.getString("codecs-string"));
                            }
                        }
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                this.zzd.zze("onMetadataEvent", map);
            }
        } catch (RuntimeException e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "AdMediaPlayerView.reportMetadata");
        }
    }

    public final /* synthetic */ zzcep zzt() {
        return this.zzr;
    }

    public final /* synthetic */ boolean zzu() {
        return this.zzs;
    }

    public final /* synthetic */ void zzv(boolean z2) {
        this.zzs = true;
    }
}
