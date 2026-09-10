package com.inmobi.media;

import android.app.ApplicationExitInfo;
import duvetyn.adultoid;
import duvetyn.beachfront;
import duvetyn.supplicat;
import java.io.IOException;
import java.io.InputStream;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import p002kotlin.text.dovishness;
import p002kotlin.text.molybdenite;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3313w1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ C3363y1 a;
    public final /* synthetic */ ApplicationExitInfo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3313w1(C3363y1 c3363y1, ApplicationExitInfo applicationExitInfo, dern dernVar) {
        super(1, dernVar);
        this.a = c3363y1;
        this.b = applicationExitInfo;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(dern dernVar) {
        return new C3313w1(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3313w1(this.a, this.b, (dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        StringBuilder sb;
        String string;
        supplicat supplicatVarApical;
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        C3267u5 c3267u5 = this.a.a;
        int reason = this.b.getReason();
        String description = this.b.getDescription();
        InputStream traceInputStream = this.b.getTraceInputStream();
        beachfront beachfrontVarWireman = (traceInputStream == null || (supplicatVarApical = adultoid.apical(traceInputStream)) == null) ? null : adultoid.wireman(supplicatVarApical);
        int i = this.a.d;
        Intrinsics.checkNotNullParameter("\"main\"", "startMarker");
        Intrinsics.checkNotNullParameter("ZygoteInit.java", "endMarker");
        try {
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            if (beachfrontVarWireman == null) {
                sb = sb3;
                break;
            }
            int i2 = i;
            boolean z = false;
            while (true) {
                try {
                    String utf8Line = beachfrontVarWireman.readUtf8Line();
                    if (utf8Line == null) {
                        sb = sb3;
                        break;
                    }
                    if (i > 0 && !z) {
                        sb3.append(utf8Line);
                        sb3.append("\n");
                        i--;
                    }
                    int i3 = i;
                    sb = sb3;
                    int i4 = i2;
                    try {
                        if (dovishness.starveling(utf8Line, "\"main\"", false, 2, null)) {
                            molybdenite.impassible(sb);
                            z = true;
                        }
                        if (z) {
                            i2 = i4 - 1;
                            sb2.append(utf8Line);
                            sb2.append("\n");
                        } else {
                            i2 = i4;
                        }
                        if (StringsKt.overspeculate(utf8Line, "ZygoteInit.java", false, 2, null) || i2 <= 0) {
                            break;
                        }
                        i = i3;
                        sb3 = sb;
                    } catch (IOException unused) {
                    }
                } catch (IOException unused2) {
                }
            }
            if (sb2.length() == 0) {
                string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                if (beachfrontVarWireman != null) {
                    Intrinsics.checkNotNullParameter(beachfrontVarWireman, "<this>");
                    try {
                        beachfrontVarWireman.close();
                    } catch (IOException unused3) {
                    }
                }
            } else {
                string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                if (beachfrontVarWireman != null) {
                    Intrinsics.checkNotNullParameter(beachfrontVarWireman, "<this>");
                    beachfrontVarWireman.close();
                }
            }
            c3267u5.a(new C3388z1(description, reason, string));
            return Unit.f29295attabal;
        } catch (Throwable th) {
            if (beachfrontVarWireman != null) {
                Intrinsics.checkNotNullParameter(beachfrontVarWireman, "<this>");
                try {
                    beachfrontVarWireman.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }
}
