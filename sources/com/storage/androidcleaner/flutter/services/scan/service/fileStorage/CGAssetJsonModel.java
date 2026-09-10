package com.storage.androidcleaner.flutter.services.scan.service.fileStorage;

import ah.a;
import ah.d;
import android.util.Size;
import d5.u;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u0087\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0090\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0003\u0010\u000e\u001a\u00020\r2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0003\u0010\u0010\u001a\u00020\u00062\b\b\u0003\u0010\u0011\u001a\u00020\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/storage/androidcleaner/flutter/services/scan/service/fileStorage/CGAssetJsonModel;", "", "", "id", "Lah/d;", "type", "", "isFavorite", "isLive", "Landroid/util/Size;", "originalSize", "", "sizeOnDisk", "Ljava/util/Date;", "createAt", "updatedAt", "isEdited", "potentiallySimilarIdentifier", "folderId", "Lah/a;", "chatSource", "<init>", "(Ljava/lang/String;Lah/d;ZZLandroid/util/Size;Ljava/lang/Long;Ljava/util/Date;Ljava/util/Date;ZLjava/lang/String;Ljava/lang/String;Lah/a;)V", "copy", "(Ljava/lang/String;Lah/d;ZZLandroid/util/Size;Ljava/lang/Long;Ljava/util/Date;Ljava/util/Date;ZLjava/lang/String;Ljava/lang/String;Lah/a;)Lcom/storage/androidcleaner/flutter/services/scan/service/fileStorage/CGAssetJsonModel;", "r9/b", "app_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final /* data */ class CGAssetJsonModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f38397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f38398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f38399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f38400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f38401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Date f38402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Date f38403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f38404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f38405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f38406k;
    public final a l;

    public CGAssetJsonModel(String id2, d type, boolean z10, boolean z11, Size originalSize, Long l, Date createAt, Date date, boolean z12, String potentiallySimilarIdentifier, String str, a aVar) {
        n.f(id2, "id");
        n.f(type, "type");
        n.f(originalSize, "originalSize");
        n.f(createAt, "createAt");
        n.f(potentiallySimilarIdentifier, "potentiallySimilarIdentifier");
        this.f38396a = id2;
        this.f38397b = type;
        this.f38398c = z10;
        this.f38399d = z11;
        this.f38400e = originalSize;
        this.f38401f = l;
        this.f38402g = createAt;
        this.f38403h = date;
        this.f38404i = z12;
        this.f38405j = potentiallySimilarIdentifier;
        this.f38406k = str;
        this.l = aVar;
    }

    public final CGAssetJsonModel copy(String id2, d type, boolean isFavorite, boolean isLive, Size originalSize, Long sizeOnDisk, Date createAt, Date updatedAt, boolean isEdited, String potentiallySimilarIdentifier, String folderId, a chatSource) {
        n.f(id2, "id");
        n.f(type, "type");
        n.f(originalSize, "originalSize");
        n.f(createAt, "createAt");
        n.f(potentiallySimilarIdentifier, "potentiallySimilarIdentifier");
        return new CGAssetJsonModel(id2, type, isFavorite, isLive, originalSize, sizeOnDisk, createAt, updatedAt, isEdited, potentiallySimilarIdentifier, folderId, chatSource);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CGAssetJsonModel)) {
            return false;
        }
        CGAssetJsonModel cGAssetJsonModel = (CGAssetJsonModel) obj;
        return n.a(this.f38396a, cGAssetJsonModel.f38396a) && this.f38397b == cGAssetJsonModel.f38397b && this.f38398c == cGAssetJsonModel.f38398c && this.f38399d == cGAssetJsonModel.f38399d && n.a(this.f38400e, cGAssetJsonModel.f38400e) && n.a(this.f38401f, cGAssetJsonModel.f38401f) && n.a(this.f38402g, cGAssetJsonModel.f38402g) && n.a(this.f38403h, cGAssetJsonModel.f38403h) && this.f38404i == cGAssetJsonModel.f38404i && n.a(this.f38405j, cGAssetJsonModel.f38405j) && n.a(this.f38406k, cGAssetJsonModel.f38406k) && this.l == cGAssetJsonModel.l;
    }

    public final int hashCode() {
        int iHashCode = (this.f38400e.hashCode() + ((Boolean.hashCode(this.f38399d) + ((Boolean.hashCode(this.f38398c) + ((this.f38397b.hashCode() + (this.f38396a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        Long l = this.f38401f;
        int iHashCode2 = (this.f38402g.hashCode() + ((iHashCode + (l == null ? 0 : l.hashCode())) * 31)) * 31;
        Date date = this.f38403h;
        int iE = u.e((Boolean.hashCode(this.f38404i) + ((iHashCode2 + (date == null ? 0 : date.hashCode())) * 31)) * 31, 31, this.f38405j);
        String str = this.f38406k;
        int iHashCode3 = (iE + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.l;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "CGAssetJsonModel(id=" + this.f38396a + ", type=" + this.f38397b + ", isFavorite=" + this.f38398c + ", isLive=" + this.f38399d + ", originalSize=" + this.f38400e + ", sizeOnDisk=" + this.f38401f + ", createAt=" + this.f38402g + ", updatedAt=" + this.f38403h + ", isEdited=" + this.f38404i + ", potentiallySimilarIdentifier=" + this.f38405j + ", folderId=" + this.f38406k + ", chatSource=" + this.l + ")";
    }
}
