package com.google.common.cache;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
interface ReferenceEntry<K, V> {
    LocalCache.ValueReference d();

    int g();

    Object getKey();

    ReferenceEntry h();

    ReferenceEntry i();

    ReferenceEntry j();

    ReferenceEntry k();

    void l(ReferenceEntry referenceEntry);

    ReferenceEntry m();

    void n(LocalCache.ValueReference valueReference);

    long o();

    void p(long j);

    long q();

    void r(long j);

    void s(ReferenceEntry referenceEntry);

    void t(ReferenceEntry referenceEntry);

    void u(ReferenceEntry referenceEntry);
}
