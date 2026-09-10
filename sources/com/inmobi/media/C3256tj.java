package com.inmobi.media;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.inmobi.media.C3256tj;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.squareup.picasso.Picasso;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.saran;
import p002kotlin.Pair;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.collections.seminary;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Ref$BooleanRef;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.tj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3256tj extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ List b;
    public final /* synthetic */ C3331wj c;
    public final /* synthetic */ Ref$BooleanRef d;
    public final /* synthetic */ ImageView e;
    public final /* synthetic */ Bitmap.Config f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3256tj(List list, C3331wj c3331wj, Ref$BooleanRef ref$BooleanRef, ImageView imageView, Bitmap.Config config, dern dernVar) {
        super(2, dernVar);
        this.b = list;
        this.c = c3331wj;
        this.d = ref$BooleanRef;
        this.e = imageView;
        this.f = config;
    }

    public static final void a(C3331wj c3331wj, ImageView imageView, Pair pair) {
        C3097n9 c3097n9 = c3331wj.e;
        if (c3097n9 != null) {
            c3097n9.a("StaticExperienceManager", "loadImagesIntoImageView - setting bitmap to ImageView");
        }
        c3331wj.a(imageView, (Image) pair.getSecond());
        imageView.setImageBitmap((Bitmap) pair.getFirst());
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        C3256tj c3256tj = new C3256tj(this.b, this.c, this.d, this.e, this.f, dernVar);
        c3256tj.a = obj;
        return c3256tj;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3256tj) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws C2849dc {
        final Pair pair;
        Object objM3351constructorimpl;
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        List list = this.b;
        C3331wj c3331wj = this.c;
        Bitmap.Config config = this.f;
        Ref$BooleanRef ref$BooleanRef = this.d;
        Iterator it = list.iterator();
        do {
            pair = null;
            if (!it.hasNext()) {
                break;
            }
            Image image = (Image) it.next();
            C3097n9 c3097n9 = c3331wj.e;
            if (c3097n9 != null) {
                c3097n9.a("StaticExperienceManager", "loadImagesIntoImageView - trying to load image from URL: " + image.getUrl());
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                Picasso picasso = Qf.a;
                objM3351constructorimpl = Result.m3351constructorimpl(Qf.b(c3331wj.a).load(image.getUrl()).tag(c3331wj.f).transform(new Lf(config)).get());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            }
            Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
            if (thM3354exceptionOrNullimpl != null) {
                C3097n9 c3097n10 = c3331wj.e;
                if (c3097n10 != null) {
                    c3097n10.a("StaticExperienceManager", "Bitmap Failure " + image.getUrl() + " " + thM3354exceptionOrNullimpl.getMessage());
                }
                if (thM3354exceptionOrNullimpl instanceof C2770ab) {
                    ref$BooleanRef.element = true;
                }
            }
            if (Result.m3356isFailureimpl(objM3351constructorimpl)) {
                objM3351constructorimpl = null;
            }
            Bitmap bitmap = (Bitmap) objM3351constructorimpl;
            if (bitmap != null) {
                pair = new Pair(bitmap, image);
            }
        } while (pair == null);
        if (pair != null) {
            final ImageView imageView = this.e;
            final C3331wj c3331wj2 = this.c;
            return igo.attabal.attabal(imageView.post(new Runnable() { // from class: adsuki.complexometry
                @Override // java.lang.Runnable
                public final void run() {
                    C3256tj.a(c3331wj2, imageView, pair);
                }
            }));
        }
        C3097n9 c3097n11 = this.c.e;
        if (c3097n11 != null) {
            c3097n11.b("StaticExperienceManager", "Bitmap Load Failure - no images could be loaded");
        }
        C3331wj c3331wj3 = this.c;
        boolean z = this.d.element;
        c3331wj3.getClass();
        short s = z ? (short) 81 : (short) 82;
        Map mapStratoscope = seminary.stratoscope(AbstractC2983ik.a(c3331wj3.c.b.a));
        mapStratoscope.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
        Wj wj = Wj.a;
        Wj.b("MainImageLoadFailure", mapStratoscope, EnumC2779ak.SDK);
        throw new C2849dc();
    }
}
