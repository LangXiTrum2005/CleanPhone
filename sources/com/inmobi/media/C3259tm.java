package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import patroclinal.formularize;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.tm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3259tm extends SuspendLambda implements Function2 {
    public C3159pl a;
    public int b;
    public final /* synthetic */ C3159pl c;
    public final /* synthetic */ double d;
    public final /* synthetic */ Pe e;
    public final /* synthetic */ int f;
    public final /* synthetic */ AdConfig.VastVideoConfig g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3259tm(C3159pl c3159pl, double d, Pe pe, int i, AdConfig.VastVideoConfig vastVideoConfig, dern dernVar) {
        super(2, dernVar);
        this.c = c3159pl;
        this.d = d;
        this.e = pe;
        this.f = i;
        this.g = vastVideoConfig;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3259tm(this.c, this.d, this.e, this.f, this.g, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3259tm) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C3159pl c3159pl;
        Object objBeachfront = attabal.beachfront();
        int i = this.b;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            C3159pl c3159pl2 = this.c;
            double d = this.d;
            Pe pe = this.e;
            int i2 = this.f;
            AdConfig.VastVideoConfig vastVideoConfig = this.g;
            this.a = c3159pl2;
            this.b = 1;
            obj = AbstractC3334wm.a(c3159pl2, d, pe, i2, vastVideoConfig, this);
            if (obj == objBeachfront) {
                return objBeachfront;
            }
            c3159pl = c3159pl2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3159pl = this.a;
            p002kotlin.dern.saneness(obj);
        }
        return formularize.attabal(c3159pl, obj);
    }
}
