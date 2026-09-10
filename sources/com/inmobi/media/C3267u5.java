package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p002kotlin.collections.polder;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.formularize;

/* JADX INFO: renamed from: com.inmobi.media.u5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3267u5 implements InterfaceC3217s5 {
    public volatile CrashConfig a;
    public final C3349xc b;
    public final List c;

    /* JADX WARN: Code duplicated, block: B:10:0x0080  */
    public C3267u5(Context context, CrashConfig crashConfig, C3349xc eventBus) {
        C3267u5 c3267u5;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(crashConfig, "crashConfig");
        Intrinsics.checkNotNullParameter(eventBus, "eventBus");
        this.a = crashConfig;
        this.b = eventBus;
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        Intrinsics.checkNotNullExpressionValue(listSynchronizedList, "synchronizedList(...)");
        this.c = listSynchronizedList;
        if (this.a.getCrashConfig().getEnabled()) {
            listSynchronizedList.add(new S4(Thread.getDefaultUncaughtExceptionHandler(), this));
        }
        if (this.a.getAnr().getAppExitReason().getEnabled()) {
            C3342x5.a.getClass();
            if (C3342x5.r()) {
                c3267u5 = this;
                listSynchronizedList.add(new C3363y1(context, c3267u5, this.a.getAnr().getAppExitReason().getIncidentWaitInterval(), this.a.getAnr().getAppExitReason().getMaxNumberOfLines()));
            } else {
                c3267u5 = this;
            }
        } else {
            c3267u5 = this;
        }
        if (c3267u5.a.getAnr().getWatchdog().getEnabled()) {
            listSynchronizedList.add(new C2810c(c3267u5.a.getAnr().getWatchdog().getInterval(), this));
        }
    }

    public final void a(Q9 incidentEvent) {
        int i;
        Intrinsics.checkNotNullParameter(incidentEvent, "incidentEvent");
        if ((incidentEvent instanceof C3388z1) && this.a.getAnr().getAppExitReason().getEnabled()) {
            i = Opcodes.DCMPG;
        } else if ((incidentEvent instanceof T4) && this.a.getCrashConfig().getEnabled()) {
            i = Opcodes.FCMPG;
        } else if (!(incidentEvent instanceof Wn) || !this.a.getAnr().getWatchdog().getEnabled()) {
            return;
        } else {
            i = Opcodes.DCMPL;
        }
        this.b.b(new I2(i, incidentEvent.a, polder.beachfront(formularize.attabal("data", incidentEvent))));
    }
}
