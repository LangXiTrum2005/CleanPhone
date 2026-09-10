package vinyl;

import com.ironsource.C3414a2;
import java.util.Arrays;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InlineClassDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lvinyl/hydrovane;", "Lvinyl/vesuvio;", "", "name", "Lvinyl/grimness;", "generatedSerializer", "<init>", "(Ljava/lang/String;Lvinyl/grimness;)V", "", "hashCode", "()I", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "impassible", "Z", "isInline", "()Z", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class hydrovane extends vesuvio {

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public final boolean isInline;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hydrovane(String name, grimness<?> generatedSerializer) {
        super(name, generatedSerializer, 1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(generatedSerializer, "generatedSerializer");
        this.isInline = true;
    }

    @Override // vinyl.vesuvio
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof hydrovane)) {
            return false;
        }
        bristol.beachfront beachfrontVar = (bristol.beachfront) other;
        if (!Intrinsics.wireman(getSerialName(), beachfrontVar.getSerialName())) {
            return false;
        }
        hydrovane hydrovaneVar = (hydrovane) other;
        if (!hydrovaneVar.getIsInline() || !Arrays.equals(graveside(), hydrovaneVar.graveside()) || getElementsCount() != beachfrontVar.getElementsCount()) {
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

    @Override // vinyl.vesuvio
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // vinyl.vesuvio, bristol.beachfront
    /* JADX INFO: renamed from: isInline, reason: from getter */
    public boolean getIsInline() {
        return this.isInline;
    }
}
