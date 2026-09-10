package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import byname.saneness;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IncompatibleVersionErrorData.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class arytenoidectomy<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final T f31447attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final saneness f31448beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final T f31449dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final String f31450marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final T f31451saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final T f31452wireman;

    public arytenoidectomy(T t, T t2, T t3, T t4, String filePath, saneness classId) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.f31447attabal = t;
        this.f31451saneness = t2;
        this.f31449dern = t3;
        this.f31452wireman = t4;
        this.f31450marial = filePath;
        this.f31448beachfront = classId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arytenoidectomy)) {
            return false;
        }
        arytenoidectomy arytenoidectomyVar = (arytenoidectomy) obj;
        return Intrinsics.wireman(this.f31447attabal, arytenoidectomyVar.f31447attabal) && Intrinsics.wireman(this.f31451saneness, arytenoidectomyVar.f31451saneness) && Intrinsics.wireman(this.f31449dern, arytenoidectomyVar.f31449dern) && Intrinsics.wireman(this.f31452wireman, arytenoidectomyVar.f31452wireman) && Intrinsics.wireman(this.f31450marial, arytenoidectomyVar.f31450marial) && Intrinsics.wireman(this.f31448beachfront, arytenoidectomyVar.f31448beachfront);
    }

    public int hashCode() {
        T t = this.f31447attabal;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f31451saneness;
        int iHashCode2 = (iHashCode + (t2 == null ? 0 : t2.hashCode())) * 31;
        T t3 = this.f31449dern;
        int iHashCode3 = (iHashCode2 + (t3 == null ? 0 : t3.hashCode())) * 31;
        T t4 = this.f31452wireman;
        return ((((iHashCode3 + (t4 != null ? t4.hashCode() : 0)) * 31) + this.f31450marial.hashCode()) * 31) + this.f31448beachfront.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f31447attabal + ", compilerVersion=" + this.f31451saneness + ", languageVersion=" + this.f31449dern + ", expectedVersion=" + this.f31452wireman + ", filePath=" + this.f31450marial + ", classId=" + this.f31448beachfront + ')';
    }
}
