package vinyl;

import com.ironsource.C3414a2;
import java.lang.annotation.Annotation;
import java.util.List;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NothingSerialDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010(\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0016R\u0014\u0010*\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001c¨\u0006+"}, d2 = {"Lvinyl/preterite;", "Lbristol/beachfront;", "<init>", "()V", "", "index", "", "marial", "(I)Ljava/lang/String;", "name", "dern", "(Ljava/lang/String;)I", "", "taiyuan", "(I)Z", "competently", "(I)Lbristol/beachfront;", "", "", "beachfront", "(I)Ljava/util/List;", "toString", "()Ljava/lang/String;", "", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "attabal", "()Ljava/lang/Void;", "Lbristol/impassible;", "saneness", "Lbristol/impassible;", "getKind", "()Lbristol/impassible;", "kind", "Ljava/lang/String;", "impromptu", "serialName", "wireman", "elementsCount", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class preterite implements bristol.beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final preterite f39468attabal = new preterite();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final bristol.impassible kind = bristol.triweekly.wireman.f15182attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final String serialName = "kotlin.Nothing";

    public final Void attabal() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // bristol.beachfront
    public List<Annotation> beachfront(int index) {
        attabal();
        throw new KotlinNothingValueException();
    }

    @Override // bristol.beachfront
    public bristol.beachfront competently(int index) {
        attabal();
        throw new KotlinNothingValueException();
    }

    @Override // bristol.beachfront
    public int dern(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        attabal();
        throw new KotlinNothingValueException();
    }

    public boolean equals(Object other) {
        return this == other;
    }

    @Override // bristol.beachfront
    public List<Annotation> getAnnotations() {
        return bristol.beachfront.attabal.attabal(this);
    }

    @Override // bristol.beachfront
    public bristol.impassible getKind() {
        return kind;
    }

    public int hashCode() {
        return getSerialName().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // bristol.beachfront
    /* JADX INFO: renamed from: impromptu */
    public String getSerialName() {
        return serialName;
    }

    @Override // bristol.beachfront
    public boolean isInline() {
        return bristol.beachfront.attabal.saneness(this);
    }

    @Override // bristol.beachfront
    public String marial(int index) {
        attabal();
        throw new KotlinNothingValueException();
    }

    @Override // bristol.beachfront
    public boolean saneness() {
        return bristol.beachfront.attabal.dern(this);
    }

    @Override // bristol.beachfront
    public boolean taiyuan(int index) {
        attabal();
        throw new KotlinNothingValueException();
    }

    public String toString() {
        return "NothingSerialDescriptor";
    }

    @Override // bristol.beachfront
    /* JADX INFO: renamed from: wireman */
    public int getElementsCount() {
        return 0;
    }
}
