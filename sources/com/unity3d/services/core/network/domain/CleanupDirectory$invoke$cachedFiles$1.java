package com.unity3d.services.core.network.domain;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.File;
import jk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public /* synthetic */ class CleanupDirectory$invoke$cachedFiles$1 extends k implements b {
    public static final CleanupDirectory$invoke$cachedFiles$1 INSTANCE = new CleanupDirectory$invoke$cachedFiles$1();

    public CleanupDirectory$invoke$cachedFiles$1() {
        super(1, File.class, "isFile", "isFile()Z", 0);
    }

    @Override // jk.b
    public final Boolean invoke(File p10) {
        n.f(p10, "p0");
        return Boolean.valueOf(p10.isFile());
    }
}
