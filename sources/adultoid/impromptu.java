package adultoid;

import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.polloi;
import java.util.List;
import oilcan.ComposeStackTraceFrame;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Operation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0014\u001a\u00020\u0010*\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0016\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017*\f\b\u0000\u0010\u0018\"\u00020\u00052\u00020\u0005¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/cig;", "slots", "Landroidx/compose/runtime/wireman;", "", "applier", "", "index", "", "cutely", "(Landroidx/compose/runtime/cig;Landroidx/compose/runtime/wireman;I)V", "impromptu", "(Landroidx/compose/runtime/cig;)I", "Landroidx/compose/runtime/saneness;", "anchor", "taiyuan", "(Landroidx/compose/runtime/cig;Landroidx/compose/runtime/saneness;Landroidx/compose/runtime/wireman;)I", "", "Ladultoid/beachfront;", "errorContext", "writer", "beachfront", "(Ljava/lang/Throwable;Ladultoid/beachfront;Landroidx/compose/runtime/cig;Landroidx/compose/runtime/saneness;)Ljava/lang/Throwable;", "apical", "(Ladultoid/beachfront;Landroidx/compose/runtime/cig;)Ladultoid/beachfront;", "IntParameter", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class impromptu {

    /* JADX INFO: compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"adultoid/impromptu$attabal", "Ladultoid/beachfront;", "", "currentOffset", "", "Loilcan/dern;", "marial", "(Ljava/lang/Integer;)Ljava/util/List;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal implements beachfront {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ SlotWriter f3752arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ beachfront f3753kowloon;

        public attabal(beachfront beachfrontVar, SlotWriter slotWriter) {
            this.f3753kowloon = beachfrontVar;
            this.f3752arytenoidectomy = slotWriter;
        }

        @Override // adultoid.beachfront
        public List<ComposeStackTraceFrame> marial(Integer currentOffset) {
            List<ComposeStackTraceFrame> listMarial = this.f3753kowloon.marial(null);
            int parent = this.f3752arytenoidectomy.getParent();
            if (parent < 0) {
                return listMarial;
            }
            SlotWriter slotWriter = this.f3752arytenoidectomy;
            return CollectionsKt.unconsolidated(oilcan.saneness.saneness(slotWriter, currentOffset, parent, Integer.valueOf(slotWriter.outmarry(parent))), listMarial);
        }
    }

    public static final beachfront apical(beachfront beachfrontVar, SlotWriter slotWriter) {
        return new attabal(beachfrontVar, slotWriter);
    }

    public static final Throwable beachfront(Throwable th, final beachfront beachfrontVar, final SlotWriter slotWriter, final androidx.compose.runtime.saneness sanenessVar) {
        return beachfrontVar == null ? th : oilcan.wireman.saneness(th, new Function0() { // from class: adultoid.competently
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return impromptu.competently(sanenessVar, slotWriter, beachfrontVar);
            }
        });
    }

    public static final List competently(androidx.compose.runtime.saneness sanenessVar, SlotWriter slotWriter, beachfront beachfrontVar) {
        if (sanenessVar != null) {
            slotWriter.basify(sanenessVar);
        }
        List listDern = oilcan.saneness.dern(slotWriter, null, 0, null, 7, null);
        ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) CollectionsKt.picketboat(listDern);
        Integer groupOffset = composeStackTraceFrame != null ? composeStackTraceFrame.getGroupOffset() : null;
        List<ComposeStackTraceFrame> listMarial = beachfrontVar.marial(groupOffset);
        if (groupOffset != null && !listMarial.isEmpty()) {
            listMarial = CollectionsKt.unconsolidated(graveside.marial(ComposeStackTraceFrame.saneness((ComposeStackTraceFrame) CollectionsKt.lerp(listMarial), null, groupOffset, 1, null)), CollectionsKt.premeiotic(listMarial, 1));
        }
        return CollectionsKt.unconsolidated(listDern, listMarial);
    }

    public static final void cutely(SlotWriter slotWriter, androidx.compose.runtime.wireman<Object> wiremanVar, int i) {
        while (!slotWriter.czestochowa(i)) {
            slotWriter.microchemistry();
            if (slotWriter.igbo(slotWriter.getParent())) {
                wiremanVar.impromptu();
            }
            slotWriter.starveling();
        }
    }

    public static final int impromptu(SlotWriter slotWriter) {
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.igbo(parent)) {
            parent = slotWriter.outmarry(parent);
        }
        int iLotta = parent + 1;
        int iHerdbook = 0;
        while (iLotta < currentGroup) {
            if (slotWriter.coi(currentGroup, iLotta)) {
                if (slotWriter.igbo(iLotta)) {
                    iHerdbook = 0;
                }
                iLotta++;
            } else {
                iHerdbook += slotWriter.igbo(iLotta) ? 1 : slotWriter.herdbook(iLotta);
                iLotta += slotWriter.lotta(iLotta);
            }
        }
        return iHerdbook;
    }

    public static final int taiyuan(SlotWriter slotWriter, androidx.compose.runtime.saneness sanenessVar, androidx.compose.runtime.wireman<Object> wiremanVar) {
        int iTrm = slotWriter.trm(sanenessVar);
        if (!(slotWriter.getCurrentGroup() < iTrm)) {
            polloi.adultoid("Check failed");
        }
        cutely(slotWriter, wiremanVar, iTrm);
        int iImpromptu = impromptu(slotWriter);
        while (slotWriter.getCurrentGroup() < iTrm) {
            if (slotWriter.empress(iTrm)) {
                if (slotWriter.wostteth()) {
                    wiremanVar.beachfront(slotWriter.hardpan(slotWriter.getCurrentGroup()));
                    iImpromptu = 0;
                }
                slotWriter.stupefactive();
            } else {
                iImpromptu += slotWriter.licking();
            }
        }
        if (!(slotWriter.getCurrentGroup() == iTrm)) {
            polloi.adultoid("Check failed");
        }
        return iImpromptu;
    }
}
