package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class RawMessageInfo implements MessageInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageLite f4908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f4910c;
    public final int d;

    public RawMessageInfo(MessageLite messageLite, String str, Object[] objArr) {
        this.f4908a = messageLite;
        this.f4909b = str;
        this.f4910c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int i2 = cCharAt & 8191;
        int i3 = 1;
        int i4 = 13;
        while (true) {
            int i5 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.d = i2 | (cCharAt2 << i4);
                return;
            } else {
                i2 |= (cCharAt2 & 8191) << i4;
                i4 += 13;
                i3 = i5;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public final MessageLite getDefaultInstance() {
        return this.f4908a;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public final ProtoSyntax getSyntax() {
        int i2 = this.d;
        if ((i2 & 1) != 0) {
            return ProtoSyntax.X;
        }
        return (i2 & 4) == 4 ? ProtoSyntax.Z : ProtoSyntax.f4903Y;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public final boolean isMessageSetWireFormat() {
        return (this.d & 2) == 2;
    }
}
