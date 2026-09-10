package com.facebook.internal.instrument.crashreport;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.ExceptionAnalyzer;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.InstrumentUtility;
import com.p004ironsource.m5;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/internal/instrument/crashreport/CrashHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class CrashHandler implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static CrashHandler f16429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Companion f16430c = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f16431a;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/internal/instrument/crashreport/CrashHandler$Companion;", "", "", "MAX_CRASH_REPORT_NUM", "I", "", "TAG", "Ljava/lang/String;", "Lcom/facebook/internal/instrument/crashreport/CrashHandler;", m5.f25675p, "Lcom/facebook/internal/instrument/crashreport/CrashHandler;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static void a() {
            if (Utility.B()) {
                return;
            }
            File[] fileArrE = InstrumentUtility.e();
            ArrayList arrayList = new ArrayList(fileArrE.length);
            for (File file : fileArrE) {
                arrayList.add(InstrumentData.Builder.c(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((InstrumentData) obj).a()) {
                    arrayList2.add(obj);
                }
            }
            final List listC0 = CollectionsKt.c0(CrashHandler$Companion$sendExceptionReports$validReports$3.X, arrayList2);
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it = RangesKt.e(0, Math.min(listC0.size(), 5)).iterator();
            while (((IntProgressionIterator) it).Z) {
                jSONArray.put(listC0.get(((IntIterator) it).a()));
            }
            InstrumentUtility.g("crash_reports", jSONArray, new GraphRequest.Callback() { // from class: com.facebook.internal.instrument.crashreport.CrashHandler$Companion$sendExceptionReports$2
                @Override // com.facebook.GraphRequest.Callback
                public final void a(GraphResponse graphResponse) {
                    JSONObject jSONObject;
                    try {
                        if (graphResponse.d == null && (jSONObject = graphResponse.f15950a) != null && jSONObject.getBoolean("success")) {
                            Iterator it2 = listC0.iterator();
                            while (it2.hasNext()) {
                                InstrumentUtility.a(((InstrumentData) it2.next()).f16413a);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            });
        }
    }

    public CrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f16431a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t, Throwable e2) {
        Intrinsics.f(t, "t");
        Intrinsics.f(e2, "e");
        Throwable th = null;
        loop0: for (Throwable cause = e2; cause != null && cause != th; cause = cause.getCause()) {
            for (StackTraceElement element : cause.getStackTrace()) {
                Intrinsics.e(element, "element");
                String className = element.getClassName();
                Intrinsics.e(className, "element.className");
                if (StringsKt.M(className, "com.facebook", false)) {
                    ExceptionAnalyzer.a(e2);
                    InstrumentData.Builder.b(e2, InstrumentData.Type.e0).b();
                    break loop0;
                }
            }
            th = cause;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f16431a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t, e2);
        }
    }
}
