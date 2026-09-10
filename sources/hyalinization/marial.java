package hyalinization;

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
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.immediately;
import com.google.common.primitives.Ints;
import com.ironsource.X3;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: AudioCapabilities.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final SparseArray<C0639marial> f28069attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f28070saneness;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final marial f28066dern = new marial(ImmutableList.of(C0639marial.f28071wireman));

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final ImmutableList<Integer> f28068wireman = ImmutableList.of(2, 5, 6);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final ImmutableMap<Integer, Integer> f28067marial = new ImmutableMap.saneness().competently(5, 6).competently(17, 6).competently(7, 6).competently(30, 10).competently(18, 6).competently(6, 8).competently(8, 8).competently(14, 8).dern();

    /* JADX INFO: compiled from: AudioCapabilities.java */
    public static final class dern {
        public static ImmutableList<Integer> attabal(androidx.media3.common.saneness sanenessVar) {
            ImmutableList.attabal attabalVarBuilder = ImmutableList.builder();
            immediately<Integer> it = marial.f28067marial.keySet().iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                int iIntValue = next.intValue();
                if (decarock.grimness.f25080attabal >= decarock.grimness.merc(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), sanenessVar.attabal().f11287attabal)) {
                    attabalVarBuilder.attabal(next);
                }
            }
            attabalVarBuilder.attabal(2);
            return attabalVarBuilder.impassible();
        }

        public static int saneness(int i, int i2, androidx.media3.common.saneness sanenessVar) {
            for (int i3 = 10; i3 > 0; i3--) {
                int iSeminary = decarock.grimness.seminary(i3);
                if (iSeminary != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(iSeminary).build(), sanenessVar.attabal().f11287attabal)) {
                    return i3;
                }
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: AudioCapabilities.java */
    public static final class saneness {
        private static ImmutableSet<Integer> attabal() {
            ImmutableSet.attabal attabalVarCutely = new ImmutableSet.attabal().cutely(8, 7);
            int i = decarock.grimness.f25080attabal;
            if (i >= 31) {
                attabalVarCutely.cutely(26, 27);
            }
            if (i >= 33) {
                attabalVarCutely.attabal(30);
            }
            return attabalVarCutely.triweekly();
        }

        public static boolean saneness(AudioManager audioManager, taiyuan taiyuanVar) {
            AudioDeviceInfo[] devices = taiyuanVar == null ? ((AudioManager) decarock.attabal.marial(audioManager)).getDevices(2) : new AudioDeviceInfo[]{taiyuanVar.f28111attabal};
            ImmutableSet<Integer> immutableSetAttabal = attabal();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (immutableSetAttabal.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: AudioCapabilities.java */
    public static final class wireman {
        public static marial attabal(AudioManager audioManager, androidx.media3.common.saneness sanenessVar) {
            return new marial(marial.dern(audioManager.getDirectProfilesForAttributes(sanenessVar.attabal().f11287attabal)));
        }

        public static taiyuan saneness(AudioManager audioManager, androidx.media3.common.saneness sanenessVar) {
            try {
                List audioDevicesForAttributes = ((AudioManager) decarock.attabal.marial(audioManager)).getAudioDevicesForAttributes(sanenessVar.attabal().f11287attabal);
                if (audioDevicesForAttributes.isEmpty()) {
                    return null;
                }
                return new taiyuan((AudioDeviceInfo) audioDevicesForAttributes.get(0));
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    public static marial beachfront(Context context, Intent intent, androidx.media3.common.saneness sanenessVar, taiyuan taiyuanVar) {
        AudioManager audioManager = (AudioManager) decarock.attabal.marial(context.getSystemService("audio"));
        if (taiyuanVar == null) {
            taiyuanVar = decarock.grimness.f25080attabal >= 33 ? wireman.saneness(audioManager, sanenessVar) : null;
        }
        int i = decarock.grimness.f25080attabal;
        if (i >= 33 && (decarock.grimness.unconsolidated(context) || decarock.grimness.gusty(context))) {
            return wireman.attabal(audioManager, sanenessVar);
        }
        if (i >= 23 && saneness.saneness(audioManager, taiyuanVar)) {
            return f28066dern;
        }
        ImmutableSet.attabal attabalVar = new ImmutableSet.attabal();
        attabalVar.attabal(2);
        if (i >= 29 && (decarock.grimness.unconsolidated(context) || decarock.grimness.gusty(context))) {
            attabalVar.apical(dern.attabal(sanenessVar));
            return new marial(wireman(Ints.impassible(attabalVar.triweekly()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z || saneness()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            attabalVar.apical(f28068wireman);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new marial(wireman(Ints.impassible(attabalVar.triweekly()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            attabalVar.apical(Ints.dern(intArrayExtra));
        }
        return new marial(wireman(Ints.impassible(attabalVar.triweekly()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    public static marial competently(Context context, androidx.media3.common.saneness sanenessVar, taiyuan taiyuanVar) {
        return beachfront(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), sanenessVar, taiyuanVar);
    }

    public static Uri cutely() {
        if (saneness()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    public static ImmutableList<C0639marial> dern(List<AudioProfile> list) {
        HashMap map = new HashMap();
        map.put(2, new HashSet(Ints.dern(12)));
        for (int i = 0; i < list.size(); i++) {
            AudioProfile audioProfileAttabal = hyalinization.attabal.attabal(list.get(i));
            if (audioProfileAttabal.getEncapsulationType() != 1) {
                int format = audioProfileAttabal.getFormat();
                if (decarock.grimness.lightstruck(format) || f28067marial.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        ((Set) decarock.attabal.marial((Set) map.get(Integer.valueOf(format)))).addAll(Ints.dern(audioProfileAttabal.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(Ints.dern(audioProfileAttabal.getChannelMasks())));
                    }
                }
            }
        }
        ImmutableList.attabal attabalVarBuilder = ImmutableList.builder();
        for (Map.Entry entry : map.entrySet()) {
            attabalVarBuilder.attabal(new C0639marial(((Integer) entry.getKey()).intValue(), (Set<Integer>) entry.getValue()));
        }
        return attabalVarBuilder.impassible();
    }

    public static int impromptu(int i) {
        int i2 = decarock.grimness.f25080attabal;
        if (i2 <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (i2 <= 26 && "fugu".equals(decarock.grimness.f25091saneness) && i == 1) {
            i = 2;
        }
        return decarock.grimness.seminary(i);
    }

    public static marial marial(Context context, androidx.media3.common.saneness sanenessVar, AudioDeviceInfo audioDeviceInfo) {
        return competently(context, sanenessVar, (decarock.grimness.f25080attabal < 23 || audioDeviceInfo == null) ? null : new taiyuan(audioDeviceInfo));
    }

    public static boolean saneness() {
        String str = decarock.grimness.f25084dern;
        return "Amazon".equals(str) || "Xiaomi".equals(str);
    }

    public static ImmutableList<C0639marial> wireman(int[] iArr, int i) {
        ImmutableList.attabal attabalVarBuilder = ImmutableList.builder();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            attabalVarBuilder.attabal(new C0639marial(i2, i));
        }
        return attabalVarBuilder.impassible();
    }

    public boolean apical(androidx.media3.common.polloi polloiVar, androidx.media3.common.saneness sanenessVar) {
        return taiyuan(polloiVar, sanenessVar) != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof marial)) {
            return false;
        }
        marial marialVar = (marial) obj;
        return decarock.grimness.molybdenite(this.f28069attabal, marialVar.f28069attabal) && this.f28070saneness == marialVar.f28070saneness;
    }

    public boolean formularize(int i) {
        return decarock.grimness.monoploid(this.f28069attabal, i);
    }

    public int hashCode() {
        return this.f28070saneness + (decarock.grimness.graveside(this.f28069attabal) * 31);
    }

    public Pair<Integer, Integer> taiyuan(androidx.media3.common.polloi polloiVar, androidx.media3.common.saneness sanenessVar) {
        int iSaneness = androidx.media3.common.rotuma.saneness((String) decarock.attabal.marial(polloiVar.f11218triweekly), polloiVar.f11192cutely);
        if (!f28067marial.containsKey(Integer.valueOf(iSaneness))) {
            return null;
        }
        if (iSaneness == 18 && !formularize(18)) {
            iSaneness = 6;
        } else if ((iSaneness == 8 && !formularize(8)) || (iSaneness == 30 && !formularize(30))) {
            iSaneness = 7;
        }
        if (!formularize(iSaneness)) {
            return null;
        }
        C0639marial c0639marial = (C0639marial) decarock.attabal.marial(this.f28069attabal.get(iSaneness));
        int iSaneness2 = polloiVar.f11215stratoscope;
        if (iSaneness2 == -1 || iSaneness == 18) {
            int i = polloiVar.f11219trm;
            if (i == -1) {
                i = 48000;
            }
            iSaneness2 = c0639marial.saneness(i, sanenessVar);
        } else if (!polloiVar.f11218triweekly.equals("audio/vnd.dts.uhd;profile=p2") || decarock.grimness.f25080attabal >= 33) {
            if (!c0639marial.dern(iSaneness2)) {
                return null;
            }
        } else if (iSaneness2 > 10) {
            return null;
        }
        int iImpromptu = impromptu(iSaneness2);
        if (iImpromptu == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iSaneness), Integer.valueOf(iImpromptu));
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f28070saneness + ", audioProfiles=" + this.f28069attabal + X3.j.e;
    }

    public marial(List<C0639marial> list) {
        this.f28069attabal = new SparseArray<>();
        for (int i = 0; i < list.size(); i++) {
            C0639marial c0639marial = list.get(i);
            this.f28069attabal.put(c0639marial.f28072attabal, c0639marial);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.f28069attabal.size(); i2++) {
            iMax = Math.max(iMax, this.f28069attabal.valueAt(i2).f28074saneness);
        }
        this.f28070saneness = iMax;
    }

    /* JADX INFO: renamed from: hyalinization.marial$marial, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AudioCapabilities.java */
    public static final class C0639marial {

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final C0639marial f28071wireman;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f28072attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final ImmutableSet<Integer> f28073dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f28074saneness;

        static {
            f28071wireman = decarock.grimness.f25080attabal >= 33 ? new C0639marial(2, attabal(10)) : new C0639marial(2, 10);
        }

        public C0639marial(int i, Set<Integer> set) {
            this.f28072attabal = i;
            ImmutableSet<Integer> immutableSetCopyOf = ImmutableSet.copyOf((Collection) set);
            this.f28073dern = immutableSetCopyOf;
            immediately<Integer> it = immutableSetCopyOf.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(it.next().intValue()));
            }
            this.f28074saneness = iMax;
        }

        public static ImmutableSet<Integer> attabal(int i) {
            ImmutableSet.attabal attabalVar = new ImmutableSet.attabal();
            for (int i2 = 1; i2 <= i; i2++) {
                attabalVar.attabal(Integer.valueOf(decarock.grimness.seminary(i2)));
            }
            return attabalVar.triweekly();
        }

        public boolean dern(int i) {
            if (this.f28073dern == null) {
                return i <= this.f28074saneness;
            }
            int iSeminary = decarock.grimness.seminary(i);
            if (iSeminary == 0) {
                return false;
            }
            return this.f28073dern.contains(Integer.valueOf(iSeminary));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0639marial)) {
                return false;
            }
            C0639marial c0639marial = (C0639marial) obj;
            return this.f28072attabal == c0639marial.f28072attabal && this.f28074saneness == c0639marial.f28074saneness && decarock.grimness.dern(this.f28073dern, c0639marial.f28073dern);
        }

        public int hashCode() {
            int i = ((this.f28072attabal * 31) + this.f28074saneness) * 31;
            ImmutableSet<Integer> immutableSet = this.f28073dern;
            return i + (immutableSet == null ? 0 : immutableSet.hashCode());
        }

        public int saneness(int i, androidx.media3.common.saneness sanenessVar) {
            if (this.f28073dern != null) {
                return this.f28074saneness;
            }
            return decarock.grimness.f25080attabal >= 29 ? dern.saneness(this.f28072attabal, i, sanenessVar) : ((Integer) decarock.attabal.marial(marial.f28067marial.getOrDefault(Integer.valueOf(this.f28072attabal), 0))).intValue();
        }

        public String toString() {
            return "AudioProfile[format=" + this.f28072attabal + ", maxChannelCount=" + this.f28074saneness + ", channelMasks=" + this.f28073dern + X3.j.e;
        }

        public C0639marial(int i, int i2) {
            this.f28072attabal = i;
            this.f28074saneness = i2;
            this.f28073dern = null;
        }
    }
}
