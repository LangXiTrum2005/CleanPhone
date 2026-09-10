package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import com.ironsource.X3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l02 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ya1 f16619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l02 f16620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ya1 f16621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final db1 f16622h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f16623a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ca1 f16625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ca1 f16626d;

    static {
        ya1 ya1VarU = ca1.u(12);
        f16619e = ya1VarU;
        f16620f = new l02(ca1.u(k02.f16241d), ya1VarU, ya1.f22208e);
        Object[] objArr = {2, 5, 6};
        ps1.s(3, objArr);
        f16621g = ca1.A(3, objArr);
        pb pbVar = new pb(4);
        pbVar.e(5, 6);
        pbVar.e(17, 6);
        pbVar.e(7, 6);
        pbVar.e(30, 10);
        pbVar.e(18, 6);
        pbVar.e(6, 8);
        pbVar.e(8, 8);
        pbVar.e(14, 8);
        f16622h = pbVar.p(true);
    }

    public l02(ya1 ya1Var, ca1 ca1Var, List list) {
        for (int i10 = 0; i10 < ya1Var.f22210d; i10++) {
            k02 k02Var = (k02) ya1Var.get(i10);
            this.f16623a.put(k02Var.f16242a, k02Var);
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.f16623a.size(); i11++) {
            iMax = Math.max(iMax, ((k02) this.f16623a.valueAt(i11)).f16243b);
        }
        this.f16624b = iMax;
        this.f16625c = ca1.y(ca1Var);
        this.f16626d = ca1.y(list);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0185  */
    /* JADX WARN: Code duplicated, block: B:71:0x018d  */
    public static l02 a(Context context, Intent intent, z80 z80Var, AudioDeviceInfo audioDeviceInfo, List list) {
        AudioDeviceInfo audioDeviceInfo2;
        int i10;
        AudioManager audioManagerB = x10.b(context);
        int i11 = 0;
        if (audioDeviceInfo == null) {
            audioDeviceInfo2 = null;
            if (Build.VERSION.SDK_INT >= 33) {
                List<AudioDeviceInfo> audioDevicesForAttributes = audioManagerB.getAudioDevicesForAttributes(z80Var.a());
                if (!audioDevicesForAttributes.isEmpty()) {
                    audioDeviceInfo2 = audioDevicesForAttributes.get(0);
                }
            }
        } else {
            audioDeviceInfo2 = audioDeviceInfo;
        }
        ca1 ca1VarA = audioDeviceInfo2 != null ? y12.a(audioDeviceInfo2) : f16619e;
        int i12 = Build.VERSION.SDK_INT;
        db1 db1Var = f16622h;
        if (i12 >= 33 && (uu0.j(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            List<AudioProfile> directProfilesForAttributes = audioManagerB.getDirectProfilesForAttributes(z80Var.a());
            HashMap map = new HashMap();
            map.put(2, new HashSet(gc1.n(12)));
            for (int i13 = 0; i13 < directProfilesForAttributes.size(); i13++) {
                AudioProfile audioProfileA = q1.d.a(directProfilesForAttributes.get(i13));
                if (audioProfileA.getEncapsulationType() != 1) {
                    int format = audioProfileA.getFormat();
                    if (uu0.d(format) || db1Var.containsKey(Integer.valueOf(format))) {
                        Integer numValueOf = Integer.valueOf(format);
                        if (map.containsKey(numValueOf)) {
                            Set set = (Set) map.get(numValueOf);
                            set.getClass();
                            set.addAll(gc1.n(audioProfileA.getChannelMasks()));
                        } else {
                            map.put(numValueOf, new HashSet(gc1.n(audioProfileA.getChannelMasks())));
                        }
                    }
                }
            }
            aa1 aa1Var = ca1.f13122b;
            rb0.p(4, "initialCapacity");
            Object[] objArrCopyOf = new Object[4];
            for (Map.Entry entry : map.entrySet()) {
                k02 k02Var = new k02(((Integer) entry.getKey()).intValue(), (Set) entry.getValue());
                int length = objArrCopyOf.length;
                int i14 = i11 + 1;
                int iD = x91.d(length, i14);
                if (iD > length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                }
                objArrCopyOf[i11] = k02Var;
                i11 = i14;
            }
            return new l02(ca1.A(i11, objArrCopyOf), ca1VarA, list);
        }
        for (AudioDeviceInfo audioDeviceInfo3 : audioDeviceInfo2 == null ? audioManagerB.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo2}) {
            if (vc1.e(audioDeviceInfo3.getType())) {
                return new l02(ca1.u(k02.f16241d), ca1VarA, list);
            }
        }
        ha1 ha1Var = new ha1(4);
        ha1Var.f(2);
        if (!uu0.j(context) && !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            ContentResolver contentResolver = context.getContentResolver();
            boolean z10 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
            if (!z10) {
                String str = Build.MANUFACTURER;
                if (str.equals("Amazon") || str.equals("Xiaomi")) {
                    if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                        ha1Var.g(f16621g);
                    }
                }
            } else if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                ha1Var.g(f16621g);
            }
            if (intent == null || z10 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
                return new l02(c(10, gc1.m(ha1Var.h())), ca1VarA, list);
            }
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                ha1Var.g(gc1.n(intArrayExtra));
            }
            return new l02(c(intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10), gc1.m(ha1Var.h())), ca1VarA, list);
        }
        aa1 aa1Var2 = ca1.f13122b;
        z91 z91Var = new z91(4);
        bb1 bb1Var = db1Var.f13486b;
        if (bb1Var == null) {
            bb1Var = new bb1(db1Var, new cb1(0, db1Var.f13490f, db1Var.f13489e));
            db1Var.f13486b = bb1Var;
        }
        mb1 mb1VarH = bb1Var.h();
        while (mb1VarH.hasNext()) {
            Integer num = (Integer) mb1VarH.next();
            int iIntValue = num.intValue();
            switch (iIntValue) {
                case 2:
                case 3:
                    i10 = 3;
                    break;
                case 4:
                case 5:
                case 6:
                    i10 = 21;
                    break;
                case 7:
                case 8:
                    i10 = 23;
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                    i10 = 28;
                    break;
                case 13:
                case 19:
                case 23:
                case 24:
                case 25:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                case 27:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                default:
                    i10 = Integer.MAX_VALUE;
                    break;
                case 14:
                    i10 = 25;
                    break;
                case 20:
                    i10 = 30;
                    break;
                case 21:
                case 22:
                    i10 = 31;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                case 31:
                    i10 = 34;
                    break;
            }
            if (Build.VERSION.SDK_INT >= i10 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), z80Var.a())) {
                z91Var.a(num);
            }
        }
        z91Var.a(2);
        ha1Var.g(z91Var.f());
        return new l02(c(10, gc1.m(ha1Var.h())), ca1VarA, list);
    }

    public static ya1 c(int i10, int[] iArr) {
        aa1 aa1Var = ca1.f13122b;
        rb0.p(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i11 = 0;
        if (iArr == null) {
            iArr = new int[0];
        }
        int i12 = 0;
        while (i11 < iArr.length) {
            k02 k02Var = new k02(iArr[i11], i10);
            int length = objArrCopyOf.length;
            int i13 = i12 + 1;
            int iD = x91.d(length, i13);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i12] = k02Var;
            i11++;
            i12 = i13;
        }
        return ca1.A(i12, objArrCopyOf);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:17:0x003c A[PHI: r3
  0x003c: PHI (r3v3 int) = (r3v2 int), (r3v6 int) binds: [B:12:0x0030, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    public final Pair b(z80 z80Var, g22 g22Var) {
        String str = g22Var.f14678o;
        int iE = g22Var.H;
        int i10 = g22Var.G;
        str.getClass();
        int iF = na.f(str, g22Var.f14675k);
        if (!f16622h.containsKey(Integer.valueOf(iF))) {
            return null;
        }
        SparseArray sparseArray = this.f16623a;
        if (iF != 18) {
            if (iF != 8) {
                if (iF == 30 && sparseArray.indexOfKey(30) < 0) {
                    iF = 7;
                }
            } else if (sparseArray.indexOfKey(8) >= 0) {
                iF = 8;
                if (iF == 30) {
                    iF = 7;
                }
            } else {
                iF = 7;
            }
        } else if (sparseArray.indexOfKey(18) >= 0) {
            iF = 18;
            if (iF != 8) {
                if (iF == 30) {
                    iF = 7;
                }
            } else if (sparseArray.indexOfKey(8) >= 0) {
                iF = 8;
                if (iF == 30) {
                    iF = 7;
                }
            } else {
                iF = 7;
            }
        } else {
            iF = 6;
        }
        if (sparseArray.indexOfKey(iF) < 0) {
            return null;
        }
        k02 k02Var = (k02) sparseArray.get(iF);
        k02Var.getClass();
        int i11 = k02Var.f16243b;
        ia1 ia1Var = k02Var.f16244c;
        boolean zContains = false;
        if (i10 == -1 || iF == 18) {
            int i12 = g22Var.I;
            if (i12 == -1) {
                i12 = 48000;
            }
            if (ia1Var == null) {
                int i13 = k02Var.f16242a;
                i11 = 10;
                while (true) {
                    if (i11 <= 0) {
                        i11 = 0;
                        break;
                    }
                    int iE2 = uu0.e(i11);
                    if (iE2 != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i13).setSampleRate(i12).setChannelMask(iE2).build(), z80Var.a())) {
                        break;
                    }
                    i11--;
                }
            }
        } else {
            if (!str.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
                if (ia1Var != null) {
                    int iE3 = iE != -1 ? iE : uu0.e(i10);
                    if (iE3 != 0) {
                        zContains = ia1Var.contains(Integer.valueOf(iE3));
                    }
                } else if (i10 <= i11) {
                    zContains = true;
                }
                if (!zContains) {
                    return null;
                }
            } else if (i10 > 10) {
                return null;
            }
            i11 = i10;
        }
        if (iE == -1 || i10 != i11) {
            iE = uu0.e(i11);
        }
        if (iE != 0) {
            return Pair.create(Integer.valueOf(iF), Integer.valueOf(iE));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l02)) {
            return false;
        }
        l02 l02Var = (l02) obj;
        SparseArray<?> sparseArray = l02Var.f16623a;
        String str = uu0.f20901a;
        int i10 = Build.VERSION.SDK_INT;
        SparseArray sparseArray2 = this.f16623a;
        if (i10 < 31) {
            int size = sparseArray2.size();
            if (size == sparseArray.size()) {
                for (int i11 = 0; i11 < size; i11++) {
                    if (Objects.equals(sparseArray2.valueAt(i11), sparseArray.get(sparseArray2.keyAt(i11)))) {
                    }
                }
                if (this.f16624b != l02Var.f16624b) {
                }
            }
        } else if (sparseArray2.contentEquals(sparseArray)) {
            if (this.f16624b != l02Var.f16624b && Objects.equals(this.f16625c, l02Var.f16625c) && Objects.equals(this.f16626d, l02Var.f16626d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iContentHashCode;
        String str = uu0.f20901a;
        int i10 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.f16623a;
        if (i10 >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i11)) + ((sparseArray.keyAt(i11) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return Objects.hashCode(this.f16626d) + ((Objects.hashCode(this.f16625c) + (((this.f16624b * 31) + iContentHashCode) * 31)) * 31);
    }

    public final String toString() {
        String string = this.f16623a.toString();
        String strValueOf = String.valueOf(this.f16625c);
        String strValueOf2 = String.valueOf(this.f16626d);
        int i10 = this.f16624b;
        int length = String.valueOf(i10).length();
        int length2 = string.length();
        StringBuilder sb2 = new StringBuilder(length + 50 + length2 + 28 + strValueOf.length() + 26 + strValueOf2.length() + 1);
        sb2.append("AudioCapabilities[maxChannelCount=");
        sb2.append(i10);
        sb2.append(", audioProfiles=");
        sb2.append(string);
        d5.u.r(sb2, ", speakerLayoutChannelMasks=", strValueOf, ", spatializerChannelMasks=", strValueOf2);
        sb2.append(X3.j.f27836e);
        return sb2.toString();
    }
}
