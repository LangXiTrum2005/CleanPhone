package com.unity3d.services.core.network.domain;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.ads.core.log.Logger;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import hk.i;
import hk.j;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import no.b;
import xj.v;
import zm.e;
import zm.f;
import zm.l;
import zm.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/unity3d/services/core/network/domain/CleanupDirectory;", "", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/ads/core/log/Logger;)V", "Ljava/io/File;", "directory", "", "sizeLimitMb", "", "ageLimitMs", "Lwj/r;", "invoke", "(Ljava/io/File;IJ)V", "Lcom/unity3d/ads/core/log/Logger;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CleanupDirectory {
    private final Logger logger;

    public CleanupDirectory(Logger logger) {
        n.f(logger, "logger");
        this.logger = logger;
    }

    public final void invoke(File directory, int sizeLimitMb, long ageLimitMs) {
        List list;
        n.f(directory, "directory");
        if (!directory.exists() || !directory.isDirectory()) {
            this.logger.debug("Directory does not exist or is not a directory: " + directory + ", nothing to clean up.");
            return;
        }
        f fVarP = l.P(new i(directory, j.f42398a), CleanupDirectory$invoke$cachedFiles$1.INSTANCE);
        e eVar = new e(fVarP);
        long length = 0;
        long length2 = 0;
        while (eVar.hasNext()) {
            length2 += ((File) eVar.next()).length();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        e eVar2 = new e(fVarP);
        while (eVar2.hasNext()) {
            Object next = eVar2.next();
            if (((File) next).lastModified() + ageLimitMs < jCurrentTimeMillis) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            length += ((File) it.next()).length();
        }
        long j10 = length2 - length;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
        long j11 = sizeLimitMb * ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        if (j10 > j11) {
            i iVar = new i(2, xj.n.g0(arrayList2), new Comparator() { // from class: com.unity3d.services.core.network.domain.CleanupDirectory$invoke$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return j1.f.h(Long.valueOf(((File) t10).lastModified()), Long.valueOf(((File) t11).lastModified()));
                }
            });
            wj.f fVar = new wj.f(Long.valueOf(j10), v.f53866a);
            CleanupDirectory$invoke$additionalFiles$2 operation = CleanupDirectory$invoke$additionalFiles$2.INSTANCE;
            n.f(operation, "operation");
            Object obj = null;
            zm.j jVarY = b.y(new p(fVar, iVar, operation, null));
            while (jVarY.hasNext()) {
                Object next2 = jVarY.next();
                if (((Number) ((wj.f) next2).f53283a).longValue() <= j11) {
                    obj = next2;
                    break;
                }
            }
            wj.f fVar2 = (wj.f) obj;
            List list2 = arrayList2;
            if (fVar2 != null && (list = (List) fVar2.f53284b) != null) {
                list2 = arrayList2;
                list2 = list;
            }
            list2 = arrayList2;
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                ((File) it3.next()).delete();
            }
        }
    }
}
