package androidx.compose.runtime;

import androidx.collection.ObjectList;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00000\u000b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/lerp;", "", "Landroidx/compose/runtime/cosy;", "slotTable", "<init>", "(Landroidx/compose/runtime/cosy;)V", "Landroidx/compose/runtime/wireman;", "applier", "Landroidx/collection/ObjectList;", "Landroidx/compose/runtime/nosophobia;", "references", "Landroidx/collection/walach;", "marial", "(Landroidx/compose/runtime/wireman;Landroidx/collection/ObjectList;)Landroidx/collection/walach;", "attabal", "Landroidx/compose/runtime/cosy;", "beachfront", "()Landroidx/compose/runtime/cosy;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lerp {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final cosy slotTable;

    public lerp(cosy cosyVar) {
        this.slotTable = cosyVar;
    }

    public static final void dern(SlotWriter slotWriter, int i) {
        while (slotWriter.getParent() >= 0 && slotWriter.getCurrentGroupEnd() <= i) {
            slotWriter.microchemistry();
            slotWriter.starveling();
        }
    }

    public static final Integer saneness(lerp lerpVar, nosophobia nosophobiaVar) {
        return Integer.valueOf(lerpVar.slotTable.wireman(nosophobiaVar.getAnchor()));
    }

    public static final void wireman(SlotWriter slotWriter, int i) {
        dern(slotWriter, i);
        while (slotWriter.getCurrentGroup() != i && !slotWriter.preterite()) {
            if (i < polloi.sealless(slotWriter)) {
                slotWriter.stupefactive();
            } else {
                slotWriter.licking();
            }
        }
        if (!(slotWriter.getCurrentGroup() == i)) {
            polloi.adultoid("Unexpected slot table structure");
        }
        slotWriter.stupefactive();
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final cosy getSlotTable() {
        return this.slotTable;
    }

    public final androidx.collection.walach<nosophobia, lerp> marial(wireman<?> applier, ObjectList<nosophobia> references) {
        Object[] objArr = references.content;
        int i = references._size;
        byte b = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            boolean z3 = true;
            if (i4 >= i) {
                break;
            }
            if (!this.slotTable.rotuma(((nosophobia) objArr[i4]).getAnchor())) {
                androidx.collection.seminary seminaryVar = new androidx.collection.seminary(b == true ? 1 : 0, z3 ? 1 : 0, null);
                Object[] objArr2 = references.content;
                int i5 = references._size;
                for (int i6 = i2; i6 < i5; i6++) {
                    Object obj = objArr2[i6];
                    if (this.slotTable.rotuma(((nosophobia) obj).getAnchor())) {
                        seminaryVar.triweekly(obj);
                    }
                }
                references = seminaryVar;
                break;
            }
            i4++;
        }
        ObjectList objectListWireman = androidx.compose.runtime.collection.attabal.wireman(references, new Function1() { // from class: androidx.compose.runtime.coffeecake
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return lerp.saneness(this.f5872kowloon, (nosophobia) obj2);
            }
        });
        if (objectListWireman.competently()) {
            return androidx.collection.peridotite.attabal();
        }
        androidx.collection.grimness grimnessVarDern = androidx.collection.peridotite.dern();
        SlotWriter slotWriterGintrap = this.slotTable.gintrap();
        try {
            Object[] objArr3 = objectListWireman.content;
            int i7 = objectListWireman._size;
            for (int i8 = i3; i8 < i7; i8++) {
                nosophobia nosophobiaVar = (nosophobia) objArr3[i8];
                int iTrm = slotWriterGintrap.trm(nosophobiaVar.getAnchor());
                int iOutmarry = slotWriterGintrap.outmarry(iTrm);
                dern(slotWriterGintrap, iOutmarry);
                wireman(slotWriterGintrap, iOutmarry);
                slotWriterGintrap.cuirassed(iTrm - slotWriterGintrap.getCurrentGroup());
                grimnessVarDern.graveside(nosophobiaVar, polloi.rotuma(nosophobiaVar.getComposition(), nosophobiaVar, slotWriterGintrap, applier));
            }
            dern(slotWriterGintrap, Integer.MAX_VALUE);
            Unit unit = Unit.f29295attabal;
            return grimnessVarDern;
        } finally {
            slotWriterGintrap.restrictive(z);
        }
    }
}
