package vinyl;

import com.ironsource.C3414a2;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jacoco.core.internal.instr.InstrSupport;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PluginGeneratedSerialDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010%J\u001b\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070&H\u0002¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010%R\u001a\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010.\u001a\u0004\b/\u0010#R\u0016\u00100\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0003018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00102R\"\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u000104018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00105R\u001e\u00108\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00107R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010:R\"\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010<R%\u0010C\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030>018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR!\u0010G\u001a\b\u0012\u0004\u0012\u00020\u0001018@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bD\u0010@\u001a\u0004\bE\u0010FR\u001b\u0010J\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010@\u001a\u0004\bI\u0010#R\u0014\u0010N\u001a\u00020K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00030R8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010S¨\u0006U"}, d2 = {"Lvinyl/vesuvio;", "Lbristol/beachfront;", "Lvinyl/triweekly;", "", "serialName", "Lvinyl/grimness;", "generatedSerializer", "", "elementsCount", "<init>", "(Ljava/lang/String;Lvinyl/grimness;I)V", "name", "", "isOptional", "", "kowloon", "(Ljava/lang/String;Z)V", "index", "competently", "(I)Lbristol/beachfront;", "taiyuan", "(I)Z", "", "", "beachfront", "(I)Ljava/util/List;", "marial", "(I)Ljava/lang/String;", "dern", "(Ljava/lang/String;)I", "", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "", "monoploid", "()Ljava/util/Map;", "attabal", "Ljava/lang/String;", "impromptu", "saneness", "Lvinyl/grimness;", "I", "wireman", "added", "", "[Ljava/lang/String;", "names", "", "[Ljava/util/List;", "propertiesAnnotations", "Ljava/util/List;", "classAnnotations", "", InstrSupport.DATAFIELD_DESC, "elementsOptionality", "Ljava/util/Map;", "indices", "Lasosan/wireman;", "cutely", "Lpatroclinal/taiyuan;", "molybdenite", "()[Lasosan/wireman;", "childSerializers", "apical", "graveside", "()[Lbristol/beachfront;", "typeParameterDescriptors", "formularize", "adultoid", "_hashCode", "Lbristol/impassible;", "getKind", "()Lbristol/impassible;", "kind", "getAnnotations", "()Ljava/util/List;", "annotations", "", "()Ljava/util/Set;", "serialNames", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class vesuvio implements bristol.beachfront, triweekly {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan typeParameterDescriptors;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final String serialName;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final List<Annotation>[] propertiesAnnotations;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public List<Annotation> classAnnotations;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan childSerializers;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final int elementsCount;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan _hashCode;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public final boolean[] elementsOptionality;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final String[] names;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final grimness<?> generatedSerializer;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public Map<String, Integer> indices;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public int added;

    public vesuvio(String serialName, grimness<?> grimnessVar, int i) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.serialName = serialName;
        this.generatedSerializer = grimnessVar;
        this.elementsCount = i;
        this.added = -1;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.names = strArr;
        int i3 = this.elementsCount;
        this.propertiesAnnotations = new List[i3];
        this.elementsOptionality = new boolean[i3];
        this.indices = p002kotlin.collections.seminary.taiyuan();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.childSerializers = p002kotlin.saneness.attabal(lazyThreadSafetyMode, new Function0() { // from class: vinyl.technofreak
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return vesuvio.polloi(this.f39503kowloon);
            }
        });
        this.typeParameterDescriptors = p002kotlin.saneness.attabal(lazyThreadSafetyMode, new Function0() { // from class: vinyl.outmarry
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return vesuvio.gintrap(this.f39455kowloon);
            }
        });
        this._hashCode = p002kotlin.saneness.attabal(lazyThreadSafetyMode, new Function0() { // from class: vinyl.dhss
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(vesuvio.triweekly(this.f39387kowloon));
            }
        });
    }

    private final int adultoid() {
        return ((Number) this._hashCode.getValue()).intValue();
    }

    public static /* synthetic */ void arytenoidectomy(vesuvio vesuvioVar, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        vesuvioVar.kowloon(str, z);
    }

    public static final CharSequence dovishness(vesuvio vesuvioVar, int i) {
        return vesuvioVar.marial(i) + ": " + vesuvioVar.competently(i).getSerialName();
    }

    public static final bristol.beachfront[] gintrap(vesuvio vesuvioVar) {
        ArrayList arrayList;
        asosan.wireman<?>[] wiremanVarArrTypeParametersSerializers;
        grimness<?> grimnessVar = vesuvioVar.generatedSerializer;
        if (grimnessVar == null || (wiremanVarArrTypeParametersSerializers = grimnessVar.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(wiremanVarArrTypeParametersSerializers.length);
            for (asosan.wireman<?> wiremanVar : wiremanVarArrTypeParametersSerializers) {
                arrayList.add(wiremanVar.getDescriptor());
            }
        }
        return claque.saneness(arrayList);
    }

    public static final asosan.wireman[] polloi(vesuvio vesuvioVar) {
        asosan.wireman<?>[] wiremanVarArrChildSerializers;
        grimness<?> grimnessVar = vesuvioVar.generatedSerializer;
        return (grimnessVar == null || (wiremanVarArrChildSerializers = grimnessVar.childSerializers()) == null) ? mastfed.f39434attabal : wiremanVarArrChildSerializers;
    }

    public static final int triweekly(vesuvio vesuvioVar) {
        return setterwort.attabal(vesuvioVar, vesuvioVar.graveside());
    }

    @Override // vinyl.triweekly
    public Set<String> attabal() {
        return this.indices.keySet();
    }

    @Override // bristol.beachfront
    public List<Annotation> beachfront(int index) {
        List<Annotation> list = this.propertiesAnnotations[index];
        return list == null ? p002kotlin.collections.adultoid.formularize() : list;
    }

    @Override // bristol.beachfront
    public bristol.beachfront competently(int index) {
        return molybdenite()[index].getDescriptor();
    }

    @Override // bristol.beachfront
    public int dern(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = this.indices.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof vesuvio)) {
            return false;
        }
        bristol.beachfront beachfrontVar = (bristol.beachfront) other;
        if (!Intrinsics.wireman(getSerialName(), beachfrontVar.getSerialName()) || !Arrays.equals(graveside(), ((vesuvio) other).graveside()) || getElementsCount() != beachfrontVar.getElementsCount()) {
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
        List<Annotation> list = this.classAnnotations;
        return list == null ? p002kotlin.collections.adultoid.formularize() : list;
    }

    @Override // bristol.beachfront
    public bristol.impassible getKind() {
        return bristol.triweekly.attabal.f15179attabal;
    }

    public final bristol.beachfront[] graveside() {
        return (bristol.beachfront[]) this.typeParameterDescriptors.getValue();
    }

    public int hashCode() {
        return adultoid();
    }

    @Override // bristol.beachfront
    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public String getSerialName() {
        return this.serialName;
    }

    @Override // bristol.beachfront
    /* JADX INFO: renamed from: isInline */
    public boolean getIsInline() {
        return bristol.beachfront.attabal.saneness(this);
    }

    public final void kowloon(String name, boolean isOptional) {
        Intrinsics.checkNotNullParameter(name, "name");
        String[] strArr = this.names;
        int i = this.added + 1;
        this.added = i;
        strArr[i] = name;
        this.elementsOptionality[i] = isOptional;
        this.propertiesAnnotations[i] = null;
        if (i == this.elementsCount - 1) {
            this.indices = monoploid();
        }
    }

    @Override // bristol.beachfront
    public String marial(int index) {
        return this.names[index];
    }

    public final asosan.wireman<?>[] molybdenite() {
        return (asosan.wireman[]) this.childSerializers.getValue();
    }

    public final Map<String, Integer> monoploid() {
        HashMap map = new HashMap();
        int length = this.names.length;
        for (int i = 0; i < length; i++) {
            map.put(this.names[i], Integer.valueOf(i));
        }
        return map;
    }

    @Override // bristol.beachfront
    public boolean saneness() {
        return bristol.beachfront.attabal.dern(this);
    }

    @Override // bristol.beachfront
    public boolean taiyuan(int index) {
        return this.elementsOptionality[index];
    }

    public String toString() {
        return CollectionsKt.preterite(p002kotlin.ranges.wireman.monoploid(0, this.elementsCount), ", ", getSerialName() + '(', ")", 0, null, new Function1() { // from class: vinyl.herdbook
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vesuvio.dovishness(this.f39401kowloon, ((Integer) obj).intValue());
            }
        }, 24, null);
    }

    @Override // bristol.beachfront
    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final int getElementsCount() {
        return this.elementsCount;
    }

    public /* synthetic */ vesuvio(String str, grimness grimnessVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : grimnessVar, i);
    }
}
