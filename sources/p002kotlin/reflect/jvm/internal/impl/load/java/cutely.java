package p002kotlin.reflect.jvm.internal.impl.load.java;

import byname.dern;
import byname.saneness;
import genesic.adultoid;
import genesic.competently;
import java.util.Arrays;
import java.util.Set;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JavaClassFinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface cutely {
    competently attabal(attabal attabalVar);

    adultoid dern(dern dernVar, boolean z);

    Set<String> saneness(dern dernVar);

    /* JADX INFO: compiled from: JavaClassFinder.kt */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final saneness f30395attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final competently f30396dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final byte[] f30397saneness;

        public attabal(saneness classId, byte[] bArr, competently competentlyVar) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            this.f30395attabal = classId;
            this.f30397saneness = bArr;
            this.f30396dern = competentlyVar;
        }

        public final saneness attabal() {
            return this.f30395attabal;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof attabal)) {
                return false;
            }
            attabal attabalVar = (attabal) obj;
            return Intrinsics.wireman(this.f30395attabal, attabalVar.f30395attabal) && Intrinsics.wireman(this.f30397saneness, attabalVar.f30397saneness) && Intrinsics.wireman(this.f30396dern, attabalVar.f30396dern);
        }

        public int hashCode() {
            int iHashCode = this.f30395attabal.hashCode() * 31;
            byte[] bArr = this.f30397saneness;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            competently competentlyVar = this.f30396dern;
            return iHashCode2 + (competentlyVar != null ? competentlyVar.hashCode() : 0);
        }

        public String toString() {
            return "Request(classId=" + this.f30395attabal + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f30397saneness) + ", outerClass=" + this.f30396dern + ')';
        }

        public /* synthetic */ attabal(saneness sanenessVar, byte[] bArr, competently competentlyVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(sanenessVar, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? null : competentlyVar);
        }
    }
}
