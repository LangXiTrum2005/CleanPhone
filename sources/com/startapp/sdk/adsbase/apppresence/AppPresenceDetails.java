package com.startapp.sdk.adsbase.apppresence;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class AppPresenceDetails implements Serializable {
    private static final long serialVersionUID = -6732887070965278910L;
    private int adAttempt;
    private int minAppVersion;
    private String packageName;
    private String trackingUrl;
    private boolean isShown = true;
    private boolean appPresence = false;

    public AppPresenceDetails(int i2, int i3, String str, String str2) {
        this.trackingUrl = str;
        this.packageName = str2;
        this.adAttempt = i2;
        this.minAppVersion = i3;
    }

    public final void a(String str) {
        this.trackingUrl = str;
    }

    public final String b() {
        return this.packageName;
    }

    public final String c() {
        return this.trackingUrl;
    }

    public final boolean d() {
        return this.appPresence;
    }

    public final boolean e() {
        return this.isShown;
    }

    public final void a(boolean z2) {
        this.appPresence = z2;
    }

    public final void b(boolean z2) {
        this.isShown = z2;
    }

    public final int a() {
        return this.minAppVersion;
    }
}
