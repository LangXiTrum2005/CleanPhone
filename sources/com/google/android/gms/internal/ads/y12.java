package com.google.android.gms.internal.ads;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ya1 f22081a = ca1.u(12);

    /* JADX WARN: Code duplicated, block: B:117:0x0171  */
    /* JADX WARN: Code duplicated, block: B:127:0x018e A[RETURN] */
    public static ca1 a(AudioDeviceInfo audioDeviceInfo) {
        int type;
        ca1 ca1VarB;
        ca1 ca1VarY;
        int speakerLayoutChannelMask;
        boolean zE = vc1.e(audioDeviceInfo.getType());
        ya1 ya1Var = f22081a;
        if (!zE) {
            if (audioDeviceInfo.getType() == 1) {
                return ca1.u(4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return ca1.u(Integer.valueOf(speakerLayoutChannelMask));
                }
                v71.y("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return ya1Var;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31 && audioDeviceInfo.getType() == 10) {
                ca1 ca1VarB2 = b(audioDeviceInfo);
                if (!ca1VarB2.isEmpty()) {
                    return ca1VarB2;
                }
                ca1 ca1VarA = zg.a(audioDeviceInfo.getAudioDescriptors());
                if (!ca1VarA.isEmpty()) {
                    return ca1VarA;
                }
            } else if (i10 >= 31) {
                int type2 = audioDeviceInfo.getType();
                if (i10 >= 31 && type2 == 29) {
                    ca1 ca1VarB3 = b(audioDeviceInfo);
                    if (!ca1VarB3.isEmpty()) {
                        return ca1VarB3;
                    }
                    List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                    if (i10 >= 34) {
                        if (i10 < 34 || audioDescriptors == null) {
                            ca1VarY = ya1.f22208e;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            Iterator<AudioDescriptor> it = audioDescriptors.iterator();
                            while (it.hasNext()) {
                                AudioDescriptor audioDescriptorD = com.applovin.impl.sdk.b0.d(it.next());
                                if (audioDescriptorD.getStandard() == 2) {
                                    byte[] descriptor = audioDescriptorD.getDescriptor();
                                    int length = descriptor.length;
                                    if (length != 3) {
                                        com.applovin.impl.ca.r(new StringBuilder(String.valueOf(length).length() + 21), "Invalid SADB length: ", length, "AudioDescriptorUtil");
                                    } else {
                                        int i11 = 0;
                                        if (Build.VERSION.SDK_INT >= 34) {
                                            byte b10 = descriptor[0];
                                            i11 = 1 == (b10 & 1) ? 12 : 0;
                                            if ((b10 & 2) != 0) {
                                                i11 |= 32;
                                            }
                                            if ((b10 & 4) != 0) {
                                                i11 |= 16;
                                            }
                                            if ((b10 & 8) != 0) {
                                                i11 |= PsExtractor.AUDIO_STREAM;
                                            }
                                            if ((b10 & 16) != 0) {
                                                i11 |= 1024;
                                            }
                                            if ((b10 & 32) != 0) {
                                                i11 |= 768;
                                            }
                                            if ((b10 & 128) != 0) {
                                                i11 |= 201326592;
                                            }
                                            byte b11 = descriptor[1];
                                            if ((b11 & 1) != 0) {
                                                i11 |= 81920;
                                            }
                                            if ((b11 & 2) != 0) {
                                                i11 |= Segment.SIZE;
                                            }
                                            if ((b11 & 4) != 0) {
                                                i11 |= 32768;
                                            }
                                            if ((b11 & 8) != 0) {
                                                i11 |= 6144;
                                            }
                                            if ((b11 & 16) != 0) {
                                                i11 |= 33554432;
                                            }
                                            if ((b11 & 32) != 0) {
                                                i11 |= 262144;
                                            }
                                            if ((b11 & 64) != 0) {
                                                i11 |= 6144;
                                            }
                                            if ((b11 & 128) != 0) {
                                                i11 |= 3145728;
                                            }
                                            byte b12 = descriptor[2];
                                            if ((b12 & 1) != 0) {
                                                i11 |= 655360;
                                            }
                                            if ((b12 & 2) != 0) {
                                                i11 = 8388608 | i11;
                                            }
                                            if ((b12 & 4) != 0) {
                                                i11 |= 20971520;
                                            }
                                        }
                                        arrayList.add(Integer.valueOf(i11));
                                    }
                                }
                            }
                            arrayList.sort(b.f12570p);
                            ca1VarY = ca1.y(arrayList);
                        }
                        if (!ca1VarY.isEmpty()) {
                            return ca1VarY;
                        }
                    }
                    ca1 ca1VarA2 = zg.a(audioDescriptors);
                    if (!ca1VarA2.isEmpty()) {
                        return ca1VarA2;
                    }
                } else if (i10 >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i10 >= 31 && type == 22))) {
                    ca1VarB = b(audioDeviceInfo);
                    if (!ca1VarB.isEmpty()) {
                        return ca1VarB;
                    }
                }
            } else if (i10 >= 31) {
                ca1VarB = b(audioDeviceInfo);
                if (!ca1VarB.isEmpty()) {
                    return ca1VarB;
                }
            }
        }
        return ya1Var;
    }

    public static ca1 b(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(o02.f18075c).reversed());
        Iterator<AudioProfile> it = audioProfiles.iterator();
        while (it.hasNext()) {
            AudioProfile audioProfileA = q1.d.a(it.next());
            if (audioProfileA.getEncapsulationType() != 1 && uu0.d(audioProfileA.getFormat())) {
                for (int i10 : audioProfileA.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i10));
                }
            }
        }
        return ca1.y(treeSet);
    }
}
