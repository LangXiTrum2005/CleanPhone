package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.badlogic.gdx.graphics.GL20;
import com.facebook.ads.AdError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4043mO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.YB;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(31)
public final class zzoc implements zzlw, zzod {
    private final Context zza;
    private final zzoe zzb;
    private final PlaybackSession zzc;

    @Nullable
    private String zzi;

    @Nullable
    private PlaybackMetrics.Builder zzj;
    private int zzk;

    @Nullable
    private zzbd zzn;

    @Nullable
    private zzob zzo;

    @Nullable
    private zzob zzp;

    @Nullable
    private zzob zzq;

    @Nullable
    private zzab zzr;

    @Nullable
    private zzab zzs;

    @Nullable
    private zzab zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;
    private final zzbp zze = new zzbp();
    private final zzbo zzf = new zzbo();
    private final HashMap zzh = new HashMap();
    private final HashMap zzg = new HashMap();
    private final long zzd = SystemClock.elapsedRealtime();
    private int zzl = 0;
    private int zzm = 0;

    private zzoc(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zzoa zzoaVar = new zzoa(zzoa.zza);
        this.zzb = zzoaVar;
        zzoaVar.zzh(this);
    }

    @Nullable
    public static zzoc zzb(Context context) {
        MediaMetricsManager mediaMetricsManagerB = AbstractC4043mO.b(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerB == null) {
            return null;
        }
        return new zzoc(context, mediaMetricsManagerB.createPlaybackSession());
    }

    @SuppressLint({"SwitchIntDef"})
    private static int zzr(int i) {
        switch (zzei.zzl(i)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l = (Long) this.zzg.get(this.zzi);
            this.zzj.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.zzh.get(this.zzi);
            this.zzj.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.zzj.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.zzc.reportPlaybackMetrics(this.zzj.build());
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j, @Nullable zzab zzabVar, int i) {
        if (Objects.equals(this.zzs, zzabVar)) {
            return;
        }
        int i2 = this.zzs == null ? 1 : 0;
        this.zzs = zzabVar;
        zzx(0, j, zzabVar, i2);
    }

    private final void zzu(long j, @Nullable zzab zzabVar, int i) {
        if (Objects.equals(this.zzt, zzabVar)) {
            return;
        }
        int i2 = this.zzt == null ? 1 : 0;
        this.zzt = zzabVar;
        zzx(2, j, zzabVar, i2);
    }

    private final void zzv(zzbq zzbqVar, @Nullable zzug zzugVar) {
        int iZza;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zzugVar == null || (iZza = zzbqVar.zza(zzugVar.zza)) == -1) {
            return;
        }
        int i = 0;
        zzbqVar.zzd(iZza, this.zzf, false);
        zzbqVar.zze(this.zzf.zzc, this.zze, 0L);
        zzam zzamVar = this.zze.zzd.zzb;
        if (zzamVar != null) {
            int iZzo = zzei.zzo(zzamVar.zza);
            if (iZzo == 0) {
                i = 3;
            } else if (iZzo != 1) {
                i = iZzo != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        builder.setStreamType(i);
        zzbp zzbpVar = this.zze;
        long j = zzbpVar.zzm;
        if (j != C.TIME_UNSET && !zzbpVar.zzk && !zzbpVar.zzi && !zzbpVar.zzb()) {
            builder.setMediaDurationMillis(zzei.zzv(j));
        }
        builder.setPlaybackType(true != this.zze.zzb() ? 1 : 2);
        this.zzz = true;
    }

    private final void zzw(long j, @Nullable zzab zzabVar, int i) {
        if (Objects.equals(this.zzr, zzabVar)) {
            return;
        }
        int i2 = this.zzr == null ? 1 : 0;
        this.zzr = zzabVar;
        zzx(1, j, zzabVar, i2);
    }

    private final void zzx(int i, long j, @Nullable zzab zzabVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = MM.j(i).setTimeSinceCreatedMillis(j - this.zzd);
        if (zzabVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = zzabVar.zzn;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzabVar.zzo;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzabVar.zzk;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = zzabVar.zzj;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = zzabVar.zzv;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = zzabVar.zzw;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = zzabVar.zzD;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = zzabVar.zzE;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = zzabVar.zzd;
            if (str4 != null) {
                int i8 = zzei.zza;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = zzabVar.zzx;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        this.zzc.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private final boolean zzy(@Nullable zzob zzobVar) {
        if (zzobVar != null) {
            return zzobVar.zzc.equals(this.zzb.zze());
        }
        return false;
    }

    public final LogSessionId zza() {
        return this.zzc.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzod
    public final void zzc(zzlu zzluVar, String str) {
        zzug zzugVar = zzluVar.zzd;
        if (zzugVar == null || !zzugVar.zzb()) {
            zzs();
            this.zzi = str;
            this.zzj = AbstractC4043mO.g().setPlayerName("AndroidXMedia3").setPlayerVersion("1.5.0-beta01");
            zzv(zzluVar.zzb, zzluVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzod
    public final void zzd(zzlu zzluVar, String str, boolean z) {
        zzug zzugVar = zzluVar.zzd;
        if ((zzugVar == null || !zzugVar.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final /* synthetic */ void zze(zzlu zzluVar, zzab zzabVar, zzht zzhtVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzf(zzlu zzluVar, int i, long j, long j2) {
        zzug zzugVar = zzluVar.zzd;
        if (zzugVar != null) {
            String strZzf = this.zzb.zzf(zzluVar.zzb, zzugVar);
            Long l = (Long) this.zzh.get(strZzf);
            Long l2 = (Long) this.zzg.get(strZzf);
            this.zzh.put(strZzf, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.zzg.put(strZzf, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzg(zzlu zzluVar, zzuc zzucVar) {
        zzug zzugVar = zzluVar.zzd;
        if (zzugVar == null) {
            return;
        }
        zzab zzabVar = zzucVar.zzb;
        zzabVar.getClass();
        zzob zzobVar = new zzob(zzabVar, 0, this.zzb.zzf(zzluVar.zzb, zzugVar));
        int i = zzucVar.zza;
        if (i != 0) {
            if (i == 1) {
                this.zzp = zzobVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.zzq = zzobVar;
                return;
            }
        }
        this.zzo = zzobVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final /* synthetic */ void zzh(zzlu zzluVar, int i, long j) {
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0176  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:142:0x01f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x01f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x0201  */
    /* JADX WARN: Code duplicated, block: B:148:0x020d  */
    /* JADX WARN: Code duplicated, block: B:150:0x0213  */
    /* JADX WARN: Code duplicated, block: B:151:0x021b  */
    /* JADX WARN: Code duplicated, block: B:153:0x021f  */
    /* JADX WARN: Code duplicated, block: B:154:0x0223  */
    /* JADX WARN: Code duplicated, block: B:156:0x0227  */
    /* JADX WARN: Code duplicated, block: B:157:0x0231  */
    /* JADX WARN: Code duplicated, block: B:159:0x0235  */
    /* JADX WARN: Code duplicated, block: B:160:0x023f  */
    /* JADX WARN: Code duplicated, block: B:162:0x0243  */
    /* JADX WARN: Code duplicated, block: B:163:0x024f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0297  */
    /* JADX WARN: Code duplicated, block: B:175:0x029c  */
    /* JADX WARN: Code duplicated, block: B:177:0x02a1  */
    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzi(zzbk zzbkVar, zzlv zzlvVar) {
        int i;
        int i2;
        int i3;
        int errorCode;
        int iZzr;
        int iZzm;
        zzu zzuVar;
        int i4;
        int i5;
        if (zzlvVar.zzb() == 0) {
            return;
        }
        for (int i6 = 0; i6 < zzlvVar.zzb(); i6++) {
            int iZza = zzlvVar.zza(i6);
            zzlu zzluVarZzc = zzlvVar.zzc(iZza);
            if (iZza == 0) {
                this.zzb.zzk(zzluVarZzc);
            } else if (iZza == 11) {
                this.zzb.zzj(zzluVarZzc, this.zzk);
            } else {
                this.zzb.zzi(zzluVarZzc);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzlvVar.zzd(0)) {
            zzlu zzluVarZzc2 = zzlvVar.zzc(0);
            if (this.zzj != null) {
                zzv(zzluVarZzc2.zzb, zzluVarZzc2.zzd);
            }
        }
        if (zzlvVar.zzd(2) && this.zzj != null) {
            zzfxn zzfxnVarZza = zzbkVar.zzo().zza();
            int size = zzfxnVarZza.size();
            int i7 = 0;
            loop1: while (true) {
                if (i7 >= size) {
                    zzuVar = null;
                    break;
                }
                zzbx zzbxVar = (zzbx) zzfxnVarZza.get(i7);
                int i8 = 0;
                while (true) {
                    i5 = i7 + 1;
                    if (i8 < zzbxVar.zza) {
                        if (zzbxVar.zzd(i8) && (zzuVar = zzbxVar.zzb(i8).zzs) != null) {
                            break loop1;
                        } else {
                            i8++;
                        }
                    }
                }
                i7 = i5;
            }
            if (zzuVar != null) {
                PlaybackMetrics.Builder builder = this.zzj;
                int i9 = zzei.zza;
                PlaybackMetrics.Builder builderG = MM.g(builder);
                int i10 = 0;
                while (true) {
                    if (i10 >= zzuVar.zzb) {
                        i4 = 1;
                        break;
                    }
                    UUID uuid = zzuVar.zza(i10).zza;
                    if (uuid.equals(zzh.zzd)) {
                        i4 = 3;
                        break;
                    } else if (uuid.equals(zzh.zze)) {
                        i4 = 2;
                        break;
                    } else {
                        if (uuid.equals(zzh.zzc)) {
                            i4 = 6;
                            break;
                        }
                        i10++;
                    }
                }
                builderG.setDrmType(i4);
            }
        }
        if (zzlvVar.zzd(1011)) {
            this.zzy++;
        }
        zzbd zzbdVar = this.zzn;
        if (zzbdVar != null) {
            Context context = this.zza;
            if (zzbdVar.zza == 1001) {
                i3 = 20;
            } else {
                zzib zzibVar = (zzib) zzbdVar;
                boolean z = zzibVar.zzc == 1;
                int i11 = zzibVar.zzg;
                Throwable cause = zzbdVar.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    if (cause instanceof zzgr) {
                        iZzm = ((zzgr) cause).zzc;
                        i3 = 5;
                    } else if ((cause instanceof zzgq) || (cause instanceof zzbc)) {
                        i3 = 11;
                    } else {
                        boolean z2 = cause instanceof zzgp;
                        if (z2 || (cause instanceof zzgz)) {
                            if (zzdw.zzb(context).zza() == 1) {
                                i3 = 3;
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    i3 = 6;
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    i3 = 7;
                                } else {
                                    i3 = (z2 && ((zzgp) cause).zzb == 1) ? 4 : 8;
                                }
                            }
                        } else if (zzbdVar.zza == 1002) {
                            i3 = 21;
                        } else if (cause instanceof zzqy) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                errorCode = zzei.zzm(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                iZzr = zzr(errorCode);
                                int i12 = iZzr;
                                iZzm = errorCode;
                                i3 = i12;
                            } else if (zzei.zza >= 23 && YB.z(cause3)) {
                                i3 = 27;
                            } else if (cause3 instanceof NotProvisionedException) {
                                i3 = 24;
                            } else if (cause3 instanceof DeniedByServerException) {
                                i3 = 29;
                            } else if (cause3 instanceof zzri) {
                                i3 = 23;
                            } else {
                                i3 = cause3 instanceof zzqx ? 28 : 30;
                            }
                        } else if ((cause instanceof zzgm) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            i3 = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? 32 : 31;
                        } else {
                            i3 = 9;
                        }
                    }
                } else if (z) {
                    i3 = 35;
                    if (i11 != 0 && i11 != 1) {
                        if (!z && i11 == 3) {
                            i3 = 15;
                        } else if (!z && i11 == 2) {
                            i3 = 23;
                        } else if (cause instanceof zzsj) {
                            iZzm = zzei.zzm(((zzsj) cause).zzd);
                            i3 = 13;
                        } else if (cause instanceof zzsf) {
                            iZzm = ((zzsf) cause).zzb;
                            i3 = 14;
                        } else if (cause instanceof OutOfMemoryError) {
                            i3 = 14;
                        } else if (cause instanceof zzpi) {
                            iZzm = ((zzpi) cause).zza;
                            i3 = 17;
                        } else if (cause instanceof zzpl) {
                            iZzm = ((zzpl) cause).zza;
                            i3 = 18;
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            iZzr = zzr(errorCode);
                            int i13 = iZzr;
                            iZzm = errorCode;
                            i3 = i13;
                        } else {
                            i3 = 22;
                        }
                    }
                } else if (!z) {
                    if (!z) {
                    }
                    if (cause instanceof zzsj) {
                        iZzm = zzei.zzm(((zzsj) cause).zzd);
                        i3 = 13;
                    } else if (cause instanceof zzsf) {
                        iZzm = ((zzsf) cause).zzb;
                        i3 = 14;
                    } else if (cause instanceof OutOfMemoryError) {
                        i3 = 14;
                    } else if (cause instanceof zzpi) {
                        iZzm = ((zzpi) cause).zza;
                        i3 = 17;
                    } else if (cause instanceof zzpl) {
                        iZzm = ((zzpl) cause).zza;
                        i3 = 18;
                    } else if (cause instanceof MediaCodec.CryptoException) {
                        errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                        iZzr = zzr(errorCode);
                        int i14 = iZzr;
                        iZzm = errorCode;
                        i3 = i14;
                    } else {
                        i3 = 22;
                    }
                } else {
                    if (!z) {
                    }
                    if (cause instanceof zzsj) {
                        iZzm = zzei.zzm(((zzsj) cause).zzd);
                        i3 = 13;
                    } else if (cause instanceof zzsf) {
                        iZzm = ((zzsf) cause).zzb;
                        i3 = 14;
                    } else if (cause instanceof OutOfMemoryError) {
                        i3 = 14;
                    } else if (cause instanceof zzpi) {
                        iZzm = ((zzpi) cause).zza;
                        i3 = 17;
                    } else if (cause instanceof zzpl) {
                        iZzm = ((zzpl) cause).zza;
                        i3 = 18;
                    } else if (cause instanceof MediaCodec.CryptoException) {
                        errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                        iZzr = zzr(errorCode);
                        int i15 = iZzr;
                        iZzm = errorCode;
                        i3 = i15;
                    } else {
                        i3 = 22;
                    }
                }
                this.zzc.reportPlaybackErrorEvent(MM.b().setTimeSinceCreatedMillis(jElapsedRealtime - this.zzd).setErrorCode(i3).setSubErrorCode(iZzm).setException(zzbdVar).build());
                this.zzz = true;
                this.zzn = null;
            }
            iZzm = 0;
            this.zzc.reportPlaybackErrorEvent(MM.b().setTimeSinceCreatedMillis(jElapsedRealtime - this.zzd).setErrorCode(i3).setSubErrorCode(iZzm).setException(zzbdVar).build());
            this.zzz = true;
            this.zzn = null;
        }
        if (zzlvVar.zzd(2)) {
            zzby zzbyVarZzo = zzbkVar.zzo();
            boolean zZzb = zzbyVarZzo.zzb(2);
            boolean zZzb2 = zzbyVarZzo.zzb(1);
            boolean zZzb3 = zzbyVarZzo.zzb(3);
            if (zZzb || zZzb2) {
                if (!zZzb) {
                    zzw(jElapsedRealtime, null, 0);
                }
                if (!zZzb2) {
                    zzt(jElapsedRealtime, null, 0);
                }
                if (!zZzb3) {
                    zzu(jElapsedRealtime, null, 0);
                }
            } else if (zZzb3) {
                zZzb3 = true;
                if (!zZzb) {
                    zzw(jElapsedRealtime, null, 0);
                }
                if (!zZzb2) {
                    zzt(jElapsedRealtime, null, 0);
                }
                if (!zZzb3) {
                    zzu(jElapsedRealtime, null, 0);
                }
            }
        }
        if (zzy(this.zzo)) {
            zzab zzabVar = this.zzo.zza;
            if (zzabVar.zzw != -1) {
                zzw(jElapsedRealtime, zzabVar, 0);
                this.zzo = null;
            }
        }
        if (zzy(this.zzp)) {
            zzt(jElapsedRealtime, this.zzp.zza, 0);
            this.zzp = null;
        }
        if (zzy(this.zzq)) {
            zzu(jElapsedRealtime, this.zzq.zza, 0);
            this.zzq = null;
        }
        switch (zzdw.zzb(this.zza).zza()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 9;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
            case 8:
            default:
                i = 1;
                break;
            case 7:
                i = 3;
                break;
            case 9:
                i = 8;
                break;
            case 10:
                i = 7;
                break;
        }
        if (i != this.zzm) {
            this.zzm = i;
            this.zzc.reportNetworkEvent(AbstractC4043mO.c().setNetworkType(i).setTimeSinceCreatedMillis(jElapsedRealtime - this.zzd).build());
        }
        if (zzbkVar.zzf() != 2) {
            this.zzu = false;
        }
        if (((zzlr) zzbkVar).zzC() == null) {
            this.zzv = false;
        } else if (zzlvVar.zzd(10)) {
            this.zzv = true;
        }
        int iZzf = zzbkVar.zzf();
        if (this.zzu) {
            i2 = 5;
        } else if (this.zzv) {
            i2 = 13;
        } else {
            i2 = 4;
            if (iZzf == 4) {
                i2 = 11;
            } else if (iZzf == 2) {
                int i16 = this.zzl;
                if (i16 == 0 || i16 == 2 || i16 == 12) {
                    i2 = 2;
                } else if (zzbkVar.zzu()) {
                    i2 = zzbkVar.zzg() != 0 ? 10 : 6;
                } else {
                    i2 = 7;
                }
            } else if (iZzf != 3) {
                i2 = (iZzf != 1 || this.zzl == 0) ? this.zzl : 12;
            } else if (zzbkVar.zzu()) {
                i2 = zzbkVar.zzg() != 0 ? 9 : 3;
            }
        }
        if (this.zzl != i2) {
            this.zzl = i2;
            this.zzz = true;
            this.zzc.reportPlaybackStateEvent(MM.i().setState(this.zzl).setTimeSinceCreatedMillis(jElapsedRealtime - this.zzd).build());
        }
        if (zzlvVar.zzd(GL20.GL_FRONT)) {
            this.zzb.zzg(zzlvVar.zzc(GL20.GL_FRONT));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzj(zzlu zzluVar, zztx zztxVar, zzuc zzucVar, IOException iOException, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final /* synthetic */ void zzk(zzlu zzluVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzl(zzlu zzluVar, zzbd zzbdVar) {
        this.zzn = zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzm(zzlu zzluVar, zzbi zzbiVar, zzbi zzbiVar2, int i) {
        if (i == 1) {
            this.zzu = true;
            i = 1;
        }
        this.zzk = i;
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final /* synthetic */ void zzn(zzlu zzluVar, Object obj, long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzo(zzlu zzluVar, zzhs zzhsVar) {
        this.zzw += zzhsVar.zzg;
        this.zzx += zzhsVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final /* synthetic */ void zzp(zzlu zzluVar, zzab zzabVar, zzht zzhtVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzq(zzlu zzluVar, zzcd zzcdVar) {
        zzob zzobVar = this.zzo;
        if (zzobVar != null) {
            zzab zzabVar = zzobVar.zza;
            if (zzabVar.zzw == -1) {
                zzz zzzVarZzb = zzabVar.zzb();
                zzzVarZzb.zzaf(zzcdVar.zzb);
                zzzVarZzb.zzK(zzcdVar.zzc);
                this.zzo = new zzob(zzzVarZzb.zzag(), 0, zzobVar.zzc);
            }
        }
    }
}
