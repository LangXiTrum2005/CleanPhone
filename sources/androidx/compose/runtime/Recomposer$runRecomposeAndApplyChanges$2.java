package androidx.compose.runtime;

import java.util.List;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/saran;", "Landroidx/compose/runtime/milliradian;", "parentFrameClock", "", "<anonymous>", "(Lkotlinx/coroutines/saran;Landroidx/compose/runtime/milliradian;)V"}, k = 3, mv = {2, 0, 0})
@igo.wireman(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {587, 598}, m = "invokeSuspend")
public final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements tetrahedral.triweekly<kotlinx.coroutines.saran, milliradian, wretchedly.dern<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, wretchedly.dern<? super Recomposer$runRecomposeAndApplyChanges$2> dernVar) {
        super(3, dernVar);
        this.this$0 = recomposer;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x020a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x020c A[LOOP:4: B:100:0x01da->B:113:0x020c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:246:0x020f A[EDGE_INSN: B:246:0x020f->B:114:0x020f BREAK  A[LOOP:4: B:100:0x01da->B:113:0x020c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x018d A[EDGE_INSN: B:252:0x018d->B:82:0x018d BREAK  A[LOOP:6: B:67:0x014a->B:80:0x0181], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0181 A[LOOP:6: B:67:0x014a->B:80:0x0181, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r5v8, types: [T[], java.lang.Object[]] */
    public static final Unit arytenoidectomy(Recomposer recomposer, androidx.collection.saran saranVar, androidx.collection.saran saranVar2, List list, List list2, androidx.collection.saran saranVar3, List list3, androidx.collection.saran saranVar4, Set set, long j) {
        boolean z;
        char c;
        long j2;
        long j3;
        long j4;
        Recomposer recomposer2 = recomposer;
        if (recomposer2.czestochowa()) {
            cuirassed.polloi polloiVar = cuirassed.polloi.f24276attabal;
            Object objAttabal = polloiVar.attabal("Recomposer:animation");
            try {
                recomposer2.broadcastFrameClock.triweekly(j);
                androidx.compose.runtime.snapshots.formularize.INSTANCE.triweekly();
                Unit unit = Unit.f29295attabal;
                polloiVar.saneness(objAttabal);
            } catch (Throwable th) {
                cuirassed.polloi.f24276attabal.saneness(objAttabal);
                throw th;
            }
        }
        Object objAttabal2 = cuirassed.polloi.f24276attabal.attabal("Recomposer:recompose");
        try {
            recomposer2.dhss();
            synchronized (recomposer2.stateLock) {
                try {
                    androidx.compose.runtime.collection.dern dernVar = recomposer2.compositionInvalidations;
                    Object[] objArr = dernVar.content;
                    int size = dernVar.getSize();
                    z = false;
                    for (int i = 0; i < size; i++) {
                        list.add((supplicat) objArr[i]);
                    }
                    recomposer2.compositionInvalidations.impromptu();
                    Unit unit2 = Unit.f29295attabal;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            saranVar.impassible();
            saranVar2.impassible();
            while (true) {
                if (list.isEmpty() && list2.isEmpty()) {
                    break;
                }
                try {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        supplicat supplicatVar = (supplicat) list.get(i2);
                        supplicat supplicatVarAchondroplasia = recomposer2.achondroplasia(supplicatVar, saranVar);
                        if (supplicatVarAchondroplasia != null) {
                            list3.add(supplicatVarAchondroplasia);
                            Unit unit3 = Unit.f29295attabal;
                        }
                        saranVar2.impromptu(supplicatVar);
                    }
                    list.clear();
                    if (saranVar.marial() || recomposer2.compositionInvalidations.getSize() != 0) {
                        synchronized (recomposer2.stateLock) {
                            try {
                                List listPicketboat = recomposer2.picketboat();
                                int size3 = listPicketboat.size();
                                for (int i3 = 0; i3 < size3; i3++) {
                                    supplicat supplicatVar2 = (supplicat) listPicketboat.get(i3);
                                    if (!saranVar2.attabal(supplicatVar2) && supplicatVar2.formularize(set)) {
                                        list.add(supplicatVar2);
                                    }
                                }
                                androidx.compose.runtime.collection.dern dernVar2 = recomposer2.compositionInvalidations;
                                int size4 = dernVar2.getSize();
                                int i4 = 0;
                                for (int i5 = 0; i5 < size4; i5++) {
                                    supplicat supplicatVar3 = (supplicat) dernVar2.content[i5];
                                    if (!saranVar2.attabal(supplicatVar3) && !list.contains(supplicatVar3)) {
                                        list.add(supplicatVar3);
                                        i4++;
                                    } else if (i4 > 0) {
                                        Object[] objArr2 = dernVar2.content;
                                        objArr2[i5 - i4] = objArr2[i5];
                                    }
                                }
                                int i6 = size4 - i4;
                                p002kotlin.collections.arytenoidectomy.molybdenite(dernVar2.content, null, i6, size4);
                                dernVar2.rotuma(i6);
                                Unit unit4 = Unit.f29295attabal;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                    if (list.isEmpty()) {
                        try {
                            kowloon(list2, recomposer2);
                            while (!list2.isEmpty()) {
                                saranVar3.gintrap(recomposer2.julian(list2, saranVar));
                                kowloon(list2, recomposer2);
                            }
                        } catch (Throwable th4) {
                            Recomposer.hardpan(recomposer2, th4, null, true, 2, null);
                            triweekly(recomposer, list, list2, list3, saranVar3, saranVar4, saranVar, saranVar2);
                            Unit unit5 = Unit.f29295attabal;
                            cuirassed.polloi.f24276attabal.saneness(objAttabal2);
                            return unit5;
                        }
                    } else {
                        recomposer2 = recomposer;
                    }
                    z = false;
                } catch (Throwable th5) {
                    try {
                        Recomposer.hardpan(recomposer, th5, null, true, 2, null);
                        triweekly(recomposer, list, list2, list3, saranVar3, saranVar4, saranVar, saranVar2);
                        Unit unit6 = Unit.f29295attabal;
                        list.clear();
                        cuirassed.polloi.f24276attabal.saneness(objAttabal2);
                        return unit6;
                    } catch (Throwable th6) {
                        list.clear();
                        throw th6;
                    }
                }
                cuirassed.polloi.f24276attabal.saneness(objAttabal2);
                throw th;
            }
            androidx.compose.runtime.snapshots.formularize formularizeVarDern = androidx.compose.runtime.snapshots.formularize.INSTANCE.dern();
            androidx.compose.runtime.snapshots.formularize starvelingVar = formularizeVarDern instanceof androidx.compose.runtime.snapshots.wireman ? new androidx.compose.runtime.snapshots.starveling((androidx.compose.runtime.snapshots.wireman) formularizeVarDern, null, null, true, false) : new androidx.compose.runtime.snapshots.hydrovane(formularizeVarDern, null, true, z);
            try {
                androidx.compose.runtime.snapshots.formularize formularizeVarFormularize = starvelingVar.formularize();
                try {
                    if (!list3.isEmpty()) {
                        recomposer2.changeCount = recomposer2.getChangeCount() + 1;
                        try {
                            int size5 = list3.size();
                            for (?? r3 = z; r3 < size5; r3++) {
                                saranVar4.impromptu((supplicat) list3.get(r3));
                            }
                            int size6 = list3.size();
                            for (?? r4 = z; r4 < size6; r4++) {
                                ((supplicat) list3.get(r4)).arytenoidectomy();
                            }
                            list3.clear();
                        } catch (Throwable th7) {
                            try {
                                Recomposer.hardpan(recomposer2, th7, null, false, 6, null);
                                triweekly(recomposer, list, list2, list3, saranVar3, saranVar4, saranVar, saranVar2);
                                Unit unit7 = Unit.f29295attabal;
                                list3.clear();
                                starvelingVar.molybdenite(formularizeVarFormularize);
                                starvelingVar.wireman();
                                cuirassed.polloi.f24276attabal.saneness(objAttabal2);
                                return unit7;
                            } catch (Throwable th8) {
                                list3.clear();
                                throw th8;
                            }
                        }
                    }
                    if (saranVar3.marial()) {
                        try {
                            saranVar4.dovishness(saranVar3);
                            Object[] objArr3 = saranVar3.elements;
                            c = 7;
                            long[] jArr = saranVar3.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i7 = 0;
                                j2 = 128;
                                j3 = 255;
                                while (true) {
                                    long j5 = jArr[i7];
                                    j4 = -9187201950435737472L;
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i7 != length) {
                                            break;
                                            break;
                                        }
                                        i7++;
                                    } else {
                                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                                        for (int i9 = 0; i9 < i8; i9++) {
                                            if ((j5 & 255) < 128) {
                                                ((supplicat) objArr3[(i7 << 3) + i9]).marial();
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i8 != 8) {
                                            break;
                                        }
                                        if (i7 != length) {
                                            break;
                                        }
                                        i7++;
                                    }
                                }
                            } else {
                                j2 = 128;
                                j3 = 255;
                                j4 = -9187201950435737472L;
                            }
                            saranVar3.impassible();
                        } catch (Throwable th9) {
                            try {
                                Recomposer.hardpan(recomposer, th9, null, false, 6, null);
                                triweekly(recomposer, list, list2, list3, saranVar3, saranVar4, saranVar, saranVar2);
                                Unit unit8 = Unit.f29295attabal;
                                saranVar3.impassible();
                                starvelingVar.molybdenite(formularizeVarFormularize);
                                starvelingVar.wireman();
                                cuirassed.polloi.f24276attabal.saneness(objAttabal2);
                                return unit8;
                            } catch (Throwable th10) {
                                saranVar3.impassible();
                                throw th10;
                            }
                        }
                    } else {
                        c = 7;
                        j2 = 128;
                        j3 = 255;
                        j4 = -9187201950435737472L;
                    }
                    if (saranVar4.marial()) {
                        try {
                            Object[] objArr4 = saranVar4.elements;
                            long[] jArr2 = saranVar4.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i10 = 0;
                                while (true) {
                                    long j6 = jArr2[i10];
                                    if ((((~j6) << c) & j6 & j4) == j4) {
                                        if (i10 != length2) {
                                            break;
                                            break;
                                        }
                                        i10++;
                                    } else {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j6 & j3) < j2) {
                                                ((supplicat) objArr4[(i10 << 3) + i12]).adultoid();
                                            }
                                            j6 >>= 8;
                                        }
                                        if (i11 != 8) {
                                            break;
                                        }
                                        if (i10 != length2) {
                                            break;
                                        }
                                        i10++;
                                    }
                                }
                            }
                            saranVar4.impassible();
                        } catch (Throwable th11) {
                            try {
                                Recomposer.hardpan(recomposer, th11, null, false, 6, null);
                                triweekly(recomposer, list, list2, list3, saranVar3, saranVar4, saranVar, saranVar2);
                                Unit unit9 = Unit.f29295attabal;
                                saranVar4.impassible();
                                starvelingVar.molybdenite(formularizeVarFormularize);
                                starvelingVar.wireman();
                                cuirassed.polloi.f24276attabal.saneness(objAttabal2);
                                return unit9;
                            } catch (Throwable th12) {
                                saranVar4.impassible();
                                throw th12;
                            }
                        }
                    }
                    Unit unit10 = Unit.f29295attabal;
                    starvelingVar.molybdenite(formularizeVarFormularize);
                    starvelingVar.wireman();
                    synchronized (recomposer.stateLock) {
                        recomposer.lerp();
                    }
                    androidx.compose.runtime.snapshots.formularize.INSTANCE.competently();
                    saranVar2.impassible();
                    saranVar.impassible();
                    recomposer.compositionsRemoved = null;
                    cuirassed.polloi.f24276attabal.saneness(objAttabal2);
                    return Unit.f29295attabal;
                } catch (Throwable th13) {
                    starvelingVar.molybdenite(formularizeVarFormularize);
                    throw th13;
                }
            } catch (Throwable th14) {
                starvelingVar.wireman();
                throw th14;
            }
        } catch (Throwable th15) {
            cuirassed.polloi.f24276attabal.saneness(objAttabal2);
            throw th15;
        }
    }

    public static final void kowloon(List<nosophobia> list, Recomposer recomposer) {
        list.clear();
        synchronized (recomposer.stateLock) {
            try {
                List list2 = recomposer.movableContentAwaitingInsert;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    list.add((nosophobia) list2.get(i));
                }
                recomposer.movableContentAwaitingInsert.clear();
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[Catch: all -> 0x002e, LOOP:1: B:12:0x0044->B:22:0x007a, LOOP_END, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x000f, B:6:0x001f, B:9:0x0031, B:12:0x0044, B:14:0x0055, B:16:0x005f, B:18:0x0065, B:19:0x0072, B:24:0x0085, B:27:0x0092, B:29:0x009d, B:31:0x00a7, B:33:0x00ad, B:34:0x00b7, B:37:0x00bf, B:38:0x00c2, B:41:0x00d2, B:43:0x00dd, B:45:0x00e7, B:47:0x00ed, B:48:0x00fa, B:51:0x0102, B:52:0x0105, B:22:0x007a), top: B:57:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bf A[Catch: all -> 0x002e, LOOP:3: B:27:0x0092->B:37:0x00bf, LOOP_END, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x000f, B:6:0x001f, B:9:0x0031, B:12:0x0044, B:14:0x0055, B:16:0x005f, B:18:0x0065, B:19:0x0072, B:24:0x0085, B:27:0x0092, B:29:0x009d, B:31:0x00a7, B:33:0x00ad, B:34:0x00b7, B:37:0x00bf, B:38:0x00c2, B:41:0x00d2, B:43:0x00dd, B:45:0x00e7, B:47:0x00ed, B:48:0x00fa, B:51:0x0102, B:52:0x0105, B:22:0x007a), top: B:57:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0102 A[Catch: all -> 0x002e, LOOP:5: B:41:0x00d2->B:51:0x0102, LOOP_END, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x000f, B:6:0x001f, B:9:0x0031, B:12:0x0044, B:14:0x0055, B:16:0x005f, B:18:0x0065, B:19:0x0072, B:24:0x0085, B:27:0x0092, B:29:0x009d, B:31:0x00a7, B:33:0x00ad, B:34:0x00b7, B:37:0x00bf, B:38:0x00c2, B:41:0x00d2, B:43:0x00dd, B:45:0x00e7, B:47:0x00ed, B:48:0x00fa, B:51:0x0102, B:52:0x0105, B:22:0x007a), top: B:57:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0085 A[EDGE_INSN: B:61:0x0085->B:24:0x0085 BREAK  A[LOOP:1: B:12:0x0044->B:22:0x007a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2 A[EDGE_INSN: B:66:0x00c2->B:38:0x00c2 BREAK  A[LOOP:3: B:27:0x0092->B:37:0x00bf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0105 A[EDGE_INSN: B:71:0x0105->B:52:0x0105 BREAK  A[LOOP:5: B:41:0x00d2->B:51:0x0102], SYNTHETIC] */
    public static final void triweekly(Recomposer recomposer, List<supplicat> list, List<nosophobia> list2, List<supplicat> list3, androidx.collection.saran<supplicat> saranVar, androidx.collection.saran<supplicat> saranVar2, androidx.collection.saran<Object> saranVar3, androidx.collection.saran<supplicat> saranVar4) {
        char c;
        long j;
        long j2;
        synchronized (recomposer.stateLock) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    supplicat supplicatVar = list3.get(i);
                    supplicatVar.graveside();
                    recomposer.vesuvio(supplicatVar);
                }
                list3.clear();
                Object[] objArr = saranVar.elements;
                long[] jArr = saranVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i2 != length) {
                                break;
                                break;
                            }
                            i2++;
                        } else {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    supplicat supplicatVar2 = (supplicat) objArr[(i2 << 3) + i4];
                                    supplicatVar2.graveside();
                                    recomposer.vesuvio(supplicatVar2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            } else if (i2 != length) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                saranVar.impassible();
                Object[] objArr2 = saranVar2.elements;
                long[] jArr2 = saranVar2.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) == j2) {
                            if (i5 != length2) {
                                break;
                                break;
                            }
                            i5++;
                        } else {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((supplicat) objArr2[(i5 << 3) + i7]).adultoid();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            } else if (i5 != length2) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                saranVar2.impassible();
                saranVar3.impassible();
                Object[] objArr3 = saranVar4.elements;
                long[] jArr3 = saranVar4.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) == j2) {
                            if (i8 != length3) {
                                break;
                                break;
                            }
                            i8++;
                        } else {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    supplicat supplicatVar3 = (supplicat) objArr3[(i8 << 3) + i10];
                                    supplicatVar3.graveside();
                                    recomposer.vesuvio(supplicatVar3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            } else if (i8 != length3) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                    }
                }
                saranVar4.impassible();
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:17:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:20:0x00df  */
    /* JADX WARN: Code duplicated, block: B:23:0x0101  */
    /* JADX WARN: Code duplicated, block: B:25:0x010f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0101 -> B:24:0x0109). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x010f -> B:12:0x00ac). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // tetrahedral.triweekly
    public final Object invoke(kotlinx.coroutines.saran saranVar, milliradian milliradianVar, wretchedly.dern<? super Unit> dernVar) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, dernVar);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = milliradianVar;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(Unit.f29295attabal);
    }
}
