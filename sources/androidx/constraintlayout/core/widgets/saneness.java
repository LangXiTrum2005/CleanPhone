package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: compiled from: Chain.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness {
    /* JADX WARN: Code duplicated, block: B:100:0x016d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0173  */
    /* JADX WARN: Code duplicated, block: B:104:0x0194  */
    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[PHI: r15 r16
  0x0033: PHI (r15v26 boolean) = (r15v1 boolean), (r15v28 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r16v5 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[PHI: r15 r16
  0x0035: PHI (r15v3 boolean) = (r15v1 boolean), (r15v28 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r16v3 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:218:0x038a  */
    /* JADX WARN: Code duplicated, block: B:289:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:292:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:293:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:296:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:297:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:299:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:301:0x04da  */
    /* JADX WARN: Code duplicated, block: B:304:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:317:0x038b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x016a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [androidx.constraintlayout.core.dern] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.constraintlayout.core.dern] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r5v17, types: [androidx.constraintlayout.core.SolverVariable] */
    public static void attabal(wireman wiremanVar, androidx.constraintlayout.core.dern dernVar, int i, int i2, dern dernVar2) {
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        ?? r0;
        androidx.constraintlayout.core.dern dernVar3;
        ConstraintAnchor constraintAnchor;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        int i3;
        ConstraintAnchor constraintAnchor2;
        SolverVariable solverVariable3;
        int i4;
        ConstraintAnchor[] constraintAnchorArr;
        int i5;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        SolverVariable solverVariable4;
        ConstraintAnchor constraintAnchor5;
        Object obj;
        int size;
        ConstraintAnchor constraintAnchor6;
        int i6;
        int i7 = i;
        ConstraintWidget constraintWidget = dernVar2.f8230attabal;
        ConstraintWidget constraintWidget2 = dernVar2.f8234dern;
        ConstraintWidget constraintWidget3 = dernVar2.f8245saneness;
        ConstraintWidget constraintWidget4 = dernVar2.f8248wireman;
        ConstraintWidget constraintWidget5 = dernVar2.f8241marial;
        float f2 = dernVar2.f8228apical;
        boolean z4 = wiremanVar.f8149premeiotic[i7] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (i7 == 0) {
            int i8 = constraintWidget5.f8131mastfed;
            z = i8 == 0;
            z2 = i8 == 1;
            if (i8 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            int i9 = constraintWidget5.f8088attendance;
            z = i9 == 0;
            z2 = i9 == 1;
            if (i9 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        ?? r14 = constraintWidget;
        boolean z5 = false;
        while (true) {
            f = f2;
            Object obj2 = null;
            if (z5) {
                break;
            }
            ConstraintAnchor constraintAnchor7 = r14.f8103dent[i2];
            int i10 = z3 ? 1 : 4;
            int iBeachfront = constraintAnchor7.beachfront();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = r14.f8149premeiotic[i7];
            boolean z6 = z4;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z7 = dimensionBehaviour == dimensionBehaviour2 && r14.f8150preprohormone[i7] == 0;
            boolean z8 = z3;
            ConstraintAnchor constraintAnchor8 = constraintAnchor7.f8073beachfront;
            if (constraintAnchor8 != null && r14 != constraintWidget) {
                iBeachfront += constraintAnchor8.beachfront();
            }
            int i11 = iBeachfront;
            if (z8 && r14 != constraintWidget && r14 != constraintWidget3) {
                i10 = 8;
            }
            boolean z9 = z7;
            ConstraintAnchor constraintAnchor9 = constraintAnchor7.f8073beachfront;
            if (constraintAnchor9 != null) {
                if (r14 == constraintWidget3) {
                    dernVar.impromptu(constraintAnchor7.f8079taiyuan, constraintAnchor9.f8079taiyuan, i11, 6);
                } else {
                    dernVar.impromptu(constraintAnchor7.f8079taiyuan, constraintAnchor9.f8079taiyuan, i11, 8);
                }
                if (z9 && !z8) {
                    i10 = 5;
                }
                dernVar.marial(constraintAnchor7.f8079taiyuan, constraintAnchor7.f8073beachfront.f8079taiyuan, i11, (r14 == constraintWidget3 && z8 && r14.lotta(i7)) ? 5 : i10);
            } else {
                z5 = z5;
                z = z;
            }
            if (z6) {
                if (r14.clubfoot() == 8 || r14.f8149premeiotic[i7] != dimensionBehaviour2) {
                    i6 = 0;
                } else {
                    ConstraintAnchor[] constraintAnchorArr2 = r14.f8103dent;
                    i6 = 0;
                    dernVar.impromptu(constraintAnchorArr2[i2 + 1].f8079taiyuan, constraintAnchorArr2[i2].f8079taiyuan, 0, 5);
                }
                dernVar.impromptu(r14.f8103dent[i2].f8079taiyuan, wiremanVar.f8103dent[i2].f8079taiyuan, i6, 8);
            }
            ConstraintAnchor constraintAnchor10 = r14.f8103dent[i2 + 1].f8073beachfront;
            if (constraintAnchor10 != null) {
                ConstraintWidget constraintWidget6 = constraintAnchor10.f8080wireman;
                ConstraintAnchor constraintAnchor11 = constraintWidget6.f8103dent[i2].f8073beachfront;
                if (constraintAnchor11 != null && constraintAnchor11.f8080wireman == r14) {
                    obj2 = constraintWidget6;
                }
            }
            if (obj2 != null) {
                r14 = obj2;
                z5 = z5;
            } else {
                z5 = true;
            }
            f2 = f;
            z4 = z6;
            z3 = z8;
            z = z;
            r14 = r14;
        }
        boolean z10 = z4;
        boolean z11 = z3;
        boolean z12 = z;
        if (constraintWidget4 != null) {
            int i12 = i2 + 1;
            if (constraintWidget2.f8103dent[i12].f8073beachfront != null) {
                ConstraintAnchor constraintAnchor12 = constraintWidget4.f8103dent[i12];
                if (constraintWidget4.f8149premeiotic[i7] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget4.f8150preprohormone[i7] == 0 && !z11) {
                    ConstraintAnchor constraintAnchor13 = constraintAnchor12.f8073beachfront;
                    if (constraintAnchor13.f8080wireman == wiremanVar) {
                        dernVar.marial(constraintAnchor12.f8079taiyuan, constraintAnchor13.f8079taiyuan, -constraintAnchor12.beachfront(), 5);
                    } else if (z11) {
                        constraintAnchor6 = constraintAnchor12.f8073beachfront;
                        if (constraintAnchor6.f8080wireman == wiremanVar) {
                            dernVar.marial(constraintAnchor12.f8079taiyuan, constraintAnchor6.f8079taiyuan, -constraintAnchor12.beachfront(), 4);
                        }
                    }
                } else if (z11) {
                    constraintAnchor6 = constraintAnchor12.f8073beachfront;
                    if (constraintAnchor6.f8080wireman == wiremanVar) {
                        dernVar.marial(constraintAnchor12.f8079taiyuan, constraintAnchor6.f8079taiyuan, -constraintAnchor12.beachfront(), 4);
                    }
                }
                dernVar.cutely(constraintAnchor12.f8079taiyuan, constraintWidget2.f8103dent[i12].f8073beachfront.f8079taiyuan, -constraintAnchor12.beachfront(), 6);
            }
        }
        if (z10) {
            int i13 = i2 + 1;
            SolverVariable solverVariable5 = wiremanVar.f8103dent[i13].f8079taiyuan;
            ConstraintAnchor constraintAnchor14 = constraintWidget2.f8103dent[i13];
            dernVar.impromptu(solverVariable5, constraintAnchor14.f8079taiyuan, constraintAnchor14.beachfront(), 8);
        }
        ArrayList<ConstraintWidget> arrayList = dernVar2.f8239impromptu;
        if (arrayList != null && (size = arrayList.size()) > 1) {
            float f3 = (!dernVar2.f8244polloi || dernVar2.f8237graveside) ? f : dernVar2.f8233cutely;
            float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f5 = 0.0f;
            ConstraintWidget constraintWidget7 = null;
            int i14 = 0;
            while (i14 < size) {
                ConstraintWidget constraintWidget8 = arrayList.get(i14);
                float f6 = constraintWidget8.f8127libyan[i7];
                if (f6 < f4) {
                    if (dernVar2.f8237graveside) {
                        ConstraintAnchor[] constraintAnchorArr3 = constraintWidget8.f8103dent;
                        f4 = f4;
                        dernVar.marial(constraintAnchorArr3[i2 + 1].f8079taiyuan, constraintAnchorArr3[i2].f8079taiyuan, 0, 4);
                    } else {
                        f6 = 1.0f;
                    }
                    arrayList = arrayList;
                    i14++;
                    f4 = f4;
                    arrayList = arrayList;
                }
                float f7 = f6;
                if (f7 == f4) {
                    ConstraintAnchor[] constraintAnchorArr4 = constraintWidget8.f8103dent;
                    dernVar.marial(constraintAnchorArr4[i2 + 1].f8079taiyuan, constraintAnchorArr4[i2].f8079taiyuan, 0, 8);
                    arrayList = arrayList;
                } else {
                    if (constraintWidget7 != null) {
                        ConstraintAnchor[] constraintAnchorArr5 = constraintWidget7.f8103dent;
                        SolverVariable solverVariable6 = constraintAnchorArr5[i2].f8079taiyuan;
                        int i15 = i2 + 1;
                        SolverVariable solverVariable7 = constraintAnchorArr5[i15].f8079taiyuan;
                        ConstraintAnchor[] constraintAnchorArr6 = constraintWidget8.f8103dent;
                        SolverVariable solverVariable8 = constraintAnchorArr6[i2].f8079taiyuan;
                        SolverVariable solverVariable9 = constraintAnchorArr6[i15].f8079taiyuan;
                        androidx.constraintlayout.core.saneness sanenessVarPolloi = dernVar.polloi();
                        sanenessVarPolloi.formularize(f5, f3, f7, solverVariable6, solverVariable7, solverVariable8, solverVariable9);
                        dernVar.wireman(sanenessVarPolloi);
                    }
                    constraintWidget7 = constraintWidget8;
                    f5 = f7;
                }
                i14++;
                f4 = f4;
                arrayList = arrayList;
            }
        }
        if (constraintWidget3 != null && (constraintWidget3 == constraintWidget4 || z11)) {
            ConstraintAnchor constraintAnchor15 = constraintWidget.f8103dent[i2];
            int i16 = i2 + 1;
            ConstraintAnchor constraintAnchor16 = constraintWidget2.f8103dent[i16];
            ConstraintAnchor constraintAnchor17 = constraintAnchor15.f8073beachfront;
            SolverVariable solverVariable10 = constraintAnchor17 != null ? constraintAnchor17.f8079taiyuan : null;
            ConstraintAnchor constraintAnchor18 = constraintAnchor16.f8073beachfront;
            SolverVariable solverVariable11 = constraintAnchor18 != null ? constraintAnchor18.f8079taiyuan : null;
            ConstraintAnchor constraintAnchor19 = constraintWidget3.f8103dent[i2];
            if (constraintWidget4 != null) {
                constraintAnchor16 = constraintWidget4.f8103dent[i16];
            }
            if (solverVariable10 != null && solverVariable11 != null) {
                dernVar.dern(constraintAnchor19.f8079taiyuan, solverVariable10, constraintAnchor19.beachfront(), i7 == 0 ? constraintWidget5.f8151preterite : constraintWidget5.f8179wostteth, solverVariable11, constraintAnchor16.f8079taiyuan, constraintAnchor16.beachfront(), 7);
            }
        } else {
            if (!z12 || constraintWidget3 == null) {
                if (z2 && constraintWidget3 != null) {
                    int i17 = dernVar2.f8233cutely;
                    boolean z13 = i17 > 0 && dernVar2.f8246taiyuan == i17;
                    ConstraintWidget constraintWidget9 = constraintWidget3;
                    ConstraintWidget constraintWidget10 = constraintWidget9;
                    while (constraintWidget9 != null) {
                        ConstraintWidget constraintWidget11 = constraintWidget9.f8135molet[i];
                        while (constraintWidget11 != null && constraintWidget11.clubfoot() == 8) {
                            constraintWidget11 = constraintWidget11.f8135molet[i];
                        }
                        if (constraintWidget9 != constraintWidget3 && constraintWidget9 != constraintWidget4 && constraintWidget11 != null) {
                            if (constraintWidget11 == constraintWidget4) {
                                constraintWidget11 = null;
                            }
                            ConstraintAnchor constraintAnchor20 = constraintWidget9.f8103dent[i2];
                            SolverVariable solverVariable12 = constraintAnchor20.f8079taiyuan;
                            ConstraintAnchor constraintAnchor21 = constraintAnchor20.f8073beachfront;
                            if (constraintAnchor21 != null) {
                                SolverVariable solverVariable13 = constraintAnchor21.f8079taiyuan;
                            }
                            int i18 = i2 + 1;
                            SolverVariable solverVariable14 = constraintWidget10.f8103dent[i18].f8079taiyuan;
                            int iBeachfront2 = constraintAnchor20.beachfront();
                            int iBeachfront3 = constraintWidget9.f8103dent[i18].beachfront();
                            if (constraintWidget11 != null) {
                                constraintAnchor = constraintWidget11.f8103dent[i2];
                                solverVariable = constraintAnchor.f8079taiyuan;
                                ConstraintAnchor constraintAnchor22 = constraintAnchor.f8073beachfront;
                                solverVariable2 = constraintAnchor22 != null ? constraintAnchor22.f8079taiyuan : null;
                            } else {
                                constraintAnchor = constraintWidget4.f8103dent[i2];
                                solverVariable = constraintAnchor != null ? constraintAnchor.f8079taiyuan : null;
                                solverVariable2 = constraintWidget9.f8103dent[i18].f8079taiyuan;
                            }
                            if (constraintAnchor != null) {
                                iBeachfront3 += constraintAnchor.beachfront();
                            }
                            int iBeachfront4 = iBeachfront2 + constraintWidget10.f8103dent[i18].beachfront();
                            int i19 = z13 ? 8 : 4;
                            if (solverVariable12 != null && solverVariable14 != null && solverVariable != null && solverVariable2 != null) {
                                dernVar.dern(solverVariable12, solverVariable14, iBeachfront4, 0.5f, solverVariable, solverVariable2, iBeachfront3, i19);
                            }
                            constraintWidget11 = constraintWidget11;
                        }
                        if (constraintWidget9.clubfoot() != 8) {
                            constraintWidget10 = constraintWidget9;
                        }
                        constraintWidget9 = constraintWidget11;
                    }
                    ConstraintAnchor constraintAnchor23 = constraintWidget3.f8103dent[i2];
                    ConstraintAnchor constraintAnchor24 = constraintWidget.f8103dent[i2].f8073beachfront;
                    int i20 = i2 + 1;
                    ConstraintAnchor constraintAnchor25 = constraintWidget4.f8103dent[i20];
                    ConstraintAnchor constraintAnchor26 = constraintWidget2.f8103dent[i20].f8073beachfront;
                    if (constraintAnchor24 == null) {
                        r0 = dernVar;
                    } else {
                        if (constraintWidget3 != constraintWidget4) {
                            dernVar.marial(constraintAnchor23.f8079taiyuan, constraintAnchor24.f8079taiyuan, constraintAnchor23.beachfront(), 5);
                        } else if (constraintAnchor26 != null) {
                            dernVar3 = dernVar;
                            dernVar3.dern(constraintAnchor23.f8079taiyuan, constraintAnchor24.f8079taiyuan, constraintAnchor23.beachfront(), 0.5f, constraintAnchor25.f8079taiyuan, constraintAnchor26.f8079taiyuan, constraintAnchor25.beachfront(), 5);
                        }
                        r0 = dernVar;
                    }
                    if (constraintAnchor26 != null && constraintWidget3 != constraintWidget4) {
                        r0.marial(constraintAnchor25.f8079taiyuan, constraintAnchor26.f8079taiyuan, -constraintAnchor25.beachfront(), 5);
                    }
                }
                if ((z12 && !z2) || constraintWidget3 == null || constraintWidget3 == constraintWidget4) {
                    return;
                }
                constraintAnchorArr = constraintWidget3.f8103dent;
                ConstraintAnchor constraintAnchor27 = constraintAnchorArr[i2];
                if (constraintWidget4 == null) {
                    constraintWidget4 = constraintWidget3;
                }
                i5 = i2 + 1;
                constraintAnchor3 = constraintWidget4.f8103dent[i5];
                constraintAnchor4 = constraintAnchor27.f8073beachfront;
                if (constraintAnchor4 != null) {
                    solverVariable4 = constraintAnchor4.f8079taiyuan;
                } else {
                    solverVariable4 = null;
                }
                constraintAnchor5 = constraintAnchor3.f8073beachfront;
                if (constraintAnchor5 != null) {
                    obj = constraintAnchor5.f8079taiyuan;
                } else {
                    obj = null;
                }
                if (constraintWidget2 != constraintWidget4) {
                    ConstraintAnchor constraintAnchor28 = constraintWidget2.f8103dent[i5].f8073beachfront;
                    obj = constraintAnchor28 != null ? constraintAnchor28.f8079taiyuan : null;
                }
                if (constraintWidget3 == constraintWidget4) {
                    constraintAnchor3 = constraintAnchorArr[i5];
                }
                if (solverVariable4 != null || obj == null) {
                }
                r0.dern(constraintAnchor27.f8079taiyuan, solverVariable4, constraintAnchor27.beachfront(), 0.5f, obj, constraintAnchor3.f8079taiyuan, constraintWidget4.f8103dent[i5].beachfront(), 5);
                return;
            }
            int i21 = dernVar2.f8233cutely;
            boolean z14 = i21 > 0 && dernVar2.f8246taiyuan == i21;
            ConstraintWidget constraintWidget12 = constraintWidget3;
            ConstraintWidget constraintWidget13 = constraintWidget12;
            while (constraintWidget12 != null) {
                ConstraintWidget constraintWidget14 = constraintWidget12.f8135molet[i7];
                while (true) {
                    if (constraintWidget14 == null) {
                        i3 = 8;
                        break;
                    }
                    i3 = 8;
                    if (constraintWidget14.clubfoot() != 8) {
                        break;
                    } else {
                        constraintWidget14 = constraintWidget14.f8135molet[i7];
                    }
                }
                if (constraintWidget14 != null || constraintWidget12 == constraintWidget4) {
                    ConstraintAnchor constraintAnchor29 = constraintWidget12.f8103dent[i2];
                    SolverVariable solverVariable15 = constraintAnchor29.f8079taiyuan;
                    ConstraintAnchor constraintAnchor30 = constraintAnchor29.f8073beachfront;
                    SolverVariable solverVariable16 = constraintAnchor30 != null ? constraintAnchor30.f8079taiyuan : null;
                    if (constraintWidget13 != constraintWidget12) {
                        solverVariable16 = constraintWidget13.f8103dent[i2 + 1].f8079taiyuan;
                    } else if (constraintWidget12 == constraintWidget3) {
                        ConstraintAnchor constraintAnchor31 = constraintWidget.f8103dent[i2].f8073beachfront;
                        solverVariable16 = constraintAnchor31 != null ? constraintAnchor31.f8079taiyuan : null;
                    }
                    int iBeachfront5 = constraintAnchor29.beachfront();
                    int i22 = i2 + 1;
                    int iBeachfront6 = constraintWidget12.f8103dent[i22].beachfront();
                    if (constraintWidget14 != null) {
                        constraintAnchor2 = constraintWidget14.f8103dent[i2];
                        solverVariable3 = constraintAnchor2.f8079taiyuan;
                    } else {
                        constraintAnchor2 = constraintWidget2.f8103dent[i22].f8073beachfront;
                        solverVariable3 = constraintAnchor2 != null ? constraintAnchor2.f8079taiyuan : null;
                    }
                    SolverVariable solverVariable17 = constraintWidget12.f8103dent[i22].f8079taiyuan;
                    if (constraintAnchor2 != null) {
                        iBeachfront6 += constraintAnchor2.beachfront();
                    }
                    int iBeachfront7 = iBeachfront5 + constraintWidget13.f8103dent[i22].beachfront();
                    if (solverVariable15 == null || solverVariable16 == null || solverVariable3 == null || solverVariable17 == null) {
                        i4 = 8;
                    } else {
                        if (constraintWidget12 == constraintWidget3) {
                            iBeachfront7 = constraintWidget3.f8103dent[i2].beachfront();
                        }
                        if (constraintWidget12 == constraintWidget4) {
                            iBeachfront6 = constraintWidget4.f8103dent[i22].beachfront();
                        }
                        constraintWidget14 = constraintWidget14;
                        i4 = 8;
                        dernVar.dern(solverVariable15, solverVariable16, iBeachfront7, 0.5f, solverVariable3, solverVariable17, iBeachfront6, z14 ? 8 : 5);
                    }
                    if (constraintWidget12.clubfoot() != i4) {
                        constraintWidget13 = constraintWidget12;
                    }
                    i7 = i;
                    constraintWidget12 = constraintWidget14;
                } else {
                    i4 = i3;
                }
                if (constraintWidget12.clubfoot() != i4) {
                    constraintWidget13 = constraintWidget12;
                }
                i7 = i;
                constraintWidget12 = constraintWidget14;
            }
        }
        r0 = dernVar;
        if (z12) {
        }
        constraintAnchorArr = constraintWidget3.f8103dent;
        ConstraintAnchor constraintAnchor210 = constraintAnchorArr[i2];
        if (constraintWidget4 == null) {
            constraintWidget4 = constraintWidget3;
        }
        i5 = i2 + 1;
        constraintAnchor3 = constraintWidget4.f8103dent[i5];
        constraintAnchor4 = constraintAnchor210.f8073beachfront;
        if (constraintAnchor4 != null) {
            solverVariable4 = constraintAnchor4.f8079taiyuan;
        } else {
            solverVariable4 = null;
        }
        constraintAnchor5 = constraintAnchor3.f8073beachfront;
        if (constraintAnchor5 != null) {
            obj = constraintAnchor5.f8079taiyuan;
        } else {
            obj = null;
        }
        if (constraintWidget2 != constraintWidget4) {
            ConstraintAnchor constraintAnchor211 = constraintWidget2.f8103dent[i5].f8073beachfront;
            obj = constraintAnchor211 != null ? constraintAnchor211.f8079taiyuan : null;
        }
        if (constraintWidget3 == constraintWidget4) {
            constraintAnchor3 = constraintAnchorArr[i5];
        }
        if (solverVariable4 != null) {
        }
    }

    public static void saneness(wireman wiremanVar, androidx.constraintlayout.core.dern dernVar, ArrayList<ConstraintWidget> arrayList, int i) {
        int i2;
        dern[] dernVarArr;
        int i3;
        if (i == 0) {
            i2 = wiremanVar.f8327stupefactive;
            dernVarArr = wiremanVar.f8329tailoring;
            i3 = 0;
        } else {
            i2 = wiremanVar.f8317libya;
            dernVarArr = wiremanVar.f8309decarock;
            i3 = 2;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            dern dernVar2 = dernVarArr[i4];
            dernVar2.attabal();
            if (arrayList == null || arrayList.contains(dernVar2.f8230attabal)) {
                attabal(wiremanVar, dernVar, i, i3, dernVar2);
            }
        }
    }
}
