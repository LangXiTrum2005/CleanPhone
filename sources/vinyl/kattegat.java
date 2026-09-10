package vinyl;

import com.ironsource.C3414a2;
import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Enums.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R!\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lvinyl/kattegat;", "Lvinyl/vesuvio;", "", "name", "", "elementsCount", "<init>", "(Ljava/lang/String;I)V", "index", "Lbristol/beachfront;", "competently", "(I)Lbristol/beachfront;", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "Lbristol/impassible;", "impassible", "Lbristol/impassible;", "getKind", "()Lbristol/impassible;", "kind", "", "triweekly", "Lpatroclinal/taiyuan;", "cord", "()[Lbristol/beachfront;", "elementDescriptors", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class kattegat extends vesuvio {

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public final bristol.impassible kind;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan elementDescriptors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kattegat(final String name, final int i) {
        super(name, null, i, 2, null);
        Intrinsics.checkNotNullParameter(name, "name");
        this.kind = bristol.impassible.saneness.f15156attabal;
        this.elementDescriptors = p002kotlin.saneness.saneness(new Function0() { // from class: vinyl.sealless
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kattegat.preprohormone(i, name, this);
            }
        });
    }

    public static final bristol.beachfront[] preprohormone(int i, String str, kattegat kattegatVar) {
        bristol.beachfront[] beachfrontVarArr = new bristol.beachfront[i];
        for (int i2 = 0; i2 < i; i2++) {
            beachfrontVarArr[i2] = bristol.formularize.marial(str + '.' + kattegatVar.marial(i2), bristol.triweekly.wireman.f15182attabal, new bristol.beachfront[0], null, 8, null);
        }
        return beachfrontVarArr;
    }

    @Override // vinyl.vesuvio, bristol.beachfront
    public bristol.beachfront competently(int index) {
        return cord()[index];
    }

    public final bristol.beachfront[] cord() {
        return (bristol.beachfront[]) this.elementDescriptors.getValue();
    }

    @Override // vinyl.vesuvio
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof bristol.beachfront)) {
            return false;
        }
        bristol.beachfront beachfrontVar = (bristol.beachfront) other;
        return beachfrontVar.getKind() == bristol.impassible.saneness.f15156attabal && Intrinsics.wireman(getSerialName(), beachfrontVar.getSerialName()) && Intrinsics.wireman(claque.attabal(this), claque.attabal(beachfrontVar));
    }

    @Override // vinyl.vesuvio, bristol.beachfront
    public bristol.impassible getKind() {
        return this.kind;
    }

    @Override // vinyl.vesuvio
    public int hashCode() {
        int iHashCode = getSerialName().hashCode();
        Iterator<String> it = bristol.cutely.saneness(this).iterator();
        int iHashCode2 = 1;
        while (it.hasNext()) {
            int i = iHashCode2 * 31;
            String next = it.next();
            iHashCode2 = i + (next != null ? next.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // vinyl.vesuvio
    public String toString() {
        return CollectionsKt.preterite(bristol.cutely.saneness(this), ", ", getSerialName() + '(', ")", 0, null, null, 56, null);
    }
}
