package androidx.compose.runtime.snapshots;

import com.unity3d.ads.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SnapshotIdSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 &2\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001:\u0001'B5\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00002\n\u0010\f\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00002\n\u0010\f\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u001a\u0010\u0019\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0018H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u001b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0018\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u001c\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "upperSet", "lowerSet", "lowerBound", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "belowBound", "<init>", "(JJJ[J)V", "id", "", "cutely", "(J)Z", "kowloon", "(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "taiyuan", "ids", "impromptu", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "bits", "triweekly", "", "iterator", "()Ljava/util/Iterator;", BuildConfig.FLAVOR, "impassible", "(J)J", "", "toString", "()Ljava/lang/String;", "J", "arytenoidectomy", "monoploid", "polloi", "[J", "molybdenite", "attabal", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SnapshotIdSet implements Iterable<Long>, unready.attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final long lowerSet;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final long upperSet;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final long lowerBound;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final long[] belowBound;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final SnapshotIdSet f6154graveside = new SnapshotIdSet(0, 0, 0, null);

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotIdSet$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SnapshotIdSet.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$attabal;", "", "<init>", "()V", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "EMPTY", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "attabal", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SnapshotIdSet attabal() {
            return SnapshotIdSet.f6154graveside;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: SnapshotIdSet.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\f\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/sequences/taiyuan;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "", "<anonymous>", "(Lkotlin/sequences/taiyuan;)V"}, k = 3, mv = {2, 0, 0})
    @igo.wireman(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {252, 256, 263}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<p002kotlin.sequences.taiyuan<? super Long>, wretchedly.dern<? super Unit>, Object> {
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public AnonymousClass1(wretchedly.dern<? super AnonymousClass1> dernVar) {
            super(2, dernVar);
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
            AnonymousClass1 anonymousClass1 = SnapshotIdSet.this.new AnonymousClass1(dernVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:41:0x00f2  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0079 -> B:19:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009b -> B:30:0x00b8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b5 -> B:30:0x00b8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d3 -> B:43:0x00f4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f2 -> B:42:0x00f3). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 249
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(p002kotlin.sequences.taiyuan<? super Long> taiyuanVar, wretchedly.dern<? super Unit> dernVar) {
            return ((AnonymousClass1) create(taiyuanVar, dernVar)).invokeSuspend(Unit.f29295attabal);
        }
    }

    public SnapshotIdSet(long j, long j2, long j3, long[] jArr) {
        this.upperSet = j;
        this.lowerSet = j2;
        this.lowerBound = j3;
        this.belowBound = jArr;
    }

    public final boolean cutely(long id) {
        long[] jArr;
        long j = id - this.lowerBound;
        long j2 = 0;
        if (Intrinsics.cutely(j, j2) >= 0 && Intrinsics.cutely(j, 64) < 0) {
            return ((1 << ((int) j)) & this.lowerSet) != 0;
        }
        if (Intrinsics.cutely(j, 64) < 0 || Intrinsics.cutely(j, 128) >= 0) {
            return Intrinsics.cutely(j, j2) <= 0 && (jArr = this.belowBound) != null && arytenoidectomy.attabal(jArr, id) >= 0;
        }
        return ((1 << (((int) j) - 64)) & this.upperSet) != 0;
    }

    public final long impassible(long j) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            return jArr[0];
        }
        long j2 = this.lowerSet;
        if (j2 != 0) {
            return this.lowerBound + ((long) Long.numberOfTrailingZeros(j2));
        }
        long j3 = this.upperSet;
        return j3 != 0 ? this.lowerBound + ((long) 64) + ((long) Long.numberOfTrailingZeros(j3)) : j;
    }

    public final SnapshotIdSet impromptu(SnapshotIdSet ids) {
        SnapshotIdSet snapshotIdSetTaiyuan;
        SnapshotIdSet snapshotIdSet = f6154graveside;
        if (ids == snapshotIdSet) {
            return this;
        }
        if (this == snapshotIdSet) {
            return snapshotIdSet;
        }
        long j = ids.lowerBound;
        long j2 = this.lowerBound;
        if (j == j2) {
            long[] jArr = ids.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet((~ids.upperSet) & this.upperSet, (~ids.lowerSet) & this.lowerSet, j2, jArr2);
            }
        }
        long[] jArr3 = ids.belowBound;
        if (jArr3 != null) {
            snapshotIdSetTaiyuan = this;
            for (long j3 : jArr3) {
                snapshotIdSetTaiyuan = snapshotIdSetTaiyuan.taiyuan(j3);
            }
        } else {
            snapshotIdSetTaiyuan = this;
        }
        if (ids.lowerSet != 0) {
            for (int i = 0; i < 64; i++) {
                if ((ids.lowerSet & (1 << i)) != 0) {
                    snapshotIdSetTaiyuan = snapshotIdSetTaiyuan.taiyuan(ids.lowerBound + ((long) i));
                }
            }
        }
        if (ids.upperSet != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((ids.upperSet & (1 << i2)) != 0) {
                    snapshotIdSetTaiyuan = snapshotIdSetTaiyuan.taiyuan(ids.lowerBound + ((long) i2) + ((long) 64));
                }
            }
        }
        return snapshotIdSetTaiyuan;
    }

    @Override // java.lang.Iterable
    public Iterator<Long> iterator() {
        return p002kotlin.sequences.cutely.saneness(new AnonymousClass1(null)).iterator();
    }

    public final SnapshotIdSet kowloon(long id) {
        long j;
        long j2;
        long[] jArrSaneness;
        long j3 = id - this.lowerBound;
        long j4 = 0;
        if (Intrinsics.cutely(j3, j4) < 0 || Intrinsics.cutely(j3, 64) >= 0) {
            long j5 = 64;
            if (Intrinsics.cutely(j3, j5) < 0 || Intrinsics.cutely(j3, 128) >= 0) {
                long j6 = 128;
                if (Intrinsics.cutely(j3, j6) < 0) {
                    long[] jArr = this.belowBound;
                    if (jArr == null) {
                        return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, new long[]{id});
                    }
                    int iAttabal = arytenoidectomy.attabal(jArr, id);
                    if (iAttabal < 0) {
                        return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, arytenoidectomy.wireman(jArr, -(iAttabal + 1), id));
                    }
                } else if (!cutely(id)) {
                    long j7 = this.upperSet;
                    long j8 = this.lowerSet;
                    long j9 = this.lowerBound;
                    long j10 = 1;
                    long j11 = ((id + j10) / j5) * j5;
                    if (Intrinsics.cutely(j11, j4) < 0) {
                        j11 = (Long.MAX_VALUE - j6) + j10;
                    }
                    kowloon kowloonVar = null;
                    long j12 = j7;
                    while (true) {
                        if (Intrinsics.cutely(j9, j11) >= 0) {
                            j = j8;
                            j2 = j9;
                            break;
                        }
                        if (j8 != 0) {
                            if (kowloonVar == null) {
                                kowloonVar = new kowloon(this.belowBound);
                            }
                            int i = 0;
                            while (i < 64) {
                                long j13 = j8;
                                if ((j8 & (1 << i)) != 0) {
                                    kowloonVar.attabal(((long) i) + j9);
                                }
                                i++;
                                j8 = j13;
                            }
                        }
                        if (j12 == 0) {
                            j2 = j11;
                            j = 0;
                            break;
                        }
                        j9 += j5;
                        j8 = j12;
                        j12 = 0;
                    }
                    if (kowloonVar == null || (jArrSaneness = kowloonVar.saneness()) == null) {
                        jArrSaneness = this.belowBound;
                    }
                    return new SnapshotIdSet(j12, j, j2, jArrSaneness).kowloon(id);
                }
            } else {
                long j14 = 1 << (((int) j3) - 64);
                long j15 = this.upperSet;
                if ((j15 & j14) == 0) {
                    return new SnapshotIdSet(j15 | j14, this.lowerSet, this.lowerBound, this.belowBound);
                }
            }
        } else {
            long j16 = 1 << ((int) j3);
            long j17 = this.lowerSet;
            if ((j17 & j16) == 0) {
                return new SnapshotIdSet(this.upperSet, j17 | j16, this.lowerBound, this.belowBound);
            }
        }
        return this;
    }

    public final SnapshotIdSet taiyuan(long id) {
        long[] jArr;
        int iAttabal;
        long j = id - this.lowerBound;
        long j2 = 0;
        if (Intrinsics.cutely(j, j2) >= 0 && Intrinsics.cutely(j, 64) < 0) {
            long j3 = 1 << ((int) j);
            long j4 = this.lowerSet;
            if ((j4 & j3) != 0) {
                return new SnapshotIdSet(this.upperSet, j4 & (~j3), this.lowerBound, this.belowBound);
            }
        } else if (Intrinsics.cutely(j, 64) >= 0 && Intrinsics.cutely(j, 128) < 0) {
            long j5 = 1 << (((int) j) - 64);
            long j6 = this.upperSet;
            if ((j6 & j5) != 0) {
                return new SnapshotIdSet(j6 & (~j5), this.lowerSet, this.lowerBound, this.belowBound);
            }
        } else if (Intrinsics.cutely(j, j2) < 0 && (jArr = this.belowBound) != null && (iAttabal = arytenoidectomy.attabal(jArr, id)) >= 0) {
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, arytenoidectomy.marial(jArr, iAttabal));
        }
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(this, 10));
        Iterator<Long> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        sb.append(dern.wireman(arrayList, null, null, null, 0, null, null, 63, null));
        sb.append(']');
        return sb.toString();
    }

    public final SnapshotIdSet triweekly(SnapshotIdSet bits) {
        SnapshotIdSet snapshotIdSetKowloon;
        SnapshotIdSet snapshotIdSet = f6154graveside;
        if (bits == snapshotIdSet) {
            return this;
        }
        if (this == snapshotIdSet) {
            return bits;
        }
        long j = bits.lowerBound;
        long j2 = this.lowerBound;
        if (j == j2) {
            long[] jArr = bits.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet(bits.upperSet | this.upperSet, bits.lowerSet | this.lowerSet, j2, jArr2);
            }
        }
        int i = 0;
        if (this.belowBound == null) {
            long[] jArr3 = this.belowBound;
            if (jArr3 != null) {
                for (long j3 : jArr3) {
                    bits = bits.kowloon(j3);
                }
            }
            if (this.lowerSet != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if ((this.lowerSet & (1 << i2)) != 0) {
                        bits = bits.kowloon(this.lowerBound + ((long) i2));
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i < 64) {
                    if ((this.upperSet & (1 << i)) != 0) {
                        bits = bits.kowloon(this.lowerBound + ((long) i) + ((long) 64));
                    }
                    i++;
                }
            }
            return bits;
        }
        long[] jArr4 = bits.belowBound;
        if (jArr4 != null) {
            snapshotIdSetKowloon = this;
            for (long j4 : jArr4) {
                snapshotIdSetKowloon = snapshotIdSetKowloon.kowloon(j4);
            }
        } else {
            snapshotIdSetKowloon = this;
        }
        if (bits.lowerSet != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((bits.lowerSet & (1 << i3)) != 0) {
                    snapshotIdSetKowloon = snapshotIdSetKowloon.kowloon(bits.lowerBound + ((long) i3));
                }
            }
        }
        if (bits.upperSet != 0) {
            while (i < 64) {
                if ((bits.upperSet & (1 << i)) != 0) {
                    snapshotIdSetKowloon = snapshotIdSetKowloon.kowloon(bits.lowerBound + ((long) i) + ((long) 64));
                }
                i++;
            }
        }
        return snapshotIdSetKowloon;
    }
}
