package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class AppData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f20295c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20296e;
    public final String f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DevelopmentPlatformProvider f20297h;

    public AppData(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, DevelopmentPlatformProvider developmentPlatformProvider) {
        this.f20293a = str;
        this.f20294b = str2;
        this.f20295c = arrayList;
        this.d = str3;
        this.f20296e = str4;
        this.f = str5;
        this.g = str6;
        this.f20297h = developmentPlatformProvider;
    }
}
