package com.smartdigimkt.y2;

import com.smartdigimkt.expressad.video.signal.factory.IJSFactory;
import com.smartdigimkt.x2.c;
import com.smartdigimkt.x2.e;
import com.smartdigimkt.x2.g;
import com.smartdigimkt.x2.i;
import com.smartdigimkt.x2.j;
import com.smartdigimkt.z2.d;
import com.smartdigimkt.z2.f;

/* JADX INFO: loaded from: classes6.dex */
public class a implements IJSFactory {
    protected com.smartdigimkt.x2.a X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    protected c f40025Y;
    protected j Z;
    protected g e0;
    protected e f0;
    protected i g0;
    protected com.smartdigimkt.x2.b h0;

    @Override // com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public com.smartdigimkt.x2.a getActivityProxy() {
        if (this.X == null) {
            this.X = new com.smartdigimkt.z2.a();
        }
        return this.X;
    }

    @Override // com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        if (this.g0 == null) {
            this.g0 = new f();
        }
        return this.g0;
    }

    @Override // com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public com.smartdigimkt.x2.b getJSBTModule() {
        if (this.h0 == null) {
            this.h0 = new com.smartdigimkt.z2.b();
        }
        return this.h0;
    }

    @Override // com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public c getJSCommon() {
        if (this.f40025Y == null) {
            this.f40025Y = new com.smartdigimkt.z2.c();
        }
        return this.f40025Y;
    }

    @Override // com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public e getJSContainerModule() {
        if (this.f0 == null) {
            this.f0 = new d();
        }
        return this.f0;
    }

    @Override // com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        if (this.e0 == null) {
            this.e0 = new com.smartdigimkt.z2.e();
        }
        return this.e0;
    }

    @Override // com.smartdigimkt.expressad.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        if (this.Z == null) {
            this.Z = new com.smartdigimkt.z2.g();
        }
        return this.Z;
    }
}
