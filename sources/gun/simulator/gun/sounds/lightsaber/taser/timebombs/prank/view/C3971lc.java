package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3971lc implements Serializable, Comparable {
    public static final C3971lc d = new C3971lc(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f4653a;
    public transient int b;
    public transient String c;

    public C3971lc(byte[] bArr) {
        AbstractC2995aW.q(bArr, "data");
        this.f4653a = bArr;
    }

    public String a() {
        byte[] bArr = AbstractC5047xm0.f5244a;
        byte[] bArr2 = this.f4653a;
        AbstractC2995aW.q(bArr2, "<this>");
        AbstractC2995aW.q(bArr, "map");
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr2[i];
            int i3 = i + 2;
            byte b2 = bArr2[i + 1];
            i += 3;
            byte b3 = bArr2[i3];
            bArr3[i2] = bArr[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr[((b2 & com.umeng.analytics.pro.cw.m) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr[b3 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b4 = bArr2[i];
            bArr3[i2] = bArr[(b4 & 255) >> 2];
            bArr3[i2 + 1] = bArr[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr3[i2 + 2] = b5;
            bArr3[i2 + 3] = b5;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b6 = bArr2[i];
            byte b7 = bArr2[i5];
            bArr3[i2] = bArr[(b6 & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr3[i2 + 2] = bArr[(b7 & com.umeng.analytics.pro.cw.m) << 2];
            bArr3[i2 + 3] = (byte) 61;
        }
        return new String(bArr3, AbstractC2307Be.f2881a);
    }

    public C3971lc b(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f4653a, 0, c());
        byte[] bArrDigest = messageDigest.digest();
        AbstractC2995aW.p(bArrDigest, "digestBytes");
        return new C3971lc(bArrDigest);
    }

    public int c() {
        return this.f4653a.length;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x002c A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3971lc c3971lc = (C3971lc) obj;
        AbstractC2995aW.q(c3971lc, "other");
        int iC = c();
        int iC2 = c3971lc.c();
        int iMin = Math.min(iC, iC2);
        for (int i = 0; i < iMin; i++) {
            int iF = f(i) & 255;
            int iF2 = c3971lc.f(i) & 255;
            if (iF != iF2) {
                if (iF < iF2) {
                    return -1;
                }
                return 1;
            }
        }
        if (iC == iC2) {
            return 0;
        }
        if (iC < iC2) {
            return -1;
        }
        return 1;
    }

    public String d() {
        byte[] bArr = this.f4653a;
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            i++;
            int i3 = i2 + 1;
            char[] cArr2 = AbstractC2340Cl.f;
            cArr[i2] = cArr2[(b >> 4) & 15];
            i2 += 2;
            cArr[i3] = cArr2[b & com.umeng.analytics.pro.cw.m];
        }
        return new String(cArr);
    }

    public byte[] e() {
        return this.f4653a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3971lc) {
            C3971lc c3971lc = (C3971lc) obj;
            int iC = c3971lc.c();
            byte[] bArr = this.f4653a;
            if (iC == bArr.length && c3971lc.g(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public byte f(int i) {
        return this.f4653a[i];
    }

    public boolean g(int i, int i2, int i3, byte[] bArr) {
        AbstractC2995aW.q(bArr, "other");
        if (i >= 0) {
            byte[] bArr2 = this.f4653a;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && AbstractC2845Vx.J(i, bArr2, i2, bArr, i3)) {
                return true;
            }
        }
        return false;
    }

    public boolean h(C3971lc c3971lc, int i) {
        AbstractC2995aW.q(c3971lc, "other");
        return c3971lc.g(0, 0, i, this.f4653a);
    }

    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f4653a);
        this.b = iHashCode;
        return iHashCode;
    }

    public C3971lc i() {
        byte b;
        int i = 0;
        while (true) {
            byte[] bArr = this.f4653a;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC2995aW.p(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
                bArrCopyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b4 = bArrCopyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        bArrCopyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new C3971lc(bArrCopyOf);
            }
            i++;
        }
    }

    public final String j() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        byte[] bArrE = e();
        AbstractC2995aW.q(bArrE, "<this>");
        String str2 = new String(bArrE, AbstractC2307Be.f2881a);
        this.c = str2;
        return str2;
    }

    public void k(C4848vb c4848vb, int i) {
        AbstractC2995aW.q(c4848vb, "buffer");
        c4848vb.y(this.f4653a, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003c A[EDGE_INSN: B:22:0x003c->B:180:0x01a6 BREAK  A[LOOP:0: B:6:0x000f->B:238:0x000f]] */
    public String toString() {
        C3971lc c3971lc;
        byte b;
        int i;
        byte[] bArr = this.f4653a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (i2 < length) {
            byte b2 = bArr[i2];
            if (b2 < 0) {
                if ((b2 >> 5) != -2) {
                    if ((b2 >> 4) != -2) {
                        if ((b2 >> 3) != -2) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i5 = i2 + 3;
                        if (length > i5) {
                            byte b3 = bArr[i2 + 1];
                            if ((b3 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b4 = bArr[i2 + 2];
                            if ((b4 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b5 = bArr[i5];
                            if ((b5 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i6 = (((b5 ^ 3678080) ^ (b4 << 6)) ^ (b3 << 12)) ^ (b2 << 18);
                            if (i6 <= 1114111) {
                                if (55296 <= i6 && i6 <= 57343) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                if (i6 >= 65536) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i6 != 10 && i6 != 13 && ((i6 >= 0 && i6 <= 31) || (127 <= i6 && i6 <= 159))) || i6 == 65533) {
                                        i3 = -1;
                                        break;
                                    }
                                    i3 += i6 < 65536 ? 1 : 2;
                                    i2 += 4;
                                    i4 = i;
                                } else {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        int i7 = i2 + 2;
                        if (length > i7) {
                            byte b6 = bArr[i2 + 1];
                            if ((b6 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b7 = bArr[i7];
                            if ((b7 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i8 = ((b7 ^ (-123008)) ^ (b6 << 6)) ^ (b2 << 12);
                            if (i8 >= 2048) {
                                if (55296 <= i8 && i8 <= 57343) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                if ((i8 != 10 && i8 != 13 && ((i8 >= 0 && i8 <= 31) || (127 <= i8 && i8 <= 159))) || i8 == 65533) {
                                    i3 = -1;
                                    break;
                                }
                                i3 += i8 < 65536 ? 1 : 2;
                                i2 += 3;
                                i4 = i;
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    }
                } else {
                    int i9 = i2 + 1;
                    if (length > i9) {
                        byte b8 = bArr[i9];
                        if ((b8 & 192) != 128) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i10 = (b8 ^ 3968) ^ (b2 << 6);
                        if (i10 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && i10 <= 31) || (127 <= i10 && i10 <= 159))) || i10 == 65533) {
                                i3 = -1;
                                break;
                            }
                            i3 += i10 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        if (i4 == 64) {
                            break;
                        }
                        i3 = -1;
                        break;
                    }
                }
            } else {
                int i11 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 == 10 || b2 == 13 || ((b2 < 0 || b2 > 31) && (127 > b2 || b2 > 159))) && b2 != 65533) {
                    i3 += b2 < 65536 ? 1 : 2;
                    i2++;
                    while (true) {
                        i4 = i11;
                        if (i2 < length && (b = bArr[i2]) >= 0) {
                            i2++;
                            i11 = i4 + 1;
                            if (i4 == 64) {
                                break loop0;
                            }
                            if ((b == 10 || b == 13 || ((b < 0 || b > 31) && (127 > b || b > 159))) && b != 65533) {
                                i3 += b < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i3 = -1;
                break;
            }
        }
        if (i3 != -1) {
            String strJ = j();
            String strSubstring = strJ.substring(0, i3);
            AbstractC2995aW.p(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String strH0 = AbstractC3089ba0.H0(AbstractC3089ba0.H0(AbstractC3089ba0.H0(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= strJ.length()) {
                return AbstractC3950lJ.r("[text=", strH0, ']');
            }
            return "[size=" + bArr.length + " text=" + strH0 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + d() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(DM.k(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (64 == bArr.length) {
            c3971lc = this;
        } else {
            AbstractC3375el.t(64, bArr.length);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 64);
            AbstractC2995aW.p(bArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
            c3971lc = new C3971lc(bArrCopyOfRange);
        }
        sb.append(c3971lc.d());
        sb.append("…]");
        return sb.toString();
    }
}
