package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2329Ca implements InterfaceC4669tZ, EN {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2927a;
    public Object b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2329Ca(int i) {
        this(Bitmap.CompressFormat.JPEG, 100);
        if (i == 1) {
            this.b = new JT(8);
            return;
        }
        if (i == 5) {
            this.b = new long[32];
        } else if (i != 6) {
        } else {
            this.b = EnumC4666tW.f5036a;
        }
    }

    public static C2329Ca d() {
        return new C2329Ca(6);
    }

    public final void a(long j) {
        int i = this.f2927a;
        Object obj = this.b;
        if (i == ((long[]) obj).length) {
            this.b = Arrays.copyOf((long[]) obj, i * 2);
        }
        long[] jArr = (long[]) this.b;
        int i2 = this.f2927a;
        this.f2927a = i2 + 1;
        jArr[i2] = j;
    }

    public final K6 b() {
        return new K6(this.f2927a, (EnumC4666tW) this.b);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EN
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public final long e(int i) {
        if (i >= 0 && i < this.f2927a) {
            return ((long[]) this.b)[i];
        }
        StringBuilder sbQ = AbstractC5044xl.q("Invalid index ", i, ", size is ");
        sbQ.append(this.f2927a);
        throw new IndexOutOfBoundsException(sbQ.toString());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EN
    public final boolean f(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public final boolean g() {
        return this.f2927a < ((List) this.b).size();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EN
    public final int getCodecCount() {
        if (((MediaCodecInfo[]) this.b) == null) {
            this.b = new MediaCodecList(this.f2927a).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.b).length;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EN
    public final MediaCodecInfo getCodecInfoAt(int i) {
        if (((MediaCodecInfo[]) this.b) == null) {
            this.b = new MediaCodecList(this.f2927a).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.b)[i];
    }

    public final long h(C2938Zm c2938Zm) {
        int i = 0;
        c2938Zm.peekFully(((JT) this.b).f3266a, 0, 1, false);
        int i2 = ((JT) this.b).f3266a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        c2938Zm.peekFully(((JT) this.b).f3266a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (((JT) this.b).f3266a[i] & 255) + (i5 << 8);
        }
        this.f2927a = i4 + 1 + this.f2927a;
        return i5;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4669tZ
    public final InterfaceC3616hZ o(InterfaceC3616hZ interfaceC3616hZ, YS ys) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) interfaceC3616hZ.get()).compress((Bitmap.CompressFormat) this.b, this.f2927a, byteArrayOutputStream);
        interfaceC3616hZ.recycle();
        return new C5121yf0(byteArrayOutputStream.toByteArray());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EN
    public final boolean secureDecodersExplicit() {
        return true;
    }

    public /* synthetic */ C2329Ca(Object obj, int i) {
        this.b = obj;
        this.f2927a = i;
    }

    public C2329Ca(int i, C4635t50 c4635t50) {
        this.f2927a = i;
        this.b = c4635t50;
    }

    public C2329Ca(int i, C3965lY c3965lY) {
        this.f2927a = i;
        this.b = AC.j(c3965lY);
    }
}
