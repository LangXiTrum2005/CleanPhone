package ads_mobile_sdk;

import com.google.gson.JsonObject;
import complexometry.adultoid;
import complexometry.dovishness;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.gintrap;
import kotlinx.coroutines.preprohormone;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class er0 implements adultoid {
    public final saran a;
    public final gq0 b;
    public float c;
    public final boolean d;
    public final gintrap e;
    public final Object f;
    public float g;
    public float h;
    public yq0 i;
    public boolean j;
    public boolean k;
    public adultoid.attabal l;
    public boolean m;

    public er0(saran uiScope, gq0 webView, float f, boolean z) {
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.a = uiScope;
        this.b = webView;
        this.c = f;
        this.d = z;
        this.e = preprohormone.dern(null, 1, null);
        this.f = new Object();
        this.i = yq0.UNKNOWN;
        this.m = true;
    }

    public final void a(String str) {
        this.e.saran(str);
    }

    @Override // complexometry.adultoid
    public final adultoid.attabal getVideoLifecycleCallbacks() {
        adultoid.attabal attabalVar;
        synchronized (this.f) {
            attabalVar = this.l;
        }
        return attabalVar;
    }

    public final boolean isMuted() {
        boolean z;
        synchronized (this.f) {
            z = this.m;
        }
        return z;
    }

    @Override // complexometry.adultoid
    public final void mute(boolean z) {
        saran saranVar = this.a;
        ar0 block = new ar0(this, z, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
    }

    @Override // complexometry.adultoid
    public final void pause() {
        saran saranVar = this.a;
        br0 block = new br0(this, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
    }

    @Override // complexometry.adultoid
    public final void play() {
        saran saranVar = this.a;
        cr0 block = new cr0(this, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
    }

    public final Object a(JsonObject jsonObject, String str, wretchedly.dern dernVar) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        jsonObject.addProperty("action", str);
        Object objA = this.b.a(jsonObject, "pubVideoCmd", dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    public final float a() {
        float f;
        synchronized (this.f) {
            f = this.h;
        }
        return f;
    }

    public final void a(float f, yq0 playbackState, boolean z, float f2) {
        Intrinsics.checkNotNullParameter(playbackState, "playbackState");
        synchronized (this.f) {
            try {
                this.c = f;
                boolean zIsMuted = isMuted();
                a(z);
                yq0 yq0Var = this.i;
                this.i = playbackState;
                float f3 = this.h;
                this.h = f2;
                if (Math.abs(f2 - f3) > 1.0E-4f) {
                    this.b.invalidate();
                }
                cutely.wireman(this.a, null, null, new zq0(this, yq0Var, playbackState, zIsMuted, z, null), 3, null);
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object a(dovishness dovishnessVar, ContinuationImpl continuationImpl) {
        Unit unit;
        synchronized (this.f) {
            this.j = dovishnessVar.getCustomControlsRequested();
            dovishnessVar.getClickToExpandRequested();
            unit = Unit.f29295attabal;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("muteStart", dovishnessVar.getStartMuted() ? "1" : "0");
        jsonObject.addProperty("customControlsRequested", dovishnessVar.getCustomControlsRequested() ? "1" : "0");
        jsonObject.addProperty("clickToExpandRequested", dovishnessVar.getClickToExpandRequested() ? "1" : "0");
        Object objA = a(jsonObject, "initialState", continuationImpl);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : unit;
    }

    public final void a(float f) {
        synchronized (this.f) {
            this.g = f;
            Unit unit = Unit.f29295attabal;
        }
    }

    public final void a(boolean z) {
        synchronized (this.f) {
            this.m = z;
            Unit unit = Unit.f29295attabal;
        }
    }
}
