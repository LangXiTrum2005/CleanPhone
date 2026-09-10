package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.marial;

/* JADX INFO: renamed from: com.inmobi.media.n9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3097n9 implements InterfaceC3072m9 {
    public Gh a;
    public final Mj b;

    public C3097n9(Context context, double d, Ab logLevel, boolean z, int i, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        this.b = new Mj();
        if (z) {
            return;
        }
        Gh gh = new Gh(context, d, logLevel, j, i);
        this.a = gh;
        CopyOnWriteArrayList copyOnWriteArrayList = Mb.a;
        Intrinsics.beachfront(gh);
        Lb.b(gh);
    }

    public final void a(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Gh gh = this.a;
        if (gh != null) {
            gh.a(Ab.DEBUG, tag, message);
        }
        if (this.b != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    public final void b(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Gh gh = this.a;
        if (gh != null) {
            gh.a(Ab.ERROR, tag, message);
        }
        if (this.b != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    public final void c(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Gh gh = this.a;
        if (gh != null) {
            gh.a(Ab.INFO, tag, message);
        }
        if (this.b != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    public final void d(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Gh gh = this.a;
        if (gh != null) {
            gh.a(Ab.STATE, tag, message);
        }
        if (this.b != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter("STATE_CHANGE: " + message, "message");
        }
    }

    public final void a(String tag, String message, Exception error) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error, "error");
        Gh gh = this.a;
        if (gh != null) {
            gh.a(Ab.ERROR, tag, message + "\nError: " + marial.dern(error));
        }
        if (this.b != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(error, "error");
        }
    }

    public final void a(boolean z) {
        Gh gh = this.a;
        if (gh != null) {
            gh.b(z);
        }
        if (z) {
            return;
        }
        Gh gh2 = this.a;
        if (gh2 == null || !gh2.f.a()) {
            CopyOnWriteArrayList copyOnWriteArrayList = Mb.a;
            Lb.a(this.a);
            this.a = null;
        }
    }

    public final void a() {
        Gh gh = this.a;
        if (gh != null) {
            gh.b();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = Mb.a;
        Lb.a(this.a);
    }
}
