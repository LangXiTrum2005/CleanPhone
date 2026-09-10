package livable;

import cybernatic.cord;
import cybernatic.monoploid;

/* JADX INFO: compiled from: StartOffsetExtractorInput.java */
/* JADX INFO: loaded from: classes.dex */
public final class wireman extends cord {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long f33114saneness;

    public wireman(monoploid monoploidVar, long j) {
        super(monoploidVar);
        decarock.attabal.attabal(monoploidVar.getPosition() >= j);
        this.f33114saneness = j;
    }

    @Override // cybernatic.cord, cybernatic.monoploid
    public long getLength() {
        return super.getLength() - this.f33114saneness;
    }

    @Override // cybernatic.cord, cybernatic.monoploid
    public long getPeekPosition() {
        return super.getPeekPosition() - this.f33114saneness;
    }

    @Override // cybernatic.cord, cybernatic.monoploid
    public long getPosition() {
        return super.getPosition() - this.f33114saneness;
    }
}
