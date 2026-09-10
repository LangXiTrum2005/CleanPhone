package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.FloatArray;
import com.badlogic.gdx.utils.ObjectSet;
import com.badlogic.gdx.utils.SnapshotArray;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.k5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3843k5 {
    public static final C3493g5 k = new C3493g5("<empty>", new Array(0), 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4019m5 f4583a;
    public boolean g;
    public int i;
    public final Array b = new Array();
    public final Array c = new Array();
    public final SnapshotArray d = new SnapshotArray();
    public final C4288p70 e = new C4288p70(this);
    public final ObjectSet f = new ObjectSet();
    public float h = 1.0f;
    public final C3185ce0 j = new C3185ce0(this, 2);

    public C3843k5(C4019m5 c4019m5) {
        this.f4583a = c4019m5;
    }

    public static void f(C3140c5 c3140c5, C4991x70 c4991x70, float f, float f2, int i, float[] fArr, int i2, boolean z) {
        float fK;
        float f3;
        float f4;
        float f5;
        float fSignum;
        if (z) {
            fArr[i2] = 0.0f;
        }
        if (f2 == 1.0f) {
            c3140c5.a(c4991x70, 0.0f, f, null, 1.0f, i, 1);
            return;
        }
        C3443fb c3443fb = (C3443fb) c4991x70.b.get(c3140c5.e);
        if (c3443fb.A) {
            float f6 = c3140c5.b[0];
            C3619hb c3619hb = c3443fb.f4371a;
            if (f < f6) {
                int iD = DM.D(i);
                if (iD == 0) {
                    c3443fb.g = c3619hb.g;
                    return;
                } else {
                    if (iD != 1) {
                        return;
                    }
                    f3 = c3443fb.g;
                    fK = c3619hb.g;
                }
            } else {
                float f7 = i == 1 ? c3619hb.g : c3443fb.g;
                fK = c3140c5.k(f) + c3619hb.g;
                f3 = f7;
            }
            float f8 = fK - f3;
            float fCeil = f8 - (((float) Math.ceil((f8 / 360.0f) - 0.5f)) * 360.0f);
            if (fCeil == 0.0f) {
                fSignum = fArr[i2];
            } else {
                if (z) {
                    f5 = fCeil;
                    f4 = 0.0f;
                } else {
                    f4 = fArr[i2];
                    f5 = fArr[i2 + 1];
                }
                float f9 = f4 - (f4 % 360.0f);
                float fSignum2 = fCeil + f9;
                boolean z2 = fCeil >= 0.0f;
                boolean z3 = f4 >= 0.0f;
                if (Math.abs(f5) <= 90.0f && Math.signum(f5) != Math.signum(fCeil)) {
                    if (Math.abs(f4 - f9) > 180.0f) {
                        fSignum2 += Math.signum(f4) * 360.0f;
                    } else if (f9 != 0.0f) {
                        fSignum2 -= Math.signum(f4) * 360.0f;
                    }
                    z3 = z2;
                }
                fSignum = z3 != z2 ? (Math.signum(f4) * 360.0f) + fSignum2 : fSignum2;
                fArr[i2] = fSignum;
            }
            fArr[i2 + 1] = fCeil;
            c3443fb.g = (fSignum * f2) + f3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    public final void a(int i, String str, boolean z, float f) {
        C4019m5 c4019m5 = this.f4583a;
        if (c4019m5.f4679a.a(str) == null) {
            return;
        }
        C3493g5 c3493g5A = c4019m5.f4679a.a(str);
        if (i < 0) {
            throw new IllegalArgumentException("trackIndex must be >= 0.");
        }
        if (c3493g5A == null) {
            throw new IllegalArgumentException("animation cannot be null.");
        }
        C3755j5 c3755j5K = k(i);
        if (c3755j5K != null) {
            while (true) {
                C3755j5 c3755j5 = c3755j5K.b;
                if (c3755j5 == null) {
                    break;
                } else {
                    c3755j5K = c3755j5;
                }
            }
        }
        C3755j5 c3755j5R = r(i, c3493g5A, z, c3755j5K);
        if (c3755j5K == null) {
            p(i, c3755j5R, true);
            this.e.d();
        } else if (c3755j5R != null) {
            c3755j5K.b = c3755j5R;
            if (f <= 0.0f) {
                float f2 = c3755j5K.g - 0.0f;
                if (f2 == 0.0f) {
                    f2 = c3755j5K.k;
                } else if (c3755j5K.f) {
                    f2 *= ((int) (c3755j5K.k / f2)) + 1;
                } else if (c3755j5K.k >= f2) {
                    f2 = c3755j5K.k;
                }
                f += f2 - c3755j5R.r;
            }
        }
        if (c3755j5R != null) {
            c3755j5R.j = f;
        }
    }

    public final void b(InterfaceC3581h5 interfaceC3581h5) {
        if (interfaceC3581h5 == null) {
            throw new IllegalArgumentException("listener cannot be null.");
        }
        this.d.add(interfaceC3581h5);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0222  */
    /* JADX WARN: Code duplicated, block: B:102:0x0225  */
    /* JADX WARN: Code duplicated, block: B:104:0x0229  */
    /* JADX WARN: Code duplicated, block: B:107:0x0231  */
    /* JADX WARN: Code duplicated, block: B:109:0x023a  */
    /* JADX WARN: Code duplicated, block: B:110:0x023d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0242  */
    /* JADX WARN: Code duplicated, block: B:114:0x025c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0260  */
    /* JADX WARN: Code duplicated, block: B:117:0x027a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0163  */
    /* JADX WARN: Code duplicated, block: B:81:0x0166  */
    public final void c(C4991x70 c4991x70) {
        int i;
        int i2;
        Object[] objArr;
        Array array;
        float f;
        boolean z;
        float f2;
        float fA;
        int i3;
        Object[] objArr2;
        float f3;
        int i4;
        C3755j5 c3755j5;
        int[] iArr;
        FloatArray floatArray;
        int i5;
        boolean z2;
        float[] fArr;
        int i6;
        C3755j5 c3755j6;
        float f4;
        AbstractC3405f5 abstractC3405f5;
        int i7;
        float f5;
        C3755j5 c3755j7;
        float f6;
        float f7;
        int i8;
        ObjectSet objectSet;
        int i9;
        Object[] objArr3;
        int i10;
        ObjectSet objectSet2;
        int i11;
        Object[] objArr4;
        C4991x70 c4991x71 = c4991x70;
        if (c4991x71 == null) {
            throw new IllegalArgumentException("skeleton cannot be null.");
        }
        boolean z3 = this.g;
        Array array2 = this.b;
        int i12 = 4;
        if (z3) {
            this.g = false;
            ObjectSet objectSet3 = this.f;
            objectSet3.clear(2048);
            int i13 = array2.size;
            Object[] objArr5 = array2.items;
            int i14 = 0;
            while (i14 < i13) {
                C3755j5 c3755j8 = (C3755j5) objArr5[i14];
                if (c3755j8 == null) {
                    objectSet2 = objectSet3;
                    i11 = i13;
                    objArr4 = objArr5;
                } else {
                    while (true) {
                        C3755j5 c3755j9 = c3755j8.c;
                        if (c3755j9 == null) {
                            break;
                        } else {
                            c3755j8 = c3755j9;
                        }
                    }
                    while (true) {
                        C3755j5 c3755j10 = c3755j8.d;
                        if (c3755j10 == null || c3755j8.x != i12) {
                            Array array3 = c3755j8.f4535a.b;
                            Object[] objArr6 = array3.items;
                            int i15 = array3.size;
                            int[] size = c3755j8.u.setSize(i15);
                            Array array4 = c3755j8.v;
                            array4.clear();
                            Object[] size2 = array4.setSize(i15);
                            int i16 = 0;
                            while (i16 < i15) {
                                AbstractC3405f5 abstractC3405f6 = (AbstractC3405f5) objArr6[i16];
                                String[] strArr = abstractC3405f6.f4350a;
                                if (objectSet3.addAll(strArr)) {
                                    objectSet = objectSet3;
                                    if (c3755j10 == null || (abstractC3405f6 instanceof R4) || (abstractC3405f6 instanceof V4) || (abstractC3405f6 instanceof W4)) {
                                        i9 = i13;
                                    } else {
                                        C3493g5 c3493g5 = c3755j10.f4535a;
                                        c3493g5.getClass();
                                        int length = strArr.length;
                                        i9 = i13;
                                        int i17 = 0;
                                        while (true) {
                                            if (i17 < length) {
                                                objArr3 = objArr5;
                                                i10 = i15;
                                                if (c3493g5.c.contains(strArr[i17])) {
                                                    C3755j5 c3755j11 = c3755j10.d;
                                                    while (true) {
                                                        if (c3755j11 != null) {
                                                            C3493g5 c3493g6 = c3755j11.f4535a;
                                                            c3493g6.getClass();
                                                            int length2 = strArr.length;
                                                            int i18 = 0;
                                                            while (true) {
                                                                if (i18 < length2) {
                                                                    int i19 = length2;
                                                                    if (c3493g6.c.contains(strArr[i18])) {
                                                                        c3755j11 = c3755j11.d;
                                                                    } else {
                                                                        i18++;
                                                                        length2 = i19;
                                                                    }
                                                                } else if (c3755j11.r > 0.0f) {
                                                                    size[i16] = 4;
                                                                    size2[i16] = c3755j11;
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        size[i16] = 3;
                                                        break;
                                                    }
                                                } else {
                                                    i17++;
                                                    objArr5 = objArr3;
                                                    i15 = i10;
                                                }
                                            }
                                        }
                                    }
                                    objArr3 = objArr5;
                                    i10 = i15;
                                    size[i16] = 1;
                                } else {
                                    size[i16] = 0;
                                    objectSet = objectSet3;
                                    i9 = i13;
                                    objArr3 = objArr5;
                                    i10 = i15;
                                }
                                i16++;
                                objectSet3 = objectSet;
                                i13 = i9;
                                objArr5 = objArr3;
                                i15 = i10;
                            }
                        }
                        objectSet2 = objectSet3;
                        i11 = i13;
                        objArr4 = objArr5;
                        c3755j8 = c3755j8.d;
                        if (c3755j8 == null) {
                            break;
                        }
                        objectSet3 = objectSet2;
                        i13 = i11;
                        objArr5 = objArr4;
                        i12 = 4;
                    }
                }
                i14++;
                objectSet3 = objectSet2;
                i13 = i11;
                objArr5 = objArr4;
                i12 = 4;
            }
        }
        Array array5 = this.c;
        Object[] objArr7 = array2.items;
        int i20 = array2.size;
        int i21 = 0;
        while (i21 < i20) {
            C3755j5 c3755j12 = (C3755j5) objArr7[i21];
            if (c3755j12 == null || c3755j12.j > 0.0f) {
                i = i21;
                i2 = i20;
                objArr = objArr7;
                array = array5;
            } else {
                int i22 = i21 == 0 ? 2 : c3755j12.x;
                float fE = c3755j12.p;
                if (c3755j12.c != null) {
                    fE *= e(c3755j12, c4991x71, i22);
                } else {
                    if (c3755j12.k >= c3755j12.n && c3755j12.b == null) {
                        f = 0.0f;
                    }
                    if (f >= 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    f2 = c3755j12.h;
                    fA = c3755j12.a();
                    Array array6 = c3755j12.f4535a.b;
                    i3 = array6.size;
                    objArr2 = array6.items;
                    if ((i21 == 0 || f != 1.0f) && i22 != 4) {
                        f3 = fA;
                        i4 = i22;
                        c3755j5 = c3755j12;
                        i = i21;
                        i2 = i20;
                        objArr = objArr7;
                        array = array5;
                        iArr = c3755j5.u.items;
                        floatArray = c3755j5.w;
                        i5 = i3 << 1;
                        if (floatArray.size != i5) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            floatArray.setSize(i5);
                        }
                        fArr = floatArray.items;
                        i6 = 0;
                        while (i6 < i3) {
                            abstractC3405f5 = (AbstractC3405f5) objArr2[i6];
                            if (iArr[i6] == 0) {
                                i7 = i4;
                            } else {
                                i7 = 1;
                            }
                            if (abstractC3405f5 instanceof C3140c5) {
                                f((C3140c5) abstractC3405f5, c4991x70, f3, f, i7, fArr, i6 << 1, z2);
                                c3755j7 = c3755j5;
                                f5 = f3;
                            } else if (abstractC3405f5 instanceof R4) {
                                d((R4) abstractC3405f5, c4991x70, f3, i4, z);
                                f5 = f3;
                                c3755j7 = c3755j5;
                            } else {
                                float f8 = f3;
                                f5 = f8;
                                c3755j7 = c3755j5;
                                abstractC3405f5.a(c4991x70, f2, f8, array, f, i7, 1);
                            }
                            f3 = f5;
                            c3755j5 = c3755j7;
                            i6++;
                            fArr = fArr;
                            iArr = iArr;
                        }
                        c3755j6 = c3755j5;
                        f4 = f3;
                    } else {
                        if (i21 == 0) {
                            z = true;
                        }
                        int i23 = 0;
                        while (i23 < i3) {
                            Object obj = objArr2[i23];
                            if (obj instanceof R4) {
                                d((R4) obj, c4991x70, fA, i22, z);
                                f6 = fA;
                                f7 = f2;
                                i8 = i22;
                            } else {
                                f6 = fA;
                                f7 = f2;
                                i8 = i22;
                                ((AbstractC3405f5) obj).a(c4991x70, f7, f6, array5, f, i8, 1);
                            }
                            i23++;
                            c3755j12 = c3755j12;
                            fA = f6;
                            i3 = i3;
                            objArr2 = objArr2;
                            f2 = f7;
                            i22 = i8;
                            i21 = i21;
                            i20 = i20;
                            objArr7 = objArr7;
                            array5 = array5;
                        }
                        i = i21;
                        i2 = i20;
                        objArr = objArr7;
                        array = array5;
                        f4 = fA;
                        c3755j6 = c3755j12;
                    }
                    m(c3755j6, f4);
                    array.clear();
                    c3755j6.i = f4;
                    c3755j6.m = c3755j6.k;
                }
                f = fE;
                if (f >= 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                f2 = c3755j12.h;
                fA = c3755j12.a();
                Array array7 = c3755j12.f4535a.b;
                i3 = array7.size;
                objArr2 = array7.items;
                if (i21 == 0) {
                    f3 = fA;
                    i4 = i22;
                    c3755j5 = c3755j12;
                    i = i21;
                    i2 = i20;
                    objArr = objArr7;
                    array = array5;
                    iArr = c3755j5.u.items;
                    floatArray = c3755j5.w;
                    i5 = i3 << 1;
                    if (floatArray.size != i5) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        floatArray.setSize(i5);
                    }
                    fArr = floatArray.items;
                    i6 = 0;
                    while (i6 < i3) {
                        abstractC3405f5 = (AbstractC3405f5) objArr2[i6];
                        if (iArr[i6] == 0) {
                            i7 = i4;
                        } else {
                            i7 = 1;
                        }
                        if (abstractC3405f5 instanceof C3140c5) {
                            f((C3140c5) abstractC3405f5, c4991x70, f3, f, i7, fArr, i6 << 1, z2);
                            c3755j7 = c3755j5;
                            f5 = f3;
                        } else if (abstractC3405f5 instanceof R4) {
                            d((R4) abstractC3405f5, c4991x70, f3, i4, z);
                            f5 = f3;
                            c3755j7 = c3755j5;
                        } else {
                            float f9 = f3;
                            f5 = f9;
                            c3755j7 = c3755j5;
                            abstractC3405f5.a(c4991x70, f2, f9, array, f, i7, 1);
                        }
                        f3 = f5;
                        c3755j5 = c3755j7;
                        i6++;
                        fArr = fArr;
                        iArr = iArr;
                    }
                    c3755j6 = c3755j5;
                    f4 = f3;
                } else {
                    f3 = fA;
                    i4 = i22;
                    c3755j5 = c3755j12;
                    i = i21;
                    i2 = i20;
                    objArr = objArr7;
                    array = array5;
                    iArr = c3755j5.u.items;
                    floatArray = c3755j5.w;
                    i5 = i3 << 1;
                    if (floatArray.size != i5) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        floatArray.setSize(i5);
                    }
                    fArr = floatArray.items;
                    i6 = 0;
                    while (i6 < i3) {
                        abstractC3405f5 = (AbstractC3405f5) objArr2[i6];
                        if (iArr[i6] == 0) {
                            i7 = i4;
                        } else {
                            i7 = 1;
                        }
                        if (abstractC3405f5 instanceof C3140c5) {
                            f((C3140c5) abstractC3405f5, c4991x70, f3, f, i7, fArr, i6 << 1, z2);
                            c3755j7 = c3755j5;
                            f5 = f3;
                        } else if (abstractC3405f5 instanceof R4) {
                            d((R4) abstractC3405f5, c4991x70, f3, i4, z);
                            f5 = f3;
                            c3755j7 = c3755j5;
                        } else {
                            float f10 = f3;
                            f5 = f10;
                            c3755j7 = c3755j5;
                            abstractC3405f5.a(c4991x70, f2, f10, array, f, i7, 1);
                        }
                        f3 = f5;
                        c3755j5 = c3755j7;
                        i6++;
                        fArr = fArr;
                        iArr = iArr;
                    }
                    c3755j6 = c3755j5;
                    f4 = f3;
                }
                m(c3755j6, f4);
                array.clear();
                c3755j6.i = f4;
                c3755j6.m = c3755j6.k;
            }
            i21 = i + 1;
            c4991x71 = c4991x70;
            i20 = i2;
            objArr7 = objArr;
            array5 = array;
        }
        int i24 = this.i + 1;
        Array array8 = c4991x70.c;
        Object[] objArr8 = array8.items;
        int i25 = array8.size;
        for (int i26 = 0; i26 < i25; i26++) {
            N70 n70 = (N70) objArr8[i26];
            if (n70.h == i24) {
                O70 o70 = n70.f3442a;
                String str = o70.f;
                n70.a(str == null ? null : c4991x70.c(o70.f3494a, str));
            }
        }
        this.i += 2;
        this.e.d();
    }

    public final void d(R4 r4, C4991x70 c4991x70, float f, int i, boolean z) {
        N70 n70 = (N70) c4991x70.c.get(r4.c);
        if (n70.b.A) {
            float[] fArr = r4.b;
            float f2 = fArr[0];
            O70 o70 = n70.f3442a;
            if (f >= f2) {
                String str = r4.d[AbstractC3405f5.e(fArr, f)];
                n70.a(str != null ? c4991x70.c(o70.f3494a, str) : null);
                if (z) {
                    n70.h = this.i + 2;
                }
            } else if (i == 1 || i == 2) {
                String str2 = o70.f;
                n70.a(str2 != null ? c4991x70.c(o70.f3494a, str2) : null);
                if (z) {
                    n70.h = this.i + 2;
                }
            }
            int i2 = n70.h;
            int i3 = this.i;
            if (i2 <= i3) {
                n70.h = i3 + 1;
            }
        }
    }

    public final float e(C3755j5 c3755j5, C4991x70 c4991x70, int i) {
        int i2;
        float f;
        Array array;
        float f2;
        int i3;
        float fMax;
        float[] fArr;
        float f3;
        int i4;
        int i5 = i;
        C3755j5 c3755j6 = c3755j5.c;
        if (c3755j6.c != null) {
            e(c3755j6, c4991x70, i5);
        }
        float f4 = c3755j5.r;
        int i6 = 2;
        int i7 = 1;
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            i2 = i5 == 2 ? 1 : i5;
            f = 1.0f;
        } else {
            float f6 = c3755j5.q / f4;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            if (i5 != 2) {
                i5 = c3755j6.x;
            }
            i2 = i5;
            f = f6;
        }
        boolean z = f < 0.0f;
        boolean z2 = f < 0.0f;
        Array array2 = c3755j6.f4535a.b;
        int i8 = array2.size;
        Object[] objArr = array2.items;
        float f7 = c3755j6.p * c3755j5.s;
        float f8 = (1.0f - f) * f7;
        float f9 = c3755j6.h;
        float fA = c3755j6.a();
        Array array3 = this.c;
        Array array4 = f < 0.0f ? array3 : null;
        if (i2 == 4) {
            int i9 = 0;
            while (i9 < i8) {
                ((AbstractC3405f5) objArr[i9]).a(c4991x70, f9, fA, array4, f8, i2, 2);
                i9++;
                i8 = i8;
                array3 = array3;
                f9 = f9;
                objArr = objArr;
            }
            array = array3;
            f2 = fA;
        } else {
            array = array3;
            int i10 = i8;
            float f10 = fA;
            int[] iArr = c3755j6.u.items;
            Object[] objArr2 = c3755j6.v.items;
            FloatArray floatArray = c3755j6.w;
            int i11 = i10 << 1;
            boolean z3 = floatArray.size != i11;
            if (z3) {
                floatArray.setSize(i11);
            }
            float[] fArr2 = floatArray.items;
            c3755j6.t = 0.0f;
            int i12 = 0;
            while (i12 < i10) {
                AbstractC3405f5 abstractC3405f5 = (AbstractC3405f5) objArr[i12];
                int i13 = iArr[i12];
                if (i13 != 0) {
                    if (i13 == i7) {
                        fMax = f8;
                    } else if (i13 == i6) {
                        i3 = i2;
                        fMax = f7;
                    } else if (i13 != 3) {
                        C3755j5 c3755j7 = (C3755j5) objArr2[i12];
                        fMax = Math.max(f5, 1.0f - (c3755j7.q / c3755j7.r)) * f7;
                    } else {
                        fMax = f7;
                    }
                    i3 = 1;
                } else {
                    if (z2 || !(abstractC3405f5 instanceof V4)) {
                        i3 = i2;
                        fMax = f8;
                    } else {
                        fArr = fArr2;
                        f3 = f10;
                    }
                    i12++;
                    f10 = f3;
                    fArr2 = fArr;
                    objArr2 = objArr2;
                    iArr = iArr;
                    i10 = i10;
                    i2 = i2;
                    f5 = 0.0f;
                    i7 = 1;
                    i6 = 2;
                }
                c3755j6.t += fMax;
                if (abstractC3405f5 instanceof C3140c5) {
                    fArr = fArr2;
                    f((C3140c5) abstractC3405f5, c4991x70, f10, fMax, i3, fArr, i12 << 1, z3);
                    f3 = f10;
                } else {
                    int i14 = i3;
                    i12 = i12;
                    fArr = fArr2;
                    objArr2 = objArr2;
                    iArr = iArr;
                    if (abstractC3405f5 instanceof R4) {
                        i2 = i2;
                        d((R4) abstractC3405f5, c4991x70, f10, i14, z && fMax >= f5);
                        f3 = f10;
                    } else {
                        i10 = i10;
                        i2 = i2;
                        if (z2 && (abstractC3405f5 instanceof V4)) {
                            i4 = i14;
                            int i15 = i4 == 1 ? 1 : 2;
                            f3 = f10;
                            abstractC3405f5.a(c4991x70, f9, f10, array4, fMax, i4, i15);
                        } else {
                            i4 = i14;
                        }
                        f3 = f10;
                        abstractC3405f5.a(c4991x70, f9, f10, array4, fMax, i4, i15);
                    }
                }
                i12++;
                f10 = f3;
                fArr2 = fArr;
                objArr2 = objArr2;
                iArr = iArr;
                i10 = i10;
                i2 = i2;
                f5 = 0.0f;
                i7 = 1;
                i6 = 2;
            }
            f2 = f10;
        }
        if (c3755j5.r > 0.0f) {
            m(c3755j6, f2);
        }
        array.clear();
        c3755j6.i = f2;
        c3755j6.m = c3755j6.k;
        return f;
    }

    public final void g() {
        this.d.clear();
    }

    public final void h(C3755j5 c3755j5) {
        for (C3755j5 c3755j6 = c3755j5.b; c3755j6 != null; c3755j6 = c3755j6.b) {
            C4288p70 c4288p70 = this.e;
            ((Array) c4288p70.d).add(EnumC3669i5.d);
            ((Array) c4288p70.d).add(c3755j6);
        }
        c3755j5.b = null;
    }

    public final void i(int i) {
        C3755j5 c3755j5;
        if (i < 0) {
            throw new IllegalArgumentException("trackIndex must be >= 0.");
        }
        Array array = this.b;
        if (i >= array.size || (c3755j5 = (C3755j5) array.get(i)) == null) {
            return;
        }
        C4288p70 c4288p70 = this.e;
        c4288p70.e(c3755j5);
        h(c3755j5);
        C3755j5 c3755j6 = c3755j5;
        while (true) {
            C3755j5 c3755j7 = c3755j6.c;
            if (c3755j7 == null) {
                array.set(c3755j5.e, null);
                c4288p70.d();
                return;
            } else {
                c4288p70.e(c3755j7);
                c3755j6.c = null;
                c3755j6.d = null;
                c3755j6 = c3755j7;
            }
        }
    }

    public final void j() {
        C4288p70 c4288p70 = this.e;
        boolean z = c4288p70.c;
        c4288p70.c = true;
        Array array = this.b;
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            i(i2);
        }
        array.clear();
        c4288p70.c = z;
        c4288p70.d();
    }

    public final C3755j5 k(int i) {
        Array array = this.b;
        int i2 = array.size;
        if (i < i2) {
            return (C3755j5) array.get(i);
        }
        array.ensureCapacity((i - i2) + 1);
        array.size = i + 1;
        return null;
    }

    public final C3755j5 l(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("trackIndex must be >= 0.");
        }
        Array array = this.b;
        if (i >= array.size) {
            return null;
        }
        return (C3755j5) array.get(i);
    }

    public final void m(C3755j5 c3755j5, float f) {
        EnumC3669i5 enumC3669i5;
        C4288p70 c4288p70;
        int i;
        float f2 = c3755j5.g;
        float f3 = f2 - 0.0f;
        float f4 = c3755j5.l % f3;
        Array array = this.c;
        Object[] objArr = array.items;
        int i2 = array.size;
        int i3 = 0;
        while (true) {
            enumC3669i5 = EnumC3669i5.f;
            c4288p70 = this.e;
            if (i3 >= i2) {
                break;
            }
            C2683Pr c2683Pr = (C2683Pr) objArr[i3];
            float f5 = c2683Pr.b;
            if (f5 < f4) {
                break;
            }
            if (f5 <= f2) {
                ((Array) c4288p70.d).add(enumC3669i5);
                ((Array) c4288p70.d).add(c3755j5);
                ((Array) c4288p70.d).add(c2683Pr);
            }
            i3++;
        }
        if (!c3755j5.f ? !(f < f2 || c3755j5.h >= f2) : !(f3 != 0.0f && ((i = (int) (c3755j5.k / f3)) <= 0 || i <= ((int) (c3755j5.l / f3))))) {
            ((Array) c4288p70.d).add(EnumC3669i5.e);
            ((Array) c4288p70.d).add(c3755j5);
        }
        while (i3 < i2) {
            C2683Pr c2683Pr2 = (C2683Pr) objArr[i3];
            if (c2683Pr2.b >= 0.0f) {
                ((Array) c4288p70.d).add(enumC3669i5);
                ((Array) c4288p70.d).add(c3755j5);
                ((Array) c4288p70.d).add(c2683Pr2);
            }
            i3++;
        }
    }

    public final C3755j5 n(int i, C3493g5 c3493g5, boolean z) {
        boolean z2;
        if (i < 0) {
            throw new IllegalArgumentException("trackIndex must be >= 0.");
        }
        if (c3493g5 == null) {
            throw new IllegalArgumentException("animation cannot be null.");
        }
        C3755j5 c3755j5K = k(i);
        C4288p70 c4288p70 = this.e;
        if (c3755j5K == null) {
            z2 = true;
        } else if (c3755j5K.m == -1.0f) {
            this.b.set(i, c3755j5K.c);
            ((Array) c4288p70.d).add(EnumC3669i5.b);
            ((Array) c4288p70.d).add(c3755j5K);
            c4288p70.e(c3755j5K);
            h(c3755j5K);
            c3755j5K = c3755j5K.c;
            z2 = false;
        } else {
            h(c3755j5K);
            z2 = true;
        }
        C3755j5 c3755j5R = r(i, c3493g5, z, c3755j5K);
        if (c3755j5R != null) {
            p(i, c3755j5R, z2);
        }
        c4288p70.d();
        return c3755j5R;
    }

    public final C3755j5 o(int i, String str, boolean z) {
        C4019m5 c4019m5 = this.f4583a;
        if (c4019m5.f4679a.a(str) == null) {
            return null;
        }
        return n(i, c4019m5.f4679a.a(str), z);
    }

    public final void p(int i, C3755j5 c3755j5, boolean z) {
        C3755j5 c3755j5K = k(i);
        this.b.set(i, c3755j5);
        c3755j5.getClass();
        C4288p70 c4288p70 = this.e;
        if (c3755j5K != null) {
            if (z) {
                ((Array) c4288p70.d).add(EnumC3669i5.b);
                ((Array) c4288p70.d).add(c3755j5K);
            }
            c3755j5.c = c3755j5K;
            c3755j5K.d = c3755j5;
            c3755j5.q = 0.0f;
            if (c3755j5K.c != null) {
                float f = c3755j5K.r;
                if (f > 0.0f) {
                    c3755j5.s = Math.min(1.0f, c3755j5K.q / f) * c3755j5.s;
                }
            }
            c3755j5K.w.clear();
        }
        ((Array) c4288p70.d).add(EnumC3669i5.f4488a);
        ((Array) c4288p70.d).add(c3755j5);
        ((C3843k5) c4288p70.b).g = true;
    }

    public final void q(float f, int i) {
        try {
            C3755j5 c3755j5N = n(i, k, false);
            if (c3755j5N != null) {
                c3755j5N.r = f;
                c3755j5N.n = f;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final C3755j5 r(int i, C3493g5 c3493g5, boolean z, C3755j5 c3755j5) {
        C3493g5 c3493g6;
        C3755j5 c3755j6 = (C3755j5) this.j.obtain();
        if (c3755j6 == null) {
            return null;
        }
        c3755j6.e = i;
        c3755j6.f4535a = c3493g5;
        c3755j6.f = z;
        c3755j6.g = c3493g5.d;
        c3755j6.h = -1.0f;
        c3755j6.i = -1.0f;
        c3755j6.j = 0.0f;
        c3755j6.k = 0.0f;
        c3755j6.l = -1.0f;
        c3755j6.m = -1.0f;
        c3755j6.n = Float.MAX_VALUE;
        c3755j6.o = 1.0f;
        c3755j6.p = 1.0f;
        c3755j6.q = 0.0f;
        if (c3755j5 == null || (c3493g6 = c3755j5.f4535a) == null) {
            c3755j6.r = 0.0f;
        } else {
            C4019m5 c4019m5 = this.f4583a;
            c4019m5.getClass();
            C3931l5 c3931l5 = c4019m5.c;
            c3931l5.f4630a = c3493g6;
            c3931l5.b = c3493g5;
            c3755j6.r = c4019m5.b.get(c3931l5, 0.0f);
        }
        c3755j6.s = 1.0f;
        c3755j6.t = 0.0f;
        c3755j6.x = 3;
        return c3755j6;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0060 A[LOOP:1: B:23:0x005c->B:25:0x0060, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x008e A[LOOP:2: B:38:0x008c->B:39:0x008e, LOOP_END] */
    public final void s(float f) {
        C3755j5 c3755j5;
        C3755j5 c3755j6;
        float f2;
        C3755j5 c3755j7;
        float f3 = f * this.h;
        Array array = this.b;
        Object[] objArr = array.items;
        int i = array.size;
        int i2 = 0;
        while (true) {
            C4288p70 c4288p70 = this.e;
            if (i2 >= i) {
                c4288p70.d();
                return;
            }
            C3755j5 c3755j8 = (C3755j5) objArr[i2];
            if (c3755j8 != null) {
                c3755j8.h = c3755j8.i;
                float f4 = c3755j8.m;
                c3755j8.l = f4;
                float f5 = c3755j8.o;
                float f6 = f3 * f5;
                float f7 = c3755j8.j;
                if (f7 > 0.0f) {
                    float f8 = f7 - f6;
                    c3755j8.j = f8;
                    if (f8 <= 0.0f) {
                        f6 = -f8;
                        c3755j8.j = 0.0f;
                        c3755j5 = c3755j8.b;
                        if (c3755j5 != null) {
                            f2 = f4 - c3755j5.j;
                            if (f2 >= 0.0f) {
                                c3755j5.j = 0.0f;
                                c3755j5.k += f5 != 0.0f ? ((f2 / f5) + f3) * c3755j5.o : 0.0f;
                                c3755j8.k += f6;
                                p(i2, c3755j5, true);
                                while (true) {
                                    c3755j7 = c3755j5.c;
                                    if (c3755j7 != null) {
                                        c3755j5.q += f3;
                                        c3755j5 = c3755j7;
                                    }
                                }
                            } else {
                                if (c3755j8.c != null && t(c3755j8, f3)) {
                                    c3755j6 = c3755j8.c;
                                    c3755j8.c = null;
                                    if (c3755j6 != null) {
                                        c3755j6.d = null;
                                    }
                                    while (c3755j6 != null) {
                                        c4288p70.e(c3755j6);
                                        c3755j6 = c3755j6.c;
                                    }
                                }
                                c3755j8.k += f6;
                            }
                        } else if (f4 >= c3755j8.n || c3755j8.c != null) {
                            if (c3755j8.c != null) {
                                c3755j6 = c3755j8.c;
                                c3755j8.c = null;
                                if (c3755j6 != null) {
                                    c3755j6.d = null;
                                }
                                while (c3755j6 != null) {
                                    c4288p70.e(c3755j6);
                                    c3755j6 = c3755j6.c;
                                }
                            }
                            c3755j8.k += f6;
                        } else {
                            objArr[i2] = null;
                            c4288p70.e(c3755j8);
                            h(c3755j8);
                        }
                    }
                } else {
                    c3755j5 = c3755j8.b;
                    if (c3755j5 != null) {
                        f2 = f4 - c3755j5.j;
                        if (f2 >= 0.0f) {
                            c3755j5.j = 0.0f;
                            c3755j5.k += f5 != 0.0f ? ((f2 / f5) + f3) * c3755j5.o : 0.0f;
                            c3755j8.k += f6;
                            p(i2, c3755j5, true);
                            while (true) {
                                c3755j7 = c3755j5.c;
                                if (c3755j7 != null) {
                                    c3755j5.q += f3;
                                    c3755j5 = c3755j7;
                                }
                            }
                        } else {
                            if (c3755j8.c != null) {
                                c3755j6 = c3755j8.c;
                                c3755j8.c = null;
                                if (c3755j6 != null) {
                                    c3755j6.d = null;
                                }
                                while (c3755j6 != null) {
                                    c4288p70.e(c3755j6);
                                    c3755j6 = c3755j6.c;
                                }
                            }
                            c3755j8.k += f6;
                        }
                    } else if (f4 >= c3755j8.n) {
                        if (c3755j8.c != null) {
                            c3755j6 = c3755j8.c;
                            c3755j8.c = null;
                            if (c3755j6 != null) {
                                c3755j6.d = null;
                            }
                            while (c3755j6 != null) {
                                c4288p70.e(c3755j6);
                                c3755j6 = c3755j6.c;
                            }
                        }
                        c3755j8.k += f6;
                    } else {
                        if (c3755j8.c != null) {
                            c3755j6 = c3755j8.c;
                            c3755j8.c = null;
                            if (c3755j6 != null) {
                                c3755j6.d = null;
                            }
                            while (c3755j6 != null) {
                                c4288p70.e(c3755j6);
                                c3755j6 = c3755j6.c;
                            }
                        }
                        c3755j8.k += f6;
                    }
                }
            }
            i2++;
        }
    }

    public final boolean t(C3755j5 c3755j5, float f) {
        C3755j5 c3755j6;
        C3755j5 c3755j7 = c3755j5;
        C3755j5 c3755j8 = c3755j7;
        do {
            if (c3755j7 == null || (c3755j6 = c3755j7.c) == null) {
                C3755j5 c3755j9 = c3755j5.c;
                if (c3755j9 == null) {
                    return true;
                }
                boolean zT = t(c3755j9, f);
                c3755j9.h = c3755j9.i;
                c3755j9.l = c3755j9.m;
                if (c3755j5.m != -1.0f) {
                    float f2 = c3755j5.q;
                    boolean z = f2 == 0.0f && c3755j9.q == 0.0f;
                    float f3 = c3755j5.r;
                    if (f2 >= f3 || z) {
                        if (c3755j9.t == 0.0f || f3 == 0.0f || z) {
                            c3755j5.c = c3755j9.c;
                            C3755j5 c3755j10 = c3755j9.c;
                            if (c3755j10 != null) {
                                c3755j10.d = c3755j5;
                            }
                            c3755j5.s = c3755j9.s;
                            this.e.e(c3755j9);
                        }
                        return zT;
                    }
                }
                c3755j9.k = (c3755j9.o * f) + c3755j9.k;
                c3755j5.q += f;
                return false;
            }
            c3755j8 = c3755j8.c;
            c3755j7 = c3755j6.c;
        } while (c3755j8 != c3755j7);
        System.err.println("Detected circular mixing in TrackEntry! Breaking recursion.");
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Array array = this.b;
        Object[] objArr = array.items;
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            C3755j5 c3755j5 = (C3755j5) objArr[i2];
            if (c3755j5 != null) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(c3755j5.toString());
            }
        }
        return sb.length() == 0 ? "<none>" : sb.toString();
    }
}
