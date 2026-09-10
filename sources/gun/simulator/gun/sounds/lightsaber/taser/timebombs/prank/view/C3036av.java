package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.av, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3036av {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4147a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final C3491g4 k;
    public final Metadata l;

    public C3036av(byte[] bArr, int i) {
        Uh0 uh0 = new Uh0(bArr, 2, (Object) null);
        uh0.p(i * 8);
        this.f4147a = uh0.i(16);
        this.b = uh0.i(16);
        this.c = uh0.i(24);
        this.d = uh0.i(24);
        int i2 = uh0.i(20);
        this.e = i2;
        this.f = d(i2);
        this.g = uh0.i(3) + 1;
        int i3 = uh0.i(5) + 1;
        this.h = i3;
        this.i = a(i3);
        int i4 = uh0.i(4);
        int i5 = uh0.i(32);
        int i6 = Ug0.f3833a;
        this.j = ((((long) i4) & 4294967295L) << 32) | (((long) i5) & 4294967295L);
        this.k = null;
        this.l = null;
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        return j == 0 ? com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET : (j * 1000000) / ((long) this.e);
    }

    public final C4619sw c(byte[] bArr, Metadata metadata) {
        bArr[4] = -128;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        Metadata metadata2 = this.l;
        if (metadata2 != null) {
            metadata = metadata2.c(metadata);
        }
        C4531rw c4531rw = new C4531rw();
        c4531rw.k = MimeTypes.AUDIO_FLAC;
        c4531rw.l = i;
        c4531rw.x = this.g;
        c4531rw.y = this.e;
        c4531rw.m = Collections.singletonList(bArr);
        c4531rw.i = metadata;
        return new C4619sw(c4531rw);
    }

    public C3036av(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C3491g4 c3491g4, Metadata metadata) {
        this.f4147a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = c3491g4;
        this.l = metadata;
    }
}
