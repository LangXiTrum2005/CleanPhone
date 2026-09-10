package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ProtoSyntax {
    public static final ProtoSyntax X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final ProtoSyntax f4903Y;
    public static final ProtoSyntax Z;
    public static final /* synthetic */ ProtoSyntax[] e0;

    static {
        ProtoSyntax protoSyntax = new ProtoSyntax("PROTO2", 0);
        X = protoSyntax;
        ProtoSyntax protoSyntax2 = new ProtoSyntax("PROTO3", 1);
        f4903Y = protoSyntax2;
        ProtoSyntax protoSyntax3 = new ProtoSyntax("EDITIONS", 2);
        Z = protoSyntax3;
        e0 = new ProtoSyntax[]{protoSyntax, protoSyntax2, protoSyntax3};
    }

    public static ProtoSyntax valueOf(String str) {
        return (ProtoSyntax) java.lang.Enum.valueOf(ProtoSyntax.class, str);
    }

    public static ProtoSyntax[] values() {
        return (ProtoSyntax[]) e0.clone();
    }
}
