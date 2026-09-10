package androidx.compose.runtime.snapshots;

import androidx.collection.mathsort;
import androidx.compose.runtime.lightstruck;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u001a\n\u0002\u0010 \n\u0002\b\u0019\b\u0017\u0018\u0000 >2\u00020\u0001:\u0001iBI\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u0016\u001a\u00020\u00002\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u000fJ%\u0010\u001c\u001a\u00020\u00012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0001H\u0010¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\tH\u0010¢\u0006\u0004\b\"\u0010\u000fJ\u000f\u0010#\u001a\u00020\tH\u0010¢\u0006\u0004\b#\u0010\u000fJ\u000f\u0010$\u001a\u00020\tH\u0010¢\u0006\u0004\b$\u0010\u000fJG\u0010-\u001a\u00020\u00182\n\u0010%\u001a\u00060\u0002j\u0002`\u00032\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*\u0018\u00010)2\u0006\u0010,\u001a\u00020\u0005H\u0000¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\tH\u0000¢\u0006\u0004\b/\u0010\u000fJ\u001b\u00101\u001a\u00020\t2\n\u00100\u001a\u00060\u0002j\u0002`\u0003H\u0000¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\t2\u0006\u00100\u001a\u000203H\u0000¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\t2\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u0005H\u0000¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\t2\u0006\u0010=\u001a\u00020'H\u0010¢\u0006\u0004\b>\u0010?R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010CR\"\u0010K\u001a\u0002038\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u00105R*\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\bH\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR*\u0010W\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010Q8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010]\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010<R\"\u0010b\u001a\u0002068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u00109R\u0016\u0010:\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010GR\"\u0010g\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010c\u001a\u0004\bd\u0010\u0015\"\u0004\be\u0010fR\u0014\u0010h\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0015¨\u0006j"}, d2 = {"Landroidx/compose/runtime/snapshots/wireman;", "Landroidx/compose/runtime/snapshots/formularize;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "writeObserver", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "walach", "()V", "peridotite", "cuirassed", "privatdozent", "", "restrictive", "()Z", "hydrovane", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/wireman;", "Landroidx/compose/runtime/snapshots/impassible;", "trm", "()Landroidx/compose/runtime/snapshots/impassible;", "wireman", "rotuma", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/formularize;", "snapshot", "impassible", "(Landroidx/compose/runtime/snapshots/formularize;)V", "triweekly", "kowloon", "dern", "polloi", "nextId", "Landroidx/collection/saran;", "Landroidx/compose/runtime/snapshots/polder;", "modified", "", "Landroidx/compose/runtime/snapshots/grimness;", "optimisticMerges", "invalidSnapshots", "merc", "(JLandroidx/collection/saran;Ljava/util/Map;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/impassible;", "stratoscope", "id", "polder", "(J)V", "", "grimness", "(I)V", "", "handles", "saran", "([I)V", "snapshots", "seminary", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "state", "arytenoidectomy", "(Landroidx/compose/runtime/snapshots/polder;)V", "competently", "Lkotlin/jvm/functions/Function1;", "supplicat", "()Lkotlin/jvm/functions/Function1;", "impromptu", "apical", "taiyuan", "I", "cutely", "()I", "gintrap", "writeCount", "Landroidx/collection/saran;", "yemenite", "()Landroidx/collection/saran;", "starveling", "(Landroidx/collection/saran;)V", "", "Ljava/util/List;", "getMerged$runtime", "()Ljava/util/List;", "setMerged$runtime", "(Ljava/util/List;)V", "merged", "formularize", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "sealless", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setPreviousIds$runtime", "previousIds", "[I", "kattegat", "()[I", "setPreviousPinnedSnapshots$runtime", "previousPinnedSnapshots", "Z", "oilcan", "creditor", "(Z)V", "applied", "readOnly", "attabal", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class wireman extends formularize {

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final int f6260monoploid = 8;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final int[] f6261polloi = new int[0];

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public List<? extends polder> merged;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final Function1<Object, Unit> readObserver;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.saran<polder> modified;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public SnapshotIdSet previousIds;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public int[] previousPinnedSnapshots;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public final Function1<Object, Unit> writeObserver;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public boolean applied;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public int writeCount;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
    public int snapshots;

    public wireman(long j, SnapshotIdSet snapshotIdSet, Function1<Object, Unit> function1, Function1<Object, Unit> function2) {
        super(j, snapshotIdSet, null);
        this.readObserver = function1;
        this.writeObserver = function2;
        this.previousIds = SnapshotIdSet.INSTANCE.attabal();
        this.previousPinnedSnapshots = f6261polloi;
        this.snapshots = 1;
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public Function1<Object, Unit> apical() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public void arytenoidectomy(polder state) {
        androidx.collection.saran<polder> saranVarYemenite = yemenite();
        if (saranVarYemenite == null) {
            saranVarYemenite = mathsort.attabal();
            starveling(saranVarYemenite);
        }
        saranVarYemenite.impromptu(state);
    }

    public final void creditor(boolean z) {
        this.applied = z;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x007c A[LOOP:0: B:7:0x001e->B:24:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x007f A[EDGE_INSN: B:28:0x007f->B:25:0x007f BREAK  A[LOOP:0: B:7:0x001e->B:24:0x007c], SYNTHETIC] */
    public final void cuirassed() {
        androidx.collection.saran<polder> saranVarYemenite = yemenite();
        if (saranVarYemenite != null) {
            walach();
            starveling(null);
            long snapshotId = getSnapshotId();
            Object[] objArr = saranVarYemenite.elements;
            long[] jArr = saranVarYemenite.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (grimness firstStateRecord = ((polder) objArr[(i << 3) + i3]).getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
                                    if (firstStateRecord.getSnapshotId() == snapshotId || CollectionsKt.permissivist(this.previousIds, Long.valueOf(firstStateRecord.getSnapshotId()))) {
                                        firstStateRecord.taiyuan(adultoid.f6174saneness);
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        saneness();
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    /* JADX INFO: renamed from: cutely, reason: from getter */
    public int getWriteCount() {
        return this.writeCount;
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public void dern() {
        adultoid.f6173marial = adultoid.f6173marial.taiyuan(getSnapshotId()).impromptu(this.previousIds);
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public void gintrap(int i) {
        this.writeCount = i;
    }

    public final void grimness(int id) {
        if (id >= 0) {
            this.previousPinnedSnapshots = p002kotlin.collections.arytenoidectomy.rotuma(this.previousPinnedSnapshots, id);
        }
    }

    public wireman hydrovane(Function1<Object, Unit> readObserver, Function1<Object, Unit> writeObserver) {
        Map<trm.saneness, trm.attabal> second;
        long j;
        marial marialVar;
        cord();
        peridotite();
        dovishness.marial marialVar2 = trm.wireman.f38993attabal;
        Function1<Object, Unit> function1 = readObserver;
        Function1<Object, Unit> function1Saneness = writeObserver;
        if (marialVar2 != null) {
            Pair<trm.attabal, Map<trm.saneness, trm.attabal>> pairBeachfront = trm.wireman.beachfront(marialVar2, this, false, function1, function1Saneness);
            trm.attabal first = pairBeachfront.getFirst();
            Function1<Object, Unit> function1Attabal = first.attabal();
            function1Saneness = first.saneness();
            second = pairBeachfront.getSecond();
            function1 = function1Attabal;
        } else {
            second = null;
        }
        polder(getSnapshotId());
        synchronized (adultoid.privatdozent()) {
            long j2 = adultoid.f6166beachfront;
            j = 1;
            adultoid.f6166beachfront += j;
            adultoid.f6173marial = adultoid.f6173marial.kowloon(j2);
            SnapshotIdSet invalid = getInvalid();
            adultoid(invalid.kowloon(j2));
            marialVar = new marial(j2, adultoid.yemenite(invalid, getSnapshotId() + j, j2), adultoid.starveling(function1, competently(), false, 4, null), adultoid.walach(function1Saneness, apical()), this);
        }
        if (!getApplied() && !getDisposed()) {
            long snapshotId = getSnapshotId();
            synchronized (adultoid.privatdozent()) {
                long j3 = adultoid.f6166beachfront;
                adultoid.f6166beachfront += j;
                dovishness(j3);
                adultoid.f6173marial = adultoid.f6173marial.kowloon(getSnapshotId());
                Unit unit = Unit.f29295attabal;
            }
            adultoid(adultoid.yemenite(getInvalid(), snapshotId + j, getSnapshotId()));
        }
        if (marialVar2 != null) {
            trm.wireman.dern(marialVar2, this, marialVar, second);
        }
        return marialVar;
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public void impassible(formularize snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public boolean impromptu() {
        return false;
    }

    /* JADX INFO: renamed from: kattegat, reason: from getter */
    public final int[] getPreviousPinnedSnapshots() {
        return this.previousPinnedSnapshots;
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public void kowloon() {
        if (this.applied || getDisposed()) {
            return;
        }
        stratoscope();
    }

    public final impassible merc(long nextId, androidx.collection.saran<polder> modified, Map<grimness, ? extends grimness> optimisticMerges, SnapshotIdSet invalidSnapshots) {
        SnapshotIdSet snapshotIdSet;
        Object[] objArr;
        long[] jArr;
        SnapshotIdSet snapshotIdSet2;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j;
        int i2;
        grimness grimnessVarKowloon;
        SnapshotIdSet snapshotIdSetTriweekly = getInvalid().kowloon(getSnapshotId()).triweekly(this.previousIds);
        Object[] objArr3 = modified.elements;
        long[] jArr3 = modified.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        List<? extends polder> listUnconsolidated = null;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr3[i3];
                List<? extends polder> arrayList2 = listUnconsolidated;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j2 & 255) < 128) {
                            i = i4;
                            polder polderVar = (polder) objArr3[(i3 << 3) + i6];
                            objArr2 = objArr3;
                            grimness firstStateRecord = polderVar.getFirstStateRecord();
                            jArr2 = jArr3;
                            ArrayList arrayList3 = arrayList;
                            grimness grimnessVarMilliradian = adultoid.milliradian(firstStateRecord, nextId, invalidSnapshots);
                            if (grimnessVarMilliradian == null) {
                                j = j2;
                            } else {
                                j = j2;
                                grimness grimnessVarMilliradian2 = adultoid.milliradian(firstStateRecord, getSnapshotId(), snapshotIdSetTriweekly);
                                if (grimnessVarMilliradian2 != null && grimnessVarMilliradian2.getSnapshotId() != arytenoidectomy.dern(1) && !Intrinsics.wireman(grimnessVarMilliradian, grimnessVarMilliradian2)) {
                                    i2 = i6;
                                    snapshotIdSet2 = snapshotIdSetTriweekly;
                                    grimness grimnessVarMilliradian3 = adultoid.milliradian(firstStateRecord, getSnapshotId(), getInvalid());
                                    if (grimnessVarMilliradian3 == null) {
                                        adultoid.timberyard();
                                        throw new KotlinNothingValueException();
                                    }
                                    if (optimisticMerges == null || (grimnessVarKowloon = optimisticMerges.get(grimnessVarMilliradian)) == null) {
                                        grimnessVarKowloon = polderVar.kowloon(grimnessVarMilliradian2, grimnessVarMilliradian, grimnessVarMilliradian3);
                                    }
                                    if (grimnessVarKowloon == null) {
                                        return new impassible.attabal(this);
                                    }
                                    if (!Intrinsics.wireman(grimnessVarKowloon, grimnessVarMilliradian3)) {
                                        if (Intrinsics.wireman(grimnessVarKowloon, grimnessVarMilliradian)) {
                                            ArrayList arrayList4 = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayList4.add(patroclinal.formularize.attabal(polderVar, grimnessVarMilliradian.marial(getSnapshotId())));
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList<>();
                                            }
                                            List<? extends polder> list = arrayList2;
                                            list.add(polderVar);
                                            arrayList = arrayList4;
                                            arrayList2 = list;
                                        } else {
                                            arrayList = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayList.add(!Intrinsics.wireman(grimnessVarKowloon, grimnessVarMilliradian2) ? patroclinal.formularize.attabal(polderVar, grimnessVarKowloon) : patroclinal.formularize.attabal(polderVar, grimnessVarMilliradian2.marial(getSnapshotId())));
                                        }
                                    }
                                }
                                arrayList = arrayList3;
                            }
                            snapshotIdSet2 = snapshotIdSetTriweekly;
                            i2 = i6;
                            arrayList = arrayList3;
                        } else {
                            snapshotIdSet2 = snapshotIdSetTriweekly;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j = j2;
                            i2 = i6;
                        }
                        j2 = j >> i;
                        i6 = i2 + 1;
                        objArr3 = objArr2;
                        i4 = i;
                        jArr3 = jArr2;
                        snapshotIdSetTriweekly = snapshotIdSet2;
                    }
                    snapshotIdSet = snapshotIdSetTriweekly;
                    objArr = objArr3;
                    jArr = jArr3;
                    ArrayList arrayList5 = arrayList;
                    if (i5 != i4) {
                        listUnconsolidated = arrayList2;
                        arrayList = arrayList5;
                        break;
                    }
                    arrayList = arrayList5;
                } else {
                    snapshotIdSet = snapshotIdSetTriweekly;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                listUnconsolidated = arrayList2;
                if (i3 == length) {
                    break;
                }
                i3++;
                objArr3 = objArr;
                jArr3 = jArr;
                snapshotIdSetTriweekly = snapshotIdSet;
            }
        }
        if (arrayList != null) {
            stratoscope();
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                Pair pair = (Pair) arrayList.get(i7);
                polder polderVar2 = (polder) pair.component1();
                grimness grimnessVar = (grimness) pair.component2();
                grimnessVar.taiyuan(nextId);
                synchronized (adultoid.privatdozent()) {
                    grimnessVar.impromptu(polderVar2.getFirstStateRecord());
                    polderVar2.impassible(grimnessVar);
                    Unit unit = Unit.f29295attabal;
                }
            }
        }
        if (listUnconsolidated != null) {
            int size2 = listUnconsolidated.size();
            for (int i8 = 0; i8 < size2; i8++) {
                modified.preprohormone(listUnconsolidated.get(i8));
            }
            List<? extends polder> list2 = this.merged;
            if (list2 != null) {
                listUnconsolidated = CollectionsKt.unconsolidated(list2, listUnconsolidated);
            }
            this.merged = listUnconsolidated;
        }
        return impassible.saneness.f6207attabal;
    }

    /* JADX INFO: renamed from: oilcan, reason: from getter */
    public final boolean getApplied() {
        return this.applied;
    }

    public final void peridotite() {
        if (!this.applied || this.pinningTrackingHandle >= 0) {
            return;
        }
        lightstruck.saneness("Unsupported operation on a disposed or applied snapshot");
    }

    public final void polder(long id) {
        synchronized (adultoid.privatdozent()) {
            this.previousIds = this.previousIds.kowloon(id);
            Unit unit = Unit.f29295attabal;
        }
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public void polloi() {
        privatdozent();
        super.polloi();
    }

    public final void privatdozent() {
        int length = this.previousPinnedSnapshots.length;
        for (int i = 0; i < length; i++) {
            adultoid.itchy(this.previousPinnedSnapshots[i]);
        }
    }

    public boolean restrictive() {
        androidx.collection.saran<polder> saranVarYemenite = yemenite();
        return saranVarYemenite != null && saranVarYemenite.marial();
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public formularize rotuma(Function1<Object, Unit> readObserver) {
        Map<trm.saneness, trm.attabal> second;
        long j;
        beachfront beachfrontVar;
        cord();
        peridotite();
        long snapshotId = getSnapshotId();
        wireman wiremanVar = this instanceof saneness ? null : this;
        dovishness.marial marialVar = trm.wireman.f38993attabal;
        Function1<Object, Unit> function1 = readObserver;
        if (marialVar != null) {
            Pair<trm.attabal, Map<trm.saneness, trm.attabal>> pairBeachfront = trm.wireman.beachfront(marialVar, wiremanVar, true, function1, null);
            trm.attabal first = pairBeachfront.getFirst();
            Function1<Object, Unit> function1Attabal = first.attabal();
            first.saneness();
            second = pairBeachfront.getSecond();
            function1 = function1Attabal;
        } else {
            second = null;
        }
        polder(getSnapshotId());
        synchronized (adultoid.privatdozent()) {
            long j2 = adultoid.f6166beachfront;
            j = 1;
            adultoid.f6166beachfront += j;
            adultoid.f6173marial = adultoid.f6173marial.kowloon(j2);
            beachfrontVar = new beachfront(j2, adultoid.yemenite(getInvalid(), snapshotId + j, j2), adultoid.starveling(function1, competently(), false, 4, null), this);
        }
        if (!getApplied() && !getDisposed()) {
            long snapshotId2 = getSnapshotId();
            synchronized (adultoid.privatdozent()) {
                long j3 = adultoid.f6166beachfront;
                adultoid.f6166beachfront += j;
                dovishness(j3);
                adultoid.f6173marial = adultoid.f6173marial.kowloon(getSnapshotId());
                Unit unit = Unit.f29295attabal;
            }
            adultoid(adultoid.yemenite(getInvalid(), snapshotId2 + j, getSnapshotId()));
        }
        if (marialVar != null) {
            trm.wireman.dern(marialVar, wiremanVar, beachfrontVar, second);
        }
        return beachfrontVar;
    }

    public final void saran(int[] handles) {
        if (handles.length == 0) {
            return;
        }
        int[] iArr = this.previousPinnedSnapshots;
        if (iArr.length != 0) {
            handles = p002kotlin.collections.arytenoidectomy.preprohormone(iArr, handles);
        }
        this.previousPinnedSnapshots = handles;
    }

    /* JADX INFO: renamed from: sealless, reason: from getter */
    public final SnapshotIdSet getPreviousIds() {
        return this.previousIds;
    }

    public final void seminary(SnapshotIdSet snapshots) {
        synchronized (adultoid.privatdozent()) {
            this.previousIds = this.previousIds.triweekly(snapshots);
            Unit unit = Unit.f29295attabal;
        }
    }

    public void starveling(androidx.collection.saran<polder> saranVar) {
        this.modified = saranVar;
    }

    public final void stratoscope() {
        long j;
        polder(getSnapshotId());
        Unit unit = Unit.f29295attabal;
        if (getApplied() || getDisposed()) {
            return;
        }
        long snapshotId = getSnapshotId();
        synchronized (adultoid.privatdozent()) {
            long j2 = adultoid.f6166beachfront;
            j = 1;
            adultoid.f6166beachfront += j;
            dovishness(j2);
            adultoid.f6173marial = adultoid.f6173marial.kowloon(getSnapshotId());
        }
        adultoid(adultoid.yemenite(getInvalid(), snapshotId + j, getSnapshotId()));
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    /* JADX INFO: renamed from: supplicat */
    public Function1<Object, Unit> competently() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public void triweekly(formularize snapshot) {
        if (!(this.snapshots > 0)) {
            lightstruck.attabal("no pending nested snapshots");
        }
        int i = this.snapshots - 1;
        this.snapshots = i;
        if (i != 0 || this.applied) {
            return;
        }
        cuirassed();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0180 A[EDGE_INSN: B:102:0x0180->B:77:0x0180 BREAK  A[LOOP:4: B:66:0x0151->B:76:0x017d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x013e A[Catch: all -> 0x0133, LOOP:2: B:48:0x010b->B:60:0x013e, LOOP_END, TryCatch #0 {all -> 0x0133, blocks: (B:43:0x00ef, B:45:0x00ff, B:48:0x010b, B:50:0x0117, B:52:0x0121, B:54:0x0127, B:57:0x0136, B:63:0x0147, B:66:0x0151, B:68:0x015b, B:70:0x0165, B:72:0x016b, B:73:0x0175, B:76:0x017d, B:77:0x0180, B:79:0x0184, B:81:0x018e, B:82:0x019a, B:60:0x013e), top: B:90:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0141  */
    /* JADX WARN: Code duplicated, block: B:75:0x017b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x017d A[Catch: all -> 0x0133, LOOP:4: B:66:0x0151->B:76:0x017d, LOOP_END, TryCatch #0 {all -> 0x0133, blocks: (B:43:0x00ef, B:45:0x00ff, B:48:0x010b, B:50:0x0117, B:52:0x0121, B:54:0x0127, B:57:0x0136, B:63:0x0147, B:66:0x0151, B:68:0x015b, B:70:0x0165, B:72:0x016b, B:73:0x0175, B:76:0x017d, B:77:0x0180, B:79:0x0184, B:81:0x018e, B:82:0x019a, B:60:0x013e), top: B:90:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0145 A[EDGE_INSN: B:97:0x0145->B:62:0x0145 BREAK  A[LOOP:2: B:48:0x010b->B:60:0x013e], SYNTHETIC] */
    public impassible trm() {
        Map<grimness, ? extends grimness> mapDent;
        List list;
        androidx.collection.saran<polder> saranVarYemenite;
        long j;
        long j2;
        androidx.collection.saran<polder> saranVarYemenite2 = yemenite();
        if (saranVarYemenite2 != null) {
            saneness sanenessVar = adultoid.f6164apical;
            mapDent = adultoid.dent(sanenessVar.getSnapshotId(), this, adultoid.f6173marial.taiyuan(sanenessVar.getSnapshotId()));
        } else {
            mapDent = null;
        }
        List listFormularize = p002kotlin.collections.adultoid.formularize();
        synchronized (adultoid.privatdozent()) {
            try {
                adultoid.sensatory(this);
                if (saranVarYemenite2 == null || saranVarYemenite2.get_size() == 0) {
                    dern();
                    saneness sanenessVar2 = adultoid.f6164apical;
                    androidx.collection.saran<polder> saranVarYemenite3 = sanenessVar2.yemenite();
                    adultoid.lerp(sanenessVar2, adultoid.f6165attabal);
                    if (saranVarYemenite3 == null || !saranVarYemenite3.marial()) {
                        list = listFormularize;
                        saranVarYemenite = null;
                    } else {
                        list = adultoid.f6175taiyuan;
                        saranVarYemenite = saranVarYemenite3;
                    }
                } else {
                    saneness sanenessVar3 = adultoid.f6164apical;
                    impassible impassibleVarMerc = merc(adultoid.f6166beachfront, saranVarYemenite2, mapDent, adultoid.f6173marial.taiyuan(sanenessVar3.getSnapshotId()));
                    if (!Intrinsics.wireman(impassibleVarMerc, impassible.saneness.f6207attabal)) {
                        return impassibleVarMerc;
                    }
                    dern();
                    saranVarYemenite = sanenessVar3.yemenite();
                    adultoid.lerp(sanenessVar3, adultoid.f6165attabal);
                    starveling(null);
                    sanenessVar3.starveling(null);
                    list = adultoid.f6175taiyuan;
                }
                Unit unit = Unit.f29295attabal;
                this.applied = true;
                if (saranVarYemenite != null) {
                    Set setAttabal = androidx.compose.runtime.collection.marial.attabal(saranVarYemenite);
                    if (!setAttabal.isEmpty()) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((Function2) list.get(i)).invoke(setAttabal, this);
                        }
                    }
                }
                if (saranVarYemenite2 != null && saranVarYemenite2.marial()) {
                    Set setAttabal2 = androidx.compose.runtime.collection.marial.attabal(saranVarYemenite2);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((Function2) list.get(i2)).invoke(setAttabal2, this);
                    }
                }
                trm.wireman.wireman(this, saranVarYemenite2);
                synchronized (adultoid.privatdozent()) {
                    try {
                        polloi();
                        adultoid.supplicat();
                        if (saranVarYemenite != null) {
                            Object[] objArr = saranVarYemenite.elements;
                            long[] jArr = saranVarYemenite.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                while (true) {
                                    long j3 = jArr[i3];
                                    j2 = 255;
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i3 != length) {
                                            break;
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j3 & 255) < 128) {
                                                adultoid.premeiotic((polder) objArr[(i3 << 3) + i5]);
                                            }
                                            j3 >>= 8;
                                        }
                                        if (i4 != 8) {
                                            break;
                                        }
                                        if (i3 != length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                        } else {
                            j = 128;
                            j2 = 255;
                        }
                        if (saranVarYemenite2 != null) {
                            Object[] objArr2 = saranVarYemenite2.elements;
                            long[] jArr2 = saranVarYemenite2.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j4 = jArr2[i6];
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i6 != length2) {
                                            break;
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j4 & j2) < j) {
                                                adultoid.premeiotic((polder) objArr2[(i6 << 3) + i8]);
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 != length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        List<? extends polder> list2 = this.merged;
                        if (list2 != null) {
                            int size3 = list2.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                adultoid.premeiotic(list2.get(i9));
                            }
                        }
                        this.merged = null;
                        Unit unit2 = Unit.f29295attabal;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return impassible.saneness.f6207attabal;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void walach() {
        if (this.applied) {
            lightstruck.saneness("Unsupported operation on a snapshot that has been applied");
        }
    }

    @Override // androidx.compose.runtime.snapshots.formularize
    public void wireman() {
        if (getDisposed()) {
            return;
        }
        super.wireman();
        triweekly(this);
        trm.wireman.marial(this);
    }

    public androidx.collection.saran<polder> yemenite() {
        return this.modified;
    }
}
