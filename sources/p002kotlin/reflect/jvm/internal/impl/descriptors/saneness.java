package p002kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import yeast.formularize;

/* JADX INFO: compiled from: typeParameterUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class saneness implements clubfoot {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final apical f30266arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final clubfoot f30267kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final int f30268monoploid;

    public saneness(clubfoot originalDescriptor, apical declarationDescriptor, int i) {
        Intrinsics.checkNotNullParameter(originalDescriptor, "originalDescriptor");
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        this.f30267kowloon = originalDescriptor;
        this.f30266arytenoidectomy = declarationDescriptor;
        this.f30268monoploid = i;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.triweekly
    public walach competently() {
        return this.f30267kowloon.competently();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot
    public Variance cutely() {
        return this.f30267kowloon.cutely();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public <R, D> R dovishness(impassible<R, D> impassibleVar, D d) {
        return (R) this.f30267kowloon.dovishness(impassibleVar, d);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.attabal
    public marial getAnnotations() {
        return this.f30267kowloon.getAnnotations();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot
    public int getIndex() {
        return this.f30268monoploid + this.f30267kowloon.getIndex();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.yemenite
    public byname.marial getName() {
        return this.f30267kowloon.getName();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot
    public List<oilcan> getUpperBounds() {
        return this.f30267kowloon.getUpperBounds();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot
    public boolean graveside() {
        return this.f30267kowloon.graveside();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot
    public boolean grimness() {
        return true;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront
    public merc impassible() {
        return this.f30267kowloon.impassible();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot, p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront
    public permissivist impromptu() {
        return this.f30267kowloon.impromptu();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.formularize, p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public apical saneness() {
        return this.f30266arytenoidectomy;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot
    public formularize supplicat() {
        return this.f30267kowloon.supplicat();
    }

    public String toString() {
        return this.f30267kowloon + "[inner-copy]";
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront, p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public clubfoot attabal() {
        clubfoot clubfootVarAttabal = this.f30267kowloon.attabal();
        Intrinsics.checkNotNullExpressionValue(clubfootVarAttabal, "getOriginal(...)");
        return clubfootVarAttabal;
    }
}
