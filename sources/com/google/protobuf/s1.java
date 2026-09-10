package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class s1 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Field f24937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FieldType f24938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Field f24940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f24942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f24943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.reflect.Field f24944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f24945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Internal.EnumVerifier f24946j;

    public s1(java.lang.reflect.Field field, int i10, FieldType fieldType, java.lang.reflect.Field field2, int i11, boolean z10, boolean z11, Object obj, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field3) {
        this.f24937a = field;
        this.f24938b = fieldType;
        this.f24939c = i10;
        this.f24940d = field2;
        this.f24941e = i11;
        this.f24942f = z10;
        this.f24943g = z11;
        this.f24945i = obj;
        this.f24946j = enumVerifier;
        this.f24944h = field3;
    }

    public static void a(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(l1.d.e(i10, "fieldNumber must be positive: "));
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f24939c - ((s1) obj).f24939c;
    }
}
