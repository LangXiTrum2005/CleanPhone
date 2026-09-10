package com.applovin.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;

/* JADX INFO: renamed from: com.applovin.impl.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0971y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static C0971y f12086e;
    private static final Object f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f12087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f12089c;
    private final String d;

    private C0971y(Context context) throws Throwable {
        Bundle bundle;
        int iIntValue;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            bundle = applicationInfo.metaData;
            try {
                try {
                    String str = applicationInfo.processName;
                    this.f12087a = bundle;
                    this.d = str;
                } catch (Throwable th) {
                    th = th;
                    this.f12087a = bundle;
                    this.d = null;
                    throw th;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                e = e2;
                com.applovin.impl.sdk.o.c("AndroidManifest", "Failed to get meta data.", e);
                this.f12087a = bundle;
                this.d = null;
            }
        } catch (PackageManager.NameNotFoundException e3) {
            e = e3;
            bundle = null;
        } catch (Throwable th2) {
            th = th2;
            bundle = null;
            this.f12087a = bundle;
            this.d = null;
            throw th;
        }
        boolean z2 = false;
        try {
            XmlResourceParser xmlResourceParserOpenXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
            int eventType = xmlResourceParserOpenXmlResourceParser.getEventType();
            iIntValue = 0;
            boolean zBooleanValue = false;
            do {
                if (2 == eventType) {
                    try {
                        if (xmlResourceParserOpenXmlResourceParser.getName().equals("application")) {
                            for (int i2 = 0; i2 < xmlResourceParserOpenXmlResourceParser.getAttributeCount(); i2++) {
                                String attributeName = xmlResourceParserOpenXmlResourceParser.getAttributeName(i2);
                                String attributeValue = xmlResourceParserOpenXmlResourceParser.getAttributeValue(i2);
                                if (attributeName.equals("networkSecurityConfig")) {
                                    iIntValue = Integer.valueOf(attributeValue.substring(1)).intValue();
                                } else if (attributeName.equals("usesCleartextTraffic")) {
                                    zBooleanValue = Boolean.valueOf(attributeValue).booleanValue();
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z2 = zBooleanValue;
                        try {
                            com.applovin.impl.sdk.o.c("AndroidManifest", "Failed to parse AndroidManifest.xml.", th);
                            return;
                        } finally {
                            this.f12088b = iIntValue;
                            this.f12089c = z2;
                        }
                    }
                }
                eventType = xmlResourceParserOpenXmlResourceParser.next();
            } while (eventType != 1);
            this.f12088b = iIntValue;
            this.f12089c = zBooleanValue;
        } catch (Throwable th4) {
            th = th4;
            iIntValue = 0;
        }
    }

    public static C0971y a(Context context) {
        C0971y c0971y;
        synchronized (f) {
            try {
                if (f12086e == null) {
                    f12086e = new C0971y(context);
                }
                c0971y = f12086e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0971y;
    }

    public boolean a(String str) {
        Bundle bundle = this.f12087a;
        if (bundle != null) {
            return bundle.containsKey(str);
        }
        return false;
    }

    public boolean a(String str, boolean z2) {
        Bundle bundle = this.f12087a;
        return bundle != null ? bundle.getBoolean(str, z2) : z2;
    }

    public String a() {
        return this.d;
    }
}
