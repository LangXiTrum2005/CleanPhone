package com.google.common.collect;

import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class MapMaker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19892b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19893c = -1;
    public MapMakerInternalMap.Strength d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MapMakerInternalMap.Strength f19894e;
    public Equivalence f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Dummy {
        public static final Dummy X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final /* synthetic */ Dummy[] f19895Y;

        static {
            Dummy dummy = new Dummy("VALUE", 0);
            X = dummy;
            f19895Y = new Dummy[]{dummy};
        }

        public static Dummy valueOf(String str) {
            return (Dummy) Enum.valueOf(Dummy.class, str);
        }

        public static Dummy[] values() {
            return (Dummy[]) f19895Y.clone();
        }
    }

    public final ConcurrentMap a() {
        if (!this.f19891a) {
            int i2 = this.f19892b;
            if (i2 == -1) {
                i2 = 16;
            }
            int i3 = this.f19893c;
            if (i3 == -1) {
                i3 = 4;
            }
            return new ConcurrentHashMap(i2, 0.75f, i3);
        }
        MapMakerInternalMap.AnonymousClass1 anonymousClass1 = MapMakerInternalMap.k0;
        MapMakerInternalMap.Strength strength = this.d;
        MapMakerInternalMap.Strength.AnonymousClass1 anonymousClass2 = MapMakerInternalMap.Strength.X;
        if (((MapMakerInternalMap.Strength) MoreObjects.a(strength, anonymousClass2)) == anonymousClass2 && ((MapMakerInternalMap.Strength) MoreObjects.a(this.f19894e, anonymousClass2)) == anonymousClass2) {
            return new MapMakerInternalMap(this, MapMakerInternalMap.StrongKeyStrongValueEntry.Helper.f19902a);
        }
        MapMakerInternalMap.Strength strength2 = (MapMakerInternalMap.Strength) MoreObjects.a(this.d, anonymousClass2);
        MapMakerInternalMap.Strength.AnonymousClass2 anonymousClass3 = MapMakerInternalMap.Strength.f19901Y;
        if (strength2 == anonymousClass2 && ((MapMakerInternalMap.Strength) MoreObjects.a(this.f19894e, anonymousClass2)) == anonymousClass3) {
            return new MapMakerInternalMap(this, MapMakerInternalMap.StrongKeyWeakValueEntry.Helper.f19903a);
        }
        if (((MapMakerInternalMap.Strength) MoreObjects.a(this.d, anonymousClass2)) == anonymousClass3 && ((MapMakerInternalMap.Strength) MoreObjects.a(this.f19894e, anonymousClass2)) == anonymousClass2) {
            return new MapMakerInternalMap(this, MapMakerInternalMap.WeakKeyStrongValueEntry.Helper.f19906a);
        }
        if (((MapMakerInternalMap.Strength) MoreObjects.a(this.d, anonymousClass2)) == anonymousClass3 && ((MapMakerInternalMap.Strength) MoreObjects.a(this.f19894e, anonymousClass2)) == anonymousClass3) {
            return new MapMakerInternalMap(this, MapMakerInternalMap.WeakKeyWeakValueEntry.Helper.f19908a);
        }
        throw new AssertionError();
    }

    public final void b(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.d;
        Preconditions.q(strength2 == null, "Key strength was already set to %s", strength2);
        strength.getClass();
        this.d = strength;
        if (strength != MapMakerInternalMap.Strength.X) {
            this.f19891a = true;
        }
    }

    public final void c() {
        b(MapMakerInternalMap.Strength.f19901Y);
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        int i2 = this.f19892b;
        if (i2 != -1) {
            toStringHelperB.c("initialCapacity", String.valueOf(i2));
        }
        int i3 = this.f19893c;
        if (i3 != -1) {
            toStringHelperB.c("concurrencyLevel", String.valueOf(i3));
        }
        MapMakerInternalMap.Strength strength = this.d;
        if (strength != null) {
            toStringHelperB.b(Ascii.b(strength.toString()), "keyStrength");
        }
        MapMakerInternalMap.Strength strength2 = this.f19894e;
        if (strength2 != null) {
            toStringHelperB.b(Ascii.b(strength2.toString()), "valueStrength");
        }
        if (this.f != null) {
            toStringHelperB.d("keyEquivalence");
        }
        return toStringHelperB.toString();
    }
}
