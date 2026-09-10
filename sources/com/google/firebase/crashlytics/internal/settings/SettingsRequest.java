package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.IdManager;

/* JADX INFO: loaded from: classes4.dex */
class SettingsRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20765c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IdManager f20766e;
    public final String f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f20768i;

    public SettingsRequest(String str, String str2, String str3, String str4, IdManager idManager, String str5, String str6, String str7, int i2) {
        this.f20763a = str;
        this.f20764b = str2;
        this.f20765c = str3;
        this.d = str4;
        this.f20766e = idManager;
        this.f = str5;
        this.g = str6;
        this.f20767h = str7;
        this.f20768i = i2;
    }
}
