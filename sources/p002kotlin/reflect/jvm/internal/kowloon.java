package p002kotlin.reflect.jvm.internal;

import dehydration.attabal;
import java.util.Collections;
import java.util.List;
import kurbash.apical;
import kurbash.arytenoidectomy;
import kurbash.beachfront;
import kurbash.competently;
import kurbash.cutely;
import kurbash.impassible;
import kurbash.impromptu;
import kurbash.triweekly;
import kurbash.wireman;
import p002kotlin.jvm.internal.CallableReference;
import p002kotlin.jvm.internal.FunctionReference;
import p002kotlin.jvm.internal.Lambda;
import p002kotlin.jvm.internal.MutablePropertyReference0;
import p002kotlin.jvm.internal.MutablePropertyReference1;
import p002kotlin.jvm.internal.PropertyReference0;
import p002kotlin.jvm.internal.PropertyReference1;
import p002kotlin.jvm.internal.PropertyReference2;
import p002kotlin.jvm.internal.formularize;
import p002kotlin.jvm.internal.molybdenite;
import p002kotlin.reflect.KTypeProjection;
import p002kotlin.reflect.jvm.ReflectLambdaKt;

/* JADX INFO: compiled from: ReflectionFactoryImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class kowloon extends molybdenite {
    public static KDeclarationContainerImpl impassible(CallableReference callableReference) {
        competently owner = callableReference.getOwner();
        return owner instanceof KDeclarationContainerImpl ? (KDeclarationContainerImpl) owner : marial.f31929polloi;
    }

    @Override // p002kotlin.jvm.internal.molybdenite
    public String apical(Lambda lambda) {
        return cutely(lambda);
    }

    @Override // p002kotlin.jvm.internal.molybdenite
    public impromptu attabal(FunctionReference functionReference) {
        return new KFunctionImpl(impassible(functionReference), functionReference.getName(), functionReference.getSignature(), functionReference.getBoundReceiver());
    }

    @Override // p002kotlin.jvm.internal.molybdenite
    public apical beachfront(MutablePropertyReference1 mutablePropertyReference1) {
        return new KMutableProperty1Impl(impassible(mutablePropertyReference1), mutablePropertyReference1.getName(), mutablePropertyReference1.getSignature(), mutablePropertyReference1.getBoundReceiver());
    }

    @Override // p002kotlin.jvm.internal.molybdenite
    public impassible competently(PropertyReference0 propertyReference0) {
        return new KProperty0Impl(impassible(propertyReference0), propertyReference0.getName(), propertyReference0.getSignature(), propertyReference0.getBoundReceiver());
    }

    @Override // p002kotlin.jvm.internal.molybdenite
    public String cutely(formularize formularizeVar) {
        KFunctionImpl kFunctionImplDern;
        impromptu impromptuVarAttabal = ReflectLambdaKt.attabal(formularizeVar);
        return (impromptuVarAttabal == null || (kFunctionImplDern = molybdenite.dern(impromptuVarAttabal)) == null) ? super.cutely(formularizeVar) : ReflectionObjectRenderer.f29548attabal.marial(kFunctionImplDern.trm());
    }

    @Override // p002kotlin.jvm.internal.molybdenite
    public competently dern(Class cls, String str) {
        return CachesKt.wireman(cls);
    }

    @Override // p002kotlin.jvm.internal.molybdenite
    public arytenoidectomy formularize(beachfront beachfrontVar, List<KTypeProjection> list, boolean z) {
        return beachfrontVar instanceof p002kotlin.jvm.internal.beachfront ? CachesKt.attabal(((p002kotlin.jvm.internal.beachfront) beachfrontVar).competently(), list, z) : attabal.saneness(beachfrontVar, list, z, Collections.EMPTY_LIST);
    }

    @Override // p002kotlin.jvm.internal.molybdenite
    public triweekly impromptu(PropertyReference1 propertyReference1) {
        return new KProperty1Impl(impassible(propertyReference1), propertyReference1.getName(), propertyReference1.getSignature(), propertyReference1.getBoundReceiver());
    }

    @Override // p002kotlin.jvm.internal.molybdenite
    public cutely marial(MutablePropertyReference0 mutablePropertyReference0) {
        return new KMutableProperty0Impl(impassible(mutablePropertyReference0), mutablePropertyReference0.getName(), mutablePropertyReference0.getSignature(), mutablePropertyReference0.getBoundReceiver());
    }

    @Override // p002kotlin.jvm.internal.molybdenite
    public wireman saneness(Class cls) {
        return CachesKt.dern(cls);
    }

    @Override // p002kotlin.jvm.internal.molybdenite
    public kurbash.kowloon taiyuan(PropertyReference2 propertyReference2) {
        return new KProperty2Impl(impassible(propertyReference2), propertyReference2.getName(), propertyReference2.getSignature());
    }

    @Override // p002kotlin.jvm.internal.molybdenite
    public arytenoidectomy wireman(arytenoidectomy arytenoidectomyVar) {
        return monoploid.attabal(arytenoidectomyVar);
    }
}
