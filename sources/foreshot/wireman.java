package foreshot;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JvmMemberSignature.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class wireman {

    /* JADX INFO: compiled from: JvmMemberSignature.kt */
    public static final class attabal extends wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f26290attabal;
        private final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(String name, String desc) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            this.name = name;
            this.f26290attabal = desc;
        }

        @Override // foreshot.wireman
        public String attabal() {
            return dern() + ':' + saneness();
        }

        @Override // foreshot.wireman
        public String dern() {
            return this.name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof attabal)) {
                return false;
            }
            attabal attabalVar = (attabal) obj;
            return Intrinsics.wireman(this.name, attabalVar.name) && Intrinsics.wireman(this.f26290attabal, attabalVar.f26290attabal);
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.f26290attabal.hashCode();
        }

        public final String marial() {
            return this.f26290attabal;
        }

        @Override // foreshot.wireman
        public String saneness() {
            return this.f26290attabal;
        }

        public final String wireman() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: JvmMemberSignature.kt */
    public static final class saneness extends wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f26291attabal;
        private final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public saneness(String name, String desc) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            this.name = name;
            this.f26291attabal = desc;
        }

        public static /* synthetic */ saneness marial(saneness sanenessVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sanenessVar.name;
            }
            if ((i & 2) != 0) {
                str2 = sanenessVar.f26291attabal;
            }
            return sanenessVar.wireman(str, str2);
        }

        @Override // foreshot.wireman
        public String attabal() {
            return dern() + saneness();
        }

        @Override // foreshot.wireman
        public String dern() {
            return this.name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof saneness)) {
                return false;
            }
            saneness sanenessVar = (saneness) obj;
            return Intrinsics.wireman(this.name, sanenessVar.name) && Intrinsics.wireman(this.f26291attabal, sanenessVar.f26291attabal);
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.f26291attabal.hashCode();
        }

        @Override // foreshot.wireman
        public String saneness() {
            return this.f26291attabal;
        }

        public final saneness wireman(String name, String desc) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            return new saneness(name, desc);
        }
    }

    public /* synthetic */ wireman(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String attabal();

    public abstract String dern();

    public abstract String saneness();

    public final String toString() {
        return attabal();
    }

    public wireman() {
    }
}
