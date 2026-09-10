package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import byname.dern;
import java.io.InputStream;
import p002kotlin.Pair;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl;
import yeast.formularize;

/* JADX INFO: compiled from: BuiltInsPackageFragmentImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class attabal extends DeserializedPackageFragmentImpl implements p002kotlin.reflect.jvm.internal.impl.builtins.attabal {

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public static final C0702attabal f31454stratoscope = new C0702attabal(null);

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public final boolean f31455cuirassed;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BuiltInsPackageFragmentImpl.kt */
    public static final class C0702attabal {
        public /* synthetic */ C0702attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final attabal attabal(dern fqName, formularize storageManager, trm module, InputStream inputStream, boolean z) {
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(inputStream, "inputStream");
            Pair<ProtoBuf$PackageFragment, recumbency.attabal> pairAttabal = recumbency.dern.attabal(inputStream);
            ProtoBuf$PackageFragment protoBuf$PackageFragmentComponent1 = pairAttabal.component1();
            recumbency.attabal attabalVarComponent2 = pairAttabal.component2();
            if (protoBuf$PackageFragmentComponent1 != null) {
                return new attabal(fqName, storageManager, module, protoBuf$PackageFragmentComponent1, attabalVarComponent2, z, null);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + recumbency.attabal.f36070impromptu + ", actual " + attabalVarComponent2 + ". Please update Kotlin");
        }

        public C0702attabal() {
        }
    }

    public /* synthetic */ attabal(dern dernVar, formularize formularizeVar, trm trmVar, ProtoBuf$PackageFragment protoBuf$PackageFragment, recumbency.attabal attabalVar, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(dernVar, formularizeVar, trmVar, protoBuf$PackageFragment, attabalVar, z);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.gintrap, p002kotlin.reflect.jvm.internal.impl.descriptors.impl.taiyuan
    public String toString() {
        return "builtins package fragment for " + marial() + " from " + DescriptorUtilsKt.arytenoidectomy(this);
    }

    public attabal(dern dernVar, formularize formularizeVar, trm trmVar, ProtoBuf$PackageFragment protoBuf$PackageFragment, recumbency.attabal attabalVar, boolean z) {
        super(dernVar, formularizeVar, trmVar, protoBuf$PackageFragment, attabalVar, null);
        this.f31455cuirassed = z;
    }
}
