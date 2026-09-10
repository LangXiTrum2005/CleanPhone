package trawler;

/* JADX INFO: compiled from: ByteArrayAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class beachfront implements attabal<byte[]> {
    @Override // trawler.attabal
    public int attabal() {
        return 1;
    }

    @Override // trawler.attabal
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public int saneness(byte[] bArr) {
        return bArr.length;
    }

    @Override // trawler.attabal
    public String getTag() {
        return "ByteArrayPool";
    }

    @Override // trawler.attabal
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i) {
        return new byte[i];
    }
}
