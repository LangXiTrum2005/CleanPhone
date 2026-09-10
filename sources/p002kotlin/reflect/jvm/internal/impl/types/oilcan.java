package p002kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.attabal;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.types.checker.arytenoidectomy;
import p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront;
import presbytery.competently;

/* JADX INFO: compiled from: KotlinType.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class oilcan implements attabal, competently {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public int f31796kowloon;

    public /* synthetic */ oilcan(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: attendance */
    public abstract oilcan libyan(beachfront beachfrontVar);

    public abstract List<timberyard> dhss();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oilcan)) {
            return false;
        }
        oilcan oilcanVar = (oilcan) obj;
        return mastfed() == oilcanVar.mastfed() && arytenoidectomy.f31720attabal.attabal(homozygous(), oilcanVar.homozygous());
    }

    public abstract MemberScope formularize();

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.attabal
    public marial getAnnotations() {
        return taiyuan.attabal(vesuvio());
    }

    public final int hashCode() {
        int i = this.f31796kowloon;
        if (i != 0) {
            return i;
        }
        int iOutmarry = outmarry();
        this.f31796kowloon = iOutmarry;
        return iOutmarry;
    }

    public abstract empress homozygous();

    public abstract boolean mastfed();

    public final int outmarry() {
        return yemenite.attabal(this) ? super.hashCode() : (((setterwort().hashCode() * 31) + dhss().hashCode()) * 31) + (mastfed() ? 1 : 0);
    }

    public abstract permissivist setterwort();

    public abstract overspeculate vesuvio();

    public oilcan() {
    }
}
