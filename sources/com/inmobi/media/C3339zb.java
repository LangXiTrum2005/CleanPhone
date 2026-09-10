package com.inmobi.media;

import android.content.Context;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.io.File;
import java.util.Calendar;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.inmobi.media.zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3339zb extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ab f24165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f24166b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3339zb(Ab ab, boolean z2) {
        super(0);
        this.f24165a = ab;
        this.f24166b = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Ab ab = this.f24165a;
        if (!ab.g.isEmpty() && !ab.f22698h.isEmpty()) {
            String strC = ab.c();
            Intrinsics.f(strC, "<this>");
            if (!strC.equals(JsonUtils.EMPTY_JSON)) {
                long timeInMillis = Calendar.getInstance().getTimeInMillis();
                if (this.f24165a.j.length() == 0) {
                    Ab ab2 = this.f24165a;
                    ScheduledExecutorService scheduledExecutorService = AbstractC3112l7.f23769a;
                    Context context = ab2.f22694a;
                    Intrinsics.f(context, "context");
                    File file = new File(context.getFilesDir() + "/logging");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    ab2.j = context.getFilesDir() + "/logging/" + timeInMillis + ".txt";
                }
                Ab ab3 = this.f24165a;
                if (AbstractC3128m7.a("RemoteLogger", ab3.c(), ab3.j)) {
                    Ab ab4 = this.f24165a;
                    boolean z2 = this.f24166b;
                    String str = ab4.j;
                    Y6 y6 = new Y6(str, timeInMillis, 0, 0L, z2, ab4.k.get(), 12);
                    Z6 z6D = Nc.d();
                    z6D.getClass();
                    if (T1.a(z6D, "filename=\"" + str + AbstractJsonLexerKt.STRING, null, null, null, null, null, 62).isEmpty()) {
                        int i2 = this.f24165a.f22696c;
                        z6D.a((Object) y6);
                        if (z6D.f23399b != null) {
                            C5.a();
                        }
                        ScheduledExecutorService scheduledExecutorService2 = AbstractC3112l7.f23769a;
                        Ab ab5 = this.f24165a;
                        AbstractC3096k7.a(z6D, timeInMillis - ab5.f22695b, ab5.f22696c);
                    } else {
                        z6D.b(y6);
                    }
                }
            }
        }
        return Unit.f43263a;
    }
}
