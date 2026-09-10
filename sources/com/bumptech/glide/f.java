package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f10475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f10476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f10477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f10478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f[] f10479e;

    static {
        f fVar = new f("IMMEDIATE", 0);
        f10475a = fVar;
        f fVar2 = new f("HIGH", 1);
        f10476b = fVar2;
        f fVar3 = new f("NORMAL", 2);
        f10477c = fVar3;
        f fVar4 = new f("LOW", 3);
        f10478d = fVar4;
        f10479e = new f[]{fVar, fVar2, fVar3, fVar4};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f10479e.clone();
    }
}
