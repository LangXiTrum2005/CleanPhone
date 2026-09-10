package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import cuirassed.IntRef;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.runtime.merc, reason: from toString */
/* JADX INFO: compiled from: DerivedState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001!B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015JA\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Landroidx/compose/runtime/merc;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/seminary;", "Landroidx/compose/runtime/polder;", "Lkotlin/Function0;", "calculation", "Landroidx/compose/runtime/tailoring;", "policy", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/tailoring;)V", "Landroidx/compose/runtime/snapshots/formularize;", "snapshot", "Landroidx/compose/runtime/snapshots/grimness;", "preprohormone", "(Landroidx/compose/runtime/snapshots/formularize;)Landroidx/compose/runtime/snapshots/grimness;", "value", "", "impassible", "(Landroidx/compose/runtime/snapshots/grimness;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/runtime/merc$attabal;", "readable", "", "forceDependencyReads", "cord", "(Landroidx/compose/runtime/merc$attabal;Landroidx/compose/runtime/snapshots/formularize;ZLkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/merc$attabal;", "trm", "arytenoidectomy", "Lkotlin/jvm/functions/Function0;", "monoploid", "Landroidx/compose/runtime/tailoring;", "attabal", "()Landroidx/compose/runtime/tailoring;", "polloi", "Landroidx/compose/runtime/merc$attabal;", "first", "triweekly", "()Landroidx/compose/runtime/snapshots/grimness;", "firstStateRecord", "getValue", "()Ljava/lang/Object;", "Landroidx/compose/runtime/polder$attabal;", "molybdenite", "()Landroidx/compose/runtime/polder$attabal;", "currentRecord", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DerivedState<T> extends androidx.compose.runtime.snapshots.seminary implements polder<T> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final Function0<T> calculation;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final tailoring<T> policy;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public attabal<T> first = new attabal<>(androidx.compose.runtime.snapshots.adultoid.grimness().getSnapshotId());

    /* JADX INFO: renamed from: androidx.compose.runtime.merc$attabal */
    /* JADX INFO: compiled from: DerivedState.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0007\u0018\u0000 <*\u0004\b\u0001\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001:B\u0013\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0016\u001a\u00020\u00152\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u00182\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aR&\u0010\u001f\u001a\u00060\u0004j\u0002`\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\bR\"\u0010%\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010-\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00105\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00109\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010 \u001a\u0004\b7\u0010\"\"\u0004\b8\u0010$R\u0014\u0010;\u001a\u00028\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00102¨\u0006="}, d2 = {"Landroidx/compose/runtime/merc$attabal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/grimness;", "Landroidx/compose/runtime/polder$attabal;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "<init>", "(J)V", "value", "", "dern", "(Landroidx/compose/runtime/snapshots/grimness;)V", "wireman", "()Landroidx/compose/runtime/snapshots/grimness;", "marial", "(J)Landroidx/compose/runtime/snapshots/grimness;", "Landroidx/compose/runtime/polder;", "derivedState", "Landroidx/compose/runtime/snapshots/formularize;", "snapshot", "", "formularize", "(Landroidx/compose/runtime/polder;Landroidx/compose/runtime/snapshots/formularize;)Z", "", "impassible", "(Landroidx/compose/runtime/polder;Landroidx/compose/runtime/snapshots/formularize;)I", "J", "getValidSnapshotId", "()J", "monoploid", "validSnapshotId", "I", "getValidSnapshotWriteCount", "()I", "polloi", "(I)V", "validSnapshotWriteCount", "Landroidx/collection/creditor;", "Landroidx/compose/runtime/snapshots/polder;", "Landroidx/collection/creditor;", "saneness", "()Landroidx/collection/creditor;", "triweekly", "(Landroidx/collection/creditor;)V", "dependencies", "", "beachfront", "Ljava/lang/Object;", "apical", "()Ljava/lang/Object;", "kowloon", "(Ljava/lang/Object;)V", "result", "competently", "getResultHash", "arytenoidectomy", "resultHash", "attabal", "currentValue", "impromptu", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal<T> extends androidx.compose.runtime.snapshots.grimness implements polder.attabal<T> {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
        public Object result;

        /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
        public int resultHash;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public long validSnapshotId;

        /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
        public androidx.collection.creditor<androidx.compose.runtime.snapshots.polder> dependencies;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public int validSnapshotWriteCount;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public static final int f6083taiyuan = 8;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public static final Object f6081cutely = new Object();

        /* JADX INFO: renamed from: androidx.compose.runtime.merc$attabal$attabal, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: DerivedState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/merc$attabal$attabal;", "", "<init>", "()V", "Unset", "Ljava/lang/Object;", "attabal", "()Ljava/lang/Object;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Object attabal() {
                return attabal.f6081cutely;
            }

            public Companion() {
            }
        }

        public attabal(long j) {
            super(j);
            this.dependencies = androidx.collection.starveling.attabal();
            this.result = f6081cutely;
        }

        /* JADX INFO: renamed from: apical, reason: from getter */
        public final Object getResult() {
            return this.result;
        }

        public final void arytenoidectomy(int i) {
            this.resultHash = i;
        }

        @Override // androidx.compose.runtime.polder.attabal
        public T attabal() {
            return (T) this.result;
        }

        @Override // androidx.compose.runtime.snapshots.grimness
        public void dern(androidx.compose.runtime.snapshots.grimness value) {
            Intrinsics.competently(value, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            attabal attabalVar = (attabal) value;
            triweekly(attabalVar.saneness());
            this.result = attabalVar.result;
            this.resultHash = attabalVar.resultHash;
        }

        public final boolean formularize(polder<?> derivedState, androidx.compose.runtime.snapshots.formularize snapshot) {
            boolean z;
            boolean z2;
            synchronized (androidx.compose.runtime.snapshots.adultoid.privatdozent()) {
                z = true;
                z2 = (this.validSnapshotId == snapshot.getSnapshotId() && this.validSnapshotWriteCount == snapshot.getWriteCount()) ? false : true;
            }
            if (this.result == f6081cutely || (z2 && this.resultHash != impassible(derivedState, snapshot))) {
                z = false;
            }
            if (!z || !z2) {
                return z;
            }
            synchronized (androidx.compose.runtime.snapshots.adultoid.privatdozent()) {
                this.validSnapshotId = snapshot.getSnapshotId();
                this.validSnapshotWriteCount = snapshot.getWriteCount();
                Unit unit = Unit.f29295attabal;
            }
            return z;
        }

        /* JADX WARN: Code duplicated, block: B:44:0x00c6 A[DONT_GENERATE, LOOP:3: B:43:0x00c4->B:44:0x00c6, LOOP_END] */
        public final int impassible(polder<?> derivedState, androidx.compose.runtime.snapshots.formularize snapshot) {
            androidx.collection.creditor<androidx.compose.runtime.snapshots.polder> creditorVarSaneness;
            int iAttabal;
            int i;
            int i2;
            int i3;
            synchronized (androidx.compose.runtime.snapshots.adultoid.privatdozent()) {
                creditorVarSaneness = saneness();
            }
            int i4 = 7;
            if (!creditorVarSaneness.taiyuan()) {
                return 7;
            }
            androidx.compose.runtime.collection.dern<seminary> dernVarAttabal = liable.attabal();
            seminary[] seminaryVarArr = dernVarAttabal.content;
            int size = dernVarAttabal.getSize();
            for (int i5 = 0; i5 < size; i5++) {
                seminaryVarArr[i5].saneness(derivedState);
            }
            try {
                Object[] objArr = creditorVarSaneness.keys;
                int[] iArr = creditorVarSaneness.values;
                long[] jArr = creditorVarSaneness.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                int length = jArr.length - 2;
                if (length >= 0) {
                    iAttabal = 7;
                    int i6 = 0;
                    while (true) {
                        long j = jArr[i6];
                        if ((((~j) << i4) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8;
                            int i8 = 8 - ((~(i6 - length)) >>> 31);
                            int i9 = 0;
                            while (i9 < i8) {
                                if ((j & 255) < 128) {
                                    int i10 = (i6 << 3) + i9;
                                    i2 = i4;
                                    androidx.compose.runtime.snapshots.polder polderVar = (androidx.compose.runtime.snapshots.polder) objArr[i10];
                                    i3 = i7;
                                    if (iArr[i10] == 1) {
                                        androidx.compose.runtime.snapshots.grimness grimnessVarPreprohormone = polderVar instanceof DerivedState ? ((DerivedState) polderVar).preprohormone(snapshot) : androidx.compose.runtime.snapshots.adultoid.seminary(polderVar.getFirstStateRecord(), snapshot);
                                        iAttabal = (((iAttabal * 31) + cuirassed.triweekly.attabal(grimnessVarPreprohormone)) * 31) + Long.hashCode(grimnessVarPreprohormone.getSnapshotId());
                                    }
                                } else {
                                    i2 = i4;
                                    i3 = i7;
                                }
                                j >>= i3;
                                i9++;
                                i7 = i3;
                                i4 = i2;
                            }
                            i = i4;
                            if (i8 != i7) {
                                break;
                            }
                        } else {
                            i = i4;
                        }
                        if (i6 != length) {
                            i6++;
                            i4 = i;
                        } else {
                            i4 = iAttabal;
                        }
                    }
                    Unit unit = Unit.f29295attabal;
                    return iAttabal;
                }
                iAttabal = i4;
                Unit unit2 = Unit.f29295attabal;
                return iAttabal;
            } finally {
                seminary[] seminaryVarArr2 = dernVarAttabal.content;
                int size2 = dernVarAttabal.getSize();
                for (int i11 = 0; i11 < size2; i11++) {
                    seminaryVarArr2[i11].attabal(derivedState);
                }
            }
        }

        public final void kowloon(Object obj) {
            this.result = obj;
        }

        @Override // androidx.compose.runtime.snapshots.grimness
        public androidx.compose.runtime.snapshots.grimness marial(long snapshotId) {
            return new attabal(snapshotId);
        }

        public final void monoploid(long j) {
            this.validSnapshotId = j;
        }

        public final void polloi(int i) {
            this.validSnapshotWriteCount = i;
        }

        @Override // androidx.compose.runtime.polder.attabal
        public androidx.collection.creditor<androidx.compose.runtime.snapshots.polder> saneness() {
            return this.dependencies;
        }

        public void triweekly(androidx.collection.creditor<androidx.compose.runtime.snapshots.polder> creditorVar) {
            this.dependencies = creditorVar;
        }

        @Override // androidx.compose.runtime.snapshots.grimness
        public androidx.compose.runtime.snapshots.grimness wireman() {
            return marial(androidx.compose.runtime.snapshots.adultoid.grimness().getSnapshotId());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedState(Function0<? extends T> function0, tailoring<T> tailoringVar) {
        this.calculation = function0;
        this.policy = tailoringVar;
    }

    public static final Unit stratoscope(DerivedState derivedState, IntRef intRef, androidx.collection.polder polderVar, int i, Object obj) {
        if (obj == derivedState) {
            throw new IllegalStateException("A derived state calculation cannot read itself");
        }
        if (obj instanceof androidx.compose.runtime.snapshots.polder) {
            polderVar.graveside(obj, Math.min(intRef.getElement() - i, polderVar.beachfront(obj, Integer.MAX_VALUE)));
        }
        return Unit.f29295attabal;
    }

    @Override // androidx.compose.runtime.polder
    public tailoring<T> attabal() {
        return this.policy;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ab A[Catch: all -> 0x0043, LOOP:1: B:16:0x0056->B:30:0x00ab, LOOP_END, TryCatch #2 {all -> 0x0043, blocks: (B:8:0x0026, B:10:0x0036, B:13:0x0046, B:16:0x0056, B:18:0x0069, B:20:0x0074, B:22:0x007e, B:24:0x0097, B:26:0x009d, B:30:0x00ab, B:31:0x00b1), top: B:87:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x00b1 A[EDGE_INSN: B:92:0x00b1->B:31:0x00b1 BREAK  A[LOOP:1: B:16:0x0056->B:30:0x00ab], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final attabal<T> cord(attabal<T> readable, androidx.compose.runtime.snapshots.formularize snapshot, boolean forceDependencyReads, Function0<? extends T> calculation) {
        androidx.compose.runtime.snapshots.formularize.Companion companion;
        tailoring<T> tailoringVarAttabal;
        int i;
        attabal<T> attabalVar = readable;
        int i2 = 0;
        if (!attabalVar.formularize(this, snapshot)) {
            final androidx.collection.polder polderVar = new androidx.collection.polder(0, 1, null);
            final IntRef intRef = (IntRef) vir.f6330attabal.attabal();
            if (intRef == null) {
                intRef = new IntRef(0);
                vir.f6330attabal.saneness(intRef);
            }
            final int element = intRef.getElement();
            androidx.compose.runtime.collection.dern<seminary> dernVarAttabal = liable.attabal();
            seminary[] seminaryVarArr = dernVarAttabal.content;
            int size = dernVarAttabal.getSize();
            for (int i3 = 0; i3 < size; i3++) {
                seminaryVarArr[i3].saneness(this);
            }
            try {
                intRef.saneness(element + 1);
                Object objImpromptu = androidx.compose.runtime.snapshots.formularize.INSTANCE.impromptu(new Function1() { // from class: androidx.compose.runtime.restrictive
                    @Override // p002kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DerivedState.stratoscope(this.f6143kowloon, intRef, polderVar, element, obj);
                    }
                }, null, calculation);
                intRef.saneness(element);
                seminary[] seminaryVarArr2 = dernVarAttabal.content;
                int size2 = dernVarAttabal.getSize();
                for (int i4 = 0; i4 < size2; i4++) {
                    seminaryVarArr2[i4].attabal(this);
                }
                synchronized (androidx.compose.runtime.snapshots.adultoid.privatdozent()) {
                    try {
                        companion = androidx.compose.runtime.snapshots.formularize.INSTANCE;
                        androidx.compose.runtime.snapshots.formularize formularizeVarDern = companion.dern();
                        if (attabalVar.getResult() == attabal.INSTANCE.attabal() || (tailoringVarAttabal = attabal()) == 0 || !tailoringVarAttabal.saneness(objImpromptu, attabalVar.getResult())) {
                            attabalVar = (attabal) androidx.compose.runtime.snapshots.adultoid.splinterproof(this.first, this, formularizeVarDern);
                            attabalVar.triweekly(polderVar);
                            attabalVar.arytenoidectomy(attabalVar.impassible(this, formularizeVarDern));
                            attabalVar.kowloon(objImpromptu);
                        } else {
                            attabalVar.triweekly(polderVar);
                            attabalVar.arytenoidectomy(attabalVar.impassible(this, formularizeVarDern));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                IntRef intRef2 = (IntRef) vir.f6330attabal.attabal();
                if (intRef2 == null || intRef2.getElement() != 0) {
                    return attabalVar;
                }
                companion.competently();
                synchronized (androidx.compose.runtime.snapshots.adultoid.privatdozent()) {
                    androidx.compose.runtime.snapshots.formularize formularizeVarDern2 = companion.dern();
                    attabalVar.monoploid(formularizeVarDern2.getSnapshotId());
                    attabalVar.polloi(formularizeVarDern2.getWriteCount());
                    Unit unit = Unit.f29295attabal;
                }
                return attabalVar;
            } catch (Throwable th2) {
                seminary[] seminaryVarArr3 = dernVarAttabal.content;
                int size3 = dernVarAttabal.getSize();
                for (int i5 = 0; i5 < size3; i5++) {
                    seminaryVarArr3[i5].attabal(this);
                }
                throw th2;
            }
        }
        if (forceDependencyReads) {
            androidx.compose.runtime.collection.dern<seminary> dernVarAttabal2 = liable.attabal();
            seminary[] seminaryVarArr4 = dernVarAttabal2.content;
            int size4 = dernVarAttabal2.getSize();
            for (int i6 = 0; i6 < size4; i6++) {
                seminaryVarArr4[i6].saneness(this);
            }
            try {
                androidx.collection.creditor<androidx.compose.runtime.snapshots.polder> creditorVarSaneness = attabalVar.saneness();
                IntRef intRef3 = (IntRef) vir.f6330attabal.attabal();
                if (intRef3 == null) {
                    intRef3 = new IntRef(0);
                    vir.f6330attabal.saneness(intRef3);
                }
                int element2 = intRef3.getElement();
                Object[] objArr = creditorVarSaneness.keys;
                int[] iArr = creditorVarSaneness.values;
                long[] jArr = creditorVarSaneness.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j = jArr[i7];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i7 != length) {
                                break;
                                break;
                            }
                            i7++;
                            i2 = 0;
                        } else {
                            int i8 = 8;
                            int i9 = 8 - ((~(i7 - length)) >>> 31);
                            while (i2 < i9) {
                                if ((j & 255) < 128) {
                                    int i10 = (i7 << 3) + i2;
                                    i = i8;
                                    androidx.compose.runtime.snapshots.polder polderVar2 = (androidx.compose.runtime.snapshots.polder) objArr[i10];
                                    intRef3.saneness(element2 + iArr[i10]);
                                    Function1<Object, Unit> function1Competently = snapshot.competently();
                                    if (function1Competently != null) {
                                        function1Competently.invoke(polderVar2);
                                    }
                                } else {
                                    i = i8;
                                }
                                j >>= i;
                                i2++;
                                i8 = i;
                            }
                            if (i9 != i8) {
                                break;
                            }
                            if (i7 != length) {
                                break;
                            }
                            i7++;
                            i2 = 0;
                        }
                    }
                }
                intRef3.saneness(element2);
                Unit unit2 = Unit.f29295attabal;
            } finally {
                seminary[] seminaryVarArr5 = dernVarAttabal2.content;
                int size5 = dernVarAttabal2.getSize();
                for (int i11 = 0; i11 < size5; i11++) {
                    seminaryVarArr5[i11].attabal(this);
                }
            }
        }
        return attabalVar;
    }

    @Override // androidx.compose.runtime.tout, androidx.compose.runtime.czestochowa
    public T getValue() {
        androidx.compose.runtime.snapshots.formularize.Companion companion = androidx.compose.runtime.snapshots.formularize.INSTANCE;
        Function1<Object, Unit> function1Competently = companion.dern().competently();
        if (function1Competently != null) {
            function1Competently.invoke(this);
        }
        androidx.compose.runtime.snapshots.formularize formularizeVarDern = companion.dern();
        return (T) cord((attabal) androidx.compose.runtime.snapshots.adultoid.seminary(this.first, formularizeVarDern), formularizeVarDern, true, this.calculation).getResult();
    }

    @Override // androidx.compose.runtime.snapshots.polder
    public void impassible(androidx.compose.runtime.snapshots.grimness value) {
        Intrinsics.competently(value, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.first = (attabal) value;
    }

    @Override // androidx.compose.runtime.polder
    public polder.attabal<T> molybdenite() {
        androidx.compose.runtime.snapshots.formularize formularizeVarDern = androidx.compose.runtime.snapshots.formularize.INSTANCE.dern();
        return cord((attabal) androidx.compose.runtime.snapshots.adultoid.seminary(this.first, formularizeVarDern), formularizeVarDern, false, this.calculation);
    }

    public final androidx.compose.runtime.snapshots.grimness preprohormone(androidx.compose.runtime.snapshots.formularize snapshot) {
        return cord((attabal) androidx.compose.runtime.snapshots.adultoid.seminary(this.first, snapshot), snapshot, false, this.calculation);
    }

    public String toString() {
        return "DerivedState(value=" + trm() + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.snapshots.polder
    /* JADX INFO: renamed from: triweekly */
    public androidx.compose.runtime.snapshots.grimness getFirstStateRecord() {
        return this.first;
    }

    public final String trm() {
        attabal attabalVar = (attabal) androidx.compose.runtime.snapshots.adultoid.polder(this.first);
        return attabalVar.formularize(this, androidx.compose.runtime.snapshots.formularize.INSTANCE.dern()) ? String.valueOf(attabalVar.getResult()) : "<Not calculated>";
    }
}
