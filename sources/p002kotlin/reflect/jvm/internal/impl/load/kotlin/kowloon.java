package p002kotlin.reflect.jvm.internal.impl.load.kotlin;

import byname.saneness;
import foreshot.marial;
import genesic.competently;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.polloi;

/* JADX INFO: compiled from: KotlinClassFinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface kowloon extends polloi {

    /* JADX INFO: compiled from: KotlinClassFinder.kt */
    public static abstract class attabal {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.kowloon$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: KotlinClassFinder.kt */
        public static final class C0691attabal extends attabal {
            public final byte[] saneness() {
                throw null;
            }
        }

        /* JADX INFO: compiled from: KotlinClassFinder.kt */
        public static final class saneness extends attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final monoploid f30792attabal;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public final byte[] f30793saneness;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public saneness(monoploid kotlinJvmBinaryClass, byte[] bArr) {
                super(null);
                Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass, "kotlinJvmBinaryClass");
                this.f30792attabal = kotlinJvmBinaryClass;
                this.f30793saneness = bArr;
            }

            public final monoploid saneness() {
                return this.f30792attabal;
            }

            public /* synthetic */ saneness(monoploid monoploidVar, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(monoploidVar, (i & 2) != 0 ? null : bArr);
            }
        }

        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final monoploid attabal() {
            saneness sanenessVar = this instanceof saneness ? (saneness) this : null;
            if (sanenessVar != null) {
                return sanenessVar.saneness();
            }
            return null;
        }

        public attabal() {
        }
    }

    attabal dern(saneness sanenessVar, marial marialVar);

    attabal saneness(competently competentlyVar, marial marialVar);
}
