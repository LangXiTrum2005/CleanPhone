package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: LazyFieldLite.java */
/* JADX INFO: loaded from: classes.dex */
public class cuirassed {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public ByteString f9702attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public volatile ByteString f9703dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public triweekly f9704saneness;
    protected volatile saran value;

    public void attabal(saran saranVar) {
        if (this.value != null) {
            return;
        }
        synchronized (this) {
            if (this.value != null) {
                return;
            }
            try {
                if (this.f9702attabal != null) {
                    this.value = saranVar.getParserForType().attabal(this.f9702attabal, this.f9704saneness);
                    this.f9703dern = this.f9702attabal;
                } else {
                    this.value = saranVar;
                    this.f9703dern = ByteString.EMPTY;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.value = saranVar;
                this.f9703dern = ByteString.EMPTY;
            }
        }
    }

    public saran dern(saran saranVar) {
        attabal(saranVar);
        return this.value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuirassed)) {
            return false;
        }
        cuirassed cuirassedVar = (cuirassed) obj;
        saran saranVar = this.value;
        saran saranVar2 = cuirassedVar.value;
        if (saranVar == null && saranVar2 == null) {
            return marial().equals(cuirassedVar.marial());
        }
        if (saranVar == null || saranVar2 == null) {
            return saranVar != null ? saranVar.equals(cuirassedVar.dern(saranVar.getDefaultInstanceForType())) : dern(saranVar2.getDefaultInstanceForType()).equals(saranVar2);
        }
        return saranVar.equals(saranVar2);
    }

    public int hashCode() {
        return 1;
    }

    public ByteString marial() {
        if (this.f9703dern != null) {
            return this.f9703dern;
        }
        ByteString byteString = this.f9702attabal;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            try {
                if (this.f9703dern != null) {
                    return this.f9703dern;
                }
                if (this.value == null) {
                    this.f9703dern = ByteString.EMPTY;
                } else {
                    this.f9703dern = this.value.toByteString();
                }
                return this.f9703dern;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int saneness() {
        if (this.f9703dern != null) {
            return this.f9703dern.size();
        }
        ByteString byteString = this.f9702attabal;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.value != null) {
            return this.value.getSerializedSize();
        }
        return 0;
    }

    public saran wireman(saran saranVar) {
        saran saranVar2 = this.value;
        this.f9702attabal = null;
        this.f9703dern = null;
        this.value = saranVar;
        return saranVar2;
    }
}
