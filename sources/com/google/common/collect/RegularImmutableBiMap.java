package com.google.common.collect;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class RegularImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {
    public static final RegularImmutableBiMap j0 = new RegularImmutableBiMap();
    public final transient Object e0;
    public final transient Object[] f0;
    public final transient int g0;
    public final transient int h0;
    public final transient RegularImmutableBiMap i0;

    public RegularImmutableBiMap() {
        this.e0 = null;
        this.f0 = new Object[0];
        this.g0 = 0;
        this.h0 = 0;
        this.i0 = this;
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.BiMap
    public final BiMap H() {
        return this.i0;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet g() {
        return new RegularImmutableMap.EntrySet(this, this.f0, this.g0, this.h0);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Object get(Object obj) {
        Object objW = RegularImmutableMap.w(this.e0, this.f0, this.h0, this.g0, obj);
        if (objW == null) {
            return null;
        }
        return objW;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet h() {
        return new RegularImmutableMap.KeySet(this, new RegularImmutableMap.KeysOrValuesAsList(this.f0, this.g0, this.h0));
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean l() {
        return false;
    }

    @Override // java.util.Map
    public final int size() {
        return this.h0;
    }

    @Override // com.google.common.collect.ImmutableBiMap
    /* JADX INFO: renamed from: u */
    public final ImmutableBiMap H() {
        return this.i0;
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return super.writeReplace();
    }

    public RegularImmutableBiMap(Object obj, Object[] objArr, int i2, RegularImmutableBiMap regularImmutableBiMap) {
        this.e0 = obj;
        this.f0 = objArr;
        this.g0 = 1;
        this.h0 = i2;
        this.i0 = regularImmutableBiMap;
    }

    public RegularImmutableBiMap(Object[] objArr, int i2) {
        this.f0 = objArr;
        this.h0 = i2;
        this.g0 = 0;
        int iS = i2 >= 2 ? ImmutableSet.s(i2) : 0;
        Object objV = RegularImmutableMap.v(objArr, i2, iS, 0);
        if (!(objV instanceof Object[])) {
            this.e0 = objV;
            Object objV2 = RegularImmutableMap.v(objArr, i2, iS, 1);
            if (!(objV2 instanceof Object[])) {
                this.i0 = new RegularImmutableBiMap(objV2, objArr, i2, this);
                return;
            }
            throw ((ImmutableMap.Builder.DuplicateKey) ((Object[]) objV2)[2]).a();
        }
        throw ((ImmutableMap.Builder.DuplicateKey) ((Object[]) objV)[2]).a();
    }
}
