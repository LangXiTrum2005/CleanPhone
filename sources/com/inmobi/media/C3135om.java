package com.inmobi.media;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.flow.apical;
import kotlinx.coroutines.flow.formularize;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.dovishness;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.om, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3135om extends AbstractC2990j2 {
    public final saran b;
    public final C3160pm c;
    public final apical d;
    public final C3097n9 e;
    public final ArrayList f;
    public final ArrayList g;
    public InterfaceC2874ec h;
    public K3 i;
    public ViewGroup j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3135om(Context context, saran coroutineScope, C3160pm videoExperienceModel, apical mediaEventFlow, C3097n9 c3097n9) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(videoExperienceModel, "videoExperienceModel");
        Intrinsics.checkNotNullParameter(mediaEventFlow, "mediaEventFlow");
        this.b = coroutineScope;
        this.c = videoExperienceModel;
        this.d = mediaEventFlow;
        this.e = c3097n9;
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        if (b(r0) == r1) goto L25;
     */
    @Override // com.inmobi.media.AbstractC2990j2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p002kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.inmobi.media.C2807bm
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.bm r0 = (com.inmobi.media.C2807bm) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.inmobi.media.bm r0 = new com.inmobi.media.bm
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            p002kotlin.dern.saneness(r9)
            goto L84
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            com.inmobi.media.om r2 = r0.a
            p002kotlin.dern.saneness(r9)
            goto L75
        L3b:
            p002kotlin.dern.saneness(r9)
            com.inmobi.media.n9 r9 = r8.e
            if (r9 == 0) goto L60
            com.inmobi.media.pm r2 = r8.c
            java.util.ArrayList r2 = r2.c
            int r2 = r2.size()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "load Called - mediaFiles count: "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            java.lang.String r6 = "VideoExperienceManager"
            r9.a(r6, r2)
        L60:
            kotlinx.coroutines.technofreak r9 = kotlinx.coroutines.premeiotic.dern()
            com.inmobi.media.cm r2 = new com.inmobi.media.cm
            r2.<init>(r8, r3)
            r0.a = r8
            r0.d = r5
            java.lang.Object r9 = kotlinx.coroutines.impromptu.competently(r9, r2, r0)
            if (r9 != r1) goto L74
            goto L83
        L74:
            r2 = r8
        L75:
            com.inmobi.media.ec r9 = (com.inmobi.media.InterfaceC2874ec) r9
            r2.h = r9
            r0.a = r3
            r0.d = r4
            java.lang.Object r9 = r8.b(r0)
            if (r9 != r1) goto L84
        L83:
            return r1
        L84:
            kotlin.Unit r9 = p002kotlin.Unit.f29295attabal
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3135om.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00df  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ContinuationImpl continuationImpl) {
        C2859dm c2859dm;
        C3135om c3135om;
        C3097n9 c3097n9;
        if (continuationImpl instanceof C2859dm) {
            c2859dm = (C2859dm) continuationImpl;
            int i = c2859dm.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2859dm.d = i - Integer.MIN_VALUE;
            } else {
                c2859dm = new C2859dm(this, continuationImpl);
            }
        } else {
            c2859dm = new C2859dm(this, continuationImpl);
        }
        Object objMarial = c2859dm.b;
        Object objBeachfront = attabal.beachfront();
        int i2 = c2859dm.d;
        if (i2 != 0) {
            if (i2 == 1) {
                dern.saneness(objMarial);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3135om = c2859dm.a;
                dern.saneness(objMarial);
            }
            c3135om.j = (ViewGroup) objMarial;
            c3097n9 = this.e;
            if (c3097n9 != null) {
                c3097n9.a("VideoExperienceManager", "Video Experience Load Success");
            }
            return Unit.f29295attabal;
        }
        dern.saneness(objMarial);
        C3097n9 c3097n10 = this.e;
        if (c3097n10 != null) {
            c3097n10.a("VideoExperienceManager", "loadVideoExperience - getting sorted media files");
        }
        c2859dm.d = 1;
        ArrayList mediaFiles = this.c.c;
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        ArrayList arrayList = new ArrayList();
        for (Object obj : mediaFiles) {
            C3159pl c3159pl = (C3159pl) obj;
            if (URLUtil.isHttpUrl(c3159pl.c) || URLUtil.isHttpsUrl(c3159pl.c)) {
                arrayList.add(obj);
            }
        }
        objMarial = privatdozent.marial(new C3309vm(arrayList, ((double) Jl.a(this.c.a)) / ((double) 1000), this.c.d, null), c2859dm);
        if (objMarial != objBeachfront) {
        }
        return objBeachfront;
        List list = (List) objMarial;
        ArrayList arrayList2 = new ArrayList(dovishness.gintrap(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C3159pl) it.next()).c);
        }
        InterfaceC2874ec interfaceC2874ec = this.h;
        if (interfaceC2874ec == null) {
            Intrinsics.preprohormone("mediaPlayer");
            interfaceC2874ec = null;
        }
        c2859dm.a = this;
        c2859dm.d = 2;
        objMarial = ((Sd) interfaceC2874ec).a(arrayList2, c2859dm);
        if (objMarial != objBeachfront) {
            c3135om = this;
            c3135om.j = (ViewGroup) objMarial;
            c3097n9 = this.e;
            if (c3097n9 != null) {
                c3097n9.a("VideoExperienceManager", "Video Experience Load Success");
            }
            return Unit.f29295attabal;
        }
        return objBeachfront;
    }

    @Override // com.inmobi.media.AbstractC2990j2
    public final Object a(FrameLayout frameLayout, C3025kc c3025kc) {
        Object objCompetently = impromptu.competently(premeiotic.dern(), new C2781am(this, frameLayout, null), c3025kc);
        return objCompetently == attabal.beachfront() ? objCompetently : Unit.f29295attabal;
    }

    @Override // com.inmobi.media.AbstractC2990j2
    public final void a(formularize windowFlow) {
        Intrinsics.checkNotNullParameter(windowFlow, "windowFlow");
        monroe monroeVarWireman = cutely.wireman(this.b, null, null, new Yl(windowFlow, null, this), 3, null);
        ArrayList activeJobs = this.g;
        Intrinsics.checkNotNullParameter(monroeVarWireman, "<this>");
        Intrinsics.checkNotNullParameter(activeJobs, "activeJobs");
        activeJobs.add(monroeVarWireman);
    }

    @Override // com.inmobi.media.AbstractC2990j2
    public final void a() {
        C3097n9 c3097n9 = this.e;
        if (c3097n9 != null) {
            c3097n9.a("VideoExperienceManager", "destroy");
        }
        b();
        InterfaceC2874ec interfaceC2874ec = this.h;
        if (interfaceC2874ec != null) {
            Sd sd = (Sd) interfaceC2874ec;
            C3097n9 c3097n10 = sd.c;
            if (c3097n10 != null) {
                c3097n10.a("NativeMediaPlayer", "destroy called");
            }
            sd.e = EnumC3228sg.STATE_DESTROYED;
            P4.a(sd.d);
            sd.k.b();
            C2773ae c2773ae = sd.i;
            c2773ae.g.removeAllViews();
            c2773ae.f.c();
            sd.j.c();
            sd.g.removeAllViews();
            sd.h.release();
        }
        P4.a(this.g);
        K3 k3 = this.i;
        if (k3 != null) {
            k3.a();
        }
    }

    @Override // com.inmobi.media.AbstractC2990j2
    public final void b() {
        P4.a(this.b, new Zl(this, null));
        InterfaceC2874ec interfaceC2874ec = this.h;
        if (interfaceC2874ec == null) {
            Intrinsics.preprohormone("mediaPlayer");
            interfaceC2874ec = null;
        }
        Sd sd = (Sd) interfaceC2874ec;
        sd.j.c();
        C3161pn c3161pn = sd.k;
        Ij ij = c3161pn.h;
        if (ij != null) {
            ij.b();
        }
        c3161pn.d.set(false);
        C3328wg c3328wg = (C3328wg) c3161pn.i.d.getValue();
        c3328wg.f.set(true);
        H6.a(c3328wg.e);
        c3328wg.e = null;
        P4.a(c3161pn.e);
        P4.a(sd.d);
        P4.a(this.f);
    }
}
