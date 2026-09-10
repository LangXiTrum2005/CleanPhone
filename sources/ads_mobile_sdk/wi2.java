package ads_mobile_sdk;

import java.util.Iterator;
import org.objectweb.asm.Opcodes;
import saneness.polder;

/* JADX INFO: loaded from: classes.dex */
public final class wi2 extends kn {
    public static final int[] i = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, Opcodes.D2F, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int d;
    public final kn e;
    public final kn f;
    public final int g;
    public final int h;

    public wi2(kn knVar, kn knVar2) {
        this.e = knVar;
        this.f = knVar2;
        int size = knVar.size();
        this.g = size;
        this.d = knVar2.size() + size;
        this.h = Math.max(knVar.a(), knVar2.a()) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [ads_mobile_sdk.kn] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    public static kn a(kn knVar, kn knVar2) {
        if (knVar2.size() == 0) {
            return knVar;
        }
        if (knVar.size() == 0) {
            return knVar2;
        }
        int size = knVar2.size() + knVar.size();
        String str = "Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.";
        if (size < 128) {
            int size2 = knVar.size();
            int size3 = knVar2.size();
            int i2 = size2 + size3;
            byte[] bArr = new byte[i2];
            kn.a(0, size2, knVar.size());
            kn.a(0, size2, i2);
            if (size2 > 0) {
                knVar.a(0, 0, size2, bArr);
            }
            kn.a(0, size3, knVar2.size());
            kn.a(size2, i2, i2);
            if (size3 > 0) {
                knVar2.a(0, size2, size3, bArr);
            }
            try {
                return i2 == 0 ? kn.b : new in(bArr);
            } catch (x81 e) {
                throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
            }
        }
        if (knVar instanceof wi2) {
            wi2 wi2Var = (wi2) knVar;
            if (knVar2.size() + wi2Var.f.size() < 128) {
                kn knVar3 = wi2Var.f;
                int size4 = knVar3.size();
                int size5 = knVar2.size();
                int i3 = size4 + size5;
                byte[] bArr2 = new byte[i3];
                kn.a(0, size4, knVar3.size());
                kn.a(0, size4, i3);
                if (size4 > 0) {
                    knVar3.a(0, 0, size4, bArr2);
                }
                kn.a(0, size5, knVar2.size());
                kn.a(size4, i3, i3);
                if (size5 > 0) {
                    knVar2.a(0, size4, size5, bArr2);
                }
                try {
                    in inVar = i3 == 0 ? kn.b : new in(bArr2);
                    str = wi2Var.e;
                    return new wi2(str, inVar);
                } catch (x81 e2) {
                    throw new AssertionError(str, e2);
                }
            }
            if (wi2Var.e.a() > wi2Var.f.a() && wi2Var.h > knVar2.a()) {
                return new wi2(wi2Var.e, new wi2(wi2Var.f, knVar2));
            }
        }
        return size >= c(Math.max(knVar.a(), knVar2.a()) + 1) ? new wi2(knVar, knVar2) : new ui2().a(knVar, knVar2);
    }

    public static int c(int i2) {
        int[] iArr = i;
        if (i2 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i2];
    }

    @Override // ads_mobile_sdk.kn
    public final boolean b(kn knVar) {
        hn hnVarB;
        vi2 vi2Var = new vi2(this);
        hn hnVarB2 = vi2Var.next();
        vi2 vi2Var2 = new vi2(knVar);
        hn hnVarB3 = vi2Var2.next();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int size = hnVarB2.size() - i2;
            int size2 = hnVarB3.size() - i3;
            int iMin = Math.min(size, size2);
            if (!(i2 == 0 ? hnVarB2.a(hnVarB3, i3, iMin) : hnVarB3.a(hnVarB2, i2, iMin))) {
                return false;
            }
            i4 += iMin;
            int i5 = this.d;
            if (i4 >= i5) {
                if (i4 == i5) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                hnVarB = vi2Var.next();
                i2 = 0;
            } else {
                i2 += iMin;
            }
            if (iMin == size2) {
                hnVarB2 = hnVarB2;
                hnVarB2 = hnVarB;
                hnVarB3 = vi2Var2.next();
                i3 = 0;
            } else {
                hnVarB2 = hnVarB2;
                hnVarB2 = hnVarB;
                i3 += iMin;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ti2(this);
    }

    @Override // ads_mobile_sdk.kn
    public final int size() {
        return this.d;
    }

    @Override // ads_mobile_sdk.kn
    public final byte b(int i2) {
        int i3 = this.g;
        if (i2 < i3) {
            return this.e.b(i2);
        }
        return this.f.b(i2 - i3);
    }

    @Override // ads_mobile_sdk.kn
    public final boolean b() {
        return this.d >= c(this.h);
    }

    @Override // ads_mobile_sdk.kn
    public final int b(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.g;
        if (i5 <= i6) {
            return this.e.b(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.f.b(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.f.b(this.e.b(i2, i3, i7), 0, i4 - i7);
    }

    @Override // ads_mobile_sdk.kn
    public final kn b(int i2, int i3) {
        int iA = kn.a(i2, i3, this.d);
        if (iA == 0) {
            return kn.b;
        }
        if (iA == this.d) {
            return this;
        }
        int i4 = this.g;
        if (i3 <= i4) {
            return this.e.a(i2, i3);
        }
        if (i2 >= i4) {
            return this.f.a(i2 - i4, i3 - i4);
        }
        kn knVar = this.e;
        return new wi2(knVar.a(i2, knVar.size()), this.f.a(0, i3 - this.g));
    }

    @Override // ads_mobile_sdk.kn
    public final void a(int i2, int i3, int i4, byte[] bArr) {
        int i5 = i2 + i4;
        int i6 = this.g;
        if (i5 <= i6) {
            this.e.a(i2, i3, i4, bArr);
        } else {
            if (i2 >= i6) {
                this.f.a(i2 - i6, i3, i4, bArr);
                return;
            }
            int i7 = i6 - i2;
            this.e.a(i2, i3, i7, bArr);
            this.f.a(0, i3 + i7, i4 - i7, bArr);
        }
    }

    @Override // ads_mobile_sdk.kn
    public final int a() {
        return this.h;
    }

    @Override // ads_mobile_sdk.kn
    public final kn a(int i2, int i3) {
        return b(i2, i3);
    }

    @Override // ads_mobile_sdk.kn
    public final void a(polder polderVar) {
        this.e.a(polderVar);
        this.f.a(polderVar);
    }
}
