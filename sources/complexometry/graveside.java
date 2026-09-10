package complexometry;

import p002kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\f\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\r¨\u0006\u0010"}, d2 = {"Lcomplexometry/graveside;", "", "", "majorVersion", "minorVersion", "microVersion", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "attabal", "I", "()I", "saneness", "dern", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class graveside {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final int majorVersion;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final int microVersion;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final int minorVersion;

    public graveside(int i, int i2, int i3) {
        this.majorVersion = i;
        this.minorVersion = i2;
        this.microVersion = i3;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final int getMajorVersion() {
        return this.majorVersion;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final int getMinorVersion() {
        return this.minorVersion;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final int getMicroVersion() {
        return this.microVersion;
    }

    public String toString() {
        return this.majorVersion + "." + this.minorVersion + "." + this.microVersion;
    }
}
