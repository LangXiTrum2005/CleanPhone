package com.inmobi.media;

import A.RunnableC0883c;
import A.RunnableC0905n;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.util.Log;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.inmobi.media.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2960c1 extends G3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f23475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23476c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ActivityManager f23477e;
    public final C6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2960c1(Context context, H3 listener, long j, int i2) {
        super(listener);
        Intrinsics.f(context, "context");
        Intrinsics.f(listener, "listener");
        this.f23475b = context;
        this.f23476c = j;
        this.d = i2;
        Object systemService = context.getSystemService("activity");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        this.f23477e = (ActivityManager) systemService;
        ConcurrentHashMap concurrentHashMap = C6.f22734b;
        this.f = B6.a(context, "appClose");
    }

    public static final void a(C2960c1 this$0, ApplicationExitInfo applicationExitInfo) throws IOException {
        String string;
        Intrinsics.f(this$0, "this$0");
        H3 h3 = this$0.f22836a;
        int reason = applicationExitInfo.getReason();
        String description = applicationExitInfo.getDescription();
        InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
        int i2 = this$0.d;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (traceInputStream != null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(traceInputStream));
                int i3 = i2;
                boolean z2 = false;
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            if (i2 > 0 && !z2) {
                                sb2.append(line);
                                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                                i2--;
                            }
                            int i4 = i2;
                            if (StringsKt.M(line, "\"main\"", false)) {
                                sb2.setLength(0);
                                z2 = true;
                            }
                            if (z2) {
                                i3--;
                                sb.append(line);
                                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                            }
                            if (StringsKt.l(line, "ZygoteInit.java", false) || i3 <= 0) {
                                break;
                            } else {
                                i2 = i4;
                            }
                        } else {
                            break;
                        }
                    } catch (Throwable th) {
                        bufferedReader.close();
                        throw th;
                    }
                }
                bufferedReader.close();
            } catch (IOException e2) {
                Log.e("CommonExt", "Error reading from input stream", e2);
            }
        }
        if (sb.length() == 0) {
            string = sb2.toString();
            Intrinsics.e(string, "toString(...)");
        } else {
            string = sb.toString();
            Intrinsics.e(string, "toString(...)");
        }
        h3.a(new C2977d1(description, reason, string));
    }

    @Override // com.inmobi.media.G3
    public final void b() {
    }

    @Override // com.inmobi.media.G3
    public final void a() {
        Ie.f22893a.execute(new RunnableC0883c(this, 13));
    }

    public static final void a(C2960c1 this$0) {
        Intrinsics.f(this$0, "this$0");
        List historicalProcessExitReasons = this$0.f23477e.getHistoricalProcessExitReasons(this$0.f23475b.getPackageName(), 0, 10);
        Intrinsics.e(historicalProcessExitReasons, "getHistoricalProcessExitReasons(...)");
        C6 c6 = this$0.f;
        c6.getClass();
        long j = c6.f22735a.getLong("exitReasonTimestamp", 0L);
        Iterator it = historicalProcessExitReasons.iterator();
        long timestamp = j;
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoF = androidx.media3.exoplayer.source.mediaparser.b.f(it.next());
            if (applicationExitInfoF.getTimestamp() > j) {
                long j2 = this$0.f23476c;
                Ie.f22893a.schedule(new RunnableC0905n(15, this$0, applicationExitInfoF), j2, TimeUnit.MILLISECONDS);
                if (applicationExitInfoF.getTimestamp() > timestamp) {
                    timestamp = applicationExitInfoF.getTimestamp();
                }
            }
        }
        C6.a(this$0.f, "exitReasonTimestamp", timestamp, false, 4, (Object) null);
    }
}
