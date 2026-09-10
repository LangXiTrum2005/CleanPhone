package cybernatic;

import java.io.IOException;

/* JADX INFO: compiled from: TrueHdSampleRechunker.java */
/* JADX INFO: loaded from: classes.dex */
public final class creditor {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final byte[] f24613attabal = new byte[10];

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f24614beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f24615competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f24616dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f24617marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f24618saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public long f24619wireman;

    public void attabal(privatdozent privatdozentVar, privatdozent.attabal attabalVar) {
        if (this.f24616dern > 0) {
            privatdozentVar.wireman(this.f24619wireman, this.f24617marial, this.f24614beachfront, this.f24615competently, attabalVar);
            this.f24616dern = 0;
        }
    }

    public void dern(privatdozent privatdozentVar, long j, int i, int i2, int i3, privatdozent.attabal attabalVar) {
        decarock.attabal.impromptu(this.f24615competently <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f24618saneness) {
            int i4 = this.f24616dern;
            int i5 = i4 + 1;
            this.f24616dern = i5;
            if (i4 == 0) {
                this.f24619wireman = j;
                this.f24617marial = i;
                this.f24614beachfront = 0;
            }
            this.f24614beachfront += i2;
            this.f24615competently = i3;
            if (i5 >= 16) {
                attabal(privatdozentVar, attabalVar);
            }
        }
    }

    public void saneness() {
        this.f24618saneness = false;
        this.f24616dern = 0;
    }

    public void wireman(monoploid monoploidVar) throws IOException {
        if (this.f24618saneness) {
            return;
        }
        monoploidVar.peekFully(this.f24613attabal, 0, 10);
        monoploidVar.resetPeekPosition();
        if (saneness.cutely(this.f24613attabal) == 0) {
            return;
        }
        this.f24618saneness = true;
    }
}
