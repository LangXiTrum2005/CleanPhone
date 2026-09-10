package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.badlogic.gdx.Input;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3623hd extends AbstractC4149nd {
    public final int h;
    public final int i;
    public final int j;
    public List n;
    public List o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public byte t;
    public byte u;
    public boolean w;
    public long x;
    public static final int[] y = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, SupportMenu.CATEGORY_MASK, InputDeviceCompat.SOURCE_ANY, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, Input.Keys.COLON, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE, EnumC4719u30.JSON_ENCODE_ERROR_VALUE, 120, 121, 122, 231, 247, EnumC4719u30.INVALID_JSON_BID_PAYLOAD_VALUE, 241, 9632};
    public static final int[] C = {174, 176, 189, Input.Keys.F21, 8482, Input.Keys.NUMPAD_LEFT_PAREN, Input.Keys.NUMPAD_RIGHT_PAREN, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] D = {Input.Keys.F23, 201, 211, EnumC4719u30.MRAID_JS_DOES_NOT_EXIST_VALUE, EnumC4719u30.AD_RESPONSE_RETRY_AFTER_VALUE, 252, 8216, Input.Keys.NUMPAD_EQUALS, 42, 39, com.umeng.analytics.pro.q.a.D, 169, 8480, 8226, 8220, 8221, 192, Input.Keys.F24, 199, 200, 202, 203, 235, 206, 207, 239, EnumC4719u30.PLACEMENT_SLEEP_VALUE, EnumC4719u30.AD_RESPONSE_TIMED_OUT_VALUE, 249, EnumC4719u30.MRAID_JS_COPY_FAILED_VALUE, 171, Input.Keys.F17};
    public static final int[] E = {195, 227, 205, 204, 236, EnumC4719u30.AD_NOT_LOADED_VALUE, 242, EnumC4719u30.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 245, 123, EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE, 92, 94, 95, 124, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 196, 228, EnumC4719u30.INVALID_GZIP_BID_PAYLOAD_VALUE, 246, EnumC4719u30.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, EnumC4719u30.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final JT g = new JT();
    public final ArrayList l = new ArrayList();
    public C3535gd m = new C3535gd(0, 4);
    public int v = 0;
    public final long k = 16000000;

    public C3623hd(String str, int i) {
        this.h = MimeTypes.APPLICATION_MP4CEA608.equals(str) ? 2 : 3;
        if (i == 1) {
            this.j = 0;
            this.i = 0;
        } else if (i == 2) {
            this.j = 1;
            this.i = 0;
        } else if (i == 3) {
            this.j = 0;
            this.i = 1;
        } else if (i != 4) {
            AbstractC4038mJ.f();
            this.j = 0;
            this.i = 0;
        } else {
            this.j = 1;
            this.i = 1;
        }
        h(0);
        g();
        this.w = true;
        this.x = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4149nd
    public final C4237od b() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new C4237od(list, 0);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x019a  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01da  */
    /* JADX WARN: Code duplicated, block: B:143:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:148:0x0207 A[LOOP:1: B:146:0x0201->B:148:0x0207, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x020b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0215 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0217  */
    /* JADX WARN: Code duplicated, block: B:153:0x021c  */
    /* JADX WARN: Code duplicated, block: B:154:0x0223  */
    /* JADX WARN: Code duplicated, block: B:155:0x022e  */
    /* JADX WARN: Code duplicated, block: B:156:0x0239  */
    /* JADX WARN: Code duplicated, block: B:157:0x0244  */
    /* JADX WARN: Code duplicated, block: B:158:0x0249  */
    /* JADX WARN: Code duplicated, block: B:159:0x024e  */
    /* JADX WARN: Code duplicated, block: B:161:0x025f  */
    /* JADX WARN: Code duplicated, block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:93:0x012e  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4149nd
    public final void c(C3973ld c3973ld) {
        boolean z2;
        int i;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList;
        int iMin;
        ByteBuffer byteBuffer = c3973ld.d;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        JT jt = this.g;
        jt.C(bArrArray, iLimit);
        boolean z3 = false;
        while (true) {
            int iA = jt.a();
            int i6 = this.h;
            if (iA < i6) {
                if (z3) {
                    int i7 = this.p;
                    if (i7 == 1 || i7 == 3) {
                        this.n = f();
                        this.x = this.e;
                        return;
                    }
                    return;
                }
                return;
            }
            int iT = i6 == 2 ? -4 : jt.t();
            int iT2 = jt.t();
            int iT3 = jt.t();
            if ((iT & 2) == 0 && (iT & 1) == this.i) {
                byte b = (byte) (iT2 & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                byte b2 = (byte) (iT3 & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                if (b != 0 || b2 != 0) {
                    boolean z4 = this.r;
                    if ((iT & 4) == 4) {
                        boolean[] zArr = F;
                        if (zArr[iT2] && zArr[iT3]) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    this.r = z2;
                    if (!z2 || (b & 240) != 16) {
                        this.s = false;
                        if (!z2) {
                            if (1 > b && b <= 15) {
                                this.w = false;
                            } else if ((b & 246) == 20) {
                                if (b2 == 32 && b2 != 47) {
                                    switch (b2) {
                                        default:
                                            switch (b2) {
                                                case 42:
                                                case 43:
                                                    this.w = false;
                                                    break;
                                            }
                                        case 37:
                                        case 38:
                                        case 39:
                                            this.w = true;
                                            break;
                                    }
                                } else {
                                    this.w = true;
                                }
                            }
                            if (this.w) {
                                i = b & 224;
                                if (i == 0) {
                                    this.v = (b >> 3) & 1;
                                }
                                if (this.v != this.j) {
                                    if (i == 0) {
                                        i2 = b & 247;
                                        if (i2 == 17 || (b2 & 240) != 48) {
                                            i3 = b & 246;
                                            if (i3 != 18 && (b2 & 224) == 32) {
                                                this.m.b();
                                                this.m.a((char) ((b & 1) == 0 ? D[b2 & 31] : E[b2 & 31]));
                                            } else if (i2 != 17 && (b2 & 240) == 32) {
                                                this.m.a(' ');
                                                boolean z5 = (b2 & 1) == 1;
                                                C3535gd c3535gd = this.m;
                                                c3535gd.f4422a.add(new C3447fd((b2 >> 1) & 7, z5, c3535gd.c.length()));
                                            } else if ((b & 240) != 16 && (b2 & 192) == 64) {
                                                int i8 = y[b & 7];
                                                if ((b2 & 32) != 0) {
                                                    i8++;
                                                }
                                                C3535gd c3535gd2 = this.m;
                                                if (i8 != c3535gd2.d) {
                                                    if (this.p != 1 && !c3535gd2.e()) {
                                                        C3535gd c3535gd3 = new C3535gd(this.p, this.q);
                                                        this.m = c3535gd3;
                                                        this.l.add(c3535gd3);
                                                    }
                                                    this.m.d = i8;
                                                }
                                                boolean z6 = (b2 & com.umeng.analytics.pro.cw.n) == 16;
                                                boolean z7 = (b2 & 1) == 1;
                                                int i9 = (b2 >> 1) & 7;
                                                C3535gd c3535gd4 = this.m;
                                                c3535gd4.f4422a.add(new C3447fd(z6 ? 8 : i9, z7, c3535gd4.c.length()));
                                                if (z6) {
                                                    this.m.e = z[i9];
                                                }
                                            } else if (i2 != 23 && b2 >= 33 && b2 <= 35) {
                                                this.m.f = b2 - 32;
                                            } else if (i3 == 20 && (b2 & 240) == 32) {
                                                if (b2 == 32) {
                                                    h(2);
                                                } else if (b2 != 41) {
                                                    switch (b2) {
                                                        case 37:
                                                            h(1);
                                                            this.q = 2;
                                                            this.m.h = 2;
                                                            break;
                                                        case 38:
                                                            h(1);
                                                            this.q = 3;
                                                            this.m.h = 3;
                                                            break;
                                                        case 39:
                                                            h(1);
                                                            this.q = 4;
                                                            this.m.h = 4;
                                                            break;
                                                        default:
                                                            i4 = this.p;
                                                            if (i4 != 0) {
                                                                if (b2 != 33) {
                                                                    switch (b2) {
                                                                        case 44:
                                                                            this.n = Collections.emptyList();
                                                                            i5 = this.p;
                                                                            if (i5 != 1 || i5 == 3) {
                                                                                g();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i4 == 1 && !this.m.e()) {
                                                                                C3535gd c3535gd5 = this.m;
                                                                                arrayList = c3535gd5.b;
                                                                                arrayList.add(c3535gd5.d());
                                                                                c3535gd5.c.setLength(0);
                                                                                c3535gd5.f4422a.clear();
                                                                                iMin = Math.min(c3535gd5.h, c3535gd5.d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            g();
                                                                            break;
                                                                        case 47:
                                                                            this.n = f();
                                                                            g();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.m.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    h(3);
                                                }
                                            }
                                        } else {
                                            this.m.a((char) C[b2 & com.umeng.analytics.pro.cw.m]);
                                        }
                                    } else {
                                        C3535gd c3535gd6 = this.m;
                                        iArr = B;
                                        c3535gd6.a((char) iArr[(b & 127) - 32]);
                                        if ((b2 & 224) != 0) {
                                            this.m.a((char) iArr[(b2 & 127) - 32]);
                                        }
                                    }
                                    z3 = true;
                                }
                            }
                        } else if (z4) {
                            g();
                            z3 = true;
                        }
                    } else if (this.s && this.t == b && this.u == b2) {
                        this.s = false;
                    } else {
                        this.s = true;
                        this.t = b;
                        this.u = b2;
                        if (!z2) {
                            if (1 > b) {
                                if ((b & 246) == 20) {
                                    if (b2 == 32) {
                                        this.w = true;
                                    } else {
                                        this.w = true;
                                    }
                                }
                            } else if ((b & 246) == 20) {
                                if (b2 == 32) {
                                    this.w = true;
                                } else {
                                    this.w = true;
                                }
                            }
                            if (this.w) {
                                i = b & 224;
                                if (i == 0) {
                                    this.v = (b >> 3) & 1;
                                }
                                if (this.v != this.j) {
                                    if (i == 0) {
                                        i2 = b & 247;
                                        if (i2 == 17) {
                                            i3 = b & 246;
                                            if (i3 != 18) {
                                                if (i2 != 17) {
                                                    if ((b & 240) != 16) {
                                                        if (i2 != 23) {
                                                            if (i3 == 20) {
                                                                if (b2 == 32) {
                                                                    h(2);
                                                                } else if (b2 != 41) {
                                                                    switch (b2) {
                                                                        case 37:
                                                                            h(1);
                                                                            this.q = 2;
                                                                            this.m.h = 2;
                                                                            break;
                                                                        case 38:
                                                                            h(1);
                                                                            this.q = 3;
                                                                            this.m.h = 3;
                                                                            break;
                                                                        case 39:
                                                                            h(1);
                                                                            this.q = 4;
                                                                            this.m.h = 4;
                                                                            break;
                                                                        default:
                                                                            i4 = this.p;
                                                                            if (i4 != 0) {
                                                                                if (b2 != 33) {
                                                                                    switch (b2) {
                                                                                        case 44:
                                                                                            this.n = Collections.emptyList();
                                                                                            i5 = this.p;
                                                                                            if (i5 != 1) {
                                                                                                g();
                                                                                            } else {
                                                                                                g();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i4 == 1) {
                                                                                                C3535gd c3535gd7 = this.m;
                                                                                                arrayList = c3535gd7.b;
                                                                                                arrayList.add(c3535gd7.d());
                                                                                                c3535gd7.c.setLength(0);
                                                                                                c3535gd7.f4422a.clear();
                                                                                                iMin = Math.min(c3535gd7.h, c3535gd7.d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            g();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.n = f();
                                                                                            g();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.m.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    h(3);
                                                                }
                                                            }
                                                        } else if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                h(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        h(1);
                                                                        this.q = 2;
                                                                        this.m.h = 2;
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        this.q = 3;
                                                                        this.m.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        this.q = 4;
                                                                        this.m.h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.p;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.n = Collections.emptyList();
                                                                                        i5 = this.p;
                                                                                        if (i5 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            C3535gd c3535gd8 = this.m;
                                                                                            arrayList = c3535gd8.b;
                                                                                            arrayList.add(c3535gd8.d());
                                                                                            c3535gd8.c.setLength(0);
                                                                                            c3535gd8.f4422a.clear();
                                                                                            iMin = Math.min(c3535gd8.h, c3535gd8.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.n = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                h(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        h(1);
                                                                        this.q = 2;
                                                                        this.m.h = 2;
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        this.q = 3;
                                                                        this.m.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        this.q = 4;
                                                                        this.m.h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.p;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.n = Collections.emptyList();
                                                                                        i5 = this.p;
                                                                                        if (i5 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            C3535gd c3535gd9 = this.m;
                                                                                            arrayList = c3535gd9.b;
                                                                                            arrayList.add(c3535gd9.d());
                                                                                            c3535gd9.c.setLength(0);
                                                                                            c3535gd9.f4422a.clear();
                                                                                            iMin = Math.min(c3535gd9.h, c3535gd9.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.n = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            h(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    h(1);
                                                                    this.q = 2;
                                                                    this.m.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.q = 3;
                                                                    this.m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.q = 4;
                                                                    this.m.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.p;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.n = Collections.emptyList();
                                                                                    i5 = this.p;
                                                                                    if (i5 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        C3535gd c3535gd10 = this.m;
                                                                                        arrayList = c3535gd10.b;
                                                                                        arrayList.add(c3535gd10.d());
                                                                                        c3535gd10.c.setLength(0);
                                                                                        c3535gd10.f4422a.clear();
                                                                                        iMin = Math.min(c3535gd10.h, c3535gd10.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.n = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                h(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        h(1);
                                                                        this.q = 2;
                                                                        this.m.h = 2;
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        this.q = 3;
                                                                        this.m.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        this.q = 4;
                                                                        this.m.h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.p;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.n = Collections.emptyList();
                                                                                        i5 = this.p;
                                                                                        if (i5 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            C3535gd c3535gd11 = this.m;
                                                                                            arrayList = c3535gd11.b;
                                                                                            arrayList.add(c3535gd11.d());
                                                                                            c3535gd11.c.setLength(0);
                                                                                            c3535gd11.f4422a.clear();
                                                                                            iMin = Math.min(c3535gd11.h, c3535gd11.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.n = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            h(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    h(1);
                                                                    this.q = 2;
                                                                    this.m.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.q = 3;
                                                                    this.m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.q = 4;
                                                                    this.m.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.p;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.n = Collections.emptyList();
                                                                                    i5 = this.p;
                                                                                    if (i5 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        C3535gd c3535gd12 = this.m;
                                                                                        arrayList = c3535gd12.b;
                                                                                        arrayList.add(c3535gd12.d());
                                                                                        c3535gd12.c.setLength(0);
                                                                                        c3535gd12.f4422a.clear();
                                                                                        iMin = Math.min(c3535gd12.h, c3535gd12.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.n = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            h(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    h(1);
                                                                    this.q = 2;
                                                                    this.m.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.q = 3;
                                                                    this.m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.q = 4;
                                                                    this.m.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.p;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.n = Collections.emptyList();
                                                                                    i5 = this.p;
                                                                                    if (i5 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        C3535gd c3535gd13 = this.m;
                                                                                        arrayList = c3535gd13.b;
                                                                                        arrayList.add(c3535gd13.d());
                                                                                        c3535gd13.c.setLength(0);
                                                                                        c3535gd13.f4422a.clear();
                                                                                        iMin = Math.min(c3535gd13.h, c3535gd13.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.n = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        h(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                h(1);
                                                                this.q = 2;
                                                                this.m.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.q = 3;
                                                                this.m.h = 3;
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                this.q = 4;
                                                                this.m.h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.p;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.n = Collections.emptyList();
                                                                                i5 = this.p;
                                                                                if (i5 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    C3535gd c3535gd14 = this.m;
                                                                                    arrayList = c3535gd14.b;
                                                                                    arrayList.add(c3535gd14.d());
                                                                                    c3535gd14.c.setLength(0);
                                                                                    c3535gd14.f4422a.clear();
                                                                                    iMin = Math.min(c3535gd14.h, c3535gd14.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.n = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if (i2 != 17) {
                                                if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                h(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        h(1);
                                                                        this.q = 2;
                                                                        this.m.h = 2;
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        this.q = 3;
                                                                        this.m.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        this.q = 4;
                                                                        this.m.h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.p;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.n = Collections.emptyList();
                                                                                        i5 = this.p;
                                                                                        if (i5 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            C3535gd c3535gd15 = this.m;
                                                                                            arrayList = c3535gd15.b;
                                                                                            arrayList.add(c3535gd15.d());
                                                                                            c3535gd15.c.setLength(0);
                                                                                            c3535gd15.f4422a.clear();
                                                                                            iMin = Math.min(c3535gd15.h, c3535gd15.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.n = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            h(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    h(1);
                                                                    this.q = 2;
                                                                    this.m.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.q = 3;
                                                                    this.m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.q = 4;
                                                                    this.m.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.p;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.n = Collections.emptyList();
                                                                                    i5 = this.p;
                                                                                    if (i5 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        C3535gd c3535gd16 = this.m;
                                                                                        arrayList = c3535gd16.b;
                                                                                        arrayList.add(c3535gd16.d());
                                                                                        c3535gd16.c.setLength(0);
                                                                                        c3535gd16.f4422a.clear();
                                                                                        iMin = Math.min(c3535gd16.h, c3535gd16.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.n = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            h(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    h(1);
                                                                    this.q = 2;
                                                                    this.m.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.q = 3;
                                                                    this.m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.q = 4;
                                                                    this.m.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.p;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.n = Collections.emptyList();
                                                                                    i5 = this.p;
                                                                                    if (i5 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        C3535gd c3535gd17 = this.m;
                                                                                        arrayList = c3535gd17.b;
                                                                                        arrayList.add(c3535gd17.d());
                                                                                        c3535gd17.c.setLength(0);
                                                                                        c3535gd17.f4422a.clear();
                                                                                        iMin = Math.min(c3535gd17.h, c3535gd17.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.n = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        h(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                h(1);
                                                                this.q = 2;
                                                                this.m.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.q = 3;
                                                                this.m.h = 3;
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                this.q = 4;
                                                                this.m.h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.p;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.n = Collections.emptyList();
                                                                                i5 = this.p;
                                                                                if (i5 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    C3535gd c3535gd18 = this.m;
                                                                                    arrayList = c3535gd18.b;
                                                                                    arrayList.add(c3535gd18.d());
                                                                                    c3535gd18.c.setLength(0);
                                                                                    c3535gd18.f4422a.clear();
                                                                                    iMin = Math.min(c3535gd18.h, c3535gd18.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.n = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if ((b & 240) != 16) {
                                                if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            h(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    h(1);
                                                                    this.q = 2;
                                                                    this.m.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.q = 3;
                                                                    this.m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.q = 4;
                                                                    this.m.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.p;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.n = Collections.emptyList();
                                                                                    i5 = this.p;
                                                                                    if (i5 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        C3535gd c3535gd19 = this.m;
                                                                                        arrayList = c3535gd19.b;
                                                                                        arrayList.add(c3535gd19.d());
                                                                                        c3535gd19.c.setLength(0);
                                                                                        c3535gd19.f4422a.clear();
                                                                                        iMin = Math.min(c3535gd19.h, c3535gd19.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.n = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        h(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                h(1);
                                                                this.q = 2;
                                                                this.m.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.q = 3;
                                                                this.m.h = 3;
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                this.q = 4;
                                                                this.m.h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.p;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.n = Collections.emptyList();
                                                                                i5 = this.p;
                                                                                if (i5 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    C3535gd c3535gd110 = this.m;
                                                                                    arrayList = c3535gd110.b;
                                                                                    arrayList.add(c3535gd110.d());
                                                                                    c3535gd110.c.setLength(0);
                                                                                    c3535gd110.f4422a.clear();
                                                                                    iMin = Math.min(c3535gd110.h, c3535gd110.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.n = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if (i2 != 23) {
                                                if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        h(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                h(1);
                                                                this.q = 2;
                                                                this.m.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.q = 3;
                                                                this.m.h = 3;
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                this.q = 4;
                                                                this.m.h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.p;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.n = Collections.emptyList();
                                                                                i5 = this.p;
                                                                                if (i5 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    C3535gd c3535gd111 = this.m;
                                                                                    arrayList = c3535gd111.b;
                                                                                    arrayList.add(c3535gd111.d());
                                                                                    c3535gd111.c.setLength(0);
                                                                                    c3535gd111.f4422a.clear();
                                                                                    iMin = Math.min(c3535gd111.h, c3535gd111.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.n = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if (i3 == 20) {
                                                if (b2 == 32) {
                                                    h(2);
                                                } else if (b2 != 41) {
                                                    switch (b2) {
                                                        case 37:
                                                            h(1);
                                                            this.q = 2;
                                                            this.m.h = 2;
                                                            break;
                                                        case 38:
                                                            h(1);
                                                            this.q = 3;
                                                            this.m.h = 3;
                                                            break;
                                                        case 39:
                                                            h(1);
                                                            this.q = 4;
                                                            this.m.h = 4;
                                                            break;
                                                        default:
                                                            i4 = this.p;
                                                            if (i4 != 0) {
                                                                if (b2 != 33) {
                                                                    switch (b2) {
                                                                        case 44:
                                                                            this.n = Collections.emptyList();
                                                                            i5 = this.p;
                                                                            if (i5 != 1) {
                                                                                g();
                                                                            } else {
                                                                                g();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i4 == 1) {
                                                                                C3535gd c3535gd112 = this.m;
                                                                                arrayList = c3535gd112.b;
                                                                                arrayList.add(c3535gd112.d());
                                                                                c3535gd112.c.setLength(0);
                                                                                c3535gd112.f4422a.clear();
                                                                                iMin = Math.min(c3535gd112.h, c3535gd112.d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            g();
                                                                            break;
                                                                        case 47:
                                                                            this.n = f();
                                                                            g();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.m.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    h(3);
                                                }
                                            }
                                        } else {
                                            i3 = b & 246;
                                            if (i3 != 18) {
                                                if (i2 != 17) {
                                                    if ((b & 240) != 16) {
                                                        if (i2 != 23) {
                                                            if (i3 == 20) {
                                                                if (b2 == 32) {
                                                                    h(2);
                                                                } else if (b2 != 41) {
                                                                    switch (b2) {
                                                                        case 37:
                                                                            h(1);
                                                                            this.q = 2;
                                                                            this.m.h = 2;
                                                                            break;
                                                                        case 38:
                                                                            h(1);
                                                                            this.q = 3;
                                                                            this.m.h = 3;
                                                                            break;
                                                                        case 39:
                                                                            h(1);
                                                                            this.q = 4;
                                                                            this.m.h = 4;
                                                                            break;
                                                                        default:
                                                                            i4 = this.p;
                                                                            if (i4 != 0) {
                                                                                if (b2 != 33) {
                                                                                    switch (b2) {
                                                                                        case 44:
                                                                                            this.n = Collections.emptyList();
                                                                                            i5 = this.p;
                                                                                            if (i5 != 1) {
                                                                                                g();
                                                                                            } else {
                                                                                                g();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i4 == 1) {
                                                                                                C3535gd c3535gd113 = this.m;
                                                                                                arrayList = c3535gd113.b;
                                                                                                arrayList.add(c3535gd113.d());
                                                                                                c3535gd113.c.setLength(0);
                                                                                                c3535gd113.f4422a.clear();
                                                                                                iMin = Math.min(c3535gd113.h, c3535gd113.d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            g();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.n = f();
                                                                                            g();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.m.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    h(3);
                                                                }
                                                            }
                                                        } else if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                h(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        h(1);
                                                                        this.q = 2;
                                                                        this.m.h = 2;
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        this.q = 3;
                                                                        this.m.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        this.q = 4;
                                                                        this.m.h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.p;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.n = Collections.emptyList();
                                                                                        i5 = this.p;
                                                                                        if (i5 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            C3535gd c3535gd114 = this.m;
                                                                                            arrayList = c3535gd114.b;
                                                                                            arrayList.add(c3535gd114.d());
                                                                                            c3535gd114.c.setLength(0);
                                                                                            c3535gd114.f4422a.clear();
                                                                                            iMin = Math.min(c3535gd114.h, c3535gd114.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.n = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                h(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        h(1);
                                                                        this.q = 2;
                                                                        this.m.h = 2;
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        this.q = 3;
                                                                        this.m.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        this.q = 4;
                                                                        this.m.h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.p;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.n = Collections.emptyList();
                                                                                        i5 = this.p;
                                                                                        if (i5 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            C3535gd c3535gd115 = this.m;
                                                                                            arrayList = c3535gd115.b;
                                                                                            arrayList.add(c3535gd115.d());
                                                                                            c3535gd115.c.setLength(0);
                                                                                            c3535gd115.f4422a.clear();
                                                                                            iMin = Math.min(c3535gd115.h, c3535gd115.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.n = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            h(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    h(1);
                                                                    this.q = 2;
                                                                    this.m.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.q = 3;
                                                                    this.m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.q = 4;
                                                                    this.m.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.p;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.n = Collections.emptyList();
                                                                                    i5 = this.p;
                                                                                    if (i5 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        C3535gd c3535gd116 = this.m;
                                                                                        arrayList = c3535gd116.b;
                                                                                        arrayList.add(c3535gd116.d());
                                                                                        c3535gd116.c.setLength(0);
                                                                                        c3535gd116.f4422a.clear();
                                                                                        iMin = Math.min(c3535gd116.h, c3535gd116.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.n = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                h(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        h(1);
                                                                        this.q = 2;
                                                                        this.m.h = 2;
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        this.q = 3;
                                                                        this.m.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        this.q = 4;
                                                                        this.m.h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.p;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.n = Collections.emptyList();
                                                                                        i5 = this.p;
                                                                                        if (i5 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            C3535gd c3535gd117 = this.m;
                                                                                            arrayList = c3535gd117.b;
                                                                                            arrayList.add(c3535gd117.d());
                                                                                            c3535gd117.c.setLength(0);
                                                                                            c3535gd117.f4422a.clear();
                                                                                            iMin = Math.min(c3535gd117.h, c3535gd117.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.n = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            h(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    h(1);
                                                                    this.q = 2;
                                                                    this.m.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.q = 3;
                                                                    this.m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.q = 4;
                                                                    this.m.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.p;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.n = Collections.emptyList();
                                                                                    i5 = this.p;
                                                                                    if (i5 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        C3535gd c3535gd118 = this.m;
                                                                                        arrayList = c3535gd118.b;
                                                                                        arrayList.add(c3535gd118.d());
                                                                                        c3535gd118.c.setLength(0);
                                                                                        c3535gd118.f4422a.clear();
                                                                                        iMin = Math.min(c3535gd118.h, c3535gd118.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.n = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            h(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    h(1);
                                                                    this.q = 2;
                                                                    this.m.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.q = 3;
                                                                    this.m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.q = 4;
                                                                    this.m.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.p;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.n = Collections.emptyList();
                                                                                    i5 = this.p;
                                                                                    if (i5 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        C3535gd c3535gd119 = this.m;
                                                                                        arrayList = c3535gd119.b;
                                                                                        arrayList.add(c3535gd119.d());
                                                                                        c3535gd119.c.setLength(0);
                                                                                        c3535gd119.f4422a.clear();
                                                                                        iMin = Math.min(c3535gd119.h, c3535gd119.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.n = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        h(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                h(1);
                                                                this.q = 2;
                                                                this.m.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.q = 3;
                                                                this.m.h = 3;
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                this.q = 4;
                                                                this.m.h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.p;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.n = Collections.emptyList();
                                                                                i5 = this.p;
                                                                                if (i5 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    C3535gd c3535gd1110 = this.m;
                                                                                    arrayList = c3535gd1110.b;
                                                                                    arrayList.add(c3535gd1110.d());
                                                                                    c3535gd1110.c.setLength(0);
                                                                                    c3535gd1110.f4422a.clear();
                                                                                    iMin = Math.min(c3535gd1110.h, c3535gd1110.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.n = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if (i2 != 17) {
                                                if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                h(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        h(1);
                                                                        this.q = 2;
                                                                        this.m.h = 2;
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        this.q = 3;
                                                                        this.m.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        this.q = 4;
                                                                        this.m.h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.p;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.n = Collections.emptyList();
                                                                                        i5 = this.p;
                                                                                        if (i5 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            C3535gd c3535gd1111 = this.m;
                                                                                            arrayList = c3535gd1111.b;
                                                                                            arrayList.add(c3535gd1111.d());
                                                                                            c3535gd1111.c.setLength(0);
                                                                                            c3535gd1111.f4422a.clear();
                                                                                            iMin = Math.min(c3535gd1111.h, c3535gd1111.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.n = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            h(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    h(1);
                                                                    this.q = 2;
                                                                    this.m.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.q = 3;
                                                                    this.m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.q = 4;
                                                                    this.m.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.p;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.n = Collections.emptyList();
                                                                                    i5 = this.p;
                                                                                    if (i5 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        C3535gd c3535gd1112 = this.m;
                                                                                        arrayList = c3535gd1112.b;
                                                                                        arrayList.add(c3535gd1112.d());
                                                                                        c3535gd1112.c.setLength(0);
                                                                                        c3535gd1112.f4422a.clear();
                                                                                        iMin = Math.min(c3535gd1112.h, c3535gd1112.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.n = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            h(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    h(1);
                                                                    this.q = 2;
                                                                    this.m.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.q = 3;
                                                                    this.m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.q = 4;
                                                                    this.m.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.p;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.n = Collections.emptyList();
                                                                                    i5 = this.p;
                                                                                    if (i5 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        C3535gd c3535gd1113 = this.m;
                                                                                        arrayList = c3535gd1113.b;
                                                                                        arrayList.add(c3535gd1113.d());
                                                                                        c3535gd1113.c.setLength(0);
                                                                                        c3535gd1113.f4422a.clear();
                                                                                        iMin = Math.min(c3535gd1113.h, c3535gd1113.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.n = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        h(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                h(1);
                                                                this.q = 2;
                                                                this.m.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.q = 3;
                                                                this.m.h = 3;
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                this.q = 4;
                                                                this.m.h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.p;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.n = Collections.emptyList();
                                                                                i5 = this.p;
                                                                                if (i5 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    C3535gd c3535gd1114 = this.m;
                                                                                    arrayList = c3535gd1114.b;
                                                                                    arrayList.add(c3535gd1114.d());
                                                                                    c3535gd1114.c.setLength(0);
                                                                                    c3535gd1114.f4422a.clear();
                                                                                    iMin = Math.min(c3535gd1114.h, c3535gd1114.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.n = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if ((b & 240) != 16) {
                                                if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            h(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    h(1);
                                                                    this.q = 2;
                                                                    this.m.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.q = 3;
                                                                    this.m.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.q = 4;
                                                                    this.m.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.p;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.n = Collections.emptyList();
                                                                                    i5 = this.p;
                                                                                    if (i5 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        C3535gd c3535gd1115 = this.m;
                                                                                        arrayList = c3535gd1115.b;
                                                                                        arrayList.add(c3535gd1115.d());
                                                                                        c3535gd1115.c.setLength(0);
                                                                                        c3535gd1115.f4422a.clear();
                                                                                        iMin = Math.min(c3535gd1115.h, c3535gd1115.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.n = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.m.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        h(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                h(1);
                                                                this.q = 2;
                                                                this.m.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.q = 3;
                                                                this.m.h = 3;
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                this.q = 4;
                                                                this.m.h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.p;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.n = Collections.emptyList();
                                                                                i5 = this.p;
                                                                                if (i5 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    C3535gd c3535gd1116 = this.m;
                                                                                    arrayList = c3535gd1116.b;
                                                                                    arrayList.add(c3535gd1116.d());
                                                                                    c3535gd1116.c.setLength(0);
                                                                                    c3535gd1116.f4422a.clear();
                                                                                    iMin = Math.min(c3535gd1116.h, c3535gd1116.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.n = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if (i2 != 23) {
                                                if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        h(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                h(1);
                                                                this.q = 2;
                                                                this.m.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.q = 3;
                                                                this.m.h = 3;
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                this.q = 4;
                                                                this.m.h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.p;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.n = Collections.emptyList();
                                                                                i5 = this.p;
                                                                                if (i5 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    C3535gd c3535gd1117 = this.m;
                                                                                    arrayList = c3535gd1117.b;
                                                                                    arrayList.add(c3535gd1117.d());
                                                                                    c3535gd1117.c.setLength(0);
                                                                                    c3535gd1117.f4422a.clear();
                                                                                    iMin = Math.min(c3535gd1117.h, c3535gd1117.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.n = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.m.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if (i3 == 20) {
                                                if (b2 == 32) {
                                                    h(2);
                                                } else if (b2 != 41) {
                                                    switch (b2) {
                                                        case 37:
                                                            h(1);
                                                            this.q = 2;
                                                            this.m.h = 2;
                                                            break;
                                                        case 38:
                                                            h(1);
                                                            this.q = 3;
                                                            this.m.h = 3;
                                                            break;
                                                        case 39:
                                                            h(1);
                                                            this.q = 4;
                                                            this.m.h = 4;
                                                            break;
                                                        default:
                                                            i4 = this.p;
                                                            if (i4 != 0) {
                                                                if (b2 != 33) {
                                                                    switch (b2) {
                                                                        case 44:
                                                                            this.n = Collections.emptyList();
                                                                            i5 = this.p;
                                                                            if (i5 != 1) {
                                                                                g();
                                                                            } else {
                                                                                g();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i4 == 1) {
                                                                                C3535gd c3535gd1118 = this.m;
                                                                                arrayList = c3535gd1118.b;
                                                                                arrayList.add(c3535gd1118.d());
                                                                                c3535gd1118.c.setLength(0);
                                                                                c3535gd1118.f4422a.clear();
                                                                                iMin = Math.min(c3535gd1118.h, c3535gd1118.d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            g();
                                                                            break;
                                                                        case 47:
                                                                            this.n = f();
                                                                            g();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.m.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    h(3);
                                                }
                                            }
                                        }
                                    } else {
                                        C3535gd c3535gd20 = this.m;
                                        iArr = B;
                                        c3535gd20.a((char) iArr[(b & 127) - 32]);
                                        if ((b2 & 224) != 0) {
                                            this.m.a((char) iArr[(b2 & 127) - 32]);
                                        }
                                    }
                                    z3 = true;
                                }
                            }
                        } else if (z4) {
                            g();
                            z3 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4149nd, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2574Ll
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final AbstractC5023xa0 dequeueOutputBuffer() {
        AbstractC5023xa0 abstractC5023xa0;
        AbstractC5023xa0 abstractC5023xa0DequeueOutputBuffer = super.dequeueOutputBuffer();
        if (abstractC5023xa0DequeueOutputBuffer != null) {
            return abstractC5023xa0DequeueOutputBuffer;
        }
        long j = this.k;
        if (j == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return null;
        }
        long j2 = this.x;
        if (j2 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || this.e - j2 < j || (abstractC5023xa0 = (AbstractC5023xa0) this.b.pollFirst()) == null) {
            return null;
        }
        this.n = Collections.emptyList();
        this.x = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        abstractC5023xa0.f(this.e, b(), Long.MAX_VALUE);
        return abstractC5023xa0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4149nd
    public final boolean e() {
        return this.n != this.o;
    }

    public final ArrayList f() {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            C2417Fk c2417FkC = ((C3535gd) arrayList.get(i)).c(Integer.MIN_VALUE);
            arrayList2.add(c2417FkC);
            if (c2417FkC != null) {
                iMin = Math.min(iMin, c2417FkC.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            C2417Fk c2417FkC2 = (C2417Fk) arrayList2.get(i2);
            if (c2417FkC2 != null) {
                if (c2417FkC2.i != iMin) {
                    c2417FkC2 = ((C3535gd) arrayList.get(i2)).c(iMin);
                    c2417FkC2.getClass();
                }
                arrayList3.add(c2417FkC2);
            }
        }
        return arrayList3;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4149nd, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2574Ll
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        h(0);
        this.q = 4;
        this.m.h = 4;
        g();
        this.r = false;
        this.s = false;
        this.t = (byte) 0;
        this.u = (byte) 0;
        this.v = 0;
        this.w = true;
        this.x = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    public final void g() {
        C3535gd c3535gd = this.m;
        c3535gd.g = this.p;
        c3535gd.f4422a.clear();
        c3535gd.b.clear();
        c3535gd.c.setLength(0);
        c3535gd.d = 15;
        c3535gd.e = 0;
        c3535gd.f = 0;
        ArrayList arrayList = this.l;
        arrayList.clear();
        arrayList.add(this.m);
    }

    public final void h(int i) {
        int i2 = this.p;
        if (i2 == i) {
            return;
        }
        this.p = i;
        if (i != 3) {
            g();
            if (i2 == 3 || i == 1 || i == 0) {
                this.n = Collections.emptyList();
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((C3535gd) arrayList.get(i3)).g = i;
            i3++;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4149nd, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2574Ll
    public final void release() {
    }
}
