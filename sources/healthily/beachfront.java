package healthily;

import java.lang.reflect.InvocationTargetException;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid;
import p002kotlin.text.dovishness;

/* JADX INFO: compiled from: ReflectKotlinClass.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class beachfront implements monoploid {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final attabal f27603dern = new attabal(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Class<?> f27604attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final KotlinClassHeader f27605saneness;

    /* JADX INFO: compiled from: ReflectKotlinClass.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final beachfront attabal(Class<?> klass) throws InvocationTargetException {
            Intrinsics.checkNotNullParameter(klass, "klass");
            p002kotlin.reflect.jvm.internal.impl.load.kotlin.header.attabal attabalVar = new p002kotlin.reflect.jvm.internal.impl.load.kotlin.header.attabal();
            dern.f27609attabal.saneness(klass, attabalVar);
            KotlinClassHeader kotlinClassHeaderTriweekly = attabalVar.triweekly();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (kotlinClassHeaderTriweekly == null) {
                return null;
            }
            return new beachfront(klass, kotlinClassHeaderTriweekly, defaultConstructorMarker);
        }

        public attabal() {
        }
    }

    public /* synthetic */ beachfront(Class cls, KotlinClassHeader kotlinClassHeader, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, kotlinClassHeader);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid
    public void attabal(monoploid.wireman visitor, byte[] bArr) throws InvocationTargetException {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        dern.f27609attabal.taiyuan(this.f27604attabal, visitor);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid
    public byname.saneness competently() {
        return ReflectClassUtilKt.attabal(this.f27604attabal);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid
    public void dern(monoploid.dern visitor, byte[] bArr) throws InvocationTargetException {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        dern.f27609attabal.saneness(this.f27604attabal, visitor);
    }

    public boolean equals(Object obj) {
        return (obj instanceof beachfront) && Intrinsics.wireman(this.f27604attabal, ((beachfront) obj).f27604attabal);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid
    public String getLocation() {
        StringBuilder sb = new StringBuilder();
        String name = this.f27604attabal.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb.append(dovishness.merc(name, '.', '/', false, 4, null));
        sb.append(".class");
        return sb.toString();
    }

    public int hashCode() {
        return this.f27604attabal.hashCode();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid
    public KotlinClassHeader saneness() {
        return this.f27605saneness;
    }

    public String toString() {
        return beachfront.class.getName() + ": " + this.f27604attabal;
    }

    public final Class<?> wireman() {
        return this.f27604attabal;
    }

    public beachfront(Class<?> cls, KotlinClassHeader kotlinClassHeader) {
        this.f27604attabal = cls;
        this.f27605saneness = kotlinClassHeader;
    }
}
