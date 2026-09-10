package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.content.Intent;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Ints;
import com.p004ironsource.d9;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class AudioCapabilities {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AudioCapabilities f17281c = new AudioCapabilities(new int[]{2}, 8);
    public static final AudioCapabilities d = new AudioCapabilities(new int[]{2, 5, 6}, 8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ImmutableMap f17282e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f17283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17284b;

    public static final class Api29 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final android.media.AudioAttributes f17285a = new android.media.AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        /* JADX WARN: Multi-variable type inference failed */
        public static int[] a() {
            ImmutableList.Builder builderS = ImmutableList.s();
            UnmodifiableIterator it = AudioCapabilities.f17282e.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(num.intValue()).setSampleRate(48000).build(), f17285a)) {
                    builderS.h(num);
                }
            }
            builderS.h(2);
            return Ints.f(builderS.j());
        }

        public static int b(int i2, int i3) {
            for (int i4 = 8; i4 > 0; i4--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i2).setSampleRate(i3).setChannelMask(Util.n(i4)).build(), f17285a)) {
                    return i4;
                }
            }
            return 0;
        }
    }

    static {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        builder.c(5, 6);
        builder.c(17, 6);
        builder.c(7, 6);
        builder.c(18, 6);
        builder.c(6, 8);
        builder.c(8, 8);
        builder.c(14, 8);
        f17282e = builder.a(true);
    }

    public AudioCapabilities(int[] iArr, int i2) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f17283a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f17283a = new int[0];
        }
        this.f17284b = i2;
    }

    public static AudioCapabilities a(Context context, Intent intent) {
        int i2 = Util.f18979a;
        if (i2 >= 17) {
            String str = Util.f18981c;
            if (("Amazon".equals(str) || "Xiaomi".equals(str)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                return d;
            }
        }
        if (i2 < 29 || (!Util.A(context) && (i2 < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            return (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f17281c : new AudioCapabilities(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        return new AudioCapabilities(Api29.a(), 8);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    public final Pair b(Format format) {
        int iIntValue;
        String str = format.m0;
        str.getClass();
        int iB = MimeTypes.b(str, format.j0);
        Integer numValueOf = Integer.valueOf(iB);
        ImmutableMap immutableMap = f17282e;
        if (immutableMap.containsKey(numValueOf)) {
            int[] iArr = this.f17283a;
            int i2 = 6;
            if (iB == 18 && Arrays.binarySearch(iArr, 18) < 0) {
                iB = 6;
            } else if (iB == 8 && Arrays.binarySearch(iArr, 8) < 0) {
                iB = 7;
            }
            if (Arrays.binarySearch(iArr, iB) < 0) {
                return null;
            }
            int i3 = format.z0;
            if (i3 == -1 || iB == 18) {
                int i4 = format.A0;
                if (i4 == -1) {
                    i4 = 48000;
                }
                if (Util.f18979a >= 29) {
                    iIntValue = Api29.b(iB, i4);
                } else {
                    Object obj = immutableMap.get(Integer.valueOf(iB));
                    iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
                i3 = iIntValue;
            } else if (i3 <= this.f17284b) {
            }
            int i5 = Util.f18979a;
            if (i5 > 28) {
                i2 = i3;
            } else if (i3 == 7) {
                i2 = 8;
            } else if (i3 != 3 && i3 != 4 && i3 != 5) {
                i2 = i3;
            }
            if (i5 <= 26 && "fugu".equals(Util.f18980b) && i2 == 1) {
                i2 = 2;
            }
            int iN = Util.n(i2);
            if (iN != 0) {
                return Pair.create(Integer.valueOf(iB), Integer.valueOf(iN));
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioCapabilities)) {
            return false;
        }
        AudioCapabilities audioCapabilities = (AudioCapabilities) obj;
        return Arrays.equals(this.f17283a, audioCapabilities.f17283a) && this.f17284b == audioCapabilities.f17284b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f17283a) * 31) + this.f17284b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f17284b + ", supportedEncodings=" + Arrays.toString(this.f17283a) + d9.i.f24752e;
    }
}
