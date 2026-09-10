package androidx.appcompat.widget;

/* JADX INFO: compiled from: RtlSpacingHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class trm {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f5580attabal = 0;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f5586saneness = 0;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f5583dern = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f5587wireman = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f5585marial = 0;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f5581beachfront = 0;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public boolean f5582competently = false;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f5584impromptu = false;

    public int attabal() {
        return this.f5582competently ? this.f5580attabal : this.f5586saneness;
    }

    public void beachfront(boolean z) {
        if (z == this.f5582competently) {
            return;
        }
        this.f5582competently = z;
        if (!this.f5584impromptu) {
            this.f5580attabal = this.f5585marial;
            this.f5586saneness = this.f5581beachfront;
            return;
        }
        if (z) {
            int i = this.f5587wireman;
            if (i == Integer.MIN_VALUE) {
                i = this.f5585marial;
            }
            this.f5580attabal = i;
            int i2 = this.f5583dern;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.f5581beachfront;
            }
            this.f5586saneness = i2;
            return;
        }
        int i3 = this.f5583dern;
        if (i3 == Integer.MIN_VALUE) {
            i3 = this.f5585marial;
        }
        this.f5580attabal = i3;
        int i4 = this.f5587wireman;
        if (i4 == Integer.MIN_VALUE) {
            i4 = this.f5581beachfront;
        }
        this.f5586saneness = i4;
    }

    public void competently(int i, int i2) {
        this.f5583dern = i;
        this.f5587wireman = i2;
        this.f5584impromptu = true;
        if (this.f5582competently) {
            if (i2 != Integer.MIN_VALUE) {
                this.f5580attabal = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f5586saneness = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f5580attabal = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f5586saneness = i2;
        }
    }

    public int dern() {
        return this.f5586saneness;
    }

    public void marial(int i, int i2) {
        this.f5584impromptu = false;
        if (i != Integer.MIN_VALUE) {
            this.f5585marial = i;
            this.f5580attabal = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f5581beachfront = i2;
            this.f5586saneness = i2;
        }
    }

    public int saneness() {
        return this.f5580attabal;
    }

    public int wireman() {
        return this.f5582competently ? this.f5586saneness : this.f5580attabal;
    }
}
