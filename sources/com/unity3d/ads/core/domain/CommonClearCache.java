package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bc0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonClearCache implements ClearCache {
    private final CacheRepository cacheRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonClearCache$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.CommonClearCache", f = "CommonClearCache.kt", l = {18, 19}, m = "invoke")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        long J$0;
        long J$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonClearCache.this.invoke(this);
        }
    }

    public CommonClearCache(CacheRepository cacheRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        AbstractC2995aW.q(cacheRepository, "cacheRepository");
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.ClearCache
    public Object invoke(InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        CommonClearCache commonClearCache;
        long j;
        CommonClearCache commonClearCache2;
        long j2;
        long j3;
        if (interfaceC2857Wj instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) interfaceC2857Wj;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(interfaceC2857Wj);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(interfaceC2857Wj);
        }
        Object cacheSize = anonymousClass1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                j = anonymousClass1.J$0;
                commonClearCache = (CommonClearCache) anonymousClass1.L$0;
                AbstractC3375el.b0(cacheSize);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = anonymousClass1.J$1;
                j2 = anonymousClass1.J$0;
                commonClearCache2 = (CommonClearCache) anonymousClass1.L$0;
                AbstractC3375el.b0(cacheSize);
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(commonClearCache2.sendDiagnosticEvent, "native_initialize_clear_cache_time", new Double(TimeExtensionsKt.elapsedMillis(new Bc0(j2))), null, AbstractC3375el.O(new C4839vT("size_kb", new Integer((int) (j3 / ((long) 1024))))), null, 20, null);
            return C5033xf0.f5238a;
        }
        AbstractC3375el.b0(cacheSize);
        long jA = IP.a();
        CacheRepository cacheRepository = this.cacheRepository;
        anonymousClass1.L$0 = this;
        anonymousClass1.J$0 = jA;
        anonymousClass1.label = 1;
        cacheSize = cacheRepository.getCacheSize(anonymousClass1);
        if (cacheSize == enumC4602sk) {
            return enumC4602sk;
        }
        commonClearCache = this;
        j = jA;
        long jLongValue = ((Number) cacheSize).longValue();
        CacheRepository cacheRepository2 = commonClearCache.cacheRepository;
        anonymousClass1.L$0 = commonClearCache;
        anonymousClass1.J$0 = j;
        anonymousClass1.J$1 = jLongValue;
        anonymousClass1.label = 2;
        if (cacheRepository2.clearCache(anonymousClass1) == enumC4602sk) {
            return enumC4602sk;
        }
        commonClearCache2 = commonClearCache;
        j2 = j;
        j3 = jLongValue;
        SendDiagnosticEvent.DefaultImpls.invoke$default(commonClearCache2.sendDiagnosticEvent, "native_initialize_clear_cache_time", new Double(TimeExtensionsKt.elapsedMillis(new Bc0(j2))), null, AbstractC3375el.O(new C4839vT("size_kb", new Integer((int) (j3 / ((long) 1024))))), null, 20, null);
        return C5033xf0.f5238a;
    }
}
