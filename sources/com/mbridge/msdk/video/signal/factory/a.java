package com.mbridge.msdk.video.signal.factory;

import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.impl.e;
import com.mbridge.msdk.video.signal.impl.h;
import com.mbridge.msdk.video.signal.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class a implements IJSFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.video.signal.b f38124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected d f38125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected j f38126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected g f38127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected f f38128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected i f38129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected c f38130g;

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        if (this.f38124a == null) {
            this.f38124a = new com.mbridge.msdk.video.signal.impl.b();
        }
        return this.f38124a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        if (this.f38129f == null) {
            this.f38129f = new com.mbridge.msdk.video.signal.impl.g();
        }
        return this.f38129f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        if (this.f38130g == null) {
            this.f38130g = new com.mbridge.msdk.video.signal.impl.c();
        }
        return this.f38130g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        if (this.f38125b == null) {
            this.f38125b = new com.mbridge.msdk.video.signal.impl.d();
        }
        return this.f38125b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        if (this.f38128e == null) {
            this.f38128e = new e();
        }
        return this.f38128e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        if (this.f38127d == null) {
            this.f38127d = new com.mbridge.msdk.video.signal.impl.f();
        }
        return this.f38127d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        if (this.f38126c == null) {
            this.f38126c = new h();
        }
        return this.f38126c;
    }
}
