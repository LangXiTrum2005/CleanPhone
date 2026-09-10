package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3611hU;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.YB;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzoi {

    @VisibleForTesting
    static final zzfxq zzb;
    private final SparseArray zzd = new SparseArray();
    private final int zze;
    public static final zzoi zza = new zzoi(zzfxn.zzo(zzoh.zza));

    @SuppressLint({"InlinedApi"})
    private static final zzfxn zzc = zzfxn.zzq(2, 5, 6);

    static {
        zzfxp zzfxpVar = new zzfxp();
        zzfxpVar.zza(5, 6);
        zzfxpVar.zza(17, 6);
        zzfxpVar.zza(7, 6);
        zzfxpVar.zza(30, 10);
        zzfxpVar.zza(18, 6);
        zzfxpVar.zza(6, 8);
        zzfxpVar.zza(8, 8);
        zzfxpVar.zza(14, 8);
        zzb = zzfxpVar.zzc();
    }

    private zzoi(List list) {
        for (int i = 0; i < list.size(); i++) {
            zzoh zzohVar = (zzoh) list.get(i);
            this.zzd.put(zzohVar.zzb, zzohVar);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.zzd.size(); i2++) {
            iMax = Math.max(iMax, ((zzoh) this.zzd.valueAt(i2)).zzc);
        }
        this.zze = iMax;
    }

    @Nullable
    public static Uri zza() {
        if (zzf()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public static zzoi zzc(Context context, zze zzeVar, @Nullable zzoo zzooVar) {
        return zzd(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzeVar, zzooVar);
    }

    @SuppressLint({"InlinedApi"})
    public static zzoi zzd(Context context, @Nullable Intent intent, zze zzeVar, @Nullable zzoo zzooVar) {
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        if (zzooVar == null) {
            zzoo zzooVar2 = null;
            if (zzei.zza >= 33) {
                try {
                    List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(zzeVar.zza().zza);
                    if (!audioDevicesForAttributes.isEmpty()) {
                        zzooVar2 = new zzoo(YB.i(audioDevicesForAttributes.get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            zzooVar = zzooVar2;
        }
        int i = zzei.zza;
        if (i >= 33 && (zzei.zzM(context) || zzei.zzI(context))) {
            List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(zzeVar.zza().zza);
            HashMap map = new HashMap();
            map.put(2, new HashSet(zzgaq.zzg(12)));
            for (int i2 = 0; i2 < directProfilesForAttributes.size(); i2++) {
                AudioProfile audioProfileF = AbstractC3611hU.f(directProfilesForAttributes.get(i2));
                if (audioProfileF.getEncapsulationType() != 1) {
                    int format = audioProfileF.getFormat();
                    if (zzei.zzJ(format) || zzb.containsKey(Integer.valueOf(format))) {
                        Integer numValueOf = Integer.valueOf(format);
                        if (map.containsKey(numValueOf)) {
                            Set set = (Set) map.get(numValueOf);
                            set.getClass();
                            set.addAll(zzgaq.zzg(audioProfileF.getChannelMasks()));
                        } else {
                            map.put(numValueOf, new HashSet(zzgaq.zzg(audioProfileF.getChannelMasks())));
                        }
                    }
                }
            }
            zzfxk zzfxkVar = new zzfxk();
            for (Map.Entry entry : map.entrySet()) {
                zzfxkVar.zzf(new zzoh(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new zzoi(zzfxkVar.zzi());
        }
        if (i >= 23) {
            AudioDeviceInfo[] devices = zzooVar == null ? audioManager.getDevices(2) : new AudioDeviceInfo[]{zzooVar.zza};
            zzfxr zzfxrVar = new zzfxr();
            zzfxrVar.zzg(8, 7);
            if (i >= 31) {
                zzfxrVar.zzg(26, 27);
            }
            if (i >= 33) {
                zzfxrVar.zzf((Object) 30);
            }
            zzfxs zzfxsVarZzi = zzfxrVar.zzi();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (zzfxsVarZzi.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return zza;
                }
            }
        }
        zzfxr zzfxrVar2 = new zzfxr();
        zzfxrVar2.zzf((Object) 2);
        if (zzei.zza >= 29 && (zzei.zzM(context) || zzei.zzI(context))) {
            zzfxk zzfxkVar2 = new zzfxk();
            zzfzt it = zzb.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (zzei.zza >= zzei.zzh(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), zzeVar.zza().zza)) {
                    zzfxkVar2.zzf(num);
                }
            }
            zzfxkVar2.zzf((Object) 2);
            zzfxrVar2.zzh(zzfxkVar2.zzi());
            return new zzoi(zze(zzgaq.zzh(zzfxrVar2.zzi()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z || zzf()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            zzfxrVar2.zzh(zzc);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new zzoi(zze(zzgaq.zzh(zzfxrVar2.zzi()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            zzfxrVar2.zzh(zzgaq.zzg(intArrayExtra));
        }
        return new zzoi(zze(zzgaq.zzh(zzfxrVar2.zzi()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    private static zzfxn zze(@Nullable int[] iArr, int i) {
        zzfxk zzfxkVar = new zzfxk();
        for (int i2 : iArr) {
            zzfxkVar.zzf(new zzoh(i2, i));
        }
        return zzfxkVar.zzi();
    }

    private static boolean zzf() {
        String str = zzei.zzc;
        return "Amazon".equals(str) || "Xiaomi".equals(str);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0045 A[RETURN] */
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzoi)) {
            return false;
        }
        zzoi zzoiVar = (zzoi) obj;
        SparseArray sparseArray = this.zzd;
        SparseArray sparseArray2 = zzoiVar.zzd;
        if (zzei.zza < 31) {
            int size = sparseArray.size();
            if (size == sparseArray2.size()) {
                for (int i = 0; i < size; i++) {
                    if (Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                    }
                }
                if (this.zze == zzoiVar.zze) {
                    return true;
                }
            }
        } else if (sparseArray.contentEquals(sparseArray2)) {
            if (this.zze == zzoiVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iContentHashCode;
        int i = zzei.zza;
        SparseArray sparseArray = this.zzd;
        if (i >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i2)) + ((sparseArray.keyAt(i2) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.zze;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.zze + ", audioProfiles=" + this.zzd.toString() + "]";
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:16:0x003c A[PHI: r0
  0x003c: PHI (r0v3 int) = (r0v2 int), (r0v7 int) binds: [B:11:0x002d, B:14:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    @Nullable
    public final Pair zzb(zzab zzabVar, zze zzeVar) {
        String str = zzabVar.zzo;
        str.getClass();
        int iZza = zzbb.zza(str, zzabVar.zzk);
        if (!zzb.containsKey(Integer.valueOf(iZza))) {
            return null;
        }
        int i = 8;
        if (iZza != 18) {
            if (iZza != 8) {
                if (iZza == 30 && !zzei.zzG(this.zzd, 30)) {
                    iZza = 7;
                }
            } else if (zzei.zzG(this.zzd, 8)) {
                iZza = 8;
                if (iZza == 30) {
                    iZza = 7;
                }
            } else {
                iZza = 7;
            }
        } else if (zzei.zzG(this.zzd, 18)) {
            iZza = 18;
            if (iZza != 8) {
                if (iZza == 30) {
                    iZza = 7;
                }
            } else if (zzei.zzG(this.zzd, 8)) {
                iZza = 8;
                if (iZza == 30) {
                    iZza = 7;
                }
            } else {
                iZza = 7;
            }
        } else {
            iZza = 6;
        }
        if (!zzei.zzG(this.zzd, iZza)) {
            return null;
        }
        zzoh zzohVar = (zzoh) this.zzd.get(iZza);
        zzohVar.getClass();
        int iZza2 = zzabVar.zzD;
        if (iZza2 == -1 || iZza == 18) {
            int i2 = zzabVar.zzE;
            if (i2 == -1) {
                i2 = 48000;
            }
            iZza2 = zzohVar.zza(i2, zzeVar);
        } else if (!zzabVar.zzo.equals("audio/vnd.dts.uhd;profile=p2") || zzei.zza >= 33) {
            if (!zzohVar.zzb(iZza2)) {
                return null;
            }
        } else if (iZza2 > 10) {
            return null;
        }
        int i3 = zzei.zza;
        if (i3 > 28) {
            i = iZza2;
        } else if (iZza2 != 7) {
            if (iZza2 == 3 || iZza2 == 4 || iZza2 == 5) {
                i = 6;
            } else {
                i = iZza2;
            }
        }
        if (i3 <= 26 && "fugu".equals(zzei.zzb) && i == 1) {
            i = 2;
        }
        int iZzi = zzei.zzi(i);
        if (iZzi != 0) {
            return Pair.create(Integer.valueOf(iZza), Integer.valueOf(iZzi));
        }
        return null;
    }
}
