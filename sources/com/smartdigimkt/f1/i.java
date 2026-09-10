package com.smartdigimkt.f1;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f34977c = 1;
    public static final int d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f34978e = 3;
    public static final int f = 4;
    public static final int g = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34980b;

    public i(int i2, int i3, int i4) {
        if (i2 == 1) {
            this.f34979a = 90;
            this.f34980b = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
            return;
        }
        if (i2 == 2) {
            this.f34979a = 250;
            this.f34980b = 300;
            return;
        }
        if (i2 == 3) {
            c();
            return;
        }
        if (i2 == 4) {
            this.f34979a = 50;
            this.f34980b = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
        } else {
            if (i2 != 5) {
                return;
            }
            this.f34979a = i4;
            this.f34980b = i3;
        }
    }

    private void c() {
        if (com.smartdigimkt.v0.n.f(com.smartdigimkt.m6.b.p().k()) < 720) {
            this.f34979a = 50;
            this.f34980b = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
        } else {
            this.f34979a = 90;
            this.f34980b = 728;
        }
    }

    public int a() {
        return this.f34979a;
    }

    public int b() {
        return this.f34980b;
    }
}
