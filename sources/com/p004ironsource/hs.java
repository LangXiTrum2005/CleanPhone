package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes5.dex */
public class hs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f25274a = new a(2001, a("initsdk"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f25275b = new a(2026, a("sdkrecoverstart"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f25276c = new a(2002, a("createcontrollerweb"));
    public static a d = new a(2003, a("createcontrollernative"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static a f25277e = new a(2004, a("controllerstageready"));
    public static a f = new a(2005, a("loadad"));
    public static a g = new a(2006, a("loadadfailed"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static a f25278h = new a(2007, a("initproduct"));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static a f25279i = new a(2008, a("initproductfailed"));
    public static a j = new a(2009, a("loadproduct"));
    public static a k = new a(2010, a("parseadmfailed"));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static a f25280l = new a(2011, a("loadadsuccess"));
    public static a m = new a(2027, a("destroyproduct"));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static a f25281n = new a(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, a("registerad"));
    public static a o = new a(2013, a("controllerfailed"));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static a f25282p = new a(2015, a("appendnativefeaturesdatafailed"));
    public static a q = new a(2016, a("adunitcouldnotloadtowebview"));
    public static a r = new a(2017, a("webviewcleanupfailed"));
    public static a s = new a(2018, a("removewebviewfailed"));
    public static a t = new a(IronSourceError.ERROR_NEW_INIT_API_ALREADY_CALLED, a("banneralreadydestroyed"));

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static a f25283u = new a(2021, a("fialedregactlifecycle"));
    public static a v = new a(2022, a("loadcontrollerhtml"));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static a f25284w = new a(2023, a("controllerhtmlsuccess"));
    public static a x = new a(2024, a("controllerhtmlfailed"));
    public static a y = new a(2025, a("webviewcrashrpg"));

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static a f25285z = new a(2031, a("getorientationcalled"));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static a f25272A = new a(2032, a("webviewunavailable"));

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final a f25273B = new a(2033, a("controller_init_delayed"));

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f25286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f25287b;

        public a(int i2, String str) {
            this.f25287b = i2;
            this.f25286a = str;
        }
    }

    public static String a(String str) {
        return android.support.v4.media.a.C(dc.f24782c, str);
    }
}
