package ads_mobile_sdk;

import ads_mobile_sdk.ja0;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.ads.mobile.sdk.common.AdInspectorError;
import com.google.common.base.triweekly;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import complexometry.monoploid;
import java.io.Closeable;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Regex;
import p002kotlin.text.StringsKt;
import p002kotlin.time.DurationUnit;
import saneness.digress;
import saneness.energise;
import saneness.evenfall;
import saneness.grout;
import saneness.hobby;
import saneness.loun;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class ja0 {
    public static final Uri q = Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push");
    public final CoroutineContext a;
    public final saran b;
    public final ri2 c;
    public final loun d;
    public final x e;
    public final jk0 f;
    public final ip0 g;
    public final vg h;
    public final hobby i;
    public final wz0 j;
    public final AtomicBoolean k;
    public String l;
    public String m;
    public JsonObject n;
    public l13 o;
    public String p;

    public ja0(CoroutineContext uiContext, saran backgroundScope, ri2 rootTraceCreator, loun traceLogger, x activityTracker, jk0 flags, ip0 gmaUtil, vg appState, hobby httpClient, wz0 inspectorManager, String afmaVersion) {
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(appState, "appState");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(inspectorManager, "inspectorManager");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        this.a = uiContext;
        this.b = backgroundScope;
        this.c = rootTraceCreator;
        this.d = traceLogger;
        this.e = activityTracker;
        this.f = flags;
        this.g = gmaUtil;
        this.h = appState;
        this.i = httpClient;
        this.j = inspectorManager;
        this.k = new AtomicBoolean(false);
        this.o = digress.attabal();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:102:0x0200 A[Catch: all -> 0x00fe, TRY_LEAVE, TryCatch #19 {, blocks: (B:96:0x01e6, B:99:0x01ef, B:102:0x0200, B:55:0x00f8, B:73:0x015c, B:76:0x0175, B:78:0x0179, B:112:0x0214), top: B:255:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0206  */
    /* JADX WARN: Code duplicated, block: B:112:0x0214 A[Catch: all -> 0x00fe, TRY_ENTER, TRY_LEAVE, TryCatch #19 {, blocks: (B:96:0x01e6, B:99:0x01ef, B:102:0x0200, B:55:0x00f8, B:73:0x015c, B:76:0x0175, B:78:0x0179, B:112:0x0214), top: B:255:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0227  */
    /* JADX WARN: Code duplicated, block: B:123:0x023b A[Catch: all -> 0x024b, TryCatch #7 {all -> 0x024b, blocks: (B:121:0x0234, B:123:0x023b, B:125:0x0242, B:127:0x0246, B:129:0x024a, B:132:0x024e, B:133:0x0253, B:134:0x0254, B:135:0x025b, B:136:0x025c, B:137:0x0263, B:138:0x0264), top: B:236:0x0234 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0242 A[Catch: all -> 0x024b, TryCatch #7 {all -> 0x024b, blocks: (B:121:0x0234, B:123:0x023b, B:125:0x0242, B:127:0x0246, B:129:0x024a, B:132:0x024e, B:133:0x0253, B:134:0x0254, B:135:0x025b, B:136:0x025c, B:137:0x0263, B:138:0x0264), top: B:236:0x0234 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0246 A[Catch: all -> 0x024b, TryCatch #7 {all -> 0x024b, blocks: (B:121:0x0234, B:123:0x023b, B:125:0x0242, B:127:0x0246, B:129:0x024a, B:132:0x024e, B:133:0x0253, B:134:0x0254, B:135:0x025b, B:136:0x025c, B:137:0x0263, B:138:0x0264), top: B:236:0x0234 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x024a A[Catch: all -> 0x024b, TryCatch #7 {all -> 0x024b, blocks: (B:121:0x0234, B:123:0x023b, B:125:0x0242, B:127:0x0246, B:129:0x024a, B:132:0x024e, B:133:0x0253, B:134:0x0254, B:135:0x025b, B:136:0x025c, B:137:0x0263, B:138:0x0264), top: B:236:0x0234 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x024e A[Catch: all -> 0x024b, TryCatch #7 {all -> 0x024b, blocks: (B:121:0x0234, B:123:0x023b, B:125:0x0242, B:127:0x0246, B:129:0x024a, B:132:0x024e, B:133:0x0253, B:134:0x0254, B:135:0x025b, B:136:0x025c, B:137:0x0263, B:138:0x0264), top: B:236:0x0234 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0254 A[Catch: all -> 0x024b, TryCatch #7 {all -> 0x024b, blocks: (B:121:0x0234, B:123:0x023b, B:125:0x0242, B:127:0x0246, B:129:0x024a, B:132:0x024e, B:133:0x0253, B:134:0x0254, B:135:0x025b, B:136:0x025c, B:137:0x0263, B:138:0x0264), top: B:236:0x0234 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x025c A[Catch: all -> 0x024b, TryCatch #7 {all -> 0x024b, blocks: (B:121:0x0234, B:123:0x023b, B:125:0x0242, B:127:0x0246, B:129:0x024a, B:132:0x024e, B:133:0x0253, B:134:0x0254, B:135:0x025b, B:136:0x025c, B:137:0x0263, B:138:0x0264), top: B:236:0x0234 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0264 A[Catch: all -> 0x024b, TRY_LEAVE, TryCatch #7 {all -> 0x024b, blocks: (B:121:0x0234, B:123:0x023b, B:125:0x0242, B:127:0x0246, B:129:0x024a, B:132:0x024e, B:133:0x0253, B:134:0x0254, B:135:0x025b, B:136:0x025c, B:137:0x0263, B:138:0x0264), top: B:236:0x0234 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:170:0x0327  */
    /* JADX WARN: Code duplicated, block: B:183:0x0357  */
    /* JADX WARN: Code duplicated, block: B:184:0x0358 A[Catch: all -> 0x009d, TRY_LEAVE, TryCatch #17 {, blocks: (B:178:0x033d, B:181:0x0347, B:184:0x0358, B:32:0x0096, B:155:0x02b2, B:158:0x02cb, B:160:0x02cf, B:194:0x036b), top: B:252:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x035d  */
    /* JADX WARN: Code duplicated, block: B:194:0x036b A[Catch: all -> 0x009d, TRY_ENTER, TRY_LEAVE, TryCatch #17 {, blocks: (B:178:0x033d, B:181:0x0347, B:184:0x0358, B:32:0x0096, B:155:0x02b2, B:158:0x02cb, B:160:0x02cf, B:194:0x036b), top: B:252:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x037e  */
    /* JADX WARN: Code duplicated, block: B:205:0x0392 A[Catch: all -> 0x03a2, TryCatch #0 {all -> 0x03a2, blocks: (B:203:0x038b, B:205:0x0392, B:207:0x0399, B:209:0x039d, B:211:0x03a1, B:214:0x03a5, B:215:0x03aa, B:216:0x03ab, B:217:0x03b2, B:218:0x03b3, B:219:0x03ba, B:220:0x03bb), top: B:225:0x038b }] */
    /* JADX WARN: Code duplicated, block: B:207:0x0399 A[Catch: all -> 0x03a2, TryCatch #0 {all -> 0x03a2, blocks: (B:203:0x038b, B:205:0x0392, B:207:0x0399, B:209:0x039d, B:211:0x03a1, B:214:0x03a5, B:215:0x03aa, B:216:0x03ab, B:217:0x03b2, B:218:0x03b3, B:219:0x03ba, B:220:0x03bb), top: B:225:0x038b }] */
    /* JADX WARN: Code duplicated, block: B:209:0x039d A[Catch: all -> 0x03a2, TryCatch #0 {all -> 0x03a2, blocks: (B:203:0x038b, B:205:0x0392, B:207:0x0399, B:209:0x039d, B:211:0x03a1, B:214:0x03a5, B:215:0x03aa, B:216:0x03ab, B:217:0x03b2, B:218:0x03b3, B:219:0x03ba, B:220:0x03bb), top: B:225:0x038b }] */
    /* JADX WARN: Code duplicated, block: B:211:0x03a1 A[Catch: all -> 0x03a2, TryCatch #0 {all -> 0x03a2, blocks: (B:203:0x038b, B:205:0x0392, B:207:0x0399, B:209:0x039d, B:211:0x03a1, B:214:0x03a5, B:215:0x03aa, B:216:0x03ab, B:217:0x03b2, B:218:0x03b3, B:219:0x03ba, B:220:0x03bb), top: B:225:0x038b }] */
    /* JADX WARN: Code duplicated, block: B:214:0x03a5 A[Catch: all -> 0x03a2, TryCatch #0 {all -> 0x03a2, blocks: (B:203:0x038b, B:205:0x0392, B:207:0x0399, B:209:0x039d, B:211:0x03a1, B:214:0x03a5, B:215:0x03aa, B:216:0x03ab, B:217:0x03b2, B:218:0x03b3, B:219:0x03ba, B:220:0x03bb), top: B:225:0x038b }] */
    /* JADX WARN: Code duplicated, block: B:216:0x03ab A[Catch: all -> 0x03a2, TryCatch #0 {all -> 0x03a2, blocks: (B:203:0x038b, B:205:0x0392, B:207:0x0399, B:209:0x039d, B:211:0x03a1, B:214:0x03a5, B:215:0x03aa, B:216:0x03ab, B:217:0x03b2, B:218:0x03b3, B:219:0x03ba, B:220:0x03bb), top: B:225:0x038b }] */
    /* JADX WARN: Code duplicated, block: B:218:0x03b3 A[Catch: all -> 0x03a2, TryCatch #0 {all -> 0x03a2, blocks: (B:203:0x038b, B:205:0x0392, B:207:0x0399, B:209:0x039d, B:211:0x03a1, B:214:0x03a5, B:215:0x03aa, B:216:0x03ab, B:217:0x03b2, B:218:0x03b3, B:219:0x03ba, B:220:0x03bb), top: B:225:0x038b }] */
    /* JADX WARN: Code duplicated, block: B:220:0x03bb A[Catch: all -> 0x03a2, TRY_LEAVE, TryCatch #0 {all -> 0x03a2, blocks: (B:203:0x038b, B:205:0x0392, B:207:0x0399, B:209:0x039d, B:211:0x03a1, B:214:0x03a5, B:215:0x03aa, B:216:0x03ab, B:217:0x03b2, B:218:0x03b3, B:219:0x03ba, B:220:0x03bb), top: B:225:0x038b }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0173  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v13, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v22, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v3, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v20, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v34, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v18, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v8, types: [ads_mobile_sdk.w03] */
    public static final Object a(ja0 ja0Var, wretchedly.dern dernVar) {
        ha0 ha0Var;
        ?? r10;
        ?? r12;
        ?? r11;
        ?? r13;
        Activity activityB;
        boolean z;
        ?? r14;
        Activity activityB2;
        boolean z2;
        ?? r15;
        ?? r16;
        ?? r2;
        Activity activity;
        ja0 ja0Var2;
        ja0 ja0Var3;
        hobby hobbyVar;
        ?? r5;
        ?? r4;
        ?? r6;
        URL url;
        ?? r17;
        ?? r18;
        ?? r7;
        ?? r3;
        Object objA;
        ?? r8;
        ?? r19;
        ?? r9;
        Activity activity2;
        ja0 ja0Var4;
        ja0 ja0Var5;
        hobby hobbyVar2;
        ?? r20;
        ?? r21;
        ?? r22;
        URL url2;
        ?? r110;
        ?? r111;
        ?? r23;
        ?? r24;
        Object objA2;
        ?? r25;
        ja0 ja0Var6 = ja0Var;
        ja0Var6.getClass();
        if (dernVar instanceof ha0) {
            ha0Var = (ha0) dernVar;
            int i = ha0Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                ha0Var.i = i - Integer.MIN_VALUE;
            } else {
                ha0Var = new ha0(ja0Var6, dernVar);
            }
        } else {
            ha0Var = new ha0(ja0Var6, dernVar);
        }
        ha0 ha0Var2 = ha0Var;
        Object obj = ha0Var2.g;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        ?? r26 = ha0Var2.i;
        try {
            try {
                switch (r26) {
                    case 0:
                        p002kotlin.dern.saneness(obj);
                        ri2 ri2Var = ja0Var6.c;
                        no0 no0Var = no0.CUI_NAME_DEBUG_MENU_DEBUG_SIGNALS;
                        l13 l13Var = ja0Var6.o;
                        List listFormularize = adultoid.formularize();
                        if (j13.b().a == null) {
                            v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                            try {
                                activityB2 = ja0Var6.e.b();
                                if (activityB2 == null) {
                                    y13.a("No Activity context available for starting debug signals.", null, 6);
                                    ja0Var6.k.set(false);
                                    Unit unit = Unit.f29295attabal;
                                    interaction.saneness.attabal(v62VarA, null);
                                    return unit;
                                }
                                z2 = ja0Var6.h.g.get();
                                wz0 wz0Var = ja0Var6.j;
                                String str = ja0Var6.l;
                                JsonObject jsonObject = ja0Var6.n;
                                ha0Var2.a = ja0Var6;
                                ha0Var2.b = v62VarA;
                                ha0Var2.c = v62VarA;
                                ha0Var2.d = activityB2;
                                ha0Var2.f = z2;
                                ha0Var2.i = 1;
                                Object objA3 = wz0Var.a(jsonObject, str, ha0Var2);
                                if (objA3 != objBeachfront) {
                                    v62 v62Var = v62VarA;
                                    obj = objA3;
                                    r15 = v62Var;
                                    r16 = v62Var;
                                    ja0Var6.h.g.set(((Boolean) obj).booleanValue());
                                    if (!ja0Var6.h.g.get()) {
                                        ha0Var2.a = r16;
                                        ha0Var2.b = r15;
                                        ha0Var2.c = null;
                                        ha0Var2.d = null;
                                        ha0Var2.i = 5;
                                        if (ja0Var6.c(ha0Var2) != objBeachfront) {
                                            r2 = r15;
                                            Unit unit2 = Unit.f29295attabal;
                                            interaction.saneness.attabal(r2, null);
                                            return unit2;
                                        }
                                    } else if (!z2 || ja0Var6.n == null) {
                                        activity = activityB2;
                                        ja0Var2 = ja0Var6;
                                        r18 = r15;
                                        r17 = r16;
                                        try {
                                            ha0Var2.a = r17;
                                            ha0Var2.b = r18;
                                            ha0Var2.c = null;
                                            ha0Var2.d = null;
                                            ha0Var2.i = 4;
                                            ja0Var2.getClass();
                                            objA = a(ja0Var2, false, "The device is successfully linked for troubleshooting.", activity, false, (wretchedly.dern) ha0Var2, 1);
                                            if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                                                objA = Unit.f29295attabal;
                                            }
                                            if (objA != objBeachfront) {
                                                r8 = r18;
                                                Unit unit3 = Unit.f29295attabal;
                                                interaction.saneness.attabal(r8, null);
                                                return unit3;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            r3 = r18;
                                            r7 = r17;
                                            r10 = r3;
                                            r12 = r7;
                                            try {
                                                r12.b(th);
                                                if (!(th instanceof evenfall)) {
                                                    throw th;
                                                }
                                                r12.a(th);
                                                if (!(th instanceof TimeoutCancellationException)) {
                                                    throw new cp0(th);
                                                }
                                                if (!(th instanceof CancellationException)) {
                                                    throw new bn0(th);
                                                }
                                                if (th instanceof yn0) {
                                                    throw th;
                                                }
                                                throw new gn0(th);
                                            } catch (Throwable th2) {
                                                try {
                                                    throw th2;
                                                } catch (Throwable th3) {
                                                    interaction.saneness.attabal(r10, th2);
                                                    throw th3;
                                                }
                                            }
                                        }
                                    } else {
                                        hobby hobbyVar3 = ja0Var6.i;
                                        jk0 jk0Var = ja0Var6.f;
                                        jk0Var.getClass();
                                        Intrinsics.checkNotNullParameter("gads:drx_debug:send_debug_data_url", X3.i.W);
                                        Intrinsics.checkNotNullParameter("https://www.google.com/dfp/sendDebugData", "defaultValue");
                                        String str2 = (String) jk0Var.a("gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData", zk.o);
                                        ha0Var2.a = ja0Var6;
                                        ha0Var2.b = r16;
                                        ha0Var2.c = r15;
                                        ha0Var2.d = activityB2;
                                        ha0Var2.e = hobbyVar3;
                                        ha0Var2.i = 2;
                                        Object objA4 = ja0Var6.j.a(str2, ja0Var6.l, ja0Var6.n, ha0Var2);
                                        if (objA4 != objBeachfront) {
                                            ja0Var3 = ja0Var6;
                                            hobbyVar = hobbyVar3;
                                            obj = objA4;
                                            r5 = r15;
                                            r4 = r16;
                                            try {
                                                url = new URL(((Uri) obj).toString());
                                                ha0Var2.a = ja0Var3;
                                                try {
                                                    ha0Var2.b = r4;
                                                    ha0Var2.c = r5;
                                                    ha0Var2.d = activityB2;
                                                    ha0Var2.e = null;
                                                    ha0Var2.i = 3;
                                                    if (hobby.attabal(hobbyVar, url, null, ha0Var2, 14) != objBeachfront) {
                                                        activity = activityB2;
                                                        r17 = r4;
                                                        r18 = r5;
                                                        ja0Var2 = ja0Var3;
                                                        ha0Var2.a = r17;
                                                        ha0Var2.b = r18;
                                                        ha0Var2.c = null;
                                                        ha0Var2.d = null;
                                                        ha0Var2.i = 4;
                                                        ja0Var2.getClass();
                                                        objA = a(ja0Var2, false, "The device is successfully linked for troubleshooting.", activity, false, (wretchedly.dern) ha0Var2, 1);
                                                        if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                                                            objA = Unit.f29295attabal;
                                                        }
                                                        if (objA != objBeachfront) {
                                                            r8 = r18;
                                                            Unit unit4 = Unit.f29295attabal;
                                                            interaction.saneness.attabal(r8, null);
                                                            return unit4;
                                                        }
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    r12 = r4;
                                                    r10 = r5;
                                                    r12.b(th);
                                                    if (!(th instanceof evenfall)) {
                                                        throw th;
                                                    }
                                                    r12.a(th);
                                                    if (!(th instanceof TimeoutCancellationException)) {
                                                        throw new cp0(th);
                                                    }
                                                    if (!(th instanceof CancellationException)) {
                                                        throw new bn0(th);
                                                    }
                                                    if (th instanceof yn0) {
                                                        throw th;
                                                    }
                                                    throw new gn0(th);
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                r6 = r4;
                                                r10 = r5;
                                                r12 = r6;
                                                r12.b(th);
                                                if (!(th instanceof evenfall)) {
                                                    throw th;
                                                }
                                                r12.a(th);
                                                if (!(th instanceof TimeoutCancellationException)) {
                                                    throw new cp0(th);
                                                }
                                                if (!(th instanceof CancellationException)) {
                                                    throw new bn0(th);
                                                }
                                                if (th instanceof yn0) {
                                                    throw th;
                                                }
                                                throw new gn0(th);
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                r10 = v62VarA;
                                r12 = r10;
                                r12.b(th);
                                if (!(th instanceof evenfall)) {
                                    throw th;
                                }
                                r12.a(th);
                                if (!(th instanceof TimeoutCancellationException)) {
                                    throw new cp0(th);
                                }
                                if (!(th instanceof CancellationException)) {
                                    throw new bn0(th);
                                }
                                if (th instanceof yn0) {
                                    throw th;
                                }
                                throw new gn0(th);
                            }
                        } else {
                            w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
                            try {
                                activityB = ja0Var6.e.b();
                                if (activityB == null) {
                                    y13.a("No Activity context available for starting debug signals.", null, 6);
                                    ja0Var6.k.set(false);
                                    Unit unit5 = Unit.f29295attabal;
                                    interaction.saneness.attabal(w03VarA, null);
                                    return unit5;
                                }
                                z = ja0Var6.h.g.get();
                                wz0 wz0Var2 = ja0Var6.j;
                                String str3 = ja0Var6.l;
                                JsonObject jsonObject2 = ja0Var6.n;
                                ha0Var2.a = ja0Var6;
                                ha0Var2.b = w03VarA;
                                ha0Var2.c = w03VarA;
                                ha0Var2.d = activityB;
                                ha0Var2.f = z;
                                ha0Var2.i = 6;
                                Object objA5 = wz0Var2.a(jsonObject2, str3, ha0Var2);
                                if (objA5 != objBeachfront) {
                                    w03 w03Var = w03VarA;
                                    obj = objA5;
                                    r14 = w03Var;
                                    r19 = w03Var;
                                    ja0Var6.h.g.set(((Boolean) obj).booleanValue());
                                    if (!ja0Var6.h.g.get()) {
                                        ha0Var2.a = r19;
                                        ha0Var2.b = r14;
                                        ha0Var2.c = null;
                                        ha0Var2.d = null;
                                        ha0Var2.i = 10;
                                        if (ja0Var6.c(ha0Var2) != objBeachfront) {
                                            r9 = r14;
                                            Unit unit6 = Unit.f29295attabal;
                                            interaction.saneness.attabal(r9, null);
                                            return unit6;
                                        }
                                    } else if (!z || ja0Var6.n == null) {
                                        activity2 = activityB;
                                        ja0Var4 = ja0Var6;
                                        r111 = r14;
                                        r110 = r19;
                                        try {
                                            ha0Var2.a = r110;
                                            ha0Var2.b = r111;
                                            ha0Var2.c = null;
                                            ha0Var2.d = null;
                                            ha0Var2.i = 9;
                                            ja0Var4.getClass();
                                            objA2 = a(ja0Var4, false, "The device is successfully linked for troubleshooting.", activity2, false, (wretchedly.dern) ha0Var2, 1);
                                            if (objA2 != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                                                objA2 = Unit.f29295attabal;
                                            }
                                            if (objA2 != objBeachfront) {
                                                r25 = r111;
                                                Unit unit7 = Unit.f29295attabal;
                                                interaction.saneness.attabal(r25, null);
                                                return unit7;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            r24 = r111;
                                            r23 = r110;
                                            r11 = r24;
                                            r13 = r23;
                                            try {
                                                r13.b(th);
                                                if (!(th instanceof evenfall)) {
                                                    throw th;
                                                }
                                                r13.a(th);
                                                if (!(th instanceof TimeoutCancellationException)) {
                                                    throw new cp0(th);
                                                }
                                                if (!(th instanceof CancellationException)) {
                                                    throw new bn0(th);
                                                }
                                                if (th instanceof yn0) {
                                                    throw th;
                                                }
                                                throw new gn0(th);
                                            } catch (Throwable th8) {
                                                try {
                                                    throw th8;
                                                } catch (Throwable th9) {
                                                    interaction.saneness.attabal(r11, th8);
                                                    throw th9;
                                                }
                                            }
                                        }
                                    } else {
                                        hobby hobbyVar4 = ja0Var6.i;
                                        jk0 jk0Var2 = ja0Var6.f;
                                        jk0Var2.getClass();
                                        Intrinsics.checkNotNullParameter("gads:drx_debug:send_debug_data_url", X3.i.W);
                                        Intrinsics.checkNotNullParameter("https://www.google.com/dfp/sendDebugData", "defaultValue");
                                        String str4 = (String) jk0Var2.a("gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData", zk.o);
                                        ha0Var2.a = ja0Var6;
                                        ha0Var2.b = r19;
                                        ha0Var2.c = r14;
                                        ha0Var2.d = activityB;
                                        ha0Var2.e = hobbyVar4;
                                        ha0Var2.i = 7;
                                        Object objA6 = ja0Var6.j.a(str4, ja0Var6.l, ja0Var6.n, ha0Var2);
                                        if (objA6 != objBeachfront) {
                                            ja0Var5 = ja0Var6;
                                            hobbyVar2 = hobbyVar4;
                                            obj = objA6;
                                            r20 = r14;
                                            r21 = r19;
                                            try {
                                                url2 = new URL(((Uri) obj).toString());
                                                ha0Var2.a = ja0Var5;
                                                try {
                                                    ha0Var2.b = r21;
                                                    ha0Var2.c = r20;
                                                    ha0Var2.d = activityB;
                                                    ha0Var2.e = null;
                                                    ha0Var2.i = 8;
                                                    if (hobby.attabal(hobbyVar2, url2, null, ha0Var2, 14) != objBeachfront) {
                                                        activity2 = activityB;
                                                        r110 = r21;
                                                        r111 = r20;
                                                        ja0Var4 = ja0Var5;
                                                        ha0Var2.a = r110;
                                                        ha0Var2.b = r111;
                                                        ha0Var2.c = null;
                                                        ha0Var2.d = null;
                                                        ha0Var2.i = 9;
                                                        ja0Var4.getClass();
                                                        objA2 = a(ja0Var4, false, "The device is successfully linked for troubleshooting.", activity2, false, (wretchedly.dern) ha0Var2, 1);
                                                        if (objA2 != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                                                            objA2 = Unit.f29295attabal;
                                                        }
                                                        if (objA2 != objBeachfront) {
                                                            r25 = r111;
                                                            Unit unit8 = Unit.f29295attabal;
                                                            interaction.saneness.attabal(r25, null);
                                                            return unit8;
                                                        }
                                                    }
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    r13 = r21;
                                                    r11 = r20;
                                                    r13.b(th);
                                                    if (!(th instanceof evenfall)) {
                                                        throw th;
                                                    }
                                                    r13.a(th);
                                                    if (!(th instanceof TimeoutCancellationException)) {
                                                        throw new cp0(th);
                                                    }
                                                    if (!(th instanceof CancellationException)) {
                                                        throw new bn0(th);
                                                    }
                                                    if (th instanceof yn0) {
                                                        throw th;
                                                    }
                                                    throw new gn0(th);
                                                }
                                            } catch (Throwable th11) {
                                                th = th11;
                                                r22 = r21;
                                                r11 = r20;
                                                r13 = r22;
                                                r13.b(th);
                                                if (!(th instanceof evenfall)) {
                                                    throw th;
                                                }
                                                r13.a(th);
                                                if (!(th instanceof TimeoutCancellationException)) {
                                                    throw new cp0(th);
                                                }
                                                if (!(th instanceof CancellationException)) {
                                                    throw new bn0(th);
                                                }
                                                if (th instanceof yn0) {
                                                    throw th;
                                                }
                                                throw new gn0(th);
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th12) {
                                th = th12;
                                r11 = w03VarA;
                                r13 = r11;
                                r13.b(th);
                                if (!(th instanceof evenfall)) {
                                    throw th;
                                }
                                r13.a(th);
                                if (!(th instanceof TimeoutCancellationException)) {
                                    throw new cp0(th);
                                }
                                if (!(th instanceof CancellationException)) {
                                    throw new bn0(th);
                                }
                                if (th instanceof yn0) {
                                    throw th;
                                }
                                throw new gn0(th);
                            }
                        }
                        return objBeachfront;
                    case 1:
                        boolean z3 = ha0Var2.f;
                        activityB2 = ha0Var2.d;
                        r10 = ha0Var2.c;
                        r12 = (w03) ha0Var2.b;
                        ja0 ja0Var7 = (ja0) ha0Var2.a;
                        p002kotlin.dern.saneness(obj);
                        z2 = z3;
                        ja0Var6 = ja0Var7;
                        r15 = r10;
                        r16 = r12;
                        ja0Var6.h.g.set(((Boolean) obj).booleanValue());
                        if (!ja0Var6.h.g.get()) {
                            if (z2) {
                            }
                            activity = activityB2;
                            ja0Var2 = ja0Var6;
                            r18 = r15;
                            r17 = r16;
                            ha0Var2.a = r17;
                            ha0Var2.b = r18;
                            ha0Var2.c = null;
                            ha0Var2.d = null;
                            ha0Var2.i = 4;
                            ja0Var2.getClass();
                            objA = a(ja0Var2, false, "The device is successfully linked for troubleshooting.", activity, false, (wretchedly.dern) ha0Var2, 1);
                            if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                                objA = Unit.f29295attabal;
                            }
                            if (objA != objBeachfront) {
                                r8 = r18;
                                Unit unit9 = Unit.f29295attabal;
                                interaction.saneness.attabal(r8, null);
                                return unit9;
                            }
                            break;
                        } else {
                            ha0Var2.a = r16;
                            ha0Var2.b = r15;
                            ha0Var2.c = null;
                            ha0Var2.d = null;
                            ha0Var2.i = 5;
                            if (ja0Var6.c(ha0Var2) != objBeachfront) {
                                r2 = r15;
                                Unit unit10 = Unit.f29295attabal;
                                interaction.saneness.attabal(r2, null);
                                return unit10;
                            }
                        }
                        return objBeachfront;
                    case 2:
                        hobbyVar = ha0Var2.e;
                        activityB2 = ha0Var2.d;
                        r5 = ha0Var2.c;
                        r6 = (w03) ha0Var2.b;
                        ja0Var3 = (ja0) ha0Var2.a;
                        try {
                            p002kotlin.dern.saneness(obj);
                            r4 = r6;
                            r5 = r5;
                            url = new URL(((Uri) obj).toString());
                            ha0Var2.a = ja0Var3;
                            ha0Var2.b = r4;
                            ha0Var2.c = r5;
                            ha0Var2.d = activityB2;
                            ha0Var2.e = null;
                            ha0Var2.i = 3;
                            if (hobby.attabal(hobbyVar, url, null, ha0Var2, 14) != objBeachfront) {
                                activity = activityB2;
                                r17 = r4;
                                r18 = r5;
                                ja0Var2 = ja0Var3;
                                ha0Var2.a = r17;
                                ha0Var2.b = r18;
                                ha0Var2.c = null;
                                ha0Var2.d = null;
                                ha0Var2.i = 4;
                                ja0Var2.getClass();
                                objA = a(ja0Var2, false, "The device is successfully linked for troubleshooting.", activity, false, (wretchedly.dern) ha0Var2, 1);
                                if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                                    objA = Unit.f29295attabal;
                                }
                                if (objA != objBeachfront) {
                                    r8 = r18;
                                    Unit unit11 = Unit.f29295attabal;
                                    interaction.saneness.attabal(r8, null);
                                    return unit11;
                                }
                            }
                            return objBeachfront;
                        } catch (Throwable th13) {
                            th = th13;
                            r10 = r5;
                            r12 = r6;
                            r12.b(th);
                            if (!(th instanceof evenfall)) {
                                throw th;
                            }
                            r12.a(th);
                            if (!(th instanceof TimeoutCancellationException)) {
                                throw new cp0(th);
                            }
                            if (!(th instanceof CancellationException)) {
                                throw new bn0(th);
                            }
                            if (th instanceof yn0) {
                                throw th;
                            }
                            throw new gn0(th);
                        }
                    case 3:
                        Activity activity3 = ha0Var2.d;
                        r3 = ha0Var2.c;
                        r7 = (w03) ha0Var2.b;
                        ja0 ja0Var8 = (ja0) ha0Var2.a;
                        try {
                            p002kotlin.dern.saneness(obj);
                            activity = activity3;
                            r18 = r3;
                            r17 = r7;
                            ja0Var2 = ja0Var8;
                            ha0Var2.a = r17;
                            ha0Var2.b = r18;
                            ha0Var2.c = null;
                            ha0Var2.d = null;
                            ha0Var2.i = 4;
                            ja0Var2.getClass();
                            objA = a(ja0Var2, false, "The device is successfully linked for troubleshooting.", activity, false, (wretchedly.dern) ha0Var2, 1);
                            if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                                objA = Unit.f29295attabal;
                            }
                            if (objA != objBeachfront) {
                                r8 = r18;
                                Unit unit12 = Unit.f29295attabal;
                                interaction.saneness.attabal(r8, null);
                                return unit12;
                            }
                            return objBeachfront;
                        } catch (Throwable th14) {
                            th = th14;
                            r10 = r3;
                            r12 = r7;
                            r12.b(th);
                            if (!(th instanceof evenfall)) {
                                throw th;
                            }
                            r12.a(th);
                            if (!(th instanceof TimeoutCancellationException)) {
                                throw new cp0(th);
                            }
                            if (!(th instanceof CancellationException)) {
                                throw new bn0(th);
                            }
                            if (th instanceof yn0) {
                                throw th;
                            }
                            throw new gn0(th);
                        }
                    case 4:
                        Closeable closeable = ha0Var2.b;
                        p002kotlin.dern.saneness(obj);
                        r8 = closeable;
                        Unit unit13 = Unit.f29295attabal;
                        interaction.saneness.attabal(r8, null);
                        return unit13;
                    case 5:
                        Closeable closeable2 = ha0Var2.b;
                        p002kotlin.dern.saneness(obj);
                        r2 = closeable2;
                        Unit unit14 = Unit.f29295attabal;
                        interaction.saneness.attabal(r2, null);
                        return unit14;
                    case 6:
                        boolean z4 = ha0Var2.f;
                        activityB = ha0Var2.d;
                        r11 = ha0Var2.c;
                        r13 = (w03) ha0Var2.b;
                        ja0 ja0Var9 = (ja0) ha0Var2.a;
                        p002kotlin.dern.saneness(obj);
                        z = z4;
                        ja0Var6 = ja0Var9;
                        r14 = r11;
                        r19 = r13;
                        ja0Var6.h.g.set(((Boolean) obj).booleanValue());
                        if (!ja0Var6.h.g.get()) {
                            if (z) {
                            }
                            activity2 = activityB;
                            ja0Var4 = ja0Var6;
                            r111 = r14;
                            r110 = r19;
                            ha0Var2.a = r110;
                            ha0Var2.b = r111;
                            ha0Var2.c = null;
                            ha0Var2.d = null;
                            ha0Var2.i = 9;
                            ja0Var4.getClass();
                            objA2 = a(ja0Var4, false, "The device is successfully linked for troubleshooting.", activity2, false, (wretchedly.dern) ha0Var2, 1);
                            if (objA2 != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                                objA2 = Unit.f29295attabal;
                            }
                            if (objA2 != objBeachfront) {
                                r25 = r111;
                                Unit unit15 = Unit.f29295attabal;
                                interaction.saneness.attabal(r25, null);
                                return unit15;
                            }
                            break;
                        } else {
                            ha0Var2.a = r19;
                            ha0Var2.b = r14;
                            ha0Var2.c = null;
                            ha0Var2.d = null;
                            ha0Var2.i = 10;
                            if (ja0Var6.c(ha0Var2) != objBeachfront) {
                                r9 = r14;
                                Unit unit16 = Unit.f29295attabal;
                                interaction.saneness.attabal(r9, null);
                                return unit16;
                            }
                        }
                        return objBeachfront;
                    case 7:
                        hobbyVar2 = ha0Var2.e;
                        activityB = ha0Var2.d;
                        r20 = ha0Var2.c;
                        r22 = (w03) ha0Var2.b;
                        ja0Var5 = (ja0) ha0Var2.a;
                        try {
                            p002kotlin.dern.saneness(obj);
                            r21 = r22;
                            r20 = r20;
                            url2 = new URL(((Uri) obj).toString());
                            ha0Var2.a = ja0Var5;
                            ha0Var2.b = r21;
                            ha0Var2.c = r20;
                            ha0Var2.d = activityB;
                            ha0Var2.e = null;
                            ha0Var2.i = 8;
                            if (hobby.attabal(hobbyVar2, url2, null, ha0Var2, 14) != objBeachfront) {
                                activity2 = activityB;
                                r110 = r21;
                                r111 = r20;
                                ja0Var4 = ja0Var5;
                                ha0Var2.a = r110;
                                ha0Var2.b = r111;
                                ha0Var2.c = null;
                                ha0Var2.d = null;
                                ha0Var2.i = 9;
                                ja0Var4.getClass();
                                objA2 = a(ja0Var4, false, "The device is successfully linked for troubleshooting.", activity2, false, (wretchedly.dern) ha0Var2, 1);
                                if (objA2 != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                                    objA2 = Unit.f29295attabal;
                                }
                                if (objA2 != objBeachfront) {
                                    r25 = r111;
                                    Unit unit17 = Unit.f29295attabal;
                                    interaction.saneness.attabal(r25, null);
                                    return unit17;
                                }
                            }
                            return objBeachfront;
                        } catch (Throwable th15) {
                            th = th15;
                            r11 = r20;
                            r13 = r22;
                            r13.b(th);
                            if (!(th instanceof evenfall)) {
                                throw th;
                            }
                            r13.a(th);
                            if (!(th instanceof TimeoutCancellationException)) {
                                throw new cp0(th);
                            }
                            if (!(th instanceof CancellationException)) {
                                throw new bn0(th);
                            }
                            if (th instanceof yn0) {
                                throw th;
                            }
                            throw new gn0(th);
                        }
                    case 8:
                        Activity activity4 = ha0Var2.d;
                        r24 = ha0Var2.c;
                        r23 = (w03) ha0Var2.b;
                        ja0 ja0Var10 = (ja0) ha0Var2.a;
                        try {
                            p002kotlin.dern.saneness(obj);
                            activity2 = activity4;
                            r111 = r24;
                            r110 = r23;
                            ja0Var4 = ja0Var10;
                            ha0Var2.a = r110;
                            ha0Var2.b = r111;
                            ha0Var2.c = null;
                            ha0Var2.d = null;
                            ha0Var2.i = 9;
                            ja0Var4.getClass();
                            objA2 = a(ja0Var4, false, "The device is successfully linked for troubleshooting.", activity2, false, (wretchedly.dern) ha0Var2, 1);
                            if (objA2 != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                                objA2 = Unit.f29295attabal;
                            }
                            if (objA2 != objBeachfront) {
                                r25 = r111;
                                Unit unit18 = Unit.f29295attabal;
                                interaction.saneness.attabal(r25, null);
                                return unit18;
                            }
                            return objBeachfront;
                        } catch (Throwable th16) {
                            th = th16;
                            r11 = r24;
                            r13 = r23;
                            r13.b(th);
                            if (!(th instanceof evenfall)) {
                                throw th;
                            }
                            r13.a(th);
                            if (!(th instanceof TimeoutCancellationException)) {
                                throw new cp0(th);
                            }
                            if (!(th instanceof CancellationException)) {
                                throw new bn0(th);
                            }
                            if (th instanceof yn0) {
                                throw th;
                            }
                            throw new gn0(th);
                        }
                    case 9:
                        Closeable closeable3 = ha0Var2.b;
                        p002kotlin.dern.saneness(obj);
                        r25 = closeable3;
                        Unit unit19 = Unit.f29295attabal;
                        interaction.saneness.attabal(r25, null);
                        return unit19;
                    case 10:
                        Closeable closeable4 = ha0Var2.b;
                        p002kotlin.dern.saneness(obj);
                        r9 = closeable4;
                        Unit unit110 = Unit.f29295attabal;
                        interaction.saneness.attabal(r9, null);
                        return unit110;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th17) {
                th = th17;
                r10 = objBeachfront;
                r12 = r26;
            }
        } catch (Throwable th18) {
            th = th18;
            r11 = objBeachfront;
            r13 = r26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01a3 A[Catch: all -> 0x01c6, TryCatch #3 {all -> 0x01c6, blocks: (B:103:0x019d, B:105:0x01a3, B:108:0x01c1, B:113:0x01c9, B:115:0x01cd), top: B:151:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c1 A[Catch: all -> 0x01c6, TryCatch #3 {all -> 0x01c6, blocks: (B:103:0x019d, B:105:0x01a3, B:108:0x01c1, B:113:0x01c9, B:115:0x01cd), top: B:151:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c9 A[Catch: all -> 0x01c6, TryCatch #3 {all -> 0x01c6, blocks: (B:103:0x019d, B:105:0x01a3, B:108:0x01c1, B:113:0x01c9, B:115:0x01cd), top: B:151:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:115:0x01cd A[Catch: all -> 0x01c6, TRY_LEAVE, TryCatch #3 {all -> 0x01c6, blocks: (B:103:0x019d, B:105:0x01a3, B:108:0x01c1, B:113:0x01c9, B:115:0x01cd), top: B:151:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:127:0x01fb A[Catch: all -> 0x020b, TryCatch #8 {all -> 0x020b, blocks: (B:125:0x01f4, B:127:0x01fb, B:129:0x0202, B:131:0x0206, B:133:0x020a, B:136:0x020e, B:137:0x0213, B:138:0x0214, B:139:0x021b, B:140:0x021c, B:141:0x0223, B:142:0x0224), top: B:159:0x01f4 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0202 A[Catch: all -> 0x020b, TryCatch #8 {all -> 0x020b, blocks: (B:125:0x01f4, B:127:0x01fb, B:129:0x0202, B:131:0x0206, B:133:0x020a, B:136:0x020e, B:137:0x0213, B:138:0x0214, B:139:0x021b, B:140:0x021c, B:141:0x0223, B:142:0x0224), top: B:159:0x01f4 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0206 A[Catch: all -> 0x020b, TryCatch #8 {all -> 0x020b, blocks: (B:125:0x01f4, B:127:0x01fb, B:129:0x0202, B:131:0x0206, B:133:0x020a, B:136:0x020e, B:137:0x0213, B:138:0x0214, B:139:0x021b, B:140:0x021c, B:141:0x0223, B:142:0x0224), top: B:159:0x01f4 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x020a A[Catch: all -> 0x020b, TryCatch #8 {all -> 0x020b, blocks: (B:125:0x01f4, B:127:0x01fb, B:129:0x0202, B:131:0x0206, B:133:0x020a, B:136:0x020e, B:137:0x0213, B:138:0x0214, B:139:0x021b, B:140:0x021c, B:141:0x0223, B:142:0x0224), top: B:159:0x01f4 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x020e A[Catch: all -> 0x020b, TryCatch #8 {all -> 0x020b, blocks: (B:125:0x01f4, B:127:0x01fb, B:129:0x0202, B:131:0x0206, B:133:0x020a, B:136:0x020e, B:137:0x0213, B:138:0x0214, B:139:0x021b, B:140:0x021c, B:141:0x0223, B:142:0x0224), top: B:159:0x01f4 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0214 A[Catch: all -> 0x020b, TryCatch #8 {all -> 0x020b, blocks: (B:125:0x01f4, B:127:0x01fb, B:129:0x0202, B:131:0x0206, B:133:0x020a, B:136:0x020e, B:137:0x0213, B:138:0x0214, B:139:0x021b, B:140:0x021c, B:141:0x0223, B:142:0x0224), top: B:159:0x01f4 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x021c A[Catch: all -> 0x020b, TryCatch #8 {all -> 0x020b, blocks: (B:125:0x01f4, B:127:0x01fb, B:129:0x0202, B:131:0x0206, B:133:0x020a, B:136:0x020e, B:137:0x0213, B:138:0x0214, B:139:0x021b, B:140:0x021c, B:141:0x0223, B:142:0x0224), top: B:159:0x01f4 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0224 A[Catch: all -> 0x020b, TRY_LEAVE, TryCatch #8 {all -> 0x020b, blocks: (B:125:0x01f4, B:127:0x01fb, B:129:0x0202, B:131:0x0206, B:133:0x020a, B:136:0x020e, B:137:0x0213, B:138:0x0214, B:139:0x021b, B:140:0x021c, B:141:0x0223, B:142:0x0224), top: B:159:0x01f4 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8 A[Catch: all -> 0x00fc, TryCatch #9 {all -> 0x00fc, blocks: (B:47:0x00d2, B:49:0x00d8, B:52:0x00f6, B:57:0x00ff, B:59:0x0103), top: B:160:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f6 A[Catch: all -> 0x00fc, TryCatch #9 {all -> 0x00fc, blocks: (B:47:0x00d2, B:49:0x00d8, B:52:0x00f6, B:57:0x00ff, B:59:0x0103), top: B:160:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ff A[Catch: all -> 0x00fc, TryCatch #9 {all -> 0x00fc, blocks: (B:47:0x00d2, B:49:0x00d8, B:52:0x00f6, B:57:0x00ff, B:59:0x0103), top: B:160:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0103 A[Catch: all -> 0x00fc, TRY_LEAVE, TryCatch #9 {all -> 0x00fc, blocks: (B:47:0x00d2, B:49:0x00d8, B:52:0x00f6, B:57:0x00ff, B:59:0x0103), top: B:160:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0133 A[Catch: all -> 0x0143, TryCatch #2 {all -> 0x0143, blocks: (B:69:0x012c, B:71:0x0133, B:73:0x013a, B:75:0x013e, B:77:0x0142, B:80:0x0146, B:81:0x014b, B:82:0x014c, B:83:0x0153, B:84:0x0154, B:85:0x015b, B:86:0x015c), top: B:150:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:73:0x013a A[Catch: all -> 0x0143, TryCatch #2 {all -> 0x0143, blocks: (B:69:0x012c, B:71:0x0133, B:73:0x013a, B:75:0x013e, B:77:0x0142, B:80:0x0146, B:81:0x014b, B:82:0x014c, B:83:0x0153, B:84:0x0154, B:85:0x015b, B:86:0x015c), top: B:150:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:75:0x013e A[Catch: all -> 0x0143, TryCatch #2 {all -> 0x0143, blocks: (B:69:0x012c, B:71:0x0133, B:73:0x013a, B:75:0x013e, B:77:0x0142, B:80:0x0146, B:81:0x014b, B:82:0x014c, B:83:0x0153, B:84:0x0154, B:85:0x015b, B:86:0x015c), top: B:150:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0142 A[Catch: all -> 0x0143, TryCatch #2 {all -> 0x0143, blocks: (B:69:0x012c, B:71:0x0133, B:73:0x013a, B:75:0x013e, B:77:0x0142, B:80:0x0146, B:81:0x014b, B:82:0x014c, B:83:0x0153, B:84:0x0154, B:85:0x015b, B:86:0x015c), top: B:150:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0146 A[Catch: all -> 0x0143, TryCatch #2 {all -> 0x0143, blocks: (B:69:0x012c, B:71:0x0133, B:73:0x013a, B:75:0x013e, B:77:0x0142, B:80:0x0146, B:81:0x014b, B:82:0x014c, B:83:0x0153, B:84:0x0154, B:85:0x015b, B:86:0x015c), top: B:150:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:82:0x014c A[Catch: all -> 0x0143, TryCatch #2 {all -> 0x0143, blocks: (B:69:0x012c, B:71:0x0133, B:73:0x013a, B:75:0x013e, B:77:0x0142, B:80:0x0146, B:81:0x014b, B:82:0x014c, B:83:0x0153, B:84:0x0154, B:85:0x015b, B:86:0x015c), top: B:150:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0154 A[Catch: all -> 0x0143, TryCatch #2 {all -> 0x0143, blocks: (B:69:0x012c, B:71:0x0133, B:73:0x013a, B:75:0x013e, B:77:0x0142, B:80:0x0146, B:81:0x014b, B:82:0x014c, B:83:0x0153, B:84:0x0154, B:85:0x015b, B:86:0x015c), top: B:150:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:86:0x015c A[Catch: all -> 0x0143, TRY_LEAVE, TryCatch #2 {all -> 0x0143, blocks: (B:69:0x012c, B:71:0x0133, B:73:0x013a, B:75:0x013e, B:77:0x0142, B:80:0x0146, B:81:0x014b, B:82:0x014c, B:83:0x0153, B:84:0x0154, B:85:0x015b, B:86:0x015c), top: B:150:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01e1, code lost:
    
        if (r1.a(r4, r12, r6) == r0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0118, code lost:
    
        if (r1.a(r4, r12, r6) == r0) goto L117;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(ads_mobile_sdk.ja0 r11, wretchedly.dern r12) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ja0.b(ads_mobile_sdk.ja0, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(wretchedly.dern dernVar) {
        r90 r90Var;
        ip0 ip0Var;
        ja0 ja0Var;
        ja0 ja0Var2;
        if (dernVar instanceof r90) {
            r90Var = (r90) dernVar;
            int i = r90Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                r90Var.f = i - Integer.MIN_VALUE;
            } else {
                r90Var = new r90(this, dernVar);
            }
        } else {
            r90Var = new r90(this, dernVar);
        }
        Object objA = r90Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = r90Var.f;
        String str = null;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            ip0Var = this.g;
            jk0 jk0Var = this.f;
            grout.attabal(jk0Var, "gads:drx_debug:debug_device_linking_url", X3.i.W, "https://www.google.com/dfp/linkDevice", "defaultValue");
            String str2 = (String) jk0Var.a("gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice", zk.o);
            r90Var.a = this;
            r90Var.b = ip0Var;
            r90Var.c = this;
            r90Var.f = 1;
            objA = this.j.a(str2, this.l, (JsonObject) null, r90Var);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
            ja0Var = this;
            ja0Var2 = ja0Var;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ja0Var2 = r90Var.c;
            ip0Var = r90Var.b;
            ja0Var = r90Var.a;
            p002kotlin.dern.saneness(objA);
        }
        ja0Var2.getClass();
        Intent intent = new Intent("android.intent.action.VIEW", (Uri) objA);
        Bundle bundle = new Bundle();
        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
        String str3 = ja0Var2.p;
        if (str3 != null) {
            str = str3;
        } else {
            Intrinsics.preprohormone(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
        }
        bundle.putString("com.android.browser.application_id", str);
        intent.putExtras(bundle);
        ip0Var.a(intent);
        ja0Var.k.set(false);
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f1 A[Catch: all -> 0x01f2, TryCatch #4 {all -> 0x01f2, blocks: (B:93:0x01db, B:95:0x01e2, B:97:0x01e9, B:99:0x01ed, B:101:0x01f1, B:104:0x01f5, B:105:0x01fa, B:106:0x01fb, B:107:0x0202, B:108:0x0203, B:109:0x020a, B:110:0x020b), top: B:120:0x01db }] */
    /* JADX WARN: Code duplicated, block: B:104:0x01f5 A[Catch: all -> 0x01f2, TryCatch #4 {all -> 0x01f2, blocks: (B:93:0x01db, B:95:0x01e2, B:97:0x01e9, B:99:0x01ed, B:101:0x01f1, B:104:0x01f5, B:105:0x01fa, B:106:0x01fb, B:107:0x0202, B:108:0x0203, B:109:0x020a, B:110:0x020b), top: B:120:0x01db }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01fb A[Catch: all -> 0x01f2, TryCatch #4 {all -> 0x01f2, blocks: (B:93:0x01db, B:95:0x01e2, B:97:0x01e9, B:99:0x01ed, B:101:0x01f1, B:104:0x01f5, B:105:0x01fa, B:106:0x01fb, B:107:0x0202, B:108:0x0203, B:109:0x020a, B:110:0x020b), top: B:120:0x01db }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0203 A[Catch: all -> 0x01f2, TryCatch #4 {all -> 0x01f2, blocks: (B:93:0x01db, B:95:0x01e2, B:97:0x01e9, B:99:0x01ed, B:101:0x01f1, B:104:0x01f5, B:105:0x01fa, B:106:0x01fb, B:107:0x0202, B:108:0x0203, B:109:0x020a, B:110:0x020b), top: B:120:0x01db }] */
    /* JADX WARN: Code duplicated, block: B:110:0x020b A[Catch: all -> 0x01f2, TRY_LEAVE, TryCatch #4 {all -> 0x01f2, blocks: (B:93:0x01db, B:95:0x01e2, B:97:0x01e9, B:99:0x01ed, B:101:0x01f1, B:104:0x01f5, B:105:0x01fa, B:106:0x01fb, B:107:0x0202, B:108:0x0203, B:109:0x020a, B:110:0x020b), top: B:120:0x01db }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0112 A[Catch: all -> 0x0122, TryCatch #2 {all -> 0x0122, blocks: (B:48:0x010b, B:50:0x0112, B:52:0x0119, B:54:0x011d, B:56:0x0121, B:59:0x0125, B:60:0x012a, B:61:0x012b, B:62:0x0132, B:63:0x0133, B:64:0x013a, B:65:0x013b), top: B:117:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0119 A[Catch: all -> 0x0122, TryCatch #2 {all -> 0x0122, blocks: (B:48:0x010b, B:50:0x0112, B:52:0x0119, B:54:0x011d, B:56:0x0121, B:59:0x0125, B:60:0x012a, B:61:0x012b, B:62:0x0132, B:63:0x0133, B:64:0x013a, B:65:0x013b), top: B:117:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:54:0x011d A[Catch: all -> 0x0122, TryCatch #2 {all -> 0x0122, blocks: (B:48:0x010b, B:50:0x0112, B:52:0x0119, B:54:0x011d, B:56:0x0121, B:59:0x0125, B:60:0x012a, B:61:0x012b, B:62:0x0132, B:63:0x0133, B:64:0x013a, B:65:0x013b), top: B:117:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0121 A[Catch: all -> 0x0122, TryCatch #2 {all -> 0x0122, blocks: (B:48:0x010b, B:50:0x0112, B:52:0x0119, B:54:0x011d, B:56:0x0121, B:59:0x0125, B:60:0x012a, B:61:0x012b, B:62:0x0132, B:63:0x0133, B:64:0x013a, B:65:0x013b), top: B:117:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0125 A[Catch: all -> 0x0122, TryCatch #2 {all -> 0x0122, blocks: (B:48:0x010b, B:50:0x0112, B:52:0x0119, B:54:0x011d, B:56:0x0121, B:59:0x0125, B:60:0x012a, B:61:0x012b, B:62:0x0132, B:63:0x0133, B:64:0x013a, B:65:0x013b), top: B:117:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x012b A[Catch: all -> 0x0122, TryCatch #2 {all -> 0x0122, blocks: (B:48:0x010b, B:50:0x0112, B:52:0x0119, B:54:0x011d, B:56:0x0121, B:59:0x0125, B:60:0x012a, B:61:0x012b, B:62:0x0132, B:63:0x0133, B:64:0x013a, B:65:0x013b), top: B:117:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0133 A[Catch: all -> 0x0122, TryCatch #2 {all -> 0x0122, blocks: (B:48:0x010b, B:50:0x0112, B:52:0x0119, B:54:0x011d, B:56:0x0121, B:59:0x0125, B:60:0x012a, B:61:0x012b, B:62:0x0132, B:63:0x0133, B:64:0x013a, B:65:0x013b), top: B:117:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:65:0x013b A[Catch: all -> 0x0122, TRY_LEAVE, TryCatch #2 {all -> 0x0122, blocks: (B:48:0x010b, B:50:0x0112, B:52:0x0119, B:54:0x011d, B:56:0x0121, B:59:0x0125, B:60:0x012a, B:61:0x012b, B:62:0x0132, B:63:0x0133, B:64:0x013a, B:65:0x013b), top: B:117:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e2 A[Catch: all -> 0x01f2, TryCatch #4 {all -> 0x01f2, blocks: (B:93:0x01db, B:95:0x01e2, B:97:0x01e9, B:99:0x01ed, B:101:0x01f1, B:104:0x01f5, B:105:0x01fa, B:106:0x01fb, B:107:0x0202, B:108:0x0203, B:109:0x020a, B:110:0x020b), top: B:120:0x01db }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01e9 A[Catch: all -> 0x01f2, TryCatch #4 {all -> 0x01f2, blocks: (B:93:0x01db, B:95:0x01e2, B:97:0x01e9, B:99:0x01ed, B:101:0x01f1, B:104:0x01f5, B:105:0x01fa, B:106:0x01fb, B:107:0x0202, B:108:0x0203, B:109:0x020a, B:110:0x020b), top: B:120:0x01db }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01ed A[Catch: all -> 0x01f2, TryCatch #4 {all -> 0x01f2, blocks: (B:93:0x01db, B:95:0x01e2, B:97:0x01e9, B:99:0x01ed, B:101:0x01f1, B:104:0x01f5, B:105:0x01fa, B:106:0x01fb, B:107:0x0202, B:108:0x0203, B:109:0x020a, B:110:0x020b), top: B:120:0x01db }] */
    public final Object d(wretchedly.dern dernVar) {
        s90 s90Var;
        w03 w03VarA;
        w03 w03Var;
        ja0 ja0Var;
        w03 w03VarA2;
        w03 w03Var2;
        ja0 ja0Var2;
        Unit unit;
        if (dernVar instanceof s90) {
            s90Var = (s90) dernVar;
            int i = s90Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                s90Var.f = i - Integer.MIN_VALUE;
            } else {
                s90Var = new s90(this, dernVar);
            }
        } else {
            s90Var = new s90(this, dernVar);
        }
        Object obj = s90Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = s90Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            ri2 ri2Var = this.c;
            no0 no0Var = no0.CUI_NAME_DEBUG_MENU_AD_INFO;
            l13 l13Var = this.o;
            List listFormularize = adultoid.formularize();
            if (j13.b().a == null) {
                w03VarA2 = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                try {
                    Activity activityB = this.e.b();
                    if (activityB == null) {
                        y13.a("No Activity context available for displaying the ad info dialog.", null, 6);
                        this.k.set(false);
                        Unit unit2 = Unit.f29295attabal;
                        interaction.saneness.attabal(w03VarA2, null);
                        return unit2;
                    }
                    String str = this.m;
                    if (str == null) {
                        str = "";
                    }
                    final String strA = a(str);
                    try {
                        AlertDialog.Builder positiveButton = new AlertDialog.Builder(activityB, R.style.Theme.Material.Dialog.Alert).setMessage(strA).setTitle("Ad Information").setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: saneness.transverse
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                ja0.a(this.f37345kowloon, dialogInterface);
                            }
                        }).setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: saneness.crescentade
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                ja0.a(this.f37110kowloon, dialogInterface, i3);
                            }
                        }).setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: saneness.baroreceptor
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                ja0.a(this.f37071kowloon, strA, dialogInterface, i3);
                            }
                        });
                        CoroutineContext coroutineContext = this.a;
                        t90 t90Var = new t90(positiveButton, null);
                        s90Var.a = this;
                        s90Var.b = w03VarA2;
                        s90Var.c = w03VarA2;
                        s90Var.f = 1;
                        if (impromptu.competently(coroutineContext, t90Var, s90Var) != objBeachfront) {
                            w03Var2 = w03VarA2;
                            unit = Unit.f29295attabal;
                            interaction.saneness.attabal(w03Var2, null);
                        }
                    } catch (Throwable th) {
                        exception = th;
                        ja0Var2 = this;
                        w03Var2 = w03VarA2;
                        Intrinsics.checkNotNullParameter(exception, "exception");
                        w03 w03VarA3 = j13.a();
                        w03VarA3.e().m = false;
                        w03VarA3.a(exception);
                        ja0Var2.k.set(false);
                        ((d13) ja0Var2.d).a("Failed to show ad info dialog", exception);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    w03Var2 = w03VarA2;
                    w03VarA2.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03VarA2.a(th);
                    if (!(th instanceof TimeoutCancellationException)) {
                        throw new cp0(th);
                    }
                    if (!(th instanceof CancellationException)) {
                        throw new bn0(th);
                    }
                    if (th instanceof yn0) {
                        throw th;
                    }
                    throw new gn0(th);
                }
            } else {
                w03VarA = j13.a(no0Var, adultoid.formularize(), true);
                try {
                    Activity activityB2 = this.e.b();
                    if (activityB2 == null) {
                        y13.a("No Activity context available for displaying the ad info dialog.", null, 6);
                        this.k.set(false);
                        Unit unit3 = Unit.f29295attabal;
                        interaction.saneness.attabal(w03VarA, null);
                        return unit3;
                    }
                    String str2 = this.m;
                    if (str2 == null) {
                        str2 = "";
                    }
                    final String strA2 = a(str2);
                    try {
                        AlertDialog.Builder positiveButton2 = new AlertDialog.Builder(activityB2, R.style.Theme.Material.Dialog.Alert).setMessage(strA2).setTitle("Ad Information").setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: saneness.transverse
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                ja0.a(this.f37345kowloon, dialogInterface);
                            }
                        }).setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: saneness.crescentade
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                ja0.a(this.f37110kowloon, dialogInterface, i3);
                            }
                        }).setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: saneness.baroreceptor
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                ja0.a(this.f37071kowloon, strA2, dialogInterface, i3);
                            }
                        });
                        CoroutineContext coroutineContext2 = this.a;
                        t90 t90Var2 = new t90(positiveButton2, null);
                        s90Var.a = this;
                        s90Var.b = w03VarA;
                        s90Var.c = w03VarA;
                        s90Var.f = 2;
                        if (impromptu.competently(coroutineContext2, t90Var2, s90Var) != objBeachfront) {
                            w03Var = w03VarA;
                            unit = Unit.f29295attabal;
                            interaction.saneness.attabal(w03Var, null);
                        }
                    } catch (Throwable th3) {
                        exception = th3;
                        ja0Var = this;
                        w03Var = w03VarA;
                        Intrinsics.checkNotNullParameter(exception, "exception");
                        w03 w03VarA4 = j13.a();
                        w03VarA4.e().m = false;
                        w03VarA4.a(exception);
                        ja0Var.k.set(false);
                        ((d13) ja0Var.d).a("Failed to show ad info dialog", exception);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    w03Var = w03VarA;
                    w03VarA.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03VarA.a(th);
                    if (!(th instanceof TimeoutCancellationException)) {
                        throw new cp0(th);
                    }
                    if (!(th instanceof CancellationException)) {
                        throw new bn0(th);
                    }
                    if (th instanceof yn0) {
                        throw th;
                    }
                    throw new gn0(th);
                }
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            w03Var2 = s90Var.c;
            w03VarA2 = s90Var.b;
            ja0Var2 = s90Var.a;
            try {
                p002kotlin.dern.saneness(obj);
            } catch (Throwable th5) {
                exception = th5;
                try {
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    w03 w03VarA5 = j13.a();
                    w03VarA5.e().m = false;
                    w03VarA5.a(exception);
                    ja0Var2.k.set(false);
                    ((d13) ja0Var2.d).a("Failed to show ad info dialog", exception);
                } catch (Throwable th6) {
                    th = th6;
                    try {
                        w03VarA2.b(th);
                        if (!(th instanceof evenfall)) {
                            throw th;
                        }
                        w03VarA2.a(th);
                        if (!(th instanceof TimeoutCancellationException)) {
                            throw new cp0(th);
                        }
                        if (!(th instanceof CancellationException)) {
                            throw new bn0(th);
                        }
                        if (th instanceof yn0) {
                            throw th;
                        }
                        throw new gn0(th);
                    } catch (Throwable th7) {
                        try {
                            throw th7;
                        } catch (Throwable th8) {
                            interaction.saneness.attabal(w03Var2, th7);
                            throw th8;
                        }
                    }
                }
            }
            unit = Unit.f29295attabal;
            interaction.saneness.attabal(w03Var2, null);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w03Var = s90Var.c;
            w03VarA = s90Var.b;
            ja0Var = s90Var.a;
            try {
                p002kotlin.dern.saneness(obj);
            } catch (Throwable th9) {
                exception = th9;
                try {
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    w03 w03VarA6 = j13.a();
                    w03VarA6.e().m = false;
                    w03VarA6.a(exception);
                    ja0Var.k.set(false);
                    ((d13) ja0Var.d).a("Failed to show ad info dialog", exception);
                } catch (Throwable th10) {
                    th = th10;
                    try {
                        w03VarA.b(th);
                        if (!(th instanceof evenfall)) {
                            throw th;
                        }
                        w03VarA.a(th);
                        if (!(th instanceof TimeoutCancellationException)) {
                            throw new cp0(th);
                        }
                        if (!(th instanceof CancellationException)) {
                            throw new bn0(th);
                        }
                        if (th instanceof yn0) {
                            throw th;
                        }
                        throw new gn0(th);
                    } catch (Throwable th11) {
                        try {
                            throw th11;
                        } catch (Throwable th12) {
                            interaction.saneness.attabal(w03Var, th11);
                            throw th12;
                        }
                    }
                }
            }
            unit = Unit.f29295attabal;
            interaction.saneness.attabal(w03Var, null);
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:121:0x0301 A[Catch: all -> 0x0311, TryCatch #11 {all -> 0x0311, blocks: (B:119:0x02fa, B:121:0x0301, B:123:0x0308, B:125:0x030c, B:127:0x0310, B:130:0x0314, B:131:0x0319, B:132:0x031a, B:133:0x0321, B:134:0x0322, B:135:0x0329, B:136:0x032a), top: B:243:0x02fa }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0308 A[Catch: all -> 0x0311, TryCatch #11 {all -> 0x0311, blocks: (B:119:0x02fa, B:121:0x0301, B:123:0x0308, B:125:0x030c, B:127:0x0310, B:130:0x0314, B:131:0x0319, B:132:0x031a, B:133:0x0321, B:134:0x0322, B:135:0x0329, B:136:0x032a), top: B:243:0x02fa }] */
    /* JADX WARN: Code duplicated, block: B:125:0x030c A[Catch: all -> 0x0311, TryCatch #11 {all -> 0x0311, blocks: (B:119:0x02fa, B:121:0x0301, B:123:0x0308, B:125:0x030c, B:127:0x0310, B:130:0x0314, B:131:0x0319, B:132:0x031a, B:133:0x0321, B:134:0x0322, B:135:0x0329, B:136:0x032a), top: B:243:0x02fa }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0310 A[Catch: all -> 0x0311, TryCatch #11 {all -> 0x0311, blocks: (B:119:0x02fa, B:121:0x0301, B:123:0x0308, B:125:0x030c, B:127:0x0310, B:130:0x0314, B:131:0x0319, B:132:0x031a, B:133:0x0321, B:134:0x0322, B:135:0x0329, B:136:0x032a), top: B:243:0x02fa }] */
    /* JADX WARN: Code duplicated, block: B:130:0x0314 A[Catch: all -> 0x0311, TryCatch #11 {all -> 0x0311, blocks: (B:119:0x02fa, B:121:0x0301, B:123:0x0308, B:125:0x030c, B:127:0x0310, B:130:0x0314, B:131:0x0319, B:132:0x031a, B:133:0x0321, B:134:0x0322, B:135:0x0329, B:136:0x032a), top: B:243:0x02fa }] */
    /* JADX WARN: Code duplicated, block: B:132:0x031a A[Catch: all -> 0x0311, TryCatch #11 {all -> 0x0311, blocks: (B:119:0x02fa, B:121:0x0301, B:123:0x0308, B:125:0x030c, B:127:0x0310, B:130:0x0314, B:131:0x0319, B:132:0x031a, B:133:0x0321, B:134:0x0322, B:135:0x0329, B:136:0x032a), top: B:243:0x02fa }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0322 A[Catch: all -> 0x0311, TryCatch #11 {all -> 0x0311, blocks: (B:119:0x02fa, B:121:0x0301, B:123:0x0308, B:125:0x030c, B:127:0x0310, B:130:0x0314, B:131:0x0319, B:132:0x031a, B:133:0x0321, B:134:0x0322, B:135:0x0329, B:136:0x032a), top: B:243:0x02fa }] */
    /* JADX WARN: Code duplicated, block: B:136:0x032a A[Catch: all -> 0x0311, TRY_LEAVE, TryCatch #11 {all -> 0x0311, blocks: (B:119:0x02fa, B:121:0x0301, B:123:0x0308, B:125:0x030c, B:127:0x0310, B:130:0x0314, B:131:0x0319, B:132:0x031a, B:133:0x0321, B:134:0x0322, B:135:0x0329, B:136:0x032a), top: B:243:0x02fa }] */
    /* JADX WARN: Code duplicated, block: B:155:0x037d A[Catch: all -> 0x03c5, TRY_LEAVE, TryCatch #4 {all -> 0x03c5, blocks: (B:153:0x0375, B:155:0x037d), top: B:230:0x0375 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x039a  */
    /* JADX WARN: Code duplicated, block: B:161:0x03a5 A[Catch: all -> 0x0079, TryCatch #16 {all -> 0x0079, blocks: (B:193:0x04ba, B:18:0x0069, B:24:0x0085, B:164:0x03ba, B:27:0x0099, B:159:0x039d, B:161:0x03a5, B:172:0x03d2, B:30:0x00b5), top: B:234:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:167:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:171:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:175:0x0412  */
    /* JADX WARN: Code duplicated, block: B:178:0x042f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0432  */
    /* JADX WARN: Code duplicated, block: B:181:0x0433  */
    /* JADX WARN: Code duplicated, block: B:182:0x0435  */
    /* JADX WARN: Code duplicated, block: B:187:0x0493  */
    /* JADX WARN: Code duplicated, block: B:204:0x04d2 A[Catch: all -> 0x04e2, TryCatch #2 {all -> 0x04e2, blocks: (B:202:0x04cb, B:204:0x04d2, B:206:0x04d9, B:208:0x04dd, B:210:0x04e1, B:213:0x04e5, B:214:0x04ea, B:215:0x04eb, B:216:0x04f2, B:217:0x04f3, B:218:0x04fa, B:219:0x04fb), top: B:227:0x04cb }] */
    /* JADX WARN: Code duplicated, block: B:206:0x04d9 A[Catch: all -> 0x04e2, TryCatch #2 {all -> 0x04e2, blocks: (B:202:0x04cb, B:204:0x04d2, B:206:0x04d9, B:208:0x04dd, B:210:0x04e1, B:213:0x04e5, B:214:0x04ea, B:215:0x04eb, B:216:0x04f2, B:217:0x04f3, B:218:0x04fa, B:219:0x04fb), top: B:227:0x04cb }] */
    /* JADX WARN: Code duplicated, block: B:208:0x04dd A[Catch: all -> 0x04e2, TryCatch #2 {all -> 0x04e2, blocks: (B:202:0x04cb, B:204:0x04d2, B:206:0x04d9, B:208:0x04dd, B:210:0x04e1, B:213:0x04e5, B:214:0x04ea, B:215:0x04eb, B:216:0x04f2, B:217:0x04f3, B:218:0x04fa, B:219:0x04fb), top: B:227:0x04cb }] */
    /* JADX WARN: Code duplicated, block: B:210:0x04e1 A[Catch: all -> 0x04e2, TryCatch #2 {all -> 0x04e2, blocks: (B:202:0x04cb, B:204:0x04d2, B:206:0x04d9, B:208:0x04dd, B:210:0x04e1, B:213:0x04e5, B:214:0x04ea, B:215:0x04eb, B:216:0x04f2, B:217:0x04f3, B:218:0x04fa, B:219:0x04fb), top: B:227:0x04cb }] */
    /* JADX WARN: Code duplicated, block: B:213:0x04e5 A[Catch: all -> 0x04e2, TryCatch #2 {all -> 0x04e2, blocks: (B:202:0x04cb, B:204:0x04d2, B:206:0x04d9, B:208:0x04dd, B:210:0x04e1, B:213:0x04e5, B:214:0x04ea, B:215:0x04eb, B:216:0x04f2, B:217:0x04f3, B:218:0x04fa, B:219:0x04fb), top: B:227:0x04cb }] */
    /* JADX WARN: Code duplicated, block: B:215:0x04eb A[Catch: all -> 0x04e2, TryCatch #2 {all -> 0x04e2, blocks: (B:202:0x04cb, B:204:0x04d2, B:206:0x04d9, B:208:0x04dd, B:210:0x04e1, B:213:0x04e5, B:214:0x04ea, B:215:0x04eb, B:216:0x04f2, B:217:0x04f3, B:218:0x04fa, B:219:0x04fb), top: B:227:0x04cb }] */
    /* JADX WARN: Code duplicated, block: B:217:0x04f3 A[Catch: all -> 0x04e2, TryCatch #2 {all -> 0x04e2, blocks: (B:202:0x04cb, B:204:0x04d2, B:206:0x04d9, B:208:0x04dd, B:210:0x04e1, B:213:0x04e5, B:214:0x04ea, B:215:0x04eb, B:216:0x04f2, B:217:0x04f3, B:218:0x04fa, B:219:0x04fb), top: B:227:0x04cb }] */
    /* JADX WARN: Code duplicated, block: B:219:0x04fb A[Catch: all -> 0x04e2, TRY_LEAVE, TryCatch #2 {all -> 0x04e2, blocks: (B:202:0x04cb, B:204:0x04d2, B:206:0x04d9, B:208:0x04dd, B:210:0x04e1, B:213:0x04e5, B:214:0x04ea, B:215:0x04eb, B:216:0x04f2, B:217:0x04f3, B:218:0x04fa, B:219:0x04fb), top: B:227:0x04cb }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01a9 A[Catch: all -> 0x01ed, TRY_LEAVE, TryCatch #8 {all -> 0x01ed, blocks: (B:67:0x01a1, B:69:0x01a9), top: B:237:0x01a1 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cd A[Catch: all -> 0x012a, TRY_LEAVE, TryCatch #6 {all -> 0x012a, blocks: (B:46:0x011d, B:73:0x01c5, B:75:0x01cd, B:86:0x01f5, B:51:0x013d), top: B:234:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e9 A[PHI: r4 r10 r14 r18 r19
  0x01e9: PHI (r4v16 java.io.Closeable) = (r4v11 java.io.Closeable), (r4v17 java.io.Closeable) binds: [B:85:0x01f1, B:74:0x01cb] A[DONT_GENERATE, DONT_INLINE]
  0x01e9: PHI (r10v10 ads_mobile_sdk.ja0) = (r10v6 ads_mobile_sdk.ja0), (r10v12 ads_mobile_sdk.ja0) binds: [B:85:0x01f1, B:74:0x01cb] A[DONT_GENERATE, DONT_INLINE]
  0x01e9: PHI (r14v10 ads_mobile_sdk.w03) = (r14v7 ads_mobile_sdk.w03), (r14v12 ads_mobile_sdk.w03) binds: [B:85:0x01f1, B:74:0x01cb] A[DONT_GENERATE, DONT_INLINE]
  0x01e9: PHI (r18v5 android.app.Activity) = (r18v2 android.app.Activity), (r18v6 android.app.Activity) binds: [B:85:0x01f1, B:74:0x01cb] A[DONT_GENERATE, DONT_INLINE]
  0x01e9: PHI (r19v3 java.lang.String) = (r19v1 java.lang.String), (r19v4 java.lang.String) binds: [B:85:0x01f1, B:74:0x01cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x0234  */
    /* JADX WARN: Code duplicated, block: B:92:0x0255  */
    /* JADX WARN: Code duplicated, block: B:94:0x0258  */
    /* JADX WARN: Code duplicated, block: B:95:0x025a  */
    /* JADX WARN: Code duplicated, block: B:96:0x025c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    public final Object e(wretchedly.dern dernVar) {
        u90 u90Var;
        ?? r13;
        w03 w03Var;
        w03 w03VarA;
        Closeable closeable;
        w03 w03Var2;
        Closeable closeable2;
        String str;
        String str2;
        w03 w03Var3;
        Activity activity;
        Object obj;
        ja0 ja0Var;
        ja0 ja0Var2;
        Activity activity2;
        Object obj2;
        Closeable closeable3;
        Activity activity3;
        Closeable closeable4;
        Object objA;
        ja0 ja0Var3;
        Activity activity4;
        ArrayList arrayList;
        int size;
        int size2;
        int size3;
        Object objJ;
        Activity activity5;
        Object obj3;
        ArrayList arrayList2;
        w03 w03Var4;
        int i;
        final int i2;
        final ja0 ja0Var4;
        Closeable closeable5;
        int i3;
        final int i4;
        final ja0 ja0Var5;
        Closeable closeable6;
        ja0 ja0Var6;
        w03 w03Var5;
        CoroutineContext coroutineContext;
        v90 v90Var;
        Unit unit;
        Closeable closeable7;
        Activity activity6;
        String str3;
        ja0 ja0Var7;
        Closeable closeable8;
        w03 w03Var6;
        Object objA2;
        ja0 ja0Var8;
        Closeable closeable9;
        w03 w03Var7;
        Activity activity7;
        ArrayList arrayList3;
        int size4;
        int size5;
        int size6;
        Object objJ2;
        final ja0 ja0Var9;
        Object obj4;
        int i5;
        int i6;
        final int i7;
        Activity activity8;
        ArrayList arrayList4;
        Closeable closeable10;
        Closeable closeable11;
        int i8;
        Closeable closeable12;
        ja0 ja0Var10;
        CoroutineContext coroutineContext2;
        v90 v90Var2;
        Closeable closeable13;
        w03 w03Var8;
        w03 w03Var9;
        if (dernVar instanceof u90) {
            u90Var = (u90) dernVar;
            int i9 = u90Var.k;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                u90Var.k = i9 - Integer.MIN_VALUE;
            } else {
                u90Var = new u90(this, dernVar);
            }
        } else {
            u90Var = new u90(this, dernVar);
        }
        Object obj5 = u90Var.i;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        ?? r4 = u90Var.k;
        ?? r14 = "None";
        try {
            try {
                try {
                    switch (r4) {
                        case 0:
                            p002kotlin.dern.saneness(obj5);
                            ri2 ri2Var = this.c;
                            no0 no0Var = no0.CUI_NAME_DEBUG_MENU_INSPECTOR_SETTINGS;
                            l13 l13Var = this.o;
                            List listFormularize = adultoid.formularize();
                            str = "Failed to show inspector settings dialog";
                            if (j13.b().a == null) {
                                w03 w03VarA2 = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                                try {
                                    Activity activityB = this.e.b();
                                    if (activityB == null) {
                                        y13.a("No Activity context available for opening ad inspector settings.", null, 6);
                                        this.k.set(false);
                                        Unit unit2 = Unit.f29295attabal;
                                        interaction.saneness.attabal(w03VarA2, null);
                                        return unit2;
                                    }
                                    wz0 wz0Var = this.j;
                                    u90Var.a = this;
                                    u90Var.b = w03VarA2;
                                    u90Var.c = w03VarA2;
                                    u90Var.d = activityB;
                                    u90Var.k = 1;
                                    wz0Var.getClass();
                                    Object objA3 = wz0.a(wz0Var, u90Var);
                                    if (objA3 != objBeachfront) {
                                        ja0Var2 = this;
                                        w03Var = w03VarA2;
                                        activity2 = activityB;
                                        obj2 = objA3;
                                        closeable3 = w03Var;
                                        try {
                                            if (((Boolean) obj2).booleanValue()) {
                                                activity3 = activity2;
                                                closeable4 = closeable3;
                                                ja0Var3 = ja0Var2;
                                                activity4 = activity3;
                                                arrayList = new ArrayList();
                                                arrayList.add("None");
                                                size = arrayList.size() - 1;
                                                arrayList.add("Shake");
                                                size2 = arrayList.size() - 1;
                                                arrayList.add("Flick");
                                                size3 = arrayList.size() - 1;
                                                wz0 wz0Var2 = ja0Var3.j;
                                                u90Var.a = ja0Var3;
                                                u90Var.b = w03Var;
                                                u90Var.c = closeable4;
                                                u90Var.d = activity4;
                                                u90Var.e = arrayList;
                                                u90Var.f = size;
                                                u90Var.g = size2;
                                                u90Var.h = size3;
                                                u90Var.k = 4;
                                                objJ = wz0Var2.j(u90Var);
                                                if (objJ != objBeachfront) {
                                                    activity5 = activity4;
                                                    obj3 = objJ;
                                                    arrayList2 = arrayList;
                                                    w03Var4 = w03Var;
                                                    i = size3;
                                                    i2 = size2;
                                                    ja0Var4 = ja0Var3;
                                                    i3 = energise.f37138attabal[((b11) obj3).r().ordinal()];
                                                    if (i3 != 1) {
                                                        i4 = i;
                                                    } else if (i3 != 2) {
                                                        i4 = size;
                                                    } else {
                                                        i4 = i2;
                                                    }
                                                    final AtomicInteger atomicInteger = new AtomicInteger(i4);
                                                    final int i10 = i;
                                                    AlertDialog.Builder builder = new AlertDialog.Builder(activity5, R.style.Theme.Material.Dialog.Alert);
                                                    builder.setTitle("Setup gesture");
                                                    builder.setSingleChoiceItems((CharSequence[]) arrayList2.toArray(new String[0]), i4, new DialogInterface.OnClickListener() { // from class: saneness.macaronic
                                                        @Override // android.content.DialogInterface.OnClickListener
                                                        public final void onClick(DialogInterface dialogInterface, int i11) {
                                                            ja0.a(atomicInteger, dialogInterface, i11);
                                                        }
                                                    });
                                                    builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: saneness.dirl
                                                        @Override // android.content.DialogInterface.OnCancelListener
                                                        public final void onCancel(DialogInterface dialogInterface) {
                                                            ja0.b(this.f37126kowloon, dialogInterface);
                                                        }
                                                    });
                                                    builder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: saneness.gown
                                                        @Override // android.content.DialogInterface.OnClickListener
                                                        public final void onClick(DialogInterface dialogInterface, int i11) {
                                                            ja0.b(this.f37157kowloon, dialogInterface, i11);
                                                        }
                                                    });
                                                    ja0Var5 = ja0Var4;
                                                    builder.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: saneness.mullein
                                                        @Override // android.content.DialogInterface.OnClickListener
                                                        public final void onClick(DialogInterface dialogInterface, int i11) {
                                                            ja0.a(this.f37209kowloon, atomicInteger, i4, i10, i2, dialogInterface, i11);
                                                        }
                                                    });
                                                    coroutineContext = ja0Var5.a;
                                                    v90Var = new v90(builder, null);
                                                    u90Var.a = ja0Var5;
                                                    u90Var.b = w03Var4;
                                                    u90Var.c = closeable4;
                                                    u90Var.d = null;
                                                    u90Var.e = null;
                                                    u90Var.k = 5;
                                                    if (impromptu.competently(coroutineContext, v90Var, u90Var) != objBeachfront) {
                                                        closeable6 = closeable4;
                                                        w03Var5 = w03Var4;
                                                        Closeable closeable14 = closeable6;
                                                        unit = Unit.f29295attabal;
                                                        interaction.saneness.attabal(closeable14, null);
                                                        return unit;
                                                    }
                                                }
                                            } else {
                                                wz0 wz0Var3 = ja0Var2.j;
                                                String str4 = ja0Var2.l;
                                                JsonObject jsonObject = ja0Var2.n;
                                                u90Var.a = ja0Var2;
                                                u90Var.b = w03Var;
                                                u90Var.c = closeable3;
                                                u90Var.d = activity2;
                                                activity3 = activity2;
                                                u90Var.k = 2;
                                                objA = wz0Var3.a(jsonObject, str4, u90Var);
                                                if (objA != objBeachfront) {
                                                    closeable4 = closeable3;
                                                    if (((Boolean) objA).booleanValue()) {
                                                        ja0Var3 = ja0Var2;
                                                        activity4 = activity3;
                                                        arrayList = new ArrayList();
                                                        arrayList.add("None");
                                                        size = arrayList.size() - 1;
                                                        arrayList.add("Shake");
                                                        size2 = arrayList.size() - 1;
                                                        arrayList.add("Flick");
                                                        size3 = arrayList.size() - 1;
                                                        wz0 wz0Var4 = ja0Var3.j;
                                                        u90Var.a = ja0Var3;
                                                        u90Var.b = w03Var;
                                                        u90Var.c = closeable4;
                                                        u90Var.d = activity4;
                                                        u90Var.e = arrayList;
                                                        u90Var.f = size;
                                                        u90Var.g = size2;
                                                        u90Var.h = size3;
                                                        u90Var.k = 4;
                                                        objJ = wz0Var4.j(u90Var);
                                                        if (objJ != objBeachfront) {
                                                            activity5 = activity4;
                                                            obj3 = objJ;
                                                            arrayList2 = arrayList;
                                                            w03Var4 = w03Var;
                                                            i = size3;
                                                            i2 = size2;
                                                            ja0Var4 = ja0Var3;
                                                            try {
                                                                i3 = energise.f37138attabal[((b11) obj3).r().ordinal()];
                                                                if (i3 != 1) {
                                                                    i4 = i;
                                                                } else if (i3 != 2) {
                                                                    i4 = size;
                                                                } else {
                                                                    i4 = i2;
                                                                }
                                                                final AtomicInteger atomicInteger2 = new AtomicInteger(i4);
                                                                try {
                                                                    final int i11 = i;
                                                                    AlertDialog.Builder builder2 = new AlertDialog.Builder(activity5, R.style.Theme.Material.Dialog.Alert);
                                                                    builder2.setTitle("Setup gesture");
                                                                    builder2.setSingleChoiceItems((CharSequence[]) arrayList2.toArray(new String[0]), i4, new DialogInterface.OnClickListener() { // from class: saneness.macaronic
                                                                        @Override // android.content.DialogInterface.OnClickListener
                                                                        public final void onClick(DialogInterface dialogInterface, int i12) {
                                                                            ja0.a(atomicInteger2, dialogInterface, i12);
                                                                        }
                                                                    });
                                                                    builder2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: saneness.dirl
                                                                        @Override // android.content.DialogInterface.OnCancelListener
                                                                        public final void onCancel(DialogInterface dialogInterface) {
                                                                            ja0.b(this.f37126kowloon, dialogInterface);
                                                                        }
                                                                    });
                                                                    builder2.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: saneness.gown
                                                                        @Override // android.content.DialogInterface.OnClickListener
                                                                        public final void onClick(DialogInterface dialogInterface, int i12) {
                                                                            ja0.b(this.f37157kowloon, dialogInterface, i12);
                                                                        }
                                                                    });
                                                                    ja0Var5 = ja0Var4;
                                                                    try {
                                                                        builder2.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: saneness.mullein
                                                                            @Override // android.content.DialogInterface.OnClickListener
                                                                            public final void onClick(DialogInterface dialogInterface, int i12) {
                                                                                ja0.a(this.f37209kowloon, atomicInteger2, i4, i11, i2, dialogInterface, i12);
                                                                            }
                                                                        });
                                                                        coroutineContext = ja0Var5.a;
                                                                        v90Var = new v90(builder2, null);
                                                                        u90Var.a = ja0Var5;
                                                                        u90Var.b = w03Var4;
                                                                        u90Var.c = closeable4;
                                                                        u90Var.d = null;
                                                                        u90Var.e = null;
                                                                        u90Var.k = 5;
                                                                        if (impromptu.competently(coroutineContext, v90Var, u90Var) != objBeachfront) {
                                                                            closeable6 = closeable4;
                                                                            w03Var5 = w03Var4;
                                                                            Closeable closeable15 = closeable6;
                                                                            unit = Unit.f29295attabal;
                                                                            interaction.saneness.attabal(closeable15, null);
                                                                            return unit;
                                                                        }
                                                                    } catch (Throwable th) {
                                                                        exception = th;
                                                                        closeable6 = closeable4;
                                                                        ja0Var6 = ja0Var5;
                                                                        w03Var5 = w03Var4;
                                                                        try {
                                                                            Intrinsics.checkNotNullParameter(exception, "exception");
                                                                            w03 w03VarA3 = j13.a();
                                                                            w03VarA3.e().m = false;
                                                                            w03VarA3.a(exception);
                                                                            ja0Var6.k.set(false);
                                                                            ((d13) ja0Var6.d).a(str, exception);
                                                                            break;
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                            r14 = closeable6;
                                                                            w03Var = w03Var5;
                                                                            w03VarA2 = w03Var;
                                                                            r13 = r14;
                                                                            try {
                                                                                w03VarA2.b(th);
                                                                                if (!(th instanceof evenfall)) {
                                                                                    throw th;
                                                                                }
                                                                                w03VarA2.a(th);
                                                                                if (!(th instanceof TimeoutCancellationException)) {
                                                                                    throw new cp0(th);
                                                                                }
                                                                                if (!(th instanceof CancellationException)) {
                                                                                    throw new bn0(th);
                                                                                }
                                                                                if (th instanceof yn0) {
                                                                                    throw th;
                                                                                }
                                                                                throw new gn0(th);
                                                                            } catch (Throwable th3) {
                                                                                try {
                                                                                    throw th3;
                                                                                } catch (Throwable th4) {
                                                                                    interaction.saneness.attabal(r13, th3);
                                                                                    throw th4;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (Throwable th5) {
                                                                    exception = th5;
                                                                    ja0Var5 = ja0Var4;
                                                                }
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                r13 = closeable4;
                                                                w03VarA2 = w03Var4;
                                                                w03VarA2.b(th);
                                                                if (!(th instanceof evenfall)) {
                                                                    throw th;
                                                                }
                                                                w03VarA2.a(th);
                                                                if (!(th instanceof TimeoutCancellationException)) {
                                                                    throw new cp0(th);
                                                                }
                                                                if (!(th instanceof CancellationException)) {
                                                                    throw new bn0(th);
                                                                }
                                                                if (th instanceof yn0) {
                                                                    throw th;
                                                                }
                                                                throw new gn0(th);
                                                            }
                                                        }
                                                    } else {
                                                        u90Var.a = w03Var;
                                                        u90Var.b = closeable4;
                                                        u90Var.c = null;
                                                        u90Var.d = null;
                                                        u90Var.k = 3;
                                                        if (ja0Var2.c(u90Var) != objBeachfront) {
                                                            closeable5 = closeable4;
                                                            Unit unit3 = Unit.f29295attabal;
                                                            interaction.saneness.attabal(closeable5, null);
                                                            return unit3;
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            r14 = closeable3;
                                            w03VarA2 = w03Var;
                                            r13 = r14;
                                            w03VarA2.b(th);
                                            if (!(th instanceof evenfall)) {
                                                throw th;
                                            }
                                            w03VarA2.a(th);
                                            if (!(th instanceof TimeoutCancellationException)) {
                                                throw new cp0(th);
                                            }
                                            if (!(th instanceof CancellationException)) {
                                                throw new bn0(th);
                                            }
                                            if (th instanceof yn0) {
                                                throw th;
                                            }
                                            throw new gn0(th);
                                        }
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    r13 = w03VarA2;
                                    w03VarA2.b(th);
                                    if (!(th instanceof evenfall)) {
                                        throw th;
                                    }
                                    w03VarA2.a(th);
                                    if (!(th instanceof TimeoutCancellationException)) {
                                        throw new cp0(th);
                                    }
                                    if (!(th instanceof CancellationException)) {
                                        throw new bn0(th);
                                    }
                                    if (th instanceof yn0) {
                                        throw th;
                                    }
                                    throw new gn0(th);
                                }
                            } else {
                                str2 = str;
                                w03VarA = j13.a(no0Var, adultoid.formularize(), true);
                                try {
                                    Activity activityB2 = this.e.b();
                                    if (activityB2 == null) {
                                        y13.a("No Activity context available for opening ad inspector settings.", null, 6);
                                        this.k.set(false);
                                        Unit unit4 = Unit.f29295attabal;
                                        interaction.saneness.attabal(w03VarA, null);
                                        return unit4;
                                    }
                                    wz0 wz0Var5 = this.j;
                                    u90Var.a = this;
                                    u90Var.b = w03VarA;
                                    u90Var.c = w03VarA;
                                    u90Var.d = activityB2;
                                    u90Var.k = 6;
                                    wz0Var5.getClass();
                                    Object objA4 = wz0.a(wz0Var5, u90Var);
                                    if (objA4 != objBeachfront) {
                                        w03 w03Var10 = w03VarA;
                                        w03Var3 = w03Var10;
                                        activity = activityB2;
                                        obj = objA4;
                                        ja0Var = this;
                                        closeable7 = w03Var10;
                                        try {
                                            if (((Boolean) obj).booleanValue()) {
                                                activity6 = activity;
                                                str3 = str2;
                                                ja0Var7 = ja0Var;
                                                closeable8 = closeable7;
                                                w03Var6 = w03Var3;
                                                activity7 = activity6;
                                                arrayList3 = new ArrayList();
                                                arrayList3.add("None");
                                                size4 = arrayList3.size() - 1;
                                                arrayList3.add("Shake");
                                                size5 = arrayList3.size() - 1;
                                                arrayList3.add("Flick");
                                                size6 = arrayList3.size() - 1;
                                                wz0 wz0Var6 = ja0Var7.j;
                                                u90Var.a = ja0Var7;
                                                u90Var.b = w03Var6;
                                                u90Var.c = closeable8;
                                                u90Var.d = activity7;
                                                u90Var.e = arrayList3;
                                                u90Var.f = size4;
                                                u90Var.g = size5;
                                                u90Var.h = size6;
                                                u90Var.k = 9;
                                                objJ2 = wz0Var6.j(u90Var);
                                                if (objJ2 != objBeachfront) {
                                                    ja0Var9 = ja0Var7;
                                                    obj4 = objJ2;
                                                    i5 = size4;
                                                    w03VarA = w03Var6;
                                                    i6 = size6;
                                                    i7 = size5;
                                                    activity8 = activity7;
                                                    arrayList4 = arrayList3;
                                                    closeable11 = closeable8;
                                                    closeable = closeable11;
                                                    i8 = energise.f37138attabal[((b11) obj4).r().ordinal()];
                                                    if (i8 != 1) {
                                                        i5 = i6;
                                                    } else if (i8 != 2) {
                                                        i5 = i7;
                                                    }
                                                    final AtomicInteger atomicInteger3 = new AtomicInteger(i5);
                                                    final int i12 = i6;
                                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(activity8, R.style.Theme.Material.Dialog.Alert);
                                                    builder3.setTitle("Setup gesture");
                                                    builder3.setSingleChoiceItems((CharSequence[]) arrayList4.toArray(new String[0]), i5, new DialogInterface.OnClickListener() { // from class: saneness.macaronic
                                                        @Override // android.content.DialogInterface.OnClickListener
                                                        public final void onClick(DialogInterface dialogInterface, int i13) {
                                                            ja0.a(atomicInteger3, dialogInterface, i13);
                                                        }
                                                    });
                                                    builder3.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: saneness.dirl
                                                        @Override // android.content.DialogInterface.OnCancelListener
                                                        public final void onCancel(DialogInterface dialogInterface) {
                                                            ja0.b(this.f37126kowloon, dialogInterface);
                                                        }
                                                    });
                                                    builder3.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: saneness.gown
                                                        @Override // android.content.DialogInterface.OnClickListener
                                                        public final void onClick(DialogInterface dialogInterface, int i13) {
                                                            ja0.b(this.f37157kowloon, dialogInterface, i13);
                                                        }
                                                    });
                                                    final int i13 = i5;
                                                    builder3.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: saneness.mullein
                                                        @Override // android.content.DialogInterface.OnClickListener
                                                        public final void onClick(DialogInterface dialogInterface, int i14) {
                                                            ja0.a(this.f37209kowloon, atomicInteger3, i13, i12, i7, dialogInterface, i14);
                                                        }
                                                    });
                                                    coroutineContext2 = ja0Var9.a;
                                                    v90Var2 = new v90(builder3, null);
                                                    u90Var.a = ja0Var9;
                                                    u90Var.b = w03VarA;
                                                    u90Var.c = closeable;
                                                    u90Var.d = null;
                                                    u90Var.e = null;
                                                    u90Var.k = 10;
                                                    if (impromptu.competently(coroutineContext2, v90Var2, u90Var) != objBeachfront) {
                                                        closeable13 = closeable;
                                                        w03Var9 = w03VarA;
                                                        Closeable closeable16 = closeable13;
                                                        unit = Unit.f29295attabal;
                                                        interaction.saneness.attabal(closeable16, null);
                                                        return unit;
                                                    }
                                                }
                                            } else {
                                                wz0 wz0Var7 = ja0Var.j;
                                                String str5 = ja0Var.l;
                                                str3 = str2;
                                                JsonObject jsonObject2 = ja0Var.n;
                                                u90Var.a = ja0Var;
                                                u90Var.b = w03Var3;
                                                u90Var.c = closeable7;
                                                u90Var.d = activity;
                                                activity6 = activity;
                                                u90Var.k = 7;
                                                objA2 = wz0Var7.a(jsonObject2, str5, u90Var);
                                                if (objA2 != objBeachfront) {
                                                    ja0Var8 = ja0Var;
                                                    closeable9 = closeable7;
                                                    w03Var7 = w03Var3;
                                                    if (!((Boolean) objA2).booleanValue()) {
                                                        u90Var.a = w03Var7;
                                                        u90Var.b = closeable9;
                                                        u90Var.c = null;
                                                        u90Var.d = null;
                                                        u90Var.k = 8;
                                                        if (ja0Var8.c(u90Var) == objBeachfront) {
                                                            closeable10 = closeable9;
                                                        }
                                                        closeable10 = closeable9;
                                                        Unit unit5 = Unit.f29295attabal;
                                                        interaction.saneness.attabal(closeable10, null);
                                                        return unit5;
                                                    }
                                                    ja0Var7 = ja0Var8;
                                                    closeable8 = closeable9;
                                                    w03Var6 = w03Var7;
                                                    activity7 = activity6;
                                                    arrayList3 = new ArrayList();
                                                    arrayList3.add("None");
                                                    size4 = arrayList3.size() - 1;
                                                    arrayList3.add("Shake");
                                                    size5 = arrayList3.size() - 1;
                                                    arrayList3.add("Flick");
                                                    size6 = arrayList3.size() - 1;
                                                    wz0 wz0Var8 = ja0Var7.j;
                                                    u90Var.a = ja0Var7;
                                                    u90Var.b = w03Var6;
                                                    u90Var.c = closeable8;
                                                    u90Var.d = activity7;
                                                    u90Var.e = arrayList3;
                                                    u90Var.f = size4;
                                                    u90Var.g = size5;
                                                    u90Var.h = size6;
                                                    u90Var.k = 9;
                                                    objJ2 = wz0Var8.j(u90Var);
                                                    if (objJ2 != objBeachfront) {
                                                        ja0Var9 = ja0Var7;
                                                        obj4 = objJ2;
                                                        i5 = size4;
                                                        w03VarA = w03Var6;
                                                        i6 = size6;
                                                        i7 = size5;
                                                        activity8 = activity7;
                                                        arrayList4 = arrayList3;
                                                        closeable11 = closeable8;
                                                        closeable = closeable11;
                                                        try {
                                                            i8 = energise.f37138attabal[((b11) obj4).r().ordinal()];
                                                            if (i8 != 1) {
                                                                i5 = i6;
                                                            } else if (i8 != 2) {
                                                                i5 = i7;
                                                            }
                                                            final AtomicInteger atomicInteger4 = new AtomicInteger(i5);
                                                            try {
                                                                final int i14 = i6;
                                                                AlertDialog.Builder builder4 = new AlertDialog.Builder(activity8, R.style.Theme.Material.Dialog.Alert);
                                                                builder4.setTitle("Setup gesture");
                                                                builder4.setSingleChoiceItems((CharSequence[]) arrayList4.toArray(new String[0]), i5, new DialogInterface.OnClickListener() { // from class: saneness.macaronic
                                                                    @Override // android.content.DialogInterface.OnClickListener
                                                                    public final void onClick(DialogInterface dialogInterface, int i15) {
                                                                        ja0.a(atomicInteger4, dialogInterface, i15);
                                                                    }
                                                                });
                                                                builder4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: saneness.dirl
                                                                    @Override // android.content.DialogInterface.OnCancelListener
                                                                    public final void onCancel(DialogInterface dialogInterface) {
                                                                        ja0.b(this.f37126kowloon, dialogInterface);
                                                                    }
                                                                });
                                                                builder4.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: saneness.gown
                                                                    @Override // android.content.DialogInterface.OnClickListener
                                                                    public final void onClick(DialogInterface dialogInterface, int i15) {
                                                                        ja0.b(this.f37157kowloon, dialogInterface, i15);
                                                                    }
                                                                });
                                                                final int i15 = i5;
                                                                builder4.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: saneness.mullein
                                                                    @Override // android.content.DialogInterface.OnClickListener
                                                                    public final void onClick(DialogInterface dialogInterface, int i16) {
                                                                        ja0.a(this.f37209kowloon, atomicInteger4, i15, i14, i7, dialogInterface, i16);
                                                                    }
                                                                });
                                                                coroutineContext2 = ja0Var9.a;
                                                                v90Var2 = new v90(builder4, null);
                                                                u90Var.a = ja0Var9;
                                                                u90Var.b = w03VarA;
                                                                u90Var.c = closeable;
                                                                u90Var.d = null;
                                                                u90Var.e = null;
                                                                u90Var.k = 10;
                                                                if (impromptu.competently(coroutineContext2, v90Var2, u90Var) != objBeachfront) {
                                                                    closeable13 = closeable;
                                                                    w03Var9 = w03VarA;
                                                                    Closeable closeable17 = closeable13;
                                                                    unit = Unit.f29295attabal;
                                                                    interaction.saneness.attabal(closeable17, null);
                                                                    return unit;
                                                                }
                                                            } catch (Throwable th9) {
                                                                exception = th9;
                                                                closeable12 = closeable;
                                                                ja0Var10 = ja0Var9;
                                                                w03Var8 = w03VarA;
                                                                try {
                                                                    Intrinsics.checkNotNullParameter(exception, "exception");
                                                                    w03 w03VarA4 = j13.a();
                                                                    w03VarA4.e().m = false;
                                                                    w03VarA4.a(exception);
                                                                    ja0Var10.k.set(false);
                                                                    ((d13) ja0Var10.d).a(str3, exception);
                                                                    closeable13 = closeable12;
                                                                    w03Var9 = w03Var8;
                                                                    break;
                                                                } catch (Throwable th10) {
                                                                    th = th10;
                                                                    closeable2 = closeable12;
                                                                    w03Var2 = w03Var8;
                                                                    closeable = closeable2;
                                                                    w03VarA = w03Var2;
                                                                    try {
                                                                        w03VarA.b(th);
                                                                        if (!(th instanceof evenfall)) {
                                                                            throw th;
                                                                        }
                                                                        w03VarA.a(th);
                                                                        if (!(th instanceof TimeoutCancellationException)) {
                                                                            throw new cp0(th);
                                                                        }
                                                                        if (!(th instanceof CancellationException)) {
                                                                            throw new bn0(th);
                                                                        }
                                                                        if (th instanceof yn0) {
                                                                            throw th;
                                                                        }
                                                                        throw new gn0(th);
                                                                    } catch (Throwable th11) {
                                                                        try {
                                                                            throw th11;
                                                                        } catch (Throwable th12) {
                                                                            interaction.saneness.attabal(closeable, th11);
                                                                            throw th12;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } catch (Throwable th13) {
                                                            th = th13;
                                                            w03VarA.b(th);
                                                            if (!(th instanceof evenfall)) {
                                                                throw th;
                                                            }
                                                            w03VarA.a(th);
                                                            if (!(th instanceof TimeoutCancellationException)) {
                                                                throw new cp0(th);
                                                            }
                                                            if (!(th instanceof CancellationException)) {
                                                                throw new bn0(th);
                                                            }
                                                            if (th instanceof yn0) {
                                                                throw th;
                                                            }
                                                            throw new gn0(th);
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Throwable th14) {
                                            th = th14;
                                            closeable2 = closeable7;
                                            w03Var2 = w03Var3;
                                            closeable = closeable2;
                                            w03VarA = w03Var2;
                                            w03VarA.b(th);
                                            if (!(th instanceof evenfall)) {
                                                throw th;
                                            }
                                            w03VarA.a(th);
                                            if (!(th instanceof TimeoutCancellationException)) {
                                                throw new cp0(th);
                                            }
                                            if (!(th instanceof CancellationException)) {
                                                throw new bn0(th);
                                            }
                                            if (th instanceof yn0) {
                                                throw th;
                                            }
                                            throw new gn0(th);
                                        }
                                    }
                                } catch (Throwable th15) {
                                    th = th15;
                                    closeable = w03VarA;
                                    w03VarA.b(th);
                                    if (!(th instanceof evenfall)) {
                                        throw th;
                                    }
                                    w03VarA.a(th);
                                    if (!(th instanceof TimeoutCancellationException)) {
                                        throw new cp0(th);
                                    }
                                    if (!(th instanceof CancellationException)) {
                                        throw new bn0(th);
                                    }
                                    if (th instanceof yn0) {
                                        throw th;
                                    }
                                    throw new gn0(th);
                                }
                            }
                            return objBeachfront;
                        case 1:
                            Activity activity9 = u90Var.d;
                            Closeable closeable18 = u90Var.c;
                            w03Var = (w03) u90Var.b;
                            ja0Var2 = (ja0) u90Var.a;
                            p002kotlin.dern.saneness(obj5);
                            str = "Failed to show inspector settings dialog";
                            closeable3 = closeable18;
                            activity2 = activity9;
                            obj2 = obj5;
                            if (((Boolean) obj2).booleanValue()) {
                                wz0 wz0Var9 = ja0Var2.j;
                                String str6 = ja0Var2.l;
                                JsonObject jsonObject3 = ja0Var2.n;
                                u90Var.a = ja0Var2;
                                u90Var.b = w03Var;
                                u90Var.c = closeable3;
                                u90Var.d = activity2;
                                activity3 = activity2;
                                u90Var.k = 2;
                                objA = wz0Var9.a(jsonObject3, str6, u90Var);
                                if (objA != objBeachfront) {
                                    closeable4 = closeable3;
                                    if (((Boolean) objA).booleanValue()) {
                                        u90Var.a = w03Var;
                                        u90Var.b = closeable4;
                                        u90Var.c = null;
                                        u90Var.d = null;
                                        u90Var.k = 3;
                                        if (ja0Var2.c(u90Var) != objBeachfront) {
                                            closeable5 = closeable4;
                                            Unit unit6 = Unit.f29295attabal;
                                            interaction.saneness.attabal(closeable5, null);
                                            return unit6;
                                        }
                                    } else {
                                        ja0Var3 = ja0Var2;
                                        activity4 = activity3;
                                        arrayList = new ArrayList();
                                        arrayList.add("None");
                                        size = arrayList.size() - 1;
                                        arrayList.add("Shake");
                                        size2 = arrayList.size() - 1;
                                        arrayList.add("Flick");
                                        size3 = arrayList.size() - 1;
                                        wz0 wz0Var10 = ja0Var3.j;
                                        u90Var.a = ja0Var3;
                                        u90Var.b = w03Var;
                                        u90Var.c = closeable4;
                                        u90Var.d = activity4;
                                        u90Var.e = arrayList;
                                        u90Var.f = size;
                                        u90Var.g = size2;
                                        u90Var.h = size3;
                                        u90Var.k = 4;
                                        objJ = wz0Var10.j(u90Var);
                                        if (objJ != objBeachfront) {
                                            activity5 = activity4;
                                            obj3 = objJ;
                                            arrayList2 = arrayList;
                                            w03Var4 = w03Var;
                                            i = size3;
                                            i2 = size2;
                                            ja0Var4 = ja0Var3;
                                            i3 = energise.f37138attabal[((b11) obj3).r().ordinal()];
                                            if (i3 != 1) {
                                                i4 = i;
                                            } else if (i3 != 2) {
                                                i4 = size;
                                            } else {
                                                i4 = i2;
                                            }
                                            final AtomicInteger atomicInteger5 = new AtomicInteger(i4);
                                            final int i16 = i;
                                            AlertDialog.Builder builder5 = new AlertDialog.Builder(activity5, R.style.Theme.Material.Dialog.Alert);
                                            builder5.setTitle("Setup gesture");
                                            builder5.setSingleChoiceItems((CharSequence[]) arrayList2.toArray(new String[0]), i4, new DialogInterface.OnClickListener() { // from class: saneness.macaronic
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i17) {
                                                    ja0.a(atomicInteger5, dialogInterface, i17);
                                                }
                                            });
                                            builder5.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: saneness.dirl
                                                @Override // android.content.DialogInterface.OnCancelListener
                                                public final void onCancel(DialogInterface dialogInterface) {
                                                    ja0.b(this.f37126kowloon, dialogInterface);
                                                }
                                            });
                                            builder5.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: saneness.gown
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i17) {
                                                    ja0.b(this.f37157kowloon, dialogInterface, i17);
                                                }
                                            });
                                            ja0Var5 = ja0Var4;
                                            builder5.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: saneness.mullein
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i17) {
                                                    ja0.a(this.f37209kowloon, atomicInteger5, i4, i16, i2, dialogInterface, i17);
                                                }
                                            });
                                            coroutineContext = ja0Var5.a;
                                            v90Var = new v90(builder5, null);
                                            u90Var.a = ja0Var5;
                                            u90Var.b = w03Var4;
                                            u90Var.c = closeable4;
                                            u90Var.d = null;
                                            u90Var.e = null;
                                            u90Var.k = 5;
                                            if (impromptu.competently(coroutineContext, v90Var, u90Var) != objBeachfront) {
                                                closeable6 = closeable4;
                                                w03Var5 = w03Var4;
                                                Closeable closeable19 = closeable6;
                                                unit = Unit.f29295attabal;
                                                interaction.saneness.attabal(closeable19, null);
                                                return unit;
                                            }
                                        }
                                    }
                                }
                            } else {
                                activity3 = activity2;
                                closeable4 = closeable3;
                                ja0Var3 = ja0Var2;
                                activity4 = activity3;
                                arrayList = new ArrayList();
                                arrayList.add("None");
                                size = arrayList.size() - 1;
                                arrayList.add("Shake");
                                size2 = arrayList.size() - 1;
                                arrayList.add("Flick");
                                size3 = arrayList.size() - 1;
                                wz0 wz0Var11 = ja0Var3.j;
                                u90Var.a = ja0Var3;
                                u90Var.b = w03Var;
                                u90Var.c = closeable4;
                                u90Var.d = activity4;
                                u90Var.e = arrayList;
                                u90Var.f = size;
                                u90Var.g = size2;
                                u90Var.h = size3;
                                u90Var.k = 4;
                                objJ = wz0Var11.j(u90Var);
                                if (objJ != objBeachfront) {
                                    activity5 = activity4;
                                    obj3 = objJ;
                                    arrayList2 = arrayList;
                                    w03Var4 = w03Var;
                                    i = size3;
                                    i2 = size2;
                                    ja0Var4 = ja0Var3;
                                    i3 = energise.f37138attabal[((b11) obj3).r().ordinal()];
                                    if (i3 != 1) {
                                        i4 = i;
                                    } else if (i3 != 2) {
                                        i4 = size;
                                    } else {
                                        i4 = i2;
                                    }
                                    final AtomicInteger atomicInteger6 = new AtomicInteger(i4);
                                    final int i17 = i;
                                    AlertDialog.Builder builder6 = new AlertDialog.Builder(activity5, R.style.Theme.Material.Dialog.Alert);
                                    builder6.setTitle("Setup gesture");
                                    builder6.setSingleChoiceItems((CharSequence[]) arrayList2.toArray(new String[0]), i4, new DialogInterface.OnClickListener() { // from class: saneness.macaronic
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i18) {
                                            ja0.a(atomicInteger6, dialogInterface, i18);
                                        }
                                    });
                                    builder6.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: saneness.dirl
                                        @Override // android.content.DialogInterface.OnCancelListener
                                        public final void onCancel(DialogInterface dialogInterface) {
                                            ja0.b(this.f37126kowloon, dialogInterface);
                                        }
                                    });
                                    builder6.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: saneness.gown
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i18) {
                                            ja0.b(this.f37157kowloon, dialogInterface, i18);
                                        }
                                    });
                                    ja0Var5 = ja0Var4;
                                    builder6.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: saneness.mullein
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i18) {
                                            ja0.a(this.f37209kowloon, atomicInteger6, i4, i17, i2, dialogInterface, i18);
                                        }
                                    });
                                    coroutineContext = ja0Var5.a;
                                    v90Var = new v90(builder6, null);
                                    u90Var.a = ja0Var5;
                                    u90Var.b = w03Var4;
                                    u90Var.c = closeable4;
                                    u90Var.d = null;
                                    u90Var.e = null;
                                    u90Var.k = 5;
                                    if (impromptu.competently(coroutineContext, v90Var, u90Var) != objBeachfront) {
                                        closeable6 = closeable4;
                                        w03Var5 = w03Var4;
                                        Closeable closeable110 = closeable6;
                                        unit = Unit.f29295attabal;
                                        interaction.saneness.attabal(closeable110, null);
                                        return unit;
                                    }
                                }
                            }
                            return objBeachfront;
                        case 2:
                            Activity activity10 = u90Var.d;
                            closeable4 = u90Var.c;
                            w03Var = (w03) u90Var.b;
                            ja0Var2 = (ja0) u90Var.a;
                            p002kotlin.dern.saneness(obj5);
                            activity3 = activity10;
                            objA = obj5;
                            str = "Failed to show inspector settings dialog";
                            if (((Boolean) objA).booleanValue()) {
                                u90Var.a = w03Var;
                                u90Var.b = closeable4;
                                u90Var.c = null;
                                u90Var.d = null;
                                u90Var.k = 3;
                                if (ja0Var2.c(u90Var) != objBeachfront) {
                                    closeable5 = closeable4;
                                    Unit unit7 = Unit.f29295attabal;
                                    interaction.saneness.attabal(closeable5, null);
                                    return unit7;
                                }
                            } else {
                                ja0Var3 = ja0Var2;
                                activity4 = activity3;
                                arrayList = new ArrayList();
                                arrayList.add("None");
                                size = arrayList.size() - 1;
                                arrayList.add("Shake");
                                size2 = arrayList.size() - 1;
                                arrayList.add("Flick");
                                size3 = arrayList.size() - 1;
                                wz0 wz0Var12 = ja0Var3.j;
                                u90Var.a = ja0Var3;
                                u90Var.b = w03Var;
                                u90Var.c = closeable4;
                                u90Var.d = activity4;
                                u90Var.e = arrayList;
                                u90Var.f = size;
                                u90Var.g = size2;
                                u90Var.h = size3;
                                u90Var.k = 4;
                                objJ = wz0Var12.j(u90Var);
                                if (objJ != objBeachfront) {
                                    activity5 = activity4;
                                    obj3 = objJ;
                                    arrayList2 = arrayList;
                                    w03Var4 = w03Var;
                                    i = size3;
                                    i2 = size2;
                                    ja0Var4 = ja0Var3;
                                    i3 = energise.f37138attabal[((b11) obj3).r().ordinal()];
                                    if (i3 != 1) {
                                        i4 = i;
                                    } else if (i3 != 2) {
                                        i4 = size;
                                    } else {
                                        i4 = i2;
                                    }
                                    final AtomicInteger atomicInteger7 = new AtomicInteger(i4);
                                    final int i18 = i;
                                    AlertDialog.Builder builder7 = new AlertDialog.Builder(activity5, R.style.Theme.Material.Dialog.Alert);
                                    builder7.setTitle("Setup gesture");
                                    builder7.setSingleChoiceItems((CharSequence[]) arrayList2.toArray(new String[0]), i4, new DialogInterface.OnClickListener() { // from class: saneness.macaronic
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i19) {
                                            ja0.a(atomicInteger7, dialogInterface, i19);
                                        }
                                    });
                                    builder7.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: saneness.dirl
                                        @Override // android.content.DialogInterface.OnCancelListener
                                        public final void onCancel(DialogInterface dialogInterface) {
                                            ja0.b(this.f37126kowloon, dialogInterface);
                                        }
                                    });
                                    builder7.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: saneness.gown
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i19) {
                                            ja0.b(this.f37157kowloon, dialogInterface, i19);
                                        }
                                    });
                                    ja0Var5 = ja0Var4;
                                    builder7.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: saneness.mullein
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i19) {
                                            ja0.a(this.f37209kowloon, atomicInteger7, i4, i18, i2, dialogInterface, i19);
                                        }
                                    });
                                    coroutineContext = ja0Var5.a;
                                    v90Var = new v90(builder7, null);
                                    u90Var.a = ja0Var5;
                                    u90Var.b = w03Var4;
                                    u90Var.c = closeable4;
                                    u90Var.d = null;
                                    u90Var.e = null;
                                    u90Var.k = 5;
                                    if (impromptu.competently(coroutineContext, v90Var, u90Var) != objBeachfront) {
                                        closeable6 = closeable4;
                                        w03Var5 = w03Var4;
                                        Closeable closeable111 = closeable6;
                                        unit = Unit.f29295attabal;
                                        interaction.saneness.attabal(closeable111, null);
                                        return unit;
                                    }
                                }
                            }
                            return objBeachfront;
                        case 3:
                            closeable5 = u90Var.b;
                            p002kotlin.dern.saneness(obj5);
                            Unit unit8 = Unit.f29295attabal;
                            interaction.saneness.attabal(closeable5, null);
                            return unit8;
                        case 4:
                            int i19 = u90Var.h;
                            int i20 = u90Var.g;
                            size = u90Var.f;
                            arrayList2 = u90Var.e;
                            activity5 = u90Var.d;
                            Closeable closeable20 = u90Var.c;
                            w03 w03Var11 = (w03) u90Var.b;
                            ja0 ja0Var11 = (ja0) u90Var.a;
                            p002kotlin.dern.saneness(obj5);
                            str = "Failed to show inspector settings dialog";
                            w03Var4 = w03Var11;
                            ja0Var4 = ja0Var11;
                            i = i19;
                            i2 = i20;
                            closeable4 = closeable20;
                            obj3 = obj5;
                            i3 = energise.f37138attabal[((b11) obj3).r().ordinal()];
                            if (i3 != 1) {
                                i4 = i;
                            } else if (i3 != 2) {
                                i4 = size;
                            } else {
                                i4 = i2;
                            }
                            final AtomicInteger atomicInteger8 = new AtomicInteger(i4);
                            final int i110 = i;
                            AlertDialog.Builder builder8 = new AlertDialog.Builder(activity5, R.style.Theme.Material.Dialog.Alert);
                            builder8.setTitle("Setup gesture");
                            builder8.setSingleChoiceItems((CharSequence[]) arrayList2.toArray(new String[0]), i4, new DialogInterface.OnClickListener() { // from class: saneness.macaronic
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i111) {
                                    ja0.a(atomicInteger8, dialogInterface, i111);
                                }
                            });
                            builder8.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: saneness.dirl
                                @Override // android.content.DialogInterface.OnCancelListener
                                public final void onCancel(DialogInterface dialogInterface) {
                                    ja0.b(this.f37126kowloon, dialogInterface);
                                }
                            });
                            builder8.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: saneness.gown
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i111) {
                                    ja0.b(this.f37157kowloon, dialogInterface, i111);
                                }
                            });
                            ja0Var5 = ja0Var4;
                            builder8.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: saneness.mullein
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i111) {
                                    ja0.a(this.f37209kowloon, atomicInteger8, i4, i110, i2, dialogInterface, i111);
                                }
                            });
                            coroutineContext = ja0Var5.a;
                            v90Var = new v90(builder8, null);
                            u90Var.a = ja0Var5;
                            u90Var.b = w03Var4;
                            u90Var.c = closeable4;
                            u90Var.d = null;
                            u90Var.e = null;
                            u90Var.k = 5;
                            if (impromptu.competently(coroutineContext, v90Var, u90Var) != objBeachfront) {
                                closeable6 = closeable4;
                                w03Var5 = w03Var4;
                                Closeable closeable112 = closeable6;
                                unit = Unit.f29295attabal;
                                interaction.saneness.attabal(closeable112, null);
                                return unit;
                            }
                            return objBeachfront;
                        case 5:
                            closeable6 = u90Var.c;
                            w03Var5 = (w03) u90Var.b;
                            ja0Var6 = (ja0) u90Var.a;
                            try {
                                p002kotlin.dern.saneness(obj5);
                                break;
                            } catch (Throwable th16) {
                                exception = th16;
                                str = "Failed to show inspector settings dialog";
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                w03 w03VarA5 = j13.a();
                                w03VarA5.e().m = false;
                                w03VarA5.a(exception);
                                ja0Var6.k.set(false);
                                ((d13) ja0Var6.d).a(str, exception);
                                break;
                            }
                            Closeable closeable113 = closeable6;
                            unit = Unit.f29295attabal;
                            interaction.saneness.attabal(closeable113, null);
                            return unit;
                        case 6:
                            Activity activity11 = u90Var.d;
                            Closeable closeable21 = u90Var.c;
                            w03 w03Var12 = (w03) u90Var.b;
                            ja0 ja0Var12 = (ja0) u90Var.a;
                            p002kotlin.dern.saneness(obj5);
                            w03Var3 = w03Var12;
                            closeable7 = closeable21;
                            str2 = "Failed to show inspector settings dialog";
                            ja0Var = ja0Var12;
                            activity = activity11;
                            obj = obj5;
                            if (((Boolean) obj).booleanValue()) {
                                wz0 wz0Var13 = ja0Var.j;
                                String str7 = ja0Var.l;
                                str3 = str2;
                                JsonObject jsonObject4 = ja0Var.n;
                                u90Var.a = ja0Var;
                                u90Var.b = w03Var3;
                                u90Var.c = closeable7;
                                u90Var.d = activity;
                                activity6 = activity;
                                u90Var.k = 7;
                                objA2 = wz0Var13.a(jsonObject4, str7, u90Var);
                                if (objA2 != objBeachfront) {
                                    ja0Var8 = ja0Var;
                                    closeable9 = closeable7;
                                    w03Var7 = w03Var3;
                                    if (!((Boolean) objA2).booleanValue()) {
                                        u90Var.a = w03Var7;
                                        u90Var.b = closeable9;
                                        u90Var.c = null;
                                        u90Var.d = null;
                                        u90Var.k = 8;
                                        if (ja0Var8.c(u90Var) == objBeachfront) {
                                            closeable10 = closeable9;
                                        }
                                        closeable10 = closeable9;
                                        Unit unit9 = Unit.f29295attabal;
                                        interaction.saneness.attabal(closeable10, null);
                                        return unit9;
                                    }
                                    ja0Var7 = ja0Var8;
                                    closeable8 = closeable9;
                                    w03Var6 = w03Var7;
                                    activity7 = activity6;
                                    arrayList3 = new ArrayList();
                                    arrayList3.add("None");
                                    size4 = arrayList3.size() - 1;
                                    arrayList3.add("Shake");
                                    size5 = arrayList3.size() - 1;
                                    arrayList3.add("Flick");
                                    size6 = arrayList3.size() - 1;
                                    wz0 wz0Var14 = ja0Var7.j;
                                    u90Var.a = ja0Var7;
                                    u90Var.b = w03Var6;
                                    u90Var.c = closeable8;
                                    u90Var.d = activity7;
                                    u90Var.e = arrayList3;
                                    u90Var.f = size4;
                                    u90Var.g = size5;
                                    u90Var.h = size6;
                                    u90Var.k = 9;
                                    objJ2 = wz0Var14.j(u90Var);
                                    if (objJ2 != objBeachfront) {
                                        ja0Var9 = ja0Var7;
                                        obj4 = objJ2;
                                        i5 = size4;
                                        w03VarA = w03Var6;
                                        i6 = size6;
                                        i7 = size5;
                                        activity8 = activity7;
                                        arrayList4 = arrayList3;
                                        closeable11 = closeable8;
                                        closeable = closeable11;
                                        i8 = energise.f37138attabal[((b11) obj4).r().ordinal()];
                                        if (i8 != 1) {
                                            i5 = i6;
                                        } else if (i8 != 2) {
                                            i5 = i7;
                                        }
                                        final AtomicInteger atomicInteger9 = new AtomicInteger(i5);
                                        final int i111 = i6;
                                        AlertDialog.Builder builder9 = new AlertDialog.Builder(activity8, R.style.Theme.Material.Dialog.Alert);
                                        builder9.setTitle("Setup gesture");
                                        builder9.setSingleChoiceItems((CharSequence[]) arrayList4.toArray(new String[0]), i5, new DialogInterface.OnClickListener() { // from class: saneness.macaronic
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i112) {
                                                ja0.a(atomicInteger9, dialogInterface, i112);
                                            }
                                        });
                                        builder9.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: saneness.dirl
                                            @Override // android.content.DialogInterface.OnCancelListener
                                            public final void onCancel(DialogInterface dialogInterface) {
                                                ja0.b(this.f37126kowloon, dialogInterface);
                                            }
                                        });
                                        builder9.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: saneness.gown
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i112) {
                                                ja0.b(this.f37157kowloon, dialogInterface, i112);
                                            }
                                        });
                                        final int i112 = i5;
                                        builder9.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: saneness.mullein
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i113) {
                                                ja0.a(this.f37209kowloon, atomicInteger9, i112, i111, i7, dialogInterface, i113);
                                            }
                                        });
                                        coroutineContext2 = ja0Var9.a;
                                        v90Var2 = new v90(builder9, null);
                                        u90Var.a = ja0Var9;
                                        u90Var.b = w03VarA;
                                        u90Var.c = closeable;
                                        u90Var.d = null;
                                        u90Var.e = null;
                                        u90Var.k = 10;
                                        if (impromptu.competently(coroutineContext2, v90Var2, u90Var) != objBeachfront) {
                                            closeable13 = closeable;
                                            w03Var9 = w03VarA;
                                            Closeable closeable114 = closeable13;
                                            unit = Unit.f29295attabal;
                                            interaction.saneness.attabal(closeable114, null);
                                            return unit;
                                        }
                                    }
                                }
                            } else {
                                activity6 = activity;
                                str3 = str2;
                                ja0Var7 = ja0Var;
                                closeable8 = closeable7;
                                w03Var6 = w03Var3;
                                activity7 = activity6;
                                arrayList3 = new ArrayList();
                                arrayList3.add("None");
                                size4 = arrayList3.size() - 1;
                                arrayList3.add("Shake");
                                size5 = arrayList3.size() - 1;
                                arrayList3.add("Flick");
                                size6 = arrayList3.size() - 1;
                                wz0 wz0Var15 = ja0Var7.j;
                                u90Var.a = ja0Var7;
                                u90Var.b = w03Var6;
                                u90Var.c = closeable8;
                                u90Var.d = activity7;
                                u90Var.e = arrayList3;
                                u90Var.f = size4;
                                u90Var.g = size5;
                                u90Var.h = size6;
                                u90Var.k = 9;
                                objJ2 = wz0Var15.j(u90Var);
                                if (objJ2 != objBeachfront) {
                                    ja0Var9 = ja0Var7;
                                    obj4 = objJ2;
                                    i5 = size4;
                                    w03VarA = w03Var6;
                                    i6 = size6;
                                    i7 = size5;
                                    activity8 = activity7;
                                    arrayList4 = arrayList3;
                                    closeable11 = closeable8;
                                    closeable = closeable11;
                                    i8 = energise.f37138attabal[((b11) obj4).r().ordinal()];
                                    if (i8 != 1) {
                                        i5 = i6;
                                    } else if (i8 != 2) {
                                        i5 = i7;
                                    }
                                    final AtomicInteger atomicInteger10 = new AtomicInteger(i5);
                                    final int i113 = i6;
                                    AlertDialog.Builder builder10 = new AlertDialog.Builder(activity8, R.style.Theme.Material.Dialog.Alert);
                                    builder10.setTitle("Setup gesture");
                                    builder10.setSingleChoiceItems((CharSequence[]) arrayList4.toArray(new String[0]), i5, new DialogInterface.OnClickListener() { // from class: saneness.macaronic
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i114) {
                                            ja0.a(atomicInteger10, dialogInterface, i114);
                                        }
                                    });
                                    builder10.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: saneness.dirl
                                        @Override // android.content.DialogInterface.OnCancelListener
                                        public final void onCancel(DialogInterface dialogInterface) {
                                            ja0.b(this.f37126kowloon, dialogInterface);
                                        }
                                    });
                                    builder10.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: saneness.gown
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i114) {
                                            ja0.b(this.f37157kowloon, dialogInterface, i114);
                                        }
                                    });
                                    final int i114 = i5;
                                    builder10.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: saneness.mullein
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i115) {
                                            ja0.a(this.f37209kowloon, atomicInteger10, i114, i113, i7, dialogInterface, i115);
                                        }
                                    });
                                    coroutineContext2 = ja0Var9.a;
                                    v90Var2 = new v90(builder10, null);
                                    u90Var.a = ja0Var9;
                                    u90Var.b = w03VarA;
                                    u90Var.c = closeable;
                                    u90Var.d = null;
                                    u90Var.e = null;
                                    u90Var.k = 10;
                                    if (impromptu.competently(coroutineContext2, v90Var2, u90Var) != objBeachfront) {
                                        closeable13 = closeable;
                                        w03Var9 = w03VarA;
                                        Closeable closeable115 = closeable13;
                                        unit = Unit.f29295attabal;
                                        interaction.saneness.attabal(closeable115, null);
                                        return unit;
                                    }
                                }
                            }
                            return objBeachfront;
                        case 7:
                            Activity activity12 = u90Var.d;
                            Closeable closeable22 = u90Var.c;
                            w03 w03Var13 = (w03) u90Var.b;
                            ja0Var8 = (ja0) u90Var.a;
                            p002kotlin.dern.saneness(obj5);
                            activity6 = activity12;
                            objA2 = obj5;
                            str3 = "Failed to show inspector settings dialog";
                            closeable9 = closeable22;
                            w03Var7 = w03Var13;
                            if (!((Boolean) objA2).booleanValue()) {
                                u90Var.a = w03Var7;
                                u90Var.b = closeable9;
                                u90Var.c = null;
                                u90Var.d = null;
                                u90Var.k = 8;
                                if (ja0Var8.c(u90Var) == objBeachfront) {
                                    closeable10 = closeable9;
                                }
                                closeable10 = closeable9;
                                Unit unit10 = Unit.f29295attabal;
                                interaction.saneness.attabal(closeable10, null);
                                return unit10;
                            }
                            ja0Var7 = ja0Var8;
                            closeable8 = closeable9;
                            w03Var6 = w03Var7;
                            activity7 = activity6;
                            arrayList3 = new ArrayList();
                            arrayList3.add("None");
                            size4 = arrayList3.size() - 1;
                            arrayList3.add("Shake");
                            size5 = arrayList3.size() - 1;
                            arrayList3.add("Flick");
                            size6 = arrayList3.size() - 1;
                            wz0 wz0Var16 = ja0Var7.j;
                            u90Var.a = ja0Var7;
                            u90Var.b = w03Var6;
                            u90Var.c = closeable8;
                            u90Var.d = activity7;
                            u90Var.e = arrayList3;
                            u90Var.f = size4;
                            u90Var.g = size5;
                            u90Var.h = size6;
                            u90Var.k = 9;
                            objJ2 = wz0Var16.j(u90Var);
                            if (objJ2 != objBeachfront) {
                                ja0Var9 = ja0Var7;
                                obj4 = objJ2;
                                i5 = size4;
                                w03VarA = w03Var6;
                                i6 = size6;
                                i7 = size5;
                                activity8 = activity7;
                                arrayList4 = arrayList3;
                                closeable11 = closeable8;
                                closeable = closeable11;
                                i8 = energise.f37138attabal[((b11) obj4).r().ordinal()];
                                if (i8 != 1) {
                                    i5 = i6;
                                } else if (i8 != 2) {
                                    i5 = i7;
                                }
                                final AtomicInteger atomicInteger11 = new AtomicInteger(i5);
                                final int i115 = i6;
                                AlertDialog.Builder builder11 = new AlertDialog.Builder(activity8, R.style.Theme.Material.Dialog.Alert);
                                builder11.setTitle("Setup gesture");
                                builder11.setSingleChoiceItems((CharSequence[]) arrayList4.toArray(new String[0]), i5, new DialogInterface.OnClickListener() { // from class: saneness.macaronic
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i116) {
                                        ja0.a(atomicInteger11, dialogInterface, i116);
                                    }
                                });
                                builder11.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: saneness.dirl
                                    @Override // android.content.DialogInterface.OnCancelListener
                                    public final void onCancel(DialogInterface dialogInterface) {
                                        ja0.b(this.f37126kowloon, dialogInterface);
                                    }
                                });
                                builder11.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: saneness.gown
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i116) {
                                        ja0.b(this.f37157kowloon, dialogInterface, i116);
                                    }
                                });
                                final int i116 = i5;
                                builder11.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: saneness.mullein
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i117) {
                                        ja0.a(this.f37209kowloon, atomicInteger11, i116, i115, i7, dialogInterface, i117);
                                    }
                                });
                                coroutineContext2 = ja0Var9.a;
                                v90Var2 = new v90(builder11, null);
                                u90Var.a = ja0Var9;
                                u90Var.b = w03VarA;
                                u90Var.c = closeable;
                                u90Var.d = null;
                                u90Var.e = null;
                                u90Var.k = 10;
                                if (impromptu.competently(coroutineContext2, v90Var2, u90Var) != objBeachfront) {
                                    closeable13 = closeable;
                                    w03Var9 = w03VarA;
                                    Closeable closeable116 = closeable13;
                                    unit = Unit.f29295attabal;
                                    interaction.saneness.attabal(closeable116, null);
                                    return unit;
                                }
                            }
                            return objBeachfront;
                        case 8:
                            Closeable closeable23 = u90Var.b;
                            p002kotlin.dern.saneness(obj5);
                            closeable10 = closeable23;
                            closeable10 = closeable9;
                            Unit unit11 = Unit.f29295attabal;
                            interaction.saneness.attabal(closeable10, null);
                            return unit11;
                        case 9:
                            int i21 = u90Var.h;
                            int i22 = u90Var.g;
                            i5 = u90Var.f;
                            arrayList4 = u90Var.e;
                            Activity activity13 = u90Var.d;
                            Closeable closeable24 = u90Var.c;
                            w03 w03Var14 = (w03) u90Var.b;
                            ja0 ja0Var13 = (ja0) u90Var.a;
                            p002kotlin.dern.saneness(obj5);
                            i6 = i21;
                            w03VarA = w03Var14;
                            str3 = "Failed to show inspector settings dialog";
                            activity8 = activity13;
                            i7 = i22;
                            ja0Var9 = ja0Var13;
                            obj4 = obj5;
                            closeable11 = closeable24;
                            closeable = closeable11;
                            i8 = energise.f37138attabal[((b11) obj4).r().ordinal()];
                            if (i8 != 1) {
                                i5 = i6;
                            } else if (i8 != 2) {
                                i5 = i7;
                            }
                            final AtomicInteger atomicInteger12 = new AtomicInteger(i5);
                            final int i117 = i6;
                            AlertDialog.Builder builder12 = new AlertDialog.Builder(activity8, R.style.Theme.Material.Dialog.Alert);
                            builder12.setTitle("Setup gesture");
                            builder12.setSingleChoiceItems((CharSequence[]) arrayList4.toArray(new String[0]), i5, new DialogInterface.OnClickListener() { // from class: saneness.macaronic
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i118) {
                                    ja0.a(atomicInteger12, dialogInterface, i118);
                                }
                            });
                            builder12.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: saneness.dirl
                                @Override // android.content.DialogInterface.OnCancelListener
                                public final void onCancel(DialogInterface dialogInterface) {
                                    ja0.b(this.f37126kowloon, dialogInterface);
                                }
                            });
                            builder12.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: saneness.gown
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i118) {
                                    ja0.b(this.f37157kowloon, dialogInterface, i118);
                                }
                            });
                            final int i118 = i5;
                            builder12.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: saneness.mullein
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i119) {
                                    ja0.a(this.f37209kowloon, atomicInteger12, i118, i117, i7, dialogInterface, i119);
                                }
                            });
                            coroutineContext2 = ja0Var9.a;
                            v90Var2 = new v90(builder12, null);
                            u90Var.a = ja0Var9;
                            u90Var.b = w03VarA;
                            u90Var.c = closeable;
                            u90Var.d = null;
                            u90Var.e = null;
                            u90Var.k = 10;
                            if (impromptu.competently(coroutineContext2, v90Var2, u90Var) != objBeachfront) {
                                closeable13 = closeable;
                                w03Var9 = w03VarA;
                                Closeable closeable117 = closeable13;
                                unit = Unit.f29295attabal;
                                interaction.saneness.attabal(closeable117, null);
                                return unit;
                            }
                            return objBeachfront;
                        case 10:
                            Closeable closeable25 = u90Var.c;
                            w03 w03Var15 = (w03) u90Var.b;
                            ja0Var10 = (ja0) u90Var.a;
                            try {
                                p002kotlin.dern.saneness(obj5);
                                closeable13 = closeable25;
                                w03Var9 = w03Var15;
                                break;
                            } catch (Throwable th17) {
                                exception = th17;
                                str3 = "Failed to show inspector settings dialog";
                                closeable12 = closeable25;
                                w03Var8 = w03Var15;
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                w03 w03VarA6 = j13.a();
                                w03VarA6.e().m = false;
                                w03VarA6.a(exception);
                                ja0Var10.k.set(false);
                                ((d13) ja0Var10.d).a(str3, exception);
                                closeable13 = closeable12;
                                w03Var9 = w03Var8;
                                break;
                            }
                            Closeable closeable118 = closeable13;
                            unit = Unit.f29295attabal;
                            interaction.saneness.attabal(closeable118, null);
                            return unit;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Throwable th18) {
                    th = th18;
                }
            } catch (Throwable th19) {
                th = th19;
            }
        } catch (Throwable th20) {
            th = th20;
            r14 = r4;
        }
    }

    public static final void c(ja0 this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.k.set(false);
    }

    public static final void c(ja0 this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.k.set(false);
    }

    public final Object b(wretchedly.dern dernVar) {
        wz0 wz0Var = this.j;
        sy0 sy0Var = sy0.DEBUG_MENU;
        monoploid monoploidVar = new monoploid() { // from class: saneness.appreciation
            @Override // complexometry.monoploid
            public final void attabal(AdInspectorError adInspectorError) {
                ja0.a(this.f37056attabal, adInspectorError);
            }
        };
        wz0Var.getClass();
        Object objA = wz0.a(wz0Var, sy0Var, monoploidVar, dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    public static final void b(ja0 this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        saran saranVar = this$0.b;
        w90 block = new w90(this$0, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
    }

    public static final void b(ja0 this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        saran saranVar = this$0.b;
        x90 block = new x90(this$0, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
    }

    public static final void d(ja0 this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.k.set(false);
    }

    public static final void d(ja0 this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ip0 ip0Var = this$0.g;
        Intent intent = new Intent("android.intent.action.VIEW", q);
        Bundle bundle = new Bundle();
        String str = null;
        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
        String str2 = this$0.p;
        if (str2 != null) {
            str = str2;
        } else {
            Intrinsics.preprohormone(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
        }
        bundle.putString("com.android.browser.application_id", str);
        intent.putExtras(bundle);
        ip0Var.a(intent);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x020e A[Catch: all -> 0x0217, TryCatch #5 {all -> 0x0217, blocks: (B:97:0x0200, B:99:0x0207, B:101:0x020e, B:103:0x0212, B:105:0x0216, B:108:0x021a, B:109:0x021f, B:110:0x0220, B:111:0x0227, B:112:0x0228, B:113:0x022f, B:114:0x0230), top: B:128:0x0200 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0212 A[Catch: all -> 0x0217, TryCatch #5 {all -> 0x0217, blocks: (B:97:0x0200, B:99:0x0207, B:101:0x020e, B:103:0x0212, B:105:0x0216, B:108:0x021a, B:109:0x021f, B:110:0x0220, B:111:0x0227, B:112:0x0228, B:113:0x022f, B:114:0x0230), top: B:128:0x0200 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0216 A[Catch: all -> 0x0217, TryCatch #5 {all -> 0x0217, blocks: (B:97:0x0200, B:99:0x0207, B:101:0x020e, B:103:0x0212, B:105:0x0216, B:108:0x021a, B:109:0x021f, B:110:0x0220, B:111:0x0227, B:112:0x0228, B:113:0x022f, B:114:0x0230), top: B:128:0x0200 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x021a A[Catch: all -> 0x0217, TryCatch #5 {all -> 0x0217, blocks: (B:97:0x0200, B:99:0x0207, B:101:0x020e, B:103:0x0212, B:105:0x0216, B:108:0x021a, B:109:0x021f, B:110:0x0220, B:111:0x0227, B:112:0x0228, B:113:0x022f, B:114:0x0230), top: B:128:0x0200 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0220 A[Catch: all -> 0x0217, TryCatch #5 {all -> 0x0217, blocks: (B:97:0x0200, B:99:0x0207, B:101:0x020e, B:103:0x0212, B:105:0x0216, B:108:0x021a, B:109:0x021f, B:110:0x0220, B:111:0x0227, B:112:0x0228, B:113:0x022f, B:114:0x0230), top: B:128:0x0200 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0228 A[Catch: all -> 0x0217, TryCatch #5 {all -> 0x0217, blocks: (B:97:0x0200, B:99:0x0207, B:101:0x020e, B:103:0x0212, B:105:0x0216, B:108:0x021a, B:109:0x021f, B:110:0x0220, B:111:0x0227, B:112:0x0228, B:113:0x022f, B:114:0x0230), top: B:128:0x0200 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0230 A[Catch: all -> 0x0217, TRY_LEAVE, TryCatch #5 {all -> 0x0217, blocks: (B:97:0x0200, B:99:0x0207, B:101:0x020e, B:103:0x0212, B:105:0x0216, B:108:0x021a, B:109:0x021f, B:110:0x0220, B:111:0x0227, B:112:0x0228, B:113:0x022f, B:114:0x0230), top: B:128:0x0200 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x013f A[Catch: all -> 0x0145, TryCatch #2 {all -> 0x0145, blocks: (B:45:0x0139, B:47:0x013f, B:52:0x0149), top: B:123:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0149 A[Catch: all -> 0x0145, TRY_LEAVE, TryCatch #2 {all -> 0x0145, blocks: (B:45:0x0139, B:47:0x013f, B:52:0x0149), top: B:123:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0158 A[Catch: all -> 0x018f, TryCatch #10 {all -> 0x018f, blocks: (B:53:0x0154, B:55:0x0158, B:57:0x0184, B:64:0x0192, B:87:0x01df), top: B:136:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0191  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ae A[Catch: all -> 0x01b5, TryCatch #3 {all -> 0x01b5, blocks: (B:68:0x01aa, B:70:0x01ae, B:76:0x01b7), top: B:124:0x01aa }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:87:0x01df A[Catch: all -> 0x018f, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x018f, blocks: (B:53:0x0154, B:55:0x0158, B:57:0x0184, B:64:0x0192, B:87:0x01df), top: B:136:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0207 A[Catch: all -> 0x0217, TryCatch #5 {all -> 0x0217, blocks: (B:97:0x0200, B:99:0x0207, B:101:0x020e, B:103:0x0212, B:105:0x0216, B:108:0x021a, B:109:0x021f, B:110:0x0220, B:111:0x0227, B:112:0x0228, B:113:0x022f, B:114:0x0230), top: B:128:0x0200 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v2, types: [ads_mobile_sdk.w03, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v12, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v20, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r6v10, types: [ads_mobile_sdk.wz0] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object a(wretchedly.dern dernVar) {
        n90 n90Var;
        ?? r15;
        ?? A;
        hobby hobbyVar;
        wt0 wt0Var;
        ja0 ja0Var;
        ja0 ja0Var2;
        ?? r4;
        ?? r16;
        ?? r6;
        spartacist spartacistVar;
        dg2 dg2Var;
        nn0 rn0Var;
        String strA;
        ?? r5;
        ?? r7;
        ?? r8;
        ?? r9;
        ?? r17;
        ?? r10;
        ?? r2;
        ?? r18;
        wz0 wz0Var;
        String str;
        ?? r11;
        String str2;
        if (dernVar instanceof n90) {
            n90Var = (n90) dernVar;
            int i = n90Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                n90Var.i = i - Integer.MIN_VALUE;
            } else {
                n90Var = new n90(this, dernVar);
            }
        } else {
            n90Var = new n90(this, dernVar);
        }
        Object objA = n90Var.g;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        ?? r12 = n90Var.i;
        String str3 = "";
        try {
            if (r12 == 0) {
                p002kotlin.dern.saneness(objA);
                no0 no0Var = no0.CUI_NAME_CREATIVE_PREVIEW_LINKING;
                WeakHashMap weakHashMap = j13.a;
                A = j13.a(no0Var, adultoid.formularize(), true);
                try {
                    hobbyVar = this.i;
                    wt0Var = new wt0();
                    jk0 jk0Var = this.f;
                    jk0Var.getClass();
                    Intrinsics.checkNotNullParameter("gads:drx_debug:in_app_preview_status_url", X3.i.W);
                    Intrinsics.checkNotNullParameter("https://www.google.com/dfp/inAppPreview", "defaultValue");
                    String str4 = (String) jk0Var.a("gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview", zk.o);
                    n90Var.a = this;
                    n90Var.b = A;
                    n90Var.c = A;
                    n90Var.d = wt0Var;
                    n90Var.e = hobbyVar;
                    n90Var.i = 1;
                    objA = this.j.a(str4, this.l, (JsonObject) null, n90Var);
                    if (objA != objBeachfront) {
                        ja0Var = this;
                        r15 = A;
                        A = A;
                    }
                    return objBeachfront;
                } catch (Throwable th) {
                    th = th;
                    r15 = A;
                    r15.b(th);
                    if (!(th instanceof evenfall)) {
                        r15.a(th);
                        if (!(th instanceof TimeoutCancellationException)) {
                            if (!(th instanceof CancellationException)) {
                                if (th instanceof yn0) {
                                    throw th;
                                }
                                throw new gn0(th);
                            }
                            throw new bn0(th);
                        }
                        throw new cp0(th);
                    }
                    throw th;
                }
            }
            if (r12 == 1) {
                hobbyVar = n90Var.e;
                wt0Var = (wt0) n90Var.d;
                A = (Closeable) n90Var.c;
                r15 = (w03) n90Var.b;
                ja0Var = (ja0) n90Var.a;
                try {
                    p002kotlin.dern.saneness(objA);
                    A = A;
                    r15 = r15;
                } catch (Throwable th2) {
                    th = th2;
                    r15.b(th);
                    if (!(th instanceof evenfall)) {
                        r15.a(th);
                        if (!(th instanceof TimeoutCancellationException)) {
                            if (!(th instanceof CancellationException)) {
                                if (th instanceof yn0) {
                                    throw th;
                                }
                                throw new gn0(th);
                            }
                            throw new bn0(th);
                        }
                        throw new cp0(th);
                    }
                    throw th;
                }
            } else {
                if (r12 == 2) {
                    r4 = (Closeable) n90Var.c;
                    r6 = (w03) n90Var.b;
                    ja0 ja0Var3 = (ja0) n90Var.a;
                    try {
                        p002kotlin.dern.saneness(objA);
                        r16 = r6;
                        ja0Var2 = ja0Var3;
                        r4 = r4;
                        try {
                            spartacistVar = (spartacist) objA;
                            if (spartacistVar instanceof nn0) {
                                rn0Var = (nn0) spartacistVar;
                            } else {
                                Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                                try {
                                    dg2Var = ((zt0) ((tn0) spartacistVar).b).d;
                                    if (dg2Var != null) {
                                        JsonObject jsonObject = (JsonObject) new Gson().fromJson(dg2.a(dg2Var), JsonObject.class);
                                        ja0Var2.h.f.set(cb1.a(jsonObject, "gct", ""));
                                        strA = cb1.a(jsonObject, "status", "");
                                        if (!Intrinsics.wireman(strA, "0") || Intrinsics.wireman(strA, "2")) {
                                            r5 = 1;
                                        } else {
                                            r5 = 0;
                                        }
                                        r7 = ja0Var2.j;
                                        n90Var.a = ja0Var2;
                                        n90Var.b = r16;
                                        n90Var.c = r4;
                                        n90Var.d = strA;
                                        n90Var.f = r5;
                                        n90Var.i = 3;
                                        if (r7.a(r5, n90Var) != objBeachfront) {
                                            r8 = r4;
                                            r9 = r5;
                                            r18 = r16;
                                            wz0Var = ja0Var2.j;
                                            if (r9 != 0) {
                                                str3 = str2;
                                            }
                                            n90Var.a = r18;
                                            n90Var.b = r8;
                                            n90Var.c = strA;
                                            n90Var.d = null;
                                            n90Var.i = 4;
                                            wz0Var.getClass();
                                            if (wz0.a(wz0Var, str3, n90Var) != objBeachfront) {
                                                str = strA;
                                                r11 = r8;
                                            }
                                        }
                                        return objBeachfront;
                                    }
                                    rn0Var = new rn0("Null response body when fetching creative preview token", k41.INTERNAL_ERROR);
                                } catch (Throwable th3) {
                                    th = th3;
                                    r10 = r4;
                                    r17 = r16;
                                    r2 = r17;
                                    r6 = r2;
                                    rn0Var = new on0(th, null, null, 6);
                                    r4 = r10;
                                    y13.a(rn0Var, false);
                                    interaction.saneness.attabal(r4, null);
                                    return rn0Var;
                                }
                            }
                            r6 = r16;
                            r4 = r4;
                            y13.a(rn0Var, false);
                            interaction.saneness.attabal(r4, null);
                            return rn0Var;
                        } catch (Throwable th4) {
                            th = th4;
                            r6 = r16;
                            A = r4;
                            r15 = r6;
                            try {
                                r15.b(th);
                                if (!(th instanceof evenfall)) {
                                    r15.a(th);
                                    if (!(th instanceof TimeoutCancellationException)) {
                                        if (!(th instanceof CancellationException)) {
                                            if (th instanceof yn0) {
                                                throw th;
                                            }
                                            throw new gn0(th);
                                        }
                                        throw new bn0(th);
                                    }
                                    throw new cp0(th);
                                }
                                throw th;
                            } catch (Throwable th5) {
                                try {
                                    throw th5;
                                } catch (Throwable th6) {
                                    interaction.saneness.attabal(A, th5);
                                    throw th6;
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        A = r4;
                        r15 = r6;
                        r15.b(th);
                        if (!(th instanceof evenfall)) {
                            r15.a(th);
                            if (!(th instanceof TimeoutCancellationException)) {
                                if (!(th instanceof CancellationException)) {
                                    if (th instanceof yn0) {
                                        throw th;
                                    }
                                    throw new gn0(th);
                                }
                                throw new bn0(th);
                            }
                            throw new cp0(th);
                        }
                        throw th;
                    }
                }
                if (r12 == 3) {
                    int i2 = n90Var.f;
                    String str5 = (String) n90Var.d;
                    Closeable closeable = (Closeable) n90Var.c;
                    w03 w03Var = (w03) n90Var.b;
                    ja0Var2 = (ja0) n90Var.a;
                    try {
                        p002kotlin.dern.saneness(objA);
                        strA = str5;
                        r18 = w03Var;
                        r9 = i2;
                        r8 = closeable;
                        try {
                            wz0Var = ja0Var2.j;
                            if (r9 != 0 && (str2 = ja0Var2.l) != null) {
                                str3 = str2;
                            }
                            n90Var.a = r18;
                            n90Var.b = r8;
                            n90Var.c = strA;
                            n90Var.d = null;
                            n90Var.i = 4;
                            wz0Var.getClass();
                            if (wz0.a(wz0Var, str3, n90Var) != objBeachfront) {
                                str = strA;
                                r11 = r8;
                            }
                            return objBeachfront;
                        } catch (Throwable th8) {
                            th = th8;
                            r10 = r8;
                            r17 = r18;
                            r2 = r17;
                            r6 = r2;
                            rn0Var = new on0(th, null, null, 6);
                            r4 = r10;
                            y13.a(rn0Var, false);
                            interaction.saneness.attabal(r4, null);
                            return rn0Var;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        r10 = closeable;
                        r2 = w03Var;
                    }
                } else {
                    if (r12 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) n90Var.c;
                    r10 = n90Var.b;
                    r2 = (w03) n90Var.a;
                    try {
                        p002kotlin.dern.saneness(objA);
                        r11 = r10;
                    } catch (Throwable th10) {
                        th = th10;
                    }
                }
                r6 = r2;
                rn0Var = new on0(th, null, null, 6);
                r4 = r10;
                y13.a(rn0Var, false);
                interaction.saneness.attabal(r4, null);
                return rn0Var;
                tn0 tn0Var = new tn0(str);
                interaction.saneness.attabal(r11, null);
                return tn0Var;
            }
            String string = ((Uri) objA).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            xt0 xt0VarA = wt0Var.a(string).a();
            jk0 jk0Var2 = ja0Var.f;
            jk0Var2.getClass();
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            long jMolybdenite = p002kotlin.time.dern.molybdenite(5, DurationUnit.SECONDS);
            Intrinsics.checkNotNullParameter("gads:drx_debug:timeout_ms", X3.i.W);
            p002kotlin.time.saneness sanenessVarCutely = p002kotlin.time.saneness.cutely(((p002kotlin.time.saneness) jk0Var2.a("gads:drx_debug:timeout_ms", p002kotlin.time.saneness.cutely(jMolybdenite), zk.j)).getRawValue());
            n90Var.a = ja0Var;
            n90Var.b = r15;
            n90Var.c = A;
            n90Var.d = null;
            n90Var.e = null;
            n90Var.i = 2;
            objA = hobby.saneness(hobbyVar, xt0VarA, sanenessVarCutely, n90Var, 12);
            if (objA != objBeachfront) {
                ja0Var2 = ja0Var;
                r4 = A;
                r16 = r15;
                spartacistVar = (spartacist) objA;
                if (spartacistVar instanceof nn0) {
                    rn0Var = (nn0) spartacistVar;
                } else {
                    Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                    dg2Var = ((zt0) ((tn0) spartacistVar).b).d;
                    if (dg2Var != null) {
                        JsonObject jsonObject2 = (JsonObject) new Gson().fromJson(dg2.a(dg2Var), JsonObject.class);
                        ja0Var2.h.f.set(cb1.a(jsonObject2, "gct", ""));
                        strA = cb1.a(jsonObject2, "status", "");
                        if (Intrinsics.wireman(strA, "0")) {
                            r5 = 1;
                        } else {
                            r5 = 1;
                        }
                        r7 = ja0Var2.j;
                        n90Var.a = ja0Var2;
                        n90Var.b = r16;
                        n90Var.c = r4;
                        n90Var.d = strA;
                        n90Var.f = r5;
                        n90Var.i = 3;
                        if (r7.a(r5, n90Var) != objBeachfront) {
                            r8 = r4;
                            r9 = r5;
                            r18 = r16;
                            wz0Var = ja0Var2.j;
                            if (r9 != 0) {
                                str3 = str2;
                            }
                            n90Var.a = r18;
                            n90Var.b = r8;
                            n90Var.c = strA;
                            n90Var.d = null;
                            n90Var.i = 4;
                            wz0Var.getClass();
                            if (wz0.a(wz0Var, str3, n90Var) != objBeachfront) {
                                str = strA;
                                r11 = r8;
                                tn0 tn0Var2 = new tn0(str);
                                interaction.saneness.attabal(r11, null);
                                return tn0Var2;
                            }
                        }
                    } else {
                        rn0Var = new rn0("Null response body when fetching creative preview token", k41.INTERNAL_ERROR);
                    }
                }
                r6 = r16;
                r4 = r4;
                y13.a(rn0Var, false);
                interaction.saneness.attabal(r4, null);
                return rn0Var;
            }
            return objBeachfront;
        } catch (Throwable th11) {
            th = th11;
            r15 = n90Var;
            A = r12;
        }
    }

    public final String a(String str) {
        if (str.length() == 0) {
            return "No debug information";
        }
        Uri uriBuild = new Uri.Builder().encodedQuery(new Regex("\\+").replace(str, "%20")).build();
        ip0 ip0Var = this.g;
        Intrinsics.beachfront(uriBuild);
        String string = StringsKt.stupefactive(CollectionsKt.preterite(ip0Var.d(uriBuild).entrySet(), "\n\n", null, null, 0, null, o90.a, 30, null)).toString();
        return StringsKt.empress(string) ? "No debug information" : string;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX WARN: Code duplicated, block: B:32:0x009a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    public final Object a(Activity activity, String str, ia0 ia0Var) {
        Activity activity2;
        ia0 ia0Var2;
        Object objA;
        switch (str.hashCode()) {
            case 48:
                activity2 = activity;
                ia0Var2 = ia0Var;
                if (str.equals("0")) {
                    Object objA2 = a(this, false, "The device is successfully linked for creative preview.", activity2, false, (wretchedly.dern) ia0Var2, 1);
                    if (objA2 != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                        objA2 = Unit.f29295attabal;
                    }
                    return objA2 == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA2 : Unit.f29295attabal;
                }
                String strSubstring = str.substring(0, Math.min(50, str.length()));
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                y13.a("Invalid creative preview status: " + strSubstring, null, 6);
                objA = a(this, true, (String) null, activity2, false, (wretchedly.dern) ia0Var2, 10);
                if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                    objA = Unit.f29295attabal;
                }
                if (objA == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                    return objA;
                }
                return Unit.f29295attabal;
            case 49:
                activity2 = activity;
                ia0Var2 = ia0Var;
                if (str.equals("1")) {
                    Object objC = c(ia0Var2);
                    return objC == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objC : Unit.f29295attabal;
                }
                String strSubstring2 = str.substring(0, Math.min(50, str.length()));
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                y13.a("Invalid creative preview status: " + strSubstring2, null, 6);
                objA = a(this, true, (String) null, activity2, false, (wretchedly.dern) ia0Var2, 10);
                if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                    objA = Unit.f29295attabal;
                }
                if (objA == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                    return objA;
                }
                return Unit.f29295attabal;
            case 50:
                if (str.equals("2")) {
                    Object objA3 = a(this, false, "There was no creative pushed from DFP to the device.", activity, true, (wretchedly.dern) ia0Var, 1);
                    if (objA3 != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                        objA3 = Unit.f29295attabal;
                    }
                    return objA3 == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA3 : Unit.f29295attabal;
                }
            default:
                activity2 = activity;
                ia0Var2 = ia0Var;
                String strSubstring3 = str.substring(0, Math.min(50, str.length()));
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                y13.a("Invalid creative preview status: " + strSubstring3, null, 6);
                objA = a(this, true, (String) null, activity2, false, (wretchedly.dern) ia0Var2, 10);
                if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                    objA = Unit.f29295attabal;
                }
                if (objA == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                    return objA;
                }
                return Unit.f29295attabal;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01b3 A[Catch: all -> 0x01c3, TryCatch #0 {all -> 0x01c3, blocks: (B:104:0x01ac, B:106:0x01b3, B:108:0x01ba, B:110:0x01be, B:112:0x01c2, B:115:0x01c6, B:116:0x01cb, B:117:0x01cc, B:118:0x01d3, B:119:0x01d4, B:120:0x01db, B:121:0x01dc), top: B:126:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01ba A[Catch: all -> 0x01c3, TryCatch #0 {all -> 0x01c3, blocks: (B:104:0x01ac, B:106:0x01b3, B:108:0x01ba, B:110:0x01be, B:112:0x01c2, B:115:0x01c6, B:116:0x01cb, B:117:0x01cc, B:118:0x01d3, B:119:0x01d4, B:120:0x01db, B:121:0x01dc), top: B:126:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01be A[Catch: all -> 0x01c3, TryCatch #0 {all -> 0x01c3, blocks: (B:104:0x01ac, B:106:0x01b3, B:108:0x01ba, B:110:0x01be, B:112:0x01c2, B:115:0x01c6, B:116:0x01cb, B:117:0x01cc, B:118:0x01d3, B:119:0x01d4, B:120:0x01db, B:121:0x01dc), top: B:126:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:112:0x01c2 A[Catch: all -> 0x01c3, TryCatch #0 {all -> 0x01c3, blocks: (B:104:0x01ac, B:106:0x01b3, B:108:0x01ba, B:110:0x01be, B:112:0x01c2, B:115:0x01c6, B:116:0x01cb, B:117:0x01cc, B:118:0x01d3, B:119:0x01d4, B:120:0x01db, B:121:0x01dc), top: B:126:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:115:0x01c6 A[Catch: all -> 0x01c3, TryCatch #0 {all -> 0x01c3, blocks: (B:104:0x01ac, B:106:0x01b3, B:108:0x01ba, B:110:0x01be, B:112:0x01c2, B:115:0x01c6, B:116:0x01cb, B:117:0x01cc, B:118:0x01d3, B:119:0x01d4, B:120:0x01db, B:121:0x01dc), top: B:126:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:117:0x01cc A[Catch: all -> 0x01c3, TryCatch #0 {all -> 0x01c3, blocks: (B:104:0x01ac, B:106:0x01b3, B:108:0x01ba, B:110:0x01be, B:112:0x01c2, B:115:0x01c6, B:116:0x01cb, B:117:0x01cc, B:118:0x01d3, B:119:0x01d4, B:120:0x01db, B:121:0x01dc), top: B:126:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:119:0x01d4 A[Catch: all -> 0x01c3, TryCatch #0 {all -> 0x01c3, blocks: (B:104:0x01ac, B:106:0x01b3, B:108:0x01ba, B:110:0x01be, B:112:0x01c2, B:115:0x01c6, B:116:0x01cb, B:117:0x01cc, B:118:0x01d3, B:119:0x01d4, B:120:0x01db, B:121:0x01dc), top: B:126:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:121:0x01dc A[Catch: all -> 0x01c3, TRY_LEAVE, TryCatch #0 {all -> 0x01c3, blocks: (B:104:0x01ac, B:106:0x01b3, B:108:0x01ba, B:110:0x01be, B:112:0x01c2, B:115:0x01c6, B:116:0x01cb, B:117:0x01cc, B:118:0x01d3, B:119:0x01d4, B:120:0x01db, B:121:0x01dc), top: B:126:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0107 A[Catch: all -> 0x0117, TryCatch #7 {all -> 0x0117, blocks: (B:55:0x0100, B:57:0x0107, B:59:0x010e, B:61:0x0112, B:63:0x0116, B:66:0x011a, B:67:0x011f, B:68:0x0120, B:69:0x0127, B:70:0x0128, B:71:0x012f, B:72:0x0130), top: B:138:0x0100 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x010e A[Catch: all -> 0x0117, TryCatch #7 {all -> 0x0117, blocks: (B:55:0x0100, B:57:0x0107, B:59:0x010e, B:61:0x0112, B:63:0x0116, B:66:0x011a, B:67:0x011f, B:68:0x0120, B:69:0x0127, B:70:0x0128, B:71:0x012f, B:72:0x0130), top: B:138:0x0100 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0112 A[Catch: all -> 0x0117, TryCatch #7 {all -> 0x0117, blocks: (B:55:0x0100, B:57:0x0107, B:59:0x010e, B:61:0x0112, B:63:0x0116, B:66:0x011a, B:67:0x011f, B:68:0x0120, B:69:0x0127, B:70:0x0128, B:71:0x012f, B:72:0x0130), top: B:138:0x0100 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0116 A[Catch: all -> 0x0117, TryCatch #7 {all -> 0x0117, blocks: (B:55:0x0100, B:57:0x0107, B:59:0x010e, B:61:0x0112, B:63:0x0116, B:66:0x011a, B:67:0x011f, B:68:0x0120, B:69:0x0127, B:70:0x0128, B:71:0x012f, B:72:0x0130), top: B:138:0x0100 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x011a A[Catch: all -> 0x0117, TryCatch #7 {all -> 0x0117, blocks: (B:55:0x0100, B:57:0x0107, B:59:0x010e, B:61:0x0112, B:63:0x0116, B:66:0x011a, B:67:0x011f, B:68:0x0120, B:69:0x0127, B:70:0x0128, B:71:0x012f, B:72:0x0130), top: B:138:0x0100 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0120 A[Catch: all -> 0x0117, TryCatch #7 {all -> 0x0117, blocks: (B:55:0x0100, B:57:0x0107, B:59:0x010e, B:61:0x0112, B:63:0x0116, B:66:0x011a, B:67:0x011f, B:68:0x0120, B:69:0x0127, B:70:0x0128, B:71:0x012f, B:72:0x0130), top: B:138:0x0100 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0128 A[Catch: all -> 0x0117, TryCatch #7 {all -> 0x0117, blocks: (B:55:0x0100, B:57:0x0107, B:59:0x010e, B:61:0x0112, B:63:0x0116, B:66:0x011a, B:67:0x011f, B:68:0x0120, B:69:0x0127, B:70:0x0128, B:71:0x012f, B:72:0x0130), top: B:138:0x0100 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0130 A[Catch: all -> 0x0117, TRY_LEAVE, TryCatch #7 {all -> 0x0117, blocks: (B:55:0x0100, B:57:0x0107, B:59:0x010e, B:61:0x0112, B:63:0x0116, B:66:0x011a, B:67:0x011f, B:68:0x0120, B:69:0x0127, B:70:0x0128, B:71:0x012f, B:72:0x0130), top: B:138:0x0100 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static Object a(ja0 ja0Var, String str, String str2, JsonObject jsonObject, l13 l13Var, wretchedly.dern dernVar) {
        p90 p90Var;
        w03 w03VarA;
        w03 w03Var;
        w03 w03Var2;
        w03 w03VarA2;
        w03 w03Var3;
        w03 w03Var4;
        ja0 ja0Var2 = ja0Var;
        if (dernVar instanceof p90) {
            p90Var = (p90) dernVar;
            int i = p90Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                p90Var.f = i - Integer.MIN_VALUE;
            } else {
                p90Var = new p90(ja0Var2, dernVar);
            }
        } else {
            p90Var = new p90(ja0Var2, dernVar);
        }
        Object obj = p90Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = p90Var.f;
        if (i2 != 0) {
            if (i2 == 1) {
                w03Var3 = p90Var.c;
                w03Var4 = p90Var.b;
                ja0 ja0Var3 = p90Var.a;
                try {
                    p002kotlin.dern.saneness(obj);
                } catch (Throwable th) {
                    exception = th;
                    w03VarA2 = w03Var3;
                    ja0Var2 = ja0Var3;
                    try {
                        ja0Var2.k.set(false);
                        Intrinsics.checkNotNullParameter(exception, "exception");
                        w03 w03VarA3 = j13.a();
                        w03VarA3.e().m = false;
                        w03VarA3.a(exception);
                        ((d13) ja0Var2.d).a("Failed to show debug menu dialog", exception);
                        w03Var3 = w03VarA2;
                    } catch (Throwable th2) {
                        th = th2;
                        w03Var3 = w03VarA2;
                        w03VarA2 = w03Var4;
                        try {
                            w03VarA2.b(th);
                            if (!(th instanceof evenfall)) {
                                w03VarA2.a(th);
                                if (!(th instanceof TimeoutCancellationException)) {
                                    if (!(th instanceof CancellationException)) {
                                        if (th instanceof yn0) {
                                            throw th;
                                        }
                                        throw new gn0(th);
                                    }
                                    throw new bn0(th);
                                }
                                throw new cp0(th);
                            }
                            throw th;
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                interaction.saneness.attabal(w03Var3, th3);
                                throw th4;
                            }
                        }
                    }
                }
                w03VarA2 = w03Var4;
                try {
                    Unit unit = Unit.f29295attabal;
                    interaction.saneness.attabal(w03Var3, null);
                    return Unit.f29295attabal;
                } catch (Throwable th5) {
                    th = th5;
                    w03VarA2.b(th);
                    if (!(th instanceof evenfall)) {
                        w03VarA2.a(th);
                        if (!(th instanceof TimeoutCancellationException)) {
                            if (!(th instanceof CancellationException)) {
                                if (th instanceof yn0) {
                                    throw th;
                                }
                                throw new gn0(th);
                            }
                            throw new bn0(th);
                        }
                        throw new cp0(th);
                    }
                    throw th;
                }
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w03Var = p90Var.c;
            w03Var2 = p90Var.b;
            ja0 ja0Var4 = p90Var.a;
            try {
                p002kotlin.dern.saneness(obj);
            } catch (Throwable th6) {
                exception = th6;
                w03VarA = w03Var;
                ja0Var2 = ja0Var4;
                try {
                    ja0Var2.k.set(false);
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    w03 w03VarA4 = j13.a();
                    w03VarA4.e().m = false;
                    w03VarA4.a(exception);
                    ((d13) ja0Var2.d).a("Failed to show debug menu dialog", exception);
                    w03Var = w03VarA;
                } catch (Throwable th7) {
                    th = th7;
                    w03Var = w03VarA;
                    w03VarA = w03Var2;
                    try {
                        w03VarA.b(th);
                        if (!(th instanceof evenfall)) {
                            w03VarA.a(th);
                            if (!(th instanceof TimeoutCancellationException)) {
                                if (!(th instanceof CancellationException)) {
                                    if (th instanceof yn0) {
                                        throw th;
                                    }
                                    throw new gn0(th);
                                }
                                throw new bn0(th);
                            }
                            throw new cp0(th);
                        }
                        throw th;
                    } catch (Throwable th8) {
                        try {
                            throw th8;
                        } catch (Throwable th9) {
                            interaction.saneness.attabal(w03Var, th8);
                            throw th9;
                        }
                    }
                }
            }
            w03VarA = w03Var2;
            try {
                Unit unit2 = Unit.f29295attabal;
                interaction.saneness.attabal(w03Var, null);
                return Unit.f29295attabal;
            } catch (Throwable th10) {
                th = th10;
                w03VarA.b(th);
                if (!(th instanceof evenfall)) {
                    w03VarA.a(th);
                    if (!(th instanceof TimeoutCancellationException)) {
                        if (!(th instanceof CancellationException)) {
                            if (th instanceof yn0) {
                                throw th;
                            }
                            throw new gn0(th);
                        }
                        throw new bn0(th);
                    }
                    throw new cp0(th);
                }
                throw th;
            }
        }
        p002kotlin.dern.saneness(obj);
        if (ja0Var2.k.getAndSet(true)) {
            return Unit.f29295attabal;
        }
        ja0Var2.l = str;
        ja0Var2.m = str2;
        ja0Var2.n = jsonObject;
        ja0Var2.o = l13Var;
        ri2 ri2Var = ja0Var2.c;
        no0 no0Var = no0.CUI_NAME_DEBUG_MENU;
        List listFormularize = adultoid.formularize();
        if (j13.b().a == null) {
            w03VarA2 = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
            try {
                Activity activityB = ja0Var2.e.b();
                if (activityB == null) {
                    kn0.c("Can not display debug menu without an Activity context.", null);
                    y13.a("No Activity context available for displaying the debug menu.", null, 6);
                    ja0Var2.k.set(false);
                    Unit unit3 = Unit.f29295attabal;
                    interaction.saneness.attabal(w03VarA2, null);
                    return unit3;
                }
                String packageName = activityB.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                Intrinsics.checkNotNullParameter(packageName, "<set-?>");
                ja0Var2.p = packageName;
                try {
                    p90Var.a = ja0Var2;
                    p90Var.b = w03VarA2;
                    p90Var.c = w03VarA2;
                    p90Var.f = 1;
                    if (ja0Var2.a(activityB, p90Var) != objBeachfront) {
                        w03Var3 = w03VarA2;
                        w03Var4 = w03Var3;
                        w03VarA2 = w03Var4;
                        Unit unit4 = Unit.f29295attabal;
                        interaction.saneness.attabal(w03Var3, null);
                        return Unit.f29295attabal;
                    }
                } catch (Throwable th11) {
                    exception = th11;
                    w03Var4 = w03VarA2;
                    ja0Var2.k.set(false);
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    w03 w03VarA5 = j13.a();
                    w03VarA5.e().m = false;
                    w03VarA5.a(exception);
                    ((d13) ja0Var2.d).a("Failed to show debug menu dialog", exception);
                    w03Var3 = w03VarA2;
                }
            } catch (Throwable th12) {
                th = th12;
                w03Var3 = w03VarA2;
                w03VarA2.b(th);
                if (!(th instanceof evenfall)) {
                    w03VarA2.a(th);
                    if (!(th instanceof TimeoutCancellationException)) {
                        if (!(th instanceof CancellationException)) {
                            if (th instanceof yn0) {
                                throw th;
                            }
                            throw new gn0(th);
                        }
                        throw new bn0(th);
                    }
                    throw new cp0(th);
                }
                throw th;
            }
        } else {
            w03VarA = j13.a(no0Var, adultoid.formularize(), true);
            try {
                Activity activityB2 = ja0Var2.e.b();
                if (activityB2 == null) {
                    kn0.c("Can not display debug menu without an Activity context.", null);
                    y13.a("No Activity context available for displaying the debug menu.", null, 6);
                    ja0Var2.k.set(false);
                    Unit unit5 = Unit.f29295attabal;
                    interaction.saneness.attabal(w03VarA, null);
                    return unit5;
                }
                String packageName2 = activityB2.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName2, "getPackageName(...)");
                Intrinsics.checkNotNullParameter(packageName2, "<set-?>");
                ja0Var2.p = packageName2;
                try {
                    p90Var.a = ja0Var2;
                    p90Var.b = w03VarA;
                    p90Var.c = w03VarA;
                    p90Var.f = 2;
                    if (ja0Var2.a(activityB2, p90Var) != objBeachfront) {
                        w03Var = w03VarA;
                        w03Var2 = w03Var;
                        w03VarA = w03Var2;
                        Unit unit6 = Unit.f29295attabal;
                        interaction.saneness.attabal(w03Var, null);
                        return Unit.f29295attabal;
                    }
                } catch (Throwable th13) {
                    exception = th13;
                    w03Var2 = w03VarA;
                    ja0Var2.k.set(false);
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    w03 w03VarA6 = j13.a();
                    w03VarA6.e().m = false;
                    w03VarA6.a(exception);
                    ((d13) ja0Var2.d).a("Failed to show debug menu dialog", exception);
                    w03Var = w03VarA;
                }
            } catch (Throwable th14) {
                th = th14;
                w03Var = w03VarA;
                w03VarA.b(th);
                if (!(th instanceof evenfall)) {
                    w03VarA.a(th);
                    if (!(th instanceof TimeoutCancellationException)) {
                        if (!(th instanceof CancellationException)) {
                            if (th instanceof yn0) {
                                throw th;
                            }
                            throw new gn0(th);
                        }
                        throw new bn0(th);
                    }
                    throw new cp0(th);
                }
                throw th;
            }
        }
        return objBeachfront;
    }

    public static final void a(ja0 this$0, AdInspectorError adInspectorError) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (adInspectorError != null) {
            saran saranVar = this$0.b;
            q90 block = new q90(this$0, adInspectorError, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
    }

    public static final void a(ja0 this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.k.set(false);
    }

    public static final void a(ja0 this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.k.set(false);
    }

    public static final void a(ja0 this$0, String diagnosticText, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(diagnosticText, "$diagnosticText");
        this$0.g.a(Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", diagnosticText), "Share via"));
        this$0.k.set(false);
    }

    public static final void a(AtomicInteger selectedGestureIndex, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(selectedGestureIndex, "$selectedGestureIndex");
        selectedGestureIndex.set(i);
    }

    public static final void a(ja0 this$0, AtomicInteger selectedGestureIndex, int i, int i2, int i3, DialogInterface dialogInterface, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(selectedGestureIndex, "$selectedGestureIndex");
        saran saranVar = this$0.b;
        y90 block = new y90(selectedGestureIndex, i, i2, this$0, i3, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
    }

    public final Object a(Activity activity, wretchedly.dern dernVar) {
        String str;
        String str2;
        if (activity == null) {
            activity = this.e.b();
        }
        if (activity == null) {
            y13.a("No Activity context available for displaying the debug menu.", null, 6);
            this.k.set(false);
            return Unit.f29295attabal;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("Ad information");
        final int size = arrayList.size() - 1;
        Object obj = this.h.f.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        if (StringsKt.empress((CharSequence) obj)) {
            str = "Creative preview";
        } else {
            str = "Creative preview (enabled)";
        }
        arrayList.add(str);
        final int size2 = arrayList.size() - 1;
        if (this.h.g.get()) {
            str2 = "Troubleshooting (enabled)";
        } else {
            str2 = "Troubleshooting";
        }
        arrayList.add(str2);
        final int size3 = arrayList.size() - 1;
        arrayList.add("Open ad inspector");
        final int size4 = arrayList.size() - 1;
        arrayList.add("Ad inspector settings");
        final int size5 = arrayList.size() - 1;
        Object objCompetently = impromptu.competently(this.a, new z90(new AlertDialog.Builder(activity, R.style.Theme.Material.Dialog.Alert).setTitle("Select a debug mode").setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: saneness.othin
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ja0.c(this.f37238kowloon, dialogInterface, i);
            }
        }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: saneness.nitroguanidine
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ja0.c(this.f37223kowloon, dialogInterface);
            }
        }).setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: saneness.chinny
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ja0.a(size, this, size5, size4, size2, size3, dialogInterface, i);
            }
        }), null), dernVar);
        return objCompetently == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCompetently : Unit.f29295attabal;
    }

    public static final void a(int i, ja0 this$0, int i2, int i3, int i4, int i5, DialogInterface dialogInterface, int i6) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i6 == i) {
            y13.a(this$0.b, new aa0(this$0, null));
            return;
        }
        if (i6 == i2) {
            y13.a(this$0.b, new ba0(this$0, null));
            return;
        }
        if (i6 == i3) {
            y13.a(this$0.b, new ca0(this$0, null));
            return;
        }
        if (i6 == i4) {
            y13.a(this$0.b, new da0(this$0, null));
            return;
        }
        if (i6 == i5) {
            y13.a(this$0.b, new ea0(this$0, null));
            return;
        }
        triweekly triweeklyVar = kn0.a;
        kn0.c("Unsupported debug menu option: " + i6, null);
        this$0.k.set(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z, String str, Activity activity, boolean z2, wretchedly.dern dernVar) {
        fa0 fa0Var;
        ja0 ja0Var;
        String str2;
        if (dernVar instanceof fa0) {
            fa0Var = (fa0) dernVar;
            int i = fa0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fa0Var.d = i - Integer.MIN_VALUE;
            } else {
                fa0Var = new fa0(this, dernVar);
            }
        } else {
            fa0Var = new fa0(this, dernVar);
        }
        Object obj = fa0Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = fa0Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            if (activity == null) {
                try {
                    activity = this.e.b();
                } catch (Throwable th) {
                    exception = th;
                    ja0Var = this;
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    w03 w03VarA = j13.a();
                    w03VarA.e().m = false;
                    w03VarA.a(exception);
                    ja0Var.k.set(false);
                    ((d13) ja0Var.d).a("Failed to show status dialog", exception);
                }
            }
            if (activity == null) {
                y13.a("No Activity context available for showing status dialog.", null, 6);
                this.k.set(false);
                return Unit.f29295attabal;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(activity, R.style.Theme.Material.Dialog.Alert);
            if (z) {
                str2 = "Error";
            } else {
                str2 = "Info";
            }
            builder.setTitle(str2);
            builder.setMessage(str);
            builder.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: saneness.outseg
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ja0.d(this.f37239kowloon, dialogInterface);
                }
            });
            if (z2) {
                builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
                builder.setPositiveButton("Learn More", new DialogInterface.OnClickListener() { // from class: saneness.collectively
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        ja0.d(this.f37102kowloon, dialogInterface, i3);
                    }
                });
            } else {
                builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
            }
            CoroutineContext coroutineContext = this.a;
            ga0 ga0Var = new ga0(builder, null);
            fa0Var.a = this;
            fa0Var.d = 1;
            if (impromptu.competently(coroutineContext, ga0Var, fa0Var) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ja0Var = fa0Var.a;
            try {
                p002kotlin.dern.saneness(obj);
            } catch (Throwable th2) {
                exception = th2;
                Intrinsics.checkNotNullParameter(exception, "exception");
                w03 w03VarA2 = j13.a();
                w03VarA2.e().m = false;
                w03VarA2.a(exception);
                ja0Var.k.set(false);
                ((d13) ja0Var.d).a("Failed to show status dialog", exception);
            }
        }
        return Unit.f29295attabal;
    }

    public static /* synthetic */ Object a(ja0 ja0Var, boolean z, String str, Activity activity, boolean z2, wretchedly.dern dernVar, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            str = "In-app preview failed to load because of a system error. Please try again later.";
        }
        if ((i & 4) != 0) {
            activity = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return ja0Var.a(z, str, activity, z2, dernVar);
    }
}
