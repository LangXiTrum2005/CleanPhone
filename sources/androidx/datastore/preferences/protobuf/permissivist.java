package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: RawMessageInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class permissivist implements seminary {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final saran f9802attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Object[] f9803dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f9804saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f9805wireman;

    public permissivist(saran saranVar, String str, Object[] objArr) {
        this.f9802attabal = saranVar;
        this.f9804saneness = str;
        this.f9803dern = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f9805wireman = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f9805wireman = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    public Object[] attabal() {
        return this.f9803dern;
    }

    @Override // androidx.datastore.preferences.protobuf.seminary
    public saran getDefaultInstance() {
        return this.f9802attabal;
    }

    @Override // androidx.datastore.preferences.protobuf.seminary
    public ProtoSyntax getSyntax() {
        int i = this.f9805wireman;
        if ((i & 1) != 0) {
            return ProtoSyntax.PROTO2;
        }
        return (i & 4) == 4 ? ProtoSyntax.EDITIONS : ProtoSyntax.PROTO3;
    }

    @Override // androidx.datastore.preferences.protobuf.seminary
    public boolean isMessageSetWireFormat() {
        return (this.f9805wireman & 2) == 2;
    }

    public String saneness() {
        return this.f9804saneness;
    }
}
