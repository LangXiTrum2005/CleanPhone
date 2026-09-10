package cybernatic;

/* JADX INFO: compiled from: SingleSampleSeekMap.java */
/* JADX INFO: loaded from: classes.dex */
public final class grimness implements merc {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long f24651attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long f24652saneness;

    public grimness(long j) {
        this(j, 0L);
    }

    @Override // cybernatic.merc
    public long getDurationUs() {
        return this.f24651attabal;
    }

    @Override // cybernatic.merc
    public merc.attabal getSeekPoints(long j) {
        return new merc.attabal(new polder(j, this.f24652saneness));
    }

    @Override // cybernatic.merc
    public boolean isSeekable() {
        return true;
    }

    public grimness(long j, long j2) {
        this.f24651attabal = j;
        this.f24652saneness = j2;
    }
}
