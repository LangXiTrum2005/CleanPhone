package byname;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.dovishness;

/* JADX INFO: compiled from: CallableId.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class attabal {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final marial f15221beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final dern f15222competently;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final C0136attabal f15223marial = new C0136attabal(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final dern f15224attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final marial f15225dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final dern f15226saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final dern f15227wireman;

    /* JADX INFO: renamed from: byname.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CallableId.kt */
    public static final class C0136attabal {
        public /* synthetic */ C0136attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0136attabal() {
        }
    }

    static {
        marial marialVar = competently.f15238formularize;
        f15221beachfront = marialVar;
        dern dernVarApical = dern.apical(marialVar);
        Intrinsics.checkNotNullExpressionValue(dernVarApical, "topLevel(...)");
        f15222competently = dernVarApical;
    }

    public attabal(dern packageName, dern dernVar, marial callableName, dern dernVar2) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(callableName, "callableName");
        this.f15224attabal = packageName;
        this.f15226saneness = dernVar;
        this.f15225dern = callableName;
        this.f15227wireman = dernVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof attabal)) {
            return false;
        }
        attabal attabalVar = (attabal) obj;
        return Intrinsics.wireman(this.f15224attabal, attabalVar.f15224attabal) && Intrinsics.wireman(this.f15226saneness, attabalVar.f15226saneness) && Intrinsics.wireman(this.f15225dern, attabalVar.f15225dern) && Intrinsics.wireman(this.f15227wireman, attabalVar.f15227wireman);
    }

    public int hashCode() {
        int iHashCode = this.f15224attabal.hashCode() * 31;
        dern dernVar = this.f15226saneness;
        int iHashCode2 = (((iHashCode + (dernVar == null ? 0 : dernVar.hashCode())) * 31) + this.f15225dern.hashCode()) * 31;
        dern dernVar2 = this.f15227wireman;
        return iHashCode2 + (dernVar2 != null ? dernVar2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String strSaneness = this.f15224attabal.saneness();
        Intrinsics.checkNotNullExpressionValue(strSaneness, "asString(...)");
        sb.append(dovishness.merc(strSaneness, '.', '/', false, 4, null));
        sb.append("/");
        dern dernVar = this.f15226saneness;
        if (dernVar != null) {
            sb.append(dernVar);
            sb.append(".");
        }
        sb.append(this.f15225dern);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public /* synthetic */ attabal(dern dernVar, dern dernVar2, marial marialVar, dern dernVar3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dernVar, dernVar2, marialVar, (i & 8) != 0 ? null : dernVar3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public attabal(dern packageName, marial callableName) {
        this(packageName, null, callableName, null, 8, null);
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(callableName, "callableName");
    }
}
