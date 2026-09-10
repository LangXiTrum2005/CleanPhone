package com.inmobi.media;

import android.graphics.Bitmap;
import com.inmobi.media.C3057lj;
import com.squareup.picasso.Picasso;
import kotlinx.coroutines.saran;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.lj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3057lj extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Cj b;
    public final /* synthetic */ C3107nj c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Bitmap.Config e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3057lj(Cj cj, C3107nj c3107nj, String str, Bitmap.Config config, dern dernVar) {
        super(2, dernVar);
        this.b = cj;
        this.c = c3107nj;
        this.d = str;
        this.e = config;
    }

    public static final void a(Cj cj, Bitmap bitmap) {
        cj.setImageBitmap(bitmap);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        C3057lj c3057lj = new C3057lj(this.b, this.c, this.d, this.e, dernVar);
        c3057lj.a = obj;
        return c3057lj;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3057lj) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws C2823cc {
        Object objM3351constructorimpl;
        C3097n9 c3097n9;
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        C3107nj c3107nj = this.c;
        String str = this.d;
        Bitmap.Config config = this.e;
        try {
            Result.Companion companion = Result.INSTANCE;
            Picasso picasso = Qf.a;
            objM3351constructorimpl = Result.m3351constructorimpl(Qf.b(c3107nj.a).load(str).tag(c3107nj.c).transform(new Lf(config)).get());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        C3107nj c3107nj2 = this.c;
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
        if (thM3354exceptionOrNullimpl != null && (c3097n9 = c3107nj2.b) != null) {
            c3097n9.b("StaticCompanionLoader", "Companion Load Exception: " + thM3354exceptionOrNullimpl.getMessage());
        }
        if (Result.m3356isFailureimpl(objM3351constructorimpl)) {
            objM3351constructorimpl = null;
        }
        final Bitmap bitmap = (Bitmap) objM3351constructorimpl;
        if (bitmap == null) {
            throw new C2823cc("Companion Load Error");
        }
        final Cj cj = this.b;
        return igo.attabal.attabal(cj.post(new Runnable() { // from class: adsuki.humidify
            @Override // java.lang.Runnable
            public final void run() {
                C3057lj.a(cj, bitmap);
            }
        }));
    }
}
