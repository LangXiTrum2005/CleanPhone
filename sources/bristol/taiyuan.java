package bristol;

import com.ironsource.C3414a2;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jacoco.core.internal.instr.InstrSupport;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.IndexedValue;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.polloi;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import vinyl.claque;
import vinyl.setterwort;

/* JADX INFO: compiled from: SerialDescriptors.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010$R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b-\u0010\"R \u00101\u001a\b\u0012\u0004\u0012\u00020\u00150\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u00105\u001a\b\u0012\u0004\u0012\u00020\u0003028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b%\u00104R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0003068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00107R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00109R \u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\t068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010>R \u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u00109R\u001b\u0010I\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010\"¨\u0006J"}, d2 = {"Lbristol/taiyuan;", "Lbristol/beachfront;", "Lvinyl/triweekly;", "", "serialName", "Lbristol/impassible;", "kind", "", "elementsCount", "", "typeParameters", "Lbristol/attabal;", "builder", "<init>", "(Ljava/lang/String;Lbristol/impassible;ILjava/util/List;Lbristol/attabal;)V", "index", "marial", "(I)Ljava/lang/String;", "name", "dern", "(Ljava/lang/String;)I", "", "beachfront", "(I)Ljava/util/List;", "competently", "(I)Lbristol/beachfront;", "", "taiyuan", "(I)Z", "", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "attabal", "Ljava/lang/String;", "impromptu", "saneness", "Lbristol/impassible;", "getKind", "()Lbristol/impassible;", "I", "wireman", "Ljava/util/List;", "getAnnotations", "()Ljava/util/List;", "annotations", "", "Ljava/util/Set;", "()Ljava/util/Set;", "serialNames", "", "[Ljava/lang/String;", "elementNames", "[Lbristol/beachfront;", "elementDescriptors", "[Ljava/util/List;", "elementAnnotations", "", InstrSupport.DATAFIELD_DESC, "elementOptionality", "", "cutely", "Ljava/util/Map;", "name2Index", "apical", "typeParametersDescriptors", "formularize", "Lpatroclinal/taiyuan;", "impassible", "_hashCode", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class taiyuan implements beachfront, vinyl.triweekly {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public final beachfront[] typeParametersDescriptors;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final String serialName;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final String[] elementNames;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final beachfront[] elementDescriptors;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public final Map<String, Integer> name2Index;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final int elementsCount;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan _hashCode;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public final List<Annotation>[] elementAnnotations;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final Set<String> serialNames;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final impassible kind;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public final boolean[] elementOptionality;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final List<Annotation> annotations;

    public taiyuan(String serialName, impassible kind, int i, List<? extends beachfront> typeParameters, attabal builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.serialName = serialName;
        this.kind = kind;
        this.elementsCount = i;
        this.annotations = builder.dern();
        this.serialNames = CollectionsKt.libyan(builder.beachfront());
        String[] strArr = (String[]) builder.beachfront().toArray(new String[0]);
        this.elementNames = strArr;
        this.elementDescriptors = claque.saneness(builder.marial());
        this.elementAnnotations = (List[]) builder.wireman().toArray(new List[0]);
        this.elementOptionality = CollectionsKt.homozygous(builder.competently());
        Iterable<IndexedValue> iterableLibyan = polloi.libyan(strArr);
        ArrayList arrayList = new ArrayList(dovishness.gintrap(iterableLibyan, 10));
        for (IndexedValue indexedValue : iterableLibyan) {
            arrayList.add(patroclinal.formularize.attabal(indexedValue.wireman(), Integer.valueOf(indexedValue.dern())));
        }
        this.name2Index = seminary.dovishness(arrayList);
        this.typeParametersDescriptors = claque.saneness(typeParameters);
        this._hashCode = p002kotlin.saneness.saneness(new Function0() { // from class: bristol.competently
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(taiyuan.formularize(this.f15145kowloon));
            }
        });
    }

    public static final int formularize(taiyuan taiyuanVar) {
        return setterwort.attabal(taiyuanVar, taiyuanVar.typeParametersDescriptors);
    }

    public static final CharSequence triweekly(taiyuan taiyuanVar, int i) {
        return taiyuanVar.marial(i) + ": " + taiyuanVar.competently(i).getSerialName();
    }

    @Override // vinyl.triweekly
    public Set<String> attabal() {
        return this.serialNames;
    }

    @Override // bristol.beachfront
    public List<Annotation> beachfront(int index) {
        return this.elementAnnotations[index];
    }

    @Override // bristol.beachfront
    public beachfront competently(int index) {
        return this.elementDescriptors[index];
    }

    @Override // bristol.beachfront
    public int dern(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = this.name2Index.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof taiyuan)) {
            return false;
        }
        beachfront beachfrontVar = (beachfront) other;
        if (!Intrinsics.wireman(getSerialName(), beachfrontVar.getSerialName()) || !Arrays.equals(this.typeParametersDescriptors, ((taiyuan) other).typeParametersDescriptors) || getElementsCount() != beachfrontVar.getElementsCount()) {
            return false;
        }
        int elementsCount = getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            if (!Intrinsics.wireman(competently(i).getSerialName(), beachfrontVar.competently(i).getSerialName()) || !Intrinsics.wireman(competently(i).getKind(), beachfrontVar.competently(i).getKind())) {
                return false;
            }
        }
        return true;
    }

    @Override // bristol.beachfront
    public List<Annotation> getAnnotations() {
        return this.annotations;
    }

    @Override // bristol.beachfront
    public impassible getKind() {
        return this.kind;
    }

    public int hashCode() {
        return impassible();
    }

    public final int impassible() {
        return ((Number) this._hashCode.getValue()).intValue();
    }

    @Override // bristol.beachfront
    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public String getSerialName() {
        return this.serialName;
    }

    @Override // bristol.beachfront
    /* JADX INFO: renamed from: isInline */
    public boolean getIsInline() {
        return beachfront.attabal.saneness(this);
    }

    @Override // bristol.beachfront
    public String marial(int index) {
        return this.elementNames[index];
    }

    @Override // bristol.beachfront
    public boolean saneness() {
        return beachfront.attabal.dern(this);
    }

    @Override // bristol.beachfront
    public boolean taiyuan(int index) {
        return this.elementOptionality[index];
    }

    public String toString() {
        return CollectionsKt.preterite(p002kotlin.ranges.wireman.monoploid(0, getElementsCount()), ", ", getSerialName() + '(', ")", 0, null, new Function1() { // from class: bristol.impromptu
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return taiyuan.triweekly(this.f15157kowloon, ((Integer) obj).intValue());
            }
        }, 24, null);
    }

    @Override // bristol.beachfront
    /* JADX INFO: renamed from: wireman, reason: from getter */
    public int getElementsCount() {
        return this.elementsCount;
    }
}
