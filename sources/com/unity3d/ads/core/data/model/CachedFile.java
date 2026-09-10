package com.unity3d.ads.core.data.model;

import com.applovin.impl.ca;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import d5.u;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JS\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006&"}, d2 = {"Lcom/unity3d/ads/core/data/model/CachedFile;", "", "url", "", "name", X3.i.f27782b, "Ljava/io/File;", "extension", "contentLength", "", "protocol", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;JLjava/lang/String;I)V", "getContentLength", "()J", "getExtension", "()Ljava/lang/String;", "getFile", "()Ljava/io/File;", "getName", "getPriority", "()I", "getProtocol", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final /* data */ class CachedFile {
    private final long contentLength;
    private final String extension;
    private final File file;
    private final String name;
    private final int priority;
    private final String protocol;
    private final String url;

    public CachedFile(String url, String name, File file, String str, long j10, String protocol, int i10) {
        n.f(url, "url");
        n.f(name, "name");
        n.f(protocol, "protocol");
        this.url = url;
        this.name = name;
        this.file = file;
        this.extension = str;
        this.contentLength = j10;
        this.protocol = protocol;
        this.priority = i10;
    }

    public static /* synthetic */ CachedFile copy$default(CachedFile cachedFile, String str, String str2, File file, String str3, long j10, String str4, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cachedFile.url;
        }
        if ((i11 & 2) != 0) {
            str2 = cachedFile.name;
        }
        if ((i11 & 4) != 0) {
            file = cachedFile.file;
        }
        if ((i11 & 8) != 0) {
            str3 = cachedFile.extension;
        }
        if ((i11 & 16) != 0) {
            j10 = cachedFile.contentLength;
        }
        if ((i11 & 32) != 0) {
            str4 = cachedFile.protocol;
        }
        if ((i11 & 64) != 0) {
            i10 = cachedFile.priority;
        }
        long j11 = j10;
        File file2 = file;
        String str5 = str3;
        return cachedFile.copy(str, str2, file2, str5, j11, str4, i10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExtension() {
        return this.extension;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getContentLength() {
        return this.contentLength;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getProtocol() {
        return this.protocol;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    public final CachedFile copy(String url, String name, File file, String extension, long contentLength, String protocol, int priority) {
        n.f(url, "url");
        n.f(name, "name");
        n.f(protocol, "protocol");
        return new CachedFile(url, name, file, extension, contentLength, protocol, priority);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CachedFile)) {
            return false;
        }
        CachedFile cachedFile = (CachedFile) other;
        return n.a(this.url, cachedFile.url) && n.a(this.name, cachedFile.name) && n.a(this.file, cachedFile.file) && n.a(this.extension, cachedFile.extension) && this.contentLength == cachedFile.contentLength && n.a(this.protocol, cachedFile.protocol) && this.priority == cachedFile.priority;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final String getExtension() {
        return this.extension;
    }

    public final File getFile() {
        return this.file;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iE = u.e(this.url.hashCode() * 31, 31, this.name);
        File file = this.file;
        int iHashCode = (iE + (file == null ? 0 : file.hashCode())) * 31;
        String str = this.extension;
        return Integer.hashCode(this.priority) + u.e(ca.j(this.contentLength, (iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31), 31, this.protocol);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CachedFile(url=");
        sb2.append(this.url);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", file=");
        sb2.append(this.file);
        sb2.append(", extension=");
        sb2.append(this.extension);
        sb2.append(", contentLength=");
        sb2.append(this.contentLength);
        sb2.append(", protocol=");
        sb2.append(this.protocol);
        sb2.append(", priority=");
        return u.g(sb2, this.priority, ')');
    }

    public /* synthetic */ CachedFile(String str, String str2, File file, String str3, long j10, String str4, int i10, int i11, g gVar) {
        this(str, str2, (i11 & 4) != 0 ? null : file, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? -1L : j10, (i11 & 32) != 0 ? "" : str4, (i11 & 64) != 0 ? Integer.MAX_VALUE : i10);
    }
}
