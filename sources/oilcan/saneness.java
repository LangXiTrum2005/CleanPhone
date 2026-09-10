package oilcan;

import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.cosy;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: compiled from: ComposeStackTraceBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u000f2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00110\u0010H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u0003*\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/cig;", "", "child", "", "group", "parent", "", "Loilcan/dern;", "saneness", "(Landroidx/compose/runtime/cig;Ljava/lang/Object;ILjava/lang/Integer;)Ljava/util/List;", "Landroidx/compose/runtime/fastrack;", "attabal", "(Landroidx/compose/runtime/fastrack;)Ljava/util/List;", "competently", "(Landroidx/compose/runtime/fastrack;ILjava/lang/Object;)Ljava/util/List;", "Landroidx/compose/runtime/cosy;", "Lkotlin/Function1;", "", "filter", "Loilcan/monoploid;", "wireman", "(Landroidx/compose/runtime/cosy;Lkotlin/jvm/functions/Function1;)Loilcan/monoploid;", "Landroidx/compose/runtime/graveside;", "context", "marial", "(Landroidx/compose/runtime/cosy;Landroidx/compose/runtime/graveside;)Ljava/lang/Integer;", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class saneness {
    public static final List<ComposeStackTraceFrame> attabal(SlotReader slotReader) {
        if (slotReader.getClosed() || slotReader.getGroupsSize() == 0) {
            return p002kotlin.collections.adultoid.formularize();
        }
        graveside gravesideVar = new graveside(slotReader);
        int parent = slotReader.getParent();
        Object objValueOf = Integer.valueOf(slotReader.rotuma());
        while (parent >= 0) {
            gravesideVar.beachfront(slotReader.getCom.ironsource.A5.R java.lang.String().cuirassed(parent), objValueOf);
            objValueOf = slotReader.attabal(parent);
            parent = slotReader.creditor(parent);
        }
        return gravesideVar.taiyuan();
    }

    public static final Integer beachfront(SlotReader slotReader, androidx.compose.runtime.graveside gravesideVar, int i, int i2) {
        Integer numBeachfront;
        while (i < i2) {
            int iYemenite = slotReader.yemenite(i) + i;
            if (slotReader.sealless(i) && slotReader.trm(i) == 206 && Intrinsics.wireman(slotReader.oilcan(i), androidx.compose.runtime.polloi.restrictive())) {
                slotReader.stratoscope(i, 0);
            }
            if (slotReader.marial(i) && (numBeachfront = beachfront(slotReader, gravesideVar, i + 1, iYemenite)) != null) {
                return Integer.valueOf(numBeachfront.intValue());
            }
            i = iYemenite;
        }
        return null;
    }

    public static final List<ComposeStackTraceFrame> competently(SlotReader slotReader, int i, Object obj) {
        graveside gravesideVar = new graveside(slotReader);
        i = slotReader.creditor(i);
        androidx.compose.runtime.saneness sanenessVarAttabal = slotReader.attabal(i);
        while (i >= 0) {
            gravesideVar.beachfront(slotReader.getCom.ironsource.A5.R java.lang.String().cuirassed(i), obj);
            if (i >= 0) {
                androidx.compose.runtime.saneness sanenessVar = sanenessVarAttabal;
                sanenessVarAttabal = slotReader.attabal(i);
                i = slotReader.creditor(i);
                obj = sanenessVar;
            } else {
                obj = sanenessVarAttabal;
            }
        }
        return gravesideVar.taiyuan();
    }

    public static /* synthetic */ List dern(SlotWriter slotWriter, Object obj, int i, Integer num, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        if ((i2 & 2) != 0) {
            i = slotWriter.getCurrentGroup();
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        return saneness(slotWriter, obj, i, num);
    }

    public static final Integer marial(cosy cosyVar, androidx.compose.runtime.graveside gravesideVar) {
        SlotReader slotReaderDovishness = cosyVar.dovishness();
        try {
            return beachfront(slotReaderDovishness, gravesideVar, 0, slotReaderDovishness.getGroupsSize());
        } finally {
            slotReaderDovishness.wireman();
        }
    }

    public static final List<ComposeStackTraceFrame> saneness(SlotWriter slotWriter, Object obj, int i, Integer num) {
        int iOutmarry;
        if (slotWriter.getClosed() || slotWriter.milliradian() == 0) {
            return p002kotlin.collections.adultoid.formularize();
        }
        dovishness dovishnessVar = new dovishness(slotWriter);
        if (num != null) {
            iOutmarry = num.intValue();
        } else {
            iOutmarry = slotWriter.getParent() < 0 ? slotWriter.outmarry(i) : slotWriter.getParent();
        }
        if (obj == null) {
            obj = Integer.valueOf(slotWriter.sayid(i));
        }
        while (i >= 0) {
            dovishnessVar.beachfront(slotWriter.sultanate(i), obj);
            obj = slotWriter.stratoscope(i);
            if (iOutmarry >= 0) {
                int i2 = iOutmarry;
                iOutmarry = slotWriter.outmarry(iOutmarry);
                i = i2;
            } else {
                i = iOutmarry;
            }
        }
        return dovishnessVar.taiyuan();
    }

    public static final ObjectLocation wireman(cosy cosyVar, Function1<Object, Boolean> function1) {
        SlotReader slotReaderDovishness = cosyVar.dovishness();
        try {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            while (ref$IntRef.element < cosyVar.getGroupsSize()) {
                if (slotReaderDovishness.merc(ref$IntRef.element) && function1.invoke(slotReaderDovishness.seminary(ref$IntRef.element)).booleanValue()) {
                    ObjectLocation objectLocation = new ObjectLocation(ref$IntRef.element, null);
                    slotReaderDovishness.wireman();
                    return objectLocation;
                }
                int iMathsort = slotReaderDovishness.mathsort(ref$IntRef.element);
                for (int i = 0; i < iMathsort; i++) {
                    if (function1.invoke(slotReaderDovishness.stratoscope(ref$IntRef.element, i)).booleanValue()) {
                        ObjectLocation objectLocation2 = new ObjectLocation(ref$IntRef.element, Integer.valueOf(i));
                        slotReaderDovishness.wireman();
                        return objectLocation2;
                    }
                }
                ref$IntRef.element++;
            }
            Unit unit = Unit.f29295attabal;
            slotReaderDovishness.wireman();
            return null;
        } catch (Throwable th) {
            slotReaderDovishness.wireman();
            throw th;
        }
    }
}
