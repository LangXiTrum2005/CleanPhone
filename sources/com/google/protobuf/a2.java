package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a2 implements a3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a2 f24764b = new a2(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24765a;

    public /* synthetic */ a2(int i10) {
        this.f24765a = i10;
    }

    @Override // com.google.protobuf.a3
    public final z2 a(Class cls) {
        switch (this.f24765a) {
            case 0:
                if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (z2) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.protobuf.a3
    public final boolean b(Class cls) {
        switch (this.f24765a) {
            case 0:
                return GeneratedMessageLite.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
