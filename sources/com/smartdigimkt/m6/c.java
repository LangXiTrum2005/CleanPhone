package com.smartdigimkt.m6;

import android.location.Location;
import com.smartdigimkt.sdk.api.SDMUserDeviceInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f36870a = "SDMSettingContext";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f36871b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Location f36872c = null;
    private static int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static SDMUserDeviceInfo f36873e = null;
    private static boolean f = false;
    private static boolean g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long f36874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static long f36875i;

    public static void a(int i2) {
        f36871b = i2;
    }

    public static void b(boolean z2) {
        g = z2;
    }

    public static Location c() {
        return f36872c;
    }

    public static int d() {
        return f36871b;
    }

    public static SDMUserDeviceInfo e() {
        return f36873e;
    }

    public static int f() {
        return d;
    }

    public static boolean g() {
        return f;
    }

    public static boolean h() {
        return g;
    }

    public static void a(Location location) {
        f36872c = location;
    }

    public static void b(long j) {
        f36874h = j;
    }

    public static void c(boolean z2) {
        d = z2 ? 1 : 2;
    }

    public static void a(SDMUserDeviceInfo sDMUserDeviceInfo) {
        f36873e = sDMUserDeviceInfo;
        Objects.toString(sDMUserDeviceInfo);
    }

    public static long b() {
        return f36874h;
    }

    public static void a(boolean z2) {
        f = z2;
    }

    public static void a(long j) {
        f36875i = j;
    }

    public static long a() {
        return f36875i;
    }
}
