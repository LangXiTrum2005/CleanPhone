package balance;

import cybernatic.sealless;

/* JADX INFO: compiled from: ConstantBitrateSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal extends cybernatic.impromptu implements competently {

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final int f14856impromptu;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final long f14857taiyuan;

    public attabal(long j, long j2, sealless.attabal attabalVar, boolean z) {
        this(j, j2, attabalVar.f24767beachfront, attabalVar.f24769dern, z);
    }

    @Override // balance.competently
    public int competently() {
        return this.f14856impromptu;
    }

    @Override // balance.competently
    public long dern() {
        return this.f14857taiyuan;
    }

    @Override // balance.competently
    public long getTimeUs(long j) {
        return saneness(j);
    }

    public attabal(long j, long j2, int i, int i2, boolean z) {
        super(j, j2, i, i2, z);
        long j3 = j;
        this.f14856impromptu = i;
        this.f14857taiyuan = j3 == -1 ? -1L : j3;
    }
}
