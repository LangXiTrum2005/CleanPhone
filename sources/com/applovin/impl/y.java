package com.applovin.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static y f10010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f10011f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f10012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f10013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f10014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f10015d;

    private y(Context context) throws Throwable {
        Bundle bundle;
        int iIntValue;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            bundle = applicationInfo.metaData;
            try {
                try {
                    String str = applicationInfo.processName;
                    this.f10012a = bundle;
                    this.f10015d = str;
                } catch (Throwable th2) {
                    th = th2;
                    this.f10012a = bundle;
                    this.f10015d = null;
                    throw th;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                e = e10;
                com.applovin.impl.sdk.p.c("AndroidManifest", "Failed to get meta data.", e);
                this.f10012a = bundle;
                this.f10015d = null;
            }
        } catch (PackageManager.NameNotFoundException e11) {
            e = e11;
            bundle = null;
        } catch (Throwable th3) {
            th = th3;
            bundle = null;
            this.f10012a = bundle;
            this.f10015d = null;
            throw th;
        }
        boolean z10 = false;
        try {
            XmlResourceParser xmlResourceParserOpenXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
            int eventType = xmlResourceParserOpenXmlResourceParser.getEventType();
            iIntValue = 0;
            boolean zBooleanValue = false;
            do {
                if (2 == eventType) {
                    try {
                        if (xmlResourceParserOpenXmlResourceParser.getName().equals("application")) {
                            for (int i10 = 0; i10 < xmlResourceParserOpenXmlResourceParser.getAttributeCount(); i10++) {
                                String attributeName = xmlResourceParserOpenXmlResourceParser.getAttributeName(i10);
                                String attributeValue = xmlResourceParserOpenXmlResourceParser.getAttributeValue(i10);
                                if (attributeName.equals("networkSecurityConfig")) {
                                    iIntValue = Integer.valueOf(attributeValue.substring(1)).intValue();
                                } else if (attributeName.equals("usesCleartextTraffic")) {
                                    zBooleanValue = Boolean.valueOf(attributeValue).booleanValue();
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        z10 = zBooleanValue;
                        try {
                            com.applovin.impl.sdk.p.c("AndroidManifest", "Failed to parse AndroidManifest.xml.", th);
                            return;
                        } finally {
                            this.f10013b = iIntValue;
                            this.f10014c = z10;
                        }
                    }
                }
                eventType = xmlResourceParserOpenXmlResourceParser.next();
            } while (eventType != 1);
            this.f10013b = iIntValue;
            this.f10014c = zBooleanValue;
        } catch (Throwable th5) {
            th = th5;
            iIntValue = 0;
        }
    }

    public static y a(Context context) {
        y yVar;
        synchronized (f10011f) {
            try {
                if (f10010e == null) {
                    f10010e = new y(context);
                }
                yVar = f10010e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yVar;
    }

    public boolean a(String str) {
        Bundle bundle = this.f10012a;
        if (bundle != null) {
            return bundle.containsKey(str);
        }
        return false;
    }

    public boolean a(String str, boolean z10) {
        Bundle bundle = this.f10012a;
        return bundle != null ? bundle.getBoolean(str, z10) : z10;
    }

    public String a() {
        return this.f10015d;
    }
}
