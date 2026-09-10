package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzggc extends zzgfz {
    private final Map zza;
    private final zzgev zzb;
    private final DisplayMetrics zzc;

    public zzggc(zzavs zzavsVar, zzgev zzgevVar, Map map, DisplayMetrics displayMetrics, zzgnc zzgncVar) {
        super("TVhQaRYX1XJdJjovebNLV6RZa+CHXoXNSDwsvD2M+2M/jcZaYqephUke/9lWGtpK", "6PtDO9Iljdiz/XZTZ5iBSB6rGbi6sfeQlXfzSke6Ktw=", zzavsVar, zzgevVar, zzgncVar.zza(123));
        this.zzb = zzgevVar;
        this.zza = map;
        this.zzc = displayMetrics;
    }

    private static long zzb(double d, DisplayMetrics displayMetrics) {
        return Math.round(d / ((double) displayMetrics.density));
    }

    private static boolean zzc(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzgfz
    public final void zza(Method method, zzavs zzavsVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr;
        Map map = this.zza;
        MotionEvent motionEvent = (MotionEvent) map.get("nv");
        DisplayMetrics displayMetrics = this.zzc;
        Object[] objArr2 = (Object[]) method.invoke("", motionEvent, displayMetrics);
        objArr2.getClass();
        zzawl zzawlVarZza = zzawm.zza();
        Object obj = objArr2[0];
        if (obj != null && objArr2[1] != null) {
            zzawlVarZza.zza(((Long) obj).longValue());
            zzawlVarZza.zzb(((Long) objArr2[1]).longValue());
        }
        Object obj2 = objArr2[2];
        if (obj2 != null) {
            zzawlVarZza.zzh(((Long) obj2).longValue());
        }
        Object obj3 = objArr2[3];
        if (obj3 != null) {
            zzawlVarZza.zzf(((Long) obj3).longValue());
        }
        Object obj4 = objArr2[4];
        if (obj4 != null) {
            zzawlVarZza.zzc(((Long) obj4).longValue());
        }
        Object obj5 = objArr2[5];
        if (obj5 != null) {
            zzawlVarZza.zzs(((Long) obj5).longValue() != 0 ? 2 : 1);
        }
        Object obj6 = objArr2[6];
        if (obj6 != null) {
            zzawlVarZza.zzj(((Long) obj6).longValue());
        }
        Object obj7 = objArr2[7];
        if (obj7 != null) {
            zzawlVarZza.zzi(((Long) obj7).longValue());
        }
        Object obj8 = objArr2[8];
        if (obj8 != null) {
            zzawlVarZza.zzt(((Long) obj8).longValue() != 0 ? 2 : 1);
        }
        synchronized (zzavsVar) {
            try {
                Method methodZzc = this.zzb.zzc("o3UXVie8/suJOQmyOLMVpxbmPmxGzwCoQMAjB1gTC92yDn7FjyneAFFenBlXs1/s", "Pvu/YKY6AN7DXo4Zzc6oTKshDXcTgIHi2A4rOK2JeRs=");
                if (methodZzc == null || (objArr = (Object[]) methodZzc.invoke("", (MotionEvent) map.get("nv"), displayMetrics)) == null) {
                    throw null;
                }
                Object obj9 = objArr[0];
                if (obj9 != null) {
                    zzavsVar.zzh(((Long) obj9).longValue());
                }
                Object obj10 = objArr[1];
                if (obj10 != null) {
                    zzavsVar.zzi(((Long) obj10).longValue());
                }
                Object obj11 = objArr[2];
                if (obj11 != null) {
                    zzavsVar.zzj(((Long) obj11).longValue());
                }
                Object obj12 = objArr[3];
                if (obj12 != null) {
                    zzavsVar.zzv(((Long) obj12).longValue());
                }
                Object obj13 = objArr[4];
                if (obj13 != null) {
                    zzavsVar.zzw(((Long) obj13).longValue());
                }
                zzgdp zzgdpVar = (zzgdp) map.get("oe");
                if (zzgdpVar != null) {
                    long j = zzgdpVar.zza;
                    if (j > 0) {
                        zzavsVar.zzz(j);
                    }
                    long j2 = zzgdpVar.zzb;
                    if (j2 > 0) {
                        zzavsVar.zzy(j2);
                    }
                    long j3 = zzgdpVar.zzc;
                    if (j3 > 0) {
                        zzavsVar.zzx(j3);
                    }
                    long j4 = zzgdpVar.zzd;
                    if (j4 > 0) {
                        zzavsVar.zzA(j4);
                    }
                }
                zzgdp zzgdpVar2 = (zzgdp) map.get("oe");
                if (zzgdpVar2 != null && zzgdpVar2.zza != 0 && zzc(displayMetrics)) {
                    double d = zzgdpVar2.zze;
                    if (displayMetrics == null) {
                        throw null;
                    }
                    zzawlVarZza.zzl(zzb(d, displayMetrics));
                    zzawlVarZza.zzm(zzb(zzgdpVar2.zzh - zzgdpVar2.zzf, displayMetrics));
                    zzawlVarZza.zzn(zzb(zzgdpVar2.zzi - zzgdpVar2.zzg, displayMetrics));
                    zzawlVarZza.zzq(zzb(zzgdpVar2.zzf, displayMetrics));
                    zzawlVarZza.zzr(zzb(zzgdpVar2.zzg, displayMetrics));
                    MotionEvent motionEvent2 = (MotionEvent) map.get("nv");
                    if (motionEvent2 != null) {
                        long jZzb = zzb(((zzgdpVar2.zzf - zzgdpVar2.zzh) + motionEvent2.getRawX()) - motionEvent2.getX(), displayMetrics);
                        if (jZzb != 0) {
                            zzawlVarZza.zzo(jZzb);
                        }
                        long jZzb2 = zzb(((zzgdpVar2.zzg - zzgdpVar2.zzi) + motionEvent2.getRawY()) - motionEvent2.getY(), displayMetrics);
                        if (jZzb2 != 0) {
                            zzawlVarZza.zzp(jZzb2);
                        }
                    }
                }
                zzavsVar.zzJ(zzawlVarZza);
                zzgdq[] zzgdqVarArr = (zzgdq[]) map.get("ro");
                if (zzgdqVarArr != null && zzc(displayMetrics)) {
                    for (int i2 = 0; i2 <= zzgdqVarArr.length - 2; i2++) {
                        zzgdq zzgdqVar = zzgdqVarArr[i2];
                        zzawl zzawlVarZza2 = zzawm.zza();
                        double d2 = zzgdqVar.zza;
                        if (displayMetrics == null) {
                            throw null;
                        }
                        zzawlVarZza2.zza(zzb(d2, displayMetrics));
                        zzawlVarZza2.zzb(zzb(zzgdqVar.zzb, displayMetrics));
                        zzavsVar.zzK((zzawm) zzawlVarZza2.zzbu());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
