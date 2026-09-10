package p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.Set;
import p002kotlin.collections.privatdozent;
import p002kotlin.collections.starveling;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import p002kotlin.reflect.jvm.internal.impl.types.gintrap;
import p002kotlin.reflect.jvm.internal.impl.types.merc;

/* JADX INFO: compiled from: JavaTypeAttributes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class attabal extends gintrap {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final boolean f30586beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final boolean f30587competently;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final Set<clubfoot> f30588impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final JavaTypeFlexibility f30589marial;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final merc f30590taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final TypeUsage f30591wireman;

    public /* synthetic */ attabal(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, Set set, merc mercVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeUsage, (i & 2) != 0 ? JavaTypeFlexibility.INFLEXIBLE : javaTypeFlexibility, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : set, (i & 32) != 0 ? null : mercVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ attabal beachfront(attabal attabalVar, TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, Set set, merc mercVar, int i, Object obj) {
        if ((i & 1) != 0) {
            typeUsage = attabalVar.f30591wireman;
        }
        if ((i & 2) != 0) {
            javaTypeFlexibility = attabalVar.f30589marial;
        }
        if ((i & 4) != 0) {
            z = attabalVar.f30586beachfront;
        }
        if ((i & 8) != 0) {
            z2 = attabalVar.f30587competently;
        }
        if ((i & 16) != 0) {
            set = attabalVar.f30588impromptu;
        }
        if ((i & 32) != 0) {
            mercVar = attabalVar.f30590taiyuan;
        }
        Set set2 = set;
        merc mercVar2 = mercVar;
        return attabalVar.marial(typeUsage, javaTypeFlexibility, z, z2, set2, mercVar2);
    }

    public attabal apical(merc mercVar) {
        return beachfront(this, null, null, false, false, null, mercVar, 31, null);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.gintrap
    public merc attabal() {
        return this.f30590taiyuan;
    }

    public final JavaTypeFlexibility competently() {
        return this.f30589marial;
    }

    public final attabal cutely(boolean z) {
        return beachfront(this, null, null, z, false, null, null, 59, null);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.gintrap
    public Set<clubfoot> dern() {
        return this.f30588impromptu;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof attabal)) {
            return false;
        }
        attabal attabalVar = (attabal) obj;
        return Intrinsics.wireman(attabalVar.attabal(), attabal()) && attabalVar.saneness() == saneness() && attabalVar.f30589marial == this.f30589marial && attabalVar.f30586beachfront == this.f30586beachfront && attabalVar.f30587competently == this.f30587competently;
    }

    public final attabal formularize(JavaTypeFlexibility flexibility) {
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        return beachfront(this, null, flexibility, false, false, null, null, 61, null);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.gintrap
    public int hashCode() {
        merc mercVarAttabal = attabal();
        int iHashCode = mercVarAttabal != null ? mercVarAttabal.hashCode() : 0;
        int iHashCode2 = iHashCode + (iHashCode * 31) + saneness().hashCode();
        int iHashCode3 = iHashCode2 + (iHashCode2 * 31) + this.f30589marial.hashCode();
        int i = iHashCode3 + (iHashCode3 * 31) + (this.f30586beachfront ? 1 : 0);
        return i + (i * 31) + (this.f30587competently ? 1 : 0);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.gintrap
    /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
    public attabal wireman(clubfoot typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        return beachfront(this, null, null, false, false, dern() != null ? starveling.formularize(dern(), typeParameter) : privatdozent.wireman(typeParameter), null, 47, null);
    }

    public final boolean impromptu() {
        return this.f30587competently;
    }

    public final attabal marial(TypeUsage howThisTypeIsUsed, JavaTypeFlexibility flexibility, boolean z, boolean z2, Set<? extends clubfoot> set, merc mercVar) {
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        return new attabal(howThisTypeIsUsed, flexibility, z, z2, set, mercVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.gintrap
    public TypeUsage saneness() {
        return this.f30591wireman;
    }

    public final boolean taiyuan() {
        return this.f30586beachfront;
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f30591wireman + ", flexibility=" + this.f30589marial + ", isRaw=" + this.f30586beachfront + ", isForAnnotationParameter=" + this.f30587competently + ", visitedTypeParameters=" + this.f30588impromptu + ", defaultType=" + this.f30590taiyuan + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public attabal(TypeUsage howThisTypeIsUsed, JavaTypeFlexibility flexibility, boolean z, boolean z2, Set<? extends clubfoot> set, merc mercVar) {
        super(howThisTypeIsUsed, set, mercVar);
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        this.f30591wireman = howThisTypeIsUsed;
        this.f30589marial = flexibility;
        this.f30586beachfront = z;
        this.f30587competently = z2;
        this.f30588impromptu = set;
        this.f30590taiyuan = mercVar;
    }
}
