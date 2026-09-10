package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Choreographer;
import android.view.Surface;
import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes4.dex */
public final class zzact {
    private final Context zzb;
    private zzacp zzc;
    private boolean zzd;
    private Surface zze;
    private float zzg;
    private float zzh;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private final zzabp zza = new zzabp();
    private float zzf = -1.0f;
    private float zzi = 1.0f;
    private int zzj = 0;

    public zzact(Context context) {
        this.zzb = context;
    }

    private final void zzj() {
        this.zzm = 0L;
        this.zzq = -1L;
        this.zzn = -1L;
        this.zzk = 0L;
        this.zzl = 0L;
    }

    private final void zzk() {
        if (Build.VERSION.SDK_INT < 30 || this.zze == null) {
            return;
        }
        zzabp zzabpVar = this.zza;
        float fZzg = zzabpVar.zzc() ? zzabpVar.zzg() : this.zzf;
        float f = this.zzg;
        if (fZzg != f) {
            if (fZzg != -1.0f && f != -1.0f) {
                float f2 = 1.0f;
                if (zzabpVar.zzc() && zzabpVar.zze() >= 5000000000L) {
                    f2 = 0.1f;
                }
                if (Math.abs(fZzg - this.zzg) < f2) {
                    return;
                }
            } else if (fZzg == -1.0f && zzabpVar.zzd() < 30) {
                return;
            }
            this.zzg = fZzg;
            zzl(false);
        }
    }

    private final void zzl(boolean z2) {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        float f = 0.0f;
        if (this.zzd) {
            float f2 = this.zzg;
            if (f2 != -1.0f) {
                f = this.zzi * f2;
            }
        }
        if (z2 || this.zzh != f) {
            this.zzh = f;
            zzaco.zza(this.zze, f);
        }
    }

    private final void zzm() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f || !surface.isValid()) {
            return;
        }
        this.zzh = 0.0f;
        zzaco.zza(this.zze, 0.0f);
    }

    public final void zza(int i2) {
        if (this.zzj == i2) {
            return;
        }
        this.zzj = i2;
        zzl(true);
    }

    public final void zzb() {
        this.zzd = true;
        zzj();
        DisplayManager displayManager = (DisplayManager) this.zzb.getSystemService(d9.h.d);
        zzacp zzacsVar = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                zzacsVar = Build.VERSION.SDK_INT >= 33 ? new zzacs(choreographer, displayManager, null) : new zzacq(choreographer, displayManager, null);
            } catch (RuntimeException e2) {
                zzee.zzd("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e2);
            }
        }
        this.zzc = zzacsVar;
        if (zzacsVar != null) {
            zzacsVar.zza();
        }
        zzl(false);
    }

    public final void zzc(Surface surface) {
        if (this.zze == surface) {
            return;
        }
        zzm();
        this.zze = surface;
        zzl(true);
    }

    public final void zzd() {
        zzj();
    }

    public final void zze(float f) {
        this.zzi = f;
        zzl(false);
    }

    public final void zzf(float f) {
        this.zzf = f;
        this.zza.zza();
        zzk();
    }

    public final void zzg(long j) {
        long j2 = this.zzn;
        if (j2 != -1) {
            this.zzq = j2;
            this.zzr = this.zzo;
            this.zzs = this.zzp;
            this.zzk = this.zzl;
        }
        this.zzm++;
        this.zza.zzb(j * 1000);
        zzk();
    }

    public final void zzh() {
        this.zzd = false;
        zzacp zzacpVar = this.zzc;
        if (zzacpVar != null) {
            zzacpVar.zzb();
        }
        zzm();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b2  */
    public final long zzi(long j, long j2) {
        long j3;
        long j4;
        long j5;
        long jZzf;
        if (this.zzq != -1) {
            zzabp zzabpVar = this.zza;
            if (zzabpVar.zzc()) {
                jZzf = (long) (((this.zzm - this.zzq) * zzabpVar.zzf()) / this.zzi);
            } else {
                jZzf = (long) (((j2 - this.zzs) * 1000) / this.zzi);
            }
            j3 = this.zzr + jZzf;
            if (Math.abs(j - j3) > 20000000) {
                zzj();
                j3 = j;
            }
        } else {
            j3 = j;
        }
        this.zzn = this.zzm;
        this.zzo = j3;
        this.zzp = j2;
        zzacp zzacpVar = this.zzc;
        if (zzacpVar != null) {
            long j6 = zzacpVar.zzc;
            long j7 = this.zzc.zzd;
            if (j6 != -9223372036854775807L && j7 != -9223372036854775807L) {
                long j8 = (((j3 - j6) / j7) * j7) + j6;
                if (j3 <= j8) {
                    j4 = j8 - j7;
                } else {
                    j8 += j7;
                    j4 = j8;
                }
                long j9 = j7 / 2;
                long j10 = j8 - j3;
                long j11 = j3 - j4;
                long jAbs = Math.abs(j10 - j11);
                if (jAbs < j9) {
                    long j12 = j7 / 4;
                    if (jAbs < j12) {
                        j5 = this.zzk;
                        if (j5 == 0) {
                            if (j10 < j11) {
                                j12 = -j12;
                            }
                        }
                        if (j10 + j5 >= j11) {
                            j8 = j4;
                        }
                        return j8 - ((j7 * 80) / 100);
                    }
                    j12 = 0;
                    this.zzl = j12;
                    j5 = j12;
                    if (j10 + j5 >= j11) {
                        j8 = j4;
                    }
                    return j8 - ((j7 * 80) / 100);
                }
                j5 = this.zzk;
                this.zzl = j5;
                if (j10 + j5 >= j11) {
                    j8 = j4;
                }
                return j8 - ((j7 * 80) / 100);
            }
        }
        return j3;
    }
}
