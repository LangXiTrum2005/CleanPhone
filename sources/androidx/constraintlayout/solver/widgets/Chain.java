package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.ArrayRow;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class Chain {
    /* JADX WARN: Code duplicated, block: B:179:0x0274  */
    /* JADX WARN: Code duplicated, block: B:196:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:198:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:200:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:202:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:224:0x0354  */
    /* JADX WARN: Code duplicated, block: B:226:0x036e  */
    /* JADX WARN: Code duplicated, block: B:228:0x0372  */
    /* JADX WARN: Code duplicated, block: B:232:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:243:0x0402  */
    /* JADX WARN: Code duplicated, block: B:397:0x0690  */
    /* JADX WARN: Code duplicated, block: B:398:0x0693  */
    /* JADX WARN: Code duplicated, block: B:401:0x0699  */
    /* JADX WARN: Code duplicated, block: B:402:0x069c  */
    /* JADX WARN: Code duplicated, block: B:404:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:406:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:409:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:411:0x06b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:420:0x06cf A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:74:0x010f  */
    public static void a(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i2) {
        int i3;
        ChainHead[] chainHeadArr;
        int i4;
        float f;
        boolean z2;
        boolean z3;
        boolean z4;
        ConstraintAnchor[] constraintAnchorArr;
        ConstraintWidget constraintWidget;
        LinearSystem linearSystem2;
        SolverVariable solverVariable;
        ConstraintAnchor constraintAnchor;
        SolverVariable solverVariable2;
        int i5;
        ConstraintAnchor constraintAnchor2;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        ConstraintWidget constraintWidget2;
        int i6;
        ConstraintAnchor[] constraintAnchorArr2;
        int i7;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        SolverVariable solverVariable5;
        ConstraintAnchor constraintAnchor5;
        SolverVariable solverVariable6;
        int size;
        ArrayList arrayList;
        float f2;
        float f3;
        SolverVariable solverVariable7;
        SolverVariable solverVariable8;
        SolverVariable solverVariable9;
        SolverVariable solverVariable10;
        ArrayRow arrayRowK;
        float f4;
        boolean z5;
        ConstraintAnchor constraintAnchor6;
        ConstraintWidget constraintWidget3;
        int i8;
        int i9;
        ConstraintWidget constraintWidget4;
        float f5;
        ConstraintWidgetContainer constraintWidgetContainer2 = constraintWidgetContainer;
        if (i2 == 0) {
            i3 = constraintWidgetContainer2.m0;
            chainHeadArr = constraintWidgetContainer2.p0;
            i4 = 0;
        } else {
            i3 = constraintWidgetContainer2.n0;
            chainHeadArr = constraintWidgetContainer2.o0;
            i4 = 2;
        }
        int i10 = i3;
        ChainHead[] chainHeadArr2 = chainHeadArr;
        int i11 = 0;
        while (i11 < i10) {
            ChainHead chainHead = chainHeadArr2[i11];
            boolean z6 = chainHead.q;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.Z;
            ConstraintWidget constraintWidget5 = chainHead.f3929a;
            int i12 = 8;
            if (z6) {
                f = 0.0f;
            } else {
                int i13 = chainHead.f3935l;
                int i14 = i13 * 2;
                ConstraintWidget constraintWidget6 = constraintWidget5;
                ConstraintWidget constraintWidget7 = constraintWidget6;
                boolean z7 = false;
                f = 0.0f;
                while (!z7) {
                    chainHead.f3934i++;
                    constraintWidget6.f3962d0[i13] = null;
                    constraintWidget6.f3961c0[i13] = null;
                    int i15 = constraintWidget6.X;
                    ConstraintAnchor[] constraintAnchorArr3 = constraintWidget6.G;
                    if (i15 != i12) {
                        constraintWidget6.i(i13);
                        constraintAnchorArr3[i14].c();
                        int i16 = i14 + 1;
                        constraintAnchorArr3[i16].c();
                        constraintAnchorArr3[i14].c();
                        constraintAnchorArr3[i16].c();
                        if (chainHead.f3930b == null) {
                            chainHead.f3930b = constraintWidget6;
                        }
                        chainHead.d = constraintWidget6;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget6.f3949J[i13];
                        if (dimensionBehaviour2 == dimensionBehaviour) {
                            int i17 = constraintWidget6.f3966l[i13];
                            i9 = i13;
                            if (i17 == 0 || i17 == 3 || i17 == 2) {
                                chainHead.j++;
                                float f6 = constraintWidget6.f3959b0[i9];
                                if (f6 > 0.0f) {
                                    f5 = f6;
                                    chainHead.k += f5;
                                } else {
                                    f5 = f6;
                                }
                                if (constraintWidget6.X != 8 && dimensionBehaviour2 == dimensionBehaviour && (i17 == 0 || i17 == 3)) {
                                    if (f5 < 0.0f) {
                                        chainHead.f3936n = true;
                                    } else {
                                        chainHead.o = true;
                                    }
                                    if (chainHead.f3933h == null) {
                                        chainHead.f3933h = new ArrayList();
                                    }
                                    chainHead.f3933h.add(constraintWidget6);
                                }
                                if (chainHead.f == null) {
                                    chainHead.f = constraintWidget6;
                                }
                                ConstraintWidget constraintWidget8 = chainHead.g;
                                if (constraintWidget8 != null) {
                                    constraintWidget8.f3961c0[i9] = constraintWidget6;
                                }
                                chainHead.g = constraintWidget6;
                            }
                            if (i9 == 0) {
                                if (constraintWidget6.j == 0 && constraintWidget6.m == 0) {
                                    int i18 = constraintWidget6.f3967n;
                                }
                            } else if (constraintWidget6.k == 0 && constraintWidget6.f3968p == 0) {
                                int i19 = constraintWidget6.q;
                            }
                        } else {
                            i9 = i13;
                            i14 = i14;
                        }
                    } else {
                        i9 = i13;
                        i14 = i14;
                    }
                    if (constraintWidget7 != constraintWidget6) {
                        constraintWidget7.f3962d0[i9] = constraintWidget6;
                    }
                    ConstraintAnchor constraintAnchor7 = constraintAnchorArr3[i14 + 1].d;
                    if (constraintAnchor7 != null) {
                        constraintWidget4 = constraintAnchor7.f3939b;
                        ConstraintAnchor constraintAnchor8 = constraintWidget4.G[i14].d;
                        if (constraintAnchor8 == null || constraintAnchor8.f3939b != constraintWidget6) {
                            constraintWidget4 = null;
                        }
                    } else {
                        constraintWidget4 = null;
                    }
                    if (constraintWidget4 == null) {
                        constraintWidget4 = constraintWidget6;
                        z7 = true;
                    }
                    constraintWidget7 = constraintWidget6;
                    i14 = i14;
                    i12 = 8;
                    constraintWidget6 = constraintWidget4;
                    i13 = i9;
                }
                int i20 = i13;
                int i21 = i14;
                ConstraintWidget constraintWidget9 = chainHead.f3930b;
                if (constraintWidget9 != null) {
                    constraintWidget9.G[i21].c();
                }
                ConstraintWidget constraintWidget10 = chainHead.d;
                if (constraintWidget10 != null) {
                    constraintWidget10.G[i21 + 1].c();
                }
                chainHead.f3931c = constraintWidget6;
                if (i20 == 0 && chainHead.m) {
                    chainHead.f3932e = constraintWidget6;
                } else {
                    chainHead.f3932e = constraintWidget5;
                }
                chainHead.f3937p = chainHead.o && chainHead.f3936n;
            }
            chainHead.q = true;
            ConstraintWidget constraintWidget11 = chainHead.f3931c;
            ConstraintWidget constraintWidget12 = chainHead.f3930b;
            ConstraintWidget constraintWidget13 = chainHead.d;
            ConstraintWidget constraintWidget14 = chainHead.f3932e;
            float f7 = chainHead.k;
            boolean z8 = constraintWidgetContainer2.f3949J[i2] == ConstraintWidget.DimensionBehaviour.f3974Y;
            if (i2 == 0) {
                int i22 = constraintWidget14.Z;
                boolean z9 = i22 == 0;
                z3 = i22 == 1;
                z4 = i22 == 2;
                z2 = z9;
            } else {
                int i23 = constraintWidget14.a0;
                z2 = i23 == 0;
                z3 = i23 == 1;
                z4 = i23 == 2;
            }
            boolean z10 = z3;
            boolean z11 = false;
            while (true) {
                constraintAnchorArr = constraintWidgetContainer2.G;
                if (z11) {
                    break;
                }
                ConstraintAnchor constraintAnchor9 = constraintWidget5.G[i4];
                int i24 = z4 ? 1 : 4;
                int iC = constraintAnchor9.c();
                boolean z12 = z4;
                boolean z13 = constraintWidget5.f3949J[i2] == dimensionBehaviour && constraintWidget5.f3966l[i2] == 0;
                ConstraintAnchor constraintAnchor10 = constraintAnchor9.d;
                if (constraintAnchor10 != null && constraintWidget5 != constraintWidget5) {
                    iC = constraintAnchor10.c() + iC;
                }
                int i25 = iC;
                if (z12 && constraintWidget5 != constraintWidget5 && constraintWidget5 != constraintWidget12) {
                    i24 = 5;
                }
                int i26 = i10;
                ConstraintAnchor constraintAnchor11 = constraintAnchor9.d;
                if (constraintAnchor11 != null) {
                    if (constraintWidget5 == constraintWidget12) {
                        linearSystem.f(constraintAnchor9.g, constraintAnchor11.g, i25, 6);
                    } else {
                        linearSystem.f(constraintAnchor9.g, constraintAnchor11.g, i25, 8);
                    }
                    linearSystem.e(constraintAnchor9.g, constraintAnchor9.d.g, i25, (!z13 || z12) ? i24 : 5);
                } else {
                    chainHeadArr2 = chainHeadArr2;
                    i4 = i4;
                }
                ConstraintAnchor[] constraintAnchorArr4 = constraintWidget5.G;
                if (z8) {
                    if (constraintWidget5.X == 8 || constraintWidget5.f3949J[i2] != dimensionBehaviour) {
                        i8 = 0;
                    } else {
                        i8 = 0;
                        linearSystem.f(constraintAnchorArr4[i4 + 1].g, constraintAnchorArr4[i4].g, 0, 5);
                    }
                    linearSystem.f(constraintAnchorArr4[i4].g, constraintAnchorArr[i4].g, i8, 8);
                }
                ConstraintAnchor constraintAnchor12 = constraintAnchorArr4[i4 + 1].d;
                if (constraintAnchor12 != null) {
                    constraintWidget3 = constraintAnchor12.f3939b;
                    ConstraintAnchor constraintAnchor13 = constraintWidget3.G[i4].d;
                    if (constraintAnchor13 == null || constraintAnchor13.f3939b != constraintWidget5) {
                        constraintWidget3 = null;
                    }
                } else {
                    constraintWidget3 = null;
                }
                if (constraintWidget3 != null) {
                    constraintWidget5 = constraintWidget3;
                } else {
                    z11 = true;
                }
                i10 = i26;
                z4 = z12;
                chainHeadArr2 = chainHeadArr2;
                i4 = i4;
            }
            boolean z14 = z4;
            int i27 = i10;
            ChainHead[] chainHeadArr3 = chainHeadArr2;
            int i28 = i4;
            if (constraintWidget13 != null) {
                int i29 = i28 + 1;
                if (constraintWidget11.G[i29].d != null) {
                    ConstraintAnchor constraintAnchor14 = constraintWidget13.G[i29];
                    if (constraintWidget13.f3949J[i2] == dimensionBehaviour && constraintWidget13.f3966l[i2] == 0 && !z14) {
                        ConstraintAnchor constraintAnchor15 = constraintAnchor14.d;
                        if (constraintAnchor15.f3939b == constraintWidgetContainer2) {
                            linearSystem.e(constraintAnchor14.g, constraintAnchor15.g, -constraintAnchor14.c(), 5);
                        } else if (z14) {
                            constraintAnchor6 = constraintAnchor14.d;
                            if (constraintAnchor6.f3939b == constraintWidgetContainer2) {
                                linearSystem.e(constraintAnchor14.g, constraintAnchor6.g, -constraintAnchor14.c(), 4);
                            }
                        }
                    } else if (z14) {
                        constraintAnchor6 = constraintAnchor14.d;
                        if (constraintAnchor6.f3939b == constraintWidgetContainer2) {
                            linearSystem.e(constraintAnchor14.g, constraintAnchor6.g, -constraintAnchor14.c(), 4);
                        }
                    }
                    linearSystem.g(constraintAnchor14.g, constraintWidget11.G[i29].d.g, -constraintAnchor14.c(), 6);
                }
            }
            if (z8 != 0) {
                int i30 = i28 + 1;
                SolverVariable solverVariable11 = constraintAnchorArr[i30].g;
                ConstraintAnchor constraintAnchor16 = constraintWidget11.G[i30];
                linearSystem.f(solverVariable11, constraintAnchor16.g, constraintAnchor16.c(), 8);
            }
            ArrayList arrayList2 = chainHead.f3933h;
            if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                if (chainHead.f3936n && !chainHead.f3937p) {
                    f7 = chainHead.j;
                }
                ConstraintWidget constraintWidget15 = null;
                float f8 = f;
                int i31 = 0;
                while (i31 < size) {
                    ConstraintWidget constraintWidget16 = (ConstraintWidget) arrayList2.get(i31);
                    float f9 = constraintWidget16.f3959b0[i2];
                    ConstraintAnchor[] constraintAnchorArr5 = constraintWidget16.G;
                    if (f9 >= f) {
                        arrayList = arrayList2;
                        if (f9 == f) {
                            z5 = false;
                            linearSystem.e(constraintAnchorArr5[i28 + 1].g, constraintAnchorArr5[i28].g, 0, 8);
                            size = size;
                            f3 = f;
                            i31 = i31;
                        } else {
                            if (constraintWidget15 != null) {
                                ConstraintAnchor[] constraintAnchorArr6 = constraintWidget15.G;
                                solverVariable7 = constraintAnchorArr6[i28].g;
                                int i32 = i28 + 1;
                                solverVariable8 = constraintAnchorArr6[i32].g;
                                solverVariable9 = constraintAnchorArr5[i28].g;
                                solverVariable10 = constraintAnchorArr5[i32].g;
                                arrayRowK = linearSystem.k();
                                f2 = f9;
                                f4 = f;
                                arrayRowK.f3884b = f4;
                                f3 = f4;
                                if (f7 != f4 || f8 == f2) {
                                    arrayRowK.d.f(solverVariable7, 1.0f);
                                    arrayRowK.d.f(solverVariable8, -1.0f);
                                    arrayRowK.d.f(solverVariable10, 1.0f);
                                    arrayRowK.d.f(solverVariable9, -1.0f);
                                } else if (f8 == f3) {
                                    arrayRowK.d.f(solverVariable7, 1.0f);
                                    arrayRowK.d.f(solverVariable8, -1.0f);
                                } else if (f9 == f) {
                                    arrayRowK.d.f(solverVariable9, 1.0f);
                                    arrayRowK.d.f(solverVariable10, -1.0f);
                                } else {
                                    float f10 = (f8 / f7) / (f2 / f7);
                                    arrayRowK.d.f(solverVariable7, 1.0f);
                                    arrayRowK.d.f(solverVariable8, -1.0f);
                                    arrayRowK.d.f(solverVariable10, f10);
                                    arrayRowK.d.f(solverVariable9, -f10);
                                }
                                linearSystem.c(arrayRowK);
                            } else {
                                f2 = f9;
                                f3 = f;
                                i31 = i31;
                            }
                            constraintWidget15 = constraintWidget16;
                            f8 = f2;
                        }
                    } else {
                        if (chainHead.f3937p) {
                            arrayList = arrayList2;
                            z5 = false;
                            linearSystem.e(constraintAnchorArr5[i28 + 1].g, constraintAnchorArr5[i28].g, 0, 4);
                        } else {
                            f9 = 1.0f;
                            arrayList = arrayList2;
                            if (f9 == f) {
                                z5 = false;
                                linearSystem.e(constraintAnchorArr5[i28 + 1].g, constraintAnchorArr5[i28].g, 0, 8);
                            } else {
                                if (constraintWidget15 != null) {
                                    ConstraintAnchor[] constraintAnchorArr7 = constraintWidget15.G;
                                    solverVariable7 = constraintAnchorArr7[i28].g;
                                    int i33 = i28 + 1;
                                    solverVariable8 = constraintAnchorArr7[i33].g;
                                    solverVariable9 = constraintAnchorArr5[i28].g;
                                    solverVariable10 = constraintAnchorArr5[i33].g;
                                    arrayRowK = linearSystem.k();
                                    f2 = f9;
                                    f4 = f;
                                    arrayRowK.f3884b = f4;
                                    f3 = f4;
                                    if (f7 != f4) {
                                        arrayRowK.d.f(solverVariable7, 1.0f);
                                        arrayRowK.d.f(solverVariable8, -1.0f);
                                        arrayRowK.d.f(solverVariable10, 1.0f);
                                        arrayRowK.d.f(solverVariable9, -1.0f);
                                    } else {
                                        arrayRowK.d.f(solverVariable7, 1.0f);
                                        arrayRowK.d.f(solverVariable8, -1.0f);
                                        arrayRowK.d.f(solverVariable10, 1.0f);
                                        arrayRowK.d.f(solverVariable9, -1.0f);
                                    }
                                    linearSystem.c(arrayRowK);
                                } else {
                                    f2 = f9;
                                    f3 = f;
                                    i31 = i31;
                                }
                                constraintWidget15 = constraintWidget16;
                                f8 = f2;
                            }
                        }
                        size = size;
                        f3 = f;
                        i31 = i31;
                    }
                    i31++;
                    arrayList2 = arrayList;
                    size = size;
                    f = f3;
                }
            }
            if (constraintWidget12 == null || !(constraintWidget12 == constraintWidget13 || z14)) {
                constraintWidget = constraintWidget13;
                if (!z2 || constraintWidget12 == null) {
                    if (z10 && constraintWidget12 != null) {
                        int i34 = chainHead.j;
                        boolean z15 = i34 > 0 && chainHead.f3934i == i34;
                        ConstraintWidget constraintWidget17 = constraintWidget12;
                        ConstraintWidget constraintWidget18 = constraintWidget17;
                        while (constraintWidget17 != null) {
                            ConstraintWidget constraintWidget19 = constraintWidget17.f3962d0[i2];
                            while (constraintWidget19 != null && constraintWidget19.X == 8) {
                                constraintWidget19 = constraintWidget19.f3962d0[i2];
                            }
                            if (constraintWidget17 != constraintWidget12 && constraintWidget17 != constraintWidget && constraintWidget19 != null) {
                                if (constraintWidget19 == constraintWidget) {
                                    constraintWidget19 = null;
                                }
                                ConstraintAnchor[] constraintAnchorArr8 = constraintWidget17.G;
                                ConstraintAnchor constraintAnchor17 = constraintAnchorArr8[i28];
                                SolverVariable solverVariable12 = constraintAnchor17.g;
                                int i35 = i28 + 1;
                                SolverVariable solverVariable13 = constraintWidget18.G[i35].g;
                                int iC2 = constraintAnchor17.c();
                                int iC3 = constraintAnchorArr8[i35].c();
                                if (constraintWidget19 != null) {
                                    constraintAnchor = constraintWidget19.G[i28];
                                    solverVariable2 = constraintAnchor.g;
                                    ConstraintAnchor constraintAnchor18 = constraintAnchor.d;
                                    solverVariable = constraintAnchor18 != null ? constraintAnchor18.g : null;
                                } else {
                                    ConstraintAnchor constraintAnchor19 = constraintWidget.G[i28];
                                    SolverVariable solverVariable14 = constraintAnchor19 != null ? constraintAnchor19.g : null;
                                    solverVariable = constraintAnchorArr8[i35].g;
                                    constraintAnchor = constraintAnchor19;
                                    solverVariable2 = solverVariable14;
                                }
                                if (constraintAnchor != null) {
                                    iC3 += constraintAnchor.c();
                                }
                                int iC4 = constraintWidget18.G[i35].c() + iC2;
                                SolverVariable solverVariable15 = solverVariable2;
                                int i36 = iC3;
                                SolverVariable solverVariable16 = solverVariable;
                                int i37 = z15 ? 8 : 4;
                                if (solverVariable12 != null && solverVariable13 != null && solverVariable15 != null && solverVariable16 != null) {
                                    linearSystem.b(solverVariable12, solverVariable13, iC4, 0.5f, solverVariable15, solverVariable16, i36, i37);
                                }
                                constraintWidget19 = constraintWidget19;
                            }
                            if (constraintWidget17.X != 8) {
                                constraintWidget18 = constraintWidget17;
                            }
                            constraintWidget17 = constraintWidget19;
                        }
                        ConstraintAnchor constraintAnchor20 = constraintWidget12.G[i28];
                        ConstraintAnchor constraintAnchor21 = constraintWidget5.G[i28].d;
                        int i38 = i28 + 1;
                        ConstraintAnchor constraintAnchor22 = constraintWidget.G[i38];
                        ConstraintAnchor constraintAnchor23 = constraintWidget11.G[i38].d;
                        if (constraintAnchor21 == null) {
                            linearSystem2 = linearSystem;
                        } else {
                            if (constraintWidget12 != constraintWidget) {
                                linearSystem.e(constraintAnchor20.g, constraintAnchor21.g, constraintAnchor20.c(), 5);
                            } else if (constraintAnchor23 != null) {
                                linearSystem2 = linearSystem;
                                linearSystem2.b(constraintAnchor20.g, constraintAnchor21.g, constraintAnchor20.c(), 0.5f, constraintAnchor22.g, constraintAnchor23.g, constraintAnchor22.c(), 5);
                            }
                            linearSystem2 = linearSystem;
                        }
                        if (constraintAnchor23 != null && constraintWidget12 != constraintWidget) {
                            linearSystem2.e(constraintAnchor22.g, constraintAnchor23.g, -constraintAnchor22.c(), 5);
                        }
                    }
                    if ((z2 || z10) && constraintWidget12 != null && constraintWidget12 != constraintWidget) {
                        constraintAnchorArr2 = constraintWidget12.G;
                        ConstraintAnchor constraintAnchor24 = constraintAnchorArr2[i28];
                        i7 = i28 + 1;
                        constraintAnchor3 = constraintWidget.G[i7];
                        constraintAnchor4 = constraintAnchor24.d;
                        if (constraintAnchor4 != null) {
                            solverVariable5 = constraintAnchor4.g;
                        } else {
                            solverVariable5 = null;
                        }
                        constraintAnchor5 = constraintAnchor3.d;
                        if (constraintAnchor5 != null) {
                            solverVariable6 = constraintAnchor5.g;
                        } else {
                            solverVariable6 = null;
                        }
                        if (constraintWidget11 != constraintWidget) {
                            ConstraintAnchor constraintAnchor25 = constraintWidget11.G[i7].d;
                            solverVariable6 = constraintAnchor25 != null ? constraintAnchor25.g : null;
                        }
                        if (constraintWidget12 == constraintWidget) {
                            constraintAnchor3 = constraintAnchorArr2[i7];
                        }
                        if (solverVariable5 == null && solverVariable6 != null) {
                            linearSystem2.b(constraintAnchor24.g, solverVariable5, constraintAnchor24.c(), 0.5f, solverVariable6, constraintAnchor3.g, constraintWidget.G[i7].c(), 5);
                        }
                    }
                    i11++;
                    constraintWidgetContainer2 = constraintWidgetContainer;
                    i10 = i27;
                    chainHeadArr2 = chainHeadArr3;
                    i4 = i28;
                } else {
                    int i39 = chainHead.j;
                    boolean z16 = i39 > 0 && chainHead.f3934i == i39;
                    ConstraintWidget constraintWidget20 = constraintWidget12;
                    ConstraintWidget constraintWidget21 = constraintWidget20;
                    while (constraintWidget20 != null) {
                        ConstraintWidget constraintWidget22 = constraintWidget20.f3962d0[i2];
                        while (true) {
                            if (constraintWidget22 == null) {
                                i5 = 8;
                                break;
                            }
                            i5 = 8;
                            if (constraintWidget22.X != 8) {
                                break;
                            } else {
                                constraintWidget22 = constraintWidget22.f3962d0[i2];
                            }
                        }
                        if (constraintWidget22 != null || constraintWidget20 == constraintWidget) {
                            ConstraintAnchor[] constraintAnchorArr9 = constraintWidget20.G;
                            ConstraintAnchor constraintAnchor26 = constraintAnchorArr9[i28];
                            SolverVariable solverVariable17 = constraintAnchor26.g;
                            ConstraintAnchor constraintAnchor27 = constraintAnchor26.d;
                            SolverVariable solverVariable18 = constraintAnchor27 != null ? constraintAnchor27.g : null;
                            if (constraintWidget21 != constraintWidget20) {
                                solverVariable18 = constraintWidget21.G[i28 + 1].g;
                            } else if (constraintWidget20 == constraintWidget12 && constraintWidget21 == constraintWidget20) {
                                ConstraintAnchor constraintAnchor28 = constraintWidget5.G[i28].d;
                                solverVariable18 = constraintAnchor28 != null ? constraintAnchor28.g : null;
                            }
                            int iC5 = constraintAnchor26.c();
                            int i40 = i28 + 1;
                            int iC6 = constraintAnchorArr9[i40].c();
                            if (constraintWidget22 != null) {
                                constraintAnchor2 = constraintWidget22.G[i28];
                                solverVariable3 = constraintAnchor2.g;
                                solverVariable4 = constraintAnchorArr9[i40].g;
                            } else {
                                constraintAnchor2 = constraintWidget11.G[i40].d;
                                solverVariable3 = constraintAnchor2 != null ? constraintAnchor2.g : null;
                                solverVariable4 = constraintAnchorArr9[i40].g;
                            }
                            if (constraintAnchor2 != null) {
                                iC6 += constraintAnchor2.c();
                            }
                            if (constraintWidget21 != null) {
                                iC5 += constraintWidget21.G[i40].c();
                            }
                            if (solverVariable17 == null || solverVariable18 == null || solverVariable3 == null || solverVariable4 == null) {
                                constraintWidget2 = constraintWidget5;
                                i6 = 8;
                            } else {
                                if (constraintWidget20 == constraintWidget12) {
                                    iC5 = constraintWidget12.G[i28].c();
                                }
                                if (constraintWidget20 == constraintWidget) {
                                    iC6 = constraintWidget.G[i40].c();
                                }
                                constraintWidget2 = constraintWidget5;
                                i6 = 8;
                                linearSystem.b(solverVariable17, solverVariable18, iC5, 0.5f, solverVariable3, solverVariable4, iC6, z16 ? 8 : 5);
                            }
                        } else {
                            constraintWidget2 = constraintWidget5;
                            i6 = i5;
                        }
                        if (constraintWidget20.X != i6) {
                            constraintWidget21 = constraintWidget20;
                        }
                        constraintWidget20 = constraintWidget22;
                        constraintWidget21 = constraintWidget21;
                        constraintWidget5 = constraintWidget2;
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor29 = constraintWidget5.G[i28];
                int i41 = i28 + 1;
                ConstraintAnchor constraintAnchor30 = constraintWidget11.G[i41];
                ConstraintAnchor constraintAnchor31 = constraintAnchor29.d;
                SolverVariable solverVariable19 = constraintAnchor31 != null ? constraintAnchor31.g : null;
                ConstraintAnchor constraintAnchor32 = constraintAnchor30.d;
                SolverVariable solverVariable20 = constraintAnchor32 != null ? constraintAnchor32.g : null;
                ConstraintAnchor constraintAnchor33 = constraintWidget12.G[i28];
                ConstraintAnchor constraintAnchor34 = constraintWidget13.G[i41];
                if (solverVariable19 == null || solverVariable20 == null) {
                    constraintWidget = constraintWidget13;
                } else {
                    SolverVariable solverVariable21 = solverVariable19;
                    constraintWidget = constraintWidget13;
                    linearSystem.b(constraintAnchor33.g, solverVariable21, constraintAnchor33.c(), i2 == 0 ? constraintWidget14.f3954U : constraintWidget14.f3955V, solverVariable20, constraintAnchor34.g, constraintAnchor34.c(), 7);
                }
            }
            linearSystem2 = linearSystem;
            if (z2) {
                constraintAnchorArr2 = constraintWidget12.G;
                ConstraintAnchor constraintAnchor210 = constraintAnchorArr2[i28];
                i7 = i28 + 1;
                constraintAnchor3 = constraintWidget.G[i7];
                constraintAnchor4 = constraintAnchor210.d;
                if (constraintAnchor4 != null) {
                    solverVariable5 = constraintAnchor4.g;
                } else {
                    solverVariable5 = null;
                }
                constraintAnchor5 = constraintAnchor3.d;
                if (constraintAnchor5 != null) {
                    solverVariable6 = constraintAnchor5.g;
                } else {
                    solverVariable6 = null;
                }
                if (constraintWidget11 != constraintWidget) {
                    ConstraintAnchor constraintAnchor211 = constraintWidget11.G[i7].d;
                    solverVariable6 = constraintAnchor211 != null ? constraintAnchor211.g : null;
                }
                if (constraintWidget12 == constraintWidget) {
                    constraintAnchor3 = constraintAnchorArr2[i7];
                }
                if (solverVariable5 == null) {
                }
            } else {
                constraintAnchorArr2 = constraintWidget12.G;
                ConstraintAnchor constraintAnchor212 = constraintAnchorArr2[i28];
                i7 = i28 + 1;
                constraintAnchor3 = constraintWidget.G[i7];
                constraintAnchor4 = constraintAnchor212.d;
                if (constraintAnchor4 != null) {
                    solverVariable5 = constraintAnchor4.g;
                } else {
                    solverVariable5 = null;
                }
                constraintAnchor5 = constraintAnchor3.d;
                if (constraintAnchor5 != null) {
                    solverVariable6 = constraintAnchor5.g;
                } else {
                    solverVariable6 = null;
                }
                if (constraintWidget11 != constraintWidget) {
                    ConstraintAnchor constraintAnchor213 = constraintWidget11.G[i7].d;
                    solverVariable6 = constraintAnchor213 != null ? constraintAnchor213.g : null;
                }
                if (constraintWidget12 == constraintWidget) {
                    constraintAnchor3 = constraintAnchorArr2[i7];
                }
                if (solverVariable5 == null) {
                }
            }
            i11++;
            constraintWidgetContainer2 = constraintWidgetContainer;
            i10 = i27;
            chainHeadArr2 = chainHeadArr3;
            i4 = i28;
        }
    }
}
