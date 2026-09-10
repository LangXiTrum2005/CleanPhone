package com.p004ironsource;

import androidx.media3.extractor.text.ttml.a;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001f\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/ironsource/vp;", "", "", "a", "b", "url", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class vp {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String packageName;

    public vp(String url, String str) {
        Intrinsics.f(url, "url");
        this.url = url;
        this.packageName = str;
    }

    public static /* synthetic */ vp a(vp vpVar, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = vpVar.url;
        }
        if ((i2 & 2) != 0) {
            str2 = vpVar.packageName;
        }
        return vpVar.a(str, str2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    public final String c() {
        return this.packageName;
    }

    public final String d() {
        return this.url;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof vp)) {
            return false;
        }
        vp vpVar = (vp) other;
        return Intrinsics.a(this.url, vpVar.url) && Intrinsics.a(this.packageName, vpVar.packageName);
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        String str = this.packageName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OpenUrl(url=");
        sb.append(this.url);
        sb.append(", packageName=");
        return a.p(sb, this.packageName, ')');
    }

    public /* synthetic */ vp(String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? "" : str2);
    }

    public final vp a(String url, String packageName) {
        Intrinsics.f(url, "url");
        return new vp(url, packageName);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getUrl() {
        return this.url;
    }
}
