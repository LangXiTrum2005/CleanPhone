package com.unity3d.ads.core.domain;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonCreateFile;", "Lcom/unity3d/ads/core/domain/CreateFile;", "()V", "invoke", "Ljava/io/File;", "parent", "child", "", "pathname", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CommonCreateFile implements CreateFile {
    @Override // com.unity3d.ads.core.domain.CreateFile
    public File invoke(File parent, String child) {
        n.f(parent, "parent");
        n.f(child, "child");
        return new File(parent, child);
    }

    @Override // com.unity3d.ads.core.domain.CreateFile
    public File invoke(String pathname) {
        n.f(pathname, "pathname");
        return new File(pathname);
    }
}
