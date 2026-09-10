package com.unity3d.services.ads.gmascar.adapters;

import com.unity3d.scar.adapter.common.a;
import com.unity3d.scar.adapter.common.b;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import defpackage.e;
import hn.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class ScarAdapterFactory {

    /* JADX INFO: renamed from: com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion;

        static {
            int[] iArr = new int[ScarAdapterVersion.values().length];
            $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion = iArr;
            try {
                iArr[ScarAdapterVersion.V21.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion[ScarAdapterVersion.V23.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion[ScarAdapterVersion.NA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void reportAdapterFailure(ScarAdapterVersion scarAdapterVersion, c cVar) {
        String strO = e.o("SCAR version ", scarAdapterVersion.name(), " is not supported.");
        cVar.handleError(new a(b.f38563g, strO, new Object[0]));
        DeviceLog.debug(strO);
    }

    public com.unity3d.scar.adapter.common.e createScarAdapter(ScarAdapterVersion scarAdapterVersion, c cVar) {
        int i10 = AnonymousClass1.$SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion[scarAdapterVersion.ordinal()];
        if (i10 == 1) {
            String versionName = SdkProperties.getVersionName();
            rh.a aVar = new rh.a(cVar, 0);
            u uVar = new u(versionName);
            sh.a aVar2 = new sh.a();
            aVar2.f50246a = uVar;
            aVar.f49588f = aVar2;
            uh.b bVar = new uh.b();
            bVar.f52215a = aVar2;
            aVar.f38582a = bVar;
            return aVar;
        }
        if (i10 != 2) {
            reportAdapterFailure(scarAdapterVersion, cVar);
            return null;
        }
        String versionName2 = SdkProperties.getVersionName();
        rh.a aVar3 = new rh.a(cVar, 1);
        u uVar2 = new u(versionName2);
        wh.a aVar4 = new wh.a();
        aVar4.f53208a = uVar2;
        aVar3.f49588f = aVar4;
        yh.a aVar5 = new yh.a();
        aVar5.f54400a = aVar4;
        aVar3.f38582a = aVar5;
        return aVar3;
    }
}
