package com.vungle.ads.internal.model;

import androidx.datastore.preferences.protobuf.a;
import com.applovin.impl.Z;
import com.p004ironsource.x4;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.util.Logger;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001:B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0013\u00102\u001a\u00020\u00072\b\u00103\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00104\u001a\u00020\tH\u0016J\u0006\u00105\u001a\u00020\u0007J\u0006\u00106\u001a\u000207J\b\u00108\u001a\u00020\u0003H\u0016J\u0006\u00109\u001a\u000207R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\fR\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/vungle/ads/internal/model/AdAsset;", "", "adIdentifier", "", "serverPath", "localPath", "isRequired", "", "percentage", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)V", "getAdIdentifier", "()Ljava/lang/String;", "contentLength", "", "getContentLength", "()J", "setContentLength", "(J)V", "fileSize", "getFileSize", "setFileSize", "isHtmlTemplate", "()Z", "isMainVideo", "isPrivacyIcon", "getLocalPath", "getPercentage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "rangeEnd", "getRangeEnd", "()Ljava/lang/Long;", "setRangeEnd", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "rangeStart", "getRangeStart", "setRangeStart", "getServerPath", "status", "Lcom/vungle/ads/internal/model/AdAsset$Status;", "getStatus", "()Lcom/vungle/ads/internal/model/AdAsset$Status;", "setStatus", "(Lcom/vungle/ads/internal/model/AdAsset$Status;)V", "waitLock", "Ljava/lang/Object;", "waitingForDownload", "Ljava/util/concurrent/atomic/AtomicBoolean;", "equals", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "isWaitingForDownload", "notifyDownloadEnough", "", "toString", "waitForDownload", "Status", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AdAsset {
    private final String adIdentifier;
    private long contentLength;
    private long fileSize;
    private final boolean isRequired;
    private final String localPath;
    private final Integer percentage;
    private Long rangeEnd;
    private long rangeStart;
    private final String serverPath;
    private Status status;
    private final Object waitLock;
    private final AtomicBoolean waitingForDownload;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/vungle/ads/internal/model/AdAsset$Status;", "", "(Ljava/lang/String;I)V", "NEW", "DOWNLOAD_RUNNING", "DOWNLOAD_FAILED", "DOWNLOAD_SUCCESS", "PROCESSED", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Status {
        NEW,
        DOWNLOAD_RUNNING,
        DOWNLOAD_FAILED,
        DOWNLOAD_SUCCESS,
        PROCESSED
    }

    public AdAsset(String adIdentifier, String serverPath, String localPath, boolean z2, Integer num) {
        Intrinsics.f(adIdentifier, "adIdentifier");
        Intrinsics.f(serverPath, "serverPath");
        Intrinsics.f(localPath, "localPath");
        this.adIdentifier = adIdentifier;
        this.serverPath = serverPath;
        this.localPath = localPath;
        this.isRequired = z2;
        this.percentage = num;
        this.status = Status.NEW;
        this.waitLock = new Object();
        this.waitingForDownload = new AtomicBoolean(false);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !AdAsset.class.equals(other.getClass())) {
            return false;
        }
        AdAsset adAsset = (AdAsset) other;
        if (this.status == adAsset.status && this.fileSize == adAsset.fileSize && this.isRequired == adAsset.isRequired && Intrinsics.a(this.adIdentifier, adAsset.adIdentifier) && Intrinsics.a(this.serverPath, adAsset.serverPath) && this.contentLength == adAsset.contentLength && Intrinsics.a(this.percentage, adAsset.percentage)) {
            return Intrinsics.a(this.localPath, adAsset.localPath);
        }
        return false;
    }

    public final String getAdIdentifier() {
        return this.adIdentifier;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final Integer getPercentage() {
        return this.percentage;
    }

    public final Long getRangeEnd() {
        return this.rangeEnd;
    }

    public final long getRangeStart() {
        return this.rangeStart;
    }

    public final String getServerPath() {
        return this.serverPath;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = (this.status.hashCode() + a.b(this.localPath, a.b(this.serverPath, this.adIdentifier.hashCode() * 31, 31), 31)) * 31;
        long j = this.fileSize;
        int iE = Z.e(this.isRequired, (iHashCode + ((int) (j ^ (j >>> 32)))) * 31, 31);
        long j2 = this.contentLength;
        int i2 = (iE + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Integer num = this.percentage;
        return i2 + (num != null ? num.hashCode() : 0);
    }

    public final boolean isHtmlTemplate() {
        return Intrinsics.a(this.adIdentifier, AdPayload.KEY_VM);
    }

    public final boolean isMainVideo() {
        return Intrinsics.a(this.adIdentifier, Constants.KEY_MAIN_VIDEO);
    }

    public final boolean isPrivacyIcon() {
        return Intrinsics.a(this.adIdentifier, "VUNGLE_PRIVACY_ICON_URL");
    }

    /* JADX INFO: renamed from: isRequired, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    public final boolean isWaitingForDownload() {
        return this.waitingForDownload.get();
    }

    public final void notifyDownloadEnough() {
        if (this.waitingForDownload.getAndSet(false)) {
            synchronized (this.waitLock) {
                this.waitLock.notifyAll();
            }
        }
    }

    public final void setContentLength(long j) {
        this.contentLength = j;
    }

    public final void setFileSize(long j) {
        this.fileSize = j;
    }

    public final void setRangeEnd(Long l2) {
        this.rangeEnd = l2;
    }

    public final void setRangeStart(long j) {
        this.rangeStart = j;
    }

    public final void setStatus(Status status) {
        Intrinsics.f(status, "<set-?>");
        this.status = status;
    }

    public String toString() {
        return "AdAsset(adIdentifier=" + this.adIdentifier + ", serverPath=" + this.serverPath + ", localPath=" + this.localPath + ", status=" + this.status + ", fileSize=" + this.fileSize + ", contentLength=" + this.contentLength + ", isRequired=" + this.isRequired + ", percentage=" + this.percentage + ')';
    }

    public final void waitForDownload() {
        Object objA;
        this.waitingForDownload.set(true);
        synchronized (this.waitLock) {
            try {
                this.waitLock.wait();
                objA = Unit.f43263a;
            } catch (Throwable th) {
                objA = ResultKt.a(th);
            }
            Throwable thA = Result.a(objA);
            if (thA != null) {
                Logger.INSTANCE.e("AdAsset", "Interrupted while waiting for file download: " + this, thA);
            }
        }
    }

    public /* synthetic */ AdAsset(String str, String str2, String str3, boolean z2, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z2, (i2 & 16) != 0 ? null : num);
    }
}
