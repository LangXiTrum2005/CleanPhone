package com.inmobi.media;

import A.RunnableC0905n;
import android.content.Context;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.inmobi.media.f7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3016f7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23606c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23607e;
    public final WeakReference f;
    public final AtomicBoolean g;

    public C3016f7(Context context, String url, long j, long j2, int i2, int i3) {
        Intrinsics.f(context, "context");
        Intrinsics.f(url, "url");
        this.f23604a = url;
        this.f23605b = j;
        this.f23606c = j2;
        this.d = i2;
        this.f23607e = i3;
        this.f = new WeakReference(context);
        this.g = new AtomicBoolean(false);
        a();
    }

    public final void a() {
        Context context = (Context) this.f.get();
        if (context != null) {
            AbstractC3112l7.f23769a.submit(new RunnableC0905n(18, this, context));
        }
    }

    public static final void a(C3016f7 this$0, Context context) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(context, "$context");
        if (this$0.g.get()) {
            return;
        }
        if (!this$0.g.get()) {
            int iA = T1.a(Nc.d(), null, null, 63);
            Z6 z6D = Nc.d();
            z6D.getClass();
            ArrayList arrayListA = T1.a(z6D, "hasLoggerFinished=1", null, null, null, null, Integer.valueOf(iA), 30);
            C3000e7 c3000e7 = new C3000e7(this$0, context);
            Intrinsics.f(arrayListA, "<this>");
            Iterator it = CollectionsKt.u(arrayListA).iterator();
            while (it.hasNext()) {
                c3000e7.invoke(it.next());
            }
        }
        ScheduledExecutorService scheduledExecutorService = AbstractC3112l7.f23769a;
        AbstractC3096k7.a(Nc.d(), Calendar.getInstance().getTimeInMillis() - this$0.f23606c, this$0.f23607e);
    }

    public final void a(Context context, String str, Y6 y6) {
        String[] list;
        int i2;
        if (this.g.get()) {
            return;
        }
        if (y6.d == 0 || System.currentTimeMillis() - y6.d >= this.f23605b) {
            P9 p9B = new C3032g7(str, y6).b();
            if (p9B.b() && (i2 = y6.f23369c + 1) < this.d) {
                I9 i9 = p9B.d;
                if ((i9 != null ? i9.f22886a : null) != EnumC3157o4.s) {
                    Y6 y7 = new Y6(y6.f23367a, y6.f23368b, i2, System.currentTimeMillis(), false, 0, 48);
                    Nc.d().b(y7);
                    ScheduledExecutorService scheduledExecutorService = AbstractC3112l7.f23769a;
                    AbstractC3112l7.f23769a.schedule(new A.F(this, context, str, y7, 1), this.f23605b, TimeUnit.MILLISECONDS);
                    return;
                }
            }
            AbstractC3128m7.a(y6.f23367a);
            Nc.d().a(y6);
            Context context2 = (Context) this.f.get();
            if (context2 != null) {
                ScheduledExecutorService scheduledExecutorService2 = AbstractC3112l7.f23769a;
                String directoryPath = context2.getFilesDir() + "/logging";
                Intrinsics.f(directoryPath, "directoryPath");
                File file = new File(directoryPath);
                boolean zExists = file.exists();
                Iterable<String> iterableM = EmptyList.X;
                if (zExists && file.isDirectory() && (list = file.list()) != null) {
                    iterableM = ArraysKt.M(list);
                }
                for (String fileName : iterableM) {
                    Z6 z6D = Nc.d();
                    z6D.getClass();
                    Intrinsics.f(fileName, "fileName");
                    if (T1.a(z6D, androidx.media3.extractor.text.ttml.a.i(AbstractJsonLexerKt.STRING, "filename=\"", fileName), null, null, null, null, null, 62).isEmpty()) {
                        AbstractC3128m7.a(fileName);
                    }
                }
            }
        }
    }

    public static final void a(C3016f7 this$0, Context context, String url, Y6 updatedData) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(context, "$context");
        Intrinsics.f(url, "$url");
        Intrinsics.f(updatedData, "$updatedData");
        this$0.a(context, url, updatedData);
    }
}
