package vinyl;

import com.ironsource.C3414a2;
import java.lang.annotation.Annotation;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: CollectionDescriptors.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010%\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001bR\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0001\u0005*+,-.¨\u0006/"}, d2 = {"Lvinyl/milliradian;", "Lbristol/beachfront;", "elementDescriptor", "<init>", "(Lbristol/beachfront;)V", "", "index", "", "marial", "(I)Ljava/lang/String;", "name", "dern", "(Ljava/lang/String;)I", "", "taiyuan", "(I)Z", "", "", "beachfront", "(I)Ljava/util/List;", "competently", "(I)Lbristol/beachfront;", "", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "attabal", "Lbristol/beachfront;", "getElementDescriptor", "()Lbristol/beachfront;", "saneness", "I", "wireman", "elementsCount", "Lbristol/impassible;", "getKind", "()Lbristol/impassible;", "kind", "Lvinyl/wireman;", "Lvinyl/marial;", "Lvinyl/creditor;", "Lvinyl/premeiotic;", "Lvinyl/homozygous;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class milliradian implements bristol.beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final bristol.beachfront elementDescriptor;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final int elementsCount;

    public /* synthetic */ milliradian(bristol.beachfront beachfrontVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(beachfrontVar);
    }

    @Override // bristol.beachfront
    public List<Annotation> beachfront(int index) {
        if (index >= 0) {
            return p002kotlin.collections.adultoid.formularize();
        }
        throw new IllegalArgumentException(("Illegal index " + index + ", " + impromptu() + " expects only non-negative indices").toString());
    }

    @Override // bristol.beachfront
    public bristol.beachfront competently(int index) {
        if (index >= 0) {
            return this.elementDescriptor;
        }
        throw new IllegalArgumentException(("Illegal index " + index + ", " + impromptu() + " expects only non-negative indices").toString());
    }

    @Override // bristol.beachfront
    public int dern(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer intOrNull = StringsKt.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof milliradian)) {
            return false;
        }
        milliradian milliradianVar = (milliradian) other;
        return Intrinsics.wireman(this.elementDescriptor, milliradianVar.elementDescriptor) && Intrinsics.wireman(impromptu(), milliradianVar.impromptu());
    }

    @Override // bristol.beachfront
    public List<Annotation> getAnnotations() {
        return bristol.beachfront.attabal.attabal(this);
    }

    @Override // bristol.beachfront
    public bristol.impassible getKind() {
        return bristol.triweekly.saneness.f15181attabal;
    }

    public int hashCode() {
        return (this.elementDescriptor.hashCode() * 31) + impromptu().hashCode();
    }

    @Override // bristol.beachfront
    public boolean isInline() {
        return bristol.beachfront.attabal.saneness(this);
    }

    @Override // bristol.beachfront
    public String marial(int index) {
        return String.valueOf(index);
    }

    @Override // bristol.beachfront
    public boolean saneness() {
        return bristol.beachfront.attabal.dern(this);
    }

    @Override // bristol.beachfront
    public boolean taiyuan(int index) {
        if (index >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + index + ", " + impromptu() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return impromptu() + '(' + this.elementDescriptor + ')';
    }

    @Override // bristol.beachfront
    /* JADX INFO: renamed from: wireman, reason: from getter */
    public int getElementsCount() {
        return this.elementsCount;
    }

    public milliradian(bristol.beachfront beachfrontVar) {
        this.elementDescriptor = beachfrontVar;
        this.elementsCount = 1;
    }
}
