package r1;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import com.ironsource.X3;
import java.util.List;
import oa.e2;
import oa.j0;
import oa.n1;
import oa.s0;
import oa.s1;
import oa.u0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f49250c = new b(j0.B(a.f49218d));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n1 f49251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s1 f49252e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f49253a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49254b;

    static {
        Object[] objArr = {2, 5, 6};
        oa.q.b(3, objArr);
        f49251d = j0.t(3, objArr);
        b2.p pVar = new b2.p(4);
        pVar.l(5, 6);
        pVar.l(17, 6);
        pVar.l(7, 6);
        pVar.l(30, 10);
        pVar.l(18, 6);
        pVar.l(6, 8);
        pVar.l(8, 8);
        pVar.l(14, 8);
        f49252e = pVar.c(true);
    }

    public b(n1 n1Var) {
        for (int i10 = 0; i10 < n1Var.f47283d; i10++) {
            a aVar = (a) n1Var.get(i10);
            this.f49253a.put(aVar.f49219a, aVar);
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.f49253a.size(); i11++) {
            iMax = Math.max(iMax, ((a) this.f49253a.valueAt(i11)).f49220b);
        }
        this.f49254b = iMax;
    }

    public static n1 a(int i10, int[] iArr) {
        oa.e0 e0VarU = j0.u();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i11 : iArr) {
            e0VarU.b(new a(i11, i10));
        }
        return e0VarU.g();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e0  */
    public static b b(Context context, Intent intent, i1.e eVar, AudioDeviceInfo audioDeviceInfo) {
        AudioManager audioManagerU = j1.f.u(context);
        if (audioDeviceInfo == null) {
            audioDeviceInfo = Build.VERSION.SDK_INT >= 33 ? b6.d.d(audioManagerU, eVar) : null;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 && (l1.y.K(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            return b6.d.c(audioManagerU, eVar);
        }
        AudioDeviceInfo[] devices = audioDeviceInfo == null ? audioManagerU.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo};
        s0 s0Var = new s0(4);
        s0Var.c(8, 7);
        if (i10 >= 31) {
            s0Var.c(26, 27);
        }
        if (i10 >= 33) {
            s0Var.b(30);
        }
        u0 u0VarH = s0Var.h();
        for (AudioDeviceInfo audioDeviceInfo2 : devices) {
            if (u0VarH.contains(Integer.valueOf(audioDeviceInfo2.getType()))) {
                return f49250c;
            }
        }
        s0 s0Var2 = new s0(4);
        s0Var2.b(2);
        if (l1.y.K(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            oa.e0 e0VarU = j0.u();
            e2 it = f49252e.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (Build.VERSION.SDK_INT >= l1.y.r(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), eVar.a())) {
                    e0VarU.b(num);
                }
            }
            e0VarU.b(2);
            n1 n1VarG = e0VarU.g();
            n1VarG.getClass();
            s0Var2.d(n1VarG);
            return new b(a(10, com.bumptech.glide.c.H(s0Var2.h())));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z10 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z10) {
            String str = Build.MANUFACTURER;
            if (str.equals("Amazon") || str.equals("Xiaomi")) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    n1 n1Var = f49251d;
                    n1Var.getClass();
                    s0Var2.d(n1Var);
                }
            }
        } else if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            n1 n1Var2 = f49251d;
            n1Var2.getClass();
            s0Var2.d(n1Var2);
        }
        if (intent == null || z10 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new b(a(10, com.bumptech.glide.c.H(s0Var2.h())));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List listA = com.bumptech.glide.c.a(intArrayExtra);
            listA.getClass();
            s0Var2.d(listA);
        }
        return new b(a(intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10), com.bumptech.glide.c.H(s0Var2.h())));
    }

    public static b c(Context context, i1.e eVar, AudioDeviceInfo audioDeviceInfo) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar, audioDeviceInfo);
    }

    public final Pair d(i1.e eVar, i1.p pVar) {
        String str = pVar.f42643n;
        str.getClass();
        int iC = i1.d0.c(str, pVar.f42641k);
        if (!f49252e.containsKey(Integer.valueOf(iC))) {
            return null;
        }
        SparseArray sparseArray = this.f49253a;
        if (iC == 18 && !l1.y.l(sparseArray, 18)) {
            iC = 6;
        } else if ((iC == 8 && !l1.y.l(sparseArray, 8)) || (iC == 30 && !l1.y.l(sparseArray, 30))) {
            iC = 7;
        }
        if (!l1.y.l(sparseArray, iC)) {
            return null;
        }
        a aVar = (a) sparseArray.get(iC);
        aVar.getClass();
        int i10 = aVar.f49220b;
        u0 u0Var = aVar.f49221c;
        int i11 = pVar.F;
        boolean zContains = false;
        if (i11 == -1 || iC == 18) {
            int i12 = pVar.G;
            if (i12 == -1) {
                i12 = 48000;
            }
            if (u0Var == null) {
                int i13 = aVar.f49219a;
                i10 = 10;
                while (true) {
                    if (i10 <= 0) {
                        i10 = 0;
                        break;
                    }
                    int iS = l1.y.s(i10);
                    if (iS != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i13).setSampleRate(i12).setChannelMask(iS).build(), eVar.a())) {
                        break;
                    }
                    i10--;
                }
            }
            i11 = i10;
        } else if (!pVar.f42643n.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (u0Var != null) {
                int iS2 = l1.y.s(i11);
                if (iS2 != 0) {
                    zContains = u0Var.contains(Integer.valueOf(iS2));
                }
            } else if (i11 <= i10) {
                zContains = true;
            }
            if (!zContains) {
                return null;
            }
        } else if (i11 > 10) {
            return null;
        }
        int iS3 = l1.y.s(i11);
        if (iS3 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iC), Integer.valueOf(iS3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l1.y.n(this.f49253a, bVar.f49253a) && this.f49254b == bVar.f49254b;
    }

    public final int hashCode() {
        return (l1.y.o(this.f49253a) * 31) + this.f49254b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f49254b + ", audioProfiles=" + this.f49253a + X3.j.f27836e;
    }
}
