package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzaym implements zzayl {
    protected static volatile zzazt zza;
    protected MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected DisplayMetrics zzq;
    protected zzazl zzr;
    private double zzs;
    private double zzt;
    protected final LinkedList zzc = new LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzu = false;
    protected boolean zzp = false;

    public zzaym(Context context) {
        try {
            zzaxp.zza();
            this.zzq = context.getResources().getDisplayMetrics();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdz)).booleanValue()) {
                this.zzr = new zzazl();
            }
        } catch (Throwable unused) {
        }
    }

    private final void zzo() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        LinkedList linkedList = this.zzc;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.zzb = null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    private final String zzp(Context context, String str, int i2, View view, Activity activity, byte[] bArr) {
        zzayk zzaykVarZzh;
        String str2;
        int i3;
        Exception exc;
        int i4;
        int i5;
        String strZzb;
        int i6;
        int i7;
        zzavs zzavsVarZza;
        int i8;
        int i9;
        int i10 = i2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdk)).booleanValue();
        zzavs zzavsVarZzb = null;
        if (zBooleanValue) {
            zzaykVarZzh = zza != null ? zza.zzh() : null;
            str2 = "be";
        } else {
            zzaykVarZzh = null;
            str2 = null;
        }
        try {
            if (i10 == 3) {
                zzavsVarZzb = zzb(context, view, activity);
                try {
                    this.zzu = true;
                    i9 = 1002;
                } catch (Exception e2) {
                    exc = e2;
                    i3 = 3;
                    if (zBooleanValue) {
                        if (i10 == i3) {
                            i5 = 1003;
                        } else {
                            if (i10 == 2) {
                                i5 = 1009;
                            } else {
                                i4 = 1001;
                                i10 = 1;
                            }
                            zzaykVarZzh.zza(i4, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                        }
                        i4 = i5;
                        zzaykVarZzh.zza(i4, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                    }
                }
            } else {
                if (i10 == 2) {
                    zzavsVarZza = zzc(context, view, activity);
                    i8 = 1008;
                } else {
                    zzavsVarZza = zza(context, null);
                    i8 = 1000;
                }
                zzavsVarZzb = zzavsVarZza;
                i9 = i8;
            }
            if (!zBooleanValue || zzaykVarZzh == null) {
                i3 = 3;
            } else {
                i3 = 3;
                try {
                    zzaykVarZzh.zza(i9, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                } catch (Exception e3) {
                    e = e3;
                    exc = e;
                    if (zBooleanValue && zzaykVarZzh != null) {
                        if (i10 == i3) {
                            i5 = 1003;
                        } else {
                            if (i10 == 2) {
                                i5 = 1009;
                            } else {
                                i4 = 1001;
                                i10 = 1;
                            }
                            zzaykVarZzh.zza(i4, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                        }
                        i4 = i5;
                        zzaykVarZzh.zza(i4, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                    }
                }
            }
        } catch (Exception e4) {
            e = e4;
            i3 = 3;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (zzavsVarZzb != null) {
            try {
                if (((zzawp) zzavsVarZzb.zzbu()).zzbr() == 0) {
                    strZzb = Integer.toString(5);
                } else {
                    zzawp zzawpVar = (zzawp) zzavsVarZzb.zzbu();
                    int i11 = zzaxp.zzc;
                    strZzb = zzaxp.zzb(zzawpVar.zzaN(), str);
                    if (zBooleanValue && zzaykVarZzh != null) {
                        if (i10 == i3) {
                            i6 = 1006;
                        } else {
                            i6 = i10 == 2 ? 1010 : 1004;
                        }
                        zzaykVarZzh.zza(i6, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, null);
                    }
                }
            } catch (Exception e5) {
                strZzb = Integer.toString(7);
                if (zBooleanValue && zzaykVarZzh != null) {
                    if (i10 == i3) {
                        i7 = 1007;
                    } else {
                        i7 = i10 == 2 ? 1011 : 1005;
                    }
                    zzaykVarZzh.zza(i7, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, e5);
                }
            }
        } else {
            strZzb = Integer.toString(5);
        }
        return strZzb;
    }

    public abstract zzavs zza(Context context, zzave zzaveVar);

    public abstract zzavs zzb(Context context, View view, Activity activity);

    public abstract zzavs zzc(Context context, View view, Activity activity);

    @Override // com.google.android.gms.internal.ads.zzayl
    public final synchronized void zzd(MotionEvent motionEvent) {
        Long l2;
        try {
            if (this.zzu) {
                zzo();
                this.zzu = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.zzk = 0.0d;
                this.zzs = motionEvent.getRawX();
                this.zzt = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d = rawX - this.zzs;
                double d2 = rawY - this.zzt;
                this.zzk += Math.sqrt((d2 * d2) + (d * d));
                this.zzs = rawX;
                this.zzt = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.zzb = motionEventObtain;
                        LinkedList linkedList = this.zzc;
                        linkedList.add(motionEventObtain);
                        if (linkedList.size() > 6) {
                            ((MotionEvent) linkedList.remove()).recycle();
                        }
                        this.zzf++;
                        this.zzh = zzn(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.zze += (long) (motionEvent.getHistorySize() + 1);
                        zzazv zzazvVarZzm = zzm(motionEvent);
                        Long l3 = zzazvVarZzm.zzd;
                        if (l3 != null && zzazvVarZzm.zzg != null) {
                            this.zzi = l3.longValue() + zzazvVarZzm.zzg.longValue() + this.zzi;
                        }
                        if (this.zzq != null && (l2 = zzazvVarZzm.zze) != null && zzazvVarZzm.zzh != null) {
                            this.zzj = l2.longValue() + zzazvVarZzm.zzh.longValue() + this.zzj;
                        }
                    } else if (action2 == 3) {
                        this.zzg++;
                    }
                } catch (zzazj unused) {
                }
            } else {
                this.zzl = motionEvent.getX();
                this.zzm = motionEvent.getY();
                this.zzn = motionEvent.getRawX();
                this.zzo = motionEvent.getRawY();
                this.zzd++;
            }
            this.zzp = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final synchronized void zze(int i2, int i3, int i4) {
        try {
            if (this.zzb != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdi)).booleanValue()) {
                    zzo();
                } else {
                    this.zzb.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.zzq;
            if (displayMetrics != null) {
                float f = displayMetrics.density;
                this.zzb = MotionEvent.obtain(0L, i4, 1, i2 * f, i3 * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.zzb = null;
            }
            this.zzp = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final String zzf(Context context, String str, View view, Activity activity) {
        return zzp(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final String zzg(Context context, String str, View view) {
        return zzp(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public void zzh(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzazl zzazlVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdz)).booleanValue() || (zzazlVar = this.zzr) == null) {
            return;
        }
        zzazlVar.zza(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final String zzj(Context context, View view, Activity activity) {
        return zzp(context, null, 2, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final String zzk(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final String zzl(Context context) {
        if (zzazw.zzd()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zzp(context, null, 1, null, null, null);
    }

    public abstract zzazv zzm(MotionEvent motionEvent) throws zzazj;

    public abstract long zzn(StackTraceElement[] stackTraceElementArr) throws zzazj;
}
