package com.chartboost.sdk.impl;

import android.content.res.Resources;
import com.applovin.shadow.okio.Segment;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f14114a;

    public hf(Resources resources) {
        Intrinsics.f(resources, "resources");
        this.f14114a = resources;
    }

    public final String a(int i2) {
        try {
            InputStream inputStreamOpenRawResource = this.f14114a.openRawResource(i2);
            try {
                Intrinsics.c(inputStreamOpenRawResource);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, Charsets.f44691a), Segment.SIZE);
                try {
                    String strB = TextStreamsKt.b(bufferedReader);
                    bufferedReader.close();
                    inputStreamOpenRawResource.close();
                    return strB;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.a(bufferedReader, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.a(inputStreamOpenRawResource, th3);
                    throw th4;
                }
            }
        } catch (Exception e2) {
            za.b("Raw resource file exception", e2);
            return null;
        }
    }
}
