package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: LazyFieldLite.java */
/* JADX INFO: loaded from: classes3.dex */
public class stratoscope {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public ByteString f22311attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public volatile ByteString f22312dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public kowloon f22313saneness;
    protected volatile privatdozent value;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public volatile boolean f22314wireman;

    public void attabal(privatdozent privatdozentVar) {
        if (this.value != null) {
            return;
        }
        synchronized (this) {
            if (this.value != null) {
                return;
            }
            try {
                if (this.f22311attabal != null) {
                    this.value = privatdozentVar.getParserForType().saneness(this.f22311attabal, this.f22313saneness);
                    this.f22312dern = this.f22311attabal;
                } else {
                    this.value = privatdozentVar;
                    this.f22312dern = ByteString.EMPTY;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f22314wireman = true;
                this.value = privatdozentVar;
                this.f22312dern = ByteString.EMPTY;
            }
        }
    }

    public privatdozent dern(privatdozent privatdozentVar) {
        attabal(privatdozentVar);
        return this.value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stratoscope)) {
            return false;
        }
        stratoscope stratoscopeVar = (stratoscope) obj;
        privatdozent privatdozentVar = this.value;
        privatdozent privatdozentVar2 = stratoscopeVar.value;
        if (privatdozentVar == null && privatdozentVar2 == null) {
            return marial().equals(stratoscopeVar.marial());
        }
        if (privatdozentVar == null || privatdozentVar2 == null) {
            return privatdozentVar != null ? privatdozentVar.equals(stratoscopeVar.dern(privatdozentVar.getDefaultInstanceForType())) : dern(privatdozentVar2.getDefaultInstanceForType()).equals(privatdozentVar2);
        }
        return privatdozentVar.equals(privatdozentVar2);
    }

    public int hashCode() {
        return 1;
    }

    public ByteString marial() {
        if (this.f22312dern != null) {
            return this.f22312dern;
        }
        ByteString byteString = this.f22311attabal;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            try {
                if (this.f22312dern != null) {
                    return this.f22312dern;
                }
                if (this.value == null) {
                    this.f22312dern = ByteString.EMPTY;
                } else {
                    this.f22312dern = this.value.toByteString();
                }
                return this.f22312dern;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int saneness() {
        if (this.f22312dern != null) {
            return this.f22312dern.size();
        }
        ByteString byteString = this.f22311attabal;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.value != null) {
            return this.value.getSerializedSize();
        }
        return 0;
    }

    public privatdozent wireman(privatdozent privatdozentVar) {
        privatdozent privatdozentVar2 = this.value;
        this.f22311attabal = null;
        this.f22312dern = null;
        this.value = privatdozentVar;
        return privatdozentVar2;
    }
}
