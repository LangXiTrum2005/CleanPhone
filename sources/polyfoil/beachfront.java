package polyfoil;

import decarock.grimness;
import java.util.Arrays;

/* JADX INFO: compiled from: DefaultAllocator.java */
/* JADX INFO: loaded from: classes.dex */
public final class beachfront implements saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final boolean f35569attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f35570beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public attabal[] f35571competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final byte[] f35572dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f35573marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f35574saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f35575wireman;

    public beachfront(boolean z, int i) {
        this(z, i, 0);
    }

    @Override // polyfoil.saneness
    public synchronized attabal allocate() {
        attabal attabalVar;
        try {
            this.f35573marial++;
            int i = this.f35570beachfront;
            if (i > 0) {
                attabal[] attabalVarArr = this.f35571competently;
                int i2 = i - 1;
                this.f35570beachfront = i2;
                attabalVar = (attabal) decarock.attabal.marial(attabalVarArr[i2]);
                this.f35571competently[this.f35570beachfront] = null;
            } else {
                attabalVar = new attabal(new byte[this.f35574saneness], 0);
                int i3 = this.f35573marial;
                attabal[] attabalVarArr2 = this.f35571competently;
                if (i3 > attabalVarArr2.length) {
                    this.f35571competently = (attabal[]) Arrays.copyOf(attabalVarArr2, attabalVarArr2.length * 2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return attabalVar;
    }

    @Override // polyfoil.saneness
    public synchronized void attabal(saneness.attabal attabalVar) {
        while (attabalVar != null) {
            try {
                attabal[] attabalVarArr = this.f35571competently;
                int i = this.f35570beachfront;
                this.f35570beachfront = i + 1;
                attabalVarArr[i] = attabalVar.attabal();
                this.f35573marial--;
                attabalVar = attabalVar.next();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    public synchronized int dern() {
        return this.f35573marial * this.f35574saneness;
    }

    @Override // polyfoil.saneness
    public int getIndividualAllocationLength() {
        return this.f35574saneness;
    }

    public synchronized void marial(int i) {
        boolean z = i < this.f35575wireman;
        this.f35575wireman = i;
        if (z) {
            trim();
        }
    }

    @Override // polyfoil.saneness
    public synchronized void saneness(attabal attabalVar) {
        attabal[] attabalVarArr = this.f35571competently;
        int i = this.f35570beachfront;
        this.f35570beachfront = i + 1;
        attabalVarArr[i] = attabalVar;
        this.f35573marial--;
        notifyAll();
    }

    @Override // polyfoil.saneness
    public synchronized void trim() {
        try {
            int i = 0;
            int iMax = Math.max(0, grimness.cutely(this.f35575wireman, this.f35574saneness) - this.f35573marial);
            int i2 = this.f35570beachfront;
            if (iMax >= i2) {
                return;
            }
            if (this.f35572dern != null) {
                int i3 = i2 - 1;
                while (i <= i3) {
                    attabal attabalVar = (attabal) decarock.attabal.marial(this.f35571competently[i]);
                    if (attabalVar.f35567attabal == this.f35572dern) {
                        i++;
                    } else {
                        attabal attabalVar2 = (attabal) decarock.attabal.marial(this.f35571competently[i3]);
                        if (attabalVar2.f35567attabal != this.f35572dern) {
                            i3--;
                        } else {
                            attabal[] attabalVarArr = this.f35571competently;
                            attabalVarArr[i] = attabalVar2;
                            attabalVarArr[i3] = attabalVar;
                            i3--;
                            i++;
                        }
                    }
                }
                iMax = Math.max(iMax, i);
                if (iMax >= this.f35570beachfront) {
                    return;
                }
            }
            Arrays.fill(this.f35571competently, iMax, this.f35570beachfront, (Object) null);
            this.f35570beachfront = iMax;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void wireman() {
        if (this.f35569attabal) {
            marial(0);
        }
    }

    public beachfront(boolean z, int i, int i2) {
        decarock.attabal.attabal(i > 0);
        decarock.attabal.attabal(i2 >= 0);
        this.f35569attabal = z;
        this.f35574saneness = i;
        this.f35570beachfront = i2;
        this.f35571competently = new attabal[i2 + 100];
        if (i2 <= 0) {
            this.f35572dern = null;
            return;
        }
        this.f35572dern = new byte[i2 * i];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f35571competently[i3] = new attabal(this.f35572dern, i3 * i);
        }
    }
}
