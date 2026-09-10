package androidx.compose.runtime.snapshots;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SnapshotStateSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a9\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0017\u001a\u00060\u0013j\u0002`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"$\u0010\u001a\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"0\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "Lkotlin/Function1;", "", "", "block", "marial", "(Landroidx/compose/runtime/snapshots/SnapshotStateSet;Lkotlin/jvm/functions/Function1;)Z", "Landroidx/compose/runtime/snapshots/privatdozent;", "", "currentModification", "Ldovishness/beachfront;", "newSet", "saneness", "(Landroidx/compose/runtime/snapshots/privatdozent;ILdovishness/beachfront;)Z", "set", "Landroidx/compose/runtime/snapshots/grimness;", "beachfront", "(Landroidx/compose/runtime/snapshots/SnapshotStateSet;Ldovishness/beachfront;)Landroidx/compose/runtime/snapshots/grimness;", "", "Landroidx/compose/runtime/platform/SynchronizedObject;", "attabal", "Ljava/lang/Object;", "sync", "dern", "(Landroidx/compose/runtime/snapshots/SnapshotStateSet;)I", "modification", "wireman", "(Landroidx/compose/runtime/snapshots/SnapshotStateSet;)Landroidx/compose/runtime/snapshots/privatdozent;", "getReadable$annotations", "(Landroidx/compose/runtime/snapshots/SnapshotStateSet;)V", "readable", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class kattegat {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Object f6209attabal = new Object();

    public static final <T> grimness beachfront(SnapshotStateSet<T> snapshotStateSet, dovishness.beachfront<? extends T> beachfrontVar) {
        privatdozent privatdozentVar = new privatdozent(adultoid.grimness().getSnapshotId(), beachfrontVar);
        if (formularize.INSTANCE.marial()) {
            privatdozentVar.impromptu(new privatdozent(arytenoidectomy.dern(1), beachfrontVar));
        }
        return privatdozentVar;
    }

    public static final <T> int dern(SnapshotStateSet<T> snapshotStateSet) {
        grimness grimnessVarTriweekly = snapshotStateSet.triweekly();
        Intrinsics.competently(grimnessVarTriweekly, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
        return ((privatdozent) adultoid.polder((privatdozent) grimnessVarTriweekly)).cutely();
    }

    public static final <T> boolean marial(SnapshotStateSet<T> snapshotStateSet, Function1<? super Set<T>, Boolean> function1) {
        int iCutely;
        dovishness.beachfront<T> beachfrontVarApical;
        dovishness.beachfront.attabal<T> attabalVarBuilder;
        Boolean boolInvoke;
        formularize formularizeVarDern;
        boolean zSaneness;
        do {
            synchronized (f6209attabal) {
                grimness grimnessVarTriweekly = snapshotStateSet.triweekly();
                Intrinsics.competently(grimnessVarTriweekly, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                privatdozent privatdozentVar = (privatdozent) adultoid.polder((privatdozent) grimnessVarTriweekly);
                iCutely = privatdozentVar.cutely();
                beachfrontVarApical = privatdozentVar.apical();
                Unit unit = Unit.f29295attabal;
            }
            if (beachfrontVarApical != null && (attabalVarBuilder = beachfrontVarApical.builder()) != null) {
                boolInvoke = function1.invoke(attabalVarBuilder);
                dovishness.beachfront<T> beachfrontVarBuild = attabalVarBuilder.build();
                if (Intrinsics.wireman(beachfrontVarBuild, beachfrontVarApical)) {
                    break;
                }
                grimness grimnessVarTriweekly2 = snapshotStateSet.triweekly();
                Intrinsics.competently(grimnessVarTriweekly2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
                privatdozent privatdozentVar2 = (privatdozent) grimnessVarTriweekly2;
                synchronized (adultoid.privatdozent()) {
                    formularizeVarDern = formularize.INSTANCE.dern();
                    zSaneness = saneness((privatdozent) adultoid.underbelly(privatdozentVar2, snapshotStateSet, formularizeVarDern), iCutely, beachfrontVarBuild);
                }
                adultoid.clubfoot(formularizeVarDern, snapshotStateSet);
            } else {
                throw new IllegalStateException("No set to mutate");
            }
        } while (!zSaneness);
        return boolInvoke.booleanValue();
    }

    public static final <T> boolean saneness(privatdozent<T> privatdozentVar, int i, dovishness.beachfront<? extends T> beachfrontVar) {
        boolean z;
        synchronized (f6209attabal) {
            if (privatdozentVar.cutely() == i) {
                privatdozentVar.impassible(beachfrontVar);
                z = true;
                privatdozentVar.formularize(privatdozentVar.cutely() + 1);
            } else {
                z = false;
            }
        }
        return z;
    }

    public static final <T> privatdozent<T> wireman(SnapshotStateSet<T> snapshotStateSet) {
        grimness grimnessVarTriweekly = snapshotStateSet.triweekly();
        Intrinsics.competently(grimnessVarTriweekly, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.<get-readable>>");
        return (privatdozent) adultoid.treadless((privatdozent) grimnessVarTriweekly, snapshotStateSet);
    }
}
