package androidx.media3.exoplayer.audio;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.q;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ObjectArrays;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Ints;
import com.p004ironsource.d9;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class AudioCapabilities {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AudioCapabilities f6055c = new AudioCapabilities(ImmutableList.z(AudioProfile.d));
    public static final ImmutableList d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ImmutableMap f6056e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f6057a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6058b;

    public static final class Api23 {
        private static ImmutableSet<Integer> a() {
            ImmutableSet.Builder builder = new ImmutableSet.Builder();
            builder.i(8, 7);
            int i2 = Util.f5683a;
            if (i2 >= 31) {
                builder.i(26, 27);
            }
            if (i2 >= 33) {
                builder.c(30);
            }
            return builder.k();
        }

        public static boolean b(AudioManager audioManager, AudioDeviceInfoApi23 audioDeviceInfoApi23) {
            AudioDeviceInfo[] devices;
            if (audioDeviceInfoApi23 == null) {
                audioManager.getClass();
                devices = audioManager.getDevices(2);
            } else {
                devices = new AudioDeviceInfo[]{audioDeviceInfoApi23.f6073a};
            }
            ImmutableSet<Integer> immutableSetA = a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (immutableSetA.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class Api29 {
        /* JADX WARN: Multi-variable type inference failed */
        public static ImmutableList<Integer> a(AudioAttributes audioAttributes) {
            ImmutableList.Builder builderS = ImmutableList.s();
            UnmodifiableIterator it = AudioCapabilities.f6056e.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (Util.f5683a >= Util.o(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), audioAttributes.a().f5376a)) {
                    builderS.h(num);
                }
            }
            builderS.h(2);
            return builderS.j();
        }

        public static int b(int i2, int i3, AudioAttributes audioAttributes) {
            for (int i4 = 10; i4 > 0; i4--) {
                int iQ = Util.q(i4);
                if (iQ != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i2).setSampleRate(i3).setChannelMask(iQ).build(), audioAttributes.a().f5376a)) {
                    return i4;
                }
            }
            return 0;
        }
    }

    public static final class Api33 {
        /* JADX WARN: Code duplicated, block: B:13:0x0056  */
        /* JADX WARN: Code duplicated, block: B:15:0x0060  */
        /* JADX WARN: Code duplicated, block: B:16:0x0079  */
        public static AudioCapabilities a(AudioManager audioManager, AudioAttributes audioAttributes) {
            List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(audioAttributes.a().f5376a);
            HashMap map = new HashMap();
            map.put(2, new HashSet(Ints.a(12)));
            for (int i2 = 0; i2 < directProfilesForAttributes.size(); i2++) {
                android.media.AudioProfile audioProfileC = q.c(directProfilesForAttributes.get(i2));
                if (audioProfileC.getEncapsulationType() != 1) {
                    int format = audioProfileC.getFormat();
                    if (!Util.F(format)) {
                        if (AudioCapabilities.f6056e.containsKey(Integer.valueOf(format))) {
                            if (map.containsKey(Integer.valueOf(format))) {
                                Set set = (Set) map.get(Integer.valueOf(format));
                                set.getClass();
                                set.addAll(Ints.a(audioProfileC.getChannelMasks()));
                            } else {
                                map.put(Integer.valueOf(format), new HashSet(Ints.a(audioProfileC.getChannelMasks())));
                            }
                        }
                    } else if (map.containsKey(Integer.valueOf(format))) {
                        Set set2 = (Set) map.get(Integer.valueOf(format));
                        set2.getClass();
                        set2.addAll(Ints.a(audioProfileC.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(Ints.a(audioProfileC.getChannelMasks())));
                    }
                }
            }
            ImmutableList.Builder builderS = ImmutableList.s();
            for (Map.Entry entry : map.entrySet()) {
                builderS.h(new AudioProfile(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new AudioCapabilities(builderS.j());
        }

        public static AudioDeviceInfoApi23 b(AudioManager audioManager, AudioAttributes audioAttributes) {
            try {
                audioManager.getClass();
                List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(audioAttributes.a().f5376a);
                if (audioDevicesForAttributes.isEmpty()) {
                    return null;
                }
                return new AudioDeviceInfoApi23((AudioDeviceInfo) audioDevicesForAttributes.get(0));
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    static {
        Object[] objArr = {2, 5, 6};
        ObjectArrays.a(3, objArr);
        d = ImmutableList.p(3, objArr);
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        builder.c(5, 6);
        builder.c(17, 6);
        builder.c(7, 6);
        builder.c(30, 10);
        builder.c(18, 6);
        builder.c(6, 8);
        builder.c(8, 8);
        builder.c(14, 8);
        f6056e = builder.a(true);
    }

    public AudioCapabilities(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            AudioProfile audioProfile = (AudioProfile) list.get(i2);
            this.f6057a.put(audioProfile.f6059a, audioProfile);
        }
        int iMax = 0;
        for (int i3 = 0; i3 < this.f6057a.size(); i3++) {
            iMax = Math.max(iMax, ((AudioProfile) this.f6057a.valueAt(i3)).f6060b);
        }
        this.f6058b = iMax;
    }

    public static ImmutableList a(int i2, int[] iArr) {
        ImmutableList.Builder builderS = ImmutableList.s();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i3 : iArr) {
            builderS.h(new AudioProfile(i3, i2));
        }
        return builderS.j();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00af  */
    public static AudioCapabilities b(Context context, Intent intent, AudioAttributes audioAttributes, AudioDeviceInfoApi23 audioDeviceInfoApi23) {
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        if (audioDeviceInfoApi23 == null) {
            audioDeviceInfoApi23 = Util.f5683a >= 33 ? Api33.b(audioManager, audioAttributes) : null;
        }
        int i2 = Util.f5683a;
        if (i2 >= 33 && (Util.H(context) || (i2 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            return Api33.a(audioManager, audioAttributes);
        }
        if (i2 >= 23 && Api23.b(audioManager, audioDeviceInfoApi23)) {
            return f6055c;
        }
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        builder.c(2);
        if (i2 >= 29 && (Util.H(context) || (i2 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            builder.j(Api29.a(audioAttributes));
            return new AudioCapabilities(a(10, Ints.f(builder.k())));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z2 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z2) {
            String str = Util.f5685c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    builder.j(d);
                }
            }
        } else if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            builder.j(d);
        }
        if (intent == null || z2 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new AudioCapabilities(a(10, Ints.f(builder.k())));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            builder.j(Ints.a(intArrayExtra));
        }
        return new AudioCapabilities(a(intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10), Ints.f(builder.k())));
    }

    public static AudioCapabilities c(Context context, AudioAttributes audioAttributes, AudioDeviceInfoApi23 audioDeviceInfoApi23) {
        return b(context, androidx.datastore.preferences.protobuf.a.d("android.media.action.HDMI_AUDIO_PLUG", context, null), audioAttributes, audioDeviceInfoApi23);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00d1  */
    public final Pair d(AudioAttributes audioAttributes, Format format) {
        String str = format.m;
        str.getClass();
        int iB = MimeTypes.b(str, format.j);
        Integer numValueOf = Integer.valueOf(iB);
        ImmutableMap immutableMap = f6056e;
        if (!immutableMap.containsKey(numValueOf)) {
            return null;
        }
        int i2 = 6;
        if (iB == 18 && !e(18)) {
            iB = 6;
        } else if ((iB == 8 && !e(8)) || (iB == 30 && !e(30))) {
            iB = 7;
        }
        if (!e(iB)) {
            return null;
        }
        AudioProfile audioProfile = (AudioProfile) this.f6057a.get(iB);
        audioProfile.getClass();
        boolean zContains = false;
        int iIntValue = audioProfile.f6060b;
        ImmutableSet immutableSet = audioProfile.f6061c;
        int i3 = format.f5400A;
        if (i3 == -1 || iB == 18) {
            int i4 = format.f5401B;
            if (i4 == -1) {
                i4 = 48000;
            }
            if (immutableSet == null) {
                int i5 = Util.f5683a;
                int i6 = audioProfile.f6059a;
                if (i5 >= 29) {
                    iIntValue = Api29.b(i6, i4, audioAttributes);
                } else {
                    Object obj = immutableMap.get(Integer.valueOf(i6));
                    iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
            i3 = iIntValue;
        } else if (!format.m.equals("audio/vnd.dts.uhd;profile=p2") || Util.f5683a >= 33) {
            if (immutableSet != null) {
                int iQ = Util.q(i3);
                if (iQ != 0) {
                    zContains = immutableSet.contains(Integer.valueOf(iQ));
                }
            } else if (i3 <= iIntValue) {
                zContains = true;
            }
            if (!zContains) {
                return null;
            }
        } else if (i3 > 10) {
            return null;
        }
        int i7 = Util.f5683a;
        if (i7 > 28) {
            i2 = i3;
        } else if (i3 == 7) {
            i2 = 8;
        } else if (i3 != 3 && i3 != 4 && i3 != 5) {
            i2 = i3;
        }
        if (i7 <= 26 && "fugu".equals(Util.f5684b) && i2 == 1) {
            i2 = 2;
        }
        int iQ2 = Util.q(i2);
        if (iQ2 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iB), Integer.valueOf(iQ2));
    }

    public final boolean e(int i2) {
        SparseArray sparseArray = this.f6057a;
        int i3 = Util.f5683a;
        return sparseArray.indexOfKey(i2) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0018  */
    public final boolean equals(Object obj) {
        boolean zContentEquals;
        if (this != obj) {
            if (obj instanceof AudioCapabilities) {
                AudioCapabilities audioCapabilities = (AudioCapabilities) obj;
                SparseArray sparseArray = this.f6057a;
                SparseArray sparseArray2 = audioCapabilities.f6057a;
                int i2 = Util.f5683a;
                if (sparseArray == null) {
                    if (sparseArray2 == null) {
                        zContentEquals = true;
                    } else {
                        zContentEquals = false;
                    }
                } else if (sparseArray2 == null) {
                    zContentEquals = false;
                } else if (Util.f5683a >= 31) {
                    zContentEquals = sparseArray.contentEquals(sparseArray2);
                } else {
                    int size = sparseArray.size();
                    if (size == sparseArray2.size()) {
                        int i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                if (Objects.equals(sparseArray.valueAt(i3), sparseArray2.get(sparseArray.keyAt(i3)))) {
                                    i3++;
                                }
                            } else {
                                zContentEquals = true;
                            }
                        }
                    }
                    zContentEquals = false;
                }
                if (!zContentEquals || this.f6058b != audioCapabilities.f6058b) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iContentHashCode;
        SparseArray sparseArray = this.f6057a;
        if (Util.f5683a >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i2)) + ((sparseArray.keyAt(i2) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.f6058b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f6058b + ", audioProfiles=" + this.f6057a + d9.i.f24752e;
    }

    public static final class AudioProfile {
        public static final AudioProfile d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImmutableSet f6061c;

        static {
            AudioProfile audioProfile;
            if (Util.f5683a >= 33) {
                ImmutableSet.Builder builder = new ImmutableSet.Builder();
                for (int i2 = 1; i2 <= 10; i2++) {
                    builder.c(Integer.valueOf(Util.q(i2)));
                }
                audioProfile = new AudioProfile(2, builder.k());
            } else {
                audioProfile = new AudioProfile(2, 10);
            }
            d = audioProfile;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AudioProfile(int i2, Set set) {
            this.f6059a = i2;
            ImmutableSet immutableSetU = ImmutableSet.u(set);
            this.f6061c = immutableSetU;
            UnmodifiableIterator it = immutableSetU.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
            }
            this.f6060b = iMax;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioProfile)) {
                return false;
            }
            AudioProfile audioProfile = (AudioProfile) obj;
            return this.f6059a == audioProfile.f6059a && this.f6060b == audioProfile.f6060b && Util.a(this.f6061c, audioProfile.f6061c);
        }

        public final int hashCode() {
            int i2 = ((this.f6059a * 31) + this.f6060b) * 31;
            ImmutableSet immutableSet = this.f6061c;
            return i2 + (immutableSet == null ? 0 : immutableSet.hashCode());
        }

        public final String toString() {
            return "AudioProfile[format=" + this.f6059a + ", maxChannelCount=" + this.f6060b + ", channelMasks=" + this.f6061c + d9.i.f24752e;
        }

        public AudioProfile(int i2, int i3) {
            this.f6059a = i2;
            this.f6060b = i3;
            this.f6061c = null;
        }
    }
}
