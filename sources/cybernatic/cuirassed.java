package cybernatic;

/* JADX INFO: compiled from: ForwardingSeekMap.java */
/* JADX INFO: loaded from: classes.dex */
public class cuirassed implements merc {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final merc f24620attabal;

    public cuirassed(merc mercVar) {
        this.f24620attabal = mercVar;
    }

    @Override // cybernatic.merc
    public long getDurationUs() {
        return this.f24620attabal.getDurationUs();
    }

    @Override // cybernatic.merc
    public merc.attabal getSeekPoints(long j) {
        return this.f24620attabal.getSeekPoints(j);
    }

    @Override // cybernatic.merc
    public boolean isSeekable() {
        return this.f24620attabal.isSeekable();
    }
}
