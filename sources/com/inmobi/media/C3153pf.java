package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.premeiotic;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.pf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3153pf {
    public static final C3153pf a = new C3153pf();
    public static final AtomicInteger b = new AtomicInteger(0);
    public static C3227sf c;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        C3053lf c3053lf;
        AdConfig.OmidConfig omidConfig;
        Context context;
        if (continuationImpl instanceof C3053lf) {
            c3053lf = (C3053lf) continuationImpl;
            int i = c3053lf.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3053lf.e = i - Integer.MIN_VALUE;
            } else {
                c3053lf = new C3053lf(this, continuationImpl);
            }
        } else {
            c3053lf = new C3053lf(this, continuationImpl);
        }
        Object obj = c3053lf.c;
        Object objBeachfront = attabal.beachfront();
        int i2 = c3053lf.e;
        if (i2 == 0) {
            dern.saneness(obj);
            C2968i4 c2968i4 = Y3.a;
            Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
            AdConfig.OmidConfig omidConfig2 = ((AdConfig) Y3.a.a(AdConfig.class)).getViewability().getOmidConfig();
            Context context2 = Ji.a;
            if (context2 == null) {
                return Unit.f29295attabal;
            }
            c3053lf.a = omidConfig2;
            c3053lf.b = context2;
            c3053lf.e = 1;
            Object objA = a(context2, omidConfig2, c3053lf);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
            omidConfig = omidConfig2;
            obj = objA;
            context = context2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = c3053lf.b;
            omidConfig = c3053lf.a;
            dern.saneness(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return Unit.f29295attabal;
        }
        b.set(2);
        cutely.wireman(A9.c, null, null, new C3078mf(omidConfig, context, null), 3, null);
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Context context, AdConfig.OmidConfig omidConfig, ContinuationImpl continuationImpl) {
        C3128of c3128of;
        if (continuationImpl instanceof C3128of) {
            c3128of = (C3128of) continuationImpl;
            int i = c3128of.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3128of.c = i - Integer.MIN_VALUE;
            } else {
                c3128of = new C3128of(this, continuationImpl);
            }
        } else {
            c3128of = new C3128of(this, continuationImpl);
        }
        Object objCompetently = c3128of.a;
        Object objBeachfront = attabal.beachfront();
        int i2 = c3128of.c;
        boolean z = true;
        if (i2 == 0) {
            dern.saneness(objCompetently);
            AtomicInteger atomicInteger = b;
            if (atomicInteger.get() != 1 && atomicInteger.get() != 2) {
                C3227sf c3227sf = c;
                if (c3227sf == null) {
                    c3227sf = new C3227sf(context);
                    c = c3227sf;
                }
                c3128of.c = 1;
                objCompetently = impromptu.competently(premeiotic.saneness(), new C3178qf(c3227sf, omidConfig, null), c3128of);
                if (objCompetently == objBeachfront) {
                    return objBeachfront;
                }
            }
            return igo.attabal.attabal(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dern.saneness(objCompetently);
        if (((Boolean) objCompetently).booleanValue()) {
            z = false;
        }
        return igo.attabal.attabal(z);
    }
}
