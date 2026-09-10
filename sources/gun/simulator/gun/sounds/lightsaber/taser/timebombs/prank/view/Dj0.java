package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: loaded from: classes2.dex */
public final class Dj0 implements Ej0 {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE, 130, Input.Keys.NUM_LOCK, Input.Keys.NUMPAD_ADD, 173, Input.Keys.F20, EnumC4719u30.INVALID_JSON_BID_PAYLOAD_VALUE, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, GL20.GL_INVALID_OPERATION, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, GL20.GL_DITHER, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4353pt f2984a;
    public final InterfaceC4326pd0 b;
    public final C3219d0 c;
    public final int d;
    public final byte[] e;
    public final JT f;
    public final int g;
    public final C4619sw h;
    public int i;
    public long j;
    public int k;
    public long l;

    public Dj0(InterfaceC4353pt interfaceC4353pt, InterfaceC4326pd0 interfaceC4326pd0, C3219d0 c3219d0) throws KT {
        this.f2984a = interfaceC4353pt;
        this.b = interfaceC4326pd0;
        this.c = c3219d0;
        int iMax = Math.max(1, c3219d0.d / 10);
        this.g = iMax;
        JT jt = new JT((byte[]) c3219d0.b);
        jt.m();
        int iM = jt.m();
        this.d = iM;
        int i = c3219d0.c;
        int i2 = (((c3219d0.f - (i * 4)) * 8) / (c3219d0.g * i)) + 1;
        if (iM != i2) {
            throw KT.a("Expected frames per block: " + i2 + "; got: " + iM, null);
        }
        int iG = Ug0.g(iMax, iM);
        this.e = new byte[c3219d0.f * iG];
        this.f = new JT(iM * 2 * i * iG);
        int i3 = c3219d0.d;
        int i4 = ((c3219d0.f * i3) * 8) / iM;
        C4531rw c4531rw = new C4531rw();
        c4531rw.k = MimeTypes.AUDIO_RAW;
        c4531rw.f = i4;
        c4531rw.g = i4;
        c4531rw.l = iMax * 2 * i;
        c4531rw.x = c3219d0.c;
        c4531rw.y = i3;
        c4531rw.z = 2;
        this.h = new C4619sw(c4531rw);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00be  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:37:0x014d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0151  */
    /* JADX WARN: Code duplicated, block: B:44:0x0046 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x011c A[EDGE_INSN: B:48:0x011c->B:35:0x011c BREAK  A[LOOP:1: B:17:0x004e->B:34:0x0110], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003d -> B:4:0x0021). Please report as a decompilation issue!!! */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ej0
    public final boolean a(InterfaceC4265ot interfaceC4265ot, long j) {
        byte[] bArr;
        int i;
        boolean z;
        int i2;
        int i3;
        JT jt;
        int i4;
        int i5;
        int i6;
        int i7;
        byte[] bArr2;
        int i8;
        int i9;
        int iJ;
        int[] iArr;
        int i10;
        int i11;
        int iJ2;
        int i12;
        byte b;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.k;
        C3219d0 c3219d0 = this.c;
        int i19 = i18 / (c3219d0.c * 2);
        int i20 = this.g;
        int i21 = this.d;
        int iG = Ug0.g(i20 - i19, i21) * c3219d0.f;
        boolean z2 = j == 0;
        while (true) {
            bArr = this.e;
            if (z2 && (i16 = this.i) < iG) {
                i17 = interfaceC4265ot.read(bArr, this.i, (int) Math.min(iG - i16, j));
                if (i17 == -1) {
                    break;
                }
                this.i += i17;
                bArr = this.e;
                if (z2) {
                }
            }
            i = this.i / c3219d0.f;
            if (i > 0) {
                i3 = 0;
                while (true) {
                    jt = this.f;
                    if (i3 < i) {
                        break;
                    }
                    i6 = 0;
                    while (true) {
                        i7 = c3219d0.c;
                        if (i6 < i7) {
                            bArr2 = jt.f3266a;
                            int i22 = c3219d0.f;
                            int i23 = (i6 * 4) + (i3 * i22);
                            i8 = (i7 * 4) + i23;
                            i9 = (i22 / i7) - 4;
                            iJ = (short) ((bArr[i23] & 255) | ((bArr[i23 + 1] & 255) << 8));
                            int i24 = bArr[i23 + 2] & 255;
                            boolean z3 = z2;
                            int iMin = Math.min(i24, 88);
                            iArr = n;
                            i10 = iArr[iMin];
                            i11 = ((i3 * i21 * i7) + i6) * 2;
                            bArr2[i11] = (byte) (iJ & 255);
                            bArr2[i11 + 1] = (byte) (iJ >> 8);
                            iJ2 = iMin;
                            int i25 = i20;
                            i12 = 0;
                            while (i12 < i9 * 2) {
                                b = bArr[((i12 / 8) * i7 * 4) + i8 + ((i12 / 2) % 4)];
                                byte[] bArr3 = bArr;
                                i13 = b & 255;
                                if (i12 % 2 == 0) {
                                    i14 = b & com.umeng.analytics.pro.cw.m;
                                } else {
                                    i14 = i13 >> 4;
                                }
                                i15 = ((((i14 & 7) * 2) + 1) * i10) >> 3;
                                if ((i14 & 8) != 0) {
                                    i15 = -i15;
                                }
                                iJ = Ug0.j(iJ + i15, -32768, 32767);
                                i11 = (i7 * 2) + i11;
                                bArr2[i11] = (byte) (iJ & 255);
                                bArr2[i11 + 1] = (byte) (iJ >> 8);
                                iJ2 = Ug0.j(iJ2 + m[i14], 0, 88);
                                i10 = iArr[iJ2];
                                i12++;
                                i9 = i9;
                                bArr = bArr3;
                            }
                            i6++;
                            z2 = z3;
                            i20 = i25;
                        }
                    }
                    i3++;
                }
                i4 = i20;
                z = z2;
                int i26 = i21 * i * 2 * c3219d0.c;
                jt.E(0);
                jt.D(i26);
                this.i -= i * c3219d0.f;
                int i27 = jt.c;
                this.b.d(i27, jt);
                i5 = this.k + i27;
                this.k = i5;
                if (i5 / (c3219d0.c * 2) >= i4) {
                    d(i4);
                }
            } else {
                z = z2;
            }
            if (z && (i2 = this.k / (c3219d0.c * 2)) > 0) {
                d(i2);
            }
            return z;
        }
        while (true) {
            bArr = this.e;
            if (z2) {
            }
            i = this.i / c3219d0.f;
            if (i > 0) {
                i3 = 0;
                while (true) {
                    jt = this.f;
                    if (i3 < i) {
                        break;
                        break;
                    }
                    i6 = 0;
                    while (true) {
                        i7 = c3219d0.c;
                        if (i6 < i7) {
                            bArr2 = jt.f3266a;
                            int i28 = c3219d0.f;
                            int i29 = (i6 * 4) + (i3 * i28);
                            i8 = (i7 * 4) + i29;
                            i9 = (i28 / i7) - 4;
                            iJ = (short) ((bArr[i29] & 255) | ((bArr[i29 + 1] & 255) << 8));
                            int i210 = bArr[i29 + 2] & 255;
                            boolean z4 = z2;
                            int iMin2 = Math.min(i210, 88);
                            iArr = n;
                            i10 = iArr[iMin2];
                            i11 = ((i3 * i21 * i7) + i6) * 2;
                            bArr2[i11] = (byte) (iJ & 255);
                            bArr2[i11 + 1] = (byte) (iJ >> 8);
                            iJ2 = iMin2;
                            int i211 = i20;
                            i12 = 0;
                            while (i12 < i9 * 2) {
                                b = bArr[((i12 / 8) * i7 * 4) + i8 + ((i12 / 2) % 4)];
                                byte[] bArr4 = bArr;
                                i13 = b & 255;
                                if (i12 % 2 == 0) {
                                    i14 = b & com.umeng.analytics.pro.cw.m;
                                } else {
                                    i14 = i13 >> 4;
                                }
                                i15 = ((((i14 & 7) * 2) + 1) * i10) >> 3;
                                if ((i14 & 8) != 0) {
                                    i15 = -i15;
                                }
                                iJ = Ug0.j(iJ + i15, -32768, 32767);
                                i11 = (i7 * 2) + i11;
                                bArr2[i11] = (byte) (iJ & 255);
                                bArr2[i11 + 1] = (byte) (iJ >> 8);
                                iJ2 = Ug0.j(iJ2 + m[i14], 0, 88);
                                i10 = iArr[iJ2];
                                i12++;
                                i9 = i9;
                                bArr = bArr4;
                            }
                            i6++;
                            z2 = z4;
                            i20 = i211;
                        }
                    }
                    i3++;
                }
                i4 = i20;
                z = z2;
                int i212 = i21 * i * 2 * c3219d0.c;
                jt.E(0);
                jt.D(i212);
                this.i -= i * c3219d0.f;
                int i213 = jt.c;
                this.b.d(i213, jt);
                i5 = this.k + i213;
                this.k = i5;
                if (i5 / (c3219d0.c * 2) >= i4) {
                    d(i4);
                }
            } else {
                z = z2;
            }
            if (z) {
                d(i2);
            }
            return z;
            this.i += i17;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ej0
    public final void b(int i, long j) {
        this.f2984a.a(new Hj0(this.c, this.d, i, j));
        this.b.e(this.h);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ej0
    public final void c(long j) {
        this.i = 0;
        this.j = j;
        this.k = 0;
        this.l = 0L;
    }

    public final void d(int i) {
        long j = this.j;
        long j2 = this.l;
        C3219d0 c3219d0 = this.c;
        long jR = j + Ug0.R(j2, 1000000L, c3219d0.d);
        int i2 = i * 2 * c3219d0.c;
        this.b.a(jR, 1, i2, this.k - i2, null);
        this.l += (long) i;
        this.k -= i2;
    }
}
