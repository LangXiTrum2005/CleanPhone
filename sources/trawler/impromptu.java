package trawler;

/* JADX INFO: compiled from: IntegerArrayAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class impromptu implements attabal<int[]> {
    @Override // trawler.attabal
    public int attabal() {
        return 4;
    }

    @Override // trawler.attabal
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public int saneness(int[] iArr) {
        return iArr.length;
    }

    @Override // trawler.attabal
    public String getTag() {
        return "IntegerArrayPool";
    }

    @Override // trawler.attabal
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public int[] newArray(int i) {
        return new int[i];
    }
}
