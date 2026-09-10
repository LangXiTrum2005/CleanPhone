package com.inmobi.media;

import android.util.Log;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2863e1 implements X2, Kl {
    public static final String f;
    public final saran a;
    public final InterfaceC3072m9 b;
    public AdSession c;
    public MediaEvents d;
    public AdEvents e;

    static {
        String simpleName = AbstractC2863e1.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        f = simpleName;
    }

    public AbstractC2863e1(saran coroutineScope, InterfaceC3072m9 interfaceC3072m9) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.a = coroutineScope;
        this.b = interfaceC3072m9;
    }

    public void a() {
    }

    public abstract void a(String str, List list, Map map, String str2, String str3, boolean z);

    public final void b() {
        InterfaceC3072m9 interfaceC3072m9 = this.b;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a(f, "initAdEvents");
        }
        try {
            this.e = AdEvents.createAdEvents(this.c);
        } catch (IllegalArgumentException e) {
            InterfaceC3072m9 interfaceC3072m10 = this.b;
            if (interfaceC3072m10 != null) {
                ((C3097n9) interfaceC3072m10).a(f, "Failure initAdEvents: " + Log.getStackTraceString(e));
            }
        }
    }

    public final void c() {
        InterfaceC3072m9 interfaceC3072m9 = this.b;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a(f, "initMediaAdEvents");
        }
        try {
            this.d = MediaEvents.createMediaEvents(this.c);
        } catch (IllegalArgumentException e) {
            InterfaceC3072m9 interfaceC3072m10 = this.b;
            if (interfaceC3072m10 != null) {
                ((C3097n9) interfaceC3072m10).a(f, "Failure initMediaAdEvents: " + Log.getStackTraceString(e));
            }
        }
    }

    public void a(boolean z) {
    }

    @Override // com.inmobi.media.Kl
    public void a(Rl videoEvent) {
        Intrinsics.checkNotNullParameter(videoEvent, "videoEvent");
    }

    public final void a(InteractionType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (this.d == null) {
            InterfaceC3072m9 interfaceC3072m9 = this.b;
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).a(f, "Failed to register adUserInteractionEvent with type: " + type);
                return;
            }
            return;
        }
        InterfaceC3072m9 interfaceC3072m10 = this.b;
        if (interfaceC3072m10 != null) {
            ((C3097n9) interfaceC3072m10).a(f, "trackAdUserInteractionEvent with type: " + type);
        }
        P4.a(this.a, new C2838d1(this, type, null));
    }

    public final void a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        Intrinsics.checkNotNullParameter(adSessionConfiguration, "adSessionConfiguration");
        Intrinsics.checkNotNullParameter(adSessionContext, "adSessionContext");
        if (this.c != null) {
            InterfaceC3072m9 interfaceC3072m9 = this.b;
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).a(f, "initAdSession: adSession is already created");
                return;
            }
            return;
        }
        InterfaceC3072m9 interfaceC3072m10 = this.b;
        if (interfaceC3072m10 != null) {
            ((C3097n9) interfaceC3072m10).a(f, "initAdSession");
        }
        try {
            this.c = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
        } catch (Exception e) {
            InterfaceC3072m9 interfaceC3072m11 = this.b;
            if (interfaceC3072m11 != null) {
                ((C3097n9) interfaceC3072m11).a(f, "AdSession creation failed. " + e);
            }
        }
    }
}
