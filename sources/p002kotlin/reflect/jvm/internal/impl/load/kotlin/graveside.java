package p002kotlin.reflect.jvm.internal.impl.load.kotlin;

import foreshot.wireman;
import genesis.dern;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;

/* JADX INFO: compiled from: MemberSignature.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class graveside {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final attabal f30756saneness = new attabal(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f30757attabal;

    /* JADX INFO: compiled from: MemberSignature.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final graveside attabal(String name, String desc) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            return new graveside(name + '#' + desc, null);
        }

        public final graveside dern(dern nameResolver, JvmProtoBuf.JvmMethodSignature signature) {
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(signature, "signature");
            return wireman(nameResolver.getString(signature.getName()), nameResolver.getString(signature.getDesc()));
        }

        public final graveside marial(graveside signature, int i) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            return new graveside(signature.attabal() + '@' + i, null);
        }

        public final graveside saneness(wireman signature) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            if (signature instanceof wireman.saneness) {
                return wireman(signature.dern(), signature.saneness());
            }
            if (signature instanceof wireman.attabal) {
                return attabal(signature.dern(), signature.saneness());
            }
            throw new NoWhenBranchMatchedException();
        }

        public final graveside wireman(String name, String desc) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            return new graveside(name + desc, null);
        }

        public attabal() {
        }
    }

    public /* synthetic */ graveside(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String attabal() {
        return this.f30757attabal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof graveside) && Intrinsics.wireman(this.f30757attabal, ((graveside) obj).f30757attabal);
    }

    public int hashCode() {
        return this.f30757attabal.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f30757attabal + ')';
    }

    public graveside(String str) {
        this.f30757attabal = str;
    }
}
