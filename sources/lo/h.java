package lo;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class h implements Serializable, Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f45638d = new h(new byte[0]);
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f45639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int f45640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient String f45641c;

    public h(byte[] data) {
        kotlin.jvm.internal.n.f(data, "data");
        this.f45639a = data;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            throw new IllegalArgumentException(l1.d.e(i10, "byteCount < 0: ").toString());
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = objectInputStream.read(bArr, i11, i10 - i11);
            if (i12 == -1) {
                throw new EOFException();
            }
            i11 += i12;
        }
        h hVar = new h(bArr);
        Field declaredField = h.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        declaredField.set(this, hVar.f45639a);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f45639a.length);
        objectOutputStream.write(this.f45639a);
    }

    public h a(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f45639a, 0, d());
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.n.c(bArrDigest);
        return new h(bArrDigest);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h other = (h) obj;
        kotlin.jvm.internal.n.f(other, "other");
        int iD = d();
        int iD2 = other.d();
        int iMin = Math.min(iD, iD2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = i(i10) & 255;
            int i12 = other.i(i10) & 255;
            if (i11 != i12) {
                return i11 < i12 ? -1 : 1;
            }
        }
        if (iD == iD2) {
            return 0;
        }
        return iD < iD2 ? -1 : 1;
    }

    public int d() {
        return this.f45639a.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            int iD = hVar.d();
            byte[] bArr = this.f45639a;
            if (iD == bArr.length && hVar.j(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public String g() {
        byte[] bArr = this.f45639a;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = mo.b.f46263a;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public byte[] h() {
        return this.f45639a;
    }

    public int hashCode() {
        int i10 = this.f45640b;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f45639a);
        this.f45640b = iHashCode;
        return iHashCode;
    }

    public byte i(int i10) {
        return this.f45639a[i10];
    }

    public boolean j(int i10, byte[] other, int i11, int i12) {
        kotlin.jvm.internal.n.f(other, "other");
        if (i10 < 0) {
            return false;
        }
        byte[] bArr = this.f45639a;
        return i10 <= bArr.length - i12 && i11 >= 0 && i11 <= other.length - i12 && com.google.android.gms.internal.auth.i.a(bArr, i10, other, i11, i12);
    }

    public boolean k(h other, int i10) {
        kotlin.jvm.internal.n.f(other, "other");
        return other.j(0, this.f45639a, 0, i10);
    }

    public h l() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f45639a;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.n.e(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new h(bArrCopyOf);
            }
            i10++;
        }
    }

    public final String m() {
        String str = this.f45641c;
        if (str != null) {
            return str;
        }
        byte[] bArrH = h();
        kotlin.jvm.internal.n.f(bArrH, "<this>");
        String str2 = new String(bArrH, an.a.f3768a);
        this.f45641c = str2;
        return str2;
    }

    public void n(e eVar, int i10) {
        eVar.n(i10, this.f45639a);
    }

    /* JADX WARN: Code duplicated, block: B:179:0x01b6 A[EDGE_INSN: B:179:0x01b6->B:180:0x01b7 BREAK  A[LOOP:0: B:7:0x000e->B:241:0x000e]] */
    public String toString() {
        byte b10;
        int i10;
        h hVar = this;
        byte[] bArr = hVar.f45639a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        loop0: while (i11 < length) {
            byte b11 = bArr[i11];
            if (b11 < 0) {
                if ((b11 >> 5) != -2) {
                    if ((b11 >> 4) != -2) {
                        if ((b11 >> 3) != -2) {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                        int i14 = i11 + 3;
                        if (length > i14) {
                            byte b12 = bArr[i11 + 1];
                            if ((b12 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            byte b13 = bArr[i11 + 2];
                            if ((b13 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            byte b14 = bArr[i14];
                            if ((b14 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            int i15 = (((b14 ^ 3678080) ^ (b13 << 6)) ^ (b12 << 12)) ^ (b11 << 18);
                            if (i15 <= 1114111) {
                                if (55296 <= i15 && i15 < 57344) {
                                    if (i13 == 64) {
                                        break;
                                    }
                                    i12 = -1;
                                    break;
                                }
                                if (i15 >= 65536) {
                                    i10 = i13 + 1;
                                    if (i13 == 64) {
                                        break;
                                    }
                                    if ((i15 != 10 && i15 != 13 && ((i15 >= 0 && i15 < 32) || (127 <= i15 && i15 < 160))) || i15 == 65533) {
                                        i12 = -1;
                                        break;
                                    }
                                    i12 += i15 < 65536 ? 1 : 2;
                                    i11 += 4;
                                    i13 = i10;
                                } else {
                                    if (i13 == 64) {
                                        break;
                                    }
                                    i12 = -1;
                                    break;
                                }
                            } else {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                        } else {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                    } else {
                        int i16 = i11 + 2;
                        if (length > i16) {
                            byte b15 = bArr[i11 + 1];
                            if ((b15 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            byte b16 = bArr[i16];
                            if ((b16 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            int i17 = ((b16 ^ (-123008)) ^ (b15 << 6)) ^ (b11 << 12);
                            if (i17 >= 2048) {
                                if (55296 <= i17 && i17 < 57344) {
                                    if (i13 == 64) {
                                        break;
                                    }
                                    i12 = -1;
                                    break;
                                }
                                i10 = i13 + 1;
                                if (i13 == 64) {
                                    break;
                                }
                                if ((i17 != 10 && i17 != 13 && ((i17 >= 0 && i17 < 32) || (127 <= i17 && i17 < 160))) || i17 == 65533) {
                                    i12 = -1;
                                    break;
                                }
                                i12 += i17 < 65536 ? 1 : 2;
                                i11 += 3;
                                i13 = i10;
                            } else {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                        } else {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                    }
                } else {
                    int i18 = i11 + 1;
                    if (length > i18) {
                        byte b17 = bArr[i18];
                        if ((b17 & 192) != 128) {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                        int i19 = (b17 ^ 3968) ^ (b11 << 6);
                        if (i19 >= 128) {
                            i10 = i13 + 1;
                            if (i13 == 64) {
                                break;
                            }
                            if ((i19 != 10 && i19 != 13 && ((i19 >= 0 && i19 < 32) || (127 <= i19 && i19 < 160))) || i19 == 65533) {
                                i12 = -1;
                                break;
                            }
                            i12 += i19 < 65536 ? 1 : 2;
                            i11 += 2;
                            i13 = i10;
                        } else {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                    } else {
                        if (i13 == 64) {
                            break;
                        }
                        i12 = -1;
                        break;
                    }
                }
            } else {
                int i20 = i13 + 1;
                if (i13 == 64) {
                    break;
                }
                if ((b11 == 10 || b11 == 13 || ((b11 < 0 || b11 >= 32) && (127 > b11 || b11 >= 160))) && b11 != 65533) {
                    i12 += b11 < 65536 ? 1 : 2;
                    i11++;
                    while (true) {
                        i13 = i20;
                        if (i11 < length && (b10 = bArr[i11]) >= 0) {
                            i11++;
                            i20 = i13 + 1;
                            if (i13 == 64) {
                                break loop0;
                            }
                            if ((b10 == 10 || b10 == 13 || ((b10 < 0 || b10 >= 32) && (127 > b10 || b10 >= 160))) && b10 != 65533) {
                                i12 += b10 < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i12 = -1;
                break;
            }
        }
        if (i12 != -1) {
            String strM = hVar.m();
            String strSubstring = strM.substring(0, i12);
            kotlin.jvm.internal.n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strN0 = an.p.n0(an.p.n0(an.p.n0(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i12 >= strM.length()) {
                return defpackage.e.f(']', "[text=", strN0);
            }
            return "[size=" + hVar.f45639a.length + " text=" + strN0 + "…]";
        }
        if (hVar.f45639a.length <= 64) {
            return "[hex=" + hVar.g() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(hVar.f45639a.length);
        sb2.append(" hex=");
        byte[] bArr2 = hVar.f45639a;
        if (64 > bArr2.length) {
            throw new IllegalArgumentException(d5.u.g(new StringBuilder("endIndex > length("), hVar.f45639a.length, ')').toString());
        }
        if (64 != bArr2.length) {
            hVar = new h(xj.k.i0(bArr2, 0, 64));
        }
        sb2.append(hVar.g());
        sb2.append("…]");
        return sb2.toString();
    }
}
