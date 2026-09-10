package p002kotlin.reflect.jvm.internal.impl.types.error;

import byname.dern;
import byname.marial;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.creditor;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impassible;
import p002kotlin.reflect.jvm.internal.impl.descriptors.merc;
import p002kotlin.reflect.jvm.internal.impl.descriptors.stratoscope;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: ErrorModuleDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ErrorModuleDescriptor implements trm {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final marial f31754arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final taiyuan f31755graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final ErrorModuleDescriptor f31756kowloon = new ErrorModuleDescriptor();

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final Set<trm> f31757molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final List<trm> f31758monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final List<trm> f31759polloi;

    static {
        marial marialVarImpassible = marial.impassible(ErrorEntity.ERROR_MODULE.getDebugText());
        Intrinsics.checkNotNullExpressionValue(marialVarImpassible, "special(...)");
        f31754arytenoidectomy = marialVarImpassible;
        f31758monoploid = adultoid.formularize();
        f31759polloi = adultoid.formularize();
        f31757molybdenite = creditor.marial();
        f31755graveside = saneness.saneness(new Function0<DefaultBuiltIns>() { // from class: kotlin.reflect.jvm.internal.impl.types.error.ErrorModuleDescriptor$builtIns$2
            @Override // p002kotlin.jvm.functions.Function0
            public final DefaultBuiltIns invoke() {
                return DefaultBuiltIns.f29624impromptu.attabal();
            }
        });
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.trm
    public beachfront apical() {
        return (beachfront) f31755graveside.getValue();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public <R, D> R dovishness(impassible<R, D> visitor, D d) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.attabal
    public p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial getAnnotations() {
        return p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.saneness();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.yemenite
    public marial getName() {
        return timberyard();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.trm
    public <T> T hardpan(stratoscope<T> capability) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.trm
    public merc hydrovane(dern fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.trm
    public List<trm> palmyra() {
        return f31759polloi;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.trm
    public Collection<dern> polloi(dern fqName, Function1<? super marial, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return adultoid.formularize();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public apical saneness() {
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.trm
    public boolean sealless(trm targetModule) {
        Intrinsics.checkNotNullParameter(targetModule, "targetModule");
        return false;
    }

    public marial timberyard() {
        return f31754arytenoidectomy;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public apical attabal() {
        return this;
    }
}
