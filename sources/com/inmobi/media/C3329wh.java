package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.List;
import kotlinx.coroutines.channels.kowloon;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import patroclinal.taiyuan;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.wh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3329wh extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Bh b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ RootConfig e;
    public final /* synthetic */ List f;
    public final /* synthetic */ kowloon g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3329wh(Bh bh, String str, String str2, RootConfig rootConfig, List list, kowloon kowloonVar, dern dernVar) {
        super(2, dernVar);
        this.b = bh;
        this.c = str;
        this.d = str2;
        this.e = rootConfig;
        this.f = list;
        this.g = kowloonVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3329wh(this.b, this.c, this.d, this.e, this.f, this.g, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3329wh) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        try {
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                Bh bh = this.b;
                String str = this.c;
                String str2 = this.d;
                RootConfig rootConfig = this.e;
                List list = this.f;
                kowloon kowloonVar = this.g;
                this.a = 1;
                if (bh.a(str, str2, rootConfig, list, kowloonVar, this) == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
            }
        } catch (Exception e) {
            taiyuan taiyuanVar = P9.a;
            AbstractC2973i9.a(e);
        }
        return Unit.f29295attabal;
    }
}
