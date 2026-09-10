package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.seminary;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.formularize;

/* JADX INFO: loaded from: classes3.dex */
public final class Bh {
    public final C3271u9 a;
    public final String b;
    public final C3117o4 c;

    public Bh(C3271u9 configClient) {
        Intrinsics.checkNotNullParameter(configClient, "configClient");
        this.a = configClient;
        this.b = Bh.class.getSimpleName();
        this.c = new C3117o4();
    }

    public static final boolean a(Set set, C3067m4 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return set.contains(it.b.getType());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    public final AbstractC3142p4 a(C3092n4 c3092n4, C3067m4 c3067m4) {
        C2916g2 c2916g2B;
        String configType = c3067m4.b.getType();
        Intrinsics.checkNotNullParameter(c3092n4, "<this>");
        Intrinsics.checkNotNullParameter(configType, "configType");
        switch (configType) {
            case "crashReporting":
                c2916g2B = c3092n4.b();
                break;
            case "ads":
                c2916g2B = c3092n4.a();
                break;
            case "root":
                c2916g2B = c3092n4.c();
                break;
            case "telemetry":
                c2916g2B = c3092n4.e();
                break;
            case "signals":
                c2916g2B = c3092n4.d();
                break;
            default:
                c2916g2B = null;
                break;
        }
        if (c2916g2B == null) {
            return new C2789b4(5, c3067m4.b.getLastUpdateTimeStamp(), c3067m4.b.getType());
        }
        C3009jl c3009jlA = this.c.a(c2916g2B, c3067m4);
        int i = c3009jlA.a;
        if (i == 200) {
            Config config = c3009jlA.b;
            config.setLastUpdateTimeStamp(System.currentTimeMillis());
            String tag = this.b;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            c3067m4.b.getType();
            return new C3167q4(200, config);
        }
        if (i != 304) {
            return new C2789b4(c3009jlA.a, c3067m4.b.getLastUpdateTimeStamp(), c3067m4.b.getType());
        }
        Config config2 = c3009jlA.b;
        config2.setLastUpdateTimeStamp(System.currentTimeMillis());
        String tag2 = this.b;
        Intrinsics.checkNotNullExpressionValue(tag2, "tag");
        c3067m4.b.getType();
        return new C3167q4(Sdk$SDKError.Reason.AD_EXPIRED_VALUE, config2);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x032e  */
    /* JADX WARN: Code duplicated, block: B:117:0x035f A[LOOP:3: B:112:0x0328->B:117:0x035f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x036d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0372  */
    /* JADX WARN: Code duplicated, block: B:124:0x0387 A[LOOP:5: B:122:0x0381->B:124:0x0387, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:128:0x03ae A[LOOP:6: B:126:0x03a8->B:128:0x03ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x03e9 A[LOOP:4: B:131:0x03e3->B:133:0x03e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:135:0x0415  */
    /* JADX WARN: Code duplicated, block: B:138:0x042b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0437  */
    /* JADX WARN: Code duplicated, block: B:142:0x0454 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x0458  */
    /* JADX WARN: Code duplicated, block: B:146:0x045b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0463  */
    /* JADX WARN: Code duplicated, block: B:151:0x049b  */
    /* JADX WARN: Code duplicated, block: B:158:0x0202 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x035b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:73:0x022d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0256 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:83:0x0264 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0266  */
    /* JADX WARN: Code duplicated, block: B:86:0x0279  */
    /* JADX WARN: Code duplicated, block: B:87:0x0280  */
    /* JADX WARN: Code duplicated, block: B:89:0x0285  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:151:0x049b -> B:152:0x049f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.lang.String r25, java.lang.String r26, com.inmobi.media.core.config.models.RootConfig r27, java.util.List r28, kotlinx.coroutines.channels.kowloon r29, p002kotlin.coroutines.jvm.internal.ContinuationImpl r30) {
        /*
            Method dump skipped, instruction units count: 1230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Bh.a(java.lang.String, java.lang.String, com.inmobi.media.core.config.models.RootConfig, java.util.List, kotlinx.coroutines.channels.kowloon, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0052 A[Catch: ClassCastException -> 0x0074, JSONException -> 0x0079, TryCatch #3 {ClassCastException -> 0x0074, JSONException -> 0x0079, blocks: (B:12:0x002a, B:21:0x004e, B:23:0x0052, B:24:0x0056, B:26:0x005c, B:28:0x006b, B:29:0x0072), top: B:39:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c A[Catch: ClassCastException -> 0x0074, JSONException -> 0x0079, LOOP:0: B:24:0x0056->B:26:0x005c, LOOP_END, TryCatch #3 {ClassCastException -> 0x0074, JSONException -> 0x0079, blocks: (B:12:0x002a, B:21:0x004e, B:23:0x0052, B:24:0x0056, B:26:0x005c, B:28:0x006b, B:29:0x0072), top: B:39:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:28:0x006b A[Catch: ClassCastException -> 0x0074, JSONException -> 0x0079, TryCatch #3 {ClassCastException -> 0x0074, JSONException -> 0x0079, blocks: (B:12:0x002a, B:21:0x004e, B:23:0x0052, B:24:0x0056, B:26:0x005c, B:28:0x006b, B:29:0x0072), top: B:39:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Ne ne, List list, ContinuationImpl continuationImpl) {
        Ah ah;
        ArrayList arrayList;
        C3092n4 c3092n4;
        Iterator it;
        if (continuationImpl instanceof Ah) {
            ah = (Ah) continuationImpl;
            int i = ah.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ah.e = i - Integer.MIN_VALUE;
            } else {
                ah = new Ah(this, continuationImpl);
            }
        } else {
            ah = new Ah(this, continuationImpl);
        }
        Object obj = ah.c;
        Object objBeachfront = attabal.beachfront();
        int i2 = ah.e;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = ah.b;
            list = ah.a;
            try {
                dern.saneness(obj);
                c3092n4 = (C3092n4) obj;
                if (c3092n4 != null) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(a(c3092n4, (C3067m4) it.next()));
                    }
                    return arrayList;
                }
                throw new JSONException("Error parsing config response");
            } catch (ClassCastException unused) {
                a(list, 2);
                return arrayList;
            } catch (JSONException unused2) {
                a(list, 2);
                return arrayList;
            }
        }
        dern.saneness(obj);
        ArrayList arrayList2 = new ArrayList();
        try {
            ah.a = list;
            ah.b = arrayList2;
            ah.e = 1;
            Object objA = ne.a();
            if (objA == objBeachfront) {
                return objBeachfront;
            }
            obj = objA;
            arrayList = arrayList2;
            c3092n4 = (C3092n4) obj;
            if (c3092n4 != null) {
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(a(c3092n4, (C3067m4) it.next()));
                }
                return arrayList;
            }
            throw new JSONException("Error parsing config response");
        } catch (ClassCastException unused3) {
            arrayList = arrayList2;
            a(list, 2);
            return arrayList;
        } catch (JSONException unused4) {
            arrayList = arrayList2;
            a(list, 2);
            return arrayList;
        }
        return arrayList;
    }

    public static void a(int i, List list, List list2) {
        Map mapKowloon = seminary.kowloon(formularize.attabal(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)), formularize.attabal("name", list), formularize.attabal("lts", list2), formularize.attabal("networkType", C3342x5.m()));
        Wj wj = Wj.a;
        Wj.b("InvalidConfig", mapKowloon, EnumC2779ak.SDK);
    }

    public static void a(List list, int i) {
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3067m4) it.next()).b.getType());
        }
        ArrayList arrayList2 = new ArrayList(dovishness.gintrap(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((C3067m4) it2.next()).b.getLastUpdateTimeStamp()));
        }
        a(i, arrayList, arrayList2);
    }
}
