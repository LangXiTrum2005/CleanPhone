package com.inmobi.unifiedId;

import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/inmobi/unifiedId/InMobiUserDataTypes;", "", "md5", "", "sha1", "sha256", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMd5", "()Ljava/lang/String;", "getSha1", "getSha256", "component1", "component2", "component3", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "", "toString", "Builder", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class InMobiUserDataTypes {
    private final String md5;
    private final String sha1;
    private final String sha256;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/inmobi/unifiedId/InMobiUserDataTypes$Builder;", "", "<init>", "()V", "", "md5", "(Ljava/lang/String;)Lcom/inmobi/unifiedId/InMobiUserDataTypes$Builder;", "sha1", "sha256", "Lcom/inmobi/unifiedId/InMobiUserDataTypes;", "build", "()Lcom/inmobi/unifiedId/InMobiUserDataTypes;", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f24178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f24179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f24180c;

        public final InMobiUserDataTypes build() {
            return new InMobiUserDataTypes(this.f24178a, this.f24179b, this.f24180c);
        }

        public final Builder md5(String md5) {
            this.f24178a = md5;
            return this;
        }

        public final Builder sha1(String sha1) {
            this.f24179b = sha1;
            return this;
        }

        public final Builder sha256(String sha256) {
            this.f24180c = sha256;
            return this;
        }
    }

    public InMobiUserDataTypes(String str, String str2, String str3) {
        this.md5 = str;
        this.sha1 = str2;
        this.sha256 = str3;
    }

    public static /* synthetic */ InMobiUserDataTypes copy$default(InMobiUserDataTypes inMobiUserDataTypes, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = inMobiUserDataTypes.md5;
        }
        if ((i2 & 2) != 0) {
            str2 = inMobiUserDataTypes.sha1;
        }
        if ((i2 & 4) != 0) {
            str3 = inMobiUserDataTypes.sha256;
        }
        return inMobiUserDataTypes.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSha1() {
        return this.sha1;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSha256() {
        return this.sha256;
    }

    public final InMobiUserDataTypes copy(String md5, String sha1, String sha256) {
        return new InMobiUserDataTypes(md5, sha1, sha256);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InMobiUserDataTypes)) {
            return false;
        }
        InMobiUserDataTypes inMobiUserDataTypes = (InMobiUserDataTypes) other;
        return Intrinsics.a(this.md5, inMobiUserDataTypes.md5) && Intrinsics.a(this.sha1, inMobiUserDataTypes.sha1) && Intrinsics.a(this.sha256, inMobiUserDataTypes.sha256);
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getSha1() {
        return this.sha1;
    }

    public final String getSha256() {
        return this.sha256;
    }

    public int hashCode() {
        String str = this.md5;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sha1;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sha256;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InMobiUserDataTypes(md5=");
        sb.append(this.md5);
        sb.append(", sha1=");
        sb.append(this.sha1);
        sb.append(", sha256=");
        return a.p(sb, this.sha256, ')');
    }
}
