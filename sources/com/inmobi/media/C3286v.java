package com.inmobi.media;

import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;
import igo.beachfront;
import kotlinx.coroutines.kowloon;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3286v extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C3311w b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Cj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3286v(C3311w c3311w, String str, Cj cj, dern dernVar) {
        super(2, dernVar);
        this.b = c3311w;
        this.c = str;
        this.d = cj;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3286v(this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3286v) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
            return obj;
        }
        p002kotlin.dern.saneness(obj);
        C3311w c3311w = this.b;
        String str = this.c;
        Cj cj = this.d;
        this.a = 1;
        kowloon kowloonVar = new kowloon(IntrinsicsKt__IntrinsicsJvmKt.dern(this), 1);
        kowloonVar.kattegat();
        kowloonVar.beachfront(new C3236t(c3311w));
        Picasso picasso = Qf.a;
        Qf.b(c3311w.a).load(str).tag(c3311w.e).transform(new Lf(Bitmap.Config.RGB_565)).into(cj, new C3261u(c3311w, kowloonVar));
        Object objCuirassed = kowloonVar.cuirassed();
        if (objCuirassed == attabal.beachfront()) {
            beachfront.dern(this);
        }
        return objCuirassed == objBeachfront ? objBeachfront : objCuirassed;
    }
}
