package com.inmobi.media;

import java.io.BufferedOutputStream;
import java.io.File;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3120m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f23798b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3138n1 f23799a;

    public C3120m(InterfaceC3138n1 mResultListener) {
        Intrinsics.f(mResultListener, "mResultListener");
        this.f23799a = mResultListener;
    }

    public static void a(File file, HttpURLConnection httpURLConnection, BufferedOutputStream bufferedOutputStream) {
        try {
            if (file.exists()) {
                file.delete();
            }
            httpURLConnection.disconnect();
            T9.a(bufferedOutputStream);
        } catch (Exception e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }
}
