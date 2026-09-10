package com.google.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h5 f24887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i5 f24888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ k5[] f24889c;

    static {
        h5 h5Var = new h5();
        f24887a = h5Var;
        i5 i5Var = new i5();
        f24888b = i5Var;
        f24889c = new k5[]{h5Var, i5Var, new k5() { // from class: com.google.protobuf.j5
            @Override // com.google.protobuf.k5
            public final Object a(CodedInputStream codedInputStream) {
                return codedInputStream.readBytes();
            }
        }};
    }

    public static k5 valueOf(String str) {
        return (k5) java.lang.Enum.valueOf(k5.class, str);
    }

    public static k5[] values() {
        return (k5[]) f24889c.clone();
    }

    public abstract Object a(CodedInputStream codedInputStream);
}
