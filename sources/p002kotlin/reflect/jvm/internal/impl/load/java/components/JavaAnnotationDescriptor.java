package p002kotlin.reflect.jvm.internal.impl.load.java.components;

import byname.marial;
import genesic.attabal;
import genesic.saneness;
import java.util.Collection;
import java.util.Map;
import kurbash.formularize;
import methylmercury.beachfront;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import yeast.apical;
import yeast.impromptu;

/* JADX INFO: compiled from: JavaAnnotationMapper.kt */
/* JADX INFO: loaded from: classes5.dex */
public class JavaAnnotationDescriptor implements dern, beachfront {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f30362beachfront = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(JavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final byname.dern f30363attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final impromptu f30364dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final boolean f30365marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final walach f30366saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final saneness f30367wireman;

    public JavaAnnotationDescriptor(final wireman c, attabal attabalVar, byname.dern fqName) {
        walach NO_SOURCE;
        Collection<saneness> collectionWireman;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f30363attabal = fqName;
        if (attabalVar == null || (NO_SOURCE = c.attabal().graveside().attabal(attabalVar)) == null) {
            NO_SOURCE = walach.f30274attabal;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        }
        this.f30366saneness = NO_SOURCE;
        this.f30364dern = c.marial().dern(new Function0<merc>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor$type$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final merc invoke() {
                merc mercVarImpassible = c.wireman().apical().kowloon(this.marial()).impassible();
                Intrinsics.checkNotNullExpressionValue(mercVarImpassible, "getDefaultType(...)");
                return mercVarImpassible;
            }
        });
        this.f30367wireman = (attabalVar == null || (collectionWireman = attabalVar.wireman()) == null) ? null : (saneness) CollectionsKt.nosophobia(collectionWireman);
        boolean z = false;
        if (attabalVar != null && attabalVar.impromptu()) {
            z = true;
        }
        this.f30365marial = z;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern
    public Map<marial, competently<?>> attabal() {
        return seminary.taiyuan();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern
    public walach competently() {
        return this.f30366saneness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public merc getType() {
        return (merc) apical.attabal(this.f30364dern, this, f30362beachfront[0]);
    }

    @Override // methylmercury.beachfront
    public boolean impromptu() {
        return this.f30365marial;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern
    public byname.dern marial() {
        return this.f30363attabal;
    }

    public final saneness saneness() {
        return this.f30367wireman;
    }
}
