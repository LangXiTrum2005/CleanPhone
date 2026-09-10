package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class LazyFieldLite {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile MessageLite f4865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile ByteString f4866b;

    public final MessageLite a(MessageLite messageLite) {
        if (this.f4865a == null) {
            synchronized (this) {
                if (this.f4865a == null) {
                    try {
                        this.f4865a = messageLite;
                        this.f4866b = ByteString.f4747Y;
                    } catch (InvalidProtocolBufferException unused) {
                        this.f4865a = messageLite;
                        this.f4866b = ByteString.f4747Y;
                    }
                }
            }
        }
        return this.f4865a;
    }

    public final ByteString b() {
        if (this.f4866b != null) {
            return this.f4866b;
        }
        synchronized (this) {
            try {
                if (this.f4866b != null) {
                    return this.f4866b;
                }
                if (this.f4865a == null) {
                    this.f4866b = ByteString.f4747Y;
                } else {
                    this.f4866b = this.f4865a.toByteString();
                }
                return this.f4866b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyFieldLite)) {
            return false;
        }
        LazyFieldLite lazyFieldLite = (LazyFieldLite) obj;
        MessageLite messageLite = this.f4865a;
        MessageLite messageLite2 = lazyFieldLite.f4865a;
        if (messageLite == null && messageLite2 == null) {
            return b().equals(lazyFieldLite.b());
        }
        if (messageLite == null || messageLite2 == null) {
            return messageLite != null ? messageLite.equals(lazyFieldLite.a(messageLite.b())) : a(messageLite2.b()).equals(messageLite2);
        }
        return messageLite.equals(messageLite2);
    }

    public int hashCode() {
        return 1;
    }
}
