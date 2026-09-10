package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.inmobi.media.C3331wj;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.flow.apical;
import kotlinx.coroutines.flow.formularize;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.seminary;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.wj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3331wj extends AbstractC2990j2 {
    public final saran b;
    public final C3356xj c;
    public final apical d;
    public final C3097n9 e;
    public final String f;
    public final Cj g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3331wj(Context context, saran coroutineScope, C3356xj staticExperienceModel, apical mediaEventFlow, C3097n9 c3097n9) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(staticExperienceModel, "staticExperienceModel");
        Intrinsics.checkNotNullParameter(mediaEventFlow, "mediaEventFlow");
        this.b = coroutineScope;
        this.c = staticExperienceModel;
        this.d = mediaEventFlow;
        this.e = c3097n9;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f = "Static-Image-" + string;
        int i = Cj.b;
        Intrinsics.checkNotNullParameter(context, "context");
        this.g = new Cj(context);
    }

    @Override // com.inmobi.media.AbstractC2990j2
    public final void a(formularize windowFlow) {
        Intrinsics.checkNotNullParameter(windowFlow, "windowFlow");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.inmobi.media.AbstractC2990j2
    public final Object a(ContinuationImpl continuationImpl) throws C2849dc {
        C3206rj c3206rj;
        List list;
        if (continuationImpl instanceof C3206rj) {
            c3206rj = (C3206rj) continuationImpl;
            int i = c3206rj.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3206rj.c = i - Integer.MIN_VALUE;
            } else {
                c3206rj = new C3206rj(this, continuationImpl);
            }
        } else {
            c3206rj = new C3206rj(this, continuationImpl);
        }
        Object obj = c3206rj.a;
        Object objBeachfront = attabal.beachfront();
        int i2 = c3206rj.c;
        if (i2 == 0) {
            dern.saneness(obj);
            C3097n9 c3097n9 = this.e;
            if (c3097n9 != null) {
                c3097n9.a("StaticExperienceManager", "load Called - imageAssets count: " + this.c.a.size());
            }
            Map mapA = AbstractC2983ik.a(this.c.b.a);
            Wj wj = Wj.a;
            Wj.b("MainImageLoadStarted", mapA, EnumC2779ak.SDK);
            List images = this.c.a;
            Intrinsics.checkNotNullParameter(images, "images");
            ArrayList images2 = new ArrayList();
            for (Object obj2 : images) {
                Image image = (Image) obj2;
                if (URLUtil.isHttpUrl(image.getUrl()) || URLUtil.isHttpsUrl(image.getUrl())) {
                    images2.add(obj2);
                }
            }
            if (images2.isEmpty()) {
                C3097n9 c3097n10 = this.e;
                if (c3097n10 != null) {
                    c3097n10.a("StaticExperienceManager", "Sanitized Images Empty - no valid images to load");
                }
                Map mapStratoscope = seminary.stratoscope(AbstractC2983ik.a(this.c.b.a));
                mapStratoscope.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2351);
                Wj wj2 = Wj.a;
                Wj.b("MainImageLoadFailure", mapStratoscope, EnumC2779ak.SDK);
                throw new C2849dc();
            }
            Intrinsics.checkNotNullParameter(images2, "images");
            if (images2.size() > 1) {
                int iA = AbstractC3367y5.a();
                int iOrdinal = AbstractC3366y4.a().ordinal();
                if (iOrdinal == 2) {
                    list = images2;
                    list = CollectionsKt.setterwort(images2, new C3406zj(iA));
                } else if (iOrdinal != 3) {
                    list = images2;
                    list = CollectionsKt.setterwort(images2, new Aj());
                } else if (iA > 720) {
                    list = images2;
                    list = CollectionsKt.setterwort(images2, new Bj());
                } else {
                    list = images2;
                    list = CollectionsKt.setterwort(images2, new C3381yj(iA));
                }
            }
            list = images2;
            ImageView imageView = this.g;
            c3206rj.c = 1;
            if (a(list, imageView, c3206rj) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dern.saneness(obj);
        }
        C3097n9 c3097n11 = this.e;
        if (c3097n11 != null) {
            c3097n11.a("StaticExperienceManager", "Static Load Success");
        }
        Map mapA2 = AbstractC2983ik.a(this.c.b.a);
        Wj wj3 = Wj.a;
        Wj.b("MainImageLoadSuccess", mapA2, EnumC2779ak.SDK);
        return Unit.f29295attabal;
    }

    @Override // com.inmobi.media.AbstractC2990j2
    public final void b() {
    }

    @Override // com.inmobi.media.AbstractC2990j2
    public final Object a(FrameLayout frameLayout, C3025kc c3025kc) {
        Object objCompetently = impromptu.competently(premeiotic.dern(), new C3182qj(this, frameLayout, null), c3025kc);
        return objCompetently == attabal.beachfront() ? objCompetently : Unit.f29295attabal;
    }

    @Override // com.inmobi.media.AbstractC2990j2
    public final void a() {
        ViewParent parent = this.g.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        Picasso picasso = Qf.a;
        Qf.b(this.a).cancelTag(this.f);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a8, code lost:
    
        if (kotlinx.coroutines.impromptu.competently(r11, r0, r7) == r8) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r14, android.widget.ImageView r15, p002kotlin.coroutines.jvm.internal.ContinuationImpl r16) {
        /*
            r13 = this;
            r0 = r16
            boolean r1 = r0 instanceof com.inmobi.media.C3231sj
            if (r1 == 0) goto L16
            r1 = r0
            com.inmobi.media.sj r1 = (com.inmobi.media.C3231sj) r1
            int r3 = r1.f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r1.f = r3
        L14:
            r7 = r1
            goto L1c
        L16:
            com.inmobi.media.sj r1 = new com.inmobi.media.sj
            r1.<init>(r13, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.d
            java.lang.Object r8 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r1 = r7.f
            r9 = 2
            r3 = 1
            r10 = 0
            if (r1 == 0) goto L48
            if (r1 == r3) goto L3a
            if (r1 != r9) goto L32
            p002kotlin.dern.saneness(r0)
            goto Lab
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            kotlin.jvm.internal.Ref$BooleanRef r1 = r7.c
            android.widget.ImageView r3 = r7.b
            java.util.List r4 = r7.a
            p002kotlin.dern.saneness(r0)
            r12 = r3
            r3 = r1
            r1 = r4
            r4 = r12
            goto L8e
        L48:
            p002kotlin.dern.saneness(r0)
            com.inmobi.media.n9 r0 = r13.e
            if (r0 == 0) goto L6e
            int r1 = r14.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "loadImagesIntoImageView - attempting to load "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = " images"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.String r4 = "StaticExperienceManager"
            r0.a(r4, r1)
        L6e:
            kotlin.jvm.internal.Ref$BooleanRef r1 = new kotlin.jvm.internal.Ref$BooleanRef
            r1.<init>()
            kotlinx.coroutines.technofreak r0 = kotlinx.coroutines.premeiotic.dern()
            com.inmobi.media.uj r4 = new com.inmobi.media.uj
            r4.<init>(r13, r10)
            r7.a = r14
            r7.b = r15
            r7.c = r1
            r7.f = r3
            java.lang.Object r0 = kotlinx.coroutines.impromptu.competently(r0, r4, r7)
            if (r0 != r8) goto L8b
            goto Laa
        L8b:
            r4 = r15
            r3 = r1
            r1 = r14
        L8e:
            r5 = r0
            android.graphics.Bitmap$Config r5 = (android.graphics.Bitmap.Config) r5
            kotlinx.coroutines.merc r11 = kotlinx.coroutines.premeiotic.saneness()
            com.inmobi.media.tj r0 = new com.inmobi.media.tj
            r6 = 0
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a = r10
            r7.b = r10
            r7.c = r10
            r7.f = r9
            java.lang.Object r0 = kotlinx.coroutines.impromptu.competently(r11, r0, r7)
            if (r0 != r8) goto Lab
        Laa:
            return r8
        Lab:
            kotlin.Unit r0 = p002kotlin.Unit.f29295attabal
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3331wj.a(java.util.List, android.widget.ImageView, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void a(ImageView imageView, final Image image) {
        imageView.setOnClickListener(new View.OnClickListener() { // from class: adsuki.unhat
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3331wj.a(this.f3730kowloon, image, view);
            }
        });
    }

    public static final void a(C3331wj c3331wj, Image image, View view) {
        C3097n9 c3097n9 = c3331wj.e;
        if (c3097n9 != null) {
            c3097n9.a("StaticExperienceManager", "Static Click Event");
        }
        cutely.wireman(c3331wj.b, null, null, new C3306vj(image, c3331wj, null), 3, null);
    }
}
