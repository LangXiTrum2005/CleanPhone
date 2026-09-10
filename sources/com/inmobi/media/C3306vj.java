package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.ads.network.inmobiJson.model.Link;
import java.util.ArrayList;
import kotlinx.coroutines.flow.apical;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.vj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3306vj extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Image b;
    public final /* synthetic */ C3331wj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3306vj(Image image, C3331wj c3331wj, dern dernVar) {
        super(2, dernVar);
        this.b = image;
        this.c = c3331wj;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3306vj(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3306vj(this.b, this.c, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            ArrayList arrayListA = AbstractC3391z4.a("click", this.b.getTrackers());
            apical apicalVar = this.c.d;
            Link link = this.b.getLink();
            C2982ij c2982ij = new C2982ij(link != null ? link.getUrl() : null, arrayListA);
            this.a = 1;
            if (apicalVar.emit(c2982ij, this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return Unit.f29295attabal;
    }
}
