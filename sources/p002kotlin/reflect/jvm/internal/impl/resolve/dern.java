package p002kotlin.reflect.jvm.internal.impl.resolve;

import p002kotlin.reflect.jvm.internal.impl.descriptors.attabal;
import p002kotlin.reflect.jvm.internal.impl.types.checker.marial;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;

/* JADX INFO: loaded from: classes5.dex */
public class dern implements marial.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final boolean f31343attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final attabal f31344dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final attabal f31345saneness;

    public dern(boolean z, attabal attabalVar, attabal attabalVar2) {
        this.f31343attabal = z;
        this.f31345saneness = attabalVar;
        this.f31344dern = attabalVar2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.marial.attabal
    public boolean attabal(permissivist permissivistVar, permissivist permissivistVar2) {
        return DescriptorEquivalenceForOverrides.wireman(this.f31343attabal, this.f31345saneness, this.f31344dern, permissivistVar, permissivistVar2);
    }
}
