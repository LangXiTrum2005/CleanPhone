package com.google.android.gms.internal.ads;

import A.AbstractC0912t;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.exoplayer.analytics.p;
import androidx.media3.exoplayer.analytics.q;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zzpj implements zzmx, zzpk {
    private boolean zzA;
    private final Context zza;
    private final zzpl zzc;
    private final PlaybackSession zzd;
    private String zzj;
    private PlaybackMetrics.Builder zzk;
    private int zzl;
    private zzau zzo;
    private zzpi zzp;
    private zzpi zzq;
    private zzpi zzr;
    private zzv zzs;
    private zzv zzt;
    private zzv zzu;
    private boolean zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private int zzz;
    private final Executor zzb = zzdh.zza();
    private final zzbe zzf = new zzbe();
    private final zzbd zzg = new zzbd();
    private final HashMap zzi = new HashMap();
    private final HashMap zzh = new HashMap();
    private final long zze = SystemClock.elapsedRealtime();
    private int zzm = 0;
    private int zzn = 0;

    private zzpj(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzd = playbackSession;
        zzpc zzpcVar = new zzpc(zzpc.zza);
        this.zzc = zzpcVar;
        zzpcVar.zza(this);
    }

    private final void zzA(int i2, long j, zzv zzvVar, int i3) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = q.k(i2).setTimeSinceCreatedMillis(j - this.zze);
        if (zzvVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i3 != 1 ? 1 : 2);
            String str = zzvVar.zzn;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzvVar.zzo;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzvVar.zzk;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = zzvVar.zzj;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = zzvVar.zzv;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = zzvVar.zzw;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = zzvVar.zzG;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = zzvVar.zzH;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = zzvVar.zzd;
            if (str4 != null) {
                String str5 = zzfj.zza;
                String[] strArrSplit = str4.split(TokenBuilder.TOKEN_DELIMITER, -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = zzvVar.zzz;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzA = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzu(trackChangeEventBuild);
            }
        });
    }

    @RequiresNonNull
    private final void zzB(zzbf zzbfVar, zzwg zzwgVar) {
        int iZze;
        PlaybackMetrics.Builder builder = this.zzk;
        if (zzwgVar == null || (iZze = zzbfVar.zze(zzwgVar.zza)) == -1) {
            return;
        }
        zzbd zzbdVar = this.zzg;
        int i2 = 0;
        zzbfVar.zzd(iZze, zzbdVar, false);
        zzbe zzbeVar = this.zzf;
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        zzag zzagVar = zzbeVar.zzd.zzb;
        if (zzagVar != null) {
            int iZzF = zzfj.zzF(zzagVar.zza);
            if (iZzF == 0) {
                i2 = 3;
            } else if (iZzF != 1) {
                i2 = iZzF != 2 ? 1 : 4;
            } else {
                i2 = 5;
            }
        }
        builder.setStreamType(i2);
        long j = zzbeVar.zzm;
        if (j != -9223372036854775807L && !zzbeVar.zzk && !zzbeVar.zzi && !zzbeVar.zzb()) {
            builder.setMediaDurationMillis(zzfj.zzp(j));
        }
        builder.setPlaybackType(true != zzbeVar.zzb() ? 1 : 2);
        this.zzA = true;
    }

    private final void zzC() {
        PlaybackMetrics.Builder builder = this.zzk;
        if (builder != null && this.zzA) {
            builder.setAudioUnderrunCount(this.zzz);
            this.zzk.setVideoFramesDropped(this.zzx);
            this.zzk.setVideoFramesPlayed(this.zzy);
            Long l2 = (Long) this.zzh.get(this.zzj);
            this.zzk.setNetworkTransferDurationMillis(l2 == null ? 0L : l2.longValue());
            Long l3 = (Long) this.zzi.get(this.zzj);
            this.zzk.setNetworkBytesRead(l3 == null ? 0L : l3.longValue());
            this.zzk.setStreamSource((l3 == null || l3.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.zzk.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzv(playbackMetricsBuild);
                }
            });
        }
        this.zzk = null;
        this.zzj = null;
        this.zzz = 0;
        this.zzx = 0;
        this.zzy = 0;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzA = false;
    }

    private static int zzD(int i2) {
        switch (zzfj.zzE(i2)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    public static zzpj zza(Context context) {
        MediaMetricsManager mediaMetricsManagerH = AbstractC0912t.h(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerH == null) {
            return null;
        }
        return new zzpj(context, mediaMetricsManagerH.createPlaybackSession());
    }

    @EnsuresNonNullIf
    private final boolean zzw(zzpi zzpiVar) {
        if (zzpiVar != null) {
            return zzpiVar.zzc.equals(this.zzc.zzf());
        }
        return false;
    }

    private final void zzx(long j, zzv zzvVar, int i2) {
        if (Objects.equals(this.zzs, zzvVar)) {
            return;
        }
        int i3 = this.zzs == null ? 1 : 0;
        this.zzs = zzvVar;
        zzA(1, j, zzvVar, i3);
    }

    private final void zzy(long j, zzv zzvVar, int i2) {
        if (Objects.equals(this.zzt, zzvVar)) {
            return;
        }
        int i3 = this.zzt == null ? 1 : 0;
        this.zzt = zzvVar;
        zzA(0, j, zzvVar, i3);
    }

    private final void zzz(long j, zzv zzvVar, int i2) {
        if (Objects.equals(this.zzu, zzvVar)) {
            return;
        }
        int i3 = this.zzu == null ? 1 : 0;
        this.zzu = zzvVar;
        zzA(2, j, zzvVar, i3);
    }

    public final LogSessionId zzb() {
        return this.zzd.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzpk
    public final void zzc(zzmv zzmvVar, String str) {
        zzwg zzwgVar = zzmvVar.zzd;
        if (zzwgVar == null || !zzwgVar.zzb()) {
            zzC();
            this.zzj = str;
            this.zzk = q.h().setPlayerName("AndroidXMedia3").setPlayerVersion("1.9.0-alpha01");
            zzB(zzmvVar.zzb, zzwgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpk
    public final void zzd(zzmv zzmvVar, String str, boolean z2) {
        zzwg zzwgVar = zzmvVar.zzd;
        if ((zzwgVar == null || !zzwgVar.zzb()) && str.equals(this.zzj)) {
            zzC();
        }
        this.zzh.remove(str);
        this.zzi.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzde(zzmv zzmvVar, zzba zzbaVar, zzba zzbaVar2, int i2) {
        if (i2 == 1) {
            this.zzv = true;
            i2 = 1;
        }
        this.zzl = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzdf(zzmv zzmvVar, zzwc zzwcVar) {
        zzwg zzwgVar = zzmvVar.zzd;
        if (zzwgVar == null) {
            return;
        }
        zzv zzvVar = zzwcVar.zzb;
        zzvVar.getClass();
        zzpi zzpiVar = new zzpi(zzvVar, 0, this.zzc.zzb(zzmvVar.zzb, zzwgVar));
        int i2 = zzwcVar.zza;
        if (i2 != 0) {
            if (i2 == 1) {
                this.zzq = zzpiVar;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.zzr = zzpiVar;
                return;
            }
        }
        this.zzp = zzpiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzdg(zzmv zzmvVar, int i2, long j, long j2) {
        zzwg zzwgVar = zzmvVar.zzd;
        if (zzwgVar != null) {
            String strZzb = this.zzc.zzb(zzmvVar.zzb, zzwgVar);
            HashMap map = this.zzi;
            Long l2 = (Long) map.get(strZzb);
            HashMap map2 = this.zzh;
            Long l3 = (Long) map2.get(strZzb);
            map.put(strZzb, Long.valueOf((l2 == null ? 0L : l2.longValue()) + j));
            map2.put(strZzb, Long.valueOf((l3 != null ? l3.longValue() : 0L) + ((long) i2)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzdh(zzmv zzmvVar, zzik zzikVar) {
        this.zzx += zzikVar.zzg;
        this.zzy += zzikVar.zze;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x016c  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:140:0x01f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x01f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:145:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:146:0x020a  */
    /* JADX WARN: Code duplicated, block: B:148:0x0210  */
    /* JADX WARN: Code duplicated, block: B:149:0x0216  */
    /* JADX WARN: Code duplicated, block: B:151:0x021a  */
    /* JADX WARN: Code duplicated, block: B:152:0x021d  */
    /* JADX WARN: Code duplicated, block: B:154:0x0221  */
    /* JADX WARN: Code duplicated, block: B:155:0x0227  */
    /* JADX WARN: Code duplicated, block: B:157:0x022b  */
    /* JADX WARN: Code duplicated, block: B:158:0x0233  */
    /* JADX WARN: Code duplicated, block: B:160:0x0237  */
    /* JADX WARN: Code duplicated, block: B:161:0x0243  */
    /* JADX WARN: Code duplicated, block: B:171:0x0290  */
    /* JADX WARN: Code duplicated, block: B:173:0x0295  */
    /* JADX WARN: Code duplicated, block: B:175:0x029a  */
    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzdi(zzbb zzbbVar, zzmw zzmwVar) {
        int i2;
        int i3;
        int iZzD;
        int i4;
        int errorCode;
        int iZzQ;
        zzq zzqVar;
        int i5;
        int i6;
        if (zzmwVar.zzc() == 0) {
            return;
        }
        for (int i7 = 0; i7 < zzmwVar.zzc(); i7++) {
            int iZzd = zzmwVar.zzd(i7);
            zzmv zzmvVarZza = zzmwVar.zza(iZzd);
            if (iZzd == 0) {
                this.zzc.zzd(zzmvVarZza);
            } else if (iZzd == 11) {
                this.zzc.zze(zzmvVarZza, this.zzl);
            } else {
                this.zzc.zzc(zzmvVarZza);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzmwVar.zzb(0)) {
            zzmv zzmvVarZza2 = zzmwVar.zza(0);
            if (this.zzk != null) {
                zzB(zzmvVarZza2.zzb, zzmvVarZza2.zzd);
            }
        }
        if (zzmwVar.zzb(2) && this.zzk != null) {
            zzgtd zzgtdVarZza = zzbbVar.zzp().zza();
            int size = zzgtdVarZza.size();
            int i8 = 0;
            loop1: while (true) {
                if (i8 >= size) {
                    zzqVar = null;
                    break;
                }
                zzbm zzbmVar = (zzbm) zzgtdVarZza.get(i8);
                int i9 = 0;
                while (true) {
                    i6 = i8 + 1;
                    if (i9 < zzbmVar.zza) {
                        if (zzbmVar.zzc(i9) && (zzqVar = zzbmVar.zza(i9).zzs) != null) {
                            break loop1;
                        } else {
                            i9++;
                        }
                    }
                }
                i8 = i6;
            }
            if (zzqVar != null) {
                PlaybackMetrics.Builder builder = this.zzk;
                String str = zzfj.zza;
                PlaybackMetrics.Builder builderJ = p.j(builder);
                int i10 = 0;
                while (true) {
                    if (i10 >= zzqVar.zzb) {
                        i5 = 1;
                        break;
                    }
                    UUID uuid = zzqVar.zza(i10).zza;
                    if (uuid.equals(zzg.zzd)) {
                        i5 = 3;
                        break;
                    } else if (uuid.equals(zzg.zze)) {
                        i5 = 2;
                        break;
                    } else {
                        if (uuid.equals(zzg.zzc)) {
                            i5 = 6;
                            break;
                        }
                        i10++;
                    }
                }
                builderJ.setDrmType(i5);
            }
        }
        if (zzmwVar.zzb(1011)) {
            this.zzz++;
        }
        zzau zzauVar = this.zzo;
        if (zzauVar != null) {
            Context context = this.zza;
            int i11 = zzauVar.zza;
            if (i11 == 1001) {
                i4 = 20;
            } else {
                zzit zzitVar = (zzit) zzauVar;
                boolean z2 = zzitVar.zzc == 1;
                int i12 = zzitVar.zzg;
                Throwable cause = zzauVar.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    if (cause instanceof zzhs) {
                        iZzQ = ((zzhs) cause).zzc;
                        i4 = 5;
                    } else if ((cause instanceof zzhr) || (cause instanceof zzat)) {
                        iZzQ = 0;
                        i4 = 11;
                    } else {
                        boolean z3 = cause instanceof zzhq;
                        if (z3 || (cause instanceof zzia)) {
                            if (zzep.zza(context).zzc() == 1) {
                                iZzQ = 0;
                                i4 = 3;
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    iZzQ = 0;
                                    i4 = 6;
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    iZzQ = 0;
                                    i4 = 7;
                                } else if (z3 && ((zzhq) cause).zzb == 1) {
                                    iZzQ = 0;
                                    i4 = 4;
                                } else {
                                    iZzQ = 0;
                                    i4 = 8;
                                }
                            }
                        } else if (i11 == 1002) {
                            i4 = 21;
                        } else if (cause instanceof zztc) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                errorCode = zzfj.zzQ(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                iZzD = zzD(errorCode);
                                int i13 = iZzD;
                                iZzQ = errorCode;
                                i4 = i13;
                            } else if (cause3 instanceof MediaDrmResetException) {
                                i4 = 27;
                            } else if (cause3 instanceof NotProvisionedException) {
                                i4 = 24;
                            } else if (cause3 instanceof DeniedByServerException) {
                                i4 = 29;
                            } else if (cause3 instanceof zztm) {
                                iZzQ = 0;
                                i4 = 23;
                            } else {
                                i4 = cause3 instanceof zztb ? 28 : 30;
                            }
                        } else if ((cause instanceof zzhn) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            if ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                i4 = 32;
                            } else {
                                iZzQ = 0;
                                i4 = 31;
                            }
                        } else {
                            iZzQ = 0;
                            i4 = 9;
                        }
                    }
                } else if (z2) {
                    i4 = 35;
                    if (i12 != 0 && i12 != 1) {
                        if (!z2 && i12 == 3) {
                            i4 = 15;
                        } else if (!z2 && i12 == 2) {
                            iZzQ = 0;
                            i4 = 23;
                        } else if (cause instanceof zzum) {
                            iZzQ = zzfj.zzQ(((zzum) cause).zzd);
                            i4 = 13;
                        } else {
                            iZzD = 14;
                            if (cause instanceof zzui) {
                                errorCode = ((zzui) cause).zza;
                            } else if (cause instanceof OutOfMemoryError) {
                                i4 = 14;
                            } else if (cause instanceof zzrb) {
                                i4 = 17;
                            } else if (cause instanceof zzre) {
                                errorCode = ((zzre) cause).zza;
                                iZzD = 18;
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                iZzD = zzD(errorCode);
                            } else {
                                i4 = 22;
                            }
                            int i14 = iZzD;
                            iZzQ = errorCode;
                            i4 = i14;
                        }
                    }
                } else if (!z2) {
                    if (!z2) {
                    }
                    if (cause instanceof zzum) {
                        iZzQ = zzfj.zzQ(((zzum) cause).zzd);
                        i4 = 13;
                    } else {
                        iZzD = 14;
                        if (cause instanceof zzui) {
                            errorCode = ((zzui) cause).zza;
                        } else if (cause instanceof OutOfMemoryError) {
                            i4 = 14;
                        } else if (cause instanceof zzrb) {
                            i4 = 17;
                        } else if (cause instanceof zzre) {
                            errorCode = ((zzre) cause).zza;
                            iZzD = 18;
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            iZzD = zzD(errorCode);
                        } else {
                            i4 = 22;
                        }
                        int i15 = iZzD;
                        iZzQ = errorCode;
                        i4 = i15;
                    }
                } else {
                    if (!z2) {
                    }
                    if (cause instanceof zzum) {
                        iZzQ = zzfj.zzQ(((zzum) cause).zzd);
                        i4 = 13;
                    } else {
                        iZzD = 14;
                        if (cause instanceof zzui) {
                            errorCode = ((zzui) cause).zza;
                        } else if (cause instanceof OutOfMemoryError) {
                            i4 = 14;
                        } else if (cause instanceof zzrb) {
                            i4 = 17;
                        } else if (cause instanceof zzre) {
                            errorCode = ((zzre) cause).zza;
                            iZzD = 18;
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            iZzD = zzD(errorCode);
                        } else {
                            i4 = 22;
                        }
                        int i16 = iZzD;
                        iZzQ = errorCode;
                        i4 = i16;
                    }
                }
                final PlaybackErrorEvent playbackErrorEventBuild = q.g().setTimeSinceCreatedMillis(jElapsedRealtime - this.zze).setErrorCode(i4).setSubErrorCode(iZzQ).setException(zzauVar).build();
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzph
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzr(playbackErrorEventBuild);
                    }
                });
                this.zzA = true;
                this.zzo = null;
            }
            iZzQ = 0;
            final PlaybackErrorEvent playbackErrorEventBuild2 = q.g().setTimeSinceCreatedMillis(jElapsedRealtime - this.zze).setErrorCode(i4).setSubErrorCode(iZzQ).setException(zzauVar).build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzph
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr(playbackErrorEventBuild2);
                }
            });
            this.zzA = true;
            this.zzo = null;
        }
        if (zzmwVar.zzb(2)) {
            zzbn zzbnVarZzp = zzbbVar.zzp();
            boolean zZzb = zzbnVarZzp.zzb(2);
            boolean zZzb2 = zzbnVarZzp.zzb(1);
            boolean zZzb3 = zzbnVarZzp.zzb(3);
            if (zZzb || zZzb2) {
                if (!zZzb) {
                    zzx(jElapsedRealtime, null, 0);
                }
                if (!zZzb2) {
                    zzy(jElapsedRealtime, null, 0);
                }
                if (!zZzb3) {
                    zzz(jElapsedRealtime, null, 0);
                }
            } else if (zZzb3) {
                zZzb3 = true;
                if (!zZzb) {
                    zzx(jElapsedRealtime, null, 0);
                }
                if (!zZzb2) {
                    zzy(jElapsedRealtime, null, 0);
                }
                if (!zZzb3) {
                    zzz(jElapsedRealtime, null, 0);
                }
            }
        }
        if (zzw(this.zzp)) {
            zzv zzvVar = this.zzp.zza;
            if (zzvVar.zzw != -1) {
                zzx(jElapsedRealtime, zzvVar, 0);
                this.zzp = null;
            }
        }
        if (zzw(this.zzq)) {
            zzy(jElapsedRealtime, this.zzq.zza, 0);
            this.zzq = null;
        }
        if (zzw(this.zzr)) {
            zzz(jElapsedRealtime, this.zzr.zza, 0);
            this.zzr = null;
        }
        switch (zzep.zza(this.zza).zzc()) {
            case 0:
                i2 = 0;
                break;
            case 1:
                i2 = 9;
                break;
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 4;
                break;
            case 4:
                i2 = 5;
                break;
            case 5:
                i2 = 6;
                break;
            case 6:
            case 8:
            default:
                i2 = 1;
                break;
            case 7:
                i2 = 3;
                break;
            case 9:
                i2 = 8;
                break;
            case 10:
                i2 = 7;
                break;
        }
        if (i2 != this.zzn) {
            this.zzn = i2;
            final NetworkEvent networkEventBuild = q.f().setNetworkType(i2).setTimeSinceCreatedMillis(jElapsedRealtime - this.zze).build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs(networkEventBuild);
                }
            });
        }
        if (zzbbVar.zzh() != 2) {
            this.zzv = false;
        }
        if (((zzms) zzbbVar).zzI() == null) {
            this.zzw = false;
        } else if (zzmwVar.zzb(10)) {
            this.zzw = true;
        }
        int iZzh = zzbbVar.zzh();
        if (this.zzv) {
            i3 = 5;
        } else if (this.zzw) {
            i3 = 13;
        } else {
            i3 = 4;
            if (iZzh == 4) {
                i3 = 11;
            } else if (iZzh == 2) {
                int i17 = this.zzm;
                if (i17 == 0 || i17 == 2 || i17 == 12) {
                    i3 = 2;
                } else if (zzbbVar.zzk()) {
                    i3 = zzbbVar.zzi() != 0 ? 10 : 6;
                } else {
                    i3 = 7;
                }
            } else if (iZzh != 3) {
                i3 = (iZzh != 1 || this.zzm == 0) ? this.zzm : 12;
            } else if (zzbbVar.zzk()) {
                i3 = zzbbVar.zzi() != 0 ? 9 : 3;
            }
        }
        if (this.zzm != i3) {
            this.zzm = i3;
            this.zzA = true;
            final PlaybackStateEvent playbackStateEventBuild = q.i().setState(this.zzm).setTimeSinceCreatedMillis(jElapsedRealtime - this.zze).build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpe
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt(playbackStateEventBuild);
                }
            });
        }
        if (zzmwVar.zzb(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
            this.zzc.zzg(zzmwVar.zza(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzg(zzmv zzmvVar, zzau zzauVar) {
        this.zzo = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzh(zzmv zzmvVar, zzvx zzvxVar, zzwc zzwcVar, IOException iOException, boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzp(zzmv zzmvVar, zzbv zzbvVar) {
        zzpi zzpiVar = this.zzp;
        if (zzpiVar != null) {
            zzv zzvVar = zzpiVar.zza;
            if (zzvVar.zzw == -1) {
                zzt zztVarZza = zzvVar.zza();
                zztVarZza.zzt(zzbvVar.zzb);
                zztVarZza.zzu(zzbvVar.zzc);
                this.zzp = new zzpi(zztVarZza.zzM(), 0, zzpiVar.zzc);
            }
        }
    }

    public final /* synthetic */ void zzr(PlaybackErrorEvent playbackErrorEvent) {
        this.zzd.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    public final /* synthetic */ void zzs(NetworkEvent networkEvent) {
        this.zzd.reportNetworkEvent(networkEvent);
    }

    public final /* synthetic */ void zzt(PlaybackStateEvent playbackStateEvent) {
        this.zzd.reportPlaybackStateEvent(playbackStateEvent);
    }

    public final /* synthetic */ void zzu(TrackChangeEvent trackChangeEvent) {
        this.zzd.reportTrackChangeEvent(trackChangeEvent);
    }

    public final /* synthetic */ void zzv(PlaybackMetrics playbackMetrics) {
        this.zzd.reportPlaybackMetrics(playbackMetrics);
    }
}
