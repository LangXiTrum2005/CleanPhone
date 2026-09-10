package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.exoplayer.analytics.q;
import com.p004ironsource.d9;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzpp {
    static final zzgtg zzb;
    private final SparseArray zzd = new SparseArray();
    private final int zze;
    public static final zzpp zza = new zzpp(zzgtd.zzj(zzpo.zza));
    private static final zzgtd zzc = zzgtd.zzl(2, 5, 6);

    static {
        zzgtf zzgtfVar = new zzgtf();
        zzgtfVar.zza(5, 6);
        zzgtfVar.zza(17, 6);
        zzgtfVar.zza(7, 6);
        zzgtfVar.zza(30, 10);
        zzgtfVar.zza(18, 6);
        zzgtfVar.zza(6, 8);
        zzgtfVar.zza(8, 8);
        zzgtfVar.zza(14, 8);
        zzb = zzgtfVar.zzc();
    }

    private zzpp(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzpo zzpoVar = (zzpo) list.get(i2);
            this.zzd.put(zzpoVar.zzb, zzpoVar);
        }
        int iMax = 0;
        for (int i3 = 0; i3 < this.zzd.size(); i3++) {
            iMax = Math.max(iMax, ((zzpo) this.zzd.valueAt(i3)).zzc);
        }
        this.zze = iMax;
    }

    public static zzpp zza(Context context, zzd zzdVar, AudioDeviceInfo audioDeviceInfo) {
        return zzb(context, androidx.datastore.preferences.protobuf.a.d("android.media.action.HDMI_AUDIO_PLUG", context, null), zzdVar, audioDeviceInfo);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    public static zzpp zzb(Context context, Intent intent, zzd zzdVar, AudioDeviceInfo audioDeviceInfo) {
        AudioManager audioManagerZza = zzcj.zza(context);
        if (audioDeviceInfo == null) {
            if (Build.VERSION.SDK_INT >= 33) {
                List audioDevicesForAttributes = audioManagerZza.getAudioDevicesForAttributes(zzdVar.zza());
                if (audioDevicesForAttributes.isEmpty()) {
                    audioDeviceInfo = null;
                } else {
                    audioDeviceInfo = (AudioDeviceInfo) audioDevicesForAttributes.get(0);
                }
            } else {
                audioDeviceInfo = null;
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33 && (zzfj.zzM(context) || zzfj.zzN(context))) {
            List directProfilesForAttributes = audioManagerZza.getDirectProfilesForAttributes(zzdVar.zza());
            HashMap map = new HashMap();
            map.put(2, new HashSet(zzgwx.zzg(12)));
            for (int i3 = 0; i3 < directProfilesForAttributes.size(); i3++) {
                AudioProfile audioProfileC = q.c(directProfilesForAttributes.get(i3));
                if (audioProfileC.getEncapsulationType() != 1) {
                    int format = audioProfileC.getFormat();
                    if (zzfj.zzA(format) || zzb.containsKey(Integer.valueOf(format))) {
                        Integer numValueOf = Integer.valueOf(format);
                        if (map.containsKey(numValueOf)) {
                            Set set = (Set) map.get(numValueOf);
                            set.getClass();
                            set.addAll(zzgwx.zzg(audioProfileC.getChannelMasks()));
                        } else {
                            map.put(numValueOf, new HashSet(zzgwx.zzg(audioProfileC.getChannelMasks())));
                        }
                    }
                }
            }
            int i4 = zzgtd.zzd;
            zzgta zzgtaVar = new zzgta();
            for (Map.Entry entry : map.entrySet()) {
                zzgtaVar.zzf(new zzpo(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new zzpp(zzgtaVar.zzi());
        }
        AudioDeviceInfo[] devices = audioDeviceInfo == null ? audioManagerZza.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo};
        zzgtm zzgtmVar = new zzgtm();
        zzgtmVar.zzg(8, 7);
        if (i2 >= 31) {
            zzgtmVar.zzg(26, 27);
        }
        if (i2 >= 33) {
            zzgtmVar.zzf((Object) 30);
        }
        zzgtn zzgtnVarZzi = zzgtmVar.zzi();
        for (AudioDeviceInfo audioDeviceInfo2 : devices) {
            if (zzgtnVarZzi.contains(Integer.valueOf(audioDeviceInfo2.getType()))) {
                return zza;
            }
        }
        zzgtm zzgtmVar2 = new zzgtm();
        zzgtmVar2.zzf((Object) 2);
        if (Build.VERSION.SDK_INT >= 29 && (zzfj.zzM(context) || zzfj.zzN(context))) {
            int i5 = zzgtd.zzd;
            zzgta zzgtaVar2 = new zzgta();
            zzgvr it = zzb.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (Build.VERSION.SDK_INT >= zzfj.zzC(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), zzdVar.zza())) {
                    zzgtaVar2.zzf(num);
                }
            }
            zzgtaVar2.zzf((Object) 2);
            zzgtmVar2.zzh(zzgtaVar2.zzi());
            return new zzpp(zzf(zzgwx.zzf(zzgtmVar2.zzi()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z2 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z2 || zze()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            zzgtmVar2.zzh(zzc);
        }
        if (intent == null || z2 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new zzpp(zzf(zzgwx.zzf(zzgtmVar2.zzi()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            zzgtmVar2.zzh(zzgwx.zzg(intArrayExtra));
        }
        return new zzpp(zzf(zzgwx.zzf(zzgtmVar2.zzi()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    public static Uri zzc() {
        if (zze()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    private static boolean zze() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    private static zzgtd zzf(int[] iArr, int i2) {
        int i3 = zzgtd.zzd;
        zzgta zzgtaVar = new zzgta();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i4 : iArr) {
            zzgtaVar.zzf(new zzpo(i4, i2));
        }
        return zzgtaVar.zzi();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzpp) {
                zzpp zzppVar = (zzpp) obj;
                SparseArray sparseArray = this.zzd;
                SparseArray sparseArray2 = zzppVar.zzd;
                String str = zzfj.zza;
                if (Build.VERSION.SDK_INT < 31) {
                    int size = sparseArray.size();
                    if (size == sparseArray2.size()) {
                        for (int i2 = 0; i2 < size; i2++) {
                            if (Objects.equals(sparseArray.valueAt(i2), sparseArray2.get(sparseArray.keyAt(i2)))) {
                            }
                        }
                        if (this.zze == zzppVar.zze) {
                        }
                    }
                } else if (sparseArray.contentEquals(sparseArray2)) {
                    if (this.zze == zzppVar.zze) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iContentHashCode;
        String str = zzfj.zza;
        int i2 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.zzd;
        if (i2 >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i3)) + ((sparseArray.keyAt(i3) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.zze;
    }

    public final String toString() {
        String string = this.zzd.toString();
        int i2 = this.zze;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 50 + string.length() + 1);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i2);
        sb.append(", audioProfiles=");
        sb.append(string);
        sb.append(d9.i.f24752e);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003a A[PHI: r1
  0x003a: PHI (r1v3 int) = (r1v2 int), (r1v7 int) binds: [B:11:0x002c, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    public final Pair zzd(zzv zzvVar, zzd zzdVar) {
        String str = zzvVar.zzo;
        str.getClass();
        int iZzg = zzas.zzg(str, zzvVar.zzk);
        if (!zzb.containsKey(Integer.valueOf(iZzg))) {
            return null;
        }
        int i2 = 8;
        if (iZzg != 18) {
            if (iZzg != 8) {
                if (iZzg == 30 && !zzfj.zza(this.zzd, 30)) {
                    iZzg = 7;
                }
            } else if (zzfj.zza(this.zzd, 8)) {
                iZzg = 8;
                if (iZzg == 30) {
                    iZzg = 7;
                }
            } else {
                iZzg = 7;
            }
        } else if (zzfj.zza(this.zzd, 18)) {
            iZzg = 18;
            if (iZzg != 8) {
                if (iZzg == 30) {
                    iZzg = 7;
                }
            } else if (zzfj.zza(this.zzd, 8)) {
                iZzg = 8;
                if (iZzg == 30) {
                    iZzg = 7;
                }
            } else {
                iZzg = 7;
            }
        } else {
            iZzg = 6;
        }
        SparseArray sparseArray = this.zzd;
        if (!zzfj.zza(sparseArray, iZzg)) {
            return null;
        }
        zzpo zzpoVar = (zzpo) sparseArray.get(iZzg);
        zzpoVar.getClass();
        int iZzb = zzvVar.zzG;
        if (iZzb == -1 || iZzg == 18) {
            int i3 = zzvVar.zzH;
            if (i3 == -1) {
                i3 = 48000;
            }
            iZzb = zzpoVar.zzb(i3, zzdVar);
        } else if (!str.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (!zzpoVar.zza(iZzb)) {
                return null;
            }
        } else if (iZzb > 10) {
            return null;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 > 28) {
            i2 = iZzb;
        } else if (iZzb != 7) {
            if (iZzb == 3 || iZzb == 4 || iZzb == 5) {
                i2 = 6;
            } else {
                i2 = iZzb;
            }
        }
        if (i4 <= 26 && "fugu".equals(Build.DEVICE) && i2 == 1) {
            i2 = 2;
        }
        int iZzB = zzfj.zzB(i2);
        if (iZzB != 0) {
            return Pair.create(Integer.valueOf(iZzg), Integer.valueOf(iZzB));
        }
        return null;
    }
}
