package com.google.firebase.heartbeatinfo;

import A.C0880a0;
import com.google.firebase.components.Component;

/* JADX INFO: loaded from: classes4.dex */
public class HeartBeatConsumerComponent {

    /* JADX INFO: renamed from: com.google.firebase.heartbeatinfo.HeartBeatConsumerComponent$1, reason: invalid class name */
    class AnonymousClass1 implements HeartBeatConsumer {
    }

    public static Component a() {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        Component.Builder builderB = Component.b(HeartBeatConsumer.class);
        builderB.f20205e = 1;
        builderB.f = new C0880a0(anonymousClass1, 17);
        return builderB.b();
    }
}
