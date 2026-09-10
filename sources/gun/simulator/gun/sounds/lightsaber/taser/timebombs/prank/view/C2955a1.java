package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2955a1 {
    private final String adIdentifier;
    private long fileSize;
    private final Y0 fileType;
    private final boolean isRequired;
    private final String localPath;
    private final String serverPath;
    private Z0 status;

    public C2955a1(String str, String str2, String str3, Y0 y0, boolean z) {
        AbstractC2995aW.q(str, "adIdentifier");
        AbstractC2995aW.q(str2, "serverPath");
        AbstractC2995aW.q(str3, "localPath");
        AbstractC2995aW.q(y0, "fileType");
        this.adIdentifier = str;
        this.serverPath = str2;
        this.localPath = str3;
        this.fileType = y0;
        this.isRequired = z;
        this.status = Z0.NEW;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC2995aW.i(C2955a1.class, obj.getClass())) {
            return false;
        }
        C2955a1 c2955a1 = (C2955a1) obj;
        if (this.status == c2955a1.status && this.fileType == c2955a1.fileType && this.fileSize == c2955a1.fileSize && this.isRequired == c2955a1.isRequired && AbstractC2995aW.i(this.adIdentifier, c2955a1.adIdentifier) && AbstractC2995aW.i(this.serverPath, c2955a1.serverPath)) {
            return AbstractC2995aW.i(this.localPath, c2955a1.localPath);
        }
        return false;
    }

    public final String getAdIdentifier() {
        return this.adIdentifier;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final Y0 getFileType() {
        return this.fileType;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final String getServerPath() {
        return this.serverPath;
    }

    public final Z0 getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = (this.fileType.hashCode() + ((this.status.hashCode() + DM.d(this.localPath, DM.d(this.serverPath, this.adIdentifier.hashCode() * 31, 31), 31)) * 31)) * 31;
        long j = this.fileSize;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + (this.isRequired ? 1231 : 1237);
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    public final void setFileSize(long j) {
        this.fileSize = j;
    }

    public final void setStatus(Z0 z0) {
        AbstractC2995aW.q(z0, "<set-?>");
        this.status = z0;
    }

    public String toString() {
        return "AdAsset{, adIdentifier='" + this.adIdentifier + "', serverPath='" + this.serverPath + "', localPath='" + this.localPath + "', status=" + this.status + ", fileType=" + this.fileType + ", fileSize=" + this.fileSize + ", isRequired=" + this.isRequired + '}';
    }
}
