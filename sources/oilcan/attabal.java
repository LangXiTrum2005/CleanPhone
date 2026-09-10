package oilcan;

import androidx.compose.runtime.splinterproof;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ComposeStackTraceBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0017\u0010\rJ#\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\"\u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010%¨\u0006'"}, d2 = {"Loilcan/attabal;", "", "<init>", "()V", "", "Loilcan/dern;", "taiyuan", "()Ljava/util/List;", "Landroidx/compose/runtime/splinterproof;", "sourceInformation", "childData", "", "beachfront", "(Landroidx/compose/runtime/splinterproof;Ljava/lang/Object;)V", "Landroidx/compose/runtime/saneness;", "anchor", "competently", "(Landroidx/compose/runtime/saneness;)Landroidx/compose/runtime/splinterproof;", "", "wireman", "(Landroidx/compose/runtime/saneness;)I", "groupSourceInformation", "child", "attabal", "targetChild", "saneness", "(Landroidx/compose/runtime/splinterproof;Ljava/lang/Object;)Loilcan/dern;", "group", "impromptu", "(Ljava/lang/Object;)Landroidx/compose/runtime/splinterproof;", "", "marial", "(Landroidx/compose/runtime/splinterproof;)Z", "target", "dern", "(Landroidx/compose/runtime/splinterproof;Ljava/lang/Object;)Z", "", "Ljava/util/List;", "_trace", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final List<ComposeStackTraceFrame> _trace = new ArrayList();

    public final void attabal(splinterproof groupSourceInformation, Object child) {
        ComposeStackTraceFrame composeStackTraceFrameSaneness = saneness(groupSourceInformation, child);
        if (composeStackTraceFrameSaneness != null) {
            this._trace.add(composeStackTraceFrameSaneness);
        }
    }

    public final void beachfront(splinterproof sourceInformation, Object childData) {
        if (sourceInformation != null) {
            if (childData == null) {
                attabal(sourceInformation, null);
            } else {
                if (dern(sourceInformation, childData) || sourceInformation.getClosed()) {
                    return;
                }
                attabal(sourceInformation, null);
            }
        }
    }

    public abstract splinterproof competently(androidx.compose.runtime.saneness anchor);

    public final boolean dern(splinterproof sourceInformation, Object target) {
        ArrayList<Object> arrayListBeachfront = sourceInformation.beachfront();
        boolean z = false;
        if (arrayListBeachfront == null) {
            if (!sourceInformation.getClosed()) {
                attabal(sourceInformation, null);
                return true;
            }
            int dataStartOffset = sourceInformation.getDataStartOffset();
            int dataEndOffset = sourceInformation.getDataEndOffset();
            if (target instanceof Integer) {
                Number number = (Number) target;
                int iIntValue = number.intValue();
                if ((dataStartOffset <= iIntValue && iIntValue < dataEndOffset) || (dataStartOffset == dataEndOffset && dataStartOffset == number.intValue())) {
                    z = true;
                }
                if (z) {
                    attabal(sourceInformation, null);
                }
            }
            return z;
        }
        int size = arrayListBeachfront.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayListBeachfront.get(i);
            if (obj instanceof androidx.compose.runtime.saneness) {
                if (Intrinsics.wireman(obj, target)) {
                    attabal(sourceInformation, obj);
                    return true;
                }
            } else {
                if (!(obj instanceof splinterproof)) {
                    throw new IllegalStateException(("Unexpected child source info " + obj).toString());
                }
                if (dern((splinterproof) obj, target)) {
                    attabal(sourceInformation, obj);
                    return true;
                }
            }
        }
        return false;
    }

    public final splinterproof impromptu(Object group) {
        if (group instanceof androidx.compose.runtime.saneness) {
            return competently((androidx.compose.runtime.saneness) group);
        }
        if (group instanceof splinterproof) {
            return (splinterproof) group;
        }
        throw new IllegalStateException(("Unexpected child source info " + group).toString());
    }

    public final boolean marial(splinterproof splinterproofVar) {
        String sourceInformation = splinterproofVar.getSourceInformation();
        return sourceInformation != null && p002kotlin.text.dovishness.starveling(sourceInformation, "C", false, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    public final ComposeStackTraceFrame saneness(splinterproof groupSourceInformation, Object targetChild) {
        ArrayList<Object> arrayListBeachfront;
        String sourceInformation = groupSourceInformation.getSourceInformation();
        adultoid adultoidVarMarial = sourceInformation != null ? androidx.compose.runtime.tooling.saneness.marial(sourceInformation) : null;
        if (adultoidVarMarial == null) {
            return null;
        }
        if (targetChild == null) {
            return new ComposeStackTraceFrame(adultoidVarMarial, null);
        }
        ArrayList<Object> arrayListBeachfront2 = groupSourceInformation.beachfront();
        int i = 0;
        if (arrayListBeachfront2 != null) {
            int size = arrayListBeachfront2.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = arrayListBeachfront2.get(i3);
                if (Intrinsics.wireman(obj, targetChild)) {
                    break;
                }
                splinterproof splinterproofVarImpromptu = impromptu(obj);
                if (splinterproofVarImpromptu != null && (splinterproofVarImpromptu.getCom.ironsource.X3.i.W java.lang.String() == -127 || (splinterproofVarImpromptu.getCom.ironsource.X3.i.W java.lang.String() == 0 && (obj instanceof androidx.compose.runtime.saneness) && wireman((androidx.compose.runtime.saneness) obj) == -127))) {
                    if ((splinterproofVarImpromptu != null ? splinterproofVarImpromptu.getSourceInformation() : null) == null) {
                        if (splinterproofVarImpromptu != null && (arrayListBeachfront = splinterproofVarImpromptu.beachfront()) != null) {
                            int size2 = arrayListBeachfront.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                splinterproof splinterproofVarImpromptu2 = impromptu(arrayListBeachfront.get(i4));
                                if (splinterproofVarImpromptu2 != null && marial(splinterproofVarImpromptu2)) {
                                    i2++;
                                }
                            }
                        }
                    } else if (splinterproofVarImpromptu == null) {
                    }
                } else if (splinterproofVarImpromptu == null && marial(splinterproofVarImpromptu)) {
                    i2++;
                }
            }
            i = i2;
        }
        return new ComposeStackTraceFrame(adultoidVarMarial, Integer.valueOf(i));
    }

    public final List<ComposeStackTraceFrame> taiyuan() {
        return this._trace;
    }

    public abstract int wireman(androidx.compose.runtime.saneness anchor);
}
