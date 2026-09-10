package androidx.compose.runtime.snapshots;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SnapshotStateList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a9\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a=\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a5\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0014\u001a\u00020\t2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u000f\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001a\"\u0018\u0010#\u001a\u00060 j\u0002`!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"\"$\u0010&\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\"0\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018@X\u0080\u0004¢\u0006\f\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lkotlin/Function1;", "", "", "block", "apical", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lkotlin/jvm/functions/Function1;)Z", "Landroidx/compose/runtime/snapshots/merc;", "", "currentModification", "Ldovishness/marial;", "newList", "structural", "beachfront", "(Landroidx/compose/runtime/snapshots/merc;ILdovishness/marial;Z)Z", "list", "Landroidx/compose/runtime/snapshots/grimness;", "formularize", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;Ldovishness/marial;)Landroidx/compose/runtime/snapshots/grimness;", "size", X3.a.f, "attabal", "(ILkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "cutely", "()Ljava/lang/Void;", "index", "", "impassible", "(II)V", "taiyuan", "", "Landroidx/compose/runtime/platform/SynchronizedObject;", "Ljava/lang/Object;", "sync", "impromptu", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;)I", "structure", "competently", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;)Landroidx/compose/runtime/snapshots/merc;", "getReadable$annotations", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;)V", "readable", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class cord {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Object f6180attabal = new Object();

    public static final <T> boolean apical(SnapshotStateList<T> snapshotStateList, Function1<? super List<T>, Boolean> function1) {
        int iApical;
        dovishness.marial<T> marialVarCutely;
        Boolean boolInvoke;
        formularize formularizeVarDern;
        boolean zBeachfront;
        do {
            synchronized (f6180attabal) {
                grimness firstStateRecord = snapshotStateList.getFirstStateRecord();
                Intrinsics.competently(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                merc mercVar = (merc) adultoid.polder((merc) firstStateRecord);
                iApical = mercVar.apical();
                marialVarCutely = mercVar.cutely();
                Unit unit = Unit.f29295attabal;
            }
            Intrinsics.beachfront(marialVarCutely);
            dovishness.marial.attabal<T> attabalVarBuilder = marialVarCutely.builder();
            boolInvoke = function1.invoke(attabalVarBuilder);
            dovishness.marial<T> marialVarBuild = attabalVarBuilder.build();
            if (Intrinsics.wireman(marialVarBuild, marialVarCutely)) {
                break;
            }
            grimness firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            Intrinsics.competently(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            merc mercVar2 = (merc) firstStateRecord2;
            synchronized (adultoid.privatdozent()) {
                formularizeVarDern = formularize.INSTANCE.dern();
                zBeachfront = beachfront((merc) adultoid.underbelly(mercVar2, snapshotStateList, formularizeVarDern), iApical, marialVarBuild, true);
            }
            adultoid.clubfoot(formularizeVarDern, snapshotStateList);
        } while (!zBeachfront);
        return boolInvoke.booleanValue();
    }

    public static final <T> SnapshotStateList<T> attabal(int i, Function1<? super Integer, ? extends T> function1) {
        if (i == 0) {
            return new SnapshotStateList<>();
        }
        dovishness.marial.attabal attabalVarBuilder = dovishness.attabal.attabal().builder();
        for (int i2 = 0; i2 < i; i2++) {
            attabalVarBuilder.add(function1.invoke(Integer.valueOf(i2)));
        }
        return new SnapshotStateList<>(attabalVarBuilder.build());
    }

    public static final <T> boolean beachfront(merc<T> mercVar, int i, dovishness.marial<? extends T> marialVar, boolean z) {
        boolean z2;
        synchronized (f6180attabal) {
            try {
                if (mercVar.apical() == i) {
                    mercVar.impassible(marialVar);
                    z2 = true;
                    if (z) {
                        mercVar.kowloon(mercVar.formularize() + 1);
                    }
                    mercVar.triweekly(mercVar.apical() + 1);
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final <T> merc<T> competently(SnapshotStateList<T> snapshotStateList) {
        grimness firstStateRecord = snapshotStateList.getFirstStateRecord();
        Intrinsics.competently(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (merc) adultoid.treadless((merc) firstStateRecord, snapshotStateList);
    }

    public static final Void cutely() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    public static final <T> grimness formularize(SnapshotStateList<T> snapshotStateList, dovishness.marial<? extends T> marialVar) {
        formularize formularizeVarGrimness = adultoid.grimness();
        merc mercVar = new merc(formularizeVarGrimness.getSnapshotId(), marialVar);
        if (!(formularizeVarGrimness instanceof saneness)) {
            mercVar.impromptu(new merc(arytenoidectomy.dern(1), marialVar));
        }
        return mercVar;
    }

    public static final void impassible(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    public static final <T> int impromptu(SnapshotStateList<T> snapshotStateList) {
        grimness firstStateRecord = snapshotStateList.getFirstStateRecord();
        Intrinsics.competently(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((merc) adultoid.polder((merc) firstStateRecord)).formularize();
    }

    public static final Void taiyuan() {
        throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
    }
}
